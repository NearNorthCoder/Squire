/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.api.Quest
 *  net.runelite.api.QuestState
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.Quests
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.O;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.P;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.f;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.g;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.h;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.i;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.m;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
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
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;

public class l
implements M {
    private static /* synthetic */ String[] bW;
    public static final /* synthetic */ WorldPoint cf;
    public static final /* synthetic */ WorldPoint ce;
    public static final /* synthetic */ WorldPoint cd;
    public static final /* synthetic */ WorldPoint ch;
    public static final /* synthetic */ WorldPoint cl;
    static /* synthetic */ boolean cp;
    public static final /* synthetic */ WorldPoint cg;
    public static final /* synthetic */ WorldPoint ci;
    public static final /* synthetic */ WorldPoint ck;
    static /* synthetic */ int cm;
    public static /* synthetic */ boolean by;
    static /* synthetic */ WorldArea cn;
    public static /* synthetic */ List<d> bA;
    public static final /* synthetic */ WorldPoint cj;
    private static /* synthetic */ int[] lIIIlllIIlIlI;
    static /* synthetic */ int co;
    private static /* synthetic */ String[] lIIIlllIIlIIl;

    static {
        l.lIlIIIllllIlIII();
        l.lIlIIIllllIIlll();
        cd = new WorldPoint(lIIIlllIIlIlI[91], lIIIlllIIlIlI[92], lIIIlllIIlIlI[1]);
        ce = new WorldPoint(lIIIlllIIlIlI[93], lIIIlllIIlIlI[94], lIIIlllIIlIlI[1]);
        cf = new WorldPoint(lIIIlllIIlIlI[95], lIIIlllIIlIlI[96], lIIIlllIIlIlI[1]);
        cg = new WorldPoint(lIIIlllIIlIlI[97], lIIIlllIIlIlI[98], lIIIlllIIlIlI[1]);
        ch = new WorldPoint(lIIIlllIIlIlI[99], lIIIlllIIlIlI[100], lIIIlllIIlIlI[1]);
        ci = new WorldPoint(lIIIlllIIlIlI[101], lIIIlllIIlIlI[102], lIIIlllIIlIlI[1]);
        cj = new WorldPoint(lIIIlllIIlIlI[103], lIIIlllIIlIlI[104], lIIIlllIIlIlI[1]);
        ck = new WorldPoint(lIIIlllIIlIlI[91], lIIIlllIIlIlI[105], lIIIlllIIlIlI[1]);
        cl = new WorldPoint(lIIIlllIIlIlI[106], lIIIlllIIlIlI[107], lIIIlllIIlIlI[1]);
        bA = new ArrayList<d>();
        cm = lIIIlllIIlIlI[30];
        cn = new WorldArea(lIIIlllIIlIlI[93], lIIIlllIIlIlI[108], lIIIlllIIlIlI[26], lIIIlllIIlIlI[47], lIIIlllIIlIlI[1]);
        String[] stringArray = new String[lIIIlllIIlIlI[11]];
        stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[109]];
        stringArray[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIIl[lIIIlllIIlIlI[110]];
        stringArray[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIIl[lIIIlllIIlIlI[111]];
        bW = stringArray;
    }

    private static boolean lIlIIIlllllIlII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIIIllllIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIllllIlllI(int n2) {
        return n2 > 0;
    }

    private static String lIlIIIllllIIlIl(String lllllllllllllllIIIIIllIlIIIlIIIl, String lllllllllllllllIIIIIllIlIIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIlIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIllIlIIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIllIlIIIlIIll.init(lIIIlllIIlIlI[5], lllllllllllllllIIIIIllIlIIIlIlII);
            return new String(lllllllllllllllIIIIIllIlIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIllIlIIIlIIlI) {
            lllllllllllllllIIIIIllIlIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllllIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIIllllIlIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private static boolean S() {
        void lllllllllllllllIIIIIllIlIIlIllll;
        int[] nArray = new int[lIIIlllIIlIlI[12]];
        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
        nArray[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
        nArray[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
        nArray[l.lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
        nArray[l.lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
        nArray[l.lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
        int[] nArray2 = nArray;
        int lllllllllllllllIIIIIllIlIIlIlllI = lIIIlllIIlIlI[1];
        while (l.lIlIIIllllIlIlI(lllllllllllllllIIIIIllIlIIlIlllI, ((void)lllllllllllllllIIIIIllIlIIlIllll).length)) {
            int[] nArray3 = new int[lIIIlllIIlIlI[0]];
            nArray3[l.lIIIlllIIlIlI[1]] = lllllllllllllllIIIIIllIlIIlIllll[lllllllllllllllIIIIIllIlIIlIlllI];
            if (l.lIlIIIllllIlIll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                return lIIIlllIIlIlI[1];
            }
            ++lllllllllllllllIIIIIllIlIIlIlllI;
            "".length();
            if (" ".length() >= " ".length()) continue;
            return ((0x51 ^ 0x7F ^ (0x2C ^ 0xF)) & (12 + 48 - 10 + 104 ^ 28 + 8 - -15 + 100 ^ -" ".length())) != 0;
        }
        return lIIIlllIIlIlI[0];
    }

    private static boolean lIlIIIllllIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIlllllIIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIIllllIlIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIllllIIlll() {
        lIIIlllIIlIIl = new String[lIIIlllIIlIlI[112]];
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[1]] = l.lIlIIIllllIIlII("FC06IAs6ITBpGic9PScfci0gLBUhaHQ6DzswNyERPCN0KxkxL3Q9F3I1ISwLJg==", "RDTIx");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[0]] = l.lIlIIIllllIIlIl("tnTXiQd1NPNIdQv36a+zWQ==", "ZDApq");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[5]] = l.lIlIIIllllIIlIl("rGqLEQm6mKdmhsNgkr3P2ZQg/9e30efK", "gVkqB");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[11]] = l.lIlIIIllllIIllI("LO/odJfdkyA5boS1Y3fPpJWm52KkGxy8DDneSvmenZIuVgh8Yh7ilOMZS35G3cnT", "SPxFj");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[6]] = l.lIlIIIllllIIllI("wshX8dOQnMija8t86Rdp8qzFo/i4rI1HUekwt84aNfOvVlAcq+0235+Alc2n/BmZlmcWhcdDG3A=", "edBjV");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[16]] = l.lIlIIIllllIIlII("PScwPAA=", "yUYRk");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[12]] = l.lIlIIIllllIIlII("KwUPKCQ=", "owfFO");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[22]] = l.lIlIIIllllIIlII("CzAXUzAqcRIHJTcl", "EQasD");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[23]] = l.lIlIIIllllIIllI("A7hqLDkzl3XOrgftszJn3Q==", "azjYj");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[24]] = l.lIlIIIllllIIlIl("8D+ktKAlWsB4yfFa6ZJr2Q==", "Ohagf");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[18]] = l.lIlIIIllllIIlIl("cShQIkwUFty0NzviWA+v9g==", "KOBzE");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[25]] = l.lIlIIIllllIIllI("XiEtpdrcYwI=", "YYtUj");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[26]] = l.lIlIIIllllIIlII("Cx0KGg==", "DmotQ");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[3]] = l.lIlIIIllllIIlIl("SToWRqcIGfg=", "tqisq");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[27]] = l.lIlIIIllllIIllI("wYNpoCORwEM=", "TebAh");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[28]] = l.lIlIIIllllIIlIl("Hz8K5MipjBk=", "rYeGq");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[29]] = l.lIlIIIllllIIlII("NxIxCyA=", "tzTxT");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[30]] = l.lIlIIIllllIIlIl("CUOVuwuBP6Y=", "KieIl");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[31]] = l.lIlIIIllllIIlII("NyQWOQ==", "xTsWI");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[32]] = l.lIlIIIllllIIlIl("N+ze1kNvamg=", "ASdxn");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[33]] = l.lIlIIIllllIIlIl("nHz9ZU1o0ZM=", "kBKjs");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[34]] = l.lIlIIIllllIIlII("DRIrJwY=", "NzNTr");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[35]] = l.lIlIIIllllIIlII("MgwiECUJ", "aiCbF");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[36]] = l.lIlIIIllllIIlIl("DWFlU0X4jaE=", "pvbHw");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[37]] = l.lIlIIIllllIIlII("NyAgHSEM", "dEAoB");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[21]] = l.lIlIIIllllIIllI("UrJPBdD8feE=", "JYWrr");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[40]] = l.lIlIIIllllIIllI("21e0wEL9N1I=", "OChAi");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[41]] = l.lIlIIIllllIIlIl("ylBtBReEvZpKqBSr2BWHhw==", "Avywq");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[42]] = l.lIlIIIllllIIllI("cCCQFEDCHV8=", "nljxD");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[43]] = l.lIlIIIllllIIlII("NygKDw==", "xXoaR");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[44]] = l.lIlIIIllllIIlIl("MH8khpz1D7fTux4HjnANPA==", "jHnIU");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[45]] = l.lIlIIIllllIIlII("PSo2EnUyOjYEMQ==", "uOWvU");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[46]] = l.lIlIIIllllIIlII("JioiAw9NIDEKEQ==", "mBCof");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[47]] = l.lIlIIIllllIIllI("GTRooaTgoitq0fzxKZCFew==", "PvaxD");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[48]] = l.lIlIIIllllIIlII("KAYrEAsRCmooCxEDKwQ=", "cnJjj");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[49]] = l.lIlIIIllllIIllI("79ExZT1jI8mflmJHJO6P1g==", "slQRA");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[50]] = l.lIlIIIllllIIllI("FZ6bfix+ptbIw41nMeONmA==", "LNiLj");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[51]] = l.lIlIIIllllIIlII("NC4bZxUVbwoyAAgr", "zOmGa");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[52]] = l.lIlIIIllllIIlII("HB0pI2ETDSk1JQ==", "TxHGA");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[53]] = l.lIlIIIllllIIlII("PBkaSBMdWEwbBh8VFQ==", "rxlhg");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[54]] = l.lIlIIIllllIIllI("sFpiKu5dYE060Nb3wJiXFvmgwuYjIgoA", "bkcPN");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[55]] = l.lIlIIIllllIIlIl("LudP56DXFdWIdUS70iyD2Q==", "NszKg");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[56]] = l.lIlIIIllllIIllI("lVYs0VkoOGwWhI61nCmuKA==", "wRjiY");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[57]] = l.lIlIIIllllIIllI("v/tWvN8fy6w=", "fAvNz");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[58]] = l.lIlIIIllllIIlII("AC8hFwxzHSkIAzoi", "SNLzu");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[2]] = l.lIlIIIllllIIllI("glcnrtJf2ds=", "pZhQW");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[59]] = l.lIlIIIllllIIlIl("XnYgdfuKlo8=", "LtgxT");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[60]] = l.lIlIIIllllIIlIl("S0IWXEoU9a0=", "OugDq");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[61]] = l.lIlIIIllllIIlII("Ei00MAArIXUZAjY3JSMONw==", "YEUJa");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[62]] = l.lIlIIIllllIIlIl("S0xnnwKUWTkgpKxJQphTC8SciG4F1j1q", "hpZOO");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[20]] = l.lIlIIIllllIIllI("YXAQJC4nnIo=", "Whyxm");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[63]] = l.lIlIIIllllIIlIl("Iz178Fg2CeQ=", "AjoYd");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[64]] = l.lIlIIIllllIIlIl("rnLxRq9FgaU=", "YMrMI");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[65]] = l.lIlIIIllllIIllI("a3vWb/1rmMI=", "GeApI");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[66]] = l.lIlIIIllllIIlIl("B/puMPsCBgEBmHMig22F1w==", "cFqCL");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[67]] = l.lIlIIIllllIIlII("KycyJD8=", "iUWET");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[71]] = l.lIlIIIllllIIlIl("Qz89vEBajMP8ujophPKEjw==", "NPzwB");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[72]] = l.lIlIIIllllIIllI("FlHlSMz/RTiShCuqO7S5bw==", "RyyWm");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[76]] = l.lIlIIIllllIIlIl("UrW8EtDalT4TsfgLnsWoVg==", "JwsUU");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[79]] = l.lIlIIIllllIIlII("IRMlDms+FzMBIgE=", "mrAwK");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[86]] = l.lIlIIIllllIIllI("SMBFAPY0NFSbKxVnr/pxaA==", "aMXTE");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[87]] = l.lIlIIIllllIIlII("KCUiCEM1KmwYBjsgOAdDcg==", "ZLLoc");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[88]] = l.lIlIIIllllIIlII("Chw3OhsADg==", "niRVr");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[89]] = l.lIlIIIllllIIlII("JjALKh0sIg==", "BEnFt");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[90]] = l.lIlIIIllllIIlII("Owg7NSUFWhUnPg4=", "kzRFJ");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[109]] = l.lIlIIIllllIIlII("EhUASCFxHAsEGHENAR1X", "Qtnhh");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[110]] = l.lIlIIIllllIIllI("LbBVB4LI01lX2x1qUFze3Jt9p3HlmoV4SfzEGqa4wGc=", "KTspk");
        l.lIIIlllIIlIIl[l.lIIIlllIIlIlI[111]] = l.lIlIIIllllIIlII("LRwfQQ==", "tyloN");
    }

    public static void ar() {
        block77: {
            block83: {
                block85: {
                    block84: {
                        BankLocation lllllllllllllllIIIIIllIlIIllIlII;
                        block78: {
                            block82: {
                                block80: {
                                    block81: {
                                        block79: {
                                            if (l.lIlIIIllllIlIIl(by ? 1 : 0)) {
                                                b.a(bA);
                                                if (l.lIlIIIllllIlIlI(bA.size(), lIIIlllIIlIlI[0])) {
                                                    System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[1]]);
                                                    by = lIIIlllIIlIlI[1];
                                                }
                                            }
                                            if (!l.lIlIIIllllIlIll(by ? 1 : 0)) break block77;
                                            if (l.lIlIIIllllIlIlI(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIIlIlI[2])) {
                                                O.cL();
                                            }
                                            if (l.lIlIIIllllIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIIlIlI[2]) && l.lIlIIIllllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIlIlI[3])) {
                                                i.P();
                                            }
                                            if (!l.lIlIIIllllIlIll(l.S() ? 1 : 0) || !l.lIlIIIllllIlIlI(e.j(cm), lIIIlllIIlIlI[0]) || !l.lIlIIIllllIllII(Skills.getLevel((Skill)Skill.PRAYER), lIIIlllIIlIlI[2]) || !l.lIlIIIllllIllII(Skills.getLevel((Skill)Skill.MAGIC), lIIIlllIIlIlI[3])) break block78;
                                            lllllllllllllllIIIIIllIlIIllIlII = BankLocation.getNearest();
                                            if (l.lIlIIIllllIllIl(lllllllllllllllIIIIIllIlIIllIlII) && l.lIlIIIllllIlIll(lllllllllllllllIIIIIllIlIIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[0]];
                                                a.a(lllllllllllllllIIIIIllIlIIllIlII);
                                            }
                                            if (!l.lIlIIIllllIllIl(lllllllllllllllIIIIIllIlIIllIlII) || !l.lIlIIIllllIlIIl(lllllllllllllllIIIIIllIlIIllIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block78;
                                            if (l.lIlIIIllllIlIll(Bank.isOpen() ? 1 : 0)) {
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIlllIIlIlI[4]);
                                                "".length();
                                            }
                                            if (!l.lIlIIIllllIlIIl(Bank.isOpen() ? 1 : 0)) break block78;
                                            AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[5]];
                                            if (l.lIlIIIllllIlllI(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIIlllIIlIlI[6]);
                                                "".length();
                                            }
                                            if (l.lIlIIIllllIlllI(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                                "".length();
                                            }
                                            int[] nArray = new int[lIIIlllIIlIlI[0]];
                                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                            if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block79;
                                            int[] nArray2 = new int[lIIIlllIIlIlI[0]];
                                            nArray2[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                            if (!l.lIlIIIllllIllII(Bank.getFirst((int[])nArray2).getQuantity(), lIIIlllIIlIlI[8])) break block80;
                                        }
                                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block81;
                                        int[] nArray3 = new int[lIIIlllIIlIlI[0]];
                                        nArray3[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                        if (!l.lIlIIIllllIllII(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIIlIlI[8])) break block80;
                                    }
                                    int[] nArray = new int[lIIIlllIIlIlI[0]];
                                    nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                    if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block82;
                                    int[] nArray4 = new int[lIIIlllIIlIlI[0]];
                                    nArray4[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                    if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray4).getQuantity(), lIIIlllIIlIlI[8])) break block82;
                                }
                                l.W();
                                System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[11]]);
                                by = lIIIlllIIlIlI[0];
                                return;
                            }
                            int[] nArray = new int[lIIIlllIIlIlI[12]];
                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                            nArray[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
                            nArray[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
                            nArray[l.lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
                            nArray[l.lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
                            nArray[l.lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
                            if (l.lIlIIIllllIlIll(e.b(nArray) ? 1 : 0)) {
                                l.W();
                                System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[6]]);
                                by = lIIIlllIIlIlI[0];
                                return;
                            }
                            int[] nArray5 = new int[lIIIlllIIlIlI[12]];
                            nArray5[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                            nArray5[l.lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
                            nArray5[l.lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
                            nArray5[l.lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
                            nArray5[l.lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
                            nArray5[l.lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
                            if (l.lIlIIIllllIlIIl(e.b(nArray5) ? 1 : 0)) {
                                while (l.lIlIIIllllIlIll(m.av() ? 1 : 0)) {
                                    m.at();
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                    "".length();
                                    "".length();
                                    if (" ".length() > ((0x67 ^ 0x6A) & ~(0x46 ^ 0x4B))) continue;
                                    return;
                                }
                                if (l.lIlIIIllllIlIll(Bank.isOpen() ? 1 : 0)) {
                                    a.a();
                                    Time.sleepTicks((int)lIIIlllIIlIlI[12]);
                                    "".length();
                                }
                                a.a(lIIIlllIIlIlI[13], lIIIlllIIlIlI[18]);
                                a.a(lIIIlllIIlIlI[14], lIIIlllIIlIlI[11]);
                                a.a(lIIIlllIIlIlI[7], lIIIlllIIlIlI[8]);
                                a.a(lIIIlllIIlIlI[10], lIIIlllIIlIlI[8]);
                                a.a(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11]);
                                a.a(lIIIlllIIlIlI[15], lIIIlllIIlIlI[18]);
                                a.a(lIIIlllIIlIlI[19], lIIIlllIIlIlI[4]);
                            }
                        }
                        if (l.lIlIIIllllIlIIl(Inventory.contains((int[])f.ba) ? 1 : 0) && l.lIlIIIllllIlIlI(Movement.getRunEnergy(), lIIIlllIIlIlI[20])) {
                            Inventory.getFirst((int[])f.ba).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[16]]);
                            Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                            "".length();
                        }
                        if (l.lIlIIIllllIlIlI(Prayers.getPoints(), lIIIlllIIlIlI[21]) && l.lIlIIIllllIlIIl(Inventory.contains((int[])f.aX) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aX).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[12]]);
                        }
                        if (l.lIlIIIllllIlIIl(l.S() ? 1 : 0) && l.lIlIIIllllIlIll(e.j(cm))) {
                            if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[22]];
                                if (l.lIlIIIllllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo((WorldPoint)cd);
                                "".length();
                                Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                "".length();
                            }
                            if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                                g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[23]], bW);
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[0])) {
                            if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ce), lIIIlllIIlIlI[6]) && l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cf), lIIIlllIIlIlI[6])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[24]];
                                Movement.walkTo((WorldPoint)ce);
                                "".length();
                                Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                "".length();
                            }
                            if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ce), lIIIlllIIlIlI[12])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[18]];
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[25]];
                                String[] stringArray2 = new String[lIIIlllIIlIlI[0]];
                                stringArray2[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[26]];
                                if (l.lIlIIIllllIlIIl(TileObjects.getNearest((String[])stringArray).hasAction(stringArray2) ? 1 : 0)) {
                                    String[] stringArray3 = new String[lIIIlllIIlIlI[0]];
                                    stringArray3[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[3]];
                                    if (l.lIlIIIllllIlIll(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray3)) ? 1 : 0)) {
                                        String[] stringArray4 = new String[lIIIlllIIlIlI[0]];
                                        stringArray4[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[27]];
                                        TileObjects.getNearest((String[])stringArray4).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[28]]);
                                        Time.sleepTicks((int)lIIIlllIIlIlI[6]);
                                        "".length();
                                    }
                                }
                                String[] stringArray5 = new String[lIIIlllIIlIlI[0]];
                                stringArray5[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[29]];
                                if (l.lIlIIIllllIlIIl(Reachable.isInteractable((Locatable)TileObjects.getNearest((String[])stringArray5)) ? 1 : 0)) {
                                    String[] stringArray6 = new String[lIIIlllIIlIlI[0]];
                                    stringArray6[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[30]];
                                    String[] stringArray7 = new String[lIIIlllIIlIlI[0]];
                                    stringArray7[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[31]];
                                    if (l.lIlIIIllllIlIIl(TileObjects.getNearest((String[])stringArray6).hasAction(stringArray7) ? 1 : 0)) {
                                        String[] stringArray8 = new String[lIIIlllIIlIlI[0]];
                                        stringArray8[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[32]];
                                        TileObjects.getNearest((String[])stringArray8).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[33]]);
                                        Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                        "".length();
                                    }
                                    String[] stringArray9 = new String[lIIIlllIIlIlI[0]];
                                    stringArray9[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[34]];
                                    String[] stringArray10 = new String[lIIIlllIIlIlI[0]];
                                    stringArray10[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[35]];
                                    if (l.lIlIIIllllIlIIl(TileObjects.getNearest((String[])stringArray9).hasAction(stringArray10) ? 1 : 0)) {
                                        String[] stringArray11 = new String[lIIIlllIIlIlI[0]];
                                        stringArray11[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[36]];
                                        TileObjects.getNearest((String[])stringArray11).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[37]]);
                                        Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[5])) {
                            int[] nArray = new int[lIIIlllIIlIlI[0]];
                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[38];
                            if (l.lIlIIIllllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIlllIIlIlI[0]];
                                nArray6[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[38];
                                Inventory.getFirst((int[])nArray6).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[21]]);
                            }
                            int[] nArray7 = new int[lIIIlllIIlIlI[0]];
                            nArray7[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[39];
                            if (l.lIlIIIllllIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIlllIIlIlI[0]];
                                nArray8[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[39];
                                Inventory.getFirst((int[])nArray8).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[40]]);
                            }
                            if (l.lIlIIIllllIlIll(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIIlllIIlIlI[6])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[41]];
                                    Movement.walkTo((WorldPoint)cg);
                                    "".length();
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                    "".length();
                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cg), lIIIlllIIlIlI[6]) && l.lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0) && l.lIlIIIllllIlIll(Dialog.isOpen() ? 1 : 0)) {
                                    String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                    stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[42]];
                                    TileObjects.getNearest((String[])stringArray).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[43]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                    "".length();
                                }
                            }
                            if (l.lIlIIIllllIlIIl(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[6])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[44]];
                                    Movement.walkTo((WorldPoint)ch);
                                    "".length();
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                    "".length();
                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[6]) && l.lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[45]], bW);
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[11])) {
                            String[] stringArray = new String[lIIIlllIIlIlI[0]];
                            stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[46]];
                            if (l.lIlIIIllllIlIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ck), lIIIlllIIlIlI[16])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[47]];
                                    Movement.walkTo((WorldPoint)ck);
                                    "".length();
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                    "".length();
                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ck), lIIIlllIIlIlI[16])) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[48]], bW);
                                }
                            }
                            String[] stringArray12 = new String[lIIIlllIIlIlI[0]];
                            stringArray12[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[49]];
                            if (l.lIlIIIllllIlIIl(Inventory.contains((String[])stringArray12) ? 1 : 0)) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[50]];
                                if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[16])) {
                                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[51]];
                                    Movement.walkTo((WorldPoint)ch);
                                    "".length();
                                    Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                    "".length();
                                }
                                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[16])) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[52]], bW);
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[16])) {
                            if (l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11])) {
                                AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[53]];
                                Movement.walkTo((WorldPoint)cl);
                                "".length();
                                Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                                "".length();
                            }
                            if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11]) && l.lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0) && l.lIlIIIllllIlIll(Dialog.isOpen() ? 1 : 0)) {
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[54]];
                                Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest(tileObject -> {
                                    int n2;
                                    if (l.lIlIIIllllIlIIl(tileObject.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[90]]) ? 1 : 0) && l.lIlIIIlllllIIII(tileObject.getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11])) {
                                        n2 = lIIIlllIIlIlI[0];
                                        "".length();
                                        if (((0xED ^ 0xB6 ^ (0x60 ^ 0xC)) & (103 + 5 - 27 + 67 ^ 91 + 150 - 201 + 123 ^ -" ".length())) < -" ".length()) {
                                            return ((0xCC ^ 0xAF ^ (0x63 ^ 0x2F)) & (0x42 ^ 0x16 ^ (0x66 ^ 0x1D) ^ -" ".length())) != 0;
                                        }
                                    } else {
                                        n2 = lIIIlllIIlIlI[1];
                                    }
                                    return n2 != 0;
                                }));
                                Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                "".length();
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[12])) {
                            if (l.lIlIIIllllIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (l.lIlIIIllllIlIll(i.U() ? 1 : 0)) {
                                i.V();
                            }
                            if (l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[55]];
                                if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray13 = new String[lIIIlllIIlIlI[0]];
                                    stringArray13[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[56]];
                                    NPCs.getNearest((String[])stringArray13).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[57]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                    "".length();
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[23]) && l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                            g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[58]], bW);
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[24])) {
                            if (l.lIlIIIllllIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (l.lIlIIIllllIlIll(i.U() ? 1 : 0)) {
                                i.V();
                            }
                            String[] stringArray = new String[lIIIlllIIlIlI[0]];
                            stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[2]];
                            if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                                String[] stringArray14 = new String[lIIIlllIIlIlI[0]];
                                stringArray14[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[59]];
                                if (l.lIlIIIlllllIIII(NPCs.getNearest((String[])stringArray14).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIlllIIlIlI[16])) {
                                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[60]], bW);
                                }
                            }
                            if (l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                                String[] stringArray15 = new String[lIIIlllIIlIlI[0]];
                                stringArray15[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[61]];
                                if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray15))) {
                                    String[] stringArray16 = new String[lIIIlllIIlIlI[0]];
                                    stringArray16[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[62]];
                                    NPCs.getNearest((String[])stringArray16).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[20]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                    "".length();
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[18])) {
                            if (l.lIlIIIllllIlIll(Prayers.isEnabled((Prayer)Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                                Prayers.toggle((Prayer)Prayer.PROTECT_FROM_MELEE);
                            }
                            if (l.lIlIIIllllIlIll(i.U() ? 1 : 0)) {
                                i.V();
                            }
                            if (l.lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                                String[] stringArray = new String[lIIIlllIIlIlI[0]];
                                stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[63]];
                                if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                                    String[] stringArray17 = new String[lIIIlllIIlIlI[0]];
                                    stringArray17[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[64]];
                                    NPCs.getNearest((String[])stringArray17).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[65]]);
                                    Time.sleepTicks((int)lIIIlllIIlIlI[5]);
                                    "".length();
                                }
                            }
                        }
                        if (l.lIlIIIlllllIIll(e.j(cm), lIIIlllIIlIlI[25]) && !l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[26])) break block83;
                        String[] stringArray = new String[lIIIlllIIlIlI[0]];
                        stringArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[66]];
                        if (l.lIlIIIllllIllIl(NPCs.getNearest((String[])stringArray))) {
                            int[] nArray = new int[lIIIlllIIlIlI[0]];
                            nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                            Inventory.getFirst((int[])nArray).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[67]]);
                            Time.sleepTicks((int)lIIIlllIIlIlI[16]);
                            "".length();
                        }
                        lllllllllllllllIIIIIllIlIIllIlII = new WorldPoint(lIIIlllIIlIlI[68], lIIIlllIIlIlI[69], lIIIlllIIlIlI[1]);
                        if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(b.I), lIIIlllIIlIlI[70]) && l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllIIIIIllIlIIllIlII), lIIIlllIIlIlI[6])) {
                            AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[71]];
                            Movement.walkTo((WorldPoint)lllllllllllllllIIIIIllIlIIllIlII);
                            "".length();
                            Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                            "".length();
                        }
                        if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllIIIIIllIlIIllIlII), lIIIlllIIlIlI[6]) && !l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[54])) break block84;
                        if (!l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) break block85;
                        String[] stringArray18 = new String[lIIIlllIIlIlI[0]];
                        stringArray18[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[72]];
                        if (!l.lIlIIIlllllIIlI(NPCs.getNearest((String[])stringArray18)) || !l.lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllIIIIIllIlIIllIlII), lIIIlllIIlIlI[70])) break block85;
                    }
                    WorldArea lllllllllllllllIIIIIllIlIIllIIll = new WorldArea(lIIIlllIIlIlI[73], lIIIlllIIlIlI[74], lIIIlllIIlIlI[43], lIIIlllIIlIlI[37], lIIIlllIIlIlI[1]);
                    if (l.lIlIIIllllIlIlI(e.j(lIIIlllIIlIlI[75]), lIIIlllIIlIlI[24]) && l.lIlIIIllllIlIIl(Equipment.contains(item -> item.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[89]])) ? 1 : 0)) {
                        Equipment.getFirst(item -> item.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[88]])).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[76]]);
                        Time.sleepTicks((int)lIIIlllIIlIlI[12]);
                        "".length();
                    }
                    if (l.lIlIIIllllIlIIl(lllllllllllllllIIIIIllIlIIllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lllllllllllllllIIIIIllIlIIllIIlI = new WorldPoint(lIIIlllIIlIlI[77], lIIIlllIIlIlI[78], lIIIlllIIlIlI[1]);
                        Movement.walkTo((WorldPoint)lllllllllllllllIIIIIllIlIIllIIlI);
                        "".length();
                        Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                        "".length();
                    }
                    if (l.lIlIIIllllIlIll(lllllllllllllllIIIIIllIlIIllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo((WorldPoint)cd);
                        "".length();
                        Time.sleepTicks((int)lIIIlllIIlIlI[0]);
                        "".length();
                    }
                }
                if (l.lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                    g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[79]], bW);
                }
            }
            if (l.lIlIIIllllIlllI(e.j(cm)) && l.lIlIIIllllIlIlI(e.j(cm), lIIIlllIIlIlI[27])) {
                cp = lIIIlllIIlIlI[0];
                co = lIIIlllIIlIlI[1];
            }
            if (l.lIlIIIlllllIIIl(e.j(cm), lIIIlllIIlIlI[27]) && l.lIlIIIllllIlIlI(co, lIIIlllIIlIlI[0]) && l.lIlIIIllllIlIIl(cp ? 1 : 0)) {
                P.iI += lIIIlllIIlIlI[0];
                P.d(AccBuilderRat.m);
                co += lIIIlllIIlIlI[0];
                P.iI = lIIIlllIIlIlI[1];
                cp = lIIIlllIIlIlI[1];
            }
            g.a(bW);
        }
    }

    private static void lIlIIIllllIlIII() {
        lIIIlllIIlIlI = new int[113];
        l.lIIIlllIIlIlI[0] = " ".length();
        l.lIIIlllIIlIlI[1] = (0x4E ^ 0x29 ^ (0x48 ^ 0x18)) & (89 + 74 - 139 + 112 ^ 97 + 82 - 56 + 68 ^ -" ".length());
        l.lIIIlllIIlIlI[2] = 0xB5 ^ 0x98;
        l.lIIIlllIIlIlI[3] = 0x3C ^ 0x31;
        l.lIIIlllIIlIlI[4] = 0xFFFFB3FB & 0x5F8C;
        l.lIIIlllIIlIlI[5] = "  ".length();
        l.lIIIlllIIlIlI[6] = 0x35 ^ 0x31;
        l.lIIIlllIIlIlI[7] = 0xFFFFAE2F & 0x53FE;
        l.lIIIlllIIlIlI[8] = -(0xFFFFEA6F & 0x7D97) & (0xFFFFEFFF & 0x7BEE);
        l.lIIIlllIIlIlI[9] = 0xFFFFDEBF & 0x236D;
        l.lIIIlllIIlIlI[10] = 0xFFFFE26B & 0x1FBE;
        l.lIIIlllIIlIlI[11] = "   ".length();
        l.lIIIlllIIlIlI[12] = 0x73 ^ 0x75;
        l.lIIIlllIIlIlI[13] = -(0xFFFFBBD9 & 0x64A7) & (0xFFFFBFDF & 0x7FE7);
        l.lIIIlllIIlIlI[14] = 0xFFFFF7D5 & 0x397B;
        l.lIIIlllIIlIlI[15] = 0xFFFFA1B7 & 0x5FC9;
        l.lIIIlllIIlIlI[16] = 0x13 ^ 0x3A ^ (0xAC ^ 0x80);
        l.lIIIlllIIlIlI[17] = 0xFFFFBFAA & 0x49D7;
        l.lIIIlllIIlIlI[18] = 0xA4 ^ 0xAE;
        l.lIIIlllIIlIlI[19] = -(0xFFFFDFFF & 0x281D) & (0xFFFF8BFF & Short.MAX_VALUE);
        l.lIIIlllIIlIlI[20] = 0xC ^ 0x3E;
        l.lIIIlllIIlIlI[21] = 0x4D ^ 0x54;
        l.lIIIlllIIlIlI[22] = 0x35 ^ 0x3B ^ (0x8E ^ 0x87);
        l.lIIIlllIIlIlI[23] = 0xA5 ^ 0xAD;
        l.lIIIlllIIlIlI[24] = 115 + 201 - 221 + 108 ^ 170 + 63 - 86 + 47;
        l.lIIIlllIIlIlI[25] = 0x33 ^ 0x38;
        l.lIIIlllIIlIlI[26] = 0x22 ^ 0x7B ^ (0xED ^ 0xB8);
        l.lIIIlllIIlIlI[27] = 0x2B ^ 0x68 ^ (6 ^ 0x4B);
        l.lIIIlllIIlIlI[28] = 0x69 ^ 0x66;
        l.lIIIlllIIlIlI[29] = 0x9D ^ 0x8D;
        l.lIIIlllIIlIlI[30] = 0xA3 ^ 0xB2;
        l.lIIIlllIIlIlI[31] = 157 + 94 - 188 + 100 ^ 83 + 116 - 48 + 26;
        l.lIIIlllIIlIlI[32] = 92 + 127 - 119 + 31 ^ 97 + 89 - 78 + 36;
        l.lIIIlllIIlIlI[33] = 0x8F ^ 0x9B;
        l.lIIIlllIIlIlI[34] = 131 + 145 - 230 + 131 ^ 145 + 31 - 112 + 100;
        l.lIIIlllIIlIlI[35] = 122 + 170 - 183 + 100 ^ 138 + 1 - 33 + 93;
        l.lIIIlllIIlIlI[36] = 7 ^ 0x10;
        l.lIIIlllIIlIlI[37] = 0x7E ^ 0x66;
        l.lIIIlllIIlIlI[38] = 5 ^ 0x4E;
        l.lIIIlllIIlIlI[39] = 122 + 191 - 234 + 120 ^ 26 + 92 - -6 + 17;
        l.lIIIlllIIlIlI[40] = 0xFF ^ 0xA9 ^ (0xFA ^ 0xB6);
        l.lIIIlllIIlIlI[41] = 0x1D ^ 0x73 ^ (0x61 ^ 0x14);
        l.lIIIlllIIlIlI[42] = 0x81 ^ 0x9D;
        l.lIIIlllIIlIlI[43] = 0x39 ^ 0x24;
        l.lIIIlllIIlIlI[44] = 136 + 83 - 111 + 34 ^ 69 + 14 - 47 + 108;
        l.lIIIlllIIlIlI[45] = 0x79 ^ 0x66;
        l.lIIIlllIIlIlI[46] = 0x42 ^ 0x62;
        l.lIIIlllIIlIlI[47] = 0 ^ 0x52 ^ (0x7A ^ 9);
        l.lIIIlllIIlIlI[48] = 0x61 ^ 0x75 ^ (0x25 ^ 0x13);
        l.lIIIlllIIlIlI[49] = 0x31 ^ 0x4B ^ (0x2C ^ 0x75);
        l.lIIIlllIIlIlI[50] = 42 + 24 - -15 + 102 ^ 85 + 23 - -10 + 29;
        l.lIIIlllIIlIlI[51] = 0x71 ^ 0x47 ^ (0x9F ^ 0x8C);
        l.lIIIlllIIlIlI[52] = 0x5B ^ 0x7D;
        l.lIIIlllIIlIlI[53] = 42 + 137 - 39 + 50 ^ 133 + 6 - 75 + 89;
        l.lIIIlllIIlIlI[54] = 90 + 26 - -6 + 8 ^ 106 + 81 - 76 + 59;
        l.lIIIlllIIlIlI[55] = 0xA6 ^ 0x8F;
        l.lIIIlllIIlIlI[56] = 139 + 124 - 222 + 130 ^ 65 + 4 - -43 + 17;
        l.lIIIlllIIlIlI[57] = 0x45 ^ 0x6E;
        l.lIIIlllIIlIlI[58] = 0x93 ^ 0xBF;
        l.lIIIlllIIlIlI[59] = 0x5B ^ 0x75;
        l.lIIIlllIIlIlI[60] = 0x9D ^ 0x9B ^ (0x5B ^ 0x72);
        l.lIIIlllIIlIlI[61] = 0xA0 ^ 0xB4 ^ (0x1A ^ 0x3E);
        l.lIIIlllIIlIlI[62] = 0xE3 ^ 0xA2 ^ (0x3D ^ 0x4D);
        l.lIIIlllIIlIlI[63] = 0x59 ^ 0x38 ^ (0xD1 ^ 0x83);
        l.lIIIlllIIlIlI[64] = 27 + 5 - 15 + 122 ^ 117 + 7 - 117 + 184;
        l.lIIIlllIIlIlI[65] = 0x40 ^ 0x75;
        l.lIIIlllIIlIlI[66] = 0x8B ^ 0xA3 ^ (0x53 ^ 0x4D);
        l.lIIIlllIIlIlI[67] = 0x70 ^ 0x2C ^ (0xC1 ^ 0xAA);
        l.lIIIlllIIlIlI[68] = 0xFFFFEEF3 & 0x1D7C;
        l.lIIIlllIIlIlI[69] = 0xFFFFDDF3 & 0x2FBF;
        l.lIIIlllIIlIlI[70] = (0xBA ^ 0xA5) + (0xF6 ^ 0x9D) - (0x1C ^ 7) + (0x57 ^ 0x70);
        l.lIIIlllIIlIlI[71] = 0x91 ^ 0xA9;
        l.lIIIlllIIlIlI[72] = 0x68 ^ 0x4B ^ (0xA1 ^ 0xBB);
        l.lIIIlllIIlIlI[73] = 0xFFFFEDFF & 0x1B80;
        l.lIIIlllIIlIlI[74] = 0xFFFFCEFF & 0x3D07;
        l.lIIIlllIIlIlI[75] = 159 + 134 - 291 + 166 ^ 134 + 151 - 122 + 36;
        l.lIIIlllIIlIlI[76] = 0x54 ^ 0x19 ^ (0xFB ^ 0x8C);
        l.lIIIlllIIlIlI[77] = 0xFFFF99BB & 0x6FE5;
        l.lIIIlllIIlIlI[78] = 0xFFFFBDD1 & 0x4E2F;
        l.lIIIlllIIlIlI[79] = 0xA7 ^ 0x98 ^ (0x4B ^ 0x4F);
        l.lIIIlllIIlIlI[80] = 0xFFFFD578 & 0x2FFF;
        l.lIIIlllIIlIlI[81] = 0xFFFFAFFC & 0x7ECF;
        l.lIIIlllIIlIlI[82] = -(0xFFFFB79F & 0x4E77) & (0xFFFFE7BE & Short.MAX_VALUE);
        l.lIIIlllIIlIlI[83] = -(0xFFFFDB77 & 0x2CAF) & (0xFFFFFAFE & 0x3FEF);
        l.lIIIlllIIlIlI[84] = 0xFFFFEFB6 & 0x13CD;
        l.lIIIlllIIlIlI[85] = 0x38 ^ 0x4F ^ (0x25 ^ 0x36);
        l.lIIIlllIIlIlI[86] = 0x73 ^ 9 ^ (0x4B ^ 0xD);
        l.lIIIlllIIlIlI[87] = 1 + 82 - -4 + 94 ^ 54 + 79 - 103 + 106;
        l.lIIIlllIIlIlI[88] = 0x51 ^ 0x6F;
        l.lIIIlllIIlIlI[89] = 0x8A ^ 0xB5;
        l.lIIIlllIIlIlI[90] = 0x32 ^ 0x72;
        l.lIIIlllIIlIlI[91] = -(0xFFFFB579 & 0x5EF7) & (0xFFFF9FF7 & 0x7E7F);
        l.lIIIlllIIlIlI[92] = 0xFFFFFF7F & 0xCFE;
        l.lIIIlllIIlIlI[93] = 0xFFFFCAFA & 0x3F35;
        l.lIIIlllIIlIlI[94] = 0xFFFFBEFF & 0x4D75;
        l.lIIIlllIIlIlI[95] = 0xFFFFFEFD & 0xB37;
        l.lIIIlllIIlIlI[96] = 0xFFFFEC7F & 0x1FF6;
        l.lIIIlllIIlIlI[97] = -(0xFFFFF78B & 0x7D77) & (0xFFFFFFBA & 0x7F7F);
        l.lIIIlllIIlIlI[98] = 0xFFFFCDE7 & 0x3E7D;
        l.lIIIlllIIlIlI[99] = -(0xFFFFD5EF & 0x6A59) & (0xFFFFCE7F & 0x7BFF);
        l.lIIIlllIIlIlI[100] = -(0xFFFFFB9B & 0x657E) & (0xFFFFFFFF & 0x6D5F);
        l.lIIIlllIIlIlI[101] = -(0xFFFFFC7D & 0x73E7) & (0xFFFFFEFE & 0x7B7F);
        l.lIIIlllIIlIlI[102] = -(0xFFFFDF9B & 0x336F) & (0xFFFF9FCE & 0x7F7F);
        l.lIIIlllIIlIlI[103] = -(0xFFFFD4FE & 0x7FA3) & (0xFFFFDFB7 & 0x7EFB);
        l.lIIIlllIIlIlI[104] = 0xFFFFDFD8 & 0x2C6F;
        l.lIIIlllIIlIlI[105] = -(0xFFFFAAF7 & 0x7539) & (0xFFFFECFF & 0x3F77);
        l.lIIIlllIIlIlI[106] = 0xFFFFBE3F & 0x4BFA;
        l.lIIIlllIIlIlI[107] = 0xFFFF9FFF & 0x6C5F;
        l.lIIIlllIIlIlI[108] = 0xFFFF8ED3 & 0x7D6F;
        l.lIIIlllIIlIlI[109] = 0x78 ^ 0x72 ^ (0x11 ^ 0x5A);
        l.lIIIlllIIlIlI[110] = 0x48 ^ 0xA;
        l.lIIIlllIIlIlI[111] = 7 ^ 0x44;
        l.lIIIlllIIlIlI[112] = 0x75 ^ 0x1B ^ (0x65 ^ 0x4F);
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (!l.lIlIIIlllllIlII(Quests.getState((Quest)Quest.FIGHT_ARENA), QuestState.FINISHED) || l.lIlIIIllllIllII(e.j(cm), lIIIlllIIlIlI[27])) {
            bl = lIIIlllIIlIlI[0];
            "".length();
            if (-"  ".length() >= 0) {
                return ((102 + 160 - 142 + 66 ^ 2 + 54 - 22 + 113) & (0x35 ^ 0x5D ^ (0x85 ^ 0xC4) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIIlllIIlIlI[1];
        }
        return bl;
    }

    @Override
    public boolean X() {
        return lIIIlllIIlIlI[1];
    }

    private static boolean lIlIIIllllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlllllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void W() {
        block35: {
            d lllllllllllllllIIIIIllIlIIlIlIlI;
            block34: {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                Object lllllllllllllllIIIIIllIlIIlIlIll;
                                block29: {
                                    block28: {
                                        block27: {
                                            block26: {
                                                block25: {
                                                    block24: {
                                                        block23: {
                                                            block22: {
                                                                int[] nArray = new int[lIIIlllIIlIlI[0]];
                                                                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                int[] nArray2 = new int[lIIIlllIIlIlI[0]];
                                                                nArray2[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                                                int[] nArray3 = new int[lIIIlllIIlIlI[0]];
                                                                nArray3[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                                                                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray3).getQuantity(), lIIIlllIIlIlI[8])) break block23;
                                                            }
                                                            lllllllllllllllIIIIIllIlIIlIlIll = new d(lIIIlllIIlIlI[9], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]);
                                                            bA.add((d)lllllllllllllllIIIIIllIlIIlIlIll);
                                                            "".length();
                                                        }
                                                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                                                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                                        int[] nArray4 = new int[lIIIlllIIlIlI[0]];
                                                        nArray4[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block25;
                                                        int[] nArray5 = new int[lIIIlllIIlIlI[0]];
                                                        nArray5[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                                                        if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray5).getQuantity(), lIIIlllIIlIlI[8])) break block25;
                                                    }
                                                    lllllllllllllllIIIIIllIlIIlIlIll = new d(lIIIlllIIlIlI[7], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]);
                                                    bA.add((d)lllllllllllllllIIIIIllIlIIlIlIll);
                                                    "".length();
                                                }
                                                int[] nArray = new int[lIIIlllIIlIlI[0]];
                                                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                                                int[] nArray6 = new int[lIIIlllIIlIlI[0]];
                                                nArray6[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block27;
                                                int[] nArray7 = new int[lIIIlllIIlIlI[0]];
                                                nArray7[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                                                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), lIIIlllIIlIlI[8])) break block27;
                                            }
                                            lllllllllllllllIIIIIllIlIIlIlIll = new d(lIIIlllIIlIlI[10], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]);
                                            bA.add((d)lllllllllllllllIIIIIllIlIIlIlIll);
                                            "".length();
                                        }
                                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                                        int[] nArray8 = new int[lIIIlllIIlIlI[0]];
                                        nArray8[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block29;
                                        int[] nArray9 = new int[lIIIlllIIlIlI[0]];
                                        nArray9[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                                        if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray9).getQuantity(), lIIIlllIIlIlI[28])) break block29;
                                    }
                                    lllllllllllllllIIIIIllIlIIlIlIll = new d(lIIIlllIIlIlI[15], lIIIlllIIlIlI[33], lIIIlllIIlIlI[80]);
                                    bA.add((d)lllllllllllllllIIIIIllIlIIlIlIll);
                                    "".length();
                                }
                                if (l.lIlIIIllllIlIll(Bank.contains((Predicate)(lllllllllllllllIIIIIllIlIIlIlIll = item -> item.getName().toLowerCase().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[87]]))) ? 1 : 0)) {
                                    lllllllllllllllIIIIIllIlIIlIlIlI = new d(lIIIlllIIlIlI[81], lIIIlllIIlIlI[16], lIIIlllIIlIlI[82]);
                                    bA.add(lllllllllllllllIIIIIllIlIIlIlIlI);
                                    "".length();
                                }
                                int[] nArray = new int[lIIIlllIIlIlI[0]];
                                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block30;
                                int[] nArray10 = new int[lIIIlllIIlIlI[0]];
                                nArray10[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block31;
                                int[] nArray11 = new int[lIIIlllIIlIlI[0]];
                                nArray11[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), lIIIlllIIlIlI[6])) break block31;
                            }
                            lllllllllllllllIIIIIllIlIIlIlIlI = new d(lIIIlllIIlIlI[14], lIIIlllIIlIlI[6], h.bv);
                            bA.add(lllllllllllllllIIIIIllIlIIlIlIlI);
                            "".length();
                        }
                        int[] nArray = new int[lIIIlllIIlIlI[0]];
                        nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block32;
                        int[] nArray12 = new int[lIIIlllIIlIlI[0]];
                        nArray12[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                        if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray12) ? 1 : 0)) break block33;
                        int[] nArray13 = new int[lIIIlllIIlIlI[0]];
                        nArray13[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                        if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray13).getQuantity(), lIIIlllIIlIlI[5])) break block33;
                    }
                    lllllllllllllllIIIIIllIlIIlIlIlI = new d(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11], lIIIlllIIlIlI[83]);
                    bA.add(lllllllllllllllIIIIIllIlIIlIlIlI);
                    "".length();
                }
                int[] nArray = new int[lIIIlllIIlIlI[0]];
                nArray[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block34;
                int[] nArray14 = new int[lIIIlllIIlIlI[0]];
                nArray14[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                if (!l.lIlIIIllllIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) break block35;
                int[] nArray15 = new int[lIIIlllIIlIlI[0]];
                nArray15[l.lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                if (!l.lIlIIIllllIlIlI(Bank.getFirst((int[])nArray15).getQuantity(), lIIIlllIIlIlI[28])) break block35;
            }
            lllllllllllllllIIIIIllIlIIlIlIlI = new d(lIIIlllIIlIlI[13], lIIIlllIIlIlI[54], lIIIlllIIlIlI[84]);
            bA.add(lllllllllllllllIIIIIllIlIIlIlIlI);
            "".length();
        }
    }

    @Override
    public int Y() {
        try {
            l.ar();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x34 ^ 0x78) & ~(0x74 ^ 0x38)) == (0x42 ^ 0x46)) {
            return (0xEF ^ 0xBB) & ~(0x38 ^ 0x6C);
        }
        return lIIIlllIIlIlI[85];
    }

    @Override
    public String Z() {
        return lIIIlllIIlIIl[lIIIlllIIlIlI[86]];
    }

    private static boolean lIlIIIllllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlllllIIlI(Object object) {
        return object == null;
    }

    private static String lIlIIIllllIIlII(String lllllllllllllllIIIIIllIIllllllII, String lllllllllllllllIIIIIllIlIIIIIIII) {
        lllllllllllllllIIIIIllIIllllllII = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllIIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIllIIllllllll = new StringBuilder();
        char[] lllllllllllllllIIIIIllIIlllllllI = lllllllllllllllIIIIIllIlIIIIIIII.toCharArray();
        int lllllllllllllllIIIIIllIIllllllIl = lIIIlllIIlIlI[1];
        char[] lllllllllllllllIIIIIllIIllllIlll = lllllllllllllllIIIIIllIIllllllII.toCharArray();
        int lllllllllllllllIIIIIllIIllllIllI = lllllllllllllllIIIIIllIIllllIlll.length;
        int lllllllllllllllIIIIIllIIllllIlIl = lIIIlllIIlIlI[1];
        while (l.lIlIIIllllIlIlI(lllllllllllllllIIIIIllIIllllIlIl, lllllllllllllllIIIIIllIIllllIllI)) {
            char lllllllllllllllIIIIIllIlIIIIIIlI = lllllllllllllllIIIIIllIIllllIlll[lllllllllllllllIIIIIllIIllllIlIl];
            lllllllllllllllIIIIIllIIllllllll.append((char)(lllllllllllllllIIIIIllIlIIIIIIlI ^ lllllllllllllllIIIIIllIIlllllllI[lllllllllllllllIIIIIllIIllllllIl % lllllllllllllllIIIIIllIIlllllllI.length]));
            "".length();
            ++lllllllllllllllIIIIIllIIllllllIl;
            ++lllllllllllllllIIIIIllIIllllIlIl;
            "".length();
            if ((" ".length() & ~" ".length()) == ((0x7C ^ 0x6D) & ~(5 ^ 0x14))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIllIIllllllll);
    }

    private static String lIlIIIllllIIllI(String lllllllllllllllIIIIIllIlIIIlllII, String lllllllllllllllIIIIIllIlIIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIlIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIIIlllIIlIlI[23]), "DES");
            Cipher lllllllllllllllIIIIIllIlIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllllIIIIIllIlIIlIIIII.init(lIIIlllIIlIlI[5], lllllllllllllllIIIIIllIlIIlIIIIl);
            return new String(lllllllllllllllIIIIIllIlIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIllIlIIIlllll) {
            lllllllllllllllIIIIIllIlIIIlllll.printStackTrace();
            return null;
        }
    }
}

