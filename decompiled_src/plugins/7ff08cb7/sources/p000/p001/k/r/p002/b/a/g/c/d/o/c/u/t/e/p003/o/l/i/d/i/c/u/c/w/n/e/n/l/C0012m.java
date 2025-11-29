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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/m.class */
public class C0012m implements ab {
    private static /* synthetic */ int[] lIIIIlllIl;
    public static /* synthetic */ boolean ck;
    public static /* synthetic */ List<C0003d> bx;
    static /* synthetic */ WorldPoint cn;
    private static /* synthetic */ String[] lIIIIllIll;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldPoint cm;
    static /* synthetic */ WorldArea cl;

    private static int lllIIlIlIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[73])) {
            ?? r0 = lIIIIlllIl[1];
            "".length();
            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIIlllIl[0];
    }

    private static boolean lllIIlIlIIll(int i) {
        return i > 0;
    }

    private static String lllIIlIIIlIl(String llIlllIIlllI, String llIlllIIllIl) {
        String llIlllIIlllI2 = new String(Base64.getDecoder().decode(llIlllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlllIIllII = new StringBuilder();
        char[] charArray = llIlllIIllIl.toCharArray();
        int llIlllIIlIlI = lIIIIlllIl[0];
        char[] charArray2 = llIlllIIlllI2.toCharArray();
        int length = charArray2.length;
        int i = lIIIIlllIl[0];
        while (lllIIlIlIIII(i, length)) {
            llIlllIIllII.append((char) (charArray2[i] ^ charArray[llIlllIIlIlI % charArray.length]));
            "".length();
            llIlllIIlIlI++;
            i++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(llIlllIIllII);
    }

    private static String lllIIlIIIlll(String llIllIlllIIl, String llIllIlllIII) {
        try {
            SecretKeySpec llIllIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIlllIII.getBytes(StandardCharsets.UTF_8)), lIIIIlllIl[29]), "DES");
            Cipher llIllIlllIll = Cipher.getInstance("DES");
            llIllIlllIll.init(lIIIIlllIl[2], llIllIllllII);
            return new String(llIllIlllIll.doFinal(Base64.getDecoder().decode(llIllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIlllIlI) {
            llIllIlllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlIlIIIl(int i) {
        return i == 0;
    }

    private static void Q() {
        if (lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6])) {
            int[] iArr = new int[lIIIIlllIl[1]];
            iArr[lIIIIlllIl[0]] = lIIIIlllIl[14];
            if (lllIIlIlIIIl(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlllIl[14], lIIIIlllIl[57], lIIIIlllIl[58]));
                "".length();
            }
            int[] iArr2 = new int[lIIIIlllIl[1]];
            iArr2[lIIIIlllIl[0]] = lIIIIlllIl[7];
            if (lllIIlIlIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlllIl[7], lIIIIlllIl[59], lIIIIlllIl[24]));
                "".length();
            }
            int[] iArr3 = new int[lIIIIlllIl[1]];
            iArr3[lIIIIlllIl[0]] = lIIIIlllIl[9];
            if (lllIIlIlIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlllIl[9], lIIIIlllIl[60], lIIIIlllIl[24]));
                "".length();
            }
            int[] iArr4 = new int[lIIIIlllIl[1]];
            iArr4[lIIIIlllIl[0]] = lIIIIlllIl[11];
            if (lllIIlIlIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlllIl[11], lIIIIlllIl[61], lIIIIlllIl[24]));
                "".length();
            }
            int[] iArr5 = new int[lIIIIlllIl[1]];
            iArr5[lIIIIlllIl[0]] = lIIIIlllIl[12];
            if (lllIIlIlIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlllIl[12], lIIIIlllIl[4], lIIIIlllIl[24]));
                "".length();
            }
            int[] iArr6 = new int[lIIIIlllIl[1]];
            iArr6[lIIIIlllIl[0]] = lIIIIlllIl[44];
            if (lllIIlIlIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlllIl[44], lIIIIlllIl[1], C0004e.c(lIIIIlllIl[62], lIIIIlllIl[63])));
                "".length();
            }
        }
        if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6])) {
            int[] iArr7 = new int[lIIIIlllIl[1]];
            iArr7[lIIIIlllIl[0]] = lIIIIlllIl[22];
            if (lllIIlIIllll(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIIlllIl[1]];
                iArr8[lIIIIlllIl[0]] = lIIIIlllIl[22];
                if (lllIIlIlIIII(Bank.getFirst(iArr8).getQuantity(), lIIIIlllIl[61])) {
                    int i = lIIIIlllIl[22];
                    int i2 = lIIIIlllIl[61];
                    int[] iArr9 = new int[lIIIIlllIl[1]];
                    iArr9[lIIIIlllIl[0]] = lIIIIlllIl[22];
                    bx.add(new C0003d(i, i2 - Bank.getFirst(iArr9).getQuantity(), lIIIIlllIl[64]));
                    "".length();
                }
            }
            int[] iArr10 = new int[lIIIIlllIl[1]];
            iArr10[lIIIIlllIl[0]] = lIIIIlllIl[22];
            if (lllIIlIlIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlllIl[22], lIIIIlllIl[61], lIIIIlllIl[64]));
                "".length();
            }
            int[] iArr11 = new int[lIIIIlllIl[1]];
            iArr11[lIIIIlllIl[0]] = lIIIIlllIl[23];
            if (lllIIlIIllll(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIIIlllIl[1]];
                iArr12[lIIIIlllIl[0]] = lIIIIlllIl[23];
                if (lllIIlIlIIII(Bank.getFirst(iArr12).getQuantity(), lIIIIlllIl[61])) {
                    int i3 = lIIIIlllIl[23];
                    int i4 = lIIIIlllIl[61];
                    int[] iArr13 = new int[lIIIIlllIl[1]];
                    iArr13[lIIIIlllIl[0]] = lIIIIlllIl[23];
                    bx.add(new C0003d(i3, i4 - Bank.getFirst(iArr13).getQuantity(), lIIIIlllIl[65]));
                    "".length();
                }
            }
            int[] iArr14 = new int[lIIIIlllIl[1]];
            iArr14[lIIIIlllIl[0]] = lIIIIlllIl[23];
            if (lllIIlIlIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlllIl[23], lIIIIlllIl[61], lIIIIlllIl[65]));
                "".length();
            }
            int[] iArr15 = new int[lIIIIlllIl[1]];
            iArr15[lIIIIlllIl[0]] = lIIIIlllIl[20];
            if (lllIIlIlIIIl(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIIIlllIl[1]];
                iArr16[lIIIIlllIl[0]] = lIIIIlllIl[20];
                if (lllIIlIlIIIl(Equipment.contains(iArr16) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlllIl[20], lIIIIlllIl[1], lIIIIlllIl[66]));
                    "".length();
                }
            }
            if (lllIIlIIllll(ck ? 1 : 0)) {
                int[] iArr17 = new int[lIIIIlllIl[1]];
                iArr17[lIIIIlllIl[0]] = lIIIIlllIl[14];
                if (lllIIlIIllll(Bank.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIIIlllIl[1]];
                    iArr18[lIIIIlllIl[0]] = lIIIIlllIl[14];
                    if (lllIIlIlIIII(Bank.getFirst(iArr18).getQuantity(), lIIIIlllIl[61])) {
                        int i5 = lIIIIlllIl[14];
                        int i6 = lIIIIlllIl[61];
                        int[] iArr19 = new int[lIIIIlllIl[1]];
                        iArr19[lIIIIlllIl[0]] = lIIIIlllIl[14];
                        bx.add(new C0003d(i5, i6 - Bank.getFirst(iArr19).getQuantity(), lIIIIlllIl[58]));
                        "".length();
                    }
                }
                int[] iArr20 = new int[lIIIIlllIl[1]];
                iArr20[lIIIIlllIl[0]] = lIIIIlllIl[14];
                if (lllIIlIlIIIl(Bank.contains(iArr20) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlllIl[14], lIIIIlllIl[61], lIIIIlllIl[58]));
                    "".length();
                }
                int[] iArr21 = new int[lIIIIlllIl[1]];
                iArr21[lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (lllIIlIIllll(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIIlllIl[1]];
                    iArr22[lIIIIlllIl[0]] = lIIIIlllIl[21];
                    if (lllIIlIlIIII(Bank.getFirst(iArr22).getQuantity(), lIIIIlllIl[66])) {
                        int i7 = lIIIIlllIl[21];
                        int i8 = lIIIIlllIl[66];
                        int[] iArr23 = new int[lIIIIlllIl[1]];
                        iArr23[lIIIIlllIl[0]] = lIIIIlllIl[21];
                        bx.add(new C0003d(i7, i8 - Bank.getFirst(iArr23).getQuantity(), lIIIIlllIl[24]));
                        "".length();
                    }
                }
                int[] iArr24 = new int[lIIIIlllIl[1]];
                iArr24[lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (lllIIlIlIIIl(Bank.contains(iArr24) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlllIl[21], lIIIIlllIl[66], lIIIIlllIl[24]));
                    "".length();
                }
            }
        }
        int[] iArr25 = new int[lIIIIlllIl[1]];
        iArr25[lIIIIlllIl[0]] = lIIIIlllIl[18];
        if (lllIIlIlIIIl(Bank.contains(iArr25) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIlllIl[18], lIIIIlllIl[67], lIIIIlllIl[37]));
            "".length();
        }
        if (lllIIlIlIIIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIllIll[lIIIIlllIl[74]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIlllIl[68], lIIIIlllIl[17], lIIIIlllIl[69]));
            "".length();
        }
        int[] iArr26 = new int[lIIIIlllIl[1]];
        iArr26[lIIIIlllIl[0]] = lIIIIlllIl[70];
        if (lllIIlIlIIIl(Bank.contains(iArr26) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIlllIl[70], lIIIIlllIl[32], lIIIIlllIl[71]));
            "".length();
        }
        int[] iArr27 = new int[lIIIIlllIl[1]];
        iArr27[lIIIIlllIl[0]] = lIIIIlllIl[16];
        if (lllIIlIlIIIl(Bank.contains(iArr27) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIlllIl[16], lIIIIlllIl[32], lIIIIlllIl[71]));
            "".length();
        }
    }

    private static boolean lllIIlIlIlll(int i) {
        return i < 0;
    }

    private static boolean lllIIlIlIlII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static boolean ap() {
        if (lllIIlIlIlIl(Vars.getBit(lIIIIlllIl[48]), lIIIIlllIl[1]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[17])) {
            return lIIIIlllIl[1];
        }
        if (lllIIlIlIlIl(Vars.getBit(lIIIIlllIl[48]), lIIIIlllIl[2]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[31]) && lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[17])) {
            return lIIIIlllIl[1];
        }
        if (lllIIlIlIlIl(Vars.getBit(lIIIIlllIl[48]), lIIIIlllIl[3]) && lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[31]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[36])) {
            return lIIIIlllIl[1];
        }
        if (lllIIlIlIlIl(Vars.getBit(lIIIIlllIl[48]), lIIIIlllIl[3]) && lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[31])) {
            int[] iArr = new int[lIIIIlllIl[1]];
            iArr[lIIIIlllIl[0]] = lIIIIlllIl[12];
            if (lllIIlIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                return lIIIIlllIl[1];
            }
        }
        if (lllIIlIlIlIl(Vars.getBit(lIIIIlllIl[48]), lIIIIlllIl[5]) && lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[36])) {
            int[] iArr2 = new int[lIIIIlllIl[1]];
            iArr2[lIIIIlllIl[0]] = lIIIIlllIl[12];
            if (lllIIlIIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIIlllIl[1];
            }
        }
        return lIIIIlllIl[0];
    }

    private static String lllIIlIIIllI(String llIlllIllllI, String llIlllIlllIl) {
        try {
            SecretKeySpec llIllllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllllIIIII = Cipher.getInstance("Blowfish");
            llIllllIIIII.init(lIIIIlllIl[2], llIllllIIIIl);
            return new String(llIllllIIIII.doFinal(Base64.getDecoder().decode(llIlllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlllIlllll) {
            llIlllIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlIllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lllIIlIIlllI();
        lllIIlIIllIl();
        bx = new ArrayList();
        cl = new WorldArea(lIIIIlllIl[76], lIIIIlllIl[77], lIIIIlllIl[47], lIIIIlllIl[40], lIIIIlllIl[0]);
        cm = new WorldPoint(lIIIIlllIl[78], lIIIIlllIl[79], lIIIIlllIl[0]);
        cn = new WorldPoint(lIIIIlllIl[80] + C0004e.c(lIIIIlllIl[1], lIIIIlllIl[5]), lIIIIlllIl[81], lIIIIlllIl[0]);
    }

    private static boolean lllIIlIIllll(int i) {
        return i != 0;
    }

    private static boolean lllIIlIllIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIIlIllIII(Object obj) {
        return obj == null;
    }

    public static void al() {
        if (lllIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lllIIlIlIIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[40]];
            Movement.walkTo(cm);
            "".length();
            Time.sleepTicks(lIIIIlllIl[1]);
            "".length();
        }
        if (lllIIlIIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            am();
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            ak();
            "".length();
            if (0 != 0) {
                return (47 ^ 43) & ((118 ^ 114) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIIlllIl[67];
    }

    private static boolean lllIIlIlIIlI(Object obj) {
        return obj != null;
    }

    public static void aq() {
        if (lllIIlIlIIlI(Widgets.get(lIIIIlllIl[49], lIIIIlllIl[50]))) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[51]];
            Widgets.get(lIIIIlllIl[49], lIIIIlllIl[50]).interact(lIIIIllIll[lIIIIlllIl[52]]);
            Time.sleepTicks(lIIIIlllIl[5]);
            "".length();
        }
        if (lllIIlIllIII(Widgets.get(lIIIIlllIl[49], lIIIIlllIl[50])) && lllIIlIlIIIl(Widgets.get(lIIIIlllIl[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks(lIIIIlllIl[1]);
            "".length();
            if (lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[17])) {
                Widgets.get(lIIIIlllIl[53], lIIIIlllIl[1]).getChild(lIIIIlllIl[1]).interact(lIIIIllIll[lIIIIlllIl[54]]);
            }
            if (lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[31]) && lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[17])) {
                Widgets.get(lIIIIlllIl[53], lIIIIlllIl[1]).getChild(lIIIIlllIl[2]).interact(lIIIIllIll[lIIIIlllIl[55]]);
            }
            if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[31]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[36])) {
                Widgets.get(lIIIIlllIl[53], lIIIIlllIl[1]).getChild(lIIIIlllIl[3]).interact(lIIIIllIll[lIIIIlllIl[19]]);
            }
            if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[31])) {
                int[] iArr = new int[lIIIIlllIl[1]];
                iArr[lIIIIlllIl[0]] = lIIIIlllIl[12];
                if (lllIIlIlIIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    Widgets.get(lIIIIlllIl[53], lIIIIlllIl[1]).getChild(lIIIIlllIl[3]).interact(lIIIIllIll[lIIIIlllIl[50]]);
                }
            }
            if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[36])) {
                int[] iArr2 = new int[lIIIIlllIl[1]];
                iArr2[lIIIIlllIl[0]] = lIIIIlllIl[12];
                if (lllIIlIIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                    Widgets.get(lIIIIlllIl[53], lIIIIlllIl[1]).getChild(lIIIIlllIl[5]).interact(lIIIIllIll[lIIIIlllIl[56]]);
                }
            }
            Time.sleepTicks(lIIIIlllIl[1]);
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIlllIl[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lllIIlIIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x021d, code lost:
        if (lllIIlIIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0299, code lost:
        if (lllIIlIIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0372, code lost:
        if (lllIIlIIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean an() {
        if (lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[19])) {
            int[] iArr = new int[lIIIIlllIl[1]];
            iArr[lIIIIlllIl[0]] = lIIIIlllIl[7];
            if (lllIIlIIllll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIlllIl[1]];
                iArr2[lIIIIlllIl[0]] = lIIIIlllIl[11];
                if (lllIIlIIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIIlllIl[1]];
                    iArr3[lIIIIlllIl[0]] = lIIIIlllIl[9];
                    if (lllIIlIIllll(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIIIlllIl[1]];
                        iArr4[lIIIIlllIl[0]] = lIIIIlllIl[12];
                        if (lllIIlIIllll(Inventory.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIIIlllIl[1]];
                            iArr5[lIIIIlllIl[0]] = lIIIIlllIl[18];
                            if (lllIIlIIllll(Inventory.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIIlllIl[1]];
                                iArr6[lIIIIlllIl[0]] = lIIIIlllIl[44];
                                if (lllIIlIlIIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIIIlllIl[1]];
                                    iArr7[lIIIIlllIl[0]] = lIIIIlllIl[44];
                                }
                                ?? r0 = lIIIIlllIl[1];
                                "".length();
                                return (((241 ^ 188) ^ (241 ^ 176)) & (((188 ^ 148) ^ (23 ^ 51)) ^ (-" ".length()))) != 0 ? ((((105 + 111) - 167) + 114) ^ (((60 + 104) - 149) + 176)) & (((((5 + 25) - (-61)) + 65) ^ (((86 + 50) - 93) + 85)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIIIIlllIl[0];
        } else if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[19]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6])) {
            int[] iArr8 = new int[lIIIIlllIl[1]];
            iArr8[lIIIIlllIl[0]] = lIIIIlllIl[11];
            if (lllIIlIIllll(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIIlllIl[1]];
                iArr9[lIIIIlllIl[0]] = lIIIIlllIl[9];
                if (lllIIlIIllll(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIIlllIl[1]];
                    iArr10[lIIIIlllIl[0]] = lIIIIlllIl[12];
                    if (lllIIlIIllll(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIIlllIl[1]];
                        iArr11[lIIIIlllIl[0]] = lIIIIlllIl[14];
                        if (lllIIlIIllll(Inventory.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIIlllIl[1]];
                            iArr12[lIIIIlllIl[0]] = lIIIIlllIl[44];
                            if (lllIIlIlIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIIIlllIl[1]];
                                iArr13[lIIIIlllIl[0]] = lIIIIlllIl[44];
                            }
                            ?? r02 = lIIIIlllIl[1];
                            "".length();
                            return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                        }
                    }
                }
            }
            return lIIIIlllIl[0];
        } else if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6]) && lllIIlIlIIIl(ck ? 1 : 0)) {
            int[] iArr14 = new int[lIIIIlllIl[1]];
            iArr14[lIIIIlllIl[0]] = lIIIIlllIl[20];
            if (lllIIlIlIIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIIlllIl[1]];
                iArr15[lIIIIlllIl[0]] = lIIIIlllIl[20];
            }
            int[] iArr16 = new int[lIIIIlllIl[1]];
            iArr16[lIIIIlllIl[0]] = lIIIIlllIl[22];
            if (lllIIlIIllll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIIlllIl[1]];
                iArr17[lIIIIlllIl[0]] = lIIIIlllIl[35];
                if (lllIIlIIllll(Inventory.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIIIlllIl[1];
                    "".length();
                    return "  ".length() != "  ".length() ? ((((165 + 17) - 86) + 127) ^ (((15 + 56) - 54) + 116)) & (((57 ^ 22) ^ (84 ^ 33)) ^ (-" ".length())) : r03;
                }
            }
            return lIIIIlllIl[0];
        } else if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6]) && lllIIlIIllll(ck ? 1 : 0)) {
            int[] iArr18 = new int[lIIIIlllIl[1]];
            iArr18[lIIIIlllIl[0]] = lIIIIlllIl[20];
            if (lllIIlIlIIIl(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIIIlllIl[1]];
                iArr19[lIIIIlllIl[0]] = lIIIIlllIl[20];
            }
            int[] iArr20 = new int[lIIIIlllIl[1]];
            iArr20[lIIIIlllIl[0]] = lIIIIlllIl[14];
            if (lllIIlIIllll(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIIlllIl[1]];
                iArr21[lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (lllIIlIIllll(Inventory.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIIlllIl[1]];
                    iArr22[lIIIIlllIl[0]] = lIIIIlllIl[21];
                    if (lllIIlIlIlII(Inventory.getFirst(iArr22).getQuantity(), lIIIIlllIl[17])) {
                        int[] iArr23 = new int[lIIIIlllIl[1]];
                        iArr23[lIIIIlllIl[0]] = lIIIIlllIl[22];
                        if (lllIIlIIllll(Inventory.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIIIlllIl[1]];
                            iArr24[lIIIIlllIl[0]] = lIIIIlllIl[35];
                            if (lllIIlIIllll(Inventory.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIIIlllIl[1];
                                "".length();
                                return ((245 ^ 188) ^ (81 ^ 28)) < ((((51 + 20) - (-43)) + 67) ^ (((8 + 48) - (-39)) + 82)) ? ((220 ^ 171) ^ (98 ^ 11)) & (((((33 + 165) - 191) + 167) ^ (((132 + 5) - 104) + 143)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIIIIlllIl[0];
        } else {
            return lIIIIlllIl[0];
        }
    }

    private static void lllIIlIIlllI() {
        lIIIIlllIl = new int[82];
        lIIIIlllIl[0] = (114 ^ 97) & ((112 ^ 99) ^ (-1));
        lIIIIlllIl[1] = " ".length();
        lIIIIlllIl[2] = "  ".length();
        lIIIIlllIl[3] = "   ".length();
        lIIIIlllIl[4] = (-26705) & 31704;
        lIIIIlllIl[5] = 170 ^ 174;
        lIIIIlllIl[6] = 138 ^ 189;
        lIIIIlllIl[7] = (-19538) & 20095;
        lIIIIlllIl[8] = (-4642) & 6141;
        lIIIIlllIl[9] = (-((-30873) & 31197)) & (-14481) & 15359;
        lIIIIlllIl[10] = (-9268) & 11767;
        lIIIIlllIl[11] = (-2259) & 2815;
        lIIIIlllIl[12] = (-((-9) & 20765)) & (-3266) & 24575;
        lIIIIlllIl[13] = (-((-4097) & 24161)) & (-2) & 24565;
        lIIIIlllIl[14] = (-19841) & 20403;
        lIIIIlllIl[15] = (-((-2067) & 20159)) & (-3) & 30719;
        lIIIIlllIl[16] = (-((-3617) & 28323)) & (-49) & 32763;
        lIIIIlllIl[17] = 124 ^ 121;
        lIIIIlllIl[18] = (-((-305) & 32181)) & (-513) & 32767;
        lIIIIlllIl[19] = (87 ^ 12) ^ (101 ^ 39);
        lIIIIlllIl[20] = (-20501) & 21887;
        lIIIIlllIl[21] = (-13633) & 14188;
        lIIIIlllIl[22] = (-((-4615) & 13263)) & (-18435) & 27643;
        lIIIIlllIl[23] = (36 ^ 89) ^ (231 ^ 164);
        lIIIIlllIl[24] = (19 ^ 53) ^ (58 ^ 26);
        lIIIIlllIl[25] = "  ".length() ^ (110 ^ 115);
        lIIIIlllIl[26] = (161 ^ 155) ^ (85 ^ 104);
        lIIIIlllIl[27] = -" ".length();
        lIIIIlllIl[28] = 78 ^ 107;
        lIIIIlllIl[29] = (83 ^ 113) ^ (57 ^ 19);
        lIIIIlllIl[30] = (((33 + 44) - 67) + 136) ^ (((143 + 183) - 205) + 70);
        lIIIIlllIl[31] = (151 ^ 152) ^ (99 ^ 101);
        lIIIIlllIl[32] = (65 ^ 127) ^ (122 ^ 78);
        lIIIIlllIl[33] = (5 ^ 84) ^ (155 ^ 193);
        lIIIIlllIl[34] = (((124 + 86) - 157) + 93) ^ (((123 + 68) - 124) + 91);
        lIIIIlllIl[35] = (((84 + 78) - 118) + 125) ^ (((106 + 58) - 114) + 100);
        lIIIIlllIl[36] = 111 ^ 98;
        lIIIIlllIl[37] = (-3619) & 3938;
        lIIIIlllIl[38] = (-((-18833) & 32253)) & (-18818) & 32767;
        lIIIIlllIl[39] = (-((-18377) & 26585)) & (-16963) & 28670;
        lIIIIlllIl[40] = 74 ^ 68;
        lIIIIlllIl[41] = (73 ^ 96) ^ (167 ^ 129);
        lIIIIlllIl[42] = (((94 + 110) - 147) + 77) ^ (((101 + 129) - 218) + 138);
        lIIIIlllIl[43] = 48 ^ 33;
        lIIIIlllIl[44] = (-((-18545) & 30841)) & (-19) & 13695;
        lIIIIlllIl[45] = (((61 + 6) - 57) + 168) ^ (((78 + 40) - 84) + 126);
        lIIIIlllIl[46] = 103 ^ 116;
        lIIIIlllIl[47] = 150 ^ 130;
        lIIIIlllIl[48] = (-8876) & 9151;
        lIIIIlllIl[49] = (-((-17) & 23583)) & (-417) & 24575;
        lIIIIlllIl[50] = (((71 + 70) - (-4)) + 40) ^ (((136 + 131) - 168) + 64);
        lIIIIlllIl[51] = 208 ^ 197;
        lIIIIlllIl[52] = (((42 + 55) - 29) + 93) ^ (((64 + 96) - 119) + 142);
        lIIIIlllIl[53] = (((85 ^ 61) + (((65 + 86) - 112) + 89)) - (48 ^ 115)) + (47 ^ 11);
        lIIIIlllIl[54] = 53 ^ 34;
        lIIIIlllIl[55] = (((192 + 159) - 306) + 177) ^ (((65 + 28) - (-73)) + 32);
        lIIIIlllIl[56] = 61 ^ 38;
        lIIIIlllIl[57] = (-((-27529) & 28559)) & (-16402) & 18431;
        lIIIIlllIl[58] = ((55 + 125) - 47) + 37;
        lIIIIlllIl[59] = (-4128) & 8127;
        lIIIIlllIl[60] = (-((-11209) & 31692)) & (-2089) & 24571;
        lIIIIlllIl[61] = (-((-2869) & 27510)) & (-5127) & 32767;
        lIIIIlllIl[62] = (-((-1043) & 3870)) & (-1) & 15327;
        lIIIIlllIl[63] = (-((-10405) & 27639)) & (-33) & 32766;
        lIIIIlllIl[64] = 10 ^ 114;
        lIIIIlllIl[65] = (((43 ^ 64) + (213 ^ 164)) - (((127 + 28) - 112) + 143)) + (60 ^ 72);
        lIIIIlllIl[66] = (-(211 ^ 178)) & (-1286) & 16381;
        lIIIIlllIl[67] = (253 ^ 157) ^ (155 ^ 159);
        lIIIIlllIl[68] = (-16385) & 28364;
        lIIIIlllIl[69] = (-3155) & 28154;
        lIIIIlllIl[70] = (-((-6529) & 14737)) & (-16425) & 32639;
        lIIIIlllIl[71] = (-13420) & 14319;
        lIIIIlllIl[72] = (108 ^ 34) ^ (73 ^ 27);
        lIIIIlllIl[73] = 233 ^ 138;
        lIIIIlllIl[74] = (118 ^ 17) ^ (69 ^ 63);
        lIIIIlllIl[75] = 48 ^ 46;
        lIIIIlllIl[76] = (-((-19273) & 31594)) & (-1025) & 16367;
        lIIIIlllIl[77] = (-((-10313) & 27485)) & (-4105) & 24575;
        lIIIIlllIl[78] = (-41) & 3071;
        lIIIIlllIl[79] = (-((-1089) & 18247)) & (-12305) & 32767;
        lIIIIlllIl[80] = (-((-11815) & 28583)) & (-2) & 19931;
        lIIIIlllIl[81] = (-33) & 3519;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
        if (lllIIlIIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01f7, code lost:
        if (lllIIlIIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028b, code lost:
        if (lllIIlIIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x034e, code lost:
        if (lllIIlIIllll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L77;
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
    private static boolean ao() {
        if (lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[19])) {
            int[] iArr = new int[lIIIIlllIl[1]];
            iArr[lIIIIlllIl[0]] = lIIIIlllIl[7];
            if (lllIIlIIllll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIlllIl[1]];
                iArr2[lIIIIlllIl[0]] = lIIIIlllIl[11];
                if (lllIIlIIllll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIIlllIl[1]];
                    iArr3[lIIIIlllIl[0]] = lIIIIlllIl[9];
                    if (lllIIlIIllll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIIIlllIl[1]];
                        iArr4[lIIIIlllIl[0]] = lIIIIlllIl[12];
                        if (lllIIlIIllll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIIIlllIl[1]];
                            iArr5[lIIIIlllIl[0]] = lIIIIlllIl[18];
                            if (lllIIlIIllll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIIlllIl[1]];
                                iArr6[lIIIIlllIl[0]] = lIIIIlllIl[44];
                                if (lllIIlIlIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIIIlllIl[1]];
                                    iArr7[lIIIIlllIl[0]] = lIIIIlllIl[44];
                                }
                                ?? r0 = lIIIIlllIl[1];
                                "".length();
                                return "   ".length() == (-" ".length()) ? ((199 ^ 159) ^ (14 ^ 119)) & (((((54 + 157) - 49) + 3) ^ (((46 + 0) - (-12)) + 74)) ^ (-" ".length())) : r0;
                            }
                        }
                    }
                }
            }
            return lIIIIlllIl[0];
        } else if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[19]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6])) {
            int[] iArr8 = new int[lIIIIlllIl[1]];
            iArr8[lIIIIlllIl[0]] = lIIIIlllIl[11];
            if (lllIIlIIllll(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIIlllIl[1]];
                iArr9[lIIIIlllIl[0]] = lIIIIlllIl[9];
                if (lllIIlIIllll(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIIlllIl[1]];
                    iArr10[lIIIIlllIl[0]] = lIIIIlllIl[12];
                    if (lllIIlIIllll(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIIlllIl[1]];
                        iArr11[lIIIIlllIl[0]] = lIIIIlllIl[14];
                        if (lllIIlIIllll(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIIlllIl[1]];
                            iArr12[lIIIIlllIl[0]] = lIIIIlllIl[44];
                            if (lllIIlIlIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIIIlllIl[1]];
                                iArr13[lIIIIlllIl[0]] = lIIIIlllIl[44];
                            }
                            ?? r02 = lIIIIlllIl[1];
                            "".length();
                            return "  ".length() == (-" ".length()) ? ("  ".length() ^ (129 ^ 169)) & (((105 ^ 85) ^ (3 ^ 21)) ^ (-" ".length())) : r02;
                        }
                    }
                }
            }
            return lIIIIlllIl[0];
        } else if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6]) && lllIIlIlIIIl(ck ? 1 : 0)) {
            int[] iArr14 = new int[lIIIIlllIl[1]];
            iArr14[lIIIIlllIl[0]] = lIIIIlllIl[20];
            if (lllIIlIlIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIIlllIl[1]];
                iArr15[lIIIIlllIl[0]] = lIIIIlllIl[20];
            }
            int[] iArr16 = new int[lIIIIlllIl[1]];
            iArr16[lIIIIlllIl[0]] = lIIIIlllIl[22];
            if (lllIIlIIllll(Bank.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIIlllIl[1]];
                iArr17[lIIIIlllIl[0]] = lIIIIlllIl[23];
                if (lllIIlIIllll(Bank.contains(iArr17) ? 1 : 0)) {
                    ?? r03 = lIIIIlllIl[1];
                    "".length();
                    return ((59 ^ 6) & ((116 ^ 73) ^ (-1))) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return lIIIIlllIl[0];
        } else if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6]) && lllIIlIIllll(ck ? 1 : 0)) {
            int[] iArr18 = new int[lIIIIlllIl[1]];
            iArr18[lIIIIlllIl[0]] = lIIIIlllIl[20];
            if (lllIIlIlIIIl(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIIIlllIl[1]];
                iArr19[lIIIIlllIl[0]] = lIIIIlllIl[20];
            }
            int[] iArr20 = new int[lIIIIlllIl[1]];
            iArr20[lIIIIlllIl[0]] = lIIIIlllIl[14];
            if (lllIIlIIllll(Bank.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIIlllIl[1]];
                iArr21[lIIIIlllIl[0]] = lIIIIlllIl[21];
                if (lllIIlIIllll(Bank.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIIIlllIl[1]];
                    iArr22[lIIIIlllIl[0]] = lIIIIlllIl[21];
                    if (lllIIlIlIlII(Bank.getFirst(iArr22).getQuantity(), lIIIIlllIl[17])) {
                        int[] iArr23 = new int[lIIIIlllIl[1]];
                        iArr23[lIIIIlllIl[0]] = lIIIIlllIl[22];
                        if (lllIIlIIllll(Bank.contains(iArr23) ? 1 : 0)) {
                            int[] iArr24 = new int[lIIIIlllIl[1]];
                            iArr24[lIIIIlllIl[0]] = lIIIIlllIl[23];
                            if (lllIIlIIllll(Bank.contains(iArr24) ? 1 : 0)) {
                                ?? r04 = lIIIIlllIl[1];
                                "".length();
                                return "  ".length() < (-" ".length()) ? ((4 ^ 107) ^ (88 ^ 123)) & (((18 ^ 103) ^ (92 ^ 101)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lIIIIlllIl[0];
        } else {
            return lIIIIlllIl[0];
        }
    }

    private static boolean lllIIlIlIlIl(int i, int i2) {
        return i == i2;
    }

    private static void lllIIlIIllIl() {
        lIIIIllIll = new String[lIIIIlllIl[25]];
        lIIIIllIll[lIIIIlllIl[0]] = lllIIlIIIlIl("Ny0gEDQSeDANPxgr", "uXYyZ");
        lIIIIllIll[lIIIIlllIl[1]] = lllIIlIIIllI("iVam/cOh2fF8wahucqxY6d07YqqiAca5kJbFmE0AoOQtlVQEVu2ef5RYlGQEYSP7AUYX6wqM/dM=", "nqqWI");
        lIIIIllIll[lIIIIlllIl[2]] = lllIIlIIIlIl("BiYhER0pMz4WHWgzOFgYKSk8", "HGWxz");
        lIIIIllIll[lIIIIlllIl[3]] = lllIIlIIIlll("cF60VkI5eyyhKwG4h+XUMiMXKoXXjN43", "VXDJa");
        lIIIIllIll[lIIIIlllIl[5]] = lllIIlIIIlIl("MhJNESMAVwAZIhYeAxdxFgIdAD0MEh5ccRYABAQyDR4DF3ERGE0yBDw+Izc=", "ewmpQ");
        lIIIIllIll[lIIIIlllIl[17]] = lllIIlIIIllI("y2LDVyXeZq1Fbm5OmyCD+Q==", "rGMFp");
        lIIIIllIll[lIIIIlllIl[24]] = lllIIlIIIllI("10dWtaghp6qHQKfTSEvTYw==", "NHEQs");
        lIIIIllIll[lIIIIlllIl[26]] = lllIIlIIIllI("jgiwjPs58wDgOkuV5qj2hS0Z67gLz9yR", "Jfymp");
        lIIIIllIll[lIIIIlllIl[29]] = lllIIlIIIllI("A0xs3DiQw3jniM3pdV01A1DoF0pre0aD", "TQbEy");
        lIIIIllIll[lIIIIlllIl[31]] = lllIIlIIIllI("rdoJT/GRJdehBZrgKvZaWZNLzfX11lkU", "VtYMt");
        lIIIIllIll[lIIIIlllIl[32]] = lllIIlIIIlll("NIfk+avJJ2nP7k9ygtzW8EBp6cqdv17L", "oPibq");
        lIIIIllIll[lIIIIlllIl[33]] = lllIIlIIIllI("xLnpED2/Wc8=", "RgcrJ");
        lIIIIllIll[lIIIIlllIl[34]] = lllIIlIIIlll("eRL1bHyyk40=", "WWxnI");
        lIIIIllIll[lIIIIlllIl[36]] = lllIIlIIIlIl("NRUnKGgMFXEsJBsScT44Fw4=", "xzQMH");
        lIIIIllIll[lIIIIlllIl[40]] = lllIIlIIIlIl("BxcOTAImVhsDATo=", "Ivxlv");
        lIIIIllIll[lIIIIlllIl[41]] = lllIIlIIIlll("y/xsM/gsvbg=", "AipeY");
        lIIIIllIll[lIIIIlllIl[42]] = lllIIlIIIlIl("LTcE", "nXsUQ");
        lIIIIllIll[lIIIIlllIl[43]] = lllIIlIIIllI("bM7brmWa4kY=", "MrXdi");
        lIIIIllIll[lIIIIlllIl[45]] = lllIIlIIIlIl("KCQ3Cy4COS0NbQo/NBk=", "iPCjM");
        lIIIIllIll[lIIIIlllIl[46]] = lllIIlIIIllI("eE+5kjdDZtc=", "IJwAQ");
        lIIIIllIll[lIIIIlllIl[47]] = lllIIlIIIlll("g9812TYBTR00a0x4aFi5RQ==", "BzKHV");
        lIIIIllIll[lIIIIlllIl[51]] = lllIIlIIIlIl("HicmFBE/MGMbDSU4IBsLJQ==", "QWCzx");
        lIIIIllIll[lIIIIlllIl[52]] = lllIIlIIIlIl("EzAWJSQ1eAo6Mjw0", "PXyJW");
        lIIIIllIll[lIIIIlllIl[54]] = lllIIlIIIlIl("PCw+K3o4MSImMQ4=", "kEPOZ");
        lIIIIllIll[lIIIIlllIl[55]] = lllIIlIIIlll("em1EtSQUee2P+WA11cm/hA==", "eAKZB");
        lIIIIllIll[lIIIIlllIl[19]] = lllIIlIIIlll("qWAO6sGTRBZboqdIMhZt2g==", "yyGLd");
        lIIIIllIll[lIIIIlllIl[50]] = lllIIlIIIllI("Sff2qxsAMgVTbAp6FtJHjw==", "qRFNT");
        lIIIIllIll[lIIIIlllIl[56]] = lllIIlIIIllI("UygvquNV/I/Jl83OP7/CMw==", "EgGcC");
        lIIIIllIll[lIIIIlllIl[72]] = lllIIlIIIlll("dTha2NZE+OKQ0IwdWtPnJA==", "oYeZp");
        lIIIIllIll[lIIIIlllIl[74]] = lllIIlIIIlIl("BCQ+KG8ZK3A4KhchJCdvXg==", "vMPOO");
        lIIIIllIll[lIIIIlllIl[75]] = lllIIlIIIlIl("MTcj", "rXTwa");
    }

    private static void am() {
        if (lllIIlIlIlll(lllIIlIlIllI(C0004e.w(), 30.0d))) {
            int[] iArr = new int[lIIIIlllIl[1]];
            iArr[lIIIIlllIl[0]] = lIIIIlllIl[18];
            if (lllIIlIIllll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIlllIl[1]];
                iArr2[lIIIIlllIl[0]] = lIIIIlllIl[18];
                Inventory.getFirst(iArr2).interact(lIIIIllIll[lIIIIlllIl[41]]);
                Time.sleepTicks(lIIIIlllIl[1]);
                "".length();
            }
        }
        if (lllIIlIllIII(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lllIIlIIllll(npc.getName().contains(lIIIIllIll[lIIIIlllIl[75]]) ? 1 : 0) && lllIIlIlIIIl(npc.isDead() ? 1 : 0)) {
                    ?? r0 = lIIIIlllIl[1];
                    "".length();
                    return (-" ".length()) >= " ".length() ? ((((123 + 65) - 110) + 155) ^ (((19 + 141) - 122) + 141)) & (((175 ^ 156) ^ (242 ^ 155)) ^ (-" ".length())) : r0;
                }
                return lIIIIlllIl[0];
            });
            String[] strArr = new String[lIIIIlllIl[2]];
            strArr[lIIIIlllIl[0]] = lIIIIllIll[lIIIIlllIl[42]];
            strArr[lIIIIlllIl[1]] = lIIIIllIll[lIIIIlllIl[43]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lllIIlIllIIl(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIIIIlllIl[1];
                    "".length();
                    return "   ".length() == 0 ? ((((7 + 70) - (-16)) + 92) ^ (((115 + 124) - 173) + 66)) & (((51 ^ 54) ^ (188 ^ 132)) ^ (-" ".length())) : r0;
                }
                return lIIIIlllIl[0];
            }).collect(Collectors.toList());
            int[] iArr3 = new int[lIIIIlllIl[1]];
            iArr3[lIIIIlllIl[0]] = lIIIIlllIl[44];
            if (lllIIlIIllll(Equipment.contains(iArr3) ? 1 : 0) && lllIIlIlIIIl(ap() ? 1 : 0)) {
                aq();
            }
            if (lllIIlIlIIlI(nearest) && lllIIlIlIIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[45]];
                nearest.interact(lIIIIllIll[lIIIIlllIl[46]]);
                Time.sleepTicks(lIIIIlllIl[3]);
                "".length();
            }
        }
        if (lllIIlIlIIlI(Players.getLocal().getInteracting())) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[47]];
            Time.sleepTicks(lIIIIlllIl[1]);
            "".length();
        }
    }

    private static boolean lllIIlIlIIII(int i, int i2) {
        return i < i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lIIIIllIll[lIIIIlllIl[72]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v357, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v387, types: [boolean] */
    public static void ak() {
        if (lllIIlIIllll(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[0]];
            C0001b.a(bx);
            if (lllIIlIlIIII(bx.size(), lIIIIlllIl[1])) {
                System.out.println(lIIIIllIll[lIIIIlllIl[1]]);
                bv = lIIIIlllIl[0];
            }
        }
        if (lllIIlIlIIIl(bv ? 1 : 0)) {
            if (lllIIlIlIIIl(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIIlIlIIlI(nearest) && lllIIlIlIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[2]];
                    C0000a.a(nearest);
                }
                if (lllIIlIlIIlI(nearest) && lllIIlIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[3]];
                    if (lllIIlIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIlllIl[4]);
                        "".length();
                    }
                    if (lllIIlIIllll(Bank.isOpen() ? 1 : 0)) {
                        if (lllIIlIlIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIlllIl[5]);
                            "".length();
                        }
                        while (lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6]) && lllIIlIlIIIl(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks(lIIIIlllIl[1]);
                            "".length();
                            "".length();
                            if ((124 ^ 121) <= 0) {
                                return;
                            }
                        }
                        if (lllIIlIlIIIl(ao() ? 1 : 0)) {
                            Q();
                            System.out.println(lIIIIllIll[lIIIIlllIl[5]]);
                            bv = lIIIIlllIl[1];
                            return;
                        }
                        if (lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6])) {
                            int[] iArr = new int[lIIIIlllIl[1]];
                            iArr[lIIIIlllIl[0]] = lIIIIlllIl[7];
                            if (lllIIlIIllll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIIIlllIl[1]];
                                iArr2[lIIIIlllIl[0]] = lIIIIlllIl[7];
                                if (lllIIlIlIIII(Inventory.getCount(iArr2), lIIIIlllIl[1])) {
                                    Bank.withdraw(lIIIIlllIl[7], lIIIIlllIl[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr3 = new int[lIIIIlllIl[1]];
                                        iArr3[lIIIIlllIl[0]] = lIIIIlllIl[7];
                                        if (lllIIlIlIIll(Inventory.getCount(iArr3))) {
                                            ?? r0 = lIIIIlllIl[1];
                                            "".length();
                                            return 0 != 0 ? ((145 ^ 130) ^ (35 ^ 105)) & (((141 ^ 150) ^ (226 ^ 160)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIIlllIl[0];
                                    }, lIIIIlllIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr3 = new int[lIIIIlllIl[1]];
                            iArr3[lIIIIlllIl[0]] = lIIIIlllIl[9];
                            if (lllIIlIIllll(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIIIlllIl[1]];
                                iArr4[lIIIIlllIl[0]] = lIIIIlllIl[9];
                                if (lllIIlIlIIII(Inventory.getCount(iArr4), lIIIIlllIl[1])) {
                                    Bank.withdraw(lIIIIlllIl[9], lIIIIlllIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr5 = new int[lIIIIlllIl[1]];
                                        iArr5[lIIIIlllIl[0]] = lIIIIlllIl[9];
                                        if (lllIIlIlIIll(Inventory.getCount(iArr5))) {
                                            ?? r0 = lIIIIlllIl[1];
                                            "".length();
                                            return ((224 ^ 172) & ((58 ^ 118) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIIlllIl[0];
                                    }, lIIIIlllIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr5 = new int[lIIIIlllIl[1]];
                            iArr5[lIIIIlllIl[0]] = lIIIIlllIl[11];
                            if (lllIIlIIllll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIIlllIl[1]];
                                iArr6[lIIIIlllIl[0]] = lIIIIlllIl[11];
                                if (lllIIlIlIIII(Inventory.getCount(iArr6), lIIIIlllIl[1])) {
                                    Bank.withdraw(lIIIIlllIl[11], lIIIIlllIl[10], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr7 = new int[lIIIIlllIl[1]];
                                        iArr7[lIIIIlllIl[0]] = lIIIIlllIl[11];
                                        if (lllIIlIlIIll(Inventory.getCount(iArr7))) {
                                            ?? r0 = lIIIIlllIl[1];
                                            "".length();
                                            return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIIlllIl[0];
                                    }, lIIIIlllIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr7 = new int[lIIIIlllIl[1]];
                            iArr7[lIIIIlllIl[0]] = lIIIIlllIl[12];
                            if (lllIIlIIllll(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[lIIIIlllIl[1]];
                                iArr8[lIIIIlllIl[0]] = lIIIIlllIl[12];
                                if (lllIIlIlIIII(Inventory.getCount(iArr8), lIIIIlllIl[1])) {
                                    Bank.withdraw(lIIIIlllIl[12], lIIIIlllIl[13], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr9 = new int[lIIIIlllIl[1]];
                                        iArr9[lIIIIlllIl[0]] = lIIIIlllIl[12];
                                        if (lllIIlIlIIll(Inventory.getCount(iArr9))) {
                                            ?? r0 = lIIIIlllIl[1];
                                            "".length();
                                            return 0 != 0 ? ((((144 + 136) - 129) + 50) ^ (((17 + 148) - 107) + 134)) & (((((43 + 77) - 21) + 43) ^ (((129 + 121) - 218) + 103)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIIlllIl[0];
                                    }, lIIIIlllIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr9 = new int[lIIIIlllIl[1]];
                            iArr9[lIIIIlllIl[0]] = lIIIIlllIl[14];
                            if (lllIIlIIllll(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[lIIIIlllIl[1]];
                                iArr10[lIIIIlllIl[0]] = lIIIIlllIl[14];
                                if (lllIIlIlIIII(Inventory.getCount(iArr10), lIIIIlllIl[1])) {
                                    Bank.withdraw(lIIIIlllIl[14], lIIIIlllIl[8], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr11 = new int[lIIIIlllIl[1]];
                                        iArr11[lIIIIlllIl[0]] = lIIIIlllIl[14];
                                        if (lllIIlIlIIll(Inventory.getCount(iArr11))) {
                                            ?? r0 = lIIIIlllIl[1];
                                            "".length();
                                            return "  ".length() == 0 ? ((76 ^ 7) ^ (194 ^ 171)) & (((188 ^ 155) ^ (40 ^ 45)) ^ (-" ".length())) : r0;
                                        }
                                        return lIIIIlllIl[0];
                                    }, lIIIIlllIl[4]);
                                    "".length();
                                }
                            }
                            int[] iArr11 = new int[lIIIIlllIl[1]];
                            iArr11[lIIIIlllIl[0]] = lIIIIlllIl[15];
                            if (lllIIlIIllll(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[lIIIIlllIl[1]];
                                iArr12[lIIIIlllIl[0]] = lIIIIlllIl[15];
                                if (lllIIlIlIIIl(Inventory.contains(iArr12) ? 1 : 0)) {
                                    Bank.withdraw(lIIIIlllIl[15], lIIIIlllIl[1], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr13 = new int[lIIIIlllIl[1]];
                                        iArr13[lIIIIlllIl[0]] = lIIIIlllIl[15];
                                        return Inventory.contains(iArr13);
                                    }, lIIIIlllIl[4]);
                                    "".length();
                                }
                            }
                            Bank.withdraw(lIIIIlllIl[16], lIIIIlllIl[17], Bank.WithdrawMode.DEFAULT);
                            int[] iArr13 = new int[lIIIIlllIl[1]];
                            iArr13[lIIIIlllIl[0]] = lIIIIlllIl[18];
                            if (lllIIlIIllll(Bank.contains(iArr13) ? 1 : 0)) {
                                int[] iArr14 = new int[lIIIIlllIl[1]];
                                iArr14[lIIIIlllIl[0]] = lIIIIlllIl[18];
                                if (lllIIlIlIIII(Inventory.getCount(iArr14), lIIIIlllIl[1]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[19])) {
                                    Bank.withdrawAll(lIIIIlllIl[18], Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks(lIIIIlllIl[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] iArr15 = new int[lIIIIlllIl[1]];
                                        iArr15[lIIIIlllIl[0]] = lIIIIlllIl[18];
                                        if (lllIIlIlIIll(Inventory.getCount(iArr15))) {
                                            ?? r0 = lIIIIlllIl[1];
                                            "".length();
                                            return (38 ^ 34) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return lIIIIlllIl[0];
                                    }, lIIIIlllIl[4]);
                                    "".length();
                                }
                            }
                        }
                        if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6])) {
                            int[] iArr15 = new int[lIIIIlllIl[1]];
                            iArr15[lIIIIlllIl[0]] = lIIIIlllIl[20];
                            if (lllIIlIlIIIl(Equipment.contains(iArr15) ? 1 : 0)) {
                                Bank.withdraw(lIIIIlllIl[20], lIIIIlllIl[1], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIIlllIl[1]);
                                "".length();
                            }
                            if (lllIIlIIllll(ck ? 1 : 0)) {
                                Bank.withdrawAll(lIIIIlllIl[21], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIIlllIl[1]);
                                "".length();
                                Bank.withdrawAll(lIIIIlllIl[14], Bank.WithdrawMode.ITEM);
                                Time.sleepTicks(lIIIIlllIl[1]);
                                "".length();
                            }
                            Bank.withdrawAll(lIIIIlllIl[22], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIIIlllIl[1]);
                            "".length();
                            Bank.withdrawAll(lIIIIlllIl[23], Bank.WithdrawMode.NOTED);
                            Time.sleepTicks(lIIIIlllIl[1]);
                            "".length();
                        }
                    }
                }
            }
            if (lllIIlIIllll(an() ? 1 : 0)) {
                if (lllIIlIIllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[19])) {
                    if (lllIIlIlIIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[17]];
                        Movement.walkTo(cm);
                        "".length();
                        Time.sleepTicks(lIIIIlllIl[1]);
                        "".length();
                    }
                    if (lllIIlIIllll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[24]];
                        am();
                    }
                }
                if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[19]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[25])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[26]];
                    if (lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast(SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks(lIIIIlllIl[1]);
                        "".length();
                    }
                }
                if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[25]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[28])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[29]];
                    if (lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast(SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks(lIIIIlllIl[1]);
                        "".length();
                    }
                }
                if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[28]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[30])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[31]];
                    if (lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast(SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks(lIIIIlllIl[1]);
                        "".length();
                    }
                }
                if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[30]) && lllIIlIlIIII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[32]];
                    if (lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks(lIIIIlllIl[1]);
                        "".length();
                    }
                }
                if (lllIIlIlIlII(Skills.getLevel(Skill.MAGIC), lIIIIlllIl[6])) {
                    AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[33]];
                    int[] iArr16 = new int[lIIIIlllIl[1]];
                    iArr16[lIIIIlllIl[0]] = lIIIIlllIl[20];
                    if (lllIIlIIllll(Inventory.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIIIlllIl[1]];
                        iArr17[lIIIIlllIl[0]] = lIIIIlllIl[20];
                        if (lllIIlIlIIIl(Equipment.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIIIlllIl[1]];
                            iArr18[lIIIIlllIl[0]] = lIIIIlllIl[20];
                            Inventory.getFirst(iArr18).interact(lIIIIllIll[lIIIIlllIl[34]]);
                            Time.sleepTicks(lIIIIlllIl[1]);
                            "".length();
                        }
                    }
                    if (lllIIlIIllll(GrandExchange.isOpen() ? 1 : 0)) {
                        C0001b.g();
                    }
                    int[] iArr19 = new int[lIIIIlllIl[1]];
                    iArr19[lIIIIlllIl[0]] = lIIIIlllIl[22];
                    Item first = Inventory.getFirst(iArr19);
                    int[] iArr20 = new int[lIIIIlllIl[1]];
                    iArr20[lIIIIlllIl[0]] = lIIIIlllIl[35];
                    Item first2 = Inventory.getFirst(iArr20);
                    if (lllIIlIlIIIl(ck ? 1 : 0)) {
                        if (lllIIlIlIIIl(Players.getLocal().getWorldLocation().equals(cn) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIllIll[lIIIIlllIl[36]];
                            Movement.walkTo(cn);
                            "".length();
                            Time.sleepTicks(lIIIIlllIl[1]);
                            "".length();
                        }
                        if (lllIIlIIllll(Players.getLocal().getWorldLocation().equals(cn) ? 1 : 0) && lllIIlIlIIlI(first) && lllIIlIlIIlI(first2)) {
                            int experience = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lllIIlIllIlI(Skills.getExperience(Skill.MAGIC), experience)) {
                                    ?? r0 = lIIIIlllIl[1];
                                    "".length();
                                    return (-((((184 + 55) - 113) + 72) ^ (((132 + 174) - 290) + 178))) >= 0 ? ((31 ^ 13) ^ (42 ^ 26)) & (((((101 + 93) - 84) + 24) ^ (((128 + 43) - 30) + 23)) ^ (-" ".length())) : r0;
                                }
                                return lIIIIlllIl[0];
                            }, lIIIIlllIl[8]);
                            "".length();
                            Time.sleep(C0004e.c(lIIIIlllIl[37], lIIIIlllIl[38]));
                            "".length();
                        }
                    }
                    if (lllIIlIIllll(ck ? 1 : 0)) {
                        if (lllIIlIlIIlI(first) && lllIIlIlIIlI(first2) && lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                            int experience2 = Skills.getExperience(Skill.MAGIC);
                            Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY, first2);
                            Time.sleepUntil(() -> {
                                if (lllIIlIllIlI(Skills.getExperience(Skill.MAGIC), experience2)) {
                                    ?? r0 = lIIIIlllIl[1];
                                    "".length();
                                    return (-" ".length()) > "   ".length() ? ((120 ^ 117) ^ (101 ^ 78)) & (((57 ^ 117) ^ (72 ^ 34)) ^ (-" ".length())) : r0;
                                }
                                return lIIIIlllIl[0];
                            }, lIIIIlllIl[8]);
                            "".length();
                        }
                        Magic.cast(SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            if (lllIIlIlIlIl(Players.getLocal().getAnimation(), lIIIIlllIl[27])) {
                                ?? r0 = lIIIIlllIl[1];
                                "".length();
                                return "  ".length() == 0 ? ((2 ^ 108) ^ (255 ^ 159)) & (((247 ^ 128) ^ (79 ^ 54)) ^ (-" ".length())) : r0;
                            }
                            return lIIIIlllIl[0];
                        }, lIIIIlllIl[39]);
                        "".length();
                    }
                }
            }
        }
    }
}
