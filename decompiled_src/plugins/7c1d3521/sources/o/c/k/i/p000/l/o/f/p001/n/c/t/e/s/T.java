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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.T  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/T.class */
public class T implements InterfaceC0003ac {
    public static /* synthetic */ List<C0017d> bv;
    private static final /* synthetic */ int lR;
    static /* synthetic */ int di;
    static /* synthetic */ boolean dj;
    private static /* synthetic */ String[] llIIlIIllI;
    private static final /* synthetic */ String[] lV;
    private static /* synthetic */ int[] llIIlIIlll;
    private static final /* synthetic */ WorldPoint lU;
    private static final /* synthetic */ int lT;
    private static final /* synthetic */ int lS;
    static /* synthetic */ int cG;
    public static /* synthetic */ boolean bt;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    private static void dA() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIlIIllllII(nearest) && lIlIlIIlllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[21]];
            C0000a.a(nearest);
            Time.sleepTicks(llIIlIIlll[3]);
            "".length();
        }
        if (lIlIlIIllllII(nearest) && lIlIlIIlllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[22]];
            if (lIlIlIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llIIlIIlll[7]);
                "".length();
            }
            if (lIlIlIIlllIII(Bank.isOpen() ? 1 : 0)) {
                if (lIlIlIIlllIll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llIIlIIlll[6]);
                    "".length();
                }
                if (lIlIlIIlllIll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(llIIlIIlll[3]);
                    "".length();
                }
                int[] iArr = new int[llIIlIIlll[6]];
                iArr[llIIlIIlll[0]] = llIIlIIlll[11];
                iArr[llIIlIIlll[1]] = llIIlIIlll[10];
                iArr[llIIlIIlll[3]] = llIIlIIlll[8];
                iArr[llIIlIIlll[5]] = llIIlIIlll[13];
                if (lIlIlIIlllIlI(C0018e.c(iArr) ? 1 : 0)) {
                    Q();
                    System.out.println(llIIlIIllI[llIIlIIlll[23]]);
                    bt = llIIlIIlll[1];
                    return;
                }
                int[] iArr2 = new int[llIIlIIlll[6]];
                iArr2[llIIlIIlll[0]] = llIIlIIlll[11];
                iArr2[llIIlIIlll[1]] = llIIlIIlll[10];
                iArr2[llIIlIIlll[3]] = llIIlIIlll[8];
                iArr2[llIIlIIlll[5]] = llIIlIIlll[13];
                if (lIlIlIIlllIII(C0018e.c(iArr2) ? 1 : 0)) {
                    C0000a.a(llIIlIIlll[11], llIIlIIlll[6]);
                    C0000a.a(llIIlIIlll[10], llIIlIIlll[3]);
                    C0000a.a(llIIlIIlll[8], llIIlIIlll[9]);
                    C0000a.a(llIIlIIlll[13], llIIlIIlll[1]);
                }
                C0000a.b(C0019f.bk, llIIlIIlll[1]);
            }
        }
    }

    private static boolean lIlIlIIllllII(Object obj) {
        return obj != null;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIIlIIllI[llIIlIIlll[30]];
    }

    private static boolean lIlIlIIlllllI(int i, int i2) {
        return i > i2;
    }

    private static String lIlIlIIllIlIl(String llllllllllllllllllIlIIllIIllllIl, String llllllllllllllllllIlIIllIIllllII) {
        try {
            SecretKeySpec llllllllllllllllllIlIIllIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIllIIllllII.getBytes(StandardCharsets.UTF_8)), llIIlIIlll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIlll[3], llllllllllllllllllIlIIllIlIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIllIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIllIIlllllI) {
            llllllllllllllllllIlIIllIIlllllI.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIIllIllI() {
        llIIlIIllI = new String[llIIlIIlll[38]];
        llIIlIIllI[llIIlIIlll[0]] = lIlIlIIllIIll("MhQ0LzYXQSQyPR0S", "paMFX");
        llIIlIIllI[llIIlIIlll[1]] = lIlIlIIllIIll("ASghLRQvJCtkBTI4JioAZyg7IQo0bW83EC41LCwOKSZvJgYkKm8wCGcwOiEUMw==", "GAODg");
        llIIlIIllI[llIIlIIlll[3]] = lIlIlIIllIlII("z76ctGIbxeI=", "wWpvF");
        llIIlIIllI[llIIlIIlll[5]] = lIlIlIIllIIll("OQcuVgAYRjoXGhw=", "wfXvt");
        llIIlIIllI[llIIlIIlll[6]] = lIlIlIIllIIll("LyIELAIOLQ1oDAYtASEAAA==", "gCjHn");
        llIIlIIllI[llIIlIIlll[12]] = lIlIlIIllIlII("fp3qe/d/4Su+QjsBvkp/QU1DunnJkl9hb+u3zRmNagcx2Pegov5OjoLWmWiLg6AnB9s/t1A4eeQ=", "lBpuW");
        llIIlIIllI[llIIlIIlll[9]] = lIlIlIIllIIll("MS9VIz8DahgrPhUjGyVtFz8QMTlGOQAyPQojEDFhRjkCKzkFIhwsKkY+GmIPMxM8DAo=", "fJuBM");
        llIIlIIllI[llIIlIIlll[15]] = lIlIlIIllIIll("JAI3ShkFQzIeDBgX", "jcAjm");
        llIIlIIllI[llIIlIIlll[16]] = lIlIlIIllIlII("imoDEKqR5G3HmKnzwWntzw==", "SSIuE");
        llIIlIIllI[llIIlIIlll[17]] = lIlIlIIllIlII("Vp3Y27btJeo=", "EJhHD");
        llIIlIIllI[llIIlIIlll[18]] = lIlIlIIllIlII("sgR/o0MCf0w=", "HCoWw");
        llIIlIIllI[llIIlIIlll[19]] = lIlIlIIllIlIl("g7jYLed2G5k=", "MaNhP");
        llIIlIIllI[llIIlIIlll[20]] = lIlIlIIllIIll("BgYaBBo=", "Bihmy");
        llIIlIIllI[llIIlIIlll[21]] = lIlIlIIllIlIl("SszECdlEIj87O1u8foEB+A==", "cppUG");
        llIIlIIllI[llIIlIIlll[22]] = lIlIlIIllIlII("5kexF30YxpQlo4Mu3kqpN+QX85nrFvEu", "YFxgS");
        llIIlIIllI[llIIlIIlll[23]] = lIlIlIIllIlII("OhjWII5aSTc4leT+EopvTsA69Ejv+ipWA3ExAVdmWQllf0AoGHXRQoBwwOyYjP7xQpAdotV21Cc=", "eLxAi");
        llIIlIIllI[llIIlIIlll[30]] = lIlIlIIllIlIl("9T+7ykRNUOUl6T640QvASw==", "PHiFI");
        llIIlIIllI[llIIlIIlll[31]] = lIlIlIIllIlIl("qB77QMWCkHVcaTsAJV+uICXSBHs37rZE", "oVFGh");
        llIIlIIllI[llIIlIIlll[34]] = lIlIlIIllIlIl("vWNpk6kwnPMHyf/5IRCo/B4Y9d5xv/mP1jUnEUafnLk=", "SLxal");
        llIIlIIllI[llIIlIIlll[35]] = lIlIlIIllIlIl("nH7ro43GQio0WMRbb3X1vXhidTmQHITNUBEbNSHUYDDalZhuTgfZNQ==", "PQpLu");
        llIIlIIllI[llIIlIIlll[36]] = lIlIlIIllIlII("9WGia4zE8QYn+av71c0d/ikiVmw4xtf71cj95s4epXU=", "aMGGT");
        llIIlIIllI[llIIlIIlll[37]] = lIlIlIIllIlIl("kcp5tqDDrsY=", "zycVP");
    }

    private static String lIlIlIIllIIll(String llllllllllllllllllIlIIllIIlIIIII, String llllllllllllllllllIlIIllIIIlllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIlIIllIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIlIIllIIIlllIl = llllllllllllllllllIlIIllIIIlllll.toCharArray();
        int llllllllllllllllllIlIIllIIIlllII = llIIlIIlll[0];
        char[] charArray = str.toCharArray();
        int llllllllllllllllllIlIIllIIIlIlIl = charArray.length;
        int i = llIIlIIlll[0];
        while (lIlIlIIlllIIl(i, llllllllllllllllllIlIIllIIIlIlIl)) {
            char llllllllllllllllllIlIIllIIlIIIIl = charArray[i];
            sb.append((char) (llllllllllllllllllIlIIllIIlIIIIl ^ llllllllllllllllllIlIIllIIIlllIl[llllllllllllllllllIlIIllIIIlllII % llllllllllllllllllIlIIllIIIlllIl.length]));
            "".length();
            llllllllllllllllllIlIIllIIIlllII++;
            i++;
            "".length();
            if ((-" ".length()) >= ((163 ^ 145) & ((158 ^ 172) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e5, code lost:
        if (lIlIlIIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.T.llIIlIIlll[3]) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016d, code lost:
        if (lIlIlIIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.T.llIIlIIlll[6]) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIlIIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.T.llIIlIIlll[9]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[llIIlIIlll[1]];
        iArr5[llIIlIIlll[0]] = llIIlIIlll[8];
        if (lIlIlIIlllIII(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[llIIlIIlll[1]];
            iArr6[llIIlIIlll[0]] = llIIlIIlll[8];
            if (lIlIlIIlllIII(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[llIIlIIlll[1]];
                iArr7[llIIlIIlll[0]] = llIIlIIlll[8];
            }
            iArr = new int[llIIlIIlll[1]];
            iArr[llIIlIIlll[0]] = llIIlIIlll[10];
            if (lIlIlIIlllIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr8 = new int[llIIlIIlll[1]];
                iArr8[llIIlIIlll[0]] = llIIlIIlll[10];
                if (lIlIlIIlllIII(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llIIlIIlll[1]];
                    iArr9[llIIlIIlll[0]] = llIIlIIlll[10];
                }
                iArr2 = new int[llIIlIIlll[1]];
                iArr2[llIIlIIlll[0]] = llIIlIIlll[11];
                if (lIlIlIIlllIII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr10 = new int[llIIlIIlll[1]];
                    iArr10[llIIlIIlll[0]] = llIIlIIlll[11];
                    if (lIlIlIIlllIII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIIlIIlll[1]];
                        iArr11[llIIlIIlll[0]] = llIIlIIlll[11];
                    }
                    iArr3 = new int[llIIlIIlll[1]];
                    iArr3[llIIlIIlll[0]] = llIIlIIlll[13];
                    if (lIlIlIIlllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIlll[13], llIIlIIlll[12], llIIlIIlll[7]));
                        "".length();
                    }
                    if (lIlIlIIlllIlI(Bank.contains(item -> {
                        return item.getName().toLowerCase().contains(llIIlIIllI[llIIlIIlll[31]]);
                    }) ? 1 : 0)) {
                        bv.add(new C0017d(llIIlIIlll[25], llIIlIIlll[12], llIIlIIlll[26]));
                        "".length();
                    }
                    iArr4 = new int[llIIlIIlll[1]];
                    iArr4[llIIlIIlll[0]] = llIIlIIlll[27];
                    if (lIlIlIIlllIlI(Bank.contains(iArr4) ? 1 : 0)) {
                        return;
                    }
                    bv.add(new C0017d(llIIlIIlll[27], llIIlIIlll[28], llIIlIIlll[29]));
                    "".length();
                    return;
                }
                bv.add(new C0017d(llIIlIIlll[11], llIIlIIlll[6], llIIlIIlll[24]));
                "".length();
                iArr3 = new int[llIIlIIlll[1]];
                iArr3[llIIlIIlll[0]] = llIIlIIlll[13];
                if (lIlIlIIlllIlI(Bank.contains(iArr3) ? 1 : 0)) {
                }
                if (lIlIlIIlllIlI(Bank.contains(item2 -> {
                    return item2.getName().toLowerCase().contains(llIIlIIllI[llIIlIIlll[31]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[llIIlIIlll[1]];
                iArr4[llIIlIIlll[0]] = llIIlIIlll[27];
                if (lIlIlIIlllIlI(Bank.contains(iArr4) ? 1 : 0)) {
                }
            }
            bv.add(new C0017d(llIIlIIlll[10], llIIlIIlll[3], llIIlIIlll[24]));
            "".length();
            iArr2 = new int[llIIlIIlll[1]];
            iArr2[llIIlIIlll[0]] = llIIlIIlll[11];
            if (lIlIlIIlllIII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bv.add(new C0017d(llIIlIIlll[11], llIIlIIlll[6], llIIlIIlll[24]));
            "".length();
            iArr3 = new int[llIIlIIlll[1]];
            iArr3[llIIlIIlll[0]] = llIIlIIlll[13];
            if (lIlIlIIlllIlI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            if (lIlIlIIlllIlI(Bank.contains(item22 -> {
                return item22.getName().toLowerCase().contains(llIIlIIllI[llIIlIIlll[31]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[llIIlIIlll[1]];
            iArr4[llIIlIIlll[0]] = llIIlIIlll[27];
            if (lIlIlIIlllIlI(Bank.contains(iArr4) ? 1 : 0)) {
            }
        }
        bv.add(new C0017d(llIIlIIlll[8], llIIlIIlll[9], llIIlIIlll[24]));
        "".length();
        iArr = new int[llIIlIIlll[1]];
        iArr[llIIlIIlll[0]] = llIIlIIlll[10];
        if (lIlIlIIlllIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIlIIlll[10], llIIlIIlll[3], llIIlIIlll[24]));
        "".length();
        iArr2 = new int[llIIlIIlll[1]];
        iArr2[llIIlIIlll[0]] = llIIlIIlll[11];
        if (lIlIlIIlllIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIIlIIlll[11], llIIlIIlll[6], llIIlIIlll[24]));
        "".length();
        iArr3 = new int[llIIlIIlll[1]];
        iArr3[llIIlIIlll[0]] = llIIlIIlll[13];
        if (lIlIlIIlllIlI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        if (lIlIlIIlllIlI(Bank.contains(item222 -> {
            return item222.getName().toLowerCase().contains(llIIlIIllI[llIIlIIlll[31]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[llIIlIIlll[1]];
        iArr4[llIIlIIlll[0]] = llIIlIIlll[27];
        if (lIlIlIIlllIlI(Bank.contains(iArr4) ? 1 : 0)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c8, code lost:
        if (lIlIlIIllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.T.llIIlIIlll[9]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020a, code lost:
        if (lIlIlIIllllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.T.llIIlIIlll[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024d, code lost:
        if (lIlIlIIlllIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.T.llIIlIIlll[6]) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0250, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.T.llIIlIIllI[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.T.llIIlIIlll[12]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.T.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.T.llIIlIIlll[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dz() {
        if (lIlIlIIlllIII(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[0]];
            C0015b.a(bv);
            if (lIlIlIIlllIIl(bv.size(), llIIlIIlll[1])) {
                System.out.println(llIIlIIllI[llIIlIIlll[1]]);
                bt = llIIlIIlll[0];
            }
        }
        if (lIlIlIIlllIlI(bt ? 1 : 0)) {
            if (lIlIlIIlllIII(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlIlIIlllIIl(Movement.getRunEnergy(), llIIlIIlll[2])) {
                Inventory.getFirst(C0019f.ba).interact(llIIlIIllI[llIIlIIlll[3]]);
                Time.sleepTicks(llIIlIIlll[1]);
                "".length();
            }
            if (lIlIlIIlllIlI(Movement.isRunEnabled() ? 1 : 0) && lIlIlIIlllIll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIlIIlllIlI(an() ? 1 : 0) && lIlIlIIlllIIl(C0018e.j(llIIlIIlll[4]), llIIlIIlll[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIlIIllllII(nearest) && lIlIlIIlllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[5]];
                    C0000a.a(nearest);
                    Time.sleepTicks(llIIlIIlll[3]);
                    "".length();
                }
                if (lIlIlIIllllII(nearest) && lIlIlIIlllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[6]];
                    if (lIlIlIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIlIIlll[7]);
                        "".length();
                    }
                    if (lIlIlIIlllIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIlIIlllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIlIIlll[6]);
                            "".length();
                        }
                        if (lIlIlIIlllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIlIIlll[3]);
                            "".length();
                        }
                        int[] iArr = new int[llIIlIIlll[1]];
                        iArr[llIIlIIlll[0]] = llIIlIIlll[8];
                        if (lIlIlIIlllIII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[llIIlIIlll[1]];
                            iArr2[llIIlIIlll[0]] = llIIlIIlll[8];
                        }
                        int[] iArr3 = new int[llIIlIIlll[1]];
                        iArr3[llIIlIIlll[0]] = llIIlIIlll[10];
                        if (lIlIlIIlllIII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llIIlIIlll[1]];
                            iArr4[llIIlIIlll[0]] = llIIlIIlll[10];
                        }
                        int[] iArr5 = new int[llIIlIIlll[1]];
                        iArr5[llIIlIIlll[0]] = llIIlIIlll[11];
                        if (lIlIlIIlllIII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIlIIlll[1]];
                            iArr6[llIIlIIlll[0]] = llIIlIIlll[11];
                        }
                        int[] iArr7 = new int[llIIlIIlll[6]];
                        iArr7[llIIlIIlll[0]] = llIIlIIlll[11];
                        iArr7[llIIlIIlll[1]] = llIIlIIlll[10];
                        iArr7[llIIlIIlll[3]] = llIIlIIlll[8];
                        iArr7[llIIlIIlll[5]] = llIIlIIlll[13];
                        if (lIlIlIIlllIlI(C0018e.c(iArr7) ? 1 : 0)) {
                            Q();
                            System.out.println(llIIlIIllI[llIIlIIlll[9]]);
                            bt = llIIlIIlll[1];
                            return;
                        }
                        int[] iArr8 = new int[llIIlIIlll[6]];
                        iArr8[llIIlIIlll[0]] = llIIlIIlll[11];
                        iArr8[llIIlIIlll[1]] = llIIlIIlll[10];
                        iArr8[llIIlIIlll[3]] = llIIlIIlll[8];
                        iArr8[llIIlIIlll[5]] = llIIlIIlll[13];
                        if (lIlIlIIlllIII(C0018e.c(iArr8) ? 1 : 0)) {
                            C0000a.a(llIIlIIlll[11], llIIlIIlll[6]);
                            C0000a.a(llIIlIIlll[10], llIIlIIlll[3]);
                            C0000a.a(llIIlIIlll[8], llIIlIIlll[9]);
                            C0000a.a(llIIlIIlll[13], llIIlIIlll[1]);
                        }
                        if (lIlIlIIlllIII(AccBuilderSotf.e ? 1 : 0)) {
                            C0000a.b(C0019f.bk, llIIlIIlll[1]);
                        }
                    }
                }
            }
            if (lIlIlIIlllIlI(an() ? 1 : 0) && lIlIlIIlllIll(C0018e.j(llIIlIIlll[4])) && lIlIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[12])) {
                dA();
            }
            if ((!lIlIlIIlllIlI(an() ? 1 : 0) || lIlIlIIllllll(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[12])) && lIlIlIIlllIIl(C0018e.j(llIIlIIlll[4]), llIIlIIlll[14])) {
                if (lIlIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[6])) {
                    di = llIIlIIlll[0];
                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[15]];
                    if (lIlIlIIlllIIl(cG, llIIlIIlll[1])) {
                        C0018e.x();
                        cG += llIIlIIlll[1];
                    }
                    Movement.walkTo(lU);
                    "".length();
                }
                if (lIlIlIIllllll(Players.getLocal().getWorldLocation().distanceTo(lU), llIIlIIlll[9])) {
                    AccBuilderSotf.c = llIIlIIllI[llIIlIIlll[16]];
                    String[] strArr = new String[llIIlIIlll[1]];
                    strArr[llIIlIIlll[0]] = llIIlIIllI[llIIlIIlll[17]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    if (lIlIlIIllllII(nearest2)) {
                        String[] strArr2 = new String[llIIlIIlll[1]];
                        strArr2[llIIlIIlll[0]] = llIIlIIllI[llIIlIIlll[18]];
                        if (lIlIlIIlllIII(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(llIIlIIllI[llIIlIIlll[19]]);
                            Time.sleepTicks(llIIlIIlll[5]);
                            "".length();
                        }
                    }
                    if (lIlIlIIlllIIl(di, llIIlIIlll[1])) {
                        aN.td += llIIlIIlll[1];
                        aN.u(AccBuilderSotf.m);
                        di += llIIlIIlll[1];
                        aN.td = llIIlIIlll[0];
                        dj = llIIlIIlll[0];
                    }
                    C0020g.a(llIIlIIllI[llIIlIIlll[20]], lV);
                }
            }
            C0020g.a(new String[llIIlIIlll[0]]);
        }
        System.out.println("Setting: " + C0018e.j(llIIlIIlll[4]));
    }

    private static String lIlIlIIllIlII(String llllllllllllllllllIlIIllIIllIIII, String llllllllllllllllllIlIIllIIlIllll) {
        try {
            SecretKeySpec llllllllllllllllllIlIIllIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlIIllIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIlIIllIIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllIlIIllIIllIIlI.init(llIIlIIlll[3], llllllllllllllllllIlIIllIIllIIll);
            return new String(llllllllllllllllllIlIIllIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlIIllIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlIIllIIllIIIl) {
            llllllllllllllllllIlIIllIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIlllIll(int i) {
        return i > 0;
    }

    private static boolean lIlIlIIllllIl(int i, int i2) {
        return i >= i2;
    }

    private static void lIlIlIIllIlll() {
        llIIlIIlll = new int[39];
        llIIlIIlll[0] = (177 ^ 173) & ((174 ^ 178) ^ (-1));
        llIIlIIlll[1] = " ".length();
        llIIlIIlll[2] = 65 ^ 115;
        llIIlIIlll[3] = "  ".length();
        llIIlIIlll[4] = (198 ^ 191) ^ (29 ^ 123);
        llIIlIIlll[5] = "   ".length();
        llIIlIIlll[6] = 52 ^ 48;
        llIIlIIlll[7] = (-((-4617) & 32367)) & (-18) & 32767;
        llIIlIIlll[8] = (-3086) & 3519;
        llIIlIIlll[9] = (((55 + 103) - (-13)) + 3) ^ (((154 + 68) - 63) + 9);
        llIIlIIlll[10] = (-17991) & 18430;
        llIIlIIlll[11] = (-3586) & 4021;
        llIIlIIlll[12] = 193 ^ 196;
        llIIlIIlll[13] = (-37) & 8045;
        llIIlIIlll[14] = 24 ^ 124;
        llIIlIIlll[15] = (189 ^ 166) ^ (101 ^ 121);
        llIIlIIlll[16] = (156 ^ 140) ^ (106 ^ 114);
        llIIlIIlll[17] = 89 ^ 80;
        llIIlIIlll[18] = 10 ^ 0;
        llIIlIIlll[19] = (2 ^ 20) ^ (95 ^ 66);
        llIIlIIlll[20] = 158 ^ 146;
        llIIlIIlll[21] = 202 ^ 199;
        llIIlIIlll[22] = (209 ^ 187) ^ (73 ^ 45);
        llIIlIIlll[23] = 86 ^ 89;
        llIIlIIlll[24] = (-32260) & 32759;
        llIIlIIlll[25] = (-291) & 12270;
        llIIlIIlll[26] = (-5720) & 30719;
        llIIlIIlll[27] = (-((-10567) & 27087)) & (-8241) & 32767;
        llIIlIIlll[28] = 26 ^ 50;
        llIIlIIlll[29] = (-18433) & 19932;
        llIIlIIlll[30] = (((128 + 128) - 167) + 70) ^ (((131 + 97) - 211) + 126);
        llIIlIIlll[31] = 73 ^ 88;
        llIIlIIlll[32] = (-((-9041) & 29553)) & (-1113) & 24575;
        llIIlIIlll[33] = (-5) & 3455;
        llIIlIIlll[34] = 181 ^ 167;
        llIIlIIlll[35] = 44 ^ 63;
        llIIlIIlll[36] = 71 ^ 83;
        llIIlIIlll[37] = (181 ^ 169) ^ (137 ^ 128);
        llIIlIIlll[38] = (((138 + 73) - 8) + 8) ^ (((107 + 178) - 100) + 12);
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            dz();
            "".length();
            if ((-(85 ^ 80)) >= 0) {
                return (38 ^ 46) & ((124 ^ 116) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return llIIlIIlll[18];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIIlIIlll[0];
    }

    private static boolean lIlIlIIlllIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlIlIIllllIl(C0018e.j(llIIlIIlll[4]), llIIlIIlll[14])) {
            ?? r0 = llIIlIIlll[1];
            "".length();
            return ((((107 ^ 18) ^ (147 ^ 175)) & (((50 ^ 81) ^ (21 ^ 51)) ^ (-" ".length()))) & ((((((65 + 47) - 75) + 107) ^ (((10 + 156) - 93) + 87)) & (((((127 + 17) - 84) + 124) ^ (((98 + 39) - 23) + 22)) ^ (-" ".length()))) ^ (-" ".length()))) != 0 ? ((210 ^ 189) ^ (85 ^ 118)) & (((((160 + 210) - 179) + 38) ^ (((150 + 18) - 27) + 28)) ^ (-" ".length())) : r0;
        }
        return llIIlIIlll[0];
    }

    static {
        lIlIlIIllIlll();
        lIlIlIIllIllI();
        lR = llIIlIIlll[8];
        lT = llIIlIIlll[11];
        lS = llIIlIIlll[10];
        lU = new WorldPoint(llIIlIIlll[32], llIIlIIlll[33], llIIlIIlll[0]);
        String[] strArr = new String[llIIlIIlll[6]];
        strArr[llIIlIIlll[0]] = llIIlIIllI[llIIlIIlll[34]];
        strArr[llIIlIIlll[1]] = llIIlIIllI[llIIlIIlll[35]];
        strArr[llIIlIIlll[3]] = llIIlIIllI[llIIlIIlll[36]];
        strArr[llIIlIIlll[5]] = llIIlIIllI[llIIlIIlll[37]];
        lV = strArr;
        bv = new ArrayList();
        cG = llIIlIIlll[0];
    }

    private static boolean lIlIlIIllllll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIlIIlllIlI(int i) {
        return i == 0;
    }

    private static boolean lIlIlIIlllIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[llIIlIIlll[1]];
        iArr[llIIlIIlll[0]] = llIIlIIlll[8];
        if (lIlIlIIllllIl(Inventory.getCount(iArr), llIIlIIlll[9])) {
            int[] iArr2 = new int[llIIlIIlll[1]];
            iArr2[llIIlIIlll[0]] = llIIlIIlll[10];
            if (lIlIlIIllllIl(Inventory.getCount(iArr2), llIIlIIlll[3])) {
                int[] iArr3 = new int[llIIlIIlll[1]];
                iArr3[llIIlIIlll[0]] = llIIlIIlll[11];
                if (lIlIlIIllllIl(Inventory.getCount(iArr3), llIIlIIlll[6])) {
                    ?? r0 = llIIlIIlll[1];
                    "".length();
                    return (((98 ^ 120) ^ (2 ^ 94)) & (((197 ^ 148) ^ (82 ^ 69)) ^ (-" ".length()))) != 0 ? ((((156 + 158) - 218) + 74) ^ (((156 + 92) - 120) + 61)) & (((37 ^ 127) ^ (207 ^ 130)) ^ (-" ".length())) : r0;
                }
            }
        }
        return llIIlIIlll[0];
    }
}
