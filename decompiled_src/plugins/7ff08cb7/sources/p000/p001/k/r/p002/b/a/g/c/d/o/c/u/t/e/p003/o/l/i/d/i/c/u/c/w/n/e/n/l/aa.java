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
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.aa  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/aa.class */
public class aa implements ab {
    static /* synthetic */ boolean dl;
    private static final /* synthetic */ WorldPoint lV;
    public static final /* synthetic */ String[] lR;
    public static /* synthetic */ List<C0003d> bx;
    static /* synthetic */ int cI;
    static /* synthetic */ int dk;
    private static /* synthetic */ String[] llIlllllI;
    private static final /* synthetic */ WorldPoint lT;
    private static final /* synthetic */ WorldPoint lW;
    private static final /* synthetic */ WorldPoint lS;
    public static /* synthetic */ long g;
    private static final /* synthetic */ WorldPoint lX;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ int[] lllIIIIII;
    private static final /* synthetic */ WorldPoint lU;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIIIIII[0];
    }

    private static int lIlllllIIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (lIllllllIIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[18])) {
            int[] iArr = new int[lllIIIIII[1]];
            iArr[lllIIIIII[0]] = lllIIIIII[38];
            if (lIlllllIlIll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lllIIIIII[1];
                "".length();
                return 0 != 0 ? ((54 ^ 65) ^ (123 ^ 20)) & (((((76 + 114) - 77) + 106) ^ (((162 + 35) - 112) + 110)) ^ (-" ".length())) : r0;
            }
        }
        return lllIIIIII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean an() {
        String[] strArr = new String[lllIIIIII[1]];
        strArr[lllIIIIII[0]] = llIlllllI[lllIIIIII[45]];
        if (lIlllllIlIIl(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lllIIIIII[1]];
            iArr[lllIIIIII[0]] = lllIIIIII[4];
            if (lIlllllIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lllIIIIII[1];
                "".length();
                return ((119 ^ 42) & ((112 ^ 45) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lllIIIIII[0];
    }

    private static boolean lIllllllIIlI(int i, int i2) {
        return i >= i2;
    }

    private static void lIllllIlIIlI() {
        llIlllllI = new String[lllIIIIII[88]];
        llIlllllI[lllIIIIII[0]] = lIllllIIIIIl("jih1dXP9PSJS/Z+HJi/yhQ==", "mvAfI");
        llIlllllI[lllIIIIII[1]] = lIllllIIIIlI("JSQPByoLKAVOOxY0CAA+QyQVCzQQYUEdLgo5AgYwDSpBDDgAJkEaNkM8FAsqFw==", "cManY");
        llIlllllI[lllIIIIII[3]] = lIllllIIIIlI("LxMxKxE=", "kaXEz");
        llIlllllI[lllIIIIII[5]] = lIllllIIIIIl("vOp2fXcHOZI=", "mfJjI");
        llIlllllI[lllIIIIII[6]] = lIllllIIIIll("3tZAan6VTKp8HSSWYHyCRQ==", "GriYm");
        llIlllllI[lllIIIIII[7]] = lIllllIIIIIl("d2yI9dgPQSJFvQokVh90bVkT9UbvKjMe", "lwdzW");
        llIlllllI[lllIIIIII[9]] = lIllllIIIIlI("JylIAiUVbAUKJAMlBgR3ATkNECNQPx0TJxwlDRB7UD8fCiMTJAENMFA4B0MVJRUhLRA=", "pLhcW");
        llIlllllI[lllIIIIII[17]] = lIllllIIIIlI("ABglbxEhWSA7BDwN", "NySOe");
        llIlllllI[lllIIIIII[18]] = lIllllIIIIlI("ESQyMQg5KTJ0FCgp", "XJFTz");
        llIlllllI[lllIIIIII[19]] = lIllllIIIIlI("ID4BAQ==", "dLnqK");
        llIlllllI[lllIIIIII[15]] = lIllllIIIIIl("jWhgna+xRnc=", "nDPkx");
        llIlllllI[lllIIIIII[20]] = lIllllIIIIlI("GQsEKjo4CwRrOi4LDicl", "MyaKI");
        llIlllllI[lllIIIIII[21]] = lIllllIIIIIl("axrl1TuPxTQ=", "VcScK");
        llIlllllI[lllIIIIII[22]] = lIllllIIIIll("tRgacFRG4gQ=", "qKmIf");
        llIlllllI[lllIIIIII[23]] = lIllllIIIIll("kdseWlTfz7lhW4rsnOBpaw==", "CEaWt");
        llIlllllI[lllIIIIII[24]] = lIllllIIIIIl("ql5jpBl8tFY=", "CAglw");
        llIlllllI[lllIIIIII[25]] = lIllllIIIIlI("Lggx", "jaVEq");
        llIlllllI[lllIIIIII[26]] = lIllllIIIIll("62X1fRZ+G8by7pNGwNZwWQ==", "GCCkj");
        llIlllllI[lllIIIIII[27]] = lIllllIIIIll("iLuHUecLeX4=", "ChTjJ");
        llIlllllI[lllIIIIII[28]] = lIllllIIIIIl("LB/sPoQrZQ0=", "UxxqD");
        llIlllllI[lllIIIIII[29]] = lIllllIIIIlI("Fio4ZTM3ayosIHh4", "XKNEG");
        llIlllllI[lllIIIIII[30]] = lIllllIIIIll("Cji59X7OTqg=", "SKxGe");
        llIlllllI[lllIIIIII[31]] = lIllllIIIIll("Rl5AjZ0985A=", "GHghn");
        llIlllllI[lllIIIIII[32]] = lIllllIIIIll("/xDOWnhWDn9xyqpodQdYiw==", "JuTfn");
        llIlllllI[lllIIIIII[33]] = lIllllIIIIll("mtk4+2xip8w=", "KQNQc");
        llIlllllI[lllIIIIII[34]] = lIllllIIIIIl("Fc2kjY7RWgg=", "OLyMt");
        llIlllllI[lllIIIIII[35]] = lIllllIIIIll("tTHxhfqtTfkS23XW4Xt2AXbCNKUyEMNC", "RkUrg");
        llIlllllI[lllIIIIII[36]] = lIllllIIIIlI("AgckFRYqCiRQCjsK", "KiPpd");
        llIlllllI[lllIIIIII[37]] = lIllllIIIIIl("FVxbnD8j/3k=", "BYJwh");
        llIlllllI[lllIIIIII[40]] = lIllllIIIIIl("IfMt2fgb2+yW4UMQNb7BlA==", "qcarA");
        llIlllllI[lllIIIIII[41]] = lIllllIIIIll("iRrQDtpWL8c=", "rObrO");
        llIlllllI[lllIIIIII[42]] = lIllllIIIIll("IzjMKf3Wr3Co/baIphEulYR5c3a4rcwj", "cUFLI");
        llIlllllI[lllIIIIII[43]] = lIllllIIIIIl("NN2teb0Yg/k=", "BqWNA");
        llIlllllI[lllIIIIII[44]] = lIllllIIIIIl("g76FecHisaA=", "kuLUR");
        llIlllllI[lllIIIIII[45]] = lIllllIIIIlI("ER04KBI=", "BmYLw");
        llIlllllI[lllIIIIII[55]] = lIllllIIIIlI("LlUYIjwdBlU3JhNVBjMhAlUENisFAQ==", "vuuCN");
        llIlllllI[lllIIIIII[56]] = lIllllIIIIll("eXKhgfafJvAtyIKuzC5leWj3potrKUsq", "GmTZA");
        llIlllllI[lllIIIIII[57]] = lIllllIIIIlI("Jw02Kj04", "PhWFI");
        llIlllllI[lllIIIIII[58]] = lIllllIIIIIl("JcXZOx1PvrM=", "PgnNL");
        llIlllllI[lllIIIIII[59]] = lIllllIIIIlI("HhcmBTwB", "irGiH");
        llIlllllI[lllIIIIII[53]] = lIllllIIIIIl("LFfFB/coEJw=", "dGJCP");
        llIlllllI[lllIIIIII[60]] = lIllllIIIIlI("NTgbNig=", "RTtDQ");
        llIlllllI[lllIIIIII[61]] = lIllllIIIIlI("JCkCJgo=", "CEmTs");
        llIlllllI[lllIIIIII[62]] = lIllllIIIIIl("oTa+iyp8AneVgUOcCkCvaruTDR2QweXyE1ieHTshpAg=", "AStAa");
        llIlllllI[lllIIIIII[63]] = lIllllIIIIll("VqqJGtEpiROThXvqdkCRULiv2HHo+0UtGedcO8kEnOfjdzpC9Ksz7w==", "YNdKr");
        llIlllllI[lllIIIIII[64]] = lIllllIIIIIl("HCDcVfbZCg1Vi8bfHlC7uTjUxEk0HCv4", "dLEWX");
        llIlllllI[lllIIIIII[65]] = lIllllIIIIIl("wiow8QhQZiE=", "gyQNv");
        llIlllllI[lllIIIIII[66]] = lIllllIIIIIl("o12BHVyXpIhhzz59QdheJCxYsO37RfAznp8Q48WJFHk=", "mAFxo");
        llIlllllI[lllIIIIII[67]] = lIllllIIIIlI("HB5lTy42AWkCJ3MdLAMycwEhCix9", "SuIoB");
        llIlllllI[lllIIIIII[68]] = lIllllIIIIlI("DjstPQQ6ehgwEy05MnUSLTQtdQwtei06QTw7NT5BPDV5LA49dA==", "HZYUa");
        llIlllllI[lllIIIIII[69]] = lIllllIIIIlI("HgtzJFcxASB3FnYJPDgEIk48NgI4Gj05EHYGPSRXMRw1IRIvDyYzWQ==", "VnTWw");
        llIlllllI[lllIIIIII[70]] = lIllllIIIIll("km+tlWeE+1ZP5eG52sy61MgwXdJCluJXt5NVB/Vca0j5HbHTXKwXeA==", "icOfm");
        llIlllllI[lllIIIIII[71]] = lIllllIIIIlI("FDceFVc=", "GBlpy");
        llIlllllI[lllIIIIII[72]] = lIllllIIIIlI("HlQ+VAAyEiEdGTBTMhpXNh4mGBIjUzwSVzAbPAcDdwAjERY8Ug==", "WsStw");
        llIlllllI[lllIIIIII[73]] = lIllllIIIIIl("yZ2KEV6EvJv4Hr8kKK9zUQ==", "yiSQX");
        llIlllllI[lllIIIIII[48]] = lIllllIIIIIl("bgiDMrPb471Mgn4N68UqIQ==", "QSwCF");
        llIlllllI[lllIIIIII[74]] = lIllllIIIIlI("KEQ0cz0ODDI6PwZDPzwjQQJ5IiQEEC19", "acYSQ");
        llIlllllI[lllIIIIII[75]] = lIllllIIIIlI("Ei8vWiZxJiQWH24=", "QNAzo");
    }

    private static boolean lIlllllIlllI(Object obj) {
        return obj != null;
    }

    private static String lIllllIIIIll(String llllllIIIIlll, String llllllIIIIllI) {
        try {
            SecretKeySpec llllllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllIIIlIIl = Cipher.getInstance("Blowfish");
            llllllIIIlIIl.init(lllIIIIII[3], llllllIIIlIlI);
            return new String(llllllIIIlIIl.doFinal(Base64.getDecoder().decode(llllllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIIIlIII) {
            llllllIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIIII(int i, int i2) {
        return i <= i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            dQ();
            "".length();
            if (" ".length() > "   ".length()) {
                return ((((78 + 91) - 38) + 27) ^ (((149 + 50) - 135) + 88)) & (((248 ^ 145) ^ (91 ^ 52)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIIIIII[54];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v356, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v401, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v61, types: [boolean] */
    public static void dQ() {
        if (lIlllllIlIIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIlllllI[lllIIIIII[0]];
            C0001b.a(bx);
            if (lIlllllIlIlI(bx.size(), lllIIIIII[1])) {
                System.out.println(llIlllllI[lllIIIIII[1]]);
                bv = lllIIIIII[0];
            }
        }
        if (lIlllllIlIll(bv ? 1 : 0)) {
            if (lIlllllIlIIl(Inventory.contains(C0005f.bc) ? 1 : 0) && lIlllllIlIlI(Movement.getRunEnergy(), lllIIIIII[2])) {
                Inventory.getFirst(C0005f.bc).interact(llIlllllI[lllIIIIII[3]]);
                Time.sleepTicks(lllIIIIII[1]);
                "".length();
            }
            if (lIlllllIllII(lIlllllIIllI(C0004e.w(), 70.0d))) {
                int[] iArr = new int[lllIIIIII[1]];
                iArr[lllIIIIII[0]] = lllIIIIII[4];
                if (lIlllllIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lllIIIIII[1]];
                    iArr2[lllIIIIII[0]] = lllIIIIII[4];
                    Inventory.getFirst(iArr2).interact(llIlllllI[lllIIIIII[5]]);
                }
            }
            if (lIlllllIlIll(Movement.isRunEnabled() ? 1 : 0) && lIlllllIllIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlllllIlIll(an() ? 1 : 0) && lIlllllIlIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlllllIlllI(nearest) && lIlllllIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lllIIIIII[3]);
                    "".length();
                }
                if (lIlllllIlllI(nearest) && lIlllllIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[7]];
                    if (lIlllllIlIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIIII[8]);
                        "".length();
                    }
                    if (lIlllllIlIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIlllllIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIIII[6]);
                            "".length();
                        }
                        if (lIlllllIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIIIII[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lllIIIIII[9]];
                        iArr3[lllIIIIII[0]] = lllIIIIII[10];
                        iArr3[lllIIIIII[1]] = lllIIIIII[11];
                        iArr3[lllIIIIII[3]] = lllIIIIII[12];
                        iArr3[lllIIIIII[5]] = lllIIIIII[13];
                        iArr3[lllIIIIII[6]] = lllIIIIII[4];
                        iArr3[lllIIIIII[7]] = lllIIIIII[14];
                        if (lIlllllIlIll(C0004e.d(iArr3) ? 1 : 0)) {
                            Q();
                            System.out.println(llIlllllI[lllIIIIII[9]]);
                            bv = lllIIIIII[1];
                            return;
                        }
                        int[] iArr4 = new int[lllIIIIII[9]];
                        iArr4[lllIIIIII[0]] = lllIIIIII[10];
                        iArr4[lllIIIIII[1]] = lllIIIIII[11];
                        iArr4[lllIIIIII[3]] = lllIIIIII[12];
                        iArr4[lllIIIIII[5]] = lllIIIIII[13];
                        iArr4[lllIIIIII[6]] = lllIIIIII[4];
                        iArr4[lllIIIIII[7]] = lllIIIIII[14];
                        if (lIlllllIlIIl(C0004e.d(iArr4) ? 1 : 0)) {
                            Bank.withdraw(lllIIIIII[11], lllIIIIII[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllIIIIII[1]);
                            "".length();
                            Bank.withdraw(lllIIIIII[14], lllIIIIII[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllIIIIII[1]);
                            "".length();
                            Bank.withdraw(lllIIIIII[16], lllIIIIII[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllIIIIII[1]);
                            "".length();
                            Bank.withdraw(lllIIIIII[13], lllIIIIII[7], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllIIIIII[1]);
                            "".length();
                            Bank.withdraw(lllIIIIII[10], lllIIIIII[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lllIIIIII[1]);
                            "".length();
                            C0000a.b(C0005f.bc, lllIIIIII[6]);
                            C0000a.a(lllIIIIII[4], lllIIIIII[15]);
                            C0000a.b(C0005f.bm, lllIIIIII[1]);
                        }
                    }
                }
            }
            if (lIlllllIlIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && lIlllllIlIIl(an() ? 1 : 0)) {
                if (lIlllllIllll(Players.getLocal().getWorldLocation().distanceTo(lS), lllIIIIII[3])) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[17]];
                    if (lIlllllIlIlI(cI, lllIIIIII[1])) {
                        C0004e.x();
                        cI += lllIIIIII[1];
                    }
                    Movement.walkTo(lS);
                    "".length();
                    Time.sleepTicks(lllIIIIII[1]);
                    "".length();
                }
                if (lIllllllIIII(Players.getLocal().getWorldLocation().distanceTo(lS), lllIIIIII[3])) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[18]];
                    if (lIlllllIlIll(lIlllllIlIII(g, 0L))) {
                        g = System.currentTimeMillis();
                    }
                    if (lIlllllIlIIl(lIlllllIlIII(g, 0L)) && lIlllllIllIl(lIlllllIlIII(C0004e.a(g), 30000L))) {
                        cI = lllIIIIII[0];
                        g = System.currentTimeMillis();
                    }
                    if (lIlllllIlIlI(cI, lllIIIIII[1])) {
                        C0004e.x();
                        cI += lllIIIIII[1];
                    }
                    if (lIlllllIlIIl(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr5 = new int[lllIIIIII[1]];
                        iArr5[lllIIIIII[0]] = lllIIIIII[4];
                        Inventory.getFirst(iArr5).interact(llIlllllI[lllIIIIII[19]]);
                        Time.sleepTicks(lllIIIIII[3]);
                        "".length();
                    }
                    C0006g.a(llIlllllI[lllIIIIII[15]], lR, lllIIIIII[1]);
                }
            }
            if (lIllllllIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[1])) {
                dk = lllIIIIII[0];
                String[] strArr = new String[lllIIIIII[1]];
                strArr[lllIIIIII[0]] = llIlllllI[lllIIIIII[20]];
                if (lIlllllIlIll(Inventory.contains(strArr) ? 1 : 0)) {
                    C0006g.a(lR);
                }
            }
            if (lIllllllIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[3])) {
                if (lIlllllIlIIl(Inventory.contains(item -> {
                    return item.getName().contains(llIlllllI[lllIIIIII[61]]);
                }) ? 1 : 0) && lIlllllIlIll(Equipment.contains(item2 -> {
                    return item2.getName().contains(llIlllllI[lllIIIIII[60]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(llIlllllI[lllIIIIII[53]]);
                    }).interact(llIlllllI[lllIIIIII[21]]);
                }
                if (lIlllllIlIIl(Inventory.contains(item4 -> {
                    return item4.getName().contains(llIlllllI[lllIIIIII[59]]);
                }) ? 1 : 0) && lIlllllIlIll(Equipment.contains(item5 -> {
                    return item5.getName().contains(llIlllllI[lllIIIIII[58]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(llIlllllI[lllIIIIII[57]]);
                    }).interact(llIlllllI[lllIIIIII[22]]);
                }
                if (lIlllllIlIll(Players.getLocal().getWorldLocation().equals(lT) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[23]];
                    Movement.walkTo(lT);
                    "".length();
                    Time.sleepTicks(lllIIIIII[1]);
                    "".length();
                }
                if (lIlllllIlIIl(Players.getLocal().getWorldLocation().equals(lT) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIIIII[1]];
                    strArr2[lllIIIIII[0]] = llIlllllI[lllIIIIII[24]];
                    Inventory.getFirst(strArr2).interact(llIlllllI[lllIIIIII[25]]);
                    Time.sleepTicks(lllIIIIII[3]);
                    "".length();
                }
            }
            if (lIllllllIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[5])) {
                if (lIlllllIlIll(Players.getLocal().getWorldLocation().equals(lU) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[26]];
                    Movement.walkTo(lU);
                    "".length();
                    Time.sleepTicks(lllIIIIII[1]);
                    "".length();
                }
                if (lIlllllIlIIl(Players.getLocal().getWorldLocation().equals(lU) ? 1 : 0)) {
                    String[] strArr3 = new String[lllIIIIII[1]];
                    strArr3[lllIIIIII[0]] = llIlllllI[lllIIIIII[27]];
                    Inventory.getFirst(strArr3).interact(llIlllllI[lllIIIIII[28]]);
                    Time.sleepTicks(lllIIIIII[3]);
                    "".length();
                }
            }
            if (lIllllllIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[6])) {
                if (lIlllllIlIll(Players.getLocal().getWorldLocation().equals(lV) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[29]];
                    Movement.walkTo(lV);
                    "".length();
                    Time.sleepTicks(lllIIIIII[1]);
                    "".length();
                }
                if (lIlllllIlIIl(Players.getLocal().getWorldLocation().equals(lV) ? 1 : 0)) {
                    String[] strArr4 = new String[lllIIIIII[1]];
                    strArr4[lllIIIIII[0]] = llIlllllI[lllIIIIII[30]];
                    Inventory.getFirst(strArr4).interact(llIlllllI[lllIIIIII[31]]);
                    Time.sleepTicks(lllIIIIII[3]);
                    "".length();
                }
            }
            if (lIllllllIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[7])) {
                if (lIlllllIlIll(Players.getLocal().getWorldLocation().equals(lW) ? 1 : 0)) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[32]];
                    Movement.walkTo(lW);
                    "".length();
                    Time.sleepTicks(lllIIIIII[1]);
                    "".length();
                }
                if (lIlllllIlIIl(Players.getLocal().getWorldLocation().equals(lW) ? 1 : 0)) {
                    String[] strArr5 = new String[lllIIIIII[1]];
                    strArr5[lllIIIIII[0]] = llIlllllI[lllIIIIII[33]];
                    Inventory.getFirst(strArr5).interact(llIlllllI[lllIIIIII[34]]);
                    Time.sleepTicks(lllIIIIII[3]);
                    "".length();
                }
            }
            if (lIllllllIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[9])) {
                if (lIlllllIllll(Players.getLocal().getWorldLocation().distanceTo(lX), lllIIIIII[5])) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[35]];
                    Movement.walkTo(lX);
                    "".length();
                    Time.sleepTicks(lllIIIIII[1]);
                    "".length();
                }
                if (lIllllllIIII(Players.getLocal().getWorldLocation().distanceTo(lX), lllIIIIII[5])) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[36]];
                    if (lIlllllIlIlI(dk, lllIIIIII[1])) {
                        as.pI += lllIIIIII[1];
                        as.u(AccBuilderGWD.m);
                        dk += lllIIIIII[1];
                        as.pI = lllIIIIII[0];
                        dl = lllIIIIII[0];
                    }
                    C0006g.a(llIlllllI[lllIIIIII[37]], lR);
                }
            }
            if (lIllllllIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lllIIIIII[17])) {
                C0006g.a(lR);
            }
            do {
                int[] iArr6 = new int[lllIIIIII[1]];
                iArr6[lllIIIIII[0]] = lllIIIIII[38];
                if (!lIlllllIlIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                    C0006g.a(new String[lllIIIIII[0]]);
                    return;
                }
                if (lIlllllIlllI(Widgets.get(lllIIIIII[39]))) {
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[40]];
                    int[] iArr7 = new int[lllIIIIII[1]];
                    iArr7[lllIIIIII[0]] = lllIIIIII[38];
                    Inventory.getFirst(iArr7).interact(llIlllllI[lllIIIIII[41]]);
                    Time.sleepTicks(lllIIIIII[6]);
                    "".length();
                    AccBuilderGWD.c = llIlllllI[lllIIIIII[42]];
                    Widget widget = Widgets.get(lllIIIIII[39], lllIIIIII[23]);
                    if (lIlllllIlllI(widget)) {
                        widget.interact(llIlllllI[lllIIIIII[43]]);
                        Time.sleepTicks(lllIIIIII[1]);
                        "".length();
                    }
                    Widget widget2 = Widgets.get(lllIIIIII[39], lllIIIIII[35]);
                    if (lIlllllIlllI(widget2)) {
                        widget2.interact(llIlllllI[lllIIIIII[44]]);
                        Time.sleepTicks(lllIIIIII[3]);
                        "".length();
                    }
                }
                Time.sleepTicks(lllIIIIII[1]);
                "".length();
                "".length();
            } while ((-" ".length()) != "   ".length());
        }
    }

    private static int lIlllllIlIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return llIlllllI[lllIIIIII[55]];
    }

    static {
        lIlllllIIlII();
        lIllllIlIIlI();
        String[] strArr = new String[lllIIIIII[24]];
        strArr[lllIIIIII[0]] = llIlllllI[lllIIIIII[62]];
        strArr[lllIIIIII[1]] = llIlllllI[lllIIIIII[63]];
        strArr[lllIIIIII[3]] = llIlllllI[lllIIIIII[64]];
        strArr[lllIIIIII[5]] = llIlllllI[lllIIIIII[65]];
        strArr[lllIIIIII[6]] = llIlllllI[lllIIIIII[66]];
        strArr[lllIIIIII[7]] = llIlllllI[lllIIIIII[67]];
        strArr[lllIIIIII[9]] = llIlllllI[lllIIIIII[68]];
        strArr[lllIIIIII[17]] = llIlllllI[lllIIIIII[69]];
        strArr[lllIIIIII[18]] = llIlllllI[lllIIIIII[70]];
        strArr[lllIIIIII[19]] = llIlllllI[lllIIIIII[71]];
        strArr[lllIIIIII[15]] = llIlllllI[lllIIIIII[72]];
        strArr[lllIIIIII[20]] = llIlllllI[lllIIIIII[73]];
        strArr[lllIIIIII[21]] = llIlllllI[lllIIIIII[48]];
        strArr[lllIIIIII[22]] = llIlllllI[lllIIIIII[74]];
        strArr[lllIIIIII[23]] = llIlllllI[lllIIIIII[75]];
        lR = strArr;
        lS = new WorldPoint(lllIIIIII[76], lllIIIIII[77], lllIIIIII[0]);
        lT = new WorldPoint(lllIIIIII[78], lllIIIIII[79], lllIIIIII[0]);
        lU = new WorldPoint(lllIIIIII[80], lllIIIIII[81], lllIIIIII[0]);
        lV = new WorldPoint(lllIIIIII[82], lllIIIIII[83], lllIIIIII[0]);
        lW = new WorldPoint(lllIIIIII[84], lllIIIIII[85], lllIIIIII[0]);
        lX = new WorldPoint(lllIIIIII[86], lllIIIIII[87], lllIIIIII[0]);
        bx = new ArrayList();
        cI = lllIIIIII[0];
    }

    private static boolean lIllllllIIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIllllIIIIIl(String llllllIlIllII, String llllllIlIlIll) {
        try {
            SecretKeySpec llllllIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIlIlIll.getBytes(StandardCharsets.UTF_8)), lllIIIIII[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIII[3], llllllIlIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIlIllIl) {
            llllllIlIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllllIIIIlI(String llllllIIlllII, String llllllIIllIll) {
        String str = new String(Base64.getDecoder().decode(llllllIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllIIllIll.toCharArray();
        int llllllIIllIII = lllIIIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIIIIII[0];
        while (lIlllllIlIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllIIllIII % charArray.length]));
            "".length();
            llllllIIllIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlllllIllII(int i) {
        return i < 0;
    }

    private static void Q() {
        int[] iArr = new int[lllIIIIII[1]];
        iArr[lllIIIIII[0]] = lllIIIIII[10];
        if (lIlllllIlIll(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIIII[10], lllIIIIII[1], lllIIIIII[46]));
            "".length();
        }
        int[] iArr2 = new int[lllIIIIII[1]];
        iArr2[lllIIIIII[0]] = lllIIIIII[14];
        if (lIlllllIlIll(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIIII[14], lllIIIIII[1], lllIIIIII[47]));
            "".length();
        }
        int[] iArr3 = new int[lllIIIIII[1]];
        iArr3[lllIIIIII[0]] = lllIIIIII[4];
        if (lIlllllIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIIII[4], lllIIIIII[48], lllIIIIII[49]));
            "".length();
        }
        if (lIlllllIlIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlllllI[lllIIIIII[56]]);
        }) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIIII[50], lllIIIIII[7], lllIIIIII[51]));
            "".length();
        }
        int[] iArr4 = new int[lllIIIIII[1]];
        iArr4[lllIIIIII[0]] = lllIIIIII[11];
        if (lIlllllIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIIII[11], lllIIIIII[15], lllIIIIII[52]));
            "".length();
        }
        int[] iArr5 = new int[lllIIIIII[1]];
        iArr5[lllIIIIII[0]] = lllIIIIII[16];
        if (lIlllllIlIll(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIIII[16], lllIIIIII[15], lllIIIIII[52]));
            "".length();
        }
        int[] iArr6 = new int[lllIIIIII[1]];
        iArr6[lllIIIIII[0]] = lllIIIIII[13];
        if (lIlllllIlIll(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIIII[13], lllIIIIII[53], lllIIIIII[52]));
            "".length();
        }
        int[] iArr7 = new int[lllIIIIII[1]];
        iArr7[lllIIIIII[0]] = lllIIIIII[12];
        if (lIlllllIlIll(Bank.contains(iArr7) ? 1 : 0)) {
            bx.add(new C0003d(lllIIIIII[12], lllIIIIII[7], C0009j.ch));
            "".length();
        }
    }

    private static boolean lIlllllIllIl(int i) {
        return i > 0;
    }

    private static void lIlllllIIlII() {
        lllIIIIII = new int[89];
        lllIIIIII[0] = (108 ^ 32) & ((218 ^ 150) ^ (-1));
        lllIIIIII[1] = " ".length();
        lllIIIIII[2] = 86 ^ 16;
        lllIIIIII[3] = "  ".length();
        lllIIIIII[4] = (-24581) & 24959;
        lllIIIIII[5] = "   ".length();
        lllIIIIII[6] = 67 ^ 71;
        lllIIIIII[7] = (((41 + 97) - 77) + 106) ^ (((34 + 153) - 133) + 108);
        lllIIIIII[8] = (-((-5013) & 32758)) & (-7) & 32751;
        lllIIIIII[9] = (((133 + 78) - 153) + 111) ^ (((132 + 145) - 221) + 119);
        lllIIIIII[10] = (-20501) & 32478;
        lllIIIIII[11] = (-24631) & 32638;
        lllIIIIII[12] = (-((-17) & 3733)) & (-41) & 16381;
        lllIIIIII[13] = (-((-6659) & 31419)) & (-1) & 32767;
        lllIIIIII[14] = (-21510) & 22461;
        lllIIIIII[15] = (((110 + 42) - 57) + 43) ^ (((14 + 126) - 34) + 22);
        lllIIIIII[16] = (-23) & 8031;
        lllIIIIII[17] = 128 ^ 135;
        lllIIIIII[18] = (53 ^ 73) ^ (108 ^ 24);
        lllIIIIII[19] = 105 ^ 96;
        lllIIIIII[20] = (177 ^ 192) ^ (120 ^ 2);
        lllIIIIII[21] = (100 ^ 39) ^ (86 ^ 25);
        lllIIIIII[22] = (141 ^ 152) ^ (1 ^ 25);
        lllIIIIII[23] = (90 ^ 40) ^ (20 ^ 104);
        lllIIIIII[24] = (254 ^ 134) ^ (73 ^ 62);
        lllIIIIII[25] = 51 ^ 35;
        lllIIIIII[26] = (194 ^ 155) ^ (213 ^ 157);
        lllIIIIII[27] = (15 ^ 44) ^ (111 ^ 94);
        lllIIIIII[28] = 37 ^ 54;
        lllIIIIII[29] = 152 ^ 140;
        lllIIIIII[30] = 41 ^ 60;
        lllIIIIII[31] = (199 ^ 180) ^ (28 ^ 121);
        lllIIIIII[32] = (222 ^ 193) ^ (75 ^ 67);
        lllIIIIII[33] = 144 ^ 136;
        lllIIIIII[34] = 79 ^ 86;
        lllIIIIII[35] = (((19 + 103) - 17) + 111) ^ (((165 + 60) - 191) + 160);
        lllIIIIII[36] = (((39 + 13) - 23) + 104) ^ (((79 + 84) - 62) + 57);
        lllIIIIII[37] = 119 ^ 107;
        lllIIIIII[38] = (-((-14953) & 16123)) & (-6) & 24247;
        lllIIIIII[39] = ((172 + 112) - 89) + 45;
        lllIIIIII[40] = 137 ^ 148;
        lllIIIIII[41] = 36 ^ 58;
        lllIIIIII[42] = (35 ^ 80) ^ (84 ^ 56);
        lllIIIIII[43] = (185 ^ 141) ^ (126 ^ 106);
        lllIIIIII[44] = 68 ^ 101;
        lllIIIIII[45] = 78 ^ 108;
        lllIIIIII[46] = (-((-4369) & 20946)) & (-33) & 32509;
        lllIIIIII[47] = (-((-21377) & 23459)) & (-24658) & 32639;
        lllIIIIII[48] = 128 ^ 183;
        lllIIIIII[49] = (-16385) & 16884;
        lllIIIIII[50] = (-34) & 12013;
        lllIIIIII[51] = (-531) & 25530;
        lllIIIIII[52] = (-((-4299) & 30942)) & (-129) & 28671;
        lllIIIIII[53] = (((38 + 129) - 150) + 139) ^ (((134 + 69) - 154) + 131);
        lllIIIIII[54] = (98 ^ 58) ^ (126 ^ 66);
        lllIIIIII[55] = 129 ^ 162;
        lllIIIIII[56] = (56 ^ 18) ^ (160 ^ 174);
        lllIIIIII[57] = (((93 + 104) - 145) + 91) ^ (((65 + 82) - 42) + 65);
        lllIIIIII[58] = 185 ^ 159;
        lllIIIIII[59] = 89 ^ 126;
        lllIIIIII[60] = (69 ^ 29) ^ (64 ^ 49);
        lllIIIIII[61] = (127 ^ 31) ^ (113 ^ 59);
        lllIIIIII[62] = (183 ^ 171) ^ (1 ^ 54);
        lllIIIIII[63] = 177 ^ 157;
        lllIIIIII[64] = 168 ^ 133;
        lllIIIIII[65] = 88 ^ 118;
        lllIIIIII[66] = 70 ^ 105;
        lllIIIIII[67] = (41 ^ 110) ^ (25 ^ 110);
        lllIIIIII[68] = (97 ^ 114) ^ (144 ^ 178);
        lllIIIIII[69] = (103 ^ 97) ^ (189 ^ 137);
        lllIIIIII[70] = 7 ^ 52;
        lllIIIIII[71] = 4 ^ 48;
        lllIIIIII[72] = "  ".length() ^ (90 ^ 109);
        lllIIIIII[73] = 117 ^ 67;
        lllIIIIII[74] = 1 ^ 57;
        lllIIIIII[75] = 144 ^ 169;
        lllIIIIII[76] = (-25089) & 28317;
        lllIIIIII[77] = (-((-8321) & 13269)) & (-4) & 8191;
        lllIIIIII[78] = (-16897) & 20126;
        lllIIIIII[79] = (-((-11393) & 16263)) & (-17) & 8095;
        lllIIIIII[80] = (-(72 ^ 125)) & (-65) & 3319;
        lllIIIIII[81] = (-20849) & 24060;
        lllIIIIII[82] = (-((-3093) & 32735)) & (-1) & 32751;
        lllIIIIII[83] = (-((-11425) & 32698)) & (-37) & 24573;
        lllIIIIII[84] = (-((-3269) & 32478)) & (-289) & 32575;
        lllIIIIII[85] = (-4609) & 7867;
        lllIIIIII[86] = (-4113) & 7166;
        lllIIIIII[87] = (-4625) & 7870;
        lllIIIIII[88] = 91 ^ 97;
    }

    private static boolean lIlllllIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIlllllIllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlllllIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllllIlIll(int i) {
        return i == 0;
    }
}
