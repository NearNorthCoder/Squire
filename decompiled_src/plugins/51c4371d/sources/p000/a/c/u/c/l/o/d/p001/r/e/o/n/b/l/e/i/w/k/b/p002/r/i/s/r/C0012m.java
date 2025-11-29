package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.m  reason: invalid package and case insensitive filesystem */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/m.class */
public class C0012m implements F {
    private static /* synthetic */ int[] lIIIIIIll;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] lIIIIIIlI;
    public static /* synthetic */ List<C0003d> bB;

    private static boolean llIlIlllIlI(int i, int i2) {
        return i >= i2;
    }

    private static String llIlIllIIII(String lIIlIllIIIlIlII, String lIIlIllIIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIllIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIllIIIlIllI = Cipher.getInstance("Blowfish");
            lIIlIllIIIlIllI.init(lIIIIIIll[2], secretKeySpec);
            return new String(lIIlIllIIIlIllI.doFinal(Base64.getDecoder().decode(lIIlIllIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIllIIIlIlIl) {
            lIIlIllIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlllIIl(int i) {
        return i > 0;
    }

    private static void llIlIllIIll() {
        lIIIIIIlI = new String[lIIIIIIll[62]];
        lIIIIIIlI[lIIIIIIll[0]] = llIlIllIIII("s0oF7QI3rW79zOyT5s/Hrg==", "kKpvv");
        lIIIIIIlI[lIIIIIIll[1]] = llIlIllIIIl("CwIvDiolDiVHOzgSKAk+bQI1AjQ+R2EULiQfIg8wIwxhBTguAGETNm0GIAAwLks1FTgkBSgJPg==", "MkAgY");
        lIIIIIIlI[lIIIIIIll[2]] = llIlIllIIlI("0LilH4HrJpkHFRS/XXUtEBzBUuWFtjWm", "KVTzA");
        lIIIIIIlI[lIIIIIIll[3]] = llIlIllIIlI("k5GhaH9ZOmmaYjcfKOfe7200+q4Ph7Sf", "rRUke");
        lIIIIIIlI[lIIIIIIll[6]] = llIlIllIIII("q83qZZXTZ/3qWyO+XGokTsyGElJm2CBC1wOzQV8vE8cWIy8fbWbA8uv2FgTZH5Rd", "FInNq");
        lIIIIIIlI[lIIIIIIll[5]] = llIlIllIIIl("HScEAw==", "IFofg");
        lIIIIIIlI[lIIIIIIll[30]] = llIlIllIIlI("cnG0pQ6dW7M=", "uHUIQ");
        lIIIIIIlI[lIIIIIIll[32]] = llIlIllIIlI("D8IgQHO+K0M=", "oRooY");
        lIIIIIIlI[lIIIIIIll[33]] = llIlIllIIlI("tiIOfxTEqyc=", "ZpOiF");
        lIIIIIIlI[lIIIIIIll[35]] = llIlIllIIII("H1qaHp7N2LQ=", "LZdxg");
        lIIIIIIlI[lIIIIIIll[24]] = llIlIllIIIl("MSc0NBM=", "fNQXw");
        lIIIIIIlI[lIIIIIIll[37]] = llIlIllIIIl("NgsvMA==", "anNBt");
        lIIIIIIlI[lIIIIIIll[38]] = llIlIllIIIl("LQEVNw==", "zdtEw");
        lIIIIIIlI[lIIIIIIll[39]] = llIlIllIIlI("EGAUDmVGlCc=", "KINbo");
        lIIIIIIlI[lIIIIIIll[40]] = llIlIllIIII("TRshpKJMDg4=", "WvEzD");
        lIIIIIIlI[lIIIIIIll[42]] = llIlIllIIlI("Ks5q46fbIhI=", "JZzZf");
        lIIIIIIlI[lIIIIIIll[43]] = llIlIllIIlI("hG7BvPEzgpw=", "apVWx");
        lIIIIIIlI[lIIIIIIll[44]] = llIlIllIIII("firF1f5PrUU=", "HMMUR");
        lIIIIIIlI[lIIIIIIll[45]] = llIlIllIIlI("XPwW7MXYUTc=", "pGvoE");
        lIIIIIIlI[lIIIIIIll[60]] = llIlIllIIIl("MTQdAxNDIQEFHw08HQM=", "cUsdv");
        lIIIIIIlI[lIIIIIIll[31]] = llIlIllIIII("SZ+K7hGvqTgRqwVFOBfRSbLYCfYPSSBJ", "JRuFs");
        lIIIIIIlI[lIIIIIIll[61]] = llIlIllIIlI("jfO2t8nPhkk=", "uzNqn");
    }

    private static boolean llIlIlllIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains((v0) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
            return l(v0);
        }) ? 1 : 0) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ar() {
        int[] iArr = new int[lIIIIIIll[1]];
        iArr[lIIIIIIll[0]] = lIIIIIIll[28];
        if (llIlIllIlll(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIIIIll[1]];
            iArr2[lIIIIIIll[0]] = lIIIIIIll[29];
            if (llIlIllIlll(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIIIIll[1]];
                iArr3[lIIIIIIll[0]] = lIIIIIIll[16];
                if (llIlIllIlll(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIIIIIll[1]];
                    iArr4[lIIIIIIll[0]] = lIIIIIIll[11];
                    if (llIlIllIlll(Equipment.contains(iArr4) ? 1 : 0)) {
                    }
                }
            }
        }
        if (llIlIlllIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (llIlIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIll[27])) {
            int[] iArr5 = new int[lIIIIIIll[1]];
            iArr5[lIIIIIIll[0]] = lIIIIIIll[28];
            if (llIlIllIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIIIIIll[1]];
                iArr6[lIIIIIIll[0]] = lIIIIIIll[28];
                Inventory.getFirst(iArr6).interact(lIIIIIIlI[lIIIIIIll[30]]);
            }
            int[] iArr7 = new int[lIIIIIIll[1]];
            iArr7[lIIIIIIll[0]] = lIIIIIIll[12];
            if (llIlIllIlIl(Inventory.contains(iArr7) ? 1 : 0) && llIlIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIll[5])) {
                C0004e.l(lIIIIIIll[12]);
            }
            int[] iArr8 = new int[lIIIIIIll[1]];
            iArr8[lIIIIIIll[0]] = lIIIIIIll[13];
            if (llIlIllIlIl(Inventory.contains(iArr8) ? 1 : 0) && llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[5]) && llIlIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIll[31])) {
                C0004e.l(lIIIIIIll[13]);
            }
            int[] iArr9 = new int[lIIIIIIll[1]];
            iArr9[lIIIIIIll[0]] = lIIIIIIll[14];
            if (llIlIllIlIl(Inventory.contains(iArr9) ? 1 : 0) && llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[31])) {
                C0004e.l(lIIIIIIll[14]);
            }
            int[] iArr10 = new int[lIIIIIIll[1]];
            iArr10[lIIIIIIll[0]] = lIIIIIIll[15];
            if (llIlIllIlIl(Inventory.contains(iArr10) ? 1 : 0)) {
                C0004e.l(lIIIIIIll[15]);
            }
        }
        if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[31])) {
            int[] iArr11 = new int[lIIIIIIll[1]];
            iArr11[lIIIIIIll[0]] = lIIIIIIll[18];
            if (llIlIllIlIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIIIIIll[1]];
                iArr12[lIIIIIIll[0]] = lIIIIIIll[18];
                Inventory.getFirst(iArr12).interact(lIIIIIIlI[lIIIIIIll[32]]);
            }
        }
        if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[27])) {
            int[] iArr13 = new int[lIIIIIIll[1]];
            iArr13[lIIIIIIll[0]] = lIIIIIIll[29];
            if (llIlIllIlIl(Inventory.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lIIIIIIll[1]];
                iArr14[lIIIIIIll[0]] = lIIIIIIll[29];
                Inventory.getFirst(iArr14).interact(lIIIIIIlI[lIIIIIIll[33]]);
            }
            int[] iArr15 = new int[lIIIIIIll[1]];
            iArr15[lIIIIIIll[0]] = lIIIIIIll[34];
            if (llIlIllIlIl(Inventory.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIIIIIll[1]];
                iArr16[lIIIIIIll[0]] = lIIIIIIll[34];
                Inventory.getFirst(iArr16).interact(lIIIIIIlI[lIIIIIIll[35]]);
            }
            int[] iArr17 = new int[lIIIIIIll[1]];
            iArr17[lIIIIIIll[0]] = lIIIIIIll[16];
            if (llIlIllIlIl(Inventory.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[lIIIIIIll[1]];
                iArr18[lIIIIIIll[0]] = lIIIIIIll[16];
                Inventory.getFirst(iArr18).interact(lIIIIIIlI[lIIIIIIll[24]]);
            }
        }
        if (llIlIllIllI(Skills.getLevel(Skill.DEFENCE), lIIIIIIll[36])) {
            int[] iArr19 = new int[lIIIIIIll[1]];
            iArr19[lIIIIIIll[0]] = lIIIIIIll[19];
            if (llIlIllIlIl(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIIIIIIll[1]];
                iArr20[lIIIIIIll[0]] = lIIIIIIll[19];
                Inventory.getFirst(iArr20).interact(lIIIIIIlI[lIIIIIIll[37]]);
            }
        }
        if (llIlIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7])) {
            int[] iArr21 = new int[lIIIIIIll[1]];
            iArr21[lIIIIIIll[0]] = lIIIIIIll[17];
            if (llIlIllIlIl(Inventory.contains(iArr21) ? 1 : 0)) {
                int[] iArr22 = new int[lIIIIIIll[1]];
                iArr22[lIIIIIIll[0]] = lIIIIIIll[17];
                Inventory.getFirst(iArr22).interact(lIIIIIIlI[lIIIIIIll[38]]);
            }
        }
        int[] iArr23 = new int[lIIIIIIll[1]];
        iArr23[lIIIIIIll[0]] = lIIIIIIll[20];
        if (llIlIllIlIl(Inventory.contains(iArr23) ? 1 : 0)) {
            int[] iArr24 = new int[lIIIIIIll[1]];
            iArr24[lIIIIIIll[0]] = lIIIIIIll[20];
            Inventory.getFirst(iArr24).interact(lIIIIIIlI[lIIIIIIll[39]]);
        }
        int[] iArr25 = new int[lIIIIIIll[1]];
        iArr25[lIIIIIIll[0]] = lIIIIIIll[21];
        if (llIlIllIlIl(Inventory.contains(iArr25) ? 1 : 0)) {
            int[] iArr26 = new int[lIIIIIIll[1]];
            iArr26[lIIIIIIll[0]] = lIIIIIIll[21];
            Inventory.getFirst(iArr26).interact(lIIIIIIlI[lIIIIIIll[40]]);
        }
        if (llIlIllllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41])) {
            int[] iArr27 = new int[lIIIIIIll[1]];
            iArr27[lIIIIIIll[0]] = lIIIIIIll[8];
            if (llIlIllIlIl(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[lIIIIIIll[1]];
                iArr28[lIIIIIIll[0]] = lIIIIIIll[8];
                if (llIlIllIlll(Equipment.contains(iArr28) ? 1 : 0)) {
                    int[] iArr29 = new int[lIIIIIIll[1]];
                    iArr29[lIIIIIIll[0]] = lIIIIIIll[8];
                    Inventory.getFirst(iArr29).interact(lIIIIIIlI[lIIIIIIll[42]]);
                }
            }
            if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7])) {
                int[] iArr30 = new int[lIIIIIIll[1]];
                iArr30[lIIIIIIll[0]] = lIIIIIIll[9];
                if (llIlIllIlIl(Inventory.contains(iArr30) ? 1 : 0)) {
                    int[] iArr31 = new int[lIIIIIIll[1]];
                    iArr31[lIIIIIIll[0]] = lIIIIIIll[9];
                    if (llIlIllIlll(Equipment.contains(iArr31) ? 1 : 0)) {
                        int[] iArr32 = new int[lIIIIIIll[1]];
                        iArr32[lIIIIIIll[0]] = lIIIIIIll[9];
                        Inventory.getFirst(iArr32).interact(lIIIIIIlI[lIIIIIIll[43]]);
                    }
                }
            }
            if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7]) && llIlIlllIlI(Skills.getLevel(Skill.DEFENCE), lIIIIIIll[36])) {
                int[] iArr33 = new int[lIIIIIIll[1]];
                iArr33[lIIIIIIll[0]] = lIIIIIIll[10];
                if (llIlIllIlIl(Inventory.contains(iArr33) ? 1 : 0)) {
                    int[] iArr34 = new int[lIIIIIIll[1]];
                    iArr34[lIIIIIIll[0]] = lIIIIIIll[10];
                    if (llIlIllIlll(Equipment.contains(iArr34) ? 1 : 0)) {
                        int[] iArr35 = new int[lIIIIIIll[1]];
                        iArr35[lIIIIIIll[0]] = lIIIIIIll[10];
                        Inventory.getFirst(iArr35).interact(lIIIIIIlI[lIIIIIIll[44]]);
                    }
                }
            }
            if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7])) {
                int[] iArr36 = new int[lIIIIIIll[1]];
                iArr36[lIIIIIIll[0]] = lIIIIIIll[11];
                if (llIlIllIlIl(Inventory.contains(iArr36) ? 1 : 0)) {
                    int[] iArr37 = new int[lIIIIIIll[1]];
                    iArr37[lIIIIIIll[0]] = lIIIIIIll[11];
                    Inventory.getFirst(iArr37).interact(lIIIIIIlI[lIIIIIIll[45]]);
                }
            }
        }
    }

    private static String llIlIllIIlI(String lIIlIlIlllIllll, String lIIlIlIlllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIlIlIlllIlllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIll[33]), "DES");
            Cipher lIIlIlIllllIIIl = Cipher.getInstance("DES");
            lIIlIlIllllIIIl.init(lIIIIIIll[2], secretKeySpec);
            return new String(lIIlIlIllllIIIl.doFinal(Base64.getDecoder().decode(lIIlIlIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIlIllllIIII) {
            lIIlIlIllllIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public static void aq() {
        if (llIlIllIlIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIIIIIIlI[lIIIIIIll[0]];
            C0001b.a(bB);
            if (llIlIllIllI(bB.size(), lIIIIIIll[1])) {
                System.out.println(lIIIIIIlI[lIIIIIIll[1]]);
                bz = lIIIIIIll[0];
            }
        }
        if (llIlIllIlll(bz ? 1 : 0)) {
            if (llIlIllIlll(ac() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIlllIII(nearest) && llIlIllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIlI[lIIIIIIll[2]];
                    C0000a.a(nearest);
                }
                if (llIlIlllIII(nearest) && llIlIllIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIIIIIIlI[lIIIIIIll[3]];
                    if (llIlIllIlll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIIll[4]);
                        "".length();
                        Time.sleepTicks(lIIIIIIll[3]);
                        "".length();
                    }
                    if (llIlIllIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIlllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIIll[5]);
                            "".length();
                        }
                        if (llIlIlllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIIll[2]);
                            "".length();
                        }
                        if (llIlIllIlll(ad() ? 1 : 0)) {
                            ag();
                            System.out.println(lIIIIIIlI[lIIIIIIll[6]]);
                            bz = lIIIIIIll[1];
                            return;
                        }
                        if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7])) {
                            C0000a.a(lIIIIIIll[8], lIIIIIIll[1]);
                            C0000a.a(lIIIIIIll[9], lIIIIIIll[1]);
                            C0000a.a(lIIIIIIll[10], lIIIIIIll[1]);
                            Bank.withdrawAll(lIIIIIIll[11], Bank.WithdrawMode.ITEM);
                        }
                        if (llIlIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7])) {
                            C0000a.a(lIIIIIIll[12], lIIIIIIll[1]);
                            C0000a.a(lIIIIIIll[13], lIIIIIIll[1]);
                            C0000a.a(lIIIIIIll[14], lIIIIIIll[1]);
                            Bank.withdrawAll(lIIIIIIll[15], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIIIIIll[1]);
                            "".length();
                            Bank.withdrawAll(lIIIIIIll[16], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIIIIIll[1]);
                            "".length();
                            C0000a.a(lIIIIIIll[17], lIIIIIIll[1]);
                        }
                        C0000a.a(lIIIIIIll[18], lIIIIIIll[1]);
                        C0000a.a(lIIIIIIll[19], lIIIIIIll[1]);
                        C0000a.a(lIIIIIIll[20], lIIIIIIll[1]);
                        C0000a.a(lIIIIIIll[21], lIIIIIIll[1]);
                        C0000a.a(lIIIIIIll[22], lIIIIIIll[1]);
                        C0000a.a(lIIIIIIll[23], lIIIIIIll[24]);
                        C0000a.a(lIIIIIIll[25], lIIIIIIll[24]);
                        C0000a.a(lIIIIIIll[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (llIlIllIlIl(ac() ? 1 : 0)) {
                ar();
                if (llIlIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIll[27])) {
                    C0011l.aa();
                }
                if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[27])) {
                    TileItem nearest2 = TileItems.getNearest(tileItem -> {
                        if (llIlIllllII(tileItem.getId(), lIIIIIIll[16]) && llIlIlllIlI(tileItem.getQuantity(), lIIIIIIll[42])) {
                            ?? r0 = lIIIIIIll[1];
                            "".length();
                            return (true ^ true) & ((true ^ true) ^ true) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                        }
                        return lIIIIIIll[0];
                    });
                    if (llIlIlllIII(nearest2)) {
                        nearest2.interact(lIIIIIIlI[lIIIIIIll[5]]);
                        Time.sleepTicks(lIIIIIIll[6]);
                        "".length();
                    }
                    C0010k.Y();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0354, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L72;
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
    private static boolean ad() {
        if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7]) && llIlIllllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41]) && llIlIlllIlI(Skills.getLevel(Skill.DEFENCE), lIIIIIIll[36])) {
            int[] iArr = new int[lIIIIIIll[1]];
            iArr[lIIIIIIll[0]] = lIIIIIIll[9];
            if (llIlIllIlIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIIIll[1]];
                iArr2[lIIIIIIll[0]] = lIIIIIIll[10];
                if (llIlIllIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIIIIIll[1]];
                    iArr3[lIIIIIIll[0]] = lIIIIIIll[18];
                    if (llIlIllIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIIIIIll[1]];
                        iArr4[lIIIIIIll[0]] = lIIIIIIll[20];
                        if (llIlIllIlIl(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIIIIIll[1]];
                            iArr5[lIIIIIIll[0]] = lIIIIIIll[11];
                            if (llIlIllIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIIIIIll[1]];
                                iArr6[lIIIIIIll[0]] = lIIIIIIll[8];
                                if (llIlIllIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIIIIIll[1]];
                                    iArr7[lIIIIIIll[0]] = lIIIIIIll[26];
                                    if (llIlIllIlIl(Bank.contains(iArr7) ? 1 : 0)) {
                                        ?? r0 = lIIIIIIll[1];
                                        "".length();
                                        return "   ".length() <= 0 ? ((4 ^ 76) ^ (39 ^ 101)) & (((70 ^ 3) ^ (92 ^ 19)) ^ (-" ".length())) : r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lIIIIIIll[0];
        } else if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[27]) && llIlIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7])) {
            int[] iArr8 = new int[lIIIIIIll[1]];
            iArr8[lIIIIIIll[0]] = lIIIIIIll[17];
            if (llIlIllIlIl(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIIIIll[1]];
                iArr9[lIIIIIIll[0]] = lIIIIIIll[19];
                if (llIlIllIlIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIIIIll[1]];
                    iArr10[lIIIIIIll[0]] = lIIIIIIll[18];
                    if (llIlIllIlIl(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIIIIll[1]];
                        iArr11[lIIIIIIll[0]] = lIIIIIIll[20];
                        if (llIlIllIlIl(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIIIIIll[1]];
                            iArr12[lIIIIIIll[0]] = lIIIIIIll[16];
                            if (llIlIllIlIl(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIIIIIll[1]];
                                iArr13[lIIIIIIll[0]] = lIIIIIIll[26];
                                if (llIlIllIlIl(Bank.contains(iArr13) ? 1 : 0)) {
                                    ?? r02 = lIIIIIIll[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                                }
                            }
                        }
                    }
                }
            }
            return lIIIIIIll[0];
        } else {
            int[] iArr14 = new int[lIIIIIIll[1]];
            iArr14[lIIIIIIll[0]] = lIIIIIIll[17];
            if (llIlIllIlIl(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIIIIll[1]];
                iArr15[lIIIIIIll[0]] = lIIIIIIll[19];
                if (llIlIllIlIl(Bank.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lIIIIIIll[1]];
                    iArr16[lIIIIIIll[0]] = lIIIIIIll[18];
                    if (llIlIllIlIl(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIIIIIll[1]];
                        iArr17[lIIIIIIll[0]] = lIIIIIIll[20];
                        if (llIlIllIlIl(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIIIIIll[1]];
                            iArr18[lIIIIIIll[0]] = lIIIIIIll[12];
                            if (llIlIllIlIl(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[lIIIIIIll[1]];
                                iArr19[lIIIIIIll[0]] = lIIIIIIll[23];
                                if (llIlIllIlIl(Bank.contains(iArr19) ? 1 : 0)) {
                                    int[] iArr20 = new int[lIIIIIIll[1]];
                                    iArr20[lIIIIIIll[0]] = lIIIIIIll[13];
                                    if (llIlIllIlIl(Bank.contains(iArr20) ? 1 : 0)) {
                                        int[] iArr21 = new int[lIIIIIIll[1]];
                                        iArr21[lIIIIIIll[0]] = lIIIIIIll[14];
                                        if (llIlIllIlIl(Bank.contains(iArr21) ? 1 : 0)) {
                                            int[] iArr22 = new int[lIIIIIIll[1]];
                                            iArr22[lIIIIIIll[0]] = lIIIIIIll[15];
                                            if (llIlIllIlll(Bank.contains(iArr22) ? 1 : 0)) {
                                                int[] iArr23 = new int[lIIIIIIll[1]];
                                                iArr23[lIIIIIIll[0]] = lIIIIIIll[15];
                                            }
                                            int[] iArr24 = new int[lIIIIIIll[1]];
                                            iArr24[lIIIIIIll[0]] = lIIIIIIll[16];
                                            if (llIlIllIlIl(Bank.contains(iArr24) ? 1 : 0)) {
                                                int[] iArr25 = new int[lIIIIIIll[1]];
                                                iArr25[lIIIIIIll[0]] = lIIIIIIll[26];
                                                if (llIlIllIlIl(Bank.contains(iArr25) ? 1 : 0)) {
                                                    ?? r03 = lIIIIIIll[1];
                                                    "".length();
                                                    return (-"   ".length()) > 0 ? ((107 ^ 23) ^ (109 ^ 68)) & (((((38 + 52) - (-53)) + 94) ^ (((175 + 131) - 283) + 161)) ^ (-" ".length())) : r03;
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
            return lIIIIIIll[0];
        }
    }

    private static String llIlIllIIIl(String lIIlIllIIIIIlII, String lIIlIllIIIIIIll) {
        String str = new String(Base64.getDecoder().decode(lIIlIllIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIIlIllIIIIIIll.toCharArray();
        int lIIlIllIIIIIIII = lIIIIIIll[0];
        char[] charArray2 = str.toCharArray();
        int lIIlIlIlllllIIl = charArray2.length;
        int i = lIIIIIIll[0];
        while (llIlIllIllI(i, lIIlIlIlllllIIl)) {
            sb.append((char) (charArray2[i] ^ charArray[lIIlIllIIIIIIII % charArray.length]));
            "".length();
            lIIlIllIIIIIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIlllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0511, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x05b1, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x05eb, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0625, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x065f, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0699, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x06d3, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x070d, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0747, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0781, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e4, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011e, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0158, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0192, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0246, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0280, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02ba, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02f4, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x032e, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0368, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0429, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0463, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x049d, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04d7, code lost:
        if (llIlIllIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L102;
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
    private static boolean ac() {
        if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7]) && llIlIllllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41]) && llIlIlllIlI(Skills.getLevel(Skill.DEFENCE), lIIIIIIll[36])) {
            int[] iArr = new int[lIIIIIIll[1]];
            iArr[lIIIIIIll[0]] = lIIIIIIll[9];
            if (llIlIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIIIIll[1]];
                iArr2[lIIIIIIll[0]] = lIIIIIIll[9];
            }
            int[] iArr3 = new int[lIIIIIIll[1]];
            iArr3[lIIIIIIll[0]] = lIIIIIIll[10];
            if (llIlIllIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIIIIIll[1]];
                iArr4[lIIIIIIll[0]] = lIIIIIIll[10];
            }
            int[] iArr5 = new int[lIIIIIIll[1]];
            iArr5[lIIIIIIll[0]] = lIIIIIIll[18];
            if (llIlIllIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIIIIIll[1]];
                iArr6[lIIIIIIll[0]] = lIIIIIIll[18];
            }
            int[] iArr7 = new int[lIIIIIIll[1]];
            iArr7[lIIIIIIll[0]] = lIIIIIIll[20];
            if (llIlIllIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIIIIll[1]];
                iArr8[lIIIIIIll[0]] = lIIIIIIll[20];
            }
            int[] iArr9 = new int[lIIIIIIll[1]];
            iArr9[lIIIIIIll[0]] = lIIIIIIll[11];
            if (llIlIllIlll(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIIIIIIll[1]];
                iArr10[lIIIIIIll[0]] = lIIIIIIll[11];
            }
            int[] iArr11 = new int[lIIIIIIll[1]];
            iArr11[lIIIIIIll[0]] = lIIIIIIll[8];
            if (llIlIllIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIIIIIll[1]];
                iArr12[lIIIIIIll[0]] = lIIIIIIll[8];
            }
            int[] iArr13 = new int[lIIIIIIll[1]];
            iArr13[lIIIIIIll[0]] = lIIIIIIll[26];
            if (llIlIllIlIl(Inventory.contains(iArr13) ? 1 : 0)) {
                ?? r0 = lIIIIIIll[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIIIIIll[0];
        } else if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7]) && llIlIllllII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIIIIIll[41]) && llIlIllIllI(Skills.getLevel(Skill.DEFENCE), lIIIIIIll[36])) {
            int[] iArr14 = new int[lIIIIIIll[1]];
            iArr14[lIIIIIIll[0]] = lIIIIIIll[9];
            if (llIlIllIlll(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIIIIIll[1]];
                iArr15[lIIIIIIll[0]] = lIIIIIIll[9];
            }
            int[] iArr16 = new int[lIIIIIIll[1]];
            iArr16[lIIIIIIll[0]] = lIIIIIIll[19];
            if (llIlIllIlll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIIIIIll[1]];
                iArr17[lIIIIIIll[0]] = lIIIIIIll[19];
            }
            int[] iArr18 = new int[lIIIIIIll[1]];
            iArr18[lIIIIIIll[0]] = lIIIIIIll[18];
            if (llIlIllIlll(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIIIIIll[1]];
                iArr19[lIIIIIIll[0]] = lIIIIIIll[18];
            }
            int[] iArr20 = new int[lIIIIIIll[1]];
            iArr20[lIIIIIIll[0]] = lIIIIIIll[20];
            if (llIlIllIlll(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIIIIIll[1]];
                iArr21[lIIIIIIll[0]] = lIIIIIIll[20];
            }
            int[] iArr22 = new int[lIIIIIIll[1]];
            iArr22[lIIIIIIll[0]] = lIIIIIIll[11];
            if (llIlIllIlll(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIIIIIIll[1]];
                iArr23[lIIIIIIll[0]] = lIIIIIIll[11];
            }
            int[] iArr24 = new int[lIIIIIIll[1]];
            iArr24[lIIIIIIll[0]] = lIIIIIIll[8];
            if (llIlIllIlll(Inventory.contains(iArr24) ? 1 : 0)) {
                int[] iArr25 = new int[lIIIIIIll[1]];
                iArr25[lIIIIIIll[0]] = lIIIIIIll[8];
            }
            int[] iArr26 = new int[lIIIIIIll[1]];
            iArr26[lIIIIIIll[0]] = lIIIIIIll[26];
            if (llIlIllIlIl(Inventory.contains(iArr26) ? 1 : 0)) {
                ?? r02 = lIIIIIIll[1];
                "".length();
                return (-" ".length()) > (-" ".length()) ? ((145 ^ 140) ^ (190 ^ 187)) & (((95 ^ 107) ^ (1 ^ 45)) ^ (-" ".length())) : r02;
            }
            return lIIIIIIll[0];
        } else if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[27]) && llIlIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7])) {
            int[] iArr27 = new int[lIIIIIIll[1]];
            iArr27[lIIIIIIll[0]] = lIIIIIIll[17];
            if (llIlIllIlll(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[lIIIIIIll[1]];
                iArr28[lIIIIIIll[0]] = lIIIIIIll[17];
            }
            int[] iArr29 = new int[lIIIIIIll[1]];
            iArr29[lIIIIIIll[0]] = lIIIIIIll[19];
            if (llIlIllIlll(Inventory.contains(iArr29) ? 1 : 0)) {
                int[] iArr30 = new int[lIIIIIIll[1]];
                iArr30[lIIIIIIll[0]] = lIIIIIIll[19];
            }
            int[] iArr31 = new int[lIIIIIIll[1]];
            iArr31[lIIIIIIll[0]] = lIIIIIIll[18];
            if (llIlIllIlll(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lIIIIIIll[1]];
                iArr32[lIIIIIIll[0]] = lIIIIIIll[18];
            }
            int[] iArr33 = new int[lIIIIIIll[1]];
            iArr33[lIIIIIIll[0]] = lIIIIIIll[20];
            if (llIlIllIlll(Inventory.contains(iArr33) ? 1 : 0)) {
                int[] iArr34 = new int[lIIIIIIll[1]];
                iArr34[lIIIIIIll[0]] = lIIIIIIll[20];
            }
            int[] iArr35 = new int[lIIIIIIll[1]];
            iArr35[lIIIIIIll[0]] = lIIIIIIll[16];
            if (llIlIllIlll(Inventory.contains(iArr35) ? 1 : 0)) {
                int[] iArr36 = new int[lIIIIIIll[1]];
                iArr36[lIIIIIIll[0]] = lIIIIIIll[16];
            }
            int[] iArr37 = new int[lIIIIIIll[1]];
            iArr37[lIIIIIIll[0]] = lIIIIIIll[26];
            if (llIlIllIlIl(Inventory.contains(iArr37) ? 1 : 0)) {
                ?? r03 = lIIIIIIll[1];
                "".length();
                return " ".length() <= 0 ? ("  ".length() ^ (77 ^ 12)) & (((((36 + 189) - 6) + 14) ^ (((121 + 85) - 67) + 31)) ^ (-" ".length())) : r03;
            }
            return lIIIIIIll[0];
        } else {
            int[] iArr38 = new int[lIIIIIIll[1]];
            iArr38[lIIIIIIll[0]] = lIIIIIIll[17];
            if (llIlIllIlll(Inventory.contains(iArr38) ? 1 : 0)) {
                int[] iArr39 = new int[lIIIIIIll[1]];
                iArr39[lIIIIIIll[0]] = lIIIIIIll[17];
            }
            int[] iArr40 = new int[lIIIIIIll[1]];
            iArr40[lIIIIIIll[0]] = lIIIIIIll[19];
            if (llIlIllIlll(Inventory.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lIIIIIIll[1]];
                iArr41[lIIIIIIll[0]] = lIIIIIIll[19];
            }
            int[] iArr42 = new int[lIIIIIIll[1]];
            iArr42[lIIIIIIll[0]] = lIIIIIIll[18];
            if (llIlIllIlll(Inventory.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[lIIIIIIll[1]];
                iArr43[lIIIIIIll[0]] = lIIIIIIll[18];
            }
            int[] iArr44 = new int[lIIIIIIll[1]];
            iArr44[lIIIIIIll[0]] = lIIIIIIll[20];
            if (llIlIllIlll(Inventory.contains(iArr44) ? 1 : 0)) {
                int[] iArr45 = new int[lIIIIIIll[1]];
                iArr45[lIIIIIIll[0]] = lIIIIIIll[20];
            }
            int[] iArr46 = new int[lIIIIIIll[1]];
            iArr46[lIIIIIIll[0]] = lIIIIIIll[15];
            if (llIlIllIlll(Inventory.contains(iArr46) ? 1 : 0)) {
                int[] iArr47 = new int[lIIIIIIll[1]];
                iArr47[lIIIIIIll[0]] = lIIIIIIll[15];
            }
            int[] iArr48 = new int[lIIIIIIll[1]];
            iArr48[lIIIIIIll[0]] = lIIIIIIll[12];
            if (llIlIllIlll(Inventory.contains(iArr48) ? 1 : 0)) {
                int[] iArr49 = new int[lIIIIIIll[1]];
                iArr49[lIIIIIIll[0]] = lIIIIIIll[12];
            }
            int[] iArr50 = new int[lIIIIIIll[1]];
            iArr50[lIIIIIIll[0]] = lIIIIIIll[13];
            if (llIlIllIlll(Inventory.contains(iArr50) ? 1 : 0)) {
                int[] iArr51 = new int[lIIIIIIll[1]];
                iArr51[lIIIIIIll[0]] = lIIIIIIll[13];
            }
            int[] iArr52 = new int[lIIIIIIll[1]];
            iArr52[lIIIIIIll[0]] = lIIIIIIll[14];
            if (llIlIllIlll(Inventory.contains(iArr52) ? 1 : 0)) {
                int[] iArr53 = new int[lIIIIIIll[1]];
                iArr53[lIIIIIIll[0]] = lIIIIIIll[14];
            }
            int[] iArr54 = new int[lIIIIIIll[1]];
            iArr54[lIIIIIIll[0]] = lIIIIIIll[16];
            if (llIlIllIlll(Inventory.contains(iArr54) ? 1 : 0)) {
                int[] iArr55 = new int[lIIIIIIll[1]];
                iArr55[lIIIIIIll[0]] = lIIIIIIll[16];
            }
            int[] iArr56 = new int[lIIIIIIll[1]];
            iArr56[lIIIIIIll[0]] = lIIIIIIll[26];
            if (llIlIllIlIl(Inventory.contains(iArr56) ? 1 : 0)) {
                ?? r04 = lIIIIIIll[1];
                "".length();
                return (-(100 ^ 97)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
            }
            return lIIIIIIll[0];
        }
    }

    private static boolean llIlIllIlll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7])) {
            ?? r0 = lIIIIIIll[1];
            "".length();
            return (77 ^ 73) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIIIIll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lIIIIIIll[0];
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            aq();
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((100 ^ 82) ^ (170 ^ 176)) & (((((15 + 111) - 57) + 66) ^ (((2 + 163) - 25) + 31)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIIIIll[54];
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lIIIIIIlI[lIIIIIIll[60]];
    }

    private static boolean llIlIllIlIl(int i) {
        return i != 0;
    }

    private static boolean llIlIllIllI(int i, int i2) {
        return i < i2;
    }

    private static void llIlIllIlII() {
        lIIIIIIll = new int[63];
        lIIIIIIll[0] = ((112 ^ 70) ^ " ".length()) & (((((17 + 24) - (-78)) + 24) ^ (((106 + 178) - 175) + 75)) ^ (-" ".length()));
        lIIIIIIll[1] = " ".length();
        lIIIIIIll[2] = "  ".length();
        lIIIIIIll[3] = "   ".length();
        lIIIIIIll[4] = (-((-21506) & 31749)) & (-17461) & 32703;
        lIIIIIIll[5] = (70 ^ 120) ^ (179 ^ 136);
        lIIIIIIll[6] = 21 ^ 17;
        lIIIIIIll[7] = 72 ^ 122;
        lIIIIIIll[8] = (-((-25347) & 30719)) & (-1) & 15871;
        lIIIIIIll[9] = (-515) & 3007;
        lIIIIIIll[10] = (-5689) & 8187;
        lIIIIIIll[11] = (-((-553) & 10989)) & (-5137) & 16382;
        lIIIIIIll[12] = (-14483) & 15323;
        lIIIIIIll[13] = (-2225) & 3067;
        lIIIIIIll[14] = (-((-521) & 11951)) & (-16385) & 28663;
        lIIIIIIll[15] = (-18561) & 19442;
        lIIIIIIll[16] = (-((-2913) & 8183)) & (-8193) & 14271;
        lIIIIIIll[17] = (-((-691) & 31667)) & (-129) & 32199;
        lIIIIIIll[18] = (-6409) & 7577;
        lIIIIIIll[19] = (-((-9363) & 28311)) & (-12419) & 32495;
        lIIIIIIll[20] = (-1154) & 12279;
        lIIIIIIll[21] = (-((-19675) & 24031)) & (-18515) & 24574;
        lIIIIIIll[22] = (-2057) & 14681;
        lIIIIIIll[23] = (-((-2869) & 11063)) & (-16389) & 32591;
        lIIIIIIll[24] = 103 ^ 109;
        lIIIIIIll[25] = (-8338) & 16347;
        lIIIIIIll[26] = (-((-6705) & 24117)) & (-10881) & 28671;
        lIIIIIIll[27] = 44 ^ 50;
        lIIIIIIll[28] = (-((-8709) & 16069)) & (-1) & 8167;
        lIIIIIIll[29] = (-((-4309) & 23004)) & (-1033) & 28607;
        lIIIIIIll[30] = 114 ^ 116;
        lIIIIIIll[31] = 152 ^ 140;
        lIIIIIIll[32] = (((90 + 124) - 198) + 153) ^ (((64 + 2) - 5) + 113);
        lIIIIIIll[33] = (36 ^ 42) ^ (20 ^ 18);
        lIIIIIIll[34] = (-((-18) & 1363)) & (-18437) & 28663;
        lIIIIIIll[35] = (97 ^ 13) ^ (60 ^ 89);
        lIIIIIIll[36] = (107 ^ 89) ^ (15 ^ 21);
        lIIIIIIll[37] = 168 ^ 163;
        lIIIIIIll[38] = (((123 + 153) - 239) + 168) ^ (((123 + 76) - 59) + 53);
        lIIIIIIll[39] = (72 ^ 106) ^ (43 ^ 4);
        lIIIIIIll[40] = 71 ^ 73;
        lIIIIIIll[41] = (((48 ^ 72) + (((33 + 167) - 105) + 130)) - ((-5249) & 5567)) + ((113 + 51) - 1) + 51;
        lIIIIIIll[42] = 107 ^ 100;
        lIIIIIIll[43] = (60 ^ 59) ^ (2 ^ 21);
        lIIIIIIll[44] = (66 ^ 29) ^ (229 ^ 171);
        lIIIIIIll[45] = (((119 + 13) - 57) + 54) ^ (((88 + 15) - (-6)) + 38);
        lIIIIIIll[46] = (-((-65) & 16481)) & (-1029) & 32444;
        lIIIIIIll[47] = (-((-1345) & 11590)) & (-4097) & 16341;
        lIIIIIIll[48] = (-((-961) & 21447)) & (-1282) & 32767;
        lIIIIIIll[49] = (-17445) & 24110;
        lIIIIIIll[50] = (-((-2439) & 14727)) & (-17801) & 65534;
        lIIIIIIll[51] = (-16388) & 23387;
        lIIIIIIll[52] = (-5385) & 22504;
        lIIIIIIll[53] = (181 ^ 198) ^ (241 ^ 161);
        lIIIIIIll[54] = (83 ^ 68) ^ (36 ^ 87);
        lIIIIIIll[55] = (-27693) & 28012;
        lIIIIIIll[56] = (-((-3597) & 20255)) & (-4129) & 32766;
        lIIIIIIll[57] = (-1541) & 26540;
        lIIIIIIll[58] = (-((-3891) & 28475)) & (-129) & 32719;
        lIIIIIIll[59] = (-22642) & 23541;
        lIIIIIIll[60] = 211 ^ 192;
        lIIIIIIll[61] = (((62 + 102) - 57) + 65) ^ (((2 + 162) - 12) + 33);
        lIIIIIIll[62] = 156 ^ 138;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0124, code lost:
        if (llIlIllIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0012m.lIIIIIIll[47]) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04c7, code lost:
        if (llIlIllIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.C0012m.lIIIIIIll[24]) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0511  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ag() {
        int[] iArr;
        if (llIlIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIll[27])) {
            int[] iArr2 = new int[lIIIIIIll[1]];
            iArr2[lIIIIIIll[0]] = lIIIIIIll[12];
            if (llIlIllIlll(Bank.contains(iArr2) ? 1 : 0)) {
                bB.add(new C0003d(lIIIIIIll[12], lIIIIIIll[1], lIIIIIIll[46]));
                "".length();
            }
            int[] iArr3 = new int[lIIIIIIll[1]];
            iArr3[lIIIIIIll[0]] = lIIIIIIll[13];
            if (llIlIllIlll(Bank.contains(iArr3) ? 1 : 0)) {
                bB.add(new C0003d(lIIIIIIll[13], lIIIIIIll[1], lIIIIIIll[46]));
                "".length();
            }
            int[] iArr4 = new int[lIIIIIIll[1]];
            iArr4[lIIIIIIll[0]] = lIIIIIIll[14];
            if (llIlIllIlll(Bank.contains(iArr4) ? 1 : 0)) {
                bB.add(new C0003d(lIIIIIIll[14], lIIIIIIll[1], lIIIIIIll[46]));
                "".length();
            }
            int[] iArr5 = new int[lIIIIIIll[1]];
            iArr5[lIIIIIIll[0]] = lIIIIIIll[15];
            if (llIlIllIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIIIIIll[1]];
                iArr6[lIIIIIIll[0]] = lIIIIIIll[15];
            }
            bB.add(new C0003d(lIIIIIIll[15], lIIIIIIll[48], lIIIIIIll[35]));
            "".length();
        }
        int[] iArr7 = new int[lIIIIIIll[1]];
        iArr7[lIIIIIIll[0]] = lIIIIIIll[18];
        if (llIlIllIlll(Bank.contains(iArr7) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIll[18], lIIIIIIll[1], lIIIIIIll[49]));
            "".length();
        }
        int[] iArr8 = new int[lIIIIIIll[1]];
        iArr8[lIIIIIIll[0]] = lIIIIIIll[19];
        if (llIlIllIlll(Bank.contains(iArr8) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIll[19], lIIIIIIll[1], lIIIIIIll[49]));
            "".length();
        }
        int[] iArr9 = new int[lIIIIIIll[1]];
        iArr9[lIIIIIIll[0]] = lIIIIIIll[17];
        if (llIlIllIlll(Bank.contains(iArr9) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIll[17], lIIIIIIll[1], lIIIIIIll[49]));
            "".length();
        }
        int[] iArr10 = new int[lIIIIIIll[1]];
        iArr10[lIIIIIIll[0]] = lIIIIIIll[20];
        if (llIlIllIlll(Bank.contains(iArr10) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIll[20], lIIIIIIll[1], lIIIIIIll[50]));
            "".length();
        }
        if (llIlIllIllI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7])) {
            int[] iArr11 = new int[lIIIIIIll[1]];
            iArr11[lIIIIIIll[0]] = lIIIIIIll[16];
            if (llIlIllIlll(Bank.contains(iArr11) ? 1 : 0)) {
                bB.add(new C0003d(lIIIIIIll[16], lIIIIIIll[51], lIIIIIIll[42]));
                "".length();
            }
        }
        int[] iArr12 = new int[lIIIIIIll[1]];
        iArr12[lIIIIIIll[0]] = lIIIIIIll[9];
        if (llIlIllIlll(Bank.contains(iArr12) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIll[9], lIIIIIIll[1], lIIIIIIll[52]));
            "".length();
        }
        int[] iArr13 = new int[lIIIIIIll[1]];
        iArr13[lIIIIIIll[0]] = lIIIIIIll[10];
        if (llIlIllIlll(Bank.contains(iArr13) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIll[10], lIIIIIIll[1], lIIIIIIll[52]));
            "".length();
        }
        if (llIlIlllIlI(Skills.getLevel(Skill.RANGED), lIIIIIIll[7])) {
            int[] iArr14 = new int[lIIIIIIll[1]];
            iArr14[lIIIIIIll[0]] = lIIIIIIll[11];
            if (llIlIllIlll(Bank.contains(iArr14) ? 1 : 0)) {
                bB.add(new C0003d(lIIIIIIll[11], lIIIIIIll[48], lIIIIIIll[53]));
                "".length();
            }
        }
        int[] iArr15 = new int[lIIIIIIll[1]];
        iArr15[lIIIIIIll[0]] = lIIIIIIll[22];
        if (llIlIllIlll(Bank.contains(iArr15) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIll[22], lIIIIIIll[1], C0008i.bw));
            "".length();
        }
        int[] iArr16 = new int[lIIIIIIll[1]];
        iArr16[lIIIIIIll[0]] = lIIIIIIll[26];
        if (llIlIllIlll(Bank.contains(iArr16) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIll[26], lIIIIIIll[54], lIIIIIIll[55]));
            "".length();
        }
        if (llIlIllIlll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIIIlI[lIIIIIIll[31]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lIIIIIIll[56], lIIIIIIll[5], lIIIIIIll[57]));
            "".length();
        }
        int[] iArr17 = new int[lIIIIIIll[1]];
        iArr17[lIIIIIIll[0]] = lIIIIIIll[58];
        if (llIlIllIlIl(Bank.contains(iArr17) ? 1 : 0)) {
            int[] iArr18 = new int[lIIIIIIll[1]];
            iArr18[lIIIIIIll[0]] = lIIIIIIll[58];
            if (llIlIllIlIl(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIIIIIll[1]];
                iArr19[lIIIIIIll[0]] = lIIIIIIll[58];
            }
            iArr = new int[lIIIIIIll[1]];
            iArr[lIIIIIIll[0]] = lIIIIIIll[23];
            if (llIlIllIlIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr20 = new int[lIIIIIIll[1]];
                iArr20[lIIIIIIll[0]] = lIIIIIIll[23];
                if (!llIlIllIlIl(Bank.contains(iArr20) ? 1 : 0)) {
                    return;
                }
                int[] iArr21 = new int[lIIIIIIll[1]];
                iArr21[lIIIIIIll[0]] = lIIIIIIll[23];
                if (!llIlIllIllI(Bank.getFirst(iArr21).getQuantity(), lIIIIIIll[24])) {
                    return;
                }
            }
            bB.add(new C0003d(lIIIIIIll[23], lIIIIIIll[24], lIIIIIIll[59]));
            "".length();
        }
        bB.add(new C0003d(lIIIIIIll[58], lIIIIIIll[24], lIIIIIIll[59]));
        "".length();
        iArr = new int[lIIIIIIll[1]];
        iArr[lIIIIIIll[0]] = lIIIIIIll[23];
        if (llIlIllIlIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bB.add(new C0003d(lIIIIIIll[23], lIIIIIIll[24], lIIIIIIll[59]));
        "".length();
    }

    private static boolean llIlIllllII(int i, int i2) {
        return i == i2;
    }

    static {
        llIlIllIlII();
        llIlIllIIll();
        bB = new ArrayList();
    }
}
