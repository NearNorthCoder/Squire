package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aw  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aw.class */
public class aw implements InterfaceC0003ac {
    private static /* synthetic */ int[] lllIIlIllI;
    public static final /* synthetic */ int oA;
    public static /* synthetic */ List<C0017d> bv;
    static /* synthetic */ String[] cE;
    public static final /* synthetic */ WorldPoint oz;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] lllIIlIlIl;

    private static void eK() {
        if (llIIIIIlIllII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIIIIIlIllll(Widgets.get(lllIIlIllI[76], lllIIlIllI[55]))) {
            Widgets.get(lllIIlIllI[76], lllIIlIllI[55]).interact(lllIIlIlIl[lllIIlIllI[98]]);
            Time.sleepTicks(lllIIlIllI[2]);
            "".length();
        }
        if (llIIIIIlIllll(Widgets.get(lllIIlIllI[78], lllIIlIllI[6]))) {
            Widgets.get(lllIIlIllI[78], lllIIlIllI[6]).interact(lllIIlIlIl[lllIIlIllI[99]]);
            Time.sleepTicks(lllIIlIllI[5]);
            "".length();
        }
    }

    static {
        llIIIIIlIlIll();
        llIIIIIlIlIlI();
        oA = lllIIlIllI[31];
        oz = new WorldPoint(lllIIlIllI[138], lllIIlIllI[139], lllIIlIllI[0]);
        bv = new ArrayList();
        String[] strArr = new String[lllIIlIllI[2]];
        strArr[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[140]];
        strArr[lllIIlIllI[1]] = lllIIlIlIl[lllIIlIllI[141]];
        cE = strArr;
    }

    private static void llIIIIIlIlIlI() {
        lllIIlIlIl = new String[lllIIlIllI[142]];
        lllIIlIlIl[lllIIlIllI[0]] = llIIIIIlIIlll("APZ//lxWMSXTKfLMPgbv5Q==", "sVZWj");
        lllIIlIlIl[lllIIlIllI[1]] = llIIIIIlIlIII("Gann/9CBc5FN1HqNQzGjyb7/Akp6kYjv4HwPcysG2BrPluC7oqqg1aUaK3VUBlVPNKPNKjRwejI=", "dFdAK");
        lllIIlIlIl[lllIIlIllI[2]] = llIIIIIlIIlll("00QHanii/QyvJu+tw6HzKv1HZiDP6xJE", "DoGyg");
        lllIIlIlIl[lllIIlIllI[3]] = llIIIIIlIIlll("CFPfy34TkbR+1xm3/ILeWQ==", "iFjif");
        lllIIlIlIl[lllIIlIllI[5]] = llIIIIIlIlIII("sbki22WIgms=", "RzTlj");
        lllIIlIlIl[lllIIlIllI[6]] = llIIIIIlIlIII("QSahXx1MABFyszk0R8Y274vs1fPoZDc4", "rSlrQ");
        lllIIlIlIl[lllIIlIllI[9]] = llIIIIIlIlIIl("NA5ZIDEGSxQoMBACFyZjEQIXJjBPSwo2KhcIESgtBEsNLmMhPiAIDSQ=", "ckyAC");
        lllIIlIlIl[lllIIlIllI[11]] = llIIIIIlIIlll("VZdRqFRTAwhd+1fQae5C+qQEP8ByHve0IFSpIZ1ZawGvMmL0wTfU6Q==", "KMsFE");
        lllIIlIlIl[lllIIlIllI[13]] = llIIIIIlIlIIl("MDBEFDoCdQkcOxQ8ChJoDzQJGC0VeUQGPw4hBx0hCTJEASdHFzEsASkS", "gUduH");
        lllIIlIlIl[lllIIlIllI[15]] = llIIIIIlIIlll("XLoPAoD5xKcPOQuTb6347Pl23nZ0MFDYCnE45VUTSs/A2ikhaoassXMHLZwcXBLC", "GKrWq");
        lllIIlIlIl[lllIIlIllI[18]] = llIIIIIlIlIII("mOjJA965DqUjhrsrcYEsvWDP2WK3RQqqC6o+mujJqTTeDNyIkfkdmwX1o+lYpZAF", "CKtCV");
        lllIIlIlIl[lllIIlIllI[20]] = llIIIIIlIlIIl("LipoNAscbyU8CgomJjJZCSMpOxJVbzsiEA0sIDwXHm88Olk7GhEcNz4=", "yOHUy");
        lllIIlIlIl[lllIIlIllI[22]] = llIIIIIlIlIIl("FCBvECAmZSIYITAsIRZyLCQkUSIvJCEaIW9lPAY7NyYnGDwkZTsecgEQFjgcBA==", "CEOqR");
        lllIIlIlIl[lllIIlIllI[29]] = llIIIIIlIlIIl("EDM+HRU8LCxUASAnJw==", "UBKte");
        lllIIlIlIl[lllIIlIllI[30]] = llIIIIIlIlIIl("LzMJFA==", "xVhfu");
        lllIIlIlIl[lllIIlIllI[32]] = llIIIIIlIlIIl("DwAzeiUuQS01JDIEZT0kOA==", "AaEZQ");
        lllIIlIlIl[lllIIlIllI[33]] = llIIIIIlIIlll("eWnqzfQMRnq6VmeKYpC+qg==", "TYMRo");
        lllIIlIlIl[lllIIlIllI[34]] = llIIIIIlIIlll("qDL7dsZyGIZ35H+PCd+GXA==", "mtrdB");
        lllIIlIlIl[lllIIlIllI[36]] = llIIIIIlIIlll("AEBfg+a6vjzK7+qUYyK0NQ==", "rFwCQ");
        lllIIlIlIl[lllIIlIllI[37]] = llIIIIIlIlIII("2Xf+oAPGoYr84mM451OHXQ==", "Sdgjj");
        lllIIlIlIl[lllIIlIllI[39]] = llIIIIIlIIlll("EC5rQfeWe/kMld1bSKZ0zA==", "DdgkE");
        lllIIlIlIl[lllIIlIllI[40]] = llIIIIIlIlIII("Ep6IOIcWs70=", "GBaZb");
        lllIIlIlIl[lllIIlIllI[41]] = llIIIIIlIIlll("Al1QohwkDb0y7gAXr3BEz01lhJDrJrY3", "hgYGN");
        lllIIlIlIl[lllIIlIllI[16]] = llIIIIIlIIlll("GF0b+a3JAt8=", "IccqU");
        lllIIlIlIl[lllIIlIllI[43]] = llIIIIIlIlIIl("KQIMJDECGQJoNgMWDDo=", "kweHU");
        lllIIlIlIl[lllIIlIllI[46]] = llIIIIIlIIlll("5984mdJoYfU=", "ZMIne");
        lllIIlIlIl[lllIIlIllI[48]] = llIIIIIlIlIII("Mzm55Cr+mm0/drRTqbimmw==", "uKoVC");
        lllIIlIlIl[lllIIlIllI[49]] = llIIIIIlIlIIl("GAkvOCMv", "JlBWU");
        lllIIlIlIl[lllIIlIllI[27]] = llIIIIIlIlIIl("LTwd", "tYnkU");
        lllIIlIlIl[lllIIlIllI[51]] = llIIIIIlIlIIl("AQYKAyUqHQRPNiwcB08tIgEHCjM=", "CscoA");
        lllIIlIlIl[lllIIlIllI[53]] = llIIIIIlIIlll("c2xhspnYSWg=", "hdTnu");
        lllIIlIlIl[lllIIlIllI[55]] = llIIIIIlIlIIl("EBYnCSYrHS0=", "BsJfP");
        lllIIlIlIl[lllIIlIllI[56]] = llIIIIIlIlIIl("HxwFKjgo", "MyhEN");
        lllIIlIlIl[lllIIlIllI[57]] = llIIIIIlIIlll("+bbnKPjvPhg=", "ehPaC");
        lllIIlIlIl[lllIIlIllI[58]] = llIIIIIlIlIIl("IAMTCxBCGRsMVBYXGAsR", "bvzgt");
        lllIIlIlIl[lllIIlIllI[61]] = llIIIIIlIlIII("+eXcVc5Ttuo=", "rnmAP");
        lllIIlIlIl[lllIIlIllI[63]] = llIIIIIlIIlll("ZRzLMl45rkEprA2u9Psi0g==", "WTPSZ");
        lllIIlIlIl[lllIIlIllI[64]] = llIIIIIlIlIIl("HworAQIo", "MoFnt");
        lllIIlIlIl[lllIIlIllI[65]] = llIIIIIlIlIIl("Lz0j", "vXPfI");
        lllIIlIlIl[lllIIlIllI[66]] = llIIIIIlIlIIl("LwYkFClNHCwTbQESPxwoHw==", "msMxM");
        lllIIlIlIl[lllIIlIllI[67]] = llIIIIIlIIlll("Mg+425AVJNg=", "HSaxw");
        lllIIlIlIl[lllIIlIllI[68]] = llIIIIIlIlIII("9kRaxDdLMQw=", "QmqOy");
        lllIIlIlIl[lllIIlIllI[70]] = llIIIIIlIIlll("kaZiNQuwaw5n7gmSGZ7bdg==", "jaRMO");
        lllIIlIlIl[lllIIlIllI[71]] = llIIIIIlIIlll("oxVDvVhDwRI=", "ohJMP");
        lllIIlIlIl[lllIIlIllI[72]] = llIIIIIlIIlll("BP4Dj9LRt98=", "xLJPH");
        lllIIlIlIl[lllIIlIllI[73]] = llIIIIIlIlIII("JnEHVzoMccWm9iKl+zqjSA==", "SwIzZ");
        lllIIlIlIl[lllIIlIllI[77]] = llIIIIIlIIlll("IU1/DIqH1hk2JguvdYE+2FyFFDQ+DDhm", "kiPeS");
        lllIIlIlIl[lllIIlIllI[79]] = llIIIIIlIlIIl("HyYUBgQ7", "IOqqa");
        lllIIlIlIl[lllIIlIllI[81]] = llIIIIIlIlIII("9ULsbz/Oq9U=", "sqVWX");
        lllIIlIlIl[lllIIlIllI[83]] = llIIIIIlIlIIl("EwwFVwc9Bww=", "Rhawu");
        lllIIlIlIl[lllIIlIllI[84]] = llIIIIIlIlIIl("CSA6AjInJw==", "BINaZ");
        lllIIlIlIl[lllIIlIllI[85]] = llIIIIIlIlIIl("IwwhNA==", "gcOQj");
        lllIIlIlIl[lllIIlIllI[87]] = llIIIIIlIlIIl("KCY/IDwOO2ctJAQqITkhGCw=", "kIJNH");
        lllIIlIlIl[lllIIlIllI[88]] = llIIIIIlIIlll("z50Ka2ok3ZQ=", "QzQxD");
        lllIIlIlIl[lllIIlIllI[89]] = llIIIIIlIlIII("AJmvFvdz80JfTpLm9brJCdja0J9yB0Ku", "jQUcg");
        lllIIlIlIl[lllIIlIllI[90]] = llIIIIIlIlIII("yLMV2ALjOl4=", "sJauL");
        lllIIlIlIl[lllIIlIllI[91]] = llIIIIIlIlIII("NmJsJvNHDKg=", "jmYoX");
        lllIIlIlIl[lllIIlIllI[93]] = llIIIIIlIlIII("nJKHW+/0xsluyW7UJVArqA==", "NrMsU");
        lllIIlIlIl[lllIIlIllI[94]] = llIIIIIlIlIII("jH1R1LCHBt2jGyiKWeMnBw==", "wBBIF");
        lllIIlIlIl[lllIIlIllI[95]] = llIIIIIlIIlll("Q8sa+f53BPw=", "JhRip");
        lllIIlIlIl[lllIIlIllI[96]] = llIIIIIlIlIIl("Bx4TCTchA0sELysSDRAqNxQ=", "DqfgC");
        lllIIlIlIl[lllIIlIllI[97]] = llIIIIIlIlIIl("EyQZCQ==", "WKwlK");
        lllIIlIlIl[lllIIlIllI[86]] = llIIIIIlIlIII("6oE4Cvmu85k=", "LLJTf");
        lllIIlIlIl[lllIIlIllI[98]] = llIIIIIlIlIII("0pV//Xbb7HwAJZR8z3BY4phd8oAeaDJ1", "DjRSU");
        lllIIlIlIl[lllIIlIllI[99]] = llIIIIIlIlIII("BBj3NKKXoOM=", "Zvlgs");
        lllIIlIlIl[lllIIlIllI[80]] = llIIIIIlIIlll("jFexzoZTaaGIi5Knfrlhvw==", "iFCYH");
        lllIIlIlIl[lllIIlIllI[104]] = llIIIIIlIIlll("jMM3V9kMPSi/aiGSTxmy6k4W+LkYWJz2", "CQhEL");
        lllIIlIlIl[lllIIlIllI[105]] = llIIIIIlIlIII("fS7V5VJlyoA=", "WzGbu");
        lllIIlIlIl[lllIIlIllI[106]] = llIIIIIlIlIIl("DQAVJjY3", "EaxKS");
        lllIIlIlIl[lllIIlIllI[107]] = llIIIIIlIlIIl("HQAuJzw=", "MlOIW");
        lllIIlIlIl[lllIIlIllI[108]] = llIIIIIlIlIII("YRenMj2MevU=", "wgKKy");
        lllIIlIlIl[lllIIlIllI[109]] = llIIIIIlIlIII("UCfgDO0e/KtUyeiE2v1Yzg==", "vxxfP");
        lllIIlIlIl[lllIIlIllI[110]] = llIIIIIlIlIIl("BQY8HyM+ESRaJz5DOBUmIgY=", "QcPzS");
        lllIIlIlIl[lllIIlIllI[111]] = llIIIIIlIlIIl("ICkf", "sHhRW");
        lllIIlIlIl[lllIIlIllI[112]] = llIIIIIlIIlll("zYC6+AggX0k=", "yjdiM");
        lllIIlIlIl[lllIIlIllI[113]] = llIIIIIlIlIII("erAZgejuEU8=", "LKdPg");
        lllIIlIlIl[lllIIlIllI[114]] = llIIIIIlIlIIl("Nj0PFgI=", "fQnxi");
        lllIIlIlIl[lllIIlIllI[115]] = llIIIIIlIlIII("hDfAhOa0GEG07jZ0c6/9xWn/eQTY8cSi", "EtRCa");
        lllIIlIlIl[lllIIlIllI[116]] = llIIIIIlIIlll("MW1NSqEQoh0=", "wBHcx");
        lllIIlIlIl[lllIIlIllI[117]] = llIIIIIlIIlll("8HHbMEo37Ak=", "vurUg");
        lllIIlIlIl[lllIIlIllI[118]] = llIIIIIlIlIII("RD5wRCRRf6a7At/FYz1GgioeT5QWAjW2", "wXjVO");
        lllIIlIlIl[lllIIlIllI[119]] = llIIIIIlIlIIl("Bggg", "UiWMf");
        lllIIlIlIl[lllIIlIllI[120]] = llIIIIIlIlIIl("Ly03PCkV", "gLZQL");
        lllIIlIlIl[lllIIlIllI[92]] = llIIIIIlIIlll("6qhdEXWLmzEjc4bUAQvJzg==", "EEHxS");
        lllIIlIlIl[lllIIlIllI[135]] = llIIIIIlIlIIl("NSw8IWMoI3IxJiYpJi5jbw==", "GERFC");
        lllIIlIlIl[lllIIlIllI[136]] = llIIIIIlIlIIl("NgsqFWMrBGQWNiEOLRwkbA==", "DbDrC");
        lllIIlIlIl[lllIIlIllI[137]] = llIIIIIlIlIII("TPqlXJ/u6SI6AmJ7SylsHq24D5PQbFmf", "hEtMy");
        lllIIlIlIl[lllIIlIllI[140]] = llIIIIIlIIlll("LK9d6qMTwCMfRJU21+bdCX06S7RiFTy/", "TJwJa");
        lllIIlIlIl[lllIIlIllI[141]] = llIIIIIlIlIIl("Hg4rRRsrDjkWDmY=", "GkXek");
    }

    private static boolean llIIIIIlIllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIIlIllI[0];
    }

    private static boolean llIIIIIllIlIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    static boolean eL() {
        int[] iArr = new int[lllIIlIllI[1]];
        iArr[lllIIlIllI[0]] = lllIIlIllI[100];
        if (llIIIIIlIllll(TileObjects.getNearest(iArr))) {
            ?? r0 = lllIIlIllI[1];
            "".length();
            return (-" ".length()) >= (127 ^ 123) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIlIllI[0];
    }

    private static String llIIIIIlIIlll(String lllllllllllllllllIlllIlIlIlIlllI, String lllllllllllllllllIlllIlIlIlIllIl) {
        try {
            SecretKeySpec lllllllllllllllllIlllIlIlIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIlIlIllIl.getBytes(StandardCharsets.UTF_8)), lllIIlIllI[13]), "DES");
            Cipher lllllllllllllllllIlllIlIlIllIIII = Cipher.getInstance("DES");
            lllllllllllllllllIlllIlIlIllIIII.init(lllIIlIllI[2], lllllllllllllllllIlllIlIlIllIIIl);
            return new String(lllllllllllllllllIlllIlIlIllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIlIlIlIllll) {
            lllllllllllllllllIlllIlIlIlIllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[134])) {
            ?? r0 = lllIIlIllI[1];
            "".length();
            return (-" ".length()) != (-" ".length()) ? ((((170 + 84) - 200) + 147) ^ (((121 + 107) - 131) + 37)) & (((240 ^ 175) ^ (120 ^ 104)) ^ (-" ".length())) : r0;
        }
        return lllIIlIllI[0];
    }

    private static boolean llIIIIIllIlII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v180, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    private static boolean an() {
        if (llIIIIIlIllIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[18])) {
            String[] strArr = new String[lllIIlIllI[1]];
            strArr[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[80]];
            if (llIIIIIlIllII(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lllIIlIllI[1]];
                strArr2[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[104]];
                if (llIIIIIlIllII(Inventory.contains(strArr2) ? 1 : 0)) {
                    String[] strArr3 = new String[lllIIlIllI[1]];
                    strArr3[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[105]];
                    if (llIIIIIlIllII(Inventory.contains(strArr3) ? 1 : 0)) {
                        String[] strArr4 = new String[lllIIlIllI[1]];
                        strArr4[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[106]];
                        if (llIIIIIlIllII(Inventory.contains(strArr4) ? 1 : 0)) {
                            int[] iArr = new int[lllIIlIllI[1]];
                            iArr[lllIIlIllI[0]] = lllIIlIllI[25];
                            if (llIIIIIlIllII(Inventory.contains(iArr) ? 1 : 0)) {
                                String[] strArr5 = new String[lllIIlIllI[1]];
                                strArr5[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[107]];
                                if (llIIIIIlIllII(Inventory.contains(strArr5) ? 1 : 0)) {
                                    String[] strArr6 = new String[lllIIlIllI[1]];
                                    strArr6[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[108]];
                                    if (llIIIIIllIIIl(Inventory.getAll(strArr6).size(), lllIIlIllI[2]) && (!llIIIIIlIlllI(Inventory.contains(C0019f.aS) ? 1 : 0) || llIIIIIlIllII(Equipment.contains(C0019f.aS) ? 1 : 0))) {
                                        ?? r0 = lllIIlIllI[1];
                                        "".length();
                                        return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lllIIlIllI[0];
        } else if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[18]) && llIIIIIlIllIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[16])) {
            String[] strArr7 = new String[lllIIlIllI[1]];
            strArr7[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[109]];
            if (llIIIIIlIllII(Inventory.contains(strArr7) ? 1 : 0)) {
                String[] strArr8 = new String[lllIIlIllI[1]];
                strArr8[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[110]];
                if (llIIIIIlIllII(Inventory.contains(strArr8) ? 1 : 0)) {
                    String[] strArr9 = new String[lllIIlIllI[1]];
                    strArr9[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[111]];
                    if (llIIIIIlIllII(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[lllIIlIllI[1]];
                        strArr10[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[112]];
                        if (llIIIIIlIllII(Inventory.contains(strArr10) ? 1 : 0)) {
                            int[] iArr2 = new int[lllIIlIllI[1]];
                            iArr2[lllIIlIllI[0]] = lllIIlIllI[25];
                            if (llIIIIIlIllII(Inventory.contains(iArr2) ? 1 : 0)) {
                                String[] strArr11 = new String[lllIIlIllI[1]];
                                strArr11[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[113]];
                                if (llIIIIIlIllII(Inventory.contains(strArr11) ? 1 : 0)) {
                                    String[] strArr12 = new String[lllIIlIllI[1]];
                                    strArr12[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[114]];
                                    if (llIIIIIllIIIl(Inventory.getAll(strArr12).size(), lllIIlIllI[13]) && (!llIIIIIlIlllI(Inventory.contains(C0019f.aS) ? 1 : 0) || llIIIIIlIllII(Equipment.contains(C0019f.aS) ? 1 : 0))) {
                                        ?? r02 = lllIIlIllI[1];
                                        "".length();
                                        return (-" ".length()) == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lllIIlIllI[0];
        } else if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[16]) && llIIIIIlIllIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[57])) {
            String[] strArr13 = new String[lllIIlIllI[1]];
            strArr13[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[115]];
            if (llIIIIIlIllII(Inventory.contains(strArr13) ? 1 : 0)) {
                String[] strArr14 = new String[lllIIlIllI[1]];
                strArr14[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[116]];
                if (llIIIIIlIllII(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[lllIIlIllI[1]];
                    strArr15[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[117]];
                    if (llIIIIIlIllII(Inventory.contains(strArr15) ? 1 : 0)) {
                        int[] iArr3 = new int[lllIIlIllI[1]];
                        iArr3[lllIIlIllI[0]] = lllIIlIllI[21];
                        if (llIIIIIlIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllIIlIllI[1]];
                            iArr4[lllIIlIllI[0]] = lllIIlIllI[21];
                            if (llIIIIIllIIIl(Inventory.getAll(iArr4).size(), lllIIlIllI[5]) && (!llIIIIIlIlllI(Inventory.contains(C0019f.aS) ? 1 : 0) || llIIIIIlIllII(Equipment.contains(C0019f.aS) ? 1 : 0))) {
                                ?? r03 = lllIIlIllI[1];
                                "".length();
                                return " ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                            }
                        }
                    }
                }
            }
            return lllIIlIllI[0];
        } else if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[57])) {
            String[] strArr16 = new String[lllIIlIllI[1]];
            strArr16[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[118]];
            if (llIIIIIlIllII(Inventory.contains(strArr16) ? 1 : 0)) {
                String[] strArr17 = new String[lllIIlIllI[1]];
                strArr17[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[119]];
                if (llIIIIIlIllII(Inventory.contains(strArr17) ? 1 : 0)) {
                    String[] strArr18 = new String[lllIIlIllI[1]];
                    strArr18[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[120]];
                    if (llIIIIIlIllII(Inventory.contains(strArr18) ? 1 : 0)) {
                        int[] iArr5 = new int[lllIIlIllI[1]];
                        iArr5[lllIIlIllI[0]] = lllIIlIllI[21];
                        if (llIIIIIlIllII(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lllIIlIllI[1]];
                            iArr6[lllIIlIllI[0]] = lllIIlIllI[21];
                            if (llIIIIIllIIIl(Inventory.getAll(iArr6).size(), lllIIlIllI[13]) && (!llIIIIIlIlllI(Inventory.contains(C0019f.aS) ? 1 : 0) || llIIIIIlIllII(Equipment.contains(C0019f.aS) ? 1 : 0))) {
                                ?? r04 = lllIIlIllI[1];
                                "".length();
                                return (((42 ^ 57) ^ (111 ^ 106)) & (((((48 + 150) - 171) + 142) ^ (((70 + 178) - 120) + 63)) ^ (-" ".length()))) > 0 ? ((52 ^ 20) ^ (67 ^ 59)) & (((26 ^ 79) ^ (202 ^ 199)) ^ (-" ".length())) : r04;
                            }
                        }
                    }
                }
            }
            return lllIIlIllI[0];
        } else {
            return lllIIlIllI[0];
        }
    }

    private static boolean llIIIIIllIIlI(int i, int i2) {
        return i > i2;
    }

    private static String llIIIIIlIlIII(String lllllllllllllllllIlllIlIlIIlllll, String lllllllllllllllllIlllIlIlIIllllI) {
        try {
            SecretKeySpec lllllllllllllllllIlllIlIlIlIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllIlIlIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllIlIlIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllIlIlIlIIIll.init(lllIIlIllI[2], lllllllllllllllllIlllIlIlIlIIlII);
            return new String(lllllllllllllllllIlllIlIlIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllIlIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllIlIlIlIIIlI) {
            lllllllllllllllllIlllIlIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v92, types: [boolean] */
    private static void eI() {
        if (llIIIIIlIllIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[18])) {
            int[] iArr = new int[lllIIlIllI[1]];
            iArr[lllIIlIllI[0]] = lllIIlIllI[42];
            if (llIIIIIlIllll(TileObjects.getNearest(iArr))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[43]];
                if (llIIIIIlIlllI(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    Widget widget = Widgets.get(lllIIlIllI[44], lllIIlIllI[5]);
                    if (llIIIIIlIllll(widget)) {
                        Mouse.click(widget.getChild(lllIIlIllI[9]).getClickPoint().getX(), widget.getChild(lllIIlIllI[9]).getClickPoint().getY(), (boolean) lllIIlIllI[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr2 = new int[lllIIlIllI[1]];
                            iArr2[lllIIlIllI[0]] = lllIIlIllI[47];
                            if (llIIIIIlIllll(TileObjects.getNearest(iArr2))) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[45]);
                        "".length();
                    }
                }
                if (llIIIIIlIllII(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr2 = new int[lllIIlIllI[1]];
                    iArr2[lllIIlIllI[0]] = lllIIlIllI[42];
                    if (llIIIIIlIllll(TileObjects.getNearest(iArr2))) {
                        int[] iArr3 = new int[lllIIlIllI[1]];
                        iArr3[lllIIlIllI[0]] = lllIIlIllI[42];
                        TileObjects.getNearest(iArr3).interact(lllIIlIlIl[lllIIlIllI[46]]);
                        Time.sleepUntil(() -> {
                            if (llIIIIIlIlllI(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return (-" ".length()) > ((109 ^ 73) ^ (79 ^ 111)) ? ((87 ^ 96) ^ (10 ^ 108)) & (((122 ^ 24) ^ (84 ^ 103)) ^ (-" ".length())) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[45]);
                        "".length();
                    }
                }
            }
            int[] iArr4 = new int[lllIIlIllI[1]];
            iArr4[lllIIlIllI[0]] = lllIIlIllI[47];
            if (llIIIIIlIllll(TileObjects.getNearest(iArr4))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[48]];
                if (llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(lllIIlIllI[1]);
                    "".length();
                    int[] iArr5 = new int[lllIIlIllI[1]];
                    iArr5[lllIIlIllI[0]] = lllIIlIllI[47];
                    TileObjects.getNearest(iArr5).interact(lllIIlIlIl[lllIIlIllI[49]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lllIIlIllI[45]);
                    "".length();
                }
                String[] strArr = new String[lllIIlIllI[1]];
                strArr[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[27]];
                C0020g.a(strArr);
            }
        }
        if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[18]) && llIIIIIlIllIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[16]) && llIIIIIlIllII(eN() ? 1 : 0)) {
            int[] iArr6 = new int[lllIIlIllI[1]];
            iArr6[lllIIlIllI[0]] = lllIIlIllI[50];
            if (llIIIIIlIllll(TileObjects.getNearest(iArr6))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[51]];
                if (llIIIIIlIlllI(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    Widget widget2 = Widgets.get(lllIIlIllI[44], lllIIlIllI[5]);
                    if (llIIIIIlIllll(widget2)) {
                        Mouse.click(widget2.getChild(lllIIlIllI[9]).getClickPoint().getX(), widget2.getChild(lllIIlIllI[9]).getClickPoint().getY(), (boolean) lllIIlIllI[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr7 = new int[lllIIlIllI[1]];
                            iArr7[lllIIlIllI[0]] = lllIIlIllI[50];
                            if (llIIIIIlIllll(TileObjects.getNearest(iArr7))) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return (((((85 + 5) - (-19)) + 110) ^ (((127 + 129) - 162) + 50)) & (((4 ^ 36) ^ (77 ^ 38)) ^ (-" ".length()))) != 0 ? ((((101 + 3) - (-12)) + 26) ^ (((15 + 0) - 13) + 184)) & (((119 ^ 69) ^ (141 ^ 139)) ^ (-" ".length())) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[52]);
                        "".length();
                    }
                }
                if (llIIIIIlIllII(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr7 = new int[lllIIlIllI[1]];
                    iArr7[lllIIlIllI[0]] = lllIIlIllI[50];
                    if (llIIIIIlIllll(TileObjects.getNearest(iArr7))) {
                        int[] iArr8 = new int[lllIIlIllI[1]];
                        iArr8[lllIIlIllI[0]] = lllIIlIllI[50];
                        TileObjects.getNearest(iArr8).interact(lllIIlIlIl[lllIIlIllI[53]]);
                        Time.sleepUntil(() -> {
                            if (llIIIIIlIlllI(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return "  ".length() >= (60 ^ 56) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[45]);
                        "".length();
                    }
                }
            }
            int[] iArr9 = new int[lllIIlIllI[1]];
            iArr9[lllIIlIllI[0]] = lllIIlIllI[54];
            if (llIIIIIlIllll(TileObjects.getNearest(iArr9))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[55]];
                if (llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(lllIIlIllI[1]);
                    "".length();
                    int[] iArr10 = new int[lllIIlIllI[1]];
                    iArr10[lllIIlIllI[0]] = lllIIlIllI[54];
                    TileObjects.getNearest(iArr10).interact(lllIIlIlIl[lllIIlIllI[56]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lllIIlIllI[45]);
                    "".length();
                }
                String[] strArr2 = new String[lllIIlIllI[1]];
                strArr2[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[57]];
                C0020g.a(strArr2);
            }
        }
        if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[16]) && llIIIIIlIllIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[57]) && llIIIIIlIllII(eN() ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[58]];
            int[] iArr11 = new int[lllIIlIllI[1]];
            iArr11[lllIIlIllI[0]] = lllIIlIllI[59];
            if (llIIIIIlIllll(TileObjects.getNearest(iArr11))) {
                if (llIIIIIlIlllI(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    Widget widget3 = Widgets.get(lllIIlIllI[44], lllIIlIllI[6]);
                    if (llIIIIIlIllll(widget3)) {
                        Mouse.click(widget3.getChild(lllIIlIllI[5]).getClickPoint().getX(), widget3.getChild(lllIIlIllI[5]).getClickPoint().getY(), (boolean) lllIIlIllI[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr12 = new int[lllIIlIllI[1]];
                            iArr12[lllIIlIllI[0]] = lllIIlIllI[62];
                            if (llIIIIIlIllll(TileObjects.getNearest(iArr12))) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return "   ".length() < (((164 ^ 146) ^ (117 ^ 83)) & (((167 ^ 182) ^ " ".length()) ^ (-" ".length()))) ? ((117 ^ 32) ^ (15 ^ 108)) & (((226 ^ 186) ^ (58 ^ 84)) ^ (-" ".length())) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[60]);
                        "".length();
                    }
                }
                if (llIIIIIlIllII(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr12 = new int[lllIIlIllI[1]];
                    iArr12[lllIIlIllI[0]] = lllIIlIllI[59];
                    if (llIIIIIlIllll(TileObjects.getNearest(iArr12))) {
                        int[] iArr13 = new int[lllIIlIllI[1]];
                        iArr13[lllIIlIllI[0]] = lllIIlIllI[59];
                        TileObjects.getNearest(iArr13).interact(lllIIlIlIl[lllIIlIllI[61]]);
                        Time.sleepUntil(() -> {
                            if (llIIIIIlIlllI(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return (-" ".length()) > 0 ? ((100 ^ 11) ^ (230 ^ 177)) & (((((227 + 65) - 127) + 83) ^ (((57 + 134) - 99) + 100)) ^ (-" ".length())) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[45]);
                        "".length();
                    }
                }
            }
            int[] iArr14 = new int[lllIIlIllI[1]];
            iArr14[lllIIlIllI[0]] = lllIIlIllI[62];
            if (llIIIIIlIllll(TileObjects.getNearest(iArr14))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[63]];
                if (llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(lllIIlIllI[1]);
                    "".length();
                    int[] iArr15 = new int[lllIIlIllI[1]];
                    iArr15[lllIIlIllI[0]] = lllIIlIllI[62];
                    TileObjects.getNearest(iArr15).interact(lllIIlIlIl[lllIIlIllI[64]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lllIIlIllI[45]);
                    "".length();
                }
                String[] strArr3 = new String[lllIIlIllI[1]];
                strArr3[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[65]];
                C0020g.a(strArr3);
            }
        }
        if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[57]) && llIIIIIlIllII(eN() ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[66]];
            int[] iArr16 = new int[lllIIlIllI[1]];
            iArr16[lllIIlIllI[0]] = lllIIlIllI[54];
            if (llIIIIIlIllll(TileObjects.getNearest(iArr16)) && llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                Time.sleepTicks(lllIIlIllI[1]);
                "".length();
                int[] iArr17 = new int[lllIIlIllI[1]];
                iArr17[lllIIlIllI[0]] = lllIIlIllI[54];
                TileObjects.getNearest(iArr17).interact(lllIIlIlIl[lllIIlIllI[67]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, lllIIlIllI[45]);
                "".length();
            }
            int[] iArr18 = new int[lllIIlIllI[1]];
            iArr18[lllIIlIllI[0]] = lllIIlIllI[50];
            if (llIIIIIlIllll(TileObjects.getNearest(iArr18))) {
                if (llIIIIIlIlllI(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    Widget widget4 = Widgets.get(lllIIlIllI[44], lllIIlIllI[6]);
                    if (llIIIIIlIllll(widget4)) {
                        Mouse.click(widget4.getChild(lllIIlIllI[5]).getClickPoint().getX(), widget4.getChild(lllIIlIllI[5]).getClickPoint().getY(), (boolean) lllIIlIllI[1]);
                        Time.sleepUntil(() -> {
                            int[] iArr19 = new int[lllIIlIllI[1]];
                            iArr19[lllIIlIllI[0]] = lllIIlIllI[69];
                            if (llIIIIIlIllll(TileObjects.getNearest(iArr19))) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return " ".length() > "   ".length() ? ((38 ^ 105) ^ (165 ^ 199)) & (((((29 + 198) - 91) + 102) ^ (((153 + 154) - 113) + 1)) ^ (-" ".length())) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[60]);
                        "".length();
                    }
                }
                if (llIIIIIlIllII(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                    int[] iArr19 = new int[lllIIlIllI[1]];
                    iArr19[lllIIlIllI[0]] = lllIIlIllI[50];
                    if (llIIIIIlIllll(TileObjects.getNearest(iArr19))) {
                        int[] iArr20 = new int[lllIIlIllI[1]];
                        iArr20[lllIIlIllI[0]] = lllIIlIllI[50];
                        TileObjects.getNearest(iArr20).interact(lllIIlIlIl[lllIIlIllI[68]]);
                        Time.sleepUntil(() -> {
                            if (llIIIIIlIlllI(Widgets.get(lllIIlIllI[44]).isEmpty() ? 1 : 0)) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[45]);
                        "".length();
                    }
                }
            }
            int[] iArr21 = new int[lllIIlIllI[1]];
            iArr21[lllIIlIllI[0]] = lllIIlIllI[69];
            if (llIIIIIlIllll(TileObjects.getNearest(iArr21))) {
                AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[70]];
                if (llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                    Time.sleepTicks(lllIIlIllI[1]);
                    "".length();
                    int[] iArr22 = new int[lllIIlIllI[1]];
                    iArr22[lllIIlIllI[0]] = lllIIlIllI[69];
                    TileObjects.getNearest(iArr22).interact(lllIIlIlIl[lllIIlIllI[71]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lllIIlIllI[45]);
                    "".length();
                }
                String[] strArr4 = new String[lllIIlIllI[1]];
                strArr4[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[72]];
                C0020g.a(strArr4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    static boolean eM() {
        int[] iArr = new int[lllIIlIllI[1]];
        iArr[lllIIlIllI[0]] = lllIIlIllI[101];
        if (llIIIIIlIllll(TileObjects.getNearest(iArr))) {
            ?? r0 = lllIIlIllI[1];
            "".length();
            return !(true ^ true) ? (true ^ true) & (true ^ true) : r0;
        }
        return lllIIlIllI[0];
    }

    private static void llIIIIIlIlIll() {
        lllIIlIllI = new int[143];
        lllIIlIllI[0] = (212 ^ 133) & ((104 ^ 57) ^ (-1));
        lllIIlIllI[1] = " ".length();
        lllIIlIllI[2] = "  ".length();
        lllIIlIllI[3] = "   ".length();
        lllIIlIllI[4] = (-((-4871) & 24327)) & (-4740) & 32695;
        lllIIlIllI[5] = 21 ^ 17;
        lllIIlIllI[6] = (((63 + 96) - 78) + 104) ^ (((98 + 101) - 118) + 107);
        lllIIlIllI[7] = (-2131) & 7130;
        lllIIlIllI[8] = (-((-3729) & 28309)) & (-4161) & 31740;
        lllIIlIllI[9] = 137 ^ 143;
        lllIIlIllI[10] = (-(196 ^ 194)) & (-5281) & 14079;
        lllIIlIllI[11] = 188 ^ 187;
        lllIIlIllI[12] = (-22081) & 24427;
        lllIIlIllI[13] = 91 ^ 83;
        lllIIlIllI[14] = (-((-21575) & 29895)) & (-49) & 16381;
        lllIIlIllI[15] = (121 ^ 34) ^ (106 ^ 56);
        lllIIlIllI[16] = (50 ^ 21) ^ (18 ^ 34);
        lllIIlIllI[17] = (-((-13921) & 16233)) & (-16418) & 23549;
        lllIIlIllI[18] = 121 ^ 115;
        lllIIlIllI[19] = (-11326) & 12285;
        lllIIlIllI[20] = 147 ^ 152;
        lllIIlIllI[21] = (-((-9311) & 27903)) & (-5398) & 32767;
        lllIIlIllI[22] = 90 ^ 86;
        lllIIlIllI[23] = (-31745) & 32744;
        lllIIlIllI[24] = (-((-16411) & 22235)) & (-10260) & 16383;
        lllIIlIllI[25] = (-((-10313) & 30793)) & (-8221) & 29695;
        lllIIlIllI[26] = (-((-29071) & 31647)) & (-4102) & 31677;
        lllIIlIllI[27] = (25 ^ 61) ^ (123 ^ 67);
        lllIIlIllI[28] = (-((-18993) & 31287)) & (-1537) & 16382;
        lllIIlIllI[29] = 82 ^ 95;
        lllIIlIllI[30] = (((16 + 111) - (-9)) + 17) ^ (((85 + 134) - 188) + 120);
        lllIIlIllI[31] = (-((-390) & 25999)) & (-4113) & 30459;
        lllIIlIllI[32] = 206 ^ 193;
        lllIIlIllI[33] = (25 ^ 33) ^ (112 ^ 88);
        lllIIlIllI[34] = 209 ^ 192;
        lllIIlIllI[35] = (-394) & 15871;
        lllIIlIllI[36] = (120 ^ 98) ^ (0 ^ 8);
        lllIIlIllI[37] = 57 ^ 42;
        lllIIlIllI[38] = (-24593) & 29117;
        lllIIlIllI[39] = 44 ^ 56;
        lllIIlIllI[40] = 160 ^ 181;
        lllIIlIllI[41] = "   ".length() ^ (26 ^ 15);
        lllIIlIllI[42] = (-((-101) & 8815)) & (-18497) & 31727;
        lllIIlIllI[43] = (89 ^ 34) ^ (241 ^ 146);
        lllIIlIllI[44] = (-14353) & 14810;
        lllIIlIllI[45] = (-28162) & 32661;
        lllIIlIllI[46] = 99 ^ 122;
        lllIIlIllI[47] = (-((-3081) & 28059)) & (-1030) & 32759;
        lllIIlIllI[48] = 174 ^ 180;
        lllIIlIllI[49] = 30 ^ 5;
        lllIIlIllI[50] = (-17153) & 32555;
        lllIIlIllI[51] = 41 ^ 52;
        lllIIlIllI[52] = (-((-1290) & 24491)) & (-1) & 32701;
        lllIIlIllI[53] = 127 ^ 97;
        lllIIlIllI[54] = (-"   ".length()) & (-16641) & 30207;
        lllIIlIllI[55] = 180 ^ 171;
        lllIIlIllI[56] = (((73 + 109) - 107) + 102) ^ (((46 + 69) - 83) + 113);
        lllIIlIllI[57] = 230 ^ 199;
        lllIIlIllI[58] = 169 ^ 139;
        lllIIlIllI[59] = (-(14 ^ 47)) & (-16385) & 31715;
        lllIIlIllI[60] = (-((-7937) & 32650)) & (-3) & 31215;
        lllIIlIllI[61] = 109 ^ 78;
        lllIIlIllI[62] = (-((-8509) & 27967)) & (-1) & 32759;
        lllIIlIllI[63] = (135 ^ 190) ^ (174 ^ 179);
        lllIIlIllI[64] = (((92 + 159) - 166) + 80) ^ (((63 + 64) - 90) + 91);
        lllIIlIllI[65] = 43 ^ 13;
        lllIIlIllI[66] = (((27 + 107) - 128) + 125) ^ (((156 + 30) - 95) + 73);
        lllIIlIllI[67] = 234 ^ 194;
        lllIIlIllI[68] = (((145 + 80) - 208) + 164) ^ (((89 + 79) - 110) + 98);
        lllIIlIllI[69] = (-((-5839) & 22223)) & (-514) & 30463;
        lllIIlIllI[70] = (37 ^ 12) ^ "   ".length();
        lllIIlIllI[71] = 52 ^ 31;
        lllIIlIllI[72] = 128 ^ 172;
        lllIIlIllI[73] = (((75 + 150) - 130) + 76) ^ (((29 + 87) - 79) + 97);
        lllIIlIllI[74] = (((67 ^ 106) + (((70 + 59) - 40) + 75)) - (124 ^ 32)) + (209 ^ 178);
        lllIIlIllI[75] = (-30730) & 31151;
        lllIIlIllI[76] = 108 ^ 24;
        lllIIlIllI[77] = 87 ^ 121;
        lllIIlIllI[78] = (-17038) & 17407;
        lllIIlIllI[79] = (((72 + 85) - 152) + 162) ^ (((27 + 49) - 55) + 115);
        lllIIlIllI[80] = 109 ^ 44;
        lllIIlIllI[81] = (74 ^ 31) ^ (54 ^ 83);
        lllIIlIllI[82] = 201 ^ 146;
        lllIIlIllI[83] = 48 ^ 1;
        lllIIlIllI[84] = 44 ^ 30;
        lllIIlIllI[85] = 70 ^ 117;
        lllIIlIllI[86] = (35 ^ 91) ^ (255 ^ 185);
        lllIIlIllI[87] = 79 ^ 123;
        lllIIlIllI[88] = (45 ^ 40) ^ (246 ^ 198);
        lllIIlIllI[89] = (172 ^ 188) ^ (16 ^ 54);
        lllIIlIllI[90] = (76 ^ 120) ^ "   ".length();
        lllIIlIllI[91] = (243 ^ 166) ^ (65 ^ 44);
        lllIIlIllI[92] = 228 ^ 183;
        lllIIlIllI[93] = 13 ^ 52;
        lllIIlIllI[94] = (124 ^ 48) ^ (217 ^ 175);
        lllIIlIllI[95] = 154 ^ 161;
        lllIIlIllI[96] = 44 ^ 16;
        lllIIlIllI[97] = 148 ^ 169;
        lllIIlIllI[98] = (((67 + 41) - (-34)) + 28) ^ (((55 + 63) - 47) + 78);
        lllIIlIllI[99] = (((74 + 120) - 167) + 108) ^ (((112 + 143) - 243) + 187);
        lllIIlIllI[100] = (-5) & 15405;
        lllIIlIllI[101] = (-16443) & 31743;
        lllIIlIllI[102] = (-1046) & 16343;
        lllIIlIllI[103] = (-((-27187) & 28535)) & (-24636) & 28159;
        lllIIlIllI[104] = (((48 + 6) - (-55)) + 21) ^ (((44 + 34) - (-63)) + 51);
        lllIIlIllI[105] = 29 ^ 94;
        lllIIlIllI[106] = 214 ^ 146;
        lllIIlIllI[107] = (217 ^ 155) ^ (33 ^ 38);
        lllIIlIllI[108] = 74 ^ 12;
        lllIIlIllI[109] = (26 ^ 86) ^ (32 ^ 43);
        lllIIlIllI[110] = (16 ^ 104) ^ (27 ^ 43);
        lllIIlIllI[111] = 30 ^ 87;
        lllIIlIllI[112] = (69 ^ 54) ^ (110 ^ 87);
        lllIIlIllI[113] = (((165 + 168) - 320) + 183) ^ (((106 + 123) - 216) + 130);
        lllIIlIllI[114] = 33 ^ 109;
        lllIIlIllI[115] = (((157 + 78) - 189) + 152) ^ (((18 + 35) - (-69)) + 17);
        lllIIlIllI[116] = 216 ^ 150;
        lllIIlIllI[117] = "   ".length() ^ (88 ^ 20);
        lllIIlIllI[118] = 19 ^ 67;
        lllIIlIllI[119] = (8 ^ 72) ^ (11 ^ 26);
        lllIIlIllI[120] = 54 ^ 100;
        lllIIlIllI[121] = (-((-1282) & 26003)) & (-3689) & 28669;
        lllIIlIllI[122] = (-((-7505) & 16211)) & (-3073) & 12218;
        lllIIlIllI[123] = (-((-146) & 23743)) & (-1) & 24063;
        lllIIlIllI[124] = (-((-19953) & 24572)) & (-2049) & 7167;
        lllIIlIllI[125] = (-10403) & 10982;
        lllIIlIllI[126] = ((122 + 108) - (-4)) + 16;
        lllIIlIllI[127] = (-21843) & 22522;
        lllIIlIllI[128] = (-((-10513) & 27038)) & (-2083) & 24047;
        lllIIlIllI[129] = (-10277) & 12276;
        lllIIlIllI[130] = (-16388) & 28367;
        lllIIlIllI[131] = (-8353) & 16359;
        lllIIlIllI[132] = (-57) & 956;
        lllIIlIllI[133] = (180 ^ 150) ^ (246 ^ 176);
        lllIIlIllI[134] = 105 ^ 10;
        lllIIlIllI[135] = 226 ^ 182;
        lllIIlIllI[136] = 84 ^ 1;
        lllIIlIllI[137] = (170 ^ 193) ^ (87 ^ 106);
        lllIIlIllI[138] = (-852) & 4091;
        lllIIlIllI[139] = (-((-24485) & 32749)) & (-20994) & 32731;
        lllIIlIllI[140] = (((18 + 7) - 6) + 197) ^ (((16 + 116) - 79) + 90);
        lllIIlIllI[141] = (61 ^ 124) ^ (72 ^ 81);
        lllIIlIllI[142] = 254 ^ 167;
    }

    private static void eJ() {
        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[73]];
        if (llIIIIIlIlllI(eL() ? 1 : 0)) {
            if (llIIIIIlIllII(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            if (llIIIIIlIllII(Widgets.get(lllIIlIllI[74]).isEmpty() ? 1 : 0) && llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                if (llIIIIIllIlII(Widgets.get(lllIIlIllI[75], lllIIlIllI[6]))) {
                    if (llIIIIIlIllll(Widgets.get(lllIIlIllI[76], lllIIlIllI[55]))) {
                        Widgets.get(lllIIlIllI[76], lllIIlIllI[55]).interact(lllIIlIlIl[lllIIlIllI[77]]);
                        Time.sleepTicks(lllIIlIllI[2]);
                        "".length();
                    }
                    if (llIIIIIlIllll(Widgets.get(lllIIlIllI[78], lllIIlIllI[1]))) {
                        Widgets.get(lllIIlIllI[78], lllIIlIllI[1]).interact(lllIIlIlIl[lllIIlIllI[79]]);
                        Time.sleepTicks(lllIIlIllI[5]);
                        "".length();
                    }
                }
                if (llIIIIIlIllll(Widgets.get(lllIIlIllI[75], lllIIlIllI[6]))) {
                    Widget widget = Widgets.get(lllIIlIllI[75], lllIIlIllI[80]);
                    String[] strArr = new String[lllIIlIllI[1]];
                    strArr[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[81]];
                    if (llIIIIIlIlllI(widget.hasAction(strArr) ? 1 : 0)) {
                        Widgets.get(lllIIlIllI[75], lllIIlIllI[6]).getChild(lllIIlIllI[82]).interact(lllIIlIlIl[lllIIlIllI[83]]);
                        Time.sleepTicks(lllIIlIllI[3]);
                        "".length();
                    }
                }
            }
            if (llIIIIIlIlllI(Widgets.get(lllIIlIllI[74]).isEmpty() ? 1 : 0) && llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get(lllIIlIllI[74], lllIIlIllI[15]).interact(lllIIlIlIl[lllIIlIllI[84]]);
                Time.sleepTicks(lllIIlIllI[6]);
                "".length();
            }
            if (llIIIIIlIllll(Widgets.get(lllIIlIllI[75], lllIIlIllI[6]))) {
                Widget widget2 = Widgets.get(lllIIlIllI[75], lllIIlIllI[80]);
                String[] strArr2 = new String[lllIIlIllI[1]];
                strArr2[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[85]];
                if (llIIIIIlIllII(widget2.hasAction(strArr2) ? 1 : 0)) {
                    Widgets.get(lllIIlIllI[75], lllIIlIllI[86]).interact(lllIIlIlIl[lllIIlIllI[87]]);
                    Time.sleepTicks(lllIIlIllI[2]);
                    "".length();
                    Widgets.get(lllIIlIllI[75], lllIIlIllI[80]).interact(lllIIlIlIl[lllIIlIllI[88]]);
                    Time.sleepTicks(lllIIlIllI[3]);
                    "".length();
                }
            }
        }
        if (llIIIIIlIlllI(eM() ? 1 : 0) && llIIIIIlIllII(eL() ? 1 : 0)) {
            if (llIIIIIlIllII(Widgets.get(lllIIlIllI[74]).isEmpty() ? 1 : 0) && llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                if (llIIIIIllIlII(Widgets.get(lllIIlIllI[75], lllIIlIllI[6]))) {
                    if (llIIIIIlIllll(Widgets.get(lllIIlIllI[76], lllIIlIllI[55]))) {
                        Widgets.get(lllIIlIllI[76], lllIIlIllI[55]).interact(lllIIlIlIl[lllIIlIllI[89]]);
                        Time.sleepTicks(lllIIlIllI[2]);
                        "".length();
                    }
                    if (llIIIIIlIllll(Widgets.get(lllIIlIllI[78], lllIIlIllI[1]))) {
                        Widgets.get(lllIIlIllI[78], lllIIlIllI[1]).interact(lllIIlIlIl[lllIIlIllI[90]]);
                        Time.sleepTicks(lllIIlIllI[5]);
                        "".length();
                    }
                }
                if (llIIIIIlIllll(Widgets.get(lllIIlIllI[75], lllIIlIllI[6]))) {
                    Widget widget3 = Widgets.get(lllIIlIllI[75], lllIIlIllI[80]);
                    String[] strArr3 = new String[lllIIlIllI[1]];
                    strArr3[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[91]];
                    if (llIIIIIlIlllI(widget3.hasAction(strArr3) ? 1 : 0)) {
                        Widgets.get(lllIIlIllI[75], lllIIlIllI[6]).getChild(lllIIlIllI[92]).interact(lllIIlIlIl[lllIIlIllI[93]]);
                        Time.sleepTicks(lllIIlIllI[3]);
                        "".length();
                    }
                }
            }
            if (llIIIIIlIlllI(Widgets.get(lllIIlIllI[74]).isEmpty() ? 1 : 0) && llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                Widgets.get(lllIIlIllI[74], lllIIlIllI[20]).interact(lllIIlIlIl[lllIIlIllI[94]]);
                Time.sleepTicks(lllIIlIllI[6]);
                "".length();
            }
            if (llIIIIIlIllll(Widgets.get(lllIIlIllI[75], lllIIlIllI[6]))) {
                Widget widget4 = Widgets.get(lllIIlIllI[75], lllIIlIllI[80]);
                String[] strArr4 = new String[lllIIlIllI[1]];
                strArr4[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[95]];
                if (llIIIIIlIllII(widget4.hasAction(strArr4) ? 1 : 0)) {
                    Widgets.get(lllIIlIllI[75], lllIIlIllI[86]).interact(lllIIlIlIl[lllIIlIllI[96]]);
                    Time.sleepTicks(lllIIlIllI[2]);
                    "".length();
                    Widgets.get(lllIIlIllI[75], lllIIlIllI[80]).interact(lllIIlIlIl[lllIIlIllI[97]]);
                    Time.sleepTicks(lllIIlIllI[3]);
                    "".length();
                }
            }
        }
        String[] strArr5 = new String[lllIIlIllI[1]];
        strArr5[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[86]];
        C0020g.a(strArr5);
    }

    private static boolean llIIIIIlIlllI(int i) {
        return i == 0;
    }

    private static boolean llIIIIIlIllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0101, code lost:
        if (llIIIIIlIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aw.lllIIlIllI[121(0x79, float:1.7E-43)]) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019c, code lost:
        if (llIIIIIlIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aw.lllIIlIllI[121(0x79, float:1.7E-43)]) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0225, code lost:
        if (llIIIIIlIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aw.lllIIlIllI[67]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
        if (llIIIIIlIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aw.lllIIlIllI[67]) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (llIIIIIlIllIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[16])) {
            int[] iArr5 = new int[lllIIlIllI[1]];
            iArr5[lllIIlIllI[0]] = lllIIlIllI[19];
            if (llIIIIIlIllII(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIIlIllI[1]];
                iArr6[lllIIlIllI[0]] = lllIIlIllI[19];
                if (llIIIIIlIllII(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[lllIIlIllI[1]];
                    iArr7[lllIIlIllI[0]] = lllIIlIllI[19];
                }
                iArr4 = new int[lllIIlIllI[1]];
                iArr4[lllIIlIllI[0]] = lllIIlIllI[17];
                if (llIIIIIlIllII(Bank.contains(iArr4) ? 1 : 0)) {
                    int[] iArr8 = new int[lllIIlIllI[1]];
                    iArr8[lllIIlIllI[0]] = lllIIlIllI[17];
                    if (llIIIIIlIllII(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lllIIlIllI[1]];
                        iArr9[lllIIlIllI[0]] = lllIIlIllI[17];
                    }
                }
                bv.add(new C0017d(lllIIlIllI[17], lllIIlIllI[23], lllIIlIllI[67]));
                "".length();
            }
            bv.add(new C0017d(lllIIlIllI[19], lllIIlIllI[121], C0018e.c(lllIIlIllI[122], lllIIlIllI[123])));
            "".length();
            iArr4 = new int[lllIIlIllI[1]];
            iArr4[lllIIlIllI[0]] = lllIIlIllI[17];
            if (llIIIIIlIllII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bv.add(new C0017d(lllIIlIllI[17], lllIIlIllI[23], lllIIlIllI[67]));
            "".length();
        }
        if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[16])) {
            int[] iArr10 = new int[lllIIlIllI[1]];
            iArr10[lllIIlIllI[0]] = lllIIlIllI[21];
            if (llIIIIIlIllII(Bank.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lllIIlIllI[1]];
                iArr11[lllIIlIllI[0]] = lllIIlIllI[21];
                if (llIIIIIlIllII(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIIlIllI[1]];
                    iArr12[lllIIlIllI[0]] = lllIIlIllI[21];
                }
            }
            bv.add(new C0017d(lllIIlIllI[21], lllIIlIllI[124], lllIIlIllI[125]));
            "".length();
        }
        int[] iArr13 = new int[lllIIlIllI[1]];
        iArr13[lllIIlIllI[0]] = lllIIlIllI[14];
        if (llIIIIIlIllII(Bank.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllIIlIllI[1]];
            iArr14[lllIIlIllI[0]] = lllIIlIllI[14];
            if (llIIIIIlIllII(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lllIIlIllI[1]];
                iArr15[lllIIlIllI[0]] = lllIIlIllI[14];
            }
            iArr = new int[lllIIlIllI[1]];
            iArr[lllIIlIllI[0]] = lllIIlIllI[12];
            if (llIIIIIlIlllI(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(lllIIlIllI[12], lllIIlIllI[1], lllIIlIllI[128]));
                "".length();
            }
            iArr2 = new int[lllIIlIllI[1]];
            iArr2[lllIIlIllI[0]] = lllIIlIllI[10];
            if (llIIIIIlIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(lllIIlIllI[10], lllIIlIllI[1], lllIIlIllI[128]));
                "".length();
            }
            if (llIIIIIlIlllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lllIIlIlIl[lllIIlIllI[136]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(lllIIlIllI[28], lllIIlIllI[39], lllIIlIllI[129]));
                "".length();
            }
            if (llIIIIIlIlllI(Bank.contains(item2 -> {
                return item2.getName().toLowerCase().contains(lllIIlIlIl[lllIIlIllI[135]]);
            }) ? 1 : 0)) {
                bv.add(new C0017d(lllIIlIllI[130], lllIIlIllI[2], lllIIlIllI[26]));
                "".length();
            }
            iArr3 = new int[lllIIlIllI[1]];
            iArr3[lllIIlIllI[0]] = lllIIlIllI[131];
            if (llIIIIIlIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                return;
            }
            bv.add(new C0017d(lllIIlIllI[131], lllIIlIllI[67], lllIIlIllI[132]));
            "".length();
            return;
        }
        bv.add(new C0017d(lllIIlIllI[14], lllIIlIllI[126], lllIIlIllI[127]));
        "".length();
        iArr = new int[lllIIlIllI[1]];
        iArr[lllIIlIllI[0]] = lllIIlIllI[12];
        if (llIIIIIlIlllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lllIIlIllI[1]];
        iArr2[lllIIlIllI[0]] = lllIIlIllI[10];
        if (llIIIIIlIlllI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        if (llIIIIIlIlllI(Bank.contains(item3 -> {
            return item3.getName().toLowerCase().contains(lllIIlIlIl[lllIIlIllI[136]]);
        }) ? 1 : 0)) {
        }
        if (llIIIIIlIlllI(Bank.contains(item22 -> {
            return item22.getName().toLowerCase().contains(lllIIlIlIl[lllIIlIllI[135]]);
        }) ? 1 : 0)) {
        }
        iArr3 = new int[lllIIlIllI[1]];
        iArr3[lllIIlIllI[0]] = lllIIlIllI[131];
        if (llIIIIIlIlllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean llIIIIIllIIII(int i) {
        return i > 0;
    }

    private static boolean llIIIIIllIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIIIllIIIl(int i, int i2) {
        return i >= i2;
    }

    private static String llIIIIIlIlIIl(String lllllllllllllllllIlllIlIllIIIIll, String lllllllllllllllllIlllIlIllIIIIlI) {
        String lllllllllllllllllIlllIlIllIIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlllIlIllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIlllIlIllIIIIII = lllllllllllllllllIlllIlIllIIIIlI.toCharArray();
        int lllllllllllllllllIlllIlIlIllllll = lllIIlIllI[0];
        char[] charArray = lllllllllllllllllIlllIlIllIIIIll2.toCharArray();
        int length = charArray.length;
        int i = lllIIlIllI[0];
        while (llIIIIIlIllIl(i, length)) {
            char lllllllllllllllllIlllIlIlIllIllI = charArray[i];
            sb.append((char) (lllllllllllllllllIlllIlIlIllIllI ^ lllllllllllllllllIlllIlIllIIIIII[lllllllllllllllllIlllIlIlIllllll % lllllllllllllllllIlllIlIllIIIIII.length]));
            "".length();
            lllllllllllllllllIlllIlIlIllllll++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lllIIlIlIl[lllIIlIllI[92]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private static boolean eO() {
        if (llIIIIIllIlIl(Vars.getBit(lllIIlIllI[103]), lllIIlIllI[1])) {
            ?? r0 = lllIIlIllI[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIIlIllI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    static boolean eN() {
        int[] iArr = new int[lllIIlIllI[1]];
        iArr[lllIIlIllI[0]] = lllIIlIllI[100];
        if (llIIIIIlIllll(TileObjects.getNearest(iArr))) {
            int[] iArr2 = new int[lllIIlIllI[1]];
            iArr2[lllIIlIllI[0]] = lllIIlIllI[102];
            if (llIIIIIlIllll(TileObjects.getNearest(iArr2))) {
                ?? r0 = lllIIlIllI[1];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lllIIlIllI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0374, code lost:
        if (llIIIIIlIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aw.lllIIlIllI[13]) != false) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v204, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v228, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v231, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v239, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v242, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v245, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v248, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v298, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void eH() {
        if (llIIIIIlIllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[0]];
            C0015b.a(bv);
            if (llIIIIIlIllIl(bv.size(), lllIIlIllI[1])) {
                System.out.println(lllIIlIlIl[lllIIlIllI[1]]);
                bt = lllIIlIllI[0];
            }
        }
        if (llIIIIIlIlllI(bt ? 1 : 0)) {
            if (llIIIIIlIlllI(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIIIlIllll(nearest) && llIIIIIlIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[2]];
                    if (llIIIIIlIllII(Equipment.contains(C0019f.aS) ? 1 : 0)) {
                        Equipment.getFirst(C0019f.aS).interact(lllIIlIlIl[lllIIlIllI[3]]);
                        Time.sleepUntil(() -> {
                            int[] iArr = new int[lllIIlIllI[1]];
                            iArr[lllIIlIllI[0]] = lllIIlIllI[38];
                            if (llIIIIIllIlII(TileObjects.getNearest(iArr))) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[4]);
                        "".length();
                    }
                    if (llIIIIIlIlllI(Equipment.contains(C0019f.aS) ? 1 : 0) && llIIIIIlIllII(Inventory.contains(C0019f.aS) ? 1 : 0)) {
                        Inventory.getFirst(C0019f.aS).interact(lllIIlIlIl[lllIIlIllI[5]]);
                    }
                    if (llIIIIIlIlllI(Equipment.contains(C0019f.aS) ? 1 : 0) && llIIIIIlIlllI(Inventory.contains(C0019f.aS) ? 1 : 0)) {
                        C0000a.a(nearest);
                        Time.sleepTicks(lllIIlIllI[1]);
                        "".length();
                    }
                }
                if (llIIIIIlIllll(nearest) && llIIIIIlIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[6]];
                    if (llIIIIIlIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIlIllI[7]);
                        "".length();
                    }
                    if (llIIIIIlIllII(Bank.isOpen() ? 1 : 0) && llIIIIIllIIII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepUntil(() -> {
                            if (llIIIIIlIlllI(Inventory.getAll().size())) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (false ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[8]);
                        "".length();
                        Time.sleepTicks(lllIIlIllI[1]);
                        "".length();
                    }
                    if (llIIIIIlIlllI(Bank.contains(item -> {
                        return item.getName().toLowerCase().contains(lllIIlIlIl[lllIIlIllI[137]]);
                    }) ? 1 : 0)) {
                        Q();
                        System.out.println(lllIIlIlIl[lllIIlIllI[9]]);
                        bt = lllIIlIllI[1];
                        return;
                    }
                    int[] iArr = new int[lllIIlIllI[1]];
                    iArr[lllIIlIllI[0]] = lllIIlIllI[10];
                    if (llIIIIIlIlllI(Bank.contains(iArr) ? 1 : 0)) {
                        Q();
                        System.out.println(lllIIlIlIl[lllIIlIllI[11]]);
                        bt = lllIIlIllI[1];
                        return;
                    }
                    int[] iArr2 = new int[lllIIlIllI[1]];
                    iArr2[lllIIlIllI[0]] = lllIIlIllI[12];
                    if (llIIIIIlIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                        Q();
                        System.out.println(lllIIlIlIl[lllIIlIllI[13]]);
                        bt = lllIIlIllI[1];
                        return;
                    }
                    int[] iArr3 = new int[lllIIlIllI[1]];
                    iArr3[lllIIlIllI[0]] = lllIIlIllI[14];
                    if (llIIIIIlIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIIlIllI[1]];
                        iArr4[lllIIlIllI[0]] = lllIIlIllI[14];
                        if (llIIIIIlIlllI(Inventory.contains(iArr4) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIlIlIl[lllIIlIllI[15]]);
                            bt = lllIIlIllI[1];
                            return;
                        }
                    }
                    if (llIIIIIlIllIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[16])) {
                        int[] iArr5 = new int[lllIIlIllI[1]];
                        iArr5[lllIIlIllI[0]] = lllIIlIllI[17];
                        if (llIIIIIlIlllI(Bank.contains(iArr5) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIlIlIl[lllIIlIllI[18]]);
                            bt = lllIIlIllI[1];
                            return;
                        }
                        int[] iArr6 = new int[lllIIlIllI[1]];
                        iArr6[lllIIlIllI[0]] = lllIIlIllI[19];
                        if (llIIIIIlIlllI(Bank.contains(iArr6) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIlIlIl[lllIIlIllI[20]]);
                            bt = lllIIlIllI[1];
                            return;
                        }
                    }
                    if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[16])) {
                        int[] iArr7 = new int[lllIIlIllI[1]];
                        iArr7[lllIIlIllI[0]] = lllIIlIllI[21];
                        if (llIIIIIlIllII(Bank.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lllIIlIllI[1]];
                            iArr8[lllIIlIllI[0]] = lllIIlIllI[21];
                            if (llIIIIIlIllII(Bank.contains(iArr8) ? 1 : 0)) {
                                int[] iArr9 = new int[lllIIlIllI[1]];
                                iArr9[lllIIlIllI[0]] = lllIIlIllI[21];
                            }
                        }
                        Q();
                        System.out.println(lllIIlIlIl[lllIIlIllI[22]]);
                        bt = lllIIlIllI[1];
                        return;
                    }
                    if (llIIIIIlIlllI(Equipment.contains(C0019f.aS) ? 1 : 0) && llIIIIIlIlllI(Inventory.contains(C0019f.aS) ? 1 : 0)) {
                        C0000a.b(C0019f.aS, lllIIlIllI[1]);
                        Time.sleepTicks(lllIIlIllI[1]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr10 = new int[lllIIlIllI[1]];
                            iArr10[lllIIlIllI[0]] = lllIIlIllI[28];
                            if (llIIIIIllIIII(Inventory.getCount(iArr10))) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return " ".length() != " ".length() ? ((((76 + 60) - 122) + 114) ^ (((40 + 127) - 8) + 38)) & (((26 ^ 82) ^ (131 ^ 142)) ^ (-" ".length())) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[7]);
                        "".length();
                    }
                    if (llIIIIIlIllIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[16])) {
                        C0000a.a(lllIIlIllI[17], lllIIlIllI[23]);
                        C0000a.a(lllIIlIllI[14], lllIIlIllI[24]);
                        C0000a.a(lllIIlIllI[10], lllIIlIllI[1]);
                        C0000a.a(lllIIlIllI[12], lllIIlIllI[1]);
                        C0000a.a(lllIIlIllI[25], lllIIlIllI[26]);
                        C0000a.a(lllIIlIllI[19], lllIIlIllI[27]);
                    }
                    if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[16])) {
                        C0000a.a(lllIIlIllI[14], lllIIlIllI[24]);
                        C0000a.a(lllIIlIllI[10], lllIIlIllI[1]);
                        C0000a.a(lllIIlIllI[12], lllIIlIllI[1]);
                        C0000a.a(lllIIlIllI[21], lllIIlIllI[27]);
                    }
                }
            }
            if (llIIIIIlIllII(an() ? 1 : 0)) {
                int[] iArr10 = new int[lllIIlIllI[1]];
                iArr10[lllIIlIllI[0]] = lllIIlIllI[28];
                if (llIIIIIlIllII(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lllIIlIllI[1]];
                    iArr11[lllIIlIllI[0]] = lllIIlIllI[28];
                    if (llIIIIIlIlllI(Equipment.contains(iArr11) ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[29]];
                        Bank.close();
                        Time.sleepTicks(lllIIlIllI[1]);
                        "".length();
                        int[] iArr12 = new int[lllIIlIllI[1]];
                        iArr12[lllIIlIllI[0]] = lllIIlIllI[28];
                        Item first = Inventory.getFirst(iArr12);
                        if (llIIIIIlIllll(first)) {
                            first.interact(lllIIlIlIl[lllIIlIllI[30]]);
                            Time.sleepTicks(lllIIlIllI[3]);
                            "".length();
                        }
                    }
                }
                if (llIIIIIlIllIl(C0018e.j(lllIIlIllI[31]), lllIIlIllI[1])) {
                    if (llIIIIIlIllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    if (llIIIIIllIIlI(Players.getLocal().getWorldLocation().distanceTo(oz), lllIIlIllI[2]) && llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[32]];
                        Movement.walkTo(oz);
                        "".length();
                        Time.sleepTicks(lllIIlIllI[1]);
                        "".length();
                    }
                    if (llIIIIIllIIll(Players.getLocal().getWorldLocation().distanceTo(oz), lllIIlIllI[3])) {
                        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[33]];
                        C0020g.a(lllIIlIlIl[lllIIlIllI[34]], cE);
                    }
                }
                if (llIIIIIllIIII(C0018e.j(lllIIlIllI[31]))) {
                    int[] iArr13 = new int[lllIIlIllI[1]];
                    iArr13[lllIIlIllI[0]] = lllIIlIllI[35];
                    if (llIIIIIlIllll(TileObjects.getNearest(iArr13))) {
                        AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[36]];
                        int[] iArr14 = new int[lllIIlIllI[1]];
                        iArr14[lllIIlIllI[0]] = lllIIlIllI[35];
                        TileObjects.getNearest(iArr14).interact(lllIIlIlIl[lllIIlIllI[37]]);
                        Time.sleepUntil(() -> {
                            int[] iArr15 = new int[lllIIlIllI[1]];
                            iArr15[lllIIlIllI[0]] = lllIIlIllI[38];
                            if (llIIIIIlIllll(TileObjects.getNearest(iArr15))) {
                                ?? r0 = lllIIlIllI[1];
                                "".length();
                                return 0 != 0 ? ((((127 + 112) - 74) + 5) ^ (((86 + 73) - 156) + 164)) & (((46 ^ 2) ^ (126 ^ 95)) ^ (-" ".length())) : r0;
                            }
                            return lllIIlIllI[0];
                        }, lllIIlIllI[4]);
                        "".length();
                    }
                    int[] iArr15 = new int[lllIIlIllI[1]];
                    iArr15[lllIIlIllI[0]] = lllIIlIllI[38];
                    if (llIIIIIllIlII(TileObjects.getNearest(iArr15))) {
                        int[] iArr16 = new int[lllIIlIllI[1]];
                        iArr16[lllIIlIllI[0]] = lllIIlIllI[35];
                        if (llIIIIIllIlII(TileObjects.getNearest(iArr16))) {
                            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[39]];
                            Bank.close();
                            int[] iArr17 = new int[lllIIlIllI[1]];
                            iArr17[lllIIlIllI[0]] = lllIIlIllI[14];
                            Inventory.getFirst(iArr17).interact(lllIIlIlIl[lllIIlIllI[40]]);
                            Time.sleepUntil(() -> {
                                int[] iArr18 = new int[lllIIlIllI[1]];
                                iArr18[lllIIlIllI[0]] = lllIIlIllI[38];
                                if (llIIIIIlIllll(TileObjects.getNearest(iArr18))) {
                                    ?? r0 = lllIIlIllI[1];
                                    "".length();
                                    return ((127 ^ 111) ^ (130 ^ 150)) <= (-" ".length()) ? ((223 ^ 190) ^ (190 ^ 152)) & (((((35 + 49) - (-10)) + 117) ^ (((106 + 132) - 236) + 146)) ^ (-" ".length())) : r0;
                                }
                                return lllIIlIllI[0];
                            }, lllIIlIllI[4]);
                            "".length();
                            Time.sleepTicks(lllIIlIllI[3]);
                            "".length();
                        }
                    }
                    int[] iArr18 = new int[lllIIlIllI[1]];
                    iArr18[lllIIlIllI[0]] = lllIIlIllI[38];
                    if (llIIIIIlIllll(TileObjects.getNearest(iArr18))) {
                        if (llIIIIIlIlllI(eO() ? 1 : 0)) {
                            AccBuilderSotf.c = lllIIlIlIl[lllIIlIllI[41]];
                            eK();
                        }
                        if (llIIIIIlIllII(eO() ? 1 : 0)) {
                            if (llIIIIIllIIIl(Skills.getLevel(Skill.CONSTRUCTION), lllIIlIllI[18]) && llIIIIIlIlllI(eN() ? 1 : 0)) {
                                eJ();
                            }
                            if (llIIIIIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                                eI();
                            }
                            String[] strArr = new String[lllIIlIllI[1]];
                            strArr[lllIIlIllI[0]] = lllIIlIlIl[lllIIlIllI[16]];
                            C0020g.a(strArr);
                        }
                    }
                }
            }
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            eH();
            "".length();
            if (((12 ^ 19) ^ (99 ^ 121)) <= 0) {
                return ((68 ^ 79) ^ (104 ^ 35)) & (((((123 + 98) - 132) + 153) ^ (((57 + 121) - 130) + 130)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lllIIlIllI[133];
    }
}
