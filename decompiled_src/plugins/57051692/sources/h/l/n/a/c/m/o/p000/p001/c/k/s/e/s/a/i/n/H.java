package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
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
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.H  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/H.class */
public class H implements K {
    static /* synthetic */ WorldPoint jb;
    static /* synthetic */ WorldPoint jd;
    static /* synthetic */ WorldPoint jc;
    private static /* synthetic */ String[] lIlllIIIIl;
    private static final /* synthetic */ int iY;
    static /* synthetic */ WorldPoint cV;
    static /* synthetic */ WorldPoint iZ;
    static /* synthetic */ boolean je;
    static /* synthetic */ WorldPoint ja;
    private static /* synthetic */ int[] lIlllIIIll;
    public static /* synthetic */ List<C0003d> bp;
    static /* synthetic */ int dc;
    static /* synthetic */ boolean dd;
    static /* synthetic */ String[] cy;
    public static /* synthetic */ boolean bn;

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlllIIIIl[lIlllIIIll[97]];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            cH();
            "".length();
            if (0 != 0) {
                return ((((81 + 176) - 167) + 97) ^ (((51 + 17) - 31) + 103)) & (((84 ^ 93) ^ (65 ^ 127)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlllIIIll[83];
    }

    private static void lIIlllIIIIIll() {
        lIlllIIIIl = new String[lIlllIIIll[129]];
        lIlllIIIIl[lIlllIIIll[1]] = lIIllIlllIlII("txBo+kEbOa3mpUiZ2jhZQAavShKf7EnfEF9G7LVO0CVf95JQyAtEGqWPrYHeMs7r", "UsNnO");
        lIlllIIIIl[lIlllIIIll[0]] = lIIllIlllIlII("NDaRoj8A4vopU+iw5LwDNQ==", "pyPdE");
        lIlllIIIIl[lIlllIIIll[4]] = lIIllIlllIlII("SBafWI9D3R4BXfQp40MEKcfNREeG4mAN", "ZMSMT");
        lIlllIIIIl[lIlllIIIll[7]] = lIIllIlllIlIl("ARJkNyozVyk/KyUeKjF4JwIhJSx2BDEmKDoeISV0dgQzPyw1Hy04P3YDK3YaAy4NGB8=", "VwDVX");
        lIlllIIIIl[lIlllIIIll[5]] = lIIllIlllIlIl("OgZBBDQIQwwMNR4KDwJmHBYEFjJNEBQVNgEKBBZqTRAWDDIOCwgLIU0XDkUEODooKwE=", "mcaeF");
        lIlllIIIIl[lIlllIIIll[14]] = lIIllIlllIlII("Hk4dvxQO7+4=", "BZpNp");
        lIlllIIIIl[lIlllIIIll[16]] = lIIllIlllIlIl("CxIR", "NsehN");
        lIlllIIIIl[lIlllIIIll[18]] = lIIllIlllIllI("KiFPS2Gx/zC6wgjeddeYYw==", "xCyaI");
        lIlllIIIIl[lIlllIIIll[20]] = lIIllIlllIlII("/rrsPTzp0/VU2M2u/aAFtnzCq2FHuS59", "aLdMm");
        lIlllIIIIl[lIlllIIIll[22]] = lIIllIlllIlIl("Fyk+RQE2aCcWGDgm", "YHHeu");
        lIlllIIIIl[lIlllIIIll[24]] = lIIllIlllIlIl("Ih4PCzo=", "mmbjT");
        lIlllIIIIl[lIlllIIIll[25]] = lIIllIlllIlIl("HCEO", "KHiZr");
        lIlllIIIIl[lIlllIIIll[8]] = lIIllIlllIlII("h7v6dtYbr6o=", "NoVix");
        lIlllIIIIl[lIlllIIIll[34]] = lIIllIlllIlII("hQtGmRB2T37d3vkd87afCw==", "mFSQz");
        lIlllIIIIl[lIlllIIIll[35]] = lIIllIlllIlIl("LywK", "aInav");
        lIlllIIIIl[lIlllIIIll[36]] = lIIllIlllIlIl("HTk0", "JPSjq");
        lIlllIIIIl[lIlllIIIll[37]] = lIIllIlllIlII("hDo9uLgTqXw=", "OyryN");
        lIlllIIIIl[lIlllIIIll[38]] = lIIllIlllIlII("9TbmxZfG/Hc=", "rWbxB");
        lIlllIIIIl[lIlllIIIll[39]] = lIIllIlllIllI("2Z1hI51HNIc=", "BKnNr");
        lIlllIIIIl[lIlllIIIll[42]] = lIIllIlllIlII("klkwzDW5J/c=", "fQWKG");
        lIlllIIIIl[lIlllIIIll[33]] = lIIllIlllIllI("Gju42d9p/r8=", "OodbP");
        lIlllIIIIl[lIlllIIIll[43]] = lIIllIlllIlIl("HxcDHyg=", "OvpkM");
        lIlllIIIIl[lIlllIIIll[44]] = lIIllIlllIlII("842LOlCEaSkmfCQrVhWx/A==", "gJtki");
        lIlllIIIIl[lIlllIIIll[46]] = lIIllIlllIllI("pw5TnecP0bU/lG6hQVJrrQ==", "TYCaZ");
        lIlllIIIIl[lIlllIIIll[52]] = lIIllIlllIllI("23B30vaIhmd2qZEL6C/PlA==", "DPRwj");
        lIlllIIIIl[lIlllIIIll[45]] = lIIllIlllIlIl("EAYT", "GotbK");
        lIlllIIIIl[lIlllIIIll[53]] = lIIllIlllIlIl("BQ0jGAM=", "UlPlf");
        lIlllIIIIl[lIlllIIIll[54]] = lIIllIlllIlII("xPigqW/O3MH5o8AveNFIfw==", "yQTUF");
        lIlllIIIIl[lIlllIIIll[55]] = lIIllIlllIlII("cs1AkZeSbL/q9DyLF6eUPA==", "VcRES");
        lIlllIIIIl[lIlllIIIll[56]] = lIIllIlllIlIl("CwQgMCU=", "DwMQK");
        lIlllIIIIl[lIlllIIIll[57]] = lIIllIlllIlIl("LgoKAxYFCksTCw==", "jxkzx");
        lIlllIIIIl[lIlllIIIll[58]] = lIIllIlllIlIl("ESxzAiRWLzYTJxc=", "vCSvK");
        lIlllIIIIl[lIlllIIIll[59]] = lIIllIlllIllI("zV9pMe5ZKvM=", "gKQKT");
        lIlllIIIIl[lIlllIIIll[60]] = lIIllIlllIlII("mDBsIdkXZpc=", "KhcaI");
        lIlllIIIIl[lIlllIIIll[61]] = lIIllIlllIlII("BYNmDrwOmdc=", "osKQD");
        lIlllIIIIl[lIlllIIIll[62]] = lIIllIlllIlII("sYM6H9JbhI3mzT9BQMGXxw==", "Xjstb");
        lIlllIIIIl[lIlllIIIll[63]] = lIIllIlllIlIl("DzVRHSFINhQMIgk=", "hZqiN");
        lIlllIIIIl[lIlllIIIll[64]] = lIIllIlllIlIl("GCsU", "OBsjI");
        lIlllIIIIl[lIlllIIIll[65]] = lIIllIlllIlIl("GS8LJjw=", "INxRY");
        lIlllIIIIl[lIlllIIIll[66]] = lIIllIlllIllI("fy4UP1js000=", "ifnCB");
        lIlllIIIIl[lIlllIIIll[67]] = lIIllIlllIllI("+1sqf7PVxb1VquWfzZdQjA==", "TdRIP");
        lIlllIIIIl[lIlllIIIll[68]] = lIIllIlllIllI("qHvZNP0ic+Unf0RxIcu37Q==", "iFTpe");
        lIlllIIIIl[lIlllIIIll[69]] = lIIllIlllIllI("sH1j+5reGFE=", "ZibZe");
        lIlllIIIIl[lIlllIIIll[70]] = lIIllIlllIllI("kDctnKD1x4fqWq6BjCoN4w==", "RqrRT");
        lIlllIIIIl[lIlllIIIll[73]] = lIIllIlllIlII("nyQtedMmKt7bbHzaUdBudQ==", "diguz");
        lIlllIIIIl[lIlllIIIll[74]] = lIIllIlllIlIl("LQ4OP1MIAh0o", "jgxZs");
        lIlllIIIIl[lIlllIIIll[75]] = lIIllIlllIlII("3W3Yym3NdJ0=", "aOFLg");
        lIlllIIIIl[lIlllIIIll[76]] = lIIllIlllIlII("1RheYSoOUos=", "LERTf");
        lIlllIIIIl[lIlllIIIll[77]] = lIIllIlllIllI("VSEl250dBsy55CNdtb9MrA==", "rqctD");
        lIlllIIIIl[lIlllIIIll[78]] = lIIllIlllIlII("hpV8VTyke1s=", "wgcKL");
        lIlllIIIIl[lIlllIIIll[32]] = lIIllIlllIlII("/nWdOfCOAtR12xFN8BXaLg==", "aCRFT");
        lIlllIIIIl[lIlllIIIll[79]] = lIIllIlllIllI("XJxGqpoeltwzuhn6xbhujA==", "vtajz");
        lIlllIIIIl[lIlllIIIll[80]] = lIIllIlllIlIl("AzwqOSAkbi4yIw==", "ANEWZ");
        lIlllIIIIl[lIlllIIIll[81]] = lIIllIlllIlIl("IRwAAh4fTi4QBRQ=", "qniqq");
        lIlllIIIIl[lIlllIIIll[82]] = lIIllIlllIlII("bl9ORp3iDm9Y2rewUTf/2Q==", "zsiFE");
        lIlllIIIIl[lIlllIIIll[84]] = lIIllIlllIlIl("BSMNOD4=", "GQhYU");
        lIlllIIIIl[lIlllIIIll[87]] = lIIllIlllIlII("n/XyCqw2QDfFz9DM/nYmUw==", "mNuZT");
        lIlllIIIIl[lIlllIIIll[88]] = lIIllIlllIlIl("PRMZEw==", "zrmvg");
        lIlllIIIIl[lIlllIIIll[89]] = lIIllIlllIlIl("CDswLw==", "GKUAD");
        lIlllIIIIl[lIlllIIIll[90]] = lIIllIlllIlII("Mj9rT+MOXY6DwniHyXgJHQ==", "abrhf");
        lIlllIIIIl[lIlllIIIll[91]] = lIIllIlllIlIl("DQ8IPSgrCwU8OW4vCCA4Lwk=", "NgiSK");
        lIlllIIIIl[lIlllIIIll[97]] = lIIllIlllIlII("wXlUNPMYt4dI7MTWWJxOHNPO35vnzlhf", "pMMMx");
        lIlllIIIIl[lIlllIIIll[99]] = lIIllIlllIllI("yAlq4eFWndPhxFmJjrptZt7Qd/2qp05j", "QZOOB");
        lIlllIIIIl[lIlllIIIll[100]] = lIIllIlllIllI("+c26bf6oBvU=", "dMYAJ");
        lIlllIIIIl[lIlllIIIll[101]] = lIIllIlllIlII("XJnZzrgy3TM=", "wRMDC");
        lIlllIIIIl[lIlllIIIll[102]] = lIIllIlllIlII("tRwpTSaILi8=", "Bchqc");
        lIlllIIIIl[lIlllIIIll[103]] = lIIllIlllIlII("rt+Tu73vzJ0=", "uwxTs");
        lIlllIIIIl[lIlllIIIll[116]] = lIIllIlllIlII("bsHNYXImJcA=", "TugFJ");
        lIlllIIIIl[lIlllIIIll[117]] = lIIllIlllIllI("I2cJA4Tpq3o0xGkqTGJ9jmUaBCqe+3Xa9WRl9yWZl4FobHWkjZGvNg==", "jyiKK");
        lIlllIIIIl[lIlllIIIll[118]] = lIIllIlllIlII("AT2JvsgoENJgqt7zXhWwnyiA7il4G/wvoZHPDjnBVyVXfKewKG9Ms4KXxzbQPZu/", "KXpye");
        lIlllIIIIl[lIlllIIIll[119]] = lIIllIlllIllI("2a2lvNhKMIgtYBvNQ9K1nPGxLX3F8ijexSgqcxc3UVI=", "OnjsL");
        lIlllIIIIl[lIlllIIIll[120]] = lIIllIlllIlII("01JJ1WFroBP2bf7MD12JcWy3f/VpOBInMpeRl0dECMtcxScXCAfrlQ==", "kBUhr");
        lIlllIIIIl[lIlllIIIll[121]] = lIIllIlllIllI("8YyqxndrSWpd7fp2QGm0bB+bV3yN/60J8U5u8P/da4Q=", "mWNYS");
        lIlllIIIIl[lIlllIIIll[122]] = lIIllIlllIllI("oM0nRafRM1JMskbLZCkEE0HHda4iPB8oXyLMsSLbZKDRxSzW7pOqsw==", "CBTZW");
        lIlllIIIIl[lIlllIIIll[123]] = lIIllIlllIlIl("CTQgJRdhPid3Ci4kfncqLiRmJRZhNyA6HDQiYT4dYRYoMh8oPy4lUg==", "AQAWs");
        lIlllIIIIl[lIlllIIIll[124]] = lIIllIlllIlIl("IwMTJkkHSws9GwZLHjMaERgGch4YChxyGhwOHG0=", "tkrRn");
        lIlllIIIIl[lIlllIIIll[125]] = lIIllIlllIlII("FL4HMev0KPsoQqOTaIUnGx/K90jYOioj/VfZESVQDEr9CagdXEmDsq46/SWGrgWu", "QWCpa");
        lIlllIIIIl[lIlllIIIll[126]] = lIIllIlllIllI("SpXwSeIhvjs0lDFi0gZqH92e6L8DLvUZqwC0PRZ6Sio=", "GGNJB");
        lIlllIIIIl[lIlllIIIll[127]] = lIIllIlllIlII("AXEkbetzhBQnlFf5yATKd8qRob1AjS6IdfjiX56yi8s7svYxQny936UWLavC3tsQ", "eVGfe");
        lIlllIIIIl[lIlllIIIll[128]] = lIIllIlllIlII("Cgk2Asv9bWlMsjnzUCtdBu3aRl0i+r5rZROTNMzMP4SOTFsZFIckUw==", "amEtf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v267, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v310, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v563, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v572, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v594, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v129, types: [boolean] */
    public static void cH() {
        if (lIIlllIIIIllI(bn ? 1 : 0)) {
            C0001b.a(bp);
            if (lIIlllIIIIlll(bp.size(), lIlllIIIll[0])) {
                System.out.println(lIlllIIIIl[lIlllIIIll[1]]);
                bn = lIlllIIIll[1];
            }
        }
        if (lIIlllIIIlIII(bn ? 1 : 0)) {
            if (lIIlllIIIlIII(al() ? 1 : 0) && lIIlllIIIIlll(C0004e.j(lIlllIIIll[2]), lIlllIIIll[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlllIIIlIIl(nearest) && lIIlllIIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[0]];
                    C0000a.a(nearest);
                }
                if (lIIlllIIIlIIl(nearest) && lIIlllIIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlllIIIlIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlllIIIll[3]);
                        "".length();
                    }
                    if (lIIlllIIIIllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[4]];
                        if (lIIlllIIIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlllIIIll[5]);
                            "".length();
                        }
                        if (lIIlllIIIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlllIIIll[4]);
                            "".length();
                        }
                        int[] iArr = new int[lIlllIIIll[0]];
                        iArr[lIlllIIIll[1]] = lIlllIIIll[6];
                        if (lIIlllIIIIllI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIlllIIIll[0]];
                            iArr2[lIlllIIIll[1]] = lIlllIIIll[6];
                            if (lIIlllIIIIlll(Bank.getFirst(iArr2).getQuantity(), lIlllIIIll[7])) {
                                O();
                                System.out.println(lIlllIIIIl[lIlllIIIll[7]]);
                                bn = lIlllIIIll[0];
                                return;
                            }
                        }
                        int[] iArr3 = new int[lIlllIIIll[8]];
                        iArr3[lIlllIIIll[1]] = lIlllIIIll[9];
                        iArr3[lIlllIIIll[0]] = lIlllIIIll[10];
                        iArr3[lIlllIIIll[4]] = lIlllIIIll[11];
                        iArr3[lIlllIIIll[7]] = lIlllIIIll[12];
                        iArr3[lIlllIIIll[5]] = lIlllIIIll[13];
                        iArr3[lIlllIIIll[14]] = lIlllIIIll[15];
                        iArr3[lIlllIIIll[16]] = lIlllIIIll[17];
                        iArr3[lIlllIIIll[18]] = lIlllIIIll[19];
                        iArr3[lIlllIIIll[20]] = lIlllIIIll[21];
                        iArr3[lIlllIIIll[22]] = lIlllIIIll[23];
                        iArr3[lIlllIIIll[24]] = lIlllIIIll[6];
                        iArr3[lIlllIIIll[25]] = lIlllIIIll[26];
                        if (lIIlllIIIlIII(C0004e.b(iArr3) ? 1 : 0)) {
                            O();
                            System.out.println(lIlllIIIIl[lIlllIIIll[5]]);
                            bn = lIlllIIIll[0];
                            return;
                        }
                        int[] iArr4 = new int[lIlllIIIll[8]];
                        iArr4[lIlllIIIll[1]] = lIlllIIIll[9];
                        iArr4[lIlllIIIll[0]] = lIlllIIIll[10];
                        iArr4[lIlllIIIll[4]] = lIlllIIIll[11];
                        iArr4[lIlllIIIll[7]] = lIlllIIIll[12];
                        iArr4[lIlllIIIll[5]] = lIlllIIIll[13];
                        iArr4[lIlllIIIll[14]] = lIlllIIIll[15];
                        iArr4[lIlllIIIll[16]] = lIlllIIIll[17];
                        iArr4[lIlllIIIll[18]] = lIlllIIIll[19];
                        iArr4[lIlllIIIll[20]] = lIlllIIIll[21];
                        iArr4[lIlllIIIll[22]] = lIlllIIIll[23];
                        iArr4[lIlllIIIll[24]] = lIlllIIIll[6];
                        iArr4[lIlllIIIll[25]] = lIlllIIIll[26];
                        if (lIIlllIIIIllI(C0004e.b(iArr4) ? 1 : 0)) {
                            C0000a.a(lIlllIIIll[10], lIlllIIIll[0]);
                            C0000a.a(lIlllIIIll[12], lIlllIIIll[0]);
                            C0000a.a(lIlllIIIll[13], lIlllIIIll[0]);
                            C0000a.a(lIlllIIIll[15], lIlllIIIll[0]);
                            C0000a.a(lIlllIIIll[17], lIlllIIIll[0]);
                            C0000a.a(lIlllIIIll[21], lIlllIIIll[0]);
                            C0000a.a(lIlllIIIll[19], lIlllIIIll[0]);
                            C0000a.a(lIlllIIIll[23], lIlllIIIll[0]);
                            C0000a.a(lIlllIIIll[26], lIlllIIIll[0]);
                            C0000a.a(lIlllIIIll[27], lIlllIIIll[14]);
                            C0000a.a(lIlllIIIll[9], lIlllIIIll[24]);
                            C0000a.a(lIlllIIIll[28], lIlllIIIll[0]);
                            C0000a.a(lIlllIIIll[6], lIlllIIIll[7]);
                            C0000a.a(lIlllIIIll[11], lIlllIIIll[7]);
                            C0000a.a(lIlllIIIll[29], lIlllIIIll[4]);
                            C0000a.a(lIlllIIIll[30], lIlllIIIll[31]);
                        }
                    }
                }
            }
            if (lIIlllIIIIllI(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIlllIIIIlll(Movement.getRunEnergy(), lIlllIIIll[32])) {
                Inventory.getFirst(C0005f.aU).interact(lIlllIIIIl[lIlllIIIll[14]]);
                Time.sleepTicks(lIlllIIIll[0]);
                "".length();
            }
            int[] iArr5 = new int[lIlllIIIll[0]];
            iArr5[lIlllIIIll[1]] = lIlllIIIll[27];
            if (lIIlllIIIIllI(Inventory.contains(iArr5) ? 1 : 0) && lIIlllIIIlIll(lIIlllIIIIlIl(C0004e.u(), 50.0d))) {
                int[] iArr6 = new int[lIlllIIIll[0]];
                iArr6[lIlllIIIll[1]] = lIlllIIIll[27];
                Inventory.getFirst(iArr6).interact(lIlllIIIIl[lIlllIIIll[16]]);
                Time.sleepTicks(lIlllIIIll[0]);
                "".length();
            }
            if (lIIlllIIIIllI(al() ? 1 : 0) && lIIlllIIIlIII(C0004e.j(lIlllIIIll[2]))) {
                if (lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(cV), lIlllIIIll[18])) {
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[18]];
                    Movement.walkTo(cV);
                    "".length();
                    Time.sleepTicks(lIlllIIIll[0]);
                    "".length();
                }
                if (lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(cV), lIlllIIIll[18])) {
                    C0006g.a(lIlllIIIIl[lIlllIIIll[20]], cy);
                }
            }
            if (lIIlllIIIlllI(C0004e.j(lIlllIIIll[2]), lIlllIIIll[24])) {
                if (lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[14])) {
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[22]];
                    Movement.walkTo(iZ);
                    "".length();
                    Time.sleepTicks(lIlllIIIll[0]);
                    "".length();
                }
                if (lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[14])) {
                    C0006g.a(lIlllIIIIl[lIlllIIIll[24]], cy);
                }
            }
            if (lIIlllIIIlllI(C0004e.j(lIlllIIIll[2]), lIlllIIIll[33])) {
                dc = lIlllIIIll[1];
                String[] strArr = new String[lIlllIIIll[0]];
                strArr[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[25]];
                if (lIIlllIIIlIII(Inventory.contains(strArr) ? 1 : 0)) {
                    if (lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(ja), lIlllIIIll[4])) {
                        if (lIIlllIIIIllI(Inventory.contains(item -> {
                            return item.getName().contains(lIlllIIIIl[lIlllIIIll[103]]);
                        }) ? 1 : 0)) {
                            Inventory.getFirst(item2 -> {
                                return item2.getName().contains(lIlllIIIIl[lIlllIIIll[102]]);
                            }).interact(lIlllIIIIl[lIlllIIIll[8]]);
                        }
                        AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[34]];
                        Movement.walkTo(ja);
                        "".length();
                        Time.sleepTicks(lIlllIIIll[0]);
                        "".length();
                    }
                    if (lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(ja), lIlllIIIll[4])) {
                        C0006g.a(lIlllIIIIl[lIlllIIIll[35]], cy);
                    }
                }
                String[] strArr2 = new String[lIlllIIIll[0]];
                strArr2[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[36]];
                if (lIIlllIIIIllI(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lIlllIIIll[0]];
                    strArr3[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[37]];
                    if (lIIlllIIIlIII(Inventory.contains(strArr3) ? 1 : 0)) {
                        int[] iArr7 = new int[lIlllIIIll[0]];
                        iArr7[lIlllIIIll[1]] = lIlllIIIll[12];
                        if (lIIlllIIIIllI(Inventory.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIlllIIIll[0]];
                            iArr8[lIlllIIIll[1]] = lIlllIIIll[12];
                            Item first = Inventory.getFirst(iArr8);
                            String[] strArr4 = new String[lIlllIIIll[0]];
                            strArr4[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[38]];
                            first.useOn(Inventory.getFirst(strArr4));
                            Time.sleepTicks(lIlllIIIll[4]);
                            "".length();
                        }
                        int[] iArr9 = new int[lIlllIIIll[0]];
                        iArr9[lIlllIIIll[1]] = lIlllIIIll[12];
                        if (lIIlllIIIlIII(Inventory.contains(iArr9) ? 1 : 0)) {
                            String[] strArr5 = new String[lIlllIIIll[0]];
                            strArr5[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[39]];
                            NPC nearest2 = NPCs.getNearest(strArr5);
                            new WorldArea(lIlllIIIll[40], lIlllIIIll[41], lIlllIIIll[14], lIlllIIIll[16], lIlllIIIll[1]);
                            if (!lIIlllIIIlIIl(nearest2) || (lIIlllIIIlIIl(nearest2) && lIIlllIIIlIII(Reachable.isInteractable(nearest2) ? 1 : 0))) {
                                Movement.walkTo(jb);
                                "".length();
                                Time.sleepTicks(lIlllIIIll[0]);
                                "".length();
                            }
                            if (lIIlllIIIlIIl(nearest2)) {
                                C0006g.a(lIlllIIIIl[lIlllIIIll[42]], cy, lIlllIIIll[0]);
                            }
                        }
                    }
                }
                String[] strArr6 = new String[lIlllIIIll[0]];
                strArr6[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[33]];
                if (lIIlllIIIIllI(Inventory.contains(strArr6) ? 1 : 0)) {
                    String[] strArr7 = new String[lIlllIIIll[0]];
                    strArr7[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[43]];
                    if (lIIlllIIIIllI(Inventory.contains(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[lIlllIIIll[0]];
                        strArr8[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[44]];
                        if (lIIlllIIIlIII(Inventory.contains(strArr8) ? 1 : 0) && lIIlllIIIlIII(je ? 1 : 0)) {
                            if (lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(jc), lIlllIIIll[18]) && lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[45])) {
                                AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[46]];
                                Movement.walkTo(jc);
                                "".length();
                                Time.sleepTicks(lIlllIIIll[0]);
                                "".length();
                            }
                            if (lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(jc), lIlllIIIll[18])) {
                                WorldPoint worldPoint = new WorldPoint(lIlllIIIll[47], lIlllIIIll[48], lIlllIIIll[1]);
                                WorldPoint worldPoint2 = new WorldPoint(lIlllIIIll[47], lIlllIIIll[49], lIlllIIIll[1]);
                                if ((!lIIlllIIIlIII(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) || lIIlllIIIIllI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) && lIIlllIIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                                    Movement.walkTo(new WorldPoint(lIlllIIIll[50], lIlllIIIll[51], lIlllIIIll[1]));
                                    "".length();
                                    Time.sleepTicks(lIlllIIIll[7]);
                                    "".length();
                                }
                                C0006g.a(lIlllIIIIl[lIlllIIIll[52]], cy, lIlllIIIll[0]);
                            }
                        }
                    }
                }
                String[] strArr9 = new String[lIlllIIIll[0]];
                strArr9[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[45]];
                if (lIIlllIIIIllI(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[lIlllIIIll[0]];
                    strArr10[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[53]];
                    if (lIIlllIIIIllI(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[lIlllIIIll[0]];
                        strArr11[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[54]];
                        if (lIIlllIIIIllI(Inventory.contains(strArr11) ? 1 : 0) && lIIlllIIIlIII(je ? 1 : 0)) {
                            if (lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[14])) {
                                AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[55]];
                                Movement.walkTo(iZ);
                                "".length();
                                Time.sleepTicks(lIlllIIIll[0]);
                                "".length();
                            }
                            if (lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[14])) {
                                C0006g.a(lIlllIIIIl[lIlllIIIll[56]], cy);
                                List options = Dialog.getOptions();
                                if (lIIlllIIIlIII(options.isEmpty() ? 1 : 0)) {
                                    int i = lIlllIIIll[1];
                                    while (lIIlllIIIIlll(i, options.size())) {
                                        if (lIIlllIIIIllI(((Widget) options.get(i)).getText().contains(lIlllIIIIl[lIlllIIIll[57]]) ? 1 : 0)) {
                                            System.out.println(lIlllIIIIl[lIlllIIIll[58]]);
                                            je = lIlllIIIll[0];
                                        }
                                        i++;
                                        "".length();
                                        if ("   ".length() == 0) {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(iZ), lIlllIIIll[20]) && lIIlllIIIlIII(je ? 1 : 0)) {
                    String[] strArr12 = new String[lIlllIIIll[0]];
                    strArr12[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[59]];
                    if (lIIlllIIIIllI(Inventory.contains(strArr12) ? 1 : 0)) {
                        String[] strArr13 = new String[lIlllIIIll[0]];
                        strArr13[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[60]];
                        if (lIIlllIIIIllI(Inventory.contains(strArr13) ? 1 : 0)) {
                            C0006g.a(lIlllIIIIl[lIlllIIIll[61]], cy);
                            List options2 = Dialog.getOptions();
                            if (lIIlllIIIlIII(options2.isEmpty() ? 1 : 0)) {
                                int i2 = lIlllIIIll[1];
                                while (lIIlllIIIIlll(i2, options2.size())) {
                                    if (lIIlllIIIIllI(((Widget) options2.get(i2)).getText().contains(lIlllIIIIl[lIlllIIIll[62]]) ? 1 : 0)) {
                                        System.out.println(lIlllIIIIl[lIlllIIIll[63]]);
                                        je = lIlllIIIll[0];
                                    }
                                    i2++;
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                if (lIIlllIIIIllI(je ? 1 : 0)) {
                    String[] strArr14 = new String[lIlllIIIll[0]];
                    strArr14[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[64]];
                    if (lIIlllIIIIllI(Inventory.contains(strArr14) ? 1 : 0)) {
                        String[] strArr15 = new String[lIlllIIIll[0]];
                        strArr15[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[65]];
                        if (lIIlllIIIIllI(Inventory.contains(strArr15) ? 1 : 0)) {
                            if (lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(jd), lIlllIIIll[16])) {
                                if (lIIlllIIIIllI(Inventory.contains(item3 -> {
                                    return item3.getName().contains(lIlllIIIIl[lIlllIIIll[101]]);
                                }) ? 1 : 0)) {
                                    Inventory.getFirst(item4 -> {
                                        return item4.getName().contains(lIlllIIIIl[lIlllIIIll[100]]);
                                    }).interact(lIlllIIIIl[lIlllIIIll[66]]);
                                }
                                if (lIIlllIIIIllI(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                String[] strArr16 = new String[lIlllIIIll[0]];
                                strArr16[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[67]];
                                C0006g.a(strArr16);
                                AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[68]];
                                Movement.walkTo(jd);
                                "".length();
                                Time.sleepTicks(lIlllIIIll[0]);
                                "".length();
                            }
                            if (lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(jd), lIlllIIIll[16])) {
                                C0006g.a(lIlllIIIIl[lIlllIIIll[69]], cy);
                            }
                        }
                    }
                }
            }
            if (!lIIlllIIIllll(C0004e.j(lIlllIIIll[2]), lIlllIIIll[57]) || lIIlllIIIlllI(C0004e.j(lIlllIIIll[2]), lIlllIIIll[58])) {
                String[] strArr17 = new String[lIlllIIIll[0]];
                strArr17[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[70]];
                if (lIIlllIIIIllI(Inventory.contains(strArr17) ? 1 : 0)) {
                    WorldArea worldArea = new WorldArea(lIlllIIIll[71], lIlllIIIll[72], lIlllIIIll[24], lIlllIIIll[18], lIlllIIIll[1]);
                    C0006g.a(cy);
                    if (lIIlllIIIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[73]];
                        Movement.walkTo(jc);
                        "".length();
                        Time.sleepTicks(lIlllIIIll[0]);
                        "".length();
                    }
                    if (lIIlllIIIIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[74]];
                        C0006g.a(lIlllIIIIl[lIlllIIIll[75]], cy, lIlllIIIll[0]);
                    }
                }
            }
            if (lIIlllIIIlllI(C0004e.j(lIlllIIIll[2]), lIlllIIIll[67])) {
                String[] strArr18 = new String[lIlllIIIll[0]];
                strArr18[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[76]];
                if (lIIlllIIIIllI(Inventory.contains(strArr18) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[77]];
                    String[] strArr19 = new String[lIlllIIIll[0]];
                    strArr19[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[78]];
                    Item first2 = Inventory.getFirst(strArr19);
                    String[] strArr20 = new String[lIlllIIIll[0]];
                    strArr20[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[32]];
                    first2.useOn(NPCs.getNearest(strArr20));
                    Time.sleepTicks(lIlllIIIll[20]);
                    "".length();
                }
            }
            if (lIIlllIIIlllI(C0004e.j(lIlllIIIll[2]), lIlllIIIll[32])) {
                WorldArea worldArea2 = new WorldArea(lIlllIIIll[71], lIlllIIIll[72], lIlllIIIll[14], lIlllIIIll[5], lIlllIIIll[1]);
                if (lIIlllIIIlIII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[79]];
                    String[] strArr21 = new String[lIlllIIIll[0]];
                    strArr21[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[80]];
                    Item first3 = Inventory.getFirst(strArr21);
                    String[] strArr22 = new String[lIlllIIIll[0]];
                    strArr22[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[81]];
                    first3.useOn(TileObjects.getNearest(strArr22));
                    Time.sleepTicks(lIlllIIIll[7]);
                    "".length();
                }
                if (lIIlllIIIIllI(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    C0006g.a(lIlllIIIIl[lIlllIIIll[82]], cy);
                }
            }
            if (lIIlllIIIlllI(C0004e.j(lIlllIIIll[2]), lIlllIIIll[83])) {
                if (lIIlllIIIllII(Players.getLocal().getWorldLocation().distanceTo(cV), lIlllIIIll[18])) {
                    if (lIIlllIIIIllI(new WorldArea(lIlllIIIll[71], lIlllIIIll[72], lIlllIIIll[14], lIlllIIIll[5], lIlllIIIll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIIIlIII(Equipment.contains(C0005f.aQ) ? 1 : 0)) {
                        int[] iArr10 = new int[lIlllIIIll[0]];
                        iArr10[lIlllIIIll[1]] = lIlllIIIll[9];
                        if (lIIlllIIIIllI(Inventory.contains(iArr10) ? 1 : 0)) {
                            int[] iArr11 = new int[lIlllIIIll[0]];
                            iArr11[lIlllIIIll[1]] = lIlllIIIll[9];
                            Inventory.getFirst(iArr11).interact(lIlllIIIIl[lIlllIIIll[84]]);
                            Time.sleepTicks(C0004e.c(lIlllIIIll[16], lIlllIIIll[20]));
                            "".length();
                        }
                    }
                    if (lIIlllIIIIllI(new WorldArea(lIlllIIIll[51], lIlllIIIll[85], lIlllIIIll[52], lIlllIIIll[55], lIlllIIIll[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlllIIIllIl(Players.getLocal().getWorldLocation().getX(), lIlllIIIll[86])) {
                        AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[87]];
                        String[] strArr23 = new String[lIlllIIIll[0]];
                        strArr23[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[88]];
                        TileObjects.getNearest(strArr23).interact(lIlllIIIIl[lIlllIIIll[89]]);
                        Time.sleepTicks(C0004e.c(lIlllIIIll[5], lIlllIIIll[16]));
                        "".length();
                    }
                    AccBuilderShamans.c = lIlllIIIIl[lIlllIIIll[90]];
                    Movement.walkTo(cV);
                    "".length();
                    Time.sleepTicks(lIlllIIIll[0]);
                    "".length();
                }
                if (lIIlllIIIllIl(Players.getLocal().getWorldLocation().distanceTo(cV), lIlllIIIll[18])) {
                    if (lIIlllIIIIlll(dc, lIlllIIIll[0])) {
                        Z.oc += lIlllIIIll[0];
                        Z.p(AccBuilderShamans.m);
                        dc += lIlllIIIll[0];
                        Z.oc = lIlllIIIll[1];
                        dd = lIlllIIIll[1];
                    }
                    C0006g.a(lIlllIIIIl[lIlllIIIll[91]], cy);
                }
            }
            C0006g.a(new String[lIlllIIIll[1]]);
        }
    }

    private static boolean lIIlllIIIIllI(int i) {
        return i != 0;
    }

    private static boolean lIIlllIIIIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0171, code lost:
        if (lIIlllIIIIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.H.lIlllIIIll[7]) != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10 = new int[lIlllIIIll[0]];
        iArr10[lIlllIIIll[1]] = lIlllIIIll[28];
        if (lIIlllIIIlIII(Bank.contains(iArr10) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIIll[28], lIlllIIIll[0], lIlllIIIll[92]));
            "".length();
        }
        int[] iArr11 = new int[lIlllIIIll[0]];
        iArr11[lIlllIIIll[1]] = lIlllIIIll[26];
        if (lIIlllIIIlIII(Bank.contains(iArr11) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIIll[26], lIlllIIIll[0], lIlllIIIll[93]));
            "".length();
        }
        int[] iArr12 = new int[lIlllIIIll[0]];
        iArr12[lIlllIIIll[1]] = lIlllIIIll[23];
        if (lIIlllIIIlIII(Bank.contains(iArr12) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIIll[23], lIlllIIIll[0], lIlllIIIll[93]));
            "".length();
        }
        int[] iArr13 = new int[lIlllIIIll[0]];
        iArr13[lIlllIIIll[1]] = lIlllIIIll[21];
        if (lIIlllIIIlIII(Bank.contains(iArr13) ? 1 : 0)) {
            bp.add(new C0003d(lIlllIIIll[21], lIlllIIIll[0], lIlllIIIll[93]));
            "".length();
        }
        int[] iArr14 = new int[lIlllIIIll[0]];
        iArr14[lIlllIIIll[1]] = lIlllIIIll[6];
        if (lIIlllIIIIllI(Bank.contains(iArr14) ? 1 : 0)) {
            int[] iArr15 = new int[lIlllIIIll[0]];
            iArr15[lIlllIIIll[1]] = lIlllIIIll[6];
            if (lIIlllIIIIllI(Bank.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIlllIIIll[0]];
                iArr16[lIlllIIIll[1]] = lIlllIIIll[6];
            }
            iArr = new int[lIlllIIIll[0]];
            iArr[lIlllIIIll[1]] = lIlllIIIll[15];
            if (lIIlllIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIIIll[15], lIlllIIIll[0], lIlllIIIll[93]));
                "".length();
            }
            iArr2 = new int[lIlllIIIll[0]];
            iArr2[lIlllIIIll[1]] = lIlllIIIll[17];
            if (lIIlllIIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIIIll[17], lIlllIIIll[0], lIlllIIIll[93]));
                "".length();
            }
            iArr3 = new int[lIlllIIIll[0]];
            iArr3[lIlllIIIll[1]] = lIlllIIIll[19];
            if (lIIlllIIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIIIll[19], lIlllIIIll[0], lIlllIIIll[93]));
                "".length();
            }
            iArr4 = new int[lIlllIIIll[0]];
            iArr4[lIlllIIIll[1]] = lIlllIIIll[13];
            if (lIIlllIIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIIIll[13], lIlllIIIll[0], lIlllIIIll[93]));
                "".length();
            }
            iArr5 = new int[lIlllIIIll[0]];
            iArr5[lIlllIIIll[1]] = lIlllIIIll[12];
            if (lIIlllIIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIIIll[12], lIlllIIIll[0], lIlllIIIll[93]));
                "".length();
            }
            iArr6 = new int[lIlllIIIll[0]];
            iArr6[lIlllIIIll[1]] = lIlllIIIll[11];
            if (lIIlllIIIlIII(Bank.contains(iArr6) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIIIll[11], lIlllIIIll[7], lIlllIIIll[93]));
                "".length();
            }
            iArr7 = new int[lIlllIIIll[0]];
            iArr7[lIlllIIIll[1]] = lIlllIIIll[10];
            if (lIIlllIIIlIII(Bank.contains(iArr7) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIIIll[10], lIlllIIIll[0], lIlllIIIll[93]));
                "".length();
            }
            if (lIIlllIIIlIII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIlllIIIIl[lIlllIIIll[99]]);
            }) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIIIll[94], lIlllIIIll[14], lIlllIIIll[95]));
                "".length();
            }
            iArr8 = new int[lIlllIIIll[0]];
            iArr8[lIlllIIIll[1]] = lIlllIIIll[29];
            if (lIIlllIIIlIII(Bank.contains(iArr8) ? 1 : 0)) {
                bp.add(new C0003d(lIlllIIIll[29], lIlllIIIll[5], C0009j.bZ));
                "".length();
            }
            iArr9 = new int[lIlllIIIll[0]];
            iArr9[lIlllIIIll[1]] = lIlllIIIll[9];
            if (lIIlllIIIIllI(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr17 = new int[lIlllIIIll[0]];
                iArr17[lIlllIIIll[1]] = lIlllIIIll[9];
                if (!lIIlllIIIIllI(Bank.contains(iArr17) ? 1 : 0)) {
                    return;
                }
                int[] iArr18 = new int[lIlllIIIll[0]];
                iArr18[lIlllIIIll[1]] = lIlllIIIll[9];
                if (!lIIlllIIIIlll(Bank.getFirst(iArr18).getQuantity(), lIlllIIIll[36])) {
                    return;
                }
            }
            bp.add(new C0003d(lIlllIIIll[9], lIlllIIIll[67], lIlllIIIll[96]));
            "".length();
        }
        bp.add(new C0003d(lIlllIIIll[6], lIlllIIIll[7], lIlllIIIll[93]));
        "".length();
        iArr = new int[lIlllIIIll[0]];
        iArr[lIlllIIIll[1]] = lIlllIIIll[15];
        if (lIIlllIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIlllIIIll[0]];
        iArr2[lIlllIIIll[1]] = lIlllIIIll[17];
        if (lIIlllIIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIlllIIIll[0]];
        iArr3[lIlllIIIll[1]] = lIlllIIIll[19];
        if (lIIlllIIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[lIlllIIIll[0]];
        iArr4[lIlllIIIll[1]] = lIlllIIIll[13];
        if (lIIlllIIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIlllIIIll[0]];
        iArr5[lIlllIIIll[1]] = lIlllIIIll[12];
        if (lIIlllIIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIlllIIIll[0]];
        iArr6[lIlllIIIll[1]] = lIlllIIIll[11];
        if (lIIlllIIIlIII(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIlllIIIll[0]];
        iArr7[lIlllIIIll[1]] = lIlllIIIll[10];
        if (lIIlllIIIlIII(Bank.contains(iArr7) ? 1 : 0)) {
        }
        if (lIIlllIIIlIII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIlllIIIIl[lIlllIIIll[99]]);
        }) ? 1 : 0)) {
        }
        iArr8 = new int[lIlllIIIll[0]];
        iArr8[lIlllIIIll[1]] = lIlllIIIll[29];
        if (lIIlllIIIlIII(Bank.contains(iArr8) ? 1 : 0)) {
        }
        iArr9 = new int[lIlllIIIll[0]];
        iArr9[lIlllIIIll[1]] = lIlllIIIll[9];
        if (lIIlllIIIIllI(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlllIIIll[9], lIlllIIIll[67], lIlllIIIll[96]));
        "".length();
    }

    static {
        lIIlllIIIIlII();
        lIIlllIIIIIll();
        iY = lIlllIIIll[2];
        bp = new ArrayList();
        cV = new WorldPoint(lIlllIIIll[104], lIlllIIIll[105], lIlllIIIll[1]);
        iZ = new WorldPoint(lIlllIIIll[106], lIlllIIIll[107], lIlllIIIll[1]);
        ja = new WorldPoint(lIlllIIIll[108], lIlllIIIll[109], lIlllIIIll[1]);
        jb = new WorldPoint(lIlllIIIll[110], lIlllIIIll[111], lIlllIIIll[1]);
        jc = new WorldPoint(lIlllIIIll[112], lIlllIIIll[113], lIlllIIIll[1]);
        jd = new WorldPoint(lIlllIIIll[114], lIlllIIIll[115], lIlllIIIll[1]);
        String[] strArr = new String[lIlllIIIll[34]];
        strArr[lIlllIIIll[1]] = lIlllIIIIl[lIlllIIIll[116]];
        strArr[lIlllIIIll[0]] = lIlllIIIIl[lIlllIIIll[117]];
        strArr[lIlllIIIll[4]] = lIlllIIIIl[lIlllIIIll[118]];
        strArr[lIlllIIIll[7]] = lIlllIIIIl[lIlllIIIll[119]];
        strArr[lIlllIIIll[5]] = lIlllIIIIl[lIlllIIIll[120]];
        strArr[lIlllIIIll[14]] = lIlllIIIIl[lIlllIIIll[121]];
        strArr[lIlllIIIll[16]] = lIlllIIIIl[lIlllIIIll[122]];
        strArr[lIlllIIIll[18]] = lIlllIIIIl[lIlllIIIll[123]];
        strArr[lIlllIIIll[20]] = lIlllIIIIl[lIlllIIIll[124]];
        strArr[lIlllIIIll[22]] = lIlllIIIIl[lIlllIIIll[125]];
        strArr[lIlllIIIll[24]] = lIlllIIIIl[lIlllIIIll[126]];
        strArr[lIlllIIIll[25]] = lIlllIIIIl[lIlllIIIll[127]];
        strArr[lIlllIIIll[8]] = lIlllIIIIl[lIlllIIIll[128]];
        cy = strArr;
    }

    private static void lIIlllIIIIlII() {
        lIlllIIIll = new int[130];
        lIlllIIIll[0] = " ".length();
        lIlllIIIll[1] = ((((119 + 103) - 75) + 96) ^ (((131 + 132) - 178) + 76)) & (((3 ^ 58) ^ (81 ^ 58)) ^ (-" ".length()));
        lIlllIIIll[2] = (-22063) & 22335;
        lIlllIIIll[3] = (-((-2955) & 28623)) & (-33) & 30700;
        lIlllIIIll[4] = "  ".length();
        lIlllIIIll[5] = (156 ^ 178) ^ (62 ^ 20);
        lIlllIIIll[6] = (-20609) & 22525;
        lIlllIIIll[7] = "   ".length();
        lIlllIIIll[8] = 117 ^ 121;
        lIlllIIIll[9] = (-8353) & 16359;
        lIlllIIIll[10] = (-4363) & 6123;
        lIlllIIIll[11] = (-24609) & 26367;
        lIlllIIIll[12] = (-((-16457) & 29017)) & (-18443) & 32767;
        lIlllIIIll[13] = (-65) & 2015;
        lIlllIIIll[14] = 181 ^ 176;
        lIlllIIIll[15] = (-11650) & 12241;
        lIlllIIIll[16] = (((51 + 65) - 6) + 80) ^ (((32 + 100) - 5) + 57);
        lIlllIIIll[17] = (-99) & 2027;
        lIlllIIIll[18] = 108 ^ 107;
        lIlllIIIll[19] = (-((-16517) & 18645)) & (-16387) & 20447;
        lIlllIIIll[20] = 143 ^ 135;
        lIlllIIIll[21] = (-((-27139) & 32323)) & (-24577) & 32109;
        lIlllIIIll[22] = 120 ^ 113;
        lIlllIIIll[23] = (-((-20647) & 21679)) & (-14339) & 16383;
        lIlllIIIll[24] = 132 ^ 142;
        lIlllIIIll[25] = (186 ^ 178) ^ "   ".length();
        lIlllIIIll[26] = (-8262) & 9215;
        lIlllIIIll[27] = (-15489) & 15867;
        lIlllIIIll[28] = (-((-24641) & 24950)) & (-4097) & 16383;
        lIlllIIIll[29] = (-((-10561) & 27081)) & (-513) & 29657;
        lIlllIIIll[30] = (-((-18339) & 32691)) & (-17417) & 32763;
        lIlllIIIll[31] = (-((-2017) & 24567)) & (-9217) & 32766;
        lIlllIIIll[32] = 115 ^ 65;
        lIlllIIIll[33] = (152 ^ 192) ^ (73 ^ 5);
        lIlllIIIll[34] = (((83 + 186) - 185) + 123) ^ (((16 + 12) - (-115)) + 51);
        lIlllIIIll[35] = 170 ^ 164;
        lIlllIIIll[36] = (82 ^ 58) ^ (96 ^ 7);
        lIlllIIIll[37] = (218 ^ 140) ^ (248 ^ 190);
        lIlllIIIll[38] = 159 ^ 142;
        lIlllIIIll[39] = (((85 + 94) - 3) + 4) ^ (((137 + 23) - 107) + 113);
        lIlllIIIll[40] = (-24965) & 28047;
        lIlllIIIll[41] = (-((-19585) & 24515)) & (-8198) & 16383;
        lIlllIIIll[42] = (158 ^ 164) ^ (170 ^ 131);
        lIlllIIIll[43] = (1 ^ 33) ^ (151 ^ 162);
        lIlllIIIll[44] = 9 ^ 31;
        lIlllIIIll[45] = 20 ^ 13;
        lIlllIIIll[46] = 72 ^ 95;
        lIlllIIIll[47] = (-17155) & 20282;
        lIlllIIIll[48] = (-12865) & 16110;
        lIlllIIIll[49] = (-((-3085) & 15709)) & (-513) & 16383;
        lIlllIIIll[50] = (-8641) & 11769;
        lIlllIIIll[51] = (-25089) & 28333;
        lIlllIIIll[52] = 216 ^ 192;
        lIlllIIIll[53] = (((100 + 91) - 146) + 120) ^ (((71 + 52) - (-32)) + 36);
        lIlllIIIll[54] = (14 ^ 6) ^ (50 ^ 33);
        lIlllIIIll[55] = (((152 + 82) - 98) + 83) ^ (((184 + 85) - 193) + 123);
        lIlllIIIll[56] = 168 ^ 181;
        lIlllIIIll[57] = 217 ^ 199;
        lIlllIIIll[58] = 216 ^ 199;
        lIlllIIIll[59] = (((119 + 82) - 77) + 60) ^ (((102 + 37) - 76) + 89);
        lIlllIIIll[60] = (((61 + 87) - 118) + 101) ^ (((137 + 21) - 28) + 32);
        lIlllIIIll[61] = (24 ^ 119) ^ (78 ^ 3);
        lIlllIIIll[62] = 65 ^ 98;
        lIlllIIIll[63] = (96 ^ 0) ^ (247 ^ 179);
        lIlllIIIll[64] = 89 ^ 124;
        lIlllIIIll[65] = 174 ^ 136;
        lIlllIIIll[66] = (((146 + 213) - 318) + 187) ^ (((48 + 185) - 183) + 145);
        lIlllIIIll[67] = (60 ^ 50) ^ (158 ^ 184);
        lIlllIIIll[68] = 166 ^ 143;
        lIlllIIIll[69] = (18 ^ 125) ^ (73 ^ 12);
        lIlllIIIll[70] = 64 ^ 107;
        lIlllIIIll[71] = (-(((115 + 175) - 186) + 93)) & (-777) & 4093;
        lIlllIIIll[72] = (-24920) & 28159;
        lIlllIIIll[73] = (232 ^ 168) ^ (24 ^ 116);
        lIlllIIIll[74] = 235 ^ 198;
        lIlllIIIll[75] = (44 ^ 71) ^ (243 ^ 182);
        lIlllIIIll[76] = 80 ^ 127;
        lIlllIIIll[77] = (23 ^ 92) ^ (72 ^ 51);
        lIlllIIIll[78] = (237 ^ 129) ^ (5 ^ 88);
        lIlllIIIll[79] = 52 ^ 7;
        lIlllIIIll[80] = 155 ^ 175;
        lIlllIIIll[81] = 182 ^ 131;
        lIlllIIIll[82] = 241 ^ 199;
        lIlllIIIll[83] = 234 ^ 142;
        lIlllIIIll[84] = (((70 + 160) - 125) + 69) ^ (((47 + 81) - 114) + 139);
        lIlllIIIll[85] = (-21353) & 24572;
        lIlllIIIll[86] = (-17213) & 20479;
        lIlllIIIll[87] = 81 ^ 105;
        lIlllIIIll[88] = (167 ^ 172) ^ (60 ^ 14);
        lIlllIIIll[89] = (31 ^ 25) ^ (144 ^ 172);
        lIlllIIIll[90] = 124 ^ 71;
        lIlllIIIll[91] = 0 ^ 60;
        lIlllIIIll[92] = (-((-24394) & 32733)) & (-4673) & 32511;
        lIlllIIIll[93] = (-((-17497) & 28250)) & (-3) & 16255;
        lIlllIIIll[94] = (-((-8945) & 25587)) & (-49) & 28670;
        lIlllIIIll[95] = (-6663) & 31662;
        lIlllIIIll[96] = (-16385) & 18284;
        lIlllIIIll[97] = (240 ^ 168) ^ (202 ^ 175);
        lIlllIIIll[98] = 15 ^ 97;
        lIlllIIIll[99] = (188 ^ 156) ^ (120 ^ 102);
        lIlllIIIll[100] = (((1 + 46) - (-37)) + 54) ^ (((173 + 152) - 173) + 29);
        lIlllIIIll[101] = 213 ^ 149;
        lIlllIIIll[102] = 60 ^ 125;
        lIlllIIIll[103] = 48 ^ 114;
        lIlllIIIll[104] = (-8477) & 11775;
        lIlllIIIll[105] = (-((-5981) & 14301)) & (-21251) & 32731;
        lIlllIIIll[106] = (-25090) & 28379;
        lIlllIIIll[107] = (-9106) & 12287;
        lIlllIIIll[108] = (-((-18785) & 27617)) & (-20514) & 32443;
        lIlllIIIll[109] = (-((-2089) & 22894)) & (-8705) & 32767;
        lIlllIIIll[110] = (-((-7213) & 32639)) & (-1) & 28511;
        lIlllIIIll[111] = (-((-16979) & 21335)) & (-8257) & 15871;
        lIlllIIIll[112] = (-((-3097) & 20442)) & (-4105) & 24575;
        lIlllIIIll[113] = (-((-18081) & 26613)) & (-1) & 11775;
        lIlllIIIll[114] = (-13138) & 16249;
        lIlllIIIll[115] = (-((-11521) & 28482)) & (-8193) & 28415;
        lIlllIIIll[116] = (233 ^ 181) ^ (167 ^ 184);
        lIlllIIIll[117] = (166 ^ 175) ^ (209 ^ 156);
        lIlllIIIll[118] = 75 ^ 14;
        lIlllIIIll[119] = 40 ^ 110;
        lIlllIIIll[120] = (108 ^ 117) ^ (154 ^ 196);
        lIlllIIIll[121] = (((147 + 195) - 285) + 139) ^ (((61 + 19) - 25) + 85);
        lIlllIIIll[122] = 252 ^ 181;
        lIlllIIIll[123] = 194 ^ 136;
        lIlllIIIll[124] = 16 ^ 91;
        lIlllIIIll[125] = 140 ^ 192;
        lIlllIIIll[126] = (55 ^ 15) ^ (223 ^ 170);
        lIlllIIIll[127] = 92 ^ 18;
        lIlllIIIll[128] = 38 ^ 105;
        lIlllIIIll[129] = 244 ^ 164;
    }

    private static boolean lIIlllIIIlIlI(int i) {
        return i > 0;
    }

    private static boolean lIIlllIIIllIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIIllIlllIlIl(String llllllllllllllllllIlllllllllIllI, String llllllllllllllllllIlllllllllIlIl) {
        String llllllllllllllllllIlllllllllIllI2 = new String(Base64.getDecoder().decode(llllllllllllllllllIlllllllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIlllllllllIlII = new StringBuilder();
        char[] llllllllllllllllllIlllllllllIIll = llllllllllllllllllIlllllllllIlIl.toCharArray();
        int llllllllllllllllllIllllllllIllIl = lIlllIIIll[1];
        char[] charArray = llllllllllllllllllIlllllllllIllI2.toCharArray();
        int length = charArray.length;
        int i = lIlllIIIll[1];
        while (lIIlllIIIIlll(i, length)) {
            char llllllllllllllllllIlllllllllIlll = charArray[i];
            llllllllllllllllllIlllllllllIlII.append((char) (llllllllllllllllllIlllllllllIlll ^ llllllllllllllllllIlllllllllIIll[llllllllllllllllllIllllllllIllIl % llllllllllllllllllIlllllllllIIll.length]));
            "".length();
            llllllllllllllllllIllllllllIllIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIlllllllllIlII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlllIIIll[1];
    }

    private static boolean lIIlllIIIlIll(int i) {
        return i < 0;
    }

    private static boolean lIIlllIIIlllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlllIIIlIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlllIIlIIII(C0004e.j(lIlllIIIll[2]), lIlllIIIll[98])) {
            ?? r0 = lIlllIIIll[0];
            "".length();
            return !((true ^ true) ^ (true ^ true)) ? ((17 ^ 53) ^ (138 ^ 165)) & (((127 ^ 75) ^ (249 ^ 198)) ^ (-" ".length())) : r0;
        }
        return lIlllIIIll[1];
    }

    private static boolean lIIlllIIIlIIl(Object obj) {
        return obj != null;
    }

    private static String lIIllIlllIlII(String llllllllllllllllllIlllllllIlIIlI, String llllllllllllllllllIlllllllIlIIll) {
        try {
            SecretKeySpec llllllllllllllllllIlllllllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIlllllllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllIIIll[4], llllllllllllllllllIlllllllIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIlllllllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIlllllllIlIlIl) {
            llllllllllllllllllIlllllllIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIIllIlllIllI(String llllllllllllllllllIllllllllIIIIl, String llllllllllllllllllIllllllllIIIII) {
        try {
            SecretKeySpec llllllllllllllllllIllllllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIllllllllIIIII.getBytes(StandardCharsets.UTF_8)), lIlllIIIll[20]), "DES");
            Cipher llllllllllllllllllIllllllllIIIll = Cipher.getInstance("DES");
            llllllllllllllllllIllllllllIIIll.init(lIlllIIIll[4], llllllllllllllllllIllllllllIIlII);
            return new String(llllllllllllllllllIllllllllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIllllllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIllllllllIIIlI) {
            llllllllllllllllllIllllllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIIllII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlllIIlIIII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean al() {
        int[] iArr = new int[lIlllIIIll[8]];
        iArr[lIlllIIIll[1]] = lIlllIIIll[9];
        iArr[lIlllIIIll[0]] = lIlllIIIll[10];
        iArr[lIlllIIIll[4]] = lIlllIIIll[11];
        iArr[lIlllIIIll[7]] = lIlllIIIll[12];
        iArr[lIlllIIIll[5]] = lIlllIIIll[13];
        iArr[lIlllIIIll[14]] = lIlllIIIll[15];
        iArr[lIlllIIIll[16]] = lIlllIIIll[17];
        iArr[lIlllIIIll[18]] = lIlllIIIll[19];
        iArr[lIlllIIIll[20]] = lIlllIIIll[21];
        iArr[lIlllIIIll[22]] = lIlllIIIll[23];
        iArr[lIlllIIIll[24]] = lIlllIIIll[6];
        iArr[lIlllIIIll[25]] = lIlllIIIll[26];
        int i = lIlllIIIll[1];
        while (lIIlllIIIIlll(i, iArr.length)) {
            int[] iArr2 = new int[lIlllIIIll[0]];
            iArr2[lIlllIIIll[1]] = iArr[i];
            if (lIIlllIIIlIII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlllIIIll[1];
            }
            i++;
            "".length();
            if (" ".length() > ((((97 + 116) - 55) + 31) ^ (((70 + 129) - 41) + 27))) {
                return ((141 ^ 134) ^ (120 ^ 89)) & (((220 ^ 184) ^ (58 ^ 116)) ^ (-" ".length()));
            }
        }
        return lIlllIIIll[0];
    }

    private static int lIIlllIIIIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlllIIIllll(int i, int i2) {
        return i != i2;
    }
}
