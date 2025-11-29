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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.W  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/W.class */
public class W implements InterfaceC0003ac {
    public static /* synthetic */ WorldPoint ml;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] llIIllIllI;
    private static final /* synthetic */ String[] mk;
    static /* synthetic */ boolean dj;
    static /* synthetic */ int di;
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ int cG;
    private static /* synthetic */ String[] llIIllIIll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIllIllI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
        if (lIlIllIlIIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.W.llIIllIllI[5]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[llIIllIllI[1]];
        iArr4[llIIllIllI[0]] = llIIllIllI[11];
        if (lIlIllIlIIlll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIllI[11], llIIllIllI[1], llIIllIllI[56]));
            "".length();
        }
        int[] iArr5 = new int[llIIllIllI[1]];
        iArr5[llIIllIllI[0]] = llIIllIllI[12];
        if (lIlIllIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIIllIllI[12], llIIllIllI[1], llIIllIllI[56]));
            "".length();
        }
        int[] iArr6 = new int[llIIllIllI[1]];
        iArr6[llIIllIllI[0]] = llIIllIllI[9];
        if (lIlIllIlIIlIl(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[llIIllIllI[1]];
            iArr7[llIIllIllI[0]] = llIIllIllI[9];
            if (lIlIllIlIIlIl(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIllIllI[1]];
                iArr8[llIIllIllI[0]] = llIIllIllI[9];
            }
            iArr = new int[llIIllIllI[1]];
            iArr[llIIllIllI[0]] = llIIllIllI[14];
            if (lIlIllIlIIlll(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(llIIllIllI[14], llIIllIllI[8], llIIllIllI[56]));
                "".length();
            }
            if (lIlIllIlIIlll(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llIIllIIll[llIIllIllI[63]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(llIIllIllI[57], llIIllIllI[8], llIIllIllI[58]));
                "".length();
            }
            iArr2 = new int[llIIllIllI[1]];
            iArr2[llIIllIllI[0]] = llIIllIllI[59];
            if (lIlIllIlIIlll(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(llIIllIllI[59], llIIllIllI[54], llIIllIllI[60]));
                "".length();
            }
            iArr3 = new int[llIIllIllI[1]];
            iArr3[llIIllIllI[0]] = llIIllIllI[13];
            if (lIlIllIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                return;
            }
            bv.add(new C0017d(llIIllIllI[13], llIIllIllI[8], C0023j.cf));
            "".length();
            return;
        }
        bv.add(new C0017d(llIIllIllI[9], llIIllIllI[5], llIIllIllI[56]));
        "".length();
        iArr = new int[llIIllIllI[1]];
        iArr[llIIllIllI[0]] = llIIllIllI[14];
        if (lIlIllIlIIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (lIlIllIlIIlll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llIIllIIll[llIIllIllI[63]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[llIIllIllI[1]];
        iArr2[llIIllIllI[0]] = llIIllIllI[59];
        if (lIlIllIlIIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIIllIllI[1]];
        iArr3[llIIllIllI[0]] = llIIllIllI[13];
        if (lIlIllIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean lIlIllIlIlIlI(int i, int i2) {
        return i > i2;
    }

    static {
        lIlIllIlIIlII();
        lIlIllIlIIIll();
        String[] strArr = new String[llIIllIllI[15]];
        strArr[llIIllIllI[0]] = llIIllIIll[llIIllIllI[64]];
        strArr[llIIllIllI[1]] = llIIllIIll[llIIllIllI[65]];
        strArr[llIIllIllI[3]] = llIIllIIll[llIIllIllI[66]];
        strArr[llIIllIllI[5]] = llIIllIIll[llIIllIllI[67]];
        strArr[llIIllIllI[6]] = llIIllIIll[llIIllIllI[68]];
        strArr[llIIllIllI[8]] = llIIllIIll[llIIllIllI[69]];
        strArr[llIIllIllI[10]] = llIIllIIll[llIIllIllI[70]];
        mk = strArr;
        bv = new ArrayList();
        ml = new WorldPoint(llIIllIllI[71], llIIllIllI[72], llIIllIllI[0]);
        cG = llIIllIllI[0];
    }

    private static boolean lIlIllIlIIlIl(int i) {
        return i != 0;
    }

    private static boolean lIlIllIlIlIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if ((!lIlIllIlIlllI(C0018e.j(llIIllIllI[4]), llIIllIllI[10]) || lIlIllIlIlllI(C0018e.j(llIIllIllI[4]), llIIllIllI[18])) && !lIlIllIlIllll(Quests.getState(Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            return llIIllIllI[0];
        }
        ?? r0 = llIIllIllI[1];
        "".length();
        return ((236 ^ 163) ^ (23 ^ 92)) < 0 ? ((((11 + 10) - (-55)) + 52) ^ (((100 + 128) - 223) + 141)) & (((91 ^ 114) ^ (160 ^ 155)) ^ (-" ".length())) : r0;
    }

    private static boolean lIlIllIlIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            dO();
            "".length();
            if ("   ".length() <= " ".length()) {
                return (74 ^ 5) & ((216 ^ 151) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIllIllI[61];
    }

    private static String lIlIllIIlIIll(String llllllllllllllllllIIllIlIIlIlIII, String llllllllllllllllllIIllIlIIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIllIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIllIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIllIlIIlIIlII) {
            llllllllllllllllllIIllIlIIlIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x04c4, code lost:
        if (lIlIllIlIllII(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0521, code lost:
        if (lIlIllIlIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L85;
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
    public static void dO() {
        if (lIlIllIlIIlIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIllIIll[llIIllIllI[0]];
            C0015b.a(bv);
            if (lIlIllIlIIllI(bv.size(), llIIllIllI[1])) {
                System.out.println(llIIllIIll[llIIllIllI[1]]);
                bt = llIIllIllI[0];
            }
        }
        if (lIlIllIlIIlll(bt ? 1 : 0)) {
            if (lIlIllIlIIlIl(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIllIlIIllI(Movement.getRunEnergy(), llIIllIllI[2]) && lIlIllIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                Inventory.getFirst(C0019f.ba).interact(llIIllIIll[llIIllIllI[3]]);
                Time.sleepTicks(llIIllIllI[1]);
                "".length();
            }
            if (lIlIllIlIIlll(an() ? 1 : 0) && lIlIllIlIIllI(C0018e.j(llIIllIllI[4]), llIIllIllI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIllIlIlIII(nearest) && lIlIllIlIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIIll[llIIllIllI[5]];
                    C0000a.a(nearest);
                }
                if (lIlIllIlIlIII(nearest) && lIlIllIlIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIllIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[6]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIllIllI[7]);
                        "".length();
                    }
                    if (lIlIllIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[8]];
                        if (lIlIllIlIlIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIllIllI[6]);
                            "".length();
                        }
                        if (lIlIllIlIlIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIllIllI[3]);
                            "".length();
                        }
                        int[] iArr = new int[llIIllIllI[1]];
                        iArr[llIIllIllI[0]] = llIIllIllI[9];
                        if (lIlIllIlIIlIl(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIllIllI[1]];
                            iArr2[llIIllIllI[0]] = llIIllIllI[9];
                            if (lIlIllIlIIllI(Bank.getFirst(iArr2).getQuantity(), llIIllIllI[5])) {
                                Q();
                                System.out.println(llIIllIIll[llIIllIllI[10]]);
                                bt = llIIllIllI[1];
                                return;
                            }
                        }
                        int[] iArr3 = new int[llIIllIllI[8]];
                        iArr3[llIIllIllI[0]] = llIIllIllI[11];
                        iArr3[llIIllIllI[1]] = llIIllIllI[12];
                        iArr3[llIIllIllI[3]] = llIIllIllI[9];
                        iArr3[llIIllIllI[5]] = llIIllIllI[13];
                        iArr3[llIIllIllI[6]] = llIIllIllI[14];
                        if (lIlIllIlIIlll(C0018e.c(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIllIIll[llIIllIllI[15]]);
                            bt = llIIllIllI[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[llIIllIllI[8]];
                    iArr4[llIIllIllI[0]] = llIIllIllI[11];
                    iArr4[llIIllIllI[1]] = llIIllIllI[12];
                    iArr4[llIIllIllI[3]] = llIIllIllI[9];
                    iArr4[llIIllIllI[5]] = llIIllIllI[13];
                    iArr4[llIIllIllI[6]] = llIIllIllI[14];
                    if (lIlIllIlIIlIl(C0018e.c(iArr4) ? 1 : 0)) {
                        Bank.withdraw(llIIllIllI[11], llIIllIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIllIllI[1]);
                        "".length();
                        Bank.withdraw(llIIllIllI[12], llIIllIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIllIllI[1]);
                        "".length();
                        Bank.withdraw(llIIllIllI[9], llIIllIllI[5], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIllIllI[1]);
                        "".length();
                        Bank.withdraw(llIIllIllI[13], llIIllIllI[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIllIllI[1]);
                        "".length();
                        Bank.withdraw(llIIllIllI[14], llIIllIllI[5], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIIllIllI[1]);
                        "".length();
                        C0000a.b(C0019f.bk, llIIllIllI[1]);
                        Time.sleepTicks(llIIllIllI[5]);
                        "".length();
                    }
                }
            }
            if (lIlIllIlIIlIl(an() ? 1 : 0) && lIlIllIlIIllI(C0018e.j(llIIllIllI[4]), llIIllIllI[1])) {
                if (lIlIllIlIIllI(cG, llIIllIllI[1])) {
                    C0018e.x();
                    cG += llIIllIllI[1];
                }
                if (lIlIllIlIlIIl(cG)) {
                    if (lIlIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(ml), llIIllIllI[8])) {
                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[16]];
                        Movement.walkTo(ml);
                        "".length();
                        Time.sleepTicks(llIIllIllI[1]);
                        "".length();
                    }
                    if (lIlIllIlIlIll(Players.getLocal().getWorldLocation().distanceTo(ml), llIIllIllI[8])) {
                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[17]];
                        String[] strArr = new String[llIIllIllI[1]];
                        strArr[llIIllIllI[0]] = llIIllIIll[llIIllIllI[18]];
                        TileObject nearest2 = TileObjects.getNearest(strArr);
                        if (lIlIllIlIlIII(nearest2)) {
                            String[] strArr2 = new String[llIIllIllI[1]];
                            strArr2[llIIllIllI[0]] = llIIllIIll[llIIllIllI[19]];
                            if (lIlIllIlIIlIl(nearest2.hasAction(strArr2) ? 1 : 0)) {
                                nearest2.interact(llIIllIIll[llIIllIllI[20]]);
                                Time.sleepTicks(llIIllIllI[5]);
                                "".length();
                            }
                        }
                        C0020g.a(llIIllIIll[llIIllIllI[21]], mk);
                    }
                }
            }
            int[] iArr5 = new int[llIIllIllI[1]];
            iArr5[llIIllIllI[0]] = llIIllIllI[22];
            if (lIlIllIlIlIII(NPCs.getNearest(iArr5))) {
                int[] iArr6 = new int[llIIllIllI[1]];
                iArr6[llIIllIllI[0]] = llIIllIllI[23];
                if (lIlIllIlIlIII(NPCs.getNearest(iArr6))) {
                    int[] iArr7 = new int[llIIllIllI[1]];
                    iArr7[llIIllIllI[0]] = llIIllIllI[24];
                }
            }
            C0020g.a(mk);
            if (lIlIllIlIllIl(C0018e.j(llIIllIllI[4]), llIIllIllI[5])) {
                String[] strArr3 = new String[llIIllIllI[1]];
                strArr3[llIIllIllI[0]] = llIIllIIll[llIIllIllI[25]];
                if (lIlIllIlIIlll(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[llIIllIllI[1]];
                    strArr4[llIIllIllI[0]] = llIIllIIll[llIIllIllI[26]];
                }
                int[] iArr8 = new int[llIIllIllI[1]];
                iArr8[llIIllIllI[0]] = llIIllIllI[9];
                if (lIlIllIlIIlIl(Inventory.contains(iArr8) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIIll[llIIllIllI[27]];
                    String[] strArr5 = new String[llIIllIllI[1]];
                    strArr5[llIIllIllI[0]] = llIIllIIll[llIIllIllI[28]];
                    Item first = Inventory.getFirst(strArr5);
                    String[] strArr6 = new String[llIIllIllI[1]];
                    strArr6[llIIllIllI[0]] = llIIllIIll[llIIllIllI[29]];
                    Item first2 = Inventory.getFirst(strArr6);
                    int[] iArr9 = new int[llIIllIllI[1]];
                    iArr9[llIIllIllI[0]] = llIIllIllI[9];
                    Item first3 = Inventory.getFirst(iArr9);
                    if (lIlIllIlIlIII(first) && lIlIllIlIlIII(first3)) {
                        first.useOn(first3);
                        Time.sleepTicks(llIIllIllI[1]);
                        "".length();
                    }
                    int[] iArr10 = new int[llIIllIllI[1]];
                    iArr10[llIIllIllI[0]] = llIIllIllI[9];
                    Item first4 = Inventory.getFirst(iArr10);
                    if (lIlIllIlIlIII(first2) && lIlIllIlIlIII(first4)) {
                        first2.useOn(first4);
                    }
                }
            }
            if (lIlIllIlIllIl(C0018e.j(llIIllIllI[4]), llIIllIllI[5])) {
                int[] iArr11 = new int[llIIllIllI[1]];
                iArr11[llIIllIllI[0]] = llIIllIllI[9];
                if (lIlIllIlIIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                    String[] strArr7 = new String[llIIllIllI[1]];
                    strArr7[llIIllIllI[0]] = llIIllIIll[llIIllIllI[30]];
                    if (lIlIllIlIIlll(Inventory.contains(strArr7) ? 1 : 0)) {
                        dA();
                    }
                }
            }
            if (lIlIllIlIllIl(C0018e.j(llIIllIllI[4]), llIIllIllI[5])) {
                int[] iArr12 = new int[llIIllIllI[1]];
                iArr12[llIIllIllI[0]] = llIIllIllI[9];
                if (lIlIllIlIIlIl(Inventory.contains(iArr12) ? 1 : 0)) {
                    String[] strArr8 = new String[llIIllIllI[1]];
                    strArr8[llIIllIllI[0]] = llIIllIIll[llIIllIllI[31]];
                    if (lIlIllIlIIlIl(Inventory.contains(strArr8) ? 1 : 0)) {
                        di = llIIllIllI[0];
                        if (lIlIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(ml), llIIllIllI[8])) {
                            AccBuilderSotf.c = llIIllIIll[llIIllIllI[32]];
                            Movement.walkTo(ml);
                            "".length();
                            Time.sleepTicks(llIIllIllI[1]);
                            "".length();
                        }
                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[33]];
                        C0020g.a(llIIllIIll[llIIllIllI[34]], mk, llIIllIllI[1]);
                    }
                }
            }
            if (lIlIllIlIllIl(C0018e.j(llIIllIllI[4]), llIIllIllI[35])) {
                String[] strArr9 = new String[llIIllIllI[1]];
                strArr9[llIIllIllI[0]] = llIIllIIll[llIIllIllI[36]];
                if (lIlIllIlIIlll(Inventory.contains(strArr9) ? 1 : 0)) {
                    dA();
                }
            }
            if (lIlIllIlIllIl(C0018e.j(llIIllIllI[4]), llIIllIllI[35])) {
                String[] strArr10 = new String[llIIllIllI[1]];
                strArr10[llIIllIllI[0]] = llIIllIIll[llIIllIllI[37]];
                if (lIlIllIlIIlIl(Inventory.contains(strArr10) ? 1 : 0)) {
                    if (lIlIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(ml), llIIllIllI[8])) {
                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[38]];
                        Movement.walkTo(ml);
                        "".length();
                        Time.sleepTicks(llIIllIllI[1]);
                        "".length();
                    }
                    AccBuilderSotf.c = llIIllIIll[llIIllIllI[39]];
                    C0020g.a(llIIllIIll[llIIllIllI[40]], mk, llIIllIllI[1]);
                }
            }
            if (lIlIllIlIllIl(C0018e.j(llIIllIllI[4]), llIIllIllI[41])) {
                int[] iArr13 = new int[llIIllIllI[1]];
                iArr13[llIIllIllI[0]] = llIIllIllI[9];
                if (lIlIllIlIIlll(Inventory.contains(iArr13) ? 1 : 0)) {
                    dA();
                }
            }
            if (lIlIllIlIllIl(C0018e.j(llIIllIllI[4]), llIIllIllI[41])) {
                int[] iArr14 = new int[llIIllIllI[1]];
                iArr14[llIIllIllI[0]] = llIIllIllI[9];
                if (lIlIllIlIIlIl(Inventory.contains(iArr14) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIIll[llIIllIllI[42]];
                    if (lIlIllIlIIllI(di, llIIllIllI[1])) {
                        aN.ta += llIIllIllI[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIIllIllI[1];
                        aN.ta = llIIllIllI[0];
                        dj = llIIllIllI[0];
                    }
                    if (lIlIllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(ml), llIIllIllI[8])) {
                        AccBuilderSotf.c = llIIllIIll[llIIllIllI[43]];
                        Movement.walkTo(ml);
                        "".length();
                        Time.sleepTicks(llIIllIllI[1]);
                        "".length();
                    }
                    C0020g.a(llIIllIIll[llIIllIllI[44]], mk, llIIllIllI[1]);
                }
            }
            Widget widget = Widgets.get(llIIllIllI[45], llIIllIllI[26]);
            if (lIlIllIlIlIII(widget)) {
                widget.interact(llIIllIllI[0]);
            }
            C0020g.a(new String[llIIllIllI[0]]);
        }
    }

    private static boolean lIlIllIlIIlll(int i) {
        return i == 0;
    }

    private static boolean lIlIllIlIlIIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    private static void dA() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIllIlIlIII(nearest) && lIlIllIlIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIllIIll[llIIllIllI[46]];
            C0000a.a(nearest);
        }
        if (lIlIllIlIlIII(nearest) && lIlIllIlIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIlIllIlIIlll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = llIIllIIll[llIIllIllI[47]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIIllIllI[7]);
                "".length();
            }
            if (lIlIllIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                AccBuilderSotf.c = llIIllIIll[llIIllIllI[48]];
                if (lIlIllIlIlIIl(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIIllIllI[6]);
                    "".length();
                }
                if (lIlIllIlIlIIl(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(llIIllIllI[3]);
                    "".length();
                }
                int[] iArr = new int[llIIllIllI[1]];
                iArr[llIIllIllI[0]] = llIIllIllI[9];
                if (lIlIllIlIIlIl(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIllIllI[1]];
                    iArr2[llIIllIllI[0]] = llIIllIllI[9];
                    if (lIlIllIlIIllI(Bank.getFirst(iArr2).getQuantity(), llIIllIllI[5])) {
                        Q();
                        System.out.println(llIIllIIll[llIIllIllI[49]]);
                        bt = llIIllIllI[1];
                        return;
                    }
                }
                int[] iArr3 = new int[llIIllIllI[8]];
                iArr3[llIIllIllI[0]] = llIIllIllI[11];
                iArr3[llIIllIllI[1]] = llIIllIllI[12];
                iArr3[llIIllIllI[3]] = llIIllIllI[9];
                iArr3[llIIllIllI[5]] = llIIllIllI[13];
                iArr3[llIIllIllI[6]] = llIIllIllI[14];
                if (lIlIllIlIIlll(C0018e.c(iArr3) ? 1 : 0)) {
                    Q();
                    System.out.println(llIIllIIll[llIIllIllI[50]]);
                    bt = llIIllIllI[1];
                    return;
                }
            }
            int[] iArr4 = new int[llIIllIllI[8]];
            iArr4[llIIllIllI[0]] = llIIllIllI[11];
            iArr4[llIIllIllI[1]] = llIIllIllI[12];
            iArr4[llIIllIllI[3]] = llIIllIllI[9];
            iArr4[llIIllIllI[5]] = llIIllIllI[13];
            iArr4[llIIllIllI[6]] = llIIllIllI[14];
            if (lIlIllIlIIlIl(C0018e.c(iArr4) ? 1 : 0)) {
                Bank.withdraw(llIIllIllI[11], llIIllIllI[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llIIllIllI[1]);
                "".length();
                Bank.withdraw(llIIllIllI[12], llIIllIllI[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llIIllIllI[1]);
                "".length();
                Bank.withdraw(llIIllIllI[9], llIIllIllI[5], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llIIllIllI[1]);
                "".length();
                Bank.withdraw(llIIllIllI[13], llIIllIllI[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llIIllIllI[1]);
                "".length();
                Bank.withdraw(llIIllIllI[14], llIIllIllI[5], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(llIIllIllI[1]);
                "".length();
                C0000a.b(C0019f.bk, llIIllIllI[1]);
                Time.sleepTicks(llIIllIllI[5]);
                "".length();
                Bank.close();
                dP();
            }
        }
    }

    private static void lIlIllIlIIlII() {
        llIIllIllI = new int[74];
        llIIllIllI[0] = (43 ^ 124) & ((31 ^ 72) ^ (-1));
        llIIllIllI[1] = " ".length();
        llIIllIllI[2] = (99 ^ 120) ^ (213 ^ 133);
        llIIllIllI[3] = "  ".length();
        llIIllIllI[4] = 249 ^ 199;
        llIIllIllI[5] = "   ".length();
        llIIllIllI[6] = (((130 + 83) - 185) + 144) ^ (((52 + 26) - 38) + 128);
        llIIllIllI[7] = (-((-4513) & 23986)) & (-8227) & 32699;
        llIIllIllI[8] = (42 ^ 4) ^ (93 ^ 118);
        llIIllIllI[9] = (-((-1075) & 20158)) & (-12369) & 31739;
        llIIllIllI[10] = 4 ^ 2;
        llIIllIllI[11] = (-22529) & 24295;
        llIIllIllI[12] = (-((-1) & 10519)) & (-16385) & 28671;
        llIIllIllI[13] = (-3237) & 15861;
        llIIllIllI[14] = (-((-14531) & 30967)) & (-8321) & 32765;
        llIIllIllI[15] = 140 ^ 139;
        llIIllIllI[16] = 68 ^ 76;
        llIIllIllI[17] = 148 ^ 157;
        llIIllIllI[18] = (161 ^ 152) ^ (93 ^ 110);
        llIIllIllI[19] = 82 ^ 89;
        llIIllIllI[20] = 35 ^ 47;
        llIIllIllI[21] = 56 ^ 53;
        llIIllIllI[22] = (-((-18193) & 20316)) & (-1045) & 3839;
        llIIllIllI[23] = (-27921) & 28593;
        llIIllIllI[24] = (-15617) & 16287;
        llIIllIllI[25] = 28 ^ 18;
        llIIllIllI[26] = 64 ^ 79;
        llIIllIllI[27] = 109 ^ 125;
        llIIllIllI[28] = 108 ^ 125;
        llIIllIllI[29] = 185 ^ 171;
        llIIllIllI[30] = 23 ^ 4;
        llIIllIllI[31] = (((93 + 0) - 48) + 114) ^ (((48 + 25) - 44) + 110);
        llIIllIllI[32] = 118 ^ 99;
        llIIllIllI[33] = (((129 + 60) - 118) + 120) ^ (((13 + 23) - (-111)) + 22);
        llIIllIllI[34] = (((50 + 119) - 61) + 26) ^ (((43 + 2) - (-31)) + 69);
        llIIllIllI[35] = (-13482) & 13997;
        llIIllIllI[36] = (((1 + 50) - 3) + 95) ^ (((108 + 52) - 16) + 7);
        llIIllIllI[37] = (((104 + 110) - 130) + 62) ^ (((83 + 49) - 17) + 24);
        llIIllIllI[38] = (((110 + 55) - 124) + 150) ^ (((148 + 105) - 228) + 140);
        llIIllIllI[39] = (109 ^ 96) ^ (152 ^ 142);
        llIIllIllI[40] = (((150 + 141) - 115) + 46) ^ (((105 + 96) - 36) + 29);
        llIIllIllI[41] = (-((-2101) & 27645)) & (-2051) & 28623;
        llIIllIllI[42] = (105 ^ 2) ^ (96 ^ 22);
        llIIllIllI[43] = 190 ^ 160;
        llIIllIllI[44] = (((103 + 124) - 60) + 17) ^ (((90 + 16) - (-4)) + 57);
        llIIllIllI[45] = (-((-273) & 32729)) & (-33) & 32765;
        llIIllIllI[46] = (116 ^ 88) ^ (32 ^ 44);
        llIIllIllI[47] = 124 ^ 93;
        llIIllIllI[48] = 180 ^ 150;
        llIIllIllI[49] = (197 ^ 172) ^ (248 ^ 178);
        llIIllIllI[50] = 119 ^ 83;
        llIIllIllI[51] = 170 ^ 143;
        llIIllIllI[52] = 161 ^ 135;
        llIIllIllI[53] = 37 ^ 2;
        llIIllIllI[54] = (((9 + 29) - (-24)) + 124) ^ (((143 + 16) - 78) + 65);
        llIIllIllI[55] = 71 ^ 110;
        llIIllIllI[56] = (-((-4873) & 23503)) & (-1042) & 28671;
        llIIllIllI[57] = (-((-8799) & 12927)) & (-274) & 16381;
        llIIllIllI[58] = (-((-24967) & 31694)) & (-1041) & 32767;
        llIIllIllI[59] = (-((-5699) & 22211)) & (-8249) & 32767;
        llIIllIllI[60] = (-24579) & 26478;
        llIIllIllI[61] = (((3 + 70) - 61) + 184) ^ (((2 + 70) - 33) + 121);
        llIIllIllI[62] = (112 ^ 99) ^ (84 ^ 109);
        llIIllIllI[63] = 238 ^ 197;
        llIIllIllI[64] = (((69 + 11) - 24) + 89) ^ (((174 + 100) - 219) + 134);
        llIIllIllI[65] = 42 ^ 7;
        llIIllIllI[66] = "  ".length() ^ (139 ^ 167);
        llIIllIllI[67] = 7 ^ 40;
        llIIllIllI[68] = (43 ^ 72) ^ (45 ^ 126);
        llIIllIllI[69] = 185 ^ 136;
        llIIllIllI[70] = (147 ^ 164) ^ (44 ^ 41);
        llIIllIllI[71] = (-((-5977) & 30555)) & (-5137) & 32671;
        llIIllIllI[72] = (-20482) & 23993;
        llIIllIllI[73] = 149 ^ 166;
    }

    private static boolean lIlIllIlIlllI(int i, int i2) {
        return i >= i2;
    }

    private static String lIlIllIIlIlII(String llllllllllllllllllIIllIlIIllllIl, String llllllllllllllllllIIllIlIIllllII) {
        String llllllllllllllllllIIllIlIIllllIl2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIllIlIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIllIlIIlllIll = new StringBuilder();
        char[] llllllllllllllllllIIllIlIIlllIlI = llllllllllllllllllIIllIlIIllllII.toCharArray();
        int llllllllllllllllllIIllIlIIlllIIl = llIIllIllI[0];
        char[] charArray = llllllllllllllllllIIllIlIIllllIl2.toCharArray();
        int length = charArray.length;
        int i = llIIllIllI[0];
        while (lIlIllIlIIllI(i, length)) {
            char llllllllllllllllllIIllIlIIlllllI = charArray[i];
            llllllllllllllllllIIllIlIIlllIll.append((char) (llllllllllllllllllIIllIlIIlllllI ^ llllllllllllllllllIIllIlIIlllIlI[llllllllllllllllllIIllIlIIlllIIl % llllllllllllllllllIIllIlIIlllIlI.length]));
            "".length();
            llllllllllllllllllIIllIlIIlllIIl++;
            i++;
            "".length();
            if ((((87 ^ 34) ^ (69 ^ 44)) & (((176 ^ 166) ^ (2 ^ 8)) ^ (-" ".length()))) > (((2 ^ 49) ^ (255 ^ 151)) & (((((207 + 5) - 35) + 69) ^ (((17 + 51) - (-27)) + 78)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIllIlIIlllIll);
    }

    private static boolean lIlIllIlIllIl(int i, int i2) {
        return i == i2;
    }

    private static void dP() {
        String[] strArr = new String[llIIllIllI[1]];
        strArr[llIIllIllI[0]] = llIIllIIll[llIIllIllI[51]];
        if (lIlIllIlIIlll(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llIIllIllI[1]];
            strArr2[llIIllIllI[0]] = llIIllIIll[llIIllIllI[52]];
            if (!lIlIllIlIIlIl(Inventory.contains(strArr2) ? 1 : 0)) {
                return;
            }
        }
        int[] iArr = new int[llIIllIllI[1]];
        iArr[llIIllIllI[0]] = llIIllIllI[9];
        if (lIlIllIlIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            if (lIlIllIlIIlIl(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                Time.sleepTicks(C0018e.c(llIIllIllI[3], llIIllIllI[5]));
                "".length();
            }
            AccBuilderSotf.c = llIIllIIll[llIIllIllI[53]];
            String[] strArr3 = new String[llIIllIllI[1]];
            strArr3[llIIllIllI[0]] = llIIllIIll[llIIllIllI[54]];
            Item first = Inventory.getFirst(strArr3);
            String[] strArr4 = new String[llIIllIllI[1]];
            strArr4[llIIllIllI[0]] = llIIllIIll[llIIllIllI[55]];
            Item first2 = Inventory.getFirst(strArr4);
            int[] iArr2 = new int[llIIllIllI[1]];
            iArr2[llIIllIllI[0]] = llIIllIllI[9];
            Item first3 = Inventory.getFirst(iArr2);
            if (lIlIllIlIlIII(first) && lIlIllIlIlIII(first3)) {
                first.useOn(first3);
                Time.sleepTicks(llIIllIllI[1]);
                "".length();
            }
            int[] iArr3 = new int[llIIllIllI[1]];
            iArr3[llIIllIllI[0]] = llIIllIllI[9];
            Item first4 = Inventory.getFirst(iArr3);
            if (lIlIllIlIlIII(first2) && lIlIllIlIlIII(first4)) {
                first2.useOn(first4);
            }
        }
    }

    private static boolean lIlIllIlIlIII(Object obj) {
        return obj != null;
    }

    private static String lIlIllIIlIIlI(String llllllllllllllllllIIllIlIlIIlIll, String llllllllllllllllllIIllIlIlIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIllIlIlIIllII.getBytes(StandardCharsets.UTF_8)), llIIllIllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllIllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIllIlIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIllIlIlIIlllI) {
            llllllllllllllllllIIllIlIlIIlllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIIllIllI[1]];
        iArr[llIIllIllI[0]] = llIIllIllI[11];
        if (lIlIllIlIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIIllIllI[1]];
            iArr2[llIIllIllI[0]] = llIIllIllI[12];
            if (lIlIllIlIIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIIllIllI[1]];
                iArr3[llIIllIllI[0]] = llIIllIllI[9];
                if (lIlIllIlIIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = llIIllIllI[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return llIIllIllI[0];
    }

    private static void lIlIllIlIIIll() {
        llIIllIIll = new String[llIIllIllI[73]];
        llIIllIIll[llIIllIllI[0]] = lIlIllIIlIIlI("JaZJ5oL8zm9MdBtrTqasNQ==", "tMFUp");
        llIIllIIll[llIIllIllI[1]] = lIlIllIIlIIll("nexuzYRxht4bqH3gpt595K/TwyP0aQm8FqhMczpFx1obcU0dZ6BMChl7LZ/xRUE2", "TMPYF");
        llIIllIIll[llIIllIllI[3]] = lIlIllIIlIIlI("NxSHsBJdP2I=", "EQovL");
        llIIllIIll[llIIllIllI[5]] = lIlIllIIlIlII("CgABCyYlFR4MJmQVGEIjJQ8c", "DawbA");
        llIIllIIll[llIIllIllI[6]] = lIlIllIIlIIll("Fpe0D//H/yZ2AvvKteT7Tg==", "Omvvd");
        llIIllIIll[llIIllIllI[8]] = lIlIllIIlIIlI("tvh9pUWG7Gdb86KiSeqbiuLnMW4ihNZa", "ejFGm");
        llIIllIIll[llIIllIllI[10]] = lIlIllIIlIIlI("pERgIsMJrCbixDQLFiC7YVRgmi+aGxmL4IgbKu0zXp9Tspr0ZgvRyb3K77wpnehixQ7IgW2TJQk=", "wfuaZ");
        llIIllIIll[llIIllIllI[15]] = lIlIllIIlIlII("DzBaLwI9dRcnAys8FClQKSAfPQR4Jg8+ADQ8Hz1ceCYNJwQ7PRMgF3ghFW4yDQwzADc=", "XUzNp");
        llIIllIIll[llIIllIllI[16]] = lIlIllIIlIlII("PhYMdDYfVwkgIwID", "pwzTB");
        llIIllIIll[llIIllIllI[17]] = lIlIllIIlIIll("PJU+zsXD5Un5RQDESj0Ogg==", "zTpaH");
        llIIllIIll[llIIllIllI[18]] = lIlIllIIlIlII("AQY7KzVtAyYjIg==", "MgILP");
        llIIllIIll[llIIllIllI[19]] = lIlIllIIlIIll("0+tzV08HRq8=", "hHYKf");
        llIIllIIll[llIIllIllI[20]] = lIlIllIIlIIll("GV7ptD32pNg=", "WZPpK");
        llIIllIIll[llIIllIllI[21]] = lIlIllIIlIlII("KS0AFzcPJE4wIAA8AB0/Cw==", "nHnrE");
        llIIllIIll[llIIllIllI[25]] = lIlIllIIlIIll("lnjvQgc7WA9zZwpHDX5mCg==", "bkJRe");
        llIIllIIll[llIIllIllI[26]] = lIlIllIIlIIll("FLOyWNY0cLDyFj9yyscpSg==", "oXktU");
        llIIllIIll[llIIllIllI[27]] = lIlIllIIlIlII("MBIePhdUCgU9HwY=", "tkwPp");
        llIIllIIll[llIIllIllI[28]] = lIlIllIIlIIll("MPRESXnlQ6Y9qfMgmpWeqA==", "onlGw");
        llIIllIIll[llIIllIllI[29]] = lIlIllIIlIlII("FAcwF0MyEiA=", "VkErc");
        llIIllIIll[llIIllIllI[30]] = lIlIllIIlIIlI("p1FySqRkD/mP0D0Ep4yUNDTCzQEMWYbL", "ubGay");
        llIIllIIll[llIIllIllI[31]] = lIlIllIIlIlII("BDUnByMuZyEGJicuKEkpKi4q", "KGFiD");
        llIIllIIll[llIIllIllI[32]] = lIlIllIIlIIlI("ZidIseRfL25OnA8buNPT2g==", "DnGPU");
        llIIllIIll[llIIllIllI[33]] = lIlIllIIlIIlI("/g5PYFNtotFbn/wmWiBuOH/JTbF7sfiw", "MwNgI");
        llIIllIIll[llIIllIllI[34]] = lIlIllIIlIIll("05suM3J7UVUm5qk68C2xF5HFxQ1aK0Ns", "HQsoE");
        llIIllIIll[llIIllIllI[36]] = lIlIllIIlIIlI("1ZwIkEe4VoGUgbk8vZDEiHlGF/RmXbZC", "JVhfK");
        llIIllIIll[llIIllIllI[37]] = lIlIllIIlIIlI("o/TdHHuPXB/5H39seyT2gkp46k4fXIWp", "ReDBc");
        llIIllIIll[llIIllIllI[38]] = lIlIllIIlIIll("uQ7d/XR+ZERi26dBYZdOgQ==", "YkiUD");
        llIIllIIll[llIIllIllI[39]] = lIlIllIIlIlII("Hxw/AwElDm0EBmsLIRgN", "KiMmh");
        llIIllIIll[llIIllIllI[40]] = lIlIllIIlIlII("BAAjHSAiCW06Ny0RIxcoJg==", "CeMxR");
        llIIllIIll[llIIllIllI[42]] = lIlIllIIlIlII("PxIACx0FAFIMGksFAAoDBQ==", "kgret");
        llIIllIIll[llIIllIllI[43]] = lIlIllIIlIlII("GDgwTSY5eTUZMyQt", "VYFmR");
        llIIllIIll[llIIllIllI[44]] = lIlIllIIlIIlI("wNKABCRYzXYxtE4DvQqOGhM39IQdb3pM", "tiQow");
        llIIllIIll[llIIllIllI[46]] = lIlIllIIlIlII("AxEsOzEsBDM8MW0ENXI0LB4x", "MpZRV");
        llIIllIIll[llIIllIllI[47]] = lIlIllIIlIIlI("ioMoVkieRHZhkpHx4dyrdg==", "QZoeE");
        llIIllIIll[llIIllIllI[48]] = lIlIllIIlIIlI("L63YnmXeHQNEtaPGg2QPH/vppNKJ3HSA", "XnlkF");
        llIIllIIll[llIIllIllI[49]] = lIlIllIIlIIlI("Y5dgZyyFd0IrXpHMB9CEk31WPfrHxKW9lW6SM/11bcokZP08z7XU5VoBZceXb1MFhke2OoROH+0=", "nvwOh");
        llIIllIIll[llIIllIllI[50]] = lIlIllIIlIIlI("4sjgaqCyJnlDCAHkujz4o7D60FdXu3SasSR8j6PcwN7sI80j+AbYpE6RWfM7AXIwvB0Kd5evZPw=", "pbyDG");
        llIIllIIll[llIIllIllI[51]] = lIlIllIIlIIll("w18ZlGqsFOcAgrJMwoV8cA==", "ReJmx");
        llIIllIIll[llIIllIllI[52]] = lIlIllIIlIIlI("MY/39vbYjNpwlafm048NCA==", "YWLQD");
        llIIllIIll[llIIllIllI[53]] = lIlIllIIlIlII("Ix0COD1HBRk7NRU=", "gdkVZ");
        llIIllIIll[llIIllIllI[54]] = lIlIllIIlIIlI("5LdTMu/e1l68VAY8FIsYIQ==", "Szyjj");
        llIIllIIll[llIIllIllI[55]] = lIlIllIIlIIll("R7siFc69lt7hRZI5G6fZWg==", "MNrsO");
        llIIllIIll[llIIllIllI[62]] = lIlIllIIlIlII("AAs2KhMpRBAvCisLOScZPg==", "GdTFz");
        llIIllIIll[llIIllIllI[63]] = lIlIllIIlIIlI("ycj0ulnE6uvk7kNpwHEde1/F9Zgoxist", "UMKwS");
        llIIllIIll[llIIllIllI[64]] = lIlIllIIlIIll("STW3GAp7i1E=", "PdxjI");
        llIIllIIll[llIIllIllI[65]] = lIlIllIIlIIlI("K2urgiHBfYVQ18mG+LEz6GGbyov01Wk0EtzUbL5kHvi0oUVtG3AwuAgvDlok9iOc7C6I8NAj7+g=", "SWXHh");
        llIIllIIll[llIIllIllI[66]] = lIlIllIIlIIll("IIecgmd3dtPttgXErU4AOog4GhkwBrd385Hwuu0EiF4=", "PqrDz");
        llIIllIIll[llIIllIllI[67]] = lIlIllIIlIIlI("VQm2CNMWPoiS3Z2RwnfauswTrXfWUaOmwKUGJqURA+M=", "JACsK");
        llIIllIIll[llIIllIllI[68]] = lIlIllIIlIlII("B24uIwMrbjUtGCtuJC4AK24nMBghOzRiHSs8I2w=", "NNFBu");
        llIIllIIll[llIIllIllI[69]] = lIlIllIIlIIll("SqICiRS7m0w7L3SG8YvROYsTmlZyOKe0nXNT+mD9hBk=", "SyeLF");
        llIIllIIll[llIIllIllI[70]] = lIlIllIIlIIlI("UmukV8oCVEVCVBYm2vIyG2m85KD5HNj+", "tyuGq");
    }

    private static boolean lIlIllIlIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllIlIllII(Object obj) {
        return obj == null;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIllIIll[llIIllIllI[62]];
    }
}
