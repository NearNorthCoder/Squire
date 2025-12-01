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
import net.runelite.api.Prayer;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
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
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.A  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/A.class */
public class A implements InterfaceC0003ac {
    public static final /* synthetic */ WorldPoint el;
    public static /* synthetic */ List<C0017d> bv;
    public static final /* synthetic */ WorldPoint ee;
    private static /* synthetic */ int[] llIIllIlII;
    public static final /* synthetic */ WorldPoint ej;
    private static /* synthetic */ String[] cE;
    static /* synthetic */ int di;
    static /* synthetic */ WorldArea en;
    private static /* synthetic */ String[] llIIllIIIl;
    public static final /* synthetic */ WorldPoint ef;
    public static final /* synthetic */ WorldPoint eh;
    public static final /* synthetic */ WorldPoint ei;
    public static final /* synthetic */ WorldPoint ed;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int em;
    public static final /* synthetic */ WorldPoint ek;
    public static final /* synthetic */ WorldPoint eg;
    static /* synthetic */ boolean dj;

    private static boolean lIlIllIIllllI(int i, int i2) {
        return i <= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIllIIIl[llIIllIlII[86]];
    }

    private static boolean lIlIllIIllIlI(int i, int i2) {
        return i >= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            bw();
            "".length();
            if (0 != 0) {
                return (251 ^ 184) & ((91 ^ 24) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIIllIlII[85];
    }

    private static boolean lIlIllIIlllIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIllIIlllII(int i) {
        return i > 0;
    }

    static {
        lIlIllIIlIllI();
        lIlIllIIlIlIl();
        ed = new WorldPoint(llIIllIlII[91], llIIllIlII[92], llIIllIlII[1]);
        ee = new WorldPoint(llIIllIlII[93], llIIllIlII[94], llIIllIlII[1]);
        ef = new WorldPoint(llIIllIlII[95], llIIllIlII[96], llIIllIlII[1]);
        eg = new WorldPoint(llIIllIlII[97], llIIllIlII[98], llIIllIlII[1]);
        eh = new WorldPoint(llIIllIlII[99], llIIllIlII[100], llIIllIlII[1]);
        ei = new WorldPoint(llIIllIlII[101], llIIllIlII[102], llIIllIlII[1]);
        ej = new WorldPoint(llIIllIlII[103], llIIllIlII[104], llIIllIlII[1]);
        ek = new WorldPoint(llIIllIlII[91], llIIllIlII[105], llIIllIlII[1]);
        el = new WorldPoint(llIIllIlII[106], llIIllIlII[107], llIIllIlII[1]);
        bv = new ArrayList();
        em = llIIllIlII[30];
        en = new WorldArea(llIIllIlII[93], llIIllIlII[108], llIIllIlII[26], llIIllIlII[47], llIIllIlII[1]);
        String[] strArr = new String[llIIllIlII[11]];
        strArr[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[109]];
        strArr[llIIllIlII[0]] = llIIllIIIl[llIIllIlII[110]];
        strArr[llIIllIlII[5]] = llIIllIIIl[llIIllIlII[111]];
        cE = strArr;
    }

    private static String lIlIllIIIIIll(String llllllllllllllllllIIllIllIllIllI, String llllllllllllllllllIIllIllIllIlIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIllIllIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIllIllIllIlII = new StringBuilder();
        char[] llllllllllllllllllIIllIllIllIIll = llllllllllllllllllIIllIllIllIlIl.toCharArray();
        int llllllllllllllllllIIllIllIllIIlI = llIIllIlII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIllIlII[1];
        while (lIlIllIIllIII(i, length)) {
            llllllllllllllllllIIllIllIllIlII.append((char) (charArray[i] ^ llllllllllllllllllIIllIllIllIIll[llllllllllllllllllIIllIllIllIIlI % llllllllllllllllllIIllIllIllIIll.length]));
            "".length();
            llllllllllllllllllIIllIllIllIIlI++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIllIllIllIlII);
    }

    private static boolean lIlIllIIlllll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIllIIlIlll(int i) {
        return i != 0;
    }

    private static boolean lIlIllIlIIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIIllIlII[12]];
        iArr[llIIllIlII[1]] = llIIllIlII[13];
        iArr[llIIllIlII[0]] = llIIllIlII[7];
        iArr[llIIllIlII[5]] = llIIllIlII[10];
        iArr[llIIllIlII[11]] = llIIllIlII[14];
        iArr[llIIllIlII[6]] = llIIllIlII[15];
        iArr[llIIllIlII[16]] = llIIllIlII[17];
        int i = llIIllIlII[1];
        while (lIlIllIIllIII(i, iArr.length)) {
            int[] iArr2 = new int[llIIllIlII[0]];
            iArr2[llIIllIlII[1]] = iArr[i];
            if (lIlIllIIllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIIllIlII[1];
            }
            i++;
            "".length();
            if ((140 ^ 136) <= " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIllIlII[0];
    }

    private static boolean lIlIllIIllIIl(int i) {
        return i == 0;
    }

    private static boolean lIlIllIIllIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e6, code lost:
        if (lIlIllIIllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[8]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016f, code lost:
        if (lIlIllIIllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[8]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f8, code lost:
        if (lIlIllIIllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[28]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02ba, code lost:
        if (lIlIllIIllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[6]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x033f, code lost:
        if (lIlIllIIllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[5]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIllIIllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[8]) != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0388  */
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
        int[] iArr7 = new int[llIIllIlII[0]];
        iArr7[llIIllIlII[1]] = llIIllIlII[9];
        if (lIlIllIIlIlll(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[llIIllIlII[0]];
            iArr8[llIIllIlII[1]] = llIIllIlII[9];
            if (lIlIllIIlIlll(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIIllIlII[0]];
                iArr9[llIIllIlII[1]] = llIIllIlII[9];
            }
            iArr = new int[llIIllIlII[0]];
            iArr[llIIllIlII[1]] = llIIllIlII[7];
            if (lIlIllIIlIlll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr10 = new int[llIIllIlII[0]];
                iArr10[llIIllIlII[1]] = llIIllIlII[7];
                if (lIlIllIIlIlll(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[llIIllIlII[0]];
                    iArr11[llIIllIlII[1]] = llIIllIlII[7];
                }
                iArr2 = new int[llIIllIlII[0]];
                iArr2[llIIllIlII[1]] = llIIllIlII[10];
                if (lIlIllIIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr12 = new int[llIIllIlII[0]];
                    iArr12[llIIllIlII[1]] = llIIllIlII[10];
                    if (lIlIllIIlIlll(Bank.contains(iArr12) ? 1 : 0)) {
                        int[] iArr13 = new int[llIIllIlII[0]];
                        iArr13[llIIllIlII[1]] = llIIllIlII[10];
                    }
                    iArr3 = new int[llIIllIlII[0]];
                    iArr3[llIIllIlII[1]] = llIIllIlII[15];
                    if (lIlIllIIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr14 = new int[llIIllIlII[0]];
                        iArr14[llIIllIlII[1]] = llIIllIlII[15];
                        if (lIlIllIIlIlll(Bank.contains(iArr14) ? 1 : 0)) {
                            int[] iArr15 = new int[llIIllIlII[0]];
                            iArr15[llIIllIlII[1]] = llIIllIlII[15];
                        }
                        if (lIlIllIIllIIl(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(llIIllIIIl[llIIllIlII[87]]);
                        }) ? 1 : 0)) {
                            bv.add(new C0017d(llIIllIlII[81], llIIllIlII[16], llIIllIlII[82]));
                            "".length();
                        }
                        iArr4 = new int[llIIllIlII[0]];
                        iArr4[llIIllIlII[1]] = llIIllIlII[14];
                        if (lIlIllIIlIlll(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr16 = new int[llIIllIlII[0]];
                            iArr16[llIIllIlII[1]] = llIIllIlII[14];
                            if (lIlIllIIlIlll(Bank.contains(iArr16) ? 1 : 0)) {
                                int[] iArr17 = new int[llIIllIlII[0]];
                                iArr17[llIIllIlII[1]] = llIIllIlII[14];
                            }
                            iArr5 = new int[llIIllIlII[0]];
                            iArr5[llIIllIlII[1]] = llIIllIlII[17];
                            if (lIlIllIIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr18 = new int[llIIllIlII[0]];
                                iArr18[llIIllIlII[1]] = llIIllIlII[17];
                                if (lIlIllIIlIlll(Bank.contains(iArr18) ? 1 : 0)) {
                                    int[] iArr19 = new int[llIIllIlII[0]];
                                    iArr19[llIIllIlII[1]] = llIIllIlII[17];
                                }
                                iArr6 = new int[llIIllIlII[0]];
                                iArr6[llIIllIlII[1]] = llIIllIlII[13];
                                if (lIlIllIIlIlll(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr20 = new int[llIIllIlII[0]];
                                    iArr20[llIIllIlII[1]] = llIIllIlII[13];
                                    if (!lIlIllIIlIlll(Bank.contains(iArr20) ? 1 : 0)) {
                                        return;
                                    }
                                    int[] iArr21 = new int[llIIllIlII[0]];
                                    iArr21[llIIllIlII[1]] = llIIllIlII[13];
                                    if (!lIlIllIIllIII(Bank.getFirst(iArr21).getQuantity(), llIIllIlII[28])) {
                                        return;
                                    }
                                }
                                bv.add(new C0017d(llIIllIlII[13], llIIllIlII[54], llIIllIlII[84]));
                                "".length();
                            }
                            bv.add(new C0017d(llIIllIlII[17], llIIllIlII[11], llIIllIlII[83]));
                            "".length();
                            iArr6 = new int[llIIllIlII[0]];
                            iArr6[llIIllIlII[1]] = llIIllIlII[13];
                            if (lIlIllIIlIlll(Bank.contains(iArr6) ? 1 : 0)) {
                            }
                            bv.add(new C0017d(llIIllIlII[13], llIIllIlII[54], llIIllIlII[84]));
                            "".length();
                        }
                        bv.add(new C0017d(llIIllIlII[14], llIIllIlII[6], C0023j.cf));
                        "".length();
                        iArr5 = new int[llIIllIlII[0]];
                        iArr5[llIIllIlII[1]] = llIIllIlII[17];
                        if (lIlIllIIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(llIIllIlII[17], llIIllIlII[11], llIIllIlII[83]));
                        "".length();
                        iArr6 = new int[llIIllIlII[0]];
                        iArr6[llIIllIlII[1]] = llIIllIlII[13];
                        if (lIlIllIIlIlll(Bank.contains(iArr6) ? 1 : 0)) {
                        }
                        bv.add(new C0017d(llIIllIlII[13], llIIllIlII[54], llIIllIlII[84]));
                        "".length();
                    }
                    bv.add(new C0017d(llIIllIlII[15], llIIllIlII[33], llIIllIlII[80]));
                    "".length();
                    if (lIlIllIIllIIl(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(llIIllIIIl[llIIllIlII[87]]);
                    }) ? 1 : 0)) {
                    }
                    iArr4 = new int[llIIllIlII[0]];
                    iArr4[llIIllIlII[1]] = llIIllIlII[14];
                    if (lIlIllIIlIlll(Bank.contains(iArr4) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIllIlII[14], llIIllIlII[6], C0023j.cf));
                    "".length();
                    iArr5 = new int[llIIllIlII[0]];
                    iArr5[llIIllIlII[1]] = llIIllIlII[17];
                    if (lIlIllIIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIllIlII[17], llIIllIlII[11], llIIllIlII[83]));
                    "".length();
                    iArr6 = new int[llIIllIlII[0]];
                    iArr6[llIIllIlII[1]] = llIIllIlII[13];
                    if (lIlIllIIlIlll(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bv.add(new C0017d(llIIllIlII[13], llIIllIlII[54], llIIllIlII[84]));
                    "".length();
                }
                bv.add(new C0017d(llIIllIlII[10], llIIllIlII[8], llIIllIlII[18]));
                "".length();
                iArr3 = new int[llIIllIlII[0]];
                iArr3[llIIllIlII[1]] = llIIllIlII[15];
                if (lIlIllIIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIllIlII[15], llIIllIlII[33], llIIllIlII[80]));
                "".length();
                if (lIlIllIIllIIl(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(llIIllIIIl[llIIllIlII[87]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[llIIllIlII[0]];
                iArr4[llIIllIlII[1]] = llIIllIlII[14];
                if (lIlIllIIlIlll(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIllIlII[14], llIIllIlII[6], C0023j.cf));
                "".length();
                iArr5 = new int[llIIllIlII[0]];
                iArr5[llIIllIlII[1]] = llIIllIlII[17];
                if (lIlIllIIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIllIlII[17], llIIllIlII[11], llIIllIlII[83]));
                "".length();
                iArr6 = new int[llIIllIlII[0]];
                iArr6[llIIllIlII[1]] = llIIllIlII[13];
                if (lIlIllIIlIlll(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bv.add(new C0017d(llIIllIlII[13], llIIllIlII[54], llIIllIlII[84]));
                "".length();
            }
            bv.add(new C0017d(llIIllIlII[7], llIIllIlII[8], llIIllIlII[18]));
            "".length();
            iArr2 = new int[llIIllIlII[0]];
            iArr2[llIIllIlII[1]] = llIIllIlII[10];
            if (lIlIllIIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIllIlII[10], llIIllIlII[8], llIIllIlII[18]));
            "".length();
            iArr3 = new int[llIIllIlII[0]];
            iArr3[llIIllIlII[1]] = llIIllIlII[15];
            if (lIlIllIIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIllIlII[15], llIIllIlII[33], llIIllIlII[80]));
            "".length();
            if (lIlIllIIllIIl(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(llIIllIIIl[llIIllIlII[87]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[llIIllIlII[0]];
            iArr4[llIIllIlII[1]] = llIIllIlII[14];
            if (lIlIllIIlIlll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIllIlII[14], llIIllIlII[6], C0023j.cf));
            "".length();
            iArr5 = new int[llIIllIlII[0]];
            iArr5[llIIllIlII[1]] = llIIllIlII[17];
            if (lIlIllIIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIllIlII[17], llIIllIlII[11], llIIllIlII[83]));
            "".length();
            iArr6 = new int[llIIllIlII[0]];
            iArr6[llIIllIlII[1]] = llIIllIlII[13];
            if (lIlIllIIlIlll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIllIlII[13], llIIllIlII[54], llIIllIlII[84]));
            "".length();
        }
        bv.add(new C0017d(llIIllIlII[9], llIIllIlII[8], llIIllIlII[18]));
        "".length();
        iArr = new int[llIIllIlII[0]];
        iArr[llIIllIlII[1]] = llIIllIlII[7];
        if (lIlIllIIlIlll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIllIlII[7], llIIllIlII[8], llIIllIlII[18]));
        "".length();
        iArr2 = new int[llIIllIlII[0]];
        iArr2[llIIllIlII[1]] = llIIllIlII[10];
        if (lIlIllIIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIllIlII[10], llIIllIlII[8], llIIllIlII[18]));
        "".length();
        iArr3 = new int[llIIllIlII[0]];
        iArr3[llIIllIlII[1]] = llIIllIlII[15];
        if (lIlIllIIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIllIlII[15], llIIllIlII[33], llIIllIlII[80]));
        "".length();
        if (lIlIllIIllIIl(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(llIIllIIIl[llIIllIlII[87]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[llIIllIlII[0]];
        iArr4[llIIllIlII[1]] = llIIllIlII[14];
        if (lIlIllIIlIlll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIllIlII[14], llIIllIlII[6], C0023j.cf));
        "".length();
        iArr5 = new int[llIIllIlII[0]];
        iArr5[llIIllIlII[1]] = llIIllIlII[17];
        if (lIlIllIIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIllIlII[17], llIIllIlII[11], llIIllIlII[83]));
        "".length();
        iArr6 = new int[llIIllIlII[0]];
        iArr6[llIIllIlII[1]] = llIIllIlII[13];
        if (lIlIllIIlIlll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIllIlII[13], llIIllIlII[54], llIIllIlII[84]));
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIllIlII[1];
    }

    private static void lIlIllIIlIllI() {
        llIIllIlII = new int[113];
        llIIllIlII[0] = " ".length();
        llIIllIlII[1] = ((10 ^ 36) ^ (223 ^ 166)) & (((74 ^ 37) ^ (180 ^ 140)) ^ (-" ".length()));
        llIIllIlII[2] = (105 ^ 65) ^ (105 ^ 108);
        llIIllIlII[3] = (129 ^ 153) ^ (209 ^ 196);
        llIIllIlII[4] = (-2152) & 7151;
        llIIllIlII[5] = "  ".length();
        llIIllIlII[6] = (((96 + 4) - 36) + 97) ^ (((19 + 67) - (-49)) + 30);
        llIIllIlII[7] = (-((-153) & 11737)) & (-16386) & 28527;
        llIIllIlII[8] = (-9218) & 10217;
        llIIllIlII[9] = (-21649) & 22205;
        llIIllIlII[10] = (-29778) & 30331;
        llIIllIlII[11] = "   ".length();
        llIIllIlII[12] = (((65 + 158) - 100) + 42) ^ (((1 + 121) - 98) + 139);
        llIIllIlII[13] = (-(137 ^ 168)) & (-16385) & 24423;
        llIIllIlII[14] = (-2085) & 14709;
        llIIllIlII[15] = (-12869) & 13253;
        llIIllIlII[16] = 16 ^ 21;
        llIIllIlII[17] = (-((-22797) & 31598)) & (-5121) & 16355;
        llIIllIlII[18] = 166 ^ 172;
        llIIllIlII[19] = (-26649) & 27643;
        llIIllIlII[20] = 245 ^ 199;
        llIIllIlII[21] = (43 ^ 54) ^ (168 ^ 172);
        llIIllIlII[22] = (((55 + 18) - (-8)) + 74) ^ (((40 + 128) - 70) + 58);
        llIIllIlII[23] = (((30 + 131) - 143) + 148) ^ (((46 + 15) - (-86)) + 27);
        llIIllIlII[24] = (((133 + 130) - 122) + 11) ^ (((108 + 44) - 16) + 9);
        llIIllIlII[25] = (((34 + 23) - (-41)) + 55) ^ (((138 + 41) - 107) + 74);
        llIIllIlII[26] = (235 ^ 139) ^ (170 ^ 198);
        llIIllIlII[27] = 146 ^ 156;
        llIIllIlII[28] = 91 ^ 84;
        llIIllIlII[29] = 104 ^ 120;
        llIIllIlII[30] = 211 ^ 194;
        llIIllIlII[31] = 162 ^ 176;
        llIIllIlII[32] = 115 ^ 96;
        llIIllIlII[33] = 90 ^ 78;
        llIIllIlII[34] = (((35 + 134) - 130) + 105) ^ (((68 + 28) - 8) + 45);
        llIIllIlII[35] = 12 ^ 26;
        llIIllIlII[36] = (((209 + 68) - 218) + 155) ^ (((47 + 16) - 30) + 160);
        llIIllIlII[37] = 104 ^ 112;
        llIIllIlII[38] = 120 ^ 51;
        llIIllIlII[39] = 36 ^ 110;
        llIIllIlII[40] = 18 ^ 8;
        llIIllIlII[41] = (((120 + 215) - 310) + 191) ^ (((43 + 33) - (-38)) + 81);
        llIIllIlII[42] = 151 ^ 139;
        llIIllIlII[43] = (219 ^ 153) ^ (88 ^ 7);
        llIIllIlII[44] = 55 ^ 41;
        llIIllIlII[45] = (((97 + 135) - 213) + 135) ^ (((7 + 81) - 10) + 55);
        llIIllIlII[46] = 24 ^ 56;
        llIIllIlII[47] = (247 ^ 175) ^ (69 ^ 60);
        llIIllIlII[48] = 50 ^ 16;
        llIIllIlII[49] = 161 ^ 130;
        llIIllIlII[50] = 4 ^ 32;
        llIIllIlII[51] = 174 ^ 139;
        llIIllIlII[52] = (97 ^ 117) ^ (76 ^ 126);
        llIIllIlII[53] = 184 ^ 159;
        llIIllIlII[54] = 103 ^ 79;
        llIIllIlII[55] = 115 ^ 90;
        llIIllIlII[56] = (201 ^ 171) ^ (226 ^ 170);
        llIIllIlII[57] = (47 ^ 49) ^ (185 ^ 140);
        llIIllIlII[58] = 138 ^ 166;
        llIIllIlII[59] = 59 ^ 21;
        llIIllIlII[60] = (112 ^ 33) ^ (242 ^ 140);
        llIIllIlII[61] = 25 ^ 41;
        llIIllIlII[62] = (((132 + 38) - 20) + 33) ^ (((113 + 74) - 100) + 47);
        llIIllIlII[63] = (73 ^ 84) ^ (130 ^ 172);
        llIIllIlII[64] = (76 ^ 27) ^ (6 ^ 101);
        llIIllIlII[65] = 93 ^ 104;
        llIIllIlII[66] = 71 ^ 113;
        llIIllIlII[67] = 25 ^ 46;
        llIIllIlII[68] = (-((-17137) & 29685)) & (-17026) & 32757;
        llIIllIlII[69] = (-20997) & 24503;
        llIIllIlII[70] = (((20 ^ 84) + (40 ^ 110)) - (114 ^ 86)) + (166 ^ 146);
        llIIllIlII[71] = 23 ^ 47;
        llIIllIlII[72] = 83 ^ 106;
        llIIllIlII[73] = (-13353) & 15784;
        llIIllIlII[74] = (-8409) & 11487;
        llIIllIlII[75] = 97 ^ 14;
        llIIllIlII[76] = (72 ^ 45) ^ (93 ^ 2);
        llIIllIlII[77] = (-12809) & 15273;
        llIIllIlII[78] = (-9109) & 12181;
        llIIllIlII[79] = 186 ^ 129;
        llIIllIlII[80] = (-((-75) & 30923)) & (-1) & 32248;
        llIIllIlII[81] = (-((-19022) & 23423)) & (-1) & 16381;
        llIIllIlII[82] = (-2562) & 27561;
        llIIllIlII[83] = (-((-9741) & 26431)) & (-1025) & 30714;
        llIIllIlII[84] = (-((-13195) & 14331)) & (-30730) & 32765;
        llIIllIlII[85] = (((100 + 8) - 16) + 103) ^ (((109 + 57) - 87) + 88);
        llIIllIlII[86] = (((102 + 2) - (-61)) + 26) ^ (((91 + 20) - 50) + 70);
        llIIllIlII[87] = (((92 + 114) - 118) + 95) ^ (((135 + 123) - 121) + 1);
        llIIllIlII[88] = 35 ^ 29;
        llIIllIlII[89] = (19 ^ 120) ^ (120 ^ 44);
        llIIllIlII[90] = (199 ^ 132) ^ "   ".length();
        llIIllIlII[91] = (-((-271) & 9535)) & (-20929) & 32759;
        llIIllIlII[92] = (-((-3134) & 31935)) & (-1) & 31999;
        llIIllIlII[93] = (-16644) & 19251;
        llIIllIlII[94] = (-((-3161) & 23771)) & (-9) & 23807;
        llIIllIlII[95] = (-28803) & 31415;
        llIIllIlII[96] = (-((-9223) & 13967)) & (-24833) & 32766;
        llIIllIlII[97] = (-8195) & 10810;
        llIIllIlII[98] = (-4737) & 7909;
        llIIllIlII[99] = (-((-3861) & 16341)) & (-1033) & 16127;
        llIIllIlII[100] = (-25218) & 28359;
        llIIllIlII[101] = (-((-1737) & 18382)) & (-161) & 19391;
        llIIllIlII[102] = (-((-5674) & 30637)) & (-57) & 28159;
        llIIllIlII[103] = (-12321) & 14898;
        llIIllIlII[104] = (-17331) & 20474;
        llIIllIlII[105] = (-25265) & 28407;
        llIIllIlII[106] = (-((-8305) & 13682)) & (-8321) & 16315;
        llIIllIlII[107] = (-(((68 + 148) - 103) + 48)) & (-8193) & 11519;
        llIIllIlII[108] = (-4481) & 7619;
        llIIllIlII[109] = 65 ^ 0;
        llIIllIlII[110] = (((184 + 0) - 156) + 189) ^ (((144 + 86) - 135) + 60);
        llIIllIlII[111] = (175 ^ 138) ^ (196 ^ 162);
        llIIllIlII[112] = 201 ^ 141;
    }

    private static String lIlIllIIIIlII(String llllllllllllllllllIIllIllIlIIIIl, String llllllllllllllllllIIllIllIlIIIII) {
        try {
            SecretKeySpec llllllllllllllllllIIllIllIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIllIllIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIllIllIlIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIllIllIlIIIll.init(llIIllIlII[5], llllllllllllllllllIIllIllIlIIlII);
            return new String(llllllllllllllllllIIllIllIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIllIllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIllIllIlIIIlI) {
            llllllllllllllllllIIllIllIlIIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0ec6, code lost:
        if (lIlIllIIlllIl(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[70]) != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b6, code lost:
        if (lIlIllIIllIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[8]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f9, code lost:
        if (lIlIllIIllIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[8]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x023c, code lost:
        if (lIlIllIIllIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[8]) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x023f, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIIIl[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[11]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.A.llIIllIlII[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x025a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0fbe  */
    /* JADX WARN: Type inference failed for: r0v563, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v578, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v609, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bw() {
        if (lIlIllIIlIlll(bt ? 1 : 0)) {
            C0015b.a(bv);
            if (lIlIllIIllIII(bv.size(), llIIllIlII[0])) {
                System.out.println(llIIllIIIl[llIIllIlII[1]]);
                bt = llIIllIlII[1];
            }
        }
        if (lIlIllIIllIIl(bt ? 1 : 0)) {
            if (lIlIllIIllIII(Skills.getLevel(Skill.PRAYER), llIIllIlII[2])) {
                aD.fY();
            }
            if (lIlIllIIllIlI(Skills.getLevel(Skill.PRAYER), llIIllIlII[2]) && lIlIllIIllIII(Skills.getLevel(Skill.MAGIC), llIIllIlII[3])) {
                C0026m.ak();
            }
            if (lIlIllIIllIIl(an() ? 1 : 0) && lIlIllIIllIII(C0018e.j(em), llIIllIlII[0]) && lIlIllIIllIlI(Skills.getLevel(Skill.PRAYER), llIIllIlII[2]) && lIlIllIIllIlI(Skills.getLevel(Skill.MAGIC), llIIllIlII[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIllIIllIll(nearest) && lIlIllIIllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[0]];
                    C0000a.a(nearest);
                }
                if (lIlIllIIllIll(nearest) && lIlIllIIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIllIIllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIllIlII[4]);
                        "".length();
                    }
                    if (lIlIllIIlIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIIllIIIl[llIIllIlII[5]];
                        if (lIlIllIIlllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIllIlII[6]);
                            "".length();
                        }
                        if (lIlIllIIlllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIllIlII[5]);
                            "".length();
                        }
                        int[] iArr = new int[llIIllIlII[0]];
                        iArr[llIIllIlII[1]] = llIIllIlII[7];
                        if (lIlIllIIlIlll(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIllIlII[0]];
                            iArr2[llIIllIlII[1]] = llIIllIlII[7];
                        }
                        int[] iArr3 = new int[llIIllIlII[0]];
                        iArr3[llIIllIlII[1]] = llIIllIlII[9];
                        if (lIlIllIIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIllIlII[0]];
                            iArr4[llIIllIlII[1]] = llIIllIlII[9];
                        }
                        int[] iArr5 = new int[llIIllIlII[0]];
                        iArr5[llIIllIlII[1]] = llIIllIlII[10];
                        if (lIlIllIIlIlll(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIllIlII[0]];
                            iArr6[llIIllIlII[1]] = llIIllIlII[10];
                        }
                        int[] iArr7 = new int[llIIllIlII[12]];
                        iArr7[llIIllIlII[1]] = llIIllIlII[13];
                        iArr7[llIIllIlII[0]] = llIIllIlII[7];
                        iArr7[llIIllIlII[5]] = llIIllIlII[10];
                        iArr7[llIIllIlII[11]] = llIIllIlII[14];
                        iArr7[llIIllIlII[6]] = llIIllIlII[15];
                        iArr7[llIIllIlII[16]] = llIIllIlII[17];
                        if (lIlIllIIllIIl(C0018e.c(iArr7) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIllIIIl[llIIllIlII[6]]);
                            bt = llIIllIlII[0];
                            return;
                        }
                        int[] iArr8 = new int[llIIllIlII[12]];
                        iArr8[llIIllIlII[1]] = llIIllIlII[13];
                        iArr8[llIIllIlII[0]] = llIIllIlII[7];
                        iArr8[llIIllIlII[5]] = llIIllIlII[10];
                        iArr8[llIIllIlII[11]] = llIIllIlII[14];
                        iArr8[llIIllIlII[6]] = llIIllIlII[15];
                        iArr8[llIIllIlII[16]] = llIIllIlII[17];
                        if (lIlIllIIlIlll(C0018e.c(iArr8) ? 1 : 0)) {
                            while (lIlIllIIllIIl(I.co() ? 1 : 0)) {
                                I.cm();
                                Time.sleepTicks(llIIllIlII[0]);
                                "".length();
                                "".length();
                                if ((94 ^ 90) < 0) {
                                    return;
                                }
                            }
                            if (lIlIllIIllIIl(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(llIIllIlII[12]);
                                "".length();
                            }
                            C0000a.a(llIIllIlII[13], llIIllIlII[18]);
                            C0000a.a(llIIllIlII[14], llIIllIlII[11]);
                            C0000a.a(llIIllIlII[7], llIIllIlII[8]);
                            C0000a.a(llIIllIlII[10], llIIllIlII[8]);
                            C0000a.a(llIIllIlII[17], llIIllIlII[11]);
                            C0000a.a(llIIllIlII[15], llIIllIlII[18]);
                            C0000a.a(llIIllIlII[19], llIIllIlII[4]);
                        }
                    }
                }
            }
            if (lIlIllIIlIlll(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIllIIllIII(Movement.getRunEnergy(), llIIllIlII[20])) {
                Inventory.getFirst(C0019f.ba).interact(llIIllIIIl[llIIllIlII[16]]);
                Time.sleepTicks(llIIllIlII[0]);
                "".length();
            }
            if (lIlIllIIllIII(Prayers.getPoints(), llIIllIlII[21]) && lIlIllIIlIlll(Inventory.contains(C0019f.aX) ? 1 : 0)) {
                Inventory.getFirst(C0019f.aX).interact(llIIllIIIl[llIIllIlII[12]]);
            }
            if (lIlIllIIlIlll(an() ? 1 : 0) && lIlIllIIllIIl(C0018e.j(em))) {
                if (lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[22]];
                    if (lIlIllIIlIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(ed);
                    "".length();
                    Time.sleepTicks(llIIllIlII[0]);
                    "".length();
                }
                if (lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                    C0020g.a(llIIllIIIl[llIIllIlII[23]], cE);
                }
            }
            if (lIlIllIIlllll(C0018e.j(em), llIIllIlII[0])) {
                if (lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ee), llIIllIlII[6]) && lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ef), llIIllIlII[6])) {
                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[24]];
                    Movement.walkTo(ee);
                    "".length();
                    Time.sleepTicks(llIIllIlII[0]);
                    "".length();
                }
                if (lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ee), llIIllIlII[12])) {
                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[18]];
                    String[] strArr = new String[llIIllIlII[0]];
                    strArr[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[25]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    String[] strArr2 = new String[llIIllIlII[0]];
                    strArr2[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[26]];
                    if (lIlIllIIlIlll(nearest2.hasAction(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[llIIllIlII[0]];
                        strArr3[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[3]];
                        if (lIlIllIIllIIl(Reachable.isInteractable(TileObjects.getNearest(strArr3)) ? 1 : 0)) {
                            String[] strArr4 = new String[llIIllIlII[0]];
                            strArr4[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[27]];
                            TileObjects.getNearest(strArr4).interact(llIIllIIIl[llIIllIlII[28]]);
                            Time.sleepTicks(llIIllIlII[6]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[llIIllIlII[0]];
                    strArr5[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[29]];
                    if (lIlIllIIlIlll(Reachable.isInteractable(TileObjects.getNearest(strArr5)) ? 1 : 0)) {
                        String[] strArr6 = new String[llIIllIlII[0]];
                        strArr6[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[30]];
                        TileObject nearest3 = TileObjects.getNearest(strArr6);
                        String[] strArr7 = new String[llIIllIlII[0]];
                        strArr7[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[31]];
                        if (lIlIllIIlIlll(nearest3.hasAction(strArr7) ? 1 : 0)) {
                            String[] strArr8 = new String[llIIllIlII[0]];
                            strArr8[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[32]];
                            TileObjects.getNearest(strArr8).interact(llIIllIIIl[llIIllIlII[33]]);
                            Time.sleepTicks(llIIllIlII[5]);
                            "".length();
                        }
                        String[] strArr9 = new String[llIIllIlII[0]];
                        strArr9[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[34]];
                        TileObject nearest4 = TileObjects.getNearest(strArr9);
                        String[] strArr10 = new String[llIIllIlII[0]];
                        strArr10[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[35]];
                        if (lIlIllIIlIlll(nearest4.hasAction(strArr10) ? 1 : 0)) {
                            String[] strArr11 = new String[llIIllIlII[0]];
                            strArr11[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[36]];
                            TileObjects.getNearest(strArr11).interact(llIIllIIIl[llIIllIlII[37]]);
                            Time.sleepTicks(llIIllIlII[5]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIllIIlllll(C0018e.j(em), llIIllIlII[5])) {
                int[] iArr9 = new int[llIIllIlII[0]];
                iArr9[llIIllIlII[1]] = llIIllIlII[38];
                if (lIlIllIIlIlll(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llIIllIlII[0]];
                    iArr10[llIIllIlII[1]] = llIIllIlII[38];
                    Inventory.getFirst(iArr10).interact(llIIllIIIl[llIIllIlII[21]]);
                }
                int[] iArr11 = new int[llIIllIlII[0]];
                iArr11[llIIllIlII[1]] = llIIllIlII[39];
                if (lIlIllIIlIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIIllIlII[0]];
                    iArr12[llIIllIlII[1]] = llIIllIlII[39];
                    Inventory.getFirst(iArr12).interact(llIIllIIIl[llIIllIlII[40]]);
                }
                if (lIlIllIIllIIl(en.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(eg), llIIllIlII[6])) {
                        AccBuilderSotf.c = llIIllIIIl[llIIllIlII[41]];
                        Movement.walkTo(eg);
                        "".length();
                        Time.sleepTicks(llIIllIlII[0]);
                        "".length();
                    }
                    if (lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eg), llIIllIlII[6]) && lIlIllIIllIIl(Players.getLocal().isMoving() ? 1 : 0) && lIlIllIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr12 = new String[llIIllIlII[0]];
                        strArr12[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[42]];
                        TileObjects.getNearest(strArr12).interact(llIIllIIIl[llIIllIlII[43]]);
                        Time.sleepTicks(llIIllIlII[5]);
                        "".length();
                    }
                }
                if (lIlIllIIlIlll(en.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[6])) {
                        AccBuilderSotf.c = llIIllIIIl[llIIllIlII[44]];
                        Movement.walkTo(eh);
                        "".length();
                        Time.sleepTicks(llIIllIlII[0]);
                        "".length();
                    }
                    if (lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[6]) && lIlIllIIllIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                        C0020g.a(llIIllIIIl[llIIllIlII[45]], cE);
                    }
                }
            }
            if (lIlIllIIlllll(C0018e.j(em), llIIllIlII[11])) {
                String[] strArr13 = new String[llIIllIlII[0]];
                strArr13[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[46]];
                if (lIlIllIIllIIl(Inventory.contains(strArr13) ? 1 : 0)) {
                    if (lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ek), llIIllIlII[16])) {
                        AccBuilderSotf.c = llIIllIIIl[llIIllIlII[47]];
                        Movement.walkTo(ek);
                        "".length();
                        Time.sleepTicks(llIIllIlII[0]);
                        "".length();
                    }
                    if (lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ek), llIIllIlII[16])) {
                        C0020g.a(llIIllIIIl[llIIllIlII[48]], cE);
                    }
                }
                String[] strArr14 = new String[llIIllIlII[0]];
                strArr14[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[49]];
                if (lIlIllIIlIlll(Inventory.contains(strArr14) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[50]];
                    if (lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[16])) {
                        AccBuilderSotf.c = llIIllIIIl[llIIllIlII[51]];
                        Movement.walkTo(eh);
                        "".length();
                        Time.sleepTicks(llIIllIlII[0]);
                        "".length();
                    }
                    if (lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[16])) {
                        C0020g.a(llIIllIIIl[llIIllIlII[52]], cE);
                    }
                }
            }
            if (lIlIllIIlllll(C0018e.j(em), llIIllIlII[16])) {
                if (lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(el), llIIllIlII[11])) {
                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[53]];
                    Movement.walkTo(el);
                    "".length();
                    Time.sleepTicks(llIIllIlII[0]);
                    "".length();
                }
                if (lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(el), llIIllIlII[11]) && lIlIllIIllIIl(Players.getLocal().isMoving() ? 1 : 0) && lIlIllIIllIIl(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr15 = new String[llIIllIlII[0]];
                    strArr15[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[54]];
                    Inventory.getFirst(strArr15).useOn(TileObjects.getNearest(tileObject -> {
                        if (lIlIllIIlIlll(tileObject.getName().contains(llIIllIIIl[llIIllIlII[90]]) ? 1 : 0) && lIlIllIIllllI(tileObject.getWorldLocation().distanceTo(el), llIIllIlII[11])) {
                            ?? r0 = llIIllIlII[0];
                            "".length();
                            return 0 != 0 ? ((((7 + 21) - (-114)) + 82) ^ (((54 + 164) - 211) + 170)) & (((87 ^ 19) ^ (109 ^ 120)) ^ (-" ".length())) : r0;
                        }
                        return llIIllIlII[1];
                    }));
                    Time.sleepTicks(llIIllIlII[5]);
                    "".length();
                }
            }
            if (lIlIllIIlllll(C0018e.j(em), llIIllIlII[12])) {
                if (lIlIllIIllIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIlIllIIllIIl(C0026m.ap() ? 1 : 0)) {
                    C0026m.aq();
                }
                if (lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                    String[] strArr16 = new String[llIIllIlII[0]];
                    strArr16[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[55]];
                    if (lIlIllIIllIll(NPCs.getNearest(strArr16))) {
                        String[] strArr17 = new String[llIIllIlII[0]];
                        strArr17[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[56]];
                        NPCs.getNearest(strArr17).interact(llIIllIIIl[llIIllIlII[57]]);
                        Time.sleepTicks(llIIllIlII[5]);
                        "".length();
                    }
                }
            }
            if (lIlIllIIlllll(C0018e.j(em), llIIllIlII[23]) && lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                C0020g.a(llIIllIIIl[llIIllIlII[58]], cE);
            }
            if (lIlIllIIlllll(C0018e.j(em), llIIllIlII[24])) {
                if (lIlIllIIllIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIlIllIIllIIl(C0026m.ap() ? 1 : 0)) {
                    C0026m.aq();
                }
                String[] strArr18 = new String[llIIllIlII[0]];
                strArr18[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[2]];
                if (lIlIllIIllIll(NPCs.getNearest(strArr18))) {
                    String[] strArr19 = new String[llIIllIlII[0]];
                    strArr19[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[59]];
                    if (lIlIllIIllllI(NPCs.getNearest(strArr19).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIIllIlII[16])) {
                        C0020g.a(llIIllIIIl[llIIllIlII[60]], cE);
                    }
                }
                if (lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                    String[] strArr20 = new String[llIIllIlII[0]];
                    strArr20[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[61]];
                    if (lIlIllIIllIll(NPCs.getNearest(strArr20))) {
                        String[] strArr21 = new String[llIIllIlII[0]];
                        strArr21[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[62]];
                        NPCs.getNearest(strArr21).interact(llIIllIIIl[llIIllIlII[20]]);
                        Time.sleepTicks(llIIllIlII[5]);
                        "".length();
                    }
                }
            }
            if (lIlIllIIlllll(C0018e.j(em), llIIllIlII[18])) {
                if (lIlIllIIllIIl(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIlIllIIllIIl(C0026m.ap() ? 1 : 0)) {
                    C0026m.aq();
                }
                if (lIlIllIlIIIII(Players.getLocal().getInteracting())) {
                    String[] strArr22 = new String[llIIllIlII[0]];
                    strArr22[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[63]];
                    if (lIlIllIIllIll(NPCs.getNearest(strArr22))) {
                        String[] strArr23 = new String[llIIllIlII[0]];
                        strArr23[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[64]];
                        NPCs.getNearest(strArr23).interact(llIIllIIIl[llIIllIlII[65]]);
                        Time.sleepTicks(llIIllIlII[5]);
                        "".length();
                    }
                }
            }
            if (!lIlIllIlIIIIl(C0018e.j(em), llIIllIlII[25]) || lIlIllIIlllll(C0018e.j(em), llIIllIlII[26])) {
                String[] strArr24 = new String[llIIllIlII[0]];
                strArr24[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[66]];
                if (lIlIllIIllIll(NPCs.getNearest(strArr24))) {
                    int[] iArr13 = new int[llIIllIlII[0]];
                    iArr13[llIIllIlII[1]] = llIIllIlII[13];
                    Inventory.getFirst(iArr13).interact(llIIllIIIl[llIIllIlII[67]]);
                    Time.sleepTicks(llIIllIlII[16]);
                    "".length();
                }
                WorldPoint worldPoint = new WorldPoint(llIIllIlII[68], llIIllIlII[69], llIIllIlII[1]);
                if (lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIIllIlII[70]) && lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIllIlII[6])) {
                    AccBuilderSotf.c = llIIllIIIl[llIIllIlII[71]];
                    Movement.walkTo(worldPoint);
                    "".length();
                    Time.sleepTicks(llIIllIlII[0]);
                    "".length();
                }
                if (!lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llIIllIlII[6]) || lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(eh), llIIllIlII[54])) {
                    if (lIlIllIIlllIl(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                        String[] strArr25 = new String[llIIllIlII[0]];
                        strArr25[llIIllIlII[1]] = llIIllIIIl[llIIllIlII[72]];
                        if (lIlIllIlIIIII(NPCs.getNearest(strArr25))) {
                        }
                    }
                    if (lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                        if (lIlIllIIllIII(di, llIIllIlII[0])) {
                            aN.ql += llIIllIlII[0];
                            aN.u(AccBuilderSotf.m);
                            di += llIIllIlII[0];
                            aN.ql = llIIllIlII[1];
                            dj = llIIllIlII[1];
                        }
                        C0020g.a(llIIllIIIl[llIIllIlII[79]], cE);
                    }
                }
                WorldArea worldArea = new WorldArea(llIIllIlII[73], llIIllIlII[74], llIIllIlII[43], llIIllIlII[37], llIIllIlII[1]);
                if (lIlIllIIllIII(C0018e.j(llIIllIlII[75]), llIIllIlII[24]) && lIlIllIIlIlll(Equipment.contains(item -> {
                    return item.getName().contains(llIIllIIIl[llIIllIlII[89]]);
                }) ? 1 : 0)) {
                    Equipment.getFirst(item2 -> {
                        return item2.getName().contains(llIIllIIIl[llIIllIlII[88]]);
                    }).interact(llIIllIIIl[llIIllIlII[76]]);
                    Time.sleepTicks(llIIllIlII[12]);
                    "".length();
                }
                if (lIlIllIIlIlll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(new WorldPoint(llIIllIlII[77], llIIllIlII[78], llIIllIlII[1]));
                    "".length();
                    Time.sleepTicks(llIIllIlII[0]);
                    "".length();
                }
                if (lIlIllIIllIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(ed);
                    "".length();
                    Time.sleepTicks(llIIllIlII[0]);
                    "".length();
                }
                if (lIlIllIIllllI(Players.getLocal().getWorldLocation().distanceTo(ed), llIIllIlII[16])) {
                }
            }
            C0020g.a(cE);
        }
    }

    private static void lIlIllIIlIlIl() {
        llIIllIIIl = new String[llIIllIlII[112]];
        llIIllIIIl[llIIllIlII[1]] = lIlIllIIIIIll("LQMAIyYDDwpqNx4TByQySwMaLzgYRk45IgIeDSI8BQ1OKDQIAU4+OksbGy8mHw==", "kjnJU");
        llIIllIIIl[llIIllIlII[0]] = lIlIllIIIIlII("aHIFW2suCZxtDacLXpysoQ==", "YbWin");
        llIIllIIIl[llIIllIlII[5]] = lIlIllIIIIlII("W9WgjnN6cja6x7Ci/tH0DjpSDJUfMrbU", "NwznS");
        llIIllIIIl[llIIllIlII[11]] = lIlIllIIIIlII("7Omz09r8WzTdAJey6/F6PuGUc+5uEjquxLwQZ7kh4/veqwztzG+MpkIdRqhMA2Wf", "UJYMm");
        llIIllIIIl[llIIllIlII[6]] = lIlIllIIIIIll("IBFRKB8SVBwgHgQdHy5NBgEUOhlXBwQ5HRsdFDpBVwcGIBkUHBgnClcAHmkvIi04Byo=", "wtqIm");
        llIIllIIIl[llIIllIlII[16]] = lIlIllIIIIlIl("kmQYr0g9kh4=", "gaEui");
        llIIllIIIl[llIIllIlII[12]] = lIlIllIIIIIll("HScIGiM=", "YUatH");
        llIIllIIIl[llIIllIlII[22]] = lIlIllIIIIlIl("X56UrZRY6QKHldlrC4xBLQ==", "lVgyw");
        llIIllIIIl[llIIllIlII[23]] = lIlIllIIIIlII("s1gY2awejpncqKL5i5JECQ==", "cGRio");
        llIIllIIIl[llIIllIlII[24]] = lIlIllIIIIlII("trGlDq8MckqXsZqXPlzhvw==", "eneiD");
        llIIllIIIl[llIIllIlII[18]] = lIlIllIIIIlIl("bsY6/HmvgwK66RinVcfXyA==", "IhogY");
        llIIllIIIl[llIIllIlII[25]] = lIlIllIIIIIll("MAQ7CA==", "tkTzv");
        llIIllIIIl[llIIllIlII[26]] = lIlIllIIIIlIl("qelbgQESCYw=", "jzQou");
        llIIllIIIl[llIIllIlII[3]] = lIlIllIIIIIll("GRAXMRM=", "ZxrBg");
        llIIllIIIl[llIIllIlII[27]] = lIlIllIIIIIll("KBsgMA==", "ltOBo");
        llIIllIIIl[llIIllIlII[28]] = lIlIllIIIIIll("Ix0uOw==", "lmKUo");
        llIIllIIIl[llIIllIlII[29]] = lIlIllIIIIIll("NCYJPAU=", "wNlOq");
        llIIllIIIl[llIIllIlII[30]] = lIlIllIIIIlIl("RAMglx911VI=", "mUrjn");
        llIIllIIIl[llIIllIlII[31]] = lIlIllIIIIIll("Jz4LLw==", "hNnAT");
        llIIllIIIl[llIIllIlII[32]] = lIlIllIIIIIll("Jy8tGz4=", "dGHhJ");
        llIIllIIIl[llIIllIlII[33]] = lIlIllIIIIlII("lEaRMLrGyOk=", "NRyOo");
        llIIllIIIl[llIIllIlII[34]] = lIlIllIIIIlIl("RB07d87D43E=", "bWPVE");
        llIIllIIIl[llIIllIlII[35]] = lIlIllIIIIlIl("YD38LXxhogw=", "kuWYx");
        llIIllIIIl[llIIllIlII[36]] = lIlIllIIIIIll("FC4XPjg=", "WFrML");
        llIIllIIIl[llIIllIlII[37]] = lIlIllIIIIlIl("xM7gu4WoMbQ=", "ZMIet");
        llIIllIIIl[llIIllIlII[21]] = lIlIllIIIIlIl("RtVJJY1XiwQ=", "ReNVY");
        llIIllIIIl[llIIllIlII[40]] = lIlIllIIIIlIl("KdMB1vb4wWQ=", "zTZbG");
        llIIllIIIl[llIIllIlII[41]] = lIlIllIIIIlIl("V3kfkGX0x6ZZTv3MI8iNkg==", "pWQYW");
        llIIllIIIl[llIIllIlII[42]] = lIlIllIIIIlII("PhQ5BAbO/K4=", "otJJW");
        llIIllIIIl[llIIllIlII[43]] = lIlIllIIIIlIl("ZgT19vYfbTc=", "Uywev");
        llIIllIIIl[llIIllIlII[44]] = lIlIllIIIIlII("gfvduYEeW7ieDv8Tr6LB7Q==", "cjAzl");
        llIIllIIIl[llIIllIlII[45]] = lIlIllIIIIlIl("kKZu7ugO7aYgflOQu/lv6Q==", "ceGwX");
        llIIllIIIl[llIIllIlII[46]] = lIlIllIIIIlIl("vfk83/uq5s+VpoqrRDlkGg==", "ivYfU");
        llIIllIIIl[llIIllIlII[47]] = lIlIllIIIIIll("JgonRxwHSzMVDR8=", "hkQgh");
        llIIllIIIl[llIIllIlII[48]] = lIlIllIIIIlIl("65i441S1A7xF0VT+l5vbBQ==", "ZPwXR");
        llIIllIIIl[llIIllIlII[49]] = lIlIllIIIIlII("5/T0j/Mu6fuwsDZc2vHCgg==", "DLAYa");
        llIIllIIIl[llIIllIlII[50]] = lIlIllIIIIlIl("+iM8gE2mL2K/bDfidsD85g==", "IFCZO");
        llIIllIIIl[llIIllIlII[51]] = lIlIllIIIIIll("AjEkbiMjcDU7Nj40", "LPRNW");
        llIIllIIIl[llIIllIlII[52]] = lIlIllIIIIlII("FUQXV8E210vsZoQj8JQAUg==", "rHngv");
        llIIllIIIl[llIIllIlII[53]] = lIlIllIIIIlIl("6or5GMY6MV8KYienOUvAVg==", "bHpSd");
        llIIllIIIl[llIIllIlII[54]] = lIlIllIIIIlII("LcmGzdfy3Hq0k1qaSQARcMFyygEmw0GJ", "yVZxA");
        llIIllIIIl[llIIllIlII[55]] = lIlIllIIIIlII("hyh64Zqscx5/A421rCYlwA==", "rpaUs");
        llIIllIIIl[llIIllIlII[56]] = lIlIllIIIIlIl("wtVIOI7S8/4gCtNVOeQcyQ==", "tJUTE");
        llIIllIIIl[llIIllIlII[57]] = lIlIllIIIIIll("CBwTADki", "IhgaZ");
        llIIllIIIl[llIIllIlII[58]] = lIlIllIIIIlIl("TPJzW2VcWrMP0m5ycyqbxQ==", "PTpxD");
        llIIllIIIl[llIIllIlII[2]] = lIlIllIIIIlII("vx3XPMmHBp0=", "kMgNO");
        llIIllIIIl[llIIllIlII[59]] = lIlIllIIIIlII("/D399HKyXNU=", "ySYdU");
        llIIllIIIl[llIIllIlII[60]] = lIlIllIIIIlII("Lyao4kzLsTU=", "RpiHQ");
        llIIllIIIl[llIIllIlII[61]] = lIlIllIIIIIll("MTsGOSUIN0cQJxUhFyorFA==", "zSgCD");
        llIIllIIIl[llIIllIlII[62]] = lIlIllIIIIlIl("llqfpgGPSIK1oDC67U2m47py202bkn5D", "LwVVz");
        llIIllIIIl[llIIllIlII[20]] = lIlIllIIIIlIl("KqyYNkk3l8w=", "swVIH");
        llIIllIIIl[llIIllIlII[63]] = lIlIllIIIIIll("FDw5LSQzIQ==", "VSLCG");
        llIIllIIIl[llIIllIlII[64]] = lIlIllIIIIIll("MwgwJjkUFQ==", "qgEHZ");
        llIIllIIIl[llIIllIlII[65]] = lIlIllIIIIIll("AB06ChEq", "AiNkr");
        llIIllIIIl[llIIllIlII[66]] = lIlIllIIIIIll("FAcoJgMyDmYIGTIYJzEV", "SbFCq");
        llIIllIIIl[llIIllIlII[67]] = lIlIllIIIIIll("LgswBhs=", "lyUgp");
        llIIllIIIl[llIIllIlII[71]] = lIlIllIIIIlIl("2ls5ey1JeJmzPAgaY8Gjlg==", "YhKbi");
        llIIllIIIl[llIIllIlII[72]] = lIlIllIIIIIll("FiclNj0wLmsYJzA4KiEr", "QBKSO");
        llIIllIIIl[llIIllIlII[76]] = lIlIllIIIIlIl("EEFAVDuR8wPc9yzhat1uJA==", "fBbkZ");
        llIIllIIIl[llIIllIlII[79]] = lIlIllIIIIlII("v4rK89D8szZyWQyVTyz+DA==", "lpNdE");
        llIIllIIIl[llIIllIlII[86]] = lIlIllIIIIlIl("MfVO+tOIkcY7AohqLJVIfw==", "XmADQ");
        llIIllIIIl[llIIllIlII[87]] = lIlIllIIIIIll("KxAGMmk2H0giLDgVHD1pcQ==", "YyhUI");
        llIIllIIIl[llIIllIlII[88]] = lIlIllIIIIlIl("QxG2McyExg8=", "orqej");
        llIIllIIIl[llIIllIlII[89]] = lIlIllIIIIIll("LR8tCyonDQ==", "IjHgC");
        llIIllIIIl[llIIllIlII[90]] = lIlIllIIIIlII("+yoZX04RPpyagUGEHAEV2A==", "BMSov");
        llIIllIIIl[llIIllIlII[109]] = lIlIllIIIIIll("EhIUdjtxGx86AnEKFSNN", "QszVr");
        llIIllIIIl[llIIllIlII[110]] = lIlIllIIIIlII("vAzoqTl/L6ajbiJnCKaT1iSgQl6fLbmqwosH7TAmDMQ=", "kIkSJ");
        llIIllIIIl[llIIllIlII[111]] = lIlIllIIIIIll("MhIJTw==", "kwzam");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (!lIlIllIlIIIlI(Quests.getState(Quest.FIGHT_ARENA), QuestState.FINISHED) || lIlIllIIllIlI(C0018e.j(em), llIIllIlII[27])) {
            ?? r0 = llIIllIlII[0];
            "".length();
            return "  ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllIlII[1];
    }

    private static boolean lIlIllIlIIIII(Object obj) {
        return obj == null;
    }

    private static String lIlIllIIIIlIl(String llllllllllllllllllIIllIllIIlIlII, String llllllllllllllllllIIllIllIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIllIllIIlIIll.getBytes(StandardCharsets.UTF_8)), llIIllIlII[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllIlII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIllIllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIllIllIIlIlIl) {
            llllllllllllllllllIIllIllIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIllIIllIII(int i, int i2) {
        return i < i2;
    }
}
