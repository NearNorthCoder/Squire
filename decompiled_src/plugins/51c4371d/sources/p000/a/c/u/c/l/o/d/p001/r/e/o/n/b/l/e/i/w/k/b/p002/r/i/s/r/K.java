package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.K  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/K.class */
public class K implements F {
    public static /* synthetic */ boolean bz;
    public static final /* synthetic */ WorldPoint iH;
    private static /* synthetic */ String[] lllIIIlI;
    public static final /* synthetic */ WorldPoint iK;
    public static /* synthetic */ List<C0003d> bB;
    private final /* synthetic */ int iO = lllIIIll[0];
    public static final /* synthetic */ WorldPoint iJ;
    static final /* synthetic */ WorldPoint iL;
    public static final /* synthetic */ WorldPoint iI;
    private static /* synthetic */ int[] lllIIIll;
    static final /* synthetic */ WorldPoint iN;
    static final /* synthetic */ WorldPoint iM;

    private static void lIllllIIIlI() {
        lllIIIlI = new String[lllIIIll[86]];
        lllIIIlI[lllIIIll[1]] = lIlllIlllll("T8vCk9PWIE/mdVdTS2B14Q==", "kEgss");
        lllIIIlI[lllIIIll[2]] = lIlllIlllll("vimzC7a20bs+gm+dnnaFttkwY2KEd2zRGH6ZYFmZmM4a7CzsBHOPap3oHnmSl3e4", "ZecgB");
        lllIIIlI[lllIIIll[4]] = lIllllIIIII("Sc+aZqpRRhmTSGI77kRdnChTu1l0/nYh", "UxBCJ");
        lllIIIlI[lllIIIll[5]] = lIlllIlllll("w8f20gQvsCqQCBGGR8raRu4rk2QP3zWj", "ccrNL");
        lllIIIlI[lllIIIll[7]] = lIllllIIIIl("EAxpFwsiSSQfCjQAJxFZNxsoDxw1SToDCTcFIBMKa0k6ARAzCiEfFyBJPRlZBTwQPzcA", "GiIvy");
        lllIIIlI[lllIIIll[14]] = lIllllIIIIl("DxMnKgQ=", "KaNDo");
        lllIIIlI[lllIIIll[16]] = lIlllIlllll("ylwD4X5/YIPQEXlKsN6H/g==", "fxITy");
        lllIIIlI[lllIIIll[18]] = lIlllIlllll("lPYqUGztj6s=", "pFOZA");
        lllIIIlI[lllIIIll[19]] = lIllllIIIIl("LzA3BEEuMDsA", "cQAea");
        lllIIIlI[lllIIIll[20]] = lIlllIlllll("DEzNUrZ2ugtxn3D7pjjSKdGwmg/mZTFG2vItcTF2IBlVpiL0YA64BQ==", "XPtBb");
        lllIIIlI[lllIIIll[22]] = lIllllIIIII("XGrda6XQzaiStlYdTYMH4w==", "KmnDA");
        lllIIIlI[lllIIIll[42]] = lIlllIlllll("JjD7zK9QTYrrQx0SwAYagw==", "etLcB");
        lllIIIlI[lllIIIll[45]] = lIllllIIIIl("OyozHBJYIz4HAAo=", "xBRsa");
        lllIIIlI[lllIIIll[21]] = lIllllIIIIl("BikiKyxqLD8jOw==", "JHPLI");
        lllIIIlI[lllIIIll[47]] = lIlllIlllll("m/laDyVmPIY=", "Hufwc");
        lllIIIlI[lllIIIll[48]] = lIlllIlllll("71TBEL0J6Q4=", "lIRlf");
        lllIIIlI[lllIIIll[49]] = lIlllIlllll("LM7+rli2Cpk=", "lRZIX");
        lllIIIlI[lllIIIll[50]] = lIllllIIIIl("NSYCNjtWLw8tKQQ=", "vNcYH");
        lllIIIlI[lllIIIll[52]] = lIllllIIIIl("ISg7bjUAaSwiNQ47", "oIMNA");
        lllIIIlI[lllIIIll[53]] = lIllllIIIIl("GD0JOT8kPQB2KSI9AiU=", "MSgVK");
        lllIIIlI[lllIIIll[15]] = lIllllIIIIl("BxgLER1iNwcVADFUCwYaKxA=", "Btoto");
        lllIIIlI[lllIIIll[54]] = lIllllIIIII("oWDLUUxd/s2Ov98h6yVKhQ==", "oyOjt");
        lllIIIlI[lllIIIll[55]] = lIllllIIIII("QD+Myxvo7yA=", "jJWFm");
        lllIIIlI[lllIIIll[56]] = lIllllIIIIl("Kz0KKg==", "dMoDd");
        lllIIIlI[lllIIIll[57]] = lIllllIIIIl("IwgoLw==", "lxMAV");
        lllIIIlI[lllIIIll[58]] = lIllllIIIIl("NS4MOSseMQo=", "pVoQJ");
        lllIIIlI[lllIIIll[59]] = lIlllIlllll("wl/FPZxqS4yHHad8Yuh1CQ==", "GijgH");
        lllIIIlI[lllIIIll[60]] = lIllllIIIII("xLBe8v9cGxM4Sp8fy3eoRg==", "OBSJl");
        lllIIIlI[lllIIIll[61]] = lIllllIIIII("dudUpYfKH7SyEZMCiSJVdw==", "QSUFy");
        lllIIIlI[lllIIIll[62]] = lIllllIIIIl("Ij8bCWEaMFUWIBg5Bw0q", "uVulA");
        lllIIIlI[lllIIIll[63]] = lIllllIIIIl("AgAODw==", "Vaejv");
        lllIIIlI[lllIIIll[75]] = lIlllIlllll("I9HVvhiv1hqgJ0QvNe/egQ==", "vGQnE");
        lllIIIlI[lllIIIll[76]] = lIllllIIIIl("Jg83Imc7AHkyIjUKLS1nfA==", "TfYEG");
    }

    private static String lIllllIIIII(String lIlIIIIllIlIllI, String lIlIIIIllIlIlIl) {
        try {
            SecretKeySpec lIlIIIIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIIllIlIlIl.getBytes(StandardCharsets.UTF_8)), lllIIIll[19]), "DES");
            Cipher lIlIIIIllIllIII = Cipher.getInstance("DES");
            lIlIIIIllIllIII.init(lllIIIll[4], lIlIIIIllIllIIl);
            return new String(lIlIIIIllIllIII.doFinal(Base64.getDecoder().decode(lIlIIIIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIIllIlIlll) {
            lIlIIIIllIlIlll.printStackTrace();
            return null;
        }
    }

    private static void ag() {
        int[] iArr = new int[lllIIIll[2]];
        iArr[lllIIIll[1]] = lllIIIll[9];
        if (lIllllIIllI(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(lllIIIll[9], lllIIIll[14], C0008i.bw));
            "".length();
        }
        int[] iArr2 = new int[lllIIIll[2]];
        iArr2[lllIIIll[1]] = lllIIIll[0];
        if (lIllllIIllI(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(lllIIIll[0], cA(), lllIIIll[64]));
            "".length();
        }
        int[] iArr3 = new int[lllIIIll[2]];
        iArr3[lllIIIll[1]] = lllIIIll[8];
        if (lIllllIIllI(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(lllIIIll[8], lllIIIll[4], lllIIIll[6]));
            "".length();
        }
        if (lIllllIIllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIIIlI[lllIIIll[76]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lllIIIll[65], lllIIIll[14], lllIIIll[66]));
            "".length();
        }
        int[] iArr4 = new int[lllIIIll[2]];
        iArr4[lllIIIll[1]] = lllIIIll[67];
        if (lIllllIIllI(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(lllIIIll[67], lllIIIll[68], lllIIIll[69]));
            "".length();
        }
    }

    private static boolean lIllllIlIll(int i, int i2) {
        return i <= i2;
    }

    static {
        lIllllIIIll();
        lIllllIIIlI();
        iH = new WorldPoint(lllIIIll[77], lllIIIll[78], lllIIIll[1]);
        iI = new WorldPoint(lllIIIll[79], lllIIIll[80], lllIIIll[1]);
        iJ = new WorldPoint(lllIIIll[81], lllIIIll[82], lllIIIll[1]);
        iK = new WorldPoint(lllIIIll[83], lllIIIll[44], lllIIIll[1]);
        iL = new WorldPoint(lllIIIll[1], lllIIIll[1], lllIIIll[1]);
        iM = new WorldPoint(lllIIIll[1], lllIIIll[1], lllIIIll[1]);
        iN = new WorldPoint(lllIIIll[84], lllIIIll[85], lllIIIll[1]);
        bB = new ArrayList();
    }

    private static String lIlllIlllll(String lIlIIIIllIIlIIl, String lIlIIIIllIIlIII) {
        try {
            SecretKeySpec lIlIIIIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIll[4], lIlIIIIllIIllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIIIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIIllIIlIlI) {
            lIlIIIIllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static String lIllllIIIIl(String lIlIIIIlllIlIll, String lIlIIIIlllIlIlI) {
        String lIlIIIIlllIlIll2 = new String(Base64.getDecoder().decode(lIlIIIIlllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIIlllIlIIl = new StringBuilder();
        char[] charArray = lIlIIIIlllIlIlI.toCharArray();
        int lIlIIIIlllIIlll = lllIIIll[1];
        char[] charArray2 = lIlIIIIlllIlIll2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIll[1];
        while (lIllllIIlIl(i, length)) {
            lIlIIIIlllIlIIl.append((char) (charArray2[i] ^ charArray[lIlIIIIlllIIlll % charArray.length]));
            "".length();
            lIlIIIIlllIIlll++;
            i++;
            "".length();
            if ("  ".length() >= ((((144 + 18) - 77) + 109) ^ (((97 + 100) - 134) + 135))) {
                return null;
            }
        }
        return String.valueOf(lIlIIIIlllIlIIl);
    }

    private static boolean lIllllIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllllIllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllllIIlII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIllllIllII(Skills.getLevel(Skill.PRAYER), lllIIIll[3])) {
            ?? r0 = lllIIIll[2];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIIll[1];
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            cz();
            "".length();
            if (" ".length() > "   ".length()) {
                return ((((174 + 76) - 94) + 49) ^ (((40 + 37) - (-1)) + 77)) & (((((26 + 13) - (-129)) + 71) ^ (((107 + 132) - 213) + 159)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIIIll[74];
    }

    private static int cA() {
        return (lIllllIIlIl(Skills.getLevel(Skill.PRAYER), lllIIIll[71]) && lIllllIllII(Skills.getLevel(Skill.PRAYER), lllIIIll[3])) ? ((lllIIIll[70] - Skills.getExperience(Skill.PRAYER)) / lllIIIll[72]) + lllIIIll[22] : ((lllIIIll[73] - Skills.getExperience(Skill.PRAYER)) / lllIIIll[72]) + lllIIIll[63];
    }

    private static boolean lIllllIlIII(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v310, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v334, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v53, types: [boolean] */
    public static void cz() {
        if (lIllllIIlII(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lllIIIlI[lllIIIll[1]];
            C0001b.a(bB);
            if (lIllllIIlIl(bB.size(), lllIIIll[2])) {
                System.out.println(lllIIIlI[lllIIIll[2]]);
                bz = lllIIIll[1];
            }
        }
        if (lIllllIIllI(bz ? 1 : 0) && lIllllIIlIl(Skills.getLevel(Skill.PRAYER), lllIIIll[3])) {
            if (lIllllIIllI(ac() ? 1 : 0) && lIllllIIlIl(Game.getWildyLevel(), lllIIIll[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllllIIlll(nearest) && lIllllIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIIIlI[lllIIIll[4]];
                    C0000a.a(nearest);
                }
                if (lIllllIIlll(nearest) && lIllllIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIIIlI[lllIIIll[5]];
                    if (lIllllIIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIll[6]);
                        "".length();
                    }
                    if (lIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (lIllllIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIll[7]);
                            "".length();
                        }
                        if (lIllllIlIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIIll[4]);
                            "".length();
                        }
                        int[] iArr = new int[lllIIIll[5]];
                        iArr[lllIIIll[1]] = lllIIIll[8];
                        iArr[lllIIIll[2]] = lllIIIll[0];
                        iArr[lllIIIll[4]] = lllIIIll[9];
                        if (lIllllIIllI(C0004e.b(iArr) ? 1 : 0)) {
                            ag();
                            System.out.println(lllIIIlI[lllIIIll[7]]);
                            bz = lllIIIll[2];
                            return;
                        }
                        int[] iArr2 = new int[lllIIIll[5]];
                        iArr2[lllIIIll[1]] = lllIIIll[8];
                        iArr2[lllIIIll[2]] = lllIIIll[0];
                        iArr2[lllIIIll[4]] = lllIIIll[9];
                        if (lIllllIIlII(C0004e.b(iArr2) ? 1 : 0)) {
                            if (lIllllIIllI(Equipment.contains(C0005f.bg) ? 1 : 0)) {
                                C0000a.b(C0005f.bg, lllIIIll[2]);
                            }
                            C0000a.b(C0005f.bb, lllIIIll[2]);
                            C0000a.a(lllIIIll[10], lllIIIll[11]);
                            C0000a.b(lllIIIll[0], lllIIIll[12]);
                        }
                    }
                }
            }
            if (lIllllIIlII(ac() ? 1 : 0)) {
                if (lIllllIIlII(Inventory.contains(C0005f.bb) ? 1 : 0) && lIllllIIlIl(Movement.getRunEnergy(), lllIIIll[13])) {
                    Inventory.getFirst(C0005f.bb).interact(lllIIIlI[lllIIIll[14]]);
                    Time.sleepTicks(lllIIIll[2]);
                    "".length();
                }
                if (lIllllIIllI(Movement.isRunEnabled() ? 1 : 0) && lIllllIlIIl(Movement.getRunEnergy(), lllIIIll[15])) {
                    Movement.toggleRun();
                    Time.sleepTicks(lllIIIll[14]);
                    "".length();
                }
                if (lIllllIIlIl(Game.getWildyLevel(), lllIIIll[2])) {
                    AccBuilderBarrows.c = lllIIIlI[lllIIIll[16]];
                    if (lIllllIIlII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (lIllllIIllI(Dialog.isOpen() ? 1 : 0) && lIllllIIlII(Inventory.contains(C0005f.bg) ? 1 : 0) && lIllllIlIlI(Players.getLocal().getAnimation(), lllIIIll[17])) {
                        Inventory.getFirst(C0005f.bg).interact(lllIIIlI[lllIIIll[18]]);
                        Time.sleepTicks(lllIIIll[4]);
                        "".length();
                    }
                    String[] strArr = new String[lllIIIll[4]];
                    strArr[lllIIIll[1]] = lllIIIlI[lllIIIll[19]];
                    strArr[lllIIIll[2]] = lllIIIlI[lllIIIll[20]];
                    C0006g.a(strArr);
                }
                if (lIllllIlIII(Game.getWildyLevel())) {
                    int[] iArr3 = new int[lllIIIll[2]];
                    iArr3[lllIIIll[1]] = lllIIIll[0];
                    if (lIllllIIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                        if (lIllllIlIIl(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                            AccBuilderBarrows.c = lllIIIlI[lllIIIll[22]];
                            WorldPoint[] worldPointArr = new WorldPoint[lllIIIll[21]];
                            worldPointArr[lllIIIll[1]] = new WorldPoint(lllIIIll[23], lllIIIll[24], lllIIIll[1]);
                            worldPointArr[lllIIIll[2]] = new WorldPoint(lllIIIll[25], lllIIIll[26], lllIIIll[1]);
                            worldPointArr[lllIIIll[4]] = new WorldPoint(lllIIIll[27], lllIIIll[28], lllIIIll[1]);
                            worldPointArr[lllIIIll[5]] = new WorldPoint(lllIIIll[29], lllIIIll[30], lllIIIll[1]);
                            worldPointArr[lllIIIll[7]] = new WorldPoint(lllIIIll[31], lllIIIll[32], lllIIIll[1]);
                            worldPointArr[lllIIIll[14]] = new WorldPoint(lllIIIll[33], lllIIIll[34], lllIIIll[1]);
                            worldPointArr[lllIIIll[16]] = new WorldPoint(lllIIIll[35], lllIIIll[36], lllIIIll[1]);
                            worldPointArr[lllIIIll[18]] = new WorldPoint(lllIIIll[37], lllIIIll[38], lllIIIll[1]);
                            worldPointArr[lllIIIll[19]] = new WorldPoint(lllIIIll[39], lllIIIll[38], lllIIIll[1]);
                            worldPointArr[lllIIIll[20]] = new WorldPoint(lllIIIll[40], lllIIIll[38], lllIIIll[1]);
                            worldPointArr[lllIIIll[22]] = new WorldPoint(lllIIIll[41], lllIIIll[38], lllIIIll[1]);
                            worldPointArr[lllIIIll[42]] = new WorldPoint(lllIIIll[43], lllIIIll[44], lllIIIll[1]);
                            worldPointArr[lllIIIll[45]] = new WorldPoint(lllIIIll[46], lllIIIll[44], lllIIIll[1]);
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lllIIIll[2]);
                            "".length();
                        }
                        if (lIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                            AccBuilderBarrows.c = lllIIIlI[lllIIIll[42]];
                            String[] strArr2 = new String[lllIIIll[2]];
                            strArr2[lllIIIll[1]] = lllIIIlI[lllIIIll[45]];
                            TileObject nearest2 = TileObjects.getNearest(strArr2);
                            String[] strArr3 = new String[lllIIIll[2]];
                            strArr3[lllIIIll[1]] = lllIIIlI[lllIIIll[21]];
                            TileObject nearest3 = TileObjects.getNearest(strArr3);
                            String[] strArr4 = new String[lllIIIll[2]];
                            strArr4[lllIIIll[1]] = lllIIIlI[lllIIIll[47]];
                            if (lIllllIIlII(nearest3.hasAction(strArr4) ? 1 : 0)) {
                                nearest3.interact(lllIIIlI[lllIIIll[48]]);
                            }
                            if (lIllllIIlll(nearest2)) {
                                String[] strArr5 = new String[lllIIIll[2]];
                                strArr5[lllIIIll[1]] = lllIIIlI[lllIIIll[49]];
                                if (lIllllIIllI(nearest3.hasAction(strArr5) ? 1 : 0)) {
                                    Skills.getExperience(Skill.PRAYER);
                                    int[] iArr4 = new int[lllIIIll[2]];
                                    iArr4[lllIIIll[1]] = lllIIIll[0];
                                    Item first = Inventory.getFirst(iArr4);
                                    String[] strArr6 = new String[lllIIIll[2]];
                                    strArr6[lllIIIll[1]] = lllIIIlI[lllIIIll[50]];
                                    first.useOn(TileObjects.getNearest(strArr6));
                                    Time.sleepTicks(lllIIIll[2]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lllIIIll[2]];
                    iArr5[lllIIIll[1]] = lllIIIll[0];
                    if (lIllllIIllI(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lllIIIll[2]];
                        iArr6[lllIIIll[1]] = lllIIIll[51];
                        if (lIllllIIlII(Inventory.contains(iArr6) ? 1 : 0)) {
                            if (lIllllIlIIl(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                                AccBuilderBarrows.c = lllIIIlI[lllIIIll[52]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lllIIIll[21]];
                                worldPointArr2[lllIIIll[1]] = new WorldPoint(lllIIIll[23], lllIIIll[24], lllIIIll[1]);
                                worldPointArr2[lllIIIll[2]] = new WorldPoint(lllIIIll[25], lllIIIll[26], lllIIIll[1]);
                                worldPointArr2[lllIIIll[4]] = new WorldPoint(lllIIIll[27], lllIIIll[28], lllIIIll[1]);
                                worldPointArr2[lllIIIll[5]] = new WorldPoint(lllIIIll[29], lllIIIll[30], lllIIIll[1]);
                                worldPointArr2[lllIIIll[7]] = new WorldPoint(lllIIIll[31], lllIIIll[32], lllIIIll[1]);
                                worldPointArr2[lllIIIll[14]] = new WorldPoint(lllIIIll[33], lllIIIll[34], lllIIIll[1]);
                                worldPointArr2[lllIIIll[16]] = new WorldPoint(lllIIIll[35], lllIIIll[36], lllIIIll[1]);
                                worldPointArr2[lllIIIll[18]] = new WorldPoint(lllIIIll[37], lllIIIll[38], lllIIIll[1]);
                                worldPointArr2[lllIIIll[19]] = new WorldPoint(lllIIIll[39], lllIIIll[38], lllIIIll[1]);
                                worldPointArr2[lllIIIll[20]] = new WorldPoint(lllIIIll[40], lllIIIll[38], lllIIIll[1]);
                                worldPointArr2[lllIIIll[22]] = new WorldPoint(lllIIIll[41], lllIIIll[38], lllIIIll[1]);
                                worldPointArr2[lllIIIll[42]] = new WorldPoint(lllIIIll[43], lllIIIll[44], lllIIIll[1]);
                                worldPointArr2[lllIIIll[45]] = new WorldPoint(lllIIIll[46], lllIIIll[44], lllIIIll[1]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lllIIIll[2]);
                                "".length();
                            }
                            if (lIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                                AccBuilderBarrows.c = lllIIIlI[lllIIIll[53]];
                                if (!lIllllIIllI(Dialog.canLevelUpContinue() ? 1 : 0) || lIllllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr7 = new String[lllIIIll[2]];
                                strArr7[lllIIIll[1]] = lllIIIlI[lllIIIll[15]];
                                NPC nearest4 = NPCs.getNearest(strArr7);
                                String[] strArr8 = new String[lllIIIll[2]];
                                strArr8[lllIIIll[1]] = lllIIIlI[lllIIIll[54]];
                                TileObject nearest5 = TileObjects.getNearest(strArr8);
                                String[] strArr9 = new String[lllIIIll[2]];
                                strArr9[lllIIIll[1]] = lllIIIlI[lllIIIll[55]];
                                if (lIllllIIlII(nearest5.hasAction(strArr9) ? 1 : 0)) {
                                    nearest5.interact(lllIIIlI[lllIIIll[56]]);
                                }
                                if (lIllllIIlll(nearest4)) {
                                    String[] strArr10 = new String[lllIIIll[2]];
                                    strArr10[lllIIIll[1]] = lllIIIlI[lllIIIll[57]];
                                    if (lIllllIIllI(nearest5.hasAction(strArr10) ? 1 : 0)) {
                                        if (lIllllIIllI(Dialog.isOpen() ? 1 : 0)) {
                                            int[] iArr7 = new int[lllIIIll[2]];
                                            iArr7[lllIIIll[1]] = lllIIIll[51];
                                            Inventory.getFirst(iArr7).useOn(nearest4);
                                            Time.sleepTicks(lllIIIll[4]);
                                            "".length();
                                        }
                                        if (lIllllIIlII(Dialog.isOpen() ? 1 : 0)) {
                                            List options = Dialog.getOptions();
                                            if (lIllllIIllI(options.isEmpty() ? 1 : 0)) {
                                                int i = lllIIIll[1];
                                                while (lIllllIIlIl(i, options.size())) {
                                                    int[] iArr8 = new int[lllIIIll[2]];
                                                    iArr8[lllIIIll[1]] = lllIIIll[51];
                                                    if (lIllllIlIlI(((Item) Inventory.getAll(iArr8).get(lllIIIll[1])).getQuantity(), lllIIIll[2]) && lIllllIIlII(((Widget) options.get(i)).getText().contains(lllIIIlI[lllIIIll[58]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lllIIIll[2]);
                                                        Time.sleepTicks(lllIIIll[4]);
                                                        "".length();
                                                    }
                                                    int[] iArr9 = new int[lllIIIll[2]];
                                                    iArr9[lllIIIll[1]] = lllIIIll[51];
                                                    if (lIllllIlIlI(((Item) Inventory.getAll(iArr9).get(lllIIIll[1])).getQuantity(), lllIIIll[14]) && lIllllIIlII(((Widget) options.get(i)).getText().contains(lllIIIlI[lllIIIll[59]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lllIIIll[2]);
                                                        Time.sleepTicks(lllIIIll[4]);
                                                        "".length();
                                                    }
                                                    if (lIllllIIlII(((Widget) options.get(i)).getText().contains(lllIIIlI[lllIIIll[60]]) ? 1 : 0)) {
                                                        Mouse.click(((Widget) options.get(i)).getClickPoint().getX(), ((Widget) options.get(i)).getClickPoint().getY(), (boolean) lllIIIll[2]);
                                                        Time.sleepTicks(lllIIIll[4]);
                                                        "".length();
                                                    }
                                                    i++;
                                                    "".length();
                                                    if ((-(69 ^ 65)) >= 0) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C0004e.s();
                            }
                        }
                    }
                }
            }
            int[] iArr10 = new int[lllIIIll[2]];
            iArr10[lllIIIll[1]] = lllIIIll[10];
            if (lIllllIIlII(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lllIIIll[2]];
                iArr11[lllIIIll[1]] = lllIIIll[0];
                if (!lIllllIIllI(Inventory.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lllIIIll[2]];
                iArr12[lllIIIll[1]] = lllIIIll[51];
                if (!lIllllIIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                    return;
                }
            }
            if (lIllllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lllIIIll[21])) {
                AccBuilderBarrows.c = lllIIIlI[lllIIIll[61]];
                String[] strArr11 = new String[lllIIIll[2]];
                strArr11[lllIIIll[1]] = lllIIIlI[lllIIIll[62]];
                TileItem nearest6 = TileItems.getNearest(strArr11);
                if (lIllllIIlll(nearest6)) {
                    nearest6.interact(lllIIIlI[lllIIIll[63]]);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lllIIIll[1];
    }

    private static void lIllllIIIll() {
        lllIIIll = new int[87];
        lllIIIll[0] = (-((-16897) & 29512)) & (-1) & 13151;
        lllIIIll[1] = ((23 ^ 79) ^ (230 ^ 176)) & (((26 ^ 32) ^ (242 ^ 198)) ^ (-" ".length()));
        lllIIIll[2] = " ".length();
        lllIIIll[3] = 167 ^ 138;
        lllIIIll[4] = "  ".length();
        lllIIIll[5] = "   ".length();
        lllIIIll[6] = (-19508) & 24507;
        lllIIIll[7] = (((82 + 36) - 45) + 68) ^ (((69 + 76) - 132) + 124);
        lllIIIll[8] = (-11346) & 32511;
        lllIIIll[9] = (-1199) & 13823;
        lllIIIll[10] = (-((-14723) & 32143)) & (-10257) & 28671;
        lllIIIll[11] = (-((-7222) & 7935)) & (-17457) & 28669;
        lllIIIll[12] = (((58 ^ 126) + (3 ^ 42)) - (50 ^ 10)) + ((22 + 128) - 110) + 107;
        lllIIIll[13] = (((43 + 163) - 171) + 135) ^ (((41 + 37) - 27) + 101);
        lllIIIll[14] = 103 ^ 98;
        lllIIIll[15] = 129 ^ 149;
        lllIIIll[16] = 144 ^ 150;
        lllIIIll[17] = -" ".length();
        lllIIIll[18] = (82 ^ 26) ^ (224 ^ 175);
        lllIIIll[19] = 173 ^ 165;
        lllIIIll[20] = " ".length() ^ (170 ^ 162);
        lllIIIll[21] = (7 ^ 41) ^ (9 ^ 42);
        lllIIIll[22] = 172 ^ 166;
        lllIIIll[23] = (-24587) & 27614;
        lllIIIll[24] = (-24797) & 28638;
        lllIIIll[25] = (-12290) & 15315;
        lllIIIll[26] = (-24581) & 28415;
        lllIIIll[27] = (-((-1323) & 30015)) & (-1057) & 32767;
        lllIIIll[28] = (-16647) & 20478;
        lllIIIll[29] = (-((-737) & 5865)) & (-1) & 8143;
        lllIIIll[30] = (-24587) & 28415;
        lllIIIll[31] = (-((-203) & 20731)) & (-1037) & 24574;
        lllIIIll[32] = (-((-21017) & 29213)) & (-16393) & 28413;
        lllIIIll[33] = (-29697) & 32701;
        lllIIIll[34] = (-((-18213) & 22326)) & (-24577) & 32511;
        lllIIIll[35] = (-25673) & 28671;
        lllIIIll[36] = (-((-1099) & 30047)) & (-1) & 32766;
        lllIIIll[37] = (-20545) & 23535;
        lllIIIll[38] = (-20741) & 24559;
        lllIIIll[39] = (-((-809) & 30585)) & (-1) & 32759;
        lllIIIll[40] = (-((-65) & 24667)) & (-5125) & 32702;
        lllIIIll[41] = (-((-18870) & 32247)) & (-37) & 16383;
        lllIIIll[42] = 100 ^ 111;
        lllIIIll[43] = (-((-8969) & 29545)) & (-9229) & 32767;
        lllIIIll[44] = (-20500) & 24319;
        lllIIIll[45] = 132 ^ 136;
        lllIIIll[46] = (-25665) & 28623;
        lllIIIll[47] = 50 ^ 60;
        lllIIIll[48] = 62 ^ 49;
        lllIIIll[49] = 145 ^ 129;
        lllIIIll[50] = 53 ^ 36;
        lllIIIll[51] = (-10567) & 11103;
        lllIIIll[52] = 160 ^ 178;
        lllIIIll[53] = (171 ^ 146) ^ (232 ^ 194);
        lllIIIll[54] = 6 ^ 19;
        lllIIIll[55] = (((118 + 101) - 95) + 10) ^ (((87 + 24) - 80) + 113);
        lllIIIll[56] = 31 ^ 8;
        lllIIIll[57] = 47 ^ 55;
        lllIIIll[58] = 166 ^ 191;
        lllIIIll[59] = (((77 + 143) - 82) + 6) ^ (((48 + 75) - 51) + 66);
        lllIIIll[60] = (29 ^ 126) ^ (198 ^ 190);
        lllIIIll[61] = (29 ^ 67) ^ (237 ^ 175);
        lllIIIll[62] = 116 ^ 105;
        lllIIIll[63] = (53 ^ 86) ^ (112 ^ 13);
        lllIIIll[64] = (-12294) & 15093;
        lllIIIll[65] = (-((-10900) & 27319)) & (-1) & 28399;
        lllIIIll[66] = (-7172) & 32171;
        lllIIIll[67] = (-(138 ^ 187)) & (-16521) & 24575;
        lllIIIll[68] = (45 ^ 29) ^ (79 ^ 87);
        lllIIIll[69] = (-((-4129) & 30843)) & (-4130) & 31743;
        lllIIIll[70] = (-((-875) & 4971)) & (-561) & 278398;
        lllIIIll[71] = 19 ^ 47;
        lllIIIll[72] = (-((-6083) & 16351)) & (-5633) & 16350;
        lllIIIll[73] = (-2434) & 63945;
        lllIIIll[74] = (99 ^ 122) ^ (35 ^ 94);
        lllIIIll[75] = 40 ^ 55;
        lllIIIll[76] = 38 ^ 6;
        lllIIIll[77] = (-((-10373) & 30895)) & (-1025) & 24575;
        lllIIIll[78] = (-((-12809) & 29434)) & (-8193) & 28661;
        lllIIIll[79] = (-29773) & 32766;
        lllIIIll[80] = (-((-20011) & 24127)) & (-16643) & 24575;
        lllIIIll[81] = (-(111 ^ 21)) & (-1025) & 4095;
        lllIIIll[82] = (-20737) & 24557;
        lllIIIll[83] = (-5212) & 8159;
        lllIIIll[84] = (-9130) & 12223;
        lllIIIll[85] = (-85) & 3575;
        lllIIIll[86] = (42 ^ 83) ^ (83 ^ 11);
    }

    private static boolean lIllllIlIlI(int i, int i2) {
        return i == i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lllIIIlI[lllIIIll[75]];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
        if (lIllllIIlII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ac() {
        int[] iArr = new int[lllIIIll[2]];
        iArr[lllIIIll[1]] = lllIIIll[10];
        if (lIllllIIlII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIIIll[2]];
            iArr2[lllIIIll[1]] = lllIIIll[10];
            if (lIllllIllII(Inventory.getFirst(iArr2).getQuantity(), lllIIIll[13])) {
                if (lIllllIIllI(Inventory.contains(C0005f.bg) ? 1 : 0)) {
                    if (lIllllIIlII(Equipment.contains(C0005f.bg) ? 1 : 0)) {
                        int[] iArr3 = new int[lllIIIll[2]];
                        iArr3[lllIIIll[1]] = lllIIIll[0];
                        if (lIllllIIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllIIIll[2]];
                            iArr4[lllIIIll[1]] = lllIIIll[51];
                        }
                    }
                }
                ?? r0 = lllIIIll[2];
                "".length();
                return (((((70 + 46) - 63) + 135) ^ (((94 + 21) - 90) + 122)) & (((((125 + 118) - 174) + 102) ^ (((130 + 97) - 166) + 71)) ^ (-" ".length()))) >= ((220 ^ 164) ^ (119 ^ 11)) ? ((((121 + 28) - 90) + 128) ^ (((107 + 136) - 150) + 84)) & (((113 ^ 11) ^ (47 ^ 95)) ^ (-" ".length())) : r0;
            }
        }
        return lllIIIll[1];
    }

    private static boolean lIllllIlIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIllllIIlll(Object obj) {
        return obj != null;
    }

    private static boolean lIllllIIllI(int i) {
        return i == 0;
    }
}
