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
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.B  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/B.class */
public class B implements ab {
    private static /* synthetic */ WorldPoint ek;
    private static /* synthetic */ WorldPoint ei;
    public static /* synthetic */ List<C0003d> bx;
    private static /* synthetic */ String[] llIlIlllI;
    static /* synthetic */ boolean dl;
    static /* synthetic */ WorldArea ee;
    static /* synthetic */ boolean ef;
    static /* synthetic */ String[] cG;
    private static /* synthetic */ WorldPoint eh;
    static /* synthetic */ int dk;
    private static /* synthetic */ WorldPoint dg;
    private static /* synthetic */ WorldPoint eg;
    private static /* synthetic */ WorldPoint ej;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] llIlIllll;
    private static /* synthetic */ int el;

    private static String lIllIlIlllll(String lIIIllIIIlIlll, String lIIIllIIIlIllI) {
        String str = new String(Base64.getDecoder().decode(lIIIllIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIIIllIIIlIlII = lIIIllIIIlIllI.toCharArray();
        int lIIIllIIIlIIll = llIlIllll[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlIllll[2];
        while (lIllIllIIlII(i, length)) {
            char lIIIllIIIllIII = charArray[i];
            sb.append((char) (lIIIllIIIllIII ^ lIIIllIIIlIlII[lIIIllIIIlIIll % lIIIllIIIlIlII.length]));
            "".length();
            lIIIllIIIlIIll++;
            i++;
            "".length();
            if (((((89 + 101) - 185) + 133) ^ (((12 + 3) - (-87)) + 41)) == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIllIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static String lIllIllIIIIl(String lIIIllIIlIIlll, String lIIIllIIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIllIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIllIIlIlIII) {
            lIIIllIIlIlIII.printStackTrace();
            return null;
        }
    }

    private static void Q() {
        int[] iArr = new int[llIlIllll[1]];
        iArr[llIlIllll[2]] = llIlIllll[12];
        if (lIllIllIIlll(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(llIlIllll[12], llIlIllll[1], llIlIllll[57]));
            "".length();
        }
        int[] iArr2 = new int[llIlIllll[1]];
        iArr2[llIlIllll[2]] = llIlIllll[10];
        if (lIllIllIIlll(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(llIlIllll[10], llIlIllll[1], llIlIllll[4]));
            "".length();
        }
        int[] iArr3 = new int[llIlIllll[1]];
        iArr3[llIlIllll[2]] = llIlIllll[9];
        if (lIllIllIIlll(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(llIlIllll[9], llIlIllll[1], llIlIllll[4]));
            "".length();
        }
        int[] iArr4 = new int[llIlIllll[1]];
        iArr4[llIlIllll[2]] = llIlIllll[14];
        if (lIllIllIIlll(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(llIlIllll[14], llIlIllll[24], llIlIllll[4]));
            "".length();
        }
        int[] iArr5 = new int[llIlIllll[1]];
        iArr5[llIlIllll[2]] = llIlIllll[16];
        if (lIllIllIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(llIlIllll[16], llIlIllll[24], C0009j.ch));
            "".length();
        }
        int[] iArr6 = new int[llIlIllll[1]];
        iArr6[llIlIllll[2]] = llIlIllll[11];
        if (lIllIllIIlll(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(llIlIllll[11], llIlIllll[0], llIlIllll[58]));
            "".length();
        }
        if (lIllIllIIlll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIlllI[llIlIllll[64]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(llIlIllll[59], llIlIllll[13], llIlIllll[60]));
            "".length();
        }
        int[] iArr7 = new int[llIlIllll[1]];
        iArr7[llIlIllll[2]] = llIlIllll[8];
        if (lIllIllIIlll(Bank.contains(iArr7) ? 1 : 0)) {
            bx.add(new C0003d(llIlIllll[8], llIlIllll[52], llIlIllll[61]));
            "".length();
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIlIlllI[llIlIllll[63]];
    }

    static {
        lIllIllIIIll();
        lIllIllIIIlI();
        bx = new ArrayList();
        ee = new WorldArea(llIlIllll[65], llIlIllll[66], llIlIllll[24], llIlIllll[25], llIlIllll[2]);
        String[] strArr = new String[llIlIllll[22]];
        strArr[llIlIllll[2]] = llIlIlllI[llIlIllll[67]];
        strArr[llIlIllll[1]] = llIlIlllI[llIlIllll[68]];
        strArr[llIlIllll[3]] = llIlIlllI[llIlIllll[69]];
        strArr[llIlIllll[5]] = llIlIlllI[llIlIllll[19]];
        strArr[llIlIllll[6]] = llIlIlllI[llIlIllll[70]];
        strArr[llIlIllll[13]] = llIlIlllI[llIlIllll[71]];
        strArr[llIlIllll[15]] = llIlIlllI[llIlIllll[72]];
        strArr[llIlIllll[7]] = llIlIlllI[llIlIllll[73]];
        cG = strArr;
        dg = new WorldPoint(llIlIllll[74], llIlIllll[75], llIlIllll[2]);
        eg = new WorldPoint(llIlIllll[76], llIlIllll[77], llIlIllll[2]);
        eh = new WorldPoint(llIlIllll[78], llIlIllll[79], llIlIllll[2]);
        ei = new WorldPoint(llIlIllll[80], llIlIllll[81], llIlIllll[2]);
        ej = new WorldPoint(llIlIllll[82], llIlIllll[83], llIlIllll[2]);
        ek = new WorldPoint(llIlIllll[84], llIlIllll[85], llIlIllll[2]);
        el = llIlIllll[24];
    }

    private static boolean lIllIllIIllI(int i) {
        return i != 0;
    }

    private static boolean lIllIllIlIIl(int i) {
        return i > 0;
    }

    private static boolean lIllIllIIlII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return llIlIllll[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v294, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public static void bs() {
        if (lIllIllIIlII(Skills.getLevel(Skill.FISHING), llIlIllll[0])) {
            ao.ey();
        }
        if (lIllIllIIlIl(Skills.getLevel(Skill.FISHING), llIlIllll[0])) {
            if (lIllIllIIllI(bv ? 1 : 0)) {
                C0001b.a(bx);
                if (lIllIllIIlII(bx.size(), llIlIllll[1])) {
                    System.out.println(llIlIlllI[llIlIllll[2]]);
                    bv = llIlIllll[2];
                }
            }
            if (lIllIllIIlll(bv ? 1 : 0)) {
                if (lIllIllIIlll(an() ? 1 : 0) && lIllIllIIlII(C0004e.j(el), llIlIllll[1])) {
                    String[] strArr = new String[llIlIllll[1]];
                    strArr[llIlIllll[2]] = llIlIlllI[llIlIllll[1]];
                    if (lIllIllIIlll(Inventory.contains(strArr) ? 1 : 0)) {
                        BankLocation nearest = BankLocation.getNearest();
                        if (lIllIllIlIII(nearest) && lIllIllIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[3]];
                            C0000a.a(nearest);
                        }
                        if (lIllIllIlIII(nearest) && lIllIllIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            if (lIllIllIIlll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepUntil(() -> {
                                    return Bank.isOpen();
                                }, llIlIllll[4]);
                                "".length();
                            }
                            if (lIllIllIIllI(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderGWD.c = llIlIlllI[llIlIllll[5]];
                                if (lIllIllIlIIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks(llIlIllll[6]);
                                    "".length();
                                }
                                if (lIllIllIlIIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks(llIlIllll[3]);
                                    "".length();
                                }
                                int[] iArr = new int[llIlIllll[7]];
                                iArr[llIlIllll[2]] = llIlIllll[8];
                                iArr[llIlIllll[1]] = llIlIllll[9];
                                iArr[llIlIllll[3]] = llIlIllll[10];
                                iArr[llIlIllll[5]] = llIlIllll[11];
                                iArr[llIlIllll[6]] = llIlIllll[12];
                                iArr[llIlIllll[13]] = llIlIllll[14];
                                iArr[llIlIllll[15]] = llIlIllll[16];
                                if (lIllIllIIlll(C0004e.d(iArr) ? 1 : 0)) {
                                    Q();
                                    System.out.println(llIlIlllI[llIlIllll[6]]);
                                    bv = llIlIllll[1];
                                    return;
                                }
                                int[] iArr2 = new int[llIlIllll[15]];
                                iArr2[llIlIllll[2]] = llIlIllll[8];
                                iArr2[llIlIllll[1]] = llIlIllll[9];
                                iArr2[llIlIllll[3]] = llIlIllll[10];
                                iArr2[llIlIllll[5]] = llIlIllll[11];
                                iArr2[llIlIllll[6]] = llIlIllll[12];
                                iArr2[llIlIllll[13]] = llIlIllll[14];
                                if (lIllIllIIllI(C0004e.d(iArr2) ? 1 : 0)) {
                                    C0000a.a(llIlIllll[8], llIlIllll[0]);
                                    C0000a.a(llIlIllll[14], llIlIllll[0]);
                                    C0000a.a(llIlIllll[9], llIlIllll[1]);
                                    C0000a.a(llIlIllll[10], llIlIllll[1]);
                                    C0000a.a(llIlIllll[11], llIlIllll[0]);
                                    C0000a.a(llIlIllll[12], llIlIllll[1]);
                                    C0000a.a(llIlIllll[16], llIlIllll[5]);
                                    C0000a.a(llIlIllll[17], llIlIllll[18]);
                                }
                            }
                        }
                    }
                }
                if (lIllIllIIllI(Inventory.contains(C0005f.bc) ? 1 : 0) && lIllIllIIlII(Movement.getRunEnergy(), llIlIllll[19])) {
                    Inventory.getFirst(C0005f.bc).interact(llIlIlllI[llIlIllll[13]]);
                    Time.sleepTicks(llIlIllll[1]);
                    "".length();
                }
                if (lIllIllIIllI(an() ? 1 : 0) && lIllIllIIlII(C0004e.j(el), llIlIllll[1])) {
                    int[] iArr3 = new int[llIlIllll[1]];
                    iArr3[llIlIllll[2]] = llIlIllll[20];
                    if (lIllIllIIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[0])) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[15]];
                            if (lIllIllIIllI(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            Movement.walkTo(dg);
                            "".length();
                            Time.sleepTicks(llIlIllll[1]);
                            "".length();
                        }
                        if (lIllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[21])) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[7]];
                            C0006g.a(llIlIlllI[llIlIllll[22]], cG);
                        }
                    }
                }
                if (lIllIllIllII(C0004e.j(el), llIlIllll[1])) {
                    int[] iArr4 = new int[llIlIllll[1]];
                    iArr4[llIlIllll[2]] = llIlIllll[20];
                    if (lIllIllIIllI(Inventory.contains(iArr4) ? 1 : 0)) {
                        String[] strArr2 = new String[llIlIllll[1]];
                        strArr2[llIlIllll[2]] = llIlIlllI[llIlIllll[23]];
                        if (lIllIllIIlll(Inventory.contains(strArr2) ? 1 : 0)) {
                            dk = llIlIllll[2];
                            String[] strArr3 = new String[llIlIllll[1]];
                            strArr3[llIlIllll[2]] = llIlIlllI[llIlIllll[0]];
                            if (lIllIllIIlll(Inventory.contains(strArr3) ? 1 : 0)) {
                                if (lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(eh), llIlIllll[6])) {
                                    AccBuilderGWD.c = llIlIlllI[llIlIllll[24]];
                                    Movement.walkTo(eh);
                                    "".length();
                                }
                                if (lIllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(eh), llIlIllll[6])) {
                                    AccBuilderGWD.c = llIlIlllI[llIlIllll[21]];
                                    String[] strArr4 = new String[llIlIllll[1]];
                                    strArr4[llIlIllll[2]] = llIlIlllI[llIlIllll[25]];
                                    if (lIllIllIIlll(Inventory.contains(strArr4) ? 1 : 0)) {
                                        String[] strArr5 = new String[llIlIllll[1]];
                                        strArr5[llIlIllll[2]] = llIlIlllI[llIlIllll[26]];
                                        if (lIllIllIlIII(TileObjects.getNearest(strArr5))) {
                                            String[] strArr6 = new String[llIlIllll[1]];
                                            strArr6[llIlIllll[2]] = llIlIlllI[llIlIllll[27]];
                                            TileObjects.getNearest(strArr6).interact(llIlIlllI[llIlIllll[28]]);
                                            Time.sleepTicks(llIlIllll[3]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                            String[] strArr7 = new String[llIlIllll[1]];
                            strArr7[llIlIllll[2]] = llIlIlllI[llIlIllll[29]];
                            if (lIllIllIIllI(Inventory.contains(strArr7) ? 1 : 0)) {
                                if (lIllIllIIlll(ee.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderGWD.c = llIlIlllI[llIlIllll[30]];
                                    if (lIllIllIIlll(Dialog.isOpen() ? 1 : 0)) {
                                        Movement.walkTo(ek);
                                        "".length();
                                        Time.sleepTicks(llIlIllll[1]);
                                        "".length();
                                    }
                                    C0006g.a(cG);
                                }
                                if (lIllIllIIllI(ee.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr8 = new String[llIlIllll[1]];
                                    strArr8[llIlIllll[2]] = llIlIlllI[llIlIllll[31]];
                                    if (lIllIllIIllI(Inventory.contains(strArr8) ? 1 : 0)) {
                                        AccBuilderGWD.c = llIlIlllI[llIlIllll[32]];
                                        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
                                        String[] strArr9 = new String[llIlIllll[1]];
                                        strArr9[llIlIllll[2]] = llIlIlllI[llIlIllll[33]];
                                        if (lIllIllIlIlI(worldLocation.distanceTo(TileObjects.getNearest(strArr9).getWorldLocation()), llIlIllll[3])) {
                                            String[] strArr10 = new String[llIlIllll[1]];
                                            strArr10[llIlIllll[2]] = llIlIlllI[llIlIllll[34]];
                                            Movement.walkTo(TileObjects.getNearest(strArr10).getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(llIlIllll[6]);
                                            "".length();
                                        }
                                        if (lIllIllIIlll(Dialog.isOpen() ? 1 : 0)) {
                                            String[] strArr11 = new String[llIlIllll[1]];
                                            strArr11[llIlIllll[2]] = llIlIlllI[llIlIllll[35]];
                                            Item first = Inventory.getFirst(strArr11);
                                            String[] strArr12 = new String[llIlIllll[1]];
                                            strArr12[llIlIllll[2]] = llIlIlllI[llIlIllll[36]];
                                            first.useOn(TileObjects.getNearest(strArr12));
                                            Time.sleepTicks(llIlIllll[3]);
                                            "".length();
                                        }
                                        C0006g.a(cG);
                                    }
                                    String[] strArr13 = new String[llIlIllll[1]];
                                    strArr13[llIlIllll[2]] = llIlIlllI[llIlIllll[37]];
                                    if (lIllIllIIlll(Inventory.contains(strArr13) ? 1 : 0) && lIllIllIIlll(ef ? 1 : 0)) {
                                        AccBuilderGWD.c = llIlIlllI[llIlIllll[38]];
                                        C0006g.a(llIlIlllI[llIlIllll[20]], cG);
                                        if (lIllIllIIllI(Dialog.getText().contains(llIlIlllI[llIlIllll[39]]) ? 1 : 0)) {
                                            ef = llIlIllll[1];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIllIllIllII(C0004e.j(el), llIlIllll[5])) {
                    String[] strArr14 = new String[llIlIllll[1]];
                    strArr14[llIlIllll[2]] = llIlIlllI[llIlIllll[40]];
                    if (lIllIllIIlll(Inventory.contains(strArr14) ? 1 : 0)) {
                        String[] strArr15 = new String[llIlIllll[1]];
                        strArr15[llIlIllll[2]] = llIlIlllI[llIlIllll[41]];
                        if (lIllIllIIlll(Inventory.contains(strArr15) ? 1 : 0)) {
                            AccBuilderGWD.c = llIlIlllI[llIlIllll[42]];
                            int[] iArr5 = new int[llIlIllll[1]];
                            iArr5[llIlIllll[2]] = llIlIllll[43];
                            NPCs.getNearest(iArr5).interact(llIlIlllI[llIlIllll[44]]);
                            Time.sleepTicks(llIlIllll[13]);
                            "".length();
                        }
                    }
                    String[] strArr16 = new String[llIlIllll[1]];
                    strArr16[llIlIllll[2]] = llIlIlllI[llIlIllll[45]];
                    if (lIllIllIIllI(Inventory.contains(strArr16) ? 1 : 0)) {
                        AccBuilderGWD.c = llIlIlllI[llIlIllll[46]];
                        C0006g.a(llIlIlllI[llIlIllll[47]], cG);
                    }
                }
                String[] strArr17 = new String[llIlIllll[1]];
                strArr17[llIlIllll[2]] = llIlIlllI[llIlIllll[48]];
                if (lIllIllIIllI(Inventory.contains(strArr17) ? 1 : 0)) {
                    if (lIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[13])) {
                        AccBuilderGWD.c = llIlIlllI[llIlIllll[49]];
                        Movement.walkTo(dg);
                        "".length();
                        Time.sleepTicks(llIlIllll[1]);
                        "".length();
                    }
                    if (lIllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(dg), llIlIllll[13])) {
                        AccBuilderGWD.c = llIlIlllI[llIlIllll[50]];
                        if (lIllIllIIlII(dk, llIlIllll[1])) {
                            as.na += llIlIllll[1];
                            as.u(AccBuilderGWD.m);
                            dk += llIlIllll[1];
                            as.na = llIlIllll[2];
                            dl = llIlIllll[2];
                        }
                        C0006g.a(llIlIlllI[llIlIllll[51]], cG);
                    }
                }
            }
        }
    }

    private static boolean lIllIllIlIlI(int i, int i2) {
        return i > i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bs();
            "".length();
            if (((((95 + 123) - 148) + 64) ^ (((82 + 102) - 173) + 120)) == 0) {
                return ((68 ^ 112) ^ (82 ^ 42)) & (((170 ^ 199) ^ (189 ^ 156)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llIlIllll[62];
    }

    private static String lIllIllIIIII(String lIIIllIIllIlII, String lIIIllIIllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIIllIIll.getBytes(StandardCharsets.UTF_8)), llIlIllll[22]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlIllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIllIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIllIIllIlIl) {
            lIIIllIIllIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIIIlI() {
        llIlIlllI = new String[llIlIllll[86]];
        llIlIlllI[llIlIllll[2]] = lIllIlIlllll("Nzs5OyIZNzNyMwQrPjw2UTsjNzwCfnchJhgmNDo4HzV3MDASOXcmPlEjIjciBQ==", "qRWRQ");
        llIlIlllI[llIlIllll[1]] = lIllIlIlllll("IScaDREJKUkVGRQ9", "gNiex");
        llIlIlllI[llIlIllll[3]] = lIllIllIIIII("jhyib9hlJmKjqc48PFb87Q==", "Tknzw");
        llIlIlllI[llIlIllll[5]] = lIllIllIIIIl("5CevT4GpbMjKKAOcMPJvkz+XIa/8NMAf", "PDYzU");
        llIlIlllI[llIlIllll[6]] = lIllIlIlllll("BQhoBjM3TSUOMiEEJgBhIxgtFDVyHj0XMT4ELRRtch4/DjUxBSEJJnIZJ0cDBzQBKQY=", "RmHgA");
        llIlIlllI[llIlIllll[13]] = lIllIlIlllll("PSAqAgE=", "yRClj");
        llIlIlllI[llIlIllll[15]] = lIllIllIIIIl("nqL9An48V6j4B6HlUOecSQ==", "mLYdr");
        llIlIlllI[llIlIllll[7]] = lIllIllIIIII("z0ndps+++HNtecD05Ylojg==", "zopqL");
        llIlIlllI[llIlIllll[22]] = lIllIllIIIII("hYh+oQ+tnE0=", "iXXVU");
        llIlIlllI[llIlIllll[23]] = lIllIlIlllll("MDkkLREYN3cxChkgPzw=", "vPWEx");
        llIlIlllI[llIlIllll[0]] = lIllIllIIIIl("FF61RenI+njUCqILWd+FcA==", "WbsSs");
        llIlIlllI[llIlIllll[24]] = lIllIllIIIIl("OLKdfvBWyjGVgJ7WPsjf6w==", "EBOQE");
        llIlIlllI[llIlIllll[21]] = lIllIlIlllll("CQUPNQIjCw==", "MlhRk");
        llIlIlllI[llIlIllll[25]] = lIllIllIIIIl("8PekdHeaGntBrBKSrHmtxg==", "heyDp");
        llIlIlllI[llIlIllll[26]] = lIllIlIlllll("Ij4iNA==", "tWLQg");
        llIlIlllI[llIlIllll[27]] = lIllIllIIIIl("FQMAUGu9F6A=", "aXWLO");
        llIlIlllI[llIlIllll[28]] = lIllIllIIIIl("AiuUlY0HihA=", "cSUBk");
        llIlIlllI[llIlIllll[29]] = lIllIllIIIIl("aAD7LNBqVOcozSKA4fXiNg==", "ZNdTT");
        llIlIlllI[llIlIllll[30]] = lIllIlIlllll("LCg3aj8NaSIlJRYsMj4=", "bIAJK");
        llIlIlllI[llIlIllll[31]] = lIllIlIlllll("JRILDx0B", "bsyct");
        llIlIlllI[llIlIllll[32]] = lIllIllIIIIl("S1QOUbqLV0yYZG/4MYfQ+Q==", "nZfge");
        llIlIlllI[llIlIllll[33]] = lIllIllIIIII("dRCpqWXLEIMTlJup9mz55g==", "fHmtA");
        llIlIlllI[llIlIllll[34]] = lIllIlIlllll("DxsEBHQIExgN", "XzhhT");
        llIlIlllI[llIlIllll[35]] = lIllIllIIIII("ByNgC4R75+c=", "ysdiP");
        llIlIlllI[llIlIllll[36]] = lIllIllIIIII("QyKWGyhK1XztmHLkm9JNEw==", "iloGG");
        llIlIlllI[llIlIllll[37]] = lIllIllIIIIl("MpPd6OZ+yWU=", "Yqjkr");
        llIlIlllI[llIlIllll[38]] = lIllIllIIIIl("5Xi7sGaThpJeJ3OVZFZycg==", "GjgJt");
        llIlIlllI[llIlIllll[20]] = lIllIllIIIIl("delJwCDSBpE=", "AyvYT");
        llIlIlllI[llIlIllll[39]] = lIllIlIlllll("BUEDCzAkFU4RIyUNAkI1KUEPADspQRoNdyoIAAZ3LUEMCzArBBxCMSUSBg==", "LanbW");
        llIlIlllI[llIlIllll[40]] = lIllIlIlllll("DhsGPRMq", "IztQz");
        llIlIlllI[llIlIllll[41]] = lIllIllIIIIl("PjyGMh7SXTESC/bW38jsZA==", "NlSMM");
        llIlIlllI[llIlIllll[42]] = lIllIlIlllll("NyU1EgsfKw==", "qLFzb");
        llIlIlllI[llIlIllll[44]] = lIllIllIIIII("r/Qwxqu7y18=", "eyxEd");
        llIlIlllI[llIlIllll[45]] = lIllIllIIIII("04DknFyOsFGtGTdSlZMSIg==", "xmUDg");
        llIlIlllI[llIlIllll[46]] = lIllIllIIIII("rSXqjQucTJh1tpM9hDvRyw==", "XxkcD");
        llIlIlllI[llIlIllll[47]] = lIllIllIIIII("k8V1a/aLbSY=", "PzLlZ");
        llIlIlllI[llIlIllll[48]] = lIllIllIIIII("nqi4XvyGYP0uJLXYF85AtA==", "rZxLH");
        llIlIlllI[llIlIllll[49]] = lIllIllIIIII("Imnvj59IbGvkUKrhZFY2Nw==", "ISlXb");
        llIlIlllI[llIlIllll[50]] = lIllIllIIIII("t6jvqihI5FOJbEwYtlW1qg==", "mpHvu");
        llIlIlllI[llIlIllll[51]] = lIllIllIIIII("ATd5g8QwmvM=", "EnGOV");
        llIlIlllI[llIlIllll[52]] = lIllIlIlllll("LzgvAzkDLWISMAA8MgknGA==", "lYBfU");
        llIlIlllI[llIlIllll[53]] = lIllIllIIIIl("S/8RzUpo+hk=", "Lmiyq");
        llIlIlllI[llIlIllll[54]] = lIllIllIIIII("aA0kjOf4eSA=", "uOJyq");
        llIlIlllI[llIlIllll[55]] = lIllIlIlllll("JSE8CwwNL28RCgc=", "cHOce");
        llIlIlllI[llIlIllll[56]] = lIllIllIIIII("7+O+FJerULN4MMn5qv8BAw==", "vRiWt");
        llIlIlllI[llIlIllll[63]] = lIllIlIlllll("KywRBA4DIkIPCAMxBx8T", "mEblg");
        llIlIlllI[llIlIllll[64]] = lIllIllIIIIl("D1ldhPgjKQF6E3Bf7PEQ8XERM6OTiVpF", "ggRMB");
        llIlIlllI[llIlIllll[67]] = lIllIlIlllll("G2MEFhVyNBwZAjcxGhkBcjQbFhJyNBIERjYsBBlGJiscBANyMAcWDyAwTA==", "RCswf");
        llIlIlllI[llIlIllll[68]] = lIllIlIlllll("Aic2eTw6O3A=", "UOOYR");
        llIlIlllI[llIlIllll[69]] = lIllIllIIIII("pZ7RjjiQN14Sehjn6UsX+9sBhidlZA69G1aGfewqy9z99vca3zokKguRqdNSUwkY", "WKZDZ");
        llIlIlllI[llIlIllll[19]] = lIllIllIIIII("uYU/e9wiH19hSq+3mublzpKSB+ilJOwy", "TOLPb");
        llIlIlllI[llIlIllll[70]] = lIllIllIIIII("KVPEvjPXJISw5cyKgnb8d90YS1mnpWcVFqZLMRp51t0=", "IvcgJ");
        llIlIlllI[llIlIllll[71]] = lIllIlIlllll("A105A1UvFCEKB2oOPQpVKRU4HxA+EyEGGiRaJQMQKwkwQQ==", "JzUou");
        llIlIlllI[llIlIllll[72]] = lIllIllIIIIl("ujUfYTecJYrkEBlQlSZ5KWthkSjEYQTi/m5Bk8uDJnnKWPUVwAkyi18GxQKlHcJe", "zEThg");
        llIlIlllI[llIlIllll[73]] = lIllIlIlllll("ITEjZQ==", "xTPKi");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIlIllll[1]];
        iArr[llIlIllll[2]] = llIlIllll[8];
        if (lIllIllIlIIl(Inventory.getCount(iArr))) {
            String[] strArr = new String[llIlIllll[1]];
            strArr[llIlIllll[2]] = llIlIlllI[llIlIllll[52]];
            if (lIllIllIlIIl(Inventory.getCount(strArr))) {
                String[] strArr2 = new String[llIlIllll[1]];
                strArr2[llIlIllll[2]] = llIlIlllI[llIlIllll[53]];
                if (lIllIllIlIIl(Inventory.getCount(strArr2))) {
                    String[] strArr3 = new String[llIlIllll[1]];
                    strArr3[llIlIllll[2]] = llIlIlllI[llIlIllll[54]];
                    if (lIllIllIlIIl(Inventory.getCount(strArr3))) {
                        String[] strArr4 = new String[llIlIllll[1]];
                        strArr4[llIlIllll[2]] = llIlIlllI[llIlIllll[55]];
                        if (lIllIllIlIIl(Inventory.getCount(strArr4))) {
                            String[] strArr5 = new String[llIlIllll[1]];
                            strArr5[llIlIllll[2]] = llIlIlllI[llIlIllll[56]];
                            if (lIllIllIlIIl(Inventory.getCount(strArr5))) {
                                int[] iArr2 = new int[llIlIllll[1]];
                                iArr2[llIlIllll[2]] = llIlIllll[17];
                                if (lIllIllIlIIl(Inventory.getCount(iArr2)) && lIllIllIIllI(Inventory.contains(C0005f.bc) ? 1 : 0)) {
                                    ?? r0 = llIlIllll[1];
                                    "".length();
                                    return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return llIlIllll[2];
    }

    private static boolean lIllIllIllII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIllIllIIlIl(C0004e.j(el), llIlIllll[13])) {
            ?? r0 = llIlIllll[1];
            "".length();
            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIllll[2];
    }

    private static boolean lIllIllIlIII(Object obj) {
        return obj != null;
    }

    private static void lIllIllIIIll() {
        llIlIllll = new int[87];
        llIlIllll[0] = 21 ^ 31;
        llIlIllll[1] = " ".length();
        llIlIllll[2] = ((((0 + 150) - 23) + 30) ^ (((64 + 68) - 51) + 49)) & (((((39 + 133) - 137) + 129) ^ (((101 + 6) - 67) + 147)) ^ (-" ".length()));
        llIlIllll[3] = "  ".length();
        llIlIllll[4] = (-9282) & 14281;
        llIlIllll[5] = "   ".length();
        llIlIllll[6] = 178 ^ 182;
        llIlIllll[7] = 48 ^ 55;
        llIlIllll[8] = (-(((20 + 6) - (-125)) + 10)) & (-8217) & 16383;
        llIlIllll[9] = (-27719) & 28670;
        llIlIllll[10] = (-((-257) & 32709)) & (-9) & 32767;
        llIlIllll[11] = (-7745) & 8057;
        llIlIllll[12] = (-22817) & 24366;
        llIlIllll[13] = 57 ^ 60;
        llIlIllll[14] = (-8242) & 16251;
        llIlIllll[15] = 125 ^ 123;
        llIlIllll[16] = (-19459) & 32083;
        llIlIllll[17] = (-28677) & 29671;
        llIlIllll[18] = (-3095) & 4094;
        llIlIllll[19] = 12 ^ 62;
        llIlIllll[20] = (((8 + 40) - (-65)) + 54) ^ (((49 + 135) - 137) + 141);
        llIlIllll[21] = (((133 + 88) - 191) + 126) ^ (((40 + 55) - 89) + 138);
        llIlIllll[22] = (134 ^ 182) ^ (81 ^ 105);
        llIlIllll[23] = 56 ^ 49;
        llIlIllll[24] = (46 ^ 68) ^ (82 ^ 51);
        llIlIllll[25] = (((126 + 4) - 14) + 39) ^ (((131 + 137) - 243) + 125);
        llIlIllll[26] = 144 ^ 158;
        llIlIllll[27] = 131 ^ 140;
        llIlIllll[28] = (237 ^ 192) ^ (14 ^ 51);
        llIlIllll[29] = (((7 + 37) - 29) + 126) ^ (((49 + 137) - 41) + 11);
        llIlIllll[30] = 139 ^ 153;
        llIlIllll[31] = 28 ^ 15;
        llIlIllll[32] = 13 ^ 25;
        llIlIllll[33] = 210 ^ 199;
        llIlIllll[34] = (64 ^ 98) ^ (23 ^ 35);
        llIlIllll[35] = 69 ^ 82;
        llIlIllll[36] = (65 ^ 113) ^ (11 ^ 35);
        llIlIllll[37] = 67 ^ 90;
        llIlIllll[38] = 111 ^ 117;
        llIlIllll[39] = 48 ^ 44;
        llIlIllll[40] = (150 ^ 178) ^ (39 ^ 30);
        llIlIllll[41] = (120 ^ 31) ^ (240 ^ 137);
        llIlIllll[42] = (20 ^ 99) ^ (203 ^ 163);
        llIlIllll[43] = (-((-22883) & 31079)) & (-4105) & 16380;
        llIlIllll[44] = (179 ^ 165) ^ (176 ^ 134);
        llIlIllll[45] = 4 ^ 37;
        llIlIllll[46] = (((134 + 151) - 174) + 62) ^ (((72 + 72) - 80) + 79);
        llIlIllll[47] = (87 ^ 50) ^ (194 ^ 132);
        llIlIllll[48] = (10 ^ 95) ^ (32 ^ 81);
        llIlIllll[49] = (137 ^ 162) ^ (204 ^ 194);
        llIlIllll[50] = 113 ^ 87;
        llIlIllll[51] = (90 ^ 113) ^ (36 ^ 40);
        llIlIllll[52] = 24 ^ 48;
        llIlIllll[53] = (((24 + 127) - 21) + 20) ^ (((7 + 81) - 25) + 128);
        llIlIllll[54] = (117 ^ 127) ^ (95 ^ 127);
        llIlIllll[55] = (((100 + 46) - 50) + 53) ^ (((8 + 147) - 14) + 49);
        llIlIllll[56] = 82 ^ 126;
        llIlIllll[57] = (-22740) & 31739;
        llIlIllll[58] = (-"   ".length()) & (-18441) & 18942;
        llIlIllll[59] = (-((-9217) & 25604)) & (-4353) & 32719;
        llIlIllll[60] = (-5138) & 30137;
        llIlIllll[61] = (-16425) & 17324;
        llIlIllll[62] = (47 ^ 27) ^ (91 ^ 11);
        llIlIllll[63] = 234 ^ 199;
        llIlIllll[64] = (64 ^ 120) ^ (173 ^ 187);
        llIlIllll[65] = (-((-2586) & 24479)) & (-49) & 24573;
        llIlIllll[66] = (-21141) & 24574;
        llIlIllll[67] = (((93 + 98) - 87) + 35) ^ (((157 + 143) - 168) + 32);
        llIlIllll[68] = 86 ^ 102;
        llIlIllll[69] = ((178 ^ 137) & ((80 ^ 107) ^ (-1))) ^ (47 ^ 30);
        llIlIllll[70] = 23 ^ 36;
        llIlIllll[71] = (((33 + 57) - (-18)) + 51) ^ (((150 + 118) - 134) + 37);
        llIlIllll[72] = 177 ^ 132;
        llIlIllll[73] = 88 ^ 110;
        llIlIllll[74] = (-((-2571) & 32431)) & (-73) & 32751;
        llIlIllll[75] = (-((-1222) & 22231)) & (-8265) & 32761;
        llIlIllll[76] = (-((-14449) & 14845)) & (-9233) & 12287;
        llIlIllll[77] = (-20499) & 23998;
        llIlIllll[78] = (-((-2625) & 28665)) & (-1) & 28671;
        llIlIllll[79] = (-((-2475) & 10667)) & (-20562) & 32247;
        llIlIllll[80] = (-13484) & 16127;
        llIlIllll[81] = (-((-12369) & 28885)) & (-4618) & 24575;
        llIlIllll[82] = (-((-769) & 25489)) & (-5153) & 32510;
        llIlIllll[83] = (-12427) & 15871;
        llIlIllll[84] = (-((-705) & 14055)) & (-16649) & 32639;
        llIlIllll[85] = (-20497) & 23935;
        llIlIllll[86] = (((86 + 34) - 22) + 73) ^ (((22 + 58) - 35) + 111);
    }

    private static boolean lIllIllIIlll(int i) {
        return i == 0;
    }

    private static boolean lIllIllIlIll(int i, int i2) {
        return i <= i2;
    }
}
