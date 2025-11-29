package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.B  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/B.class */
public class B implements W {
    static /* synthetic */ boolean cm;
    public static final /* synthetic */ WorldPoint dG;
    private static /* synthetic */ String[] bR;
    public static final /* synthetic */ WorldPoint dF;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] lIIIlIlll;
    private static /* synthetic */ String[] lIIIlIlIl;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int cl;

    private static boolean lllIIllllll(Object obj) {
        return obj == null;
    }

    private static boolean lllIIllllII(int i) {
        return i > 0;
    }

    private static boolean lllIIlllIll(Object obj) {
        return obj != null;
    }

    private static boolean lllIIllIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIlIIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static void bt() {
        String[] strArr = new String[lIIIlIlll[3]];
        strArr[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[46]];
        if (lllIIllllll(NPCs.getNearest(strArr))) {
            if (lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                if (lllIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo(dF);
                "".length();
                Time.sleepTicks(lIIIlIlll[3]);
                "".length();
            }
            if (lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[47]];
                String[] strArr2 = new String[lIIIlIlll[3]];
                strArr2[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[48]];
                TileObjects.getNearest(strArr2).interact(lIIIlIlIl[lIIIlIlll[0]]);
                Time.sleepTicks(lIIIlIlll[1]);
                "".length();
            }
        }
    }

    private static boolean lllIIlllIII(int i, int i2) {
        return i >= i2;
    }

    private static void lllIIllIlII() {
        lIIIlIlIl = new String[lIIIlIlll[21]];
        lIIIlIlIl[lIIIlIlll[4]] = lllIIlIlllI("ggz4SVnFwYWzwVyjqcHwcmW5CC6RicyBRZV98CP4RKokUenxRbzzUsq7aQqLdjG+", "nWhMl");
        lIIIlIlIl[lIIIlIlll[3]] = lllIIlIlllI("HLBzLpeTRw5R0LZcw+VAmw==", "OMHcg");
        lIIIlIlIl[lIIIlIlll[1]] = lllIIlIlllI("/oi1sr8aCThceVfxWl+j4kgQjpFX/7zD", "RzvXd");
        lIIIlIlIl[lIIIlIlll[12]] = lllIIlIllll("FhN3MigkVjo6KTIfOTR6MAMyIC5hBSIjKi0fMiB2YQUgOi4iHj49PWECOHMYFC8eHR0=", "AvWSZ");
        lIIIlIlIl[lIIIlIlll[7]] = lllIIlIlllI("hhnhMD/2880=", "mYFGx");
        lIIIlIlIl[lIIIlIlll[15]] = lllIIllIIII("Iza2hIXzx06nxvk2a/Pfwg==", "dUrwD");
        lIIIlIlIl[lIIIlIlll[17]] = lllIIlIlllI("OuF8I962eN/4jeNlsKNW+Q==", "iemnA");
        lIIIlIlIl[lIIIlIlll[8]] = lllIIllIIII("qy8xSoe03Ts=", "etAHy");
        lIIIlIlIl[lIIIlIlll[23]] = lllIIlIllll("DT0rMgppNjUnAD0=", "ITYFs");
        lIIIlIlIl[lIIIlIlll[24]] = lllIIlIlllI("7YQTG1aN4d2H+yHXDezZqdE4oRw3elxv", "azwMq");
        lIIIlIlIl[lIIIlIlll[2]] = lllIIllIIII("ihnmRz1l3nw=", "jvZke");
        lIIIlIlIl[lIIIlIlll[30]] = lllIIllIIII("G5jfeOXRJtyx/6mdKSVe3w==", "ZabzK");
        lIIIlIlIl[lIIIlIlll[31]] = lllIIlIllll("CRY/DiUgFGsOIyMSPxU=", "NsKzL");
        lIIIlIlIl[lIIIlIlll[33]] = lllIIlIlllI("AjOwMdWUboY=", "EwVnz");
        lIIIlIlIl[lIIIlIlll[34]] = lllIIlIlllI("n5geQAcVb50=", "TnzeX");
        lIIIlIlIl[lIIIlIlll[36]] = lllIIllIIII("77Tp6skeWQQ=", "qmyRz");
        lIIIlIlIl[lIIIlIlll[35]] = lllIIlIlllI("VY7CecsQrVo=", "GluwC");
        lIIIlIlIl[lIIIlIlll[37]] = lllIIllIIII("IvO4QXJAUV+ECCUjRqWGRA==", "yslAc");
        lIIIlIlIl[lIIIlIlll[38]] = lllIIlIllll("CiYkFxc=", "IJKdr");
        lIIIlIlIl[lIIIlIlll[39]] = lllIIllIIII("M2eer/5Ke19Io4GqlOOTPg==", "NGRcw");
        lIIIlIlIl[lIIIlIlll[40]] = lllIIlIlllI("56XhWlqKIJkOF3vuMHwrsw==", "MeLyI");
        lIIIlIlIl[lIIIlIlll[41]] = lllIIlIlllI("DaA4ryYTmcQ=", "ukdWc");
        lIIIlIlIl[lIIIlIlll[42]] = lllIIlIlllI("abFYelKh+jcKc38ZxbfK5A==", "XMjSS");
        lIIIlIlIl[lIIIlIlll[43]] = lllIIlIllll("LikOLg==", "mFaEJ");
        lIIIlIlIl[lIIIlIlll[44]] = lllIIlIlllI("cGkTbbgF8dQ=", "yCZbC");
        lIIIlIlIl[lIIIlIlll[45]] = lllIIllIIII("7yR1cxMiEc0=", "wWXkf");
        lIIIlIlIl[lIIIlIlll[46]] = lllIIlIlllI("4eTabyAJ1uE=", "BzzYv");
        lIIIlIlIl[lIIIlIlll[47]] = lllIIlIlllI("+ES4P5tYHBgd1T4p0dIyrw==", "VCiJl");
        lIIIlIlIl[lIIIlIlll[48]] = lllIIlIllll("CTo9Bw==", "MURul");
        lIIIlIlIl[lIIIlIlll[0]] = lllIIllIIII("2/M3dkjzkDY=", "JniOT");
        lIIIlIlIl[lIIIlIlll[49]] = lllIIlIllll("HAABaho/WQovAi0=", "YydJu");
        lIIIlIlIl[lIIIlIlll[50]] = lllIIlIlllI("gwB05VKmDoNIFuPkBUbbxw==", "nineu");
        lIIIlIlIl[lIIIlIlll[58]] = lllIIllIIII("gLL6+qcDLNCifxnveYOv3Q==", "mhblo");
        lIIIlIlIl[lIIIlIlll[59]] = lllIIllIIII("cziKINZOygXFwqHA8eEMGKqqjIKc/KI1", "kQPHg");
        lIIIlIlIl[lIIIlIlll[60]] = lllIIllIIII("Bk2K+aahNf8=", "icuLQ");
        lIIIlIlIl[lIIIlIlll[61]] = lllIIllIIII("EnC5pMzxOy4=", "aszzY");
        lIIIlIlIl[lIIIlIlll[62]] = lllIIlIllll("HAMiJTMWEQ==", "xvGIZ");
        lIIIlIlIl[lIIIlIlll[63]] = lllIIlIllll("MQ8vIQc7HQ==", "UzJMn");
        lIIIlIlIl[lIIIlIlll[64]] = lllIIlIllll("KiwEKQMgPg==", "NYaEj");
        lIIIlIlIl[lIIIlIlll[65]] = lllIIllIIII("EyJbmWDqB0U=", "waZRg");
        lIIIlIlIl[lIIIlIlll[56]] = lllIIlIlllI("sXyZCqxEgGA=", "KARTN");
        lIIIlIlIl[lIIIlIlll[66]] = lllIIllIIII("OKUS2OMDOPI=", "kArOH");
        lIIIlIlIl[lIIIlIlll[71]] = lllIIlIlllI("aIdQeqtblK3wsSqIvVoBdHvndfiFI1N2", "wYtiP");
        lIIIlIlIl[lIIIlIlll[72]] = lllIIllIIII("wl5jhkfM0f/L0SnJ4qfVuMleczrQo6eJISxefv8Y8EMCaOsIVRXvAhiwR6BPEsy2", "pFKKy");
        lIIIlIlIl[lIIIlIlll[73]] = lllIIlIlllI("HDxUPZ1DO1oeFaIyBs5hJJQcdBZWPM+asfmdFPtmq3eFAAtnJ/khvBvLomAx4IGC", "FKgND");
        lIIIlIlIl[lIIIlIlll[74]] = lllIIlIllll("MzMCSA==", "jVqfn");
        lIIIlIlIl[lIIIlIlll[75]] = lllIIllIIII("ZNkeFQHqcydhczF290YS5g==", "PaEyo");
        lIIIlIlIl[lIIIlIlll[76]] = lllIIllIIII("WPS7RDQr87iZMqtCtRDVSAu9YI0ilerqxo/MbkND9vaSXjlIms9htg==", "nGPmq");
        lIIIlIlIl[lIIIlIlll[77]] = lllIIlIllll("Kik1IShKZxsncQYmOTYiSyo3czAFICAqcA==", "kGRSQ");
        lIIIlIlIl[lIIIlIlll[78]] = lllIIllIIII("7rtf05ewEJs3qRAtfg/xYNAKr5v17wxz5xn88U/lCDY=", "wTlmo");
    }

    private static String lllIIlIlllI(String lIIIlllIlIllIIl, String lIIIlllIlIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlllIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlllIlIllIll = Cipher.getInstance("Blowfish");
            lIIIlllIlIllIll.init(lIIIlIlll[1], secretKeySpec);
            return new String(lIIIlllIlIllIll.doFinal(Base64.getDecoder().decode(lIIIlllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlllIlIllIlI) {
            lIIIlllIlIllIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lllIlIIIIII(Quests.getState(Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            ?? r0 = lIIIlIlll[3];
            "".length();
            return "   ".length() == ((110 ^ 97) & ((187 ^ 180) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlIlll[4];
    }

    private static String lllIIllIIII(String lIIIlllIllllllI, String lIIIlllIlllllIl) {
        try {
            SecretKeySpec lIIIllllIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlllIlllllIl.getBytes(StandardCharsets.UTF_8)), lIIIlIlll[23]), "DES");
            Cipher lIIIllllIIIIIII = Cipher.getInstance("DES");
            lIIIllllIIIIIII.init(lIIIlIlll[1], lIIIllllIIIIIIl);
            return new String(lIIIllllIIIIIII.doFinal(Base64.getDecoder().decode(lIIIlllIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIlllIlllllll) {
            lIIIlllIlllllll.printStackTrace();
            return null;
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            System.out.println("678: " + C0004e.j(lIIIlIlll[5]));
            bs();
            "".length();
            if (0 != 0) {
                return (72 ^ 13) & ((75 ^ 14) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlIlll[57];
    }

    private static boolean lllIIlllllI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v300, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v322, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    public static void bs() {
        if (lllIIllIllI(C0004e.j(lIIIlIlll[0]), lIIIlIlll[1])) {
            J.cc();
        }
        if (lllIIllIllI(Skills.getLevel(Skill.COOKING), lIIIlIlll[2]) && lllIIllIlll(C0004e.j(lIIIlIlll[0]), lIIIlIlll[1])) {
            ag.dG();
        }
        if (lllIIlllIII(Skills.getLevel(Skill.COOKING), lIIIlIlll[2]) && lllIIllIlll(C0004e.j(lIIIlIlll[0]), lIIIlIlll[1])) {
            if (lllIIlllIIl(bt ? 1 : 0)) {
                C0001b.a(bv);
                if (lllIIllIllI(bv.size(), lIIIlIlll[3])) {
                    System.out.println(lIIIlIlIl[lIIIlIlll[4]]);
                    bt = lIIIlIlll[4];
                }
            }
            if (lllIIlllIlI(bt ? 1 : 0)) {
                if (lllIIlllIlI(ab() ? 1 : 0) && lllIIlllIlI(C0004e.j(lIIIlIlll[5]))) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lllIIlllIll(nearest) && lllIIlllIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[3]];
                        C0000a.a(nearest);
                    }
                    if (lllIIlllIll(nearest) && lllIIlllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lllIIlllIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIIlIlll[6]);
                            "".length();
                        }
                        if (lllIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[1]];
                            if (lllIIllllII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIIlIlll[7]);
                                "".length();
                            }
                            if (lllIIllllII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIIlIlll[1]);
                                "".length();
                            }
                            int[] iArr = new int[lIIIlIlll[8]];
                            iArr[lIIIlIlll[4]] = lIIIlIlll[9];
                            iArr[lIIIlIlll[3]] = lIIIlIlll[10];
                            iArr[lIIIlIlll[1]] = lIIIlIlll[11];
                            iArr[lIIIlIlll[12]] = lIIIlIlll[13];
                            iArr[lIIIlIlll[7]] = lIIIlIlll[14];
                            iArr[lIIIlIlll[15]] = lIIIlIlll[16];
                            iArr[lIIIlIlll[17]] = lIIIlIlll[18];
                            if (lllIIlllIlI(C0004e.b(iArr) ? 1 : 0)) {
                                af();
                                System.out.println(lIIIlIlIl[lIIIlIlll[12]]);
                                bt = lIIIlIlll[3];
                                return;
                            }
                            int[] iArr2 = new int[lIIIlIlll[8]];
                            iArr2[lIIIlIlll[4]] = lIIIlIlll[9];
                            iArr2[lIIIlIlll[3]] = lIIIlIlll[10];
                            iArr2[lIIIlIlll[1]] = lIIIlIlll[11];
                            iArr2[lIIIlIlll[12]] = lIIIlIlll[13];
                            iArr2[lIIIlIlll[7]] = lIIIlIlll[14];
                            iArr2[lIIIlIlll[15]] = lIIIlIlll[16];
                            iArr2[lIIIlIlll[17]] = lIIIlIlll[18];
                            if (lllIIlllIIl(C0004e.b(iArr2) ? 1 : 0)) {
                                C0000a.a(lIIIlIlll[9], lIIIlIlll[2]);
                                C0000a.a(lIIIlIlll[10], lIIIlIlll[2]);
                                C0000a.a(lIIIlIlll[11], lIIIlIlll[3]);
                                C0000a.a(lIIIlIlll[13], lIIIlIlll[3]);
                                C0000a.a(lIIIlIlll[14], lIIIlIlll[3]);
                                C0000a.a(lIIIlIlll[16], lIIIlIlll[3]);
                                C0000a.a(lIIIlIlll[18], lIIIlIlll[3]);
                                C0000a.a(lIIIlIlll[19], lIIIlIlll[1]);
                                C0000a.a(lIIIlIlll[20], lIIIlIlll[6]);
                            }
                        }
                    }
                }
                if (lllIIlllIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lllIIllIllI(Movement.getRunEnergy(), lIIIlIlll[21])) {
                    Inventory.getFirst(C0005f.aV).interact(lIIIlIlIl[lIIIlIlll[7]]);
                    Time.sleepTicks(lIIIlIlll[3]);
                    "".length();
                }
                if (lllIIlllIlI(C0004e.j(lIIIlIlll[5])) && lllIIlllIIl(ab() ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[15]];
                    if (lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                        if (lllIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(dF);
                        "".length();
                        Time.sleepTicks(lIIIlIlll[3]);
                        "".length();
                    }
                    if (lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                        AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[17]];
                        C0006g.a(lIIIlIlIl[lIIIlIlll[8]], bR);
                    }
                }
                if (lllIIllIlll(C0004e.j(lIIIlIlll[5]), lIIIlIlll[3])) {
                    int[] iArr3 = new int[lIIIlIlll[3]];
                    iArr3[lIIIlIlll[4]] = lIIIlIlll[22];
                    if (lllIIlllIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                        String[] strArr = new String[lIIIlIlll[3]];
                        strArr[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[23]];
                        if (lllIIlllIlI(Inventory.contains(strArr) ? 1 : 0)) {
                            cl = lIIIlIlll[4];
                            if (lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dG), lIIIlIlll[7])) {
                                AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[24]];
                                WorldArea worldArea = new WorldArea(lIIIlIlll[25], lIIIlIlll[26], lIIIlIlll[27], lIIIlIlll[28], lIIIlIlll[4]);
                                if (lllIIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lllIIlllIIl(Inventory.contains(item -> {
                                        return item.getName().contains(lIIIlIlIl[lIIIlIlll[66]]);
                                    }) ? 1 : 0) && lllIIlllIlI(Equipment.contains(item2 -> {
                                        return item2.getName().contains(lIIIlIlIl[lIIIlIlll[56]]);
                                    }) ? 1 : 0)) {
                                        Inventory.getFirst(item3 -> {
                                            return item3.getName().contains(lIIIlIlIl[lIIIlIlll[65]]);
                                        }).interact(lIIIlIlIl[lIIIlIlll[2]]);
                                    }
                                    if (lllIIlllIIl(Equipment.contains(item4 -> {
                                        return item4.getName().contains(lIIIlIlIl[lIIIlIlll[64]]);
                                    }) ? 1 : 0) && lllIIllIlll(Players.getLocal().getAnimation(), lIIIlIlll[29])) {
                                        Equipment.getFirst(item5 -> {
                                            return item5.getName().contains(lIIIlIlIl[lIIIlIlll[63]]);
                                        }).interact(lIIIlIlIl[lIIIlIlll[30]]);
                                        Time.sleepTicks(lIIIlIlll[7]);
                                        "".length();
                                    }
                                }
                                if (lllIIlllIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo(dG);
                                    "".length();
                                    Time.sleepTicks(lIIIlIlll[3]);
                                    "".length();
                                }
                            }
                            if (lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dG), lIIIlIlll[7])) {
                                AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[31]];
                                if (lllIIlllIIl(Widgets.get(lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                    String[] strArr2 = new String[lIIIlIlll[3]];
                                    strArr2[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[33]];
                                    NPCs.getNearest(strArr2).interact(lIIIlIlIl[lIIIlIlll[34]]);
                                    Time.sleepTicks(lIIIlIlll[12]);
                                    "".length();
                                }
                                if (lllIIlllIlI(Widgets.get(lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(lIIIlIlll[32], lIIIlIlll[35], lIIIlIlll[3]).interact(lIIIlIlIl[lIIIlIlll[36]]);
                                    Time.sleepTicks(lIIIlIlll[1]);
                                    "".length();
                                }
                                int[] iArr4 = new int[lIIIlIlll[3]];
                                iArr4[lIIIlIlll[4]] = lIIIlIlll[22];
                                if (lllIIlllIIl(Inventory.contains(iArr4) ? 1 : 0) && lllIIlllIlI(Widgets.get(lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(lIIIlIlll[32], lIIIlIlll[3], lIIIlIlll[30]).interact(lIIIlIlIl[lIIIlIlll[35]]);
                                    Time.sleepTicks(lIIIlIlll[3]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIIIlIlll[3]];
                    iArr5[lIIIlIlll[4]] = lIIIlIlll[22];
                    if (lllIIlllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        String[] strArr3 = new String[lIIIlIlll[3]];
                        strArr3[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[37]];
                        if (lllIIlllIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIlIlll[3]];
                            iArr6[lIIIlIlll[4]] = lIIIlIlll[22];
                            if (lllIIlllIIl(Inventory.contains(iArr6) ? 1 : 0) && lllIIlllIlI(Widgets.get(lIIIlIlll[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get(lIIIlIlll[32], lIIIlIlll[3], lIIIlIlll[30]).interact(lIIIlIlIl[lIIIlIlll[38]]);
                                Time.sleepTicks(lIIIlIlll[3]);
                                "".length();
                            }
                            int[] iArr7 = new int[lIIIlIlll[3]];
                            iArr7[lIIIlIlll[4]] = lIIIlIlll[18];
                            Item first = Inventory.getFirst(iArr7);
                            String[] strArr4 = new String[lIIIlIlll[3]];
                            strArr4[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[39]];
                            first.useOn(Inventory.getFirst(strArr4));
                            Time.sleepTicks(lIIIlIlll[1]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lIIIlIlll[3]];
                    strArr5[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[40]];
                    if (lllIIlllIIl(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (lllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                            if (lllIIlllIIl(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (lllIIlllIIl(Inventory.contains(item6 -> {
                                return item6.getName().contains(lIIIlIlIl[lIIIlIlll[62]]);
                            }) ? 1 : 0) && lllIIlllIlI(Equipment.contains(item7 -> {
                                return item7.getName().contains(lIIIlIlIl[lIIIlIlll[61]]);
                            }) ? 1 : 0)) {
                                Inventory.getFirst(item8 -> {
                                    return item8.getName().contains(lIIIlIlIl[lIIIlIlll[60]]);
                                }).interact(lIIIlIlIl[lIIIlIlll[41]]);
                                Time.sleepTicks(lIIIlIlll[1]);
                                "".length();
                            }
                            Movement.walkTo(dF);
                            "".length();
                            Time.sleepTicks(lIIIlIlll[3]);
                            "".length();
                        }
                        if (lllIIlllllI(Players.getLocal().getWorldLocation().distanceTo(dF), lIIIlIlll[12])) {
                            AccBuilderEasyClues.c = lIIIlIlIl[lIIIlIlll[42]];
                            if (lllIIllIllI(cl, lIIIlIlll[3])) {
                                an.om += lIIIlIlll[3];
                                an.o(AccBuilderEasyClues.m);
                                cl += lIIIlIlll[3];
                                an.om = lIIIlIlll[4];
                                cm = lIIIlIlll[4];
                            }
                            C0006g.a(lIIIlIlIl[lIIIlIlll[43]], bR);
                        }
                    }
                }
                if (lllIIllIlll(C0004e.j(lIIIlIlll[5]), lIIIlIlll[1])) {
                    String[] strArr6 = new String[lIIIlIlll[3]];
                    strArr6[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[44]];
                    TileObjects.getNearest(strArr6).interact(lIIIlIlIl[lIIIlIlll[45]]);
                    Time.sleepTicks(lIIIlIlll[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean lllIIllllIl(int i, int i2) {
        return i > i2;
    }

    private static String lllIIlIllll(String lIIIlllIllIlllI, String lIIIlllIllIllIl) {
        String lIIIlllIllIlllI2 = new String(Base64.getDecoder().decode(lIIIlllIllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIIIlllIllIllIl.toCharArray();
        int lIIIlllIllIlIlI = lIIIlIlll[4];
        char[] charArray2 = lIIIlllIllIlllI2.toCharArray();
        int lIIIlllIllIIIll = charArray2.length;
        int i = lIIIlIlll[4];
        while (lllIIllIllI(i, lIIIlllIllIIIll)) {
            char lIIIlllIllIllll = charArray2[i];
            sb.append((char) (lIIIlllIllIllll ^ charArray[lIIIlllIllIlIlI % charArray.length]));
            "".length();
            lIIIlllIllIlIlI++;
            i++;
            "".length();
            if ((((99 ^ 94) ^ (222 ^ 186)) & (((123 ^ 15) ^ (99 ^ 78)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIIllIllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01f7, code lost:
        if (lllIIllIllI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.B.lIIIlIlll[2]) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2 = new int[lIIIlIlll[3]];
        iArr2[lIIIlIlll[4]] = lIIIlIlll[19];
        if (lllIIlllIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlll[19], lIIIlIlll[2], C0008i.bq));
            "".length();
        }
        int[] iArr3 = new int[lIIIlIlll[3]];
        iArr3[lIIIlIlll[4]] = lIIIlIlll[11];
        if (lllIIlllIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlll[11], lIIIlIlll[3], lIIIlIlll[51]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlIlll[3]];
        iArr4[lIIIlIlll[4]] = lIIIlIlll[14];
        if (lllIIlllIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlll[14], lIIIlIlll[3], lIIIlIlll[51]));
            "".length();
        }
        int[] iArr5 = new int[lIIIlIlll[3]];
        iArr5[lIIIlIlll[4]] = lIIIlIlll[18];
        if (lllIIlllIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlll[18], lIIIlIlll[3], lIIIlIlll[51]));
            "".length();
        }
        int[] iArr6 = new int[lIIIlIlll[3]];
        iArr6[lIIIlIlll[4]] = lIIIlIlll[16];
        if (lllIIlllIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlll[16], lIIIlIlll[3], lIIIlIlll[51]));
            "".length();
        }
        int[] iArr7 = new int[lIIIlIlll[3]];
        iArr7[lIIIlIlll[4]] = lIIIlIlll[13];
        if (lllIIlllIlI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlll[13], lIIIlIlll[3], lIIIlIlll[52]));
            "".length();
        }
        int[] iArr8 = new int[lIIIlIlll[3]];
        iArr8[lIIIlIlll[4]] = lIIIlIlll[10];
        if (lllIIlllIIl(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIIIlIlll[3]];
            iArr9[lIIIlIlll[4]] = lIIIlIlll[10];
            if (lllIIlllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIIIlIlll[3]];
                iArr10[lIIIlIlll[4]] = lIIIlIlll[10];
            }
            if (lllIIlllIlI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIlIlIl[lIIIlIlll[59]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIIIlIlll[54], lIIIlIlll[15], lIIIlIlll[55]));
                "".length();
            }
            iArr = new int[lIIIlIlll[3]];
            iArr[lIIIlIlll[4]] = lIIIlIlll[9];
            if (lllIIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[lIIIlIlll[3]];
                iArr11[lIIIlIlll[4]] = lIIIlIlll[9];
                if (!lllIIlllIIl(Bank.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIIIlIlll[3]];
                iArr12[lIIIlIlll[4]] = lIIIlIlll[9];
                if (!lllIIllIllI(Bank.getFirst(iArr12).getQuantity(), lIIIlIlll[2])) {
                    return;
                }
            }
            bv.add(new C0003d(lIIIlIlll[9], lIIIlIlll[56], lIIIlIlll[52]));
            "".length();
        }
        bv.add(new C0003d(lIIIlIlll[10], lIIIlIlll[2], lIIIlIlll[53]));
        "".length();
        if (lllIIlllIlI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIlIlIl[lIIIlIlll[59]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIIIlIlll[3]];
        iArr[lIIIlIlll[4]] = lIIIlIlll[9];
        if (lllIIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIlIlll[9], lIIIlIlll[56], lIIIlIlll[52]));
        "".length();
    }

    private static void lllIIllIlIl() {
        lIIIlIlll = new int[79];
        lIIIlIlll[0] = 26 ^ 7;
        lIIIlIlll[1] = "  ".length();
        lIIIlIlll[2] = (62 ^ 59) ^ (45 ^ 34);
        lIIIlIlll[3] = " ".length();
        lIIIlIlll[4] = (141 ^ 173) & ((17 ^ 49) ^ (-1));
        lIIIlIlll[5] = (-6474) & 7151;
        lIIIlIlll[6] = (-16450) & 21449;
        lIIIlIlll[7] = (((26 + 98) - 107) + 113) ^ (((74 + 36) - 49) + 73);
        lIIIlIlll[8] = (((2 + 139) - 89) + 145) ^ (((128 + 3) - 94) + 157);
        lIIIlIlll[9] = (-24593) & 32599;
        lIIIlIlll[10] = (-(((60 + 110) - 40) + 3)) & (-16403) & 24542;
        lIIIlIlll[11] = (-((-869) & 18278)) & (-4101) & 24061;
        lIIIlIlll[12] = "   ".length();
        lIIIlIlll[13] = ((39 + 80) - (-38)) + 64;
        lIIIlIlll[14] = (-((-6725) & 31301)) & (-2059) & 28543;
        lIIIlIlll[15] = " ".length() ^ (188 ^ 184);
        lIIIlIlll[16] = (-9691) & 11774;
        lIIIlIlll[17] = 150 ^ 144;
        lIIIlIlll[18] = (-((-4755) & 29367)) & (-2177) & 27380;
        lIIIlIlll[19] = (-2561) & 15185;
        lIIIlIlll[20] = (-12317) & 13311;
        lIIIlIlll[21] = (241 ^ 186) ^ (54 ^ 79);
        lIIIlIlll[22] = (-((-6470) & 8007)) & (-12329) & 16383;
        lIIIlIlll[23] = 178 ^ 186;
        lIIIlIlll[24] = (94 ^ 40) ^ (((47 + 21) - (-54)) + 5);
        lIIIlIlll[25] = (-((-23261) & 31711)) & (-21025) & 32767;
        lIIIlIlll[26] = (-((-21845) & 22494)) & (-1) & 3839;
        lIIIlIlll[27] = 92 ^ 42;
        lIIIlIlll[28] = ((117 + 103) - 176) + 93;
        lIIIlIlll[29] = -" ".length();
        lIIIlIlll[30] = 69 ^ 78;
        lIIIlIlll[31] = 190 ^ 178;
        lIIIlIlll[32] = (-19073) & 19372;
        lIIIlIlll[33] = (212 ^ 181) ^ (228 ^ 136);
        lIIIlIlll[34] = (118 ^ 0) ^ (6 ^ 126);
        lIIIlIlll[35] = (((176 + 157) - 237) + 92) ^ (((160 + 56) - 180) + 136);
        lIIIlIlll[36] = 19 ^ 28;
        lIIIlIlll[37] = (97 ^ 65) ^ (127 ^ 78);
        lIIIlIlll[38] = (23 ^ 45) ^ (147 ^ 187);
        lIIIlIlll[39] = (244 ^ 195) ^ (50 ^ 22);
        lIIIlIlll[40] = 178 ^ 166;
        lIIIlIlll[41] = (((98 + 114) - 157) + 90) ^ (((84 + 55) - 18) + 11);
        lIIIlIlll[42] = 85 ^ 67;
        lIIIlIlll[43] = (((88 + 31) - 88) + 97) ^ (((100 + 46) - 6) + 11);
        lIIIlIlll[44] = (((93 + 74) - 130) + 146) ^ (((118 + 25) - 37) + 69);
        lIIIlIlll[45] = 74 ^ 83;
        lIIIlIlll[46] = (((126 + 53) - 27) + 17) ^ (((109 + 66) - 158) + 162);
        lIIIlIlll[47] = (65 ^ 96) ^ (9 ^ 51);
        lIIIlIlll[48] = 4 ^ 24;
        lIIIlIlll[49] = 50 ^ 44;
        lIIIlIlll[50] = 144 ^ 143;
        lIIIlIlll[51] = (-23622) & 32621;
        lIIIlIlll[52] = (-29699) & 30598;
        lIIIlIlll[53] = (-14338) & 16237;
        lIIIlIlll[54] = (-((-11841) & 32356)) & (-257) & 32751;
        lIIIlIlll[55] = (-((-27151) & 31327)) & (-1030) & 30205;
        lIIIlIlll[56] = (121 ^ 124) ^ (170 ^ 135);
        lIIIlIlll[57] = (((63 + 148) - 185) + 137) ^ (((198 + 127) - 130) + 4);
        lIIIlIlll[58] = (159 ^ 136) ^ (30 ^ 41);
        lIIIlIlll[59] = 84 ^ 117;
        lIIIlIlll[60] = 55 ^ 21;
        lIIIlIlll[61] = 144 ^ 179;
        lIIIlIlll[62] = (((75 + 51) - 1) + 18) ^ (((12 + 142) - 72) + 89);
        lIIIlIlll[63] = 51 ^ 22;
        lIIIlIlll[64] = 182 ^ 144;
        lIIIlIlll[65] = 30 ^ 57;
        lIIIlIlll[66] = 34 ^ 11;
        lIIIlIlll[67] = (-((-5317) & 14061)) & (-4177) & 16127;
        lIIIlIlll[68] = (-((-2961) & 15345)) & (-17) & 15614;
        lIIIlIlll[69] = (-12994) & 16375;
        lIIIlIlll[70] = (-((-97) & 29549)) & (-49) & 32767;
        lIIIlIlll[71] = (71 ^ 114) ^ (189 ^ 162);
        lIIIlIlll[72] = 165 ^ 142;
        lIIIlIlll[73] = (((63 + 139) - 42) + 9) ^ (((25 + 33) - (-28)) + 47);
        lIIIlIlll[74] = 116 ^ 89;
        lIIIlIlll[75] = 17 ^ 63;
        lIIIlIlll[76] = 31 ^ 48;
        lIIIlIlll[77] = 26 ^ 42;
        lIIIlIlll[78] = (((63 + 12) - (-80)) + 33) ^ (((62 + 115) - 172) + 136);
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIIlIlIl[lIIIlIlll[58]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        String[] strArr = new String[lIIIlIlll[3]];
        strArr[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[49]];
        if (lllIIllllII(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIIIlIlll[3]];
            iArr[lIIIlIlll[4]] = lIIIlIlll[14];
            if (lllIIllllII(Inventory.getCount(iArr))) {
                String[] strArr2 = new String[lIIIlIlll[3]];
                strArr2[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[50]];
                if (lllIIlllIIl(Inventory.contains(strArr2) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIlIlll[3]];
                    iArr2[lIIIlIlll[4]] = lIIIlIlll[18];
                    if (lllIIlllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIIIlIlll[3]];
                        iArr3[lIIIlIlll[4]] = lIIIlIlll[11];
                        if (lllIIlllIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            ?? r0 = lIIIlIlll[3];
                            "".length();
                            return " ".length() < 0 ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
                        }
                    }
                }
            }
        }
        return lIIIlIlll[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIIlIlll[4];
    }

    static {
        lllIIllIlIl();
        lllIIllIlII();
        dF = new WorldPoint(lIIIlIlll[67], lIIIlIlll[68], lIIIlIlll[4]);
        dG = new WorldPoint(lIIIlIlll[69], lIIIlIlll[70], lIIIlIlll[4]);
        bv = new ArrayList();
        String[] strArr = new String[lIIIlIlll[23]];
        strArr[lIIIlIlll[4]] = lIIIlIlIl[lIIIlIlll[71]];
        strArr[lIIIlIlll[3]] = lIIIlIlIl[lIIIlIlll[72]];
        strArr[lIIIlIlll[1]] = lIIIlIlIl[lIIIlIlll[73]];
        strArr[lIIIlIlll[12]] = lIIIlIlIl[lIIIlIlll[74]];
        strArr[lIIIlIlll[7]] = lIIIlIlIl[lIIIlIlll[75]];
        strArr[lIIIlIlll[15]] = lIIIlIlIl[lIIIlIlll[76]];
        strArr[lIIIlIlll[17]] = lIIIlIlIl[lIIIlIlll[77]];
        strArr[lIIIlIlll[8]] = lIIIlIlIl[lIIIlIlll[78]];
        bR = strArr;
    }

    private static boolean lllIIlllIIl(int i) {
        return i != 0;
    }

    private static boolean lllIIlllIlI(int i) {
        return i == 0;
    }
}
