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
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aq  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aq.class */
public class aq implements InterfaceC0003ac {
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ int[] llIllIlIIl;
    private static /* synthetic */ String[] llIllIIlll;

    private static boolean lIllIlllllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIllllIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIllllIllI(Object obj) {
        return obj != null;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIllIIlll[llIllIlIIl[34]];
    }

    private static String lIllIllIllIlI(String llllllllllllllllllIIIIllllllllIl, String llllllllllllllllllIIIIllllllllII) {
        String llllllllllllllllllIIIIllllllllIl2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIllllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIIIIlllllllIlI = llllllllllllllllllIIIIllllllllII.toCharArray();
        int llllllllllllllllllIIIIlllllllIIl = llIllIlIIl[0];
        char[] charArray = llllllllllllllllllIIIIllllllllIl2.toCharArray();
        int length = charArray.length;
        int i = llIllIlIIl[0];
        while (lIllIllllIlII(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllllIIIIlllllllIlI[llllllllllllllllllIIIIlllllllIIl % llllllllllllllllllIIIIlllllllIlI.length]));
            "".length();
            llllllllllllllllllIIIIlllllllIIl++;
            i++;
            "".length();
            if ((-(93 ^ 88)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIllIllllIIlI();
        lIllIlllIlllI();
        bv = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains((v0) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
            return m(v0);
        }) ? 1 : 0) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void aB() {
        int[] iArr = new int[llIllIlIIl[1]];
        iArr[llIllIlIIl[0]] = llIllIlIIl[31];
        if (lIllIllllIlIl(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIllIlIIl[1]];
            iArr2[llIllIlIIl[0]] = llIllIlIIl[32];
            if (lIllIllllIlIl(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIllIlIIl[1]];
                iArr3[llIllIlIIl[0]] = llIllIlIIl[16];
                if (lIllIllllIlIl(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llIllIlIIl[1]];
                    iArr4[llIllIlIIl[0]] = llIllIlIIl[11];
                    if (lIllIllllIlIl(Equipment.contains(iArr4) ? 1 : 0)) {
                    }
                }
            }
        }
        if (lIllIlllllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[27])) {
            int[] iArr5 = new int[llIllIlIIl[1]];
            iArr5[llIllIlIIl[0]] = llIllIlIIl[31];
            if (lIllIllllIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIllIlIIl[1]];
                iArr6[llIllIlIIl[0]] = llIllIlIIl[31];
                Inventory.getFirst(iArr6).interact(llIllIIlll[llIllIlIIl[33]]);
            }
            int[] iArr7 = new int[llIllIlIIl[1]];
            iArr7[llIllIlIIl[0]] = llIllIlIIl[12];
            if (lIllIllllIIll(Inventory.contains(iArr7) ? 1 : 0) && lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[6])) {
                C0018e.l(llIllIlIIl[12]);
            }
            int[] iArr8 = new int[llIllIlIIl[1]];
            iArr8[llIllIlIIl[0]] = llIllIlIIl[13];
            if (lIllIllllIIll(Inventory.contains(iArr8) ? 1 : 0) && lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[6]) && lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[34])) {
                C0018e.l(llIllIlIIl[13]);
            }
            int[] iArr9 = new int[llIllIlIIl[1]];
            iArr9[llIllIlIIl[0]] = llIllIlIIl[14];
            if (lIllIllllIIll(Inventory.contains(iArr9) ? 1 : 0) && lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[34])) {
                C0018e.l(llIllIlIIl[14]);
            }
            int[] iArr10 = new int[llIllIlIIl[1]];
            iArr10[llIllIlIIl[0]] = llIllIlIIl[15];
            if (lIllIllllIIll(Inventory.contains(iArr10) ? 1 : 0)) {
                C0018e.l(llIllIlIIl[15]);
            }
        }
        if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[34])) {
            int[] iArr11 = new int[llIllIlIIl[1]];
            iArr11[llIllIlIIl[0]] = llIllIlIIl[18];
            if (lIllIllllIIll(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIllIlIIl[1]];
                iArr12[llIllIlIIl[0]] = llIllIlIIl[18];
                Inventory.getFirst(iArr12).interact(llIllIIlll[llIllIlIIl[35]]);
            }
        }
        if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[27])) {
            int[] iArr13 = new int[llIllIlIIl[1]];
            iArr13[llIllIlIIl[0]] = llIllIlIIl[32];
            if (lIllIllllIIll(Inventory.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIllIlIIl[1]];
                iArr14[llIllIlIIl[0]] = llIllIlIIl[32];
                Inventory.getFirst(iArr14).interact(llIllIIlll[llIllIlIIl[36]]);
            }
            int[] iArr15 = new int[llIllIlIIl[1]];
            iArr15[llIllIlIIl[0]] = llIllIlIIl[37];
            if (lIllIllllIIll(Inventory.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llIllIlIIl[1]];
                iArr16[llIllIlIIl[0]] = llIllIlIIl[37];
                Inventory.getFirst(iArr16).interact(llIllIIlll[llIllIlIIl[24]]);
            }
            int[] iArr17 = new int[llIllIlIIl[1]];
            iArr17[llIllIlIIl[0]] = llIllIlIIl[16];
            if (lIllIllllIIll(Inventory.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[llIllIlIIl[1]];
                iArr18[llIllIlIIl[0]] = llIllIlIIl[16];
                Inventory.getFirst(iArr18).interact(llIllIIlll[llIllIlIIl[38]]);
            }
        }
        if (lIllIllllIlII(Skills.getLevel(Skill.DEFENCE), llIllIlIIl[39])) {
            int[] iArr19 = new int[llIllIlIIl[1]];
            iArr19[llIllIlIIl[0]] = llIllIlIIl[19];
            if (lIllIllllIIll(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIllIlIIl[1]];
                iArr20[llIllIlIIl[0]] = llIllIlIIl[19];
                Inventory.getFirst(iArr20).interact(llIllIIlll[llIllIlIIl[40]]);
            }
        }
        if (lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
            int[] iArr21 = new int[llIllIlIIl[1]];
            iArr21[llIllIlIIl[0]] = llIllIlIIl[17];
            if (lIllIllllIIll(Inventory.contains(iArr21) ? 1 : 0)) {
                int[] iArr22 = new int[llIllIlIIl[1]];
                iArr22[llIllIlIIl[0]] = llIllIlIIl[17];
                Inventory.getFirst(iArr22).interact(llIllIIlll[llIllIlIIl[41]]);
            }
        }
        int[] iArr23 = new int[llIllIlIIl[1]];
        iArr23[llIllIlIIl[0]] = llIllIlIIl[20];
        if (lIllIllllIIll(Inventory.contains(iArr23) ? 1 : 0)) {
            int[] iArr24 = new int[llIllIlIIl[1]];
            iArr24[llIllIlIIl[0]] = llIllIlIIl[20];
            Inventory.getFirst(iArr24).interact(llIllIIlll[llIllIlIIl[42]]);
        }
        int[] iArr25 = new int[llIllIlIIl[1]];
        iArr25[llIllIlIIl[0]] = llIllIlIIl[21];
        if (lIllIllllIIll(Inventory.contains(iArr25) ? 1 : 0)) {
            int[] iArr26 = new int[llIllIlIIl[1]];
            iArr26[llIllIlIIl[0]] = llIllIlIIl[21];
            Inventory.getFirst(iArr26).interact(llIllIIlll[llIllIlIIl[43]]);
        }
        if (lIllIlllllIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44])) {
            int[] iArr27 = new int[llIllIlIIl[1]];
            iArr27[llIllIlIIl[0]] = llIllIlIIl[8];
            if (lIllIllllIIll(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[llIllIlIIl[1]];
                iArr28[llIllIlIIl[0]] = llIllIlIIl[8];
                if (lIllIllllIlIl(Equipment.contains(iArr28) ? 1 : 0)) {
                    int[] iArr29 = new int[llIllIlIIl[1]];
                    iArr29[llIllIlIIl[0]] = llIllIlIIl[8];
                    Inventory.getFirst(iArr29).interact(llIllIIlll[llIllIlIIl[45]]);
                }
            }
            if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
                int[] iArr30 = new int[llIllIlIIl[1]];
                iArr30[llIllIlIIl[0]] = llIllIlIIl[9];
                if (lIllIllllIIll(Inventory.contains(iArr30) ? 1 : 0)) {
                    int[] iArr31 = new int[llIllIlIIl[1]];
                    iArr31[llIllIlIIl[0]] = llIllIlIIl[9];
                    if (lIllIllllIlIl(Equipment.contains(iArr31) ? 1 : 0)) {
                        int[] iArr32 = new int[llIllIlIIl[1]];
                        iArr32[llIllIlIIl[0]] = llIllIlIIl[9];
                        Inventory.getFirst(iArr32).interact(llIllIIlll[llIllIlIIl[46]]);
                    }
                }
            }
            if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2]) && lIllIlllllIII(Skills.getLevel(Skill.DEFENCE), llIllIlIIl[39])) {
                int[] iArr33 = new int[llIllIlIIl[1]];
                iArr33[llIllIlIIl[0]] = llIllIlIIl[10];
                if (lIllIllllIIll(Inventory.contains(iArr33) ? 1 : 0)) {
                    int[] iArr34 = new int[llIllIlIIl[1]];
                    iArr34[llIllIlIIl[0]] = llIllIlIIl[10];
                    if (lIllIllllIlIl(Equipment.contains(iArr34) ? 1 : 0)) {
                        int[] iArr35 = new int[llIllIlIIl[1]];
                        iArr35[llIllIlIIl[0]] = llIllIlIIl[10];
                        Inventory.getFirst(iArr35).interact(llIllIIlll[llIllIlIIl[47]]);
                    }
                }
            }
            if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
                int[] iArr36 = new int[llIllIlIIl[1]];
                iArr36[llIllIlIIl[0]] = llIllIlIIl[11];
                if (lIllIllllIIll(Inventory.contains(iArr36) ? 1 : 0)) {
                    int[] iArr37 = new int[llIllIlIIl[1]];
                    iArr37[llIllIlIIl[0]] = llIllIlIIl[11];
                    Inventory.getFirst(iArr37).interact(llIllIIlll[llIllIlIIl[48]]);
                }
            }
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aA();
            "".length();
            if (0 != 0) {
                return (33 ^ 127) & ((229 ^ 187) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIllIlIIl[57];
    }

    private static boolean lIllIlllllIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIllIllIlllII(String llllllllllllllllllIIIlIIIIIIllIl, String llllllllllllllllllIIIlIIIIIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIIIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllIlIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlIIIIIIlllI) {
            llllllllllllllllllIIIlIIIIIIlllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIllIlIIl[0];
    }

    private static boolean lIllIlllllIlI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0121, code lost:
        if (lIllIllllIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aq.llIllIlIIl[50]) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04b7, code lost:
        if (lIllIllllIlII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aq.llIllIlIIl[24]) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0500  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        if (lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[27])) {
            int[] iArr2 = new int[llIllIlIIl[1]];
            iArr2[llIllIlIIl[0]] = llIllIlIIl[12];
            if (lIllIllllIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(llIllIlIIl[12], llIllIlIIl[1], llIllIlIIl[49]));
                "".length();
            }
            int[] iArr3 = new int[llIllIlIIl[1]];
            iArr3[llIllIlIIl[0]] = llIllIlIIl[13];
            if (lIllIllllIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0017d(llIllIlIIl[13], llIllIlIIl[1], llIllIlIIl[49]));
                "".length();
            }
            int[] iArr4 = new int[llIllIlIIl[1]];
            iArr4[llIllIlIIl[0]] = llIllIlIIl[14];
            if (lIllIllllIlIl(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0017d(llIllIlIIl[14], llIllIlIIl[1], llIllIlIIl[49]));
                "".length();
            }
            int[] iArr5 = new int[llIllIlIIl[1]];
            iArr5[llIllIlIIl[0]] = llIllIlIIl[15];
            if (lIllIllllIIll(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIllIlIIl[1]];
                iArr6[llIllIlIIl[0]] = llIllIlIIl[15];
            }
            bv.add(new C0017d(llIllIlIIl[15], llIllIlIIl[51], llIllIlIIl[36]));
            "".length();
        }
        int[] iArr7 = new int[llIllIlIIl[1]];
        iArr7[llIllIlIIl[0]] = llIllIlIIl[18];
        if (lIllIllllIlIl(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIIl[18], llIllIlIIl[1], llIllIlIIl[52]));
            "".length();
        }
        int[] iArr8 = new int[llIllIlIIl[1]];
        iArr8[llIllIlIIl[0]] = llIllIlIIl[19];
        if (lIllIllllIlIl(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIIl[19], llIllIlIIl[1], llIllIlIIl[52]));
            "".length();
        }
        int[] iArr9 = new int[llIllIlIIl[1]];
        iArr9[llIllIlIIl[0]] = llIllIlIIl[17];
        if (lIllIllllIlIl(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIIl[17], llIllIlIIl[1], llIllIlIIl[52]));
            "".length();
        }
        int[] iArr10 = new int[llIllIlIIl[1]];
        iArr10[llIllIlIIl[0]] = llIllIlIIl[20];
        if (lIllIllllIlIl(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIIl[20], llIllIlIIl[1], llIllIlIIl[53]));
            "".length();
        }
        if (lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
            int[] iArr11 = new int[llIllIlIIl[1]];
            iArr11[llIllIlIIl[0]] = llIllIlIIl[16];
            if (lIllIllllIlIl(Bank.contains(iArr11) ? 1 : 0)) {
                bv.add(new C0017d(llIllIlIIl[16], llIllIlIIl[54], llIllIlIIl[43]));
                "".length();
            }
        }
        int[] iArr12 = new int[llIllIlIIl[1]];
        iArr12[llIllIlIIl[0]] = llIllIlIIl[9];
        if (lIllIllllIlIl(Bank.contains(iArr12) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIIl[9], llIllIlIIl[1], llIllIlIIl[55]));
            "".length();
        }
        int[] iArr13 = new int[llIllIlIIl[1]];
        iArr13[llIllIlIIl[0]] = llIllIlIIl[10];
        if (lIllIllllIlIl(Bank.contains(iArr13) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIIl[10], llIllIlIIl[1], llIllIlIIl[55]));
            "".length();
        }
        if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
            int[] iArr14 = new int[llIllIlIIl[1]];
            iArr14[llIllIlIIl[0]] = llIllIlIIl[11];
            if (lIllIllllIlIl(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0017d(llIllIlIIl[11], llIllIlIIl[51], llIllIlIIl[56]));
                "".length();
            }
        }
        int[] iArr15 = new int[llIllIlIIl[1]];
        iArr15[llIllIlIIl[0]] = llIllIlIIl[22];
        if (lIllIllllIlIl(Bank.contains(iArr15) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIIl[22], llIllIlIIl[1], C0023j.cf));
            "".length();
        }
        int[] iArr16 = new int[llIllIlIIl[1]];
        iArr16[llIllIlIIl[0]] = llIllIlIIl[26];
        if (lIllIllllIlIl(Bank.contains(iArr16) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIIl[26], llIllIlIIl[57], llIllIlIIl[58]));
            "".length();
        }
        if (lIllIllllIlIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIllIIlll[llIllIlIIl[63]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIllIlIIl[59], llIllIlIIl[6], llIllIlIIl[60]));
            "".length();
        }
        int[] iArr17 = new int[llIllIlIIl[1]];
        iArr17[llIllIlIIl[0]] = llIllIlIIl[61];
        if (lIllIllllIIll(Bank.contains(iArr17) ? 1 : 0)) {
            int[] iArr18 = new int[llIllIlIIl[1]];
            iArr18[llIllIlIIl[0]] = llIllIlIIl[61];
            if (lIllIllllIIll(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llIllIlIIl[1]];
                iArr19[llIllIlIIl[0]] = llIllIlIIl[61];
            }
            iArr = new int[llIllIlIIl[1]];
            iArr[llIllIlIIl[0]] = llIllIlIIl[23];
            if (lIllIllllIIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr20 = new int[llIllIlIIl[1]];
                iArr20[llIllIlIIl[0]] = llIllIlIIl[23];
                if (!lIllIllllIIll(Bank.contains(iArr20) ? 1 : 0)) {
                    return;
                }
                int[] iArr21 = new int[llIllIlIIl[1]];
                iArr21[llIllIlIIl[0]] = llIllIlIIl[23];
                if (!lIllIllllIlII(Bank.getFirst(iArr21).getQuantity(), llIllIlIIl[24])) {
                    return;
                }
            }
            bv.add(new C0017d(llIllIlIIl[23], llIllIlIIl[24], llIllIlIIl[62]));
            "".length();
        }
        bv.add(new C0017d(llIllIlIIl[61], llIllIlIIl[24], llIllIlIIl[62]));
        "".length();
        iArr = new int[llIllIlIIl[1]];
        iArr[llIllIlIIl[0]] = llIllIlIIl[23];
        if (lIllIllllIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIllIlIIl[23], llIllIlIIl[24], llIllIlIIl[62]));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v143, types: [boolean] */
    public static void aA() {
        if (lIllIllllIIll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIllIIlll[llIllIlIIl[0]];
            C0015b.a(bv);
            if (lIllIllllIlII(bv.size(), llIllIlIIl[1])) {
                System.out.println(llIllIIlll[llIllIlIIl[1]]);
                bt = llIllIlIIl[0];
            }
        }
        if (lIllIllllIlIl(bt ? 1 : 0) && lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
            if (lIllIllllIlIl(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIllllIllI(nearest) && lIllIllllIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIlll[llIllIlIIl[3]];
                    C0000a.a(nearest);
                }
                if (lIllIllllIllI(nearest) && lIllIllllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIllIIlll[llIllIlIIl[4]];
                    if (lIllIllllIlIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIllIlIIl[5]);
                        "".length();
                        Time.sleepTicks(llIllIlIIl[4]);
                        "".length();
                    }
                    if (lIllIllllIIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIllIllllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIllIlIIl[6]);
                            "".length();
                        }
                        if (lIllIllllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIllIlIIl[3]);
                            "".length();
                        }
                        if (lIllIllllIlIl(ao() ? 1 : 0)) {
                            Q();
                            System.out.println(llIllIIlll[llIllIlIIl[7]]);
                            bt = llIllIlIIl[1];
                            return;
                        }
                        if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
                            C0000a.a(llIllIlIIl[8], llIllIlIIl[1]);
                            C0000a.a(llIllIlIIl[9], llIllIlIIl[1]);
                            C0000a.a(llIllIlIIl[10], llIllIlIIl[1]);
                            Bank.withdrawAll(llIllIlIIl[11], Bank.WithdrawMode.ITEM);
                        }
                        if (lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
                            C0000a.a(llIllIlIIl[12], llIllIlIIl[1]);
                            C0000a.a(llIllIlIIl[13], llIllIlIIl[1]);
                            C0000a.a(llIllIlIIl[14], llIllIlIIl[1]);
                            Bank.withdrawAll(llIllIlIIl[15], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(llIllIlIIl[1]);
                            "".length();
                            Bank.withdrawAll(llIllIlIIl[16], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(llIllIlIIl[1]);
                            "".length();
                            C0000a.a(llIllIlIIl[17], llIllIlIIl[1]);
                        }
                        C0000a.a(llIllIlIIl[18], llIllIlIIl[1]);
                        C0000a.a(llIllIlIIl[19], llIllIlIIl[1]);
                        C0000a.a(llIllIlIIl[20], llIllIlIIl[1]);
                        C0000a.a(llIllIlIIl[21], llIllIlIIl[1]);
                        C0000a.a(llIllIlIIl[22], llIllIlIIl[1]);
                        C0000a.a(llIllIlIIl[23], llIllIlIIl[24]);
                        C0000a.a(llIllIlIIl[25], llIllIlIIl[24]);
                        C0000a.a(llIllIlIIl[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (lIllIllllIIll(an() ? 1 : 0)) {
                aB();
                if (lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[27])) {
                    C0026m.al();
                }
                if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[27]) && lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
                    TileItem nearest2 = TileItems.getNearest(tileItem -> {
                        if (lIllIlllllIlI(tileItem.getId(), llIllIlIIl[16]) && lIllIlllllIII(tileItem.getQuantity(), llIllIlIIl[43])) {
                            ?? r0 = llIllIlIIl[1];
                            "".length();
                            return (-" ".length()) == ((100 ^ 80) ^ (161 ^ 145)) ? ((((4 + 129) - (-25)) + 44) ^ (((138 + 68) - 202) + 146)) & (((((245 + 172) - 307) + 144) ^ (((105 + 48) - (-5)) + 4)) ^ (-" ".length())) : r0;
                        }
                        return llIllIlIIl[0];
                    });
                    if (lIllIllllIllI(nearest2)) {
                        nearest2.interact(llIllIIlll[llIllIlIIl[6]]);
                        Time.sleepTicks(llIllIlIIl[7]);
                        "".length();
                    }
                    C0025l.aj();
                }
            }
        }
        if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2]) && lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[28])) {
            C0032s.aV();
            int[] iArr = new int[llIllIlIIl[1]];
            iArr[llIllIlIIl[0]] = llIllIlIIl[29];
            if (lIllIllllIIll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIllIlIIl[1]];
                iArr2[llIllIlIIl[0]] = llIllIlIIl[29];
                Equipment.getFirst(iArr2).interact(llIllIIlll[llIllIlIIl[30]]);
            }
        }
    }

    private static boolean lIllIllllIlll(int i) {
        return i > 0;
    }

    private static boolean lIllIllllIIll(int i) {
        return i != 0;
    }

    private static boolean lIllIllllIlIl(int i) {
        return i == 0;
    }

    private static String lIllIllIllIll(String llllllllllllllllllIIIlIIIIIllIlI, String llllllllllllllllllIIIlIIIIIlIlll) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIIIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIIIIIlIlll.getBytes(StandardCharsets.UTF_8)), llIllIlIIl[35]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIlIIl[3], llllllllllllllllllIIIlIIIIIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlIIIIIllIll) {
            llllllllllllllllllIIIlIIIIIllIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x056d, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x05ef, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0629, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0663, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x069d, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x06d7, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0711, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x074b, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0785, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x07bf, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a9, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e3, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011d, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0157, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0191, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0274, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02ae, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02e8, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0322, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x035c, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0396, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0485, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x04bf, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04f9, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0533, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v164, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v213, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v240, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v289, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2]) && lIllIlllllIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44]) && lIllIlllllIII(Skills.getLevel(Skill.DEFENCE), llIllIlIIl[39])) {
            int[] iArr = new int[llIllIlIIl[1]];
            iArr[llIllIlIIl[0]] = llIllIlIIl[9];
            if (lIllIllllIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIllIlIIl[1]];
                iArr2[llIllIlIIl[0]] = llIllIlIIl[9];
            }
            int[] iArr3 = new int[llIllIlIIl[1]];
            iArr3[llIllIlIIl[0]] = llIllIlIIl[10];
            if (lIllIllllIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIllIlIIl[1]];
                iArr4[llIllIlIIl[0]] = llIllIlIIl[10];
            }
            int[] iArr5 = new int[llIllIlIIl[1]];
            iArr5[llIllIlIIl[0]] = llIllIlIIl[18];
            if (lIllIllllIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIllIlIIl[1]];
                iArr6[llIllIlIIl[0]] = llIllIlIIl[18];
            }
            int[] iArr7 = new int[llIllIlIIl[1]];
            iArr7[llIllIlIIl[0]] = llIllIlIIl[20];
            if (lIllIllllIlIl(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIllIlIIl[1]];
                iArr8[llIllIlIIl[0]] = llIllIlIIl[20];
            }
            int[] iArr9 = new int[llIllIlIIl[1]];
            iArr9[llIllIlIIl[0]] = llIllIlIIl[11];
            if (lIllIllllIlIl(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIllIlIIl[1]];
                iArr10[llIllIlIIl[0]] = llIllIlIIl[11];
            }
            int[] iArr11 = new int[llIllIlIIl[1]];
            iArr11[llIllIlIIl[0]] = llIllIlIIl[8];
            if (lIllIllllIlIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIllIlIIl[1]];
                iArr12[llIllIlIIl[0]] = llIllIlIIl[8];
            }
            int[] iArr13 = new int[llIllIlIIl[1]];
            iArr13[llIllIlIIl[0]] = llIllIlIIl[26];
            if (lIllIllllIIll(Inventory.contains(iArr13) ? 1 : 0)) {
                ?? r0 = llIllIlIIl[1];
                "".length();
                return (-" ".length()) != (-" ".length()) ? ((22 ^ 81) ^ (224 ^ 143)) & (((((157 + 152) - 213) + 92) ^ (((116 + 20) - 120) + 132)) ^ (-" ".length())) : r0;
            }
            return llIllIlIIl[0];
        } else if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2]) && lIllIlllllIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44]) && lIllIllllIlII(Skills.getLevel(Skill.DEFENCE), llIllIlIIl[39])) {
            int[] iArr14 = new int[llIllIlIIl[1]];
            iArr14[llIllIlIIl[0]] = llIllIlIIl[9];
            if (lIllIllllIlIl(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIllIlIIl[1]];
                iArr15[llIllIlIIl[0]] = llIllIlIIl[9];
            }
            int[] iArr16 = new int[llIllIlIIl[1]];
            iArr16[llIllIlIIl[0]] = llIllIlIIl[19];
            if (lIllIllllIlIl(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIllIlIIl[1]];
                iArr17[llIllIlIIl[0]] = llIllIlIIl[19];
            }
            int[] iArr18 = new int[llIllIlIIl[1]];
            iArr18[llIllIlIIl[0]] = llIllIlIIl[18];
            if (lIllIllllIlIl(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llIllIlIIl[1]];
                iArr19[llIllIlIIl[0]] = llIllIlIIl[18];
            }
            int[] iArr20 = new int[llIllIlIIl[1]];
            iArr20[llIllIlIIl[0]] = llIllIlIIl[20];
            if (lIllIllllIlIl(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llIllIlIIl[1]];
                iArr21[llIllIlIIl[0]] = llIllIlIIl[20];
            }
            int[] iArr22 = new int[llIllIlIIl[1]];
            iArr22[llIllIlIIl[0]] = llIllIlIIl[11];
            if (lIllIllllIlIl(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIllIlIIl[1]];
                iArr23[llIllIlIIl[0]] = llIllIlIIl[11];
            }
            int[] iArr24 = new int[llIllIlIIl[1]];
            iArr24[llIllIlIIl[0]] = llIllIlIIl[8];
            if (lIllIllllIlIl(Inventory.contains(iArr24) ? 1 : 0)) {
                int[] iArr25 = new int[llIllIlIIl[1]];
                iArr25[llIllIlIIl[0]] = llIllIlIIl[8];
            }
            int[] iArr26 = new int[llIllIlIIl[1]];
            iArr26[llIllIlIIl[0]] = llIllIlIIl[26];
            if (lIllIllllIIll(Inventory.contains(iArr26) ? 1 : 0)) {
                ?? r02 = llIllIlIIl[1];
                "".length();
                return " ".length() < (((14 ^ 77) ^ (64 ^ 62)) & (((81 ^ 114) ^ (144 ^ 142)) ^ (-" ".length()))) ? ((((94 + 42) - (-48)) + 11) ^ (((90 + 62) - 32) + 8)) & (((((10 + 169) - (-15)) + 27) ^ (((32 + 148) - 43) + 21)) ^ (-" ".length())) : r02;
            }
            return llIllIlIIl[0];
        } else if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[27]) && lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
            int[] iArr27 = new int[llIllIlIIl[1]];
            iArr27[llIllIlIIl[0]] = llIllIlIIl[17];
            if (lIllIllllIlIl(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[llIllIlIIl[1]];
                iArr28[llIllIlIIl[0]] = llIllIlIIl[17];
            }
            int[] iArr29 = new int[llIllIlIIl[1]];
            iArr29[llIllIlIIl[0]] = llIllIlIIl[19];
            if (lIllIllllIlIl(Inventory.contains(iArr29) ? 1 : 0)) {
                int[] iArr30 = new int[llIllIlIIl[1]];
                iArr30[llIllIlIIl[0]] = llIllIlIIl[19];
            }
            int[] iArr31 = new int[llIllIlIIl[1]];
            iArr31[llIllIlIIl[0]] = llIllIlIIl[18];
            if (lIllIllllIlIl(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[llIllIlIIl[1]];
                iArr32[llIllIlIIl[0]] = llIllIlIIl[18];
            }
            int[] iArr33 = new int[llIllIlIIl[1]];
            iArr33[llIllIlIIl[0]] = llIllIlIIl[20];
            if (lIllIllllIlIl(Inventory.contains(iArr33) ? 1 : 0)) {
                int[] iArr34 = new int[llIllIlIIl[1]];
                iArr34[llIllIlIIl[0]] = llIllIlIIl[20];
            }
            int[] iArr35 = new int[llIllIlIIl[1]];
            iArr35[llIllIlIIl[0]] = llIllIlIIl[16];
            if (lIllIllllIlIl(Inventory.contains(iArr35) ? 1 : 0)) {
                int[] iArr36 = new int[llIllIlIIl[1]];
                iArr36[llIllIlIIl[0]] = llIllIlIIl[16];
            }
            int[] iArr37 = new int[llIllIlIIl[1]];
            iArr37[llIllIlIIl[0]] = llIllIlIIl[26];
            if (lIllIllllIIll(Inventory.contains(iArr37) ? 1 : 0)) {
                ?? r03 = llIllIlIIl[1];
                "".length();
                return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
            }
            return llIllIlIIl[0];
        } else {
            int[] iArr38 = new int[llIllIlIIl[1]];
            iArr38[llIllIlIIl[0]] = llIllIlIIl[17];
            if (lIllIllllIlIl(Inventory.contains(iArr38) ? 1 : 0)) {
                int[] iArr39 = new int[llIllIlIIl[1]];
                iArr39[llIllIlIIl[0]] = llIllIlIIl[17];
            }
            int[] iArr40 = new int[llIllIlIIl[1]];
            iArr40[llIllIlIIl[0]] = llIllIlIIl[19];
            if (lIllIllllIlIl(Inventory.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[llIllIlIIl[1]];
                iArr41[llIllIlIIl[0]] = llIllIlIIl[19];
            }
            int[] iArr42 = new int[llIllIlIIl[1]];
            iArr42[llIllIlIIl[0]] = llIllIlIIl[18];
            if (lIllIllllIlIl(Inventory.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[llIllIlIIl[1]];
                iArr43[llIllIlIIl[0]] = llIllIlIIl[18];
            }
            int[] iArr44 = new int[llIllIlIIl[1]];
            iArr44[llIllIlIIl[0]] = llIllIlIIl[20];
            if (lIllIllllIlIl(Inventory.contains(iArr44) ? 1 : 0)) {
                int[] iArr45 = new int[llIllIlIIl[1]];
                iArr45[llIllIlIIl[0]] = llIllIlIIl[20];
            }
            int[] iArr46 = new int[llIllIlIIl[1]];
            iArr46[llIllIlIIl[0]] = llIllIlIIl[15];
            if (lIllIllllIlIl(Inventory.contains(iArr46) ? 1 : 0)) {
                int[] iArr47 = new int[llIllIlIIl[1]];
                iArr47[llIllIlIIl[0]] = llIllIlIIl[15];
            }
            int[] iArr48 = new int[llIllIlIIl[1]];
            iArr48[llIllIlIIl[0]] = llIllIlIIl[12];
            if (lIllIllllIlIl(Inventory.contains(iArr48) ? 1 : 0)) {
                int[] iArr49 = new int[llIllIlIIl[1]];
                iArr49[llIllIlIIl[0]] = llIllIlIIl[12];
            }
            int[] iArr50 = new int[llIllIlIIl[1]];
            iArr50[llIllIlIIl[0]] = llIllIlIIl[13];
            if (lIllIllllIlIl(Inventory.contains(iArr50) ? 1 : 0)) {
                int[] iArr51 = new int[llIllIlIIl[1]];
                iArr51[llIllIlIIl[0]] = llIllIlIIl[13];
            }
            int[] iArr52 = new int[llIllIlIIl[1]];
            iArr52[llIllIlIIl[0]] = llIllIlIIl[14];
            if (lIllIllllIlIl(Inventory.contains(iArr52) ? 1 : 0)) {
                int[] iArr53 = new int[llIllIlIIl[1]];
                iArr53[llIllIlIIl[0]] = llIllIlIIl[14];
            }
            int[] iArr54 = new int[llIllIlIIl[1]];
            iArr54[llIllIlIIl[0]] = llIllIlIIl[16];
            if (lIllIllllIlIl(Inventory.contains(iArr54) ? 1 : 0)) {
                int[] iArr55 = new int[llIllIlIIl[1]];
                iArr55[llIllIlIIl[0]] = llIllIlIIl[16];
            }
            int[] iArr56 = new int[llIllIlIIl[1]];
            iArr56[llIllIlIIl[0]] = llIllIlIIl[26];
            if (lIllIllllIIll(Inventory.contains(iArr56) ? 1 : 0)) {
                ?? r04 = llIllIlIIl[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
            }
            return llIllIlIIl[0];
        }
    }

    private static void lIllIllllIIlI() {
        llIllIlIIl = new int[66];
        llIllIlIIl[0] = ((((12 + 125) - 61) + 83) ^ (((58 + 145) - 183) + 135)) & (((85 ^ 125) ^ (183 ^ 155)) ^ (-" ".length()));
        llIllIlIIl[1] = " ".length();
        llIllIlIIl[2] = (((11 + 13) - 11) + 139) ^ (((149 + 55) - 166) + 132);
        llIllIlIIl[3] = "  ".length();
        llIllIlIIl[4] = "   ".length();
        llIllIlIIl[5] = (-9268) & 14267;
        llIllIlIIl[6] = (242 ^ 179) ^ (192 ^ 132);
        llIllIlIIl[7] = (((36 + 29) - 30) + 127) ^ (((73 + 154) - 180) + 119);
        llIllIlIIl[8] = (-((-18497) & 24181)) & (-16385) & 32567;
        llIllIlIIl[9] = (-12353) & 14845;
        llIllIlIIl[10] = (-5141) & 7639;
        llIllIlIIl[11] = (-15442) & 16251;
        llIllIlIIl[12] = (-28677) & 29517;
        llIllIlIIl[13] = (-30737) & 31579;
        llIllIlIIl[14] = (-25767) & 26615;
        llIllIlIIl[15] = (-((-6930) & 31647)) & (-1025) & 26623;
        llIllIlIIl[16] = (-28753) & 29561;
        llIllIlIIl[17] = (-8217) & 9311;
        llIllIlIIl[18] = (-((-7305) & 15787)) & (-16449) & 26099;
        llIllIlIIl[19] = (-30737) & 31865;
        llIllIlIIl[20] = (-20610) & 31735;
        llIllIlIIl[21] = (-2375) & 4078;
        llIllIlIIl[22] = (-16907) & 29531;
        llIllIlIIl[23] = (-((-14147) & 30691)) & (-8213) & 32765;
        llIllIlIIl[24] = 49 ^ 59;
        llIllIlIIl[25] = (-(26 ^ 28)) & (-24721) & 32735;
        llIllIlIIl[26] = (-7809) & 8187;
        llIllIlIIl[27] = (((6 + 101) - 47) + 158) ^ (((96 + 36) - (-62)) + 2);
        llIllIlIIl[28] = 232 ^ 174;
        llIllIlIIl[29] = (-((-13143) & 32735)) & (-4097) & 24574;
        llIllIlIIl[30] = " ".length() ^ (77 ^ 74);
        llIllIlIIl[31] = (-29761) & 30567;
        llIllIlIIl[32] = (-18700) & 27579;
        llIllIlIIl[33] = (96 ^ 16) ^ (45 ^ 90);
        llIllIlIIl[34] = (30 ^ 3) ^ (63 ^ 54);
        llIllIlIIl[35] = (187 ^ 158) ^ (61 ^ 16);
        llIllIlIIl[36] = 145 ^ 152;
        llIllIlIIl[37] = (-22857) & 31738;
        llIllIlIIl[38] = (((38 + 89) - 33) + 107) ^ (((87 + 4) - 47) + 150);
        llIllIlIIl[39] = 100 ^ 76;
        llIllIlIIl[40] = 84 ^ 88;
        llIllIlIIl[41] = (137 ^ 163) ^ (175 ^ 136);
        llIllIlIIl[42] = 154 ^ 148;
        llIllIlIIl[43] = 174 ^ 161;
        llIllIlIIl[44] = (((((148 + 104) - 186) + 88) + (150 ^ 163)) - (((56 + 82) - 28) + 63)) + ((155 + 62) - 164) + 153;
        llIllIlIIl[45] = 101 ^ 117;
        llIllIlIIl[46] = 58 ^ 43;
        llIllIlIIl[47] = (((53 + 48) - 83) + 163) ^ (((85 + 66) - 139) + 155);
        llIllIlIIl[48] = (((75 + 136) - 66) + 1) ^ (((46 + 109) - 144) + 118);
        llIllIlIIl[49] = (-16709) & 31708;
        llIllIlIIl[50] = (-24615) & 26614;
        llIllIlIIl[51] = (-1283) & 12282;
        llIllIlIIl[52] = (-((-4610) & 29427)) & (-1029) & 32511;
        llIllIlIIl[53] = (-25986) & 61431;
        llIllIlIIl[54] = (-((-57) & 17598)) & (-35) & 24575;
        llIllIlIIl[55] = (-3099) & 20218;
        llIllIlIIl[56] = 39 ^ 4;
        llIllIlIIl[57] = (45 ^ 5) ^ (252 ^ 176);
        llIllIlIIl[58] = (-((-9209) & 28667)) & (-8846) & 28623;
        llIllIlIIl[59] = (-((-3205) & 23941)) & (-18) & 32733;
        llIllIlIIl[60] = (-7188) & 32187;
        llIllIlIIl[61] = (-(((120 + 68) - 120) + 93)) & (-8209) & 16375;
        llIllIlIIl[62] = (-5123) & 6022;
        llIllIlIIl[63] = (((62 + 188) - 129) + 88) ^ (((62 + 123) - 23) + 34);
        llIllIlIIl[64] = (((8 + 30) - 34) + 176) ^ (((134 + 150) - 203) + 81);
        llIllIlIIl[65] = 179 ^ 164;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x036e, code lost:
        if (lIllIllllIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ao() {
        if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2]) && lIllIlllllIlI(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIlIIl[44]) && lIllIlllllIII(Skills.getLevel(Skill.DEFENCE), llIllIlIIl[39])) {
            int[] iArr = new int[llIllIlIIl[1]];
            iArr[llIllIlIIl[0]] = llIllIlIIl[9];
            if (lIllIllllIIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIllIlIIl[1]];
                iArr2[llIllIlIIl[0]] = llIllIlIIl[10];
                if (lIllIllllIIll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIllIlIIl[1]];
                    iArr3[llIllIlIIl[0]] = llIllIlIIl[18];
                    if (lIllIllllIIll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIllIlIIl[1]];
                        iArr4[llIllIlIIl[0]] = llIllIlIIl[20];
                        if (lIllIllllIIll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llIllIlIIl[1]];
                            iArr5[llIllIlIIl[0]] = llIllIlIIl[11];
                            if (lIllIllllIIll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIllIlIIl[1]];
                                iArr6[llIllIlIIl[0]] = llIllIlIIl[8];
                                if (lIllIllllIIll(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llIllIlIIl[1]];
                                    iArr7[llIllIlIIl[0]] = llIllIlIIl[26];
                                    if (lIllIllllIIll(Bank.contains(iArr7) ? 1 : 0)) {
                                        ?? r0 = llIllIlIIl[1];
                                        "".length();
                                        return (-" ".length()) > 0 ? ((43 ^ 64) ^ (31 ^ 108)) & (((12 ^ 82) ^ (41 ^ 111)) ^ (-" ".length())) : r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return llIllIlIIl[0];
        } else if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[27]) && lIllIllllIlII(Skills.getLevel(Skill.RANGED), llIllIlIIl[2])) {
            int[] iArr8 = new int[llIllIlIIl[1]];
            iArr8[llIllIlIIl[0]] = llIllIlIIl[17];
            if (lIllIllllIIll(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIllIlIIl[1]];
                iArr9[llIllIlIIl[0]] = llIllIlIIl[19];
                if (lIllIllllIIll(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIllIlIIl[1]];
                    iArr10[llIllIlIIl[0]] = llIllIlIIl[18];
                    if (lIllIllllIIll(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIllIlIIl[1]];
                        iArr11[llIllIlIIl[0]] = llIllIlIIl[20];
                        if (lIllIllllIIll(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIllIlIIl[1]];
                            iArr12[llIllIlIIl[0]] = llIllIlIIl[16];
                            if (lIllIllllIIll(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIllIlIIl[1]];
                                iArr13[llIllIlIIl[0]] = llIllIlIIl[26];
                                if (lIllIllllIIll(Bank.contains(iArr13) ? 1 : 0)) {
                                    ?? r02 = llIllIlIIl[1];
                                    "".length();
                                    return "  ".length() > "   ".length() ? ((70 ^ 84) ^ (43 ^ 9)) & (((44 ^ 98) ^ (79 ^ 49)) ^ (-" ".length())) : r02;
                                }
                            }
                        }
                    }
                }
            }
            return llIllIlIIl[0];
        } else {
            int[] iArr14 = new int[llIllIlIIl[1]];
            iArr14[llIllIlIIl[0]] = llIllIlIIl[17];
            if (lIllIllllIIll(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIllIlIIl[1]];
                iArr15[llIllIlIIl[0]] = llIllIlIIl[19];
                if (lIllIllllIIll(Bank.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[llIllIlIIl[1]];
                    iArr16[llIllIlIIl[0]] = llIllIlIIl[18];
                    if (lIllIllllIIll(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llIllIlIIl[1]];
                        iArr17[llIllIlIIl[0]] = llIllIlIIl[20];
                        if (lIllIllllIIll(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llIllIlIIl[1]];
                            iArr18[llIllIlIIl[0]] = llIllIlIIl[12];
                            if (lIllIllllIIll(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[llIllIlIIl[1]];
                                iArr19[llIllIlIIl[0]] = llIllIlIIl[23];
                                if (lIllIllllIIll(Bank.contains(iArr19) ? 1 : 0)) {
                                    int[] iArr20 = new int[llIllIlIIl[1]];
                                    iArr20[llIllIlIIl[0]] = llIllIlIIl[13];
                                    if (lIllIllllIIll(Bank.contains(iArr20) ? 1 : 0)) {
                                        int[] iArr21 = new int[llIllIlIIl[1]];
                                        iArr21[llIllIlIIl[0]] = llIllIlIIl[14];
                                        if (lIllIllllIIll(Bank.contains(iArr21) ? 1 : 0)) {
                                            int[] iArr22 = new int[llIllIlIIl[1]];
                                            iArr22[llIllIlIIl[0]] = llIllIlIIl[15];
                                            if (lIllIllllIlIl(Bank.contains(iArr22) ? 1 : 0)) {
                                                int[] iArr23 = new int[llIllIlIIl[1]];
                                                iArr23[llIllIlIIl[0]] = llIllIlIIl[15];
                                            }
                                            int[] iArr24 = new int[llIllIlIIl[1]];
                                            iArr24[llIllIlIIl[0]] = llIllIlIIl[16];
                                            if (lIllIllllIIll(Bank.contains(iArr24) ? 1 : 0)) {
                                                int[] iArr25 = new int[llIllIlIIl[1]];
                                                iArr25[llIllIlIIl[0]] = llIllIlIIl[26];
                                                if (lIllIllllIIll(Bank.contains(iArr25) ? 1 : 0)) {
                                                    ?? r03 = llIllIlIIl[1];
                                                    "".length();
                                                    return (-" ".length()) >= ((((44 + 78) - 10) + 19) ^ (((81 + 64) - 84) + 74)) ? ((73 ^ 12) ^ (83 ^ 29)) & (((228 ^ 145) ^ (21 ^ 107)) ^ (-" ".length())) : r03;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return llIllIlIIl[0];
        }
    }

    private static void lIllIlllIlllI() {
        llIllIIlll = new String[llIllIlIIl[65]];
        llIllIIlll[llIllIlIIl[0]] = lIllIllIllIlI("NDwtBCQRaT0ZLxs6", "vITmJ");
        llIllIIlll[llIllIlIIl[1]] = lIllIllIllIll("CM4rkUQEK2v6oDkPIkXPZhRiI/e90ZJyr+tAw9xQxr2MGhaJo1xWvlxTktv/bYpfyFtiB12sPUM=", "TBasU");
        llIllIIlll[llIllIlIIl[3]] = lIllIllIlllII("WmXMoKhv4qSj4bnn26uqwIsE3eVmxi7a", "qoyfA");
        llIllIIlll[llIllIlIIl[4]] = lIllIllIlllII("TT+AJLhBt6LiVzsE+P1g6/W0/gEFhAmK", "wdIZg");
        llIllIIlll[llIllIlIIl[7]] = lIllIllIlllII("e4k4vK/UXpMEYB7Fi6a57242wK8bZmDS8VyTl4HOaQJqmKcf28soLZ9X8dNh8Fc4", "xQSAl");
        llIllIIlll[llIllIlIIl[6]] = lIllIllIlllII("SStIMXJ2Jy8=", "qcAAX");
        llIllIIlll[llIllIlIIl[30]] = lIllIllIllIll("JEvjjVKTXu8=", "uXsFW");
        llIllIIlll[llIllIlIIl[33]] = lIllIllIllIlI("GScpNBM=", "NNLXw");
        llIllIIlll[llIllIlIIl[35]] = lIllIllIlllII("TayQXi+rSr0=", "cSALI");
        llIllIIlll[llIllIlIIl[36]] = lIllIllIllIlI("NQYyByc=", "boWkC");
        llIllIIlll[llIllIlIIl[24]] = lIllIllIlllII("mcz/5ZBbFE8=", "abTfJ");
        llIllIIlll[llIllIlIIl[38]] = lIllIllIlllII("SVsLP9negpo=", "PDfYh");
        llIllIIlll[llIllIlIIl[40]] = lIllIllIllIll("rxehW0MmNPA=", "IpXZh");
        llIllIIlll[llIllIlIIl[41]] = lIllIllIlllII("5QZcHFqpvtk=", "IFAKS");
        llIllIIlll[llIllIlIIl[42]] = lIllIllIllIlI("MQ42Pw==", "fkWMz");
        llIllIIlll[llIllIlIIl[43]] = lIllIllIllIll("gyvBgiTjPAk=", "KQhyx");
        llIllIIlll[llIllIlIIl[45]] = lIllIllIlllII("XgXrazZxN7A=", "cvgjM");
        llIllIIlll[llIllIlIIl[46]] = lIllIllIllIlI("AioqBg==", "UOKta");
        llIllIIlll[llIllIlIIl[47]] = lIllIllIllIll("6igKj9InF3A=", "KBpHP");
        llIllIIlll[llIllIlIIl[48]] = lIllIllIllIll("v7OtAZ7pvjc=", "oqdgH");
        llIllIIlll[llIllIlIIl[34]] = lIllIllIlllII("b3uYjJm9QyAjwTvdqzhgPA==", "sGWXm");
        llIllIIlll[llIllIlIIl[63]] = lIllIllIllIll("j8ll3r1R8vplepCIRI0dQB8hM1Pcqc6B", "UOnSk");
        llIllIIlll[llIllIlIIl[64]] = lIllIllIlllII("vKwtUQAaNs0=", "VbIkQ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIlllllIII(Skills.getLevel(Skill.RANGED), llIllIlIIl[28])) {
            ?? r0 = llIllIlIIl[1];
            "".length();
            return (-" ".length()) >= "   ".length() ? ((((47 + 125) - 72) + 58) ^ (((138 + 55) - 186) + 161)) & (((126 ^ 69) ^ (79 ^ 66)) ^ (-" ".length())) : r0;
        }
        return llIllIlIIl[0];
    }
}
