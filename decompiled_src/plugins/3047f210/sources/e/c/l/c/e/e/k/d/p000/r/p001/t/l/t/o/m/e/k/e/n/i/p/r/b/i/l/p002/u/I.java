package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.I  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/I.class */
public class I implements S {
    private static /* synthetic */ boolean hJ;
    private static /* synthetic */ boolean hI;
    private static final /* synthetic */ WorldPoint hC;
    private static final /* synthetic */ WorldPoint hD;
    static /* synthetic */ int ck;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ boolean hK;
    private static final /* synthetic */ WorldPoint hG;
    static /* synthetic */ boolean cl;
    private static final /* synthetic */ WorldPoint hB;
    public static final /* synthetic */ String[] hz;
    private static /* synthetic */ boolean hL;
    private static /* synthetic */ String[] lllllIllll;
    public static /* synthetic */ List<C0003d> bu;
    private static final /* synthetic */ WorldPoint hE;
    private static final /* synthetic */ WorldPoint hA;
    private static /* synthetic */ boolean hH;
    private static final /* synthetic */ WorldPoint hF;
    private static /* synthetic */ int[] llllllIIIl;
    static /* synthetic */ int bS;

    private static String llIlIlIllIIIl(String lllllllllllllllllIlIIIllIllIIIlI, String lllllllllllllllllIlIIIllIllIIIIl) {
        try {
            SecretKeySpec lllllllllllllllllIlIIIllIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIllIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllIIIl[3], lllllllllllllllllIlIIIllIllIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIllIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIllIllIIIll) {
            lllllllllllllllllIlIIIllIllIIIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllllIIIl[0];
    }

    static {
        llIlIllIIIlII();
        llIlIllIIIIll();
        String[] strArr = new String[llllllIIIl[36]];
        strArr[llllllIIIl[0]] = lllllIllll[llllllIIIl[75]];
        strArr[llllllIIIl[1]] = lllllIllll[llllllIIIl[76]];
        strArr[llllllIIIl[3]] = lllllIllll[llllllIIIl[77]];
        strArr[llllllIIIl[5]] = lllllIllll[llllllIIIl[78]];
        strArr[llllllIIIl[6]] = lllllIllll[llllllIIIl[79]];
        strArr[llllllIIIl[7]] = lllllIllll[llllllIIIl[80]];
        strArr[llllllIIIl[9]] = lllllIllll[llllllIIIl[81]];
        strArr[llllllIIIl[21]] = lllllIllll[llllllIIIl[82]];
        strArr[llllllIIIl[20]] = lllllIllll[llllllIIIl[83]];
        strArr[llllllIIIl[22]] = lllllIllll[llllllIIIl[84]];
        strArr[llllllIIIl[16]] = lllllIllll[llllllIIIl[85]];
        strArr[llllllIIIl[23]] = lllllIllll[llllllIIIl[86]];
        strArr[llllllIIIl[24]] = lllllIllll[llllllIIIl[87]];
        strArr[llllllIIIl[25]] = lllllIllll[llllllIIIl[88]];
        strArr[llllllIIIl[26]] = lllllIllll[llllllIIIl[89]];
        strArr[llllllIIIl[27]] = lllllIllll[llllllIIIl[90]];
        strArr[llllllIIIl[29]] = lllllIllll[llllllIIIl[91]];
        strArr[llllllIIIl[30]] = lllllIllll[llllllIIIl[92]];
        strArr[llllllIIIl[31]] = lllllIllll[llllllIIIl[93]];
        strArr[llllllIIIl[33]] = lllllIllll[llllllIIIl[94]];
        strArr[llllllIIIl[34]] = lllllIllll[llllllIIIl[95]];
        strArr[llllllIIIl[35]] = lllllIllll[llllllIIIl[96]];
        hz = strArr;
        hA = new WorldPoint(llllllIIIl[97], llllllIIIl[98], llllllIIIl[0]);
        hB = new WorldPoint(llllllIIIl[99], llllllIIIl[100], llllllIIIl[0]);
        hC = new WorldPoint(llllllIIIl[101], llllllIIIl[102], llllllIIIl[0]);
        hD = new WorldPoint(llllllIIIl[103], llllllIIIl[104], llllllIIIl[0]);
        hE = new WorldPoint(llllllIIIl[105], llllllIIIl[106], llllllIIIl[0]);
        hF = new WorldPoint(llllllIIIl[107], llllllIIIl[108], llllllIIIl[1]);
        hG = new WorldPoint(llllllIIIl[109], llllllIIIl[110], llllllIIIl[0]);
        bu = new ArrayList();
        bS = llllllIIIl[0];
    }

    private static void llIlIllIIIIll() {
        lllllIllll = new String[llllllIIIl[111]];
        lllllIllll[llllllIIIl[0]] = llIlIlIllIIII("MxotBQYWTz0YDRwc", "qoTlh");
        lllllIllll[llllllIIIl[1]] = llIlIlIllIIII("LxALKDkBHAFhKBwADC8tSRARJCcaVUUyPQANBikjBx5FIysKEkU1JUkIECQ5HQ==", "iyeAJ");
        lllllIllll[llllllIIIl[3]] = llIlIlIllIIIl("esD/LZ71msY=", "CvzlL");
        lllllIllll[llllllIIIl[5]] = llIlIlIllIIII("BiYV", "CGaxI");
        lllllIllll[llllllIIIl[6]] = llIlIlIllIIlI("eEZzO17+qS00OZgmwbFPyQ==", "iNVRj");
        lllllIllll[llllllIIIl[7]] = llIlIlIllIIIl("fYnujC8os3hLyUVHm9oGXFJXvoO5ed6X", "sheRB");
        lllllIllll[llllllIIIl[9]] = llIlIlIllIIII("DgdoOQU8QiUxBCoLJj9XKBctKwN5ET0oBzULLStbeRE/MQM6CiE2EHkWJ3g1DDsBFjA=", "YbHXw");
        lllllIllll[llllllIIIl[21]] = llIlIlIllIIIl("RDav8xG26rynV+PNkvIFNw==", "vhzwZ");
        lllllIllll[llllllIIIl[20]] = llIlIlIllIIII("DgA7Jx0mDTtiATcN", "GnOBo");
        lllllIllll[llllllIIIl[22]] = llIlIlIllIIII("CDI1Owc7JTV5JCg2PzI=", "ZWQYb");
        lllllIllll[llllllIIIl[16]] = llIlIlIllIIlI("JFldZbumTdfK6P5Kn6lvFg==", "dQXSM");
        lllllIllll[llllllIIIl[23]] = llIlIlIllIIlI("9cWyCcB3nzQLkY2VPVWb/w==", "IcZpt");
        lllllIllll[llllllIIIl[24]] = llIlIlIllIIIl("IUw+IEJYXwY=", "pwwLM");
        lllllIllll[llllllIIIl[25]] = llIlIlIllIIII("DRwLdikLFRozahAHAHE+", "ytnVJ");
        lllllIllll[llllllIIIl[26]] = llIlIlIllIIIl("NBCoLnHFJ/1XKl5oGMP0/g==", "WxVlr");
        lllllIllll[llllllIIIl[27]] = llIlIlIllIIlI("ZXMW0nRW3bg=", "ZfAVq");
        lllllIllll[llllllIIIl[29]] = llIlIlIllIIlI("IN2Xv+gUDz4=", "FJvsT");
        lllllIllll[llllllIIIl[30]] = llIlIlIllIIII("EDw7NCs=", "DNZPN");
        lllllIllll[llllllIIIl[31]] = llIlIlIllIIlI("LMbxTQlGl5Y=", "AcYQM");
        lllllIllll[llllllIIIl[33]] = llIlIlIllIIIl("H9j7haQjZzN2vdhgXeVFEg==", "xsNww");
        lllllIllll[llllllIIIl[34]] = llIlIlIllIIlI("3TLFCwXQj3hTCuAY40LmVw==", "mxzEq");
        lllllIllll[llllllIIIl[35]] = llIlIlIllIIlI("gmgT6qmMGoY=", "foYwC");
        lllllIllll[llllllIIIl[36]] = llIlIlIllIIIl("6Zkud62Q/bM=", "ZGzMK");
        lllllIllll[llllllIIIl[37]] = llIlIlIllIIII("KRgiJAsHGCIqWAUeLg==", "oqLMx");
        lllllIllll[llllllIIIl[38]] = llIlIlIllIIlI("ViAKl6nAXXI=", "JfFUn");
        lllllIllll[llllllIIIl[39]] = llIlIlIllIIlI("t6mhEiQGcv+dPc0785yXzw==", "RZLZu");
        lllllIllll[llllllIIIl[40]] = llIlIlIllIIlI("bRJjpeuYY8IS4mdgTY/pvA==", "HzDDI");
        lllllIllll[llllllIIIl[41]] = llIlIlIllIIII("PBcEGw==", "kreiK");
        lllllIllll[llllllIIIl[42]] = llIlIlIllIIIl("V1zR8uHd5Nc=", "CzqHb");
        lllllIllll[llllllIIIl[43]] = llIlIlIllIIlI("s5Tcpzsgrw0rhDQTQVVzS8+H5ZH5Ai8h", "ZGEvw");
        lllllIllll[llllllIIIl[46]] = llIlIlIllIIIl("u2PQ4WheEyumXG0ekTNA8Q==", "xmTHo");
        lllllIllll[llllllIIIl[48]] = llIlIlIllIIlI("GGOKlUYtb+c=", "Iduyt");
        lllllIllll[llllllIIIl[49]] = llIlIlIllIIIl("VOPgcxy2SHuJxY16bUgBDQ==", "qQSUJ");
        lllllIllll[llllllIIIl[50]] = llIlIlIllIIII("BRY+ATAtGz5ELDwb", "LxJdB");
        lllllIllll[llllllIIIl[51]] = llIlIlIllIIIl("jHFnDK4JuAMfiR19FnvCHQ==", "fmtuL");
        lllllIllll[llllllIIIl[52]] = llIlIlIllIIII("AS8ZQhogbgwKCzw6", "ONobn");
        lllllIllll[llllllIIIl[53]] = llIlIlIllIIII("FCweERs9LkoIFyA6CwIX", "SIjer");
        lllllIllll[llllllIIIl[56]] = llIlIlIllIIII("LgwrPxg=", "mdNLl");
        lllllIllll[llllllIIIl[57]] = llIlIlIllIIlI("joGN/2zdw2w=", "edjQX");
        lllllIllll[llllllIIIl[58]] = llIlIlIllIIIl("hkJDIBVgK4PcUMGaO4RHbA==", "CTpmV");
        lllllIllll[llllllIIIl[59]] = llIlIlIllIIII("Ej81MQQ4MQ==", "VVRVm");
        lllllIllll[llllllIIIl[60]] = llIlIlIllIIlI("SagYb9VNE+s=", "dmhWU");
        lllllIllll[llllllIIIl[61]] = llIlIlIllIIlI("1t3PT3O0GqQ=", "uxVpX");
        lllllIllll[llllllIIIl[62]] = llIlIlIllIIlI("hRb9H7sa0Yw=", "QDnRj");
        lllllIllll[llllllIIIl[72]] = llIlIlIllIIIl("urw2I+wj3xoPHHx0ZztiQTbFboN6ewI7", "UQghX");
        lllllIllll[llllllIIIl[73]] = llIlIlIllIIIl("RYYGH1F6gfdtE/UG/XsJDf44iOzWbjNz", "cImGN");
        lllllIllll[llllllIIIl[74]] = llIlIlIllIIII("PB0+HA==", "ztRpk");
        lllllIllll[llllllIIIl[75]] = llIlIlIllIIIl("e+J0ATKkQtq6gReyavNJT6r2wusQnqhoiicoq3CYW5g=", "iRKZm");
        lllllIllll[llllllIIIl[76]] = llIlIlIllIIIl("ULM9+7n9n4VuYSf2ZkSmt12+27WR+EP0DBlPiiqouYZidVcobNJV5w==", "YxKwp");
        lllllIllll[llllllIIIl[77]] = llIlIlIllIIIl("cg3g6Fi1rLoYYDjDsrsMrQUiWJxguDcO", "knQyS");
        lllllIllll[llllllIIIl[78]] = llIlIlIllIIII("LQwZfA==", "tijRK");
        lllllIllll[llllllIIIl[79]] = llIlIlIllIIII("LE49egcKBjszBQJJNjUZRQhwKx4AGiR7", "eiPZk");
        lllllIllll[llllllIIIl[80]] = llIlIlIllIIIl("BaMhYLxA1BT4d712T+lWtB8bpak23eRh", "qaZRB");
        lllllIllll[llllllIIIl[81]] = llIlIlIllIIIl("OEYG2/TPlvg9I3Zb0M0oXAbony9Niqjf2fQ6XyF0ikJwHLuzTHSV3w==", "JASBP");
        lllllIllll[llllllIIIl[82]] = llIlIlIllIIIl("dgMDBQ+GW0SXliJvPWxMRBwOopKukFM/vcEgh7gH+P5jZBNlFFClr1HEWvJ6yx6l", "bTqYI");
        lllllIllll[llllllIIIl[83]] = llIlIlIllIIIl("LRiK9fp0+QRTF0br33CwmPfoxT6tZF5XgO3NhePvPMf614h5krk+/A==", "rSwYv");
        lllllIllll[llllllIIIl[84]] = llIlIlIllIIlI("DVGdg80hMx8=", "KSduK");
        lllllIllll[llllllIIIl[85]] = llIlIlIllIIlI("RPFpRuHiOpq1FMeBLbLeCvfD0stsM+68vE+Vm8lH3dflMgJ7lCccwg==", "WwJXH");
        lllllIllll[llllllIIIl[86]] = llIlIlIllIIIl("RMKwRmtX65selgeqPcTWIQ==", "NwDRA");
        lllllIllll[llllllIIIl[87]] = llIlIlIllIIlI("3/PtdVwNeq2BYeGNYuelPA==", "iVupR");
        lllllIllll[llllllIIIl[88]] = llIlIlIllIIII("PW00UTgbJTIYOhNqPx4mVCt5ACEROS1f", "tJYqT");
        lllllIllll[llllllIIIl[89]] = llIlIlIllIIII("DEY4aT4rQSYsNjcCPWk4I0EhOzIkEiA7Mms=", "EaUIW");
        lllllIllll[llllllIIIl[90]] = llIlIlIllIIlI("LzaOkals4Hc=", "kzAah");
        lllllIllll[llllllIIIl[91]] = llIlIlIllIIlI("iEB1SpR/7j/gbNAKl558hC4GJYNbuekdfPFPxBAILXtse3DSIf1t05xE1N63NtaimFw8+HwQNPU=", "EQpbB");
        lllllIllll[llllllIIIl[92]] = llIlIlIllIIII("Bx8PIyxzDgE4a3M+SSErcxULbSg9VwM0ZyQWFw==", "SwnMG");
        lllllIllll[llllllIIIl[93]] = llIlIlIllIIlI("DiodnyIIBm5TijGx5kYguxoivp+eMsco", "zqZUu");
        lllllIllll[llllllIIIl[94]] = llIlIlIllIIlI("wwgY/Q1ygnl/DV+UB0tck1QfU9rjK1OtPZItTHzJ15Y=", "tMhHd");
        lllllIllll[llllllIIIl[95]] = llIlIlIllIIlI("Eb36irbu8mgjbKzsiJAR1HotkoomEJK4TzgsLB8trkiuzXELIzHO5w==", "chzQH");
        lllllIllll[llllllIIIl[96]] = llIlIlIllIIlI("GF87q5h99vo=", "KGIve");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v249, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v324, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v362, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v423, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v522, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v567, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    public static void cU() {
        if (llIlIllIIIllI(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[0]];
            C0001b.a(bu);
            if (llIlIllIIIlll(bu.size(), llllllIIIl[1])) {
                System.out.println(lllllIllll[llllllIIIl[1]]);
                bs = llllllIIIl[0];
            }
        }
        if (llIlIllIIlIII(bs ? 1 : 0)) {
            if (llIlIllIIIllI(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlIllIIIlll(Movement.getRunEnergy(), llllllIIIl[2])) {
                Inventory.getFirst(C0005f.aU).interact(lllllIllll[llllllIIIl[3]]);
                Time.sleepTicks(llllllIIIl[1]);
                "".length();
            }
            if (llIlIllIIlIIl(llIlIllIIIlIl(C0004e.u(), 70.0d))) {
                int[] iArr = new int[llllllIIIl[1]];
                iArr[llllllIIIl[0]] = llllllIIIl[4];
                if (llIlIllIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llllllIIIl[1]];
                    iArr2[llllllIIIl[0]] = llllllIIIl[4];
                    Inventory.getFirst(iArr2).interact(lllllIllll[llllllIIIl[5]]);
                }
            }
            if (llIlIllIIlIII(Movement.isRunEnabled() ? 1 : 0) && llIlIllIIlIlI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIlIllIIlIII(aa() ? 1 : 0) && llIlIllIIlIII(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIllIIlIll(nearest) && llIlIllIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(llllllIIIl[3]);
                    "".length();
                }
                if (llIlIllIIlIll(nearest) && llIlIllIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[7]];
                    if (llIlIllIIlIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllllIIIl[8]);
                        "".length();
                    }
                    if (llIlIllIIIllI(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIllIIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllllIIIl[6]);
                            "".length();
                        }
                        if (llIlIllIIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllllIIIl[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[llllllIIIl[9]];
                        iArr3[llllllIIIl[0]] = llllllIIIl[10];
                        iArr3[llllllIIIl[1]] = llllllIIIl[11];
                        iArr3[llllllIIIl[3]] = llllllIIIl[12];
                        iArr3[llllllIIIl[5]] = llllllIIIl[13];
                        iArr3[llllllIIIl[6]] = llllllIIIl[14];
                        iArr3[llllllIIIl[7]] = llllllIIIl[15];
                        if (llIlIllIIlIII(C0004e.b(iArr3) ? 1 : 0)) {
                            ae();
                            System.out.println(lllllIllll[llllllIIIl[9]]);
                            bs = llllllIIIl[1];
                            return;
                        }
                        Bank.withdraw(llllllIIIl[11], llllllIIIl[16], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIIIl[1]);
                        "".length();
                        Bank.withdraw(llllllIIIl[15], llllllIIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIIIl[1]);
                        "".length();
                        Bank.withdraw(llllllIIIl[14], llllllIIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIIIl[1]);
                        "".length();
                        Bank.withdraw(llllllIIIl[17], llllllIIIl[16], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIIIl[1]);
                        "".length();
                        Bank.withdraw(llllllIIIl[13], llllllIIIl[7], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIIIl[1]);
                        "".length();
                        Bank.withdraw(llllllIIIl[10], llllllIIIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllIIIl[1]);
                        "".length();
                        C0000a.a(llllllIIIl[18], llllllIIIl[19]);
                        C0000a.b(C0005f.aU, llllllIIIl[3]);
                        C0000a.b(C0005f.be, llllllIIIl[1]);
                    }
                }
            }
            if (llIlIllIIIllI(aa() ? 1 : 0) && llIlIllIIlIII(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()))) {
                if (llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hA), llllllIIIl[20])) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[21]];
                    if (llIlIllIIIllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(hA);
                    "".length();
                    Time.sleepTicks(llllllIIIl[1]);
                    "".length();
                }
                if (llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hA), llllllIIIl[20])) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[20]];
                    C0006g.a(lllllIllll[llllllIIIl[22]], hz);
                }
            }
            if (llIlIllIIlllI(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), llllllIIIl[1])) {
                ck = llllllIIIl[0];
                if (llIlIllIIlIII(hH ? 1 : 0)) {
                    if (llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hB), llllllIIIl[5])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[16]];
                        Movement.walkTo(hB);
                        "".length();
                        Time.sleepTicks(llllllIIIl[1]);
                        "".length();
                    }
                    if (llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hB), llllllIIIl[5])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[23]];
                        C0006g.a(lllllIllll[llllllIIIl[24]], hz);
                        List options = Dialog.getOptions();
                        if (llIlIllIIlIII(options.isEmpty() ? 1 : 0)) {
                            int i = llllllIIIl[0];
                            while (llIlIllIIIlll(i, options.size())) {
                                if (llIlIllIIIllI(((Widget) options.get(i)).getText().contains(lllllIllll[llllllIIIl[25]]) ? 1 : 0)) {
                                    hH = llllllIIIl[1];
                                }
                                i++;
                                "".length();
                                if ((((13 ^ 4) ^ (67 ^ 93)) & (((216 ^ 157) ^ (194 ^ 144)) ^ (-" ".length()))) > " ".length()) {
                                    return;
                                }
                            }
                        }
                    }
                }
                if (llIlIllIIIllI(hH ? 1 : 0) && llIlIllIIlIII(hJ ? 1 : 0)) {
                    if (llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hC), llllllIIIl[7])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[26]];
                        Movement.walkTo(hC);
                        "".length();
                        Time.sleepTicks(llllllIIIl[1]);
                        "".length();
                    }
                    if (llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hC), llllllIIIl[7])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[27]];
                        Widget widget = Widgets.get(llllllIIIl[28], llllllIIIl[29], llllllIIIl[3]);
                        if (llIlIllIIllll(widget)) {
                            String[] strArr = new String[llllllIIIl[1]];
                            strArr[llllllIIIl[0]] = lllllIllll[llllllIIIl[29]];
                            NPCs.getNearest(strArr).interact(lllllIllll[llllllIIIl[30]]);
                            Time.sleepTicks(llllllIIIl[3]);
                            "".length();
                        }
                        if (llIlIllIIlIll(widget)) {
                            widget.interact(lllllIllll[llllllIIIl[31]]);
                            Time.sleepTicks(llllllIIIl[1]);
                            "".length();
                        }
                    }
                    int[] iArr4 = new int[llllllIIIl[1]];
                    iArr4[llllllIIIl[0]] = llllllIIIl[32];
                    if (llIlIllIIIllI(Inventory.contains(iArr4) ? 1 : 0)) {
                        hJ = llllllIIIl[1];
                    }
                }
                if (llIlIllIIIllI(hH ? 1 : 0) && llIlIllIIIllI(hJ ? 1 : 0) && llIlIllIIlIII(hI ? 1 : 0)) {
                    if (llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hB), llllllIIIl[9])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[33]];
                        Movement.walkTo(hB);
                        "".length();
                        Time.sleepTicks(llllllIIIl[1]);
                        "".length();
                    }
                    if (llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hB), llllllIIIl[9])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[34]];
                        int[] iArr5 = new int[llllllIIIl[1]];
                        iArr5[llllllIIIl[0]] = llllllIIIl[11];
                        if (llIlIllIIIllI(Inventory.contains(iArr5) ? 1 : 0)) {
                            String[] strArr2 = new String[llllllIIIl[1]];
                            strArr2[llllllIIIl[0]] = lllllIllll[llllllIIIl[35]];
                            TileObjects.getNearest(strArr2).interact(lllllIllll[llllllIIIl[36]]);
                            Time.sleepTicks(llllllIIIl[5]);
                            "".length();
                        }
                        int[] iArr6 = new int[llllllIIIl[1]];
                        iArr6[llllllIIIl[0]] = llllllIIIl[11];
                        if (llIlIllIIlIII(Inventory.contains(iArr6) ? 1 : 0)) {
                            int[] iArr7 = new int[llllllIIIl[1]];
                            iArr7[llllllIIIl[0]] = llllllIIIl[32];
                            Inventory.getFirst(iArr7).useOn(TileObjects.getNearest(tileObject -> {
                                String[] strArr3 = new String[llllllIIIl[1]];
                                strArr3[llllllIIIl[0]] = lllllIllll[llllllIIIl[74]];
                                return tileObject.hasAction(strArr3);
                            }));
                            Time.sleepTicks(llllllIIIl[5]);
                            "".length();
                        }
                        int[] iArr8 = new int[llllllIIIl[1]];
                        iArr8[llllllIIIl[0]] = llllllIIIl[11];
                        if (llIlIllIIlIII(Inventory.contains(iArr8) ? 1 : 0)) {
                            int[] iArr9 = new int[llllllIIIl[1]];
                            iArr9[llllllIIIl[0]] = llllllIIIl[32];
                            if (llIlIllIIlIII(Inventory.contains(iArr9) ? 1 : 0)) {
                                hI = llllllIIIl[1];
                            }
                        }
                    }
                }
                if (llIlIllIIIllI(hI ? 1 : 0) && llIlIllIIIllI(hH ? 1 : 0) && llIlIllIIIllI(hJ ? 1 : 0) && llIlIllIIlIII(hK ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[37]];
                    C0006g.a(lllllIllll[llllllIIIl[38]], hz);
                    String text = Dialog.getText();
                    if (llIlIllIIlIll(text) && llIlIllIIIllI(text.contains(lllllIllll[llllllIIIl[39]]) ? 1 : 0)) {
                        hK = llllllIIIl[1];
                    }
                }
                if (llIlIllIIIllI(hI ? 1 : 0) && llIlIllIIIllI(hH ? 1 : 0) && llIlIllIIIllI(hJ ? 1 : 0) && llIlIllIIIllI(hK ? 1 : 0) && llIlIllIIlIII(hL ? 1 : 0)) {
                    if (llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hD), llllllIIIl[5])) {
                        AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[40]];
                        int[] iArr10 = new int[llllllIIIl[1]];
                        iArr10[llllllIIIl[0]] = llllllIIIl[14];
                        if (llIlIllIIIllI(Inventory.contains(iArr10) ? 1 : 0)) {
                            int[] iArr11 = new int[llllllIIIl[1]];
                            iArr11[llllllIIIl[0]] = llllllIIIl[14];
                            Inventory.getFirst(iArr11).interact(lllllIllll[llllllIIIl[41]]);
                        }
                        C0006g.a(hz);
                        if (llIlIllIIlIII(Dialog.isOpen() ? 1 : 0)) {
                            Movement.walkTo(hD);
                            "".length();
                            Time.sleepTicks(llllllIIIl[1]);
                            "".length();
                        }
                    }
                    if (llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hD), llllllIIIl[5])) {
                        C0006g.a(lllllIllll[llllllIIIl[42]], hz);
                    }
                    List options2 = Dialog.getOptions();
                    if (llIlIllIIlIII(options2.isEmpty() ? 1 : 0)) {
                        int i2 = llllllIIIl[0];
                        while (llIlIllIIIlll(i2, options2.size())) {
                            if (llIlIllIIIllI(((Widget) options2.get(i2)).getText().contains(lllllIllll[llllllIIIl[43]]) ? 1 : 0)) {
                                hL = llllllIIIl[1];
                            }
                            i2++;
                            "".length();
                            if ((((((98 + 142) - 81) + 53) ^ (((118 + 54) - 127) + 105)) & (((184 ^ 176) ^ (233 ^ 163)) ^ (-" ".length()))) != 0) {
                                return;
                            }
                        }
                    }
                }
                if (llIlIllIIIllI(hI ? 1 : 0) && llIlIllIIIllI(hH ? 1 : 0) && llIlIllIIIllI(hJ ? 1 : 0) && llIlIllIIIllI(hK ? 1 : 0) && llIlIllIIIllI(hL ? 1 : 0)) {
                    int[] iArr12 = new int[llllllIIIl[1]];
                    iArr12[llllllIIIl[0]] = llllllIIIl[32];
                    if (llIlIllIIlIII(Inventory.contains(iArr12) ? 1 : 0)) {
                        if (!llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hE), llllllIIIl[3]) || !llIlIllIlIIII(Players.getLocal().getWorldLocation().getX(), llllllIIIl[44]) || llIlIllIlIIII(Players.getLocal().getWorldLocation().getX(), llllllIIIl[45])) {
                            AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[46]];
                            Movement.walkTo(hE);
                            "".length();
                            Time.sleepTicks(llllllIIIl[1]);
                            "".length();
                        }
                        if (llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hE), llllllIIIl[3]) && llIlIllIlIIII(Players.getLocal().getWorldLocation().getX(), llllllIIIl[44]) && llIlIllIIIlll(Players.getLocal().getWorldLocation().getX(), llllllIIIl[45])) {
                            int[] iArr13 = new int[llllllIIIl[1]];
                            iArr13[llllllIIIl[0]] = llllllIIIl[47];
                            TileObjects.getNearest(iArr13).interact(lllllIllll[llllllIIIl[48]]);
                            Time.sleepTicks(llllllIIIl[3]);
                            "".length();
                        }
                    }
                }
                if (llIlIllIIIllI(hI ? 1 : 0) && llIlIllIIIllI(hH ? 1 : 0) && llIlIllIIIllI(hJ ? 1 : 0) && llIlIllIIIllI(hK ? 1 : 0) && llIlIllIIIllI(hL ? 1 : 0)) {
                    int[] iArr14 = new int[llllllIIIl[1]];
                    iArr14[llllllIIIl[0]] = llllllIIIl[32];
                    if (llIlIllIIIllI(Inventory.contains(iArr14) ? 1 : 0)) {
                        if (llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hA), llllllIIIl[20])) {
                            AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[49]];
                            Movement.walkTo(hA);
                            "".length();
                            Time.sleepTicks(llllllIIIl[1]);
                            "".length();
                        }
                        if (llIlIllIIllIl(Players.getLocal().getWorldLocation().distanceTo(hA), llllllIIIl[20])) {
                            AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[50]];
                            C0006g.a(lllllIllll[llllllIIIl[51]], hz);
                        }
                    }
                }
            }
            if (llIlIllIIlllI(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), llllllIIIl[3])) {
                if (llIlIllIIllII(Players.getLocal().getWorldLocation().distanceTo(hF), llllllIIIl[5])) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[52]];
                    Movement.walkTo(hF);
                    "".length();
                    Time.sleepTicks(llllllIIIl[1]);
                    "".length();
                }
                if (llIlIllIIIlll(Players.getLocal().getWorldLocation().distanceTo(hF), llllllIIIl[5])) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[53]];
                    int[] iArr15 = new int[llllllIIIl[1]];
                    iArr15[llllllIIIl[0]] = llllllIIIl[54];
                    if (llIlIllIIlIII(Inventory.contains(iArr15) ? 1 : 0)) {
                        int[] iArr16 = new int[llllllIIIl[1]];
                        iArr16[llllllIIIl[0]] = llllllIIIl[55];
                        Item first = Inventory.getFirst(iArr16);
                        String[] strArr3 = new String[llllllIIIl[1]];
                        strArr3[llllllIIIl[0]] = lllllIllll[llllllIIIl[56]];
                        first.useOn(TileObjects.getNearest(strArr3));
                        Time.sleepTicks(llllllIIIl[3]);
                        "".length();
                    }
                    int[] iArr17 = new int[llllllIIIl[1]];
                    iArr17[llllllIIIl[0]] = llllllIIIl[54];
                    if (llIlIllIIIllI(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[llllllIIIl[1]];
                        iArr18[llllllIIIl[0]] = llllllIIIl[54];
                        Inventory.getFirst(iArr18).interact(lllllIllll[llllllIIIl[57]]);
                        Time.sleepTicks(llllllIIIl[3]);
                        "".length();
                    }
                }
            }
            if (llIlIllIIlllI(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), llllllIIIl[5])) {
                if (llIlIllIIlIII(Players.getLocal().getWorldLocation().equals(hG) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[58]];
                    Movement.walkTo(hG);
                    "".length();
                    Time.sleepTicks(llllllIIIl[1]);
                    "".length();
                }
                if (llIlIllIIIllI(Players.getLocal().getWorldLocation().equals(hG) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllllIllll[llllllIIIl[59]];
                    if (llIlIllIIllll(Players.getLocal().getInteracting())) {
                        if (llIlIllIIIlll(ck, llllllIIIl[1])) {
                            ac.mR += llllllIIIl[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += llllllIIIl[1];
                            ac.mR = llllllIIIl[0];
                            cl = llllllIIIl[0];
                        }
                        String[] strArr4 = new String[llllllIIIl[1]];
                        strArr4[llllllIIIl[0]] = lllllIllll[llllllIIIl[60]];
                        Inventory.getFirst(strArr4).interact(lllllIllll[llllllIIIl[61]]);
                        Time.sleepTicks(llllllIIIl[5]);
                        "".length();
                    }
                }
            }
            C0006g.a(new String[llllllIIIl[0]]);
            System.out.println("Setting: " + Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()));
        }
    }

    private static void llIlIllIIIlII() {
        llllllIIIl = new int[112];
        llllllIIIl[0] = ((((155 + 168) - 159) + 36) ^ (((105 + 78) - 47) + 1)) & (((122 ^ 109) ^ (8 ^ 94)) ^ (-" ".length()));
        llllllIIIl[1] = " ".length();
        llllllIIIl[2] = (((149 + 99) - 125) + 71) ^ (((31 + 122) - 128) + 107);
        llllllIIIl[3] = "  ".length();
        llllllIIIl[4] = (-16385) & 16763;
        llllllIIIl[5] = "   ".length();
        llllllIIIl[6] = 133 ^ 129;
        llllllIIIl[7] = 179 ^ 182;
        llllllIIIl[8] = (-18548) & 23547;
        llllllIIIl[9] = 121 ^ 127;
        llllllIIIl[10] = (-((-6289) & 22966)) & (-4113) & 32767;
        llllllIIIl[11] = (-10305) & 12267;
        llllllIIIl[12] = (-((-8455) & 12207)) & (-5) & 16381;
        llllllIIIl[13] = (-16401) & 24407;
        llllllIIIl[14] = (-((-1153) & 19601)) & (-8193) & 27645;
        llllllIIIl[15] = (-3140) & 4091;
        llllllIIIl[16] = (((5 + 75) - 3) + 64) ^ (((77 + 52) - 79) + 85);
        llllllIIIl[17] = (-16563) & 24571;
        llllllIIIl[18] = (-19465) & 20459;
        llllllIIIl[19] = (-((-4585) & 13819)) & (-2050) & 12283;
        llllllIIIl[20] = (3 ^ 71) ^ (83 ^ 31);
        llllllIIIl[21] = (119 ^ 125) ^ (126 ^ 115);
        llllllIIIl[22] = (22 ^ 108) ^ (94 ^ 45);
        llllllIIIl[23] = (47 ^ 92) ^ (29 ^ 101);
        llllllIIIl[24] = 24 ^ 20;
        llllllIIIl[25] = 157 ^ 144;
        llllllIIIl[26] = 65 ^ 79;
        llllllIIIl[27] = 136 ^ 135;
        llllllIIIl[28] = (-((-26659) & 32502)) & (-18433) & 24575;
        llllllIIIl[29] = 61 ^ 45;
        llllllIIIl[30] = 154 ^ 139;
        llllllIIIl[31] = 209 ^ 195;
        llllllIIIl[32] = (-6161) & 6591;
        llllllIIIl[33] = (248 ^ 176) ^ (211 ^ 136);
        llllllIIIl[34] = 179 ^ 167;
        llllllIIIl[35] = (((18 + 38) - (-116)) + 7) ^ (((115 + 71) - 84) + 64);
        llllllIIIl[36] = (40 ^ 88) ^ (203 ^ 173);
        llllllIIIl[37] = 208 ^ 199;
        llllllIIIl[38] = 105 ^ 113;
        llllllIIIl[39] = 48 ^ 41;
        llllllIIIl[40] = (229 ^ 175) ^ (221 ^ 141);
        llllllIIIl[41] = (237 ^ 151) ^ (162 ^ 195);
        llllllIIIl[42] = 61 ^ 33;
        llllllIIIl[43] = 105 ^ 116;
        llllllIIIl[44] = (-9225) & 12233;
        llllllIIIl[45] = (-((-3919) & 32639)) & (-12) & 31743;
        llllllIIIl[46] = 79 ^ 81;
        llllllIIIl[47] = (-((-20527) & 30319)) & (-4513) & 16375;
        llllllIIIl[48] = (((59 + 124) - 164) + 152) ^ (((170 + 87) - 137) + 60);
        llllllIIIl[49] = 141 ^ 173;
        llllllIIIl[50] = 32 ^ 1;
        llllllIIIl[51] = 176 ^ 146;
        llllllIIIl[52] = (163 ^ 149) ^ (214 ^ 195);
        llllllIIIl[53] = 166 ^ 130;
        llllllIIIl[54] = (-13381) & 13813;
        llllllIIIl[55] = (-((-6305) & 15600)) & (-16385) & 26111;
        llllllIIIl[56] = 126 ^ 91;
        llllllIIIl[57] = (109 ^ 122) ^ (83 ^ 98);
        llllllIIIl[58] = 126 ^ 89;
        llllllIIIl[59] = 77 ^ 101;
        llllllIIIl[60] = 24 ^ 49;
        llllllIIIl[61] = (117 ^ 62) ^ (40 ^ 73);
        llllllIIIl[62] = (60 ^ 77) ^ (97 ^ 59);
        llllllIIIl[63] = (-26788) & 32687;
        llllllIIIl[64] = (-((-17541) & 25989)) & (-17409) & 32756;
        llllllIIIl[65] = (-((-23213) & 31487)) & (-20481) & 29654;
        llllllIIIl[66] = (-((-7957) & 16278)) & (-547) & 32767;
        llllllIIIl[67] = (-49) & 12028;
        llllllIIIl[68] = (-((-20805) & 23382)) & (-1093) & 28669;
        llllllIIIl[69] = (-((-6219) & 30939)) & (-5) & 32732;
        llllllIIIl[70] = (-6145) & 8044;
        llllllIIIl[71] = 3 ^ 103;
        llllllIIIl[72] = (((111 + 8) - (-25)) + 1) ^ (((68 + 20) - (-68)) + 33);
        llllllIIIl[73] = (235 ^ 158) ^ (213 ^ 141);
        llllllIIIl[74] = "  ".length() ^ (43 ^ 7);
        llllllIIIl[75] = "  ".length() ^ (134 ^ 171);
        llllllIIIl[76] = (69 ^ 12) ^ (118 ^ 15);
        llllllIIIl[77] = 146 ^ 163;
        llllllIIIl[78] = (77 ^ 1) ^ (223 ^ 161);
        llllllIIIl[79] = 156 ^ 175;
        llllllIIIl[80] = 48 ^ 4;
        llllllIIIl[81] = (((136 + 59) - 187) + 139) ^ (((13 + 60) - 30) + 123);
        llllllIIIl[82] = 73 ^ 127;
        llllllIIIl[83] = (31 ^ 48) ^ (45 ^ 53);
        llllllIIIl[84] = (((148 + 123) - 118) + 8) ^ (((53 + 5) - 17) + 112);
        llllllIIIl[85] = (((85 + 82) - 111) + 128) ^ (((17 + 63) - (-33)) + 16);
        llllllIIIl[86] = (((62 + 39) - 9) + 42) ^ (((161 + 100) - 151) + 78);
        llllllIIIl[87] = 255 ^ 196;
        llllllIIIl[88] = 165 ^ 153;
        llllllIIIl[89] = 45 ^ 16;
        llllllIIIl[90] = 24 ^ 38;
        llllllIIIl[91] = (197 ^ 170) ^ (209 ^ 129);
        llllllIIIl[92] = 68 ^ 4;
        llllllIIIl[93] = 215 ^ 150;
        llllllIIIl[94] = (251 ^ 133) ^ (191 ^ 131);
        llllllIIIl[95] = 201 ^ 138;
        llllllIIIl[96] = (97 ^ 23) ^ (144 ^ 162);
        llllllIIIl[97] = (-((-8237) & 13373)) & (-1) & 8190;
        llllllIIIl[98] = (-24841) & 28093;
        llllllIIIl[99] = (-((-2875) & 11071)) & (-20481) & 31614;
        llllllIIIl[100] = (-943) & 4094;
        llllllIIIl[101] = (-((-657) & 26263)) & (-4233) & 32766;
        llllllIIIl[102] = (-29591) & 32734;
        llllllIIIl[103] = (-20506) & 23519;
        llllllIIIl[104] = (-29027) & 32230;
        llllllIIIl[105] = (-5170) & 8179;
        llllllIIIl[106] = (-8260) & 11467;
        llllllIIIl[107] = (-((-16833) & 21481)) & (-16641) & 24507;
        llllllIIIl[108] = (-((-3361) & 32057)) & (-673) & 32763;
        llllllIIIl[109] = (-((-2869) & 24445)) & (-1) & 24575;
        llllllIIIl[110] = (-21001) & 24383;
        llllllIIIl[111] = (((81 + 233) - 121) + 56) ^ (((2 + 12) - (-157)) + 17);
    }

    private static String llIlIlIllIIII(String lllllllllllllllllIlIIIlllIIIIlII, String lllllllllllllllllIlIIIlllIIIIIll) {
        String lllllllllllllllllIlIIIlllIIIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlIIIlllIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIIIlllIIIIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIIIlllIIIIIll.toCharArray();
        int lllllllllllllllllIlIIIlllIIIIIII = llllllIIIl[0];
        char[] charArray2 = lllllllllllllllllIlIIIlllIIIIlII2.toCharArray();
        int length = charArray2.length;
        int i = llllllIIIl[0];
        while (llIlIllIIIlll(i, length)) {
            char lllllllllllllllllIlIIIlllIIIIlIl = charArray2[i];
            lllllllllllllllllIlIIIlllIIIIIlI.append((char) (lllllllllllllllllIlIIIlllIIIIlIl ^ charArray[lllllllllllllllllIlIIIlllIIIIIII % charArray.length]));
            "".length();
            lllllllllllllllllIlIIIlllIIIIIII++;
            i++;
            "".length();
            if ((((58 ^ 117) ^ (46 ^ 125)) & (((201 ^ 129) ^ (70 ^ 18)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlIIIlllIIIIIlI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIllIIlllI(Vars.getVarp(QuestVarPlayer.QUEST_PIRATES_TREASURE.getId()), llllllIIIl[6])) {
            ?? r0 = llllllIIIl[1];
            "".length();
            return " ".length() <= 0 ? ((90 ^ 82) ^ (121 ^ 70)) & (((((100 + 83) - 130) + 121) ^ (((92 + 71) - 36) + 26)) ^ (-" ".length())) : r0;
        }
        return llllllIIIl[0];
    }

    private static boolean llIlIllIIlIII(int i) {
        return i == 0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            cU();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (221 ^ 155) & ((215 ^ 145) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return llllllIIIl[71];
    }

    private static boolean llIlIllIIllIl(int i, int i2) {
        return i <= i2;
    }

    private static void ae() {
        int[] iArr = new int[llllllIIIl[1]];
        iArr[llllllIIIl[0]] = llllllIIIl[15];
        if (llIlIllIIlIII(Bank.contains(iArr) ? 1 : 0)) {
            bu.add(new C0003d(llllllIIIl[15], llllllIIIl[1], llllllIIIl[63]));
            "".length();
        }
        int[] iArr2 = new int[llllllIIIl[1]];
        iArr2[llllllIIIl[0]] = llllllIIIl[14];
        if (llIlIllIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
            bu.add(new C0003d(llllllIIIl[14], llllllIIIl[1], llllllIIIl[64]));
            "".length();
        }
        int[] iArr3 = new int[llllllIIIl[1]];
        iArr3[llllllIIIl[0]] = llllllIIIl[11];
        if (llIlIllIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
            bu.add(new C0003d(llllllIIIl[11], llllllIIIl[16], llllllIIIl[65]));
            "".length();
        }
        int[] iArr4 = new int[llllllIIIl[1]];
        iArr4[llllllIIIl[0]] = llllllIIIl[10];
        if (llIlIllIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(llllllIIIl[10], llllllIIIl[1], llllllIIIl[66]));
            "".length();
        }
        if (llIlIllIIlIII(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllllIllll[llllllIIIl[73]]);
        }) ? 1 : 0)) {
            bu.add(new C0003d(llllllIIIl[67], llllllIIIl[7], llllllIIIl[68]));
            "".length();
        }
        int[] iArr5 = new int[llllllIIIl[1]];
        iArr5[llllllIIIl[0]] = llllllIIIl[69];
        if (llIlIllIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(llllllIIIl[69], llllllIIIl[16], llllllIIIl[70]));
            "".length();
        }
        int[] iArr6 = new int[llllllIIIl[1]];
        iArr6[llllllIIIl[0]] = llllllIIIl[17];
        if (llIlIllIIlIII(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(llllllIIIl[17], llllllIIIl[16], llllllIIIl[70]));
            "".length();
        }
        int[] iArr7 = new int[llllllIIIl[1]];
        iArr7[llllllIIIl[0]] = llllllIIIl[13];
        if (llIlIllIIlIII(Bank.contains(iArr7) ? 1 : 0)) {
            bu.add(new C0003d(llllllIIIl[13], llllllIIIl[59], llllllIIIl[70]));
            "".length();
        }
        int[] iArr8 = new int[llllllIIIl[1]];
        iArr8[llllllIIIl[0]] = llllllIIIl[12];
        if (llIlIllIIIllI(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llllllIIIl[1]];
            iArr9[llllllIIIl[0]] = llllllIIIl[12];
            if (!llIlIllIIIllI(Bank.contains(iArr9) ? 1 : 0)) {
                return;
            }
            int[] iArr10 = new int[llllllIIIl[1]];
            iArr10[llllllIIIl[0]] = llllllIIIl[12];
            if (!llIlIllIIIlll(Bank.getFirst(iArr10).getQuantity(), llllllIIIl[6])) {
                return;
            }
        }
        bu.add(new C0003d(llllllIIIl[12], llllllIIIl[6], C0008i.bp));
        "".length();
    }

    private static boolean llIlIllIIllII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIllIIIllI(int i) {
        return i != 0;
    }

    private static boolean llIlIllIIlIll(Object obj) {
        return obj != null;
    }

    private static String llIlIlIllIIlI(String lllllllllllllllllIlIIIllIllIllll, String lllllllllllllllllIlIIIllIllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIIIllIllIlllI.getBytes(StandardCharsets.UTF_8)), llllllIIIl[20]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIIIllIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIIIllIlllIIII) {
            lllllllllllllllllIlIIIllIlllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlIllIIlIIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[llllllIIIl[1]];
        iArr[llllllIIIl[0]] = llllllIIIl[14];
        if (llIlIllIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
            String[] strArr = new String[llllllIIIl[1]];
            strArr[llllllIIIl[0]] = lllllIllll[llllllIIIl[62]];
            if (llIlIllIIIllI(Inventory.contains(strArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllllIIIl[1]];
                iArr2[llllllIIIl[0]] = llllllIIIl[11];
                if (llIlIllIIIllI(Inventory.contains(iArr2) ? 1 : 0)) {
                    ?? r0 = llllllIIIl[1];
                    "".length();
                    return 0 != 0 ? ((((200 + 5) - 23) + 35) ^ (((86 + 164) - 60) + 9)) & (((40 ^ 39) ^ (8 ^ 25)) ^ (-" ".length())) : r0;
                }
            }
        }
        return llllllIIIl[0];
    }

    private static boolean llIlIllIlIIII(int i, int i2) {
        return i >= i2;
    }

    private static int llIlIllIIIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllllIllll[llllllIIIl[72]];
    }

    private static boolean llIlIllIIlllI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIllIIlIlI(int i) {
        return i > 0;
    }

    private static boolean llIlIllIIllll(Object obj) {
        return obj == null;
    }
}
