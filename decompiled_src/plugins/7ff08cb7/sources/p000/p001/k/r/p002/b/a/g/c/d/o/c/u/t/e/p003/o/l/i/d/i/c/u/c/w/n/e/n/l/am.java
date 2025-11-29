package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.am  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/am.class */
public class am implements ab {
    public static final /* synthetic */ int mp;
    private static /* synthetic */ int[] lIIIIllIlI;
    private static /* synthetic */ String[] lIIIIllIIl;
    public static final /* synthetic */ WorldPoint ms;
    public static /* synthetic */ boolean bv;
    public static final /* synthetic */ int mo;
    public static final /* synthetic */ int mq;
    public static /* synthetic */ List<C0003d> bx;
    public static final /* synthetic */ WorldPoint mr;

    private static boolean lllIIlIIIlII(int i, int i2) {
        return i <= i2;
    }

    static {
        lllIIIllllII();
        lllIIIlllIll();
        mp = lIIIIllIlI[9];
        mo = lIIIIllIlI[6];
        mq = lIIIIllIlI[11];
        mr = new WorldPoint(lIIIIllIlI[37], lIIIIllIlI[38], lIIIIllIlI[0]);
        ms = new WorldPoint(lIIIIllIlI[39], lIIIIllIlI[40], lIIIIllIlI[0]);
        bx = new ArrayList();
    }

    private static boolean lllIIlIIIIIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIllIlI[0];
    }

    private static String lllIIIlllIII(String lllIIlIIIIII, String lllIIIllllll) {
        try {
            SecretKeySpec lllIIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIllllll.getBytes(StandardCharsets.UTF_8)), lIIIIllIlI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIllIlI[2], lllIIlIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIlIIIIIl) {
            lllIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlllllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    public static void ed() {
        if (lllIIIllllIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[0]];
            C0001b.a(bx);
            if (lllIIIlllllI(bx.size(), lIIIIllIlI[1])) {
                System.out.println(lIIIIllIIl[lIIIIllIlI[1]]);
                bv = lIIIIllIlI[0];
            }
        }
        if (lllIIIllllll(bv ? 1 : 0)) {
            if (lllIIIllllll(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIIlIIIIII(nearest) && lllIIIllllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[2]];
                    C0000a.a(nearest);
                }
                if (lllIIlIIIIII(nearest) && lllIIIllllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[3]];
                    if (lllIIIllllll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIllIlI[4]);
                        "".length();
                    }
                    if (lllIIIllllIl(Bank.isOpen() ? 1 : 0)) {
                        if (lllIIlIIIIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIllIlI[1]);
                            "".length();
                        }
                        if (lllIIlIIIIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIllIlI[2]);
                            "".length();
                        }
                    }
                    if (lllIIIlllllI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[5])) {
                        int[] iArr = new int[lIIIIllIlI[1]];
                        iArr[lIIIIllIlI[0]] = lIIIIllIlI[6];
                        if (lllIIIllllll(Bank.contains(iArr) ? 1 : 0)) {
                            Q();
                            System.out.println(lIIIIllIIl[lIIIIllIlI[7]]);
                            bv = lIIIIllIlI[1];
                            return;
                        }
                    }
                    if (lllIIlIIIIlI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[5]) && lllIIIlllllI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[8])) {
                        int[] iArr2 = new int[lIIIIllIlI[1]];
                        iArr2[lIIIIllIlI[0]] = lIIIIllIlI[9];
                        if (lllIIIllllll(Bank.contains(iArr2) ? 1 : 0)) {
                            Q();
                            System.out.println(lIIIIllIIl[lIIIIllIlI[10]]);
                            bv = lIIIIllIlI[1];
                            return;
                        }
                    }
                    if (lllIIlIIIIlI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[8])) {
                        int[] iArr3 = new int[lIIIIllIlI[1]];
                        iArr3[lIIIIllIlI[0]] = lIIIIllIlI[11];
                        if (lllIIIllllll(Bank.contains(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(lIIIIllIIl[lIIIIllIlI[12]]);
                            bv = lIIIIllIlI[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[lIIIIllIlI[1]];
                    iArr4[lIIIIllIlI[0]] = lIIIIllIlI[13];
                    if (lllIIIllllll(Equipment.contains(iArr4) ? 1 : 0) && lllIIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(ms), lIIIIllIlI[14])) {
                        C0000a.b(C0005f.aU, lIIIIllIlI[1]);
                        Time.sleepTicks(lIIIIllIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIIIIllIlI[1]];
                            iArr5[lIIIIllIlI[0]] = lIIIIllIlI[13];
                            if (lllIIlIIIIIl(Inventory.getCount(iArr5))) {
                                ?? r0 = lIIIIllIlI[1];
                                "".length();
                                return ((((74 + 153) - 70) + 12) ^ (((68 + 145) - 200) + 160)) == (-" ".length()) ? ((58 ^ 125) ^ (39 ^ 77)) & (((((113 + 108) - 102) + 55) ^ (((49 + 8) - (-58)) + 16)) ^ (-" ".length())) : r0;
                            }
                            return lIIIIllIlI[0];
                        }, lIIIIllIlI[4]);
                        "".length();
                    }
                    if (lllIIIlllllI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[5])) {
                        Bank.withdrawAll(lIIIIllIlI[6], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIIllIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIIIIllIlI[1]];
                            iArr5[lIIIIllIlI[0]] = lIIIIllIlI[6];
                            if (lllIIlIIIIIl(Inventory.getCount(iArr5))) {
                                ?? r0 = lIIIIllIlI[1];
                                "".length();
                                return (-" ".length()) >= (((43 ^ 21) ^ (110 ^ 51)) & (((((35 + 179) - 158) + 139) ^ (((95 + 100) - 181) + 146)) ^ (-" ".length()))) ? ((40 ^ 18) ^ (129 ^ 171)) & (((29 ^ 12) ^ " ".length()) ^ (-" ".length())) : r0;
                            }
                            return lIIIIllIlI[0];
                        }, lIIIIllIlI[4]);
                        "".length();
                    }
                    if (lllIIlIIIIlI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[5]) && lllIIIlllllI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[8])) {
                        Bank.withdrawAll(lIIIIllIlI[9], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIIllIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIIIIllIlI[1]];
                            iArr5[lIIIIllIlI[0]] = lIIIIllIlI[9];
                            if (lllIIlIIIIIl(Inventory.getCount(iArr5))) {
                                ?? r0 = lIIIIllIlI[1];
                                "".length();
                                return ((35 ^ 122) ^ (89 ^ 4)) == "   ".length() ? ((((126 + 229) - 321) + 217) ^ (((120 + 126) - 203) + 156)) & (((((1 + 88) - 32) + 71) ^ (((72 + 123) - 127) + 120)) ^ (-" ".length())) : r0;
                            }
                            return lIIIIllIlI[0];
                        }, lIIIIllIlI[4]);
                        "".length();
                    }
                    if (lllIIlIIIIlI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[8])) {
                        Bank.withdrawAll(lIIIIllIlI[11], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIIllIlI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr5 = new int[lIIIIllIlI[1]];
                            iArr5[lIIIIllIlI[0]] = lIIIIllIlI[11];
                            if (lllIIlIIIIIl(Inventory.getCount(iArr5))) {
                                ?? r0 = lIIIIllIlI[1];
                                "".length();
                                return (30 ^ 27) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lIIIIllIlI[0];
                        }, lIIIIllIlI[4]);
                        "".length();
                    }
                }
            }
            if (lllIIIllllIl(an() ? 1 : 0)) {
                int[] iArr5 = new int[lIIIIllIlI[1]];
                iArr5[lIIIIllIlI[0]] = lIIIIllIlI[13];
                if (lllIIIllllIl(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIIIllIlI[1]];
                    iArr6[lIIIIllIlI[0]] = lIIIIllIlI[13];
                    if (lllIIIllllll(Equipment.contains(iArr6) ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[15]];
                        int[] iArr7 = new int[lIIIIllIlI[1]];
                        iArr7[lIIIIllIlI[0]] = lIIIIllIlI[13];
                        Item first = Inventory.getFirst(iArr7);
                        if (lllIIlIIIIII(first)) {
                            first.interact(lIIIIllIIl[lIIIIllIlI[16]]);
                            Time.sleepTicks(lIIIIllIlI[3]);
                            "".length();
                        }
                    }
                }
                if (lllIIlIIIIll(Players.getLocal().getWorldLocation().distanceTo(ms), lIIIIllIlI[10])) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[17]];
                    Movement.walkTo(ms);
                    "".length();
                    Time.sleepTicks(lIIIIllIlI[7]);
                    "".length();
                }
                if (lllIIlIIIlII(Players.getLocal().getWorldLocation().distanceTo(ms), lIIIIllIlI[10])) {
                    AccBuilderGWD.c = lIIIIllIIl[lIIIIllIlI[18]];
                    WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                    String[] strArr = new String[lIIIIllIlI[1]];
                    strArr[lIIIIllIlI[0]] = lIIIIllIIl[lIIIIllIlI[19]];
                    TileObject nearest2 = TileObjects.getNearest(worldLocation, strArr);
                    if (lllIIlIIIIII(nearest2)) {
                        if (lllIIIllllll(Production.isOpen() ? 1 : 0)) {
                            nearest2.interact(lIIIIllIIl[lIIIIllIlI[20]]);
                            Time.sleepTicks(lIIIIllIlI[2]);
                            "".length();
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, lIIIIllIlI[4]);
                            "".length();
                        }
                        if (lllIIIllllIl(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption(lIIIIllIlI[1]);
                            Time.sleepTicks(lIIIIllIlI[7]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (!lllIIIllllIl(an() ? 1 : 0) || lllIIIllllIl(Dialog.isOpen() ? 1 : 0)) {
                                    ?? r0 = lIIIIllIlI[1];
                                    "".length();
                                    return 0 != 0 ? ((180 ^ 163) ^ (100 ^ 36)) & (((((156 + 53) - 38) + 28) ^ (((26 + 55) - 35) + 98)) ^ (-" ".length())) : r0;
                                }
                                return lIIIIllIlI[0];
                            }, lIIIIllIlI[21]);
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static boolean lllIIlIIIIll(int i, int i2) {
        return i > i2;
    }

    private static void Q() {
        if (lllIIIlllllI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[5])) {
            bx.add(new C0003d(lIIIIllIlI[6], lIIIIllIlI[22], lIIIIllIlI[23]));
            "".length();
        }
        if (lllIIlIIIIlI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[5]) && lllIIIlllllI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[8])) {
            bx.add(new C0003d(lIIIIllIlI[9], lIIIIllIlI[24], lIIIIllIlI[25]));
            "".length();
        }
        if (lllIIlIIIIlI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[8])) {
            bx.add(new C0003d(lIIIIllIlI[11], lIIIIllIlI[24], lIIIIllIlI[25]));
            "".length();
        }
        if (lllIIIllllll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIIllIIl[lIIIIllIlI[5]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIllIlI[13], lIIIIllIlI[26], lIIIIllIlI[27]));
            "".length();
        }
        if (lllIIIllllll(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIIllIIl[lIIIIllIlI[36]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIllIlI[28], lIIIIllIlI[10], lIIIIllIlI[29]));
            "".length();
        }
        int[] iArr = new int[lIIIIllIlI[1]];
        iArr[lIIIIllIlI[0]] = lIIIIllIlI[30];
        if (lllIIIllllll(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lIIIIllIlI[30], lIIIIllIlI[31], lIIIIllIlI[32]));
            "".length();
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        ed();
        return lIIIIllIlI[33];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    private static boolean an() {
        if (lllIIlIIIIlI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[8])) {
            int[] iArr = new int[lIIIIllIlI[1]];
            iArr[lIIIIllIlI[0]] = lIIIIllIlI[11];
            if (lllIIlIIIIIl(Inventory.getCount(iArr))) {
                ?? r0 = lIIIIllIlI[1];
                "".length();
                return "   ".length() == ((((65 + 46) - (-37)) + 1) ^ (((132 + 106) - 191) + 98)) ? ((225 ^ 169) ^ (79 ^ 36)) & (((23 ^ 76) ^ (24 ^ 96)) ^ (-" ".length())) : r0;
            }
            return lIIIIllIlI[0];
        } else if (lllIIlIIIIlI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[5]) && lllIIIlllllI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[8])) {
            int[] iArr2 = new int[lIIIIllIlI[1]];
            iArr2[lIIIIllIlI[0]] = lIIIIllIlI[9];
            if (lllIIlIIIIIl(Inventory.getCount(iArr2))) {
                ?? r02 = lIIIIllIlI[1];
                "".length();
                return " ".length() >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
            }
            return lIIIIllIlI[0];
        } else {
            int[] iArr3 = new int[lIIIIllIlI[1]];
            iArr3[lIIIIllIlI[0]] = lIIIIllIlI[6];
            if (lllIIlIIIIIl(Inventory.getCount(iArr3))) {
                ?? r03 = lIIIIllIlI[1];
                "".length();
                return (((105 ^ 9) ^ (83 ^ 121)) & (((((132 + 141) - 73) + 5) ^ (((57 + 14) - 47) + 111)) ^ (-" ".length()))) != 0 ? ((79 ^ 55) ^ (219 ^ 170)) & (((35 ^ 125) ^ (242 ^ 165)) ^ (-" ".length())) : r03;
            }
            return lIIIIllIlI[0];
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lIIIIllIIl[lIIIIllIlI[34]];
    }

    private static boolean lllIIlIIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lllIIlIIIIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lllIIlIIIIlI(Skills.getLevel(Skill.COOKING), lIIIIllIlI[35])) {
            ?? r0 = lIIIIllIlI[1];
            "".length();
            return (-" ".length()) > 0 ? ((((134 + 116) - 245) + 199) ^ (((81 + 130) - 78) + 16)) & (((107 ^ 77) ^ (((108 + 101) - 186) + 104)) ^ (-" ".length())) : r0;
        }
        return lIIIIllIlI[0];
    }

    private static String lllIIIlllIlI(String lllIIIIllIll, String lllIIIIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIllIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIIlllII) {
            lllIIIIlllII.printStackTrace();
            return null;
        }
    }

    private static void lllIIIllllII() {
        lIIIIllIlI = new int[42];
        lIIIIllIlI[0] = (34 ^ 119) & ((118 ^ 35) ^ (-1));
        lIIIIllIlI[1] = " ".length();
        lIIIIllIlI[2] = "  ".length();
        lIIIIllIlI[3] = "   ".length();
        lIIIIllIlI[4] = (-((-19265) & 27511)) & (-1090) & 14335;
        lIIIIllIlI[5] = (((8 + 100) - 4) + 60) ^ (((124 + 115) - 206) + 138);
        lIIIIllIlI[6] = (-((-14261) & 32759)) & (-8833) & 27647;
        lIIIIllIlI[7] = (((15 + 122) - 22) + 46) ^ (((48 + 78) - 119) + 158);
        lIIIIllIlI[8] = 115 ^ 109;
        lIIIIllIlI[9] = (-((-2325) & 32565)) & (-2177) & 32751;
        lIIIIllIlI[10] = (((113 + 151) - 208) + 137) ^ (((91 + 4) - 77) + 178);
        lIIIIllIlI[11] = (-23169) & 23527;
        lIIIIllIlI[12] = 109 ^ 107;
        lIIIIllIlI[13] = (-((-2385) & 32598)) & (-3) & 32767;
        lIIIIllIlI[14] = 14 ^ 23;
        lIIIIllIlI[15] = 86 ^ 81;
        lIIIIllIlI[16] = (((97 + 3) - 1) + 66) ^ (((34 + 139) - 28) + 28);
        lIIIIllIlI[17] = (154 ^ 162) ^ (191 ^ 142);
        lIIIIllIlI[18] = (58 ^ 86) ^ (9 ^ 111);
        lIIIIllIlI[19] = (((6 + 3) - (-106)) + 39) ^ (((48 + 91) - 131) + 137);
        lIIIIllIlI[20] = (((22 + 174) - 7) + 14) ^ (((111 + 152) - 131) + 67);
        lIIIIllIlI[21] = (-((-21826) & 22355)) & (-1) & 65529;
        lIIIIllIlI[22] = ((185 + 12) - 166) + 219;
        lIIIIllIlI[23] = (-30403) & 30702;
        lIIIIllIlI[24] = (-((-1015) & 32767)) & (-514) & 32765;
        lIIIIllIlI[25] = ((51 + 23) - (-60)) + 66;
        lIIIIllIlI[26] = 29 ^ 9;
        lIIIIllIlI[27] = (-((-986) & 31739)) & (-3) & 32755;
        lIIIIllIlI[28] = (-307) & 12286;
        lIIIIllIlI[29] = (-((-161) & 7399)) & (-513) & 32750;
        lIIIIllIlI[30] = (-(((89 + 148) - 216) + 164)) & (-8193) & 16383;
        lIIIIllIlI[31] = 4 ^ 44;
        lIIIIllIlI[32] = (-((-8405) & 29910)) & (-8297) & 30701;
        lIIIIllIlI[33] = (125 ^ 19) ^ (116 ^ 126);
        lIIIIllIlI[34] = (128 ^ 167) ^ (98 ^ 72);
        lIIIIllIlI[35] = (40 ^ 59) ^ (88 ^ 40);
        lIIIIllIlI[36] = 12 ^ 2;
        lIIIIllIlI[37] = (-((-4021) & 28599)) & (-33) & 27879;
        lIIIIllIlI[38] = (-29599) & 32766;
        lIIIIllIlI[39] = (-((-268) & 29471)) & (-33) & 32507;
        lIIIIllIlI[40] = (-28673) & 31852;
        lIIIIllIlI[41] = 106 ^ 122;
    }

    private static String lllIIIlllIIl(String lllIIIllIIII, String lllIIIlIllll) {
        String str = new String(Base64.getDecoder().decode(lllIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllIIIlIllIl = lllIIIlIllll.toCharArray();
        int lllIIIlIllII = lIIIIllIlI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIIllIlI[0];
        while (lllIIIlllllI(i, length)) {
            char lllIIIllIIIl = charArray[i];
            sb.append((char) (lllIIIllIIIl ^ lllIIIlIllIl[lllIIIlIllII % lllIIIlIllIl.length]));
            "".length();
            lllIIIlIllII++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lllIIIlllIll() {
        lIIIIllIIl = new String[lIIIIllIlI[41]];
        lIIIIllIIl[lIIIIllIlI[0]] = lllIIIlllIII("SxA56fA10jgtGzGkrExq8Q==", "IlCnD");
        lIIIIllIIl[lIIIIllIlI[1]] = lllIIIlllIII("83czMqXSpu/PE8k0+t559zqjM/u5HF3npTZMXY5i2v1aeA2Xcy+7nD7tTMIjNgALXp6BP1WBMzw=", "YQoyy");
        lIIIIllIIl[lIIIIllIlI[2]] = lllIIIlllIII("oJFuNV/tlHX/g/z3fPXvakRKu8Iber7h", "AJIoR");
        lIIIIllIIl[lIIIIllIlI[3]] = lllIIIlllIII("PAi7A9TKgEV0AHv9X0483TGK2JCo52NX", "QxcGU");
        lIIIIllIIl[lIIIIllIlI[7]] = lllIIIlllIII("WfMdB4BgRMuxTWa/NAUuZ026ittH0ILHSGjVQZZDfGOsLOTx6vTmwXb1uQ3jXk+N", "WlxgM");
        lIIIIllIIl[lIIIIllIlI[10]] = lllIIIlllIII("TgeYhqAkkW++dmLonGG6ge+A70Gm51qLxf5jevjZ0OtijfTkhjnPHhr/uc/qlwAA", "jmfAC");
        lIIIIllIIl[lIIIIllIlI[12]] = lllIIIlllIIl("BzxEJhk1eQkuGCMwCiBLIywUNwc5PBdrSyMuDTMIODAKIEskNkQFPgkQKgA=", "PYdGk");
        lIIIIllIIl[lIIIIllIlI[15]] = lllIIIlllIlI("d2E8Gs5nCXdDUccCgh4VnQ==", "bNVQb");
        lIIIIllIIl[lIIIIllIlI[16]] = lllIIIlllIlI("D8E8Mx1n1Kg=", "vFGWf");
        lIIIIllIIl[lIIIIllIlI[17]] = lllIIIlllIII("rcmhJx1Ek/Z2EIw5lyxrISjzRZSXmK7n", "wfeVi");
        lIIIIllIIl[lIIIIllIlI[18]] = lllIIIlllIIl("Gh4VCjA3Fg==", "YqzaY");
        lIIIIllIIl[lIIIIllIlI[19]] = lllIIIlllIII("yIAnv+X1fwk=", "OZOJc");
        lIIIIllIIl[lIIIIllIlI[20]] = lllIIIlllIIl("LgccIQ==", "mhsJZ");
        lIIIIllIIl[lIIIIllIlI[34]] = lllIIIlllIlI("+kOHOI0VvI8=", "mAHPD");
        lIIIIllIIl[lIIIIllIlI[36]] = lllIIIlllIIl("Kj87InA3MHUyNTk6IS1wcA==", "XVUEP");
        lIIIIllIIl[lIIIIllIlI[5]] = lllIIIlllIlI("M2jVpczkS/Ta/H0g1rky3igNsvTiIlEl", "AGmIR");
    }

    private static boolean lllIIIllllIl(int i) {
        return i != 0;
    }

    private static boolean lllIIIllllll(int i) {
        return i == 0;
    }
}
