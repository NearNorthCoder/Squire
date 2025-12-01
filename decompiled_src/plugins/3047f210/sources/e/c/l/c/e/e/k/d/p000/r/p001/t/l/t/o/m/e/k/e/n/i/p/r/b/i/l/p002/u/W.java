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
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.W  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/W.class */
public class W implements S {
    private static /* synthetic */ String[] llllIlIlll;
    static /* synthetic */ WorldArea iW;
    public static /* synthetic */ int iU;
    public static /* synthetic */ int iT;
    static /* synthetic */ WorldArea iX;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ WorldPoint iY;
    private static /* synthetic */ int[] llllIllIIl;
    public static /* synthetic */ List<C0003d> bu;
    public static /* synthetic */ int iS;
    static /* synthetic */ WorldArea iV;

    private static boolean llIlIIIIlllIl(int i) {
        return i == 0;
    }

    private static String llIlIIIIIIllI(String lllllllllllllllllIlIlIIIIllllIIl, String lllllllllllllllllIlIlIIIIllllIII) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIIIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIIIllllIII.getBytes(StandardCharsets.UTF_8)), llllIllIIl[24]), "DES");
            Cipher lllllllllllllllllIlIlIIIIllllIll = Cipher.getInstance("DES");
            lllllllllllllllllIlIlIIIIllllIll.init(llllIllIIl[2], lllllllllllllllllIlIlIIIIlllllII);
            return new String(lllllllllllllllllIlIlIIIIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIIIIlllIlIl) {
            lllllllllllllllllIlIlIIIIlllIlIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return llllIllIIl[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x024b, code lost:
        if (llIlIIIIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.W.llllIllIIl[11]) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02d2, code lost:
        if (llIlIIIIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.W.llllIllIIl[11]) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[llllIllIIl[1]];
        iArr4[llllIllIIl[0]] = llllIllIIl[15];
        if (llIlIIIIlllIl(Bank.contains(iArr4) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIIl[15], llllIllIIl[1], llllIllIIl[195]));
            "".length();
        }
        int[] iArr5 = new int[llllIllIIl[1]];
        iArr5[llllIllIIl[0]] = llllIllIIl[17];
        if (llIlIIIIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIIl[17], llllIllIIl[2], llllIllIIl[196]));
            "".length();
        }
        int[] iArr6 = new int[llllIllIIl[1]];
        iArr6[llllIllIIl[0]] = llllIllIIl[27];
        if (llIlIIIIlllIl(Bank.contains(iArr6) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIIl[27], llllIllIIl[2], llllIllIIl[196]));
            "".length();
        }
        int[] iArr7 = new int[llllIllIIl[1]];
        iArr7[llllIllIIl[0]] = llllIllIIl[12];
        if (llIlIIIIlllIl(Bank.contains(iArr7) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIIl[12], llllIllIIl[11], llllIllIIl[197]));
            "".length();
        }
        int[] iArr8 = new int[llllIllIIl[1]];
        iArr8[llllIllIIl[0]] = llllIllIIl[21];
        if (llIlIIIIlllIl(Bank.contains(iArr8) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIIl[21], llllIllIIl[11], llllIllIIl[198]));
            "".length();
        }
        int[] iArr9 = new int[llllIllIIl[1]];
        iArr9[llllIllIIl[0]] = llllIllIIl[14];
        if (llIlIIIIlllIl(Bank.contains(iArr9) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIIl[14], llllIllIIl[11], llllIllIIl[198]));
            "".length();
        }
        int[] iArr10 = new int[llllIllIIl[1]];
        iArr10[llllIllIIl[0]] = llllIllIIl[13];
        if (llIlIIIIlllIl(Bank.contains(iArr10) ? 1 : 0)) {
            bu.add(new C0003d(llllIllIIl[13], llllIllIIl[11], llllIllIIl[198]));
            "".length();
        }
        int[] iArr11 = new int[llllIllIIl[1]];
        iArr11[llllIllIIl[0]] = llllIllIIl[23];
        if (llIlIIIIllIll(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[llllIllIIl[1]];
            iArr12[llllIllIIl[0]] = llllIllIIl[23];
            if (llIlIIIIllIll(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[llllIllIIl[1]];
                iArr13[llllIllIIl[0]] = llllIllIIl[23];
            }
            iArr = new int[llllIllIIl[1]];
            iArr[llllIllIIl[0]] = llllIllIIl[25];
            if (llIlIIIIllIll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr14 = new int[llllIllIIl[1]];
                iArr14[llllIllIIl[0]] = llllIllIIl[25];
                if (llIlIIIIllIll(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llllIllIIl[1]];
                    iArr15[llllIllIIl[0]] = llllIllIIl[25];
                }
                iArr2 = new int[llllIllIIl[1]];
                iArr2[llllIllIIl[0]] = llllIllIIl[201];
                if (llIlIIIIlllIl(Bank.contains(iArr2) ? 1 : 0)) {
                    bu.add(new C0003d(llllIllIIl[201], llllIllIIl[1], llllIllIIl[202]));
                    "".length();
                }
                iArr3 = new int[llllIllIIl[1]];
                iArr3[llllIllIIl[0]] = llllIllIIl[19];
                if (llIlIIIIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
                    bu.add(new C0003d(llllIllIIl[19], llllIllIIl[40], C0008i.bp));
                    "".length();
                    return;
                }
                return;
            }
            bu.add(new C0003d(llllIllIIl[25], llllIllIIl[11], llllIllIIl[200]));
            "".length();
            iArr2 = new int[llllIllIIl[1]];
            iArr2[llllIllIIl[0]] = llllIllIIl[201];
            if (llIlIIIIlllIl(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llllIllIIl[1]];
            iArr3[llllIllIIl[0]] = llllIllIIl[19];
            if (llIlIIIIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
        }
        bu.add(new C0003d(iT, llllIllIIl[44], llllIllIIl[199]));
        "".length();
        iArr = new int[llllIllIIl[1]];
        iArr[llllIllIIl[0]] = llllIllIIl[25];
        if (llIlIIIIllIll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bu.add(new C0003d(llllIllIIl[25], llllIllIIl[11], llllIllIIl[200]));
        "".length();
        iArr2 = new int[llllIllIIl[1]];
        iArr2[llllIllIIl[0]] = llllIllIIl[201];
        if (llIlIIIIlllIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llllIllIIl[1]];
        iArr3[llllIllIIl[0]] = llllIllIIl[19];
        if (llIlIIIIlllIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            ds();
            "".length();
            if ("   ".length() <= (((48 ^ 17) ^ (148 ^ 154)) & (((5 ^ 52) ^ (52 ^ 42)) ^ (-" ".length())))) {
                return (" ".length() ^ (186 ^ 141)) & (((((4 + 30) - (-122)) + 13) ^ (((130 + 60) - 168) + 137)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
        }
        return llllIllIIl[186];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIlIIIlIIIIl(Skills.getLevel(Skill.AGILITY), llllIllIIl[185])) {
            ?? r0 = llllIllIIl[1];
            "".length();
            return (-" ".length()) >= (((((103 + 88) - 124) + 100) ^ (((11 + 99) - (-12)) + 8)) & (((109 ^ 9) ^ (2 ^ 67)) ^ (-" ".length()))) ? ((59 ^ 85) ^ (200 ^ 169)) & (((((123 + 74) - 77) + 23) ^ (((55 + 43) - (-22)) + 8)) ^ (-" ".length())) : r0;
        }
        return llllIllIIl[0];
    }

    private static boolean llIlIIIIlllII(int i, int i2) {
        return i < i2;
    }

    private static void llIlIIIIlIllI() {
        llllIlIlll = new String[llllIllIIl[238]];
        llllIlIlll[llllIllIIl[0]] = llIlIIIIIIllI("hFpeNG5FIw3gmTEIzOE5rg==", "KVnlL");
        llllIlIlll[llllIllIIl[1]] = llIlIIIIIIlll("ZGgwxPchtqEfXtL75YNqDwb/hmdbrn45X9qvbyMzsf7NdEoTCZo2Nn7VxBl7Ed5q1X/6vXxCcZo=", "yYAFE");
        llllIlIlll[llllIllIIl[2]] = llIlIIIIIIlll("ydcQZftrcO6tjSPNlGtKL80vxZOJAAkm", "hoyBX");
        llllIlIlll[llllIllIIl[9]] = llIlIIIIIlIII("JjY7FCQHOTJQKg85PhkmCQ==", "nWUpH");
        llllIlIlll[llllIllIIl[16]] = llIlIIIIIIllI("HRZuAb9xqelVuoJ5zn0CuxWDHJScZeEKgkf1CSl6cw6CCbGCYwp/3QXbPHmWB7N3J3iG8eOQiUA=", "PuIhW");
        llllIlIlll[llllIllIIl[18]] = llIlIIIIIIlll("s1swHPoe6AI=", "NPSzj");
        llllIlIlll[llllIllIIl[20]] = llIlIIIIIIlll("F0mU/NjXH68=", "urUoV");
        llllIlIlll[llllIllIIl[22]] = llIlIIIIIIllI("f3go7uQqAok=", "nEtVt");
        llllIlIlll[llllIllIIl[24]] = llIlIIIIIIllI("B8eudZpBJVU=", "qdVsE");
        llllIlIlll[llllIllIIl[26]] = llIlIIIIIIllI("tqbrjYa06wk=", "iYubh");
        llllIlIlll[llllIllIIl[11]] = llIlIIIIIIlll("I6UwG60MMMiKBRHRV9q8LQpVmdAb5eYp", "LAZEY");
        llllIlIlll[llllIllIIl[49]] = llIlIIIIIIllI("c7uzflxDUcNoR0LnuW2YmA==", "cmcdS");
        llllIlIlll[llllIllIIl[63]] = llIlIIIIIlIII("AD8qbiktPCwgKCk=", "LPMNK");
        llllIlIlll[llllIllIIl[64]] = llIlIIIIIIllI("Pw176LQOgnQrAfYUeY7eLw==", "gEKzG");
        llllIlIlll[llllIllIIl[53]] = llIlIIIIIlIII("ACcrKDQqJSVlOCY/", "CKBEV");
        llllIlIlll[llllIllIIl[38]] = llIlIIIIIIlll("a1Wg6xaiX/DT7bF7FMBpJA==", "FNmoA");
        llllIlIlll[llllIllIIl[65]] = llIlIIIIIlIII("CDY9GghmNSISGA==", "KZTwj");
        llllIlIlll[llllIllIIl[66]] = llIlIIIIIIlll("qWoyJB7gJNghNsxTSiRRgA==", "ZpxVI");
        llllIlIlll[llllIllIIl[54]] = llIlIIIIIIllI("bCl9ZNucjrTF7lcLElCh8A==", "aBibT");
        llllIlIlll[llllIllIIl[67]] = llIlIIIIIIlll("SHr7oHn+axE=", "TYFnQ");
        llllIlIlll[llllIllIIl[40]] = llIlIIIIIIllI("5N0Wciq4SlQ7yTZVToipQw==", "lgtNB");
        llllIlIlll[llllIllIIl[68]] = llIlIIIIIIlll("r9zMxDkKCYkEvjJ75OcRzA==", "hcnKY");
        llllIlIlll[llllIllIIl[61]] = llIlIIIIIlIII("FjkpKkAuNg==", "AXEAm");
        llllIlIlll[llllIllIIl[69]] = llIlIIIIIIllI("zLwEBR973sS1gVK5VUB/bQ==", "CWVIZ");
        llllIlIlll[llllIllIIl[70]] = llIlIIIIIIlll("a/KoSmN38iNI7Icg/4EivA==", "XXCnC");
        llllIlIlll[llllIllIIl[41]] = llIlIIIIIIllI("g+CR4HveM1aZlUnl39wG7w==", "YlsSz");
        llllIlIlll[llllIllIIl[71]] = llIlIIIIIIlll("/yHqqZBW2vkKsy555Nx2ng==", "uvaMA");
        llllIlIlll[llllIllIIl[72]] = llIlIIIIIIlll("rjajYjDOG2I9K9InXefK9w==", "wmsjP");
        llllIlIlll[llllIllIIl[73]] = llIlIIIIIIllI("b5h3VRk8HZYlxGztbsb1kA==", "WpAwj");
        llllIlIlll[llllIllIIl[74]] = llIlIIIIIIlll("y52nqTCTg2FeWnoAJcPEfw==", "Prvtx");
        llllIlIlll[llllIllIIl[42]] = llIlIIIIIIlll("vjUaNu7s1eccFXKYb3D/Fg==", "XwtDu");
        llllIlIlll[llllIllIIl[75]] = llIlIIIIIIlll("DoecHNkqH3DZpSAVvBzKgw==", "ZsOlh");
        llllIlIlll[llllIllIIl[95]] = llIlIIIIIlIII("FzUbQTo2dB4VLysg", "YTmaN");
        llllIlIlll[llllIllIIl[97]] = llIlIIIIIIlll("xxOMbhDhpMq1M+AbEx6jAw==", "xNchd");
        llllIlIlll[llllIllIIl[98]] = llIlIIIIIIlll("T9tcep4ACavVcxJo1524tw==", "QjeMM");
        llllIlIlll[llllIllIIl[99]] = llIlIIIIIIllI("t/EOCAG4PmRSDz6BWECG8ofKf+r9LSVO", "GNcKx");
        llllIlIlll[llllIllIIl[100]] = llIlIIIIIlIII("Ai8jHA==", "VNHyB");
        llllIlIlll[llllIllIIl[101]] = llIlIIIIIIllI("wCDSdN3/zeRTV91hKxq/lA==", "DFWLM");
        llllIlIlll[llllIllIIl[102]] = llIlIIIIIIlll("ZP0VBUFDrg7RqMNrSrb68w==", "yTyfi");
        llllIlIlll[llllIllIIl[103]] = llIlIIIIIlIII("NwICOw0=", "tnkVo");
        llllIlIlll[llllIllIIl[37]] = llIlIIIIIIllI("WouATg/9qhBLZv8TILMyq19vwTdHA2N/", "wQCNm");
        llllIlIlll[llllIllIIl[105]] = llIlIIIIIlIII("NjUrED0QKmQIPBs8", "uYDdU");
        llllIlIlll[llllIllIIl[106]] = llIlIIIIIlIII("GhcaJhA=", "YeuUc");
        llllIlIlll[llllIllIIl[107]] = llIlIIIIIIlll("WhX+4gC+3w8=", "vNiXO");
        llllIlIlll[llllIllIIl[108]] = llIlIIIIIlIII("Nzkn", "pXWrt");
        llllIlIlll[llllIllIIl[109]] = llIlIIIIIIlll("RSssOfOd6uk=", "QrVgh");
        llllIlIlll[llllIllIIl[110]] = llIlIIIIIIlll("Y2k2/1TahfgeLraFM+nAGA==", "AiZxu");
        llllIlIlll[llllIllIIl[111]] = llIlIIIIIlIII("PwAkLQ==", "haHAJ");
        llllIlIlll[llllIllIIl[112]] = llIlIIIIIIllI("1XMX+Mbioi8=", "LQMic");
        llllIlIlll[llllIllIIl[113]] = llIlIIIIIIllI("UbmTWKTfmMJe2m58LXGgYg==", "Leyvi");
        llllIlIlll[llllIllIIl[39]] = llIlIIIIIIllI("e14JPBVKFtU=", "NCrSP");
        llllIlIlll[llllIllIIl[6]] = llIlIIIIIIllI("rfEppWldfTQ=", "EjPYl");
        llllIlIlll[llllIllIIl[114]] = llIlIIIIIlIII("Ag8AAx8mHU0UFzhaXw==", "Hzmsv");
        llllIlIlll[llllIllIIl[116]] = llIlIIIIIIlll("JSkuxNthC3c=", "NXttq");
        llllIlIlll[llllIllIIl[117]] = llIlIIIIIlIII("HzMbMyE7IVYkKSVmRQ==", "UFvCH");
        llllIlIlll[llllIllIIl[119]] = llIlIIIIIIllI("coLxxgaCYO8=", "Xuxpg");
        llllIlIlll[llllIllIIl[120]] = llIlIIIIIlIII("JD4qLSUJayomJgo=", "lKXII");
        llllIlIlll[llllIllIIl[122]] = llIlIIIIIlIII("LQAjNy8A", "euQSC");
        llllIlIlll[llllIllIIl[123]] = llIlIIIIIlIII("Mh0gDCccHSACdBcbOxcnEQ==", "ttNeT");
        llllIlIlll[llllIllIIl[124]] = llIlIIIIIlIII("KwEGKg==", "neaOL");
        llllIlIlll[llllIllIIl[44]] = llIlIIIIIIllI("7x3y0mr9/ixUiZhomBczxg==", "LzgfS");
        llllIlIlll[llllIllIIl[140]] = llIlIIIIIlIII("LCwyVB4NbScVBAMrLQdKASIxBhkH", "bMDtj");
        llllIlIlll[llllIllIIl[5]] = llIlIIIIIIllI("BROLvmGgzZVA7gnNvpN8jw==", "pVOSY");
        llllIlIlll[llllIllIIl[141]] = llIlIIIIIlIII("IgEmFCIYGyBGNR4ANRUz", "quGfV");
        llllIlIlll[llllIllIIl[142]] = llIlIIIIIIllI("vKBoWLfDuPpYBT7FPn4KZg==", "paHpW");
        llllIlIlll[llllIllIIl[143]] = llIlIIIIIIllI("cIcAffhLNDU=", "jeXSF");
        llllIlIlll[llllIllIIl[144]] = llIlIIIIIIlll("29pO516jqjv7n46v/h+VTg==", "aqiDX");
        llllIlIlll[llllIllIIl[145]] = llIlIIIIIlIII("BhgdPgA1WRs2HDk=", "RyvWn");
        llllIlIlll[llllIllIIl[146]] = llIlIIIIIlIII("CxkENAdtGxAoCG0ZH3oEPxkENAc=", "MvqZc");
        llllIlIlll[llllIllIIl[147]] = llIlIIIIIIllI("xdLQsSy43R0=", "cSLjw");
        llllIlIlll[llllIllIIl[148]] = llIlIIIIIlIII("Dzk1GAMrK3gPCzVsaQ==", "ELXhj");
        llllIlIlll[llllIllIIl[149]] = llIlIIIIIIlll("mWceO3YtOdA=", "ojCRn");
        llllIlIlll[llllIllIIl[150]] = llIlIIIIIIlll("JcE0T/PojgStmNvEMrCJgQ==", "vKWvz");
        llllIlIlll[llllIllIIl[151]] = llIlIIIIIlIII("BhMlKg==", "LfHZr");
        llllIlIlll[llllIllIIl[152]] = llIlIIIIIIlll("ILUnYcn1axNeS/4HNH7U4Q==", "GfELK");
        llllIlIlll[llllIllIIl[153]] = llIlIIIIIIlll("4dFz6pUnL9Y=", "nMnje");
        llllIlIlll[llllIllIIl[154]] = llIlIIIIIIlll("0tIoSpTivmudyfM832O8Sg==", "EyaTH");
        llllIlIlll[llllIllIIl[155]] = llIlIIIIIIlll("P/b8UpqFvwU=", "rUWeG");
        llllIlIlll[llllIllIIl[156]] = llIlIIIIIIllI("eCzQyjri1dhwheTPYR2a6A==", "tVpqo");
        llllIlIlll[llllIllIIl[157]] = llIlIIIIIIlll("2cHhIrsTOMM=", "xhozB");
        llllIlIlll[llllIllIIl[158]] = llIlIIIIIlIII("IjwePBoGLlMrEhhpRg==", "hIsLs");
        llllIlIlll[llllIllIIl[159]] = llIlIIIIIIlll("MpnN57/RFpI=", "Ivjae");
        llllIlIlll[llllIllIIl[160]] = llIlIIIIIIllI("sk5pST0r31IrqTBXyaiL0A==", "PkAjw");
        llllIlIlll[llllIllIIl[161]] = llIlIIIIIIllI("7HOAre7ZeN8=", "pLmYt");
        llllIlIlll[llllIllIIl[172]] = llIlIIIIIlIII("CCsOShUpahsLDycsERlBJSUNGBIj", "FJxja");
        llllIlIlll[llllIllIIl[173]] = llIlIIIIIIlll("RW1+bgR0kuiJb6I4vdhjZg==", "QbNix");
        llllIlIlll[llllIllIIl[174]] = llIlIIIIIlIII("GxcRBjwhDRdUKycWAgct", "HcptH");
        llllIlIlll[llllIllIIl[175]] = llIlIIIIIIllI("a9cE/OecQok=", "ixyrM");
        llllIlIlll[llllIllIIl[35]] = llIlIIIIIIlll("NDFcRhoAXqN31gS0xsqP8g==", "ogpvR");
        llllIlIlll[llllIllIIl[176]] = llIlIIIIIIllI("KweRNplEiwapyriYnYAn4g==", "xxxMF");
        llllIlIlll[llllIllIIl[177]] = llIlIIIIIIlll("dhrHePODRw2VgHoztPlEFA==", "LAanx");
        llllIlIlll[llllIllIIl[178]] = llIlIIIIIIlll("hyShdyqKq+7bgTn2ueD/O3CDLbaW7Z4M", "UTgej");
        llllIlIlll[llllIllIIl[179]] = llIlIIIIIIllI("go1VTxaGJ8c=", "jiFDB");
        llllIlIlll[llllIllIIl[180]] = llIlIIIIIIlll("XSCQxkCffyI2hlKhUILyPg==", "scbTZ");
        llllIlIlll[llllIllIIl[79]] = llIlIIIIIIlll("7Ovlz79cro4=", "dOMSS");
        llllIlIlll[llllIllIIl[181]] = llIlIIIIIlIII("FxAWMSpUEBYyPA==", "tbyBY");
        llllIlIlll[llllIllIIl[182]] = llIlIIIIIIlll("PF5e3hGXMSc=", "MlPBd");
        llllIlIlll[llllIllIIl[183]] = llIlIIIIIIllI("QSB3HrxWckyLLqLLqqiM5g==", "RpwbF");
        llllIlIlll[llllIllIIl[184]] = llIlIIIIIIllI("dYtJZFzWjmI=", "SbxDQ");
        llllIlIlll[llllIllIIl[185]] = llIlIIIIIIllI("1aaeebEaxm22utuya6m2aw==", "KBSHQ");
        llllIlIlll[llllIllIIl[186]] = llIlIIIIIIlll("OcdU5OVD9uc=", "SJkmh");
        llllIlIlll[llllIllIIl[187]] = llIlIIIIIIlll("Qva9Ej9P2GzSh5T4mZ05pg==", "cyjEM");
        llllIlIlll[llllIllIIl[188]] = llIlIIIIIIlll("0fKdeswN5Ig=", "AtKiR");
        llllIlIlll[llllIllIIl[194]] = llIlIIIIIlIII("EQwjByl3DjcbJncMOEkqJQwjByk=", "WcViM");
        llllIlIlll[llllIllIIl[203]] = llIlIIIIIIllI("XW4H4MQjgqE=", "usmdK");
        llllIlIlll[llllIllIIl[204]] = llIlIIIIIlIII("JQY4ODIyAg==", "UgKKS");
        llllIlIlll[llllIllIIl[205]] = llIlIIIIIlIII("FhcDNxQBEw==", "fvpDu");
        llllIlIlll[llllIllIIl[206]] = llIlIIIIIIllI("b5bWf2DPLwk=", "zrFgO");
        llllIlIlll[llllIllIIl[207]] = llIlIIIIIIllI("jouAhXiaFJ0=", "iFBYS");
        llllIlIlll[llllIllIIl[208]] = llIlIIIIIIllI("eXHrzDCeI9o=", "bUEFw");
        llllIlIlll[llllIllIIl[211]] = llIlIIIIIIlll("zze/nLsAG7E=", "qvZdL");
        llllIlIlll[llllIllIIl[213]] = llIlIIIIIIllI("ss3df65m57E=", "Uqmlm");
        llllIlIlll[llllIllIIl[216]] = llIlIIIIIlIII("MhwqHAQUGj0R", "fuMtp");
        llllIlIlll[llllIllIIl[218]] = llIlIIIIIIllI("jKXjTY+PHfE=", "pKxji");
        llllIlIlll[llllIllIIl[221]] = llIlIIIIIlIII("LDgF", "kYuIu");
        llllIlIlll[llllIllIIl[224]] = llIlIIIIIIlll("Uoz8MYd69Lc=", "idZCA");
        llllIlIlll[llllIllIIl[226]] = llIlIIIIIIlll("iOMSLoaQ3ilQHiIa1x1SQQ==", "izeKL");
        llllIlIlll[llllIllIIl[227]] = llIlIIIIIIllI("SoNNDc51hDM=", "PYaXj");
        llllIlIlll[llllIllIIl[230]] = llIlIIIIIIllI("/9NjTJ7fUDA=", "zroPo");
        llllIlIlll[llllIllIIl[232]] = llIlIIIIIIllI("wak5pYSP0ZE=", "ubFsB");
        llllIlIlll[llllIllIIl[233]] = llIlIIIIIIllI("fVYXcFCIT0k=", "wPYSs");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private static boolean aa() {
        if (llIlIIIlIIIIl(Skills.getBoostedLevel(Skill.AGILITY), llllIllIIl[37])) {
            int[] iArr = new int[llllIllIIl[1]];
            iArr[llllIllIIl[0]] = llllIllIIl[12];
            if (llIlIIIIllIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllIllIIl[1]];
                iArr2[llllIllIIl[0]] = llllIllIIl[25];
                if (llIlIIIIllIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llllIllIIl[1]];
                    iArr3[llllIllIIl[0]] = llllIllIIl[23];
                    if (llIlIIIIllIll(Inventory.contains(iArr3) ? 1 : 0) && ((!llIlIIIIlllIl(Inventory.contains(item -> {
                        return item.getName().contains(llllIlIlll[llllIllIIl[207]]);
                    }) ? 1 : 0) || llIlIIIIllIll(Equipment.contains(item2 -> {
                        return item2.getName().contains(llllIlIlll[llllIllIIl[206]]);
                    }) ? 1 : 0)) && (!llIlIIIIlllIl(Inventory.contains(C0005f.be) ? 1 : 0) || llIlIIIIllIll(Equipment.contains(C0005f.be) ? 1 : 0)))) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
            }
            return llllIllIIl[0];
        }
        int[] iArr4 = new int[llllIllIIl[1]];
        iArr4[llllIllIIl[0]] = llllIllIIl[12];
        if (llIlIIIIllIll(Inventory.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[llllIllIIl[1]];
            iArr5[llllIllIIl[0]] = llllIllIIl[14];
            if (llIlIIIIllIll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llllIllIIl[1]];
                iArr6[llllIllIIl[0]] = llllIllIIl[13];
                if (llIlIIIIllIll(Inventory.contains(iArr6) ? 1 : 0) && ((!llIlIIIIlllIl(Inventory.contains(item3 -> {
                    return item3.getName().contains(llllIlIlll[llllIllIIl[205]]);
                }) ? 1 : 0) || llIlIIIIllIll(Equipment.contains(item4 -> {
                    return item4.getName().contains(llllIlIlll[llllIllIIl[204]]);
                }) ? 1 : 0)) && (!llIlIIIIlllIl(Inventory.contains(C0005f.be) ? 1 : 0) || llIlIIIIllIll(Equipment.contains(C0005f.be) ? 1 : 0)))) {
                    ?? r02 = llllIllIIl[1];
                    "".length();
                    return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
        }
        return llllIllIIl[0];
    }

    private static void dw() {
        WorldArea worldArea = new WorldArea(llllIllIIl[162], llllIllIIl[163], llllIllIIl[111], llllIllIIl[111], llllIllIIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[162], llllIllIIl[163], llllIllIIl[111], llllIllIIl[111], llllIllIIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[162], llllIllIIl[163], llllIllIIl[111], llllIllIIl[111], llllIllIIl[2]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[162], llllIllIIl[163], llllIllIIl[111], llllIllIIl[111], llllIllIIl[9]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[164], llllIllIIl[133], llllIllIIl[64], llllIllIIl[11], llllIllIIl[9]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[165], llllIllIIl[139], llllIllIIl[38], llllIllIIl[53], llllIllIIl[2]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[166], llllIllIIl[134], llllIllIIl[49], llllIllIIl[26], llllIllIIl[2]);
        WorldArea worldArea8 = new WorldArea(llllIllIIl[167], llllIllIIl[136], llllIllIIl[70], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea9 = new WorldArea(llllIllIIl[168], llllIllIIl[169], llllIllIIl[54], llllIllIIl[63], llllIllIIl[2]);
        WorldPoint worldPoint = new WorldPoint(llllIllIIl[170], llllIllIIl[171], llllIllIIl[0]);
        if (llIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIlIIIIlllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[172]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llllIllIIl[1]);
            "".length();
        }
        if (llIlIIIIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIlIIIIlllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[173]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llllIllIIl[1]);
                "".length();
            }
            if (llIlIIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[174]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llllIllIIl[1]];
                strArr[llllIllIIl[0]] = llllIlIlll[llllIllIIl[175]];
                TileObjects.getNearest(strArr).interact(llllIlIlll[llllIllIIl[35]]);
                Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIllIIl[0];
                }, llllIllIIl[104]);
                "".length();
                Time.sleepTicks(llllIllIIl[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llllIllIIl[1]];
        strArr2[llllIllIIl[0]] = llllIlIlll[llllIllIIl[176]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (llIlIIIIllllI(nearest) && llIlIIIIllIll(dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[177]];
            System.out.println(llllIlIlll[llllIllIIl[178]]);
            nearest.interact(llllIlIlll[llllIllIIl[179]]);
            Time.sleepTicks(llllIllIIl[9]);
            "".length();
        }
        if (llIlIIIIlllIl(dx() ? 1 : 0)) {
            if (llIlIIIIllIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[218]]) ? 1 : 0) && llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[219], llllIllIIl[220], llllIllIIl[9])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[180]];
                    nearest2.interact(llllIlIlll[llllIllIIl[79]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return "  ".length() <= 0 ? ((((81 + 48) - (-21)) + 1) ^ (((68 + 8) - 74) + 128)) & (((((75 + 163) - 196) + 131) ^ (((96 + 138) - 110) + 60)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
            if (llIlIIIIllIll(dx() ? 1 : 0)) {
                return;
            }
            if (llIlIIIIllIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (llIlIIIIllIll(tileObject2.getName().contains(llllIlIlll[llllIllIIl[216]]) ? 1 : 0) && llIlIIIlIIIll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[217], llllIllIIl[128], llllIllIIl[2])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return " ".length() == 0 ? ((91 ^ 19) ^ (34 ^ 54)) & (((59 ^ 104) ^ (116 ^ 123)) ^ (-" ".length())) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest3)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[181]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llllIlIlll[llllIllIIl[182]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
            if (llIlIIIIllIll(dx() ? 1 : 0)) {
                return;
            }
            if (llIlIIIIllIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (llIlIIIIllIll(tileObject3.getName().contains(llllIlIlll[llllIllIIl[213]]) ? 1 : 0) && llIlIIIlIIIll(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[214], llllIllIIl[215], llllIllIIl[2])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return " ".length() < (-" ".length()) ? ("   ".length() ^ (81 ^ 23)) & (((33 ^ 74) ^ (65 ^ 111)) ^ (-" ".length())) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest4)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[183]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llllIlIlll[llllIllIIl[184]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return !(true ^ true) ? "   ".length() & ("   ".length() ^ (-1)) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
            if (llIlIIIIllIll(dx() ? 1 : 0)) {
                return;
            }
            if (llIlIIIIllIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (llIlIIIIllIll(tileObject4.getName().contains(llllIlIlll[llllIllIIl[211]]) ? 1 : 0) && llIlIIIlIIIll(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[209], llllIllIIl[212], llllIllIIl[9])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return " ".length() < 0 ? ((215 ^ 172) ^ (127 ^ 76)) & (((42 ^ 69) ^ (133 ^ 162)) ^ (-" ".length())) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest5)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[185]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llllIlIlll[llllIllIIl[186]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return " ".length() <= (-" ".length()) ? ((71 ^ 66) ^ (126 ^ 96)) & (((172 ^ 158) ^ (179 ^ 154)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
            if (!llIlIIIIllIll(dx() ? 1 : 0) && llIlIIIIllIll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (llIlIIIIllIll(tileObject5.getName().contains(llllIlIlll[llllIllIIl[208]]) ? 1 : 0) && llIlIIIlIIIll(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[209], llllIllIIl[210], llllIllIIl[2])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return 0 != 0 ? ((((4 + 21) - (-97)) + 100) ^ (((173 + 8) - 89) + 100)) & (((108 ^ 127) ^ (103 ^ 106)) ^ (-" ".length())) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest6)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[187]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llllIlIlll[llllIllIIl[188]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return (((151 ^ 186) ^ (77 ^ 56)) & (((215 ^ 130) ^ (189 ^ 176)) ^ (-" ".length()))) != 0 ? ((((170 + 178) - 243) + 79) ^ (((37 + 64) - 95) + 129)) & (((103 ^ 85) ^ (120 ^ 117)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
        }
    }

    private static void dt() {
        new WorldArea(llllIllIIl[46], llllIllIIl[47], llllIllIIl[11], llllIllIIl[20], llllIllIIl[0]);
        WorldArea worldArea = new WorldArea(llllIllIIl[46], llllIllIIl[48], llllIllIIl[49], llllIllIIl[24], llllIllIIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[46], llllIllIIl[50], llllIllIIl[49], llllIllIIl[24], llllIllIIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[51], llllIllIIl[52], llllIllIIl[53], llllIllIIl[54], llllIllIIl[2]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[55], llllIllIIl[56], llllIllIIl[24], llllIllIIl[11], llllIllIIl[2]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[57], llllIllIIl[58], llllIllIIl[49], llllIllIIl[11], llllIllIIl[0]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[59], llllIllIIl[60], llllIllIIl[11], llllIllIIl[20], llllIllIIl[0]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[46], llllIllIIl[47], llllIllIIl[61], llllIllIIl[20], llllIllIIl[0]);
        if (llIlIIIIlllIl(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[11]];
            C0004e.a(iY);
            Time.sleepTicks(llllIllIIl[1]);
            "".length();
        }
        if (!(llIlIIIIlllIl(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && !llIlIIIIllIll(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && llIlIIIlIIIlI(Players.getLocal().getAnimation(), llllIllIIl[62]) && llIlIIIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            if (llIlIIIIllIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[49]];
                String[] strArr = new String[llllIllIIl[1]];
                strArr[llllIllIIl[0]] = llllIlIlll[llllIllIIl[63]];
                TileObjects.getNearest(strArr).interact(llllIlIlll[llllIllIIl[64]]);
                Time.sleepTicks(llllIllIIl[2]);
                "".length();
            }
            if (llIlIIIIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[53]];
                String[] strArr2 = new String[llllIllIIl[1]];
                strArr2[llllIllIIl[0]] = llllIlIlll[llllIllIIl[38]];
                TileObjects.getNearest(strArr2).interact(llllIlIlll[llllIllIIl[65]]);
                Time.sleepTicks(llllIllIIl[2]);
                "".length();
            }
            if (llIlIIIIllIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[66]];
                String[] strArr3 = new String[llllIllIIl[1]];
                strArr3[llllIllIIl[0]] = llllIlIlll[llllIllIIl[54]];
                TileObjects.getNearest(strArr3).interact(llllIlIlll[llllIllIIl[67]]);
                Time.sleepTicks(llllIllIIl[2]);
                "".length();
            }
            if (llIlIIIIllIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[40]];
                String[] strArr4 = new String[llllIllIIl[1]];
                strArr4[llllIllIIl[0]] = llllIlIlll[llllIllIIl[68]];
                TileObjects.getNearest(strArr4).interact(llllIlIlll[llllIllIIl[61]]);
                Time.sleepTicks(llllIllIIl[18]);
                "".length();
            }
            if (llIlIIIIllIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[69]];
                String[] strArr5 = new String[llllIllIIl[1]];
                strArr5[llllIllIIl[0]] = llllIlIlll[llllIllIIl[70]];
                TileObjects.getNearest(strArr5).interact(llllIlIlll[llllIllIIl[41]]);
                Time.sleepTicks(llllIllIIl[16]);
                "".length();
            }
            if (llIlIIIIllIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[71]];
                String[] strArr6 = new String[llllIllIIl[1]];
                strArr6[llllIllIIl[0]] = llllIlIlll[llllIllIIl[72]];
                TileObjects.getNearest(strArr6).interact(llllIlIlll[llllIllIIl[73]]);
                Time.sleepTicks(llllIllIIl[9]);
                "".length();
            }
            if (llIlIIIIllIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[74]];
                String[] strArr7 = new String[llllIllIIl[1]];
                strArr7[llllIllIIl[0]] = llllIlIlll[llllIllIIl[42]];
                TileObjects.getNearest(strArr7).interact(llllIlIlll[llllIllIIl[75]]);
                Time.sleepTicks(llllIllIIl[16]);
                "".length();
            }
        }
    }

    private static void dv() {
        WorldArea worldArea = new WorldArea(llllIllIIl[125], llllIllIIl[126], llllIllIIl[112], llllIllIIl[107], llllIllIIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[125], llllIllIIl[126], llllIllIIl[112], llllIllIIl[107], llllIllIIl[1]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[125], llllIllIIl[126], llllIllIIl[112], llllIllIIl[107], llllIllIIl[2]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[125], llllIllIIl[126], llllIllIIl[112], llllIllIIl[107], llllIllIIl[9]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[127], llllIllIIl[128], llllIllIIl[49], llllIllIIl[11], llllIllIIl[2]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[129], llllIllIIl[127], llllIllIIl[49], llllIllIIl[24], llllIllIIl[2]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[130], llllIllIIl[131], llllIllIIl[63], llllIllIIl[49], llllIllIIl[2]);
        WorldArea worldArea8 = new WorldArea(llllIllIIl[132], llllIllIIl[133], llllIllIIl[11], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea9 = new WorldArea(llllIllIIl[134], llllIllIIl[8], llllIllIIl[49], llllIllIIl[26], llllIllIIl[2]);
        WorldArea worldArea10 = new WorldArea(llllIllIIl[135], llllIllIIl[136], llllIllIIl[68], llllIllIIl[53], llllIllIIl[9]);
        WorldArea worldArea11 = new WorldArea(llllIllIIl[137], llllIllIIl[138], llllIllIIl[63], llllIllIIl[64], llllIllIIl[2]);
        WorldPoint worldPoint = new WorldPoint(llllIllIIl[137], llllIllIIl[139], llllIllIIl[0]);
        if (llIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (llIlIIIIlllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[140]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(llllIllIIl[1]);
            "".length();
        }
        if (llIlIIIIllIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIlIIIIlllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[5]];
                Movement.walkTo(worldPoint);
                "".length();
                Time.sleepTicks(llllIllIIl[1]);
                "".length();
            }
            if (llIlIIIlIIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[141]];
                int experience = Skills.getExperience(Skill.AGILITY);
                String[] strArr = new String[llllIllIIl[1]];
                strArr[llllIllIIl[0]] = llllIlIlll[llllIllIIl[142]];
                TileObjects.getNearest(strArr).interact(llllIlIlll[llllIllIIl[143]]);
                Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience)) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIllIIl[0];
                }, llllIllIIl[104]);
                "".length();
                Time.sleepTicks(llllIllIIl[1]);
                "".length();
            }
        }
        String[] strArr2 = new String[llllIllIIl[1]];
        strArr2[llllIllIIl[0]] = llllIlIlll[llllIllIIl[144]];
        TileItem nearest = TileItems.getNearest(strArr2);
        if (llIlIIIIllllI(nearest) && llIlIIIIllIll(dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[145]];
            System.out.println(llllIlIlll[llllIllIIl[146]]);
            nearest.interact(llllIlIlll[llllIllIIl[147]]);
            Time.sleepTicks(llllIllIIl[9]);
            "".length();
        }
        if (llIlIIIIlllIl(dx() ? 1 : 0)) {
            if (llIlIIIIllIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest2 = TileObjects.getNearest(tileObject -> {
                    if (llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[233]]) ? 1 : 0) && llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[234], llllIllIIl[131], llllIllIIl[2])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest2)) {
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[148]];
                    nearest2.interact(llllIlIlll[llllIllIIl[149]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return " ".length() >= "   ".length() ? ((((113 + 17) - 111) + 176) ^ (((95 + 81) - 99) + 61)) & (((101 ^ 1) ^ (37 ^ 8)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
            if (llIlIIIIllIll(dx() ? 1 : 0)) {
                return;
            }
            if (llIlIIIIllIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
                    if (llIlIIIIllIll(tileObject2.getName().contains(llllIlIlll[llllIllIIl[232]]) ? 1 : 0) && llIlIIIlIIIll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[131], llllIllIIl[225], llllIllIIl[2])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest3)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[150]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    nearest3.interact(llllIlIlll[llllIllIIl[151]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return (199 ^ 195) < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
            if (llIlIIIIllIll(dx() ? 1 : 0)) {
                return;
            }
            if (llIlIIIIllIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (llIlIIIIllIll(tileObject3.getName().contains(llllIlIlll[llllIllIIl[230]]) ? 1 : 0) && llIlIIIlIIIll(tileObject3.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[139], llllIllIIl[231], llllIllIIl[2])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return (-" ".length()) > 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest4)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[152]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    nearest4.interact(llllIlIlll[llllIllIIl[153]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return (-" ".length()) > " ".length() ? ((((101 + 170) - 146) + 77) ^ (((102 + 103) - 179) + 142)) & (((5 ^ 84) ^ (105 ^ 90)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
            if (llIlIIIIllIll(dx() ? 1 : 0)) {
                return;
            }
            if (llIlIIIIllIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (llIlIIIIllIll(tileObject4.getName().contains(llllIlIlll[llllIllIIl[227]]) ? 1 : 0) && llIlIIIlIIIll(tileObject4.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[228], llllIllIIl[229], llllIllIIl[9])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return 0 != 0 ? ((237 ^ 138) ^ (42 ^ 94)) & (((16 ^ 93) ^ (82 ^ 12)) ^ (-" ".length())) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest5)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[154]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    nearest5.interact(llllIlIlll[llllIllIIl[155]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return ((((125 + 53) - 133) + 106) ^ (((26 + 146) - 38) + 13)) <= 0 ? ((((87 + 30) - 100) + 182) ^ (((57 + 50) - (-6)) + 31)) & (((((136 + 170) - 160) + 90) ^ (((160 + 178) - 221) + 70)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
            if (llIlIIIIllIll(dx() ? 1 : 0)) {
                return;
            }
            if (llIlIIIIllIll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (llIlIIIIllIll(tileObject5.getName().contains(llllIlIlll[llllIllIIl[226]]) ? 1 : 0) && llIlIIIlIIIll(tileObject5.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[8], llllIllIIl[130], llllIllIIl[2])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return 0 != 0 ? ((((161 + 100) - 203) + 148) ^ (((120 + 108) - 158) + 89)) & (((159 ^ 131) ^ (240 ^ 189)) ^ (-" ".length())) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest6)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[156]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    nearest6.interact(llllIlIlll[llllIllIIl[157]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return "  ".length() < ((114 ^ 36) & ((62 ^ 104) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
            if (llIlIIIIllIll(dx() ? 1 : 0)) {
                return;
            }
            if (llIlIIIIllIll(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (llIlIIIIllIll(tileObject6.getName().contains(llllIlIlll[llllIllIIl[224]]) ? 1 : 0) && llIlIIIlIIIll(tileObject6.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[225], llllIllIIl[215], llllIllIIl[9])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest7)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[158]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    nearest7.interact(llllIlIlll[llllIllIIl[159]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return 0 != 0 ? ((133 ^ 144) ^ (115 ^ 68)) & (((((153 + 134) - 144) + 20) ^ (((114 + 75) - 151) + 91)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
            if (!llIlIIIIllIll(dx() ? 1 : 0) && llIlIIIIllIll(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (llIlIIIIllIll(tileObject7.getName().contains(llllIlIlll[llllIllIIl[221]]) ? 1 : 0) && llIlIIIlIIIll(tileObject7.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[222], llllIllIIl[223], llllIllIIl[2])), llllIllIIl[2])) {
                        ?? r0 = llllIllIIl[1];
                        "".length();
                        return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llllIllIIl[0];
                });
                if (llIlIIIIllllI(nearest8)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[160]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    nearest8.interact(llllIlIlll[llllIllIIl[161]]);
                    Time.sleepTicks(C0004e.c(llllIllIIl[1], llllIllIIl[2]));
                    "".length();
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
        }
    }

    private static void du() {
        WorldArea worldArea = new WorldArea(llllIllIIl[76], llllIllIIl[77], llllIllIIl[78], llllIllIIl[79], llllIllIIl[1]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[76], llllIllIIl[77], llllIllIIl[78], llllIllIIl[79], llllIllIIl[2]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[76], llllIllIIl[77], llllIllIIl[78], llllIllIIl[79], llllIllIIl[9]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[80], llllIllIIl[81], llllIllIIl[69], llllIllIIl[64], llllIllIIl[0]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[82], llllIllIIl[81], llllIllIIl[11], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[83], llllIllIIl[84], llllIllIIl[63], llllIllIIl[49], llllIllIIl[9]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[85], llllIllIIl[86], llllIllIIl[26], llllIllIIl[22], llllIllIIl[1]);
        WorldArea worldArea8 = new WorldArea(llllIllIIl[85], llllIllIIl[87], llllIllIIl[11], llllIllIIl[24], llllIllIIl[9]);
        WorldArea worldArea9 = new WorldArea(llllIllIIl[88], llllIllIIl[89], llllIllIIl[75], llllIllIIl[40], llllIllIIl[9]);
        WorldArea worldArea10 = new WorldArea(llllIllIIl[90], llllIllIIl[91], llllIllIIl[66], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea11 = new WorldArea(llllIllIIl[92], llllIllIIl[93], llllIllIIl[22], llllIllIIl[26], llllIllIIl[9]);
        WorldArea worldArea12 = new WorldArea(llllIllIIl[92], llllIllIIl[94], llllIllIIl[11], llllIllIIl[22], llllIllIIl[9]);
        if (llIlIIIIlllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[95]];
            if (llIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (llIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(new WorldPoint(llllIllIIl[96], llllIllIIl[52], llllIllIIl[0]));
            "".length();
            Time.sleepTicks(llllIllIIl[1]);
            "".length();
        }
        if (llIlIIIlIIIlI(Players.getLocal().getAnimation(), llllIllIIl[62]) && llIlIIIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] strArr = new String[llllIllIIl[1]];
            strArr[llllIllIIl[0]] = llllIlIlll[llllIllIIl[97]];
            TileItem nearest = TileItems.getNearest(strArr);
            if (llIlIIIIllllI(nearest) && llIlIIIIllIll(dx() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[98]];
                System.out.println(llllIlIlll[llllIllIIl[99]]);
                nearest.interact(llllIlIlll[llllIllIIl[100]]);
                Time.sleepTicks(llllIllIIl[9]);
                "".length();
            }
            if (llIlIIIIlllIl(dx() ? 1 : 0)) {
                if (llIlIIIIllIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[101]];
                    int experience = Skills.getExperience(Skill.AGILITY);
                    String[] strArr2 = new String[llllIllIIl[1]];
                    strArr2[llllIllIIl[0]] = llllIlIlll[llllIllIIl[102]];
                    TileObjects.getNearest(strArr2).interact(llllIlIlll[llllIllIIl[103]]);
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return " ".length() <= 0 ? ((((110 + 16) - 30) + 76) ^ (((40 + 27) - 31) + 132)) & (((74 ^ 38) ^ (198 ^ 174)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
                if (llIlIIIIllIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[37]];
                    int experience2 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr3 = new String[llllIllIIl[1]];
                    strArr3[llllIllIIl[0]] = llllIlIlll[llllIllIIl[105]];
                    TileObjects.getNearest(strArr3).interact(llllIlIlll[llllIllIIl[106]]);
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience2)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return " ".length() == "  ".length() ? ((((0 + 96) - (-27)) + 111) ^ (((46 + 152) - 166) + 128)) & (((31 ^ 39) ^ (203 ^ 185)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
                if (llIlIIIIllIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[107]];
                    int experience3 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr4 = new String[llllIllIIl[1]];
                    strArr4[llllIllIIl[0]] = llllIlIlll[llllIllIIl[108]];
                    TileObjects.getNearest(strArr4).interact(llllIlIlll[llllIllIIl[109]]);
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience3)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
                if (llIlIIIIllIll(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[110]];
                    int experience4 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr5 = new String[llllIllIIl[1]];
                    strArr5[llllIllIIl[0]] = llllIlIlll[llllIllIIl[111]];
                    TileObjects.getNearest(strArr5).interact(llllIlIlll[llllIllIIl[112]]);
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience4)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return ((true ^ true) & ((true ^ true) ^ true)) == (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
                if (llIlIIIIllIll(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[113]];
                    int experience5 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr6 = new String[llllIllIIl[1]];
                    strArr6[llllIllIIl[0]] = llllIlIlll[llllIllIIl[39]];
                    TileObjects.getNearest(strArr6).interact(llllIlIlll[llllIllIIl[6]]);
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience5)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return (-" ".length()) >= 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
                if (llIlIIIIllIll(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[114]];
                    int experience6 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr = new int[llllIllIIl[1]];
                    iArr[llllIllIIl[0]] = llllIllIIl[115];
                    TileObjects.getNearest(iArr).interact(llllIlIlll[llllIllIIl[116]]);
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience6)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
                if (llIlIIIIllIll(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[117]];
                    int experience7 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr2 = new int[llllIllIIl[1]];
                    iArr2[llllIllIIl[0]] = llllIllIIl[118];
                    TileObjects.getNearest(iArr2).interact(llllIlIlll[llllIllIIl[119]]);
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience7)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return (-" ".length()) != (-" ".length()) ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
                if (llIlIIIIllIll(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[120]];
                    int experience8 = Skills.getExperience(Skill.AGILITY);
                    int[] iArr3 = new int[llllIllIIl[1]];
                    iArr3[llllIllIIl[0]] = llllIllIIl[121];
                    TileObjects.getNearest(iArr3).interact(llllIlIlll[llllIllIIl[122]]);
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience8)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return " ".length() == 0 ? ((111 ^ 38) ^ ((77 ^ 89) & ((102 ^ 114) ^ (-1)))) & (((8 ^ 92) ^ (56 ^ 37)) ^ (-" ".length())) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
                if (llIlIIIIllIll(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIlllIl(dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[123]];
                    int experience9 = Skills.getExperience(Skill.AGILITY);
                    String[] strArr7 = new String[llllIllIIl[1]];
                    strArr7[llllIllIIl[0]] = llllIlIlll[llllIllIIl[124]];
                    TileObjects.getNearest(strArr7).interact(llllIlIlll[llllIllIIl[44]]);
                    Time.sleepUntil(() -> {
                        if (llIlIIIIlllll(Skills.getExperience(Skill.AGILITY), experience9)) {
                            ?? r0 = llllIllIIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llllIllIIl[0];
                    }, llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIlIIIlIIIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v212, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v256, types: [boolean] */
    public static void ds() {
        if (llIlIIIIllIll(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[0]];
            C0001b.a(bu);
            if (llIlIIIIlllII(bu.size(), llllIllIIl[1])) {
                System.out.println(llllIlIlll[llllIllIIl[1]]);
                bs = llllIllIIl[0];
            }
        }
        if (llIlIIIIlllIl(bs ? 1 : 0)) {
            if (llIlIIIIlllIl(aa() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIlIIIIllllI(nearest) && llIlIIIIlllIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[2]];
                    if (llIlIIIIllIll(new WorldArea(llllIllIIl[3], llllIllIIl[4], llllIllIIl[5], llllIllIIl[6], llllIllIIl[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint worldPoint = new WorldPoint(llllIllIIl[7], llllIllIIl[8], llllIllIIl[0]);
                        if (llIlIIIIlllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), llllIllIIl[9])) {
                            Movement.walkTo(worldPoint);
                            "".length();
                            Time.sleepTicks(llllIllIIl[1]);
                            "".length();
                        }
                    }
                    C0000a.a(nearest);
                }
                if (llIlIIIIllllI(nearest) && llIlIIIIllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[9]];
                    if (llIlIIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llllIllIIl[10]);
                        "".length();
                    }
                    if (llIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                        if (llIlIIIlIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llllIllIIl[1]);
                            "".length();
                        }
                        if (llIlIIIlIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llllIllIIl[2]);
                            "".length();
                        }
                    }
                    int[] iArr = new int[llllIllIIl[11]];
                    iArr[llllIllIIl[0]] = llllIllIIl[12];
                    iArr[llllIllIIl[1]] = llllIllIIl[13];
                    iArr[llllIllIIl[2]] = llllIllIIl[14];
                    iArr[llllIllIIl[9]] = llllIllIIl[15];
                    iArr[llllIllIIl[16]] = llllIllIIl[17];
                    iArr[llllIllIIl[18]] = llllIllIIl[19];
                    iArr[llllIllIIl[20]] = llllIllIIl[21];
                    iArr[llllIllIIl[22]] = llllIllIIl[23];
                    iArr[llllIllIIl[24]] = llllIllIIl[25];
                    iArr[llllIllIIl[26]] = llllIllIIl[27];
                    if (llIlIIIIlllIl(C0004e.b(iArr) ? 1 : 0)) {
                        ae();
                        System.out.println(llllIlIlll[llllIllIIl[16]]);
                        bs = llllIllIIl[1];
                        return;
                    }
                    int[] iArr2 = new int[llllIllIIl[11]];
                    iArr2[llllIllIIl[0]] = llllIllIIl[12];
                    iArr2[llllIllIIl[1]] = llllIllIIl[13];
                    iArr2[llllIllIIl[2]] = llllIllIIl[14];
                    iArr2[llllIllIIl[9]] = llllIllIIl[15];
                    iArr2[llllIllIIl[16]] = llllIllIIl[17];
                    iArr2[llllIllIIl[18]] = llllIllIIl[19];
                    iArr2[llllIllIIl[20]] = llllIllIIl[21];
                    iArr2[llllIllIIl[22]] = llllIllIIl[23];
                    iArr2[llllIllIIl[24]] = llllIllIIl[25];
                    iArr2[llllIllIIl[26]] = llllIllIIl[27];
                    if (llIlIIIIllIll(C0004e.b(iArr2) ? 1 : 0)) {
                        C0000a.a(llllIllIIl[28], llllIllIIl[1]);
                        C0000a.a(llllIllIIl[29], llllIllIIl[1]);
                        C0000a.a(llllIllIIl[30], llllIllIIl[1]);
                        C0000a.a(llllIllIIl[31], llllIllIIl[1]);
                        C0000a.a(llllIllIIl[32], llllIllIIl[1]);
                        C0000a.a(llllIllIIl[33], llllIllIIl[1]);
                        C0000a.a(llllIllIIl[34], llllIllIIl[1]);
                        int[] iArr3 = new int[llllIllIIl[1]];
                        iArr3[llllIllIIl[0]] = llllIllIIl[28];
                        if (llIlIIIIlllIl(Inventory.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[llllIllIIl[1]];
                            iArr4[llllIllIIl[0]] = llllIllIIl[28];
                            if (llIlIIIIlllIl(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[llllIllIIl[1]];
                                iArr5[llllIllIIl[0]] = llllIllIIl[28];
                                if (llIlIIIIlllIl(Bank.contains(iArr5) ? 1 : 0)) {
                                    C0000a.a(llllIllIIl[35], llllIllIIl[1]);
                                }
                            }
                        }
                        C0000a.a(llllIllIIl[17], llllIllIIl[1]);
                        C0004e.l(llllIllIIl[28]);
                        C0004e.l(llllIllIIl[29]);
                        C0004e.l(llllIllIIl[30]);
                        C0004e.l(llllIllIIl[31]);
                        C0004e.l(llllIllIIl[32]);
                        Time.sleepTicks(llllIllIIl[1]);
                        "".length();
                        C0004e.l(llllIllIIl[34]);
                        C0004e.l(llllIllIIl[36]);
                        C0004e.l(llllIllIIl[33]);
                        C0004e.l(llllIllIIl[35]);
                        C0004e.l(llllIllIIl[17]);
                        Time.sleepTicks(llllIllIIl[9]);
                        "".length();
                        if (llIlIIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepTicks(llllIllIIl[20]);
                            "".length();
                        }
                        if (llIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                            if (llIlIIIIlllII(Skills.getLevel(Skill.AGILITY), llllIllIIl[37])) {
                                C0000a.a(llllIllIIl[12], llllIllIIl[11]);
                                C0000a.a(llllIllIIl[13], llllIllIIl[11]);
                                C0000a.a(llllIllIIl[21], llllIllIIl[11]);
                                C0000a.a(llllIllIIl[14], llllIllIIl[11]);
                                C0000a.b(C0005f.be, llllIllIIl[1]);
                                C0000a.a(llllIllIIl[27], llllIllIIl[1]);
                                C0000a.a(llllIllIIl[19], llllIllIIl[18]);
                                C0000a.a(llllIllIIl[23], llllIllIIl[38]);
                            }
                            if (llIlIIIlIIIIl(Skills.getLevel(Skill.AGILITY), llllIllIIl[37])) {
                                C0000a.a(llllIllIIl[12], llllIllIIl[11]);
                                C0000a.a(llllIllIIl[21], llllIllIIl[11]);
                                C0000a.a(llllIllIIl[25], llllIllIIl[11]);
                                C0000a.b(C0005f.be, llllIllIIl[1]);
                                C0000a.a(llllIllIIl[27], llllIllIIl[1]);
                                C0000a.a(llllIllIIl[19], llllIllIIl[24]);
                                C0000a.a(llllIllIIl[23], llllIllIIl[11]);
                            }
                        }
                    }
                }
            }
            if (llIlIIIIllIll(aa() ? 1 : 0)) {
                String[] strArr = new String[llllIllIIl[1]];
                strArr[llllIllIIl[0]] = llllIlIlll[llllIllIIl[18]];
                if (llIlIIIIllIll(Inventory.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llllIllIIl[1]];
                    strArr2[llllIllIIl[0]] = llllIlIlll[llllIllIIl[20]];
                    Inventory.getFirst(strArr2).interact(llllIlIlll[llllIllIIl[22]]);
                }
                if (llIlIIIIllIll(Inventory.contains(C0005f.aU) ? 1 : 0) && llIlIIIIlllII(Movement.getRunEnergy(), llllIllIIl[39])) {
                    Inventory.getFirst(C0005f.aU).interact(llllIlIlll[llllIllIIl[24]]);
                    Time.sleepTicks(llllIllIIl[1]);
                    "".length();
                }
                if (llIlIIIIlllll(Combat.getMissingHealth(), llllIllIIl[40])) {
                    int[] iArr6 = new int[llllIllIIl[1]];
                    iArr6[llllIllIIl[0]] = llllIllIIl[23];
                    if (llIlIIIIllIll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llllIllIIl[1]];
                        iArr7[llllIllIIl[0]] = llllIllIIl[23];
                        Inventory.getFirst(iArr7).interact(llllIlIlll[llllIllIIl[26]]);
                        Time.sleepTicks(llllIllIIl[2]);
                        "".length();
                    }
                }
                if (llIlIIIIlllll(Movement.getRunEnergy(), llllIllIIl[41]) && llIlIIIIlllIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (llIlIIIIlllII(Skills.getLevel(Skill.AGILITY), llllIllIIl[42])) {
                    dt();
                }
                if ((!llIlIIIlIIIIl(C0004e.j(llllIllIIl[43]), llllIllIIl[44]) || llIlIIIIlllII(C0004e.j(llllIllIIl[45]), llllIllIIl[18])) && llIlIIIlIIIIl(Skills.getLevel(Skill.AGILITY), llllIllIIl[42]) && llIlIIIIlllII(Skills.getLevel(Skill.AGILITY), llllIllIIl[44])) {
                    du();
                }
                if (llIlIIIlIIIIl(C0004e.j(llllIllIIl[43]), llllIllIIl[44]) && llIlIIIlIIIIl(C0004e.j(llllIllIIl[45]), llllIllIIl[18])) {
                    if (llIlIIIlIIIIl(Skills.getLevel(Skill.AGILITY), llllIllIIl[42]) && llIlIIIIlllII(Skills.getLevel(Skill.AGILITY), llllIllIIl[37])) {
                        du();
                    }
                    if (llIlIIIlIIIIl(Skills.getLevel(Skill.AGILITY), llllIllIIl[37]) && llIlIIIIlllII(Skills.getLevel(Skill.AGILITY), llllIllIIl[44])) {
                        dv();
                    }
                }
                if (llIlIIIlIIIIl(Skills.getLevel(Skill.AGILITY), llllIllIIl[44])) {
                    dw();
                }
            }
        }
    }

    private static void llIlIIIIllIlI() {
        llllIllIIl = new int[239];
        llllIllIIl[0] = (115 ^ 45) & ((99 ^ 61) ^ (-1));
        llllIllIIl[1] = " ".length();
        llllIllIIl[2] = "  ".length();
        llllIllIIl[3] = (-((-26763) & 31419)) & (-16449) & 24567;
        llllIllIIl[4] = (-((-11555) & 27955)) & (-8257) & 28117;
        llllIllIIl[5] = 75 ^ 117;
        llllIllIIl[6] = (94 ^ 0) ^ (84 ^ 57);
        llllIllIIl[7] = (-((-2849) & 11105)) & (-20996) & 32763;
        llllIllIIl[8] = (-((-14337) & 14951)) & (-24577) & 28670;
        llllIllIIl[9] = "   ".length();
        llllIllIIl[10] = (-((-7049) & 32719)) & (-2082) & 32751;
        llllIllIIl[11] = (147 ^ 167) ^ (104 ^ 86);
        llllIllIIl[12] = (-9) & 8015;
        llllIllIIl[13] = (-8328) & 16335;
        llllIllIIl[14] = (-(92 ^ 123)) & (-16401) & 24447;
        llllIllIIl[15] = (-((-1409) & 17905)) & (-12417) & 32765;
        llllIllIIl[16] = 166 ^ 162;
        llllIllIIl[17] = (-((-25161) & 29545)) & (-17) & 16380;
        llllIllIIl[18] = 138 ^ 143;
        llllIllIIl[19] = (-((-4197) & 22639)) & (-517) & 31583;
        llllIllIIl[20] = (60 ^ 24) ^ (38 ^ 4);
        llllIllIIl[21] = (-((-5993) & 14205)) & (-16546) & 32767;
        llllIllIIl[22] = (218 ^ 155) ^ (216 ^ 158);
        llllIllIIl[23] = (-27733) & 28117;
        llllIllIIl[24] = (171 ^ 148) ^ (28 ^ 43);
        llllIllIIl[25] = (-((-19843) & 32159)) & (-769) & 32703;
        llllIllIIl[26] = 169 ^ 160;
        llllIllIIl[27] = (-((-21381) & 29574)) & (-1285) & 30623;
        llllIllIIl[28] = (-((-26209) & 30691)) & (-34) & 16375;
        llllIllIIl[29] = (-((-10779) & 31643)) & (-1) & 32720;
        llllIllIIl[30] = (-((-8262) & 12791)) & (-1) & 16383;
        llllIllIIl[31] = (-4258) & 16109;
        llllIllIIl[32] = (-4393) & 16250;
        llllIllIIl[33] = (-((-613) & 21366)) & (-161) & 32763;
        llllIllIIl[34] = (-16390) & 28357;
        llllIllIIl[35] = 54 ^ 110;
        llllIllIIl[36] = (-((-18433) & 26833)) & (-4133) & 32767;
        llllIllIIl[37] = 63 ^ 23;
        llllIllIIl[38] = 96 ^ 111;
        llllIllIIl[39] = 177 ^ 131;
        llllIllIIl[40] = 130 ^ 150;
        llllIllIIl[41] = (184 ^ 129) ^ (1 ^ 33);
        llllIllIIl[42] = (170 ^ 198) ^ (223 ^ 173);
        llllIllIIl[43] = (-((-769) & 8145)) & (-16897) & 24574;
        llllIllIIl[44] = (159 ^ 146) ^ (42 ^ 27);
        llllIllIIl[45] = (-14861) & 15167;
        llllIllIIl[46] = (-((-2389) & 3423)) & (-12865) & 16367;
        llllIllIIl[47] = (-28821) & 32255;
        llllIllIIl[48] = (-((-2401) & 15211)) & (-18) & 16251;
        llllIllIIl[49] = (111 ^ 115) ^ (171 ^ 188);
        llllIllIIl[50] = (-12321) & 15741;
        llllIllIIl[51] = (-((-8593) & 29595)) & (-1045) & 24511;
        llllIllIIl[52] = (-8745) & 12159;
        llllIllIIl[53] = (35 ^ 63) ^ (167 ^ 181);
        llllIllIIl[54] = 11 ^ 25;
        llllIllIIl[55] = (-29709) & 32191;
        llllIllIIl[56] = (-((-10490) & 31487)) & (-3) & 24415;
        llllIllIIl[57] = (-((-17163) & 22351)) & (-10) & 7679;
        llllIllIIl[58] = (-8707) & 12123;
        llllIllIIl[59] = (-((-4515) & 13795)) & (-20487) & 32247;
        llllIllIIl[60] = (-((-2817) & 31501)) & (-145) & 32255;
        llllIllIIl[61] = 171 ^ 189;
        llllIllIIl[62] = -" ".length();
        llllIllIIl[63] = (((96 + 53) - 53) + 53) ^ (((10 + 146) - 86) + 83);
        llllIllIIl[64] = (66 ^ 35) ^ (171 ^ 199);
        llllIllIIl[65] = (54 ^ 66) ^ (74 ^ 46);
        llllIllIIl[66] = 213 ^ 196;
        llllIllIIl[67] = (55 ^ 82) ^ (196 ^ 178);
        llllIllIIl[68] = (163 ^ 136) ^ (23 ^ 41);
        llllIllIIl[69] = (34 ^ 79) ^ (26 ^ 96);
        llllIllIIl[70] = (30 ^ 13) ^ (37 ^ 46);
        llllIllIIl[71] = (148 ^ 176) ^ (99 ^ 93);
        llllIllIIl[72] = (((110 + 106) - 64) + 21) ^ (((10 + 85) - 88) + 175);
        llllIllIIl[73] = (25 ^ 106) ^ (99 ^ 12);
        llllIllIIl[74] = (8 ^ 118) ^ (2 ^ 97);
        llllIllIIl[75] = 19 ^ 12;
        llllIllIIl[76] = (-((-7215) & 32431)) & (-4097) & 32479;
        llllIllIIl[77] = (-((-1047) & 25695)) & (-129) & 28126;
        llllIllIIl[78] = (((99 ^ 119) + (236 ^ 131)) - (64 ^ 53)) + (53 ^ 78);
        llllIllIIl[79] = (((67 + 149) - 130) + 119) ^ (((5 + 65) - 50) + 127);
        llllIllIIl[80] = (-((-557) & 4653)) & (-841) & 8155;
        llllIllIIl[81] = (-12453) & 15861;
        llllIllIIl[82] = (-355) & 3566;
        llllIllIIl[83] = (-25346) & 28543;
        llllIllIIl[84] = (-((-2228) & 31423)) & (-1) & 32607;
        llllIllIIl[85] = (-((-1570) & 14243)) & (-521) & 16383;
        llllIllIIl[86] = (-20651) & 24063;
        llllIllIIl[87] = (-8229) & 11629;
        llllIllIIl[88] = (-((-10857) & 27501)) & (-4097) & 23919;
        llllIllIIl[89] = (-((-49) & 24825)) & (-4097) & 32254;
        llllIllIIl[90] = (-((-8195) & 24847)) & (-8803) & 28671;
        llllIllIIl[91] = (-4657) & 8048;
        llllIllIIl[92] = (-12361) & 15594;
        llllIllIIl[93] = (-((-10477) & 11005)) & (-8354) & 12283;
        llllIllIIl[94] = (-((-2137) & 31486)) & (-1) & 32759;
        llllIllIIl[95] = (205 ^ 196) ^ (117 ^ 92);
        llllIllIIl[96] = (-4166) & 7389;
        llllIllIIl[97] = 91 ^ 122;
        llllIllIIl[98] = (((70 + 120) - 146) + 116) ^ (((11 + 19) - (-42)) + 58);
        llllIllIIl[99] = 47 ^ 12;
        llllIllIIl[100] = (46 ^ 52) ^ (14 ^ 48);
        llllIllIIl[101] = (196 ^ 192) ^ (42 ^ 11);
        llllIllIIl[102] = 104 ^ 78;
        llllIllIIl[103] = (20 ^ 6) ^ (173 ^ 152);
        llllIllIIl[104] = (-((-1049) & 23771)) & (-1026) & 32247;
        llllIllIIl[105] = (105 ^ 47) ^ (52 ^ 91);
        llllIllIIl[106] = 77 ^ 103;
        llllIllIIl[107] = (54 ^ 108) ^ (42 ^ 91);
        llllIllIIl[108] = (((9 + 3) - (-175)) + 4) ^ (((60 + 61) - 70) + 96);
        llllIllIIl[109] = (((75 + 156) - 179) + 117) ^ (((77 + 2) - (-28)) + 25);
        llllIllIIl[110] = 172 ^ 130;
        llllIllIIl[111] = 142 ^ 161;
        llllIllIIl[112] = 44 ^ 28;
        llllIllIIl[113] = 94 ^ 111;
        llllIllIIl[114] = (((47 + 143) - 133) + 104) ^ (((134 + 116) - 171) + 70);
        llllIllIIl[115] = (-1537) & 16370;
        llllIllIIl[116] = (((11 + 102) - 109) + 125) ^ (((17 + 21) - 0) + 142);
        llllIllIIl[117] = 150 ^ 160;
        llllIllIIl[118] = (-1549) & 16383;
        llllIllIIl[119] = 127 ^ 72;
        llllIllIIl[120] = (66 ^ 94) ^ (225 ^ 197);
        llllIllIIl[121] = (-((-12873) & 13899)) & (-16394) & 32255;
        llllIllIIl[122] = (28 ^ 1) ^ (39 ^ 3);
        llllIllIIl[123] = (((156 + 127) - 249) + 123) ^ (((86 + 24) - (-30)) + 27);
        llllIllIIl[124] = 160 ^ 155;
        llllIllIIl[125] = (-24641) & 28111;
        llllIllIIl[126] = (-((-21513) & 30333)) & (-4098) & 16383;
        llllIllIIl[127] = (-8258) & 11759;
        llllIllIIl[128] = (-8257) & 11746;
        llllIllIIl[129] = (-4609) & 8103;
        llllIllIIl[130] = (-((-21841) & 22389)) & (-16385) & 20415;
        llllIllIIl[131] = (-8709) & 12205;
        llllIllIIl[132] = (-((-11154) & 31667)) & (-8197) & 32181;
        llllIllIIl[133] = (-((-18481) & 27199)) & (-81) & 12287;
        llllIllIIl[134] = (-8713) & 12187;
        llllIllIIl[135] = (-1) & 3485;
        llllIllIIl[136] = (-29265) & 32731;
        llllIllIIl[137] = (-29253) & 32758;
        llllIllIIl[138] = (-((-8579) & 9195)) & (-4097) & 8185;
        llllIllIIl[139] = (-((-2259) & 6867)) & (-8289) & 16382;
        llllIllIIl[140] = (84 ^ 22) ^ (((74 + 73) - 119) + 99);
        llllIllIIl[141] = 148 ^ 171;
        llllIllIIl[142] = (((180 + 43) - 147) + 164) ^ (((73 + 135) - 34) + 2);
        llllIllIIl[143] = 197 ^ 132;
        llllIllIIl[144] = 50 ^ 112;
        llllIllIIl[145] = (58 ^ 80) ^ (159 ^ 182);
        llllIllIIl[146] = (72 ^ 81) ^ (212 ^ 137);
        llllIllIIl[147] = 216 ^ 157;
        llllIllIIl[148] = (171 ^ 172) ^ (249 ^ 184);
        llllIllIIl[149] = 26 ^ 93;
        llllIllIIl[150] = (52 ^ 5) ^ (20 ^ 109);
        llllIllIIl[151] = (51 ^ 116) ^ (186 ^ 180);
        llllIllIIl[152] = 138 ^ 192;
        llllIllIIl[153] = (121 ^ 5) ^ (152 ^ 175);
        llllIllIIl[154] = (29 ^ 95) ^ (175 ^ 161);
        llllIllIIl[155] = 67 ^ 14;
        llllIllIIl[156] = (((119 + 89) - 193) + 121) ^ (((57 + 109) - (-25)) + 7);
        llllIllIIl[157] = 117 ^ 58;
        llllIllIIl[158] = (204 ^ 141) ^ (59 ^ 42);
        llllIllIIl[159] = 81 ^ 0;
        llllIllIIl[160] = 50 ^ 96;
        llllIllIIl[161] = (118 ^ 53) ^ (34 ^ 50);
        llllIllIIl[162] = (-((-543) & 17311)) & (-8193) & 27647;
        llllIllIIl[163] = (-((-23707) & 32411)) & (-4098) & 16255;
        llllIllIIl[164] = (-25633) & 28351;
        llllIllIIl[165] = (-17731) & 20431;
        llllIllIIl[166] = (-((-6661) & 16229)) & (-20493) & 32767;
        llllIllIIl[167] = (-((-1) & 20597)) & (-9473) & 32765;
        llllIllIIl[168] = (-((-11777) & 32627)) & (-9218) & 32755;
        llllIllIIl[169] = (-((-3457) & 19965)) & (-12289) & 32253;
        llllIllIIl[170] = (-((-6345) & 31183)) & (-1) & 27567;
        llllIllIIl[171] = (-4105) & 7592;
        llllIllIIl[172] = 74 ^ 30;
        llllIllIIl[173] = (245 ^ 144) ^ (109 ^ 93);
        llllIllIIl[174] = (122 ^ 55) ^ (97 ^ 122);
        llllIllIIl[175] = 195 ^ 148;
        llllIllIIl[176] = (108 ^ 86) ^ (0 ^ 99);
        llllIllIIl[177] = (109 ^ 51) ^ (8 ^ 12);
        llllIllIIl[178] = 243 ^ 168;
        llllIllIIl[179] = 13 ^ 81;
        llllIllIIl[180] = (((47 + 43) - (-156)) + 3) ^ (((148 + 105) - 184) + 95);
        llllIllIIl[181] = 52 ^ 107;
        llllIllIIl[182] = 27 ^ 123;
        llllIllIIl[183] = "   ".length() ^ (36 ^ 70);
        llllIllIIl[184] = (131 ^ 156) ^ (2 ^ 127);
        llllIllIIl[185] = (103 ^ 29) ^ (177 ^ 168);
        llllIllIIl[186] = 50 ^ 86;
        llllIllIIl[187] = (((5 + 202) - 64) + 108) ^ (((136 + 90) - 127) + 59);
        llllIllIIl[188] = 240 ^ 150;
        llllIllIIl[189] = (-((-26191) & 30543)) & (-24713) & 32255;
        llllIllIIl[190] = (-((-3461) & 32166)) & (-649) & 32767;
        llllIllIIl[191] = (-((-5246) & 21759)) & (-769) & 20463;
        llllIllIIl[192] = (-4677) & 8063;
        llllIllIIl[193] = (-20913) & 32761;
        llllIllIIl[194] = (90 ^ 0) ^ (254 ^ 195);
        llllIllIIl[195] = (-10755) & 16254;
        llllIllIIl[196] = (-6226) & 31225;
        llllIllIIl[197] = (-((-4901) & 30575)) & (-2049) & 28622;
        llllIllIIl[198] = (-27714) & 28663;
        llllIllIIl[199] = (-4097) & 6046;
        llllIllIIl[200] = (-21761) & 30710;
        llllIllIIl[201] = (-((-21641) & 21902)) & (-16433) & 28671;
        llllIllIIl[202] = (-((-1278) & 3327)) & (-4129) & 32127;
        llllIllIIl[203] = 171 ^ 195;
        llllIllIIl[204] = 46 ^ 71;
        llllIllIIl[205] = 49 ^ 91;
        llllIllIIl[206] = 224 ^ 139;
        llllIllIIl[207] = (((20 + 0) - (-203)) + 8) ^ (((106 + 71) - 140) + 102);
        llllIllIIl[208] = 84 ^ 57;
        llllIllIIl[209] = (-8449) & 11151;
        llllIllIIl[210] = (-((-10765) & 31327)) & (-545) & 24571;
        llllIllIIl[211] = 95 ^ 49;
        llllIllIIl[212] = (-25123) & 28591;
        llllIllIIl[213] = (7 ^ 22) ^ (225 ^ 159);
        llllIllIIl[214] = (-8457) & 11167;
        llllIllIIl[215] = (-12801) & 16276;
        llllIllIIl[216] = (123 ^ 96) ^ (59 ^ 80);
        llllIllIIl[217] = (-((-2641) & 28281)) & (-322) & 28671;
        llllIllIIl[218] = (((172 + 89) - 242) + 178) ^ (((83 + 157) - 89) + 29);
        llllIllIIl[219] = (-((-6661) & 15903)) & (-4165) & 16127;
        llllIllIIl[220] = (-21011) & 24503;
        llllIllIIl[221] = (66 ^ 40) ^ (76 ^ 84);
        llllIllIIl[222] = (-514) & 4023;
        llllIllIIl[223] = (-((-17821) & 26558)) & (-4099) & 16319;
        llllIllIIl[224] = (104 ^ 24) ^ "   ".length();
        llllIllIIl[225] = (-((-3747) & 24243)) & (-1) & 23999;
        llllIllIIl[226] = 252 ^ 136;
        llllIllIIl[227] = 217 ^ 172;
        llllIllIIl[228] = (-((-6657) & 31337)) & (-1) & 28158;
        llllIllIIl[229] = (-74) & 3565;
        llllIllIIl[230] = 66 ^ 52;
        llllIllIIl[231] = (-28677) & 32175;
        llllIllIIl[232] = (44 ^ 97) ^ (248 ^ 194);
        llllIllIIl[233] = (183 ^ 133) ^ (57 ^ 115);
        llllIllIIl[234] = (-((-18915) & 31215)) & (-65) & 15869;
        llllIllIIl[235] = (-24593) & 27060;
        llllIllIIl[236] = (-((-27545) & 28638)) & (-12289) & 15855;
        llllIllIIl[237] = (-((-2321) & 23443)) & (-17) & 24575;
        llllIllIIl[238] = 90 ^ 35;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return llllIlIlll[llllIllIIl[203]];
    }

    private static boolean llIlIIIlIIIlI(int i, int i2) {
        return i == i2;
    }

    static {
        llIlIIIIllIlI();
        llIlIIIIlIllI();
        bu = new ArrayList();
        iS = llllIllIIl[27];
        iT = llllIllIIl[23];
        iV = new WorldArea(llllIllIIl[235], llllIllIIl[52], llllIllIIl[69], llllIllIIl[72], llllIllIIl[0]);
        iW = new WorldArea(llllIllIIl[235], llllIllIIl[52], llllIllIIl[69], llllIllIIl[72], llllIllIIl[1]);
        iX = new WorldArea(llllIllIIl[235], llllIllIIl[52], llllIllIIl[69], llllIllIIl[72], llllIllIIl[2]);
        iY = new WorldPoint(llllIllIIl[236], llllIllIIl[237], llllIllIIl[0]);
    }

    private static boolean llIlIIIIllllI(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIIIllIll(int i) {
        return i != 0;
    }

    private static boolean llIlIIIlIIIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    private static boolean dx() {
        WorldArea worldArea = new WorldArea(llllIllIIl[80], llllIllIIl[81], llllIllIIl[69], llllIllIIl[64], llllIllIIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[82], llllIllIIl[81], llllIllIIl[11], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[83], llllIllIIl[84], llllIllIIl[63], llllIllIIl[49], llllIllIIl[9]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[189], llllIllIIl[190], llllIllIIl[24], llllIllIIl[18], llllIllIIl[1]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[85], llllIllIIl[87], llllIllIIl[11], llllIllIIl[24], llllIllIIl[9]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[191], llllIllIIl[192], llllIllIIl[73], llllIllIIl[38], llllIllIIl[9]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[90], llllIllIIl[91], llllIllIIl[66], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea8 = new WorldArea(llllIllIIl[92], llllIllIIl[93], llllIllIIl[22], llllIllIIl[26], llllIllIIl[9]);
        WorldArea worldArea9 = new WorldArea(llllIllIIl[92], llllIllIIl[94], llllIllIIl[11], llllIllIIl[22], llllIllIIl[9]);
        WorldArea worldArea10 = new WorldArea(llllIllIIl[127], llllIllIIl[128], llllIllIIl[49], llllIllIIl[11], llllIllIIl[2]);
        WorldArea worldArea11 = new WorldArea(llllIllIIl[129], llllIllIIl[127], llllIllIIl[49], llllIllIIl[24], llllIllIIl[2]);
        WorldArea worldArea12 = new WorldArea(llllIllIIl[130], llllIllIIl[131], llllIllIIl[63], llllIllIIl[49], llllIllIIl[2]);
        WorldArea worldArea13 = new WorldArea(llllIllIIl[132], llllIllIIl[133], llllIllIIl[11], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea14 = new WorldArea(llllIllIIl[134], llllIllIIl[8], llllIllIIl[49], llllIllIIl[26], llllIllIIl[2]);
        WorldArea worldArea15 = new WorldArea(llllIllIIl[135], llllIllIIl[136], llllIllIIl[68], llllIllIIl[53], llllIllIIl[9]);
        WorldArea worldArea16 = new WorldArea(llllIllIIl[137], llllIllIIl[138], llllIllIIl[63], llllIllIIl[64], llllIllIIl[2]);
        WorldArea worldArea17 = new WorldArea(llllIllIIl[164], llllIllIIl[133], llllIllIIl[64], llllIllIIl[11], llllIllIIl[9]);
        WorldArea worldArea18 = new WorldArea(llllIllIIl[165], llllIllIIl[139], llllIllIIl[38], llllIllIIl[53], llllIllIIl[2]);
        WorldArea worldArea19 = new WorldArea(llllIllIIl[166], llllIllIIl[134], llllIllIIl[49], llllIllIIl[26], llllIllIIl[2]);
        WorldArea worldArea20 = new WorldArea(llllIllIIl[167], llllIllIIl[136], llllIllIIl[70], llllIllIIl[64], llllIllIIl[9]);
        WorldArea worldArea21 = new WorldArea(llllIllIIl[168], llllIllIIl[169], llllIllIIl[54], llllIllIIl[63], llllIllIIl[2]);
        WorldArea[] worldAreaArr = new WorldArea[llllIllIIl[68]];
        worldAreaArr[llllIllIIl[0]] = worldArea;
        worldAreaArr[llllIllIIl[1]] = worldArea2;
        worldAreaArr[llllIllIIl[2]] = worldArea3;
        worldAreaArr[llllIllIIl[9]] = worldArea4;
        worldAreaArr[llllIllIIl[16]] = worldArea5;
        worldAreaArr[llllIllIIl[18]] = worldArea6;
        worldAreaArr[llllIllIIl[20]] = worldArea7;
        worldAreaArr[llllIllIIl[22]] = worldArea8;
        worldAreaArr[llllIllIIl[24]] = worldArea9;
        worldAreaArr[llllIllIIl[26]] = worldArea10;
        worldAreaArr[llllIllIIl[11]] = worldArea11;
        worldAreaArr[llllIllIIl[49]] = worldArea12;
        worldAreaArr[llllIllIIl[63]] = worldArea13;
        worldAreaArr[llllIllIIl[64]] = worldArea14;
        worldAreaArr[llllIllIIl[53]] = worldArea15;
        worldAreaArr[llllIllIIl[38]] = worldArea16;
        worldAreaArr[llllIllIIl[65]] = worldArea17;
        worldAreaArr[llllIllIIl[66]] = worldArea18;
        worldAreaArr[llllIllIIl[54]] = worldArea19;
        worldAreaArr[llllIllIIl[67]] = worldArea20;
        worldAreaArr[llllIllIIl[40]] = worldArea21;
        int[] iArr = new int[llllIllIIl[1]];
        iArr[llllIllIIl[0]] = llllIllIIl[193];
        if (llIlIIIIllllI(TileItems.getNearest(iArr))) {
            System.out.println(llllIlIlll[llllIllIIl[194]]);
            int i = llllIllIIl[0];
            while (llIlIIIIlllII(i, worldAreaArr.length)) {
                WorldArea worldArea22 = worldAreaArr[i];
                int[] iArr2 = new int[llllIllIIl[1]];
                iArr2[llllIllIIl[0]] = llllIllIIl[193];
                if (llIlIIIIllIll(worldArea22.contains(TileItems.getNearest(iArr2).getWorldLocation()) ? 1 : 0) && llIlIIIIllIll(worldAreaArr[i].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llllIllIIl[1];
                }
                i++;
                "".length();
                if ((191 ^ 187) < " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        return llllIllIIl[0];
    }

    private static String llIlIIIIIlIII(String lllllllllllllllllIlIlIIIlIIIlllI, String lllllllllllllllllIlIlIIIlIIIllIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllIlIlIIIlIIIllIl.toCharArray();
        int lllllllllllllllllIlIlIIIlIIIlIlI = llllIllIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllIllIIl[0];
        while (llIlIIIIlllII(i, length)) {
            char lllllllllllllllllIlIlIIIlIIIllll = charArray2[i];
            sb.append((char) (lllllllllllllllllIlIlIIIlIIIllll ^ charArray[lllllllllllllllllIlIlIIIlIIIlIlI % charArray.length]));
            "".length();
            lllllllllllllllllIlIlIIIlIIIlIlI++;
            i++;
            "".length();
            if ((-" ".length()) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlIIIlIIIII(int i) {
        return i > 0;
    }

    private static boolean llIlIIIIlllll(int i, int i2) {
        return i > i2;
    }

    private static String llIlIIIIIIlll(String lllllllllllllllllIlIlIIIIllIllII, String lllllllllllllllllIlIlIIIIllIlIll) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIIIIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIIIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIllIIl[2], lllllllllllllllllIlIlIIIIllIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlIlIIIIllIllIl) {
            lllllllllllllllllIlIlIIIIllIllIl.printStackTrace();
            return null;
        }
    }
}
