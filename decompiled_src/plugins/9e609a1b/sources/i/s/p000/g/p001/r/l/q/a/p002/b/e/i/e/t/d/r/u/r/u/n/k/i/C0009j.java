package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/j.class */
public class C0009j implements M {
    public static /* synthetic */ WorldPoint bR;
    static /* synthetic */ int ca;
    public static /* synthetic */ WorldPoint bM;
    public static /* synthetic */ int bY;
    public static /* synthetic */ WorldPoint bN;
    public static /* synthetic */ WorldPoint bS;
    public static /* synthetic */ WorldPoint bO;
    public static /* synthetic */ WorldPoint bH;
    public static /* synthetic */ WorldPoint bF;
    public static /* synthetic */ long bV;
    public static /* synthetic */ WorldPoint bJ;
    public static /* synthetic */ WorldPoint bG;
    public static /* synthetic */ WorldPoint bU;
    public static /* synthetic */ WorldPoint bP;
    public static /* synthetic */ int bZ;
    public static /* synthetic */ String[] bW;
    private static /* synthetic */ String[] lIIIllllIlIII;
    public static /* synthetic */ WorldPoint bE;
    public static /* synthetic */ WorldPoint bQ;
    public static /* synthetic */ WorldPoint bI;
    public static /* synthetic */ WorldPoint bT;
    public static /* synthetic */ WorldPoint bK;
    public static /* synthetic */ WorldArea bX;
    public static /* synthetic */ WorldPoint bL;
    private static /* synthetic */ int[] lIIIllllIlIIl;

    private static boolean lIlIIlIlllIIIII(int i2) {
        return i2 >= 0;
    }

    private static boolean lIlIIlIllIlllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIlIllIllIIl(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIlIllIlllII(int i2) {
        return i2 < 0;
    }

    private static boolean lIlIIlIlllIIIlI(int i2, int i3) {
        return i2 >= i3;
    }

    static {
        lIlIIlIllIlIlII();
        lIlIIlIllIlIIll();
        bE = new WorldPoint(lIIIllllIlIIl[37], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bF = new WorldPoint(lIIIllllIlIIl[39], lIIIllllIlIIl[40], lIIIllllIlIIl[1]);
        bG = new WorldPoint(lIIIllllIlIIl[41], lIIIllllIlIIl[42], lIIIllllIlIIl[1]);
        bH = new WorldPoint(lIIIllllIlIIl[43], lIIIllllIlIIl[44], lIIIllllIlIIl[1]);
        bI = new WorldPoint(lIIIllllIlIIl[45], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bJ = new WorldPoint(lIIIllllIlIIl[46], lIIIllllIlIIl[47], lIIIllllIlIIl[1]);
        bK = new WorldPoint(lIIIllllIlIIl[39], lIIIllllIlIIl[40], lIIIllllIlIIl[1]);
        bL = new WorldPoint(lIIIllllIlIIl[48], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bM = new WorldPoint(lIIIllllIlIIl[49], lIIIllllIlIIl[50], lIIIllllIlIIl[1]);
        bN = new WorldPoint(lIIIllllIlIIl[51], lIIIllllIlIIl[42], lIIIllllIlIIl[1]);
        bO = new WorldPoint(lIIIllllIlIIl[49], lIIIllllIlIIl[50], lIIIllllIlIIl[1]);
        bP = new WorldPoint(lIIIllllIlIIl[52], lIIIllllIlIIl[53], lIIIllllIlIIl[1]);
        bQ = new WorldPoint(lIIIllllIlIIl[54], lIIIllllIlIIl[55], lIIIllllIlIIl[1]);
        bR = new WorldPoint(lIIIllllIlIIl[56], lIIIllllIlIIl[57], lIIIllllIlIIl[1]);
        bS = new WorldPoint(lIIIllllIlIIl[39], lIIIllllIlIIl[40], lIIIllllIlIIl[1]);
        bT = new WorldPoint(lIIIllllIlIIl[58], lIIIllllIlIIl[59], lIIIllllIlIIl[1]);
        bU = new WorldPoint(lIIIllllIlIIl[37], lIIIllllIlIIl[38], lIIIllllIlIIl[1]);
        bV = System.currentTimeMillis();
        String[] strArr = new String[lIIIllllIlIIl[10]];
        strArr[lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[60]];
        strArr[lIIIllllIlIIl[0]] = lIIIllllIlIII[lIIIllllIlIIl[61]];
        strArr[lIIIllllIlIIl[3]] = lIIIllllIlIII[lIIIllllIlIIl[62]];
        bW = strArr;
        bX = new WorldArea(lIIIllllIlIIl[63], lIIIllllIlIIl[64], lIIIllllIlIIl[65], lIIIllllIlIIl[66], lIIIllllIlIIl[1]);
        bY = lIIIllllIlIIl[1];
        ca = C0004e.c(lIIIllllIlIIl[31], lIIIllllIlIIl[32]);
    }

    private static String lIlIIlIllIlIIII(String lllllllllllllllIIIIIIllIlllIllII, String lllllllllllllllIIIIIIllIlllIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIllIlllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIllIlllIlIll.getBytes(StandardCharsets.UTF_8)), lIIIllllIlIIl[16]), "DES");
            Cipher lllllllllllllllIIIIIIllIlllIlllI = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIllIlllIlllI.init(lIIIllllIlIIl[3], lllllllllllllllIIIIIIllIlllIllll);
            return new String(lllllllllllllllIIIIIIllIlllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIllIlllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIllIlllIllIl) {
            lllllllllllllllIIIIIIllIlllIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIllIlIlIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIlIllIlIllI(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIIlIllIlllIl(int i2, int i3) {
        return i2 > i3;
    }

    public static void al() {
        if (lIlIIlIllIlllII(lIlIIlIllIllIlI(C0004e.a(bV), lIIIllllIlIIl[9] + ca))) {
            if (lIlIIlIllIlIllI(Players.getLocal().getWorldLocation().equals(bU) ? 1 : 0)) {
                AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[10]];
                if (lIlIIlIllIlIlIl(Movement.getRunEnergy(), lIIIllllIlIIl[11]) && lIlIIlIllIllIII(Inventory.contains(C0005f.ba) ? 1 : 0)) {
                    Inventory.getFirst(C0005f.ba).interact(lIIIllllIlIII[lIIIllllIlIIl[12]]);
                    Time.sleepTicks(lIIIllllIlIIl[0]);
                    "".length();
                }
                if (lIlIIlIllIlIllI(bX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIlIllIlllIl(Players.getLocal().getWorldLocation().distanceTo(bT), lIIIllllIlIIl[10])) {
                        AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[13]];
                        Movement.walkTo(bT);
                        "".length();
                        Time.sleepTicks(lIIIllllIlIIl[0]);
                        "".length();
                    }
                    if (lIlIIlIllIllllI(Players.getLocal().getWorldLocation().distanceTo(bT), lIIIllllIlIIl[10])) {
                        AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[14]];
                        if (lIlIIlIllIlIlIl(bY, lIIIllllIlIIl[0])) {
                            C0004e.w();
                            bY += lIIIllllIlIIl[0];
                        }
                        String[] strArr = new String[lIIIllllIlIIl[0]];
                        strArr[lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[15]];
                        NPC nearest = NPCs.getNearest(strArr);
                        if (lIlIIlIllIlIlll(nearest)) {
                            String[] strArr2 = new String[lIIIllllIlIIl[0]];
                            strArr2[lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[16]];
                            if (lIlIIlIllIllIII(nearest.hasAction(strArr2) ? 1 : 0)) {
                                nearest.interact(lIIIllllIlIII[lIIIllllIlIIl[17]]);
                                Time.sleepTicks(lIIIllllIlIIl[10]);
                                "".length();
                            }
                            String[] strArr3 = new String[lIIIllllIlIIl[0]];
                            strArr3[lIIIllllIlIIl[1]] = lIIIllllIlIII[lIIIllllIlIIl[8]];
                            if (lIlIIlIllIlIllI(nearest.hasAction(strArr3) ? 1 : 0)) {
                                C0006g.b(lIIIllllIlIII[lIIIllllIlIIl[18]], bW);
                                Time.sleepTicks(lIIIllllIlIIl[0]);
                                "".length();
                            }
                        }
                    }
                }
                if (lIlIIlIllIllIII(bX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(bU);
                    "".length();
                    Time.sleepTicks(lIIIllllIlIIl[0]);
                    "".length();
                }
            }
            if (lIlIIlIllIllIII(Players.getLocal().getWorldLocation().equals(bU) ? 1 : 0)) {
                if (lIlIIlIllIlllII(lIlIIlIllIllIll(C0004e.v(), 45.0d))) {
                    int[] iArr = new int[lIIIllllIlIIl[0]];
                    iArr[lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
                    if (lIlIIlIllIllIII(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIIIllllIlIIl[0]];
                        iArr2[lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
                        Inventory.getFirst(iArr2).interact(lIIIllllIlIII[lIIIllllIlIIl[19]]);
                        Time.sleepTicks(lIIIllllIlIIl[0]);
                        "".length();
                    }
                }
                if (lIlIIlIllIlIllI(an() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[20]];
                    Time.sleepTicks(lIIIllllIlIIl[15]);
                    "".length();
                }
                if (lIlIIlIllIllIII(an() ? 1 : 0)) {
                    new WorldArea(bU, lIIIllllIlIIl[3], lIIIllllIlIIl[3]);
                    NPC am = am();
                    AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[21]];
                    if (lIlIIlIllIlllll(Players.getLocal().getInteracting()) && lIlIIlIllIlIlll(am) && lIlIIlIllIlIllI(am.isDead() ? 1 : 0)) {
                        System.out.println(lIIIllllIlIII[lIIIllllIlIIl[22]]);
                        am.interact(lIIIllllIlIII[lIIIllllIlIIl[23]]);
                        Time.sleepTicks(lIIIllllIlIIl[3]);
                        "".length();
                    }
                    Time.sleepTicks(lIIIllllIlIIl[12]);
                    "".length();
                }
            }
        }
        if (lIlIIlIlllIIIII(lIlIIlIllIllIlI(C0004e.a(bV), lIIIllllIlIIl[9] + ca))) {
            WorldArea worldArea = new WorldArea(lIIIllllIlIIl[24], lIIIllllIlIIl[25], lIIIllllIlIIl[26], lIIIllllIlIIl[27], lIIIllllIlIIl[1]);
            WorldPoint worldPoint = new WorldPoint(lIIIllllIlIIl[28], lIIIllllIlIIl[29], lIIIllllIlIIl[1]);
            if (lIlIIlIllIllIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlIIlIllIlllIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIllllIlIIl[13])) {
                Movement.walkTo(worldPoint);
                "".length();
            }
            AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[30]];
            Movement.walkTo(bK);
            "".length();
            Time.sleepTicks(lIIIllllIlIIl[0]);
            "".length();
            if (lIlIIlIllIllllI(Players.getLocal().getWorldLocation().distanceTo(bK), lIIIllllIlIIl[3])) {
                bV = System.currentTimeMillis();
                ca = C0004e.c(lIIIllllIlIIl[31], lIIIllllIlIIl[32]);
            }
        }
    }

    private static boolean lIlIIlIllIlIlll(Object obj) {
        return obj != null;
    }

    private static void ak() {
        if (lIlIIlIllIlIlIl(bZ, lIIIllllIlIIl[0])) {
            bV = System.currentTimeMillis();
            System.out.println(lIIIllllIlIII[lIIIllllIlIIl[1]]);
            bZ += lIIIllllIlIIl[0];
        }
        int[] iArr = new int[lIIIllllIlIIl[0]];
        iArr[lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
        if (lIlIIlIllIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIlIIlIllIlIlll(nearest) && lIlIIlIllIlIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[0]];
                C0000a.a(nearest);
            }
            if (lIlIIlIllIlIlll(nearest) && lIlIIlIllIllIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRat.c = lIIIllllIlIII[lIIIllllIlIIl[3]];
                if (lIlIIlIllIlIllI(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIIllllIlIIl[4]);
                    "".length();
                }
                if (lIlIIlIllIllIII(Bank.isOpen() ? 1 : 0)) {
                    if (lIlIIlIllIllIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIIllllIlIIl[0]);
                        "".length();
                    }
                    C0000a.a(lIIIllllIlIIl[2], lIIIllllIlIIl[5]);
                    C0000a.a(lIIIllllIlIIl[6], lIIIllllIlIIl[0]);
                    C0000a.a(lIIIllllIlIIl[7], lIIIllllIlIIl[8]);
                }
            }
        }
        int[] iArr2 = new int[lIIIllllIlIIl[0]];
        iArr2[lIIIllllIlIIl[1]] = lIIIllllIlIIl[2];
        if (lIlIIlIllIllIII(Inventory.contains(iArr2) ? 1 : 0)) {
            al();
        }
    }

    private static boolean lIlIIlIlllIIIIl(int i2, int i3) {
        return i2 == i3;
    }

    private static void lIlIIlIllIlIIll() {
        lIIIllllIlIII = new String[lIIIllllIlIIl[67]];
        lIIIllllIlIII[lIIIllllIlIIl[1]] = lIlIIlIllIlIIII("lDNmEZlUdvNcvHnEZ4oDLSvmWe81VQJx", "uDGzf");
        lIIIllllIlIII[lIIIllllIlIIl[0]] = lIlIIlIllIlIIII("oATu4hC7NYpPlYF5+u4WGPryBm8tygP5", "LGqxT");
        lIIIllllIlIII[lIIIllllIlIIl[3]] = lIlIIlIllIlIIIl("Iz2W43l2C3tyagjjbwdCyzHsZmvoFWKi", "aONFE");
        lIIIllllIlIII[lIIIllllIlIIl[10]] = lIlIIlIllIlIIII("3ySBgxvTkW+X37teqiQmQ7RzZAH51QCy", "VQnEm");
        lIIIllllIlIII[lIIIllllIlIIl[12]] = lIlIIlIllIlIIIl("uXGYbRmIZek=", "XCWKR");
        lIIIllllIlIII[lIIIllllIlIIl[13]] = lIlIIlIllIlIIII("ChqfFag7+uavS/7yIOS7AA==", "bXvGS");
        lIIIllllIlIII[lIIIllllIlIIl[14]] = lIlIIlIllIlIIlI("PS0ZMCsQbAExKAZsFDwmAQ==", "uLwTG");
        lIIIllllIlIII[lIIIllllIlIIl[15]] = lIlIIlIllIlIIII("rvsH4nSwkag=", "Xogqr");
        lIIIllllIlIII[lIIIllllIlIIl[16]] = lIlIIlIllIlIIII("Pgmei8EVk07it6PZNoiBrpqA7rJhVKMy", "aLwBt");
        lIIIllllIlIII[lIIIllllIlIIl[17]] = lIlIIlIllIlIIII("eqf1UtN3ZToKbb55FFf0g1Rq/Yb9a4dH", "lqBCM");
        lIIIllllIlIII[lIIIllllIlIIl[8]] = lIlIIlIllIlIIlI("ADcjAkYAMSIVByIxPR8TIw==", "PXQvf");
        lIIIllllIlIII[lIIIllllIlIIl[18]] = lIlIIlIllIlIIlI("OgQ9HQ==", "laRnY");
        lIIIllllIlIII[lIIIllllIlIIl[19]] = lIlIIlIllIlIIlI("Igg9", "giIKY");
        lIIIllllIlIII[lIIIllllIlIIl[20]] = lIlIIlIllIlIIlI("FikJIwkwbwskRyQ/DT4=", "WObJg");
        lIIIllllIlIII[lIIIllllIlIIl[21]] = lIlIIlIllIlIIII("V1KLqYksZrXpjCYWLdQKpw==", "MRfxP");
        lIIIllllIlIII[lIIIllllIlIIl[22]] = lIlIIlIllIlIIII("NB+vRRhreAWF3/FX30/N8/c/Fe1kT3WK", "qWOpo");
        lIIIllllIlIII[lIIIllllIlIIl[23]] = lIlIIlIllIlIIlI("JiAQOSsM", "gTdXH");
        lIIIllllIlIII[lIIIllllIlIIl[30]] = lIlIIlIllIlIIIl("Us/5EoSxMzqh+pKLvj1i5A==", "VBDfu");
        lIIIllllIlIII[lIIIllllIlIIl[34]] = lIlIIlIllIlIIII("7AE84EjE65u8fnXTHenJbA==", "Syuyg");
        lIIIllllIlIII[lIIIllllIlIIl[36]] = lIlIIlIllIlIIII("NpZ7PJDFDzShLVLiCFv/uA==", "SpSCc");
        lIIIllllIlIII[lIIIllllIlIIl[60]] = lIlIIlIllIlIIlI("Ji4QB0oBZhYBCBMyXVMOEyhRCgIHZgUSBhdmHBZNBi4UAQhSNh0WDAEjTg==", "rFqsm");
        lIIIllllIlIII[lIIIllllIlIIl[61]] = lIlIIlIllIlIIII("xKzKvlJRlgh2JrMmaER5pEoTXFdSQ7kilhkJnCiMJ3DGX6/FHGPPZw==", "uzFFZ");
        lIIIllllIlIII[lIIIllllIlIIl[62]] = lIlIIlIllIlIIIl("lGhF79sxc1YE9kNCJ9Kj3g==", "vFOrY");
    }

    private static void lIlIIlIllIlIlII() {
        lIIIllllIlIIl = new int[68];
        lIIIllllIlIIl[0] = " ".length();
        lIIIllllIlIIl[1] = ((48 ^ 29) ^ (182 ^ 167)) & (((87 ^ 93) ^ (16 ^ 38)) ^ (-" ".length()));
        lIIIllllIlIIl[2] = (-16001) & 16379;
        lIIIllllIlIIl[3] = "  ".length();
        lIIIllllIlIIl[4] = (-(165 ^ 194)) & (-11266) & 16367;
        lIIIllllIlIIl[5] = 138 ^ 146;
        lIIIllllIlIIl[6] = (-((-30003) & 32191)) & (-17411) & 32223;
        lIIIllllIlIIl[7] = (-16387) & 24395;
        lIIIllllIlIIl[8] = 67 ^ 73;
        lIIIllllIlIIl[9] = (-2060) & 602059;
        lIIIllllIlIIl[10] = "   ".length();
        lIIIllllIlIIl[11] = (36 ^ 116) ^ (78 ^ 88);
        lIIIllllIlIIl[12] = (51 ^ 95) ^ (59 ^ 83);
        lIIIllllIlIIl[13] = 12 ^ 9;
        lIIIllllIlIIl[14] = (89 ^ 25) ^ (248 ^ 190);
        lIIIllllIlIIl[15] = 9 ^ 14;
        lIIIllllIlIIl[16] = (((27 + 55) - (-107)) + 2) ^ (((83 + 46) - 3) + 57);
        lIIIllllIlIIl[17] = (182 ^ 196) ^ (193 ^ 186);
        lIIIllllIlIIl[18] = (239 ^ 189) ^ (126 ^ 39);
        lIIIllllIlIIl[19] = (((64 + 38) - (-47)) + 54) ^ (((127 + 31) - 126) + 167);
        lIIIllllIlIIl[20] = 121 ^ 116;
        lIIIllllIlIIl[21] = 47 ^ 33;
        lIIIllllIlIIl[22] = (65 ^ 98) ^ (169 ^ 133);
        lIIIllllIlIIl[23] = 74 ^ 90;
        lIIIllllIlIIl[24] = (-((-18625) & 23747)) & (-65) & 8190;
        lIIIllllIlIIl[25] = (-20755) & 23986;
        lIIIllllIlIIl[26] = 128 ^ 193;
        lIIIllllIlIIl[27] = 53 ^ 18;
        lIIIllllIlIIl[28] = (-((-6661) & 32277)) & (-1) & 28669;
        lIIIllllIlIIl[29] = (-((-25761) & 30449)) & (-257) & 8191;
        lIIIllllIlIIl[30] = 75 ^ 90;
        lIIIllllIlIIl[31] = (-291) & 15290;
        lIIIllllIlIIl[32] = (-2626) & 32625;
        lIIIllllIlIIl[33] = (((17 + 72) - (-12)) + 26) ^ (38 ^ 61);
        lIIIllllIlIIl[34] = (((118 + 6) - 122) + 141) ^ (((79 + 76) - 148) + 150);
        lIIIllllIlIIl[35] = (19 ^ 118) ^ (21 ^ 19);
        lIIIllllIlIIl[36] = (119 ^ 123) ^ (66 ^ 93);
        lIIIllllIlIIl[37] = (-((-5692) & 7999)) & (-4105) & 8187;
        lIIIllllIlIIl[38] = (-((-19937) & 32738)) & (-97) & 16365;
        lIIIllllIlIIl[39] = (-4299) & 6090;
        lIIIllllIlIIl[40] = (-4172) & 7679;
        lIIIllllIlIIl[41] = (-26673) & 28409;
        lIIIllllIlIIl[42] = (-12289) & 15757;
        lIIIllllIlIIl[43] = (-((-17076) & 31679)) & (-17) & 16351;
        lIIIllllIlIIl[44] = (-((-10097) & 30577)) & (-8775) & 32758;
        lIIIllllIlIIl[45] = (-16641) & 18430;
        lIIIllllIlIIl[46] = (-((-16449) & 22854)) & (-1) & 8191;
        lIIIllllIlIIl[47] = (-8209) & 11711;
        lIIIllllIlIIl[48] = (-26881) & 28645;
        lIIIllllIlIIl[49] = (-14617) & 16382;
        lIIIllllIlIIl[50] = (-41) & 3563;
        lIIIllllIlIIl[51] = (-((-19607) & 27839)) & (-2305) & 12285;
        lIIIllllIlIIl[52] = (-((-1091) & 30023)) & (-113) & 30719;
        lIIIllllIlIIl[53] = (-42) & 3519;
        lIIIllllIlIIl[54] = (-((-243) & 23027)) & (-8193) & 32693;
        lIIIllllIlIIl[55] = (-12353) & 15819;
        lIIIllllIlIIl[56] = (-((-2589) & 15135)) & (-16401) & 30719;
        lIIIllllIlIIl[57] = (-4129) & 7589;
        lIIIllllIlIIl[58] = (-((-18486) & 23607)) & (-16401) & 24575;
        lIIIllllIlIIl[59] = (-((-23298) & 31571)) & (-4609) & 16127;
        lIIIllllIlIIl[60] = 165 ^ 177;
        lIIIllllIlIIl[61] = 131 ^ 150;
        lIIIllllIlIIl[62] = 187 ^ 173;
        lIIIllllIlIIl[63] = (-305) & 1470;
        lIIIllllIlIIl[64] = (-12358) & 15741;
        lIIIllllIlIIl[65] = (-20517) & 21303;
        lIIIllllIlIIl[66] = (-4097) & 4791;
        lIIIllllIlIIl[67] = (126 ^ 119) ^ (134 ^ 152);
    }

    private static int lIlIIlIllIllIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlIlllIIIlI(Skills.getLevel(Skill.RANGED), lIIIllllIlIIl[35]) && lIlIIlIlllIIIlI(Skills.getLevel(Skill.DEFENCE), lIIIllllIlIIl[35])) {
            ?? r0 = lIIIllllIlIIl[0];
            "".length();
            return (-" ".length()) > (((((132 + 181) - 205) + 135) ^ (((121 + 40) - 20) + 45)) & (((117 ^ 55) ^ (191 ^ 180)) ^ (-" ".length()))) ? ((((85 + 4) - (-115)) + 1) ^ (((49 + 123) - 55) + 13)) & (((237 ^ 142) ^ (15 ^ 35)) ^ (-" ".length())) : r0;
        }
        return lIIIllllIlIIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static boolean an() {
        WorldArea worldArea = new WorldArea(bU, lIIIllllIlIIl[10], lIIIllllIlIIl[10]);
        List all = Players.getAll();
        if (lIlIIlIllIlIllI(all.isEmpty() ? 1 : 0) && lIlIIlIllIlllIl(all.size(), lIIIllllIlIIl[0])) {
            int i2 = lIIIllllIlIIl[1];
            while (lIlIIlIllIlIlIl(i2, all.size())) {
                if (lIlIIlIllIllIII(((Player) all.get(i2)).equals(Players.getLocal()) ? 1 : 0)) {
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return ((((102 + 14) - (-66)) + 72) ^ (((35 + 149) - 66) + 60)) & (((67 ^ 30) ^ (79 ^ 94)) ^ (-" ".length()));
                    }
                } else if (lIlIIlIllIllIII(worldArea.contains(((Player) all.get(i2)).getWorldLocation()) ? 1 : 0)) {
                    return lIIIllllIlIIl[0];
                }
                i2++;
                "".length();
                if ((-"   ".length()) > 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return lIIIllllIlIIl[1];
    }

    private static String lIlIIlIllIlIIlI(String lllllllllllllllIIIIIIllIllIlllII, String lllllllllllllllIIIIIIllIllIllIll) {
        String lllllllllllllllIIIIIIllIllIlllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIllIllIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIllIllIllIlI = new StringBuilder();
        char[] lllllllllllllllIIIIIIllIllIllIIl = lllllllllllllllIIIIIIllIllIllIll.toCharArray();
        int lllllllllllllllIIIIIIllIllIllIII = lIIIllllIlIIl[1];
        char[] charArray = lllllllllllllllIIIIIIllIllIlllII2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIIIIIllIllIlIIII = lIIIllllIlIIl[1];
        while (lIlIIlIllIlIlIl(lllllllllllllllIIIIIIllIllIlIIII, length)) {
            lllllllllllllllIIIIIIllIllIllIlI.append((char) (charArray[lllllllllllllllIIIIIIllIllIlIIII] ^ lllllllllllllllIIIIIIllIllIllIIl[lllllllllllllllIIIIIIllIllIllIII % lllllllllllllllIIIIIIllIllIllIIl.length]));
            "".length();
            lllllllllllllllIIIIIIllIllIllIII++;
            lllllllllllllllIIIIIIllIllIlIIII++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIIllIllIllIlI);
    }

    private static boolean lIlIIlIllIllIII(int i2) {
        return i2 != 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIllllIlIII[lIIIllllIlIIl[34]];
    }

    private static int lIlIIlIllIllIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIllllIlIIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    static NPC am() {
        WorldPoint worldPoint = bU;
        WorldPoint worldPoint2 = new WorldPoint(bU.getX() - lIIIllllIlIIl[0], bU.getWorldY() + lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(bU.getX(), bU.getWorldY() + lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint4 = new WorldPoint(bU.getX() + lIIIllllIlIIl[0], bU.getWorldY() + lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint5 = new WorldPoint(bU.getX() + lIIIllllIlIIl[0], bU.getWorldY(), lIIIllllIlIIl[1]);
        WorldPoint worldPoint6 = new WorldPoint(bU.getX() + lIIIllllIlIIl[0], bU.getWorldY() - lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint7 = new WorldPoint(bU.getX(), bU.getWorldY() - lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint8 = new WorldPoint(bU.getX() - lIIIllllIlIIl[0], bU.getWorldY() - lIIIllllIlIIl[0], lIIIllllIlIIl[1]);
        WorldPoint worldPoint9 = new WorldPoint(bU.getX() - lIIIllllIlIIl[0], bU.getWorldY(), lIIIllllIlIIl[1]);
        List all = NPCs.getAll(npc -> {
            return npc.getName().equalsIgnoreCase(lIIIllllIlIII[lIIIllllIlIIl[36]]);
        });
        if (lIlIIlIllIlIlll(all)) {
            List of = List.of(worldPoint2, worldPoint3, worldPoint4, worldPoint5, worldPoint6, worldPoint7, worldPoint8, worldPoint9);
            int i2 = lIIIllllIlIIl[1];
            while (lIlIIlIllIlIlIl(i2, all.size())) {
                if (lIlIIlIllIllIII(of.contains(((NPC) all.get(i2)).getWorldLocation()) ? 1 : 0)) {
                    return (NPC) all.get(i2);
                }
                i2++;
                "".length();
                if (((41 ^ 108) & ((124 ^ 57) ^ (-1))) < 0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    private static boolean lIlIIlIllIllllI(int i2, int i3) {
        return i2 <= i3;
    }

    public static void ao() {
        int c = C0004e.c(lIIIllllIlIIl[0], lIIIllllIlIIl[13]);
        if (lIlIIlIlllIIIIl(c, lIIIllllIlIIl[0])) {
            bU = bE;
            bK = bF;
        }
        if (lIlIIlIlllIIIIl(c, lIIIllllIlIIl[3])) {
            bU = bL;
            bK = bM;
        }
        if (lIlIIlIlllIIIIl(c, lIIIllllIlIIl[10])) {
            bU = bN;
            bK = bO;
        }
        if (lIlIIlIlllIIIIl(c, lIIIllllIlIIl[12])) {
            bU = bP;
            bK = bQ;
        }
        if (lIlIIlIlllIIIIl(c, lIIIllllIlIIl[13])) {
            bU = bR;
            bK = bS;
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            ak();
            "".length();
            if ((51 ^ 55) < "   ".length()) {
                return (118 ^ 22) & ((194 ^ 162) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIllllIlIIl[33];
    }

    private static String lIlIIlIllIlIIIl(String lllllllllllllllIIIIIIllIllIIIlIl, String lllllllllllllllIIIIIIllIllIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIllIllIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIllIllIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIIllIllIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIIllIllIIlIIl.init(lIIIllllIlIIl[3], lllllllllllllllIIIIIIllIllIIlIlI);
            return new String(lllllllllllllllIIIIIIllIllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIllIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIllIllIIlIII) {
            lllllllllllllllIIIIIIllIllIIlIII.printStackTrace();
            return null;
        }
    }
}
