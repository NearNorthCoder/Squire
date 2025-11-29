package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
import net.unethicalite.api.widgets.Dialog;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.G  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/G.class */
public class G implements M {
    public static /* synthetic */ String[] bW;
    private static /* synthetic */ int[] lIIlIIIIIIIlI;
    public static final /* synthetic */ WorldPoint hq;
    public static final /* synthetic */ WorldPoint hp;
    private static /* synthetic */ String[] lIIlIIIIIIIIl;
    static /* synthetic */ int co;
    public static /* synthetic */ boolean by;
    public static /* synthetic */ List<C0003d> bA;
    public static final /* synthetic */ WorldPoint ho;
    static /* synthetic */ int bY;
    static /* synthetic */ boolean cp;

    static {
        lIlIIllIllllIII();
        lIlIIllIlllIlll();
        ho = new WorldPoint(lIIlIIIIIIIlI[45], lIIlIIIIIIIlI[46], lIIlIIIIIIIlI[1]);
        hp = new WorldPoint(lIIlIIIIIIIlI[47], lIIlIIIIIIIlI[48], lIIlIIIIIIIlI[0]);
        hq = new WorldPoint(lIIlIIIIIIIlI[49], lIIlIIIIIIIlI[50], lIIlIIIIIIIlI[0]);
        String[] strArr = new String[lIIlIIIIIIIlI[16]];
        strArr[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[51]];
        strArr[lIIlIIIIIIIlI[1]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[52]];
        strArr[lIIlIIIIIIIlI[3]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[53]];
        strArr[lIIlIIIIIIIlI[6]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[54]];
        strArr[lIIlIIIIIIIlI[7]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[55]];
        strArr[lIIlIIIIIIIlI[9]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[56]];
        strArr[lIIlIIIIIIIlI[13]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[57]];
        strArr[lIIlIIIIIIIlI[15]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[58]];
        bW = strArr;
        bA = new ArrayList();
        bY = lIIlIIIIIIIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIlIIIIIIIlI[1]];
        iArr[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
        if (lIlIIllIlllllII(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIlIIIIIIIlI[1]];
            iArr2[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[11];
            if (lIlIIllIlllllII(Inventory.getCount(iArr2))) {
                ?? r0 = lIIlIIIIIIIlI[1];
                "".length();
                return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIIlIIIIIIIlI[0];
    }

    private static boolean lIlIIlllIIIIIlI(int i2, int i3) {
        return i2 >= i3;
    }

    private static String lIlIIllIlllIllI(String llllllllllllllIlllllllllIIIIIIII, String llllllllllllllIllllllllIllllllll) {
        try {
            SecretKeySpec llllllllllllllIlllllllllIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllllllIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIIIIIIIlI[3], llllllllllllllIlllllllllIIIIIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllllIIIIIIIl) {
            llllllllllllllIlllllllllIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlllIIIIIIl(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIlIIllIlllllll(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIlIIIIIIIlI[1];
    }

    private static String lIlIIllIlllIlII(String llllllllllllllIlllllllllIIIlIlIl, String llllllllllllllIlllllllllIIIlIlII) {
        String llllllllllllllIlllllllllIIIlIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllllllIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllllllIIIlIIll = new StringBuilder();
        char[] charArray = llllllllllllllIlllllllllIIIlIlII.toCharArray();
        int llllllllllllllIlllllllllIIIlIIIl = lIIlIIIIIIIlI[0];
        char[] charArray2 = llllllllllllllIlllllllllIIIlIlIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIlIIIIIIIlI[0];
        while (lIlIIllIllllIlI(i2, length)) {
            char llllllllllllllIlllllllllIIIlIllI = charArray2[i2];
            llllllllllllllIlllllllllIIIlIIll.append((char) (llllllllllllllIlllllllllIIIlIllI ^ charArray[llllllllllllllIlllllllllIIIlIIIl % charArray.length]));
            "".length();
            llllllllllllllIlllllllllIIIlIIIl++;
            i2++;
            "".length();
            if ((((((31 + 1) - (-157)) + 29) ^ (((113 + 142) - 137) + 29)) & (((66 ^ 35) ^ (142 ^ 166)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllllllllIIIlIIll);
    }

    private static boolean lIlIIllIllllIll(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIllIllllIlI(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
        if (lIlIIllIlllllII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v308, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cp() {
        if (lIlIIllIllllIIl(by ? 1 : 0)) {
            AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[0]];
            C0001b.a(bA);
            if (lIlIIllIllllIlI(bA.size(), lIIlIIIIIIIlI[1])) {
                System.out.println(lIIlIIIIIIIIl[lIIlIIIIIIIlI[1]]);
                by = lIIlIIIIIIIlI[0];
            }
        }
        if (lIlIIllIllllIll(by ? 1 : 0)) {
            if (lIlIIllIllllIIl(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIllIllllIlI(Movement.getRunEnergy(), lIIlIIIIIIIlI[2]) && lIlIIllIllllIll(Dialog.isOpen() ? 1 : 0)) {
                Inventory.getFirst(C0005f.ba).interact(lIIlIIIIIIIIl[lIIlIIIIIIIlI[3]]);
                Time.sleepTicks(lIIlIIIIIIIlI[1]);
                "".length();
            }
            if (lIlIIllIllllIIl(S() ? 1 : 0)) {
                int[] iArr = new int[lIIlIIIIIIIlI[1]];
                iArr[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[4];
            }
            if (lIlIIllIllllIlI(C0004e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIllIlllllIl(nearest) && lIlIIllIllllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[6]];
                    C0000a.a(nearest);
                }
                if (lIlIIllIlllllIl(nearest) && lIlIIllIllllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIllIllllIll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[7]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIIIIIlI[8]);
                        "".length();
                    }
                    if (lIlIIllIllllIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[9]];
                        if (lIlIIllIlllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIIIIIlI[7]);
                            "".length();
                        }
                        if (lIlIIllIlllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIIIIIIIlI[3]);
                            "".length();
                        }
                        int[] iArr2 = new int[lIIlIIIIIIIlI[6]];
                        iArr2[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
                        iArr2[lIIlIIIIIIIlI[1]] = lIIlIIIIIIIlI[11];
                        iArr2[lIIlIIIIIIIlI[3]] = lIIlIIIIIIIlI[12];
                        if (lIlIIllIllllIll(C0004e.b(iArr2) ? 1 : 0)) {
                            W();
                            System.out.println(lIIlIIIIIIIIl[lIIlIIIIIIIlI[13]]);
                            by = lIIlIIIIIIIlI[1];
                            return;
                        }
                        int[] iArr3 = new int[lIIlIIIIIIIlI[3]];
                        iArr3[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
                        iArr3[lIIlIIIIIIIlI[1]] = lIIlIIIIIIIlI[11];
                        if (lIlIIllIllllIIl(C0004e.b(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIlIIIIIIIlI[3]];
                            iArr4[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
                            iArr4[lIIlIIIIIIIlI[1]] = lIIlIIIIIIIlI[11];
                            C0000a.a(iArr4, lIIlIIIIIIIlI[14]);
                        }
                        if (lIlIIllIllllIIl(Bank.contains(C0005f.aW) ? 1 : 0)) {
                            Bank.withdraw(lIIlIIIIIIIlI[12], lIIlIIIIIIIlI[1], Bank.WithdrawMode.DEFAULT);
                        }
                        if (lIlIIllIllllIIl(Bank.contains(C0005f.ba) ? 1 : 0)) {
                            C0000a.b(C0005f.ba, lIIlIIIIIIIlI[1]);
                        }
                    }
                }
            }
            if (lIlIIllIllllIIl(S() ? 1 : 0) && lIlIIllIllllIlI(C0004e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[1])) {
                if (lIlIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(ho), lIIlIIIIIIIlI[7])) {
                    if (lIlIIllIllllIIl(Bank.isOpen() ? 1 : 0)) {
                        Bank.close();
                        Time.sleepTicks(lIIlIIIIIIIlI[3]);
                        "".length();
                    }
                    if (lIlIIllIllllIll(Bank.isOpen() ? 1 : 0) && lIlIIllIllllIIl(Inventory.contains(C0005f.aW) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.aW).interact(lIIlIIIIIIIIl[lIIlIIIIIIIlI[15]]);
                        Time.sleepTicks(lIIlIIIIIIIlI[1]);
                        "".length();
                    }
                    if (lIlIIllIllllIlI(bY, lIIlIIIIIIIlI[1])) {
                        C0004e.w();
                        bY += lIIlIIIIIIIlI[1];
                    }
                    AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[16]];
                    Movement.walkTo(ho);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIIlI[6]);
                    "".length();
                }
                if (lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ho), lIIlIIIIIIIlI[7])) {
                    AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[17]];
                    TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                        if (lIlIIllIllllIIl(tileObject.getName().equalsIgnoreCase(lIIlIIIIIIIIl[lIIlIIIIIIIlI[44]]) ? 1 : 0) && lIlIIllIlllllll(tileObject.getWorldLocation().distanceTo(ho), lIIlIIIIIIIlI[9])) {
                            ?? r0 = lIIlIIIIIIIlI[1];
                            "".length();
                            return ((58 ^ 42) ^ (30 ^ 10)) < (-" ".length()) ? ((147 ^ 174) ^ (100 ^ 19)) & (((((161 + 93) - 238) + 176) ^ (((128 + 16) - 28) + 22)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIIIIIIIlI[0];
                    });
                    if (lIlIIllIlllllIl(nearest2)) {
                        String[] strArr = new String[lIIlIIIIIIIlI[1]];
                        strArr[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[14]];
                        if (lIlIIllIllllIIl(nearest2.hasAction(strArr) ? 1 : 0)) {
                            nearest2.interact(lIIlIIIIIIIIl[lIIlIIIIIIIlI[18]]);
                            Time.sleepTicks(lIIlIIIIIIIlI[6]);
                            "".length();
                        }
                    }
                    C0006g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[19]], bW);
                }
            }
            if (lIlIIlllIIIIIII(C0004e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[1])) {
                co = lIIlIIIIIIIlI[0];
                if (lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(ho), lIIlIIIIIIIlI[7])) {
                    AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[20]];
                    C0006g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[21]], bW);
                }
                if (lIlIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(hp), lIIlIIIIIIIlI[6])) {
                    String[] strArr2 = new String[lIIlIIIIIIIlI[1]];
                    strArr2[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[22]];
                    if (lIlIIllIllllIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[23]];
                        Movement.walkTo(hp);
                        "".length();
                        Time.sleepTicks(lIIlIIIIIIIlI[1]);
                        "".length();
                    }
                }
                if (lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(hp), lIIlIIIIIIIlI[6])) {
                    AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[24]];
                    C0006g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[25]], bW);
                }
            }
            if (lIlIIlllIIIIIII(C0004e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[3]) && (!lIlIIllIllllIll(Dialog.isOpen() ? 1 : 0) || lIlIIllIllllIIl(C0006g.L() ? 1 : 0))) {
                C0006g.a(bW);
                Time.sleepTicks(lIIlIIIIIIIlI[1]);
                "".length();
            }
            if (!lIlIIlllIIIIIIl(C0004e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[6]) || lIlIIlllIIIIIII(C0004e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[7])) {
                try {
                    if (!lIlIIllIllllIll(Dialog.isOpen() ? 1 : 0) || lIlIIllIllllIIl(C0006g.L() ? 1 : 0)) {
                        C0006g.a(bW);
                        Time.sleepTicks(lIIlIIIIIIIlI[1]);
                        "".length();
                    }
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                } catch (Exception e) {
                }
                if (lIlIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(hq), lIIlIIIIIIIlI[6]) && lIlIIllIllllIll(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[26]];
                    Movement.walkTo(hq);
                    "".length();
                    Time.sleepTicks(lIIlIIIIIIIlI[1]);
                    "".length();
                }
                if (lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(hq), lIIlIIIIIIIlI[6])) {
                    AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[27]];
                    C0006g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[28]], bW);
                }
            }
            if (lIlIIlllIIIIIII(C0004e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[9])) {
                String[] strArr3 = new String[lIIlIIIIIIIlI[1]];
                strArr3[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIIl[lIIlIIIIIIIlI[29]];
                if (lIlIIllIllllIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                    if (lIlIIllIllllllI(Players.getLocal().getWorldLocation().distanceTo(hp), lIIlIIIIIIIlI[6])) {
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[30]];
                        if (lIlIIllIllllIIl(Equipment.contains(C0005f.aW) ? 1 : 0) && lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(hq), lIIlIIIIIIIlI[14])) {
                            Equipment.getFirst(C0005f.aW).interact(lIIlIIIIIIIIl[lIIlIIIIIIIlI[31]]);
                            Time.sleepTicks(lIIlIIIIIIIlI[9]);
                            "".length();
                        }
                        Movement.walkTo(hp);
                        "".length();
                        Time.sleepTicks(lIIlIIIIIIIlI[1]);
                        "".length();
                    }
                    if (lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(hp), lIIlIIIIIIIlI[6])) {
                        AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[32]];
                        C0006g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[33]], bW);
                    }
                }
            }
            if (lIlIIlllIIIIIII(C0004e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[9]) && lIlIIllIlllllll(Players.getLocal().getWorldLocation().distanceTo(hp), lIIlIIIIIIIlI[6])) {
                AccBuilderRat.c = lIIlIIIIIIIIl[lIIlIIIIIIIlI[34]];
                if (lIlIIllIllllIlI(co, lIIlIIIIIIIlI[1])) {
                    P.lp += lIIlIIIIIIIlI[1];
                    P.d(AccBuilderRat.m);
                    co += lIIlIIIIIIIlI[1];
                    P.lp = lIIlIIIIIIIlI[0];
                    cp = lIIlIIIIIIIlI[0];
                }
                C0006g.a(lIIlIIIIIIIIl[lIIlIIIIIIIlI[35]], bW);
            }
            C0006g.a(bW);
        }
    }

    private static boolean lIlIIllIllllIIl(int i2) {
        return i2 != 0;
    }

    private static void W() {
        int[] iArr = new int[lIIlIIIIIIIlI[1]];
        iArr[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
        if (lIlIIllIllllIll(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIIlI[10], lIIlIIIIIIIlI[14], lIIlIIIIIIIlI[36]));
            "".length();
        }
        int[] iArr2 = new int[lIIlIIIIIIIlI[1]];
        iArr2[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[11];
        if (lIlIIllIllllIll(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIIlI[11], lIIlIIIIIIIlI[14], lIIlIIIIIIIlI[36]));
            "".length();
        }
        int[] iArr3 = new int[lIIlIIIIIIIlI[1]];
        iArr3[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[12];
        if (lIlIIllIllllIll(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIIlI[12], lIIlIIIIIIIlI[1], lIIlIIIIIIIlI[37]));
            "".length();
        }
        if (lIlIIllIllllIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIIIIIIIIl[lIIlIIIIIIIlI[43]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIIlI[38], lIIlIIIIIIIlI[9], lIIlIIIIIIIlI[37]));
            "".length();
        }
        int[] iArr4 = new int[lIIlIIIIIIIlI[1]];
        iArr4[lIIlIIIIIIIlI[0]] = lIIlIIIIIIIlI[10];
        if (lIlIIllIllllIll(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIIlI[10], lIIlIIIIIIIlI[39], lIIlIIIIIIIlI[36]));
            "".length();
        }
        if (lIlIIllIllllIll(Bank.contains(C0005f.ba) ? 1 : 0)) {
            bA.add(new C0003d(lIIlIIIIIIIlI[40], lIIlIIIIIIIlI[9], C0007h.bv));
            "".length();
        }
    }

    private static boolean lIlIIlllIIIIIII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIllIllllllI(int i2, int i3) {
        return i2 > i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            cp();
            "".length();
            if (0 != 0) {
                return ((239 ^ 146) ^ (4 ^ 106)) & (((104 ^ 86) ^ (3 ^ 46)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIlIIIIIIIlI[41];
    }

    private static void lIlIIllIllllIII() {
        lIIlIIIIIIIlI = new int[59];
        lIIlIIIIIIIlI[0] = (255 ^ 163) & ((236 ^ 176) ^ (-1));
        lIIlIIIIIIIlI[1] = " ".length();
        lIIlIIIIIIIlI[2] = 45 ^ 31;
        lIIlIIIIIIIlI[3] = "  ".length();
        lIIlIIIIIIIlI[4] = (-1045) & 2039;
        lIIlIIIIIIIlI[5] = 81 ^ 110;
        lIIlIIIIIIIlI[6] = "   ".length();
        lIIlIIIIIIIlI[7] = 85 ^ 81;
        lIIlIIIIIIIlI[8] = (-((-4626) & 32373)) & (-21) & 32767;
        lIIlIIIIIIIlI[9] = 155 ^ 158;
        lIIlIIIIIIIlI[10] = (-177) & 8183;
        lIIlIIIIIIIlI[11] = (-16408) & 24415;
        lIIlIIIIIIIlI[12] = (-4098) & 16075;
        lIIlIIIIIIIlI[13] = (((112 + 48) - 55) + 26) ^ (((105 + 11) - (-7)) + 10);
        lIIlIIIIIIIlI[14] = 146 ^ 152;
        lIIlIIIIIIIlI[15] = 114 ^ 117;
        lIIlIIIIIIIlI[16] = (((80 + 113) - 75) + 67) ^ (((167 + 46) - 91) + 55);
        lIIlIIIIIIIlI[17] = 72 ^ 65;
        lIIlIIIIIIIlI[18] = 44 ^ 39;
        lIIlIIIIIIIlI[19] = 58 ^ 54;
        lIIlIIIIIIIlI[20] = (((52 + 145) - 145) + 94) ^ (((5 + 57) - (-58)) + 39);
        lIIlIIIIIIIlI[21] = 85 ^ 91;
        lIIlIIIIIIIlI[22] = (((134 + 36) - 87) + 99) ^ (((76 + 64) - 59) + 104);
        lIIlIIIIIIIlI[23] = (((68 + 8) - (-5)) + 58) ^ (((113 + 121) - 224) + 145);
        lIIlIIIIIIIlI[24] = (66 ^ 45) ^ (46 ^ 80);
        lIIlIIIIIIIlI[25] = (101 ^ 116) ^ "   ".length();
        lIIlIIIIIIIlI[26] = (138 ^ 166) ^ (35 ^ 28);
        lIIlIIIIIIIlI[27] = 56 ^ 44;
        lIIlIIIIIIIlI[28] = 23 ^ 2;
        lIIlIIIIIIIlI[29] = (88 ^ 61) ^ (221 ^ 174);
        lIIlIIIIIIIlI[30] = 89 ^ 78;
        lIIlIIIIIIIlI[31] = (((38 + 119) - 118) + 123) ^ (((77 + 0) - (-3)) + 106);
        lIIlIIIIIIIlI[32] = 8 ^ 17;
        lIIlIIIIIIIlI[33] = 184 ^ 162;
        lIIlIIIIIIIlI[34] = (((160 + 112) - 69) + 18) ^ (((193 + 99) - 181) + 87);
        lIIlIIIIIIIlI[35] = (173 ^ 163) ^ (190 ^ 172);
        lIIlIIIIIIIlI[36] = (-(187 ^ 168)) & (-20610) & 22527;
        lIIlIIIIIIIlI[37] = (-7234) & 32233;
        lIIlIIIIIIIlI[38] = (-((-9930) & 30411)) & (-1) & 32461;
        lIIlIIIIIIIlI[39] = (64 ^ 3) ^ (234 ^ 129);
        lIIlIIIIIIIlI[40] = (-3201) & 15825;
        lIIlIIIIIIIlI[41] = (77 ^ 58) ^ (101 ^ 118);
        lIIlIIIIIIIlI[42] = (71 ^ 92) ^ (179 ^ 181);
        lIIlIIIIIIIlI[43] = (35 ^ 127) ^ (19 ^ 81);
        lIIlIIIIIIIlI[44] = (224 ^ 197) ^ (23 ^ 45);
        lIIlIIIIIIIlI[45] = (-((-4303) & 21471)) & (-12325) & 32702;
        lIIlIIIIIIIlI[46] = (-16684) & 19903;
        lIIlIIIIIIIlI[47] = (-((-11281) & 32241)) & (-1) & 24061;
        lIIlIIIIIIIlI[48] = (-23054) & 32623;
        lIIlIIIIIIIlI[49] = (-((-3169) & 32107)) & (-513) & 32702;
        lIIlIIIIIIIlI[50] = (-24755) & 28155;
        lIIlIIIIIIIlI[51] = (176 ^ 143) ^ (120 ^ 103);
        lIIlIIIIIIIlI[52] = 98 ^ 67;
        lIIlIIIIIIIlI[53] = 165 ^ 135;
        lIIlIIIIIIIlI[54] = (102 ^ 8) ^ (20 ^ 89);
        lIIlIIIIIIIlI[55] = 47 ^ 11;
        lIIlIIIIIIIlI[56] = 75 ^ 110;
        lIIlIIIIIIIlI[57] = 149 ^ 179;
        lIIlIIIIIIIlI[58] = (((133 + 110) - 226) + 126) ^ (((70 + 73) - 85) + 110);
    }

    private static boolean lIlIIllIlllllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIllIlllllII(int i2) {
        return i2 > 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIlIIIIIIIIl[lIIlIIIIIIIlI[42]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlllIIIIIlI(C0004e.j(lIIlIIIIIIIlI[5]), lIIlIIIIIIIlI[13])) {
            ?? r0 = lIIlIIIIIIIlI[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIIIIIIIlI[0];
    }

    private static void lIlIIllIlllIlll() {
        lIIlIIIIIIIIl = new String[lIIlIIIIIIIlI[39]];
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[0]] = lIlIIllIlllIlII("FCUJCCgxcBkVIzsj", "VPpaF");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[1]] = lIlIIllIlllIlIl("4udTrBt9IghlgOJszn4tIfbuCsc0TQ9H2r5m9G0jgABQvj6HbmXI7M1aRUg6ZJRU", "VNdGI");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[3]] = lIlIIllIlllIllI("+nkOrmr2pLA=", "MfXjh");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[6]] = lIlIIllIlllIllI("QzekH9F/Pclszz4LZaQKT0koB5ELHFx1", "YSjSQ");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[7]] = lIlIIllIlllIllI("IvN49oJfkoFGDqB68TTX5Q==", "GWFoa");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[9]] = lIlIIllIlllIllI("aO9/q5MHT15bNIXwIzVF4QjFzDfodFY6", "dvnru");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[13]] = lIlIIllIlllIlIl("jEYZbARXnzrM2t9zvj9RFbS9LYjRQuInmDazQUEtsxU7MQKvJknrDDECyJVVQ95J059Tcldp2jE=", "rMmcm");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[15]] = lIlIIllIlllIlIl("OAW57h/X4e4=", "uWHTb");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[16]] = lIlIIllIlllIlII("BCsHKAsrPhgvC2o+HmEfPisDNQ==", "JJqAl");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[17]] = lIlIIllIlllIlII("PyUhEiseKihWIx4lIxkgAiE=", "wDOvG");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[14]] = lIlIIllIlllIllI("9FcKFjPKdhY=", "JGEGV");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[18]] = lIlIIllIlllIlII("ADYBHw==", "OFdqG");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[19]] = lIlIIllIlllIlII("EjcxD0weLSgLDz8t", "VBZjl");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[20]] = lIlIIllIlllIlIl("MHUgV9twK6LYEu1dFtlnsWZJ2ccwBZMw", "jSLTn");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[21]] = lIlIIllIlllIlIl("NEleI/VTbWHpqFyuRXPnRA==", "lTkZo");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[22]] = lIlIIllIlllIlII("KzsqcDMLPjEjKgs8", "jRXPG");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[23]] = lIlIIllIlllIllI("rFQPw9MxArOc1fRXXyvTvvgObRrfC4zF", "RhWvO");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[24]] = lIlIIllIlllIlIl("RGEjC+EA48fKPoR2qbp/Qg==", "zsDdd");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[25]] = lIlIIllIlllIlIl("j2/CBQMeLf0ELTUXG0g9dkjZ+ZcQUlcP", "HyUZU");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[26]] = lIlIIllIlllIlIl("JayRp3+EJICE9q8HPkFMfR8H4BUTcMYk", "GnLAx");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[27]] = lIlIIllIlllIlIl("l0KhGajJBPJtkmO7pUFVDA==", "KVavv");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[28]] = lIlIIllIlllIlIl("dqPDflj2sv8=", "fJPjJ");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[29]] = lIlIIllIlllIllI("7RcJ92SoFz6BqV6h3KS80Q==", "iZMUs");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[30]] = lIlIIllIlllIlIl("yUpoBqtGPv9m53KkmswPgJ1do5XP0i8y", "OnnSc");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[31]] = lIlIIllIlllIlIl("u8xWsw6Zlsj0d740GKUTUg==", "fmNci");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[32]] = lIlIIllIlllIlII("AygCNCYiJwtwKSMoGA==", "KIlPJ");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[33]] = lIlIIllIlllIlII("CjosDDwqLypEAi4sPQ01JDo=", "KHOdQ");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[34]] = lIlIIllIlllIllI("w9uC169VOWwkPhb3GrSgNg==", "NBsii");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[35]] = lIlIIllIlllIlIl("uQNhKHTACnIJR5Q3t4xc1jz+/Yo1hXnJ", "bGoCb");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[42]] = lIlIIllIlllIllI("l5fbNfhEL0tqlLIb/XqV8M0E+eOKBdFE", "aSRbo");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[43]] = lIlIIllIlllIlIl("sOAPiGw43ov7uJaXWOod04oALFU7xIkJ", "kcGkW");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[44]] = lIlIIllIlllIllI("thd7AseLNMI=", "vhYUQ");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[51]] = lIlIIllIlllIlII("HxYfF0IuGBxSAzkOSQMXMgQdAUIxGBtSDzJI", "Wwirb");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[52]] = lIlIIllIlllIlIl("PLr1RpFy8ozwHSvUfuy/PV7rNNNM6x59", "DbVbT");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[53]] = lIlIIllIlllIlIl("eJ+YoLxwK7QLyXoNI4QGV2ppOPuVajkM+Omd6044YvLPgNnaaQEBIw==", "oWGGH");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[54]] = lIlIIllIlllIllI("RmFbmKtqFZedARGwW/kLE8WuiQDxJy23", "RzcdC");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[55]] = lIlIIllIlllIllI("bWsesCQJ8YHKt6BGTorXGA==", "SoqjU");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[56]] = lIlIIllIlllIlII("Hk8xIHE1DSIrcSQNKTFxPw01IHEgATMtcTZINyQyPAkgIHExBzVlKDgdaQ==", "WhGEQ");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[57]] = lIlIIllIlllIllI("KoktKrafbNA=", "UoENy");
        lIIlIIIIIIIIl[lIIlIIIIIIIlI[58]] = lIlIIllIlllIlII("PSl4KRwfJzxm", "zFXHt");
    }

    private static String lIlIIllIlllIlIl(String llllllllllllllIlllllllllIIlIIlIl, String llllllllllllllIlllllllllIIlIIlII) {
        try {
            SecretKeySpec llllllllllllllIlllllllllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllllllIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIIIlI[16]), "DES");
            Cipher llllllllllllllIlllllllllIIlIIlll = Cipher.getInstance("DES");
            llllllllllllllIlllllllllIIlIIlll.init(lIIlIIIIIIIlI[3], llllllllllllllIlllllllllIIlIlIII);
            return new String(llllllllllllllIlllllllllIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllllllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllllllIIlIIllI) {
            llllllllllllllIlllllllllIIlIIllI.printStackTrace();
            return null;
        }
    }
}
