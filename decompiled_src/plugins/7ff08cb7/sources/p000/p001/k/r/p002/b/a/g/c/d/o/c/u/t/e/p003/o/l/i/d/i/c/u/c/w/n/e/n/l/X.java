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
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.X  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/X.class */
public class X implements ab {
    private static final /* synthetic */ WorldPoint lF;
    public static /* synthetic */ boolean bv;
    private static final /* synthetic */ WorldPoint lE;
    static /* synthetic */ int cI;
    public static final /* synthetic */ String[] lD;
    public static /* synthetic */ List<C0003d> bx;
    private static final /* synthetic */ WorldPoint lH;
    private static /* synthetic */ String[] lllIlllII;
    static /* synthetic */ boolean dl;
    static /* synthetic */ int dk;
    private static /* synthetic */ int[] lllIlllll;
    private static final /* synthetic */ WorldPoint lG;

    private static void llIIlIllIIIl() {
        lllIlllII = new String[lllIlllll[74]];
        lllIlllII[lllIlllll[0]] = llIIlIlIllIl("3P8Neg4r63uJdO07/a612Q==", "OuNWu");
        lllIlllII[lllIlllll[1]] = llIIlIlIllIl("/QqoArDVa4ESMUWJ8da55YlGHmoSuNhje/Q5GXCKpEX3/0mAH1Cb6DA1pK5fiR1O", "KfWxO");
        lllIlllII[lllIlllll[3]] = llIIlIlIlllI("Ph8GNgA=", "zmoXk");
        lllIlllII[lllIlllll[5]] = llIIlIlIllIl("YHgiC7eVbl0=", "NMzKw");
        lllIlllII[lllIlllll[7]] = llIIlIlIlllI("PCgjajIdaTcrKBk=", "rIUJF");
        lllIlllII[lllIlllll[8]] = llIIlIlIllll("rXa1K7sTzRlrIId3NYeMWZOwsFpC6fVw", "uAivg");
        lllIlllII[lllIlllll[14]] = llIIlIlIllll("N86fYrRpANlc6O0k6WMHbPS1Bz+wtoP79tKHPsq9NdqjDNKTgSqGWNglT71xi6VxfJLSeraULM8=", "NbxXc");
        lllIlllII[lllIlllll[20]] = llIIlIlIllIl("QFPJRehtmCuI/72574qXPg==", "BGDkd");
        lllIlllII[lllIlllll[18]] = llIIlIlIlllI("HTUVUB48dBAECyEg", "STcpj");
        lllIlllII[lllIlllll[21]] = llIIlIlIllll("SGUnGuMATTk25Fb0y0r01g==", "UyGRx");
        lllIlllII[lllIlllll[15]] = llIIlIlIlllI("DAYGLwo4RzMiHS8EGQ==", "JgrGo");
        lllIlllII[lllIlllll[19]] = llIIlIlIlllI("HQYiZzc8RzoiIDgLNSQmcwAhPg==", "SgTGC");
        lllIlllII[lllIlllll[22]] = llIIlIlIllll("LvXofRu2HxKMg/X1bB0MnA==", "IZXtZ");
        lllIlllII[lllIlllll[23]] = llIIlIlIllIl("duxHSAkopOs=", "OGMCW");
        lllIlllII[lllIlllll[24]] = llIIlIlIlllI("PBsgJQ==", "skEKE");
        lllIlllII[lllIlllll[25]] = llIIlIlIlllI("FTsONg==", "ZKkXq");
        lllIlllII[lllIlllll[26]] = llIIlIlIllll("Qn5B7KXzJpocDMCcdVv3JQ==", "CacEC");
        lllIlllII[lllIlllll[28]] = llIIlIlIlllI("Li4bPw==", "yKzMi");
        lllIlllII[lllIlllll[29]] = llIIlIlIlllI("LAcjUiwNRjYdPgQPOw==", "bfUrX");
        lllIlllII[lllIlllll[30]] = llIIlIlIllIl("1kQQiRDWBz+2+Bcf5hwdXw==", "nHRWY");
        lllIlllII[lllIlllll[31]] = llIIlIlIllIl("llaDoh+klWfNjArh4SOIaA==", "iqhsB");
        lllIlllII[lllIlllll[32]] = llIIlIlIllll("RiK3dG4ttUyNEjwvewRIwQ==", "AYiGN");
        lllIlllII[lllIlllll[33]] = llIIlIlIlllI("KisqJSoH", "iDLCC");
        lllIlllII[lllIlllll[34]] = llIIlIlIllll("uvKEIrTI/Iw=", "jbwui");
        lllIlllII[lllIlllll[35]] = llIIlIlIlllI("GDEHUB05cAIbHDo8", "VPqpi");
        lllIlllII[lllIlllll[36]] = llIIlIlIllll("tQS5+PgxbIlL8K6yrYd2iw==", "wRMpr");
        lllIlllII[lllIlllll[37]] = llIIlIlIllIl("7fRxqJnWdRw=", "MvOig");
        lllIlllII[lllIlllll[38]] = llIIlIlIllIl("YJhosZ6isRA=", "qoKPC");
        lllIlllII[lllIlllll[39]] = llIIlIlIllIl("ZqBqHtaCPtU=", "cQISK");
        lllIlllII[lllIlllll[40]] = llIIlIlIllIl("jBcWpZbTz0cmKwpobwYAHg==", "vUKro");
        lllIlllII[lllIlllll[41]] = llIIlIlIlllI("CgIhDSorDShJJS0FKQAo", "BcOiF");
        lllIlllII[lllIlllll[42]] = llIIlIlIllll("E5SwovZnHEw=", "dEmAG");
        lllIlllII[lllIlllll[43]] = llIIlIlIllll("teUUpFjvOCM=", "LInQm");
        lllIlllII[lllIlllll[44]] = llIIlIlIllll("YHdizbsKNvc=", "kNeLL");
        lllIlllII[lllIlllll[45]] = llIIlIlIllll("12seyFitrOLZMhHscDm50g==", "QHAlN");
        lllIlllII[lllIlllll[52]] = llIIlIlIllll("XSLmD/HcfUwIcoEYX6DhYSN/cs5S9djD", "UIUWz");
        lllIlllII[lllIlllll[53]] = llIIlIlIlllI("FgYsIVQLCWIxEQUDNi5UTA==", "doBFt");
        lllIlllII[lllIlllll[54]] = llIIlIlIlllI("LR9GVRBFGUoAKUISBQd5AxpKFD0UEQQBLBARRA==", "btjuY");
        lllIlllII[lllIlllll[55]] = llIIlIlIllll("6IIyOkkXdaSb8x4cRCkB5prFmTGk++n5li36FpOt2c8cpy7YNgstiw==", "UtJzM");
        lllIlllII[lllIlllll[56]] = llIIlIlIllll("gqf6M+wwAfuLQfKwH1vzZRdgkQWXxlDZ", "ZMHIa");
        lllIlllII[lllIlllll[57]] = llIIlIlIllIl("So7y5FhpOXs=", "EdIPV");
        lllIlllII[lllIlllll[58]] = llIIlIlIlllI("HE4aeDw6BhwxPjJJETcidQhXKSUwGgN5", "UiwXP");
        lllIlllII[lllIlllll[59]] = llIIlIlIllll("DDX2KVx9yny5G7v5P/WepTnc57oRo7A8", "nwnzo");
        lllIlllII[lllIlllll[60]] = llIIlIlIllll("BsPND7o6QV9SJNWZ0U+2EC0I0ENPzuUMxBoqd0EAQ5j0quyFZ4gDsw==", "msaGC");
        lllIlllII[lllIlllll[61]] = llIIlIlIllIl("+lJXZqenJUAU4sKxOYILqkyVYNsggXC1k5hxQ9ZJmKNRWeQ5l37YCpzC/oma18ES", "YVSsf");
        lllIlllII[lllIlllll[62]] = llIIlIlIllll("vinyyH9iYWqwZFslgA+v2wihFBDmfPj01CgvBremTGP04d1B983DXg==", "BLESb");
        lllIlllII[lllIlllll[63]] = llIIlIlIllll("UyuGORmnwfU=", "dAqVa");
        lllIlllII[lllIlllll[64]] = llIIlIlIllIl("MFuL+gA+TZKe9vSUs2Qa3cB+KNZVfXJXHZiT6XcTm5AJeBZ4R3k3kg==", "nQiBb");
        lllIlllII[lllIlllll[65]] = llIIlIlIllIl("UClGMK+cg+QZZcLxKoKL8g==", "mBEHb");
        lllIlllII[lllIlllll[66]] = llIIlIlIlllI("BiIzUigvI2Q7ayYoKAJ0", "NMDrK");
    }

    private static boolean llIIllIIIllI(int i) {
        return i != 0;
    }

    private static String llIIlIlIllIl(String llIIllIlIlIIl, String llIIllIlIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllIlIlIII.getBytes(StandardCharsets.UTF_8)), lllIlllll[18]), "DES");
            Cipher llIIllIlIlIll = Cipher.getInstance("DES");
            llIIllIlIlIll.init(lllIlllll[3], secretKeySpec);
            return new String(llIIllIlIlIll.doFinal(Base64.getDecoder().decode(llIIllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIllIlIlIlI) {
            llIIllIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIlIII(int i) {
        return i == 0;
    }

    private static String llIIlIlIllll(String llIIllIllIllI, String llIIllIllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIllIllIlll) {
            llIIllIllIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIlIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lllIlllll[1]];
        iArr[lllIlllll[0]] = lllIlllll[11];
        if (llIIllIIIllI(Inventory.contains(iArr) ? 1 : 0) && ((!llIIllIIlIII(Inventory.contains(C0005f.aY) ? 1 : 0) || llIIllIIIllI(Equipment.contains(C0005f.aY) ? 1 : 0)) && llIIllIIIllI(Inventory.contains(C0005f.bc) ? 1 : 0))) {
            int[] iArr2 = new int[lllIlllll[1]];
            iArr2[lllIlllll[0]] = lllIlllll[13];
            if (llIIllIIIllI(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lllIlllll[1]];
                iArr3[lllIlllll[0]] = lllIlllll[4];
                if (llIIllIIIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lllIlllll[1];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lllIlllll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIIllIlIIII(C0004e.j(lllIlllll[6]), lllIlllll[8])) {
            ?? r0 = lllIlllll[1];
            "".length();
            return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlllll[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v69, types: [boolean] */
    public static void dJ() {
        if (llIIllIIIllI(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllIlllII[lllIlllll[0]];
            C0001b.a(bx);
            if (llIIllIIIlll(bx.size(), lllIlllll[1])) {
                System.out.println(lllIlllII[lllIlllll[1]]);
                bv = lllIlllll[0];
            }
        }
        if (llIIllIIlIII(bv ? 1 : 0)) {
            if (llIIllIIIllI(Inventory.contains(C0005f.bc) ? 1 : 0) && llIIllIIIlll(Movement.getRunEnergy(), lllIlllll[2])) {
                Inventory.getFirst(C0005f.bc).interact(lllIlllII[lllIlllll[3]]);
                Time.sleepTicks(lllIlllll[1]);
                "".length();
            }
            if (llIIllIIlIIl(llIIllIIIlIl(C0004e.w(), 70.0d))) {
                int[] iArr = new int[lllIlllll[1]];
                iArr[lllIlllll[0]] = lllIlllll[4];
                if (llIIllIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIlllll[1]];
                    iArr2[lllIlllll[0]] = lllIlllll[4];
                    Inventory.getFirst(iArr2).interact(lllIlllII[lllIlllll[5]]);
                }
            }
            if (llIIllIIlIII(Movement.isRunEnabled() ? 1 : 0) && llIIllIIlIlI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIIllIIlIII(an() ? 1 : 0) && llIIllIIIlll(C0004e.j(lllIlllll[6]), lllIlllll[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIllIIlIll(nearest) && llIIllIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[7]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lllIlllll[3]);
                    "".length();
                }
                if (llIIllIIlIll(nearest) && llIIllIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[8]];
                    if (llIIllIIlIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIlllll[9]);
                        "".length();
                    }
                    if (llIIllIIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (llIIllIIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIlllll[7]);
                            "".length();
                        }
                        if (llIIllIIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIlllll[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lllIlllll[8]];
                        iArr3[lllIlllll[0]] = lllIlllll[10];
                        iArr3[lllIlllll[1]] = lllIlllll[11];
                        iArr3[lllIlllll[3]] = lllIlllll[12];
                        iArr3[lllIlllll[5]] = lllIlllll[13];
                        iArr3[lllIlllll[7]] = lllIlllll[4];
                        if (llIIllIIlIII(C0004e.d(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIlllII[lllIlllll[14]]);
                            bv = lllIlllll[1];
                            return;
                        }
                        Bank.withdraw(lllIlllll[11], lllIlllll[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlllll[1]);
                        "".length();
                        Bank.withdraw(lllIlllll[13], lllIlllll[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlllll[1]);
                        "".length();
                        Bank.withdraw(lllIlllll[10], lllIlllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIlllll[1]);
                        "".length();
                        C0000a.b(C0005f.bc, lllIlllll[1]);
                        C0000a.a(lllIlllll[4], lllIlllll[15]);
                        C0000a.b(C0005f.bm, lllIlllll[1]);
                    }
                }
            }
            if (llIIllIIIllI(an() ? 1 : 0) && llIIllIIIlll(C0004e.j(lllIlllll[6]), lllIlllll[1])) {
                new WorldArea(lllIlllll[16], lllIlllll[17], lllIlllll[18], lllIlllll[19], lllIlllll[0]);
                String[] strArr = new String[lllIlllll[1]];
                strArr[lllIlllll[0]] = lllIlllII[lllIlllll[20]];
                NPC nearest2 = NPCs.getNearest(strArr);
                if (llIIllIIllII(nearest2) && llIIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(lE), lllIlllll[5]) && llIIllIIlIII(AccBuilderGWD.d ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[18]];
                    if (llIIllIIIlll(cI, lllIlllll[1])) {
                        C0004e.x();
                        cI += lllIlllll[1];
                    }
                    Movement.walkTo(lE);
                    "".length();
                    Time.sleepTicks(lllIlllll[1]);
                    "".length();
                }
                if (llIIllIIlIll(nearest2)) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[21]];
                    C0006g.a(lllIlllII[lllIlllll[15]], lD, lllIlllll[1]);
                }
            }
            if (llIIllIIlllI(C0004e.j(lllIlllll[6]), lllIlllll[1])) {
                if (llIIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(lF), lllIlllll[14])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[19]];
                    Movement.walkTo(lF);
                    "".length();
                    Time.sleepTicks(lllIlllll[1]);
                    "".length();
                }
                if (llIIllIIllll(Players.getLocal().getWorldLocation().distanceTo(lF), lllIlllll[14])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[22]];
                    String[] strArr2 = new String[lllIlllll[1]];
                    strArr2[lllIlllll[0]] = lllIlllII[lllIlllll[23]];
                    TileObject nearest3 = TileObjects.getNearest(strArr2);
                    if (llIIllIIlIll(nearest3)) {
                        String[] strArr3 = new String[lllIlllll[1]];
                        strArr3[lllIlllll[0]] = lllIlllII[lllIlllll[24]];
                        if (llIIllIIIllI(nearest3.hasAction(strArr3) ? 1 : 0)) {
                            nearest3.interact(lllIlllII[lllIlllll[25]]);
                            Time.sleepTicks(lllIlllll[8]);
                            "".length();
                        }
                    }
                    C0006g.a(lllIlllII[lllIlllll[26]], lD);
                }
            }
            if (llIIllIIlllI(C0004e.j(lllIlllll[6]), lllIlllll[3])) {
                if (llIIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(lG), lllIlllll[3])) {
                    int[] iArr4 = new int[lllIlllll[1]];
                    iArr4[lllIlllll[0]] = lllIlllll[27];
                    if (llIIllIIIllI(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lllIlllll[1]];
                        iArr5[lllIlllll[0]] = lllIlllll[27];
                        Inventory.getFirst(iArr5).interact(lllIlllII[lllIlllll[28]]);
                        Time.sleepTicks(lllIlllll[1]);
                        "".length();
                    }
                    AccBuilderGWD.c = lllIlllII[lllIlllll[29]];
                    Movement.walkTo(lG);
                    "".length();
                    Time.sleepTicks(lllIlllll[1]);
                    "".length();
                }
                if (llIIllIIllll(Players.getLocal().getWorldLocation().distanceTo(lG), lllIlllll[3])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[30]];
                    String[] strArr4 = new String[lllIlllll[1]];
                    strArr4[lllIlllll[0]] = lllIlllII[lllIlllll[31]];
                    NPC nearest4 = NPCs.getNearest(strArr4);
                    if (llIIllIIlIll(nearest4)) {
                        C0006g.a(lllIlllII[lllIlllll[32]], lD);
                    }
                    if (llIIllIIllII(nearest4)) {
                        String[] strArr5 = new String[lllIlllll[1]];
                        strArr5[lllIlllll[0]] = lllIlllII[lllIlllll[33]];
                        TileObjects.getNearest(strArr5).interact(lllIlllII[lllIlllll[34]]);
                        Time.sleepTicks(lllIlllll[3]);
                        "".length();
                    }
                }
            }
            if (llIIllIIlllI(C0004e.j(lllIlllll[6]), lllIlllll[5])) {
                dk = lllIlllll[0];
                if (llIIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(lH), lllIlllll[5])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[35]];
                    Movement.walkTo(lH);
                    "".length();
                    Time.sleepTicks(lllIlllll[1]);
                    "".length();
                }
                if (llIIllIIllll(Players.getLocal().getWorldLocation().distanceTo(lH), lllIlllll[5])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[36]];
                    String[] strArr6 = new String[lllIlllll[1]];
                    strArr6[lllIlllll[0]] = lllIlllII[lllIlllll[37]];
                    TileObject nearest5 = TileObjects.getNearest(strArr6);
                    if (llIIllIIlIll(nearest5)) {
                        nearest5.interact(lllIlllII[lllIlllll[38]]);
                    }
                }
            }
            if (llIIllIIlllI(C0004e.j(lllIlllll[6]), lllIlllll[7])) {
                if (llIIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(lG), lllIlllll[3])) {
                    int[] iArr6 = new int[lllIlllll[1]];
                    iArr6[lllIlllll[0]] = lllIlllll[27];
                    if (llIIllIIIllI(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lllIlllll[1]];
                        iArr7[lllIlllll[0]] = lllIlllll[27];
                        Inventory.getFirst(iArr7).interact(lllIlllII[lllIlllll[39]]);
                        Time.sleepTicks(lllIlllll[1]);
                        "".length();
                    }
                    AccBuilderGWD.c = lllIlllII[lllIlllll[40]];
                    Movement.walkTo(lG);
                    "".length();
                    Time.sleepTicks(lllIlllll[1]);
                    "".length();
                }
                if (llIIllIIllll(Players.getLocal().getWorldLocation().distanceTo(lG), lllIlllll[3])) {
                    AccBuilderGWD.c = lllIlllII[lllIlllll[41]];
                    String[] strArr7 = new String[lllIlllll[1]];
                    strArr7[lllIlllll[0]] = lllIlllII[lllIlllll[42]];
                    TileObject nearest6 = TileObjects.getNearest(strArr7);
                    if (llIIllIIlIll(nearest6)) {
                        String[] strArr8 = new String[lllIlllll[1]];
                        strArr8[lllIlllll[0]] = lllIlllII[lllIlllll[43]];
                        if (llIIllIIIllI(nearest6.hasAction(strArr8) ? 1 : 0)) {
                            nearest6.interact(lllIlllII[lllIlllll[44]]);
                            Time.sleepTicks(lllIlllll[3]);
                            "".length();
                        }
                        String[] strArr9 = new String[lllIlllll[1]];
                        strArr9[lllIlllll[0]] = lllIlllII[lllIlllll[45]];
                        Item first = Inventory.getFirst(strArr9);
                        if (llIIllIIlIll(first)) {
                            if (llIIllIIIlll(dk, lllIlllll[1])) {
                                as.pP += lllIlllll[1];
                                as.u(AccBuilderGWD.m);
                                dk += lllIlllll[1];
                                as.pP = lllIlllll[0];
                                dl = lllIlllll[0];
                            }
                            first.useOn(nearest6);
                            Time.sleepTicks(lllIlllll[5]);
                            "".length();
                        }
                    }
                }
                C0006g.a(lD);
            }
            C0006g.a(new String[lllIlllll[0]]);
        }
    }

    private static int llIIllIIIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIlllll[0];
    }

    private static String llIIlIlIlllI(String llIIllIIllIIl, String llIIllIIllIII) {
        String llIIllIIllIIl2 = new String(Base64.getDecoder().decode(llIIllIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIllIIlIlll = new StringBuilder();
        char[] llIIllIIlIllI = llIIllIIllIII.toCharArray();
        int llIIllIIlIlIl = lllIlllll[0];
        char[] charArray = llIIllIIllIIl2.toCharArray();
        int length = charArray.length;
        int i = lllIlllll[0];
        while (llIIllIIIlll(i, length)) {
            char llIIllIIIllII = charArray[i];
            llIIllIIlIlll.append((char) (llIIllIIIllII ^ llIIllIIlIllI[llIIllIIlIlIl % llIIllIIlIllI.length]));
            "".length();
            llIIllIIlIlIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llIIllIIlIlll);
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            dJ();
            "".length();
            if (0 != 0) {
                return ((((2 + 186) - 155) + 156) ^ (((16 + 117) - 3) + 39)) & (((((157 + 37) - 144) + 126) ^ (((96 + 70) - 5) + 3)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIlllll[51];
    }

    private static boolean llIIllIlIIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIllIIlIIl(int i) {
        return i < 0;
    }

    static {
        llIIllIIIlII();
        llIIlIllIIIl();
        String[] strArr = new String[lllIlllll[23]];
        strArr[lllIlllll[0]] = lllIlllII[lllIlllll[54]];
        strArr[lllIlllll[1]] = lllIlllII[lllIlllll[55]];
        strArr[lllIlllll[3]] = lllIlllII[lllIlllll[56]];
        strArr[lllIlllll[5]] = lllIlllII[lllIlllll[57]];
        strArr[lllIlllll[7]] = lllIlllII[lllIlllll[58]];
        strArr[lllIlllll[8]] = lllIlllII[lllIlllll[59]];
        strArr[lllIlllll[14]] = lllIlllII[lllIlllll[60]];
        strArr[lllIlllll[20]] = lllIlllII[lllIlllll[61]];
        strArr[lllIlllll[18]] = lllIlllII[lllIlllll[62]];
        strArr[lllIlllll[21]] = lllIlllII[lllIlllll[63]];
        strArr[lllIlllll[15]] = lllIlllII[lllIlllll[64]];
        strArr[lllIlllll[19]] = lllIlllII[lllIlllll[65]];
        strArr[lllIlllll[22]] = lllIlllII[lllIlllll[66]];
        lD = strArr;
        lE = new WorldPoint(lllIlllll[16], lllIlllll[67], lllIlllll[0]);
        lF = new WorldPoint(lllIlllll[68], lllIlllll[69], lllIlllll[0]);
        lG = new WorldPoint(lllIlllll[70], lllIlllll[71], lllIlllll[0]);
        lH = new WorldPoint(lllIlllll[72], lllIlllll[73], lllIlllll[0]);
        bx = new ArrayList();
        cI = lllIlllll[0];
    }

    private static boolean llIIllIIllII(Object obj) {
        return obj == null;
    }

    private static boolean llIIllIIlllI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIllIIllIl(int i, int i2) {
        return i > i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIlllII[lllIlllll[52]];
    }

    private static boolean llIIllIIlIll(Object obj) {
        return obj != null;
    }

    private static void Q() {
        int[] iArr = new int[lllIlllll[1]];
        iArr[lllIlllll[0]] = lllIlllll[10];
        if (llIIllIIlIII(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lllIlllll[10], lllIlllll[1], lllIlllll[46]));
            "".length();
        }
        int[] iArr2 = new int[lllIlllll[1]];
        iArr2[lllIlllll[0]] = lllIlllll[4];
        if (llIIllIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lllIlllll[4], lllIlllll[15], lllIlllll[47]));
            "".length();
        }
        if (llIIllIIlIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIlllII[lllIlllll[53]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lllIlllll[48], lllIlllll[8], lllIlllll[49]));
            "".length();
        }
        int[] iArr3 = new int[lllIlllll[1]];
        iArr3[lllIlllll[0]] = lllIlllll[11];
        if (llIIllIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lllIlllll[11], lllIlllll[15], lllIlllll[50]));
            "".length();
        }
        int[] iArr4 = new int[lllIlllll[1]];
        iArr4[lllIlllll[0]] = lllIlllll[13];
        if (llIIllIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lllIlllll[13], lllIlllll[31], lllIlllll[50]));
            "".length();
        }
        int[] iArr5 = new int[lllIlllll[1]];
        iArr5[lllIlllll[0]] = lllIlllll[12];
        if (llIIllIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(lllIlllll[12], lllIlllll[8], C0009j.ch));
            "".length();
        }
    }

    private static boolean llIIllIIllll(int i, int i2) {
        return i <= i2;
    }

    private static void llIIllIIIlII() {
        lllIlllll = new int[75];
        lllIlllll[0] = ((190 ^ 129) ^ (57 ^ 32)) & (((((53 + 30) - 81) + 177) ^ (((98 + 137) - 194) + 108)) ^ (-" ".length()));
        lllIlllll[1] = " ".length();
        lllIlllll[2] = (52 ^ 96) ^ (99 ^ 113);
        lllIlllll[3] = "  ".length();
        lllIlllll[4] = (-((-4113) & 30357)) & (-6145) & 32767;
        lllIlllll[5] = "   ".length();
        lllIlllll[6] = 5 ^ 110;
        lllIlllll[7] = 114 ^ 118;
        lllIlllll[8] = 10 ^ 15;
        lllIlllll[9] = (-((-2881) & 27495)) & (-3153) & 32766;
        lllIlllll[10] = (-((-19217) & 23318)) & (-17) & 16095;
        lllIlllll[11] = (-((-4397) & 28991)) & (-134) & 32735;
        lllIlllll[12] = (-((-3499) & 19887)) & (-2185) & 31197;
        lllIlllll[13] = (-(150 ^ 175)) & (-8193) & 16255;
        lllIlllll[14] = 109 ^ 107;
        lllIlllll[15] = (25 ^ 31) ^ (1 ^ 13);
        lllIlllll[16] = (-((-2433) & 18886)) & (-13075) & 32767;
        lllIlllll[17] = (-((-10884) & 31423)) & (-1) & 23743;
        lllIlllll[18] = 165 ^ 173;
        lllIlllll[19] = (233 ^ 187) ^ (99 ^ 58);
        lllIlllll[20] = (239 ^ 180) ^ (208 ^ 140);
        lllIlllll[21] = (94 ^ 35) ^ (225 ^ 149);
        lllIlllll[22] = (240 ^ 194) ^ (131 ^ 189);
        lllIlllll[23] = (76 ^ 65) ^ ((8 ^ 82) & ((111 ^ 53) ^ (-1)));
        lllIlllll[24] = 137 ^ 135;
        lllIlllll[25] = (250 ^ 170) ^ (127 ^ 32);
        lllIlllll[26] = 40 ^ 56;
        lllIlllll[27] = (-21510) & 22061;
        lllIlllll[28] = (34 ^ 118) ^ (250 ^ 191);
        lllIlllll[29] = 58 ^ 40;
        lllIlllll[30] = 112 ^ 99;
        lllIlllll[31] = 132 ^ 144;
        lllIlllll[32] = 156 ^ 137;
        lllIlllll[33] = (108 ^ 117) ^ (207 ^ 192);
        lllIlllll[34] = (((27 + 92) - 92) + 108) ^ (((82 + 23) - 18) + 57);
        lllIlllll[35] = 166 ^ 190;
        lllIlllll[36] = 51 ^ 42;
        lllIlllll[37] = 35 ^ 57;
        lllIlllll[38] = (106 ^ 72) ^ (63 ^ 6);
        lllIlllll[39] = (199 ^ 146) ^ (242 ^ 187);
        lllIlllll[40] = 48 ^ 45;
        lllIlllll[41] = 72 ^ 86;
        lllIlllll[42] = (16 ^ 88) ^ (234 ^ 189);
        lllIlllll[43] = (239 ^ 179) ^ (227 ^ 159);
        lllIlllll[44] = (238 ^ 132) ^ (194 ^ 137);
        lllIlllll[45] = 10 ^ 40;
        lllIlllll[46] = (-162) & 16061;
        lllIlllll[47] = (-((-17923) & 26342)) & (-1) & 14319;
        lllIlllll[48] = (-((-17933) & 22333)) & (-2) & 16381;
        lllIlllll[49] = (-((-24641) & 32342)) & (-1) & 32701;
        lllIlllll[50] = (-16402) & 18301;
        lllIlllll[51] = (((165 + 142) - 178) + 86) ^ (((47 + 8) - (-102)) + 22);
        lllIlllll[52] = 18 ^ 49;
        lllIlllll[53] = 115 ^ 87;
        lllIlllll[54] = (110 ^ 125) ^ (156 ^ 170);
        lllIlllll[55] = (((88 + 37) - (-33)) + 28) ^ (((111 + 67) - 90) + 68);
        lllIlllll[56] = (((169 + 101) - 145) + 59) ^ (((65 + 12) - 10) + 92);
        lllIlllll[57] = (((175 + 151) - 297) + 148) ^ (((150 + 23) - 122) + 102);
        lllIlllll[58] = 131 ^ 170;
        lllIlllll[59] = (211 ^ 187) ^ (46 ^ 108);
        lllIlllll[60] = (((21 + 125) - 6) + 30) ^ (((19 + 13) - 14) + 111);
        lllIlllll[61] = (91 ^ 33) ^ (94 ^ 8);
        lllIlllll[62] = (94 ^ 116) ^ (19 ^ 20);
        lllIlllll[63] = 236 ^ 194;
        lllIlllll[64] = (((71 + 44) - 74) + 120) ^ (((112 + 10) - (-20)) + 0);
        lllIlllll[65] = (((63 + 21) - 77) + 136) ^ (((87 + 158) - 188) + 134);
        lllIlllll[66] = (((69 + 21) - (-42)) + 15) ^ (((7 + 15) - (-129)) + 11);
        lllIlllll[67] = (-8786) & 11995;
        lllIlllll[68] = (-8229) & 11374;
        lllIlllll[69] = (-((-11963) & 32703)) & (-8196) & 32111;
        lllIlllll[70] = (-((-1197) & 13999)) & (-261) & 16311;
        lllIlllll[71] = (-((-9291) & 26571)) & (-12290) & 32763;
        lllIlllll[72] = (-8657) & 11774;
        lllIlllll[73] = (-23041) & 32606;
        lllIlllll[74] = 124 ^ 78;
    }

    private static boolean llIIllIIIlll(int i, int i2) {
        return i < i2;
    }
}
