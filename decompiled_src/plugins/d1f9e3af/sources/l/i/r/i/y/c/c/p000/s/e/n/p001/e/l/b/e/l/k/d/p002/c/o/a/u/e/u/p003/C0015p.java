package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.p  reason: invalid package and case insensitive filesystem */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/p.class */
public class C0015p implements W {
    static /* synthetic */ String cc;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean bW;
    private static /* synthetic */ int[] lIIlIIIlI;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int bZ;
    static /* synthetic */ String h;
    static /* synthetic */ int bY;
    private static /* synthetic */ String[] bR;
    private static /* synthetic */ int ca;
    private static /* synthetic */ String[] lIIlIIIIl;
    static /* synthetic */ WorldPoint bX;
    private static /* synthetic */ int cb;

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return h;
    }

    private static String llllIIIlIlI(String lIIIlIIllIlIIlI, String lIIIlIIllIlIIIl) {
        try {
            SecretKeySpec lIIIlIIllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIIllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIIIlI[17]), "DES");
            Cipher lIIIlIIllIlIlII = Cipher.getInstance("DES");
            lIIIlIIllIlIlII.init(lIIlIIIlI[3], lIIIlIIllIlIlIl);
            return new String(lIIIlIIllIlIlII.doFinal(Base64.getDecoder().decode(lIIIlIIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIIllIlIIll) {
            lIIIlIIllIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIllIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v262, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v284, types: [boolean] */
    public static void aD() {
        if (llllIIlIIII(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (llllIIlIIIl(bv.size(), lIIlIIIlI[0])) {
                System.out.println(lIIlIIIIl[lIIlIIIlI[1]]);
                bt = lIIlIIIlI[1];
            }
        }
        if (llllIIlIIlI(bt ? 1 : 0)) {
            if (llllIIlIIlI(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllIIlIIll(nearest) && llllIIlIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[0]];
                    C0000a.a(nearest);
                }
                if (llllIIlIIll(nearest) && llllIIlIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llllIIlIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIlI[2]);
                        "".length();
                    }
                    if (llllIIlIIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[3]];
                        if (llllIIlIlII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIlI[4]);
                            "".length();
                        }
                        if (llllIIlIlII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIIlI[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIlIIIlI[5]];
                        iArr[lIIlIIIlI[1]] = lIIlIIIlI[6];
                        iArr[lIIlIIIlI[0]] = lIIlIIIlI[7];
                        iArr[lIIlIIIlI[3]] = lIIlIIIlI[8];
                        iArr[lIIlIIIlI[9]] = lIIlIIIlI[10];
                        iArr[lIIlIIIlI[4]] = lIIlIIIlI[11];
                        if (llllIIlIIlI(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIlIIIIl[lIIlIIIlI[9]]);
                            bt = lIIlIIIlI[0];
                            return;
                        }
                        int[] iArr2 = new int[lIIlIIIlI[5]];
                        iArr2[lIIlIIIlI[1]] = lIIlIIIlI[6];
                        iArr2[lIIlIIIlI[0]] = lIIlIIIlI[7];
                        iArr2[lIIlIIIlI[3]] = lIIlIIIlI[8];
                        iArr2[lIIlIIIlI[9]] = lIIlIIIlI[10];
                        iArr2[lIIlIIIlI[4]] = lIIlIIIlI[11];
                        if (llllIIlIIII(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIlIIIlI[6], lIIlIIIlI[12]);
                            C0000a.a(lIIlIIIlI[7], lIIlIIIlI[12]);
                            C0000a.a(lIIlIIIlI[8], lIIlIIIlI[12]);
                            C0000a.a(lIIlIIIlI[10], lIIlIIIlI[12]);
                            C0000a.a(lIIlIIIlI[11], lIIlIIIlI[5]);
                        }
                    }
                }
            }
            if (llllIIlIIII(Inventory.contains(C0005f.aV) ? 1 : 0) && llllIIlIIIl(Movement.getRunEnergy(), lIIlIIIlI[13])) {
                Inventory.getFirst(C0005f.aV).interact(lIIlIIIIl[lIIlIIIlI[4]]);
                Time.sleepTicks(lIIlIIIlI[0]);
                "".length();
            }
            if (llllIIlIIII(Inventory.contains(C0005f.aS) ? 1 : 0) && llllIIlIIIl(Prayers.getPoints(), lIIlIIIlI[14])) {
                Inventory.getFirst(C0005f.aS).interact(lIIlIIIIl[lIIlIIIlI[5]]);
            }
            if (llllIIlIlIl(llllIIIllll(C0004e.u(), 60.0d))) {
                String[] strArr = new String[lIIlIIIlI[0]];
                strArr[lIIlIIIlI[1]] = lIIlIIIIl[lIIlIIIlI[15]];
                if (llllIIlIIII(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIlIIIlI[0]];
                    strArr2[lIIlIIIlI[1]] = lIIlIIIIl[lIIlIIIlI[16]];
                    Inventory.getFirst(strArr2).interact(lIIlIIIIl[lIIlIIIlI[17]]);
                    Time.sleepTicks(lIIlIIIlI[3]);
                    "".length();
                }
            }
            if (llllIIlIIII(ab() ? 1 : 0)) {
                if (llllIIlIIIl(bZ, lIIlIIIlI[0])) {
                    Tabs.open(Tab.INVENTORY);
                    Time.sleepTicks(lIIlIIIlI[0]);
                    "".length();
                    Tabs.open(Tab.MUSIC);
                    Time.sleepTicks(lIIlIIIlI[0]);
                    "".length();
                    bZ += lIIlIIIlI[0];
                }
                Widget[] children = Widgets.get(lIIlIIIlI[18], lIIlIIIlI[15]).getChildren();
                List list = (List) Arrays.stream(children).filter(widget -> {
                    if (llllIIlIIII(widget.getText().contains(lIIlIIIIl[lIIlIIIlI[14]]) ? 1 : 0) && llllIIllIII(widget.getTextColor(), cb)) {
                        ?? r0 = lIIlIIIlI[0];
                        "".length();
                        return "   ".length() <= (((((74 + 62) - 53) + 67) ^ (((21 + 67) - (-18)) + 50)) & (((((55 + 150) - 33) + 8) ^ (((69 + 158) - 129) + 92)) ^ (-" ".length()))) ? ((99 ^ 106) ^ (85 ^ 125)) & (((35 ^ 112) ^ (106 ^ 24)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIIlI[1];
                }).collect(Collectors.toList());
                List list2 = (List) Arrays.stream(children).filter(widget2 -> {
                    if (llllIIlIIII(widget2.getText().contains(lIIlIIIIl[lIIlIIIlI[49]]) ? 1 : 0) && llllIIllIII(widget2.getTextColor(), cb)) {
                        ?? r0 = lIIlIIIlI[0];
                        "".length();
                        return ((215 ^ 154) ^ (37 ^ 108)) == (((140 ^ 137) ^ (230 ^ 128)) & (((((150 + 1) - (-36)) + 65) ^ (((24 + 28) - (-106)) + 1)) ^ (-" ".length()))) ? ((140 ^ 173) ^ (46 ^ 55)) & (((41 ^ 63) ^ (111 ^ 65)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIIlI[1];
                }).collect(Collectors.toList());
                List list3 = (List) Arrays.stream(children).filter(widget3 -> {
                    if (llllIIlIIII(widget3.getText().contains(lIIlIIIIl[lIIlIIIlI[48]]) ? 1 : 0) && llllIIllIII(widget3.getTextColor(), cb)) {
                        ?? r0 = lIIlIIIlI[0];
                        "".length();
                        return "   ".length() < "  ".length() ? ((((52 + 35) - (-101)) + 2) ^ (((8 + 2) - (-143)) + 27)) & (((((129 + 128) - 114) + 1) ^ (((45 + 151) - 183) + 141)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIIlI[1];
                }).collect(Collectors.toList());
                List list4 = (List) Arrays.stream(children).filter(widget4 -> {
                    if (llllIIlIIII(widget4.getText().contains(lIIlIIIIl[lIIlIIIlI[47]]) ? 1 : 0) && llllIIllIII(widget4.getTextColor(), cb)) {
                        ?? r0 = lIIlIIIlI[0];
                        "".length();
                        return 0 != 0 ? ((0 ^ 74) ^ (91 ^ 93)) & (((104 ^ 4) ^ (4 ^ 36)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIIIlI[1];
                }).collect(Collectors.toList());
                if (llllIIlIIlI(list4.isEmpty() ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIIlIIIlI[19], lIIlIIIlI[20], lIIlIIIlI[1]);
                    WorldPoint worldPoint2 = new WorldPoint(lIIlIIIlI[21], lIIlIIIlI[22], lIIlIIIlI[1]);
                    if (llllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIlIIIlI[5])) {
                        AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[23]];
                        if (llllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIIlI[4])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIlIIIlI[0]);
                            "".length();
                        }
                        if (llllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIlIIIlI[4])) {
                            AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[12]];
                            String[] strArr3 = new String[lIIlIIIlI[0]];
                            strArr3[lIIlIIIlI[1]] = lIIlIIIIl[lIIlIIIlI[24]];
                            TileObjects.getNearest(strArr3).interact(lIIlIIIIl[lIIlIIIlI[25]]);
                            Time.sleepTicks(lIIlIIIlI[9]);
                            "".length();
                        }
                    }
                    if (llllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIIlIIIlI[5])) {
                        Tabs.open(Tab.INVENTORY);
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                        Tabs.open(Tab.MUSIC);
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                    }
                }
                if (llllIIlIIII(list4.isEmpty() ? 1 : 0) && llllIIlIIlI(list3.isEmpty() ? 1 : 0)) {
                    WorldPoint worldPoint3 = new WorldPoint(lIIlIIIlI[26], lIIlIIIlI[27], lIIlIIIlI[1]);
                    if (llllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIlIIIlI[5])) {
                        AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[28]];
                        Movement.walkTo(worldPoint3);
                        "".length();
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                    }
                    if (llllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint3), lIIlIIIlI[5])) {
                        Tabs.open(Tab.INVENTORY);
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                        Tabs.open(Tab.MUSIC);
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                    }
                }
                if (llllIIlIIII(list4.isEmpty() ? 1 : 0) && llllIIlIIII(list3.isEmpty() ? 1 : 0) && llllIIlIIlI(list.isEmpty() ? 1 : 0)) {
                    WorldPoint worldPoint4 = new WorldPoint(lIIlIIIlI[29], lIIlIIIlI[30], lIIlIIIlI[1]);
                    if (llllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lIIlIIIlI[5])) {
                        AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[31]];
                        C0004e.a(worldPoint4);
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                    }
                    if (llllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint4), lIIlIIIlI[5])) {
                        Tabs.open(Tab.INVENTORY);
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                        Tabs.open(Tab.MUSIC);
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                    }
                }
                if (llllIIlIIII(list4.isEmpty() ? 1 : 0) && llllIIlIIII(list3.isEmpty() ? 1 : 0) && llllIIlIIII(list.isEmpty() ? 1 : 0) && llllIIlIIlI(list2.isEmpty() ? 1 : 0)) {
                    WorldPoint worldPoint5 = new WorldPoint(lIIlIIIlI[32], lIIlIIIlI[33], lIIlIIIlI[1]);
                    if (llllIIlIllI(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lIIlIIIlI[5])) {
                        AccBuilderEasyClues.c = lIIlIIIIl[lIIlIIIlI[34]];
                        C0004e.a(worldPoint5);
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                    }
                    if (llllIIlIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lIIlIIIlI[5])) {
                        Tabs.open(Tab.INVENTORY);
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                        Tabs.open(Tab.MUSIC);
                        Time.sleepTicks(lIIlIIIlI[0]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean llllIIlIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIlIIIlI[1];
    }

    static {
        llllIIIlllI();
        llllIIIllIl();
        bv = new ArrayList();
        bX = new WorldPoint(lIIlIIIlI[1], lIIlIIIlI[1], lIIlIIIlI[1]);
        bY = lIIlIIIlI[1];
        String[] strArr = new String[lIIlIIIlI[0]];
        strArr[lIIlIIIlI[1]] = lIIlIIIIl[lIIlIIIlI[50]];
        bR = strArr;
        ca = lIIlIIIlI[51];
        cb = lIIlIIIlI[52];
        cc = lIIlIIIIl[lIIlIIIlI[53]];
        h = "Music unlocks " + cc;
    }

    private static String llllIIIlIll(String lIIIlIIllIIIlIl, String lIIIlIIllIIIlII) {
        try {
            SecretKeySpec lIIIlIIllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIIllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIIlI[3], lIIIlIIllIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIlIIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlIIllIIIllI) {
            lIIIlIIllIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIlIllI(int i, int i2) {
        return i > i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            aD();
            "".length();
            if ("   ".length() > (0 ^ 4)) {
                return (192 ^ 129) & ((96 ^ 33) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIlIIIlI[42];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIlIIIlI[5]];
        iArr[lIIlIIIlI[1]] = lIIlIIIlI[6];
        iArr[lIIlIIIlI[0]] = lIIlIIIlI[7];
        iArr[lIIlIIIlI[3]] = lIIlIIIlI[8];
        iArr[lIIlIIIlI[9]] = lIIlIIIlI[10];
        iArr[lIIlIIIlI[4]] = lIIlIIIlI[11];
        int i = lIIlIIIlI[1];
        while (llllIIlIIIl(i, iArr.length)) {
            int[] iArr2 = new int[lIIlIIIlI[0]];
            iArr2[lIIlIIIlI[1]] = iArr[i];
            if (llllIIlIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIlIIIlI[1];
            }
            i++;
            "".length();
            if (((66 ^ 86) & ((76 ^ 88) ^ (-1))) <= (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIlIIIlI[0];
    }

    private static String llllIIIllII(String lIIIlIIlllIIlll, String lIIIlIIlllIIllI) {
        String str = new String(Base64.getDecoder().decode(lIIIlIIlllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIIlllIIlIl = new StringBuilder();
        char[] charArray = lIIIlIIlllIIllI.toCharArray();
        int lIIIlIIlllIIIll = lIIlIIIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIIIlI[1];
        while (llllIIlIIIl(i, length)) {
            lIIIlIIlllIIlIl.append((char) (charArray2[i] ^ charArray[lIIIlIIlllIIIll % charArray.length]));
            "".length();
            lIIIlIIlllIIIll++;
            i++;
            "".length();
            if (((204 ^ 142) ^ (198 ^ 128)) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lIIIlIIlllIIlIl);
    }

    private static boolean llllIIlIlII(int i) {
        return i > 0;
    }

    private static boolean llllIIlIIII(int i) {
        return i != 0;
    }

    private static int llllIIIllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llllIIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llllIIlIlll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e7, code lost:
        if (llllIIlIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0015p.lIIlIIIlI[12]) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0171, code lost:
        if (llllIIlIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0015p.lIIlIIIlI[12]) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0233, code lost:
        if (llllIIlIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0015p.lIIlIIIlI[4]) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02b9, code lost:
        if (llllIIlIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0015p.lIIlIIIlI[39]) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llllIIlIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.C0015p.lIIlIIIlI[12]) != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6 = new int[lIIlIIIlI[0]];
        iArr6[lIIlIIIlI[1]] = lIIlIIIlI[7];
        if (llllIIlIIII(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIIlIIIlI[0]];
            iArr7[lIIlIIIlI[1]] = lIIlIIIlI[7];
            if (llllIIlIIII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlIIIlI[0]];
                iArr8[lIIlIIIlI[1]] = lIIlIIIlI[7];
            }
            iArr = new int[lIIlIIIlI[0]];
            iArr[lIIlIIIlI[1]] = lIIlIIIlI[10];
            if (llllIIlIIII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlIIIlI[0]];
                iArr9[lIIlIIIlI[1]] = lIIlIIIlI[10];
                if (llllIIlIIII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlIIIlI[0]];
                    iArr10[lIIlIIIlI[1]] = lIIlIIIlI[10];
                }
                iArr2 = new int[lIIlIIIlI[0]];
                iArr2[lIIlIIIlI[1]] = lIIlIIIlI[8];
                if (llllIIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr11 = new int[lIIlIIIlI[0]];
                    iArr11[lIIlIIIlI[1]] = lIIlIIIlI[8];
                    if (llllIIlIIII(Bank.contains(iArr11) ? 1 : 0)) {
                        int[] iArr12 = new int[lIIlIIIlI[0]];
                        iArr12[lIIlIIIlI[1]] = lIIlIIIlI[8];
                    }
                    if (llllIIlIIlI(Bank.contains(item -> {
                        return item.getName().toLowerCase().contains(lIIlIIIIl[lIIlIIIlI[39]]);
                    }) ? 1 : 0)) {
                        bv.add(new C0003d(lIIlIIIlI[36], lIIlIIIlI[5], lIIlIIIlI[37]));
                        "".length();
                    }
                    iArr3 = new int[lIIlIIIlI[0]];
                    iArr3[lIIlIIIlI[1]] = lIIlIIIlI[11];
                    if (llllIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr13 = new int[lIIlIIIlI[0]];
                        iArr13[lIIlIIIlI[1]] = lIIlIIIlI[11];
                        if (llllIIlIIII(Bank.contains(iArr13) ? 1 : 0)) {
                            int[] iArr14 = new int[lIIlIIIlI[0]];
                            iArr14[lIIlIIIlI[1]] = lIIlIIIlI[11];
                        }
                        iArr4 = new int[lIIlIIIlI[0]];
                        iArr4[lIIlIIIlI[1]] = lIIlIIIlI[38];
                        if (llllIIlIIII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr15 = new int[lIIlIIIlI[0]];
                            iArr15[lIIlIIIlI[1]] = lIIlIIIlI[38];
                            if (llllIIlIIII(Bank.contains(iArr15) ? 1 : 0)) {
                                int[] iArr16 = new int[lIIlIIIlI[0]];
                                iArr16[lIIlIIIlI[1]] = lIIlIIIlI[38];
                            }
                            iArr5 = new int[lIIlIIIlI[0]];
                            iArr5[lIIlIIIlI[1]] = lIIlIIIlI[6];
                            if (llllIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr17 = new int[lIIlIIIlI[0]];
                                iArr17[lIIlIIIlI[1]] = lIIlIIIlI[6];
                                if (!llllIIlIIII(Bank.contains(iArr17) ? 1 : 0)) {
                                    return;
                                }
                                int[] iArr18 = new int[lIIlIIIlI[0]];
                                iArr18[lIIlIIIlI[1]] = lIIlIIIlI[6];
                                if (!llllIIlIIIl(Bank.getFirst(iArr18).getQuantity(), lIIlIIIlI[34])) {
                                    return;
                                }
                            }
                            bv.add(new C0003d(lIIlIIIlI[6], lIIlIIIlI[40], lIIlIIIlI[41]));
                            "".length();
                        }
                        bv.add(new C0003d(lIIlIIIlI[38], lIIlIIIlI[39], lIIlIIIlI[35]));
                        "".length();
                        iArr5 = new int[lIIlIIIlI[0]];
                        iArr5[lIIlIIIlI[1]] = lIIlIIIlI[6];
                        if (llllIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                        }
                        bv.add(new C0003d(lIIlIIIlI[6], lIIlIIIlI[40], lIIlIIIlI[41]));
                        "".length();
                    }
                    bv.add(new C0003d(lIIlIIIlI[11], lIIlIIIlI[4], C0008i.bq));
                    "".length();
                    iArr4 = new int[lIIlIIIlI[0]];
                    iArr4[lIIlIIIlI[1]] = lIIlIIIlI[38];
                    if (llllIIlIIII(Bank.contains(iArr4) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIIlIIIlI[38], lIIlIIIlI[39], lIIlIIIlI[35]));
                    "".length();
                    iArr5 = new int[lIIlIIIlI[0]];
                    iArr5[lIIlIIIlI[1]] = lIIlIIIlI[6];
                    if (llllIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    bv.add(new C0003d(lIIlIIIlI[6], lIIlIIIlI[40], lIIlIIIlI[41]));
                    "".length();
                }
                bv.add(new C0003d(lIIlIIIlI[8], lIIlIIIlI[12], lIIlIIIlI[35]));
                "".length();
                if (llllIIlIIlI(Bank.contains(item2 -> {
                    return item2.getName().toLowerCase().contains(lIIlIIIIl[lIIlIIIlI[39]]);
                }) ? 1 : 0)) {
                }
                iArr3 = new int[lIIlIIIlI[0]];
                iArr3[lIIlIIIlI[1]] = lIIlIIIlI[11];
                if (llllIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIlIIIlI[11], lIIlIIIlI[4], C0008i.bq));
                "".length();
                iArr4 = new int[lIIlIIIlI[0]];
                iArr4[lIIlIIIlI[1]] = lIIlIIIlI[38];
                if (llllIIlIIII(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIlIIIlI[38], lIIlIIIlI[39], lIIlIIIlI[35]));
                "".length();
                iArr5 = new int[lIIlIIIlI[0]];
                iArr5[lIIlIIIlI[1]] = lIIlIIIlI[6];
                if (llllIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIlIIIlI[6], lIIlIIIlI[40], lIIlIIIlI[41]));
                "".length();
            }
            bv.add(new C0003d(lIIlIIIlI[10], lIIlIIIlI[12], lIIlIIIlI[35]));
            "".length();
            iArr2 = new int[lIIlIIIlI[0]];
            iArr2[lIIlIIIlI[1]] = lIIlIIIlI[8];
            if (llllIIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlIIIlI[8], lIIlIIIlI[12], lIIlIIIlI[35]));
            "".length();
            if (llllIIlIIlI(Bank.contains(item22 -> {
                return item22.getName().toLowerCase().contains(lIIlIIIIl[lIIlIIIlI[39]]);
            }) ? 1 : 0)) {
            }
            iArr3 = new int[lIIlIIIlI[0]];
            iArr3[lIIlIIIlI[1]] = lIIlIIIlI[11];
            if (llllIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlIIIlI[11], lIIlIIIlI[4], C0008i.bq));
            "".length();
            iArr4 = new int[lIIlIIIlI[0]];
            iArr4[lIIlIIIlI[1]] = lIIlIIIlI[38];
            if (llllIIlIIII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlIIIlI[38], lIIlIIIlI[39], lIIlIIIlI[35]));
            "".length();
            iArr5 = new int[lIIlIIIlI[0]];
            iArr5[lIIlIIIlI[1]] = lIIlIIIlI[6];
            if (llllIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlIIIlI[6], lIIlIIIlI[40], lIIlIIIlI[41]));
            "".length();
        }
        bv.add(new C0003d(lIIlIIIlI[7], lIIlIIIlI[12], lIIlIIIlI[35]));
        "".length();
        iArr = new int[lIIlIIIlI[0]];
        iArr[lIIlIIIlI[1]] = lIIlIIIlI[10];
        if (llllIIlIIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIlI[10], lIIlIIIlI[12], lIIlIIIlI[35]));
        "".length();
        iArr2 = new int[lIIlIIIlI[0]];
        iArr2[lIIlIIIlI[1]] = lIIlIIIlI[8];
        if (llllIIlIIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIlI[8], lIIlIIIlI[12], lIIlIIIlI[35]));
        "".length();
        if (llllIIlIIlI(Bank.contains(item222 -> {
            return item222.getName().toLowerCase().contains(lIIlIIIIl[lIIlIIIlI[39]]);
        }) ? 1 : 0)) {
        }
        iArr3 = new int[lIIlIIIlI[0]];
        iArr3[lIIlIIIlI[1]] = lIIlIIIlI[11];
        if (llllIIlIIII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIlI[11], lIIlIIIlI[4], C0008i.bq));
        "".length();
        iArr4 = new int[lIIlIIIlI[0]];
        iArr4[lIIlIIIlI[1]] = lIIlIIIlI[38];
        if (llllIIlIIII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIlI[38], lIIlIIIlI[39], lIIlIIIlI[35]));
        "".length();
        iArr5 = new int[lIIlIIIlI[0]];
        iArr5[lIIlIIIlI[1]] = lIIlIIIlI[6];
        if (llllIIlIIII(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIIIlI[6], lIIlIIIlI[40], lIIlIIIlI[41]));
        "".length();
    }

    private static void llllIIIllIl() {
        lIIlIIIIl = new String[lIIlIIIlI[54]];
        lIIlIIIIl[lIIlIIIlI[1]] = llllIIIlIlI("hjYYUMQ8WaMWsehiNXeQXIO+bbfo+D6JVGlYoE9NMqlJ+Y+lRwfgE8A4ougXa+BR", "MZarU");
        lIIlIIIIl[lIIlIIIlI[0]] = llllIIIlIll("c8nzQbvQBFF2nOdqh2HZ3A==", "buLPc");
        lIIlIIIIl[lIIlIIIlI[3]] = llllIIIlIlI("31QmZfadl5Q9lXnTyZsXcGAx+eAN331s", "abGRq");
        lIIlIIIIl[lIIlIIIlI[9]] = llllIIIlIll("YI/GUrkSJFL27dOk/dauaToZXrTPA+mCT5TVHtz+gKQi4QpPV//1/qTqThCPk/RBg+SoTpXwbwE=", "RlHtB");
        lIIlIIIIl[lIIlIIIlI[4]] = llllIIIlIlI("7OJSffH8bUI=", "GGzhj");
        lIIlIIIIl[lIIlIIIlI[5]] = llllIIIlIll("7NdYqRjvmRw=", "hXuuS");
        lIIlIIIIl[lIIlIIIlI[15]] = llllIIIllII("Kj4oIT0=", "yVISV");
        lIIlIIIIl[lIIlIIIlI[16]] = llllIIIlIlI("YWeiVyLYues=", "KortK");
        lIIlIIIIl[lIIlIIIlI[17]] = llllIIIlIll("jd0AB7nyiJ8=", "nmtdZ");
        lIIlIIIIl[lIIlIIIlI[23]] = llllIIIlIlI("WIeY3viyErtrGBt6RqxQElUyz9Xz6O8CVCfX29XyIsPtGPZN7GLgYtG/mNpaYsmv", "yuitn");
        lIIlIIIIl[lIIlIIIlI[12]] = llllIIIlIlI("uBsNkhqNRUCGIzwrpivVytpAcw87etIu", "LIdUO");
        lIIlIIIIl[lIIlIIIlI[24]] = llllIIIlIll("EX/iTcCUMSU=", "nlazU");
        lIIlIIIIl[lIIlIIIlI[25]] = llllIIIlIll("5VnNmaRkzKcz2nd/T4V9Gg==", "vBZKF");
        lIIlIIIIl[lIIlIIIlI[28]] = llllIIIlIll("TqC+658UUyrVwHHkPFaZIgMsuicqHZslWY7szcX6uXmEwQW8NXuAQQ==", "pTJwP");
        lIIlIIIIl[lIIlIIIlI[31]] = llllIIIllII("DSsjcSUsaiI0IjdqOjdxICsmJT0mZnUkPy8lNjpxET8yNjQnagE0IzErPD8=", "CJUQQ");
        lIIlIIIIl[lIIlIIIlI[34]] = llllIIIlIll("+166viA5irTRsESw5hV/ISjOdfQFXiQXTKEy/kGGyBLs5C1y64qgpku5E2P9e6zGmTe7dbG3q6hBw8ludatgGQ==", "IQrkN");
        lIIlIIIIl[lIIlIIIlI[43]] = llllIIIlIlI("XW5WYGbDSXA=", "kHmkO");
        lIIlIIIIl[lIIlIIIlI[44]] = llllIIIlIlI("g9mGoShtMUc=", "HhEPp");
        lIIlIIIIl[lIIlIIIlI[45]] = llllIIIlIll("qxBD8WuCuF21Txpr1ubXtZJHHUb+/Gqn", "mFLus");
        lIIlIIIIl[lIIlIIIlI[46]] = llllIIIllII("ID0ULTQWaCcvIwApGiQ=", "rHsJQ");
        lIIlIIIIl[lIIlIIIlI[39]] = llllIIIllII("JiE7Jng7LnU2PTUkISl4fA==", "THUAX");
        lIIlIIIIl[lIIlIIIlI[47]] = llllIIIllII("PBsaJQsN", "hrjQd");
        lIIlIIIIl[lIIlIIIlI[48]] = llllIIIlIll("xEnaGTX5E8Y=", "dCSMS");
        lIIlIIIIl[lIIlIIIlI[49]] = llllIIIlIlI("tuclxGE/htsOL+P72rFdF6hHfNLa+9kR", "vkHQP");
        lIIlIIIIl[lIIlIIIlI[14]] = llllIIIlIll("3XSXe27rZ3n1/lt78h6fww==", "tODkM");
        lIIlIIIIl[lIIlIIIlI[50]] = llllIIIlIll("9xGfz++4Bwg=", "RbQiI");
        lIIlIIIIl[lIIlIIIlI[53]] = llllIIIllII("", "BrlFs");
    }

    private static boolean llllIIlIlIl(int i) {
        return i < 0;
    }

    private static void llllIIIlllI() {
        lIIlIIIlI = new int[55];
        lIIlIIIlI[0] = " ".length();
        lIIlIIIlI[1] = (252 ^ 184) & ((4 ^ 64) ^ (-1));
        lIIlIIIlI[2] = (-1143) & 6142;
        lIIlIIIlI[3] = "  ".length();
        lIIlIIIlI[4] = (((176 + 109) - 136) + 39) ^ (((36 + 129) - (-19)) + 0);
        lIIlIIIlI[5] = 86 ^ 83;
        lIIlIIIlI[6] = (-((-15491) & 31907)) & (-145) & 24567;
        lIIlIIIlI[7] = (-((-18269) & 26622)) & (-5) & 16367;
        lIIlIIIlI[8] = (-((-2553) & 27133)) & (-177) & 32765;
        lIIlIIIlI[9] = "   ".length();
        lIIlIIIlI[10] = (-152) & 8159;
        lIIlIIIlI[11] = (-((-4357) & 22279)) & (-137) & 30683;
        lIIlIIIlI[12] = 103 ^ 109;
        lIIlIIIlI[13] = 63 ^ 13;
        lIIlIIIlI[14] = 40 ^ 48;
        lIIlIIIlI[15] = 62 ^ 56;
        lIIlIIIlI[16] = 18 ^ 21;
        lIIlIIIlI[17] = 6 ^ 14;
        lIIlIIIlI[18] = ((5 + 212) - 148) + 170;
        lIIlIIIlI[19] = (-12564) & 15679;
        lIIlIIIlI[20] = (-((-17049) & 21243)) & (-8833) & 16382;
        lIIlIIIlI[21] = (-16865) & 19941;
        lIIlIIIlI[22] = (-((-11945) & 32765)) & (-2177) & 32767;
        lIIlIIIlI[23] = (((113 + 100) - 97) + 49) ^ (((94 + 131) - 135) + 82);
        lIIlIIIlI[24] = 76 ^ 71;
        lIIlIIIlI[25] = (71 ^ 112) ^ (185 ^ 130);
        lIIlIIIlI[26] = (-((-6441) & 15213)) & (-4499) & 16383;
        lIIlIIIlI[27] = (-((-3097) & 28575)) & (-9) & 28671;
        lIIlIIIlI[28] = (169 ^ 138) ^ (58 ^ 20);
        lIIlIIIlI[29] = (-18830) & 20399;
        lIIlIIIlI[30] = (-((-1297) & 13748)) & (-16641) & 32767;
        lIIlIIIlI[31] = (52 ^ 122) ^ (60 ^ 124);
        lIIlIIIlI[32] = (-26833) & 28662;
        lIIlIIIlI[33] = (-((-19525) & 31870)) & (-16897) & 32767;
        lIIlIIIlI[34] = 32 ^ 47;
        lIIlIIIlI[35] = (-((-4701) & 24159)) & (-8194) & 28671;
        lIIlIIIlI[36] = (-20756) & 32735;
        lIIlIIIlI[37] = (-4689) & 29688;
        lIIlIIIlI[38] = (-(142 ^ 155)) & (-19043) & 19447;
        lIIlIIIlI[39] = 5 ^ 17;
        lIIlIIIlI[40] = 83 ^ 123;
        lIIlIIIlI[41] = (-19546) & 20445;
        lIIlIIIlI[42] = (44 ^ 34) ^ (22 ^ 124);
        lIIlIIIlI[43] = 52 ^ 36;
        lIIlIIIlI[44] = 63 ^ 46;
        lIIlIIIlI[45] = (((102 + 90) - 132) + 84) ^ (((100 + 94) - 83) + 19);
        lIIlIIIlI[46] = (91 ^ 16) ^ (234 ^ 178);
        lIIlIIIlI[47] = (1 ^ 95) ^ (22 ^ 93);
        lIIlIIIlI[48] = (108 ^ 9) ^ (25 ^ 106);
        lIIlIIIlI[49] = 34 ^ 53;
        lIIlIIIlI[50] = (((138 + 70) - 129) + 91) ^ (((77 + 38) - 87) + 151);
        lIIlIIIlI[51] = (-((-17447) & 31799)) & (-1123) & 916863;
        lIIlIIIlI[52] = (-((-138) & 28591)) & (-83) & 16740215;
        lIIlIIIlI[53] = 153 ^ 131;
        lIIlIIIlI[54] = (((51 + 8) - 18) + 91) ^ (((149 + 144) - 134) + 0);
    }

    private static boolean llllIIlIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        Widget[] children = Widgets.get(lIIlIIIlI[18], lIIlIIIlI[15]).getChildren();
        return (llllIIlIIII(((List) Arrays.stream(children).filter(widget -> {
            if (llllIIlIIII(widget.getText().contains(lIIlIIIIl[lIIlIIIlI[46]]) ? 1 : 0) && llllIIllIII(widget.getTextColor(), cb)) {
                ?? r0 = lIIlIIIlI[0];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIIlI[1];
        }).collect(Collectors.toList())).isEmpty() ? 1 : 0) && llllIIlIIII(((List) Arrays.stream(children).filter(widget2 -> {
            if (llllIIlIIII(widget2.getText().contains(lIIlIIIIl[lIIlIIIlI[45]]) ? 1 : 0) && llllIIllIII(widget2.getTextColor(), cb)) {
                ?? r0 = lIIlIIIlI[0];
                "".length();
                return "   ".length() == " ".length() ? ((55 ^ 115) ^ (105 ^ 3)) & (((117 ^ 56) ^ (67 ^ 32)) ^ (-" ".length())) : r0;
            }
            return lIIlIIIlI[1];
        }).collect(Collectors.toList())).isEmpty() ? 1 : 0) && llllIIlIIII(((List) Arrays.stream(children).filter(widget3 -> {
            if (llllIIlIIII(widget3.getText().contains(lIIlIIIIl[lIIlIIIlI[44]]) ? 1 : 0) && llllIIllIII(widget3.getTextColor(), cb)) {
                ?? r0 = lIIlIIIlI[0];
                "".length();
                return "  ".length() <= 0 ? ((245 ^ 166) ^ (51 ^ 72)) & (((108 ^ 104) ^ (129 ^ 173)) ^ (-" ".length())) : r0;
            }
            return lIIlIIIlI[1];
        }).collect(Collectors.toList())).isEmpty() ? 1 : 0) && llllIIlIIII(((List) Arrays.stream(children).filter(widget4 -> {
            if (llllIIlIIII(widget4.getText().contains(lIIlIIIIl[lIIlIIIlI[43]]) ? 1 : 0) && llllIIllIII(widget4.getTextColor(), cb)) {
                ?? r0 = lIIlIIIlI[0];
                "".length();
                return " ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIIlI[1];
        }).collect(Collectors.toList())).isEmpty() ? 1 : 0)) ? lIIlIIIlI[0] : lIIlIIIlI[1];
    }
}
