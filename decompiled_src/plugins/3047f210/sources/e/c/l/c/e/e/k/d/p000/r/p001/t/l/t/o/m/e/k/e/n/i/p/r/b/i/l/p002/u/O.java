package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
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
import net.runelite.api.coords.WorldArea;
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
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.O  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/O.class */
public class O implements S {
    static /* synthetic */ int ck;
    static /* synthetic */ boolean ix;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int iB;
    private static /* synthetic */ int[] lIIIIIlIIlI;
    static /* synthetic */ WorldPoint ij;
    static /* synthetic */ WorldArea in;
    static /* synthetic */ WorldPoint ih;
    static /* synthetic */ String[] bQ;
    static /* synthetic */ boolean it;
    static /* synthetic */ WorldPoint bY;
    public static /* synthetic */ List<C0003d> bu;
    static /* synthetic */ boolean iv;
    static /* synthetic */ WorldArea io;
    static /* synthetic */ boolean iz;
    static /* synthetic */ WorldPoint gf;
    static /* synthetic */ boolean is;
    static /* synthetic */ boolean iy;
    static /* synthetic */ WorldPoint il;
    static /* synthetic */ boolean iA;
    static /* synthetic */ WorldPoint ii;
    static /* synthetic */ WorldPoint ik;
    static /* synthetic */ boolean iq;
    static /* synthetic */ WorldArea im;
    static /* synthetic */ boolean iu;
    static /* synthetic */ boolean iw;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ String[] lIIIIIIlllI;
    static /* synthetic */ boolean ir;
    static /* synthetic */ boolean ip;

    private static int llIlllIlIIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lIIIIIlIIlI[9];
    }

    private static boolean llIlllIlIlIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIlllIlIlIll(int i) {
        return i > 0;
    }

    private static void llIlllIlIIIlI() {
        lIIIIIIlllI = new String[lIIIIIlIIlI[280]];
        lIIIIIIlllI[lIIIIIlIIlI[9]] = llIlllIIlIllI("7bRmTOBc5cPjhOuBN1jPJ2FA05VylMuUz7PYHDSlEK6uGoz7n18YGBXFoGPIMI3v", "Smilm");
        lIIIIIIlllI[lIIIIIlIIlI[4]] = llIlllIIlIlll("qG5yDGNThBd9l4WtVu8K1Q==", "pzLPm");
        lIIIIIIlllI[lIIIIIlIIlI[5]] = llIlllIIlIllI("czXkHrUZp6cNhpYUKmL8yrYgvKLEt3WK", "lEBvr");
        lIIIIIIlllI[lIIIIIlIIlI[6]] = llIlllIIlIllI("MFGR7hFAjvN3/22XGEuqwzbQABAvDF5ElAcZcdtLbKhHo8Ogy/bECaI0ToRA6uizc5g+lvy98cw=", "lCvoz");
        lIIIIIIlllI[lIIIIIlIIlI[7]] = llIlllIIllIII("BTYfPBE=", "ADvRz");
        lIIIIIIlllI[lIIIIIlIIlI[11]] = llIlllIIlIllI("ZRaNdA632JN6On85gyDMrA==", "XCAqC");
        lIIIIIIlllI[lIIIIIlIIlI[8]] = llIlllIIlIllI("pmtFAZI1j/WpmB3Hd3E9HA==", "SGwSP");
        lIIIIIIlllI[lIIIIIlIIlI[21]] = llIlllIIllIII("JhcJEAgMGFkwBgYd", "evydi");
        lIIIIIIlllI[lIIIIIlIIlI[22]] = llIlllIIllIII("FDM+SDc1cioHIi4=", "ZRHhC");
        lIIIIIIlllI[lIIIIIlIIlI[23]] = llIlllIIlIllI("6WZOj9WhlqvzUDGJNF6dcg==", "HkAzU");
        lIIIIIIlllI[lIIIIIlIIlI[17]] = llIlllIIllIII("GzkyECAxNmIwLjsz", "XXBdA");
        lIIIIIIlllI[lIIIIIlIIlI[27]] = llIlllIIllIII("PzIjFyEUMiMb", "xSMpQ");
        lIIIIIIlllI[lIIIIIlIIlI[28]] = llIlllIIlIllI("EH1GQH7K6GA=", "loLDg");
        lIIIIIIlllI[lIIIIIlIIlI[29]] = llIlllIIlIlll("D5gN/ICx+fMGCFUR7Gczzw==", "BnGse");
        lIIIIIIlllI[lIIIIIlIIlI[30]] = llIlllIIlIlll("tV7jGhQ6QTc=", "gAOow");
        lIIIIIIlllI[lIIIIIlIIlI[24]] = llIlllIIlIlll("BcBZEkBKwOSvsy1YIL0gJHuXw+ZsDTGv", "BhkuP");
        lIIIIIIlllI[lIIIIIlIIlI[48]] = llIlllIIlIlll("s9N8ofCV796GlExHsc4MgnYsXyKqo74a", "bqfkg");
        lIIIIIIlllI[lIIIIIlIIlI[49]] = llIlllIIlIlll("ahsHcsZIdfjVsZUbAiKIvw==", "BLyGX");
        lIIIIIIlllI[lIIIIIlIIlI[50]] = llIlllIIlIllI("7e40AqKPlEPpXX/tgUT6hTWNuyGudzsu", "VtJlQ");
        lIIIIIIlllI[lIIIIIlIIlI[51]] = llIlllIIllIII("PhYtBjMe", "mbLoA");
        lIIIIIIlllI[lIIIIIlIIlI[52]] = llIlllIIlIlll("O+PszYOaKa0=", "mKghK");
        lIIIIIIlllI[lIIIIIlIIlI[53]] = llIlllIIlIlll("QD/BXpE+skOkc0JSrfoyC4c5X7Xc/5v0", "fQIGG");
        lIIIIIIlllI[lIIIIIlIIlI[54]] = llIlllIIlIllI("uzl4HiISBZnov191hn0H8FaVb39RXU7Q", "aWslI");
        lIIIIIIlllI[lIIIIIlIIlI[55]] = llIlllIIlIlll("PbwrRDHhcosPuXel4DYM2g==", "QSShr");
        lIIIIIIlllI[lIIIIIlIIlI[56]] = llIlllIIlIllI("lgb4KI5pZyHd6h1NYeZl337fzovgufa7", "vznbc");
        lIIIIIIlllI[lIIIIIlIIlI[57]] = llIlllIIlIllI("8tD5C8d6sW/4kSs+8MEyLW+R5X+x4ToH", "swCzY");
        lIIIIIIlllI[lIIIIIlIIlI[58]] = llIlllIIlIllI("+9jA9IEEle0=", "lFNFl");
        lIIIIIIlllI[lIIIIIlIIlI[59]] = llIlllIIllIII("ESolPDY=", "RFLQT");
        lIIIIIIlllI[lIIIIIlIIlI[60]] = llIlllIIllIII("Lh8QKT9HHxAjdikKDi8xBh8XNA==", "gkxFV");
        lIIIIIIlllI[lIIIIIlIIlI[61]] = llIlllIIlIllI("kvRunEiX6VOnE/hA6rONEA==", "ZdmPB");
        lIIIIIIlllI[lIIIIIlIIlI[62]] = llIlllIIlIlll("wF6bNr4QuwkIIUjrIxhJVQ==", "tyRCS");
        lIIIIIIlllI[lIIIIIlIIlI[63]] = llIlllIIlIllI("yCwQiBegjBiwZspgOYy0hw==", "fmtNw");
        lIIIIIIlllI[lIIIIIlIIlI[64]] = llIlllIIlIlll("IVIbMMUqsyk=", "KkDrt");
        lIIIIIIlllI[lIIIIIlIIlI[65]] = llIlllIIlIlll("QJdxm7/NAahj+pHIjfyGXA==", "oTDbu");
        lIIIIIIlllI[lIIIIIlIIlI[66]] = llIlllIIllIII("MgYiIiRTADkiaiccOCIs", "stQGJ");
        lIIIIIIlllI[lIIIIIlIIlI[67]] = llIlllIIlIlll("JCzuZxVSVfJ4e71PAWq69tubEbw8QdwMpKxKvGZOJ7EBDNp2ldi1IA==", "kbumf");
        lIIIIIIlllI[lIIIIIlIIlI[68]] = llIlllIIllIII("GzcAPXohJg8=", "OVlVZ");
        lIIIIIIlllI[lIIIIIlIIlI[69]] = llIlllIIllIII("ERQQJC1wEgskYwQOCiQl", "PfcAC");
        lIIIIIIlllI[lIIIIIlIIlI[70]] = llIlllIIllIII("Njg6MQlVGzchRzY2NDEJ", "uYXXg");
        lIIIIIIlllI[lIIIIIlIIlI[71]] = llIlllIIllIII("JAQHPRZTCAsrUwoDF28VGgIG", "slbOs");
        lIIIIIIlllI[lIIIIIlIIlI[72]] = llIlllIIlIllI("sbUXbwYDwFOMxiT8AyJOrQ==", "pCSOu");
        lIIIIIIlllI[lIIIIIlIIlI[73]] = llIlllIIlIllI("+2OfimFxLQ4YBTp11uOHlA==", "pbywA");
        lIIIIIIlllI[lIIIIIlIIlI[74]] = llIlllIIlIllI("gEWHnzYLLVQ=", "Apwfk");
        lIIIIIIlllI[lIIIIIlIIlI[75]] = llIlllIIlIlll("ZUcIvwU1UzVh5qrStP5Osw==", "dZSBG");
        lIIIIIIlllI[lIIIIIlIIlI[76]] = llIlllIIlIlll("MrGl/seeLfE8ggiRsQY72g==", "mYyeG");
        lIIIIIIlllI[lIIIIIlIIlI[77]] = llIlllIIlIllI("OBeyjwXKzol2yGJLGRYQPA==", "REgaZ");
        lIIIIIIlllI[lIIIIIlIIlI[78]] = llIlllIIlIlll("ZEu5gLws2/s=", "ZgRpJ");
        lIIIIIIlllI[lIIIIIlIIlI[79]] = llIlllIIlIllI("arVabF11iKPqdUHJJ7JRfA==", "ORtnZ");
        lIIIIIIlllI[lIIIIIlIIlI[80]] = llIlllIIllIII("EBwgKBM+UjsjFXcxICQb", "WrOKp");
        lIIIIIIlllI[lIIIIIlIIlI[81]] = llIlllIIllIII("PhgdKhdJFBE8UhAfDXgBCAlYLBoAAw==", "ipxXr");
        lIIIIIIlllI[lIIIIIlIIlI[20]] = llIlllIIlIlll("QLXybaNwXDeSV5ku7y5Jdg==", "weMSL");
        lIIIIIIlllI[lIIIIIlIIlI[82]] = llIlllIIlIlll("yssejxkkJ54tBuyt7m2RUQ==", "ODqNB");
        lIIIIIIlllI[lIIIIIlIIlI[83]] = llIlllIIllIII("NAMeIBsaTQUrHVMuHiwT", "smqCx");
        lIIIIIIlllI[lIIIIIlIIlI[84]] = llIlllIIlIlll("LMYR7r2MzP9NMynf9ngwOg==", "diyGF");
        lIIIIIIlllI[lIIIIIlIIlI[85]] = llIlllIIlIllI("DMdEvs+faJQ=", "hijLI");
        lIIIIIIlllI[lIIIIIlIIlI[86]] = llIlllIIlIllI("+h8w3+IPN8C06O7HNiCixg==", "owenc");
        lIIIIIIlllI[lIIIIIlIIlI[87]] = llIlllIIlIlll("pjfIb6xWnz8eoLoMdLhvLw==", "RCZKM");
        lIIIIIIlllI[lIIIIIlIIlI[88]] = llIlllIIllIII("KAYDNzcDBgM7", "ogmPG");
        lIIIIIIlllI[lIIIIIlIIlI[89]] = llIlllIIlIllI("Cd+4GCdwAf4=", "vkDwW");
        lIIIIIIlllI[lIIIIIlIIlI[90]] = llIlllIIlIllI("jfEgxEPiEseSXppndjUiEQ==", "XLbhM");
        lIIIIIIlllI[lIIIIIlIIlI[91]] = llIlllIIlIllI("fMOTA3hr64q4ez0eN1YPWg==", "SbmeO");
        lIIIIIIlllI[lIIIIIlIIlI[92]] = llIlllIIlIlll("2NH89YteaQ3YpxV9hhogNPUslhIHqNkf", "dSuPz");
        lIIIIIIlllI[lIIIIIlIIlI[93]] = llIlllIIlIlll("2yCX5SJ+0NLC08R6y9Fvuw==", "LrxaV");
        lIIIIIIlllI[lIIIIIlIIlI[94]] = llIlllIIlIlll("pvwtehaPZ9+IsSg9qhATww==", "cgJza");
        lIIIIIIlllI[lIIIIIlIIlI[95]] = llIlllIIllIII("BCoHPSs=", "GXhNX");
        lIIIIIIlllI[lIIIIIlIIlI[96]] = llIlllIIllIII("KToCCgJKBg4cFw==", "jRkod");
        lIIIIIIlllI[lIIIIIlIIlI[97]] = llIlllIIllIII("LBEBQRENUB8OCQc=", "bpwae");
        lIIIIIIlllI[lIIIIIlIIlI[110]] = llIlllIIllIII("BCklKA==", "LFIMm");
        lIIIIIIlllI[lIIIIIlIIlI[111]] = llIlllIIlIllI("DrP2xsOfxDo=", "jUVON");
        lIIIIIIlllI[lIIIIIlIIlI[112]] = llIlllIIllIII("CSoCMy1qFg4lOA==", "JBkVK");
        lIIIIIIlllI[lIIIIIlIIlI[113]] = llIlllIIlIlll("gQzul/DkUBEz8HU/43gGqg==", "Imhao");
        lIIIIIIlllI[lIIIIIlIIlI[114]] = llIlllIIlIlll("Pcg3vtTVN276oEuBImlEpg==", "ShvOV");
        lIIIIIIlllI[lIIIIIlIIlI[115]] = llIlllIIlIlll("JwXf5bZqqNXMk8GnRVEDAZPItLPBErzZ", "yEiXa");
        lIIIIIIlllI[lIIIIIlIIlI[116]] = llIlllIIlIllI("I5RZyfWSc6zigWXBSP51Nw==", "jJDWD");
        lIIIIIIlllI[lIIIIIlIIlI[117]] = llIlllIIllIII("Djo4PCdtBjQqMg==", "MRQYA");
        lIIIIIIlllI[lIIIIIlIIlI[118]] = llIlllIIllIII("PD04JHEGNTIlNBg=", "jTVAQ");
        lIIIIIIlllI[lIIIIIlIIlI[119]] = llIlllIIlIllI("+eVauTkoJV0=", "MUnKJ");
        lIIIIIIlllI[lIIIIIlIIlI[122]] = llIlllIIllIII("Jwo8HSBENjALNQ==", "dbUxF");
        lIIIIIIlllI[lIIIIIlIIlI[123]] = llIlllIIlIlll("W044lFvATKEiBXPITQGJAg==", "HLuhy");
        lIIIIIIlllI[lIIIIIlIIlI[124]] = llIlllIIlIllI("wK7i4maO9OQ=", "eTSkA");
        lIIIIIIlllI[lIIIIIlIIlI[125]] = llIlllIIlIllI("MQnOaZLh0+g=", "xUHie");
        lIIIIIIlllI[lIIIIIlIIlI[126]] = llIlllIIlIlll("fdzt7P7VM5YqNK9sYsKRxAkb3I6orPi5", "oPPRp");
        lIIIIIIlllI[lIIIIIlIIlI[127]] = llIlllIIlIllI("nhyRUSOX871U1nxuMJ2nvQ==", "CrNuE");
        lIIIIIIlllI[lIIIIIlIIlI[128]] = llIlllIIlIlll("zKWlzARbFJc8ZqV90f6qbA==", "tIGid");
        lIIIIIIlllI[lIIIIIlIIlI[129]] = llIlllIIlIlll("UTD1kn0nqw0=", "YkuGP");
        lIIIIIIlllI[lIIIIIlIIlI[130]] = llIlllIIlIlll("QIG74TPOTJ4=", "JPyMB");
        lIIIIIIlllI[lIIIIIlIIlI[131]] = llIlllIIllIII("DQArFRg6CjcV", "YeGpk");
        lIIIIIIlllI[lIIIIIlIIlI[132]] = llIlllIIllIII("Ni4EGVEuJAcXAjkuGxdR", "ZAkrq");
        lIIIIIIlllI[lIIIIIlIIlI[133]] = llIlllIIllIII("IT8lKgAWNTkq", "uZIOs");
        lIIIIIIlllI[lIIIIIlIIlI[134]] = llIlllIIllIII("AQcAFhg4AA==", "Nessj");
        lIIIIIIlllI[lIIIIIlIIlI[135]] = llIlllIIlIllI("97vo0lq/Rpzior8fU0672g==", "yfCcY");
        lIIIIIIlllI[lIIIIIlIIlI[136]] = llIlllIIllIII("ABAqLjog", "SdKGH");
        lIIIIIIlllI[lIIIIIlIIlI[137]] = llIlllIIlIlll("QRNd6mdbvDk=", "tFTjh");
        lIIIIIIlllI[lIIIIIlIIlI[138]] = llIlllIIllIII("My08BzsEJyAH", "gHPbH");
        lIIIIIIlllI[lIIIIIlIIlI[139]] = llIlllIIllIII("PTUTUDocdCIeIRA3DA==", "sTepN");
        lIIIIIIlllI[lIIIIIlIIlI[140]] = llIlllIIlIlll("Ji12w7gJsP2lLnOkCecGCw==", "PApXv");
        lIIIIIIlllI[lIIIIIlIIlI[141]] = llIlllIIlIlll("c8P6ucSsY7Q=", "sOiVX");
        lIIIIIIlllI[lIIIIIlIIlI[142]] = llIlllIIlIlll("USncDKQeWxizMURAYxvhKg==", "vqmYK");
        lIIIIIIlllI[lIIIIIlIIlI[143]] = llIlllIIlIlll("wF1kJ3L69mGecNKrOB39aQ==", "HOdxm");
        lIIIIIIlllI[lIIIIIlIIlI[144]] = llIlllIIllIII("JAskLUYeGis=", "pjHFf");
        lIIIIIIlllI[lIIIIIlIIlI[145]] = llIlllIIlIlll("JoraZhfUnJpquhwCq43RRg==", "WBbYR");
        lIIIIIIlllI[lIIIIIlIIlI[146]] = llIlllIIllIII("DQo4WDQbECMccgANKFghGxA/Gzc=", "teMxR");
        lIIIIIIlllI[lIIIIIlIIlI[147]] = llIlllIIlIllI("/Ucxjr3MQePfkG/WJFp/XxIrcHm5zLv7n3U7uWsF1gQ=", "tigNP");
        lIIIIIIlllI[lIIIIIlIIlI[148]] = llIlllIIlIllI("sT8YSULp9lU=", "IOKaE");
        lIIIIIIlllI[lIIIIIlIIlI[149]] = llIlllIIllIII("FgYjIjh4DiU4NA==", "UjJOZ");
        lIIIIIIlllI[lIIIIIlIIlI[150]] = llIlllIIlIlll("L4+ef7e49LtH3IIzdifGbubgyc0BIP11", "qBhCx");
        lIIIIIIlllI[lIIIIIlIIlI[151]] = llIlllIIllIII("BS8bcAUkbiwiAi4g", "KNmPq");
        lIIIIIIlllI[lIIIIIlIIlI[152]] = llIlllIIllIII("NwQXABpWAgwAVCIeDQAS", "vvdet");
        lIIIIIIlllI[lIIIIIlIIlI[153]] = llIlllIIllIII("EQQmODcx", "BpGQE");
        lIIIIIIlllI[lIIIIIlIIlI[154]] = llIlllIIllIII("FCUmAjN6PD8=", "WIOoQ");
        lIIIIIIlllI[lIIIIIlIIlI[155]] = llIlllIIllIII("JTUxNRlEMyo1VzAvKzUR", "dGBPw");
        lIIIIIIlllI[lIIIIIlIIlI[156]] = llIlllIIlIlll("ZlzOucsamNHiERucxbqgn07KXjZY1/XW", "olrPb");
        lIIIIIIlllI[lIIIIIlIIlI[157]] = llIlllIIlIlll("hbmzZCwl2l85kZL1sJqMAA==", "ABstH");
        lIIIIIIlllI[lIIIIIlIIlI[158]] = llIlllIIllIII("OTkfNzxYPwQ3ciwjBTc0", "xKlRR");
        lIIIIIIlllI[lIIIIIlIIlI[159]] = llIlllIIllIII("DTAxAxluEzwTVw0+PwMZ", "NQSjw");
        lIIIIIIlllI[lIIIIIlIIlI[160]] = llIlllIIllIII("FD0wcjQCJys2cgInMXI6AiVlJTc=", "mRERR");
        lIIIIIIlllI[lIIIIIlIIlI[161]] = llIlllIIlIlll("5A5er+opyExqvLGlYLYlag==", "BzPFY");
        lIIIIIIlllI[lIIIIIlIIlI[162]] = llIlllIIlIlll("e4168A+c6v3UbsPpf3Gd3w==", "YhaMu");
        lIIIIIIlllI[lIIIIIlIIlI[163]] = llIlllIIlIlll("KHeF5LZib78IkKk2Ri2OlQ==", "qPANR");
        lIIIIIIlllI[lIIIIIlIIlI[164]] = llIlllIIlIllI("kIVMeFVidfw=", "EYemF");
        lIIIIIIlllI[lIIIIIlIIlI[165]] = llIlllIIllIII("My4GOQFdJgAjDQ==", "pBoTc");
        lIIIIIIlllI[lIIIIIlIIlI[166]] = llIlllIIlIllI("u7GPc1XdJAOYUuPUe9UbRg==", "EwspW");
        lIIIIIIlllI[lIIIIIlIIlI[171]] = llIlllIIllIII("IQ0JESgKDQkd", "flgvX");
        lIIIIIIlllI[lIIIIIlIIlI[172]] = llIlllIIlIllI("lDUWojBcrWw=", "oHUTO");
        lIIIIIIlllI[lIIIIIlIIlI[173]] = llIlllIIlIllI("7IE01gX3zl5xrcr72M+XRA==", "LrFUm");
        lIIIIIIlllI[lIIIIIlIIlI[174]] = llIlllIIlIllI("5QJqrTyC/eZfE99f0rhkeA==", "YdVeu");
        lIIIIIIlllI[lIIIIIlIIlI[175]] = llIlllIIlIlll("nApFrGA+juMQ06xJkV7iGg==", "kZZhH");
        lIIIIIIlllI[lIIIIIlIIlI[176]] = llIlllIIllIII("ATgaMBY=", "BJuCe");
        lIIIIIIlllI[lIIIIIlIIlI[177]] = llIlllIIllIII("IyIsdTcCYx07LA4gMw==", "mCZUC");
        lIIIIIIlllI[lIIIIIlIIlI[184]] = llIlllIIlIlll("dVmwSlXFZtggS5bdbXtU9g==", "BPIou");
        lIIIIIIlllI[lIIIIIlIIlI[185]] = llIlllIIlIlll("G4tNsf7pUA8=", "qUCXf");
        lIIIIIIlllI[lIIIIIlIIlI[186]] = llIlllIIlIlll("aOWpHQiXxEctAUS+uO46VA==", "fyxHk");
        lIIIIIIlllI[lIIIIIlIIlI[187]] = llIlllIIlIllI("tcGu6uFuAVen8QfkzMvoOA==", "ZrHXg");
        lIIIIIIlllI[lIIIIIlIIlI[188]] = llIlllIIlIlll("28unCAWDZRZavmmGwpiJGA==", "JgKnB");
        lIIIIIIlllI[lIIIIIlIIlI[189]] = llIlllIIlIlll("LDfGL1OlYbtliCPdBKju6Q==", "yYjvU");
        lIIIIIIlllI[lIIIIIlIIlI[190]] = llIlllIIllIII("ChkkKhsq", "YmECi");
        lIIIIIIlllI[lIIIIIlIIlI[191]] = llIlllIIlIllI("xft/Albbt0XHtO5FGte09A==", "SxDqY");
        lIIIIIIlllI[lIIIIIlIIlI[192]] = llIlllIIlIlll("eWPXnGoa/W+ZrPD5PKKsGF02rnd7fhqP", "FaQNe");
        lIIIIIIlllI[lIIIIIlIIlI[193]] = llIlllIIllIII("LAU/WTMNRAgLNAcK", "bdIyG");
        lIIIIIIlllI[lIIIIIlIIlI[194]] = llIlllIIlIlll("M/gZ9F5Ph69yH448G0BzTg==", "cuydL");
        lIIIIIIlllI[lIIIIIlIIlI[195]] = llIlllIIlIllI("QZqrtnXaIsU=", "awUFg");
        lIIIIIIlllI[lIIIIIlIIlI[196]] = llIlllIIllIII("Kw4OPzRFFxc=", "hbgRV");
        lIIIIIIlllI[lIIIIIlIIlI[197]] = llIlllIIlIlll("OjHQlR4cYGv35cEWrHqq4Q==", "rMJfN");
        lIIIIIIlllI[lIIIIIlIIlI[198]] = llIlllIIlIlll("A4NiOgcsh+jqEeYu1ILsfg==", "iCiov");
        lIIIIIIlllI[lIIIIIlIIlI[199]] = llIlllIIllIII("NQMWFSNUBQ0VbSAZDBUr", "tqepM");
        lIIIIIIlllI[lIIIIIlIIlI[200]] = llIlllIIlIlll("K7DZbBu76co=", "iPojK");
        lIIIIIIlllI[lIIIIIlIIlI[201]] = llIlllIIlIlll("4bb/IytAllNtIQOQvo8fgw==", "GDsQg");
        lIIIIIIlllI[lIIIIIlIIlI[202]] = llIlllIIlIllI("TePO38EbViEs9sQabTKDeFYvnUcPMcyg", "WdrTA");
        lIIIIIIlllI[lIIIIIlIIlI[203]] = llIlllIIlIllI("yhsNPRP55YtrNr990N6OEKBxZLd9OWBT", "LkISO");
        lIIIIIIlllI[lIIIIIlIIlI[204]] = llIlllIIllIII("LDseIlE2KhE=", "XZrIq");
        lIIIIIIlllI[lIIIIIlIIlI[205]] = llIlllIIlIlll("f7olDyNF0nNc+GjXiNh+YekVvTAzWoPH", "aXItn");
        lIIIIIIlllI[lIIIIIlIIlI[206]] = llIlllIIllIII("JQw4MBgF", "vxYYj");
        lIIIIIIlllI[lIIIIIlIIlI[207]] = llIlllIIlIllI("BXo/WN7Nn7E=", "UGSiu");
        lIIIIIIlllI[lIIIIIlIIlI[208]] = llIlllIIlIlll("Ra2O3jYzcZeeFA9S5i08nVAzSiPpNPqg", "kmLKf");
        lIIIIIIlllI[lIIIIIlIIlI[209]] = llIlllIIllIII("JDYlAAdNNiUKTiMjOwYJDDYiHQ==", "mBMon");
        lIIIIIIlllI[lIIIIIlIIlI[210]] = llIlllIIlIllI("6L870eBuWvbq6Q+JYBwnnfob4hGSUZec", "qTouR");
        lIIIIIIlllI[lIIIIIlIIlI[211]] = llIlllIIlIlll("TyVSbVY//BQlLP2grNCZ/lWew18DShwb", "tslip");
        lIIIIIIlllI[lIIIIIlIIlI[212]] = llIlllIIlIlll("oHu9cePle+I=", "DfzGT");
        lIIIIIIlllI[lIIIIIlIIlI[213]] = llIlllIIllIII("JikxOiQ=", "eEXWF");
        lIIIIIIlllI[lIIIIIlIIlI[214]] = llIlllIIlIlll("jNKx6nqylCrFbLSMyP8gsPzmgWB4eLo7", "JLZls");
        lIIIIIIlllI[lIIIIIlIIlI[215]] = llIlllIIlIllI("W/WHQ7dUrTuCtxQe1kCN4g==", "YkXyf");
        lIIIIIIlllI[lIIIIIlIIlI[216]] = llIlllIIlIllI("4ywOkgKGbX9VGEPGvt9flg==", "VBCCE");
        lIIIIIIlllI[lIIIIIlIIlI[217]] = llIlllIIlIllI("ea/2Bqc1vONbPu2jmrjAoQ==", "sQfQl");
        lIIIIIIlllI[lIIIIIlIIlI[218]] = llIlllIIllIII("HS8tBDo2Ly0I", "ZNCcJ");
        lIIIIIIlllI[lIIIIIlIIlI[219]] = llIlllIIllIII("KAUCGRk=", "kwmjj");
        lIIIIIIlllI[lIIIIIlIIlI[220]] = llIlllIIlIlll("ONi00pMB9Q4gvN2fB3XwlA==", "zCSSF");
        lIIIIIIlllI[lIIIIIlIIlI[221]] = llIlllIIllIII("JRkdLjcPFk0OOQUT", "fxmZV");
        lIIIIIIlllI[lIIIIIlIIlI[222]] = llIlllIIllIII("HS0iKBY2LSIk", "ZLLOf");
        lIIIIIIlllI[lIIIIIlIIlI[223]] = llIlllIIllIII("Gjo1IQA=", "YHZRs");
        lIIIIIIlllI[lIIIIIlIIlI[224]] = llIlllIIllIII("DAQOCgFlBA4ASAsREAwPJAQJFw==", "Epfeh");
        lIIIIIIlllI[lIIIIIlIIlI[225]] = llIlllIIlIlll("cFzpf32uMRzEcPnX+fdshE8NOGuUXCZr", "IzAkI");
        lIIIIIIlllI[lIIIIIlIIlI[226]] = llIlllIIlIlll("SV7JGf4dE819evNx96Rb7A==", "jyvUH");
        lIIIIIIlllI[lIIIIIlIIlI[227]] = llIlllIIlIllI("C6IBysjigQ3bAF0ekzsVLUf9cNyrCF1i", "xpdrr");
        lIIIIIIlllI[lIIIIIlIIlI[228]] = llIlllIIlIllI("ivaEYoN3GdQ=", "EjWlp");
        lIIIIIIlllI[lIIIIIlIIlI[229]] = llIlllIIllIII("FzYHJik=", "TZnKK");
        lIIIIIIlllI[lIIIIIlIIlI[230]] = llIlllIIlIllI("GDKeSGQyj4Fu2i4HSh/d4h3vGdCp4I7W", "ntYXe");
        lIIIIIIlllI[lIIIIIlIIlI[231]] = llIlllIIlIlll("VphhyYw2Zg4=", "syKgN");
        lIIIIIIlllI[lIIIIIlIIlI[232]] = llIlllIIllIII("NQ0b", "ploqa");
        lIIIIIIlllI[lIIIIIlIIlI[233]] = llIlllIIlIlll("AuokB1mtI0+8ig8fqa13cZX5kP3iGsOd", "FHCaC");
        lIIIIIIlllI[lIIIIIlIIlI[234]] = llIlllIIlIlll("Ai6/UwTo1Q8=", "waxec");
        lIIIIIIlllI[lIIIIIlIIlI[235]] = llIlllIIlIlll("TSLE8z9w7lbZfVdin0y2OQ==", "hyXqy");
        lIIIIIIlllI[lIIIIIlIIlI[236]] = llIlllIIlIlll("iMBfL6BFRUI=", "PEDKE");
        lIIIIIIlllI[lIIIIIlIIlI[237]] = llIlllIIlIlll("JNjfZvjFV/4=", "BBtzq");
        lIIIIIIlllI[lIIIIIlIIlI[238]] = llIlllIIlIllI("xM3eDlf+cskxr2X0BfO3Gw==", "cCoPq");
        lIIIIIIlllI[lIIIIIlIIlI[239]] = llIlllIIlIlll("ENHIYkthLU6Fy66wqOV0Og==", "PWNEo");
        lIIIIIIlllI[lIIIIIlIIlI[240]] = llIlllIIlIllI("Loi2Cx8O/ko=", "yXWLm");
        lIIIIIIlllI[lIIIIIlIIlI[241]] = llIlllIIllIII("PTYcCUsnJxM=", "IWpbk");
        lIIIIIIlllI[lIIIIIlIIlI[242]] = llIlllIIlIllI("YOuf/X/1DVcYI1y/sFWzZA==", "rrRiN");
        lIIIIIIlllI[lIIIIIlIIlI[243]] = llIlllIIlIllI("qTRWghv6eDU=", "XJUhU");
        lIIIIIIlllI[lIIIIIlIIlI[250]] = llIlllIIlIlll("ZtTtU7z1ibWfWwVXteLPJu5P/BsYPDZo", "GjaxP");
        lIIIIIIlllI[lIIIIIlIIlI[251]] = llIlllIIlIllI("pidhaoocoCR0X1sZCc7ZlR1SGgs149Fu", "bOaQL");
        lIIIIIIlllI[lIIIIIlIIlI[262]] = llIlllIIllIII("PjwieQ==", "gYQWw");
        lIIIIIIlllI[lIIIIIlIIlI[263]] = llIlllIIllIII("GwsnJ1YnCig3ViMFZjsTIBNmNxlsGikmViIGIzdJ", "LcFSv");
        lIIIIIIlllI[lIIIIIlIIlI[264]] = llIlllIIlIllI("ceH8+H5IeGQitYpN+s52QxqLDkaGaCF+y6n/Wk5XdzMNl9F2GVUlRw==", "mVjUh");
        lIIIIIIlllI[lIIIIIlIIlI[265]] = llIlllIIlIllI("OpQxmjnYCsCsqshis3bYExW8V5Q4DGzt74Fj8lurttROMoROtWk5wg==", "Zwchl");
        lIIIIIIlllI[lIIIIIlIIlI[266]] = llIlllIIllIII("AFIpKiA7UjggNG4EJG8jLBcvbyI8ADIqJWc=", "IrAOA");
        lIIIIIIlllI[lIIIIIlIIlI[267]] = llIlllIIlIlll("m9nU9vA+Csx+esvZuvLDPjwPSV7CyJEzol1Rax6nqrpiaJvZunWvbJtxhrvcCfh3", "CqNUQ");
        lIIIIIIlllI[lIIIIIlIIlI[268]] = llIlllIIlIlll("eJNpiOSjM6oTKh4Ki6yDvkF5uUhRXtMqt6ikKYDUfbniWraJcPBmXA==", "KAIJy");
        lIIIIIIlllI[lIIIIIlIIlI[269]] = llIlllIIllIII("Mg8vOg8JSignHkEeJi1MEQU9OwkSGSssTAUFIiRMAAQqaAoACStoGAkPbisDDxkrORkEBC0tH08=", "ajNHl");
        lIIIIIIlllI[lIIIIIlIIlI[270]] = llIlllIIlIlll("vDBWNRncmRqBNEgmPhXdVzR33IWLvS91yNonluEtxplkRAh7IJBHyExF2N3nVaks", "uuCNd");
        lIIIIIIlllI[lIIIIIlIIlI[271]] = llIlllIIlIlll("fxvfw1owK8hianmyPCGDKqt/UvrBqR/6", "tKbMH");
        lIIIIIIlllI[lIIIIIlIIlI[272]] = llIlllIIlIllI("q/1FJkYMixH1RPN/8qwWVXr4IynSU7bywzMfrqk0KpkITKH6xYuUSbLCjNjTZlpE", "bRsGU");
        lIIIIIIlllI[lIIIIIlIIlI[273]] = llIlllIIllIII("JmYBBDIdZiAVOwAvSQI8AC0MBXMbLgxBPgonBUEqADNJACcKZh0JMhtmBwg0BzJH", "oFiaS");
        lIIIIIIlllI[lIIIIIlIIlI[274]] = llIlllIIllIII("A2owKgc4aiEgE2opNyANLy54Ow4vajUqByZqLCcDM2o5OwNqKD0pCTgveCgDPj4xIQFqOTEsDWQ=", "JJXOf");
        lIIIIIIlllI[lIIIIIlIIlI[275]] = llIlllIIllIII("MFMmLgQLUzckEFkQISQOHBduPw0cUyMuBBVTOiMAAFMvPwBZESstCgsWbiwADQcnJQJZACcoDlc=", "ysNKe");
        lIIIIIIlllI[lIIIIIlIIlI[276]] = llIlllIIllIII("AjAoKgxvMzQrCDoiNGgdJzRxCwg/JTAhB2gicTwBJj86IQcocT4uSSk4IyEHKHEoJxxh", "OQQHi");
        lIIIIIIlllI[lIIIIIlIIlI[277]] = llIlllIIlIlll("fWAmawv9PY9asbmZUXGPxovDJKOB/I1Yx5cd1R0Jo9o=", "ztDIH");
        lIIIIIIlllI[lIIIIIlIIlI[278]] = llIlllIIlIllI("7blWFqValoQzZlmc6SRdkQOk9LQFV5lC0sZU/fr9DEFozI5nvmqR5DuDwp2HQlXicsPx1mTnkKk=", "BjWUL");
        lIIIIIIlllI[lIIIIIlIIlI[279]] = llIlllIIllIII("MEMRKFgSDQshHR1ELjkQFg1HKxcLRBciEQoLCSQWHkQeIg0LRAQ/HQ5K", "ydgMx");
    }

    private static boolean llIlllIlIlIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlllIlIlIIl(int i) {
        return i == 0;
    }

    private static void llIlllIlIIlII() {
        lIIIIIlIIlI = new int[281];
        lIIIIIlIIlI[0] = (-(175 ^ 168)) & (-18497) & 24575;
        lIIIIIlIIlI[1] = (-10311) & 16382;
        lIIIIIlIIlI[2] = (-10246) & 16319;
        lIIIIIlIIlI[3] = (-((-1305) & 27997)) & (-1) & 32767;
        lIIIIIlIIlI[4] = " ".length();
        lIIIIIlIIlI[5] = "  ".length();
        lIIIIIlIIlI[6] = "   ".length();
        lIIIIIlIIlI[7] = (15 ^ 0) ^ (36 ^ 47);
        lIIIIIlIIlI[8] = (((99 + 41) - 54) + 69) ^ (((41 + 116) - 133) + 133);
        lIIIIIlIIlI[9] = ((80 ^ 43) ^ (174 ^ 154)) & (((5 ^ 105) ^ (38 ^ 5)) ^ (-" ".length()));
        lIIIIIlIIlI[10] = (-10309) & 15308;
        lIIIIIlIIlI[11] = 67 ^ 70;
        lIIIIIlIIlI[12] = (-8225) & 16231;
        lIIIIIlIIlI[13] = (-129) & 8137;
        lIIIIIlIIlI[14] = (-((-16702) & 31039)) & (-16451) & 31739;
        lIIIIIlIIlI[15] = (-((-12865) & 32365)) & (-515) & 32639;
        lIIIIIlIIlI[16] = (-12449) & 13038;
        lIIIIIlIIlI[17] = (235 ^ 179) ^ (149 ^ 199);
        lIIIIIlIIlI[18] = (-((-4137) & 29225)) & (-4101) & 29567;
        lIIIIIlIIlI[19] = (-((-3) & 15051)) & (-16387) & 32767;
        lIIIIIlIIlI[20] = (188 ^ 181) ^ (100 ^ 95);
        lIIIIIlIIlI[21] = (((62 + 78) - 87) + 135) ^ (((156 + 117) - 168) + 82);
        lIIIIIlIIlI[22] = 74 ^ 66;
        lIIIIIlIIlI[23] = (((118 + 138) - 186) + 83) ^ (((129 + 121) - 231) + 125);
        lIIIIIlIIlI[24] = 111 ^ 96;
        lIIIIIlIIlI[25] = (-4293) & 6870;
        lIIIIIlIIlI[26] = (-((-2165) & 18679)) & (-12353) & 31703;
        lIIIIIlIIlI[27] = 12 ^ 7;
        lIIIIIlIIlI[28] = 82 ^ 94;
        lIIIIIlIIlI[29] = (52 ^ 31) ^ (107 ^ 77);
        lIIIIIlIIlI[30] = (((4 + 114) - (-28)) + 41) ^ (((5 + 113) - 18) + 81);
        lIIIIIlIIlI[31] = (-1031) & 3871;
        lIIIIIlIIlI[32] = (-((-2598) & 7927)) & (-11) & 8187;
        lIIIIIlIIlI[33] = (-16789) & 19359;
        lIIIIIlIIlI[34] = (-((-19457) & 31890)) & (-16395) & 31679;
        lIIIIIlIIlI[35] = (-17617) & 20180;
        lIIIIIlIIlI[36] = (-9217) & 11773;
        lIIIIIlIIlI[37] = (-5149) & 7998;
        lIIIIIlIIlI[38] = (-24577) & 27125;
        lIIIIIlIIlI[39] = (-(((114 + 45) - 90) + 124)) & (-8193) & 11231;
        lIIIIIlIIlI[40] = (-22017) & 24558;
        lIIIIIlIIlI[41] = (-((-5518) & 30191)) & (-4097) & 31615;
        lIIIIIlIIlI[42] = (-((-23815) & 32526)) & (-1041) & 12287;
        lIIIIIlIIlI[43] = (-161) & 3003;
        lIIIIIlIIlI[44] = (-((-2821) & 31503)) & (-17) & 31231;
        lIIIIIlIIlI[45] = (-24578) & 27415;
        lIIIIIlIIlI[46] = (-5146) & 7677;
        lIIIIIlIIlI[47] = (-((-2641) & 15998)) & (-1) & 16191;
        lIIIIIlIIlI[48] = (((50 + 68) - (-1)) + 14) ^ (((8 + 45) - 23) + 119);
        lIIIIIlIIlI[49] = (25 ^ 93) ^ (9 ^ 92);
        lIIIIIlIIlI[50] = 110 ^ 124;
        lIIIIIlIIlI[51] = 212 ^ 199;
        lIIIIIlIIlI[52] = 97 ^ 117;
        lIIIIIlIIlI[53] = 32 ^ 53;
        lIIIIIlIIlI[54] = (111 ^ 31) ^ (84 ^ 50);
        lIIIIIlIIlI[55] = 134 ^ 145;
        lIIIIIlIIlI[56] = 27 ^ 3;
        lIIIIIlIIlI[57] = (36 ^ 117) ^ (119 ^ 63);
        lIIIIIlIIlI[58] = (5 ^ 70) ^ (127 ^ 38);
        lIIIIIlIIlI[59] = (97 ^ 35) ^ (251 ^ 162);
        lIIIIIlIIlI[60] = 113 ^ 109;
        lIIIIIlIIlI[61] = (92 ^ 43) ^ (225 ^ 139);
        lIIIIIlIIlI[62] = (188 ^ 156) ^ (105 ^ 87);
        lIIIIIlIIlI[63] = (28 ^ 15) ^ (54 ^ 58);
        lIIIIIlIIlI[64] = (137 ^ 169) ^ ((174 ^ 138) & ((63 ^ 27) ^ (-1)));
        lIIIIIlIIlI[65] = (((154 + 120) - 162) + 67) ^ (((103 + 79) - 100) + 64);
        lIIIIIlIIlI[66] = 110 ^ 76;
        lIIIIIlIIlI[67] = (((91 + 90) - 170) + 162) ^ (((44 + 31) - (-26)) + 41);
        lIIIIIlIIlI[68] = 115 ^ 87;
        lIIIIIlIIlI[69] = (49 ^ 85) ^ (19 ^ 82);
        lIIIIIlIIlI[70] = 11 ^ 45;
        lIIIIIlIIlI[71] = (((15 + 135) - 33) + 111) ^ (((109 + 52) - 82) + 116);
        lIIIIIlIIlI[72] = (((44 + 54) - (-59)) + 77) ^ (((34 + 145) - 60) + 75);
        lIIIIIlIIlI[73] = 46 ^ 7;
        lIIIIIlIIlI[74] = (((165 + 155) - 207) + 125) ^ (((182 + 82) - 250) + 182);
        lIIIIIlIIlI[75] = (83 ^ 14) ^ (252 ^ 138);
        lIIIIIlIIlI[76] = (88 ^ 24) ^ (72 ^ 36);
        lIIIIIlIIlI[77] = (155 ^ 145) ^ (48 ^ 23);
        lIIIIIlIIlI[78] = 51 ^ 29;
        lIIIIIlIIlI[79] = (((62 + 5) - 42) + 156) ^ (((44 + 153) - 186) + 143);
        lIIIIIlIIlI[80] = (((223 + 176) - 291) + 134) ^ (((50 + 89) - (-37)) + 18);
        lIIIIIlIIlI[81] = (((3 + 8) - (-87)) + 47) ^ (((41 + 75) - 7) + 51);
        lIIIIIlIIlI[82] = 170 ^ 153;
        lIIIIIlIIlI[83] = 172 ^ 152;
        lIIIIIlIIlI[84] = 191 ^ 138;
        lIIIIIlIIlI[85] = 24 ^ 46;
        lIIIIIlIIlI[86] = 57 ^ 14;
        lIIIIIlIIlI[87] = (((98 + 38) - 22) + 14) ^ (((120 + 78) - 160) + 146);
        lIIIIIlIIlI[88] = (116 ^ 59) ^ (93 ^ 43);
        lIIIIIlIIlI[89] = 87 ^ 109;
        lIIIIIlIIlI[90] = 100 ^ 95;
        lIIIIIlIIlI[91] = (59 ^ 92) ^ (216 ^ 131);
        lIIIIIlIIlI[92] = 34 ^ 31;
        lIIIIIlIIlI[93] = 11 ^ 53;
        lIIIIIlIIlI[94] = 123 ^ 68;
        lIIIIIlIIlI[95] = (233 ^ 168) ^ " ".length();
        lIIIIIlIIlI[96] = 212 ^ 149;
        lIIIIIlIIlI[97] = (114 ^ 96) ^ (44 ^ 124);
        lIIIIIlIIlI[98] = (-1061) & 3902;
        lIIIIIlIIlI[99] = (-9265) & 11839;
        lIIIIIlIIlI[100] = (-1417) & 3982;
        lIIIIIlIIlI[101] = (-((-15) & 26127)) & (-9) & 28670;
        lIIIIIlIIlI[102] = (-217) & 3071;
        lIIIIIlIIlI[103] = (-25601) & 28143;
        lIIIIIlIIlI[104] = (-((-3877) & 8119)) & (-16386) & 23483;
        lIIIIIlIIlI[105] = (-((-2381) & 7503)) & (-24657) & 32635;
        lIIIIIlIIlI[106] = (-4609) & 7137;
        lIIIIIlIIlI[107] = (-((-3641) & 20029)) & (-9217) & 28463;
        lIIIIIlIIlI[108] = (-25635) & 28159;
        lIIIIIlIIlI[109] = (-5313) & 8173;
        lIIIIIlIIlI[110] = (((128 + 180) - 158) + 58) ^ (((134 + 70) - 173) + 116);
        lIIIIIlIIlI[111] = 2 ^ 70;
        lIIIIIlIIlI[112] = (15 ^ 114) ^ (64 ^ 120);
        lIIIIIlIIlI[113] = 219 ^ 157;
        lIIIIIlIIlI[114] = 216 ^ 159;
        lIIIIIlIIlI[115] = (184 ^ 171) ^ (197 ^ 158);
        lIIIIIlIIlI[116] = (((97 + 198) - 108) + 35) ^ (((110 + 18) - (-7)) + 16);
        lIIIIIlIIlI[117] = 225 ^ 171;
        lIIIIIlIIlI[118] = 138 ^ 193;
        lIIIIIlIIlI[119] = 195 ^ 143;
        lIIIIIlIIlI[120] = (-((-3843) & 28471)) & (-1539) & 28670;
        lIIIIIlIIlI[121] = (-((-2097) & 15607)) & (-33) & 16382;
        lIIIIIlIIlI[122] = (((45 + 18) - 41) + 120) ^ (((104 + 142) - 136) + 85);
        lIIIIIlIIlI[123] = (254 ^ 166) ^ (105 ^ 127);
        lIIIIIlIIlI[124] = (((62 + 34) - 94) + 197) ^ (((111 + 88) - 113) + 50);
        lIIIIIlIIlI[125] = (37 ^ 24) ^ (29 ^ 112);
        lIIIIIlIIlI[126] = 89 ^ 8;
        lIIIIIlIIlI[127] = (92 ^ 88) ^ (216 ^ 142);
        lIIIIIlIIlI[128] = (69 ^ 46) ^ (92 ^ 100);
        lIIIIIlIIlI[129] = 45 ^ 121;
        lIIIIIlIIlI[130] = 38 ^ 115;
        lIIIIIlIIlI[131] = (73 ^ 22) ^ (54 ^ 63);
        lIIIIIlIIlI[132] = (78 ^ 60) ^ (0 ^ 37);
        lIIIIIlIIlI[133] = 90 ^ 2;
        lIIIIIlIIlI[134] = (((78 + 165) - 165) + 138) ^ (((119 + 38) - 32) + 4);
        lIIIIIlIIlI[135] = (75 ^ 115) ^ (236 ^ 142);
        lIIIIIlIIlI[136] = 86 ^ 13;
        lIIIIIlIIlI[137] = (166 ^ 161) ^ (6 ^ 93);
        lIIIIIlIIlI[138] = 60 ^ 97;
        lIIIIIlIIlI[139] = 105 ^ 55;
        lIIIIIlIIlI[140] = 68 ^ 27;
        lIIIIIlIIlI[141] = (139 ^ 133) ^ (19 ^ 125);
        lIIIIIlIIlI[142] = (((95 + 122) - 177) + 154) ^ (((84 + 36) - 73) + 116);
        lIIIIIlIIlI[143] = (73 ^ 40) ^ "   ".length();
        lIIIIIlIIlI[144] = 27 ^ 120;
        lIIIIIlIIlI[145] = 44 ^ 72;
        lIIIIIlIIlI[146] = 11 ^ 110;
        lIIIIIlIIlI[147] = (((177 + 163) - 134) + 2) ^ (((111 + 7) - (-59)) + 5);
        lIIIIIlIIlI[148] = 48 ^ 87;
        lIIIIIlIIlI[149] = 222 ^ 182;
        lIIIIIlIIlI[150] = 192 ^ 169;
        lIIIIIlIIlI[151] = (130 ^ 132) ^ (253 ^ 145);
        lIIIIIlIIlI[152] = 175 ^ 196;
        lIIIIIlIIlI[153] = (69 ^ 75) ^ (58 ^ 88);
        lIIIIIlIIlI[154] = (28 ^ 74) ^ (22 ^ 45);
        lIIIIIlIIlI[155] = (((41 + 95) - 121) + 179) ^ (((114 + 61) - 37) + 34);
        lIIIIIlIIlI[156] = 46 ^ 65;
        lIIIIIlIIlI[157] = (101 ^ 50) ^ (136 ^ 175);
        lIIIIIlIIlI[158] = 255 ^ 142;
        lIIIIIlIIlI[159] = (((183 + 123) - 193) + 118) ^ (((0 + 19) - (-113)) + 17);
        lIIIIIlIIlI[160] = (((176 + 204) - 259) + 90) ^ (((16 + 144) - 72) + 72);
        lIIIIIlIIlI[161] = (73 ^ 55) ^ (152 ^ 146);
        lIIIIIlIIlI[162] = (((180 + 141) - 284) + 215) ^ (((101 + 34) - 101) + 103);
        lIIIIIlIIlI[163] = 20 ^ 98;
        lIIIIIlIIlI[164] = (((208 + 85) - 205) + 123) ^ (((104 + 20) - 76) + 116);
        lIIIIIlIIlI[165] = 49 ^ 73;
        lIIIIIlIIlI[166] = 61 ^ 68;
        lIIIIIlIIlI[167] = (-123) & 2687;
        lIIIIIlIIlI[168] = (-((-13) & 25821)) & (-1) & 28662;
        lIIIIIlIIlI[169] = (-9553) & 12125;
        lIIIIIlIIlI[170] = (-12711) & 15287;
        lIIIIIlIIlI[171] = 222 ^ 164;
        lIIIIIlIIlI[172] = 254 ^ 133;
        lIIIIIlIIlI[173] = (((165 + 149) - 208) + 91) ^ (((51 + 147) - 165) + 152);
        lIIIIIlIIlI[174] = 213 ^ 168;
        lIIIIIlIIlI[175] = (5 ^ 114) ^ (169 ^ 160);
        lIIIIIlIIlI[176] = (((151 ^ 178) + (185 ^ 189)) - (54 ^ 45)) + (9 ^ 120);
        lIIIIIlIIlI[177] = ((63 + 58) - 99) + 106;
        lIIIIIlIIlI[178] = (-12563) & 15131;
        lIIIIIlIIlI[179] = (-9405) & 11967;
        lIIIIIlIIlI[180] = (-1219) & 4071;
        lIIIIIlIIlI[181] = (-((-6311) & 30887)) & (-1) & 27135;
        lIIIIIlIIlI[182] = (-25089) & 27643;
        lIIIIIlIIlI[183] = (-28673) & 31534;
        lIIIIIlIIlI[184] = ((20 + 29) - (-39)) + 41;
        lIIIIIlIIlI[185] = (((203 ^ 137) + (108 ^ 52)) - (116 ^ 2)) + (216 ^ 134);
        lIIIIIlIIlI[186] = ((101 + 127) - 192) + 95;
        lIIIIIlIIlI[187] = ((96 + 24) - 114) + 126;
        lIIIIIlIIlI[188] = (((102 ^ 64) + (40 ^ 64)) - (6 ^ 61)) + (74 ^ 120);
        lIIIIIlIIlI[189] = ((87 + 24) - 44) + 67;
        lIIIIIlIIlI[190] = ((64 + 111) - 126) + 86;
        lIIIIIlIIlI[191] = ((57 + 21) - (-51)) + 7;
        lIIIIIlIIlI[192] = (((221 ^ 170) + (45 ^ 72)) - (((154 + 109) - 252) + 145)) + (28 ^ 85);
        lIIIIIlIIlI[193] = ((94 + 100) - 148) + 92;
        lIIIIIlIIlI[194] = (((166 ^ 143) + (228 ^ 139)) - (86 ^ 48)) + (56 ^ 97);
        lIIIIIlIIlI[195] = ((86 + 31) - 113) + 136;
        lIIIIIlIIlI[196] = (((22 ^ 6) + (36 ^ 55)) - (-(56 ^ 1))) + (42 ^ 27);
        lIIIIIlIIlI[197] = (((77 ^ 4) + (101 ^ 86)) - (100 ^ 60)) + (230 ^ 140);
        lIIIIIlIIlI[198] = ((28 + 121) - 65) + 59;
        lIIIIIlIIlI[199] = (((11 ^ 38) + (250 ^ 150)) - (16 ^ 78)) + (240 ^ 165);
        lIIIIIlIIlI[200] = ((60 + 14) - 60) + 131;
        lIIIIIlIIlI[201] = (((101 ^ 71) + (234 ^ 179)) - (205 ^ 163)) + ((78 + 130) - 139) + 64;
        lIIIIIlIIlI[202] = (((((107 + 61) - 139) + 107) + (41 ^ 114)) - (((123 + 16) - 9) + 12)) + (111 ^ 81);
        lIIIIIlIIlI[203] = (((136 ^ 131) + (74 ^ 52)) - (((3 + 61) - 27) + 98)) + ((26 + 64) - 32) + 88;
        lIIIIIlIIlI[204] = (((214 ^ 164) + (85 ^ 23)) - (156 ^ 167)) + (84 ^ 72);
        lIIIIIlIIlI[205] = (((158 ^ 142) + (((86 + 115) - 144) + 71)) - (28 ^ 45)) + (82 ^ 101);
        lIIIIIlIIlI[206] = (((38 ^ 59) + (95 ^ 22)) - "   ".length()) + (23 ^ 35);
        lIIIIIlIIlI[207] = (((201 ^ 197) + (201 ^ 181)) - (25 ^ 52)) + (150 ^ 171);
        lIIIIIlIIlI[208] = ((104 + 38) - 26) + 37;
        lIIIIIlIIlI[209] = ((22 + 145) - 159) + 146;
        lIIIIIlIIlI[210] = ((50 + 50) - 70) + 125;
        lIIIIIlIIlI[211] = (((((98 + 34) - (-4)) + 14) + (209 ^ 130)) - (28 ^ 121)) + (216 ^ 192);
        lIIIIIlIIlI[212] = (((220 ^ 197) + (((133 + 90) - 97) + 8)) - (23 ^ 8)) + (7 ^ 26);
        lIIIIIlIIlI[213] = ((32 + 150) - 111) + 87;
        lIIIIIlIIlI[214] = ((157 + 105) - 212) + 109;
        lIIIIIlIIlI[215] = ((134 + 69) - 96) + 53;
        lIIIIIlIIlI[216] = ((35 + 130) - 113) + 109;
        lIIIIIlIIlI[217] = (((141 ^ 177) + (((123 + 106) - 186) + 101)) - (((8 + 14) - (-73)) + 98)) + ((43 + 71) - (-26)) + 11;
        lIIIIIlIIlI[218] = (((91 ^ 63) + (45 ^ 30)) - (2 ^ 100)) + (222 ^ 172);
        lIIIIIlIIlI[219] = (((242 ^ 176) + (149 ^ 155)) - (82 ^ 77)) + (106 ^ 25);
        lIIIIIlIIlI[220] = ((128 + 132) - 172) + 77;
        lIIIIIlIIlI[221] = ((70 + 59) - 17) + 54;
        lIIIIIlIIlI[222] = ((51 + 4) - (-16)) + 96;
        lIIIIIlIIlI[223] = ((123 + 147) - 268) + 166;
        lIIIIIlIIlI[224] = ((90 + 88) - 62) + 53;
        lIIIIIlIIlI[225] = (((((153 + 80) - 90) + 16) + (15 ^ 56)) - (((42 + 158) - 131) + 104)) + ((88 + 11) - 6) + 36;
        lIIIIIlIIlI[226] = (((((76 + 17) - (-29)) + 15) + (((126 + 40) - 84) + 45)) - (((172 + 194) - 223) + 72)) + (207 ^ 181);
        lIIIIIlIIlI[227] = ((113 + 69) - 162) + 152;
        lIIIIIlIIlI[228] = (((8 ^ 55) + (((135 + 133) - 215) + 110)) - (7 ^ 70)) + (185 ^ 181);
        lIIIIIlIIlI[229] = ((143 + 41) - 140) + 130;
        lIIIIIlIIlI[230] = ((166 + 116) - 220) + 113;
        lIIIIIlIIlI[231] = (((56 ^ 104) + "  ".length()) - (-(162 ^ 148))) + (152 ^ 176);
        lIIIIIlIIlI[232] = (((((130 + 158) - 213) + 100) + (((140 + 133) - 152) + 40)) - (((19 + 187) - 22) + 48)) + (39 ^ 110);
        lIIIIIlIIlI[233] = (((((104 + 99) - 152) + 76) + (((115 + 57) - 59) + 40)) - (((117 + 206) - 184) + 104)) + ((125 + 65) - 185) + 136;
        lIIIIIlIIlI[234] = (((((76 + 59) - (-4)) + 33) + (((81 + 69) - 13) + 13)) - ((-22193) & 22456)) + (187 ^ 194);
        lIIIIIlIIlI[235] = (((((14 + 147) - 113) + 109) + (236 ^ 148)) - (((61 + 191) - 97) + 86)) + ((28 + 101) - 3) + 18;
        lIIIIIlIIlI[236] = ((90 + 57) - 62) + 96;
        lIIIIIlIIlI[237] = (((208 ^ 158) + (((125 + 129) - 244) + 149)) - (143 ^ 197)) + (12 ^ 31);
        lIIIIIlIIlI[238] = (((((10 + 125) - 61) + 61) + (107 ^ 127)) - (64 ^ 125)) + (67 ^ 26);
        lIIIIIlIIlI[239] = ((25 + 88) - 64) + 135;
        lIIIIIlIIlI[240] = (((((119 + 72) - 82) + 21) + (((100 + 109) - 165) + 126)) - (((4 + 113) - (-4)) + 27)) + (118 ^ 87);
        lIIIIIlIIlI[241] = ((66 + 9) - (-80)) + 31;
        lIIIIIlIIlI[242] = ((73 + 5) - 41) + 150;
        lIIIIIlIIlI[243] = ((45 + 76) - 22) + 89;
        lIIIIIlIIlI[244] = (-29992) & 30511;
        lIIIIIlIIlI[245] = (-((-11843) & 16127)) & (-2561) & 32764;
        lIIIIIlIIlI[246] = (-89) & 2008;
        lIIIIIlIIlI[247] = (-((-12969) & 29355)) & (-4385) & 32750;
        lIIIIIlIIlI[248] = (-((-12721) & 16375)) & (-4097) & 32750;
        lIIIIIlIIlI[249] = (-18561) & 20460;
        lIIIIIlIIlI[250] = (((71 ^ 90) + (((32 + 1) - (-7)) + 138)) - (((93 + 134) - 75) + 47)) + ((7 + 0) - (-28)) + 146;
        lIIIIIlIIlI[251] = ((53 + 87) - 29) + 79;
        lIIIIIlIIlI[252] = (-((-18693) & 32045)) & (-16385) & 32767;
        lIIIIIlIIlI[253] = (-((-11) & 16939)) & (-4100) & 24299;
        lIIIIIlIIlI[254] = (-20609) & 23519;
        lIIIIIlIIlI[255] = (-((-5267) & 30199)) & (-3) & 28159;
        lIIIIIlIIlI[256] = (-1153) & 4012;
        lIIIIIlIIlI[257] = (-28681) & 31231;
        lIIIIIlIIlI[258] = (-26116) & 28655;
        lIIIIIlIIlI[259] = (-9285) & 12142;
        lIIIIIlIIlI[260] = (-29713) & 32282;
        lIIIIIlIIlI[261] = (-17478) & 20309;
        lIIIIIlIIlI[262] = (((59 ^ 2) + (92 ^ 77)) - (-(32 ^ 120))) + (30 ^ 3);
        lIIIIIlIIlI[263] = (((66 ^ 99) + (27 ^ 20)) - (-(45 ^ 26))) + (79 ^ 22);
        lIIIIIlIIlI[264] = ((59 + 181) - 61) + 14;
        lIIIIIlIIlI[265] = ((11 + 57) - (-102)) + 24;
        lIIIIIlIIlI[266] = (((55 ^ 115) + (((14 + 5) - (-122)) + 48)) - (243 ^ 170)) + (25 ^ 2);
        lIIIIIlIIlI[267] = ((157 + 44) - 64) + 59;
        lIIIIIlIIlI[268] = (((94 ^ 3) + (((83 + 143) - 73) + 1)) - (((6 + 104) - 85) + 206)) + ((45 + 123) - 86) + 99;
        lIIIIIlIIlI[269] = ((178 + 31) - 16) + 5;
        lIIIIIlIIlI[270] = ((110 + 63) - 120) + 146;
        lIIIIIlIIlI[271] = ((64 + 116) - 124) + 144;
        lIIIIIlIIlI[272] = (((128 ^ 158) + (((92 + 52) - 15) + 3)) - (180 ^ 144)) + (101 ^ 46);
        lIIIIIlIIlI[273] = ((110 + 7) - (-78)) + 7;
        lIIIIIlIIlI[274] = (((124 ^ 64) + (246 ^ 131)) - (104 ^ 5)) + ((83 + 54) - 53) + 51;
        lIIIIIlIIlI[275] = ((137 + 100) - 213) + 180;
        lIIIIIlIIlI[276] = (((4 ^ 74) + (((68 + 157) - 118) + 62)) - (241 ^ 176)) + (51 ^ 36);
        lIIIIIlIIlI[277] = ((135 + 63) - 67) + 75;
        lIIIIIlIIlI[278] = ((170 + 159) - 310) + 188;
        lIIIIIlIIlI[279] = (((((102 + 51) - 55) + 40) + (186 ^ 160)) - (((144 + 79) - 156) + 94)) + ((91 + 131) - 166) + 149;
        lIIIIIlIIlI[280] = ((68 + 19) - 26) + 148;
    }

    static {
        llIlllIlIIlII();
        llIlllIlIIIlI();
        bu = new ArrayList();
        gf = new WorldPoint(lIIIIIlIIlI[252], lIIIIIlIIlI[253], lIIIIIlIIlI[9]);
        bY = new WorldPoint(lIIIIIlIIlI[254], lIIIIIlIIlI[255], lIIIIIlIIlI[9]);
        ih = new WorldPoint(lIIIIIlIIlI[46], lIIIIIlIIlI[47], lIIIIIlIIlI[9]);
        ii = new WorldPoint(lIIIIIlIIlI[182], lIIIIIlIIlI[105], lIIIIIlIIlI[9]);
        ij = new WorldPoint(lIIIIIlIIlI[101], lIIIIIlIIlI[183], lIIIIIlIIlI[9]);
        ik = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[121], lIIIIIlIIlI[9]);
        il = new WorldPoint(lIIIIIlIIlI[108], lIIIIIlIIlI[256], lIIIIIlIIlI[9]);
        im = new WorldArea(lIIIIIlIIlI[257], lIIIIIlIIlI[34], lIIIIIlIIlI[17], lIIIIIlIIlI[23], lIIIIIlIIlI[4]);
        in = new WorldArea(lIIIIIlIIlI[258], lIIIIIlIIlI[259], lIIIIIlIIlI[23], lIIIIIlIIlI[23], lIIIIIlIIlI[4]);
        io = new WorldArea(lIIIIIlIIlI[260], lIIIIIlIIlI[261], lIIIIIlIIlI[24], lIIIIIlIIlI[23], lIIIIIlIIlI[4]);
        String[] strArr = new String[lIIIIIlIIlI[50]];
        strArr[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[262]];
        strArr[lIIIIIlIIlI[4]] = lIIIIIIlllI[lIIIIIlIIlI[263]];
        strArr[lIIIIIlIIlI[5]] = lIIIIIIlllI[lIIIIIlIIlI[264]];
        strArr[lIIIIIlIIlI[6]] = lIIIIIIlllI[lIIIIIlIIlI[265]];
        strArr[lIIIIIlIIlI[7]] = lIIIIIIlllI[lIIIIIlIIlI[266]];
        strArr[lIIIIIlIIlI[11]] = lIIIIIIlllI[lIIIIIlIIlI[267]];
        strArr[lIIIIIlIIlI[8]] = lIIIIIIlllI[lIIIIIlIIlI[268]];
        strArr[lIIIIIlIIlI[21]] = lIIIIIIlllI[lIIIIIlIIlI[269]];
        strArr[lIIIIIlIIlI[22]] = lIIIIIIlllI[lIIIIIlIIlI[270]];
        strArr[lIIIIIlIIlI[23]] = lIIIIIIlllI[lIIIIIlIIlI[271]];
        strArr[lIIIIIlIIlI[17]] = lIIIIIIlllI[lIIIIIlIIlI[272]];
        strArr[lIIIIIlIIlI[27]] = lIIIIIIlllI[lIIIIIlIIlI[273]];
        strArr[lIIIIIlIIlI[28]] = lIIIIIIlllI[lIIIIIlIIlI[274]];
        strArr[lIIIIIlIIlI[29]] = lIIIIIIlllI[lIIIIIlIIlI[275]];
        strArr[lIIIIIlIIlI[30]] = lIIIIIIlllI[lIIIIIlIIlI[276]];
        strArr[lIIIIIlIIlI[24]] = lIIIIIIlllI[lIIIIIlIIlI[277]];
        strArr[lIIIIIlIIlI[48]] = lIIIIIIlllI[lIIIIIlIIlI[278]];
        strArr[lIIIIIlIIlI[49]] = lIIIIIIlllI[lIIIIIlIIlI[279]];
        bQ = strArr;
        iB = lIIIIIlIIlI[9];
    }

    private static String llIlllIIllIII(String lllllllllllllllllIIllllIIIIIIIlI, String lllllllllllllllllIIllllIIIIIIIIl) {
        String lllllllllllllllllIIllllIIIIIIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllllIIllllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllllIIlllIlllllllll = lllllllllllllllllIIllllIIIIIIIIl.toCharArray();
        int lllllllllllllllllIIlllIllllllllI = lIIIIIlIIlI[9];
        char[] charArray = lllllllllllllllllIIllllIIIIIIIlI2.toCharArray();
        int length = charArray.length;
        int i = lIIIIIlIIlI[9];
        while (llIlllIlIlIII(i, length)) {
            char lllllllllllllllllIIlllIlllllIlIl = charArray[i];
            sb.append((char) (lllllllllllllllllIIlllIlllllIlIl ^ lllllllllllllllllIIlllIlllllllll[lllllllllllllllllIIlllIllllllllI % lllllllllllllllllIIlllIlllllllll.length]));
            "".length();
            lllllllllllllllllIIlllIllllllllI++;
            i++;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlllIlIllll(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[91]) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            ?? r0 = lIIIIIlIIlI[4];
            "".length();
            return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIIIlIIlI[9];
    }

    /* JADX WARN: Code restructure failed: missing block: B:387:0x175b, code lost:
        if (llIlllIlIlIlI(net.unethicalite.api.entities.TileObjects.getNearest(r0)) != false) goto L408;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1010, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1090, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1171, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1236, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1266, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1336, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1489, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1511, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1513, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1515, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1517, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1519, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1521, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1523, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1525, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1527, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1529, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1531, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1533, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1535, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1537, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1539, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1541, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1543, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1545, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1547, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1549, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1551, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1553, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1555, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1557, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v156, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v662, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v706, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v789, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v940, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dj() {
        System.out.println("6073: " + Vars.getBit(lIIIIIlIIlI[0]));
        System.out.println("6072: " + Vars.getBit(lIIIIIlIIlI[1]));
        System.out.println("6074: " + Vars.getBit(lIIIIIlIIlI[2]));
        System.out.println("6075: " + Vars.getBit(lIIIIIlIIlI[3]));
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[3]), lIIIIIlIIlI[4])) {
            ip = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[1]), lIIIIIlIIlI[4])) {
            ir = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[1]), lIIIIIlIIlI[5])) {
            ir = lIIIIIlIIlI[4];
            iw = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[1]), lIIIIIlIIlI[6])) {
            ir = lIIIIIlIIlI[4];
            iz = lIIIIIlIIlI[4];
            iw = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[0]), lIIIIIlIIlI[4])) {
            is = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[0]), lIIIIIlIIlI[5])) {
            iv = lIIIIIlIIlI[4];
            is = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[0]), lIIIIIlIIlI[6])) {
            iv = lIIIIIlIIlI[4];
            ix = lIIIIIlIIlI[4];
            is = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[2]), lIIIIIlIIlI[5])) {
            iq = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[2]), lIIIIIlIIlI[6])) {
            it = lIIIIIlIIlI[4];
            iq = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[2]), lIIIIIlIIlI[7])) {
            iu = lIIIIIlIIlI[4];
            iq = lIIIIIlIIlI[4];
            it = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIllI(Vars.getBit(lIIIIIlIIlI[2]), lIIIIIlIIlI[8])) {
            iu = lIIIIIlIIlI[4];
            iq = lIIIIIlIIlI[4];
            iy = lIIIIIlIIlI[4];
            it = lIIIIIlIIlI[4];
        }
        if (llIlllIlIIlll(bs ? 1 : 0)) {
            C0001b.a(bu);
            if (llIlllIlIlIII(bu.size(), lIIIIIlIIlI[4])) {
                System.out.println(lIIIIIIlllI[lIIIIIlIIlI[9]]);
                bs = lIIIIIlIIlI[9];
            }
        }
        if (llIlllIlIlIIl(bs ? 1 : 0)) {
            if (llIlllIlIlIIl(aa() ? 1 : 0) && llIlllIlIlIIl(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlllIlIlIlI(nearest) && llIlllIlIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[4]];
                    C0000a.a(nearest);
                }
                if (llIlllIlIlIlI(nearest) && llIlllIlIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlllIlIlIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIIIlIIlI[10]);
                        "".length();
                    }
                    if (llIlllIlIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[5]];
                        if (llIlllIlIlIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIIIlIIlI[7]);
                            "".length();
                        }
                        if (llIlllIlIlIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIIIlIIlI[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIIIlIIlI[11]];
                        iArr[lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
                        iArr[lIIIIIlIIlI[4]] = lIIIIIlIIlI[13];
                        iArr[lIIIIIlIIlI[5]] = lIIIIIlIIlI[14];
                        iArr[lIIIIIlIIlI[6]] = lIIIIIlIIlI[15];
                        iArr[lIIIIIlIIlI[7]] = lIIIIIlIIlI[16];
                        if (llIlllIlIlIIl(C0004e.b(iArr) ? 1 : 0)) {
                            ae();
                            System.out.println(lIIIIIIlllI[lIIIIIlIIlI[6]]);
                            bs = lIIIIIlIIlI[4];
                            return;
                        }
                        int[] iArr2 = new int[lIIIIIlIIlI[11]];
                        iArr2[lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
                        iArr2[lIIIIIlIIlI[4]] = lIIIIIlIIlI[13];
                        iArr2[lIIIIIlIIlI[5]] = lIIIIIlIIlI[14];
                        iArr2[lIIIIIlIIlI[6]] = lIIIIIlIIlI[15];
                        iArr2[lIIIIIlIIlI[7]] = lIIIIIlIIlI[16];
                        if (llIlllIlIIlll(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIIIIlIIlI[12], lIIIIIlIIlI[17]);
                            C0000a.a(lIIIIIlIIlI[13], lIIIIIlIIlI[17]);
                            C0000a.a(lIIIIIlIIlI[14], lIIIIIlIIlI[4]);
                            C0000a.a(lIIIIIlIIlI[16], lIIIIIlIIlI[4]);
                            C0000a.a(lIIIIIlIIlI[15], lIIIIIlIIlI[5]);
                            C0000a.a(lIIIIIlIIlI[18], lIIIIIlIIlI[17]);
                            C0000a.a(lIIIIIlIIlI[19], lIIIIIlIIlI[4]);
                        }
                    }
                }
            }
            if (llIlllIlIIlll(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlllIlIlIII(Movement.getRunEnergy(), lIIIIIlIIlI[20])) {
                Inventory.getFirst(C0005f.aU).interact(lIIIIIIlllI[lIIIIIlIIlI[7]]);
                Time.sleepTicks(lIIIIIlIIlI[4]);
                "".length();
            }
            if (llIlllIlIIlll(aa() ? 1 : 0) && llIlllIlIlIIl(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()))) {
                if (llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(gf), lIIIIIlIIlI[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[11]];
                    if (llIlllIlIIlll(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(gf);
                    "".length();
                    Time.sleepTicks(lIIIIIlIIlI[4]);
                    "".length();
                }
                if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(gf), lIIIIIlIIlI[17])) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[8]];
                    C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[21]], bQ);
                }
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[11])) {
                C0006g.a(bQ);
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[17])) {
                if (llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(bY), lIIIIIlIIlI[11])) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[22]];
                    Movement.walkTo(bY);
                    "".length();
                    Time.sleepTicks(lIIIIIlIIlI[4]);
                    "".length();
                }
                if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(bY), lIIIIIlIIlI[11])) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[23]];
                    C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[17]], bQ);
                }
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[24])) {
                ck = lIIIIIlIIlI[9];
                if (llIlllIlIIlll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[26], lIIIIIlIIlI[4])) ? 1 : 0)) {
                    String[] strArr = new String[lIIIIIlIIlI[4]];
                    strArr[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[27]];
                    TileObjects.getNearest(strArr).interact(lIIIIIIlllI[lIIIIIlIIlI[28]]);
                    Time.sleepTicks(lIIIIIlIIlI[5]);
                    "".length();
                }
                if (llIlllIlIlIIl(ip ? 1 : 0)) {
                    if (llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIIIIlIIlI[4]];
                        strArr2[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[29]];
                        TileObjects.getNearest(strArr2).interact(lIIIIIIlllI[lIIIIIlIIlI[30]]);
                        Time.sleepTicks(lIIIIIlIIlI[6]);
                        "".length();
                    }
                    if (llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                        String[] strArr3 = new String[lIIIIIlIIlI[4]];
                        strArr3[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[24]];
                        if (llIlllIlIlllI(NPCs.getNearest(strArr3)) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint[] worldPointArr = new WorldPoint[lIIIIIlIIlI[17]];
                            worldPointArr[lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[31], lIIIIIlIIlI[9]);
                            worldPointArr[lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[32], lIIIIIlIIlI[9]);
                            worldPointArr[lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[33], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                            worldPointArr[lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[35], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                            worldPointArr[lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[36], lIIIIIlIIlI[37], lIIIIIlIIlI[9]);
                            worldPointArr[lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[38], lIIIIIlIIlI[39], lIIIIIlIIlI[9]);
                            worldPointArr[lIIIIIlIIlI[8]] = new WorldPoint(lIIIIIlIIlI[40], lIIIIIlIIlI[41], lIIIIIlIIlI[9]);
                            worldPointArr[lIIIIIlIIlI[21]] = new WorldPoint(lIIIIIlIIlI[42], lIIIIIlIIlI[43], lIIIIIlIIlI[9]);
                            worldPointArr[lIIIIIlIIlI[22]] = new WorldPoint(lIIIIIlIIlI[44], lIIIIIlIIlI[45], lIIIIIlIIlI[9]);
                            worldPointArr[lIIIIIlIIlI[23]] = new WorldPoint(lIIIIIlIIlI[46], lIIIIIlIIlI[47], lIIIIIlIIlI[9]);
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[48]];
                            Walker.walkAlong(Arrays.asList(worldPointArr), new HashMap());
                            "".length();
                            Time.sleepTicks(lIIIIIlIIlI[4]);
                            "".length();
                        }
                    }
                    if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[49]];
                        String[] strArr4 = new String[lIIIIIlIIlI[4]];
                        strArr4[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[50]];
                        if (llIlllIlIlllI(NPCs.getNearest(strArr4))) {
                            String[] strArr5 = new String[lIIIIIlIIlI[4]];
                            strArr5[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[51]];
                            TileObjects.getNearest(strArr5).interact(lIIIIIIlllI[lIIIIIlIIlI[52]]);
                            Time.sleepTicks(lIIIIIlIIlI[6]);
                            "".length();
                        }
                        C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[53]], bQ);
                    }
                    String[] strArr6 = new String[lIIIIIlIIlI[4]];
                    strArr6[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[54]];
                    if (llIlllIlIlIlI(NPCs.getNearest(strArr6))) {
                        String text = Dialog.getText();
                        if (llIlllIlIlIlI(text) && llIlllIlIIlll(text.contains(lIIIIIIlllI[lIIIIIlIIlI[55]]) ? 1 : 0)) {
                            ip = lIIIIIlIIlI[4];
                        }
                        C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[56]], bQ);
                    }
                }
                if (llIlllIlIlIIl(iq ? 1 : 0) && llIlllIlIIlll(ip ? 1 : 0)) {
                    String[] strArr7 = new String[lIIIIIlIIlI[4]];
                    strArr7[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[57]];
                    if (llIlllIlIlIlI(NPCs.getNearest(strArr7))) {
                        String[] strArr8 = new String[lIIIIIlIIlI[4]];
                        strArr8[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[58]];
                        TileObjects.getNearest(strArr8).interact(lIIIIIIlllI[lIIIIIlIIlI[59]]);
                        Time.sleepTicks(lIIIIIlIIlI[6]);
                        "".length();
                    }
                    if (llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr9 = new String[lIIIIIlIIlI[4]];
                        strArr9[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[60]];
                        if (llIlllIlIlllI(NPCs.getNearest(strArr9)) && llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[6])) {
                            String[] strArr10 = new String[lIIIIIlIIlI[4]];
                            strArr10[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[61]];
                            if (llIlllIlIlllI(NPCs.getNearest(strArr10))) {
                                AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[62]];
                                Movement.walkTo(ii);
                                "".length();
                                Time.sleepTicks(lIIIIIlIIlI[4]);
                                "".length();
                            }
                        }
                        if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[6])) {
                            String[] strArr11 = new String[lIIIIIlIIlI[4]];
                            strArr11[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[63]];
                            if (llIlllIlIlllI(NPCs.getNearest(strArr11)) && llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] strArr12 = new String[lIIIIIlIIlI[4]];
                                strArr12[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[64]];
                                TileObjects.getNearest(strArr12).interact(lIIIIIIlllI[lIIIIIlIIlI[65]]);
                            }
                        }
                    }
                    if (llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr13 = new String[lIIIIIlIIlI[4]];
                        strArr13[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[66]];
                        if (llIlllIlIlIlI(NPCs.getNearest(strArr13))) {
                            String text2 = Dialog.getText();
                            if (llIlllIlIlIlI(text2) && llIlllIlIIlll(text2.contains(lIIIIIIlllI[lIIIIIlIIlI[67]]) ? 1 : 0)) {
                                iq = lIIIIIlIIlI[4];
                            }
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[68]];
                            C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[69]], bQ);
                        }
                    }
                }
                if (llIlllIlIlIIl(ir ? 1 : 0) && llIlllIlIIlll(iq ? 1 : 0) && llIlllIlIIlll(ip ? 1 : 0) && llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr14 = new String[lIIIIIlIIlI[4]];
                    strArr14[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[70]];
                    if (llIlllIlIlIlI(NPCs.getNearest(strArr14))) {
                        List options = Dialog.getOptions();
                        if (llIlllIlIlIIl(options.isEmpty() ? 1 : 0) && llIlllIlIIlll(options.contains(lIIIIIIlllI[lIIIIIlIIlI[71]]) ? 1 : 0)) {
                            ir = lIIIIIlIIlI[4];
                        }
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[72]];
                        C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[73]], bQ);
                    }
                }
                if (llIlllIlIlIIl(is ? 1 : 0) && llIlllIlIIlll(ir ? 1 : 0) && llIlllIlIIlll(iq ? 1 : 0) && llIlllIlIIlll(ip ? 1 : 0)) {
                    if (llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr15 = new String[lIIIIIlIIlI[4]];
                            strArr15[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[74]];
                            TileObjects.getNearest(strArr15).interact(lIIIIIIlllI[lIIIIIlIIlI[75]]);
                            Time.sleepTicks(lIIIIIlIIlI[6]);
                            "".length();
                        }
                        if (llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6]) && llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[76]];
                            Movement.walkTo(ij);
                            "".length();
                            Time.sleepTicks(lIIIIIlIIlI[4]);
                            "".length();
                        }
                        if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6])) {
                            String[] strArr16 = new String[lIIIIIlIIlI[4]];
                            strArr16[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[77]];
                            if (llIlllIlIlllI(NPCs.getNearest(strArr16)) && llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] strArr17 = new String[lIIIIIlIIlI[4]];
                                strArr17[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[78]];
                                TileObjects.getNearest(strArr17).interact(lIIIIIIlllI[lIIIIIlIIlI[79]]);
                            }
                        }
                    }
                    if (llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr18 = new String[lIIIIIlIIlI[4]];
                        strArr18[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[80]];
                        if (llIlllIlIlIlI(NPCs.getNearest(strArr18))) {
                            List options2 = Dialog.getOptions();
                            if (llIlllIlIlIIl(options2.isEmpty() ? 1 : 0)) {
                                int i = lIIIIIlIIlI[9];
                                while (llIlllIlIlIII(i, options2.size())) {
                                    if (llIlllIlIIlll(((Widget) options2.get(i)).getText().contains(lIIIIIIlllI[lIIIIIlIIlI[81]]) ? 1 : 0)) {
                                        System.out.println(lIIIIIIlllI[lIIIIIlIIlI[20]]);
                                        is = lIIIIIlIIlI[4];
                                    }
                                    i++;
                                    "".length();
                                    if ("   ".length() == ((54 ^ 1) & ((24 ^ 47) ^ (-1)))) {
                                        return;
                                    }
                                }
                            }
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[82]];
                            C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[83]], bQ);
                        }
                    }
                }
                if (llIlllIlIlIIl(it ? 1 : 0) && llIlllIlIIlll(is ? 1 : 0) && llIlllIlIIlll(ir ? 1 : 0) && llIlllIlIIlll(iq ? 1 : 0) && llIlllIlIIlll(ip ? 1 : 0)) {
                    if (llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[84]];
                        String[] strArr19 = new String[lIIIIIlIIlI[4]];
                        strArr19[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[85]];
                        TileObjects.getNearest(strArr19).interact(lIIIIIIlllI[lIIIIIlIIlI[86]]);
                        Time.sleepTicks(lIIIIIlIIlI[6]);
                        "".length();
                    }
                    if (llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIlllIlIllII(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6])) {
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[87]];
                            Movement.walkTo(ik);
                            "".length();
                            Time.sleepTicks(lIIIIIlIIlI[4]);
                            "".length();
                        }
                        if (llIlllIlIllIl(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6]) && llIlllIlIlIIl(Players.getLocal().getWorldLocation().getPlane()) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr20 = new String[lIIIIIlIIlI[4]];
                            strArr20[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[88]];
                            TileObjects.getNearest(strArr20).interact(lIIIIIIlllI[lIIIIIlIIlI[89]]);
                            Time.sleepTicks(lIIIIIlIIlI[8]);
                            "".length();
                        }
                    }
                    if (llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[90]];
                        C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[91]], bQ);
                        List options3 = Dialog.getOptions();
                        if (llIlllIlIlIIl(options3.isEmpty() ? 1 : 0)) {
                            int i2 = lIIIIIlIIlI[9];
                            while (llIlllIlIlIII(i2, options3.size())) {
                                if (llIlllIlIIlll(((Widget) options3.get(i2)).getText().contains(lIIIIIIlllI[lIIIIIlIIlI[92]]) ? 1 : 0)) {
                                    System.out.println(lIIIIIIlllI[lIIIIIlIIlI[93]]);
                                    it = lIIIIIlIIlI[4];
                                }
                                i2++;
                                "".length();
                                if ("  ".length() < 0) {
                                    return;
                                }
                            }
                        }
                    }
                }
                if (llIlllIlIlIIl(iu ? 1 : 0) && llIlllIlIIlll(it ? 1 : 0) && llIlllIlIIlll(is ? 1 : 0) && llIlllIlIIlll(ir ? 1 : 0) && llIlllIlIIlll(iq ? 1 : 0) && llIlllIlIIlll(ip ? 1 : 0)) {
                    if (llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr21 = new String[lIIIIIlIIlI[4]];
                        strArr21[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[94]];
                        TileObjects.getNearest(strArr21).interact(lIIIIIIlllI[lIIIIIlIIlI[95]]);
                        Time.sleepTicks(lIIIIIlIIlI[11]);
                        "".length();
                    }
                    if (llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr22 = new String[lIIIIIlIIlI[4]];
                        strArr22[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[96]];
                        if (llIlllIlIlllI(NPCs.getNearest(strArr22))) {
                            if (llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(il), lIIIIIlIIlI[7])) {
                                AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[97]];
                                WorldPoint[] worldPointArr2 = new WorldPoint[lIIIIIlIIlI[17]];
                                worldPointArr2[lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[98], lIIIIIlIIlI[9]);
                                worldPointArr2[lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[32], lIIIIIlIIlI[9]);
                                worldPointArr2[lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[99], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                                worldPointArr2[lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[100], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                                worldPointArr2[lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[36], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                                worldPointArr2[lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[101], lIIIIIlIIlI[102], lIIIIIlIIlI[9]);
                                worldPointArr2[lIIIIIlIIlI[8]] = new WorldPoint(lIIIIIlIIlI[103], lIIIIIlIIlI[104], lIIIIIlIIlI[9]);
                                worldPointArr2[lIIIIIlIIlI[21]] = new WorldPoint(lIIIIIlIIlI[42], lIIIIIlIIlI[105], lIIIIIlIIlI[9]);
                                worldPointArr2[lIIIIIlIIlI[22]] = new WorldPoint(lIIIIIlIIlI[106], lIIIIIlIIlI[107], lIIIIIlIIlI[9]);
                                worldPointArr2[lIIIIIlIIlI[23]] = new WorldPoint(lIIIIIlIIlI[108], lIIIIIlIIlI[109], lIIIIIlIIlI[9]);
                                Walker.walkAlong(Arrays.asList(worldPointArr2), new HashMap());
                                "".length();
                                Time.sleepTicks(lIIIIIlIIlI[4]);
                                "".length();
                            }
                            if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(il), lIIIIIlIIlI[7])) {
                                String[] strArr23 = new String[lIIIIIlIIlI[4]];
                                strArr23[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[110]];
                                TileObjects.getNearest(strArr23).interact(lIIIIIIlllI[lIIIIIlIIlI[111]]);
                                Time.sleepTicks(lIIIIIlIIlI[6]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr24 = new String[lIIIIIlIIlI[4]];
                    strArr24[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[112]];
                    if (llIlllIlIlIlI(NPCs.getNearest(strArr24))) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[113]];
                        C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[114]], bQ);
                        List options4 = Dialog.getOptions();
                        if (llIlllIlIlIIl(options4.isEmpty() ? 1 : 0)) {
                            int i3 = lIIIIIlIIlI[9];
                            while (llIlllIlIlIII(i3, options4.size())) {
                                if (llIlllIlIIlll(((Widget) options4.get(i3)).getText().contains(lIIIIIIlllI[lIIIIIlIIlI[115]]) ? 1 : 0)) {
                                    System.out.println(lIIIIIIlllI[lIIIIIlIIlI[116]]);
                                    iu = lIIIIIlIIlI[4];
                                }
                                i3++;
                                "".length();
                                if ((-" ".length()) > "  ".length()) {
                                    return;
                                }
                            }
                        }
                    }
                }
                if (llIlllIlIlIIl(iv ? 1 : 0) && llIlllIlIIlll(iu ? 1 : 0) && llIlllIlIIlll(it ? 1 : 0) && llIlllIlIIlll(is ? 1 : 0) && llIlllIlIIlll(ir ? 1 : 0) && llIlllIlIIlll(iq ? 1 : 0) && llIlllIlIIlll(ip ? 1 : 0)) {
                    String[] strArr25 = new String[lIIIIIlIIlI[4]];
                    strArr25[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[117]];
                    if (llIlllIlIlIlI(NPCs.getNearest(strArr25))) {
                        String[] strArr26 = new String[lIIIIIlIIlI[4]];
                        strArr26[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[118]];
                        TileObjects.getNearest(strArr26).interact(lIIIIIIlllI[lIIIIIlIIlI[119]]);
                        Time.sleepTicks(lIIIIIlIIlI[6]);
                        "".length();
                    }
                    WorldPoint worldPoint = new WorldPoint(lIIIIIlIIlI[120], lIIIIIlIIlI[121], lIIIIIlIIlI[9]);
                    String[] strArr27 = new String[lIIIIIlIIlI[4]];
                    strArr27[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[122]];
                    if (llIlllIlIlllI(NPCs.getNearest(strArr27))) {
                        if (llIlllIlIlIIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[123]];
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(lIIIIIlIIlI[4]);
                            "".length();
                        }
                        if (llIlllIlIIlll(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0) && llIlllIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                            if (llIlllIlIlIII(iB, lIIIIIlIIlI[5])) {
                                String[] strArr28 = new String[lIIIIIlIIlI[4]];
                                strArr28[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[124]];
                                Inventory.getFirst(strArr28).interact(lIIIIIIlllI[lIIIIIlIIlI[125]]);
                                Time.sleepTicks(lIIIIIlIIlI[7]);
                                "".length();
                                iB += lIIIIIlIIlI[4];
                            }
                            if (llIlllIlIIllI(iB, lIIIIIlIIlI[5])) {
                                iv = lIIIIIlIIlI[4];
                            }
                        }
                    }
                }
                if (llIlllIlIlIIl(iw ? 1 : 0) && llIlllIlIIlll(iv ? 1 : 0) && llIlllIlIIlll(iu ? 1 : 0) && llIlllIlIIlll(it ? 1 : 0) && llIlllIlIIlll(is ? 1 : 0) && llIlllIlIIlll(ir ? 1 : 0) && llIlllIlIIlll(iq ? 1 : 0) && llIlllIlIIlll(ip ? 1 : 0)) {
                    if (llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                        String[] strArr29 = new String[lIIIIIlIIlI[4]];
                        strArr29[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[126]];
                        if (llIlllIlIlllI(NPCs.getNearest(strArr29))) {
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[127]];
                            Movement.walkTo(ih);
                            "".length();
                            Time.sleepTicks(lIIIIIlIIlI[4]);
                            "".length();
                        }
                    }
                    if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                        String[] strArr30 = new String[lIIIIIlIIlI[4]];
                        strArr30[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[128]];
                        if (llIlllIlIlllI(TileObjects.getNearest(strArr30))) {
                            String[] strArr31 = new String[lIIIIIlIIlI[4]];
                            strArr31[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[129]];
                            TileObjects.getNearest(strArr31).interact(lIIIIIIlllI[lIIIIIlIIlI[130]]);
                            Time.sleepTicks(lIIIIIlIIlI[7]);
                            "".length();
                        }
                    }
                    if (llIlllIlIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr32 = new String[lIIIIIlIIlI[4]];
                        strArr32[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[131]];
                        if (llIlllIlIlIlI(TileObjects.getNearest(strArr32))) {
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[132]];
                            String[] strArr33 = new String[lIIIIIlIIlI[4]];
                            strArr33[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[133]];
                            TileObjects.getNearest(strArr33).interact(lIIIIIIlllI[lIIIIIlIIlI[134]]);
                            Time.sleepTicks(lIIIIIlIIlI[6]);
                            "".length();
                        }
                    }
                }
                if (llIlllIlIlIIl(ix ? 1 : 0) && llIlllIlIIlll(iw ? 1 : 0) && llIlllIlIIlll(iv ? 1 : 0) && llIlllIlIIlll(iu ? 1 : 0) && llIlllIlIIlll(it ? 1 : 0) && llIlllIlIIlll(is ? 1 : 0) && llIlllIlIIlll(ir ? 1 : 0) && llIlllIlIIlll(iq ? 1 : 0) && llIlllIlIIlll(ip ? 1 : 0)) {
                    if (llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr34 = new String[lIIIIIlIIlI[4]];
                            strArr34[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[135]];
                        }
                        String[] strArr35 = new String[lIIIIIlIIlI[4]];
                        strArr35[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[136]];
                        TileObjects.getNearest(strArr35).interact(lIIIIIIlllI[lIIIIIlIIlI[137]]);
                        Time.sleepTicks(lIIIIIlIIlI[6]);
                        "".length();
                        if (llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6]) && llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr36 = new String[lIIIIIlIIlI[4]];
                            strArr36[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[138]];
                            if (llIlllIlIlllI(TileObjects.getNearest(strArr36))) {
                                AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[139]];
                                Movement.walkTo(ij);
                                "".length();
                                Time.sleepTicks(lIIIIIlIIlI[4]);
                                "".length();
                            }
                        }
                        if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6])) {
                            String[] strArr37 = new String[lIIIIIlIIlI[4]];
                            strArr37[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[140]];
                            if (llIlllIlIlllI(NPCs.getNearest(strArr37)) && llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] strArr38 = new String[lIIIIIlIIlI[4]];
                                strArr38[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[141]];
                                TileObjects.getNearest(strArr38).interact(lIIIIIIlllI[lIIIIIlIIlI[142]]);
                            }
                        }
                    }
                    if (llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr39 = new String[lIIIIIlIIlI[4]];
                        strArr39[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[143]];
                        if (llIlllIlIlIlI(NPCs.getNearest(strArr39))) {
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[144]];
                            C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[145]], bQ);
                            String text3 = Dialog.getText();
                            if (llIlllIlIlIlI(text3) && llIlllIlIIlll(text3.contains(lIIIIIIlllI[lIIIIIlIIlI[146]]) ? 1 : 0)) {
                                ix = lIIIIIlIIlI[4];
                            }
                        }
                    }
                }
                if (llIlllIlIlIIl(iy ? 1 : 0) && llIlllIlIIlll(ix ? 1 : 0) && llIlllIlIIlll(iw ? 1 : 0) && llIlllIlIIlll(iv ? 1 : 0) && llIlllIlIIlll(iu ? 1 : 0) && llIlllIlIIlll(it ? 1 : 0) && llIlllIlIIlll(is ? 1 : 0) && llIlllIlIIlll(ir ? 1 : 0) && llIlllIlIIlll(iq ? 1 : 0) && llIlllIlIIlll(ip ? 1 : 0)) {
                    if (llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[147]];
                        String[] strArr40 = new String[lIIIIIlIIlI[4]];
                        strArr40[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[148]];
                        TileObjects.getNearest(strArr40).interact(lIIIIIIlllI[lIIIIIlIIlI[149]]);
                        Time.sleepTicks(lIIIIIlIIlI[6]);
                        "".length();
                    }
                    if (llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr41 = new String[lIIIIIlIIlI[4]];
                        strArr41[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[150]];
                        if (llIlllIlIlllI(NPCs.getNearest(strArr41)) && llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[6])) {
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[151]];
                            Walker.step(ii);
                            "".length();
                            Time.sleepTicks(lIIIIIlIIlI[4]);
                            "".length();
                        }
                        if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[6])) {
                            String[] strArr42 = new String[lIIIIIlIIlI[4]];
                            strArr42[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[152]];
                            if (llIlllIlIlllI(NPCs.getNearest(strArr42)) && llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                                String[] strArr43 = new String[lIIIIIlIIlI[4]];
                                strArr43[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[153]];
                                TileObjects.getNearest(strArr43).interact(lIIIIIIlllI[lIIIIIlIIlI[154]]);
                            }
                        }
                    }
                    if (llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr44 = new String[lIIIIIlIIlI[4]];
                        strArr44[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[155]];
                        if (llIlllIlIlIlI(NPCs.getNearest(strArr44))) {
                            String text4 = Dialog.getText();
                            if (llIlllIlIlIlI(text4) && llIlllIlIIlll(text4.contains(lIIIIIIlllI[lIIIIIlIIlI[156]]) ? 1 : 0)) {
                                iy = lIIIIIlIIlI[4];
                            }
                            AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[157]];
                            C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[158]], bQ);
                        }
                    }
                }
                if (llIlllIlIlIIl(iz ? 1 : 0) && llIlllIlIIlll(iy ? 1 : 0) && llIlllIlIIlll(ix ? 1 : 0) && llIlllIlIIlll(iw ? 1 : 0) && llIlllIlIIlll(iv ? 1 : 0) && llIlllIlIIlll(iu ? 1 : 0) && llIlllIlIIlll(it ? 1 : 0) && llIlllIlIIlll(is ? 1 : 0) && llIlllIlIIlll(ir ? 1 : 0) && llIlllIlIIlll(iq ? 1 : 0) && llIlllIlIIlll(ip ? 1 : 0) && llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr45 = new String[lIIIIIlIIlI[4]];
                    strArr45[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[159]];
                    if (llIlllIlIlIlI(NPCs.getNearest(strArr45))) {
                        String text5 = Dialog.getText();
                        if (llIlllIlIlIlI(text5) && llIlllIlIIlll(text5.contains(lIIIIIIlllI[lIIIIIlIIlI[160]]) ? 1 : 0)) {
                            iz = lIIIIIlIIlI[4];
                        }
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[161]];
                        C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[162]], bQ);
                    }
                }
                C0006g.a(bQ);
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[52])) {
                if (llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[163]];
                    String[] strArr46 = new String[lIIIIIlIIlI[4]];
                    strArr46[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[164]];
                    TileObjects.getNearest(strArr46).interact(lIIIIIIlllI[lIIIIIlIIlI[165]]);
                    Time.sleepTicks(lIIIIIlIIlI[6]);
                    "".length();
                }
                if (llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlllIlIllII(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6])) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[166]];
                        WorldPoint[] worldPointArr3 = new WorldPoint[lIIIIIlIIlI[8]];
                        worldPointArr3[lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[36], lIIIIIlIIlI[104], lIIIIIlIIlI[9]);
                        worldPointArr3[lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[167], lIIIIIlIIlI[168], lIIIIIlIIlI[9]);
                        worldPointArr3[lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[169], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArr3[lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[170], lIIIIIlIIlI[32], lIIIIIlIIlI[9]);
                        worldPointArr3[lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[98], lIIIIIlIIlI[9]);
                        worldPointArr3[lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[121], lIIIIIlIIlI[9]);
                        Walker.walkAlong(Arrays.asList(worldPointArr3), new HashMap());
                        "".length();
                        Time.sleepTicks(lIIIIIlIIlI[4]);
                        "".length();
                    }
                    if (llIlllIlIllIl(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6]) && llIlllIlIlIIl(Players.getLocal().getWorldLocation().getPlane()) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr47 = new String[lIIIIIlIIlI[4]];
                        strArr47[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[171]];
                        TileObjects.getNearest(strArr47).interact(lIIIIIIlllI[lIIIIIlIIlI[172]]);
                        Time.sleepTicks(lIIIIIlIIlI[11]);
                        "".length();
                    }
                }
                if (llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[173]];
                    C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[174]], bQ);
                }
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[57])) {
                if (llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr48 = new String[lIIIIIlIIlI[4]];
                        strArr48[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[175]];
                        TileObjects.getNearest(strArr48).interact(lIIIIIIlllI[lIIIIIlIIlI[176]]);
                        Time.sleepTicks(lIIIIIlIIlI[11]);
                        "".length();
                    }
                    if (llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6]) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[177]];
                        WorldPoint[] worldPointArr4 = new WorldPoint[lIIIIIlIIlI[22]];
                        worldPointArr4[lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[31], lIIIIIlIIlI[9]);
                        worldPointArr4[lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[41], lIIIIIlIIlI[9]);
                        worldPointArr4[lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[99], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArr4[lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[178], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArr4[lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[179], lIIIIIlIIlI[180], lIIIIIlIIlI[9]);
                        worldPointArr4[lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[181], lIIIIIlIIlI[105], lIIIIIlIIlI[9]);
                        worldPointArr4[lIIIIIlIIlI[8]] = new WorldPoint(lIIIIIlIIlI[182], lIIIIIlIIlI[109], lIIIIIlIIlI[9]);
                        worldPointArr4[lIIIIIlIIlI[21]] = new WorldPoint(lIIIIIlIIlI[101], lIIIIIlIIlI[183], lIIIIIlIIlI[9]);
                        Walker.walkAlong(Arrays.asList(worldPointArr4), new HashMap());
                        "".length();
                        Time.sleepTicks(lIIIIIlIIlI[4]);
                        "".length();
                    }
                    if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ij), lIIIIIlIIlI[6])) {
                        String[] strArr49 = new String[lIIIIIlIIlI[4]];
                        strArr49[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[184]];
                        if (llIlllIlIlllI(NPCs.getNearest(strArr49)) && llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] strArr50 = new String[lIIIIIlIIlI[4]];
                            strArr50[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[185]];
                            TileObjects.getNearest(strArr50).interact(lIIIIIIlllI[lIIIIIlIIlI[186]]);
                        }
                    }
                }
                if (llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr51 = new String[lIIIIIlIIlI[4]];
                    strArr51[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[187]];
                    if (llIlllIlIlIlI(NPCs.getNearest(strArr51))) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[188]];
                        C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[189]], bQ);
                    }
                }
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[62])) {
                if (llIlllIlIIlll(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr52 = new String[lIIIIIlIIlI[4]];
                    strArr52[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[190]];
                    TileObjects.getNearest(strArr52).interact(lIIIIIIlllI[lIIIIIlIIlI[191]]);
                    Time.sleepTicks(lIIIIIlIIlI[6]);
                    "".length();
                }
                if (llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr53 = new String[lIIIIIlIIlI[4]];
                    strArr53[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[192]];
                    if (llIlllIlIlllI(NPCs.getNearest(strArr53)) && llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[5])) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[193]];
                        Walker.step(ii);
                        "".length();
                        Time.sleepTicks(lIIIIIlIIlI[4]);
                        "".length();
                    }
                    if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ii), lIIIIIlIIlI[5])) {
                        String[] strArr54 = new String[lIIIIIlIIlI[4]];
                        strArr54[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[194]];
                        if (llIlllIlIlllI(NPCs.getNearest(strArr54)) && llIlllIlIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                            String[] strArr55 = new String[lIIIIIlIIlI[4]];
                            strArr55[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[195]];
                            TileObjects.getNearest(strArr55).interact(lIIIIIIlllI[lIIIIIlIIlI[196]]);
                        }
                    }
                }
                if (llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr56 = new String[lIIIIIlIIlI[4]];
                    strArr56[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[197]];
                    if (llIlllIlIlIlI(NPCs.getNearest(strArr56))) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[198]];
                        C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[199]], bQ);
                    }
                }
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[67])) {
                if (llIlllIlIIlll(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr57 = new String[lIIIIIlIIlI[4]];
                    strArr57[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[200]];
                    TileObjects.getNearest(strArr57).interact(lIIIIIIlllI[lIIIIIlIIlI[201]]);
                    Time.sleepTicks(lIIIIIlIIlI[6]);
                    "".length();
                }
                if (llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                    String[] strArr58 = new String[lIIIIIlIIlI[4]];
                    strArr58[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[202]];
                    if (llIlllIlIlllI(NPCs.getNearest(strArr58)) && llIlllIlIlIIl(im.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint[] worldPointArr5 = new WorldPoint[lIIIIIlIIlI[17]];
                        worldPointArr5[lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[31], lIIIIIlIIlI[9]);
                        worldPointArr5[lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[32], lIIIIIlIIlI[9]);
                        worldPointArr5[lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[33], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArr5[lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[35], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArr5[lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[36], lIIIIIlIIlI[37], lIIIIIlIIlI[9]);
                        worldPointArr5[lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[38], lIIIIIlIIlI[39], lIIIIIlIIlI[9]);
                        worldPointArr5[lIIIIIlIIlI[8]] = new WorldPoint(lIIIIIlIIlI[40], lIIIIIlIIlI[41], lIIIIIlIIlI[9]);
                        worldPointArr5[lIIIIIlIIlI[21]] = new WorldPoint(lIIIIIlIIlI[42], lIIIIIlIIlI[43], lIIIIIlIIlI[9]);
                        worldPointArr5[lIIIIIlIIlI[22]] = new WorldPoint(lIIIIIlIIlI[44], lIIIIIlIIlI[45], lIIIIIlIIlI[9]);
                        worldPointArr5[lIIIIIlIIlI[23]] = new WorldPoint(lIIIIIlIIlI[46], lIIIIIlIIlI[47], lIIIIIlIIlI[9]);
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[203]];
                        Walker.walkAlong(Arrays.asList(worldPointArr5), new HashMap());
                        "".length();
                        Time.sleepTicks(lIIIIIlIIlI[4]);
                        "".length();
                    }
                }
                if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[204]];
                    String[] strArr59 = new String[lIIIIIlIIlI[4]];
                    strArr59[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[205]];
                    if (llIlllIlIlllI(NPCs.getNearest(strArr59))) {
                        String[] strArr60 = new String[lIIIIIlIIlI[4]];
                        strArr60[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[206]];
                        TileObjects.getNearest(strArr60).interact(lIIIIIIlllI[lIIIIIlIIlI[207]]);
                        Time.sleepTicks(lIIIIIlIIlI[6]);
                        "".length();
                    }
                }
                String[] strArr61 = new String[lIIIIIlIIlI[4]];
                strArr61[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[208]];
                if (llIlllIlIlIlI(NPCs.getNearest(strArr61))) {
                    C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[209]], bQ);
                }
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[72])) {
                C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[210]], bQ);
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[77])) {
                String[] strArr62 = new String[lIIIIIlIIlI[4]];
                strArr62[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[211]];
                if (llIlllIlIlIlI(NPCs.getNearest(strArr62))) {
                    String[] strArr63 = new String[lIIIIIlIIlI[4]];
                    strArr63[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[212]];
                    TileObjects.getNearest(strArr63).interact(lIIIIIIlllI[lIIIIIlIIlI[213]]);
                }
                String[] strArr64 = new String[lIIIIIlIIlI[4]];
                strArr64[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[214]];
                if (llIlllIlIlllI(NPCs.getNearest(strArr64)) && llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[22])) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[215]];
                    int[] iArr3 = new int[lIIIIIlIIlI[4]];
                    iArr3[lIIIIIlIIlI[9]] = lIIIIIlIIlI[16];
                    Item first = Inventory.getFirst(iArr3);
                    String[] strArr65 = new String[lIIIIIlIIlI[4]];
                    strArr65[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[216]];
                    first.useOn(TileObjects.getNearest(strArr65));
                    Time.sleepTicks(lIIIIIlIIlI[7]);
                    "".length();
                }
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[81])) {
                C0006g.a(bQ);
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[20])) {
                if (llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlllIlIllII(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6])) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[217]];
                        Movement.walkTo(ik);
                        "".length();
                        Time.sleepTicks(lIIIIIlIIlI[4]);
                        "".length();
                    }
                    if (llIlllIlIllIl(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6]) && llIlllIlIlIIl(Players.getLocal().getWorldLocation().getPlane()) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr66 = new String[lIIIIIlIIlI[4]];
                        strArr66[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[218]];
                        TileObjects.getNearest(strArr66).interact(lIIIIIIlllI[lIIIIIlIIlI[219]]);
                        Time.sleepTicks(lIIIIIlIIlI[11]);
                        "".length();
                    }
                }
                if (llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[220]];
                    C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[221]], bQ);
                }
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[83])) {
                if (llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr67 = new String[lIIIIIlIIlI[4]];
                    strArr67[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[222]];
                    TileObjects.getNearest(strArr67).interact(lIIIIIIlllI[lIIIIIlIIlI[223]]);
                    Time.sleepTicks(lIIIIIlIIlI[6]);
                    "".length();
                }
                if (llIlllIlIllII(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                    String[] strArr68 = new String[lIIIIIlIIlI[4]];
                    strArr68[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[224]];
                    if (llIlllIlIlllI(NPCs.getNearest(strArr68)) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint[] worldPointArr6 = new WorldPoint[lIIIIIlIIlI[17]];
                        worldPointArr6[lIIIIIlIIlI[9]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[31], lIIIIIlIIlI[9]);
                        worldPointArr6[lIIIIIlIIlI[4]] = new WorldPoint(lIIIIIlIIlI[25], lIIIIIlIIlI[32], lIIIIIlIIlI[9]);
                        worldPointArr6[lIIIIIlIIlI[5]] = new WorldPoint(lIIIIIlIIlI[33], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArr6[lIIIIIlIIlI[6]] = new WorldPoint(lIIIIIlIIlI[35], lIIIIIlIIlI[34], lIIIIIlIIlI[9]);
                        worldPointArr6[lIIIIIlIIlI[7]] = new WorldPoint(lIIIIIlIIlI[36], lIIIIIlIIlI[37], lIIIIIlIIlI[9]);
                        worldPointArr6[lIIIIIlIIlI[11]] = new WorldPoint(lIIIIIlIIlI[38], lIIIIIlIIlI[39], lIIIIIlIIlI[9]);
                        worldPointArr6[lIIIIIlIIlI[8]] = new WorldPoint(lIIIIIlIIlI[40], lIIIIIlIIlI[41], lIIIIIlIIlI[9]);
                        worldPointArr6[lIIIIIlIIlI[21]] = new WorldPoint(lIIIIIlIIlI[42], lIIIIIlIIlI[43], lIIIIIlIIlI[9]);
                        worldPointArr6[lIIIIIlIIlI[22]] = new WorldPoint(lIIIIIlIIlI[44], lIIIIIlIIlI[45], lIIIIIlIIlI[9]);
                        worldPointArr6[lIIIIIlIIlI[23]] = new WorldPoint(lIIIIIlIIlI[46], lIIIIIlIIlI[47], lIIIIIlIIlI[9]);
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[225]];
                        Walker.walkAlong(Arrays.asList(worldPointArr6), new HashMap());
                        "".length();
                        Time.sleepTicks(lIIIIIlIIlI[4]);
                        "".length();
                    }
                }
                if (llIlllIlIllIl(Players.getLocal().getWorldLocation().distanceTo(ih), lIIIIIlIIlI[11])) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[226]];
                    String[] strArr69 = new String[lIIIIIlIIlI[4]];
                    strArr69[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[227]];
                    if (llIlllIlIlllI(NPCs.getNearest(strArr69))) {
                        String[] strArr70 = new String[lIIIIIlIIlI[4]];
                        strArr70[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[228]];
                        TileObjects.getNearest(strArr70).interact(lIIIIIIlllI[lIIIIIlIIlI[229]]);
                        Time.sleepTicks(lIIIIIlIIlI[6]);
                        "".length();
                    }
                }
                String[] strArr71 = new String[lIIIIIlIIlI[4]];
                strArr71[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[230]];
                if (llIlllIlIlIlI(NPCs.getNearest(strArr71))) {
                    int[] iArr4 = new int[lIIIIIlIIlI[4]];
                    iArr4[lIIIIIlIIlI[9]] = lIIIIIlIIlI[19];
                    if (llIlllIlIIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIIIlIIlI[4]];
                        iArr5[lIIIIIlIIlI[9]] = lIIIIIlIIlI[19];
                        if (llIlllIlIlIIl(Equipment.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIIIlIIlI[4]];
                            iArr6[lIIIIIlIIlI[9]] = lIIIIIlIIlI[19];
                            Inventory.getFirst(iArr6).interact(lIIIIIIlllI[lIIIIIlIIlI[231]]);
                        }
                    }
                    if (llIlllIlIllll(llIlllIlIIlIl(C0004e.u(), 55.0d))) {
                        int[] iArr7 = new int[lIIIIIlIIlI[4]];
                        iArr7[lIIIIIlIIlI[9]] = lIIIIIlIIlI[18];
                        if (llIlllIlIIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                            int[] iArr8 = new int[lIIIIIlIIlI[4]];
                            iArr8[lIIIIIlIIlI[9]] = lIIIIIlIIlI[18];
                            Inventory.getFirst(iArr8).interact(lIIIIIIlllI[lIIIIIlIIlI[232]]);
                            Time.sleepTicks(lIIIIIlIIlI[4]);
                            "".length();
                        }
                    }
                    if (llIlllIlIlllI(Players.getLocal().getInteracting())) {
                        String[] strArr72 = new String[lIIIIIlIIlI[4]];
                        strArr72[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[233]];
                        NPCs.getNearest(strArr72).interact(lIIIIIIlllI[lIIIIIlIIlI[234]]);
                        Time.sleepTicks(lIIIIIlIIlI[5]);
                        "".length();
                    }
                }
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[86])) {
                String[] strArr73 = new String[lIIIIIlIIlI[4]];
                strArr73[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[235]];
                if (llIlllIlIlIlI(TileObjects.getNearest(strArr73)) && llIlllIlIIllI(Players.getLocal().getWorldLocation().getPlane(), lIIIIIlIIlI[4])) {
                    String[] strArr74 = new String[lIIIIIlIIlI[4]];
                    strArr74[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[236]];
                    TileObjects.getNearest(strArr74).interact(lIIIIIIlllI[lIIIIIlIIlI[237]]);
                    Time.sleepTicks(lIIIIIlIIlI[6]);
                    "".length();
                }
                if (llIlllIlIlIIl(in.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlllIlIlIIl(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIlllIlIllII(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6])) {
                        AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[238]];
                        Movement.walkTo(ik);
                        "".length();
                        Time.sleepTicks(lIIIIIlIIlI[4]);
                        "".length();
                    }
                    if (llIlllIlIllIl(Players.getLocal().distanceTo(ik), lIIIIIlIIlI[6]) && llIlllIlIlIIl(Players.getLocal().getWorldLocation().getPlane())) {
                        String[] strArr75 = new String[lIIIIIlIIlI[4]];
                        strArr75[lIIIIIlIIlI[9]] = lIIIIIIlllI[lIIIIIlIIlI[239]];
                        TileObjects.getNearest(strArr75).interact(lIIIIIIlllI[lIIIIIlIIlI[240]]);
                        Time.sleepTicks(lIIIIIlIIlI[6]);
                        "".length();
                    }
                }
                if (llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lIIIIIIlllI[lIIIIIlIIlI[241]];
                    if (llIlllIlIlIII(ck, lIIIIIlIIlI[4])) {
                        ac.na += lIIIIIlIIlI[4];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lIIIIIlIIlI[4];
                        ac.na = lIIIIIlIIlI[9];
                        cl = lIIIIIlIIlI[9];
                    }
                    C0006g.a(lIIIIIIlllI[lIIIIIlIIlI[242]], bQ);
                }
            }
            if (llIlllIlIIllI(Vars.getBit(QuestVarbits.QUEST_THE_CORSAIR_CURSE.getId()), lIIIIIlIIlI[91])) {
                int[] iArr9 = new int[lIIIIIlIIlI[4]];
                iArr9[lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
                if (llIlllIlIIlll(Inventory.contains(iArr9) ? 1 : 0) && llIlllIlIIlll(io.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIIIlIIlI[4]];
                    iArr10[lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
                    Inventory.getFirst(iArr10).interact(lIIIIIIlllI[lIIIIIlIIlI[243]]);
                    Time.sleepTicks(lIIIIIlIIlI[11]);
                    "".length();
                }
            }
            C0006g.a(bQ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[lIIIIIlIIlI[11]];
        iArr[lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
        iArr[lIIIIIlIIlI[4]] = lIIIIIlIIlI[13];
        iArr[lIIIIIlIIlI[5]] = lIIIIIlIIlI[14];
        iArr[lIIIIIlIIlI[6]] = lIIIIIlIIlI[15];
        iArr[lIIIIIlIIlI[7]] = lIIIIIlIIlI[16];
        int lllllllllllllllllIIllllIIIIlIIll = lIIIIIlIIlI[9];
        while (llIlllIlIlIII(lllllllllllllllllIIllllIIIIlIIll, iArr.length)) {
            int[] iArr2 = new int[lIIIIIlIIlI[4]];
            iArr2[lIIIIIlIIlI[9]] = iArr[lllllllllllllllllIIllllIIIIlIIll];
            if (llIlllIlIlIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIIIlIIlI[9];
            }
            lllllllllllllllllIIllllIIIIlIIll++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIIIIlIIlI[4];
    }

    private static boolean llIlllIlIIllI(int i, int i2) {
        return i == i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            dj();
            "".length();
            if (0 != 0) {
                return (63 ^ 34) & ((149 ^ 136) ^ (-1));
            }
        } catch (Exception e2) {
        }
        return lIIIIIlIIlI[145];
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x01bb, code lost:
        if (llIlllIlIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.O.lIIIIIlIIlI[7]) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
        if (llIlllIlIlIII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.O.lIIIIIlIIlI[24]) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lIIIIIlIIlI[4]];
        iArr5[lIIIIIlIIlI[9]] = lIIIIIlIIlI[18];
        if (llIlllIlIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIIIIIlIIlI[4]];
            iArr6[lIIIIIlIIlI[9]] = lIIIIIlIIlI[18];
            if (llIlllIlIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lIIIIIlIIlI[4]];
                iArr7[lIIIIIlIIlI[9]] = lIIIIIlIIlI[18];
            }
            iArr = new int[lIIIIIlIIlI[4]];
            iArr[lIIIIIlIIlI[9]] = lIIIIIlIIlI[19];
            if (llIlllIlIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                bu.add(new C0003d(lIIIIIlIIlI[19], lIIIIIlIIlI[4], lIIIIIlIIlI[245]));
                "".length();
            }
            iArr2 = new int[lIIIIIlIIlI[4]];
            iArr2[lIIIIIlIIlI[9]] = lIIIIIlIIlI[13];
            if (llIlllIlIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
                bu.add(new C0003d(lIIIIIlIIlI[13], lIIIIIlIIlI[52], lIIIIIlIIlI[246]));
                "".length();
            }
            if (llIlllIlIlIIl(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIIIIIIlllI[lIIIIIlIIlI[251]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(lIIIIIlIIlI[247], lIIIIIlIIlI[11], lIIIIIlIIlI[248]));
                "".length();
            }
            iArr3 = new int[lIIIIIlIIlI[4]];
            iArr3[lIIIIIlIIlI[9]] = lIIIIIlIIlI[15];
            if (llIlllIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr8 = new int[lIIIIIlIIlI[4]];
                iArr8[lIIIIIlIIlI[9]] = lIIIIIlIIlI[15];
                if (llIlllIlIIlll(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIIIIIlIIlI[4]];
                    iArr9[lIIIIIlIIlI[9]] = lIIIIIlIIlI[15];
                }
                iArr4 = new int[lIIIIIlIIlI[4]];
                iArr4[lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
                if (llIlllIlIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                    bu.add(new C0003d(lIIIIIlIIlI[12], lIIIIIlIIlI[72], lIIIIIlIIlI[249]));
                    "".length();
                    return;
                }
                return;
            }
            bu.add(new C0003d(lIIIIIlIIlI[15], lIIIIIlIIlI[7], C0008i.bp));
            "".length();
            iArr4 = new int[lIIIIIlIIlI[4]];
            iArr4[lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
            if (llIlllIlIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
        }
        bu.add(new C0003d(lIIIIIlIIlI[18], lIIIIIlIIlI[52], lIIIIIlIIlI[244]));
        "".length();
        iArr = new int[lIIIIIlIIlI[4]];
        iArr[lIIIIIlIIlI[9]] = lIIIIIlIIlI[19];
        if (llIlllIlIlIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIIIlIIlI[4]];
        iArr2[lIIIIIlIIlI[9]] = lIIIIIlIIlI[13];
        if (llIlllIlIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        if (llIlllIlIlIIl(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIIIIIIlllI[lIIIIIlIIlI[251]]);
        }) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIIIlIIlI[4]];
        iArr3[lIIIIIlIIlI[9]] = lIIIIIlIIlI[15];
        if (llIlllIlIIlll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bu.add(new C0003d(lIIIIIlIIlI[15], lIIIIIlIIlI[7], C0008i.bp));
        "".length();
        iArr4 = new int[lIIIIIlIIlI[4]];
        iArr4[lIIIIIlIIlI[9]] = lIIIIIlIIlI[12];
        if (llIlllIlIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
    }

    private static String llIlllIIlIllI(String lllllllllllllllllIIlllIllllIllIl, String lllllllllllllllllIIlllIllllIllII) {
        try {
            SecretKeySpec lllllllllllllllllIIlllIlllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllIllllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIIlllIllllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllllIIlllIllllIllll.init(lIIIIIlIIlI[5], lllllllllllllllllIIlllIlllllIIII);
            return new String(lllllllllllllllllIIlllIllllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllIllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIlllIllllIlllI) {
            lllllllllllllllllIIlllIllllIlllI.printStackTrace();
            return null;
        }
    }

    private static String llIlllIIlIlll(String lllllllllllllllllIIlllIllllIIIII, String lllllllllllllllllIIlllIlllIlllll) {
        try {
            SecretKeySpec lllllllllllllllllIIlllIllllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIIlllIlllIlllll.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIlI[22]), "DES");
            Cipher lllllllllllllllllIIlllIllllIIIlI = Cipher.getInstance("DES");
            lllllllllllllllllIIlllIllllIIIlI.init(lIIIIIlIIlI[5], lllllllllllllllllIIlllIllllIIIll);
            return new String(lllllllllllllllllIIlllIllllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIIlllIllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIIlllIllllIIIIl) {
            lllllllllllllllllIIlllIllllIIIIl.printStackTrace();
            return null;
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lIIIIIIlllI[lIIIIIlIIlI[250]];
    }

    private static boolean llIlllIlIllII(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlllIlIIlll(int i) {
        return i != 0;
    }

    private static boolean llIlllIlIlllI(Object obj) {
        return obj == null;
    }

    private static boolean llIlllIlIllIl(int i, int i2) {
        return i <= i2;
    }
}
