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
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarPlayer;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.C  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/C.class */
public class C implements M {
    public static /* synthetic */ List<C0003d> bA;
    private static final /* synthetic */ WorldPoint gO;
    public static final /* synthetic */ String[] gL;
    private static /* synthetic */ boolean gU;
    private static /* synthetic */ boolean gT;
    private static final /* synthetic */ WorldPoint gN;
    static /* synthetic */ int bY;
    private static /* synthetic */ boolean gX;
    private static final /* synthetic */ WorldPoint gS;
    private static final /* synthetic */ WorldPoint gP;
    private static /* synthetic */ boolean gV;
    private static final /* synthetic */ WorldPoint gR;
    private static /* synthetic */ int[] lIIIllllIllll;
    private static final /* synthetic */ WorldPoint gQ;
    private static final /* synthetic */ WorldPoint gM;
    private static /* synthetic */ String[] lIIIllllIlllI;
    public static /* synthetic */ boolean by;
    static /* synthetic */ boolean cp;
    private static /* synthetic */ boolean gW;
    static /* synthetic */ int co;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIIllllIllll[1]];
        iArr[lIIIllllIllll[0]] = lIIIllllIllll[14];
        if (lIlIIllIIIIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
            String[] strArr = new String[lIIIllllIllll[1]];
            strArr[lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[62]];
            if (lIlIIllIIIIlIlI(Inventory.contains(strArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIIllllIllll[1]];
                iArr2[lIIIllllIllll[0]] = lIIIllllIllll[11];
                if (lIlIIllIIIIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    ?? r0 = lIIIllllIllll[1];
                    "".length();
                    return " ".length() == (76 ^ 72) ? (!true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIIIllllIllll[0];
    }

    private static void lIlIIllIIIIIlll() {
        lIIIllllIlllI = new String[lIIIllllIllll[111]];
        lIIIllllIlllI[lIIIllllIllll[0]] = lIlIIllIIIIIlII("BTkzPgggbCMjAyo/", "GLJWf");
        lIIIllllIlllI[lIIIllllIllll[1]] = lIlIIllIIIIIlII("CwMrEzYlDyFaJzgTLBQibQMxHyg+RmUJMiQeJhIsIw1lGCQuAWUOKm0bMB82OQ==", "MjEzE");
        lIIIllllIlllI[lIIIllllIllll[3]] = lIlIIllIIIIIlIl("te6zuwcCU0c=", "cqfYl");
        lIIIllllIlllI[lIIIllllIllll[5]] = lIlIIllIIIIIlII("HSgF", "XIqRJ");
        lIIIllllIlllI[lIIIllllIllll[6]] = lIlIIllIIIIIlIl("k7Y/V5odoPS+EtvcQ8h5hg==", "dAXDZ");
        lIIIllllIlllI[lIIIllllIllll[7]] = lIlIIllIIIIIlIl("ZS2VuMLCpWrWmBw3xKJv0Bwnqb0IOmvk", "smvwB");
        lIIIllllIlllI[lIIIllllIllll[9]] = lIlIIllIIIIIlIl("HZl2pY7GwbnoYZ+NQvfqQ8iX5T/xi2s90Z8lvCcTWPg+6hAH1elk1ZQ9UoMZTDcyq7PTCXGK9/o=", "WXCyq");
        lIIIllllIlllI[lIIIllllIllll[21]] = lIlIIllIIIIIlII("DxA/dR4uUTohCzMF", "AqIUj");
        lIIIllllIlllI[lIIIllllIllll[20]] = lIlIIllIIIIIlII("DgQ2KAomCTZtFjcJ", "GjBMx");
        lIIIllllIlllI[lIIIllllIllll[22]] = lIlIIllIIIIIlII("PiEzMB8NNjNyPB4lOTk=", "lDWRz");
        lIIIllllIlllI[lIIIllllIllll[16]] = lIlIIllIIIIIlIl("LVyYuAKZ/xVj0VkekgKOrw==", "dcvOe");
        lIIIllllIlllI[lIIIllllIllll[23]] = lIlIIllIIIIIlIl("2WFlVB29LNlN2LpOE7Fbaw==", "uDRVY");
        lIIIllllIlllI[lIIIllllIllll[24]] = lIlIIllIIIIIllI("+h1WedL/QY8=", "KeRIU");
        lIIIllllIlllI[lIIIllllIllll[25]] = lIlIIllIIIIIlII("PyYHQxc5LxYGVCI9DEQA", "KNbct");
        lIIIllllIlllI[lIIIllllIllll[26]] = lIlIIllIIIIIlII("BjQvbSMndQMoOio6", "HUYMW");
        lIIIllllIlllI[lIIIllllIllll[27]] = lIlIIllIIIIIlII("Kh4YVjsdBg==", "hkavI");
        lIIIllllIlllI[lIIIllllIllll[29]] = lIlIIllIIIIIllI("UFQ06yeBqmw=", "ywFbU");
        lIIIllllIlllI[lIIIllllIllll[30]] = lIlIIllIIIIIllI("wfL0sLHa0Cc=", "AFZzr");
        lIIIllllIlllI[lIIIllllIllll[31]] = lIlIIllIIIIIlII("CBYOVks=", "Jcwvz");
        lIIIllllIlllI[lIIIllllIllll[33]] = lIlIIllIIIIIlII("HysjZDM+ajkxMzkrJg==", "QJUDG");
        lIIIllllIlllI[lIIIllllIllll[34]] = lIlIIllIIIIIlIl("bom1yvgO8Lg41puFVE/lIQ==", "utvGe");
        lIIIllllIlllI[lIIIllllIllll[35]] = lIlIIllIIIIIlIl("citdHoJbL8w=", "YfDGe");
        lIIIllllIlllI[lIIIllllIllll[36]] = lIlIIllIIIIIllI("zXUDyzmlIco=", "lsEUu");
        lIIIllllIlllI[lIIIllllIllll[37]] = lIlIIllIIIIIllI("exGXkTx8MxgG4BtxeQfPrw==", "scKzX");
        lIIIllllIlllI[lIIIllllIllll[38]] = lIlIIllIIIIIllI("owbmF8J3lTc=", "wmXtP");
        lIIIllllIlllI[lIIIllllIllll[39]] = lIlIIllIIIIIlII("GxRIKSNZHBFmOhgI", "yqhFM");
        lIIIllllIlllI[lIIIllllIllll[40]] = lIlIIllIIIIIlII("GzYacyE6dxsqMTw5", "UWlSU");
        lIIIllllIlllI[lIIIllllIllll[41]] = lIlIIllIIIIIlII("PhIEPw==", "iweMv");
        lIIIllllIlllI[lIIIllllIllll[42]] = lIlIIllIIIIIllI("hGGV9Q3CuAs=", "VEKij");
        lIIIllllIlllI[lIIIllllIllll[43]] = lIlIIllIIIIIlII("LyAJZCpsNgg2CGwuEjBDKjMIKhc=", "LAgDc");
        lIIIllllIlllI[lIIIllllIllll[46]] = lIlIIllIIIIIllI("2XLEtdkQhd/5GWcoFbAa9w==", "YRnBg");
        lIIIllllIlllI[lIIIllllIllll[48]] = lIlIIllIIIIIllI("Wkm5PzYGPHE=", "Rxeyi");
        lIIIllllIlllI[lIIIllllIllll[49]] = lIlIIllIIIIIlII("PRIjUiccUyYGMgEH", "ssUrS");
        lIIIllllIlllI[lIIIllllIllll[50]] = lIlIIllIIIIIlIl("Qv+9ED9UhpUUAgrnf7iXPg==", "CuaRv");
        lIIIllllIlllI[lIIIllllIllll[51]] = lIlIIllIIIIIlIl("ySFfCLcxLqMbiirgvguLmg==", "loveh");
        lIIIllllIlllI[lIIIllllIllll[52]] = lIlIIllIIIIIllI("XR5P+4ce1urKGmiHL5+tCw==", "bCPmj");
        lIIIllllIlllI[lIIIllllIllll[53]] = lIlIIllIIIIIllI("SM/RAm1RevabeJguXjdu1g==", "GmNaU");
        lIIIllllIlllI[lIIIllllIllll[56]] = lIlIIllIIIIIllI("or4zMFjjtko=", "sGlrC");
        lIIIllllIlllI[lIIIllllIllll[57]] = lIlIIllIIIIIllI("pgsti7FyQQQ=", "CXpHC");
        lIIIllllIlllI[lIIIllllIllll[58]] = lIlIIllIIIIIlIl("QLmHdYJ5aE9qOnOVnKaLqA==", "AXPfQ");
        lIIIllllIlllI[lIIIllllIllll[59]] = lIlIIllIIIIIlIl("zRxoFAMawgQ=", "OaRAQ");
        lIIIllllIlllI[lIIIllllIllll[60]] = lIlIIllIIIIIlIl("Rp7aR+lO4ao=", "rGOiN");
        lIIIllllIlllI[lIIIllllIllll[61]] = lIlIIllIIIIIllI("TRU9OJhX7kI=", "WQkYd");
        lIIIllllIlllI[lIIIllllIllll[62]] = lIlIIllIIIIIlII("GDs3CR0=", "KKVmx");
        lIIIllllIlllI[lIIIllllIllll[72]] = lIlIIllIIIIIllI("axWuUsXz2hPIr6t4kn5LUiG+nW2RcDoK", "SMSgR");
        lIIIllllIlllI[lIIIllllIllll[73]] = lIlIIllIIIIIllI("gt1j7E29p3fBk49akKj0mRl4WrIwbrcn", "zoPuf");
        lIIIllllIlllI[lIIIllllIllll[74]] = lIlIIllIIIIIlII("HygGPQ==", "YAjQy");
        lIIIllllIlllI[lIIIllllIllll[75]] = lIlIIllIIIIIlII("NwpZZwVfDFUyPFgHGjVsGQ9VJigOBBszOQoEWw==", "xauGL");
        lIIIllllIlllI[lIIIllllIllll[76]] = lIlIIllIIIIIllI("WPHgi2htFyiX2a2yg77pTRRmbPtQAyaYUSePsaoBom1eFDsO5DWE8w==", "zjXUl");
        lIIIllllIlllI[lIIIllllIllll[77]] = lIlIIllIIIIIlIl("hoId2tuh9SWPzyLM/ub5hQJ7vkbP+5xd", "udliN");
        lIIIllllIlllI[lIIIllllIllll[78]] = lIlIIllIIIIIllI("iT9jWhSkYSI=", "MUFfO");
        lIIIllllIlllI[lIIIllllIllll[79]] = lIlIIllIIIIIlIl("xcPGOxVfN0Aeqm+IlDnWEtaP0HtVr7/U5Tt9REes9HQ=", "WfYhy");
        lIIIllllIlllI[lIIIllllIllll[80]] = lIlIIllIIIIIllI("3HrVa0G84KkmUg44hqBGjQZ05bg5HRdQ", "eRPUr");
        lIIIllllIlllI[lIIIllllIllll[81]] = lIlIIllIIIIIlII("FwATIzcjQSYuIDQCDGshNA8Taz80QRMkciUACyByJQ5HMj0kTw==", "QagKR");
        lIIIllllIlllI[lIIIllllIllll[82]] = lIlIIllIIIIIlII("Bh9mIUMpFTVyAm4dKT0QOlopMxYgDig8BG4SKCFDKQggJAY3GzM2TQ==", "NzARc");
        lIIIllllIlllI[lIIIllllIllll[83]] = lIlIIllIIIIIlIl("TaxkzpYMP89tuBqER0dsvE0gILLmsLdwvDcpYnzvMQUiZG4axV/baA==", "rhwAI");
        lIIIllllIlllI[lIIIllllIllll[84]] = lIlIIllIIIIIlII("NBQVDkU=", "gagkk");
        lIIIllllIlllI[lIIIllllIllll[85]] = lIlIIllIIIIIlII("AWseTC8tLQEFNi9sEgJ4KSEGAD08bBwKeC8kHB8saD8DCTkjbQ==", "HLslX");
        lIIIllllIlllI[lIIIllllIllll[86]] = lIlIIllIIIIIllI("68bFzbB+pFrzNkge7lq5lQ==", "kmPUP");
        lIIIllllIlllI[lIIIllllIllll[87]] = lIlIIllIIIIIllI("wjzKHaOj9NyJk7X5R6gIdQ==", "KXnHZ");
        lIIIllllIlllI[lIIIllllIllll[88]] = lIlIIllIIIIIlIl("nW0+t4UyCi7fCvZei2/fbJlsjCxyfcYBktvz0K/Mapg=", "lXxQS");
        lIIIllllIlllI[lIIIllllIllll[89]] = lIlIIllIIIIIllI("lDdGrAsVXQElwPFb2dyGbbnB0DBdYGCUwOPQaYWcmQQ=", "arVUO");
        lIIIllllIlllI[lIIIllllIllll[90]] = lIlIIllIIIIIlII("FSI/aw==", "LGLEq");
        lIIIllllIlllI[lIIIllllIllll[91]] = lIlIIllIIIIIlIl("eM1peu1rXLxNXIZcPKPU1dk8gLtuIzqirimOQKHDRL/48N9WKsWe6aMDld/FwbmQXNuDv/Etp9A=", "TzvpD");
        lIIIllllIlllI[lIIIllllIllll[92]] = lIlIIllIIIIIlIl("U+V7DB+/xWfEbq1LrLXzWNjZYCXtnjwBbFmcPv8ZTVs=", "knbSG");
        lIIIllllIlllI[lIIIllllIllll[93]] = lIlIIllIIIIIllI("r8tMQeVxQt0L6zGsNL4Pewo4NyQAU9q3", "WNJrR");
        lIIIllllIlllI[lIIIllllIllll[94]] = lIlIIllIIIIIlII("LTEXeTFOOhYsCgA1AHkXAHANMREdcAoxER5v", "nPyYx");
        lIIIllllIlllI[lIIIllllIllll[95]] = lIlIIllIIIIIllI("+cUHfSOdElSwSvcEofo8gx3tnivUZYi1knvOEHvAcdwU/mNGsf9kOA==", "gxfOy");
        lIIIllllIlllI[lIIIllllIllll[96]] = lIlIIllIIIIIlII("CyZF", "DMkHY");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v245, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v284, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v320, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v358, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v418, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v517, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v562, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static void cg() {
        if (lIlIIllIIIIlIlI(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[0]];
            C0001b.a(bA);
            if (lIlIIllIIIIlIll(bA.size(), lIIIllllIllll[1])) {
                System.out.println(lIIIllllIlllI[lIIIllllIllll[1]]);
                by = lIIIllllIllll[0];
            }
        }
        if (lIlIIllIIIIllII(by ? 1 : 0)) {
            if (lIlIIllIIIIlIlI(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIllIIIIlIll(Movement.getRunEnergy(), lIIIllllIllll[2])) {
                Inventory.getFirst(C0005f.ba).interact(lIIIllllIlllI[lIIIllllIllll[3]]);
                Time.sleepTicks(lIIIllllIllll[1]);
                "".length();
            }
            if (lIlIIllIIIIllIl(lIlIIllIIIIlIIl(C0004e.v(), 70.0d))) {
                int[] iArr = new int[lIIIllllIllll[1]];
                iArr[lIIIllllIllll[0]] = lIIIllllIllll[4];
                if (lIlIIllIIIIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIIllllIllll[1]];
                    iArr2[lIIIllllIllll[0]] = lIIIllllIllll[4];
                    Inventory.getFirst(iArr2).interact(lIIIllllIlllI[lIIIllllIllll[5]]);
                }
            }
            if (lIlIIllIIIIllII(Movement.isRunEnabled() ? 1 : 0) && lIlIIllIIIIlllI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIIllIIIIllII(S() ? 1 : 0) && lIlIIllIIIIllII(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIllIIIIllll(nearest) && lIlIIllIIIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIIllllIllll[3]);
                    "".length();
                }
                if (lIlIIllIIIIllll(nearest) && lIlIIllIIIIlIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[7]];
                    if (lIlIIllIIIIllII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIllllIllll[8]);
                        "".length();
                    }
                    if (lIlIIllIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIllIIIIlllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIllllIllll[6]);
                            "".length();
                        }
                        if (lIlIIllIIIIlllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIllllIllll[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIIIllllIllll[9]];
                        iArr3[lIIIllllIllll[0]] = lIIIllllIllll[10];
                        iArr3[lIIIllllIllll[1]] = lIIIllllIllll[11];
                        iArr3[lIIIllllIllll[3]] = lIIIllllIllll[12];
                        iArr3[lIIIllllIllll[5]] = lIIIllllIllll[13];
                        iArr3[lIIIllllIllll[6]] = lIIIllllIllll[14];
                        iArr3[lIIIllllIllll[7]] = lIIIllllIllll[15];
                        if (lIlIIllIIIIllII(C0004e.b(iArr3) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIllllIlllI[lIIIllllIllll[9]]);
                            by = lIIIllllIllll[1];
                            return;
                        }
                        Bank.withdraw(lIIIllllIllll[11], lIIIllllIllll[16], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllll[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIllll[15], lIIIllllIllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllll[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIllll[14], lIIIllllIllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllll[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIllll[17], lIIIllllIllll[16], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllll[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIllll[13], lIIIllllIllll[7], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllll[1]);
                        "".length();
                        Bank.withdraw(lIIIllllIllll[10], lIIIllllIllll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIIIllllIllll[1]);
                        "".length();
                        C0000a.a(lIIIllllIllll[18], lIIIllllIllll[19]);
                        C0000a.b(C0005f.ba, lIIIllllIllll[3]);
                        C0000a.b(C0005f.bk, lIIIllllIllll[1]);
                    }
                }
            }
            if (lIlIIllIIIIlIlI(S() ? 1 : 0) && lIlIIllIIIIllII(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()))) {
                if (lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIllllIllll[20])) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[21]];
                    if (lIlIIllIIIIlIlI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(gM);
                    "".length();
                    Time.sleepTicks(lIIIllllIllll[1]);
                    "".length();
                }
                if (lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIllllIllll[20])) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[20]];
                    C0006g.a(lIIIllllIlllI[lIIIllllIllll[22]], gL);
                }
            }
            if (lIlIIllIIIlIIlI(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), lIIIllllIllll[1])) {
                co = lIIIllllIllll[0];
                if (lIlIIllIIIIllII(gT ? 1 : 0)) {
                    if (lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gN), lIIIllllIllll[5])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[16]];
                        Movement.walkTo(gN);
                        "".length();
                        Time.sleepTicks(lIIIllllIllll[1]);
                        "".length();
                    }
                    if (lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gN), lIIIllllIllll[5])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[23]];
                        C0006g.a(lIIIllllIlllI[lIIIllllIllll[24]], gL);
                        List options = Dialog.getOptions();
                        if (lIlIIllIIIIllII(options.isEmpty() ? 1 : 0)) {
                            int lllllllllllllllIIIIIIlIllIllIlII = lIIIllllIllll[0];
                            while (lIlIIllIIIIlIll(lllllllllllllllIIIIIIlIllIllIlII, options.size())) {
                                if (lIlIIllIIIIlIlI(((Widget) options.get(lllllllllllllllIIIIIIlIllIllIlII)).getText().contains(lIIIllllIlllI[lIIIllllIllll[25]]) ? 1 : 0)) {
                                    gT = lIIIllllIllll[1];
                                }
                                lllllllllllllllIIIIIIlIllIllIlII++;
                                "".length();
                                if ((-"   ".length()) >= 0) {
                                    return;
                                }
                            }
                        }
                    }
                }
                if (lIlIIllIIIIlIlI(gT ? 1 : 0) && lIlIIllIIIIllII(gV ? 1 : 0)) {
                    if (lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIllllIllll[20])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[26]];
                        Movement.walkTo(gO);
                        "".length();
                        Time.sleepTicks(lIIIllllIllll[1]);
                        "".length();
                    }
                    if (lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gO), lIIIllllIllll[20])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[27]];
                        Widget widget = Widgets.get(lIIIllllIllll[28], lIIIllllIllll[29], lIIIllllIllll[3]);
                        if (lIlIIllIIIlIIll(widget)) {
                            String[] strArr = new String[lIIIllllIllll[1]];
                            strArr[lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[29]];
                            NPCs.getNearest(strArr).interact(lIIIllllIlllI[lIIIllllIllll[30]]);
                            Time.sleepTicks(lIIIllllIllll[3]);
                            "".length();
                        }
                        if (lIlIIllIIIIllll(widget)) {
                            widget.interact(lIIIllllIlllI[lIIIllllIllll[31]]);
                            Time.sleepTicks(lIIIllllIllll[1]);
                            "".length();
                        }
                    }
                    int[] iArr4 = new int[lIIIllllIllll[1]];
                    iArr4[lIIIllllIllll[0]] = lIIIllllIllll[32];
                    if (lIlIIllIIIIlIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                        gV = lIIIllllIllll[1];
                    }
                }
                if (lIlIIllIIIIlIlI(gT ? 1 : 0) && lIlIIllIIIIlIlI(gV ? 1 : 0) && lIlIIllIIIIllII(gU ? 1 : 0)) {
                    if (lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gN), lIIIllllIllll[9])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[33]];
                        Movement.walkTo(gN);
                        "".length();
                        Time.sleepTicks(lIIIllllIllll[1]);
                        "".length();
                    }
                    if (lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gN), lIIIllllIllll[9])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[34]];
                        int[] iArr5 = new int[lIIIllllIllll[1]];
                        iArr5[lIIIllllIllll[0]] = lIIIllllIllll[11];
                        if (lIlIIllIIIIlIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                            String[] strArr2 = new String[lIIIllllIllll[1]];
                            strArr2[lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[35]];
                            TileObjects.getNearest(strArr2).interact(lIIIllllIlllI[lIIIllllIllll[36]]);
                            Time.sleepTicks(lIIIllllIllll[5]);
                            "".length();
                        }
                        int[] iArr6 = new int[lIIIllllIllll[1]];
                        iArr6[lIIIllllIllll[0]] = lIIIllllIllll[11];
                        if (lIlIIllIIIIllII(Inventory.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[lIIIllllIllll[1]];
                            iArr7[lIIIllllIllll[0]] = lIIIllllIllll[32];
                            Inventory.getFirst(iArr7).useOn(TileObjects.getNearest(tileObject -> {
                                String[] strArr3 = new String[lIIIllllIllll[1]];
                                strArr3[lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[74]];
                                return tileObject.hasAction(strArr3);
                            }));
                            Time.sleepTicks(lIIIllllIllll[5]);
                            "".length();
                        }
                        int[] iArr8 = new int[lIIIllllIllll[1]];
                        iArr8[lIIIllllIllll[0]] = lIIIllllIllll[11];
                        if (lIlIIllIIIIllII(Inventory.contains(iArr8) ? 1 : 0)) {
                            int[] iArr9 = new int[lIIIllllIllll[1]];
                            iArr9[lIIIllllIllll[0]] = lIIIllllIllll[32];
                            if (lIlIIllIIIIllII(Inventory.contains(iArr9) ? 1 : 0)) {
                                gU = lIIIllllIllll[1];
                            }
                        }
                    }
                }
                if (lIlIIllIIIIlIlI(gU ? 1 : 0) && lIlIIllIIIIlIlI(gT ? 1 : 0) && lIlIIllIIIIlIlI(gV ? 1 : 0) && lIlIIllIIIIllII(gW ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[37]];
                    C0006g.a(lIIIllllIlllI[lIIIllllIllll[38]], gL);
                    String text = Dialog.getText();
                    if (lIlIIllIIIIllll(text) && lIlIIllIIIIlIlI(text.contains(lIIIllllIlllI[lIIIllllIllll[39]]) ? 1 : 0)) {
                        gW = lIIIllllIllll[1];
                    }
                }
                if (lIlIIllIIIIlIlI(gU ? 1 : 0) && lIlIIllIIIIlIlI(gT ? 1 : 0) && lIlIIllIIIIlIlI(gV ? 1 : 0) && lIlIIllIIIIlIlI(gW ? 1 : 0) && lIlIIllIIIIllII(gX ? 1 : 0)) {
                    if (lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gP), lIIIllllIllll[5])) {
                        AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[40]];
                        int[] iArr10 = new int[lIIIllllIllll[1]];
                        iArr10[lIIIllllIllll[0]] = lIIIllllIllll[14];
                        if (lIlIIllIIIIlIlI(Inventory.contains(iArr10) ? 1 : 0)) {
                            int[] iArr11 = new int[lIIIllllIllll[1]];
                            iArr11[lIIIllllIllll[0]] = lIIIllllIllll[14];
                            Inventory.getFirst(iArr11).interact(lIIIllllIlllI[lIIIllllIllll[41]]);
                        }
                        C0006g.a(gL);
                        if (lIlIIllIIIIllII(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo(gP);
                            "".length();
                            Time.sleepTicks(lIIIllllIllll[1]);
                            "".length();
                        }
                    }
                    if (lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gP), lIIIllllIllll[5])) {
                        C0006g.a(lIIIllllIlllI[lIIIllllIllll[42]], gL);
                    }
                    List options2 = Dialog.getOptions();
                    if (lIlIIllIIIIllII(options2.isEmpty() ? 1 : 0)) {
                        int lllllllllllllllIIIIIIlIllIllIlII2 = lIIIllllIllll[0];
                        while (lIlIIllIIIIlIll(lllllllllllllllIIIIIIlIllIllIlII2, options2.size())) {
                            if (lIlIIllIIIIlIlI(((Widget) options2.get(lllllllllllllllIIIIIIlIllIllIlII2)).getText().contains(lIIIllllIlllI[lIIIllllIllll[43]]) ? 1 : 0)) {
                                gX = lIIIllllIllll[1];
                            }
                            lllllllllllllllIIIIIIlIllIllIlII2++;
                            "".length();
                            if (" ".length() == "   ".length()) {
                                return;
                            }
                        }
                    }
                }
                if (lIlIIllIIIIlIlI(gU ? 1 : 0) && lIlIIllIIIIlIlI(gT ? 1 : 0) && lIlIIllIIIIlIlI(gV ? 1 : 0) && lIlIIllIIIIlIlI(gW ? 1 : 0) && lIlIIllIIIIlIlI(gX ? 1 : 0)) {
                    int[] iArr12 = new int[lIIIllllIllll[1]];
                    iArr12[lIIIllllIllll[0]] = lIIIllllIllll[32];
                    if (lIlIIllIIIIllII(Inventory.contains(iArr12) ? 1 : 0)) {
                        if (!lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIllllIllll[3]) || !lIlIIllIIIlIlII(Players.getLocal().getWorldLocation().getX(), lIIIllllIllll[44]) || lIlIIllIIIlIlII(Players.getLocal().getWorldLocation().getX(), lIIIllllIllll[45])) {
                            AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[46]];
                            Movement.walkTo(gQ);
                            "".length();
                            Time.sleepTicks(lIIIllllIllll[1]);
                            "".length();
                        }
                        if (lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gQ), lIIIllllIllll[3]) && lIlIIllIIIlIlII(Players.getLocal().getWorldLocation().getX(), lIIIllllIllll[44]) && lIlIIllIIIIlIll(Players.getLocal().getWorldLocation().getX(), lIIIllllIllll[45])) {
                            int[] iArr13 = new int[lIIIllllIllll[1]];
                            iArr13[lIIIllllIllll[0]] = lIIIllllIllll[47];
                            TileObjects.getNearest(iArr13).interact(lIIIllllIlllI[lIIIllllIllll[48]]);
                            Time.sleepTicks(lIIIllllIllll[3]);
                            "".length();
                        }
                    }
                }
                if (lIlIIllIIIIlIlI(gU ? 1 : 0) && lIlIIllIIIIlIlI(gT ? 1 : 0) && lIlIIllIIIIlIlI(gV ? 1 : 0) && lIlIIllIIIIlIlI(gW ? 1 : 0) && lIlIIllIIIIlIlI(gX ? 1 : 0)) {
                    int[] iArr14 = new int[lIIIllllIllll[1]];
                    iArr14[lIIIllllIllll[0]] = lIIIllllIllll[32];
                    if (lIlIIllIIIIlIlI(Inventory.contains(iArr14) ? 1 : 0)) {
                        if (lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIllllIllll[20])) {
                            AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[49]];
                            Movement.walkTo(gM);
                            "".length();
                            Time.sleepTicks(lIIIllllIllll[1]);
                            "".length();
                        }
                        if (lIlIIllIIIlIIIl(Players.getLocal().getWorldLocation().distanceTo(gM), lIIIllllIllll[20])) {
                            AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[50]];
                            C0006g.a(lIIIllllIlllI[lIIIllllIllll[51]], gL);
                        }
                    }
                }
            }
            if (lIlIIllIIIlIIlI(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), lIIIllllIllll[3])) {
                if (lIlIIllIIIlIIII(Players.getLocal().getWorldLocation().distanceTo(gR), lIIIllllIllll[5])) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[52]];
                    Movement.walkTo(gR);
                    "".length();
                    Time.sleepTicks(lIIIllllIllll[1]);
                    "".length();
                }
                if (lIlIIllIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(gR), lIIIllllIllll[5])) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[53]];
                    int[] iArr15 = new int[lIIIllllIllll[1]];
                    iArr15[lIIIllllIllll[0]] = lIIIllllIllll[54];
                    if (lIlIIllIIIIllII(Inventory.contains(iArr15) ? 1 : 0)) {
                        int[] iArr16 = new int[lIIIllllIllll[1]];
                        iArr16[lIIIllllIllll[0]] = lIIIllllIllll[55];
                        Item first = Inventory.getFirst(iArr16);
                        String[] strArr3 = new String[lIIIllllIllll[1]];
                        strArr3[lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[56]];
                        first.useOn(TileObjects.getNearest(strArr3));
                        Time.sleepTicks(lIIIllllIllll[3]);
                        "".length();
                    }
                    int[] iArr17 = new int[lIIIllllIllll[1]];
                    iArr17[lIIIllllIllll[0]] = lIIIllllIllll[54];
                    if (lIlIIllIIIIlIlI(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[lIIIllllIllll[1]];
                        iArr18[lIIIllllIllll[0]] = lIIIllllIllll[54];
                        Inventory.getFirst(iArr18).interact(lIIIllllIlllI[lIIIllllIllll[57]]);
                        Time.sleepTicks(lIIIllllIllll[3]);
                        "".length();
                    }
                }
            }
            if (lIlIIllIIIlIIlI(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), lIIIllllIllll[5])) {
                if (lIlIIllIIIIllII(Players.getLocal().getWorldLocation().equals(gS) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[58]];
                    Movement.walkTo(gS);
                    "".length();
                    Time.sleepTicks(lIIIllllIllll[1]);
                    "".length();
                }
                if (lIlIIllIIIIlIlI(Players.getLocal().getWorldLocation().equals(gS) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIllllIlllI[lIIIllllIllll[59]];
                    if (lIlIIllIIIlIIll(Players.getLocal().getInteracting())) {
                        if (lIlIIllIIIIlIll(co, lIIIllllIllll[1])) {
                            P.lt += lIIIllllIllll[1];
                            P.d(AccBuilderRat.m);
                            co += lIIIllllIllll[1];
                            P.lt = lIIIllllIllll[0];
                            cp = lIIIllllIllll[0];
                        }
                        String[] strArr4 = new String[lIIIllllIllll[1]];
                        strArr4[lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[60]];
                        Inventory.getFirst(strArr4).interact(lIIIllllIlllI[lIIIllllIllll[61]]);
                        Time.sleepTicks(lIIIllllIllll[5]);
                        "".length();
                    }
                }
            }
            C0006g.a(new String[lIIIllllIllll[0]]);
            System.out.println("Setting: " + Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()));
        }
    }

    private static boolean lIlIIllIIIIlIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIllIIIlIIlI(int i2, int i3) {
        return i2 == i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIllllIlllI[lIIIllllIllll[72]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIllllIllll[0];
    }

    private static boolean lIlIIllIIIlIIll(Object obj) {
        return obj == null;
    }

    private static void W() {
        int[] iArr = new int[lIIIllllIllll[1]];
        iArr[lIIIllllIllll[0]] = lIIIllllIllll[15];
        if (lIlIIllIIIIllII(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllll[15], lIIIllllIllll[1], lIIIllllIllll[63]));
            "".length();
        }
        int[] iArr2 = new int[lIIIllllIllll[1]];
        iArr2[lIIIllllIllll[0]] = lIIIllllIllll[14];
        if (lIlIIllIIIIllII(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllll[14], lIIIllllIllll[1], lIIIllllIllll[64]));
            "".length();
        }
        int[] iArr3 = new int[lIIIllllIllll[1]];
        iArr3[lIIIllllIllll[0]] = lIIIllllIllll[11];
        if (lIlIIllIIIIllII(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllll[11], lIIIllllIllll[16], lIIIllllIllll[65]));
            "".length();
        }
        int[] iArr4 = new int[lIIIllllIllll[1]];
        iArr4[lIIIllllIllll[0]] = lIIIllllIllll[10];
        if (lIlIIllIIIIllII(Bank.contains(iArr4) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllll[10], lIIIllllIllll[1], lIIIllllIllll[66]));
            "".length();
        }
        if (lIlIIllIIIIllII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIllllIlllI[lIIIllllIllll[73]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllll[67], lIIIllllIllll[7], lIIIllllIllll[68]));
            "".length();
        }
        int[] iArr5 = new int[lIIIllllIllll[1]];
        iArr5[lIIIllllIllll[0]] = lIIIllllIllll[69];
        if (lIlIIllIIIIllII(Bank.contains(iArr5) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllll[69], lIIIllllIllll[16], lIIIllllIllll[70]));
            "".length();
        }
        int[] iArr6 = new int[lIIIllllIllll[1]];
        iArr6[lIIIllllIllll[0]] = lIIIllllIllll[17];
        if (lIlIIllIIIIllII(Bank.contains(iArr6) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllll[17], lIIIllllIllll[16], lIIIllllIllll[70]));
            "".length();
        }
        int[] iArr7 = new int[lIIIllllIllll[1]];
        iArr7[lIIIllllIllll[0]] = lIIIllllIllll[13];
        if (lIlIIllIIIIllII(Bank.contains(iArr7) ? 1 : 0)) {
            bA.add(new C0003d(lIIIllllIllll[13], lIIIllllIllll[59], lIIIllllIllll[70]));
            "".length();
        }
        int[] iArr8 = new int[lIIIllllIllll[1]];
        iArr8[lIIIllllIllll[0]] = lIIIllllIllll[12];
        if (lIlIIllIIIIlIlI(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIIIllllIllll[1]];
            iArr9[lIIIllllIllll[0]] = lIIIllllIllll[12];
            if (!lIlIIllIIIIlIlI(Bank.contains(iArr9) ? 1 : 0)) {
                return;
            }
            int[] iArr10 = new int[lIIIllllIllll[1]];
            iArr10[lIIIllllIllll[0]] = lIIIllllIllll[12];
            if (!lIlIIllIIIIlIll(Bank.getFirst(iArr10).getQuantity(), lIIIllllIllll[6])) {
                return;
            }
        }
        bA.add(new C0003d(lIIIllllIllll[12], lIIIllllIllll[6], C0007h.bv));
        "".length();
    }

    private static boolean lIlIIllIIIIllII(int i2) {
        return i2 == 0;
    }

    private static void lIlIIllIIIIlIII() {
        lIIIllllIllll = new int[112];
        lIIIllllIllll[0] = ((114 ^ 104) ^ (4 ^ 20)) & (((((163 + 15) - 56) + 55) ^ (((88 + 73) - 106) + 132)) ^ (-" ".length()));
        lIIIllllIllll[1] = " ".length();
        lIIIllllIllll[2] = 225 ^ 167;
        lIIIllllIllll[3] = "  ".length();
        lIIIllllIllll[4] = (-24065) & 24443;
        lIIIllllIllll[5] = "   ".length();
        lIIIllllIllll[6] = (((105 + 50) - 36) + 67) ^ (((107 + 101) - 124) + 106);
        lIIIllllIllll[7] = (((165 + 4) - 63) + 61) ^ (((121 + 63) - 124) + 102);
        lIIIllllIllll[8] = (-19570) & 24569;
        lIIIllllIllll[9] = (124 ^ 20) ^ (200 ^ 166);
        lIIIllllIllll[10] = (-((-7875) & 24563)) & (-4101) & 32766;
        lIIIllllIllll[11] = (-((-19541) & 23637)) & (-2065) & 8123;
        lIIIllllIllll[12] = (-20139) & 32763;
        lIIIllllIllll[13] = (-1) & 8007;
        lIIIllllIllll[14] = (-((-549) & 25143)) & (-7169) & 32767;
        lIIIllllIllll[15] = (-1026) & 1977;
        lIIIllllIllll[16] = 93 ^ 87;
        lIIIllllIllll[17] = (-24631) & 32639;
        lIIIllllIllll[18] = (-((-10379) & 15515)) & (-16393) & 22523;
        lIIIllllIllll[19] = (-((-17289) & 21407)) & (-24578) & 29695;
        lIIIllllIllll[20] = 90 ^ 82;
        lIIIllllIllll[21] = (((115 + 113) - 120) + 85) ^ (((131 + 170) - 295) + 192);
        lIIIllllIllll[22] = (((12 + 127) - 47) + 94) ^ (((152 + 142) - 224) + 109);
        lIIIllllIllll[23] = 33 ^ 42;
        lIIIllllIllll[24] = 59 ^ 55;
        lIIIllllIllll[25] = (153 ^ 128) ^ (141 ^ 153);
        lIIIllllIllll[26] = (((86 + 11) - 28) + 96) ^ (((117 + 103) - 101) + 52);
        lIIIllllIllll[27] = (((115 + 47) - 101) + 92) ^ (((125 + 74) - 80) + 31);
        lIIIllllIllll[28] = (-((-4149) & 16119)) & (-1) & 12270;
        lIIIllllIllll[29] = 44 ^ 60;
        lIIIllllIllll[30] = (254 ^ 135) ^ (48 ^ 88);
        lIIIllllIllll[31] = 39 ^ 53;
        lIIIllllIllll[32] = (-5137) & 5567;
        lIIIllllIllll[33] = 29 ^ 14;
        lIIIllllIllll[34] = (((159 + 111) - 196) + 94) ^ (((163 + 78) - 145) + 92);
        lIIIllllIllll[35] = 42 ^ 63;
        lIIIllllIllll[36] = (209 ^ 184) ^ (((5 + 2) - (-92)) + 28);
        lIIIllllIllll[37] = (52 ^ 87) ^ (2 ^ 118);
        lIIIllllIllll[38] = 73 ^ 81;
        lIIIllllIllll[39] = (76 ^ 41) ^ (53 ^ 73);
        lIIIllllIllll[40] = 103 ^ 125;
        lIIIllllIllll[41] = (((133 + 148) - 172) + 71) ^ (((60 + 126) - 31) + 20);
        lIIIllllIllll[42] = 68 ^ 88;
        lIIIllllIllll[43] = 132 ^ 153;
        lIIIllllIllll[44] = (-((-17487) & 29823)) & (-17413) & 32757;
        lIIIllllIllll[45] = (-((-24229) & 32447)) & (-16386) & 27615;
        lIIIllllIllll[46] = (((207 + 179) - 208) + 44) ^ (((155 + 37) - 96) + 96);
        lIIIllllIllll[47] = (-10089) & 12159;
        lIIIllllIllll[48] = 171 ^ 180;
        lIIIllllIllll[49] = 32 ^ 0;
        lIIIllllIllll[50] = 62 ^ 31;
        lIIIllllIllll[51] = (97 ^ 41) ^ (29 ^ 119);
        lIIIllllIllll[52] = 132 ^ 167;
        lIIIllllIllll[53] = (((126 + 10) - (-27)) + 6) ^ (((69 + 3) - 1) + 70);
        lIIIllllIllll[54] = (-((-17321) & 32751)) & (-1) & 15863;
        lIIIllllIllll[55] = (-24132) & 24563;
        lIIIllllIllll[56] = 121 ^ 92;
        lIIIllllIllll[57] = 110 ^ 72;
        lIIIllllIllll[58] = (1 ^ 102) ^ (253 ^ 189);
        lIIIllllIllll[59] = (66 ^ 7) ^ (102 ^ 11);
        lIIIllllIllll[60] = (22 ^ 34) ^ (169 ^ 180);
        lIIIllllIllll[61] = (((94 + 9) - 16) + 46) ^ (((12 + 140) - 80) + 103);
        lIIIllllIllll[62] = (((30 + 75) - (-54)) + 25) ^ (((92 + 41) - 75) + 89);
        lIIIllllIllll[63] = (-((-1157) & 25831)) & (-146) & 30719;
        lIIIllllIllll[64] = (-16642) & 23541;
        lIIIllllIllll[65] = (-31827) & 32726;
        lIIIllllIllll[66] = (-((-16682) & 25515)) & (-3) & 32735;
        lIIIllllIllll[67] = (-307) & 12286;
        lIIIllllIllll[68] = (-((-26553) & 32766)) & (-1555) & 32767;
        lIIIllllIllll[69] = (-((-375) & 8695)) & (-6) & 16333;
        lIIIllllIllll[70] = (-30740) & 32639;
        lIIIllllIllll[71] = 85 ^ 49;
        lIIIllllIllll[72] = 14 ^ 34;
        lIIIllllIllll[73] = (((51 + 70) - 4) + 41) ^ (((133 + 143) - 115) + 18);
        lIIIllllIllll[74] = 153 ^ 183;
        lIIIllllIllll[75] = 128 ^ 175;
        lIIIllllIllll[76] = (125 ^ 64) ^ (131 ^ 142);
        lIIIllllIllll[77] = 112 ^ 65;
        lIIIllllIllll[78] = 150 ^ 164;
        lIIIllllIllll[79] = 46 ^ 29;
        lIIIllllIllll[80] = (123 ^ 37) ^ (99 ^ 9);
        lIIIllllIllll[81] = (23 ^ 51) ^ (52 ^ 37);
        lIIIllllIllll[82] = "  ".length() ^ (98 ^ 86);
        lIIIllllIllll[83] = (((39 + 172) - 172) + 135) ^ (((55 + 145) - 145) + 98);
        lIIIllllIllll[84] = 144 ^ 168;
        lIIIllllIllll[85] = 116 ^ 77;
        lIIIllllIllll[86] = 148 ^ 174;
        lIIIllllIllll[87] = (164 ^ 146) ^ (128 ^ 141);
        lIIIllllIllll[88] = (121 ^ 90) ^ (146 ^ 141);
        lIIIllllIllll[89] = (82 ^ 63) ^ (253 ^ 173);
        lIIIllllIllll[90] = (((226 + 99) - 209) + 137) ^ (((39 + 153) - 51) + 54);
        lIIIllllIllll[91] = (39 ^ 44) ^ (68 ^ 112);
        lIIIllllIllll[92] = (7 ^ 48) ^ (200 ^ 191);
        lIIIllllIllll[93] = 100 ^ 37;
        lIIIllllIllll[94] = (((29 + 85) - 41) + 60) ^ (((174 + 85) - 179) + 119);
        lIIIllllIllll[95] = (176 ^ 143) ^ (42 ^ 86);
        lIIIllllIllll[96] = (179 ^ 196) ^ (47 ^ 28);
        lIIIllllIllll[97] = (-12305) & 15358;
        lIIIllllIllll[98] = (-((-1013) & 25589)) & (-4355) & 32183;
        lIIIllllIllll[99] = (-8322) & 11259;
        lIIIllllIllll[100] = (-8961) & 12112;
        lIIIllllIllll[101] = (-20617) & 23544;
        lIIIllllIllll[102] = (-((-20553) & 29663)) & (-4130) & 16383;
        lIIIllllIllll[103] = (-21561) & 24574;
        lIIIllllIllll[104] = (-867) & 4070;
        lIIIllllIllll[105] = (-17470) & 20479;
        lIIIllllIllll[106] = (-((-4249) & 20734)) & (-259) & 19951;
        lIIIllllIllll[107] = (-24685) & 27903;
        lIIIllllIllll[108] = (-12445) & 15839;
        lIIIllllIllll[109] = (-((-7073) & 16361)) & (-20481) & 32767;
        lIIIllllIllll[110] = (-" ".length()) & (-8841) & 12223;
        lIIIllllIllll[111] = 68 ^ 1;
    }

    private static String lIlIIllIIIIIllI(String lllllllllllllllIIIIIIlIllIlIIllI, String lllllllllllllllIIIIIIlIllIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIIlIllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIllllIllll[20]), "DES");
            Cipher lllllllllllllllIIIIIIlIllIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIIIIIlIllIlIlIII.init(lIIIllllIllll[3], lllllllllllllllIIIIIIlIllIlIlIIl);
            return new String(lllllllllllllllIIIIIIlIllIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIlIllIlIIlll) {
            lllllllllllllllIIIIIIlIllIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIIIlllI(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIllIIIIllIl(int i2) {
        return i2 < 0;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            cg();
            "".length();
            if (0 != 0) {
                return ((164 ^ 136) ^ (80 ^ 97)) & (((158 ^ 197) ^ (250 ^ 188)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIllllIllll[71];
    }

    private static boolean lIlIIllIIIlIIII(int i2, int i3) {
        return i2 > i3;
    }

    private static String lIlIIllIIIIIlII(String lllllllllllllllIIIIIIlIllIIIlIIl, String lllllllllllllllIIIIIIlIllIIIlIII) {
        String lllllllllllllllIIIIIIlIllIIIlIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIIlIllIIIIlll = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIIlIllIIIlIII.toCharArray();
        int lllllllllllllllIIIIIIlIllIIIIlIl = lIIIllllIllll[0];
        char[] charArray2 = lllllllllllllllIIIIIIlIllIIIlIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIllllIllll[0];
        while (lIlIIllIIIIlIll(i2, length)) {
            char lllllllllllllllIIIIIIlIllIIIlIlI = charArray2[i2];
            lllllllllllllllIIIIIIlIllIIIIlll.append((char) (lllllllllllllllIIIIIIlIllIIIlIlI ^ charArray[lllllllllllllllIIIIIIlIllIIIIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIIIIIlIllIIIIlIl++;
            i2++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIIlIllIIIIlll);
    }

    private static int lIlIIllIIIIlIIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIlIIllIIIIIlIl(String lllllllllllllllIIIIIIlIllIIlIlll, String lllllllllllllllIIIIIIlIllIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIIlIllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllllIllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIIlIllIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIIlIllIIllIlI) {
            lllllllllllllllIIIIIIlIllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIllIIIIlIlI(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIllIIIIllll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIllIIIlIIIl(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlIIllIIIlIlII(int i2, int i3) {
        return i2 >= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIllIIIlIlII(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), lIIIllllIllll[6])) {
            ?? r0 = lIIIllllIllll[1];
            "".length();
            return "  ".length() < 0 ? (((47 ^ 78) & ((105 ^ 8) ^ (-1))) ^ (47 ^ 108)) & (((37 ^ 49) ^ (21 ^ 66)) ^ (-" ".length())) : r0;
        }
        return lIIIllllIllll[0];
    }

    static {
        lIlIIllIIIIlIII();
        lIlIIllIIIIIlll();
        String[] strArr = new String[lIIIllllIllll[36]];
        strArr[lIIIllllIllll[0]] = lIIIllllIlllI[lIIIllllIllll[75]];
        strArr[lIIIllllIllll[1]] = lIIIllllIlllI[lIIIllllIllll[76]];
        strArr[lIIIllllIllll[3]] = lIIIllllIlllI[lIIIllllIllll[77]];
        strArr[lIIIllllIllll[5]] = lIIIllllIlllI[lIIIllllIllll[78]];
        strArr[lIIIllllIllll[6]] = lIIIllllIlllI[lIIIllllIllll[79]];
        strArr[lIIIllllIllll[7]] = lIIIllllIlllI[lIIIllllIllll[80]];
        strArr[lIIIllllIllll[9]] = lIIIllllIlllI[lIIIllllIllll[81]];
        strArr[lIIIllllIllll[21]] = lIIIllllIlllI[lIIIllllIllll[82]];
        strArr[lIIIllllIllll[20]] = lIIIllllIlllI[lIIIllllIllll[83]];
        strArr[lIIIllllIllll[22]] = lIIIllllIlllI[lIIIllllIllll[84]];
        strArr[lIIIllllIllll[16]] = lIIIllllIlllI[lIIIllllIllll[85]];
        strArr[lIIIllllIllll[23]] = lIIIllllIlllI[lIIIllllIllll[86]];
        strArr[lIIIllllIllll[24]] = lIIIllllIlllI[lIIIllllIllll[87]];
        strArr[lIIIllllIllll[25]] = lIIIllllIlllI[lIIIllllIllll[88]];
        strArr[lIIIllllIllll[26]] = lIIIllllIlllI[lIIIllllIllll[89]];
        strArr[lIIIllllIllll[27]] = lIIIllllIlllI[lIIIllllIllll[90]];
        strArr[lIIIllllIllll[29]] = lIIIllllIlllI[lIIIllllIllll[91]];
        strArr[lIIIllllIllll[30]] = lIIIllllIlllI[lIIIllllIllll[92]];
        strArr[lIIIllllIllll[31]] = lIIIllllIlllI[lIIIllllIllll[93]];
        strArr[lIIIllllIllll[33]] = lIIIllllIlllI[lIIIllllIllll[94]];
        strArr[lIIIllllIllll[34]] = lIIIllllIlllI[lIIIllllIllll[95]];
        strArr[lIIIllllIllll[35]] = lIIIllllIlllI[lIIIllllIllll[96]];
        gL = strArr;
        gM = new WorldPoint(lIIIllllIllll[97], lIIIllllIllll[98], lIIIllllIllll[0]);
        gN = new WorldPoint(lIIIllllIllll[99], lIIIllllIllll[100], lIIIllllIllll[0]);
        gO = new WorldPoint(lIIIllllIllll[101], lIIIllllIllll[102], lIIIllllIllll[0]);
        gP = new WorldPoint(lIIIllllIllll[103], lIIIllllIllll[104], lIIIllllIllll[0]);
        gQ = new WorldPoint(lIIIllllIllll[105], lIIIllllIllll[106], lIIIllllIllll[0]);
        gR = new WorldPoint(lIIIllllIllll[107], lIIIllllIllll[108], lIIIllllIllll[1]);
        gS = new WorldPoint(lIIIllllIllll[109], lIIIllllIllll[110], lIIIllllIllll[0]);
        bA = new ArrayList();
        bY = lIIIllllIllll[0];
    }
}
