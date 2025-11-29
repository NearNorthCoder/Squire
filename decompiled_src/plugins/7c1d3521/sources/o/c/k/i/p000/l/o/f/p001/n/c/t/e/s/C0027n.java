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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/n.class */
public class C0027n implements InterfaceC0003ac {
    private static /* synthetic */ int[] llIIllllll;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] llIIlllllI;
    public static /* synthetic */ boolean bt;

    private static boolean lIlIlllllIIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIllllllIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIlllllIlIl(int i) {
        return i > 0;
    }

    private static boolean lIlIlllllIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIlllllIIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public static void aA() {
        if (lIlIlllllIIIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlllllI[llIIllllll[0]];
            C0015b.a(bv);
            if (lIlIlllllIIlI(bv.size(), llIIllllll[1])) {
                System.out.println(llIIlllllI[llIIllllll[1]]);
                bt = llIIllllll[0];
            }
        }
        if (lIlIlllllIIll(bt ? 1 : 0)) {
            if (lIlIlllllIIll(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlllllIlII(nearest) && lIlIlllllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllllI[llIIllllll[2]];
                    C0000a.a(nearest);
                }
                if (lIlIlllllIlII(nearest) && lIlIlllllIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlllllI[llIIllllll[3]];
                    if (lIlIlllllIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIllllll[4]);
                        "".length();
                        Time.sleepTicks(llIIllllll[3]);
                        "".length();
                    }
                    if (lIlIlllllIIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIlllllIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIllllll[5]);
                            "".length();
                        }
                        if (lIlIlllllIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIllllll[2]);
                            "".length();
                        }
                        if (lIlIlllllIIll(ao() ? 1 : 0)) {
                            Q();
                            System.out.println(llIIlllllI[llIIllllll[6]]);
                            bt = llIIllllll[1];
                            return;
                        }
                        if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[7])) {
                            C0000a.a(llIIllllll[8], llIIllllll[1]);
                            C0000a.a(llIIllllll[9], llIIllllll[1]);
                            C0000a.a(llIIllllll[10], llIIllllll[1]);
                            Bank.withdrawAll(llIIllllll[11], Bank.WithdrawMode.ITEM);
                        }
                        if (lIlIlllllIIlI(Skills.getLevel(Skill.RANGED), llIIllllll[7])) {
                            C0000a.a(llIIllllll[12], llIIllllll[1]);
                            C0000a.a(llIIllllll[13], llIIllllll[1]);
                            C0000a.a(llIIllllll[14], llIIllllll[1]);
                            Bank.withdrawAll(llIIllllll[15], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(llIIllllll[1]);
                            "".length();
                            Bank.withdrawAll(llIIllllll[16], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(llIIllllll[1]);
                            "".length();
                            C0000a.a(llIIllllll[17], llIIllllll[1]);
                        }
                        C0000a.a(llIIllllll[18], llIIllllll[1]);
                        C0000a.a(llIIllllll[19], llIIllllll[1]);
                        C0000a.a(llIIllllll[20], llIIllllll[1]);
                        C0000a.a(llIIllllll[21], llIIllllll[1]);
                        C0000a.a(llIIllllll[22], llIIllllll[1]);
                        C0000a.a(llIIllllll[23], llIIllllll[24]);
                        C0000a.a(llIIllllll[25], llIIllllll[24]);
                        C0000a.a(llIIllllll[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (lIlIlllllIIIl(an() ? 1 : 0)) {
                aB();
                if (lIlIlllllIIlI(Skills.getLevel(Skill.RANGED), llIIllllll[27])) {
                    C0026m.al();
                }
                if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[27])) {
                    TileItem nearest2 = TileItems.getNearest(tileItem -> {
                        if (lIlIllllllIII(tileItem.getId(), llIIllllll[16]) && lIlIlllllIllI(tileItem.getQuantity(), llIIllllll[42])) {
                            ?? r0 = llIIllllll[1];
                            "".length();
                            return (-((((51 + 69) - 19) + 75) ^ (((54 + 37) - 32) + 121))) >= 0 ? ((((38 + 157) - 33) + 35) ^ (((117 + 8) - (-15)) + 13)) & (((((196 + 103) - 93) + 8) ^ (((64 + 1) - (-46)) + 27)) ^ (-" ".length())) : r0;
                        }
                        return llIIllllll[0];
                    });
                    if (lIlIlllllIlII(nearest2)) {
                        nearest2.interact(llIIlllllI[llIIllllll[5]]);
                        Time.sleepTicks(llIIllllll[6]);
                        "".length();
                    }
                    C0025l.aj();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains((v0) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
            return m(v0);
        }) ? 1 : 0) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void aB() {
        int[] iArr = new int[llIIllllll[1]];
        iArr[llIIllllll[0]] = llIIllllll[28];
        if (lIlIlllllIIll(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIIllllll[1]];
            iArr2[llIIllllll[0]] = llIIllllll[29];
            if (lIlIlllllIIll(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIIllllll[1]];
                iArr3[llIIllllll[0]] = llIIllllll[16];
                if (lIlIlllllIIll(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llIIllllll[1]];
                    iArr4[llIIllllll[0]] = llIIllllll[11];
                    if (lIlIlllllIIll(Equipment.contains(iArr4) ? 1 : 0)) {
                    }
                }
            }
        }
        if (lIlIlllllIlll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIlIlllllIIlI(Skills.getLevel(Skill.RANGED), llIIllllll[27])) {
            int[] iArr5 = new int[llIIllllll[1]];
            iArr5[llIIllllll[0]] = llIIllllll[28];
            if (lIlIlllllIIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIllllll[1]];
                iArr6[llIIllllll[0]] = llIIllllll[28];
                Inventory.getFirst(iArr6).interact(llIIlllllI[llIIllllll[30]]);
            }
            int[] iArr7 = new int[llIIllllll[1]];
            iArr7[llIIllllll[0]] = llIIllllll[12];
            if (lIlIlllllIIIl(Inventory.contains(iArr7) ? 1 : 0) && lIlIlllllIIlI(Skills.getLevel(Skill.RANGED), llIIllllll[5])) {
                C0018e.l(llIIllllll[12]);
            }
            int[] iArr8 = new int[llIIllllll[1]];
            iArr8[llIIllllll[0]] = llIIllllll[13];
            if (lIlIlllllIIIl(Inventory.contains(iArr8) ? 1 : 0) && lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[5]) && lIlIlllllIIlI(Skills.getLevel(Skill.RANGED), llIIllllll[31])) {
                C0018e.l(llIIllllll[13]);
            }
            int[] iArr9 = new int[llIIllllll[1]];
            iArr9[llIIllllll[0]] = llIIllllll[14];
            if (lIlIlllllIIIl(Inventory.contains(iArr9) ? 1 : 0) && lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[31])) {
                C0018e.l(llIIllllll[14]);
            }
            int[] iArr10 = new int[llIIllllll[1]];
            iArr10[llIIllllll[0]] = llIIllllll[15];
            if (lIlIlllllIIIl(Inventory.contains(iArr10) ? 1 : 0)) {
                C0018e.l(llIIllllll[15]);
            }
        }
        if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[31])) {
            int[] iArr11 = new int[llIIllllll[1]];
            iArr11[llIIllllll[0]] = llIIllllll[18];
            if (lIlIlllllIIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIllllll[1]];
                iArr12[llIIllllll[0]] = llIIllllll[18];
                Inventory.getFirst(iArr12).interact(llIIlllllI[llIIllllll[32]]);
            }
        }
        if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[27])) {
            int[] iArr13 = new int[llIIllllll[1]];
            iArr13[llIIllllll[0]] = llIIllllll[29];
            if (lIlIlllllIIIl(Inventory.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIllllll[1]];
                iArr14[llIIllllll[0]] = llIIllllll[29];
                Inventory.getFirst(iArr14).interact(llIIlllllI[llIIllllll[33]]);
            }
            int[] iArr15 = new int[llIIllllll[1]];
            iArr15[llIIllllll[0]] = llIIllllll[34];
            if (lIlIlllllIIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llIIllllll[1]];
                iArr16[llIIllllll[0]] = llIIllllll[34];
                Inventory.getFirst(iArr16).interact(llIIlllllI[llIIllllll[35]]);
            }
            int[] iArr17 = new int[llIIllllll[1]];
            iArr17[llIIllllll[0]] = llIIllllll[16];
            if (lIlIlllllIIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[llIIllllll[1]];
                iArr18[llIIllllll[0]] = llIIllllll[16];
                Inventory.getFirst(iArr18).interact(llIIlllllI[llIIllllll[24]]);
            }
        }
        if (lIlIlllllIIlI(Skills.getLevel(Skill.DEFENCE), llIIllllll[36])) {
            int[] iArr19 = new int[llIIllllll[1]];
            iArr19[llIIllllll[0]] = llIIllllll[19];
            if (lIlIlllllIIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIIllllll[1]];
                iArr20[llIIllllll[0]] = llIIllllll[19];
                Inventory.getFirst(iArr20).interact(llIIlllllI[llIIllllll[37]]);
            }
        }
        if (lIlIlllllIIlI(Skills.getLevel(Skill.RANGED), llIIllllll[7])) {
            int[] iArr21 = new int[llIIllllll[1]];
            iArr21[llIIllllll[0]] = llIIllllll[17];
            if (lIlIlllllIIIl(Inventory.contains(iArr21) ? 1 : 0)) {
                int[] iArr22 = new int[llIIllllll[1]];
                iArr22[llIIllllll[0]] = llIIllllll[17];
                Inventory.getFirst(iArr22).interact(llIIlllllI[llIIllllll[38]]);
            }
        }
        int[] iArr23 = new int[llIIllllll[1]];
        iArr23[llIIllllll[0]] = llIIllllll[20];
        if (lIlIlllllIIIl(Inventory.contains(iArr23) ? 1 : 0)) {
            int[] iArr24 = new int[llIIllllll[1]];
            iArr24[llIIllllll[0]] = llIIllllll[20];
            Inventory.getFirst(iArr24).interact(llIIlllllI[llIIllllll[39]]);
        }
        int[] iArr25 = new int[llIIllllll[1]];
        iArr25[llIIllllll[0]] = llIIllllll[21];
        if (lIlIlllllIIIl(Inventory.contains(iArr25) ? 1 : 0)) {
            int[] iArr26 = new int[llIIllllll[1]];
            iArr26[llIIllllll[0]] = llIIllllll[21];
            Inventory.getFirst(iArr26).interact(llIIlllllI[llIIllllll[40]]);
        }
        if (lIlIllllllIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIllllll[41])) {
            int[] iArr27 = new int[llIIllllll[1]];
            iArr27[llIIllllll[0]] = llIIllllll[8];
            if (lIlIlllllIIIl(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[llIIllllll[1]];
                iArr28[llIIllllll[0]] = llIIllllll[8];
                if (lIlIlllllIIll(Equipment.contains(iArr28) ? 1 : 0)) {
                    int[] iArr29 = new int[llIIllllll[1]];
                    iArr29[llIIllllll[0]] = llIIllllll[8];
                    Inventory.getFirst(iArr29).interact(llIIlllllI[llIIllllll[42]]);
                }
            }
            if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[7])) {
                int[] iArr30 = new int[llIIllllll[1]];
                iArr30[llIIllllll[0]] = llIIllllll[9];
                if (lIlIlllllIIIl(Inventory.contains(iArr30) ? 1 : 0)) {
                    int[] iArr31 = new int[llIIllllll[1]];
                    iArr31[llIIllllll[0]] = llIIllllll[9];
                    if (lIlIlllllIIll(Equipment.contains(iArr31) ? 1 : 0)) {
                        int[] iArr32 = new int[llIIllllll[1]];
                        iArr32[llIIllllll[0]] = llIIllllll[9];
                        Inventory.getFirst(iArr32).interact(llIIlllllI[llIIllllll[43]]);
                    }
                }
            }
            if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[7]) && lIlIlllllIllI(Skills.getLevel(Skill.DEFENCE), llIIllllll[36])) {
                int[] iArr33 = new int[llIIllllll[1]];
                iArr33[llIIllllll[0]] = llIIllllll[10];
                if (lIlIlllllIIIl(Inventory.contains(iArr33) ? 1 : 0)) {
                    int[] iArr34 = new int[llIIllllll[1]];
                    iArr34[llIIllllll[0]] = llIIllllll[10];
                    if (lIlIlllllIIll(Equipment.contains(iArr34) ? 1 : 0)) {
                        int[] iArr35 = new int[llIIllllll[1]];
                        iArr35[llIIllllll[0]] = llIIllllll[10];
                        Inventory.getFirst(iArr35).interact(llIIlllllI[llIIllllll[44]]);
                    }
                }
            }
            if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[7])) {
                int[] iArr36 = new int[llIIllllll[1]];
                iArr36[llIIllllll[0]] = llIIllllll[11];
                if (lIlIlllllIIIl(Inventory.contains(iArr36) ? 1 : 0)) {
                    int[] iArr37 = new int[llIIllllll[1]];
                    iArr37[llIIllllll[0]] = llIIllllll[11];
                    Inventory.getFirst(iArr37).interact(llIIlllllI[llIIllllll[45]]);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0121, code lost:
        if (lIlIlllllIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0027n.llIIllllll[47]) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04b8, code lost:
        if (lIlIlllllIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0027n.llIIllllll[24]) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0501  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        if (lIlIlllllIIlI(Skills.getLevel(Skill.RANGED), llIIllllll[27])) {
            int[] iArr2 = new int[llIIllllll[1]];
            iArr2[llIIllllll[0]] = llIIllllll[12];
            if (lIlIlllllIIll(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(llIIllllll[12], llIIllllll[1], llIIllllll[46]));
                "".length();
            }
            int[] iArr3 = new int[llIIllllll[1]];
            iArr3[llIIllllll[0]] = llIIllllll[13];
            if (lIlIlllllIIll(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0017d(llIIllllll[13], llIIllllll[1], llIIllllll[46]));
                "".length();
            }
            int[] iArr4 = new int[llIIllllll[1]];
            iArr4[llIIllllll[0]] = llIIllllll[14];
            if (lIlIlllllIIll(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0017d(llIIllllll[14], llIIllllll[1], llIIllllll[46]));
                "".length();
            }
            int[] iArr5 = new int[llIIllllll[1]];
            iArr5[llIIllllll[0]] = llIIllllll[15];
            if (lIlIlllllIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIllllll[1]];
                iArr6[llIIllllll[0]] = llIIllllll[15];
            }
            bv.add(new C0017d(llIIllllll[15], llIIllllll[48], llIIllllll[35]));
            "".length();
        }
        int[] iArr7 = new int[llIIllllll[1]];
        iArr7[llIIllllll[0]] = llIIllllll[18];
        if (lIlIlllllIIll(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIIllllll[18], llIIllllll[1], llIIllllll[49]));
            "".length();
        }
        int[] iArr8 = new int[llIIllllll[1]];
        iArr8[llIIllllll[0]] = llIIllllll[19];
        if (lIlIlllllIIll(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(llIIllllll[19], llIIllllll[1], llIIllllll[49]));
            "".length();
        }
        int[] iArr9 = new int[llIIllllll[1]];
        iArr9[llIIllllll[0]] = llIIllllll[17];
        if (lIlIlllllIIll(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0017d(llIIllllll[17], llIIllllll[1], llIIllllll[49]));
            "".length();
        }
        int[] iArr10 = new int[llIIllllll[1]];
        iArr10[llIIllllll[0]] = llIIllllll[20];
        if (lIlIlllllIIll(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0017d(llIIllllll[20], llIIllllll[1], llIIllllll[50]));
            "".length();
        }
        if (lIlIlllllIIlI(Skills.getLevel(Skill.RANGED), llIIllllll[7])) {
            int[] iArr11 = new int[llIIllllll[1]];
            iArr11[llIIllllll[0]] = llIIllllll[16];
            if (lIlIlllllIIll(Bank.contains(iArr11) ? 1 : 0)) {
                bv.add(new C0017d(llIIllllll[16], llIIllllll[51], llIIllllll[42]));
                "".length();
            }
        }
        int[] iArr12 = new int[llIIllllll[1]];
        iArr12[llIIllllll[0]] = llIIllllll[9];
        if (lIlIlllllIIll(Bank.contains(iArr12) ? 1 : 0)) {
            bv.add(new C0017d(llIIllllll[9], llIIllllll[1], llIIllllll[52]));
            "".length();
        }
        int[] iArr13 = new int[llIIllllll[1]];
        iArr13[llIIllllll[0]] = llIIllllll[10];
        if (lIlIlllllIIll(Bank.contains(iArr13) ? 1 : 0)) {
            bv.add(new C0017d(llIIllllll[10], llIIllllll[1], llIIllllll[52]));
            "".length();
        }
        if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[7])) {
            int[] iArr14 = new int[llIIllllll[1]];
            iArr14[llIIllllll[0]] = llIIllllll[11];
            if (lIlIlllllIIll(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0017d(llIIllllll[11], llIIllllll[48], llIIllllll[53]));
                "".length();
            }
        }
        int[] iArr15 = new int[llIIllllll[1]];
        iArr15[llIIllllll[0]] = llIIllllll[22];
        if (lIlIlllllIIll(Bank.contains(iArr15) ? 1 : 0)) {
            bv.add(new C0017d(llIIllllll[22], llIIllllll[1], C0023j.cf));
            "".length();
        }
        int[] iArr16 = new int[llIIllllll[1]];
        iArr16[llIIllllll[0]] = llIIllllll[26];
        if (lIlIlllllIIll(Bank.contains(iArr16) ? 1 : 0)) {
            bv.add(new C0017d(llIIllllll[26], llIIllllll[54], llIIllllll[55]));
            "".length();
        }
        if (lIlIlllllIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIIlllllI[llIIllllll[31]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIIllllll[56], llIIllllll[5], llIIllllll[57]));
            "".length();
        }
        int[] iArr17 = new int[llIIllllll[1]];
        iArr17[llIIllllll[0]] = llIIllllll[58];
        if (lIlIlllllIIIl(Bank.contains(iArr17) ? 1 : 0)) {
            int[] iArr18 = new int[llIIllllll[1]];
            iArr18[llIIllllll[0]] = llIIllllll[58];
            if (lIlIlllllIIIl(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llIIllllll[1]];
                iArr19[llIIllllll[0]] = llIIllllll[58];
            }
            iArr = new int[llIIllllll[1]];
            iArr[llIIllllll[0]] = llIIllllll[23];
            if (lIlIlllllIIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr20 = new int[llIIllllll[1]];
                iArr20[llIIllllll[0]] = llIIllllll[23];
                if (!lIlIlllllIIIl(Bank.contains(iArr20) ? 1 : 0)) {
                    return;
                }
                int[] iArr21 = new int[llIIllllll[1]];
                iArr21[llIIllllll[0]] = llIIllllll[23];
                if (!lIlIlllllIIlI(Bank.getFirst(iArr21).getQuantity(), llIIllllll[24])) {
                    return;
                }
            }
            bv.add(new C0017d(llIIllllll[23], llIIllllll[24], llIIllllll[59]));
            "".length();
        }
        bv.add(new C0017d(llIIllllll[58], llIIllllll[24], llIIllllll[59]));
        "".length();
        iArr = new int[llIIllllll[1]];
        iArr[llIIllllll[0]] = llIIllllll[23];
        if (lIlIlllllIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIllllll[23], llIIllllll[24], llIIllllll[59]));
        "".length();
    }

    private static String lIlIllllIllIl(String llllllllllllllllllIIlIlIIllIlIlI, String llllllllllllllllllIIlIlIIllIlIIl) {
        try {
            SecretKeySpec llllllllllllllllllIIlIlIIllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlIIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllllll[2], llllllllllllllllllIIlIlIIllIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIlIIllIlIll) {
            llllllllllllllllllIIlIlIIllIlIll.printStackTrace();
            return null;
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aA();
            "".length();
            if ((-" ".length()) > 0) {
                return ((133 ^ 197) ^ "  ".length()) & (((((128 + 222) - 284) + 164) ^ (((94 + 106) - 109) + 73)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIllllll[54];
    }

    private static String lIlIllllIlllI(String llllllllllllllllllIIlIlIIlllIlIl, String llllllllllllllllllIIlIlIIlllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlIIlllIllI.getBytes(StandardCharsets.UTF_8)), llIIllllll[33]), "DES");
            Cipher llllllllllllllllllIIlIlIIllllIIl = Cipher.getInstance("DES");
            llllllllllllllllllIIlIlIIllllIIl.init(llIIllllll[2], secretKeySpec);
            return new String(llllllllllllllllllIIlIlIIllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIlIIlllIIll) {
            llllllllllllllllllIIlIlIIlllIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x035a, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L72;
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
        if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[7]) && lIlIllllllIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIllllll[41]) && lIlIlllllIllI(Skills.getLevel(Skill.DEFENCE), llIIllllll[36])) {
            int[] iArr = new int[llIIllllll[1]];
            iArr[llIIllllll[0]] = llIIllllll[9];
            if (lIlIlllllIIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIllllll[1]];
                iArr2[llIIllllll[0]] = llIIllllll[10];
                if (lIlIlllllIIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIllllll[1]];
                    iArr3[llIIllllll[0]] = llIIllllll[18];
                    if (lIlIlllllIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIIllllll[1]];
                        iArr4[llIIllllll[0]] = llIIllllll[20];
                        if (lIlIlllllIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[llIIllllll[1]];
                            iArr5[llIIllllll[0]] = llIIllllll[11];
                            if (lIlIlllllIIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIIllllll[1]];
                                iArr6[llIIllllll[0]] = llIIllllll[8];
                                if (lIlIlllllIIIl(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[llIIllllll[1]];
                                    iArr7[llIIllllll[0]] = llIIllllll[26];
                                    if (lIlIlllllIIIl(Bank.contains(iArr7) ? 1 : 0)) {
                                        ?? r0 = llIIllllll[1];
                                        "".length();
                                        return "   ".length() == " ".length() ? ((35 ^ 75) ^ (102 ^ 64)) & (((86 ^ 69) ^ (121 ^ 36)) ^ (-" ".length())) : r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return llIIllllll[0];
        } else if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[27]) && lIlIlllllIIlI(Skills.getLevel(Skill.RANGED), llIIllllll[7])) {
            int[] iArr8 = new int[llIIllllll[1]];
            iArr8[llIIllllll[0]] = llIIllllll[17];
            if (lIlIlllllIIIl(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIIllllll[1]];
                iArr9[llIIllllll[0]] = llIIllllll[19];
                if (lIlIlllllIIIl(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIIllllll[1]];
                    iArr10[llIIllllll[0]] = llIIllllll[18];
                    if (lIlIlllllIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIIllllll[1]];
                        iArr11[llIIllllll[0]] = llIIllllll[20];
                        if (lIlIlllllIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[llIIllllll[1]];
                            iArr12[llIIllllll[0]] = llIIllllll[16];
                            if (lIlIlllllIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[llIIllllll[1]];
                                iArr13[llIIllllll[0]] = llIIllllll[26];
                                if (lIlIlllllIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                                    ?? r02 = llIIllllll[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                                }
                            }
                        }
                    }
                }
            }
            return llIIllllll[0];
        } else {
            int[] iArr14 = new int[llIIllllll[1]];
            iArr14[llIIllllll[0]] = llIIllllll[17];
            if (lIlIlllllIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIIllllll[1]];
                iArr15[llIIllllll[0]] = llIIllllll[19];
                if (lIlIlllllIIIl(Bank.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[llIIllllll[1]];
                    iArr16[llIIllllll[0]] = llIIllllll[18];
                    if (lIlIlllllIIIl(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[llIIllllll[1]];
                        iArr17[llIIllllll[0]] = llIIllllll[20];
                        if (lIlIlllllIIIl(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[llIIllllll[1]];
                            iArr18[llIIllllll[0]] = llIIllllll[12];
                            if (lIlIlllllIIIl(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[llIIllllll[1]];
                                iArr19[llIIllllll[0]] = llIIllllll[23];
                                if (lIlIlllllIIIl(Bank.contains(iArr19) ? 1 : 0)) {
                                    int[] iArr20 = new int[llIIllllll[1]];
                                    iArr20[llIIllllll[0]] = llIIllllll[13];
                                    if (lIlIlllllIIIl(Bank.contains(iArr20) ? 1 : 0)) {
                                        int[] iArr21 = new int[llIIllllll[1]];
                                        iArr21[llIIllllll[0]] = llIIllllll[14];
                                        if (lIlIlllllIIIl(Bank.contains(iArr21) ? 1 : 0)) {
                                            int[] iArr22 = new int[llIIllllll[1]];
                                            iArr22[llIIllllll[0]] = llIIllllll[15];
                                            if (lIlIlllllIIll(Bank.contains(iArr22) ? 1 : 0)) {
                                                int[] iArr23 = new int[llIIllllll[1]];
                                                iArr23[llIIllllll[0]] = llIIllllll[15];
                                            }
                                            int[] iArr24 = new int[llIIllllll[1]];
                                            iArr24[llIIllllll[0]] = llIIllllll[16];
                                            if (lIlIlllllIIIl(Bank.contains(iArr24) ? 1 : 0)) {
                                                int[] iArr25 = new int[llIIllllll[1]];
                                                iArr25[llIIllllll[0]] = llIIllllll[26];
                                                if (lIlIlllllIIIl(Bank.contains(iArr25) ? 1 : 0)) {
                                                    ?? r03 = llIIllllll[1];
                                                    "".length();
                                                    return (" ".length() & (" ".length() ^ (-1))) > (108 ^ 104) ? (true ^ true) & ((true ^ true) ^ true) : r03;
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
            return llIIllllll[0];
        }
    }

    private static boolean lIlIlllllIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIllllll[0];
    }

    static {
        lIlIlllllIIII();
        lIlIllllIllll();
        bv = new ArrayList();
    }

    private static void lIlIllllIllll() {
        llIIlllllI = new String[llIIllllll[62]];
        llIIlllllI[llIIllllll[0]] = lIlIllllIllII("DhkTAj4rTAMfNSEf", "LljkP");
        llIIlllllI[llIIllllll[1]] = lIlIllllIllIl("o92T9LHYY9PTgL/KS9h5rB1qP/fO+IAR1LA4LTHeenmtLqs6QYqdd1inQ0en3dkxTUR6sC4ZstU=", "JzfDh");
        llIIlllllI[llIIllllll[2]] = lIlIllllIlllI("oYfHnp21zuMFqA6uGj1MD/q/RWNwAXFJ", "NaZJB");
        llIIlllllI[llIIllllll[3]] = lIlIllllIllIl("DdZ1TNQO06dhe8LhOR7xVnvwKF0HDKQT", "vduak");
        llIIlllllI[llIIllllll[6]] = lIlIllllIllII("PCRJMR4OYQQ5HxgoBzdMGDQZIAACJBp8TBg2ACQPAygHN0wfLkkSOTIIJxc=", "kAiPl");
        llIIlllllI[llIIllllll[5]] = lIlIllllIlllI("FiC8ve0e2E8=", "QFRHT");
        llIIlllllI[llIIllllll[30]] = lIlIllllIllIl("Bv6eZZ9oEn0=", "XPEAm");
        llIIlllllI[llIIllllll[32]] = lIlIllllIllIl("rQNQ//WNt1k=", "JwfDM");
        llIIlllllI[llIIllllll[33]] = lIlIllllIlllI("4+tgkWydrUk=", "DWEwo");
        llIIlllllI[llIIllllll[35]] = lIlIllllIlllI("Vf+NGeAk25w=", "DLnRI");
        llIIlllllI[llIIllllll[24]] = lIlIllllIlllI("698wr83PjsE=", "ZewAl");
        llIIlllllI[llIIllllll[37]] = lIlIllllIllII("PhEDNQ==", "itbGt");
        llIIlllllI[llIIllllll[38]] = lIlIllllIllIl("pdtSL9ag3zk=", "LKcDJ");
        llIIlllllI[llIIllllll[39]] = lIlIllllIllIl("o/n5KKEB2lc=", "pAQFu");
        llIIlllllI[llIIllllll[40]] = lIlIllllIlllI("r/ubbdi3MS8=", "OJzrQ");
        llIIlllllI[llIIllllll[42]] = lIlIllllIllIl("LnviFMcK04I=", "gNoRs");
        llIIlllllI[llIIllllll[43]] = lIlIllllIlllI("VOA0thaB8FQ=", "cKnLr");
        llIIlllllI[llIIllllll[44]] = lIlIllllIllIl("8IPu/02qYKU=", "QOqzt");
        llIIlllllI[llIIllllll[45]] = lIlIllllIllII("JwsIIw8=", "pbmOk");
        llIIlllllI[llIIllllll[60]] = lIlIllllIllIl("DBI6Vc67RQAroBp0eb84Vg==", "aWSNM");
        llIIlllllI[llIIllllll[31]] = lIlIllllIlllI("KsPBLU53pUBp7ukgwoUQPFOvcrHWpF3c", "SEiHR");
        llIIlllllI[llIIllllll[61]] = lIlIllllIllIl("v9DyANUycv8=", "NTnrI");
    }

    private static String lIlIllllIllII(String llllllllllllllllllIIlIlIlIIIllII, String llllllllllllllllllIIlIlIlIIIlIll) {
        String llllllllllllllllllIIlIlIlIIIllII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIlIlIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIlIlIlIIIlIlI = new StringBuilder();
        char[] llllllllllllllllllIIlIlIlIIIlIIl = llllllllllllllllllIIlIlIlIIIlIll.toCharArray();
        int llllllllllllllllllIIlIlIlIIIlIII = llIIllllll[0];
        char[] charArray = llllllllllllllllllIIlIlIlIIIllII2.toCharArray();
        int length = charArray.length;
        int i = llIIllllll[0];
        while (lIlIlllllIIlI(i, length)) {
            char llllllllllllllllllIIlIlIlIIIllIl = charArray[i];
            llllllllllllllllllIIlIlIlIIIlIlI.append((char) (llllllllllllllllllIIlIlIlIIIllIl ^ llllllllllllllllllIIlIlIlIIIlIIl[llllllllllllllllllIIlIlIlIIIlIII % llllllllllllllllllIIlIlIlIIIlIIl.length]));
            "".length();
            llllllllllllllllllIIlIlIlIIIlIII++;
            i++;
            "".length();
            if ((((94 ^ 2) ^ (207 ^ 139)) & (((((46 + 168) - 52) + 10) ^ (((28 + 169) - 45) + 28)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIlIlIlIIIlIlI);
    }

    private static void lIlIlllllIIII() {
        llIIllllll = new int[63];
        llIIllllll[0] = ((((29 + 6) - 34) + 158) ^ (((49 + 23) - 27) + 94)) & (((((109 + 50) - 27) + 40) ^ (((44 + 56) - (-36)) + 48)) ^ (-" ".length()));
        llIIllllll[1] = " ".length();
        llIIllllll[2] = "  ".length();
        llIIllllll[3] = "   ".length();
        llIIllllll[4] = (-((-6817) & 32501)) & (-2051) & 32734;
        llIIllllll[5] = (22 ^ 15) ^ (31 ^ 3);
        llIIllllll[6] = 184 ^ 188;
        llIIllllll[7] = 43 ^ 25;
        llIIllllll[8] = (-1153) & 11651;
        llIIllllll[9] = (-25601) & 28093;
        llIIllllll[10] = (-((-10241) & 14397)) & (-1) & 6655;
        llIIllllll[11] = (-((-8809) & 11886)) & (-8321) & 12207;
        llIIllllll[12] = (-((-4361) & 30091)) & (-2081) & 28651;
        llIIllllll[13] = (-29745) & 30587;
        llIIllllll[14] = (-((-14605) & 32173)) & (-8197) & 26613;
        llIIllllll[15] = (-26765) & 27646;
        llIIllllll[16] = (-((-1) & 29909)) & (-1) & 30717;
        llIIllllll[17] = (-22553) & 23647;
        llIIllllll[18] = (-4419) & 5587;
        llIIllllll[19] = (-12807) & 13935;
        llIIllllll[20] = (-((-10118) & 14223)) & (-17537) & 32767;
        llIIllllll[21] = (-((-1) & 12291)) & (-2386) & 16379;
        llIIllllll[22] = (-((-5201) & 21757)) & (-2049) & 31229;
        llIIllllll[23] = (-24611) & 32619;
        llIIllllll[24] = 152 ^ 146;
        llIIllllll[25] = (-((-16747) & 25071)) & (-18) & 16351;
        llIIllllll[26] = (-((-1307) & 32155)) & (-5) & 31231;
        llIIllllll[27] = (33 ^ 80) ^ (102 ^ 9);
        llIIllllll[28] = (-16465) & 17271;
        llIIllllll[29] = (-2312) & 11191;
        llIIllllll[30] = 149 ^ 147;
        llIIllllll[31] = 83 ^ 71;
        llIIllllll[32] = 137 ^ 142;
        llIIllllll[33] = 41 ^ 33;
        llIIllllll[34] = (-20742) & 29623;
        llIIllllll[35] = 165 ^ 172;
        llIIllllll[36] = (72 ^ 16) ^ (74 ^ 58);
        llIIllllll[37] = (((106 + 10) - 84) + 117) ^ (((61 + 116) - 64) + 45);
        llIIllllll[38] = (((149 + 101) - 92) + 20) ^ (((28 + 34) - (-96)) + 32);
        llIIllllll[39] = 206 ^ 195;
        llIIllllll[40] = (((5 + 12) - (-107)) + 29) ^ (((18 + 16) - (-29)) + 88);
        llIIllllll[41] = (((168 ^ 148) + "  ".length()) - (-(19 ^ 78))) + (33 ^ 116);
        llIIllllll[42] = 45 ^ 34;
        llIIllllll[43] = (((108 + 95) - 112) + 47) ^ (((38 + 13) - (-63)) + 40);
        llIIllllll[44] = (((75 + 135) - 125) + 53) ^ (((133 + 81) - 73) + 14);
        llIIllllll[45] = (45 ^ 76) ^ (230 ^ 149);
        llIIllllll[46] = (-6) & 15005;
        llIIllllll[47] = (-8234) & 10233;
        llIIllllll[48] = (-((-16449) & 20545)) & (-4) & 15099;
        llIIllllll[49] = (-(((96 + 25) - 12) + 25)) & (-17729) & 24527;
        llIIllllll[50] = (-((-3747) & 32683)) & (-1154) & 65535;
        llIIllllll[51] = (-((-6477) & 7661)) & (-16389) & 24572;
        llIIllllll[52] = (-4372) & 21491;
        llIIllllll[53] = 118 ^ 85;
        llIIllllll[54] = (((72 + 171) - 92) + 89) ^ (((23 + 142) - 111) + 94);
        llIIllllll[55] = (-((-705) & 19180)) & (-12945) & 31739;
        llIIllllll[56] = (-((-7386) & 7677)) & (-16401) & 28671;
        llIIllllll[57] = (-71) & 25070;
        llIIllllll[58] = (-((-7307) & 15547)) & (-9) & 16255;
        llIIllllll[59] = (-16468) & 17367;
        llIIllllll[60] = (91 ^ 124) ^ (76 ^ 120);
        llIIllllll[61] = 134 ^ 147;
        llIIllllll[62] = 42 ^ 60;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0506, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0588, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x05c2, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x05fc, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0636, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0670, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x06aa, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x06e4, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x071e, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0758, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e4, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011e, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0158, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0192, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024a, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0284, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02be, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02f8, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0332, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x036c, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x041e, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0458, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0492, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04cc, code lost:
        if (lIlIlllllIIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L102;
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
        if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[7]) && lIlIllllllIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIllllll[41]) && lIlIlllllIllI(Skills.getLevel(Skill.DEFENCE), llIIllllll[36])) {
            int[] iArr = new int[llIIllllll[1]];
            iArr[llIIllllll[0]] = llIIllllll[9];
            if (lIlIlllllIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIllllll[1]];
                iArr2[llIIllllll[0]] = llIIllllll[9];
            }
            int[] iArr3 = new int[llIIllllll[1]];
            iArr3[llIIllllll[0]] = llIIllllll[10];
            if (lIlIlllllIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIllllll[1]];
                iArr4[llIIllllll[0]] = llIIllllll[10];
            }
            int[] iArr5 = new int[llIIllllll[1]];
            iArr5[llIIllllll[0]] = llIIllllll[18];
            if (lIlIlllllIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIllllll[1]];
                iArr6[llIIllllll[0]] = llIIllllll[18];
            }
            int[] iArr7 = new int[llIIllllll[1]];
            iArr7[llIIllllll[0]] = llIIllllll[20];
            if (lIlIlllllIIll(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIllllll[1]];
                iArr8[llIIllllll[0]] = llIIllllll[20];
            }
            int[] iArr9 = new int[llIIllllll[1]];
            iArr9[llIIllllll[0]] = llIIllllll[11];
            if (lIlIlllllIIll(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIllllll[1]];
                iArr10[llIIllllll[0]] = llIIllllll[11];
            }
            int[] iArr11 = new int[llIIllllll[1]];
            iArr11[llIIllllll[0]] = llIIllllll[8];
            if (lIlIlllllIIll(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIllllll[1]];
                iArr12[llIIllllll[0]] = llIIllllll[8];
            }
            int[] iArr13 = new int[llIIllllll[1]];
            iArr13[llIIllllll[0]] = llIIllllll[26];
            if (lIlIlllllIIIl(Inventory.contains(iArr13) ? 1 : 0)) {
                ?? r0 = llIIllllll[1];
                "".length();
                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIllllll[0];
        } else if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[7]) && lIlIllllllIII(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIIllllll[41]) && lIlIlllllIIlI(Skills.getLevel(Skill.DEFENCE), llIIllllll[36])) {
            int[] iArr14 = new int[llIIllllll[1]];
            iArr14[llIIllllll[0]] = llIIllllll[9];
            if (lIlIlllllIIll(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[llIIllllll[1]];
                iArr15[llIIllllll[0]] = llIIllllll[9];
            }
            int[] iArr16 = new int[llIIllllll[1]];
            iArr16[llIIllllll[0]] = llIIllllll[19];
            if (lIlIlllllIIll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIIllllll[1]];
                iArr17[llIIllllll[0]] = llIIllllll[19];
            }
            int[] iArr18 = new int[llIIllllll[1]];
            iArr18[llIIllllll[0]] = llIIllllll[18];
            if (lIlIlllllIIll(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[llIIllllll[1]];
                iArr19[llIIllllll[0]] = llIIllllll[18];
            }
            int[] iArr20 = new int[llIIllllll[1]];
            iArr20[llIIllllll[0]] = llIIllllll[20];
            if (lIlIlllllIIll(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[llIIllllll[1]];
                iArr21[llIIllllll[0]] = llIIllllll[20];
            }
            int[] iArr22 = new int[llIIllllll[1]];
            iArr22[llIIllllll[0]] = llIIllllll[11];
            if (lIlIlllllIIll(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIIllllll[1]];
                iArr23[llIIllllll[0]] = llIIllllll[11];
            }
            int[] iArr24 = new int[llIIllllll[1]];
            iArr24[llIIllllll[0]] = llIIllllll[8];
            if (lIlIlllllIIll(Inventory.contains(iArr24) ? 1 : 0)) {
                int[] iArr25 = new int[llIIllllll[1]];
                iArr25[llIIllllll[0]] = llIIllllll[8];
            }
            int[] iArr26 = new int[llIIllllll[1]];
            iArr26[llIIllllll[0]] = llIIllllll[26];
            if (lIlIlllllIIIl(Inventory.contains(iArr26) ? 1 : 0)) {
                ?? r02 = llIIllllll[1];
                "".length();
                return ((50 ^ 56) & ((67 ^ 73) ^ (-1))) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
            }
            return llIIllllll[0];
        } else if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[27]) && lIlIlllllIIlI(Skills.getLevel(Skill.RANGED), llIIllllll[7])) {
            int[] iArr27 = new int[llIIllllll[1]];
            iArr27[llIIllllll[0]] = llIIllllll[17];
            if (lIlIlllllIIll(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[llIIllllll[1]];
                iArr28[llIIllllll[0]] = llIIllllll[17];
            }
            int[] iArr29 = new int[llIIllllll[1]];
            iArr29[llIIllllll[0]] = llIIllllll[19];
            if (lIlIlllllIIll(Inventory.contains(iArr29) ? 1 : 0)) {
                int[] iArr30 = new int[llIIllllll[1]];
                iArr30[llIIllllll[0]] = llIIllllll[19];
            }
            int[] iArr31 = new int[llIIllllll[1]];
            iArr31[llIIllllll[0]] = llIIllllll[18];
            if (lIlIlllllIIll(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[llIIllllll[1]];
                iArr32[llIIllllll[0]] = llIIllllll[18];
            }
            int[] iArr33 = new int[llIIllllll[1]];
            iArr33[llIIllllll[0]] = llIIllllll[20];
            if (lIlIlllllIIll(Inventory.contains(iArr33) ? 1 : 0)) {
                int[] iArr34 = new int[llIIllllll[1]];
                iArr34[llIIllllll[0]] = llIIllllll[20];
            }
            int[] iArr35 = new int[llIIllllll[1]];
            iArr35[llIIllllll[0]] = llIIllllll[16];
            if (lIlIlllllIIll(Inventory.contains(iArr35) ? 1 : 0)) {
                int[] iArr36 = new int[llIIllllll[1]];
                iArr36[llIIllllll[0]] = llIIllllll[16];
            }
            int[] iArr37 = new int[llIIllllll[1]];
            iArr37[llIIllllll[0]] = llIIllllll[26];
            if (lIlIlllllIIIl(Inventory.contains(iArr37) ? 1 : 0)) {
                ?? r03 = llIIllllll[1];
                "".length();
                return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
            }
            return llIIllllll[0];
        } else {
            int[] iArr38 = new int[llIIllllll[1]];
            iArr38[llIIllllll[0]] = llIIllllll[17];
            if (lIlIlllllIIll(Inventory.contains(iArr38) ? 1 : 0)) {
                int[] iArr39 = new int[llIIllllll[1]];
                iArr39[llIIllllll[0]] = llIIllllll[17];
            }
            int[] iArr40 = new int[llIIllllll[1]];
            iArr40[llIIllllll[0]] = llIIllllll[19];
            if (lIlIlllllIIll(Inventory.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[llIIllllll[1]];
                iArr41[llIIllllll[0]] = llIIllllll[19];
            }
            int[] iArr42 = new int[llIIllllll[1]];
            iArr42[llIIllllll[0]] = llIIllllll[18];
            if (lIlIlllllIIll(Inventory.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[llIIllllll[1]];
                iArr43[llIIllllll[0]] = llIIllllll[18];
            }
            int[] iArr44 = new int[llIIllllll[1]];
            iArr44[llIIllllll[0]] = llIIllllll[20];
            if (lIlIlllllIIll(Inventory.contains(iArr44) ? 1 : 0)) {
                int[] iArr45 = new int[llIIllllll[1]];
                iArr45[llIIllllll[0]] = llIIllllll[20];
            }
            int[] iArr46 = new int[llIIllllll[1]];
            iArr46[llIIllllll[0]] = llIIllllll[15];
            if (lIlIlllllIIll(Inventory.contains(iArr46) ? 1 : 0)) {
                int[] iArr47 = new int[llIIllllll[1]];
                iArr47[llIIllllll[0]] = llIIllllll[15];
            }
            int[] iArr48 = new int[llIIllllll[1]];
            iArr48[llIIllllll[0]] = llIIllllll[12];
            if (lIlIlllllIIll(Inventory.contains(iArr48) ? 1 : 0)) {
                int[] iArr49 = new int[llIIllllll[1]];
                iArr49[llIIllllll[0]] = llIIllllll[12];
            }
            int[] iArr50 = new int[llIIllllll[1]];
            iArr50[llIIllllll[0]] = llIIllllll[13];
            if (lIlIlllllIIll(Inventory.contains(iArr50) ? 1 : 0)) {
                int[] iArr51 = new int[llIIllllll[1]];
                iArr51[llIIllllll[0]] = llIIllllll[13];
            }
            int[] iArr52 = new int[llIIllllll[1]];
            iArr52[llIIllllll[0]] = llIIllllll[14];
            if (lIlIlllllIIll(Inventory.contains(iArr52) ? 1 : 0)) {
                int[] iArr53 = new int[llIIllllll[1]];
                iArr53[llIIllllll[0]] = llIIllllll[14];
            }
            int[] iArr54 = new int[llIIllllll[1]];
            iArr54[llIIllllll[0]] = llIIllllll[16];
            if (lIlIlllllIIll(Inventory.contains(iArr54) ? 1 : 0)) {
                int[] iArr55 = new int[llIIllllll[1]];
                iArr55[llIIllllll[0]] = llIIllllll[16];
            }
            int[] iArr56 = new int[llIIllllll[1]];
            iArr56[llIIllllll[0]] = llIIllllll[26];
            if (lIlIlllllIIIl(Inventory.contains(iArr56) ? 1 : 0)) {
                ?? r04 = llIIllllll[1];
                "".length();
                return (-" ".length()) > 0 ? ((202 ^ 143) ^ (154 ^ 130)) & (((53 ^ 32) ^ (62 ^ 118)) ^ (-" ".length())) : r04;
            }
            return llIIllllll[0];
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIlllllI[llIIllllll[60]];
    }

    private static boolean lIlIlllllIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIlllllIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIlllllIllI(Skills.getLevel(Skill.RANGED), llIIllllll[7])) {
            ?? r0 = llIIllllll[1];
            "".length();
            return (((((90 + 11) - 93) + 170) ^ (((11 + 9) - (-80)) + 66)) & (((242 ^ 129) ^ (23 ^ 112)) ^ (-" ".length()))) > "   ".length() ? ((44 ^ 27) ^ (223 ^ 170)) & (((((117 + 175) - 195) + 158) ^ (((15 + 82) - 2) + 94)) ^ (-" ".length())) : r0;
        }
        return llIIllllll[0];
    }
}
