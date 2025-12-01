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
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.F  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/F.class */
public class F implements ab {
    public static /* synthetic */ WorldPoint dT;
    static /* synthetic */ int dk;
    public static /* synthetic */ WorldPoint fp;
    static /* synthetic */ String[] cG;
    public static /* synthetic */ WorldPoint fl;
    public static /* synthetic */ WorldPoint fo;
    public static /* synthetic */ WorldPoint fn;
    public static /* synthetic */ WorldPoint fq;
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lIIIIlIllI;
    private static /* synthetic */ String[] lIIIIlIlIl;
    public static /* synthetic */ WorldPoint fm;
    public static /* synthetic */ int fk;
    static /* synthetic */ WorldArea fs;
    static /* synthetic */ WorldArea fr;

    private static String lllIIIIllllI(String lllIllIIlIIl, String lllIllIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIllIIlIll = Cipher.getInstance("Blowfish");
            lllIllIIlIll.init(lIIIIlIllI[3], secretKeySpec);
            return new String(lllIllIIlIll.doFinal(Base64.getDecoder().decode(lllIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIIlIlI) {
            lllIllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lIIIIlIllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lIIIIlIllI[7]];
        iArr[lIIIIlIllI[1]] = lIIIIlIllI[8];
        iArr[lIIIIlIllI[0]] = lIIIIlIllI[9];
        iArr[lIIIIlIllI[3]] = lIIIIlIllI[10];
        iArr[lIIIIlIllI[6]] = lIIIIlIllI[11];
        iArr[lIIIIlIllI[4]] = lIIIIlIllI[12];
        iArr[lIIIIlIllI[13]] = lIIIIlIllI[5];
        iArr[lIIIIlIllI[14]] = lIIIIlIllI[15];
        iArr[lIIIIlIllI[16]] = lIIIIlIllI[17];
        iArr[lIIIIlIllI[18]] = lIIIIlIllI[19];
        iArr[lIIIIlIllI[20]] = lIIIIlIllI[21];
        int i = lIIIIlIllI[1];
        while (lllIIIlIIIlI(i, iArr.length)) {
            int[] iArr2 = new int[lIIIIlIllI[0]];
            iArr2[lIIIIlIllI[1]] = iArr[i];
            if (lllIIIlIIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIIlIllI[1];
            }
            i++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIIIlIllI[0];
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bG();
            "".length();
            if ("  ".length() <= ((139 ^ 190) & ((78 ^ 123) ^ (-1)))) {
                return (210 ^ 140) & ((213 ^ 139) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIIlIllI[110];
    }

    private static boolean lllIIIlIlIIl(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x01bb, code lost:
        if (lllIIIlIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.F.lIIIIlIllI[6]) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x034a, code lost:
        if (lllIIIlIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.F.lIIIIlIllI[7]) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lllIIIlIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.F.lIIIIlIllI[7]) != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10 = new int[lIIIIlIllI[0]];
        iArr10[lIIIIlIllI[1]] = lIIIIlIllI[9];
        if (lllIIIlIIIIl(Bank.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lIIIIlIllI[0]];
            iArr11[lIIIIlIllI[1]] = lIIIIlIllI[9];
            if (lllIIIlIIIIl(Bank.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIIIlIllI[0]];
                iArr12[lIIIIlIllI[1]] = lIIIIlIllI[9];
            }
            iArr = new int[lIIIIlIllI[0]];
            iArr[lIIIIlIllI[1]] = lIIIIlIllI[10];
            if (lllIIIlIIIll(Bank.contains(iArr) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlIllI[10], lIIIIlIllI[0], lIIIIlIllI[106]));
                "".length();
            }
            iArr2 = new int[lIIIIlIllI[0]];
            iArr2[lIIIIlIllI[1]] = lIIIIlIllI[11];
            if (lllIIIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlIllI[11], lIIIIlIllI[0], lIIIIlIllI[106]));
                "".length();
            }
            iArr3 = new int[lIIIIlIllI[0]];
            iArr3[lIIIIlIllI[1]] = lIIIIlIllI[12];
            if (lllIIIlIIIll(Bank.contains(iArr3) ? 1 : 0)) {
                bx.add(new C0003d(lIIIIlIllI[12], lIIIIlIllI[0], lIIIIlIllI[106]));
                "".length();
            }
            iArr4 = new int[lIIIIlIllI[0]];
            iArr4[lIIIIlIllI[1]] = lIIIIlIllI[5];
            if (lllIIIlIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
                int[] iArr13 = new int[lIIIIlIllI[0]];
                iArr13[lIIIIlIllI[1]] = lIIIIlIllI[5];
                if (lllIIIlIIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[lIIIIlIllI[0]];
                    iArr14[lIIIIlIllI[1]] = lIIIIlIllI[5];
                }
                iArr5 = new int[lIIIIlIllI[0]];
                iArr5[lIIIIlIllI[1]] = lIIIIlIllI[15];
                if (lllIIIlIIIll(Bank.contains(iArr5) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlIllI[15], lIIIIlIllI[0], lIIIIlIllI[106]));
                    "".length();
                }
                iArr6 = new int[lIIIIlIllI[0]];
                iArr6[lIIIIlIllI[1]] = lIIIIlIllI[17];
                if (lllIIIlIIIll(Bank.contains(iArr6) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlIllI[17], lIIIIlIllI[0], lIIIIlIllI[106]));
                    "".length();
                }
                iArr7 = new int[lIIIIlIllI[0]];
                iArr7[lIIIIlIllI[1]] = lIIIIlIllI[19];
                if (lllIIIlIIIll(Bank.contains(iArr7) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlIllI[19], lIIIIlIllI[0], lIIIIlIllI[106]));
                    "".length();
                }
                if (lllIIIlIIIll(Bank.contains(item -> {
                    return item.getName().toLowerCase().contains(lIIIIlIlIl[lIIIIlIllI[112]]);
                }) ? 1 : 0)) {
                    bx.add(new C0003d(lIIIIlIllI[107], lIIIIlIllI[13], lIIIIlIllI[108]));
                    "".length();
                }
                iArr8 = new int[lIIIIlIllI[0]];
                iArr8[lIIIIlIllI[1]] = lIIIIlIllI[8];
                if (lllIIIlIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIIIlIllI[0]];
                    iArr15[lIIIIlIllI[1]] = lIIIIlIllI[8];
                    if (lllIIIlIIIIl(Bank.contains(iArr15) ? 1 : 0)) {
                        int[] iArr16 = new int[lIIIIlIllI[0]];
                        iArr16[lIIIIlIllI[1]] = lIIIIlIllI[8];
                    }
                    iArr9 = new int[lIIIIlIllI[0]];
                    iArr9[lIIIIlIllI[1]] = lIIIIlIllI[21];
                    if (lllIIIlIIIll(Bank.contains(iArr9) ? 1 : 0)) {
                        return;
                    }
                    bx.add(new C0003d(lIIIIlIllI[21], lIIIIlIllI[6], C0009j.ch));
                    "".length();
                    return;
                }
                bx.add(new C0003d(lIIIIlIllI[8], lIIIIlIllI[53], lIIIIlIllI[109]));
                "".length();
                iArr9 = new int[lIIIIlIllI[0]];
                iArr9[lIIIIlIllI[1]] = lIIIIlIllI[21];
                if (lllIIIlIIIll(Bank.contains(iArr9) ? 1 : 0)) {
                }
            }
            bx.add(new C0003d(lIIIIlIllI[5], lIIIIlIllI[4], lIIIIlIllI[106]));
            "".length();
            iArr5 = new int[lIIIIlIllI[0]];
            iArr5[lIIIIlIllI[1]] = lIIIIlIllI[15];
            if (lllIIIlIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIIIIlIllI[0]];
            iArr6[lIIIIlIllI[1]] = lIIIIlIllI[17];
            if (lllIIIlIIIll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIIIIlIllI[0]];
            iArr7[lIIIIlIllI[1]] = lIIIIlIllI[19];
            if (lllIIIlIIIll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            if (lllIIIlIIIll(Bank.contains(item2 -> {
                return item2.getName().toLowerCase().contains(lIIIIlIlIl[lIIIIlIllI[112]]);
            }) ? 1 : 0)) {
            }
            iArr8 = new int[lIIIIlIllI[0]];
            iArr8[lIIIIlIllI[1]] = lIIIIlIllI[8];
            if (lllIIIlIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bx.add(new C0003d(lIIIIlIllI[8], lIIIIlIllI[53], lIIIIlIllI[109]));
            "".length();
            iArr9 = new int[lIIIIlIllI[0]];
            iArr9[lIIIIlIllI[1]] = lIIIIlIllI[21];
            if (lllIIIlIIIll(Bank.contains(iArr9) ? 1 : 0)) {
            }
        }
        bx.add(new C0003d(lIIIIlIllI[9], lIIIIlIllI[7], C0004e.c(lIIIIlIllI[104], lIIIIlIllI[105])));
        "".length();
        iArr = new int[lIIIIlIllI[0]];
        iArr[lIIIIlIllI[1]] = lIIIIlIllI[10];
        if (lllIIIlIIIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIIlIllI[0]];
        iArr2[lIIIIlIllI[1]] = lIIIIlIllI[11];
        if (lllIIIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIIlIllI[0]];
        iArr3[lIIIIlIllI[1]] = lIIIIlIllI[12];
        if (lllIIIlIIIll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIIlIllI[0]];
        iArr4[lIIIIlIllI[1]] = lIIIIlIllI[5];
        if (lllIIIlIIIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlIllI[5], lIIIIlIllI[4], lIIIIlIllI[106]));
        "".length();
        iArr5 = new int[lIIIIlIllI[0]];
        iArr5[lIIIIlIllI[1]] = lIIIIlIllI[15];
        if (lllIIIlIIIll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIIIlIllI[0]];
        iArr6[lIIIIlIllI[1]] = lIIIIlIllI[17];
        if (lllIIIlIIIll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIIIIlIllI[0]];
        iArr7[lIIIIlIllI[1]] = lIIIIlIllI[19];
        if (lllIIIlIIIll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        if (lllIIIlIIIll(Bank.contains(item22 -> {
            return item22.getName().toLowerCase().contains(lIIIIlIlIl[lIIIIlIllI[112]]);
        }) ? 1 : 0)) {
        }
        iArr8 = new int[lIIIIlIllI[0]];
        iArr8[lIIIIlIllI[1]] = lIIIIlIllI[8];
        if (lllIIIlIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bx.add(new C0003d(lIIIIlIllI[8], lIIIIlIllI[53], lIIIIlIllI[109]));
        "".length();
        iArr9 = new int[lIIIIlIllI[0]];
        iArr9[lIIIIlIllI[1]] = lIIIIlIllI[21];
        if (lllIIIlIIIll(Bank.contains(iArr9) ? 1 : 0)) {
        }
    }

    private static boolean lllIIIlIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIIlIIlll(int i, int i2) {
        return i <= i2;
    }

    static {
        lllIIIlIIIII();
        lllIIIIlllll();
        bx = new ArrayList();
        fk = lIIIIlIllI[113];
        dT = new WorldPoint(lIIIIlIllI[114], lIIIIlIllI[115], lIIIIlIllI[1]);
        fl = new WorldPoint(lIIIIlIllI[116], lIIIIlIllI[115], lIIIIlIllI[1]);
        fm = new WorldPoint(lIIIIlIllI[117], lIIIIlIllI[118], lIIIIlIllI[1]);
        fn = new WorldPoint(lIIIIlIllI[67], lIIIIlIllI[115], lIIIIlIllI[1]);
        fo = new WorldPoint(lIIIIlIllI[119], lIIIIlIllI[120], lIIIIlIllI[1]);
        fp = new WorldPoint(lIIIIlIllI[121], lIIIIlIllI[122], lIIIIlIllI[1]);
        fq = new WorldPoint(lIIIIlIllI[123], lIIIIlIllI[124], lIIIIlIllI[1]);
        fr = new WorldArea(lIIIIlIllI[125], lIIIIlIllI[126], lIIIIlIllI[61], lIIIIlIllI[87], lIIIIlIllI[1]);
        fs = new WorldArea(lIIIIlIllI[67], lIIIIlIllI[127], lIIIIlIllI[25], lIIIIlIllI[13], lIIIIlIllI[1]);
        String[] strArr = new String[lIIIIlIllI[20]];
        strArr[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[128]];
        strArr[lIIIIlIllI[0]] = lIIIIlIlIl[lIIIIlIllI[129]];
        strArr[lIIIIlIllI[3]] = lIIIIlIlIl[lIIIIlIllI[130]];
        strArr[lIIIIlIllI[6]] = lIIIIlIlIl[lIIIIlIllI[131]];
        strArr[lIIIIlIllI[4]] = lIIIIlIlIl[lIIIIlIllI[132]];
        strArr[lIIIIlIllI[13]] = lIIIIlIlIl[lIIIIlIllI[133]];
        strArr[lIIIIlIllI[14]] = lIIIIlIlIl[lIIIIlIllI[134]];
        strArr[lIIIIlIllI[16]] = lIIIIlIlIl[lIIIIlIllI[135]];
        strArr[lIIIIlIllI[18]] = lIIIIlIlIl[lIIIIlIllI[136]];
        cG = strArr;
        dk = lIIIIlIllI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lllIIIlIlIlI(Quests.getState(Quest.PLAGUE_CITY), QuestState.FINISHED)) {
            int[] iArr = new int[lIIIIlIllI[0]];
            iArr[lIIIIlIllI[1]] = lIIIIlIllI[102];
            if (lllIIIlIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIIIIlIllI[0];
                "".length();
                return "  ".length() < ((197 ^ 139) & ((209 ^ 159) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIIIIlIllI[1];
    }

    private static boolean lllIIIlIIlIl(int i) {
        return i > 0;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lIIIIlIlIl[lIIIIlIllI[111]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v657, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v666, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v688, types: [boolean] */
    public static void bG() {
        if (lllIIIlIIIIl(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (lllIIIlIIIlI(bx.size(), lIIIIlIllI[0])) {
                System.out.println(lIIIIlIlIl[lIIIIlIllI[1]]);
                bv = lIIIIlIllI[1];
            }
        }
        if (lllIIIlIIIll(bv ? 1 : 0)) {
            if (lllIIIlIIIll(an() ? 1 : 0) && lllIIIlIIIlI(C0004e.j(fk), lIIIIlIllI[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIIIlIIlII(nearest) && lllIIIlIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[0]];
                    C0000a.a(nearest);
                }
                if (lllIIIlIIlII(nearest) && lllIIIlIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIIIlIIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIlIllI[2]);
                        "".length();
                    }
                    if (lllIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[3]];
                        if (lllIIIlIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIlIllI[4]);
                            "".length();
                        }
                        if (lllIIIlIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIlIllI[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIlIllI[0]];
                        iArr[lIIIIlIllI[1]] = lIIIIlIllI[5];
                        if (lllIIIlIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIIlIllI[0]];
                            iArr2[lIIIIlIllI[1]] = lIIIIlIllI[5];
                            if (lllIIIlIIIlI(Bank.getFirst(iArr2).getQuantity(), lIIIIlIllI[4])) {
                                Q();
                                System.out.println(lIIIIlIlIl[lIIIIlIllI[6]]);
                                bv = lIIIIlIllI[0];
                                return;
                            }
                        }
                        int[] iArr3 = new int[lIIIIlIllI[7]];
                        iArr3[lIIIIlIllI[1]] = lIIIIlIllI[8];
                        iArr3[lIIIIlIllI[0]] = lIIIIlIllI[9];
                        iArr3[lIIIIlIllI[3]] = lIIIIlIllI[10];
                        iArr3[lIIIIlIllI[6]] = lIIIIlIllI[11];
                        iArr3[lIIIIlIllI[4]] = lIIIIlIllI[12];
                        iArr3[lIIIIlIllI[13]] = lIIIIlIllI[5];
                        iArr3[lIIIIlIllI[14]] = lIIIIlIllI[15];
                        iArr3[lIIIIlIllI[16]] = lIIIIlIllI[17];
                        iArr3[lIIIIlIllI[18]] = lIIIIlIllI[19];
                        iArr3[lIIIIlIllI[20]] = lIIIIlIllI[21];
                        if (lllIIIlIIIll(C0004e.d(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(lIIIIlIlIl[lIIIIlIllI[4]]);
                            bv = lIIIIlIllI[0];
                            return;
                        }
                        int[] iArr4 = new int[lIIIIlIllI[7]];
                        iArr4[lIIIIlIllI[1]] = lIIIIlIllI[8];
                        iArr4[lIIIIlIllI[0]] = lIIIIlIllI[9];
                        iArr4[lIIIIlIllI[3]] = lIIIIlIllI[10];
                        iArr4[lIIIIlIllI[6]] = lIIIIlIllI[11];
                        iArr4[lIIIIlIllI[4]] = lIIIIlIllI[12];
                        iArr4[lIIIIlIllI[13]] = lIIIIlIllI[5];
                        iArr4[lIIIIlIllI[14]] = lIIIIlIllI[15];
                        iArr4[lIIIIlIllI[16]] = lIIIIlIllI[17];
                        iArr4[lIIIIlIllI[18]] = lIIIIlIllI[19];
                        iArr4[lIIIIlIllI[20]] = lIIIIlIllI[21];
                        if (lllIIIlIIIIl(C0004e.d(iArr4) ? 1 : 0)) {
                            C0000a.a(lIIIIlIllI[8], lIIIIlIllI[13]);
                            C0000a.a(lIIIIlIllI[9], lIIIIlIllI[13]);
                            C0000a.a(lIIIIlIllI[11], lIIIIlIllI[0]);
                            C0000a.a(lIIIIlIllI[10], lIIIIlIllI[0]);
                            C0000a.a(lIIIIlIllI[12], lIIIIlIllI[0]);
                            C0000a.a(lIIIIlIllI[5], lIIIIlIllI[4]);
                            C0000a.a(lIIIIlIllI[15], lIIIIlIllI[0]);
                            C0000a.a(lIIIIlIllI[17], lIIIIlIllI[0]);
                            C0000a.a(lIIIIlIllI[19], lIIIIlIllI[0]);
                            C0000a.a(lIIIIlIllI[21], lIIIIlIllI[6]);
                        }
                    }
                }
            }
            if (lllIIIlIIIIl(Inventory.contains(C0005f.bc) ? 1 : 0) && lllIIIlIIIlI(Movement.getRunEnergy(), lIIIIlIllI[22])) {
                Inventory.getFirst(C0005f.bc).interact(lIIIIlIlIl[lIIIIlIllI[13]]);
                Time.sleepTicks(lIIIIlIllI[0]);
                "".length();
            }
            if (lllIIIlIIIIl(an() ? 1 : 0) && lllIIIlIIIll(C0004e.j(fk))) {
                if (lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[14]];
                    if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(C0001b.K), lIIIIlIllI[23])) {
                        String[] strArr = new String[lIIIIlIllI[0]];
                        strArr[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[16]];
                        Inventory.getFirst(strArr).interact(lIIIIlIlIl[lIIIIlIllI[18]]);
                        Time.sleepTicks(lIIIIlIllI[14]);
                        "".length();
                    }
                    if (lllIIIlIIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(dT);
                    "".length();
                    Time.sleepTicks(lIIIIlIllI[0]);
                    "".length();
                }
                if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[20]];
                    C0006g.a(lIIIIlIlIl[lIIIIlIllI[7]], cG);
                }
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[0])) {
                if (lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fl), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[24]];
                    Movement.walkTo(fl);
                    "".length();
                    Time.sleepTicks(lIIIIlIllI[0]);
                    "".length();
                }
                if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fl), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[25]];
                    C0006g.a(lIIIIlIlIl[lIIIIlIllI[26]], cG);
                }
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[3])) {
                String[] strArr2 = new String[lIIIIlIllI[0]];
                strArr2[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[27]];
                if (lllIIIlIIIll(Inventory.contains(strArr2) ? 1 : 0)) {
                    if (lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fl), lIIIIlIllI[3])) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[28]];
                        Movement.walkTo(fl);
                        "".length();
                        Time.sleepTicks(lIIIIlIllI[0]);
                        "".length();
                    }
                    if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fl), lIIIIlIllI[3])) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[29]];
                        String[] strArr3 = new String[lIIIIlIllI[0]];
                        strArr3[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[30]];
                        TileItems.getNearest(strArr3).interact(lIIIIlIlIl[lIIIIlIllI[31]]);
                        Time.sleepTicks(lIIIIlIllI[3]);
                        "".length();
                    }
                }
                String[] strArr4 = new String[lIIIIlIllI[0]];
                strArr4[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[32]];
                if (lllIIIlIIIIl(Inventory.contains(strArr4) ? 1 : 0)) {
                    if (lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[23]];
                        Movement.walkTo(dT);
                        "".length();
                        Time.sleepTicks(lIIIIlIllI[0]);
                        "".length();
                    }
                    if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[33]];
                        C0006g.a(lIIIIlIlIl[lIIIIlIllI[34]], cG);
                    }
                }
            }
            if (!lllIIIlIlIIl(C0004e.j(fk), lIIIIlIllI[6]) || !lllIIIlIlIIl(C0004e.j(fk), lIIIIlIllI[4]) || !lllIIIlIlIIl(C0004e.j(fk), lIIIIlIllI[13]) || lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[14])) {
                AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[35]];
                if (lllIIIlIIIll(Players.getLocal().getWorldLocation().equals(fm) ? 1 : 0)) {
                    Movement.walkTo(fm);
                    "".length();
                    Time.sleepTicks(lIIIIlIllI[0]);
                    "".length();
                }
                if (lllIIIlIIIIl(Players.getLocal().getWorldLocation().equals(fm) ? 1 : 0)) {
                    int[] iArr5 = new int[lIIIIlIllI[0]];
                    iArr5[lIIIIlIllI[1]] = lIIIIlIllI[5];
                    Item first = Inventory.getFirst(iArr5);
                    String[] strArr5 = new String[lIIIIlIllI[0]];
                    strArr5[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[36]];
                    first.useOn(TileObjects.getNearest(strArr5));
                    Time.sleepTicks(lIIIIlIllI[3]);
                    "".length();
                }
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[16])) {
                if (lllIIIlIIIll(Players.getLocal().getWorldLocation().equals(fm) ? 1 : 0)) {
                    Movement.walkTo(fm);
                    "".length();
                    Time.sleepTicks(lIIIIlIllI[0]);
                    "".length();
                }
                if (lllIIIlIIIIl(Players.getLocal().getWorldLocation().equals(fm) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIIIlIllI[0]];
                    iArr6[lIIIIlIllI[1]] = lIIIIlIllI[12];
                    Inventory.getFirst(iArr6).interact(lIIIIlIlIl[lIIIIlIllI[37]]);
                    Time.sleepTicks(lIIIIlIllI[3]);
                    "".length();
                }
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[18])) {
                AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[38]];
                String[] strArr6 = new String[lIIIIlIllI[0]];
                strArr6[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[39]];
                if (lllIIIlIIlII(TileObjects.getNearest(strArr6)) && lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr7 = new String[lIIIIlIllI[0]];
                    strArr7[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[40]];
                    TileObjects.getNearest(strArr7).interact(lIIIIlIlIl[lIIIIlIllI[41]]);
                    Time.sleepTicks(lIIIIlIllI[7]);
                    "".length();
                    String[] strArr8 = new String[lIIIIlIllI[0]];
                    strArr8[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[42]];
                    Item first2 = Inventory.getFirst(strArr8);
                    String[] strArr9 = new String[lIIIIlIllI[0]];
                    strArr9[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[43]];
                    first2.useOn(TileObjects.getNearest(strArr9));
                    Time.sleepTicks(lIIIIlIllI[3]);
                    "".length();
                }
                C0006g.a(cG);
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[20])) {
                AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[44]];
                C0006g.a(lIIIIlIlIl[lIIIIlIllI[45]], cG);
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[7])) {
                dk = lIIIIlIllI[1];
                if (lllIIIlIIIll(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[46]];
                    String[] strArr10 = new String[lIIIIlIllI[0]];
                    strArr10[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[47]];
                    if (lllIIIlIIlII(TileObjects.getNearest(strArr10)) && lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                        int[] iArr7 = new int[lIIIIlIllI[0]];
                        iArr7[lIIIIlIllI[1]] = lIIIIlIllI[48];
                        if (lllIIIlIIIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIIIIlIllI[0]];
                            iArr8[lIIIIlIllI[1]] = lIIIIlIllI[48];
                            Inventory.getFirst(iArr8).interact(lIIIIlIlIl[lIIIIlIllI[49]]);
                        }
                        String[] strArr11 = new String[lIIIIlIllI[0]];
                        strArr11[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[50]];
                        TileObjects.getNearest(strArr11).interact(lIIIIlIlIl[lIIIIlIllI[51]]);
                        Time.sleepTicks(lIIIIlIllI[4]);
                        "".length();
                    }
                    C0006g.a(cG);
                }
                if (lllIIIlIIIIl(fr.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[52]];
                    C0006g.a(lIIIIlIlIl[lIIIIlIllI[53]], cG);
                }
            }
            if (!lllIIIlIlIIl(C0004e.j(fk), lIIIIlIllI[23]) || lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[33])) {
                C0006g.a(cG);
                if (lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fn), lIIIIlIllI[6]) && lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[54]];
                    Movement.walkTo(fn);
                    "".length();
                    Time.sleepTicks(lIIIIlIllI[0]);
                    "".length();
                }
                if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fn), lIIIIlIllI[6]) && lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[55]];
                    C0006g.a(lIIIIlIlIl[lIIIIlIllI[56]], cG);
                }
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[34])) {
                if (lllIIIlIIIll(Players.getLocal().getWorldLocation().getPlane())) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[57]];
                    String[] strArr12 = new String[lIIIIlIllI[0]];
                    strArr12[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[58]];
                    TileObjects.getNearest(strArr12).interact(lIIIIlIlIl[lIIIIlIllI[59]]);
                    Time.sleepTicks(lIIIIlIllI[4]);
                    "".length();
                }
                if (lllIIIlIlIII(Players.getLocal().getWorldLocation().getPlane(), lIIIIlIllI[0])) {
                    C0006g.a(lIIIIlIlIl[lIIIIlIllI[60]], cG);
                }
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[35])) {
                if (lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fo), lIIIIlIllI[6])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[61]];
                    Movement.walkTo(fo);
                    "".length();
                    Time.sleepTicks(lIIIIlIllI[0]);
                    "".length();
                }
                if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fo), lIIIIlIllI[6]) && lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr13 = new String[lIIIIlIllI[0]];
                    strArr13[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[62]];
                    TileObjects.getNearest(strArr13).interact(lIIIIlIlIl[lIIIIlIllI[22]]);
                    Time.sleepTicks(lIIIIlIllI[3]);
                    "".length();
                }
                C0006g.a(cG);
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[36])) {
                if (lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fp), lIIIIlIllI[6])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[63]];
                    Movement.walkTo(fp);
                    "".length();
                    Time.sleepTicks(lIIIIlIllI[0]);
                    "".length();
                }
                if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fp), lIIIIlIllI[6])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[64]];
                    if (lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                        int[] iArr9 = new int[lIIIIlIllI[0]];
                        iArr9[lIIIIlIllI[1]] = lIIIIlIllI[65];
                        NPCs.getNearest(iArr9).interact(lIIIIlIlIl[lIIIIlIllI[66]]);
                    }
                    C0006g.a(cG);
                }
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[37])) {
                WorldArea worldArea = new WorldArea(lIIIIlIllI[67], lIIIIlIllI[68], lIIIIlIllI[18], lIIIIlIllI[13], lIIIIlIllI[1]);
                if (lllIIIlIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[69]];
                    Movement.walkTo(fq);
                    "".length();
                    Time.sleepTicks(lIIIIlIllI[0]);
                    "".length();
                }
                if (lllIIIlIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[70]];
                    C0006g.a(lIIIIlIlIl[lIIIIlIllI[71]], cG);
                }
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[38])) {
                String[] strArr14 = new String[lIIIIlIllI[0]];
                strArr14[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[72]];
                if (lllIIIlIIIll(Inventory.contains(strArr14) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[73]];
                    int[] iArr10 = new int[lIIIIlIllI[0]];
                    iArr10[lIIIIlIllI[1]] = lIIIIlIllI[15];
                    if (lllIIIlIIIIl(Inventory.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIIIlIllI[0]];
                        iArr11[lIIIIlIllI[1]] = lIIIIlIllI[15];
                        Item first3 = Inventory.getFirst(iArr11);
                        int[] iArr12 = new int[lIIIIlIllI[0]];
                        iArr12[lIIIIlIllI[1]] = lIIIIlIllI[17];
                        first3.useOn(Inventory.getFirst(iArr12));
                        Time.sleepTicks(lIIIIlIllI[0]);
                        "".length();
                    }
                    int[] iArr13 = new int[lIIIIlIllI[0]];
                    iArr13[lIIIIlIllI[1]] = lIIIIlIllI[19];
                    if (lllIIIlIIIIl(Inventory.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[lIIIIlIllI[0]];
                        iArr14[lIIIIlIllI[1]] = lIIIIlIllI[19];
                        Item first4 = Inventory.getFirst(iArr14);
                        String[] strArr15 = new String[lIIIIlIllI[0]];
                        strArr15[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[74]];
                        first4.useOn(Inventory.getFirst(strArr15));
                        Time.sleepTicks(lIIIIlIllI[0]);
                        "".length();
                    }
                }
                String[] strArr16 = new String[lIIIIlIllI[0]];
                strArr16[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[75]];
                if (lllIIIlIIIIl(Inventory.contains(strArr16) ? 1 : 0)) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[76]];
                    C0006g.a(lIIIIlIlIl[lIIIIlIllI[77]], cG);
                }
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[39])) {
                String[] strArr17 = new String[lIIIIlIllI[0]];
                strArr17[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[78]];
                if (lllIIIlIIIll(Inventory.contains(strArr17) ? 1 : 0)) {
                    C0006g.a(lIIIIlIlIl[lIIIIlIllI[79]], cG);
                }
                String[] strArr18 = new String[lIIIIlIllI[0]];
                strArr18[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[80]];
                if (lllIIIlIIIIl(Inventory.contains(strArr18) ? 1 : 0)) {
                    if (lllIIIlIIIll(fs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIlIllI[81], lIIIIlIllI[82], lIIIIlIllI[1])), lIIIIlIllI[7])) {
                        if (lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(fo), lIIIIlIllI[6])) {
                            AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[83]];
                            Movement.walkTo(fo);
                            "".length();
                            Time.sleepTicks(lIIIIlIllI[0]);
                            "".length();
                        }
                        if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(fo), lIIIIlIllI[6]) && lllIIIlIIIll(Dialog.isOpen() ? 1 : 0)) {
                            String[] strArr19 = new String[lIIIIlIllI[0]];
                            strArr19[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[84]];
                            TileObjects.getNearest(strArr19).interact(lIIIIlIlIl[lIIIIlIllI[85]]);
                            Time.sleepTicks(lIIIIlIllI[3]);
                            "".length();
                        }
                        C0006g.a(cG);
                    }
                    if (lllIIIlIIIIl(fs.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr20 = new String[lIIIIlIllI[0]];
                        strArr20[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[86]];
                        if (lllIIIlIIIll(Inventory.contains(strArr20) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[87]];
                            int[] iArr15 = new int[lIIIIlIllI[0]];
                            iArr15[lIIIIlIllI[1]] = lIIIIlIllI[88];
                            TileObjects.getNearest(iArr15).interact(lIIIIlIlIl[lIIIIlIllI[89]]);
                            Time.sleepTicks(lIIIIlIllI[6]);
                            "".length();
                        }
                        String[] strArr21 = new String[lIIIIlIllI[0]];
                        strArr21[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[90]];
                        if (lllIIIlIIIIl(Inventory.contains(strArr21) ? 1 : 0)) {
                            String[] strArr22 = new String[lIIIIlIllI[0]];
                            strArr22[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[91]];
                            TileObjects.getNearest(strArr22).interact(lIIIIlIlIl[lIIIIlIllI[92]]);
                            Time.sleepTicks(lIIIIlIllI[6]);
                            "".length();
                        }
                        C0006g.a(cG);
                    }
                    if (lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIlIllI[81], lIIIIlIllI[82], lIIIIlIllI[1])), lIIIIlIllI[3])) {
                        String[] strArr23 = new String[lIIIIlIllI[0]];
                        strArr23[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[93]];
                        if (lllIIIlIIIIl(Inventory.contains(strArr23) ? 1 : 0)) {
                            AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[94]];
                            Movement.walkTo(new WorldPoint(lIIIIlIllI[81], lIIIIlIllI[82], lIIIIlIllI[1]));
                            "".length();
                            Time.sleepTicks(lIIIIlIllI[0]);
                            "".length();
                        }
                    }
                    if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIlIllI[81], lIIIIlIllI[82], lIIIIlIllI[1])), lIIIIlIllI[3])) {
                        AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[95]];
                        C0006g.a(lIIIIlIlIl[lIIIIlIllI[96]], cG);
                    }
                }
            }
            if (lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[40])) {
                if (lllIIIlIIllI(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[97]];
                    if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIIlIllI[81], lIIIIlIllI[82], lIIIIlIllI[1])), lIIIIlIllI[3])) {
                        String[] strArr24 = new String[lIIIIlIllI[0]];
                        strArr24[lIIIIlIllI[1]] = lIIIIlIlIl[lIIIIlIllI[98]];
                        Inventory.getFirst(strArr24).interact(lIIIIlIlIl[lIIIIlIllI[99]]);
                        Time.sleepTicks(lIIIIlIllI[13]);
                        "".length();
                    }
                    Movement.walkTo(dT);
                    "".length();
                    Time.sleepTicks(lIIIIlIllI[0]);
                    "".length();
                }
                if (lllIIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(dT), lIIIIlIllI[4])) {
                    AccBuilderGWD.c = lIIIIlIlIl[lIIIIlIllI[100]];
                    C0006g.a(lIIIIlIlIl[lIIIIlIllI[101]], cG);
                }
            }
            if (!lllIIIlIlIIl(C0004e.j(fk), lIIIIlIllI[41]) || lllIIIlIlIII(C0004e.j(fk), lIIIIlIllI[42])) {
                int[] iArr16 = new int[lIIIIlIllI[0]];
                iArr16[lIIIIlIllI[1]] = lIIIIlIllI[102];
                if (lllIIIlIIIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                    if (lllIIIlIIIlI(dk, lIIIIlIllI[0])) {
                        as.nj += lIIIIlIllI[0];
                        as.u(AccBuilderGWD.m);
                        dk += lIIIIlIllI[0];
                        as.nj = lIIIIlIllI[1];
                    }
                    int[] iArr17 = new int[lIIIIlIllI[0]];
                    iArr17[lIIIIlIllI[1]] = lIIIIlIllI[102];
                    Inventory.getFirst(iArr17).interact(lIIIIlIlIl[lIIIIlIllI[103]]);
                    Time.sleepTicks(lIIIIlIllI[3]);
                    "".length();
                    C0006g.a(cG);
                }
            }
        }
    }

    private static String lllIIIIlllII(String lllIllIllllI, String lllIllIlllIl) {
        String lllIllIllllI2 = new String(Base64.getDecoder().decode(lllIllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIllIlllII = new StringBuilder();
        char[] lllIllIllIll = lllIllIlllIl.toCharArray();
        int lllIllIllIlI = lIIIIlIllI[1];
        char[] charArray = lllIllIllllI2.toCharArray();
        int length = charArray.length;
        int lllIllIlIIlI = lIIIIlIllI[1];
        while (lllIIIlIIIlI(lllIllIlIIlI, length)) {
            lllIllIlllII.append((char) (charArray[lllIllIlIIlI] ^ lllIllIllIll[lllIllIllIlI % lllIllIllIll.length]));
            "".length();
            lllIllIllIlI++;
            lllIllIlIIlI++;
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllIllIlllII);
    }

    private static String lllIIIIlllIl(String lllIlllIlllI, String lllIlllIlIll) {
        try {
            SecretKeySpec lllIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlllIlIll.getBytes(StandardCharsets.UTF_8)), lIIIIlIllI[18]), "DES");
            Cipher lllIllllIIII = Cipher.getInstance("DES");
            lllIllllIIII.init(lIIIIlIllI[3], lllIllllIIIl);
            return new String(lllIllllIIII.doFinal(Base64.getDecoder().decode(lllIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlllIllll) {
            lllIlllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlIIIIl(int i) {
        return i != 0;
    }

    private static boolean lllIIIlIIlII(Object obj) {
        return obj != null;
    }

    private static boolean lllIIIlIIIll(int i) {
        return i == 0;
    }

    private static boolean lllIIIlIIllI(int i, int i2) {
        return i > i2;
    }

    private static void lllIIIIlllll() {
        lIIIIlIlIl = new String[lIIIIlIllI[137]];
        lIIIIlIlIl[lIIIIlIllI[1]] = lllIIIIlllII("Py4cLCIRIhZlMww+Gys2WS4GIDwKa1I2JhAzES04FyBSJzAaLFIxPlk2ByAiDQ==", "yGrEQ");
        lIIIIlIlIl[lIIIIlIllI[0]] = lllIIIIlllIl("RxgjrJ6iUO9X//+I1E2weg==", "pHnJO");
        lIIIIlIlIl[lIIIIlIllI[3]] = lllIIIIlllII("By4HNhQmIQ5yGi4hAjsWKA==", "OOiRx");
        lIIIIlIlIl[lIIIIlIllI[6]] = lllIIIIlllIl("3wnBXA5npCKlFHP736/QJ7hRZVGLi6QVC9nLJgEfjc3cJWLGTGjeB5oXOV0KBoGdCXFraolyD3k=", "lnMru");
        lIIIIlIlIl[lIIIIlIllI[4]] = lllIIIIllllI("C5vHkgfSnr6WjwgihsgCJKqnGlk0bGaGhbAmPqj/RqLPwKJCm7JnJael0v+zX5/4Ga+WSBl75SQ=", "lbbRG");
        lIIIIlIlIl[lIIIIlIllI[13]] = lllIIIIlllII("CzEAIAo=", "OCiNa");
        lIIIIlIlIl[lIIIIlIllI[14]] = lllIIIIlllII("FiUQSgY3ZBUeEyow", "XDfjr");
        lIIIIlIlIl[lIIIIlIllI[16]] = lllIIIIlllII("JS4IJD4JO0U1NwoqFS4gEg==", "fOeAR");
        lIIIIlIlIl[lIIIIlIllI[18]] = lllIIIIlllIl("RS34PG1TaKA=", "sWdnL");
        lIIIIlIlIl[lIIIIlIllI[20]] = lllIIIIllllI("MfJwHuQq+9M/gCcSnSo2HA==", "PAeJb");
        lIIIIlIlIl[lIIIIlIllI[7]] = lllIIIIllllI("16/szxFoe80=", "hXXuz");
        lIIIIlIlIl[lIIIIlIllI[24]] = lllIIIIlllIl("S58fgHf8nux7llOQhfMgAg==", "dlhOG");
        lIIIIlIlIl[lIIIIlIllI[25]] = lllIIIIlllII("OCodPBoZJRR4FRgqBw==", "pKsXv");
        lIIIIlIlIl[lIIIIlIllI[26]] = lllIIIIllllI("/Hptm5KLJ5w=", "WUrBP");
        lIIIIlIlIl[lIIIIlIllI[27]] = lllIIIIlllIl("c/zalNiRfO8=", "lwHPX");
        lIIIIlIlIl[lIIIIlIllI[28]] = lllIIIIlllII("LzQxTDcOdTcFIBUgNQk=", "aUGlC");
        lIIIIlIlIl[lIIIIlIllI[29]] = lllIIIIlllII("BgoMPD8nBQV4MCYKFg==", "NkbXS");
        lIIIIlIlIl[lIIIIlIllI[30]] = lllIIIIlllII("OQQMEQ8bCA==", "imoez");
        lIIIIlIlIl[lIIIIlIllI[31]] = lllIIIIlllII("GxIeAQ==", "OsudV");
        lIIIIlIlIl[lIIIIlIllI[32]] = lllIIIIlllIl("P85QIPFfuEc=", "InCDH");
        lIIIIlIlIl[lIIIIlIllI[23]] = lllIIIIllllI("/rCT1TCqlu31OHBKWkPozg==", "rESMv");
        lIIIIlIlIl[lIIIIlIllI[33]] = lllIIIIllllI("o9sWP2aWxvvcgJrSWwyyDg==", "LDyPC");
        lIIIIlIlIl[lIIIIlIllI[34]] = lllIIIIllllI("WWG7OHXL/BA=", "uUiHQ");
        lIIIIlIlIl[lIIIIlIllI[35]] = lllIIIIllllI("eqzdU7E1fCYY+zQWCJ3EW7NPwwdH/omE", "BUFbR");
        lIIIIlIlIl[lIIIIlIllI[36]] = lllIIIIlllIl("ARVUzMm2Btj27E3HEOqNuA==", "WQgzF");
        lIIIIlIlIl[lIIIIlIllI[37]] = lllIIIIlllIl("5tdQ8kRpkWk=", "yUwDc");
        lIIIIlIlIl[lIIIIlIllI[38]] = lllIIIIllllI("bgPltfSnpbA+9M8OF/cujA==", "IgjxL");
        lIIIIlIlIl[lIIIIlIllI[39]] = lllIIIIlllIl("qpb6CqCEwXQ=", "tfwWj");
        lIIIIlIlIl[lIIIIlIllI[40]] = lllIIIIlllIl("Ywt475usRwA=", "RmVgU");
        lIIIIlIlIl[lIIIIlIllI[41]] = lllIIIIlllII("ADY/Cw==", "OFZep");
        lIIIIlIlIl[lIIIIlIllI[42]] = lllIIIIllllI("Qka7z/vAtGo=", "yuDyS");
        lIIIIlIlIl[lIIIIlIllI[43]] = lllIIIIlllII("EiccBhs=", "UUujw");
        lIIIIlIlIl[lIIIIlIllI[44]] = lllIIIIlllIl("fpi4zFQrJvEGeSCblfpCJg==", "JyepQ");
        lIIIIlIlIl[lIIIIlIllI[45]] = lllIIIIlllIl("sm6/f1FgUXA=", "BhrMa");
        lIIIIlIlIl[lIIIIlIllI[46]] = lllIIIIllllI("QGcls+3+eElmrwSJ1lM2DcDjnvyxX9x2", "wiqHx");
        lIIIIlIlIl[lIIIIlIllI[47]] = lllIIIIlllIl("AV/hncCLlfs=", "FAPlY");
        lIIIIlIlIl[lIIIIlIllI[49]] = lllIIIIlllIl("0VUoApqK6g8=", "EDTKo");
        lIIIIlIlIl[lIIIIlIllI[50]] = lllIIIIlllII("FB4BNA==", "DwqQB");
        lIIIIlIlIl[lIIIIlIllI[51]] = lllIIIIlllII("MyklOQNdMDw=", "pELTa");
        lIIIIlIlIl[lIIIIlIllI[52]] = lllIIIIlllII("ABY+L2c6BzE=", "TwRDG");
        lIIIIlIlIl[lIIIIlIllI[53]] = lllIIIIlllII("Mj0YHj4bMw==", "xXlvW");
        lIIIIlIlIl[lIIIIlIllI[54]] = lllIIIIlllIl("4GmnwR8Q05Fn4kjvxt/UbtWIr0i9F2K2", "hCtRO");
        lIIIIlIlIl[lIIIIlIllI[55]] = lllIIIIlllIl("IxAFQmS/mzQO//g7Hw4/Dg==", "aOKCH");
        lIIIIlIlIl[lIIIIlIllI[56]] = lllIIIIllllI("Cg0LteYb7L4LP57TyP+6IQ==", "tLiYT");
        lIIIIlIlIl[lIIIIlIllI[57]] = lllIIIIlllIl("dLqZ/IFjDSR2ia7nTZmTeQ==", "lbaRN");
        lIIIIlIlIl[lIIIIlIllI[58]] = lllIIIIlllII("JRYEBTQF", "vbelF");
        lIIIIlIlIl[lIIIIlIllI[59]] = lllIIIIlllIl("gnIfL37s88o=", "hyTZs");
        lIIIIlIlIl[lIIIIlIllI[60]] = lllIIIIllllI("nGPvAgPbSAqFVWE8pg3A5w==", "lxbQT");
        lIIIIlIlIl[lIIIIlIllI[61]] = lllIIIIlllIl("1zcY+q0Z+mRf0BQDxprbeA==", "shpmQ");
        lIIIIlIlIl[lIIIIlIllI[62]] = lllIIIIlllII("MyoJKw==", "wEfYo");
        lIIIIlIlIl[lIIIIlIllI[22]] = lllIIIIlllII("CyQtHA==", "DTHra");
        lIIIIlIlIl[lIIIIlIllI[63]] = lllIIIIlllII("CDIyQiUpcycONDQ4", "FSDbQ");
        lIIIIlIlIl[lIIIIlIllI[64]] = lllIIIIllllI("3C7d35y+rXz+djK4COHDag==", "YdbrV");
        lIIIIlIlIl[lIIIIlIllI[66]] = lllIIIIlllII("DDc2L30sOQ==", "XVZDP");
        lIIIIlIlIl[lIIIIlIllI[69]] = lllIIIIlllII("IAcdWRwBRgkLCRgDAA==", "nfkyh");
        lIIIIlIlIl[lIIIIlIllI[70]] = lllIIIIllllI("4ub8QBTuzHJITcNZNfYzGw==", "plXMA");
        lIIIIlIlIl[lIIIIlIllI[71]] = lllIIIIlllIl("8irsbK2LLJk=", "LPSRa");
        lIIIIlIlIl[lIIIIlIllI[72]] = lllIIIIllllI("HYtiWLMsnEyawJkSdSr5iw==", "rchBV");
        lIIIIlIlIl[lIIIIlIllI[73]] = lllIIIIlllIl("MJZD67IMc9zT5BdLWWzr4OS7Ufpoui5Z", "ygNWF");
        lIIIIlIlIl[lIIIIlIllI[74]] = lllIIIIlllII("Fyo1EDg4Iy4WLnQvMx88", "TBZsW");
        lIIIIlIlIl[lIIIIlIllI[75]] = lllIIIIlllIl("t4fTHb2/pjwJwXZh7xsiMA==", "WkqMc");
        lIIIIlIlIl[lIIIIlIllI[76]] = lllIIIIlllIl("vDinSYGEkjtQj+9u97Tuuw==", "wosOI");
        lIIIIlIlIl[lIIIIlIllI[77]] = lllIIIIllllI("EOQszK+j4QE=", "Ftswx");
        lIIIIlIlIl[lIIIIlIllI[78]] = lllIIIIlllII("Jg89BxEfGg==", "qnOup");
        lIIIIlIlIl[lIIIIlIllI[79]] = lllIIIIlllIl("CCpiru7zHPU=", "VaNaK");
        lIIIIlIlIl[lIIIIlIllI[80]] = lllIIIIlllIl("rED84DP/KUM=", "ugbxQ");
        lIIIIlIlIl[lIIIIlIllI[83]] = lllIIIIllllI("OCHaooSD8DqyTyrtITRBcg==", "ZJMWk");
        lIIIIlIlIl[lIIIIlIllI[84]] = lllIIIIllllI("r7mQ0SVnheY=", "CUxQS");
        lIIIIlIlIl[lIIIIlIllI[85]] = lllIIIIlllIl("2MFxxP8ZbvE=", "rGcZD");
        lIIIIlIlIl[lIIIIlIllI[86]] = lllIIIIlllIl("DSx6tNlk0r9QKFW6yYldtw==", "BtofU");
        lIIIIlIlIl[lIIIIlIllI[87]] = lllIIIIlllIl("vO7i/D/6bnPTqP9xiku67jH+FK89OtT7", "lZyBK");
        lIIIIlIlIl[lIIIIlIllI[89]] = lllIIIIlllIl("mtnZo2wdEfU=", "hYpEN");
        lIIIIlIlIl[lIIIIlIllI[90]] = lllIIIIlllII("NUQiKQgYCHEvDA0=", "tdQDi");
        lIIIIlIlIl[lIIIIlIllI[91]] = lllIIIIllllI("O7RWyn2dBKQkwZnmesLIWw==", "dlwEv");
        lIIIIlIlIl[lIIIIlIllI[92]] = lllIIIIllllI("B3CRClcCz/gFHd1JNxCDcg==", "LAXxf");
        lIIIIlIlIl[lIIIIlIllI[93]] = lllIIIIlllIl("XG03auFqmIQ8ohIAkywv8g==", "ZdZsh");
        lIIIIlIlIl[lIIIIlIllI[94]] = lllIIIIlllII("KQ4ZcSEITwo9MAkO", "gooQU");
        lIIIIlIlIl[lIIIIlIllI[95]] = lllIIIIlllII("NTYKE28EOwMWLg==", "aWfxO");
        lIIIIlIlIl[lIIIIlIllI[96]] = lllIIIIllllI("JC1he4w3SPA=", "kpGNy");
        lIIIIlIlIl[lIIIIlIllI[97]] = lllIIIIlllII("GDMzRRs5cjYRDiQm", "VREeo");
        lIIIIlIlIl[lIIIIlIllI[98]] = lllIIIIlllII("LQs8DRsBHnEcEgIPIQcFGg==", "njQhw");
        lIIIIlIlIl[lIIIIlIllI[99]] = lllIIIIllllI("W6taej6JWfk=", "aiHlD");
        lIIIIlIlIl[lIIIIlIllI[100]] = lllIIIIlllIl("Cp52vL0mU77ArVzZTG+11Q==", "hVcZD");
        lIIIIlIlIl[lIIIIlIllI[101]] = lllIIIIlllII("Cgo5BD0r", "OnTkS");
        lIIIIlIlIl[lIIIIlIllI[103]] = lllIIIIlllII("HBUUFQ==", "Npuqf");
        lIIIIlIlIl[lIIIIlIllI[111]] = lllIIIIlllII("GScXPwQsazUxBTA=", "IKvXq");
        lIIIIlIlIl[lIIIIlIllI[112]] = lllIIIIlllII("AiIjI0wfLW0zCREnOSxMWA==", "pKMDl");
        lIIIIlIlIl[lIIIIlIllI[128]] = lllIIIIlllIl("VJx5gPneY00=", "PXlEW");
        lIIIIlIlIl[lIIIIlIllI[129]] = lllIIIIllllI("WmNTLJx8LFvK+tAmj4ER+Aa/G4RRoYQu", "VrCDA");
        lIIIIlIlIl[lIIIIlIllI[130]] = lllIIIIlllII("MCAXW28gYggbbxsgEAI9B2UNA28PKhZXNgYwSg==", "iEdwO");
        lIIIIlIlIl[lIIIIlIllI[131]] = lllIIIIlllIl("n+e6ZJIn8kxBJQmMsMw0jVA+j2v4jNwUoNRhappJBlg=", "HQfYa");
        lIIIIlIlIl[lIIIIlIllI[132]] = lllIIIIlllIl("vkKnyQr/UNn/FL0SA01t7UZUmo5ABOoSOZsL4V0BPQLml94ntwhUtVwZ9DBddwhG", "vhdiw");
        lIIIIlIlIl[lIIIIlIllI[133]] = lllIIIIllllI("IRqeBotkMIopcAmUkCaOLJVTmXkAf5nbq0kVHHcwYGEIkxMpv5DsRUSf9B/OjSv2d98Tf0VnCQg=", "KoSbS");
        lIIIIlIlIl[lIIIIlIllI[134]] = lllIIIIlllIl("qgLZQkVgG7SC6uDEnWOI8xXmZKtfTvyK0ZNP25mgVwVHMX1gWW50+w==", "SCCmD");
        lIIIIlIlIl[lIIIIlIllI[135]] = lllIIIIlllII("MQRzLC4ASzg7LgJLJD0gAUwgdSgbSyc9JFUIJickSg==", "ukSUA");
        lIIIIlIlIl[lIIIIlIllI[136]] = lllIIIIllllI("L7HWWk+/HToNI4jvb5ZEZOVIcp5ZdQfTP1LsrMu4qrA=", "Rhogo");
    }

    private static void lllIIIlIIIII() {
        lIIIIlIllI = new int[138];
        lIIIIlIllI[0] = " ".length();
        lIIIIlIllI[1] = (193 ^ 162) & ((57 ^ 90) ^ (-1));
        lIIIIlIllI[2] = (-27669) & 32668;
        lIIIIlIllI[3] = "  ".length();
        lIIIIlIllI[4] = (132 ^ 152) ^ (95 ^ 71);
        lIIIIlIllI[5] = (-((-3851) & 32623)) & (-19) & 30719;
        lIIIIlIllI[6] = "   ".length();
        lIIIIlIllI[7] = (((52 + 7) - (-2)) + 90) ^ (((149 + 142) - 186) + 52);
        lIIIIlIllI[8] = (-((-12079) & 28607)) & (-33) & 24567;
        lIIIIlIllI[9] = (-177) & 8186;
        lIIIIlIllI[10] = (-((-23049) & 31658)) & (-1537) & 12271;
        lIIIIlIllI[11] = (-1) & 954;
        lIIIIlIllI[12] = (-24581) & 25532;
        lIIIIlIllI[13] = 194 ^ 199;
        lIIIIlIllI[14] = 32 ^ 38;
        lIIIIlIllI[15] = (-24585) & 26559;
        lIIIIlIllI[16] = 66 ^ 69;
        lIIIIlIllI[17] = (-((-3621) & 15997)) & (-16417) & 30719;
        lIIIIlIllI[18] = 78 ^ 70;
        lIIIIlIllI[19] = (((32 ^ 70) + (28 ^ 41)) - (91 ^ 98)) + ((41 + 74) - 38) + 56;
        lIIIIlIllI[20] = (((20 + 9) - 22) + 154) ^ (((137 + 0) - 101) + 132);
        lIIIIlIllI[21] = (-16399) & 29023;
        lIIIIlIllI[22] = (((153 + 154) - 262) + 118) ^ (((61 + 3) - 57) + 138);
        lIIIIlIllI[23] = 26 ^ 14;
        lIIIIlIllI[24] = (174 ^ 189) ^ (81 ^ 73);
        lIIIIlIllI[25] = (((39 + 22) - (-100)) + 10) ^ (((130 + 53) - 116) + 100);
        lIIIIlIllI[26] = 136 ^ 133;
        lIIIIlIllI[27] = (((24 + 140) - 48) + 35) ^ (((84 + 40) - (-23)) + 6);
        lIIIIlIllI[28] = 1 ^ 14;
        lIIIIlIllI[29] = 93 ^ 77;
        lIIIIlIllI[30] = 127 ^ 110;
        lIIIIlIllI[31] = 210 ^ 192;
        lIIIIlIllI[32] = (((114 + 106) - 150) + 71) ^ (((24 + 5) - (-113)) + 16);
        lIIIIlIllI[33] = 37 ^ 48;
        lIIIIlIllI[34] = 170 ^ 188;
        lIIIIlIllI[35] = (58 ^ 14) ^ (168 ^ 139);
        lIIIIlIllI[36] = 96 ^ 120;
        lIIIIlIllI[37] = 139 ^ 146;
        lIIIIlIllI[38] = (193 ^ 167) ^ (20 ^ 104);
        lIIIIlIllI[39] = (((93 + 95) - 28) + 27) ^ (((74 + 140) - 171) + 117);
        lIIIIlIllI[40] = (102 ^ 35) ^ (208 ^ 137);
        lIIIIlIllI[41] = 144 ^ 141;
        lIIIIlIllI[42] = 98 ^ 124;
        lIIIIlIllI[43] = 71 ^ 88;
        lIIIIlIllI[44] = (133 ^ 141) ^ (109 ^ 69);
        lIIIIlIllI[45] = (247 ^ 171) ^ (57 ^ 68);
        lIIIIlIllI[46] = (18 ^ 67) ^ (37 ^ 86);
        lIIIIlIllI[47] = (9 ^ 95) ^ (86 ^ 35);
        lIIIIlIllI[48] = (-4098) & 5603;
        lIIIIlIllI[49] = (187 ^ 145) ^ (31 ^ 17);
        lIIIIlIllI[50] = 15 ^ 42;
        lIIIIlIllI[51] = (((61 + 206) - 49) + 12) ^ (((121 + 100) - 89) + 60);
        lIIIIlIllI[52] = 165 ^ 130;
        lIIIIlIllI[53] = 25 ^ 49;
        lIIIIlIllI[54] = (32 ^ 86) ^ (208 ^ 143);
        lIIIIlIllI[55] = (121 ^ 5) ^ (150 ^ 192);
        lIIIIlIllI[56] = (84 ^ 8) ^ (27 ^ 108);
        lIIIIlIllI[57] = 34 ^ 14;
        lIIIIlIllI[58] = (((45 + 110) - 152) + 152) ^ (((22 + 64) - 6) + 102);
        lIIIIlIllI[59] = (48 ^ 98) ^ (98 ^ 30);
        lIIIIlIllI[60] = (((129 + 30) - 11) + 4) ^ (((86 + 114) - 105) + 88);
        lIIIIlIllI[61] = (((111 + 154) - 173) + 83) ^ (((114 + 129) - 143) + 59);
        lIIIIlIllI[62] = (((85 + 22) - (-19)) + 56) ^ (((114 + 126) - 148) + 43);
        lIIIIlIllI[63] = 28 ^ 47;
        lIIIIlIllI[64] = (252 ^ 177) ^ (216 ^ 161);
        lIIIIlIllI[65] = (-2625) & 6879;
        lIIIIlIllI[66] = 123 ^ 78;
        lIIIIlIllI[67] = (-26125) & 28655;
        lIIIIlIllI[68] = (-8966) & 12277;
        lIIIIlIllI[69] = (((138 + 22) - 1) + 3) ^ (((13 + 0) - (-68)) + 67);
        lIIIIlIllI[70] = 180 ^ 131;
        lIIIIlIllI[71] = 175 ^ 151;
        lIIIIlIllI[72] = 15 ^ 54;
        lIIIIlIllI[73] = (((106 + 113) - 208) + 165) ^ (((94 + 94) - 95) + 45);
        lIIIIlIllI[74] = (210 ^ 134) ^ (67 ^ 44);
        lIIIIlIllI[75] = 96 ^ 92;
        lIIIIlIllI[76] = (42 ^ 126) ^ (174 ^ 199);
        lIIIIlIllI[77] = 41 ^ 23;
        lIIIIlIllI[78] = (169 ^ 179) ^ (164 ^ 129);
        lIIIIlIllI[79] = (151 ^ 154) ^ (200 ^ 133);
        lIIIIlIllI[80] = 129 ^ 192;
        lIIIIlIllI[81] = (-((-18661) & 32486)) & (-16385) & 32751;
        lIIIIlIllI[82] = (-4626) & 14297;
        lIIIIlIllI[83] = (32 ^ 36) ^ (99 ^ 37);
        lIIIIlIllI[84] = 65 ^ 2;
        lIIIIlIllI[85] = 98 ^ 38;
        lIIIIlIllI[86] = 200 ^ 141;
        lIIIIlIllI[87] = (((10 + 46) - 43) + 119) ^ (((40 + 64) - (-86)) + 4);
        lIIIIlIllI[88] = (-30226) & 32755;
        lIIIIlIllI[89] = 222 ^ 153;
        lIIIIlIllI[90] = 228 ^ 172;
        lIIIIlIllI[91] = 127 ^ 54;
        lIIIIlIllI[92] = 78 ^ 4;
        lIIIIlIllI[93] = (97 ^ 116) ^ (157 ^ 195);
        lIIIIlIllI[94] = 255 ^ 179;
        lIIIIlIllI[95] = 209 ^ 156;
        lIIIIlIllI[96] = 80 ^ 30;
        lIIIIlIllI[97] = 232 ^ 167;
        lIIIIlIllI[98] = 206 ^ 158;
        lIIIIlIllI[99] = 245 ^ 164;
        lIIIIlIllI[100] = (97 ^ 32) ^ (114 ^ 97);
        lIIIIlIllI[101] = 47 ^ 124;
        lIIIIlIllI[102] = (-10769) & 12273;
        lIIIIlIllI[103] = (96 ^ 5) ^ (21 ^ 36);
        lIIIIlIllI[104] = (-((-16665) & 22943)) & (-1) & 7678;
        lIIIIlIllI[105] = (-4159) & 5758;
        lIIIIlIllI[106] = (-((-17665) & 22467)) & (-16386) & 30687;
        lIIIIlIllI[107] = (-20531) & 32510;
        lIIIIlIllI[108] = (-4613) & 29612;
        lIIIIlIllI[109] = (-26699) & 27598;
        lIIIIlIllI[110] = (((79 + 116) - 94) + 113) ^ (((12 + 124) - 126) + 168);
        lIIIIlIllI[111] = 251 ^ 174;
        lIIIIlIllI[112] = (73 ^ 125) ^ (66 ^ 32);
        lIIIIlIllI[113] = ((72 + 13) - (-65)) + 15;
        lIIIIlIllI[114] = (-8658) & 11225;
        lIIIIlIllI[115] = (-28745) & 32077;
        lIIIIlIllI[116] = (-((-2571) & 32347)) & (-161) & 32511;
        lIIIIlIllI[117] = (-13786) & 16351;
        lIIIIlIllI[118] = (-16596) & 19927;
        lIIIIlIllI[119] = (-((-833) & 30547)) & (-513) & 32766;
        lIIIIlIllI[120] = (-((-1225) & 22013)) & (-8706) & 32767;
        lIIIIlIllI[121] = (-" ".length()) & (-9217) & 11743;
        lIIIIlIllI[122] = (-28937) & 32253;
        lIIIIlIllI[123] = (-((-7233) & 23635)) & (-9729) & 28663;
        lIIIIlIllI[124] = (-((-8795) & 13151)) & (-16905) & 24574;
        lIIIIlIllI[125] = (-((-3593) & 32298)) & (-1) & 31215;
        lIIIIlIllI[126] = (-24847) & 28111;
        lIIIIlIllI[127] = (-((-8262) & 9055)) & (-4129) & 8189;
        lIIIIlIllI[128] = 239 ^ 184;
        lIIIIlIllI[129] = 250 ^ 162;
        lIIIIlIllI[130] = 110 ^ 55;
        lIIIIlIllI[131] = 32 ^ 122;
        lIIIIlIllI[132] = 88 ^ 3;
        lIIIIlIllI[133] = (245 ^ 180) ^ (186 ^ 167);
        lIIIIlIllI[134] = 250 ^ 167;
        lIIIIlIllI[135] = (83 ^ 84) ^ (107 ^ 50);
        lIIIIlIllI[136] = (53 ^ 115) ^ (48 ^ 41);
        lIIIIlIllI[137] = 53 ^ 85;
    }

    private static boolean lllIIIlIlIII(int i, int i2) {
        return i == i2;
    }
}
