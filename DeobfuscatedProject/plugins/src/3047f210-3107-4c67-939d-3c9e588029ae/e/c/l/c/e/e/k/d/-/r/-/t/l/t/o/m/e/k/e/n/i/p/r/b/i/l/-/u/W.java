/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.b;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.d;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.f;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.i;
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

public class W
implements S {
    private static /* synthetic */ String[] llllIlIlll;
    static /* synthetic */ WorldArea iW;
    public static /* synthetic */ int iU;
    public static /* synthetic */ int iT;
    static /* synthetic */ WorldArea iX;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ WorldPoint iY;
    private static /* synthetic */ int[] llllIllIIl;
    public static /* synthetic */ List<d> bu;
    public static /* synthetic */ int iS;
    static /* synthetic */ WorldArea iV;

    private static boolean llIlIIIIlllIl(int n2) {
        return n2 == 0;
    }

    private static String llIlIIIIIIllI(String lllllllllllllllllIlIlIIIIlllIlll, String lllllllllllllllllIlIlIIIIllllIII) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIIIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIIIllllIII.getBytes(StandardCharsets.UTF_8)), llllIllIIl[24]), "DES");
            Cipher lllllllllllllllllIlIlIIIIllllIll = Cipher.getInstance("DES");
            lllllllllllllllllIlIlIIIIllllIll.init(llllIllIIl[2], lllllllllllllllllIlIlIIIIlllllII);
            return new String(lllllllllllllllllIlIlIIIIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIIIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIlIIIIllllIlI) {
            lllllllllllllllllIlIlIIIIllllIlI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return llllIllIIl[0];
    }

    public static void ae() {
        d lllllllllllllllllIlIlIIIlllIIIIl;
        block18: {
            block17: {
                block16: {
                    block15: {
                        int[] nArray = new int[llllIllIIl[1]];
                        nArray[W.llllIllIIl[0]] = llllIllIIl[15];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            d d2 = new d(llllIllIIl[15], llllIllIIl[1], llllIllIIl[195]);
                            bu.add(d2);
                            "".length();
                        }
                        int[] nArray2 = new int[llllIllIIl[1]];
                        nArray2[W.llllIllIIl[0]] = llllIllIIl[17];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            lllllllllllllllllIlIlIIIlllIIIIl = new d(llllIllIIl[17], llllIllIIl[2], llllIllIIl[196]);
                            bu.add(lllllllllllllllllIlIlIIIlllIIIIl);
                            "".length();
                        }
                        int[] nArray3 = new int[llllIllIIl[1]];
                        nArray3[W.llllIllIIl[0]] = llllIllIIl[27];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                            lllllllllllllllllIlIlIIIlllIIIIl = new d(llllIllIIl[27], llllIllIIl[2], llllIllIIl[196]);
                            bu.add(lllllllllllllllllIlIlIIIlllIIIIl);
                            "".length();
                        }
                        int[] nArray4 = new int[llllIllIIl[1]];
                        nArray4[W.llllIllIIl[0]] = llllIllIIl[12];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                            lllllllllllllllllIlIlIIIlllIIIIl = new d(llllIllIIl[12], llllIllIIl[11], llllIllIIl[197]);
                            bu.add(lllllllllllllllllIlIlIIIlllIIIIl);
                            "".length();
                        }
                        int[] nArray5 = new int[llllIllIIl[1]];
                        nArray5[W.llllIllIIl[0]] = llllIllIIl[21];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                            lllllllllllllllllIlIlIIIlllIIIIl = new d(llllIllIIl[21], llllIllIIl[11], llllIllIIl[198]);
                            bu.add(lllllllllllllllllIlIlIIIlllIIIIl);
                            "".length();
                        }
                        int[] nArray6 = new int[llllIllIIl[1]];
                        nArray6[W.llllIllIIl[0]] = llllIllIIl[14];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lllllllllllllllllIlIlIIIlllIIIIl = new d(llllIllIIl[14], llllIllIIl[11], llllIllIIl[198]);
                            bu.add(lllllllllllllllllIlIlIIIlllIIIIl);
                            "".length();
                        }
                        int[] nArray7 = new int[llllIllIIl[1]];
                        nArray7[W.llllIllIIl[0]] = llllIllIIl[13];
                        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lllllllllllllllllIlIlIIIlllIIIIl = new d(llllIllIIl[13], llllIllIIl[11], llllIllIIl[198]);
                            bu.add(lllllllllllllllllIlIlIIIlllIIIIl);
                            "".length();
                        }
                        int[] nArray8 = new int[llllIllIIl[1]];
                        nArray8[W.llllIllIIl[0]] = llllIllIIl[23];
                        if (!W.llIlIIIIllIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block15;
                        int[] nArray9 = new int[llllIllIIl[1]];
                        nArray9[W.llllIllIIl[0]] = llllIllIIl[23];
                        if (!W.llIlIIIIllIll(Bank.contains((int[])nArray9) ? 1 : 0)) break block16;
                        int[] nArray10 = new int[llllIllIIl[1]];
                        nArray10[W.llllIllIIl[0]] = llllIllIIl[23];
                        if (!W.llIlIIIIlllII(Bank.getFirst((int[])nArray10).getQuantity(), llllIllIIl[11])) break block16;
                    }
                    lllllllllllllllllIlIlIIIlllIIIIl = new d(iT, llllIllIIl[44], llllIllIIl[199]);
                    bu.add(lllllllllllllllllIlIlIIIlllIIIIl);
                    "".length();
                }
                int[] nArray = new int[llllIllIIl[1]];
                nArray[W.llllIllIIl[0]] = llllIllIIl[25];
                if (!W.llIlIIIIllIll(Bank.contains((int[])nArray) ? 1 : 0)) break block17;
                int[] nArray11 = new int[llllIllIIl[1]];
                nArray11[W.llllIllIIl[0]] = llllIllIIl[25];
                if (!W.llIlIIIIllIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block18;
                int[] nArray12 = new int[llllIllIIl[1]];
                nArray12[W.llllIllIIl[0]] = llllIllIIl[25];
                if (!W.llIlIIIIlllII(Bank.getFirst((int[])nArray12).getQuantity(), llllIllIIl[11])) break block18;
            }
            lllllllllllllllllIlIlIIIlllIIIIl = new d(llllIllIIl[25], llllIllIIl[11], llllIllIIl[200]);
            bu.add(lllllllllllllllllIlIlIIIlllIIIIl);
            "".length();
        }
        int[] nArray = new int[llllIllIIl[1]];
        nArray[W.llllIllIIl[0]] = llllIllIIl[201];
        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllllIlIlIIIlllIIIIl = new d(llllIllIIl[201], llllIllIIl[1], llllIllIIl[202]);
            bu.add(lllllllllllllllllIlIlIIIlllIIIIl);
            "".length();
        }
        int[] nArray13 = new int[llllIllIIl[1]];
        nArray13[W.llllIllIIl[0]] = llllIllIIl[19];
        if (W.llIlIIIIlllIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
            lllllllllllllllllIlIlIIIlllIIIIl = new d(llllIllIIl[19], llllIllIIl[40], i.bp);
            bu.add(lllllllllllllllllIlIlIIIlllIIIIl);
            "".length();
        }
    }

    @Override
    public int T() {
        try {
            W.ds();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ("   ".length() <= ((0x30 ^ 0x11 ^ (0x94 ^ 0x9A)) & (5 ^ 0x34 ^ (0x34 ^ 0x2A) ^ -" ".length()))) {
            return (" ".length() ^ (0xBA ^ 0x8D)) & (4 + 30 - -122 + 13 ^ 130 + 60 - 168 + 137 ^ -" ".length());
        }
        return llllIllIIl[186];
    }

    @Override
    public boolean V() {
        boolean bl;
        if (W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[185])) {
            bl = llllIllIIl[1];
            "".length();
            if (-" ".length() >= ((103 + 88 - 124 + 100 ^ 11 + 99 - -12 + 8) & (0x6D ^ 9 ^ (2 ^ 0x43) ^ -" ".length()))) {
                return ((0x3B ^ 0x55 ^ (0xC8 ^ 0xA9)) & (123 + 74 - 77 + 23 ^ 55 + 43 - -22 + 8 ^ -" ".length())) != 0;
            }
        } else {
            bl = llllIllIIl[0];
        }
        return bl;
    }

    private static boolean llIlIIIIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIIIIlIllI() {
        llllIlIlll = new String[llllIllIIl[238]];
        W.llllIlIlll[W.llllIllIIl[0]] = W.llIlIIIIIIllI("hFpeNG5FIw3gmTEIzOE5rg==", "KVnlL");
        W.llllIlIlll[W.llllIllIIl[1]] = W.llIlIIIIIIlll("ZGgwxPchtqEfXtL75YNqDwb/hmdbrn45X9qvbyMzsf7NdEoTCZo2Nn7VxBl7Ed5q1X/6vXxCcZo=", "yYAFE");
        W.llllIlIlll[W.llllIllIIl[2]] = W.llIlIIIIIIlll("ydcQZftrcO6tjSPNlGtKL80vxZOJAAkm", "hoyBX");
        W.llllIlIlll[W.llllIllIIl[9]] = W.llIlIIIIIlIII("JjY7FCQHOTJQKg85PhkmCQ==", "nWUpH");
        W.llllIlIlll[W.llllIllIIl[16]] = W.llIlIIIIIIllI("HRZuAb9xqelVuoJ5zn0CuxWDHJScZeEKgkf1CSl6cw6CCbGCYwp/3QXbPHmWB7N3J3iG8eOQiUA=", "PuIhW");
        W.llllIlIlll[W.llllIllIIl[18]] = W.llIlIIIIIIlll("s1swHPoe6AI=", "NPSzj");
        W.llllIlIlll[W.llllIllIIl[20]] = W.llIlIIIIIIlll("F0mU/NjXH68=", "urUoV");
        W.llllIlIlll[W.llllIllIIl[22]] = W.llIlIIIIIIllI("f3go7uQqAok=", "nEtVt");
        W.llllIlIlll[W.llllIllIIl[24]] = W.llIlIIIIIIllI("B8eudZpBJVU=", "qdVsE");
        W.llllIlIlll[W.llllIllIIl[26]] = W.llIlIIIIIIllI("tqbrjYa06wk=", "iYubh");
        W.llllIlIlll[W.llllIllIIl[11]] = W.llIlIIIIIIlll("I6UwG60MMMiKBRHRV9q8LQpVmdAb5eYp", "LAZEY");
        W.llllIlIlll[W.llllIllIIl[49]] = W.llIlIIIIIIllI("c7uzflxDUcNoR0LnuW2YmA==", "cmcdS");
        W.llllIlIlll[W.llllIllIIl[63]] = W.llIlIIIIIlIII("AD8qbiktPCwgKCk=", "LPMNK");
        W.llllIlIlll[W.llllIllIIl[64]] = W.llIlIIIIIIllI("Pw176LQOgnQrAfYUeY7eLw==", "gEKzG");
        W.llllIlIlll[W.llllIllIIl[53]] = W.llIlIIIIIlIII("ACcrKDQqJSVlOCY/", "CKBEV");
        W.llllIlIlll[W.llllIllIIl[38]] = W.llIlIIIIIIlll("a1Wg6xaiX/DT7bF7FMBpJA==", "FNmoA");
        W.llllIlIlll[W.llllIllIIl[65]] = W.llIlIIIIIlIII("CDY9GghmNSISGA==", "KZTwj");
        W.llllIlIlll[W.llllIllIIl[66]] = W.llIlIIIIIIlll("qWoyJB7gJNghNsxTSiRRgA==", "ZpxVI");
        W.llllIlIlll[W.llllIllIIl[54]] = W.llIlIIIIIIllI("bCl9ZNucjrTF7lcLElCh8A==", "aBibT");
        W.llllIlIlll[W.llllIllIIl[67]] = W.llIlIIIIIIlll("SHr7oHn+axE=", "TYFnQ");
        W.llllIlIlll[W.llllIllIIl[40]] = W.llIlIIIIIIllI("5N0Wciq4SlQ7yTZVToipQw==", "lgtNB");
        W.llllIlIlll[W.llllIllIIl[68]] = W.llIlIIIIIIlll("r9zMxDkKCYkEvjJ75OcRzA==", "hcnKY");
        W.llllIlIlll[W.llllIllIIl[61]] = W.llIlIIIIIlIII("FjkpKkAuNg==", "AXEAm");
        W.llllIlIlll[W.llllIllIIl[69]] = W.llIlIIIIIIllI("zLwEBR973sS1gVK5VUB/bQ==", "CWVIZ");
        W.llllIlIlll[W.llllIllIIl[70]] = W.llIlIIIIIIlll("a/KoSmN38iNI7Icg/4EivA==", "XXCnC");
        W.llllIlIlll[W.llllIllIIl[41]] = W.llIlIIIIIIllI("g+CR4HveM1aZlUnl39wG7w==", "YlsSz");
        W.llllIlIlll[W.llllIllIIl[71]] = W.llIlIIIIIIlll("/yHqqZBW2vkKsy555Nx2ng==", "uvaMA");
        W.llllIlIlll[W.llllIllIIl[72]] = W.llIlIIIIIIlll("rjajYjDOG2I9K9InXefK9w==", "wmsjP");
        W.llllIlIlll[W.llllIllIIl[73]] = W.llIlIIIIIIllI("b5h3VRk8HZYlxGztbsb1kA==", "WpAwj");
        W.llllIlIlll[W.llllIllIIl[74]] = W.llIlIIIIIIlll("y52nqTCTg2FeWnoAJcPEfw==", "Prvtx");
        W.llllIlIlll[W.llllIllIIl[42]] = W.llIlIIIIIIlll("vjUaNu7s1eccFXKYb3D/Fg==", "XwtDu");
        W.llllIlIlll[W.llllIllIIl[75]] = W.llIlIIIIIIlll("DoecHNkqH3DZpSAVvBzKgw==", "ZsOlh");
        W.llllIlIlll[W.llllIllIIl[95]] = W.llIlIIIIIlIII("FzUbQTo2dB4VLysg", "YTmaN");
        W.llllIlIlll[W.llllIllIIl[97]] = W.llIlIIIIIIlll("xxOMbhDhpMq1M+AbEx6jAw==", "xNchd");
        W.llllIlIlll[W.llllIllIIl[98]] = W.llIlIIIIIIlll("T9tcep4ACavVcxJo1524tw==", "QjeMM");
        W.llllIlIlll[W.llllIllIIl[99]] = W.llIlIIIIIIllI("t/EOCAG4PmRSDz6BWECG8ofKf+r9LSVO", "GNcKx");
        W.llllIlIlll[W.llllIllIIl[100]] = W.llIlIIIIIlIII("Ai8jHA==", "VNHyB");
        W.llllIlIlll[W.llllIllIIl[101]] = W.llIlIIIIIIllI("wCDSdN3/zeRTV91hKxq/lA==", "DFWLM");
        W.llllIlIlll[W.llllIllIIl[102]] = W.llIlIIIIIIlll("ZP0VBUFDrg7RqMNrSrb68w==", "yTyfi");
        W.llllIlIlll[W.llllIllIIl[103]] = W.llIlIIIIIlIII("NwICOw0=", "tnkVo");
        W.llllIlIlll[W.llllIllIIl[37]] = W.llIlIIIIIIllI("WouATg/9qhBLZv8TILMyq19vwTdHA2N/", "wQCNm");
        W.llllIlIlll[W.llllIllIIl[105]] = W.llIlIIIIIlIII("NjUrED0QKmQIPBs8", "uYDdU");
        W.llllIlIlll[W.llllIllIIl[106]] = W.llIlIIIIIlIII("GhcaJhA=", "YeuUc");
        W.llllIlIlll[W.llllIllIIl[107]] = W.llIlIIIIIIlll("WhX+4gC+3w8=", "vNiXO");
        W.llllIlIlll[W.llllIllIIl[108]] = W.llIlIIIIIlIII("Nzkn", "pXWrt");
        W.llllIlIlll[W.llllIllIIl[109]] = W.llIlIIIIIIlll("RSssOfOd6uk=", "QrVgh");
        W.llllIlIlll[W.llllIllIIl[110]] = W.llIlIIIIIIlll("Y2k2/1TahfgeLraFM+nAGA==", "AiZxu");
        W.llllIlIlll[W.llllIllIIl[111]] = W.llIlIIIIIlIII("PwAkLQ==", "haHAJ");
        W.llllIlIlll[W.llllIllIIl[112]] = W.llIlIIIIIIllI("1XMX+Mbioi8=", "LQMic");
        W.llllIlIlll[W.llllIllIIl[113]] = W.llIlIIIIIIllI("UbmTWKTfmMJe2m58LXGgYg==", "Leyvi");
        W.llllIlIlll[W.llllIllIIl[39]] = W.llIlIIIIIIllI("e14JPBVKFtU=", "NCrSP");
        W.llllIlIlll[W.llllIllIIl[6]] = W.llIlIIIIIIllI("rfEppWldfTQ=", "EjPYl");
        W.llllIlIlll[W.llllIllIIl[114]] = W.llIlIIIIIlIII("Ag8AAx8mHU0UFzhaXw==", "Hzmsv");
        W.llllIlIlll[W.llllIllIIl[116]] = W.llIlIIIIIIlll("JSkuxNthC3c=", "NXttq");
        W.llllIlIlll[W.llllIllIIl[117]] = W.llIlIIIIIlIII("HzMbMyE7IVYkKSVmRQ==", "UFvCH");
        W.llllIlIlll[W.llllIllIIl[119]] = W.llIlIIIIIIllI("coLxxgaCYO8=", "Xuxpg");
        W.llllIlIlll[W.llllIllIIl[120]] = W.llIlIIIIIlIII("JD4qLSUJayomJgo=", "lKXII");
        W.llllIlIlll[W.llllIllIIl[122]] = W.llIlIIIIIlIII("LQAjNy8A", "euQSC");
        W.llllIlIlll[W.llllIllIIl[123]] = W.llIlIIIIIlIII("Mh0gDCccHSACdBcbOxcnEQ==", "ttNeT");
        W.llllIlIlll[W.llllIllIIl[124]] = W.llIlIIIIIlIII("KwEGKg==", "neaOL");
        W.llllIlIlll[W.llllIllIIl[44]] = W.llIlIIIIIIllI("7x3y0mr9/ixUiZhomBczxg==", "LzgfS");
        W.llllIlIlll[W.llllIllIIl[140]] = W.llIlIIIIIlIII("LCwyVB4NbScVBAMrLQdKASIxBhkH", "bMDtj");
        W.llllIlIlll[W.llllIllIIl[5]] = W.llIlIIIIIIllI("BROLvmGgzZVA7gnNvpN8jw==", "pVOSY");
        W.llllIlIlll[W.llllIllIIl[141]] = W.llIlIIIIIlIII("IgEmFCIYGyBGNR4ANRUz", "quGfV");
        W.llllIlIlll[W.llllIllIIl[142]] = W.llIlIIIIIIllI("vKBoWLfDuPpYBT7FPn4KZg==", "paHpW");
        W.llllIlIlll[W.llllIllIIl[143]] = W.llIlIIIIIIllI("cIcAffhLNDU=", "jeXSF");
        W.llllIlIlll[W.llllIllIIl[144]] = W.llIlIIIIIIlll("29pO516jqjv7n46v/h+VTg==", "aqiDX");
        W.llllIlIlll[W.llllIllIIl[145]] = W.llIlIIIIIlIII("BhgdPgA1WRs2HDk=", "RyvWn");
        W.llllIlIlll[W.llllIllIIl[146]] = W.llIlIIIIIlIII("CxkENAdtGxAoCG0ZH3oEPxkENAc=", "MvqZc");
        W.llllIlIlll[W.llllIllIIl[147]] = W.llIlIIIIIIllI("xdLQsSy43R0=", "cSLjw");
        W.llllIlIlll[W.llllIllIIl[148]] = W.llIlIIIIIlIII("Dzk1GAMrK3gPCzVsaQ==", "ELXhj");
        W.llllIlIlll[W.llllIllIIl[149]] = W.llIlIIIIIIlll("mWceO3YtOdA=", "ojCRn");
        W.llllIlIlll[W.llllIllIIl[150]] = W.llIlIIIIIIlll("JcE0T/PojgStmNvEMrCJgQ==", "vKWvz");
        W.llllIlIlll[W.llllIllIIl[151]] = W.llIlIIIIIlIII("BhMlKg==", "LfHZr");
        W.llllIlIlll[W.llllIllIIl[152]] = W.llIlIIIIIIlll("ILUnYcn1axNeS/4HNH7U4Q==", "GfELK");
        W.llllIlIlll[W.llllIllIIl[153]] = W.llIlIIIIIIlll("4dFz6pUnL9Y=", "nMnje");
        W.llllIlIlll[W.llllIllIIl[154]] = W.llIlIIIIIIlll("0tIoSpTivmudyfM832O8Sg==", "EyaTH");
        W.llllIlIlll[W.llllIllIIl[155]] = W.llIlIIIIIIlll("P/b8UpqFvwU=", "rUWeG");
        W.llllIlIlll[W.llllIllIIl[156]] = W.llIlIIIIIIllI("eCzQyjri1dhwheTPYR2a6A==", "tVpqo");
        W.llllIlIlll[W.llllIllIIl[157]] = W.llIlIIIIIIlll("2cHhIrsTOMM=", "xhozB");
        W.llllIlIlll[W.llllIllIIl[158]] = W.llIlIIIIIlIII("IjwePBoGLlMrEhhpRg==", "hIsLs");
        W.llllIlIlll[W.llllIllIIl[159]] = W.llIlIIIIIIlll("MpnN57/RFpI=", "Ivjae");
        W.llllIlIlll[W.llllIllIIl[160]] = W.llIlIIIIIIllI("sk5pST0r31IrqTBXyaiL0A==", "PkAjw");
        W.llllIlIlll[W.llllIllIIl[161]] = W.llIlIIIIIIllI("7HOAre7ZeN8=", "pLmYt");
        W.llllIlIlll[W.llllIllIIl[172]] = W.llIlIIIIIlIII("CCsOShUpahsLDycsERlBJSUNGBIj", "FJxja");
        W.llllIlIlll[W.llllIllIIl[173]] = W.llIlIIIIIIlll("RW1+bgR0kuiJb6I4vdhjZg==", "QbNix");
        W.llllIlIlll[W.llllIllIIl[174]] = W.llIlIIIIIlIII("GxcRBjwhDRdUKycWAgct", "HcptH");
        W.llllIlIlll[W.llllIllIIl[175]] = W.llIlIIIIIIllI("a9cE/OecQok=", "ixyrM");
        W.llllIlIlll[W.llllIllIIl[35]] = W.llIlIIIIIIlll("NDFcRhoAXqN31gS0xsqP8g==", "ogpvR");
        W.llllIlIlll[W.llllIllIIl[176]] = W.llIlIIIIIIllI("KweRNplEiwapyriYnYAn4g==", "xxxMF");
        W.llllIlIlll[W.llllIllIIl[177]] = W.llIlIIIIIIlll("dhrHePODRw2VgHoztPlEFA==", "LAanx");
        W.llllIlIlll[W.llllIllIIl[178]] = W.llIlIIIIIIlll("hyShdyqKq+7bgTn2ueD/O3CDLbaW7Z4M", "UTgej");
        W.llllIlIlll[W.llllIllIIl[179]] = W.llIlIIIIIIllI("go1VTxaGJ8c=", "jiFDB");
        W.llllIlIlll[W.llllIllIIl[180]] = W.llIlIIIIIIlll("XSCQxkCffyI2hlKhUILyPg==", "scbTZ");
        W.llllIlIlll[W.llllIllIIl[79]] = W.llIlIIIIIIlll("7Ovlz79cro4=", "dOMSS");
        W.llllIlIlll[W.llllIllIIl[181]] = W.llIlIIIIIlIII("FxAWMSpUEBYyPA==", "tbyBY");
        W.llllIlIlll[W.llllIllIIl[182]] = W.llIlIIIIIIlll("PF5e3hGXMSc=", "MlPBd");
        W.llllIlIlll[W.llllIllIIl[183]] = W.llIlIIIIIIllI("QSB3HrxWckyLLqLLqqiM5g==", "RpwbF");
        W.llllIlIlll[W.llllIllIIl[184]] = W.llIlIIIIIIllI("dYtJZFzWjmI=", "SbxDQ");
        W.llllIlIlll[W.llllIllIIl[185]] = W.llIlIIIIIIllI("1aaeebEaxm22utuya6m2aw==", "KBSHQ");
        W.llllIlIlll[W.llllIllIIl[186]] = W.llIlIIIIIIlll("OcdU5OVD9uc=", "SJkmh");
        W.llllIlIlll[W.llllIllIIl[187]] = W.llIlIIIIIIlll("Qva9Ej9P2GzSh5T4mZ05pg==", "cyjEM");
        W.llllIlIlll[W.llllIllIIl[188]] = W.llIlIIIIIIlll("0fKdeswN5Ig=", "AtKiR");
        W.llllIlIlll[W.llllIllIIl[194]] = W.llIlIIIIIlIII("EQwjByl3DjcbJncMOEkqJQwjByk=", "WcViM");
        W.llllIlIlll[W.llllIllIIl[203]] = W.llIlIIIIIIllI("XW4H4MQjgqE=", "usmdK");
        W.llllIlIlll[W.llllIllIIl[204]] = W.llIlIIIIIlIII("JQY4ODIyAg==", "UgKKS");
        W.llllIlIlll[W.llllIllIIl[205]] = W.llIlIIIIIlIII("FhcDNxQBEw==", "fvpDu");
        W.llllIlIlll[W.llllIllIIl[206]] = W.llIlIIIIIIllI("b5bWf2DPLwk=", "zrFgO");
        W.llllIlIlll[W.llllIllIIl[207]] = W.llIlIIIIIIllI("jouAhXiaFJ0=", "iFBYS");
        W.llllIlIlll[W.llllIllIIl[208]] = W.llIlIIIIIIllI("eXHrzDCeI9o=", "bUEFw");
        W.llllIlIlll[W.llllIllIIl[211]] = W.llIlIIIIIIlll("zze/nLsAG7E=", "qvZdL");
        W.llllIlIlll[W.llllIllIIl[213]] = W.llIlIIIIIIllI("ss3df65m57E=", "Uqmlm");
        W.llllIlIlll[W.llllIllIIl[216]] = W.llIlIIIIIlIII("MhwqHAQUGj0R", "fuMtp");
        W.llllIlIlll[W.llllIllIIl[218]] = W.llIlIIIIIIllI("jKXjTY+PHfE=", "pKxji");
        W.llllIlIlll[W.llllIllIIl[221]] = W.llIlIIIIIlIII("LDgF", "kYuIu");
        W.llllIlIlll[W.llllIllIIl[224]] = W.llIlIIIIIIlll("Uoz8MYd69Lc=", "idZCA");
        W.llllIlIlll[W.llllIllIIl[226]] = W.llIlIIIIIIlll("iOMSLoaQ3ilQHiIa1x1SQQ==", "izeKL");
        W.llllIlIlll[W.llllIllIIl[227]] = W.llIlIIIIIIllI("SoNNDc51hDM=", "PYaXj");
        W.llllIlIlll[W.llllIllIIl[230]] = W.llIlIIIIIIllI("/9NjTJ7fUDA=", "zroPo");
        W.llllIlIlll[W.llllIllIIl[232]] = W.llIlIIIIIIllI("wak5pYSP0ZE=", "ubFsB");
        W.llllIlIlll[W.llllIllIIl[233]] = W.llIlIIIIIIllI("fVYXcFCIT0k=", "wPYSs");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean aa() {
        int n2;
        if (W.llIlIIIlIIIIl(Skills.getBoostedLevel((Skill)Skill.AGILITY), llllIllIIl[37])) {
            int n3;
            int[] nArray = new int[llllIllIIl[1]];
            nArray[W.llllIllIIl[0]] = llllIllIIl[12];
            if (W.llIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllIllIIl[1]];
                nArray2[W.llllIllIIl[0]] = llllIllIIl[25];
                if (W.llIlIIIIllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llllIllIIl[1]];
                    nArray3[W.llllIllIIl[0]] = llllIllIIl[23];
                    if (!(!W.llIlIIIIllIll(Inventory.contains((int[])nArray3) ? 1 : 0) || W.llIlIIIIlllIl(Inventory.contains(item -> item.getName().contains(llllIlIlll[llllIllIIl[207]])) ? 1 : 0) && !W.llIlIIIIllIll(Equipment.contains(item -> item.getName().contains(llllIlIlll[llllIllIIl[206]])) ? 1 : 0) || W.llIlIIIIlllIl(Inventory.contains((int[])f.be) ? 1 : 0) && !W.llIlIIIIllIll(Equipment.contains((int[])f.be) ? 1 : 0))) {
                        n3 = llllIllIIl[1];
                        "".length();
                        if (null == null) return n3 != 0;
                        return ((0xA7 ^ 0xB1) & ~(0x8D ^ 0x9B)) != 0;
                    }
                }
            }
            n3 = llllIllIIl[0];
            return n3 != 0;
        }
        int[] nArray = new int[llllIllIIl[1]];
        nArray[W.llllIllIIl[0]] = llllIllIIl[12];
        if (W.llIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray4 = new int[llllIllIIl[1]];
            nArray4[W.llllIllIIl[0]] = llllIllIIl[14];
            if (W.llIlIIIIllIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[llllIllIIl[1]];
                nArray5[W.llllIllIIl[0]] = llllIllIIl[13];
                if (!(!W.llIlIIIIllIll(Inventory.contains((int[])nArray5) ? 1 : 0) || W.llIlIIIIlllIl(Inventory.contains(item -> item.getName().contains(llllIlIlll[llllIllIIl[205]])) ? 1 : 0) && !W.llIlIIIIllIll(Equipment.contains(item -> item.getName().contains(llllIlIlll[llllIllIIl[204]])) ? 1 : 0) || W.llIlIIIIlllIl(Inventory.contains((int[])f.be) ? 1 : 0) && !W.llIlIIIIllIll(Equipment.contains((int[])f.be) ? 1 : 0))) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if ("   ".length() > " ".length()) return n2 != 0;
                    return ((0x1E ^ 0x12) & ~(0x8F ^ 0x83)) != 0;
                }
            }
        }
        n2 = llllIllIIl[0];
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void dw() {
        void lllllllllllllllllIlIlIIlIIIlIlII;
        void lllllllllllllllllIlIlIIlIIIllIlI;
        void lllllllllllllllllIlIlIIlIIIllIll;
        void lllllllllllllllllIlIlIIlIIIlllII;
        void lllllllllllllllllIlIlIIlIIIlllIl;
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
        if (W.llIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (W.llIlIIIIlllIl(lllllllllllllllllIlIlIIlIIIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(lllllllllllllllllIlIlIIlIIIlllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(lllllllllllllllllIlIlIIlIIIllIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(lllllllllllllllllIlIlIIlIIIllIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[172]];
            Movement.walkTo((WorldPoint)lllllllllllllllllIlIlIIlIIIlIlII);
            "".length();
            Time.sleepTicks((int)llllIllIIl[1]);
            "".length();
        }
        if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIIlllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (W.llIlIIIIlllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIlIIlIIIlIlII), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[173]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIlIlIIlIIIlIlII);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIlIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIlIIlIIIlIlII), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[174]];
                int lllllllllllllllllIlIlIIlIIIlIIll = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[175]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[35]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIIlIIll)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if (null != null) {
                            return ((0x78 ^ 0x52) & ~(0xBC ^ 0x96)) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
        }
        String[] stringArray = new String[llllIllIIl[1]];
        stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[176]];
        TileItem lllllllllllllllllIlIlIIlIIIlIIll = TileItems.getNearest((String[])stringArray);
        if (W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIIlIIll) && W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[177]];
            System.out.println(llllIlIlll[llllIllIIl[178]]);
            lllllllllllllllllIlIlIIlIIIlIIll.interact(llllIlIlll[llllIllIIl[179]]);
            Time.sleepTicks((int)llllIllIIl[9]);
            "".length();
        }
        if (W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
            void lllllllllllllllllIlIlIIlIIIlIlIl;
            void lllllllllllllllllIlIlIIlIIIlIllI;
            void lllllllllllllllllIlIlIIlIIIlIlll;
            void lllllllllllllllllIlIlIIlIIIllIII;
            int lllllllllllllllllIlIlIIlIIIlIIIl;
            TileObject lllllllllllllllllIlIlIIlIIIlIIlI;
            void lllllllllllllllllIlIlIIlIIIllIIl;
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[218]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[219], llllIllIIl[220], llllIllIIl[9])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if (null != null) {
                        return ((0xDE ^ 0x8F) & ~(0xF4 ^ 0xA5)) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                lllllllllllllllllIlIlIIlIIIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[180]];
                lllllllllllllllllIlIlIIlIIIlIIlI.interact(llllIlIlll[llllIllIIl[79]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIIlIIIl)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if ("  ".length() <= 0) {
                            return ((81 + 48 - -21 + 1 ^ 68 + 8 - 74 + 128) & (75 + 163 - 196 + 131 ^ 96 + 138 - 110 + 60 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIIllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[216]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[217], llllIllIIl[128], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if (" ".length() == 0) {
                        return ((0x5B ^ 0x13 ^ (0x22 ^ 0x36)) & (0x3B ^ 0x68 ^ (0x74 ^ 0x7B) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[181]];
                lllllllllllllllllIlIlIIlIIIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIIlIIIlIIlI.interact(llllIlIlll[llllIllIIl[182]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIIlIIIl)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if (" ".length() < 0) {
                            return ((0x2E ^ 0x3B) & ~(0x40 ^ 0x55)) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIIlIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[213]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[214], llllIllIIl[215], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if (" ".length() < -" ".length()) {
                        return (("   ".length() ^ (0x51 ^ 0x17)) & (0x21 ^ 0x4A ^ (0x41 ^ 0x6F) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[183]];
                lllllllllllllllllIlIlIIlIIIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIIlIIIlIIlI.interact(llllIlIlll[llllIllIIl[184]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIIlIIIl)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if ((0x11 ^ 0x14) == 0) {
                            return ("   ".length() & ~"   ".length()) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[211]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[209], llllIllIIl[212], llllIllIIl[9])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if (" ".length() < 0) {
                        return ((0xD7 ^ 0xAC ^ (0x7F ^ 0x4C)) & (0x2A ^ 0x45 ^ (0x85 ^ 0xA2) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[185]];
                lllllllllllllllllIlIlIIlIIIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIIlIIIlIIlI.interact(llllIlIlll[llllIllIIl[186]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIIlIIIl)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if (" ".length() <= -" ".length()) {
                            return ((0x47 ^ 0x42 ^ (0x7E ^ 0x60)) & (0xAC ^ 0x9E ^ (0xB3 ^ 0x9A) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIIlIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIIlIIlI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[208]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[209], llllIllIIl[210], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if (null != null) {
                        return ((4 + 21 - -97 + 100 ^ 173 + 8 - 89 + 100) & (0x6C ^ 0x7F ^ (0x67 ^ 0x6A) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[187]];
                lllllllllllllllllIlIlIIlIIIlIIIl = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIIlIIIlIIlI.interact(llllIlIlll[llllIllIIl[188]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIIlIIIl)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if (((0x97 ^ 0xBA ^ (0x4D ^ 0x38)) & (0xD7 ^ 0x82 ^ (0xBD ^ 0xB0) ^ -" ".length())) != 0) {
                            return ((170 + 178 - 243 + 79 ^ 37 + 64 - 95 + 129) & (0x67 ^ 0x55 ^ (0x78 ^ 0x75) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dt() {
        WorldArea worldArea = new WorldArea(llllIllIIl[46], llllIllIIl[47], llllIllIIl[11], llllIllIIl[20], llllIllIIl[0]);
        WorldArea worldArea2 = new WorldArea(llllIllIIl[46], llllIllIIl[48], llllIllIIl[49], llllIllIIl[24], llllIllIIl[0]);
        WorldArea worldArea3 = new WorldArea(llllIllIIl[46], llllIllIIl[50], llllIllIIl[49], llllIllIIl[24], llllIllIIl[1]);
        WorldArea worldArea4 = new WorldArea(llllIllIIl[51], llllIllIIl[52], llllIllIIl[53], llllIllIIl[54], llllIllIIl[2]);
        WorldArea worldArea5 = new WorldArea(llllIllIIl[55], llllIllIIl[56], llllIllIIl[24], llllIllIIl[11], llllIllIIl[2]);
        WorldArea worldArea6 = new WorldArea(llllIllIIl[57], llllIllIIl[58], llllIllIIl[49], llllIllIIl[11], llllIllIIl[0]);
        WorldArea worldArea7 = new WorldArea(llllIllIIl[59], llllIllIIl[60], llllIllIIl[11], llllIllIIl[20], llllIllIIl[0]);
        WorldArea worldArea8 = new WorldArea(llllIllIIl[46], llllIllIIl[47], llllIllIIl[61], llllIllIIl[20], llllIllIIl[0]);
        if (W.llIlIIIIlllIl(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[11]];
            e.a(iY);
            Time.sleepTicks((int)llllIllIIl[1]);
            "".length();
        }
        if ((!W.llIlIIIIlllIl(iV.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !W.llIlIIIIlllIl(iW.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || W.llIlIIIIllIll(iX.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) && W.llIlIIIlIIIlI(Players.getLocal().getAnimation(), llllIllIIl[62]) && W.llIlIIIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            void lllllllllllllllllIlIlIIlIllIIllI;
            void lllllllllllllllllIlIlIIlIllIIlll;
            void lllllllllllllllllIlIlIIlIllIlIII;
            void lllllllllllllllllIlIlIIlIllIlIIl;
            void lllllllllllllllllIlIlIIlIllIlIlI;
            void lllllllllllllllllIlIlIIlIllIlIll;
            void lllllllllllllllllIlIlIIlIllIIlIl;
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIllIIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[49]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[63]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[64]]);
                Time.sleepTicks((int)llllIllIIl[2]);
                "".length();
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[53]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[38]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[65]]);
                Time.sleepTicks((int)llllIllIIl[2]);
                "".length();
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIllIlIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[66]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[54]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[67]]);
                Time.sleepTicks((int)llllIllIIl[2]);
                "".length();
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIllIlIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[40]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[68]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[61]]);
                Time.sleepTicks((int)llllIllIIl[18]);
                "".length();
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIllIlIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[69]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[70]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[41]]);
                Time.sleepTicks((int)llllIllIIl[16]);
                "".length();
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIllIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[71]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[72]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[73]]);
                Time.sleepTicks((int)llllIllIIl[9]);
                "".length();
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIllIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[74]];
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[42]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[75]]);
                Time.sleepTicks((int)llllIllIIl[16]);
                "".length();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void dv() {
        void lllllllllllllllllIlIlIIlIIlIlllI;
        void lllllllllllllllllIlIlIIlIIllIllI;
        void lllllllllllllllllIlIlIIlIIllIlll;
        void lllllllllllllllllIlIlIIlIIlllIII;
        void lllllllllllllllllIlIlIIlIIlllIIl;
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
        if (W.llIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (W.llIlIIIIlllIl(lllllllllllllllllIlIlIIlIIlllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(lllllllllllllllllIlIlIIlIIlllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(lllllllllllllllllIlIlIIlIIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(lllllllllllllllllIlIlIIlIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[140]];
            Movement.walkTo((WorldPoint)lllllllllllllllllIlIlIIlIIlIlllI);
            "".length();
            Time.sleepTicks((int)llllIllIIl[1]);
            "".length();
        }
        if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIlllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (W.llIlIIIIlllll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIlIIlIIlIlllI), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[5]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIlIlIIlIIlIlllI);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIlIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIlIlIIlIIlIlllI), llllIllIIl[20])) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[141]];
                int lllllllllllllllllIlIlIIlIIlIllIl = Skills.getExperience((Skill)Skill.AGILITY);
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[142]];
                TileObjects.getNearest((String[])stringArray).interact(llllIlIlll[llllIllIIl[143]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIlIllIl)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return ((0x48 ^ 0xE) & ~(0xE0 ^ 0xA6)) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
        }
        String[] stringArray = new String[llllIllIIl[1]];
        stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[144]];
        TileItem lllllllllllllllllIlIlIIlIIlIllIl = TileItems.getNearest((String[])stringArray);
        if (W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIlIllIl) && W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[145]];
            System.out.println(llllIlIlll[llllIllIIl[146]]);
            lllllllllllllllllIlIlIIlIIlIllIl.interact(llllIlIlll[llllIllIIl[147]]);
            Time.sleepTicks((int)llllIllIIl[9]);
            "".length();
        }
        if (W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
            void lllllllllllllllllIlIlIIlIIlIllll;
            void lllllllllllllllllIlIlIIlIIllIIII;
            void lllllllllllllllllIlIlIIlIIllIIIl;
            void lllllllllllllllllIlIlIIlIIllIIlI;
            void lllllllllllllllllIlIlIIlIIllIIll;
            void lllllllllllllllllIlIlIIlIIllIlII;
            int lllllllllllllllllIlIlIIlIIlIlIll;
            TileObject lllllllllllllllllIlIlIIlIIlIllII;
            void lllllllllllllllllIlIlIIlIIllIlIl;
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIllIlIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIlIllII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[233]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[234], llllIllIIl[131], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if (null != null) {
                        return ((0x63 ^ 0x51) & ~(0xF2 ^ 0xC0)) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                lllllllllllllllllIlIlIIlIIlIlIll = Skills.getExperience((Skill)Skill.AGILITY);
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[148]];
                lllllllllllllllllIlIlIIlIIlIllII.interact(llllIlIlll[llllIllIIl[149]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIlIlIll)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if (" ".length() >= "   ".length()) {
                            return ((113 + 17 - 111 + 176 ^ 95 + 81 - 99 + 61) & (0x65 ^ 1 ^ (0x25 ^ 8) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIllIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIlIllII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[232]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[131], llllIllIIl[225], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if ((0x16 ^ 0x12) != (0x75 ^ 0x71)) {
                        return ((0xF3 ^ 0xB1) & ~(0x81 ^ 0xC3)) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[150]];
                lllllllllllllllllIlIlIIlIIlIlIll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIIlIIlIllII.interact(llllIlIlll[llllIllIIl[151]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIlIlIll)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if ((0xC7 ^ 0xC3) < "   ".length()) {
                            return ((0x7F ^ 0x69) & ~(1 ^ 0x17)) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIllIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIlIllII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[230]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[139], llllIllIIl[231], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if (-" ".length() > 0) {
                        return (" ".length() & ~" ".length()) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[152]];
                lllllllllllllllllIlIlIIlIIlIlIll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIIlIIlIllII.interact(llllIlIlll[llllIllIIl[153]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIlIlIll)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if (-" ".length() > " ".length()) {
                            return ((101 + 170 - 146 + 77 ^ 102 + 103 - 179 + 142) & (5 ^ 0x54 ^ (0x69 ^ 0x5A) ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIllIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIlIllII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[227]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[228], llllIllIIl[229], llllIllIIl[9])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if (null != null) {
                        return ((0xED ^ 0x8A ^ (0x2A ^ 0x5E)) & (0x10 ^ 0x5D ^ (0x52 ^ 0xC) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[154]];
                lllllllllllllllllIlIlIIlIIlIlIll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIIlIIlIllII.interact(llllIlIlll[llllIllIIl[155]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIlIlIll)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if ((125 + 53 - 133 + 106 ^ 26 + 146 - 38 + 13) <= 0) {
                            return ((87 + 30 - 100 + 182 ^ 57 + 50 - -6 + 31) & (136 + 170 - 160 + 90 ^ 160 + 178 - 221 + 70 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIllIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIlIllII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[226]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[8], llllIllIIl[130], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if (null != null) {
                        return ((161 + 100 - 203 + 148 ^ 120 + 108 - 158 + 89) & (0x9F ^ 0x83 ^ (0xF0 ^ 0xBD) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[156]];
                lllllllllllllllllIlIlIIlIIlIlIll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIIlIIlIllII.interact(llllIlIlll[llllIllIIl[157]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIlIlIll)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if ("  ".length() < ((0x72 ^ 0x24) & ~(0x3E ^ 0x68))) {
                            return ((0x14 ^ 0x26) & ~(0x47 ^ 0x75)) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIllIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIlIllII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[224]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[225], llllIllIIl[215], llllIllIIl[9])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if ("   ".length() < "  ".length()) {
                        return ((0x36 ^ 0x55) & ~(0x45 ^ 0x26)) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[158]];
                lllllllllllllllllIlIlIIlIIlIlIll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIIlIIlIllII.interact(llllIlIlll[llllIllIIl[159]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIlIlIll)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if (null != null) {
                            return ((0x85 ^ 0x90 ^ (0x73 ^ 0x44)) & (153 + 134 - 144 + 20 ^ 114 + 75 - 151 + 91 ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
            if (W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                return;
            }
            if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIIlIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIIlIllII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (W.llIlIIIIllIll(tileObject.getName().contains(llllIlIlll[llllIllIIl[221]]) ? 1 : 0) && W.llIlIIIlIIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(llllIllIIl[222], llllIllIIl[223], llllIllIIl[2])), llllIllIIl[2])) {
                    n2 = llllIllIIl[1];
                    "".length();
                    if ("  ".length() < 0) {
                        return ((0x1D ^ 0x1B) & ~(0xA2 ^ 0xA4)) != 0;
                    }
                } else {
                    n2 = llllIllIIl[0];
                }
                return n2 != 0;
            }))) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[160]];
                lllllllllllllllllIlIlIIlIIlIlIll = Skills.getExperience((Skill)Skill.AGILITY);
                lllllllllllllllllIlIlIIlIIlIllII.interact(llllIlIlll[llllIllIIl[161]]);
                Time.sleepTicks((int)e.c(llllIllIIl[1], llllIllIIl[2]));
                "".length();
                Time.sleepUntil(() -> {
                    boolean bl;
                    if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIIlIlIll)) {
                        bl = llllIllIIl[1];
                        "".length();
                        if (null != null) {
                            return ((0xC ^ 0x58) & ~(9 ^ 0x5D)) != 0;
                        }
                    } else {
                        bl = llllIllIIl[0];
                    }
                    return bl;
                }, (int)llllIllIIl[104]);
                "".length();
                Time.sleepTicks((int)llllIllIIl[1]);
                "".length();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
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
        if (W.llIlIIIIlllIl(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[95]];
            if (W.llIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
            }
            if (W.llIlIIIIllIll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)new WorldPoint(llllIllIIl[96], llllIllIIl[52], llllIllIIl[0]));
            "".length();
            Time.sleepTicks((int)llllIllIIl[1]);
            "".length();
        }
        if (W.llIlIIIlIIIlI(Players.getLocal().getAnimation(), llllIllIIl[62]) && W.llIlIIIIlllIl(Players.getLocal().isMoving() ? 1 : 0)) {
            String[] stringArray = new String[llllIllIIl[1]];
            stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[97]];
            TileItem lllllllllllllllllIlIlIIlIlIIlIlI = TileItems.getNearest((String[])stringArray);
            if (W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIlIIlIlI) && W.llIlIIIIllIll(W.dx() ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[98]];
                System.out.println(llllIlIlll[llllIllIIl[99]]);
                lllllllllllllllllIlIlIIlIlIIlIlI.interact(llllIlIlll[llllIllIIl[100]]);
                Time.sleepTicks((int)llllIllIIl[9]);
                "".length();
            }
            if (W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                void lllllllllllllllllIlIlIIlIlIIlIll;
                void lllllllllllllllllIlIlIIlIlIIllII;
                void lllllllllllllllllIlIlIIlIlIIllIl;
                void lllllllllllllllllIlIlIIlIlIIlllI;
                void lllllllllllllllllIlIlIIlIlIIllll;
                void lllllllllllllllllIlIlIIlIlIlIIII;
                void lllllllllllllllllIlIlIIlIlIlIIIl;
                void lllllllllllllllllIlIlIIlIlIlIIlI;
                int lllllllllllllllllIlIlIIlIlIIlIIl;
                void lllllllllllllllllIlIlIIlIlIlIIll;
                if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlIlIIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[101]];
                    lllllllllllllllllIlIlIIlIlIIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray2 = new String[llllIllIIl[1]];
                    stringArray2[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[102]];
                    TileObjects.getNearest((String[])stringArray2).interact(llllIlIlll[llllIllIIl[103]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIlIIlIIl)) {
                            bl = llllIllIIl[1];
                            "".length();
                            if (" ".length() <= 0) {
                                return ((110 + 16 - 30 + 76 ^ 40 + 27 - 31 + 132) & (0x4A ^ 0x26 ^ (0xC6 ^ 0xAE) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks((int)llllIllIIl[1]);
                    "".length();
                }
                if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlIlIIlI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[37]];
                    lllllllllllllllllIlIlIIlIlIIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray3 = new String[llllIllIIl[1]];
                    stringArray3[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[105]];
                    TileObjects.getNearest((String[])stringArray3).interact(llllIlIlll[llllIllIIl[106]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIlIIlIIl)) {
                            bl = llllIllIIl[1];
                            "".length();
                            if (" ".length() == "  ".length()) {
                                return ((0 + 96 - -27 + 111 ^ 46 + 152 - 166 + 128) & (0x1F ^ 0x27 ^ (0xCB ^ 0xB9) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks((int)llllIllIIl[1]);
                    "".length();
                }
                if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[107]];
                    lllllllllllllllllIlIlIIlIlIIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray4 = new String[llllIllIIl[1]];
                    stringArray4[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[108]];
                    TileObjects.getNearest((String[])stringArray4).interact(llllIlIlll[llllIllIIl[109]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIlIIlIIl)) {
                            bl = llllIllIIl[1];
                            "".length();
                            if ("  ".length() == 0) {
                                return ((0x65 ^ 0x73) & ~(0xB2 ^ 0xA4)) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks((int)llllIllIIl[1]);
                    "".length();
                }
                if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[110]];
                    lllllllllllllllllIlIlIIlIlIIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray5 = new String[llllIllIIl[1]];
                    stringArray5[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[111]];
                    TileObjects.getNearest((String[])stringArray5).interact(llllIlIlll[llllIllIIl[112]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIlIIlIIl)) {
                            bl = llllIllIIl[1];
                            "".length();
                            if (((0x77 ^ 0x53) & ~(0x9F ^ 0xBB)) == (0xC1 ^ 0xC5)) {
                                return ((0xD7 ^ 0xC5) & ~(0x11 ^ 3)) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks((int)llllIllIIl[1]);
                    "".length();
                }
                if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlIIllll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[113]];
                    lllllllllllllllllIlIlIIlIlIIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray6 = new String[llllIllIIl[1]];
                    stringArray6[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[39]];
                    TileObjects.getNearest((String[])stringArray6).interact(llllIlIlll[llllIllIIl[6]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIlIIlIIl)) {
                            bl = llllIllIIl[1];
                            "".length();
                            if (-" ".length() >= 0) {
                                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks((int)llllIllIIl[1]);
                    "".length();
                }
                if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[114]];
                    lllllllllllllllllIlIlIIlIlIIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIllIIl[1]];
                    nArray[W.llllIllIIl[0]] = llllIllIIl[115];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIlll[llllIllIIl[116]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIlIIlIIl)) {
                            bl = llllIllIIl[1];
                            "".length();
                            if (null != null) {
                                return ((0xE0 ^ 0xAF) & ~(0xC9 ^ 0x86)) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks((int)llllIllIIl[1]);
                    "".length();
                }
                if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlIIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[117]];
                    lllllllllllllllllIlIlIIlIlIIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIllIIl[1]];
                    nArray[W.llllIllIIl[0]] = llllIllIIl[118];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIlll[llllIllIIl[119]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIlIIlIIl)) {
                            bl = llllIllIIl[1];
                            "".length();
                            if (-" ".length() != -" ".length()) {
                                return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks((int)llllIllIIl[1]);
                    "".length();
                }
                if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlIIllII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[120]];
                    lllllllllllllllllIlIlIIlIlIIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    int[] nArray = new int[llllIllIIl[1]];
                    nArray[W.llllIllIIl[0]] = llllIllIIl[121];
                    TileObjects.getNearest((int[])nArray).interact(llllIlIlll[llllIllIIl[122]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIlIIlIIl)) {
                            bl = llllIllIIl[1];
                            "".length();
                            if (" ".length() == 0) {
                                return ((0x6F ^ 0x26 ^ (0x4D ^ 0x59) & ~(0x66 ^ 0x72)) & (8 ^ 0x5C ^ (0x38 ^ 0x25) ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks((int)llllIllIIl[1]);
                    "".length();
                }
                if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlIIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && W.llIlIIIIlllIl(W.dx() ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[123]];
                    lllllllllllllllllIlIlIIlIlIIlIIl = Skills.getExperience((Skill)Skill.AGILITY);
                    String[] stringArray7 = new String[llllIllIIl[1]];
                    stringArray7[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[124]];
                    TileObjects.getNearest((String[])stringArray7).interact(llllIlIlll[llllIllIIl[44]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        if (W.llIlIIIIlllll(Skills.getExperience((Skill)Skill.AGILITY), lllllllllllllllllIlIlIIlIlIIlIIl)) {
                            bl = llllIllIIl[1];
                            "".length();
                            if (null != null) {
                                return ((0x33 ^ 0x27) & ~(0x7B ^ 0x6F)) != 0;
                            }
                        } else {
                            bl = llllIllIIl[0];
                        }
                        return bl;
                    }, (int)llllIllIIl[104]);
                    "".length();
                    Time.sleepTicks((int)llllIllIIl[1]);
                    "".length();
                }
            }
        }
    }

    private static boolean llIlIIIlIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    public static void ds() {
        if (W.llIlIIIIllIll(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[0]];
            b.a(bu);
            if (W.llIlIIIIlllII(bu.size(), llllIllIIl[1])) {
                System.out.println(llllIlIlll[llllIllIIl[1]]);
                bs = llllIllIIl[0];
            }
        }
        if (W.llIlIIIIlllIl(bs ? 1 : 0)) {
            if (W.llIlIIIIlllIl(W.aa() ? 1 : 0)) {
                BankLocation lllllllllllllllllIlIlIIlIlllIlll = BankLocation.getNearest();
                if (W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIlllIlll) && W.llIlIIIIlllIl(lllllllllllllllllIlIlIIlIlllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[2]];
                    WorldArea lllllllllllllllllIlIlIIlIlllIllI = new WorldArea(llllIllIIl[3], llllIllIIl[4], llllIllIIl[5], llllIllIIl[6], llllIllIIl[0]);
                    if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        WorldPoint lllllllllllllllllIlIlIIlIlllIlIl = new WorldPoint(llllIllIIl[7], llllIllIIl[8], llllIllIIl[0]);
                        if (W.llIlIIIIlllll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllllIlIlIIlIlllIlIl), llllIllIIl[9])) {
                            Movement.walkTo((WorldPoint)lllllllllllllllllIlIlIIlIlllIlIl);
                            "".length();
                            Time.sleepTicks((int)llllIllIIl[1]);
                            "".length();
                        }
                    }
                    a.a(lllllllllllllllllIlIlIIlIlllIlll);
                }
                if (W.llIlIIIIllllI(lllllllllllllllllIlIlIIlIlllIlll) && W.llIlIIIIllIll(lllllllllllllllllIlIlIIlIlllIlll.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = llllIlIlll[llllIllIIl[9]];
                    if (W.llIlIIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllIllIIl[10]);
                        "".length();
                    }
                    if (W.llIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                        if (W.llIlIIIlIIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllIllIIl[1]);
                            "".length();
                        }
                        if (W.llIlIIIlIIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llllIllIIl[2]);
                            "".length();
                        }
                    }
                    int[] nArray = new int[llllIllIIl[11]];
                    nArray[W.llllIllIIl[0]] = llllIllIIl[12];
                    nArray[W.llllIllIIl[1]] = llllIllIIl[13];
                    nArray[W.llllIllIIl[2]] = llllIllIIl[14];
                    nArray[W.llllIllIIl[9]] = llllIllIIl[15];
                    nArray[W.llllIllIIl[16]] = llllIllIIl[17];
                    nArray[W.llllIllIIl[18]] = llllIllIIl[19];
                    nArray[W.llllIllIIl[20]] = llllIllIIl[21];
                    nArray[W.llllIllIIl[22]] = llllIllIIl[23];
                    nArray[W.llllIllIIl[24]] = llllIllIIl[25];
                    nArray[W.llllIllIIl[26]] = llllIllIIl[27];
                    if (W.llIlIIIIlllIl(e.b(nArray) ? 1 : 0)) {
                        W.ae();
                        System.out.println(llllIlIlll[llllIllIIl[16]]);
                        bs = llllIllIIl[1];
                        return;
                    }
                    int[] nArray2 = new int[llllIllIIl[11]];
                    nArray2[W.llllIllIIl[0]] = llllIllIIl[12];
                    nArray2[W.llllIllIIl[1]] = llllIllIIl[13];
                    nArray2[W.llllIllIIl[2]] = llllIllIIl[14];
                    nArray2[W.llllIllIIl[9]] = llllIllIIl[15];
                    nArray2[W.llllIllIIl[16]] = llllIllIIl[17];
                    nArray2[W.llllIllIIl[18]] = llllIllIIl[19];
                    nArray2[W.llllIllIIl[20]] = llllIllIIl[21];
                    nArray2[W.llllIllIIl[22]] = llllIllIIl[23];
                    nArray2[W.llllIllIIl[24]] = llllIllIIl[25];
                    nArray2[W.llllIllIIl[26]] = llllIllIIl[27];
                    if (W.llIlIIIIllIll(e.b(nArray2) ? 1 : 0)) {
                        a.a(llllIllIIl[28], llllIllIIl[1]);
                        a.a(llllIllIIl[29], llllIllIIl[1]);
                        a.a(llllIllIIl[30], llllIllIIl[1]);
                        a.a(llllIllIIl[31], llllIllIIl[1]);
                        a.a(llllIllIIl[32], llllIllIIl[1]);
                        a.a(llllIllIIl[33], llllIllIIl[1]);
                        a.a(llllIllIIl[34], llllIllIIl[1]);
                        int[] nArray3 = new int[llllIllIIl[1]];
                        nArray3[W.llllIllIIl[0]] = llllIllIIl[28];
                        if (W.llIlIIIIlllIl(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                            int[] nArray4 = new int[llllIllIIl[1]];
                            nArray4[W.llllIllIIl[0]] = llllIllIIl[28];
                            if (W.llIlIIIIlllIl(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                                int[] nArray5 = new int[llllIllIIl[1]];
                                nArray5[W.llllIllIIl[0]] = llllIllIIl[28];
                                if (W.llIlIIIIlllIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                    a.a(llllIllIIl[35], llllIllIIl[1]);
                                }
                            }
                        }
                        a.a(llllIllIIl[17], llllIllIIl[1]);
                        e.l(llllIllIIl[28]);
                        e.l(llllIllIIl[29]);
                        e.l(llllIllIIl[30]);
                        e.l(llllIllIIl[31]);
                        e.l(llllIllIIl[32]);
                        Time.sleepTicks((int)llllIllIIl[1]);
                        "".length();
                        e.l(llllIllIIl[34]);
                        e.l(llllIllIIl[36]);
                        e.l(llllIllIIl[33]);
                        e.l(llllIllIIl[35]);
                        e.l(llllIllIIl[17]);
                        Time.sleepTicks((int)llllIllIIl[9]);
                        "".length();
                        if (W.llIlIIIIlllIl(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepTicks((int)llllIllIIl[20]);
                            "".length();
                        }
                        if (W.llIlIIIIllIll(Bank.isOpen() ? 1 : 0)) {
                            if (W.llIlIIIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[37])) {
                                a.a(llllIllIIl[12], llllIllIIl[11]);
                                a.a(llllIllIIl[13], llllIllIIl[11]);
                                a.a(llllIllIIl[21], llllIllIIl[11]);
                                a.a(llllIllIIl[14], llllIllIIl[11]);
                                a.b(f.be, llllIllIIl[1]);
                                a.a(llllIllIIl[27], llllIllIIl[1]);
                                a.a(llllIllIIl[19], llllIllIIl[18]);
                                a.a(llllIllIIl[23], llllIllIIl[38]);
                            }
                            if (W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[37])) {
                                a.a(llllIllIIl[12], llllIllIIl[11]);
                                a.a(llllIllIIl[21], llllIllIIl[11]);
                                a.a(llllIllIIl[25], llllIllIIl[11]);
                                a.b(f.be, llllIllIIl[1]);
                                a.a(llllIllIIl[27], llllIllIIl[1]);
                                a.a(llllIllIIl[19], llllIllIIl[24]);
                                a.a(llllIllIIl[23], llllIllIIl[11]);
                            }
                        }
                    }
                }
            }
            if (W.llIlIIIIllIll(W.aa() ? 1 : 0)) {
                String[] stringArray = new String[llllIllIIl[1]];
                stringArray[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[18]];
                if (W.llIlIIIIllIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[llllIllIIl[1]];
                    stringArray2[W.llllIllIIl[0]] = llllIlIlll[llllIllIIl[20]];
                    Inventory.getFirst((String[])stringArray2).interact(llllIlIlll[llllIllIIl[22]]);
                }
                if (W.llIlIIIIllIll(Inventory.contains((int[])f.aU) ? 1 : 0) && W.llIlIIIIlllII(Movement.getRunEnergy(), llllIllIIl[39])) {
                    Inventory.getFirst((int[])f.aU).interact(llllIlIlll[llllIllIIl[24]]);
                    Time.sleepTicks((int)llllIllIIl[1]);
                    "".length();
                }
                if (W.llIlIIIIlllll(Combat.getMissingHealth(), llllIllIIl[40])) {
                    int[] nArray = new int[llllIllIIl[1]];
                    nArray[W.llllIllIIl[0]] = llllIllIIl[23];
                    if (W.llIlIIIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray6 = new int[llllIllIIl[1]];
                        nArray6[W.llllIllIIl[0]] = llllIllIIl[23];
                        Inventory.getFirst((int[])nArray6).interact(llllIlIlll[llllIllIIl[26]]);
                        Time.sleepTicks((int)llllIllIIl[2]);
                        "".length();
                    }
                }
                if (W.llIlIIIIlllll(Movement.getRunEnergy(), llllIllIIl[41]) && W.llIlIIIIlllIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                if (W.llIlIIIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[42])) {
                    W.dt();
                }
                if ((!W.llIlIIIlIIIIl(e.j(llllIllIIl[43]), llllIllIIl[44]) || W.llIlIIIIlllII(e.j(llllIllIIl[45]), llllIllIIl[18])) && W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[42]) && W.llIlIIIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[44])) {
                    W.du();
                }
                if (W.llIlIIIlIIIIl(e.j(llllIllIIl[43]), llllIllIIl[44]) && W.llIlIIIlIIIIl(e.j(llllIllIIl[45]), llllIllIIl[18])) {
                    if (W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[42]) && W.llIlIIIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[37])) {
                        W.du();
                    }
                    if (W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[37]) && W.llIlIIIIlllII(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[44])) {
                        W.dv();
                    }
                }
                if (W.llIlIIIlIIIIl(Skills.getLevel((Skill)Skill.AGILITY), llllIllIIl[44])) {
                    W.dw();
                }
            }
        }
    }

    private static void llIlIIIIllIlI() {
        llllIllIIl = new int[239];
        W.llllIllIIl[0] = (0x73 ^ 0x2D) & ~(0x63 ^ 0x3D);
        W.llllIllIIl[1] = " ".length();
        W.llllIllIIl[2] = "  ".length();
        W.llllIllIIl[3] = -(0xFFFF9775 & 0x7ABB) & (0xFFFFBFBF & 0x5FF7);
        W.llllIllIIl[4] = -(0xFFFFD2DD & 0x6D33) & (0xFFFFDFBF & 0x6DD5);
        W.llllIllIIl[5] = 0x4B ^ 0x75;
        W.llllIllIIl[6] = 0x5E ^ 0 ^ (0x54 ^ 0x39);
        W.llllIllIIl[7] = -(0xFFFFF4DF & 0x2B61) & (0xFFFFADFC & 0x7FFB);
        W.llllIllIIl[8] = -(0xFFFFC7FF & 0x3A67) & (0xFFFF9FFF & 0x6FFE);
        W.llllIllIIl[9] = "   ".length();
        W.llllIllIIl[10] = -(0xFFFFE477 & 0x7FCF) & (0xFFFFF7DE & 0x7FEF);
        W.llllIllIIl[11] = 0x93 ^ 0xA7 ^ (0x68 ^ 0x56);
        W.llllIllIIl[12] = 0xFFFFFFF7 & 0x1F4F;
        W.llllIllIIl[13] = 0xFFFFDF78 & 0x3FCF;
        W.llllIllIIl[14] = -(0x5C ^ 0x7B) & (0xFFFFBFEF & 0x5F7F);
        W.llllIllIIl[15] = -(0xFFFFFA7F & 0x45F1) & (0xFFFFCF7F & 0x7FFD);
        W.llllIllIIl[16] = 0xA6 ^ 0xA2;
        W.llllIllIIl[17] = -(0xFFFF9DB7 & 0x7369) & (0xFFFFFFEF & 0x3FFC);
        W.llllIllIIl[18] = 0x8A ^ 0x8F;
        W.llllIllIIl[19] = -(0xFFFFEF9B & 0x586F) & (0xFFFFFDFB & 0x7B5F);
        W.llllIllIIl[20] = 0x3C ^ 0x18 ^ (0x26 ^ 4);
        W.llllIllIIl[21] = -(0xFFFFE897 & 0x377D) & (0xFFFFBF5E & Short.MAX_VALUE);
        W.llllIllIIl[22] = 0xDA ^ 0x9B ^ (0xD8 ^ 0x9E);
        W.llllIllIIl[23] = 0xFFFF93AB & 0x6DD5;
        W.llllIllIIl[24] = 0xAB ^ 0x94 ^ (0x1C ^ 0x2B);
        W.llllIllIIl[25] = -(0xFFFFB27D & 0x7D9F) & (0xFFFFFCFF & 0x7FBF);
        W.llllIllIIl[26] = 0xA9 ^ 0xA0;
        W.llllIllIIl[27] = -(0xFFFFAC7B & 0x7386) & (0xFFFFFAFB & 0x779F);
        W.llllIllIIl[28] = -(0xFFFF999F & 0x77E3) & (0xFFFFFFDE & 0x3FF7);
        W.llllIllIIl[29] = -(0xFFFFD5E5 & 0x7B9B) & (0xFFFFFFFF & 0x7FD0);
        W.llllIllIIl[30] = -(0xFFFFDFBA & 0x31F7) & (0xFFFFFFFF & 0x3FFF);
        W.llllIllIIl[31] = 0xFFFFEF5E & 0x3EED;
        W.llllIllIIl[32] = 0xFFFFEED7 & 0x3F7A;
        W.llllIllIIl[33] = -(0xFFFFFD9B & 0x5376) & (0xFFFFFF5F & 0x7FFB);
        W.llllIllIIl[34] = 0xFFFFBFFA & 0x6EC5;
        W.llllIllIIl[35] = 0x36 ^ 0x6E;
        W.llllIllIIl[36] = -(0xFFFFB7FF & 0x68D1) & (0xFFFFEFDB & Short.MAX_VALUE);
        W.llllIllIIl[37] = 0x3F ^ 0x17;
        W.llllIllIIl[38] = 0x60 ^ 0x6F;
        W.llllIllIIl[39] = 0xB1 ^ 0x83;
        W.llllIllIIl[40] = 0x82 ^ 0x96;
        W.llllIllIIl[41] = 0xB8 ^ 0x81 ^ (1 ^ 0x21);
        W.llllIllIIl[42] = 0xAA ^ 0xC6 ^ (0xDF ^ 0xAD);
        W.llllIllIIl[43] = -(0xFFFFFCFF & 0x1FD1) & (0xFFFFBDFF & 0x5FFE);
        W.llllIllIIl[44] = 0x9F ^ 0x92 ^ (0x2A ^ 0x1B);
        W.llllIllIIl[45] = 0xFFFFC5F3 & 0x3B3F;
        W.llllIllIIl[46] = -(0xFFFFF6AB & 0xD5F) & (0xFFFFCDBF & 0x3FEF);
        W.llllIllIIl[47] = 0xFFFF8F6B & 0x7DFF;
        W.llllIllIIl[48] = -(0xFFFFF69F & 0x3B6B) & (0xFFFFFFEE & 0x3F7B);
        W.llllIllIIl[49] = 0x6F ^ 0x73 ^ (0xAB ^ 0xBC);
        W.llllIllIIl[50] = 0xFFFFCFDF & 0x3D7D;
        W.llllIllIIl[51] = -(0xFFFFDE6F & 0x739B) & (0xFFFFFBEB & 0x5FBF);
        W.llllIllIIl[52] = 0xFFFFDDD7 & 0x2F7F;
        W.llllIllIIl[53] = 0x23 ^ 0x3F ^ (0xA7 ^ 0xB5);
        W.llllIllIIl[54] = 0xB ^ 0x19;
        W.llllIllIIl[55] = 0xFFFF8BF3 & 0x7DBF;
        W.llllIllIIl[56] = -(0xFFFFD706 & 0x7AFF) & (0xFFFFFFFD & 0x5F5F);
        W.llllIllIIl[57] = -(0xFFFFBCF5 & 0x574F) & (0xFFFFFFF6 & 0x1DFF);
        W.llllIllIIl[58] = 0xFFFFDDFD & 0x2F5B;
        W.llllIllIIl[59] = -(0xFFFFEE5D & 0x35E3) & (0xFFFFAFF9 & 0x7DF7);
        W.llllIllIIl[60] = -(0xFFFFF4FF & 0x7B0D) & (0xFFFFFF6F & 0x7DFF);
        W.llllIllIIl[61] = 0xAB ^ 0xBD;
        W.llllIllIIl[62] = -" ".length();
        W.llllIllIIl[63] = 96 + 53 - 53 + 53 ^ 10 + 146 - 86 + 83;
        W.llllIllIIl[64] = 0x42 ^ 0x23 ^ (0xAB ^ 0xC7);
        W.llllIllIIl[65] = 0x36 ^ 0x42 ^ (0x4A ^ 0x2E);
        W.llllIllIIl[66] = 0xD5 ^ 0xC4;
        W.llllIllIIl[67] = 0x37 ^ 0x52 ^ (0xC4 ^ 0xB2);
        W.llllIllIIl[68] = 0xA3 ^ 0x88 ^ (0x17 ^ 0x29);
        W.llllIllIIl[69] = 0x22 ^ 0x4F ^ (0x1A ^ 0x60);
        W.llllIllIIl[70] = 0x1E ^ 0xD ^ (0x25 ^ 0x2E);
        W.llllIllIIl[71] = 0x94 ^ 0xB0 ^ (0x63 ^ 0x5D);
        W.llllIllIIl[72] = 110 + 106 - 64 + 21 ^ 10 + 85 - 88 + 175;
        W.llllIllIIl[73] = 0x19 ^ 0x6A ^ (0x63 ^ 0xC);
        W.llllIllIIl[74] = 8 ^ 0x76 ^ (2 ^ 0x61);
        W.llllIllIIl[75] = 0x13 ^ 0xC;
        W.llllIllIIl[76] = -(0xFFFFE3D1 & 0x7EAF) & (0xFFFFEFFF & 0x7EDF);
        W.llllIllIIl[77] = -(0xFFFFFBE9 & 0x645F) & (0xFFFFFF7F & 0x6DDE);
        W.llllIllIIl[78] = (0x63 ^ 0x77) + (0xEC ^ 0x83) - (0x40 ^ 0x35) + (0x35 ^ 0x4E);
        W.llllIllIIl[79] = 67 + 149 - 130 + 119 ^ 5 + 65 - 50 + 127;
        W.llllIllIIl[80] = -(0xFFFFFDD3 & 0x122D) & (0xFFFFFCB7 & 0x1FDB);
        W.llllIllIIl[81] = 0xFFFFCF5B & 0x3DF5;
        W.llllIllIIl[82] = 0xFFFFFE9D & 0xDEE;
        W.llllIllIIl[83] = 0xFFFF9CFE & 0x6F7F;
        W.llllIllIIl[84] = -(0xFFFFF74C & 0x7ABF) & (0xFFFFFFFF & 0x7F5F);
        W.llllIllIIl[85] = -(0xFFFFF9DE & 0x37A3) & (0xFFFFFDF7 & 0x3FFF);
        W.llllIllIIl[86] = 0xFFFFAF55 & 0x5DFF;
        W.llllIllIIl[87] = 0xFFFFDFDB & 0x2D6D;
        W.llllIllIIl[88] = -(0xFFFFD597 & 0x6B6D) & (0xFFFFEFFF & 0x5D6F);
        W.llllIllIIl[89] = -(0xFFFFFFCF & 0x60F9) & (0xFFFFEFFF & 0x7DFE);
        W.llllIllIIl[90] = -(0xFFFFDFFD & 0x610F) & (0xFFFFDD9D & 0x6FFF);
        W.llllIllIIl[91] = 0xFFFFEDCF & 0x1F70;
        W.llllIllIIl[92] = 0xFFFFCFB7 & 0x3CEA;
        W.llllIllIIl[93] = -(0xFFFFD713 & 0x2AFD) & (0xFFFFDF5E & 0x2FFB);
        W.llllIllIIl[94] = -(0xFFFFF7A7 & 0x7AFE) & (0xFFFFFFFF & 0x7FF7);
        W.llllIllIIl[95] = 0xCD ^ 0xC4 ^ (0x75 ^ 0x5C);
        W.llllIllIIl[96] = 0xFFFFEFBA & 0x1CDD;
        W.llllIllIIl[97] = 0x5B ^ 0x7A;
        W.llllIllIIl[98] = 70 + 120 - 146 + 116 ^ 11 + 19 - -42 + 58;
        W.llllIllIIl[99] = 0x2F ^ 0xC;
        W.llllIllIIl[100] = 0x2E ^ 0x34 ^ (0xE ^ 0x30);
        W.llllIllIIl[101] = 0xC4 ^ 0xC0 ^ (0x2A ^ 0xB);
        W.llllIllIIl[102] = 0x68 ^ 0x4E;
        W.llllIllIIl[103] = 0x14 ^ 6 ^ (0xAD ^ 0x98);
        W.llllIllIIl[104] = -(0xFFFFFBE7 & 0x5CDB) & (0xFFFFFBFE & 0x7DF7);
        W.llllIllIIl[105] = 0x69 ^ 0x2F ^ (0x34 ^ 0x5B);
        W.llllIllIIl[106] = 0x4D ^ 0x67;
        W.llllIllIIl[107] = 0x36 ^ 0x6C ^ (0x2A ^ 0x5B);
        W.llllIllIIl[108] = 9 + 3 - -175 + 4 ^ 60 + 61 - 70 + 96;
        W.llllIllIIl[109] = 75 + 156 - 179 + 117 ^ 77 + 2 - -28 + 25;
        W.llllIllIIl[110] = 0xAC ^ 0x82;
        W.llllIllIIl[111] = 0x8E ^ 0xA1;
        W.llllIllIIl[112] = 0x2C ^ 0x1C;
        W.llllIllIIl[113] = 0x5E ^ 0x6F;
        W.llllIllIIl[114] = 47 + 143 - 133 + 104 ^ 134 + 116 - 171 + 70;
        W.llllIllIIl[115] = 0xFFFFF9FF & 0x3FF2;
        W.llllIllIIl[116] = 11 + 102 - 109 + 125 ^ 17 + 21 - 0 + 142;
        W.llllIllIIl[117] = 0x96 ^ 0xA0;
        W.llllIllIIl[118] = 0xFFFFF9F3 & 0x3FFF;
        W.llllIllIIl[119] = 0x7F ^ 0x48;
        W.llllIllIIl[120] = 0x42 ^ 0x5E ^ (0xE1 ^ 0xC5);
        W.llllIllIIl[121] = -(0xFFFFCDB7 & 0x364B) & (0xFFFFBFF6 & 0x7DFF);
        W.llllIllIIl[122] = 0x1C ^ 1 ^ (0x27 ^ 3);
        W.llllIllIIl[123] = 156 + 127 - 249 + 123 ^ 86 + 24 - -30 + 27;
        W.llllIllIIl[124] = 0xA0 ^ 0x9B;
        W.llllIllIIl[125] = 0xFFFF9FBF & 0x6DCF;
        W.llllIllIIl[126] = -(0xFFFFABF7 & 0x767D) & (0xFFFFEFFE & 0x3FFF);
        W.llllIllIIl[127] = 0xFFFFDFBE & 0x2DEF;
        W.llllIllIIl[128] = 0xFFFFDFBF & 0x2DE2;
        W.llllIllIIl[129] = 0xFFFFEDFF & 0x1FA7;
        W.llllIllIIl[130] = -(0xFFFFAAAF & 0x5775) & (0xFFFFBFFF & 0x4FBF);
        W.llllIllIIl[131] = 0xFFFFDDFB & 0x2FAD;
        W.llllIllIIl[132] = -(0xFFFFD46E & 0x7BB3) & (0xFFFFDFFB & 0x7DB5);
        W.llllIllIIl[133] = -(0xFFFFB7CF & 0x6A3F) & (0xFFFFFFAF & 0x2FFF);
        W.llllIllIIl[134] = 0xFFFFDDF7 & 0x2F9B;
        W.llllIllIIl[135] = 0xFFFFFFFF & 0xD9D;
        W.llllIllIIl[136] = 0xFFFF8DAF & 0x7FDB;
        W.llllIllIIl[137] = 0xFFFF8DBB & 0x7FF6;
        W.llllIllIIl[138] = -(0xFFFFDE7D & 0x23EB) & (0xFFFFEFFF & 0x1FF9);
        W.llllIllIIl[139] = -(0xFFFFF72D & 0x1AD3) & (0xFFFFDF9F & 0x3FFE);
        W.llllIllIIl[140] = 0x54 ^ 0x16 ^ 74 + 73 - 119 + 99;
        W.llllIllIIl[141] = 0x94 ^ 0xAB;
        W.llllIllIIl[142] = 180 + 43 - 147 + 164 ^ 73 + 135 - 34 + 2;
        W.llllIllIIl[143] = 0xC5 ^ 0x84;
        W.llllIllIIl[144] = 0x32 ^ 0x70;
        W.llllIllIIl[145] = 0x3A ^ 0x50 ^ (0x9F ^ 0xB6);
        W.llllIllIIl[146] = 0x48 ^ 0x51 ^ (0xD4 ^ 0x89);
        W.llllIllIIl[147] = 0xD8 ^ 0x9D;
        W.llllIllIIl[148] = 0xAB ^ 0xAC ^ (0xF9 ^ 0xB8);
        W.llllIllIIl[149] = 0x1A ^ 0x5D;
        W.llllIllIIl[150] = 0x34 ^ 5 ^ (0x14 ^ 0x6D);
        W.llllIllIIl[151] = 0x33 ^ 0x74 ^ (0xBA ^ 0xB4);
        W.llllIllIIl[152] = 0x8A ^ 0xC0;
        W.llllIllIIl[153] = 0x79 ^ 5 ^ (0x98 ^ 0xAF);
        W.llllIllIIl[154] = 0x1D ^ 0x5F ^ (0xAF ^ 0xA1);
        W.llllIllIIl[155] = 0x43 ^ 0xE;
        W.llllIllIIl[156] = 119 + 89 - 193 + 121 ^ 57 + 109 - -25 + 7;
        W.llllIllIIl[157] = 0x75 ^ 0x3A;
        W.llllIllIIl[158] = 0xCC ^ 0x8D ^ (0x3B ^ 0x2A);
        W.llllIllIIl[159] = 0x51 ^ 0;
        W.llllIllIIl[160] = 0x32 ^ 0x60;
        W.llllIllIIl[161] = 0x76 ^ 0x35 ^ (0x22 ^ 0x32);
        W.llllIllIIl[162] = -(0xFFFFFDE1 & 0x439F) & (0xFFFFDFFF & 0x6BFF);
        W.llllIllIIl[163] = -(0xFFFFA365 & 0x7E9B) & (0xFFFFEFFE & 0x3F7F);
        W.llllIllIIl[164] = 0xFFFF9BDF & 0x6EBF;
        W.llllIllIIl[165] = 0xFFFFBABD & 0x4FCF;
        W.llllIllIIl[166] = -(0xFFFFE5FB & 0x3F65) & (0xFFFFAFF3 & Short.MAX_VALUE);
        W.llllIllIIl[167] = -(0xFFFFFFFF & 0x5075) & (0xFFFFDAFF & 0x7FFD);
        W.llllIllIIl[168] = -(0xFFFFD1FF & 0x7F73) & (0xFFFFDBFE & 0x7FF3);
        W.llllIllIIl[169] = -(0xFFFFF27F & 0x4DFD) & (0xFFFFCFFF & 0x7DFD);
        W.llllIllIIl[170] = -(0xFFFFE737 & 0x79CF) & (0xFFFFFFFF & 0x6BAF);
        W.llllIllIIl[171] = 0xFFFFEFF7 & 0x1DA8;
        W.llllIllIIl[172] = 0x4A ^ 0x1E;
        W.llllIllIIl[173] = 0xF5 ^ 0x90 ^ (0x6D ^ 0x5D);
        W.llllIllIIl[174] = 0x7A ^ 0x37 ^ (0x61 ^ 0x7A);
        W.llllIllIIl[175] = 0xC3 ^ 0x94;
        W.llllIllIIl[176] = 0x6C ^ 0x56 ^ (0 ^ 0x63);
        W.llllIllIIl[177] = 0x6D ^ 0x33 ^ (8 ^ 0xC);
        W.llllIllIIl[178] = 0xF3 ^ 0xA8;
        W.llllIllIIl[179] = 0xD ^ 0x51;
        W.llllIllIIl[180] = 47 + 43 - -156 + 3 ^ 148 + 105 - 184 + 95;
        W.llllIllIIl[181] = 0x34 ^ 0x6B;
        W.llllIllIIl[182] = 0x1B ^ 0x7B;
        W.llllIllIIl[183] = "   ".length() ^ (0x24 ^ 0x46);
        W.llllIllIIl[184] = 0x83 ^ 0x9C ^ (2 ^ 0x7F);
        W.llllIllIIl[185] = 0x67 ^ 0x1D ^ (0xB1 ^ 0xA8);
        W.llllIllIIl[186] = 0x32 ^ 0x56;
        W.llllIllIIl[187] = 5 + 202 - 64 + 108 ^ 136 + 90 - 127 + 59;
        W.llllIllIIl[188] = 0xF0 ^ 0x96;
        W.llllIllIIl[189] = -(0xFFFF99B1 & 0x774F) & (0xFFFF9F77 & 0x7DFF);
        W.llllIllIIl[190] = -(0xFFFFF27B & 0x7DA6) & (0xFFFFFD77 & Short.MAX_VALUE);
        W.llllIllIIl[191] = -(0xFFFFEB82 & 0x54FF) & (0xFFFFFCFF & 0x4FEF);
        W.llllIllIIl[192] = 0xFFFFEDBB & 0x1F7F;
        W.llllIllIIl[193] = 0xFFFFAE4F & 0x7FF9;
        W.llllIllIIl[194] = 0x5A ^ 0 ^ (0xFE ^ 0xC3);
        W.llllIllIIl[195] = 0xFFFFD5FD & 0x3F7E;
        W.llllIllIIl[196] = 0xFFFFE7AE & 0x79F9;
        W.llllIllIIl[197] = -(0xFFFFECDB & 0x776F) & (0xFFFFF7FF & 0x6FCE);
        W.llllIllIIl[198] = 0xFFFF93BE & 0x6FF7;
        W.llllIllIIl[199] = 0xFFFFEFFF & 0x179E;
        W.llllIllIIl[200] = 0xFFFFAAFF & 0x77F6;
        W.llllIllIIl[201] = -(0xFFFFAB77 & 0x558E) & (0xFFFFBFCF & 0x6FFF);
        W.llllIllIIl[202] = -(0xFFFFFB02 & 0xCFF) & (0xFFFFEFDF & 0x7D7F);
        W.llllIllIIl[203] = 0xAB ^ 0xC3;
        W.llllIllIIl[204] = 0x2E ^ 0x47;
        W.llllIllIIl[205] = 0x31 ^ 0x5B;
        W.llllIllIIl[206] = 0xE0 ^ 0x8B;
        W.llllIllIIl[207] = 20 + 0 - -203 + 8 ^ 106 + 71 - 140 + 102;
        W.llllIllIIl[208] = 0x54 ^ 0x39;
        W.llllIllIIl[209] = 0xFFFFDEFF & 0x2B8F;
        W.llllIllIIl[210] = -(0xFFFFD5F3 & 0x7A5F) & (0xFFFFFDDF & 0x5FFB);
        W.llllIllIIl[211] = 0x5F ^ 0x31;
        W.llllIllIIl[212] = 0xFFFF9DDD & 0x6FAF;
        W.llllIllIIl[213] = 7 ^ 0x16 ^ (0xE1 ^ 0x9F);
        W.llllIllIIl[214] = 0xFFFFDEF7 & 0x2B9F;
        W.llllIllIIl[215] = 0xFFFFCDFF & 0x3F94;
        W.llllIllIIl[216] = 0x7B ^ 0x60 ^ (0x3B ^ 0x50);
        W.llllIllIIl[217] = -(0xFFFFF5AF & 0x6E79) & (0xFFFFFEBE & 0x6FFF);
        W.llllIllIIl[218] = 172 + 89 - 242 + 178 ^ 83 + 157 - 89 + 29;
        W.llllIllIIl[219] = -(0xFFFFE5FB & 0x3E1F) & (0xFFFFEFBB & 0x3EFF);
        W.llllIllIIl[220] = 0xFFFFADED & 0x5FB7;
        W.llllIllIIl[221] = 0x42 ^ 0x28 ^ (0x4C ^ 0x54);
        W.llllIllIIl[222] = 0xFFFFFDFE & 0xFB7;
        W.llllIllIIl[223] = -(0xFFFFBA63 & 0x67BE) & (0xFFFFEFFD & 0x3FBF);
        W.llllIllIIl[224] = 0x68 ^ 0x18 ^ "   ".length();
        W.llllIllIIl[225] = -(0xFFFFF15D & 0x5EB3) & (0xFFFFFFFF & 0x5DBF);
        W.llllIllIIl[226] = 0xFC ^ 0x88;
        W.llllIllIIl[227] = 0xD9 ^ 0xAC;
        W.llllIllIIl[228] = -(0xFFFFE5FF & 0x7A69) & (0xFFFFFFFF & 0x6DFE);
        W.llllIllIIl[229] = 0xFFFFFFB6 & 0xDED;
        W.llllIllIIl[230] = 0x42 ^ 0x34;
        W.llllIllIIl[231] = 0xFFFF8FFB & 0x7DAF;
        W.llllIllIIl[232] = 0x2C ^ 0x61 ^ (0xF8 ^ 0xC2);
        W.llllIllIIl[233] = 0xB7 ^ 0x85 ^ (0x39 ^ 0x73);
        W.llllIllIIl[234] = -(0xFFFFB61D & 0x79EF) & (0xFFFFFFBF & 0x3DFD);
        W.llllIllIIl[235] = 0xFFFF9FEF & 0x69B4;
        W.llllIllIIl[236] = -(0xFFFF9467 & 0x6FDE) & (0xFFFFCFFF & 0x3DEF);
        W.llllIllIIl[237] = -(0xFFFFF6EF & 0x5B93) & (0xFFFFFFEF & 0x5FFF);
        W.llllIllIIl[238] = 0x5A ^ 0x23;
    }

    @Override
    public String U() {
        return llllIlIlll[llllIllIIl[203]];
    }

    private static boolean llIlIIIlIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        W.llIlIIIIllIlI();
        W.llIlIIIIlIllI();
        bu = new ArrayList<d>();
        iS = llllIllIIl[27];
        iT = llllIllIIl[23];
        iV = new WorldArea(llllIllIIl[235], llllIllIIl[52], llllIllIIl[69], llllIllIIl[72], llllIllIIl[0]);
        iW = new WorldArea(llllIllIIl[235], llllIllIIl[52], llllIllIIl[69], llllIllIIl[72], llllIllIIl[1]);
        iX = new WorldArea(llllIllIIl[235], llllIllIIl[52], llllIllIIl[69], llllIllIIl[72], llllIllIIl[2]);
        iY = new WorldPoint(llllIllIIl[236], llllIllIIl[237], llllIllIIl[0]);
    }

    private static boolean llIlIIIIllllI(Object object) {
        return object != null;
    }

    private static boolean llIlIIIIllIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIIlIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
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
        WorldArea[] worldAreaArray = new WorldArea[llllIllIIl[68]];
        worldAreaArray[W.llllIllIIl[0]] = worldArea;
        worldAreaArray[W.llllIllIIl[1]] = worldArea2;
        worldAreaArray[W.llllIllIIl[2]] = worldArea3;
        worldAreaArray[W.llllIllIIl[9]] = worldArea4;
        worldAreaArray[W.llllIllIIl[16]] = worldArea5;
        worldAreaArray[W.llllIllIIl[18]] = worldArea6;
        worldAreaArray[W.llllIllIIl[20]] = worldArea7;
        worldAreaArray[W.llllIllIIl[22]] = worldArea8;
        worldAreaArray[W.llllIllIIl[24]] = worldArea9;
        worldAreaArray[W.llllIllIIl[26]] = worldArea10;
        worldAreaArray[W.llllIllIIl[11]] = worldArea11;
        worldAreaArray[W.llllIllIIl[49]] = worldArea12;
        worldAreaArray[W.llllIllIIl[63]] = worldArea13;
        worldAreaArray[W.llllIllIIl[64]] = worldArea14;
        worldAreaArray[W.llllIllIIl[53]] = worldArea15;
        worldAreaArray[W.llllIllIIl[38]] = worldArea16;
        worldAreaArray[W.llllIllIIl[65]] = worldArea17;
        worldAreaArray[W.llllIllIIl[66]] = worldArea18;
        worldAreaArray[W.llllIllIIl[54]] = worldArea19;
        worldAreaArray[W.llllIllIIl[67]] = worldArea20;
        worldAreaArray[W.llllIllIIl[40]] = worldArea21;
        WorldArea[] worldAreaArray2 = worldAreaArray;
        int[] nArray = new int[llllIllIIl[1]];
        nArray[W.llllIllIIl[0]] = llllIllIIl[193];
        if (W.llIlIIIIllllI(TileItems.getNearest((int[])nArray))) {
            void lllllllllllllllllIlIlIIIlllIIlII;
            System.out.println(llllIlIlll[llllIllIIl[194]]);
            int lllllllllllllllllIlIlIIIlllIIIll = llllIllIIl[0];
            while (W.llIlIIIIlllII(lllllllllllllllllIlIlIIIlllIIIll, ((void)lllllllllllllllllIlIlIIIlllIIlII).length)) {
                int[] nArray2 = new int[llllIllIIl[1]];
                nArray2[W.llllIllIIl[0]] = llllIllIIl[193];
                if (W.llIlIIIIllIll(lllllllllllllllllIlIlIIIlllIIlII[lllllllllllllllllIlIlIIIlllIIIll].contains(TileItems.getNearest((int[])nArray2).getWorldLocation()) ? 1 : 0) && W.llIlIIIIllIll(lllllllllllllllllIlIlIIIlllIIlII[lllllllllllllllllIlIlIIIlllIIIll].contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    return llllIllIIl[1];
                }
                ++lllllllllllllllllIlIlIIIlllIIIll;
                "".length();
                if ((0xBF ^ 0xBB) >= " ".length()) continue;
                return ((0x50 ^ 0x5A) & ~(0x36 ^ 0x3C)) != 0;
            }
        }
        return llllIllIIl[0];
    }

    private static String llIlIIIIIlIII(String lllllllllllllllllIlIlIIIlIIIlllI, String lllllllllllllllllIlIlIIIlIIIlIII) {
        lllllllllllllllllIlIlIIIlIIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllllIlIlIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlIlIIIlIIIllII = new StringBuilder();
        char[] lllllllllllllllllIlIlIIIlIIIlIll = lllllllllllllllllIlIlIIIlIIIlIII.toCharArray();
        int lllllllllllllllllIlIlIIIlIIIlIlI = llllIllIIl[0];
        char[] lllllllllllllllllIlIlIIIlIIIIlII = lllllllllllllllllIlIlIIIlIIIlllI.toCharArray();
        int lllllllllllllllllIlIlIIIlIIIIIll = lllllllllllllllllIlIlIIIlIIIIlII.length;
        int lllllllllllllllllIlIlIIIlIIIIIlI = llllIllIIl[0];
        while (W.llIlIIIIlllII(lllllllllllllllllIlIlIIIlIIIIIlI, lllllllllllllllllIlIlIIIlIIIIIll)) {
            char lllllllllllllllllIlIlIIIlIIIllll = lllllllllllllllllIlIlIIIlIIIIlII[lllllllllllllllllIlIlIIIlIIIIIlI];
            lllllllllllllllllIlIlIIIlIIIllII.append((char)(lllllllllllllllllIlIlIIIlIIIllll ^ lllllllllllllllllIlIlIIIlIIIlIll[lllllllllllllllllIlIlIIIlIIIlIlI % lllllllllllllllllIlIlIIIlIIIlIll.length]));
            "".length();
            ++lllllllllllllllllIlIlIIIlIIIlIlI;
            ++lllllllllllllllllIlIlIIIlIIIIIlI;
            "".length();
            if (-" ".length() != "  ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIlIlIIIlIIIllII);
    }

    private static boolean llIlIIIlIIIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIIIIlllll(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIlIIIIIIlll(String lllllllllllllllllIlIlIIIIllIllII, String lllllllllllllllllIlIlIIIIllIlIll) {
        try {
            SecretKeySpec lllllllllllllllllIlIlIIIIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlIlIIIIllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlIlIIIIllIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlIlIIIIllIlllI.init(llllIllIIl[2], lllllllllllllllllIlIlIIIIllIllll);
            return new String(lllllllllllllllllIlIlIIIIllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlIlIIIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIlIlIIIIllIllIl) {
            lllllllllllllllllIlIlIIIIllIllIl.printStackTrace();
            return null;
        }
    }
}

