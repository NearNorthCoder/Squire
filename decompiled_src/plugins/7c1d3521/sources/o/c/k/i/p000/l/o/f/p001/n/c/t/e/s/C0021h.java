package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/h.class */
public class C0021h {
    private static /* synthetic */ int bH;
    private static /* synthetic */ int bO;
    private static /* synthetic */ Map<Integer, Integer> bB;
    private static /* synthetic */ int bP;
    private static /* synthetic */ Map<Integer, Integer> bx;
    private static /* synthetic */ int bL;
    private static /* synthetic */ Map<Integer, Integer> bw;
    private static /* synthetic */ int ca;
    private static /* synthetic */ int bX;
    private static /* synthetic */ int cb;
    private static /* synthetic */ int bS;
    private static /* synthetic */ Map<Integer, Integer> bF;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int bQ;
    private static /* synthetic */ Map<Integer, Integer> by;
    private static /* synthetic */ int cc;
    private static /* synthetic */ int bJ;
    private static /* synthetic */ Map<Integer, Integer> bA;
    private static /* synthetic */ Map<Integer, Integer> bG;
    private static /* synthetic */ Map<Integer, Integer> bC;
    private static /* synthetic */ int bR;
    private static /* synthetic */ int bV;
    public static /* synthetic */ boolean bu;
    public static /* synthetic */ List<C0017d> bv;
    private static /* synthetic */ int bY;
    private static /* synthetic */ int bK;
    private static /* synthetic */ int bN;
    private static /* synthetic */ String[] llIIllllII;
    private static /* synthetic */ int bU;
    private static /* synthetic */ Map<Integer, Integer> bz;
    private static /* synthetic */ int bI;
    private static /* synthetic */ int[] llIIllllIl;
    private static /* synthetic */ int bT;
    private static /* synthetic */ int bZ;
    private static /* synthetic */ int bM;
    private static /* synthetic */ Map<Integer, Integer> bD;
    private static /* synthetic */ Map<Integer, Integer> bE;
    private static /* synthetic */ int bW;

    private static boolean n(int i) {
        if (lIlIllllIlIIl(i, llIIllllIl[16])) {
            int[] iArr = new int[llIIllllIl[10]];
            iArr[llIIllllIl[0]] = bH;
            iArr[llIIllllIl[1]] = bI;
            iArr[llIIllllIl[2]] = bJ;
            iArr[llIIllllIl[3]] = bK;
            iArr[llIIllllIl[4]] = bL;
            iArr[llIIllllIl[5]] = bM;
            iArr[llIIllllIl[6]] = bN;
            iArr[llIIllllIl[7]] = bO;
            iArr[llIIllllIl[8]] = bP;
            iArr[llIIllllIl[9]] = bQ;
            return c(iArr);
        }
        int[] iArr2 = new int[llIIllllIl[11]];
        iArr2[llIIllllIl[0]] = bH;
        iArr2[llIIllllIl[1]] = bI;
        iArr2[llIIllllIl[2]] = bJ;
        iArr2[llIIllllIl[3]] = bK;
        iArr2[llIIllllIl[4]] = bL;
        iArr2[llIIllllIl[5]] = bM;
        iArr2[llIIllllIl[6]] = bN;
        iArr2[llIIllllIl[7]] = bO;
        iArr2[llIIllllIl[8]] = bP;
        iArr2[llIIllllIl[9]] = bQ;
        iArr2[llIIllllIl[10]] = i;
        return c(iArr2);
    }

    private static boolean lIlIllllIlIIl(int i, int i2) {
        return i == i2;
    }

    private static void S() {
        if (lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[5])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[25]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27]))));
            bB.putAll(Map.of(Integer.valueOf(llIIllllIl[29]), Integer.valueOf(C0018e.c(llIIllllIl[30], llIIllllIl[31])), Integer.valueOf(llIIllllIl[32]), Integer.valueOf(C0018e.c(llIIllllIl[30], llIIllllIl[31]))));
            bA.putAll(Map.of(Integer.valueOf(llIIllllIl[33]), Integer.valueOf(C0018e.c(llIIllllIl[34], llIIllllIl[35]))));
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[36]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[39]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[40]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38]))));
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[41]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[44]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[45]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[5]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[46])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[47]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27]))));
            bB.putAll(Map.of(Integer.valueOf(llIIllllIl[48]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[32]), Integer.valueOf(C0018e.c(llIIllllIl[30], llIIllllIl[31]))));
            bA.putAll(Map.of(Integer.valueOf(llIIllllIl[49]), Integer.valueOf(C0018e.c(llIIllllIl[34], llIIllllIl[35]))));
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[50]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[39]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38]))));
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[41]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[51]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[46]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[52])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[53]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[47]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[54]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[56]))));
            bB.putAll(Map.of(Integer.valueOf(llIIllllIl[57]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[48]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[127]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[56]))));
            bA.putAll(Map.of(Integer.valueOf(llIIllllIl[58]), Integer.valueOf(C0018e.c(llIIllllIl[34], llIIllllIl[35]))));
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[50]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[59]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[60]), Integer.valueOf(C0018e.c(llIIllllIl[61], llIIllllIl[62]))));
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[63]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[51]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[64]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[52]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[65])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[66]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[67]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[68]))));
            bB.putAll(Map.of(Integer.valueOf(llIIllllIl[69]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[70]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[68])), Integer.valueOf(llIIllllIl[57]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27]))));
            bA.putAll(Map.of(Integer.valueOf(llIIllllIl[71]), Integer.valueOf(C0018e.c(llIIllllIl[34], llIIllllIl[35]))));
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[72]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[59]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[73]), Integer.valueOf(C0018e.c(llIIllllIl[74], llIIllllIl[75])), Integer.valueOf(llIIllllIl[76]), Integer.valueOf(C0018e.c(llIIllllIl[74], llIIllllIl[75]))));
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[63]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[77]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[78]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[65]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[79])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[66]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[80]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[68])), Integer.valueOf(llIIllllIl[128]), Integer.valueOf(C0018e.c(llIIllllIl[82], llIIllllIl[83]))));
            bB.putAll(Map.of(Integer.valueOf(llIIllllIl[69]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[84]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[68])), Integer.valueOf(llIIllllIl[85]), Integer.valueOf(C0018e.c(llIIllllIl[82], llIIllllIl[83]))));
            bA.putAll(Map.of(Integer.valueOf(llIIllllIl[89]), Integer.valueOf(C0018e.c(llIIllllIl[90], llIIllllIl[91]))));
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[72]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[92]), Integer.valueOf(C0018e.c(llIIllllIl[74], llIIllllIl[75])), Integer.valueOf(llIIllllIl[73]), Integer.valueOf(C0018e.c(llIIllllIl[74], llIIllllIl[75])), Integer.valueOf(llIIllllIl[76]), Integer.valueOf(C0018e.c(llIIllllIl[74], llIIllllIl[75]))));
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[93]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[77]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[96]), Integer.valueOf(C0018e.c(llIIllllIl[94], llIIllllIl[95]))));
        }
        bx.putAll(Map.of(Integer.valueOf(llIIllllIl[129]), Integer.valueOf(C0018e.c(llIIllllIl[98], llIIllllIl[42])), Integer.valueOf(llIIllllIl[97]), Integer.valueOf(C0018e.c(llIIllllIl[98], llIIllllIl[42])), Integer.valueOf(llIIllllIl[99]), Integer.valueOf(C0018e.c(llIIllllIl[98], llIIllllIl[42])), Integer.valueOf(llIIllllIl[100]), Integer.valueOf(C0018e.c(llIIllllIl[101], llIIllllIl[102])), Integer.valueOf(llIIllllIl[103]), Integer.valueOf(C0018e.c(llIIllllIl[98], llIIllllIl[42]))));
        by.putAll(Map.of(Integer.valueOf(llIIllllIl[104]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[107]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[108]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[109]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[110]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106]))));
        bz.putAll(Map.of(Integer.valueOf(llIIllllIl[130]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132])), Integer.valueOf(llIIllllIl[133]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132])), Integer.valueOf(llIIllllIl[134]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132])), Integer.valueOf(llIIllllIl[135]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132]))));
        bE.putAll(Map.of(Integer.valueOf(llIIllllIl[136]), Integer.valueOf(C0018e.c(llIIllllIl[137], llIIllllIl[68]))));
        bF.putAll(Map.of(Integer.valueOf(llIIllllIl[119]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[138]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[139]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[140]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[141]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116]))));
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[5]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[46])) {
            bF.putAll(Map.of(Integer.valueOf(llIIllllIl[142]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[46]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[52])) {
            bF.putAll(Map.of(Integer.valueOf(llIIllllIl[143]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[65]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[79])) {
            bF.putAll(Map.of(Integer.valueOf(llIIllllIl[144]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116]))));
        }
        bG.putAll(Map.of(Integer.valueOf(llIIllllIl[16]), Integer.valueOf(C0018e.c(llIIllllIl[145], llIIllllIl[146]))));
    }

    private static void lIlIllllIIIlI() {
        llIIllllII = new String[llIIllllIl[205]];
        llIIllllII[llIIllllIl[0]] = lIlIlllIlllll("NmYDNS08MRY=", "PTsXH");
        llIIllllII[llIIllllIl[1]] = lIlIllllIIIII("4XBBgDBha+fRue9vaDht3w==", "TVZli");
        llIIllllII[llIIllllIl[2]] = lIlIllllIIIIl("B9PQ1MOO4po=", "JIpGM");
        llIIllllII[llIIllllIl[3]] = lIlIlllIlllll("JQcrCQ==", "HfLlM");
        llIIllllII[llIIllllIl[4]] = lIlIllllIIIIl("fJXcilKTcvA=", "imPrF");
        llIIllllII[llIIllllIl[5]] = lIlIllllIIIII("uQEfNakQ0y+JYpeke5flEw==", "mwcVW");
        llIIllllII[llIIllllIl[6]] = lIlIllllIIIIl("XYVucbTzUlo=", "IqeyW");
        llIIllllII[llIIllllIl[7]] = lIlIllllIIIII("PEnou7fJpwE=", "bPpZS");
        llIIllllII[llIIllllIl[8]] = lIlIllllIIIIl("f03WFQ+shpxb/VFCANH/SQ==", "hQWfU");
        llIIllllII[llIIllllIl[9]] = lIlIlllIlllll("OBUINhMEGRw=", "JtfQv");
        llIIllllII[llIIllllIl[10]] = lIlIlllIlllll("BzALFSM4OB8UKHUUFAQlJTwAHzhv", "UQeqL");
        llIIllllII[llIIllllIl[11]] = lIlIlllIlllll("EgMPOSQ3Vh8kLz0F", "PvvPJ");
        llIIllllII[llIIllllIl[12]] = lIlIlllIlllll("Ay0fDjgtIRVHKTA9GAksZS0FAiY2aFEUPCwwEg8iKyNRBSomL1ETJGU2EAkvKik2Aio3LR8A", "EDqgK");
        llIIllllII[llIIllllIl[13]] = lIlIlllIlllll("AA8/ETEvGiAWMW4aJlg0LwAi", "NnIxV");
        llIIllllII[llIIllllIl[14]] = lIlIllllIIIIl("YkAcu+gXEy+6Rp+NMml//kaQoVB13M5V", "LmfCb");
        llIIllllII[llIIllllIl[19]] = lIlIllllIIIII("CIeYfyptgzp9UK3+AA63x0c0qKzqt4+9CPP6aeZY8acQTrhu6DuVToqIq2FvGERT", "wdsOa");
        llIIllllII[llIIllllIl[20]] = lIlIllllIIIIl("Xh8K65iP5SqmaQ+7jEC1qgqtVqXrRrSokw+spZGnVAbW6D3CVZBon/arKQAqRCSr", "AlHmL");
        llIIllllII[llIIllllIl[21]] = lIlIllllIIIII("5xsf7T/voehlpv49PXiYAh1wEeuiRpe+sRLDj44NcCGs3JWBWKgJr06r/AtvF6gK", "LBguT");
        llIIllllII[llIIllllIl[24]] = lIlIllllIIIIl("5G+NwQ0/YyCbRSiQBbMpCSZ1gFnYQYHa", "DBQkK");
        llIIllllII[llIIllllIl[203]] = lIlIlllIlllll("OCoXOyUIJwYmMU0hADE6H2QdIDYYNgAmMU0zGio5CGQVJiEZLRwkdQxkACI7CSsfYz4IPVw=", "mDrCU");
        llIIllllII[llIIllllIl[46]] = lIlIllllIIIIl("LQExU5aWSGl48Cm0EJWtQNobG3w1l8yxMyjsQEM3RX8=", "pfton");
        llIIllllII[llIIllllIl[204]] = lIlIllllIIIII("qzUS8nB71K4=", "xzdIu");
    }

    private static boolean lIlIllllIlIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIllllIlIII(int i) {
        return i > 0;
    }

    private static void V() {
        bw.putAll(Map.of(Integer.valueOf(llIIllllIl[184]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[185]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[186]), Integer.valueOf(C0018e.c(llIIllllIl[187], llIIllllIl[98])), Integer.valueOf(llIIllllIl[188]), Integer.valueOf(C0018e.c(llIIllllIl[187], llIIllllIl[98])), Integer.valueOf(llIIllllIl[189]), Integer.valueOf(C0018e.c(llIIllllIl[187], llIIllllIl[98])), Integer.valueOf(llIIllllIl[190]), Integer.valueOf(C0018e.c(llIIllllIl[187], llIIllllIl[98])), Integer.valueOf(llIIllllIl[191]), Integer.valueOf(C0018e.c(llIIllllIl[187], llIIllllIl[98])), Integer.valueOf(llIIllllIl[192]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[146])), Integer.valueOf(llIIllllIl[193]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27]))));
        bw.putAll(Map.of(Integer.valueOf(llIIllllIl[25]), Integer.valueOf(C0018e.c(llIIllllIl[187], llIIllllIl[98])), Integer.valueOf(llIIllllIl[194]), Integer.valueOf(C0018e.c(llIIllllIl[187], llIIllllIl[98])), Integer.valueOf(llIIllllIl[195]), Integer.valueOf(C0018e.c(llIIllllIl[187], llIIllllIl[98]))));
        bx.putAll(Map.of(Integer.valueOf(llIIllllIl[97]), Integer.valueOf(C0018e.c(llIIllllIl[98], llIIllllIl[42])), Integer.valueOf(llIIllllIl[99]), Integer.valueOf(C0018e.c(llIIllllIl[98], llIIllllIl[42])), Integer.valueOf(llIIllllIl[196]), Integer.valueOf(C0018e.c(llIIllllIl[98], llIIllllIl[42]))));
        by.putAll(Map.of(Integer.valueOf(llIIllllIl[104]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[107]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[108]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[109]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[110]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106]))));
        bz.putAll(Map.of());
        bA.putAll(Map.of(Integer.valueOf(llIIllllIl[197]), Integer.valueOf(C0018e.c(llIIllllIl[34], llIIllllIl[35]))));
        bC.putAll(Map.of(Integer.valueOf(llIIllllIl[198]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[199]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[200]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38]))));
        bD.putAll(Map.of(Integer.valueOf(llIIllllIl[201]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[202]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43]))));
        bE.putAll(Map.of(Integer.valueOf(llIIllllIl[114]), Integer.valueOf(C0018e.c(llIIllllIl[137], llIIllllIl[68])), Integer.valueOf(llIIllllIl[118]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[117]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116]))));
        bF.putAll(Map.of(Integer.valueOf(llIIllllIl[119]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[121]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[122]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[120]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116]))));
        bG.putAll(Map.of(Integer.valueOf(llIIllllIl[123]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[125]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[126]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116]))));
    }

    private static int a(Map<Integer, Integer> map, Random random) {
        if (lIlIllllIIlII(map.isEmpty() ? 1 : 0)) {
            return llIIllllIl[0];
        }
        int nextInt = random.nextInt(map.size());
        int i = llIIllllIl[0];
        for (Integer num : map.keySet()) {
            int intValue = num.intValue();
            if (lIlIllllIlIIl(i, nextInt)) {
                return intValue;
            }
            i++;
            "".length();
            if (" ".length() > "  ".length()) {
                return "  ".length() & ("  ".length() ^ (-" ".length()));
            }
        }
        throw new IllegalStateException(llIIllllII[llIIllllIl[203]]);
    }

    private static void R() {
        if (lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[5])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[25]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[28]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27]))));
            bB.putAll(Map.of(Integer.valueOf(llIIllllIl[29]), Integer.valueOf(C0018e.c(llIIllllIl[30], llIIllllIl[31])), Integer.valueOf(llIIllllIl[32]), Integer.valueOf(C0018e.c(llIIllllIl[30], llIIllllIl[31]))));
            bA.putAll(Map.of(Integer.valueOf(llIIllllIl[33]), Integer.valueOf(C0018e.c(llIIllllIl[34], llIIllllIl[35]))));
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[36]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[39]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[40]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38]))));
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[41]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[44]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[45]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[5]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[46])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[47]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27]))));
            bB.putAll(Map.of(Integer.valueOf(llIIllllIl[48]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[32]), Integer.valueOf(C0018e.c(llIIllllIl[30], llIIllllIl[31]))));
            bA.putAll(Map.of(Integer.valueOf(llIIllllIl[49]), Integer.valueOf(C0018e.c(llIIllllIl[34], llIIllllIl[35]))));
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[50]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[39]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38]))));
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[41]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[51]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[46]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[52])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[53]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[47]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[54]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[56]))));
            bB.putAll(Map.of(Integer.valueOf(llIIllllIl[57]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[48]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27]))));
            bA.putAll(Map.of(Integer.valueOf(llIIllllIl[58]), Integer.valueOf(C0018e.c(llIIllllIl[34], llIIllllIl[35]))));
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[50]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[59]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[60]), Integer.valueOf(C0018e.c(llIIllllIl[61], llIIllllIl[62]))));
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[63]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[51]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[64]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[52]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[65])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[66]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[67]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[68]))));
            bB.putAll(Map.of(Integer.valueOf(llIIllllIl[69]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[70]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[68])), Integer.valueOf(llIIllllIl[57]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27]))));
            bA.putAll(Map.of(Integer.valueOf(llIIllllIl[71]), Integer.valueOf(C0018e.c(llIIllllIl[34], llIIllllIl[35]))));
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[72]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[59]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[73]), Integer.valueOf(C0018e.c(llIIllllIl[74], llIIllllIl[75])), Integer.valueOf(llIIllllIl[76]), Integer.valueOf(C0018e.c(llIIllllIl[74], llIIllllIl[75]))));
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[63]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[77]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43])), Integer.valueOf(llIIllllIl[78]), Integer.valueOf(C0018e.c(llIIllllIl[42], llIIllllIl[43]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.DEFENCE), llIIllllIl[65]) && lIlIllllIIllI(Skills.getLevel(Skill.DEFENCE), llIIllllIl[79])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[66]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[80]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[68])), Integer.valueOf(llIIllllIl[81]), Integer.valueOf(C0018e.c(llIIllllIl[82], llIIllllIl[83]))));
            bB.putAll(Map.of(Integer.valueOf(llIIllllIl[69]), Integer.valueOf(C0018e.c(llIIllllIl[26], llIIllllIl[27])), Integer.valueOf(llIIllllIl[84]), Integer.valueOf(C0018e.c(llIIllllIl[55], llIIllllIl[68])), Integer.valueOf(llIIllllIl[85]), Integer.valueOf(C0018e.c(llIIllllIl[82], llIIllllIl[83])), Integer.valueOf(llIIllllIl[86]), Integer.valueOf(C0018e.c(llIIllllIl[82], llIIllllIl[83])), Integer.valueOf(llIIllllIl[87]), Integer.valueOf(C0018e.c(llIIllllIl[82], llIIllllIl[83])), Integer.valueOf(llIIllllIl[88]), Integer.valueOf(C0018e.c(llIIllllIl[82], llIIllllIl[83]))));
            bA.putAll(Map.of(Integer.valueOf(llIIllllIl[89]), Integer.valueOf(C0018e.c(llIIllllIl[90], llIIllllIl[91]))));
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[72]), Integer.valueOf(C0018e.c(llIIllllIl[37], llIIllllIl[38])), Integer.valueOf(llIIllllIl[92]), Integer.valueOf(C0018e.c(llIIllllIl[74], llIIllllIl[75])), Integer.valueOf(llIIllllIl[73]), Integer.valueOf(C0018e.c(llIIllllIl[74], llIIllllIl[75]))));
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[93]), Integer.valueOf(C0018e.c(llIIllllIl[94], llIIllllIl[95])), Integer.valueOf(llIIllllIl[96]), Integer.valueOf(C0018e.c(llIIllllIl[94], llIIllllIl[95]))));
        }
        bx.putAll(Map.of(Integer.valueOf(llIIllllIl[97]), Integer.valueOf(C0018e.c(llIIllllIl[98], llIIllllIl[42])), Integer.valueOf(llIIllllIl[99]), Integer.valueOf(C0018e.c(llIIllllIl[98], llIIllllIl[42])), Integer.valueOf(llIIllllIl[100]), Integer.valueOf(C0018e.c(llIIllllIl[101], llIIllllIl[102])), Integer.valueOf(llIIllllIl[103]), Integer.valueOf(C0018e.c(llIIllllIl[98], llIIllllIl[42]))));
        by.putAll(Map.of(Integer.valueOf(llIIllllIl[104]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[107]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[108]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[109]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106])), Integer.valueOf(llIIllllIl[110]), Integer.valueOf(C0018e.c(llIIllllIl[105], llIIllllIl[106]))));
        bz.putAll(Map.of(Integer.valueOf(llIIllllIl[111]), Integer.valueOf(C0018e.c(llIIllllIl[112], llIIllllIl[113]))));
        bE.putAll(Map.of(Integer.valueOf(llIIllllIl[114]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[117]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[118]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116]))));
        bF.putAll(Map.of(Integer.valueOf(llIIllllIl[119]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[120]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[121]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[122]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116]))));
        bG.putAll(Map.of(Integer.valueOf(llIIllllIl[123]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[124]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[125]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116])), Integer.valueOf(llIIllllIl[126]), Integer.valueOf(C0018e.c(llIIllllIl[115], llIIllllIl[116]))));
    }

    private static boolean lIlIllllIIlll(Object obj) {
        return obj != null;
    }

    static {
        lIlIllllIIIll();
        lIlIllllIIIlI();
        bv = new ArrayList();
        bw = new HashMap();
        bx = new HashMap();
        by = new HashMap();
        bz = new HashMap();
        bA = new HashMap();
        bB = new HashMap();
        bC = new HashMap();
        bD = new HashMap();
        bE = new HashMap();
        bF = new HashMap();
        bG = new HashMap();
    }

    private static void Q() {
        if (lIlIllllIIlII(bH)) {
            int[] iArr = new int[llIIllllIl[1]];
            iArr[llIIllllIl[0]] = bH;
            if (lIlIllllIIlIl(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0017d(bH, llIIllllIl[1], bS));
                "".length();
            }
        }
        if (lIlIllllIIlII(bI)) {
            int[] iArr2 = new int[llIIllllIl[1]];
            iArr2[llIIllllIl[0]] = bI;
            if (lIlIllllIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0017d(bI, llIIllllIl[1], bT));
                "".length();
            }
        }
        if (lIlIllllIIlII(bJ)) {
            int[] iArr3 = new int[llIIllllIl[1]];
            iArr3[llIIllllIl[0]] = bJ;
            if (lIlIllllIIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0017d(bJ, llIIllllIl[1], bU));
                "".length();
            }
        }
        if (lIlIllllIIlII(bK)) {
            int[] iArr4 = new int[llIIllllIl[1]];
            iArr4[llIIllllIl[0]] = bK;
            if (lIlIllllIIlIl(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0017d(bK, llIIllllIl[1], bV));
                "".length();
            }
        }
        if (lIlIllllIIlII(bL)) {
            int[] iArr5 = new int[llIIllllIl[1]];
            iArr5[llIIllllIl[0]] = bL;
            if (lIlIllllIIlIl(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0017d(bL, llIIllllIl[1], bW));
                "".length();
            }
        }
        if (lIlIllllIIlII(bM)) {
            int[] iArr6 = new int[llIIllllIl[1]];
            iArr6[llIIllllIl[0]] = bM;
            if (lIlIllllIIlIl(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0017d(bM, llIIllllIl[1], bX));
                "".length();
            }
        }
        if (lIlIllllIIlII(bN)) {
            int[] iArr7 = new int[llIIllllIl[1]];
            iArr7[llIIllllIl[0]] = bN;
            if (lIlIllllIIlIl(Bank.contains(iArr7) ? 1 : 0)) {
                bv.add(new C0017d(bN, llIIllllIl[1], bY));
                "".length();
            }
        }
        if (lIlIllllIIlII(bO)) {
            int[] iArr8 = new int[llIIllllIl[1]];
            iArr8[llIIllllIl[0]] = bO;
            if (lIlIllllIIlIl(Bank.contains(iArr8) ? 1 : 0)) {
                bv.add(new C0017d(bO, llIIllllIl[1], bZ));
                "".length();
            }
        }
        if (lIlIllllIIlII(bP)) {
            int[] iArr9 = new int[llIIllllIl[1]];
            iArr9[llIIllllIl[0]] = bP;
            if (lIlIllllIIlIl(Bank.contains(iArr9) ? 1 : 0)) {
                bv.add(new C0017d(bP, llIIllllIl[1], ca));
                "".length();
            }
        }
        if (lIlIllllIIlII(bQ)) {
            int[] iArr10 = new int[llIIllllIl[1]];
            iArr10[llIIllllIl[0]] = bQ;
            if (lIlIllllIIlIl(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0017d(bQ, llIIllllIl[1], cb));
                "".length();
            }
        }
        if (lIlIllllIIlII(bR)) {
            int[] iArr11 = new int[llIIllllIl[1]];
            iArr11[llIIllllIl[0]] = bR;
            if (lIlIllllIIlIl(Bank.contains(iArr11) ? 1 : 0)) {
                if (!lIlIllllIlIIl(bR, llIIllllIl[16])) {
                    bv.add(new C0017d(bR, llIIllllIl[1], cc));
                    "".length();
                    return;
                }
                int[] iArr12 = new int[llIIllllIl[1]];
                iArr12[llIIllllIl[0]] = llIIllllIl[16];
                if (lIlIllllIIlIl(Bank.contains(iArr12) ? 1 : 0)) {
                    int[] iArr13 = new int[llIIllllIl[1]];
                    iArr13[llIIllllIl[0]] = llIIllllIl[17];
                    if (lIlIllllIIlIl(Bank.contains(iArr13) ? 1 : 0)) {
                        int[] iArr14 = new int[llIIllllIl[1]];
                        iArr14[llIIllllIl[0]] = llIIllllIl[18];
                        if (lIlIllllIIlIl(Bank.contains(iArr14) ? 1 : 0)) {
                            bv.add(new C0017d(bR, llIIllllIl[1], cc));
                            "".length();
                            "".length();
                            if ((149 ^ 145) < 0) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean c(int[] iArr) {
        int i = llIIllllIl[0];
        while (lIlIllllIIllI(i, iArr.length)) {
            if (lIlIllllIlIII(iArr[i])) {
                int[] iArr2 = new int[llIIllllIl[1]];
                iArr2[llIIllllIl[0]] = iArr[i];
                if (lIlIllllIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                    System.out.println("Missing ID: " + iArr[i]);
                    return llIIllllIl[0];
                }
            }
            i++;
            "".length();
            if ((((34 ^ 14) ^ (105 ^ 95)) & (((76 ^ 127) ^ (107 ^ 66)) ^ (-" ".length()))) != (((87 ^ 35) ^ (181 ^ 153)) & (((((92 + 170) - 67) + 35) ^ (((23 + 175) - 74) + 66)) ^ (-" ".length())))) {
                return ((255 ^ 197) ^ (130 ^ 188)) & (((34 ^ 102) ^ (209 ^ 145)) ^ (-" ".length()));
            }
        }
        return llIIllllIl[1];
    }

    private static boolean lIlIllllIIlIl(int i) {
        return i == 0;
    }

    private static String lIlIllllIIIIl(String llllllllllllllllllIIlIlIlIlllllI, String llllllllllllllllllIIlIlIlIllllIl) {
        try {
            SecretKeySpec llllllllllllllllllIIlIlIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllllIl[2], llllllllllllllllllIIlIlIllIIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIlIlIllllll) {
            llllllllllllllllllIIlIlIlIllllll.printStackTrace();
            return null;
        }
    }

    private static String lIlIllllIIIII(String llllllllllllllllllIIlIlIlllIIIll, String llllllllllllllllllIIlIlIlllIIIlI) {
        try {
            SecretKeySpec llllllllllllllllllIIlIlIlllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIlIlIlllIIIlI.getBytes(StandardCharsets.UTF_8)), llIIllllIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllllIl[2], llllllllllllllllllIIlIlIlllIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIlIlIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIlIlIlllIIlII) {
            llllllllllllllllllIIlIlIlllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllllIlIll(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public static void X() {
        bw.clear();
        bx.clear();
        by.clear();
        bz.clear();
        bA.clear();
        bB.clear();
        bC.clear();
        bD.clear();
        bE.clear();
        bF.clear();
        bG.clear();
        int i = llIIllllIl[0];
        bR = i;
        bQ = i;
        bP = i;
        bO = i;
        bN = i;
        bM = i;
        bL = i;
        bK = i;
        bJ = i;
        bI = i;
        bH = i;
        int i2 = llIIllllIl[0];
        cc = i2;
        cb = i2;
        ca = i2;
        bZ = i2;
        bY = i2;
        bX = i2;
        bW = i2;
        bV = i2;
        bU = i2;
        bT = i2;
        bS = i2;
        bu = llIIllllIl[0];
        System.out.println(llIIllllII[llIIllllIl[46]]);
    }

    private static boolean lIlIllllIIlII(int i) {
        return i != 0;
    }

    private static void U() {
        bw.putAll(Map.of(Integer.valueOf(llIIllllIl[168]), Integer.valueOf(C0018e.c(llIIllllIl[163], llIIllllIl[164]))));
        bB.putAll(Map.of(Integer.valueOf(llIIllllIl[169]), Integer.valueOf(C0018e.c(llIIllllIl[170], llIIllllIl[171]))));
        bA.putAll(Map.of(Integer.valueOf(llIIllllIl[172]), Integer.valueOf(C0018e.c(llIIllllIl[152], llIIllllIl[153]))));
        bC.putAll(Map.of(Integer.valueOf(llIIllllIl[173]), Integer.valueOf(C0018e.c(llIIllllIl[174], llIIllllIl[175]))));
        bD.putAll(Map.of(Integer.valueOf(llIIllllIl[176]), Integer.valueOf(C0018e.c(llIIllllIl[177], llIIllllIl[178]))));
        bx.putAll(Map.of(Integer.valueOf(llIIllllIl[179]), Integer.valueOf(C0018e.c(llIIllllIl[180], llIIllllIl[181]))));
        by.putAll(Map.of(Integer.valueOf(llIIllllIl[182]), Integer.valueOf(C0018e.c(llIIllllIl[163], llIIllllIl[164]))));
        bz.putAll(Map.of(Integer.valueOf(llIIllllIl[134]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132]))));
        bE.putAll(Map.of(Integer.valueOf(llIIllllIl[136]), Integer.valueOf(C0018e.c(llIIllllIl[137], llIIllllIl[68]))));
        bF.putAll(Map.of(Integer.valueOf(llIIllllIl[183]), Integer.valueOf(C0018e.c(llIIllllIl[166], llIIllllIl[167]))));
        bG.putAll(Map.of(Integer.valueOf(llIIllllIl[16]), Integer.valueOf(C0018e.c(llIIllllIl[145], llIIllllIl[146]))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v188, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v238, types: [boolean] */
    public static void d(String llllllllllllllllllIIlIllIIIIIIll) {
        if (!lIlIllllIIlII(bH) || lIlIllllIIlIl(bN)) {
            if (lIlIllllIIlII(llllllllllllllllllIIlIllIIIIIIll.equalsIgnoreCase(llIIllllII[llIIllllIl[0]]) ? 1 : 0)) {
                R();
            }
            if (lIlIllllIIlII(llllllllllllllllllIIlIllIIIIIIll.equalsIgnoreCase(llIIllllII[llIIllllIl[1]]) ? 1 : 0)) {
            }
            if (lIlIllllIIlII(llllllllllllllllllIIlIllIIIIIIll.equalsIgnoreCase(llIIllllII[llIIllllIl[2]]) ? 1 : 0)) {
                V();
            }
            if (lIlIllllIIlII(llllllllllllllllllIIlIllIIIIIIll.equalsIgnoreCase(llIIllllII[llIIllllIl[3]]) ? 1 : 0)) {
            }
            if (lIlIllllIIlII(llllllllllllllllllIIlIllIIIIIIll.equalsIgnoreCase(llIIllllII[llIIllllIl[4]]) ? 1 : 0)) {
            }
            if (lIlIllllIIlII(llllllllllllllllllIIlIllIIIIIIll.equalsIgnoreCase(llIIllllII[llIIllllIl[5]]) ? 1 : 0)) {
            }
            if (lIlIllllIIlII(llllllllllllllllllIIlIllIIIIIIll.equalsIgnoreCase(llIIllllII[llIIllllIl[6]]) ? 1 : 0)) {
                S();
            }
            if (lIlIllllIIlII(llllllllllllllllllIIlIllIIIIIIll.equalsIgnoreCase(llIIllllII[llIIllllIl[7]]) ? 1 : 0)) {
            }
            if (lIlIllllIIlII(llllllllllllllllllIIlIllIIIIIIll.equalsIgnoreCase(llIIllllII[llIIllllIl[8]]) ? 1 : 0)) {
                U();
            }
            if (lIlIllllIIlII(llllllllllllllllllIIlIllIIIIIIll.equalsIgnoreCase(llIIllllII[llIIllllIl[9]]) ? 1 : 0)) {
                T();
            }
            W();
            System.out.println(llIIllllII[llIIllllIl[10]]);
            System.out.println("Helm: " + bH + ", Price: " + bS);
            System.out.println("Amulet: " + bI + ", Price: " + bT);
            System.out.println("Cape: " + bJ + ", Price: " + bU);
            System.out.println("Ammo: " + bK + ", Price: " + bV);
            System.out.println("Weapon: " + bL + ", Price: " + bW);
            System.out.println("Shield: " + bM + ", Price: " + bX);
            System.out.println("Body: " + bN + ", Price: " + bY);
            System.out.println("Legs: " + bO + ", Price: " + bZ);
            System.out.println("Gloves: " + bP + ", Price: " + ca);
            System.out.println("Boots: " + bQ + ", Price: " + cb);
            System.out.println("Ring: " + bR + ", Price: " + cc);
        }
        if (lIlIllllIIlII(bH) && lIlIllllIIlII(bN)) {
            if (lIlIllllIIlII(bt ? 1 : 0)) {
                AccBuilderSotf.c = llIIllllII[llIIllllIl[11]];
                C0015b.a(bv);
                if (lIlIllllIIllI(bv.size(), llIIllllIl[1])) {
                    System.out.println(llIIllllII[llIIllllIl[12]]);
                    bt = llIIllllIl[0];
                }
            }
            if (lIlIllllIIlIl(bt ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIllllIIlll(nearest) && lIlIllllIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllllII[llIIllllIl[13]];
                    C0000a.a(nearest);
                }
                if (lIlIllllIIlll(nearest) && lIlIllllIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIIllllII[llIIllllIl[14]];
                    if (lIlIllllIIlIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIllllIl[15]);
                        "".length();
                    }
                    if (lIlIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIllllIlIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIllllIl[4]);
                            "".length();
                        }
                        if (lIlIllllIlIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIllllIl[2]);
                            "".length();
                        }
                        if (lIlIllllIlIIl(bR, llIIllllIl[16])) {
                            int[] iArr = new int[llIIllllIl[1]];
                            iArr[llIIllllIl[0]] = llIIllllIl[17];
                            if (lIlIllllIIlIl(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIIllllIl[1]];
                                iArr2[llIIllllIl[0]] = llIIllllIl[16];
                                if (lIlIllllIIlIl(Bank.contains(iArr2) ? 1 : 0)) {
                                    int[] iArr3 = new int[llIIllllIl[1]];
                                    iArr3[llIIllllIl[0]] = llIIllllIl[18];
                                    if (lIlIllllIIlIl(Bank.contains(iArr3) ? 1 : 0)) {
                                        Q();
                                        System.out.println(llIIllllII[llIIllllIl[19]]);
                                        bt = llIIllllIl[1];
                                        return;
                                    }
                                }
                            }
                            int[] iArr4 = new int[llIIllllIl[10]];
                            iArr4[llIIllllIl[0]] = bH;
                            iArr4[llIIllllIl[1]] = bI;
                            iArr4[llIIllllIl[2]] = bJ;
                            iArr4[llIIllllIl[3]] = bK;
                            iArr4[llIIllllIl[4]] = bL;
                            iArr4[llIIllllIl[5]] = bM;
                            iArr4[llIIllllIl[6]] = bN;
                            iArr4[llIIllllIl[7]] = bO;
                            iArr4[llIIllllIl[8]] = bP;
                            iArr4[llIIllllIl[9]] = bQ;
                            if (lIlIllllIIlIl(c(iArr4) ? 1 : 0)) {
                                Q();
                                System.out.println(llIIllllII[llIIllllIl[20]]);
                                bt = llIIllllIl[1];
                                return;
                            }
                        }
                        if (lIlIllllIlIlI(bR, llIIllllIl[16])) {
                            int[] iArr5 = new int[llIIllllIl[11]];
                            iArr5[llIIllllIl[0]] = bH;
                            iArr5[llIIllllIl[1]] = bI;
                            iArr5[llIIllllIl[2]] = bJ;
                            iArr5[llIIllllIl[3]] = bK;
                            iArr5[llIIllllIl[4]] = bL;
                            iArr5[llIIllllIl[5]] = bM;
                            iArr5[llIIllllIl[6]] = bN;
                            iArr5[llIIllllIl[7]] = bO;
                            iArr5[llIIllllIl[8]] = bP;
                            iArr5[llIIllllIl[9]] = bQ;
                            iArr5[llIIllllIl[10]] = bR;
                            if (lIlIllllIIlIl(c(iArr5) ? 1 : 0)) {
                                Q();
                                System.out.println(llIIllllII[llIIllllIl[21]]);
                                bt = llIIllllIl[1];
                                return;
                            }
                        }
                        if (lIlIllllIIlII(n(bR) ? 1 : 0)) {
                            int[] iArr6 = new int[llIIllllIl[11]];
                            iArr6[llIIllllIl[0]] = bH;
                            iArr6[llIIllllIl[1]] = bI;
                            iArr6[llIIllllIl[2]] = bJ;
                            iArr6[llIIllllIl[3]] = bK;
                            iArr6[llIIllllIl[4]] = bL;
                            iArr6[llIIllllIl[5]] = bM;
                            iArr6[llIIllllIl[6]] = bN;
                            iArr6[llIIllllIl[7]] = bO;
                            iArr6[llIIllllIl[8]] = bP;
                            iArr6[llIIllllIl[9]] = bQ;
                            iArr6[llIIllllIl[10]] = bR;
                            if (lIlIllllIlIIl(bR, llIIllllIl[16])) {
                                int[] iArr7 = new int[llIIllllIl[1]];
                                iArr7[llIIllllIl[0]] = llIIllllIl[16];
                                if (lIlIllllIIlIl(Bank.contains(iArr7) ? 1 : 0)) {
                                    int[] iArr8 = new int[llIIllllIl[1]];
                                    iArr8[llIIllllIl[0]] = llIIllllIl[17];
                                    if (lIlIllllIIlII(Bank.contains(iArr8) ? 1 : 0)) {
                                        C0000a.a(llIIllllIl[17], llIIllllIl[1]);
                                    }
                                }
                                int[] iArr9 = new int[llIIllllIl[1]];
                                iArr9[llIIllllIl[0]] = llIIllllIl[16];
                                if (lIlIllllIIlIl(Bank.contains(iArr9) ? 1 : 0)) {
                                    int[] iArr10 = new int[llIIllllIl[1]];
                                    iArr10[llIIllllIl[0]] = llIIllllIl[17];
                                    if (lIlIllllIIlIl(Bank.contains(iArr10) ? 1 : 0)) {
                                        int[] iArr11 = new int[llIIllllIl[1]];
                                        iArr11[llIIllllIl[0]] = llIIllllIl[17];
                                        if (lIlIllllIIlIl(Inventory.contains(iArr11) ? 1 : 0)) {
                                            int[] iArr12 = new int[llIIllllIl[1]];
                                            iArr12[llIIllllIl[0]] = llIIllllIl[18];
                                            if (lIlIllllIIlII(Bank.contains(iArr12) ? 1 : 0)) {
                                                C0000a.a(llIIllllIl[18], llIIllllIl[1]);
                                            }
                                        }
                                    }
                                }
                            }
                            C0000a.a(iArr6, llIIllllIl[1]);
                            Time.sleepTicks(C0018e.c(llIIllllIl[10], llIIllllIl[14]));
                            "".length();
                            if (lIlIllllIIlII(Bank.isOpen() ? 1 : 0)) {
                                Bank.close();
                                Time.sleepTicks(C0018e.c(llIIllllIl[3], llIIllllIl[5]));
                                "".length();
                            }
                            do {
                                if (lIlIllllIIlIl(Inventory.contains(iArr6) ? 1 : 0) && !lIlIllllIIlII(Inventory.contains(item -> {
                                    if (lIlIllllIIlII(item.getName().contains(llIIllllII[llIIllllIl[204]]) ? 1 : 0) && lIlIllllIIlIl(item.isNoted() ? 1 : 0)) {
                                        ?? r0 = llIIllllIl[1];
                                        "".length();
                                        return "   ".length() <= 0 ? ((((26 + 34) - 32) + 111) ^ (((156 + 21) - 59) + 40)) & (((140 ^ 158) ^ (21 ^ 18)) ^ (-" ".length())) : r0;
                                    }
                                    return llIIllllIl[0];
                                }) ? 1 : 0)) {
                                    if (lIlIllllIIlIl(Bank.isOpen() ? 1 : 0)) {
                                        C0000a.a();
                                        Time.sleepUntil(() -> {
                                            return Bank.isOpen();
                                        }, llIIllllIl[15]);
                                        "".length();
                                        Time.sleepTicks(llIIllllIl[4]);
                                        "".length();
                                        System.out.println(llIIllllII[llIIllllIl[24]]);
                                        bu = llIIllllIl[1];
                                        return;
                                    }
                                    return;
                                }
                                C0018e.l(bH);
                                C0018e.l(bI);
                                C0018e.l(bJ);
                                C0018e.l(bK);
                                Time.sleepTicks(llIIllllIl[1]);
                                "".length();
                                C0018e.l(bL);
                                C0018e.l(bM);
                                C0018e.l(bN);
                                Time.sleepTicks(llIIllllIl[1]);
                                "".length();
                                C0018e.l(bO);
                                C0018e.l(bP);
                                C0018e.l(bQ);
                                C0018e.l(bR);
                                Time.sleepTicks(llIIllllIl[1]);
                                "".length();
                                C0018e.l(llIIllllIl[16]);
                                C0018e.l(llIIllllIl[17]);
                                C0018e.l(llIIllllIl[18]);
                                C0018e.l(llIIllllIl[22]);
                                C0018e.l(llIIllllIl[23]);
                                "".length();
                            } while (((10 ^ 42) ^ (71 ^ 99)) > (-" ".length()));
                        }
                    }
                }
            }
        }
    }

    private static void lIlIllllIIIll() {
        llIIllllIl = new int[206];
        llIIllllIl[0] = ((3 ^ 16) ^ (58 ^ 37)) & (((106 ^ 114) ^ (174 ^ 186)) ^ (-" ".length()));
        llIIllllIl[1] = " ".length();
        llIIllllIl[2] = "  ".length();
        llIIllllIl[3] = "   ".length();
        llIIllllIl[4] = (((119 + 66) - 82) + 92) ^ (((100 + 151) - 249) + 197);
        llIIllllIl[5] = 193 ^ 196;
        llIIllllIl[6] = (203 ^ 173) ^ (41 ^ 73);
        llIIllllIl[7] = (((117 + 58) - 165) + 163) ^ (((1 + 74) - 31) + 126);
        llIIllllIl[8] = 94 ^ 86;
        llIIllllIl[9] = 121 ^ 112;
        llIIllllIl[10] = 12 ^ 6;
        llIIllllIl[11] = (3 ^ 100) ^ (112 ^ 28);
        llIIllllIl[12] = 88 ^ 84;
        llIIllllIl[13] = (((3 + 1) - (-97)) + 62) ^ (((75 + 59) - (-8)) + 32);
        llIIllllIl[14] = 124 ^ 114;
        llIIllllIl[15] = (-16385) & 21384;
        llIIllllIl[16] = (-((-19030) & 23415)) & (-16387) & 32751;
        llIIllllIl[17] = (-"  ".length()) & (-20737) & 32719;
        llIIllllIl[18] = (-16645) & 28628;
        llIIllllIl[19] = 96 ^ 111;
        llIIllllIl[20] = 51 ^ 35;
        llIIllllIl[21] = 156 ^ 141;
        llIIllllIl[22] = (-(117 ^ 127)) & (-20485) & 32479;
        llIIllllIl[23] = (-16651) & 28638;
        llIIllllIl[24] = (200 ^ 152) ^ (251 ^ 185);
        llIIllllIl[25] = (-((-18507) & 27519)) & (-18435) & 28599;
        llIIllllIl[26] = (-((-5121) & 16130)) & (-163) & 28671;
        llIIllllIl[27] = (-((-315) & 4603)) & (-771) & 24558;
        llIIllllIl[28] = (-((-5271) & 16375)) & (-20509) & 32767;
        llIIllllIl[29] = (-18515) & 19703;
        llIIllllIl[30] = (-534) & 16183;
        llIIllllIl[31] = (-8209) & 27548;
        llIIllllIl[32] = (-((-1057) & 26417)) & (-9) & 26559;
        llIIllllIl[33] = (-10437) & 11759;
        llIIllllIl[34] = (-((-24835) & 27438)) & (-12561) & 32703;
        llIIllllIl[35] = (-((-5397) & 13654)) & (-1025) & 32511;
        llIIllllIl[36] = (-((-20565) & 23031)) & (-8193) & 11775;
        llIIllllIl[37] = (-13070) & 31519;
        llIIllllIl[38] = (-8209) & 29438;
        llIIllllIl[39] = (-((-21121) & 31621)) & (-20609) & 32223;
        llIIllllIl[40] = (-((-20485) & 31669)) & (-1) & 12285;
        llIIllllIl[41] = (-16385) & 17451;
        llIIllllIl[42] = (-8202) & 30701;
        llIIllllIl[43] = (-65) & 25464;
        llIIllllIl[44] = (-((-1063) & 28647)) & (-5) & 28663;
        llIIllllIl[45] = (-14343) & 15423;
        llIIllllIl[46] = 36 ^ 48;
        llIIllllIl[47] = (-((-3529) & 32763)) & (-265) & 30655;
        llIIllllIl[48] = (-((-1633) & 3953)) & (-8259) & 11771;
        llIIllllIl[49] = (-((-781) & 23325)) & (-8385) & 32253;
        llIIllllIl[50] = (-11137) & 12255;
        llIIllllIl[51] = (-15105) & 16173;
        llIIllllIl[52] = 96 ^ 126;
        llIIllllIl[53] = (-((-25133) & 31357)) & (-8233) & 15615;
        llIIllllIl[54] = (-((-1058) & 13615)) & (-33) & 32767;
        llIIllllIl[55] = (-((-8994) & 27555)) & (-9475) & 65535;
        llIIllllIl[56] = (-11779) & 61278;
        llIIllllIl[57] = (-((-10281) & 30779)) & (-8769) & 30463;
        llIIllllIl[58] = (-((-717) & 6863)) & (-8901) & 16375;
        llIIllllIl[59] = (-((-26225) & 28667)) & (-4117) & 7679;
        llIIllllIl[60] = (-20481) & 32767;
        llIIllllIl[61] = (-((-771) & 9103)) & (-2113) & 48894;
        llIIllllIl[62] = (-18945) & 60174;
        llIIllllIl[63] = (-21057) & 22127;
        llIIllllIl[64] = (-((-5181) & 32639)) & (-4097) & 32639;
        llIIllllIl[65] = 6 ^ 46;
        llIIllllIl[66] = (-29233) & 30393;
        llIIllllIl[67] = (-((-3085) & 32157)) & (-67) & 31743;
        llIIllllIl[68] = (-((-2551) & 18935)) & (-9267) & 65150;
        llIIllllIl[69] = (-((-5379) & 8019)) & (-4097) & 7935;
        llIIllllIl[70] = (-((-5641) & 30477)) & (-1105) & 28543;
        llIIllllIl[71] = (-((-3877) & 24549)) & (-2565) & 24567;
        llIIllllIl[72] = (-((-9797) & 32733)) & (-8193) & 32251;
        llIIllllIl[73] = (-((-10243) & 27859)) & (-8449) & 28671;
        llIIllllIl[74] = (-557) & 49006;
        llIIllllIl[75] = (-8737) & 59966;
        llIIllllIl[76] = (-((-1271) & 5375)) & (-2081) & 7295;
        llIIllllIl[77] = (-((-915) & 31647)) & (-387) & 32191;
        llIIllllIl[78] = (-4745) & 5835;
        llIIllllIl[79] = (26 ^ 38) ^ (" ".length() & (" ".length() ^ (-1)));
        llIIllllIl[80] = (-20785) & 21947;
        llIIllllIl[81] = (-517) & 1663;
        llIIllllIl[82] = (-(9 ^ 45)) & (-2065) & 97599;
        llIIllllIl[83] = (-((-11421) & 28063)) & (-8802) & 130943;
        llIIllllIl[84] = (-16643) & 17843;
        llIIllllIl[85] = (-((-3447) & 15743)) & (-16773) & 31743;
        llIIllllIl[86] = (-((-10373) & 28614)) & (-11) & 30719;
        llIIllllIl[87] = (-27473) & 28657;
        llIIllllIl[88] = (-13329) & 15987;
        llIIllllIl[89] = (-((-21823) & 32703)) & (-20555) & 32767;
        llIIllllIl[90] = (-1369) & 38908;
        llIIllllIl[91] = (-" ".length()) & (-21762) & 64991;
        llIIllllIl[92] = (-16389) & 17501;
        llIIllllIl[93] = (-24969) & 26047;
        llIIllllIl[94] = (-((-5294) & 8191)) & (-11) & 65407;
        llIIllllIl[95] = (-((-1418) & 23999)) & (-321) & 98301;
        llIIllllIl[96] = (-((-1219) & 30683)) & (-2081) & 32637;
        llIIllllIl[97] = (-((-305) & 26931)) & (-257) & 28607;
        llIIllllIl[98] = (-((-9155) & 14278)) & (-9001) & 32623;
        llIIllllIl[99] = (-((-523) & 31551)) & (-1) & 32759;
        llIIllllIl[100] = (-18051) & 28414;
        llIIllllIl[101] = (-2307) & 40806;
        llIIllllIl[102] = (-18498) & 60997;
        llIIllllIl[103] = (-6451) & 8179;
        llIIllllIl[104] = (-" ".length()) & (-17409) & 18427;
        llIIllllIl[105] = (-8243) & 31542;
        llIIllllIl[106] = (-3089) & 32628;
        llIIllllIl[107] = (-22545) & 23551;
        llIIllllIl[108] = (-" ".length()) & (-22529) & 23551;
        llIIllllIl[109] = (-20589) & 21615;
        llIIllllIl[110] = (-11423) & 15807;
        llIIllllIl[111] = (-((-19381) & 31677)) & (-17541) & 30718;
        llIIllllIl[112] = ((149 + 216) - 281) + 138;
        llIIllllIl[113] = ((229 + 131) - 170) + 43;
        llIIllllIl[114] = (-23261) & 24319;
        llIIllllIl[115] = (-((-24900) & 30151)) & (-1) & 32751;
        llIIllllIl[116] = (-((-19082) & 19419)) & (-3) & 32639;
        llIIllllIl[117] = (-29842) & 32763;
        llIIllllIl[118] = (-17558) & 20469;
        llIIllllIl[119] = (-((-9277) & 28671)) & (-8201) & 28655;
        llIIllllIl[120] = (-5249) & 8142;
        llIIllllIl[121] = (-13333) & 16246;
        llIIllllIl[122] = (-((-865) & 14181)) & (-16545) & 32764;
        llIIllllIl[123] = (-((-1601) & 26313)) & (-17) & 26363;
        llIIllllIl[124] = (-((-3877) & 28589)) & (-3) & 26351;
        llIIllllIl[125] = (-((-9881) & 30617)) & (-8321) & 30699;
        llIIllllIl[126] = (-((-30277) & 32717)) & (-12289) & 16367;
        llIIllllIl[127] = (-19273) & 31563;
        llIIllllIl[128] = (-((-2051) & 7431)) & (-8329) & 16381;
        llIIllllIl[129] = (-8197) & 9900;
        llIIllllIl[130] = (-((-4969) & 13162)) & (-4353) & 32765;
        llIIllllIl[131] = (-8487) & 63486;
        llIIllllIl[132] = (-20) & 65019;
        llIIllllIl[133] = (-12314) & 32539;
        llIIllllIl[134] = (-12433) & 32667;
        llIIllllIl[135] = (-((-2987) & 7167)) & (-8226) & 32637;
        llIIllllIl[136] = (-21506) & 32631;
        llIIllllIl[137] = (-4484) & 39883;
        llIIllllIl[138] = (-22547) & 24383;
        llIIllllIl[139] = (-((-4633) & 32735)) & (-33) & 32255;
        llIIllllIl[140] = (-((-14417) & 31578)) & (-8225) & 29695;
        llIIllllIl[141] = (-((-2659) & 32751)) & (-2) & 30719;
        llIIllllIl[142] = (-2149) & 6271;
        llIIllllIl[143] = (-25633) & 29759;
        llIIllllIl[144] = (-16397) & 20527;
        llIIllllIl[145] = (-(54 ^ 21)) & (-5121) & 30654;
        llIIllllIl[146] = (-66) & 29565;
        llIIllllIl[147] = 221 ^ 155;
        llIIllllIl[148] = (-8777) & 15102;
        llIIllllIl[149] = (-((-17473) & 23637)) & (-1601) & 32764;
        llIIllllIl[150] = (-17733) & 52732;
        llIIllllIl[151] = (-16387) & 29174;
        llIIllllIl[152] = (-((-2498) & 6639)) & (-10371) & 704511;
        llIIllllIl[153] = (-4437) & 744436;
        llIIllllIl[154] = (-((-10441) & 16109)) & (-9) & 8175;
        llIIllllIl[155] = (-((-137) & 12987)) & (-9) & 15359;
        llIIllllIl[156] = (-((-2371) & 28531)) & (-9) & 28671;
        llIIllllIl[157] = (-3) & 2495;
        llIIllllIl[158] = (-((-18465) & 23649)) & (-8193) & 15871;
        llIIllllIl[159] = (-((-26697) & 27261)) & (-13313) & 16373;
        llIIllllIl[160] = (-12342) & 97341;
        llIIllllIl[161] = (-2274) & 97273;
        llIIllllIl[162] = (-((-10497) & 12053)) & (-4201) & 16255;
        llIIllllIl[163] = (-((-10449) & 31735)) & (-66) & 916351;
        llIIllllIl[164] = (-16436) & 941435;
        llIIllllIl[165] = (-((-16521) & 25805)) & (-16387) & 31998;
        llIIllllIl[166] = (-((-12292) & 28711)) & (-5189) & 196607;
        llIIllllIl[167] = (-10264) & 195263;
        llIIllllIl[168] = (-((-1813) & 12245)) & (-5) & 31734;
        llIIllllIl[169] = (-16901) & 23423;
        llIIllllIl[170] = (-((-8501) & 13301)) & (-23) & 589822;
        llIIllllIl[171] = (-((-493) & 17919)) & (-517) & 642942;
        llIIllllIl[172] = (-((-11537) & 28050)) & (-1) & 23037;
        llIIllllIl[173] = (-9411) & 30711;
        llIIllllIl[174] = (-22507) & 1472506;
        llIIllllIl[175] = (-268) & 1490267;
        llIIllllIl[176] = (-11333) & 32636;
        llIIllllIl[177] = (-29071) & 1179070;
        llIIllllIl[178] = (-10284) & 1260283;
        llIIllllIl[179] = (-20482) & 31609;
        llIIllllIl[180] = (-((-875) & 28654)) & (-9) & 2977787;
        llIIllllIl[181] = (-16899) & 3071898;
        llIIllllIl[182] = (-1557) & 8124;
        llIIllllIl[183] = (-((-4133) & 20924)) & (-9) & 28639;
        llIIllllIl[184] = (-((-11442) & 32243)) & (-161) & 22011;
        llIIllllIl[185] = (-29350) & 30391;
        llIIllllIl[186] = (-((-1057) & 5738)) & (-27009) & 32735;
        llIIllllIl[187] = (-17436) & 31935;
        llIIllllIl[188] = (-((-8461) & 27565)) & (-4162) & 24309;
        llIIllllIl[189] = (-8657) & 9694;
        llIIllllIl[190] = (-((-1563) & 16190)) & (-17093) & 32767;
        llIIllllIl[191] = (-9199) & 10238;
        llIIllllIl[192] = (-417) & 1469;
        llIIllllIl[193] = (-8629) & 9207;
        llIIllllIl[194] = (-8199) & 9215;
        llIIllllIl[195] = (-((-25985) & 32195)) & (-16417) & 24575;
        llIIllllIl[196] = (-((-2153) & 22889)) & (-10241) & 32703;
        llIIllllIl[197] = (-((-20833) & 29675)) & (-18433) & 28655;
        llIIllllIl[198] = (-10328) & 10871;
        llIIllllIl[199] = (-24979) & 25555;
        llIIllllIl[200] = (-((-12625) & 15345)) & (-4421) & 8175;
        llIIllllIl[201] = (-2114) & 2655;
        llIIllllIl[202] = (-((-1729) & 22519)) & (-2753) & 24575;
        llIIllllIl[203] = (38 ^ 84) ^ (118 ^ 23);
        llIIllllIl[204] = (203 ^ 161) ^ (((105 + 37) - 111) + 96);
        llIIllllIl[205] = 174 ^ 184;
    }

    private static String lIlIlllIlllll(String llllllllllllllllllIIlIlIllIlIIll, String llllllllllllllllllIIlIlIllIlIIlI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIlIlIllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIlIlIllIlIIlI.toCharArray();
        int llllllllllllllllllIIlIlIllIIllll = llIIllllIl[0];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllllllIIlIlIllIIlIII = charArray2.length;
        int i = llIIllllIl[0];
        while (lIlIllllIIllI(i, llllllllllllllllllIIlIlIllIIlIII)) {
            char llllllllllllllllllIIlIlIllIlIlII = charArray2[i];
            sb.append((char) (llllllllllllllllllIIlIlIllIlIlII ^ charArray[llllllllllllllllllIIlIlIllIIllll % charArray.length]));
            "".length();
            llllllllllllllllllIIlIlIllIIllll++;
            i++;
            "".length();
            if ((28 ^ 24) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void T() {
        if (lIlIllllIIllI(Skills.getLevel(Skill.RANGED), llIIllllIl[147])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[148]), Integer.valueOf(C0018e.c(llIIllllIl[149], llIIllllIl[150]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.RANGED), llIIllllIl[147])) {
            bw.putAll(Map.of(Integer.valueOf(llIIllllIl[148]), Integer.valueOf(C0018e.c(llIIllllIl[149], llIIllllIl[150]))));
        }
        bA.putAll(Map.of(Integer.valueOf(llIIllllIl[151]), Integer.valueOf(C0018e.c(llIIllllIl[152], llIIllllIl[153]))));
        if (lIlIllllIIllI(Skills.getLevel(Skill.RANGED), llIIllllIl[79])) {
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[154]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.RANGED), llIIllllIl[79]) && lIlIllllIIllI(Skills.getLevel(Skill.RANGED), llIIllllIl[147])) {
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[155]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.RANGED), llIIllllIl[147])) {
            bC.putAll(Map.of(Integer.valueOf(llIIllllIl[156]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132]))));
        }
        if (lIlIllllIIllI(Skills.getLevel(Skill.RANGED), llIIllllIl[79])) {
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[157]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.RANGED), llIIllllIl[79]) && lIlIllllIIllI(Skills.getLevel(Skill.RANGED), llIIllllIl[147])) {
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[158]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.RANGED), llIIllllIl[147])) {
            bD.putAll(Map.of(Integer.valueOf(llIIllllIl[159]), Integer.valueOf(C0018e.c(llIIllllIl[131], llIIllllIl[132]))));
        }
        bx.putAll(Map.of(Integer.valueOf(llIIllllIl[129]), Integer.valueOf(C0018e.c(llIIllllIl[160], llIIllllIl[161]))));
        by.putAll(Map.of(Integer.valueOf(llIIllllIl[162]), Integer.valueOf(C0018e.c(llIIllllIl[163], llIIllllIl[164]))));
        if (lIlIllllIIllI(Skills.getLevel(Skill.RANGED), llIIllllIl[147])) {
            bE.putAll(Map.of(Integer.valueOf(llIIllllIl[136]), Integer.valueOf(C0018e.c(llIIllllIl[137], llIIllllIl[68]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.RANGED), llIIllllIl[147])) {
            bE.putAll(Map.of(Integer.valueOf(llIIllllIl[136]), Integer.valueOf(C0018e.c(llIIllllIl[137], llIIllllIl[68]))));
        }
        if (lIlIllllIIllI(Skills.getLevel(Skill.RANGED), llIIllllIl[147])) {
            bF.putAll(Map.of(Integer.valueOf(llIIllllIl[165]), Integer.valueOf(C0018e.c(llIIllllIl[166], llIIllllIl[167]))));
        }
        if (lIlIllllIlIll(Skills.getLevel(Skill.RANGED), llIIllllIl[147])) {
            bF.putAll(Map.of(Integer.valueOf(llIIllllIl[165]), Integer.valueOf(C0018e.c(llIIllllIl[166], llIIllllIl[167]))));
        }
        bG.putAll(Map.of(Integer.valueOf(llIIllllIl[16]), Integer.valueOf(C0018e.c(llIIllllIl[145], llIIllllIl[146]))));
    }

    private static void W() {
        Random random = new Random();
        bH = a(bw, random);
        bS = bw.getOrDefault(Integer.valueOf(bH), Integer.valueOf(llIIllllIl[0])).intValue();
        bI = a(bx, random);
        bT = bx.getOrDefault(Integer.valueOf(bI), Integer.valueOf(llIIllllIl[0])).intValue();
        bJ = a(by, random);
        bU = by.getOrDefault(Integer.valueOf(bJ), Integer.valueOf(llIIllllIl[0])).intValue();
        bK = a(bz, random);
        bV = bz.getOrDefault(Integer.valueOf(bK), Integer.valueOf(llIIllllIl[0])).intValue();
        bL = a(bA, random);
        bW = bA.getOrDefault(Integer.valueOf(bL), Integer.valueOf(llIIllllIl[0])).intValue();
        bM = a(bB, random);
        bX = bB.getOrDefault(Integer.valueOf(bM), Integer.valueOf(llIIllllIl[0])).intValue();
        bN = a(bC, random);
        bY = bC.getOrDefault(Integer.valueOf(bN), Integer.valueOf(llIIllllIl[0])).intValue();
        bO = a(bD, random);
        bZ = bD.getOrDefault(Integer.valueOf(bO), Integer.valueOf(llIIllllIl[0])).intValue();
        bP = a(bE, random);
        ca = bE.getOrDefault(Integer.valueOf(bP), Integer.valueOf(llIIllllIl[0])).intValue();
        bQ = a(bF, random);
        cb = bF.getOrDefault(Integer.valueOf(bQ), Integer.valueOf(llIIllllIl[0])).intValue();
        bR = a(bG, random);
        cc = bG.getOrDefault(Integer.valueOf(bR), Integer.valueOf(llIIllllIl[0])).intValue();
    }
}
