package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.F  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/F.class */
public class F implements S {
    private static /* synthetic */ String[] llllIIIlII;
    public static /* synthetic */ WorldPoint hc;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] llllIIlIII;
    static /* synthetic */ int ck;
    static /* synthetic */ int bS;
    private static final /* synthetic */ String[] hb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[llllIIlIII[1]];
        iArr[llllIIlIII[0]] = llllIIlIII[11];
        if (llIIllIIlIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llllIIlIII[1]];
            iArr2[llllIIlIII[0]] = llllIIlIII[12];
            if (llIIllIIlIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llllIIlIII[1]];
                iArr3[llllIIlIII[0]] = llllIIlIII[9];
                if (llIIllIIlIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = llllIIlIII[1];
                    "".length();
                    return " ".length() > " ".length() ? ((230 ^ 143) ^ (14 ^ 37)) & (((184 ^ 169) ^ (79 ^ 28)) ^ (-" ".length())) : r0;
                }
            }
        }
        return llllIIlIII[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x04c4, code lost:
        if (llIIllIIlllII(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0521, code lost:
        if (llIIllIIlIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v321, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v330, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v365, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cq() {
        if (llIIllIIlIlIl(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[0]];
            C0001b.a(bu);
            if (llIIllIIlIllI(bu.size(), llllIIlIII[1])) {
                System.out.println(llllIIIlII[llllIIlIII[1]]);
                bs = llllIIlIII[0];
            }
        }
        if (llIIllIIlIlll(bs ? 1 : 0)) {
            if (llIIllIIlIlIl(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIllIIlIllI(Movement.getRunEnergy(), llllIIlIII[2]) && llIIllIIlIlll(Dialog.isOpen() ? 1 : 0)) {
                Inventory.getFirst(C0005f.aU).interact(llllIIIlII[llllIIlIII[3]]);
                Time.sleepTicks(llllIIlIII[1]);
                "".length();
            }
            if (llIIllIIlIlll(aa() ? 1 : 0) && llIIllIIlIllI(C0004e.j(llllIIlIII[4]), llllIIlIII[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIllIIllIII(nearest) && llIIllIIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[5]];
                    C0000a.a(nearest);
                }
                if (llIIllIIllIII(nearest) && llIIllIIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIllIIlIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[6]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIIlIII[7]);
                        "".length();
                    }
                    if (llIIllIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[8]];
                        if (llIIllIIllIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIIlIII[6]);
                            "".length();
                        }
                        if (llIIllIIllIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIIlIII[3]);
                            "".length();
                        }
                        int[] iArr = new int[llllIIlIII[1]];
                        iArr[llllIIlIII[0]] = llllIIlIII[9];
                        if (llIIllIIlIlIl(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llllIIlIII[1]];
                            iArr2[llllIIlIII[0]] = llllIIlIII[9];
                            if (llIIllIIlIllI(Bank.getFirst(iArr2).getQuantity(), llllIIlIII[5])) {
                                ae();
                                System.out.println(llllIIIlII[llllIIlIII[10]]);
                                bs = llllIIlIII[1];
                                return;
                            }
                        }
                        int[] iArr3 = new int[llllIIlIII[8]];
                        iArr3[llllIIlIII[0]] = llllIIlIII[11];
                        iArr3[llllIIlIII[1]] = llllIIlIII[12];
                        iArr3[llllIIlIII[3]] = llllIIlIII[9];
                        iArr3[llllIIlIII[5]] = llllIIlIII[13];
                        iArr3[llllIIlIII[6]] = llllIIlIII[14];
                        if (llIIllIIlIlll(C0004e.b(iArr3) ? 1 : 0)) {
                            ae();
                            System.out.println(llllIIIlII[llllIIlIII[15]]);
                            bs = llllIIlIII[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[llllIIlIII[8]];
                    iArr4[llllIIlIII[0]] = llllIIlIII[11];
                    iArr4[llllIIlIII[1]] = llllIIlIII[12];
                    iArr4[llllIIlIII[3]] = llllIIlIII[9];
                    iArr4[llllIIlIII[5]] = llllIIlIII[13];
                    iArr4[llllIIlIII[6]] = llllIIlIII[14];
                    if (llIIllIIlIlIl(C0004e.b(iArr4) ? 1 : 0)) {
                        Bank.withdraw(llllIIlIII[11], llllIIlIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllIIlIII[1]);
                        "".length();
                        Bank.withdraw(llllIIlIII[12], llllIIlIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllIIlIII[1]);
                        "".length();
                        Bank.withdraw(llllIIlIII[9], llllIIlIII[5], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllIIlIII[1]);
                        "".length();
                        Bank.withdraw(llllIIlIII[13], llllIIlIII[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllIIlIII[1]);
                        "".length();
                        Bank.withdraw(llllIIlIII[14], llllIIlIII[5], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllIIlIII[1]);
                        "".length();
                        C0000a.b(C0005f.be, llllIIlIII[1]);
                        Time.sleepTicks(llllIIlIII[5]);
                        "".length();
                    }
                }
            }
            if (llIIllIIlIlIl(aa() ? 1 : 0) && llIIllIIlIllI(C0004e.j(llllIIlIII[4]), llllIIlIII[1])) {
                if (llIIllIIlIllI(bS, llllIIlIII[1])) {
                    C0004e.v();
                    bS += llllIIlIII[1];
                }
                if (llIIllIIllIIl(bS)) {
                    if (llIIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(hc), llllIIlIII[8])) {
                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[16]];
                        Movement.walkTo(hc);
                        "".length();
                        Time.sleepTicks(llllIIlIII[1]);
                        "".length();
                    }
                    if (llIIllIIllIll(Players.getLocal().getWorldLocation().distanceTo(hc), llllIIlIII[8])) {
                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[17]];
                        String[] strArr = new String[llllIIlIII[1]];
                        strArr[llllIIlIII[0]] = llllIIIlII[llllIIlIII[18]];
                        TileObject nearest2 = TileObjects.getNearest(strArr);
                        if (llIIllIIllIII(nearest2)) {
                            String[] strArr2 = new String[llllIIlIII[1]];
                            strArr2[llllIIlIII[0]] = llllIIIlII[llllIIlIII[19]];
                            if (llIIllIIlIlIl(nearest2.hasAction(strArr2) ? 1 : 0)) {
                                nearest2.interact(llllIIIlII[llllIIlIII[20]]);
                                Time.sleepTicks(llllIIlIII[5]);
                                "".length();
                            }
                        }
                        C0006g.a(llllIIIlII[llllIIlIII[21]], hb);
                    }
                }
            }
            int[] iArr5 = new int[llllIIlIII[1]];
            iArr5[llllIIlIII[0]] = llllIIlIII[22];
            if (llIIllIIllIII(NPCs.getNearest(iArr5))) {
                int[] iArr6 = new int[llllIIlIII[1]];
                iArr6[llllIIlIII[0]] = llllIIlIII[23];
                if (llIIllIIllIII(NPCs.getNearest(iArr6))) {
                    int[] iArr7 = new int[llllIIlIII[1]];
                    iArr7[llllIIlIII[0]] = llllIIlIII[24];
                }
            }
            C0006g.a(hb);
            if (llIIllIIlllIl(C0004e.j(llllIIlIII[4]), llllIIlIII[5])) {
                String[] strArr3 = new String[llllIIlIII[1]];
                strArr3[llllIIlIII[0]] = llllIIIlII[llllIIlIII[25]];
                if (llIIllIIlIlll(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llllIIlIII[1]];
                    strArr4[llllIIlIII[0]] = llllIIIlII[llllIIlIII[26]];
                }
                int[] iArr8 = new int[llllIIlIII[1]];
                iArr8[llllIIlIII[0]] = llllIIlIII[9];
                if (llIIllIIlIlIl(Inventory.contains(iArr8) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[27]];
                    String[] strArr5 = new String[llllIIlIII[1]];
                    strArr5[llllIIlIII[0]] = llllIIIlII[llllIIlIII[28]];
                    Item first = Inventory.getFirst(strArr5);
                    String[] strArr6 = new String[llllIIlIII[1]];
                    strArr6[llllIIlIII[0]] = llllIIIlII[llllIIlIII[29]];
                    Item first2 = Inventory.getFirst(strArr6);
                    int[] iArr9 = new int[llllIIlIII[1]];
                    iArr9[llllIIlIII[0]] = llllIIlIII[9];
                    Item first3 = Inventory.getFirst(iArr9);
                    if (llIIllIIllIII(first) && llIIllIIllIII(first3)) {
                        first.useOn(first3);
                        Time.sleepTicks(llllIIlIII[1]);
                        "".length();
                    }
                    int[] iArr10 = new int[llllIIlIII[1]];
                    iArr10[llllIIlIII[0]] = llllIIlIII[9];
                    Item first4 = Inventory.getFirst(iArr10);
                    if (llIIllIIllIII(first2) && llIIllIIllIII(first4)) {
                        first2.useOn(first4);
                    }
                }
            }
            if (llIIllIIlllIl(C0004e.j(llllIIlIII[4]), llllIIlIII[5])) {
                int[] iArr11 = new int[llllIIlIII[1]];
                iArr11[llllIIlIII[0]] = llllIIlIII[9];
                if (llIIllIIlIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                    String[] strArr7 = new String[llllIIlIII[1]];
                    strArr7[llllIIlIII[0]] = llllIIIlII[llllIIlIII[30]];
                    if (llIIllIIlIlll(Inventory.contains(strArr7) ? 1 : 0)) {
                        cc();
                    }
                }
            }
            if (llIIllIIlllIl(C0004e.j(llllIIlIII[4]), llllIIlIII[5])) {
                int[] iArr12 = new int[llllIIlIII[1]];
                iArr12[llllIIlIII[0]] = llllIIlIII[9];
                if (llIIllIIlIlIl(Inventory.contains(iArr12) ? 1 : 0)) {
                    String[] strArr8 = new String[llllIIlIII[1]];
                    strArr8[llllIIlIII[0]] = llllIIIlII[llllIIlIII[31]];
                    if (llIIllIIlIlIl(Inventory.contains(strArr8) ? 1 : 0)) {
                        ck = llllIIlIII[0];
                        if (llIIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(hc), llllIIlIII[8])) {
                            AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[32]];
                            Movement.walkTo(hc);
                            "".length();
                            Time.sleepTicks(llllIIlIII[1]);
                            "".length();
                        }
                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[33]];
                        C0006g.a(llllIIIlII[llllIIlIII[34]], hb, llllIIlIII[1]);
                    }
                }
            }
            if (llIIllIIlllIl(C0004e.j(llllIIlIII[4]), llllIIlIII[35])) {
                String[] strArr9 = new String[llllIIlIII[1]];
                strArr9[llllIIlIII[0]] = llllIIIlII[llllIIlIII[36]];
                if (llIIllIIlIlll(Inventory.contains(strArr9) ? 1 : 0)) {
                    cc();
                }
            }
            if (llIIllIIlllIl(C0004e.j(llllIIlIII[4]), llllIIlIII[35])) {
                String[] strArr10 = new String[llllIIlIII[1]];
                strArr10[llllIIlIII[0]] = llllIIIlII[llllIIlIII[37]];
                if (llIIllIIlIlIl(Inventory.contains(strArr10) ? 1 : 0)) {
                    if (llIIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(hc), llllIIlIII[8])) {
                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[38]];
                        Movement.walkTo(hc);
                        "".length();
                        Time.sleepTicks(llllIIlIII[1]);
                        "".length();
                    }
                    AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[39]];
                    C0006g.a(llllIIIlII[llllIIlIII[40]], hb, llllIIlIII[1]);
                }
            }
            if (llIIllIIlllIl(C0004e.j(llllIIlIII[4]), llllIIlIII[41])) {
                int[] iArr13 = new int[llllIIlIII[1]];
                iArr13[llllIIlIII[0]] = llllIIlIII[9];
                if (llIIllIIlIlll(Inventory.contains(iArr13) ? 1 : 0)) {
                    cc();
                }
            }
            if (llIIllIIlllIl(C0004e.j(llllIIlIII[4]), llllIIlIII[41])) {
                int[] iArr14 = new int[llllIIlIII[1]];
                iArr14[llllIIlIII[0]] = llllIIlIII[9];
                if (llIIllIIlIlIl(Inventory.contains(iArr14) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[42]];
                    if (llIIllIIlIllI(ck, llllIIlIII[1])) {
                        ac.mV += llllIIlIII[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += llllIIlIII[1];
                        ac.mV = llllIIlIII[0];
                        cl = llllIIlIII[0];
                    }
                    if (llIIllIIllIlI(Players.getLocal().getWorldLocation().distanceTo(hc), llllIIlIII[8])) {
                        AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[43]];
                        Movement.walkTo(hc);
                        "".length();
                        Time.sleepTicks(llllIIlIII[1]);
                        "".length();
                    }
                    C0006g.a(llllIIIlII[llllIIlIII[44]], hb, llllIIlIII[1]);
                }
            }
            Widget widget = Widgets.get(llllIIlIII[45], llllIIlIII[26]);
            if (llIIllIIllIII(widget)) {
                widget.interact(llllIIlIII[0]);
            }
            C0006g.a(new String[llllIIlIII[0]]);
        }
    }

    private static void llIIllIIlIlII() {
        llllIIlIII = new int[74];
        llllIIlIII[0] = (107 ^ 81) & ((182 ^ 140) ^ (-1));
        llllIIlIII[1] = " ".length();
        llllIIlIII[2] = 40 ^ 99;
        llllIIlIII[3] = "  ".length();
        llllIIlIII[4] = 167 ^ 153;
        llllIIlIII[5] = "   ".length();
        llllIIlIII[6] = (103 ^ 106) ^ (11 ^ 2);
        llllIIlIII[7] = (-((-23697) & 31987)) & (-19477) & 32766;
        llllIIlIII[8] = (((133 + 118) - 214) + 135) ^ (((109 + 62) - 58) + 56);
        llllIIlIII[9] = (-((-10307) & 14559)) & (-2626) & 7165;
        llllIIlIII[10] = (((71 + 34) - (-17)) + 19) ^ (((23 + 24) - (-49)) + 43);
        llllIIlIII[11] = (-((-11907) & 28563)) & (-12297) & 30719;
        llllIIlIII[12] = (-((-9281) & 32081)) & (-8199) & 32767;
        llllIIlIII[13] = (-((-24949) & 28661)) & (-16429) & 32765;
        llllIIlIII[14] = (-165) & 8173;
        llllIIlIII[15] = 136 ^ 143;
        llllIIlIII[16] = (121 ^ 50) ^ (51 ^ 112);
        llllIIlIII[17] = (147 ^ 198) ^ (156 ^ 192);
        llllIIlIII[18] = (((149 + 147) - 198) + 63) ^ (((36 + 65) - (-23)) + 47);
        llllIIlIII[19] = 130 ^ 137;
        llllIIlIII[20] = (236 ^ 136) ^ (40 ^ 64);
        llllIIlIII[21] = 177 ^ 188;
        llllIIlIII[22] = (-((-8385) & 10703)) & (-20546) & 23535;
        llllIIlIII[23] = (-14663) & 15335;
        llllIIlIII[24] = (-((-1337) & 15737)) & (-1) & 15071;
        llllIIlIII[25] = (192 ^ 129) ^ (231 ^ 168);
        llllIIlIII[26] = 45 ^ 34;
        llllIIlIII[27] = 53 ^ 37;
        llllIIlIII[28] = (15 ^ 77) ^ (119 ^ 36);
        llllIIlIII[29] = 174 ^ 188;
        llllIIlIII[30] = (((115 + 59) - 79) + 50) ^ (((82 + 110) - 153) + 91);
        llllIIlIII[31] = 86 ^ 66;
        llllIIlIII[32] = (57 ^ 116) ^ (248 ^ 160);
        llllIIlIII[33] = (((8 + 100) - 74) + 125) ^ (((69 + 59) - 76) + 85);
        llllIIlIII[34] = 122 ^ 109;
        llllIIlIII[35] = (-((-9073) & 28529)) & (-4362) & 24333;
        llllIIlIII[36] = (62 ^ 47) ^ (66 ^ 75);
        llllIIlIII[37] = (115 ^ 100) ^ (96 ^ 110);
        llllIIlIII[38] = (((34 + 64) - 92) + 129) ^ (((61 + 85) - 139) + 150);
        llllIIlIII[39] = (((47 + 122) - 158) + 123) ^ (((10 + 31) - (-106)) + 10);
        llllIIlIII[40] = 172 ^ 176;
        llllIIlIII[41] = (-((-2053) & 31551)) & (-1) & 30527;
        llllIIlIII[42] = 187 ^ 166;
        llllIIlIII[43] = (61 ^ 41) ^ (161 ^ 171);
        llllIIlIII[44] = 94 ^ 65;
        llllIIlIII[45] = (-((-20677) & 29415)) & (-65) & 9079;
        llllIIlIII[46] = (((5 + 97) - (-29)) + 30) ^ (((23 + 87) - (-14)) + 5);
        llllIIlIII[47] = 151 ^ 182;
        llllIIlIII[48] = (9 ^ 15) ^ (122 ^ 94);
        llllIIlIII[49] = (15 ^ 120) ^ (85 ^ 1);
        llllIIlIII[50] = (78 ^ 114) ^ (39 ^ 63);
        llllIIlIII[51] = 168 ^ 141;
        llllIIlIII[52] = 46 ^ 8;
        llllIIlIII[53] = 184 ^ 159;
        llllIIlIII[54] = (((163 + 55) - 190) + 158) ^ (((126 + 91) - 164) + 93);
        llllIIlIII[55] = 23 ^ 62;
        llllIIlIII[56] = (-((-12898) & 31333)) & (-5329) & 32763;
        llllIIlIII[57] = (-(2 ^ 32)) & (-257) & 12269;
        llllIIlIII[58] = (-((-17825) & 21943)) & (-3074) & 32191;
        llllIIlIII[59] = (-((-1893) & 26493)) & (-129) & 32735;
        llllIIlIII[60] = (-((-10565) & 27078)) & (-4115) & 22527;
        llllIIlIII[61] = 16 ^ 116;
        llllIIlIII[62] = 155 ^ 177;
        llllIIlIII[63] = 64 ^ 107;
        llllIIlIII[64] = 37 ^ 9;
        llllIIlIII[65] = 139 ^ 166;
        llllIIlIII[66] = 0 ^ 46;
        llllIIlIII[67] = 76 ^ 99;
        llllIIlIII[68] = (((148 + 1) - (-38)) + 4) ^ (((91 + 74) - 148) + 126);
        llllIIlIII[69] = 28 ^ 45;
        llllIIlIII[70] = (197 ^ 171) ^ (0 ^ 92);
        llllIIlIII[71] = (-((-331) & 29035)) & (-1025) & 32685;
        llllIIlIII[72] = (-25090) & 28601;
        llllIIlIII[73] = 47 ^ 28;
    }

    private static boolean llIIllIIllIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIIlIII[0];
    }

    private static boolean llIIllIIllIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
        if (llIIllIIlIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.F.llllIIlIII[5]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[llllIIlIII[1]];
        iArr4[llllIIlIII[0]] = llllIIlIII[11];
        if (llIIllIIlIlll(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIII[11], llllIIlIII[1], llllIIlIII[56]));
            "".length();
        }
        int[] iArr5 = new int[llllIIlIII[1]];
        iArr5[llllIIlIII[0]] = llllIIlIII[12];
        if (llIIllIIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(llllIIlIII[12], llllIIlIII[1], llllIIlIII[56]));
            "".length();
        }
        int[] iArr6 = new int[llllIIlIII[1]];
        iArr6[llllIIlIII[0]] = llllIIlIII[9];
        if (llIIllIIlIlIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[llllIIlIII[1]];
            iArr7[llllIIlIII[0]] = llllIIlIII[9];
            if (llIIllIIlIlIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llllIIlIII[1]];
                iArr8[llllIIlIII[0]] = llllIIlIII[9];
            }
            iArr = new int[llllIIlIII[1]];
            iArr[llllIIlIII[0]] = llllIIlIII[14];
            if (llIIllIIlIlll(Bank.contains(iArr) ? 1 : 0)) {
                bu.add(new C0003d(llllIIlIII[14], llllIIlIII[8], llllIIlIII[56]));
                "".length();
            }
            if (llIIllIIlIlll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llllIIIlII[llllIIlIII[63]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(llllIIlIII[57], llllIIlIII[8], llllIIlIII[58]));
                "".length();
            }
            iArr2 = new int[llllIIlIII[1]];
            iArr2[llllIIlIII[0]] = llllIIlIII[59];
            if (llIIllIIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
                bu.add(new C0003d(llllIIlIII[59], llllIIlIII[54], llllIIlIII[60]));
                "".length();
            }
            iArr3 = new int[llllIIlIII[1]];
            iArr3[llllIIlIII[0]] = llllIIlIII[13];
            if (llIIllIIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
                return;
            }
            bu.add(new C0003d(llllIIlIII[13], llllIIlIII[8], C0008i.bp));
            "".length();
            return;
        }
        bu.add(new C0003d(llllIIlIII[9], llllIIlIII[5], llllIIlIII[56]));
        "".length();
        iArr = new int[llllIIlIII[1]];
        iArr[llllIIlIII[0]] = llllIIlIII[14];
        if (llIIllIIlIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (llIIllIIlIlll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llllIIIlII[llllIIlIII[63]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[llllIIlIII[1]];
        iArr2[llllIIlIII[0]] = llllIIlIII[59];
        if (llIIllIIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llllIIlIII[1]];
        iArr3[llllIIlIII[0]] = llllIIlIII[13];
        if (llIIllIIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean llIIllIIlllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIllIIlIlIl(int i) {
        return i != 0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            cq();
            "".length();
            if ((((8 ^ 13) ^ (24 ^ 47)) & (((125 ^ 108) ^ (79 ^ 108)) ^ (-" ".length()))) >= "  ".length()) {
                return ((113 ^ 124) ^ ((80 ^ 2) & ((91 ^ 9) ^ (-1)))) & (((36 ^ 70) ^ (110 ^ 1)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
        }
        return llllIIlIII[61];
    }

    private static boolean llIIllIIllIIl(int i) {
        return i > 0;
    }

    private static boolean llIIllIIlllII(Object obj) {
        return obj == null;
    }

    private static void cr() {
        String[] strArr = new String[llllIIlIII[1]];
        strArr[llllIIlIII[0]] = llllIIIlII[llllIIlIII[51]];
        if (llIIllIIlIlll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llllIIlIII[1]];
            strArr2[llllIIlIII[0]] = llllIIIlII[llllIIlIII[52]];
            if (!llIIllIIlIlIl(Inventory.contains(strArr2) ? 1 : 0)) {
                return;
            }
        }
        int[] iArr = new int[llllIIlIII[1]];
        iArr[llllIIlIII[0]] = llllIIlIII[9];
        if (llIIllIIlIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            if (llIIllIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                Time.sleepTicks(C0004e.c(llllIIlIII[3], llllIIlIII[5]));
                "".length();
            }
            AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[53]];
            String[] strArr3 = new String[llllIIlIII[1]];
            strArr3[llllIIlIII[0]] = llllIIIlII[llllIIlIII[54]];
            Item first = Inventory.getFirst(strArr3);
            String[] strArr4 = new String[llllIIlIII[1]];
            strArr4[llllIIlIII[0]] = llllIIIlII[llllIIlIII[55]];
            Item first2 = Inventory.getFirst(strArr4);
            int[] iArr2 = new int[llllIIlIII[1]];
            iArr2[llllIIlIII[0]] = llllIIlIII[9];
            Item first3 = Inventory.getFirst(iArr2);
            if (llIIllIIllIII(first) && llIIllIIllIII(first3)) {
                first.useOn(first3);
                Time.sleepTicks(llllIIlIII[1]);
                "".length();
            }
            int[] iArr3 = new int[llllIIlIII[1]];
            iArr3[llllIIlIII[0]] = llllIIlIII[9];
            Item first4 = Inventory.getFirst(iArr3);
            if (llIIllIIllIII(first2) && llIIllIIllIII(first4)) {
                first2.useOn(first4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if ((!llIIllIIllllI(C0004e.j(llllIIlIII[4]), llllIIlIII[10]) || llIIllIIllllI(C0004e.j(llllIIlIII[4]), llllIIlIII[18])) && !llIIllIIlllll(Quests.getState(Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            return llllIIlIII[0];
        }
        ?? r0 = llllIIlIII[1];
        "".length();
        return (-" ".length()) != (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    static {
        llIIllIIlIlII();
        llIIllIIlIIll();
        String[] strArr = new String[llllIIlIII[15]];
        strArr[llllIIlIII[0]] = llllIIIlII[llllIIlIII[64]];
        strArr[llllIIlIII[1]] = llllIIIlII[llllIIlIII[65]];
        strArr[llllIIlIII[3]] = llllIIIlII[llllIIlIII[66]];
        strArr[llllIIlIII[5]] = llllIIIlII[llllIIlIII[67]];
        strArr[llllIIlIII[6]] = llllIIIlII[llllIIlIII[68]];
        strArr[llllIIlIII[8]] = llllIIIlII[llllIIlIII[69]];
        strArr[llllIIlIII[10]] = llllIIIlII[llllIIlIII[70]];
        hb = strArr;
        bu = new ArrayList();
        hc = new WorldPoint(llllIIlIII[71], llllIIlIII[72], llllIIlIII[0]);
        bS = llllIIlIII[0];
    }

    private static boolean llIIllIIllIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIllIIllllI(int i, int i2) {
        return i >= i2;
    }

    private static void llIIllIIlIIll() {
        llllIIIlII = new String[llllIIlIII[73]];
        llllIIIlII[llllIIlIII[0]] = llIIlIlllllII("wM4RNBo+4q2S2f9QQssKRQ==", "zvJpq");
        llllIIIlII[llllIIlIII[1]] = llIIlIlllllIl("Ez4DHjw9MglXLSAuBBkodT4ZEiIme00EODwjDh8mOzBNFS42PE0DIHUmGBI8IQ==", "UWmwO");
        llllIIIlII[llllIIlIII[3]] = llIIlIllllllI("0EHy/BBo03k=", "gkdbL");
        llllIIIlII[llllIIlIII[5]] = llIIlIllllllI("R2QegSauLqGL6R8f2SsyzS5ZmWSeMCaB", "NBAWv");
        llllIIIlII[llllIIlIII[6]] = llIIlIlllllII("oGAVbK3jKjMZ83VE7oKHWw==", "gHPwv");
        llllIIIlII[llllIIlIII[8]] = llIIlIllllllI("k+ItL7U7LHvsP/puFN5ur6gQEXaPrAAQ", "FWSvQ");
        llllIIIlII[llllIIlIII[10]] = llIIlIllllllI("9CELv9Fvjn4L+yKr5zYB84QJQvkwTqJYCw/d9/ITQgGt1Hx+VgH845yxe9DvwxuMfnHMUvHxK9w=", "zkBOG");
        llllIIIlII[llllIIlIII[15]] = llIIlIlllllII("+1eEj6HBdCVFbY3/sxfIO+tW+2xE1axFtDv4GHLgio5KZLHjgobwqqwW5X042Zy+7/LILITWbAY=", "VFOJa");
        llllIIIlII[llllIIlIII[16]] = llIIlIlllllII("XcgGDTCSAnVSsHsH3I+4rw==", "tRxCC");
        llllIIIlII[llllIIlIII[17]] = llIIlIlllllII("scQNFaC6lquJ5FHmfW8x1A==", "kPslN");
        llllIIIlII[llllIIlIII[18]] = llIIlIlllllIl("HxAUEAFzFQkYFg==", "Sqfwd");
        llllIIIlII[llllIIlIII[19]] = llIIlIllllllI("VbvN1biaiys=", "VLdyu");
        llllIIIlII[llllIIlIII[20]] = llIIlIllllllI("NQUB9eDOugA=", "xnnUo");
        llllIIIlII[llllIIlIII[21]] = llIIlIlllllIl("EwwMJiY1BUIBMTodDCwuMQ==", "TibCT");
        llllIIIlII[llllIIlIII[25]] = llIIlIllllllI("PxGkTeCCUHoIpxb3Xs9Ynw==", "wlkue");
        llllIIIlII[llllIIlIII[26]] = llIIlIllllllI("bVpGmTdaw/s1afqH+/0T1g==", "jFqjZ");
        llllIIIlII[llllIIlIII[27]] = llIIlIlllllIl("AQgmCAJlED0LCjc=", "EqOfe");
        llllIIIlII[llllIIlIII[28]] = llIIlIlllllII("rWsc/7SuoqoKUmn7M0RPvw==", "qggac");
        llllIIIlII[llllIIlIII[29]] = llIIlIllllllI("ZI+aODLjYUfGupdc6Oxgbw==", "AybFr");
        llllIIIlII[llllIIlIII[30]] = llIIlIllllllI("jYfxOMHgQeiW5yrBa+kJUdtni6WSvwLW", "qEpPS");
        llllIIIlII[llllIIlIII[31]] = llIIlIllllllI("s4qYAbEh1eav8//TSUhHuAq/jzA/mszf", "brcwh");
        llllIIIlII[llllIIlIII[32]] = llIIlIlllllII("kyVV6h2wuRXE3MA1oloAeQ==", "OFfnd");
        llllIIIlII[llllIIlIII[33]] = llIIlIlllllIl("PRACGwwHAlAcC0kKAhQLDgA=", "iepue");
        llllIIIlII[llllIIlIII[34]] = llIIlIlllllIl("FQcLKCMzDkUPNDwWCyIrNw==", "RbeMQ");
        llllIIIlII[llllIIlIII[36]] = llIIlIlllllII("Hmkd+chGTB6LItX4gPKvnltzLgve/kIH", "JIbuB");
        llllIIIlII[llllIIlIII[37]] = llIIlIlllllIl("BAkhCkshCjYDAihFOQ4CKg==", "FeTok");
        llllIIIlII[llllIIlIII[38]] = llIIlIllllllI("aJnc1XxYVlozZx/CInx3/A==", "jqqQv");
        llllIIIlII[llllIIlIII[39]] = llIIlIlllllIl("IiUALy8YN1IoKFYyHjQj", "vPrAF");
        llllIIIlII[llllIIlIII[40]] = llIIlIlllllIl("PgoZPAsYA1cbHBcbGTYDHA==", "yowYy");
        llllIIIlII[llllIIlIII[42]] = llIIlIlllllIl("OAw8OwoCHm48DUwbPDoUAg==", "lyNUc");
        llllIIIlII[llllIIlIII[43]] = llIIlIlllllIl("JSUyUzMEZDcHJhkw", "kDDsG");
        llllIIIlII[llllIIlIII[44]] = llIIlIllllllI("Azy1NxUXXpbwdLN5Bv26pMTuWqT/C5FU", "SXhFL");
        llllIIIlII[llllIIlIII[46]] = llIIlIllllllI("Zj3sRnkX+4rwljlEyIWKPPeZVwsTPDy+", "uUoQG");
        llllIIIlII[llllIIlIII[47]] = llIIlIlllllIl("JDomGB8FLWMUFwUh", "kJCvv");
        llllIIIlII[llllIIlIII[48]] = llIIlIllllllI("qeAAuBMDqWai4UtOb28ScKQ/iFzDctd7", "GFJkC");
        llllIIIlII[llllIIlIII[49]] = llIIlIllllllI("vckK+vVdKjT+XOn91s3pU9YkAucLEmQpkj2P+zsWOr4s36aUOBOacRzl5Ec0l3P8MUFqmbUBaM0=", "owzHz");
        llllIIIlII[llllIIlIII[50]] = llIIlIlllllIl("OyhiKB0JbS8gHB8kLC5PHTgnOhtMPjc5HwAkJzpDTD41IBsPJSsnCEw5LWktORQLByg=", "lMBIo");
        llllIIIlII[llllIIlIII[51]] = llIIlIlllllII("rpu1zMFgqaKb7DBLNvptxQ==", "phbTi");
        llllIIIlII[llllIIlIII[52]] = llIIlIlllllII("R8EIOGo3GqUF5E5oi8LOXw==", "sVEPt");
        llllIIIlII[llllIIlIII[53]] = llIIlIlllllII("63f9NSRyJy6a9tKOdMSThQ==", "UPoJp");
        llllIIIlII[llllIIlIII[54]] = llIIlIlllllIl("KzojBz0BaCYQPw==", "dHBiZ");
        llllIIIlII[llllIIlIII[55]] = llIIlIlllllII("IB5gZYttgbWajpcvczrCXw==", "fLOfx");
        llllIIIlII[llllIIlIII[62]] = llIIlIlllllIl("EQAVOSc4TzM8PjoAGjQtLw==", "VowUN");
        llllIIIlII[llllIIlIII[63]] = llIIlIllllllI("pKCjy+GDO3x3zNOivtl4I+1NAthczepb", "cyHzB");
        llllIIIlII[llllIIlIII[64]] = llIIlIlllllII("iqPCKssdSn8=", "YLwSm");
        llllIIIlII[llllIIlIII[65]] = llIIlIlllllII("Z+chZF6Sea9GHH2NKJDlbCeygUttI8k8EFvoxhVJBwnpsqT4/+GwCJq47MvWhWz+NZgt1T5VDeg=", "bRIzo");
        llllIIIlII[llllIIlIII[66]] = llIIlIlllllII("KJFIKu2a5uaTE0yYZj/FTc9tTtaehCaWcz0Z/U9CpJo=", "QwMSX");
        llllIIIlII[llllIIlIII[67]] = llIIlIlllllIl("O2w6Cg8XbCEEFBdsPRkYHCs3SxgAIT0eC1IkNxkcXA==", "rLRky");
        llllIIIlII[llllIIlIII[68]] = llIIlIllllllI("/0tgXEEwU6g1+uGj8V3pF+BG+q1aRh4GJiAKuhLJyGI=", "sVMMA");
        llllIIIlII[llllIIlIII[69]] = llIIlIllllllI("EovH5JSyP7M0ueNiaJuhV90aqaMd4s5gwqtAve1DATs=", "whvPu");
        llllIIIlII[llllIIlIII[70]] = llIIlIllllllI("+GEdtsGYzyEBkV6p9/XTcC4eC21dfibC", "qKIfN");
    }

    private static boolean llIIllIIlllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIllIIlIllI(int i, int i2) {
        return i < i2;
    }

    private static String llIIlIlllllII(String lllllllllllllllllIlIllIlllIIIlII, String lllllllllllllllllIlIllIlllIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIlllIIIIll.getBytes(StandardCharsets.UTF_8)), llllIIlIII[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIllIlllIIIIII) {
            lllllllllllllllllIlIllIlllIIIIII.printStackTrace();
            return null;
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllIIIlII[llllIIlIII[62]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    private static void cc() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIIllIIllIII(nearest) && llIIllIIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[46]];
            C0000a.a(nearest);
        }
        if (llIIllIIllIII(nearest) && llIIllIIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIIllIIlIlll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[47]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llllIIlIII[7]);
                "".length();
            }
            if (llIIllIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIIlII[llllIIlIII[48]];
                if (llIIllIIllIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llllIIlIII[6]);
                    "".length();
                }
                if (llIIllIIllIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(llllIIlIII[3]);
                    "".length();
                }
                int[] iArr = new int[llllIIlIII[1]];
                iArr[llllIIlIII[0]] = llllIIlIII[9];
                if (llIIllIIlIlIl(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llllIIlIII[1]];
                    iArr2[llllIIlIII[0]] = llllIIlIII[9];
                    if (llIIllIIlIllI(Bank.getFirst(iArr2).getQuantity(), llllIIlIII[5])) {
                        ae();
                        System.out.println(llllIIIlII[llllIIlIII[49]]);
                        bs = llllIIlIII[1];
                        return;
                    }
                }
                int[] iArr3 = new int[llllIIlIII[8]];
                iArr3[llllIIlIII[0]] = llllIIlIII[11];
                iArr3[llllIIlIII[1]] = llllIIlIII[12];
                iArr3[llllIIlIII[3]] = llllIIlIII[9];
                iArr3[llllIIlIII[5]] = llllIIlIII[13];
                iArr3[llllIIlIII[6]] = llllIIlIII[14];
                if (llIIllIIlIlll(C0004e.b(iArr3) ? 1 : 0)) {
                    ae();
                    System.out.println(llllIIIlII[llllIIlIII[50]]);
                    bs = llllIIlIII[1];
                    return;
                }
            }
            int[] iArr4 = new int[llllIIlIII[8]];
            iArr4[llllIIlIII[0]] = llllIIlIII[11];
            iArr4[llllIIlIII[1]] = llllIIlIII[12];
            iArr4[llllIIlIII[3]] = llllIIlIII[9];
            iArr4[llllIIlIII[5]] = llllIIlIII[13];
            iArr4[llllIIlIII[6]] = llllIIlIII[14];
            if (llIIllIIlIlIl(C0004e.b(iArr4) ? 1 : 0)) {
                Bank.withdraw(llllIIlIII[11], llllIIlIII[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llllIIlIII[1]);
                "".length();
                Bank.withdraw(llllIIlIII[12], llllIIlIII[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llllIIlIII[1]);
                "".length();
                Bank.withdraw(llllIIlIII[9], llllIIlIII[5], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llllIIlIII[1]);
                "".length();
                Bank.withdraw(llllIIlIII[13], llllIIlIII[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llllIIlIII[1]);
                "".length();
                Bank.withdraw(llllIIlIII[14], llllIIlIII[5], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llllIIlIII[1]);
                "".length();
                C0000a.b(C0005f.be, llllIIlIII[1]);
                Time.sleepTicks(llllIIlIII[5]);
                "".length();
                Bank.close();
                cr();
            }
        }
    }

    private static String llIIlIlllllIl(String lllllllllllllllllIlIllIllIllIlII, String lllllllllllllllllIlIllIllIllIIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIllIllIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIllIllIllIIll.toCharArray();
        int lllllllllllllllllIlIllIllIllIIII = llllIIlIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIIlIII[0];
        while (llIIllIIlIllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllIlIllIllIllIIII % charArray.length]));
            "".length();
            lllllllllllllllllIlIllIllIllIIII++;
            i++;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIIlIllllllI(String lllllllllllllllllIlIllIllIIlllll, String lllllllllllllllllIlIllIllIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIllIllIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIllIllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIllIllIlIIIII) {
            lllllllllllllllllIlIllIllIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIlIlll(int i) {
        return i == 0;
    }
}
