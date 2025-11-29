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
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.K  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/K.class */
public class K implements InterfaceC0003ac {
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ String[] cE;
    private static /* synthetic */ int[] llIIIIlIII;
    public static final /* synthetic */ WorldPoint gl;
    static /* synthetic */ boolean dj;
    static /* synthetic */ int di;
    public static final /* synthetic */ WorldPoint gk;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] llIIIIIlll;

    static {
        lIlIIIllIllll();
        lIlIIIllIlllI();
        gk = new WorldPoint(llIIIIlIII[67], llIIIIlIII[68], llIIIIlIII[4]);
        gl = new WorldPoint(llIIIIlIII[69], llIIIIlIII[70], llIIIIlIII[4]);
        bv = new ArrayList();
        String[] strArr = new String[llIIIIlIII[23]];
        strArr[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[71]];
        strArr[llIIIIlIII[3]] = llIIIIIlll[llIIIIlIII[72]];
        strArr[llIIIIlIII[1]] = llIIIIIlll[llIIIIlIII[73]];
        strArr[llIIIIlIII[12]] = llIIIIIlll[llIIIIlIII[74]];
        strArr[llIIIIlIII[7]] = llIIIIIlll[llIIIIlIII[75]];
        strArr[llIIIIlIII[15]] = llIIIIIlll[llIIIIlIII[76]];
        strArr[llIIIIlIII[17]] = llIIIIIlll[llIIIIlIII[77]];
        strArr[llIIIIlIII[8]] = llIIIIIlll[llIIIIlIII[78]];
        cE = strArr;
    }

    private static boolean lIlIIIlllIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIIIlIII[4];
    }

    private static String lIlIIIllIlIll(String llllllllllllllllllIllIlIIIlIIIll, String llllllllllllllllllIllIlIIIlIIIlI) {
        String llllllllllllllllllIllIlIIIlIIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllllIllIlIIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIllIlIIIlIIIIl = new StringBuilder();
        char[] charArray = llllllllllllllllllIllIlIIIlIIIlI.toCharArray();
        int llllllllllllllllllIllIlIIIIlllll = llIIIIlIII[4];
        char[] charArray2 = llllllllllllllllllIllIlIIIlIIIll2.toCharArray();
        int length = charArray2.length;
        int i = llIIIIlIII[4];
        while (lIlIIIlllIIII(i, length)) {
            char llllllllllllllllllIllIlIIIlIIlII = charArray2[i];
            llllllllllllllllllIllIlIIIlIIIIl.append((char) (llllllllllllllllllIllIlIIIlIIlII ^ charArray[llllllllllllllllllIllIlIIIIlllll % charArray.length]));
            "".length();
            llllllllllllllllllIllIlIIIIlllll++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIllIlIIIlIIIIl);
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            System.out.println("678: " + C0018e.j(llIIIIlIII[5]));
            cy();
            "".length();
            if ((-" ".length()) == (((174 ^ 169) ^ (29 ^ 78)) & (((((195 + 82) - 275) + 194) ^ (((37 + 92) - 15) + 30)) ^ (-" ".length())))) {
                return ((((69 + 58) - 47) + 90) ^ (((74 + 16) - (-37)) + 25)) & (((207 ^ 166) ^ (85 ^ 14)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIIIIlIII[57];
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01f7, code lost:
        if (lIlIIIlllIIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.K.llIIIIlIII[2]) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2 = new int[llIIIIlIII[3]];
        iArr2[llIIIIlIII[4]] = llIIIIlIII[19];
        if (lIlIIIlllIlII(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIII[19], llIIIIlIII[2], C0023j.cf));
            "".length();
        }
        int[] iArr3 = new int[llIIIIlIII[3]];
        iArr3[llIIIIlIII[4]] = llIIIIlIII[11];
        if (lIlIIIlllIlII(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIII[11], llIIIIlIII[3], llIIIIlIII[51]));
            "".length();
        }
        int[] iArr4 = new int[llIIIIlIII[3]];
        iArr4[llIIIIlIII[4]] = llIIIIlIII[14];
        if (lIlIIIlllIlII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIII[14], llIIIIlIII[3], llIIIIlIII[51]));
            "".length();
        }
        int[] iArr5 = new int[llIIIIlIII[3]];
        iArr5[llIIIIlIII[4]] = llIIIIlIII[18];
        if (lIlIIIlllIlII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIII[18], llIIIIlIII[3], llIIIIlIII[51]));
            "".length();
        }
        int[] iArr6 = new int[llIIIIlIII[3]];
        iArr6[llIIIIlIII[4]] = llIIIIlIII[16];
        if (lIlIIIlllIlII(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIII[16], llIIIIlIII[3], llIIIIlIII[51]));
            "".length();
        }
        int[] iArr7 = new int[llIIIIlIII[3]];
        iArr7[llIIIIlIII[4]] = llIIIIlIII[13];
        if (lIlIIIlllIlII(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIIIIlIII[13], llIIIIlIII[3], llIIIIlIII[52]));
            "".length();
        }
        int[] iArr8 = new int[llIIIIlIII[3]];
        iArr8[llIIIIlIII[4]] = llIIIIlIII[10];
        if (lIlIIIlllIIll(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llIIIIlIII[3]];
            iArr9[llIIIIlIII[4]] = llIIIIlIII[10];
            if (lIlIIIlllIIll(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIIIlIII[3]];
                iArr10[llIIIIlIII[4]] = llIIIIlIII[10];
            }
            if (lIlIIIlllIlII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(llIIIIIlll[llIIIIlIII[59]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(llIIIIlIII[54], llIIIIlIII[15], llIIIIlIII[55]));
                "".length();
            }
            iArr = new int[llIIIIlIII[3]];
            iArr[llIIIIlIII[4]] = llIIIIlIII[9];
            if (lIlIIIlllIIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[llIIIIlIII[3]];
                iArr11[llIIIIlIII[4]] = llIIIIlIII[9];
                if (!lIlIIIlllIIll(Bank.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[llIIIIlIII[3]];
                iArr12[llIIIIlIII[4]] = llIIIIlIII[9];
                if (!lIlIIIlllIIII(Bank.getFirst(iArr12).getQuantity(), llIIIIlIII[2])) {
                    return;
                }
            }
            bv.add(new C0017d(llIIIIlIII[9], llIIIIlIII[56], llIIIIlIII[52]));
            "".length();
        }
        bv.add(new C0017d(llIIIIlIII[10], llIIIIlIII[2], llIIIIlIII[53]));
        "".length();
        if (lIlIIIlllIlII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(llIIIIIlll[llIIIIlIII[59]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[llIIIIlIII[3]];
        iArr[llIIIIlIII[4]] = llIIIIlIII[9];
        if (lIlIIIlllIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIIIlIII[9], llIIIIlIII[56], llIIIIlIII[52]));
        "".length();
    }

    public static void cz() {
        String[] strArr = new String[llIIIIlIII[3]];
        strArr[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[46]];
        if (lIlIIIllllIIl(NPCs.getNearest(strArr))) {
            if (lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                if (lIlIIIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo(gk);
                "".length();
                Time.sleepTicks(llIIIIlIII[3]);
                "".length();
            }
            if (lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[47]];
                String[] strArr2 = new String[llIIIIlIII[3]];
                strArr2[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[48]];
                TileObjects.getNearest(strArr2).interact(llIIIIIlll[llIIIIlIII[0]]);
                Time.sleepTicks(llIIIIlIII[1]);
                "".length();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIIIllllIlI(Quests.getState(Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            ?? r0 = llIIIIlIII[3];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIIlIII[4];
    }

    private static boolean lIlIIIlllIIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v300, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v322, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    public static void cy() {
        if (lIlIIIlllIIII(C0018e.j(llIIIIlIII[0]), llIIIIlIII[1])) {
            Q.ds();
        }
        if (lIlIIIlllIIII(Skills.getLevel(Skill.COOKING), llIIIIlIII[2]) && lIlIIIlllIIIl(C0018e.j(llIIIIlIII[0]), llIIIIlIII[1])) {
            ax.gz();
        }
        if (lIlIIIlllIIlI(Skills.getLevel(Skill.COOKING), llIIIIlIII[2]) && lIlIIIlllIIIl(C0018e.j(llIIIIlIII[0]), llIIIIlIII[1])) {
            if (lIlIIIlllIIll(bt ? 1 : 0)) {
                C0015b.a(bv);
                if (lIlIIIlllIIII(bv.size(), llIIIIlIII[3])) {
                    System.out.println(llIIIIIlll[llIIIIlIII[4]]);
                    bt = llIIIIlIII[4];
                }
            }
            if (lIlIIIlllIlII(bt ? 1 : 0)) {
                if (lIlIIIlllIlII(an() ? 1 : 0) && lIlIIIlllIlII(C0018e.j(llIIIIlIII[5]))) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIlIIIlllIlIl(nearest) && lIlIIIlllIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[3]];
                        C0000a.a(nearest);
                    }
                    if (lIlIIIlllIlIl(nearest) && lIlIIIlllIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIlIIIlllIlII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, llIIIIlIII[6]);
                            "".length();
                        }
                        if (lIlIIIlllIIll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[1]];
                            if (lIlIIIlllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(llIIIIlIII[7]);
                                "".length();
                            }
                            if (lIlIIIlllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(llIIIIlIII[1]);
                                "".length();
                            }
                            int[] iArr = new int[llIIIIlIII[8]];
                            iArr[llIIIIlIII[4]] = llIIIIlIII[9];
                            iArr[llIIIIlIII[3]] = llIIIIlIII[10];
                            iArr[llIIIIlIII[1]] = llIIIIlIII[11];
                            iArr[llIIIIlIII[12]] = llIIIIlIII[13];
                            iArr[llIIIIlIII[7]] = llIIIIlIII[14];
                            iArr[llIIIIlIII[15]] = llIIIIlIII[16];
                            iArr[llIIIIlIII[17]] = llIIIIlIII[18];
                            if (lIlIIIlllIlII(C0018e.c(iArr) ? 1 : 0)) {
                                Q();
                                System.out.println(llIIIIIlll[llIIIIlIII[12]]);
                                bt = llIIIIlIII[3];
                                return;
                            }
                            int[] iArr2 = new int[llIIIIlIII[8]];
                            iArr2[llIIIIlIII[4]] = llIIIIlIII[9];
                            iArr2[llIIIIlIII[3]] = llIIIIlIII[10];
                            iArr2[llIIIIlIII[1]] = llIIIIlIII[11];
                            iArr2[llIIIIlIII[12]] = llIIIIlIII[13];
                            iArr2[llIIIIlIII[7]] = llIIIIlIII[14];
                            iArr2[llIIIIlIII[15]] = llIIIIlIII[16];
                            iArr2[llIIIIlIII[17]] = llIIIIlIII[18];
                            if (lIlIIIlllIIll(C0018e.c(iArr2) ? 1 : 0)) {
                                C0000a.a(llIIIIlIII[9], llIIIIlIII[2]);
                                C0000a.a(llIIIIlIII[10], llIIIIlIII[2]);
                                C0000a.a(llIIIIlIII[11], llIIIIlIII[3]);
                                C0000a.a(llIIIIlIII[13], llIIIIlIII[3]);
                                C0000a.a(llIIIIlIII[14], llIIIIlIII[3]);
                                C0000a.a(llIIIIlIII[16], llIIIIlIII[3]);
                                C0000a.a(llIIIIlIII[18], llIIIIlIII[3]);
                                C0000a.a(llIIIIlIII[19], llIIIIlIII[1]);
                                C0000a.a(llIIIIlIII[20], llIIIIlIII[6]);
                            }
                        }
                    }
                }
                if (lIlIIIlllIIll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIIIlllIIII(Movement.getRunEnergy(), llIIIIlIII[21])) {
                    Inventory.getFirst(C0019f.ba).interact(llIIIIIlll[llIIIIlIII[7]]);
                    Time.sleepTicks(llIIIIlIII[3]);
                    "".length();
                }
                if (lIlIIIlllIlII(C0018e.j(llIIIIlIII[5])) && lIlIIIlllIIll(an() ? 1 : 0)) {
                    AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[15]];
                    if (lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                        if (lIlIIIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(gk);
                        "".length();
                        Time.sleepTicks(llIIIIlIII[3]);
                        "".length();
                    }
                    if (lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                        AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[17]];
                        C0020g.a(llIIIIIlll[llIIIIlIII[8]], cE);
                    }
                }
                if (lIlIIIlllIIIl(C0018e.j(llIIIIlIII[5]), llIIIIlIII[3])) {
                    int[] iArr3 = new int[llIIIIlIII[3]];
                    iArr3[llIIIIlIII[4]] = llIIIIlIII[22];
                    if (lIlIIIlllIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        String[] strArr = new String[llIIIIlIII[3]];
                        strArr[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[23]];
                        if (lIlIIIlllIlII(Inventory.contains(strArr) ? 1 : 0)) {
                            di = llIIIIlIII[4];
                            if (lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gl), llIIIIlIII[7])) {
                                AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[24]];
                                WorldArea worldArea = new WorldArea(llIIIIlIII[25], llIIIIlIII[26], llIIIIlIII[27], llIIIIlIII[28], llIIIIlIII[4]);
                                if (lIlIIIlllIlII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIlIIIlllIIll(Inventory.contains(item -> {
                                        return item.getName().contains(llIIIIIlll[llIIIIlIII[66]]);
                                    }) ? 1 : 0) && lIlIIIlllIlII(Equipment.contains(item2 -> {
                                        return item2.getName().contains(llIIIIIlll[llIIIIlIII[56]]);
                                    }) ? 1 : 0)) {
                                        Inventory.getFirst(item3 -> {
                                            return item3.getName().contains(llIIIIIlll[llIIIIlIII[65]]);
                                        }).interact(llIIIIIlll[llIIIIlIII[2]]);
                                    }
                                    if (lIlIIIlllIIll(Equipment.contains(item4 -> {
                                        return item4.getName().contains(llIIIIIlll[llIIIIlIII[64]]);
                                    }) ? 1 : 0) && lIlIIIlllIIIl(Players.getLocal().getAnimation(), llIIIIlIII[29])) {
                                        Equipment.getFirst(item5 -> {
                                            return item5.getName().contains(llIIIIIlll[llIIIIlIII[63]]);
                                        }).interact(llIIIIIlll[llIIIIlIII[30]]);
                                        Time.sleepTicks(llIIIIlIII[7]);
                                        "".length();
                                    }
                                }
                                if (lIlIIIlllIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo(gl);
                                    "".length();
                                    Time.sleepTicks(llIIIIlIII[3]);
                                    "".length();
                                }
                            }
                            if (lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gl), llIIIIlIII[7])) {
                                AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[31]];
                                if (lIlIIIlllIIll(Widgets.get(llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                    String[] strArr2 = new String[llIIIIlIII[3]];
                                    strArr2[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[33]];
                                    NPCs.getNearest(strArr2).interact(llIIIIIlll[llIIIIlIII[34]]);
                                    Time.sleepTicks(llIIIIlIII[12]);
                                    "".length();
                                }
                                if (lIlIIIlllIlII(Widgets.get(llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(llIIIIlIII[32], llIIIIlIII[35], llIIIIlIII[3]).interact(llIIIIIlll[llIIIIlIII[36]]);
                                    Time.sleepTicks(llIIIIlIII[1]);
                                    "".length();
                                }
                                int[] iArr4 = new int[llIIIIlIII[3]];
                                iArr4[llIIIIlIII[4]] = llIIIIlIII[22];
                                if (lIlIIIlllIIll(Inventory.contains(iArr4) ? 1 : 0) && lIlIIIlllIlII(Widgets.get(llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(llIIIIlIII[32], llIIIIlIII[3], llIIIIlIII[30]).interact(llIIIIIlll[llIIIIlIII[35]]);
                                    Time.sleepTicks(llIIIIlIII[3]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[llIIIIlIII[3]];
                    iArr5[llIIIIlIII[4]] = llIIIIlIII[22];
                    if (lIlIIIlllIIll(Inventory.contains(iArr5) ? 1 : 0)) {
                        String[] strArr3 = new String[llIIIIlIII[3]];
                        strArr3[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[37]];
                        if (lIlIIIlllIlII(Inventory.contains(strArr3) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIIIlIII[3]];
                            iArr6[llIIIIlIII[4]] = llIIIIlIII[22];
                            if (lIlIIIlllIIll(Inventory.contains(iArr6) ? 1 : 0) && lIlIIIlllIlII(Widgets.get(llIIIIlIII[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get(llIIIIlIII[32], llIIIIlIII[3], llIIIIlIII[30]).interact(llIIIIIlll[llIIIIlIII[38]]);
                                Time.sleepTicks(llIIIIlIII[3]);
                                "".length();
                            }
                            int[] iArr7 = new int[llIIIIlIII[3]];
                            iArr7[llIIIIlIII[4]] = llIIIIlIII[18];
                            Item first = Inventory.getFirst(iArr7);
                            String[] strArr4 = new String[llIIIIlIII[3]];
                            strArr4[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[39]];
                            first.useOn(Inventory.getFirst(strArr4));
                            Time.sleepTicks(llIIIIlIII[1]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[llIIIIlIII[3]];
                    strArr5[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[40]];
                    if (lIlIIIlllIIll(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (lIlIIIlllIlll(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                            if (lIlIIIlllIIll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (lIlIIIlllIIll(Inventory.contains(item6 -> {
                                return item6.getName().contains(llIIIIIlll[llIIIIlIII[62]]);
                            }) ? 1 : 0) && lIlIIIlllIlII(Equipment.contains(item7 -> {
                                return item7.getName().contains(llIIIIIlll[llIIIIlIII[61]]);
                            }) ? 1 : 0)) {
                                Inventory.getFirst(item8 -> {
                                    return item8.getName().contains(llIIIIIlll[llIIIIlIII[60]]);
                                }).interact(llIIIIIlll[llIIIIlIII[41]]);
                                Time.sleepTicks(llIIIIlIII[1]);
                                "".length();
                            }
                            Movement.walkTo(gk);
                            "".length();
                            Time.sleepTicks(llIIIIlIII[3]);
                            "".length();
                        }
                        if (lIlIIIllllIII(Players.getLocal().getWorldLocation().distanceTo(gk), llIIIIlIII[12])) {
                            AccBuilderSotf.c = llIIIIIlll[llIIIIlIII[42]];
                            if (lIlIIIlllIIII(di, llIIIIlIII[3])) {
                                aN.rB += llIIIIlIII[3];
                                aN.u(AccBuilderSotf.m);
                                di += llIIIIlIII[3];
                                aN.rB = llIIIIlIII[4];
                                dj = llIIIIlIII[4];
                            }
                            C0020g.a(llIIIIIlll[llIIIIlIII[43]], cE);
                        }
                    }
                }
                if (lIlIIIlllIIIl(C0018e.j(llIIIIlIII[5]), llIIIIlIII[1])) {
                    String[] strArr6 = new String[llIIIIlIII[3]];
                    strArr6[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[44]];
                    TileObjects.getNearest(strArr6).interact(llIIIIIlll[llIIIIlIII[45]]);
                    Time.sleepTicks(llIIIIlIII[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIlIIIlllIlII(int i) {
        return i == 0;
    }

    private static boolean lIlIIIllllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIllllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIIlllIIll(int i) {
        return i != 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIIIIlll[llIIIIlIII[58]];
    }

    private static boolean lIlIIIlllIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIlllIlll(int i, int i2) {
        return i > i2;
    }

    private static void lIlIIIllIllll() {
        llIIIIlIII = new int[79];
        llIIIIlIII[0] = 29 ^ 0;
        llIIIIlIII[1] = "  ".length();
        llIIIIlIII[2] = 143 ^ 133;
        llIIIIlIII[3] = " ".length();
        llIIIIlIII[4] = ((131 ^ 159) ^ (247 ^ 186)) & (("  ".length() ^ (242 ^ 161)) ^ (-" ".length()));
        llIIIIlIII[5] = (-21521) & 22198;
        llIIIIlIII[6] = (-((-6826) & 24315)) & (-35) & 22523;
        llIIIIlIII[7] = (121 ^ 33) ^ (90 ^ 6);
        llIIIIlIII[8] = 64 ^ 71;
        llIIIIlIII[9] = (-16545) & 24551;
        llIIIIlIII[10] = (-8196) & 16203;
        llIIIIlIII[11] = (-((-2891) & 31563)) & (-1543) & 32766;
        llIIIIlIII[12] = "   ".length();
        llIIIIlIII[13] = (((11 ^ 90) + (((58 + 118) - 115) + 122)) - (((23 + 101) - 34) + 153)) + ((68 + 7) - (-70)) + 55;
        llIIIIlIII[14] = (-((-1147) & 17531)) & (-4235) & 22527;
        llIIIIlIII[15] = 176 ^ 181;
        llIIIIlIII[16] = (-5586) & 7669;
        llIIIIlIII[17] = (102 ^ 28) ^ (99 ^ 31);
        llIIIIlIII[18] = (-((-1658) & 20477)) & (-1065) & 20475;
        llIIIIlIII[19] = (-((-4959) & 8191)) & (-16387) & 32243;
        llIIIIlIII[20] = (-((-9009) & 11069)) & (-21521) & 24575;
        llIIIIlIII[21] = 94 ^ 108;
        llIIIIlIII[22] = (-12298) & 14815;
        llIIIIlIII[23] = (127 ^ 107) ^ (16 ^ 12);
        llIIIIlIII[24] = 20 ^ 29;
        llIIIIlIII[25] = (-((-10405) & 15015)) & (-16385) & 24287;
        llIIIIlIII[26] = (-((-2117) & 31693)) & (-1) & 32766;
        llIIIIlIII[27] = 234 ^ 156;
        llIIIIlIII[28] = (((14 ^ 43) + (20 ^ 79)) - (56 ^ 123)) + (64 ^ 12);
        llIIIIlIII[29] = -" ".length();
        llIIIIlIII[30] = (((30 + 69) - 7) + 39) ^ (((116 + 16) - (-4)) + 0);
        llIIIIlIII[31] = 10 ^ 6;
        llIIIIlIII[32] = (-2577) & 2876;
        llIIIIlIII[33] = 114 ^ 127;
        llIIIIlIII[34] = 11 ^ 5;
        llIIIIlIII[35] = (237 ^ 167) ^ (197 ^ 159);
        llIIIIlIII[36] = (87 ^ 59) ^ (162 ^ 193);
        llIIIIlIII[37] = 1 ^ 16;
        llIIIIlIII[38] = 15 ^ 29;
        llIIIIlIII[39] = (168 ^ 167) ^ (34 ^ 62);
        llIIIIlIII[40] = 20 ^ 0;
        llIIIIlIII[41] = 63 ^ 42;
        llIIIIlIII[42] = 211 ^ 197;
        llIIIIlIII[43] = " ".length() ^ (93 ^ 75);
        llIIIIlIII[44] = (97 ^ 52) ^ (65 ^ 12);
        llIIIIlIII[45] = (((152 + 118) - 206) + 100) ^ (((75 + 74) - 22) + 62);
        llIIIIlIII[46] = 18 ^ 8;
        llIIIIlIII[47] = (86 ^ 113) ^ (1 ^ 61);
        llIIIIlIII[48] = 60 ^ 32;
        llIIIIlIII[49] = 26 ^ 4;
        llIIIIlIII[50] = (100 ^ 70) ^ (150 ^ 171);
        llIIIIlIII[51] = (-17604) & 26603;
        llIIIIlIII[52] = (-14337) & 15236;
        llIIIIlIII[53] = (-4226) & 6125;
        llIIIIlIII[54] = (-(80 ^ 116)) & (-273) & 12287;
        llIIIIlIII[55] = (-((-9673) & 14302)) & (-3075) & 32703;
        llIIIIlIII[56] = (116 ^ 5) ^ (12 ^ 85);
        llIIIIlIII[57] = "  ".length() ^ (52 ^ 82);
        llIIIIlIII[58] = (96 ^ 19) ^ (62 ^ 109);
        llIIIIlIII[59] = 101 ^ 68;
        llIIIIlIII[60] = 89 ^ 123;
        llIIIIlIII[61] = 132 ^ 167;
        llIIIIlIII[62] = 129 ^ 165;
        llIIIIlIII[63] = (16 ^ 26) ^ (79 ^ 96);
        llIIIIlIII[64] = 20 ^ 50;
        llIIIIlIII[65] = 166 ^ 129;
        llIIIIlIII[66] = 120 ^ 81;
        llIIIIlIII[67] = (-4649) & 7855;
        llIIIIlIII[68] = (-((-2765) & 11214)) & (-4641) & 16303;
        llIIIIlIII[69] = (-20553) & 23934;
        llIIIIlIII[70] = (-((-3713) & 7865)) & (-8193) & 15611;
        llIIIIlIII[71] = 17 ^ 59;
        llIIIIlIII[72] = 170 ^ 129;
        llIIIIlIII[73] = (((85 + 85) - 91) + 67) ^ (((142 + 99) - 137) + 86);
        llIIIIlIII[74] = 73 ^ 100;
        llIIIIlIII[75] = 143 ^ 161;
        llIIIIlIII[76] = (43 ^ 109) ^ (34 ^ 75);
        llIIIIlIII[77] = 74 ^ 122;
        llIIIIlIII[78] = (28 ^ 105) ^ (108 ^ 40);
    }

    private static boolean lIlIIIlllIllI(int i) {
        return i > 0;
    }

    private static void lIlIIIllIlllI() {
        llIIIIIlll = new String[llIIIIlIII[21]];
        llIIIIIlll[llIIIIlIII[4]] = lIlIIIllIlIll("KxkpLRwFFSNkDRgJLioITRkzIQIeXGc3GAQEJCwGAxdnJg4OG2cwAE0BMiEcGQ==", "mpGDo");
        llIIIIIlll[llIIIIlIII[3]] = lIlIIIllIllII("AFmYpClNWhThAY85n6j8pw==", "YbQbq");
        llIIIIIlll[llIIIIlIII[1]] = lIlIIIllIlIll("BTg2PSEkNz95Lyw3MzAjKg==", "MYXYM");
        llIIIIIlll[llIIIIlIII[12]] = lIlIIIllIlIll("HxN5LiItVjQmIzsfNyhwOQM8PCRoBSw/ICQfPDx8aAUuJiQrHjAhN2gCNm8SHS8QARc=", "HvYOP");
        llIIIIIlll[llIIIIlIII[7]] = lIlIIIllIlIll("JRkCHTg=", "akksS");
        llIIIIIlll[llIIIIlIII[15]] = lIlIIIllIllII("LbXhkc565uVqwe7G4qknrw==", "gpDJZ");
        llIIIIIlll[llIIIIlIII[17]] = lIlIIIllIllII("b/81SslZyuuQezfQIxkXkw==", "zRRcj");
        llIIIIIlll[llIIIIlIII[8]] = lIlIIIllIlIll("AQM2PA==", "BlYWf");
        llIIIIIlll[llIIIIlIII[23]] = lIlIIIllIlIll("Ez4jIix3NT03JiM=", "WWQVU");
        llIIIIIlll[llIIIIlIII[24]] = lIlIIIllIllII("NETZ+QVXKyG44FVMFwRJY/+l/kSHuHte", "nsnlM");
        llIIIIIlll[llIIIIlIII[2]] = lIlIIIllIllIl("+PbiBAfYqe4=", "wIExF");
        llIIIIIlll[llIIIIlIII[30]] = lIlIIIllIlIll("FCMpThA2MBcP", "DUynQ");
        llIIIIIlll[llIIIIlIII[31]] = lIlIIIllIllII("EUua6z6M2fSpJr7XB+qQ4g==", "MAlND");
        llIIIIIlll[llIIIIlIII[33]] = lIlIIIllIllII("V0aE5ZkXuEg=", "JrFIo");
        llIIIIIlll[llIIIIlIII[34]] = lIlIIIllIlIll("DBE8", "NdEYh");
        llIIIIIlll[llIIIIlIII[36]] = lIlIIIllIlIll("JRE1Y3g=", "gdLCI");
        llIIIIIlll[llIIIIlIII[35]] = lIlIIIllIllII("/8vBXIvq16U=", "zekoG");
        llIIIIIlll[llIIIIlIII[37]] = lIlIIIllIllIl("dFIEY++DyXHiVh0SRq6rXQ==", "ADhvs");
        llIIIIIlll[llIIIIlIII[38]] = lIlIIIllIllII("CmMpMXnkrDo=", "LaMNL");
        llIIIIIlll[llIIIIlIII[39]] = lIlIIIllIllIl("ycrJJiQokyXKP3j/JS/kNA==", "oyqjm");
        llIIIIIlll[llIIIIlIII[40]] = lIlIIIllIlIll("CAMnHT9sCDkINTg=", "LjUiF");
        llIIIIIlll[llIIIIlIII[41]] = lIlIIIllIlIll("JS4vBw==", "rKNuS");
        llIIIIIlll[llIIIIlIII[42]] = lIlIIIllIllIl("6Pp5/nsFpBjuJ1h5k33azA==", "VSlnA");
        llIIIIIlll[llIIIIlIII[43]] = lIlIIIllIlIll("JSgEBA==", "fGkon");
        llIIIIIlll[llIIIIlIII[44]] = lIlIIIllIlIll("MgYgIw==", "viOQq");
        llIIIIIlll[llIIIIlIII[45]] = lIlIIIllIllIl("Q0mMcLAfo8w=", "VkVZL");
        llIIIIIlll[llIIIIlIII[46]] = lIlIIIllIlIll("DiMKHw==", "OQclD");
        llIIIIIlll[llIIIIlIII[47]] = lIlIIIllIllIl("V1E6jWBEPLJST7cppQXjzA==", "jtswc");
        llIIIIIlll[llIIIIlIII[48]] = lIlIIIllIllII("f1RQ970QyM0=", "yaUnI");
        llIIIIIlll[llIIIIlIII[0]] = lIlIIIllIllII("8oaPojMTmtE=", "KLcqJ");
        llIIIIIlll[llIIIIlIII[49]] = lIlIIIllIlIll("JzECVjYEaAkTLhY=", "bHgvY");
        llIIIIIlll[llIIIIlIII[50]] = lIlIIIllIlIll("IjU+CxNEJScDFBA=", "dGKbg");
        llIIIIIlll[llIIIIlIII[58]] = lIlIIIllIlIll("Oi8jdxgcCBUjSxkcAiQf", "higWk");
        llIIIIIlll[llIIIIlIII[59]] = lIlIIIllIlIll("NRg2C1koF3gbHCYdLARZbw==", "GqXly");
        llIIIIIlll[llIIIIlIII[60]] = lIlIIIllIllII("RcjHF7zsp3w=", "SNPit");
        llIIIIIlll[llIIIIlIII[61]] = lIlIIIllIllII("VkVA6upS/ps=", "tjkTR");
        llIIIIIlll[llIIIIlIII[62]] = lIlIIIllIllIl("XLBrdLnwC+c=", "jrbgf");
        llIIIIIlll[llIIIIlIII[63]] = lIlIIIllIllII("H98I/U2O3nQ=", "Qzicy");
        llIIIIIlll[llIIIIlIII[64]] = lIlIIIllIllIl("0/VX+/WUSI0=", "aSAZb");
        llIIIIIlll[llIIIIlIII[65]] = lIlIIIllIllIl("oc/fBpqybC4=", "ivmOK");
        llIIIIIlll[llIIIIlIII[56]] = lIlIIIllIllII("TeNUPL9Wpi8=", "AbxMD");
        llIIIIIlll[llIIIIlIII[66]] = lIlIIIllIlIll("Ky0KDhEhPw==", "OXobx");
        llIIIIIlll[llIIIIlIII[71]] = lIlIIIllIllIl("8b/B8YC+vY4+vMLzcsEsoYy69sOzvVin", "MMVOK");
        llIIIIIlll[llIIIIlIII[72]] = lIlIIIllIllIl("01HAaoKBXr+ohvFv1KVBmftOJqFjUB5UYNUwOoC+09hkHo/GvjTDpXtv6ovyjJko", "XXFCE");
        llIIIIIlll[llIIIIlIII[73]] = lIlIIIllIllIl("5WJic54+P7a4/cO1262GjCBJ+w4igHZnbPfA1PdydILH49E2N4Xj/v41PA7yYFGP", "rPAah");
        llIIIIIlll[llIIIIlIII[74]] = lIlIIIllIlIll("ACgWYw==", "YMeMi");
        llIIIIIlll[llIIIIlIII[75]] = lIlIIIllIlIll("IyoQBEgHYgYCABolTg==", "tBqpo");
        llIIIIIlll[llIIIIlIII[76]] = lIlIIIllIllIl("fNX/qdsFrXd6Qz9V6Vd6xcf5HN4+CgETq+zoGICatxsBhQv5PwZDkQ==", "RbzuP");
        llIIIIIlll[llIIIIlIII[77]] = lIlIIIllIllIl("+WkvQHX9yLQyvpDTKTjVKWpUFZqmTtudjessPmJG4iI=", "zprab");
        llIIIIIlll[llIIIIlIII[78]] = lIlIIIllIllII("sX3OsolSC+vEqNVTYtijS6pPh81OZCTBeaX2bBtnsKA=", "fPrZZ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[llIIIIlIII[3]];
        strArr[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[49]];
        if (lIlIIIlllIllI(Inventory.getCount(strArr))) {
            int[] iArr = new int[llIIIIlIII[3]];
            iArr[llIIIIlIII[4]] = llIIIIlIII[14];
            if (lIlIIIlllIllI(Inventory.getCount(iArr))) {
                String[] strArr2 = new String[llIIIIlIII[3]];
                strArr2[llIIIIlIII[4]] = llIIIIIlll[llIIIIlIII[50]];
                if (lIlIIIlllIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                    int[] iArr2 = new int[llIIIIlIII[3]];
                    iArr2[llIIIIlIII[4]] = llIIIIlIII[18];
                    if (lIlIIIlllIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llIIIIlIII[3]];
                        iArr3[llIIIIlIII[4]] = llIIIIlIII[11];
                        if (lIlIIIlllIIll(Inventory.contains(iArr3) ? 1 : 0)) {
                            ?? r0 = llIIIIlIII[3];
                            "".length();
                            return ((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true)) ? ((((70 + 30) - 90) + 121) ^ (((176 + 161) - 324) + 165)) & (((((19 + 51) - (-1)) + 94) ^ (((35 + 61) - 58) + 110)) ^ (-" ".length())) : r0;
                        }
                    }
                }
            }
        }
        return llIIIIlIII[4];
    }

    private static String lIlIIIllIllII(String llllllllllllllllllIllIlIIIIIlllI, String llllllllllllllllllIllIlIIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIlIIIIIllIl.getBytes(StandardCharsets.UTF_8)), llIIIIlIII[23]), "DES");
            Cipher llllllllllllllllllIllIlIIIIlIIII = Cipher.getInstance("DES");
            llllllllllllllllllIllIlIIIIlIIII.init(llIIIIlIII[1], secretKeySpec);
            return new String(llllllllllllllllllIllIlIIIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIlIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIlIIIIIlIlI) {
            llllllllllllllllllIllIlIIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIllllIII(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIIIllIllIl(String llllllllllllllllllIllIlIIIllIIll, String llllllllllllllllllIllIlIIIllIIlI) {
        try {
            SecretKeySpec llllllllllllllllllIllIlIIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllIlIIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIllIlIIIllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIllIlIIIllIlIl.init(llIIIIlIII[1], llllllllllllllllllIllIlIIIllIllI);
            return new String(llllllllllllllllllIllIlIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllIlIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllIlIIIllIlII) {
            llllllllllllllllllIllIlIIIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllIIIl(int i, int i2) {
        return i == i2;
    }
}
