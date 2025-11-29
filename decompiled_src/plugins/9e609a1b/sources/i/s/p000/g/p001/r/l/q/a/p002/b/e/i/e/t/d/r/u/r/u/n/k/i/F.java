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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.F  reason: invalid package */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/F.class */
public class F implements M {
    public static final /* synthetic */ WorldPoint hn;
    public static /* synthetic */ List<C0003d> bA;
    static /* synthetic */ int co;
    public static final /* synthetic */ WorldPoint hk;
    static /* synthetic */ int bY;
    static /* synthetic */ boolean cp;
    public static final /* synthetic */ WorldPoint hl;
    public static /* synthetic */ boolean by;
    public static /* synthetic */ String[] bW;
    private static /* synthetic */ int[] lIIIlllIlIllI;
    private static /* synthetic */ String[] lIIIlllIlIlII;
    public static final /* synthetic */ WorldPoint hm;

    private static boolean lIlIIlIIlIIlIll(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIlIIlIlIIII(int i2, int i3) {
        return i2 > i3;
    }

    private static void lIlIIlIIlIIlIIl() {
        lIIIlllIlIlII = new String[lIIIlllIlIllI[75]];
        lIIIlllIlIlII[lIIIlllIlIllI[0]] = lIlIIlIIlIIIIll("DTkAORcobBAkHCI/", "OLyPy");
        lIIIlllIlIlII[lIIIlllIlIllI[1]] = lIlIIlIIlIIIlII("KkFwN+tRPhcp81Rh6hA9E+bcn5/70HLws6otwAOxyVCqMKDWn4hnCSYvJ8G9yQ68", "FaDIM");
        lIIIlllIlIlII[lIIIlllIlIllI[3]] = lIlIIlIIlIIIlIl("lCHo6ZW2PDM=", "WTNzv");
        lIIIlllIlIlII[lIIIlllIlIllI[6]] = lIlIIlIIlIIIIll("GysZSj46ag0LJD4=", "UJojJ");
        lIIIlllIlIlII[lIIIlllIlIllI[7]] = lIlIIlIIlIIIlIl("ALmDd8NxHpFr/lO1tttMTPNdaaNek+I/", "sywAw");
        lIIIlllIlIlII[lIIIlllIlIllI[10]] = lIlIIlIIlIIIlII("HUf7O8WrUUMu1YEO94D4UkPPDoC/9ZYyfXYlWD+bugaIK/nFqfcjedvDZkqxJictTLZ/2703ph0=", "NEmaQ");
        lIIIlllIlIlII[lIIIlllIlIllI[14]] = lIlIIlIIlIIIlIl("sF3N9IOnX650SIPrSrG4xA==", "WCKtd");
        lIIIlllIlIlII[lIIIlllIlIllI[15]] = lIlIIlIIlIIIlII("i3Kde/y1yDB2cfGq8HLkIA==", "yYnKr");
        lIIIlllIlIlII[lIIIlllIlIllI[13]] = lIlIIlIIlIIIlII("RHhnogwklJc=", "EJJjc");
        lIIIlllIlIlII[lIIIlllIlIllI[16]] = lIlIIlIIlIIIIll("IS80JQ==", "vJUWA");
        lIIIlllIlIlII[lIIIlllIlIllI[12]] = lIlIIlIIlIIIlIl("/P5wIgrrqTQ7Y6lDhdza7g==", "NCUrW");
        lIIIlllIlIlII[lIIIlllIlIllI[17]] = lIlIIlIIlIIIlIl("f6UikcZJg3JZNVZYnks6Sw==", "WAGOT");
        lIIIlllIlIlII[lIIIlllIlIllI[18]] = lIlIIlIIlIIIlIl("E7x4RtcwzXU=", "UgDHD");
        lIIIlllIlIlII[lIIIlllIlIllI[19]] = lIlIIlIIlIIIlII("h5a3w+rguhY=", "WOMfv");
        lIIIlllIlIlII[lIIIlllIlIllI[21]] = lIlIIlIIlIIIlII("oKnd+Fz6UPoRndDoQ4UlHg==", "IYimr");
        lIIIlllIlIlII[lIIIlllIlIllI[22]] = lIlIIlIIlIIIlIl("v8Z7qcZEQqhg5AYOFVLOaA==", "CNFma");
        lIIIlllIlIlII[lIIIlllIlIllI[23]] = lIlIIlIIlIIIlII("WSzp6JlKVdI=", "QUeBv");
        lIIIlllIlIlII[lIIIlllIlIllI[25]] = lIlIIlIIlIIIIll("LzsuRhMOej4HEwk/Kg==", "aZXfg");
        lIIIlllIlIlII[lIIIlllIlIllI[26]] = lIlIIlIIlIIIIll("NRQcH2onFAQcLzM=", "AuptJ");
        lIIIlllIlIlII[lIIIlllIlIllI[27]] = lIlIIlIIlIIIIll("JTgVKRYReS0gBBE8DyIW", "cYaAs");
        lIIIlllIlIlII[lIIIlllIlIllI[20]] = lIlIIlIIlIIIlIl("e5swjk9w8c1PAlUJIR7UZyyMSG6M5DRx", "KAcGA");
        lIIIlllIlIlII[lIIIlllIlIllI[29]] = lIlIIlIIlIIIlII("9823vfa6MLRCzefmBXD0PQ==", "ukLDu");
        lIIIlllIlIlII[lIIIlllIlIllI[30]] = lIlIIlIIlIIIlIl("2O7PvrhZstwNSGxSfAtMIg==", "dlKVI");
        lIIIlllIlIlII[lIIIlllIlIllI[31]] = lIlIIlIIlIIIlIl("zCi1y0Sn90LEcfOGL6aPaQ==", "hKDCK");
        lIIIlllIlIlII[lIIIlllIlIllI[32]] = lIlIIlIIlIIIlII("XNcFuT0Xm9wZrK5bH4zIEsuTaj24afRS", "Mofum");
        lIIIlllIlIlII[lIIIlllIlIllI[33]] = lIlIIlIIlIIIlII("ZrKIwjZxwIc37+kDmQM4kA==", "gkwTF");
        lIIIlllIlIlII[lIIIlllIlIllI[34]] = lIlIIlIIlIIIlII("HhVlUfUlieV0XDA54gjdAA==", "MrSPf");
        lIIIlllIlIlII[lIIIlllIlIllI[35]] = lIlIIlIIlIIIlII("gI3egce003EDhDGsWUFE1w==", "OCJFk");
        lIIIlllIlIlII[lIIIlllIlIllI[36]] = lIlIIlIIlIIIIll("AhQmDiAgVTIAIigaLA==", "AuBoV");
        lIIIlllIlIlII[lIIIlllIlIllI[37]] = lIlIIlIIlIIIIll("GhQXJg==", "MqvTe");
        lIIIlllIlIlII[lIIIlllIlIllI[24]] = lIlIIlIIlIIIIll("KBEnYTsJUDs0Iw8VJQ==", "fpQAO");
        lIIIlllIlIlII[lIIIlllIlIllI[38]] = lIlIIlIIlIIIIll("GjsND046NUEOGyIzBBA=", "NZadn");
        lIIIlllIlIlII[lIIIlllIlIllI[39]] = lIlIIlIIlIIIlIl("hLlySNiHlxI=", "WCpIZ");
        lIIIlllIlIlII[lIIIlllIlIllI[40]] = lIlIIlIIlIIIlIl("Kucb6Ml4uik=", "HRUxK");
        lIIIlllIlIlII[lIIIlllIlIllI[42]] = lIlIIlIIlIIIlIl("QSQU2xeeizOGN885UAmdIA==", "WUrZG");
        lIIIlllIlIlII[lIIIlllIlIllI[43]] = lIlIIlIIlIIIIll("DCcLCzkiJwsFajs7ABE+", "JNebJ");
        lIIIlllIlIlII[lIIIlllIlIllI[44]] = lIlIIlIIlIIIIll("PQYZDzg=", "oitjW");
        lIIIlllIlIlII[lIIIlllIlIllI[45]] = lIlIIlIIlIIIIll("KQMgbjcIQjQvLQw=", "gbVNC");
        lIIIlllIlIlII[lIIIlllIlIllI[46]] = lIlIIlIIlIIIIll("BQM2PTYkDD95OCwMMzA0Kg==", "MbXYZ");
        lIIIlllIlIlII[lIIIlllIlIllI[47]] = lIlIIlIIlIIIIll("Pzx3DhANeToGERswOQhCGSwyHBZIKiIfEgQwMhxOSCogBhYLMT4BBUgtOE8gPQAeISU=", "hYWob");
        lIIIlllIlIlII[lIIIlllIlIllI[28]] = lIlIIlIIlIIIlIl("mHUpLhANkr0tAcQ29Iz+tpnHCCYX4Jc1", "vAXsM");
        lIIIlllIlIlII[lIIIlllIlIllI[54]] = lIlIIlIIlIIIlIl("FOJSc0NUA5gASNf24JAzBYESYR8gIoec", "NAlxs");
        lIIIlllIlIlII[lIIIlllIlIllI[55]] = lIlIIlIIlIIIlIl("JsVfW4DBm+k=", "yDjqX");
        lIIIlllIlIlII[lIIIlllIlIllI[58]] = lIlIIlIIlIIIlIl("V6Rq8Askr6s=", "MEaVj");
        lIIIlllIlIlII[lIIIlllIlIllI[59]] = lIlIIlIIlIIIIll("HAAkHA==", "XoKny");
        lIIIlllIlIlII[lIIIlllIlIllI[60]] = lIlIIlIIlIIIlII("71SjWhrgIXo=", "KVXBP");
        lIIIlllIlIlII[lIIIlllIlIllI[69]] = lIlIIlIIlIIIlII("rsEVLwL453HBwsjEPFcPY1igczQrMCu6aPRNALkgmn8=", "MWMVQ");
        lIIIlllIlIlII[lIIIlllIlIllI[70]] = lIlIIlIIlIIIIll("ACwmfGE2InlwCH4lOXAtPD11OCQraT4+Li5n", "YIUPA");
        lIIIlllIlIlII[lIIIlllIlIllI[71]] = lIlIIlIIlIIIlII("JQdtXmKaT3lvw0rvZyvzwg==", "iRmts");
        lIIIlllIlIlII[lIIIlllIlIllI[72]] = lIlIIlIIlIIIIll("IRgNGVoUGw4HDlUKDh8fAREIHB1VHA0BH1s=", "uyarz");
        lIIIlllIlIlII[lIIIlllIlIllI[2]] = lIlIIlIIlIIIlII("Wn04P0XvwoWHGLhL1ypJH6PkhvaVC3j2fAdoWm3SojY=", "RNHop");
        lIIIlllIlIlII[lIIIlllIlIllI[73]] = lIlIIlIIlIIIlIl("9/J9z0zynix5KhkrW11Htw==", "bCkjK");
        lIIIlllIlIlII[lIIIlllIlIllI[74]] = lIlIIlIIlIIIIll("NTE4RA==", "lTKjp");
    }

    private static boolean lIlIIlIIlIIlllI(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIlIIlIIllII(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
        if (lIlIIlIIlIIlllI(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v376, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cm() {
        if (lIlIIlIIlIIlIll(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[0]];
            C0001b.a(bA);
            if (lIlIIlIIlIIllII(bA.size(), lIIIlllIlIllI[1])) {
                System.out.println(lIIIlllIlIlII[lIIIlllIlIllI[1]]);
                by = lIIIlllIlIllI[0];
            }
        }
        if (lIlIIlIIlIIllIl(by ? 1 : 0)) {
            if (lIlIIlIIlIIlIll(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIlIIlIIllII(Movement.getRunEnergy(), lIIIlllIlIllI[2])) {
                Inventory.getFirst(C0005f.ba).interact(lIIIlllIlIlII[lIIIlllIlIllI[3]]);
                Time.sleepTicks(lIIIlllIlIllI[1]);
                "".length();
            }
            if (lIlIIlIIlIIllIl(Movement.isRunEnabled() ? 1 : 0) && lIlIIlIIlIIlllI(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIlIIlIIlIIlIll(S() ? 1 : 0)) {
                int[] iArr = new int[lIIIlllIlIllI[1]];
                iArr[lIIIlllIlIllI[0]] = lIIIlllIlIllI[4];
            }
            if (lIlIIlIIlIIllII(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIlIIlIIllll(nearest) && lIlIIlIIlIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIIIlllIlIllI[3]);
                    "".length();
                }
                if (lIlIIlIIlIIllll(nearest) && lIlIIlIIlIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[7]];
                    if (lIlIIlIIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllIlIllI[8]);
                        "".length();
                    }
                    if (lIlIIlIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIlIIlIIlllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllIlIllI[7]);
                            "".length();
                        }
                        if (lIlIIlIIlIIlllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllIlIllI[3]);
                            "".length();
                        }
                        int[] iArr2 = new int[lIIIlllIlIllI[1]];
                        iArr2[lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
                        if (lIlIIlIIlIIllIl(C0004e.b(iArr2) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllIlIlII[lIIIlllIlIllI[10]]);
                            by = lIIIlllIlIllI[1];
                            return;
                        }
                        int[] iArr3 = new int[lIIIlllIlIllI[1]];
                        iArr3[lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
                        if (lIlIIlIIlIIlIll(C0004e.b(iArr3) ? 1 : 0)) {
                            C0000a.a(lIIIlllIlIllI[9], lIIIlllIlIllI[1]);
                            C0000a.b(C0005f.ba, lIIIlllIlIllI[3]);
                            C0000a.a(lIIIlllIlIllI[11], lIIIlllIlIllI[12]);
                            C0000a.b(C0005f.bk, lIIIlllIlIllI[1]);
                        }
                    }
                }
            }
            if (lIlIIlIIlIIlIll(S() ? 1 : 0) && lIlIIlIIlIIllII(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[1])) {
                if (lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[14]];
                    if (lIlIIlIIlIIllII(bY, lIIIlllIlIllI[1])) {
                        C0004e.w();
                        bY += lIIIlllIlIllI[1];
                    }
                    Movement.walkTo(hk);
                    "".length();
                    Time.sleepTicks(lIIIlllIlIllI[1]);
                    "".length();
                }
                if (lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[15]];
                    C0006g.a(lIIIlllIlIlII[lIIIlllIlIllI[13]], bW);
                }
            }
            if (lIlIIlIIlIlIIlI(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[12])) {
                if (lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hl), lIIIlllIlIllI[3])) {
                    if (lIlIIlIIlIIlIll(Inventory.contains(C0005f.bk) ? 1 : 0) && lIlIIlIIlIIllIl(Equipment.contains(C0005f.bk) ? 1 : 0)) {
                        Inventory.getFirst(C0005f.bk).interact(lIIIlllIlIlII[lIIIlllIlIllI[16]]);
                        Time.sleepTicks(lIIIlllIlIllI[1]);
                        "".length();
                    }
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[12]];
                    Movement.walkTo(hl);
                    "".length();
                    Time.sleepTicks(lIIIlllIlIllI[1]);
                    "".length();
                }
                if (lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hl), lIIIlllIlIllI[3])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[17]];
                    TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                        if (lIlIIlIIlIIlIll(tileObject.getName().contains(lIIIlllIlIlII[lIIIlllIlIllI[59]]) ? 1 : 0) && lIlIIlIIlIlIIIl(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIIIlllIlIllI[56], lIIIlllIlIllI[57], lIIIlllIlIllI[1])), lIIIlllIlIllI[3])) {
                            String[] strArr = new String[lIIIlllIlIllI[1]];
                            strArr[lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[60]];
                            if (lIlIIlIIlIIlIll(tileObject.hasAction(strArr) ? 1 : 0)) {
                                ?? r0 = lIIIlllIlIllI[1];
                                "".length();
                                return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return lIIIlllIlIllI[0];
                    });
                    if (lIlIIlIIlIIllll(nearest2)) {
                        nearest2.interact(lIIIlllIlIlII[lIIIlllIlIllI[18]]);
                        Time.sleepTicks(lIIIlllIlIllI[6]);
                        "".length();
                    }
                    C0006g.a(lIIIlllIlIlII[lIIIlllIlIllI[19]], bW);
                }
            }
            if (lIlIIlIIlIlIIlI(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[20])) {
                if (lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[21]];
                    Movement.walkTo(hk);
                    "".length();
                    Time.sleepTicks(lIIIlllIlIllI[1]);
                    "".length();
                }
                if (lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[22]];
                    C0006g.a(lIIIlllIlIlII[lIIIlllIlIllI[23]], bW);
                }
            }
            if (lIlIIlIIlIlIIlI(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[24])) {
                if (lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hm), lIIIlllIlIllI[10])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[25]];
                    Movement.walkTo(hm);
                    "".length();
                    Time.sleepTicks(lIIIlllIlIllI[1]);
                    "".length();
                }
                if (lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hm), lIIIlllIlIllI[10])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[26]];
                    C0006g.a(lIIIlllIlIlII[lIIIlllIlIllI[27]], bW);
                }
                C0006g.a(bW);
            }
            if (lIlIIlIIlIlIIlI(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[28])) {
                if (lIlIIlIIlIIllIl(S() ? 1 : 0)) {
                    bm();
                }
                if (lIlIIlIIlIIlIll(S() ? 1 : 0)) {
                    if (lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hn), lIIIlllIlIllI[10])) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[20]];
                        Movement.walkTo(hn);
                        "".length();
                        Time.sleepTicks(lIIIlllIlIllI[1]);
                        "".length();
                    }
                    if (lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hn), lIIIlllIlIllI[10])) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[29]];
                        C0006g.a(lIIIlllIlIlII[lIIIlllIlIllI[30]], bW);
                    }
                }
            }
            if (lIlIIlIIlIlIIlI(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[2])) {
                String[] strArr = new String[lIIIlllIlIllI[1]];
                strArr[lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[31]];
                if (lIlIIlIIlIIllIl(Inventory.contains(strArr) ? 1 : 0) && lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hn), lIIIlllIlIllI[10])) {
                    if (lIlIIlIIlIIllIl(S() ? 1 : 0)) {
                        bm();
                    }
                    if (lIlIIlIIlIIlIll(S() ? 1 : 0) && lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hn), lIIIlllIlIllI[10])) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[32]];
                        Movement.walkTo(hn);
                        "".length();
                        Time.sleepTicks(lIIIlllIlIllI[1]);
                        "".length();
                    }
                }
            }
            if (lIlIIlIIlIlIIlI(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[2])) {
                String[] strArr2 = new String[lIIIlllIlIllI[1]];
                strArr2[lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[33]];
                if (lIlIIlIIlIIllIl(Inventory.contains(strArr2) ? 1 : 0) && lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hn), lIIIlllIlIllI[10])) {
                    co = lIIIlllIlIllI[0];
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[34]];
                    C0006g.a(lIIIlllIlIlII[lIIIlllIlIllI[35]], bW);
                }
            }
            if (lIlIIlIIlIlIIlI(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[2])) {
                String[] strArr3 = new String[lIIIlllIlIllI[1]];
                strArr3[lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[36]];
                if (lIlIIlIIlIIlIll(Inventory.contains(strArr3) ? 1 : 0)) {
                    if (lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hl), lIIIlllIlIllI[3])) {
                        if (lIlIIlIIlIIlIll(Inventory.contains(C0005f.bk) ? 1 : 0) && lIlIIlIIlIIllIl(Equipment.contains(C0005f.bk) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.bk).interact(lIIIlllIlIlII[lIIIlllIlIllI[37]]);
                            Time.sleepTicks(lIIIlllIlIllI[1]);
                            "".length();
                        }
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[24]];
                        Movement.walkTo(hl);
                        "".length();
                        Time.sleepTicks(lIIIlllIlIllI[1]);
                        "".length();
                    }
                    if (lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hl), lIIIlllIlIllI[3])) {
                        AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[38]];
                        TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                            if (lIlIIlIIlIIlIll(tileObject2.getName().contains(lIIIlllIlIlII[lIIIlllIlIllI[55]]) ? 1 : 0) && lIlIIlIIlIlIIIl(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIIIlllIlIllI[56], lIIIlllIlIllI[57], lIIIlllIlIllI[1])), lIIIlllIlIllI[3])) {
                                String[] strArr4 = new String[lIIIlllIlIllI[1]];
                                strArr4[lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[58]];
                                if (lIlIIlIIlIIlIll(tileObject2.hasAction(strArr4) ? 1 : 0)) {
                                    ?? r0 = lIIIlllIlIllI[1];
                                    "".length();
                                    return "   ".length() == ((181 ^ 135) ^ (171 ^ 157)) ? ((((165 + 149) - 202) + 65) ^ (((109 + 45) - 100) + 91)) & (((59 ^ 117) ^ (14 ^ 96)) ^ (-" ".length())) : r0;
                                }
                            }
                            return lIIIlllIlIllI[0];
                        });
                        if (lIlIIlIIlIIllll(nearest3)) {
                            nearest3.interact(lIIIlllIlIlII[lIIIlllIlIllI[39]]);
                            Time.sleepTicks(lIIIlllIlIllI[6]);
                            "".length();
                        }
                        C0006g.a(lIIIlllIlIlII[lIIIlllIlIllI[40]], bW);
                    }
                    C0006g.a(bW);
                }
            }
            if (lIlIIlIIlIlIIlI(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[41])) {
                if (lIlIIlIIlIlIIII(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13]) && lIlIIlIIlIIllIl(Dialog.isOpen() ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[42]];
                    Movement.walkTo(hk);
                    "".length();
                    Time.sleepTicks(lIIIlllIlIllI[1]);
                    "".length();
                }
                if (lIlIIlIIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(hk), lIIIlllIlIllI[13])) {
                    AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[43]];
                    if (lIlIIlIIlIIllII(co, lIIIlllIlIllI[1])) {
                        P.lq += lIIIlllIlIllI[1];
                        P.d(AccBuilderRat.m);
                        co += lIIIlllIlIllI[1];
                        P.lq = lIIIlllIlIllI[0];
                        cp = lIIIlllIlIllI[0];
                    }
                    C0006g.a(lIIIlllIlIlII[lIIIlllIlIllI[44]], bW);
                    Time.sleepTicks(lIIIlllIlIllI[10]);
                    "".length();
                }
            }
            C0006g.a(bW);
            System.out.println("Setting: " + C0004e.j(lIIIlllIlIllI[5]));
        }
    }

    private static boolean lIlIIlIIlIlIIIl(int i2, int i3) {
        return i2 <= i3;
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIlIlII[lIIIlllIlIllI[28]];
    }

    private static String lIlIIlIIlIIIlII(String lllllllllllllllIIIIIlIlIlIIIIIIl, String lllllllllllllllIIIIIlIlIIllllllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIlIlIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIlIIllllllI.getBytes(StandardCharsets.UTF_8)), lIIIlllIlIllI[13]), "DES");
            Cipher lllllllllllllllIIIIIlIlIlIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIIIIlIlIlIIIIIll.init(lIIIlllIlIllI[3], lllllllllllllllIIIIIlIlIlIIIIlII);
            return new String(lllllllllllllllIIIIIlIlIlIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIlIlIIIIIlI) {
            lllllllllllllllIIIIIlIlIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlIlIIll(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIlIIlIlIIlI(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIlIIlIIllIl(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (lIlIIlIIlIlIIll(C0004e.j(lIIIlllIlIllI[5]), lIIIlllIlIllI[53])) {
            ?? r0 = lIIIlllIlIllI[1];
            "".length();
            return (true ^ true) == ((true ^ true) & ((true ^ true) ^ true)) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
        }
        return lIIIlllIlIllI[0];
    }

    private static String lIlIIlIIlIIIlIl(String lllllllllllllllIIIIIlIlIlIIIlllI, String lllllllllllllllIIIIIlIlIlIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIlIlIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIlIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlIlIlIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlIlIlIIlIIII.init(lIIIlllIlIllI[3], lllllllllllllllIIIIIlIlIlIIlIIIl);
            return new String(lllllllllllllllIIIIIlIlIlIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIlIlIlIIIllll) {
            lllllllllllllllIIIIIlIlIlIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlIIllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllIlIllI[0];
    }

    private static void lIlIIlIIlIIlIlI() {
        lIIIlllIlIllI = new int[76];
        lIIIlllIlIllI[0] = (211 ^ 198) & ((0 ^ 21) ^ (-1));
        lIIIlllIlIllI[1] = " ".length();
        lIIIlllIlIllI[2] = 161 ^ 147;
        lIIIlllIlIllI[3] = "  ".length();
        lIIIlllIlIllI[4] = (-4105) & 5099;
        lIIIlllIlIllI[5] = ((22 + 46) - (-13)) + 63;
        lIIIlllIlIllI[6] = "   ".length();
        lIIIlllIlIllI[7] = " ".length() ^ (197 ^ 192);
        lIIIlllIlIllI[8] = (-18438) & 23437;
        lIIIlllIlIllI[9] = (-((-545) & 25387)) & (-5125) & 30719;
        lIIIlllIlIllI[10] = 137 ^ 140;
        lIIIlllIlIllI[11] = (-((-3091) & 11419)) & (-16433) & 32767;
        lIIIlllIlIllI[12] = (((112 + 99) - 184) + 152) ^ (((150 + 114) - 183) + 104);
        lIIIlllIlIllI[13] = (33 ^ 108) ^ (240 ^ 181);
        lIIIlllIlIllI[14] = (((88 + 51) - 53) + 43) ^ (((82 + 29) - 36) + 60);
        lIIIlllIlIllI[15] = (36 ^ 24) ^ (86 ^ 109);
        lIIIlllIlIllI[16] = (199 ^ 135) ^ (90 ^ 19);
        lIIIlllIlIllI[17] = (62 ^ 88) ^ (248 ^ 149);
        lIIIlllIlIllI[18] = 38 ^ 42;
        lIIIlllIlIllI[19] = (((29 + 143) - 63) + 47) ^ (((31 + 11) - (-81)) + 22);
        lIIIlllIlIllI[20] = (((0 + 11) - (-64)) + 73) ^ (((0 + 53) - (-74)) + 1);
        lIIIlllIlIllI[21] = 26 ^ 20;
        lIIIlllIlIllI[22] = (71 ^ 100) ^ (74 ^ 102);
        lIIIlllIlIllI[23] = (113 ^ 25) ^ (122 ^ 2);
        lIIIlllIlIllI[24] = (118 ^ 70) ^ (96 ^ 78);
        lIIIlllIlIllI[25] = 160 ^ 177;
        lIIIlllIlIllI[26] = 111 ^ 125;
        lIIIlllIlIllI[27] = 10 ^ 25;
        lIIIlllIlIllI[28] = 111 ^ 71;
        lIIIlllIlIllI[29] = (((55 + 148) - 169) + 119) ^ (((18 + 42) - (-72)) + 8);
        lIIIlllIlIllI[30] = 136 ^ 158;
        lIIIlllIlIllI[31] = 213 ^ 194;
        lIIIlllIlIllI[32] = 120 ^ 96;
        lIIIlllIlIllI[33] = 181 ^ 172;
        lIIIlllIlIllI[34] = 221 ^ 199;
        lIIIlllIlIllI[35] = (((24 + 41) - (-120)) + 2) ^ (((109 + 48) - 134) + 137);
        lIIIlllIlIllI[36] = (232 ^ 196) ^ (81 ^ 97);
        lIIIlllIlIllI[37] = 156 ^ 129;
        lIIIlllIlIllI[38] = (211 ^ 133) ^ (141 ^ 196);
        lIIIlllIlIllI[39] = (117 ^ 9) ^ (200 ^ 148);
        lIIIlllIlIllI[40] = 21 ^ 52;
        lIIIlllIlIllI[41] = (((110 + 52) - 18) + 14) ^ (((85 + 43) - 41) + 75);
        lIIIlllIlIllI[42] = (45 ^ 88) ^ (197 ^ 146);
        lIIIlllIlIllI[43] = (6 ^ 96) ^ (42 ^ 111);
        lIIIlllIlIllI[44] = (((10 + 41) - (-115)) + 19) ^ (((18 + 14) - (-34)) + 91);
        lIIIlllIlIllI[45] = (57 ^ 9) ^ (21 ^ 0);
        lIIIlllIlIllI[46] = 121 ^ 95;
        lIIIlllIlIllI[47] = (78 ^ 99) ^ (15 ^ 5);
        lIIIlllIlIllI[48] = (-((-12295) & 32391)) & (-1) & 32721;
        lIIIlllIlIllI[49] = (-2289) & 8188;
        lIIIlllIlIllI[50] = (-((-3201) & 23986)) & (-3) & 32767;
        lIIIlllIlIllI[51] = (-((-8489) & 15743)) & (-514) & 32767;
        lIIIlllIlIllI[52] = (-4116) & 6015;
        lIIIlllIlIllI[53] = (((145 + 74) - 90) + 68) ^ (((89 + 51) - 49) + 70);
        lIIIlllIlIllI[54] = (((167 + 88) - 213) + 128) ^ (((70 + 77) - 117) + 101);
        lIIIlllIlIllI[55] = (156 ^ 189) ^ (104 ^ 99);
        lIIIlllIlIllI[56] = (-((-16741) & 21485)) & (-2) & 7903;
        lIIIlllIlIllI[57] = (-((-65) & 29406)) & (-1) & 32767;
        lIIIlllIlIllI[58] = (((27 + 80) - 16) + 95) ^ (((120 + 118) - 186) + 93);
        lIIIlllIlIllI[59] = 114 ^ 94;
        lIIIlllIlIllI[60] = 71 ^ 106;
        lIIIlllIlIllI[61] = (-((-10690) & 31221)) & (-1) & 23743;
        lIIIlllIlIllI[62] = (-((-1081) & 13885)) & (-9) & 16236;
        lIIIlllIlIllI[63] = (-9) & 3165;
        lIIIlllIlIllI[64] = (-((-15043) & 31455)) & (-4099) & 23935;
        lIIIlllIlIllI[65] = (-((-17445) & 22125)) & (-24833) & 32767;
        lIIIlllIlIllI[66] = (-29188) & 32671;
        lIIIlllIlIllI[67] = (-((-7517) & 16221)) & (-20869) & 32767;
        lIIIlllIlIllI[68] = (-((-7309) & 24237)) & (-4) & 20335;
        lIIIlllIlIllI[69] = 186 ^ 148;
        lIIIlllIlIllI[70] = 185 ^ 150;
        lIIIlllIlIllI[71] = (128 ^ 150) ^ (31 ^ 57);
        lIIIlllIlIllI[72] = (123 ^ 108) ^ (114 ^ 84);
        lIIIlllIlIllI[73] = 34 ^ 17;
        lIIIlllIlIllI[74] = (141 ^ 161) ^ (44 ^ 52);
        lIIIlllIlIllI[75] = 247 ^ 194;
    }

    private static String lIlIIlIIlIIIIll(String lllllllllllllllIIIIIlIlIlIlIIIll, String lllllllllllllllIIIIIlIlIlIlIIIlI) {
        String lllllllllllllllIIIIIlIlIlIlIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIlIlIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIlIlIlIlIIIlI.toCharArray();
        int lllllllllllllllIIIIIlIlIlIIlllll = lIIIlllIlIllI[0];
        char[] charArray2 = lllllllllllllllIIIIIlIlIlIlIIIll2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIlllIlIllI[0];
        while (lIlIIlIIlIIllII(i2, length)) {
            char lllllllllllllllIIIIIlIlIlIlIIlII = charArray2[i2];
            sb.append((char) (lllllllllllllllIIIIIlIlIlIlIIlII ^ charArray[lllllllllllllllIIIIIlIlIlIIlllll % charArray.length]));
            "".length();
            lllllllllllllllIIIIIlIlIlIIlllll++;
            i2++;
            "".length();
            if ((13 ^ 9) < ((75 ^ 117) & ((93 ^ 99) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlIIlIIlIIlIlI();
        lIlIIlIIlIIlIIl();
        hk = new WorldPoint(lIIIlllIlIllI[61], lIIIlllIlIllI[62], lIIIlllIlIllI[0]);
        hl = new WorldPoint(lIIIlllIlIllI[63], lIIIlllIlIllI[64], lIIIlllIlIllI[1]);
        hm = new WorldPoint(lIIIlllIlIllI[65], lIIIlllIlIllI[66], lIIIlllIlIllI[0]);
        hn = new WorldPoint(lIIIlllIlIllI[67], lIIIlllIlIllI[68], lIIIlllIlIllI[0]);
        String[] strArr = new String[lIIIlllIlIllI[15]];
        strArr[lIIIlllIlIllI[0]] = lIIIlllIlIlII[lIIIlllIlIllI[69]];
        strArr[lIIIlllIlIllI[1]] = lIIIlllIlIlII[lIIIlllIlIllI[70]];
        strArr[lIIIlllIlIllI[3]] = lIIIlllIlIlII[lIIIlllIlIllI[71]];
        strArr[lIIIlllIlIllI[6]] = lIIIlllIlIlII[lIIIlllIlIllI[72]];
        strArr[lIIIlllIlIllI[7]] = lIIIlllIlIlII[lIIIlllIlIllI[2]];
        strArr[lIIIlllIlIllI[10]] = lIIIlllIlIlII[lIIIlllIlIllI[73]];
        strArr[lIIIlllIlIllI[14]] = lIIIlllIlIlII[lIIIlllIlIllI[74]];
        bW = strArr;
        bA = new ArrayList();
        bY = lIIIlllIlIllI[0];
    }

    private static boolean S() {
        int[] iArr = new int[lIIIlllIlIllI[1]];
        iArr[lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
        return Inventory.contains(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    private static void bm() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIlIIlIIlIIllll(nearest) && lIlIIlIIlIIllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[45]];
            C0000a.a(nearest);
            Time.sleepTicks(lIIIlllIlIllI[3]);
            "".length();
        }
        if (lIlIIlIIlIIllll(nearest) && lIlIIlIIlIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIlIlII[lIIIlllIlIllI[46]];
            if (lIlIIlIIlIIllIl(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIIIlllIlIllI[8]);
                "".length();
            }
            if (lIlIIlIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                if (lIlIIlIIlIIlllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIIIlllIlIllI[7]);
                    "".length();
                }
                if (lIlIIlIIlIIlllI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIIIlllIlIllI[3]);
                    "".length();
                }
                int[] iArr = new int[lIIIlllIlIllI[1]];
                iArr[lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
                if (lIlIIlIIlIIllIl(C0004e.b(iArr) ? 1 : 0)) {
                    W();
                    System.out.println(lIIIlllIlIlII[lIIIlllIlIllI[47]]);
                    by = lIIIlllIlIllI[1];
                    return;
                }
                int[] iArr2 = new int[lIIIlllIlIllI[1]];
                iArr2[lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
                if (lIlIIlIIlIIlIll(C0004e.b(iArr2) ? 1 : 0)) {
                    C0000a.a(lIIIlllIlIllI[9], lIIIlllIlIllI[1]);
                    C0000a.b(C0005f.ba, lIIIlllIlIllI[3]);
                    C0000a.a(lIIIlllIlIllI[11], lIIIlllIlIllI[12]);
                    C0000a.b(C0005f.bk, lIIIlllIlIllI[1]);
                }
            }
        }
    }

    private static void W() {
        int[] iArr = new int[lIIIlllIlIllI[1]];
        iArr[lIIIlllIlIllI[0]] = lIIIlllIlIllI[48];
        if (lIlIIlIIlIIllIl(Bank.contains(iArr) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIllI[48], lIIIlllIlIllI[10], C0007h.bv));
            "".length();
        }
        int[] iArr2 = new int[lIIIlllIlIllI[1]];
        iArr2[lIIIlllIlIllI[0]] = lIIIlllIlIllI[9];
        if (lIlIIlIIlIIllIl(Bank.contains(iArr2) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIllI[9], lIIIlllIlIllI[1], lIIIlllIlIllI[49]));
            "".length();
        }
        if (lIlIIlIIlIIllIl(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlllIlIlII[lIIIlllIlIllI[54]]);
        }) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIllI[50], lIIIlllIlIllI[10], lIIIlllIlIllI[51]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlllIlIllI[1]];
        iArr3[lIIIlllIlIllI[0]] = lIIIlllIlIllI[11];
        if (lIlIIlIIlIIllIl(Bank.contains(iArr3) ? 1 : 0)) {
            bA.add(new C0003d(lIIIlllIlIllI[11], lIIIlllIlIllI[20], lIIIlllIlIllI[52]));
            "".length();
        }
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            cm();
            "".length();
            if (((71 ^ 20) & ((35 ^ 112) ^ (-1))) >= (41 ^ 45)) {
                return (27 ^ 89) & ((235 ^ 169) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlllIlIllI[53];
    }
}
