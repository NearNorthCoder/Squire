package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import gg.squire.mixology.SquireMixology;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/s.class */
public class s {
    private static /* synthetic */ String[] lllllllllIIl;
    private static /* synthetic */ int[] llllllllllIl;
    private static final /* synthetic */ WorldArea af;
    public static final /* synthetic */ ThreadLocalRandom ae;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean h() {
        t[] values = t.values();
        int lllllllllllllllIIlIIIIlIIlIIIIlI = values.length;
        int lllllllllllllllIIlIIIIlIIlIIIIIl = llllllllllIl[1];
        while (lIIlIlIllllIlII(lllllllllllllllIIlIIIIlIIlIIIIIl, lllllllllllllllIIlIIIIlIIlIIIIlI)) {
            t tVar = values[lllllllllllllllIIlIIIIlIIlIIIIIl];
            int[] iArr = new int[llllllllllIl[2]];
            iArr[llllllllllIl[1]] = tVar.o();
            if (lIIlIlIllllIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                return llllllllllIl[2];
            }
            lllllllllllllllIIlIIIIlIIlIIIIIl++;
            "".length();
            if ((-"  ".length()) > 0) {
                return (((190 ^ 180) & ((12 ^ 6) ^ (-1))) ^ (111 ^ 55)) & (((((7 + 154) - 16) + 63) ^ (((43 + 46) - 8) + 55)) ^ (-" ".length()));
            }
        }
        return llllllllllIl[1];
    }

    public static int b(String str) {
        String trim = Widgets.get(llllllllllIl[4], llllllllllIl[3]).getChild(llllllllllIl[3]).getText().replaceAll(lllllllllIIl[llllllllllIl[1]], lllllllllIIl[llllllllllIl[2]]).trim();
        String lllllllllllllllIIlIIIIlIIllIlIIl = Widgets.get(llllllllllIl[4], llllllllllIl[3]).getChild(llllllllllIl[5]).getText().replaceAll(lllllllllIIl[llllllllllIl[3]], lllllllllIIl[llllllllllIl[0]]).trim();
        return lIIlIlIllllIlIl(trim.equals(str) ? 1 : 0) ? Widgets.get(llllllllllIl[4], llllllllllIl[3]).getChild(llllllllllIl[2]).getSpriteId() : lIIlIlIllllIlIl(lllllllllllllllIIlIIIIlIIllIlIIl.equals(str) ? 1 : 0) ? Widgets.get(llllllllllIl[4], llllllllllIl[3]).getChild(llllllllllIl[0]).getSpriteId() : lIIlIlIllllIlIl(Widgets.get(llllllllllIl[4], llllllllllIl[3]).getChild(llllllllllIl[6]).getText().replaceAll(lllllllllIIl[llllllllllIl[5]], lllllllllIIl[llllllllllIl[7]]).trim().equals(str) ? 1 : 0) ? Widgets.get(llllllllllIl[4], llllllllllIl[3]).getChild(llllllllllIl[7]).getSpriteId() : llllllllllIl[8];
    }

    public static t d(String str) {
        t[] values = t.values();
        int length = values.length;
        int i = llllllllllIl[1];
        while (lIIlIlIllllIlII(i, length)) {
            t tVar = values[i];
            if (lIIlIlIllllIlIl(tVar.a().equalsIgnoreCase(str) ? 1 : 0)) {
                return tVar;
            }
            i++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return null;
    }

    private static t a(t... tVarArr) {
        t tVar = null;
        int i = llllllllllIl[1];
        int length = tVarArr.length;
        int i2 = llllllllllIl[1];
        while (lIIlIlIllllIlII(i2, length)) {
            t tVar2 = tVarArr[i2];
            if (lIIlIlIllllIIlI(tVar2) && lIIlIlIllllIllI(tVar2.p(), i)) {
                i = tVar2.p();
                tVar = tVar2;
            }
            i2++;
            "".length();
            if ((((((30 + 19) - 27) + 105) ^ (36 ^ 118)) & (((((1 + 124) - 29) + 58) ^ (((125 + 37) - 31) + 52)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return tVar;
    }

    private static String lIIlIlIlllIIIll(String lllllllllllllllIIlIIIIIlllIlIIlI, String lllllllllllllllIIlIIIIIlllIlIIIl) {
        String lllllllllllllllIIlIIIIIlllIlIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIIIIlllIlIIIl.toCharArray();
        int lllllllllllllllIIlIIIIIlllIIlIIl = llllllllllIl[1];
        char[] charArray2 = lllllllllllllllIIlIIIIIlllIlIIlI2.toCharArray();
        int length = charArray2.length;
        int lllllllllllllllIIlIIIIIlllIIIllI = llllllllllIl[1];
        while (lIIlIlIllllIlII(lllllllllllllllIIlIIIIIlllIIIllI, length)) {
            sb.append((char) (charArray2[lllllllllllllllIIlIIIIIlllIIIllI] ^ charArray[lllllllllllllllIIlIIIIIlllIIlIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIIIIIlllIIlIIl++;
            lllllllllllllllIIlIIIIIlllIIIllI++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean f() {
        t[] values = t.values();
        int length = values.length;
        int i = llllllllllIl[1];
        while (lIIlIlIllllIlII(i, length)) {
            t tVar = values[i];
            int[] iArr = new int[llllllllllIl[2]];
            iArr[llllllllllIl[1]] = tVar.n();
            if (lIIlIlIllllIIll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llllllllllIl[2]];
                iArr2[llllllllllIl[1]] = tVar.o();
                if (!lIIlIlIllllIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    i++;
                    "".length();
                    if ((20 ^ 17) <= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
            return llllllllllIl[2];
        }
        return llllllllllIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public static boolean i() {
        if (!lIIlIlIlllllIlI(Vars.getBit(llllllllllIl[33])) && !lIIlIlIlllllIlI(Vars.getBit(llllllllllIl[34])) && !lIIlIlIlllllIlI(Vars.getBit(llllllllllIl[35]))) {
            return llllllllllIl[1];
        }
        return llllllllllIl[2];
    }

    private static boolean lIIlIlIllllIlIl(int i) {
        return i != 0;
    }

    private static String lIIlIlIlllIIIlI(String lllllllllllllllIIlIIIIIllllIIIlI, String lllllllllllllllIIlIIIIIllllIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIllllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIllllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllllllIl[3], lllllllllllllllIIlIIIIIllllIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIllllIIIll) {
            lllllllllllllllIIlIIIIIllllIIIll.printStackTrace();
            return null;
        }
    }

    public static int e(String str) {
        t[] values = t.values();
        int length = values.length;
        int i = llllllllllIl[1];
        while (lIIlIlIllllIlII(i, length)) {
            t tVar = values[i];
            if (lIIlIlIllllIlIl(tVar.a().equalsIgnoreCase(str) ? 1 : 0)) {
                return tVar.o();
            }
            i++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return (189 ^ 132) & ((70 ^ 127) ^ (-1));
            }
        }
        return llllllllllIl[8];
    }

    static {
        lIIlIlIllllIIIl();
        lIIlIlIllllIIII();
        ae = ThreadLocalRandom.current();
        af = new WorldArea(llllllllllIl[41], llllllllllIl[42], llllllllllIl[27], llllllllllIl[40], llllllllllIl[1]);
    }

    private static boolean lIIlIlIllllIlll(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIlllllIII(int i, int i2) {
        return i != i2;
    }

    private static void lIIlIlIllllIIIl() {
        llllllllllIl = new int[44];
        llllllllllIl[0] = "   ".length();
        llllllllllIl[1] = ((151 ^ 160) ^ (90 ^ 115)) & (((205 ^ 128) ^ (122 ^ 41)) ^ (-" ".length()));
        llllllllllIl[2] = " ".length();
        llllllllllIl[3] = "  ".length();
        llllllllllIl[4] = (-((-6321) & 30901)) & (-5129) & 30590;
        llllllllllIl[5] = (121 ^ 63) ^ (230 ^ 164);
        llllllllllIl[6] = (((7 + 7) - (-120)) + 1) ^ (((19 + 88) - (-4)) + 18);
        llllllllllIl[7] = (10 ^ 88) ^ (80 ^ 7);
        llllllllllIl[8] = -" ".length();
        llllllllllIl[9] = 191 ^ 184;
        llllllllllIl[10] = 90 ^ 82;
        llllllllllIl[11] = (41 ^ 48) ^ (72 ^ 88);
        llllllllllIl[12] = (-((-17941) & 22423)) & (-16386) & 32191;
        llllllllllIl[13] = (-21377) & 32701;
        llllllllllIl[14] = (-21249) & 32574;
        llllllllllIl[15] = 84 ^ 94;
        llllllllllIl[16] = (((55 + 80) - (-32)) + 1) ^ (((43 + 56) - 82) + 146);
        llllllllllIl[17] = (175 ^ 197) ^ (111 ^ 9);
        llllllllllIl[18] = 121 ^ 116;
        llllllllllIl[19] = 121 ^ 119;
        llllllllllIl[20] = (112 ^ 107) ^ (3 ^ 23);
        llllllllllIl[21] = 38 ^ 54;
        llllllllllIl[22] = (((22 + 72) - 61) + 122) ^ (((51 + 106) - 82) + 63);
        llllllllllIl[23] = 212 ^ 198;
        llllllllllIl[24] = (29 ^ 66) ^ (15 ^ 67);
        llllllllllIl[25] = (21 ^ 81) ^ (0 ^ 80);
        llllllllllIl[26] = 121 ^ 108;
        llllllllllIl[27] = (((16 + 92) - 83) + 106) ^ (((11 + 46) - (-41)) + 51);
        llllllllllIl[28] = (((39 + 35) - 35) + 104) ^ (((23 + 34) - (-48)) + 47);
        llllllllllIl[29] = (201 ^ 152) ^ (107 ^ 34);
        llllllllllIl[30] = 16 ^ 9;
        llllllllllIl[31] = (((137 + 135) - 139) + 33) ^ (((90 + 151) - 189) + 136);
        llllllllllIl[32] = (111 ^ 62) ^ (215 ^ 157);
        llllllllllIl[33] = (-20481) & 31807;
        llllllllllIl[34] = (-16901) & 28228;
        llllllllllIl[35] = (-(((61 + 67) - 22) + 43)) & (-35) & 11511;
        llllllllllIl[36] = (((119 + 90) - 78) + 28) ^ (((111 + 51) - 155) + 124);
        llllllllllIl[37] = 40 ^ 53;
        llllllllllIl[38] = (((7 + 122) - (-19)) + 13) ^ (((60 + 188) - 208) + 151);
        llllllllllIl[39] = (42 ^ 96) ^ (109 ^ 56);
        llllllllllIl[40] = 5 ^ 37;
        llllllllllIl[41] = (-27137) & 28519;
        llllllllllIl[42] = (-16417) & 25720;
        llllllllllIl[43] = 163 ^ 130;
    }

    private static boolean lIIlIlIlllllIIl(int i, int i2) {
        return i == i2;
    }

    public static t a(String str, String str2, String str3, String lllllllllllllllIIlIIIIlIlIIIlIlI) {
        ArrayList arrayList = new ArrayList();
        if (lIIlIlIllllIIlI(str2)) {
            t d = d(str2);
            if (lIIlIlIllllIIlI(d)) {
                arrayList.add(d);
                "".length();
            }
        }
        if (lIIlIlIllllIIlI(str3)) {
            t d2 = d(str3);
            if (lIIlIlIllllIIlI(d2)) {
                arrayList.add(d2);
                "".length();
            }
        }
        if (lIIlIlIllllIIlI(lllllllllllllllIIlIIIIlIlIIIlIlI)) {
            t d3 = d(lllllllllllllllIIlIIIIlIlIIIlIlI);
            if (lIIlIlIllllIIlI(d3)) {
                arrayList.add(d3);
                "".length();
            }
        }
        List list = (List) arrayList.stream().filter(tVar -> {
            return tVar.q().equalsIgnoreCase(str);
        }).collect(Collectors.toList());
        return lIIlIlIllllIIll(list.isEmpty() ? 1 : 0) ? (t) list.stream().max(Comparator.comparingInt((v0) -> {
            return v0.p();
        })).orElse(null) : (t) arrayList.stream().max(Comparator.comparingInt((v0) -> {
            return v0.p();
        })).orElse(null);
    }

    public static t a(String str, String str2, String str3) {
        t a = a(str);
        t a2 = a(str2);
        t a3 = a(str3);
        t[] tVarArr = new t[llllllllllIl[0]];
        tVarArr[llllllllllIl[1]] = a;
        tVarArr[llllllllllIl[2]] = a2;
        tVarArr[llllllllllIl[3]] = a3;
        return a(tVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    public static boolean c(String str) {
        t d = d(str);
        if (lIIlIlIllllIlll(d)) {
            System.out.println(str);
            System.out.println(lllllllllIIl[llllllllllIl[6]]);
            return llllllllllIl[1];
        }
        String[] strArr = new String[llllllllllIl[2]];
        strArr[llllllllllIl[1]] = lllllllllIIl[llllllllllIl[9]];
        TileObject nearest = TileObjects.getNearest(strArr);
        String[] strArr2 = new String[llllllllllIl[2]];
        strArr2[llllllllllIl[1]] = lllllllllIIl[llllllllllIl[10]];
        TileObject nearest2 = TileObjects.getNearest(strArr2);
        String[] strArr3 = new String[llllllllllIl[2]];
        strArr3[llllllllllIl[1]] = lllllllllIIl[llllllllllIl[11]];
        TileObject nearest3 = TileObjects.getNearest(strArr3);
        int i = llllllllllIl[12];
        int lllllllllllllllIIlIIIIlIIlIllIIl = llllllllllIl[13];
        int i2 = llllllllllIl[14];
        if (lIIlIlIlllllIII(Vars.getBit(i), d.m()) && lIIlIlIllllIIll(Vars.getBit(i))) {
            if (lIIlIlIlllllIIl(d.m(), llllllllllIl[0])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[15]];
                nearest.interact(lllllllllIIl[llllllllllIl[16]]);
                return llllllllllIl[1];
            } else if (lIIlIlIlllllIIl(d.m(), llllllllllIl[2])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[17]];
                nearest2.interact(lllllllllIIl[llllllllllIl[18]]);
                return llllllllllIl[1];
            } else if (lIIlIlIlllllIIl(d.m(), llllllllllIl[3])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[19]];
                nearest3.interact(lllllllllIIl[llllllllllIl[20]]);
                return llllllllllIl[1];
            } else {
                return llllllllllIl[1];
            }
        } else if (lIIlIlIlllllIII(Vars.getBit(lllllllllllllllIIlIIIIlIIlIllIIl), d.k()) && lIIlIlIllllIIll(Vars.getBit(lllllllllllllllIIlIIIIlIIlIllIIl))) {
            if (lIIlIlIlllllIIl(d.k(), llllllllllIl[0])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[21]];
                nearest.interact(lllllllllIIl[llllllllllIl[22]]);
                return llllllllllIl[1];
            } else if (lIIlIlIlllllIIl(d.k(), llllllllllIl[2])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[23]];
                nearest2.interact(lllllllllIIl[llllllllllIl[24]]);
                return llllllllllIl[1];
            } else if (lIIlIlIlllllIIl(d.k(), llllllllllIl[3])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[25]];
                nearest3.interact(lllllllllIIl[llllllllllIl[26]]);
                return llllllllllIl[1];
            } else {
                return llllllllllIl[1];
            }
        } else if (lIIlIlIlllllIII(Vars.getBit(i2), d.l()) && lIIlIlIllllIIll(Vars.getBit(i2))) {
            if (lIIlIlIlllllIIl(d.l(), llllllllllIl[0])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[27]];
                nearest.interact(lllllllllIIl[llllllllllIl[28]]);
                return llllllllllIl[1];
            } else if (lIIlIlIlllllIIl(d.l(), llllllllllIl[2])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[29]];
                nearest2.interact(lllllllllIIl[llllllllllIl[30]]);
                return llllllllllIl[1];
            } else if (lIIlIlIlllllIIl(d.l(), llllllllllIl[3])) {
                SquireMixology.g = lllllllllIIl[llllllllllIl[31]];
                nearest3.interact(lllllllllIIl[llllllllllIl[32]]);
                return llllllllllIl[1];
            } else {
                return llllllllllIl[1];
            }
        } else {
            return llllllllllIl[2];
        }
    }

    private static boolean lIIlIlIllllIIll(int i) {
        return i == 0;
    }

    private static String lIIlIlIlllIIlII(String lllllllllllllllIIlIIIIIllIllllIl, String lllllllllllllllIIlIIIIIllIllllII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIIlllIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIIllIllllII.getBytes(StandardCharsets.UTF_8)), llllllllllIl[10]), "DES");
            Cipher lllllllllllllllIIlIIIIIllIllllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIIIllIllllll.init(llllllllllIl[3], lllllllllllllllIIlIIIIIlllIIIIII);
            return new String(lllllllllllllllIIlIIIIIllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIIllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIIllIlllllI) {
            lllllllllllllllIIlIIIIIllIlllllI.printStackTrace();
            return null;
        }
    }

    public static int f(String str) {
        t[] values = t.values();
        int length = values.length;
        int i = llllllllllIl[1];
        while (lIIlIlIllllIlII(i, length)) {
            t tVar = values[i];
            if (lIIlIlIllllIlIl(tVar.a().equalsIgnoreCase(str) ? 1 : 0)) {
                return tVar.n();
            }
            i++;
            "".length();
            if ((((89 ^ 9) ^ (127 ^ 100)) & (((((126 + 18) - 54) + 51) ^ (((131 + 127) - 122) + 62)) ^ (-" ".length()))) != 0) {
                return ((((34 + 198) - 134) + 124) ^ (((64 + 18) - 69) + 115)) & (((243 ^ 150) ^ (67 ^ 120)) ^ (-" ".length()));
            }
        }
        return llllllllllIl[8];
    }

    private static void lIIlIlIllllIIII() {
        lllllllllIIl = new String[llllllllllIl[43]];
        lllllllllIIl[llllllllllIl[1]] = lIIlIlIlllIIIlI("zoCR/b+dUwltLWBKL7qZrQ==", "tKaDp");
        lllllllllIIl[llllllllllIl[2]] = lIIlIlIlllIIIll("", "ciqDk");
        lllllllllIIl[llllllllllIl[3]] = lIIlIlIlllIIlII("iF86HhQlYor+DgknIIqtgg==", "ZdsED");
        lllllllllIIl[llllllllllIl[0]] = lIIlIlIlllIIIlI("25wiB9orx6o=", "OlnXD");
        lllllllllIIl[llllllllllIl[5]] = lIIlIlIlllIIIll("MTZDCUdDb1YJRg==", "mEiUo");
        lllllllllIIl[llllllllllIl[7]] = lIIlIlIlllIIIlI("48aqkaJ7YAg=", "UJNMh");
        lllllllllIIl[llllllllllIl[6]] = lIIlIlIlllIIlII("Gs1oEUmRyygP8O5fcWREUa0Cy9qP3aKF", "OkAvs");
        lllllllllIIl[llllllllllIl[9]] = lIIlIlIlllIIIll("DT8pbBwkMCk+", "AFLLp");
        lllllllllIIl[llllllllllIl[10]] = lIIlIlIlllIIIlI("b0f9WYIKaBZgbsvNE0qwCw==", "rdPjN");
        lllllllllIIl[llllllllllIl[11]] = lIIlIlIlllIIIlI("4eae5eEKKCVwHSLNcKLf2Q==", "jgWZd");
        lllllllllIIl[llllllllllIl[15]] = lIIlIlIlllIIIll("DT4BGSo2K0QHMiduCA49Jzw=", "BNdkK");
        lllllllllIIl[llllllllllIl[16]] = lIIlIlIlllIIIll("OxYrChMAAw==", "tfNxr");
        lllllllllIIl[llllllllllIl[17]] = lIIlIlIlllIIIll("AQAWKhU6FVM1GzZQHz0CKwI=", "NpsXt");
        lllllllllIIl[llllllllllIl[18]] = lIIlIlIlllIIIlI("ZJsqR1vQS2A=", "jBEwb");
        lllllllllIIl[llllllllllIl[19]] = lIIlIlIlllIIIlI("5IWmapZHsPeWEYMCbsP2IAnsSGgS9Amx", "IxkxO");
        lllllllllIIl[llllllllllIl[20]] = lIIlIlIlllIIlII("5dfuU954IXc=", "pklTe");
        lllllllllIIl[llllllllllIl[21]] = lIIlIlIlllIIIll("DgknNjc1HGIoLyRZLiEgJAs=", "AyBDV");
        lllllllllIIl[llllllllllIl[22]] = lIIlIlIlllIIIlI("Q5JVYvX7E3k=", "EAJaJ");
        lllllllllIIl[llllllllllIl[23]] = lIIlIlIlllIIlII("Oa6QxSnNFpHW76hf07wFEr8e7AmT6H8V", "TCylh");
        lllllllllIIl[llllllllllIl[24]] = lIIlIlIlllIIIll("DBULPAk3AA==", "CenNh");
        lllllllllIIl[llllllllllIl[25]] = lIIlIlIlllIIIll("PBMCFysHBkcELRJDCwA8FhE=", "scgeJ");
        lllllllllIIl[llllllllllIl[26]] = lIIlIlIlllIIIlI("tVs3b/A1+78=", "VAVAh");
        lllllllllIIl[llllllllllIl[27]] = lIIlIlIlllIIlII("yxPidehDYVgh8is+oPanNn11Lic89E9f", "FglYE");
        lllllllllIIl[llllllllllIl[28]] = lIIlIlIlllIIlII("sJAu4QQxLcU=", "XHjtT");
        lllllllllIIl[llllllllllIl[29]] = lIIlIlIlllIIIlI("rP7QUl15Uf/eCNoAI57eotUD1+LHPyqd", "DJwrx");
        lllllllllIIl[llllllllllIl[30]] = lIIlIlIlllIIIlI("nkBu6Qp+zYU=", "gRccs");
        lllllllllIIl[llllllllllIl[31]] = lIIlIlIlllIIIll("GCEAIg4jNEUxCDZxCTUZMiM=", "WQePo");
        lllllllllIIl[llllllllllIl[32]] = lIIlIlIlllIIIll("Kh8SFAwRCg==", "eowfm");
        lllllllllIIl[llllllllllIl[36]] = lIIlIlIlllIIIlI("HWSEy84tqMkS4XWz2vaLsHndcqWKu52rFdAJ5/ZtvNK24I7HRuWsrw==", "shbGF");
        lllllllllIIl[llllllllllIl[37]] = lIIlIlIlllIIIlI("lX8S97hu4oUHXbfhtaxDEcnZQOCFL1geztkQ8ltvUg0Bpe+7UGf+Dg==", "aUMQl");
        lllllllllIIl[llllllllllIl[38]] = lIIlIlIlllIIlII("wxHvWRVJpCzuHlOrQ/qal/v1wz9GazZgcXmaURNSf4vpD+txfkrzAQ==", "wPdDR");
        lllllllllIIl[llllllllllIl[39]] = lIIlIlIlllIIIll("FwA9AxdxHycZU2NPLgQdOBwgCBdxDiYJUyEAPE1BcQY7TRYgGikBUyUAaB0cJU97", "QoHms");
        lllllllllIIl[llllllllllIl[40]] = lIIlIlIlllIIIll("Nyx0OQkNQ2dpBxcHdC8JDA0waRYWF3R6RgwNMg==", "ycTIf");
    }

    private static boolean lIIlIlIllllIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlIllllIllI(int i, int i2) {
        return i > i2;
    }

    private static t a(String str) {
        t[] values = t.values();
        int length = values.length;
        int i = llllllllllIl[1];
        while (lIIlIlIllllIlII(i, length)) {
            t tVar = values[i];
            if (lIIlIlIllllIlIl(tVar.a().equalsIgnoreCase(str) ? 1 : 0)) {
                return tVar;
            }
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public static boolean a(int i, int i2, int i3) {
        if (lIIlIlIllllIlIl(Players.getLocal().isAnimating() ? 1 : 0) && lIIlIlIllllIIll(SquireMixology.A ? 1 : 0)) {
            Static.getClient().getGraphicsObjects().forEach(graphicsObject -> {
                if (lIIlIlIlllllIIl(graphicsObject.getId(), i) && lIIlIlIllllIIll(SquireMixology.A ? 1 : 0)) {
                    int[] iArr = new int[llllllllllIl[2]];
                    iArr[llllllllllIl[1]] = i3;
                    TileObjects.getNearest(iArr).interact(llllllllllIl[1]);
                    SquireMixology.A = llllllllllIl[2];
                }
            });
            return llllllllllIl[1];
        }
        if ((!lIIlIlIlllllIlI(Vars.getBit(i2)) || !lIIlIlIllllIIll(Players.getLocal().isAnimating() ? 1 : 0)) && lIIlIlIllllIIll(g() ? 1 : 0)) {
            return llllllllllIl[1];
        }
        return llllllllllIl[2];
    }

    public static boolean e() {
        return af.contains(Players.getLocal().getWorldLocation());
    }

    public static void j() {
        int i = SquireMixology.u;
        int i2 = SquireMixology.v;
        int i3 = SquireMixology.w;
        int f = f(SquireMixology.m);
        int e = e(SquireMixology.m);
        int f2 = f(SquireMixology.n);
        int e2 = e(SquireMixology.n);
        int f3 = f(SquireMixology.f0o);
        int e3 = e(SquireMixology.f0o);
        String str = SquireMixology.m;
        String str2 = SquireMixology.n;
        String str3 = SquireMixology.f0o;
        int[] iArr = new int[llllllllllIl[2]];
        iArr[llllllllllIl[1]] = e;
        if (lIIlIlIllllIIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llllllllllIl[2]];
            iArr2[llllllllllIl[1]] = f;
            if (lIIlIlIllllIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                SquireMixology.x = SquireMixology.r;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
        int[] iArr3 = new int[llllllllllIl[2]];
        iArr3[llllllllllIl[1]] = e;
        if (lIIlIlIllllIlIl(Inventory.contains(iArr3) ? 1 : 0) && lIIlIlIllllIlIl(str2.equalsIgnoreCase(str) ? 1 : 0)) {
            int[] iArr4 = new int[llllllllllIl[2]];
            iArr4[llllllllllIl[1]] = f2;
            if (lIIlIlIllllIlIl(Inventory.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[llllllllllIl[2]];
                iArr5[llllllllllIl[1]] = e;
                if (lIIlIlIlllllIIl(Inventory.getCount(iArr5), llllllllllIl[2])) {
                    System.out.println(lllllllllIIl[llllllllllIl[36]]);
                    SquireMixology.x = SquireMixology.s;
                    System.out.println("Current: " + SquireMixology.x);
                    return;
                }
            }
        }
        int[] iArr6 = new int[llllllllllIl[2]];
        iArr6[llllllllllIl[1]] = e;
        if (lIIlIlIllllIlIl(Inventory.contains(iArr6) ? 1 : 0) && lIIlIlIllllIlIl(str.equalsIgnoreCase(str3) ? 1 : 0)) {
            int[] iArr7 = new int[llllllllllIl[2]];
            iArr7[llllllllllIl[1]] = f3;
            if (lIIlIlIllllIlIl(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llllllllllIl[2]];
                iArr8[llllllllllIl[1]] = e;
                if (lIIlIlIlllllIIl(Inventory.getCount(iArr8), llllllllllIl[2])) {
                    System.out.println(lllllllllIIl[llllllllllIl[37]]);
                    SquireMixology.x = SquireMixology.t;
                    System.out.println("Current: " + SquireMixology.x);
                    return;
                }
            }
        }
        int[] iArr9 = new int[llllllllllIl[2]];
        iArr9[llllllllllIl[1]] = e;
        if (lIIlIlIllllIlIl(Inventory.contains(iArr9) ? 1 : 0) && lIIlIlIllllIlIl(str.equalsIgnoreCase(str3) ? 1 : 0)) {
            int[] iArr10 = new int[llllllllllIl[2]];
            iArr10[llllllllllIl[1]] = f3;
            if (lIIlIlIllllIlIl(Inventory.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llllllllllIl[2]];
                iArr11[llllllllllIl[1]] = e;
                if (lIIlIlIlllllIIl(Inventory.getCount(iArr11), llllllllllIl[3])) {
                    System.out.println(lllllllllIIl[llllllllllIl[38]]);
                    SquireMixology.x = SquireMixology.t;
                    System.out.println("Current: " + SquireMixology.x);
                    return;
                }
            }
        }
        int[] iArr12 = new int[llllllllllIl[2]];
        iArr12[llllllllllIl[1]] = e2;
        if (lIIlIlIllllIIll(Inventory.contains(iArr12) ? 1 : 0)) {
            int[] iArr13 = new int[llllllllllIl[2]];
            iArr13[llllllllllIl[1]] = f2;
            if (lIIlIlIllllIlIl(Inventory.contains(iArr13) ? 1 : 0)) {
                SquireMixology.x = SquireMixology.s;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
        int[] iArr14 = new int[llllllllllIl[2]];
        iArr14[llllllllllIl[1]] = e2;
        if (lIIlIlIllllIlIl(Inventory.contains(iArr14) ? 1 : 0) && lIIlIlIllllIlIl(str2.equalsIgnoreCase(str3) ? 1 : 0)) {
            int[] iArr15 = new int[llllllllllIl[2]];
            iArr15[llllllllllIl[1]] = f3;
            if (lIIlIlIllllIlIl(Inventory.contains(iArr15) ? 1 : 0)) {
                System.out.println(lllllllllIIl[llllllllllIl[39]]);
                SquireMixology.x = SquireMixology.t;
                System.out.println("Current: " + SquireMixology.x);
                return;
            }
        }
        int[] iArr16 = new int[llllllllllIl[2]];
        iArr16[llllllllllIl[1]] = e3;
        if (lIIlIlIllllIIll(Inventory.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[llllllllllIl[2]];
            iArr17[llllllllllIl[1]] = f3;
            if (lIIlIlIllllIlIl(Inventory.contains(iArr17) ? 1 : 0)) {
                System.out.println(lllllllllIIl[llllllllllIl[40]]);
                SquireMixology.x = SquireMixology.t;
                System.out.println("Current: " + SquireMixology.x);
            }
        }
    }

    private static boolean lIIlIlIllllIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlIlllllIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean g() {
        t[] values = t.values();
        int length = values.length;
        int i = llllllllllIl[1];
        while (lIIlIlIllllIlII(i, length)) {
            t tVar = values[i];
            int[] iArr = new int[llllllllllIl[2]];
            iArr[llllllllllIl[1]] = tVar.n();
            if (lIIlIlIllllIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                return llllllllllIl[2];
            }
            i++;
            "".length();
            if ((" ".length() & (" ".length() ^ (-1))) == "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llllllllllIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    public static boolean b(String str, String str2, String str3) {
        int i = llllllllllIl[1];
        int i2 = llllllllllIl[1];
        int i3 = llllllllllIl[1];
        t[] values = t.values();
        int lllllllllllllllIIlIIIIlIIIlIIlII = values.length;
        int lllllllllllllllIIlIIIIlIIIlIIIll = llllllllllIl[1];
        while (lIIlIlIllllIlII(lllllllllllllllIIlIIIIlIIIlIIIll, lllllllllllllllIIlIIIIlIIIlIIlII)) {
            t tVar = values[lllllllllllllllIIlIIIIlIIIlIIIll];
            if (lIIlIlIllllIlIl(tVar.a().equalsIgnoreCase(str) ? 1 : 0)) {
                i = tVar.o();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIIlIlIllllIlIl(tVar.a().equalsIgnoreCase(str2) ? 1 : 0)) {
                i2 = tVar.o();
                "".length();
                if ((((12 ^ 28) ^ (34 ^ 39)) & (((101 ^ 87) ^ (80 ^ 119)) ^ (-" ".length()))) != 0) {
                    return ((210 ^ 174) ^ (147 ^ 192)) & (((((109 + 41) - 93) + 180) ^ (((63 + 153) - 40) + 18)) ^ (-" ".length()));
                }
            } else if (lIIlIlIllllIlIl(tVar.a().equalsIgnoreCase(str3) ? 1 : 0)) {
                i3 = tVar.o();
                "".length();
                if (" ".length() != " ".length()) {
                    return ((((63 + 138) - 193) + 162) ^ (((99 + 57) - 71) + 50)) & (((87 ^ 38) ^ (201 ^ 149)) ^ (-" ".length()));
                }
            }
            lllllllllllllllIIlIIIIlIIIlIIIll++;
            "".length();
            if (" ".length() < (((81 ^ 59) ^ (10 ^ 88)) & (((62 ^ 103) ^ (161 ^ 192)) ^ (-" ".length())))) {
                return ((208 ^ 162) ^ (198 ^ 188)) & (((201 ^ 171) ^ (251 ^ 145)) ^ (-" ".length()));
            }
        }
        int[] iArr = new int[llllllllllIl[2]];
        iArr[llllllllllIl[1]] = i;
        if (lIIlIlIllllIlIl(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llllllllllIl[2]];
            iArr2[llllllllllIl[1]] = i2;
            if (lIIlIlIllllIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llllllllllIl[2]];
                iArr3[llllllllllIl[1]] = i3;
                if (lIIlIlIllllIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                    return llllllllllIl[2];
                }
            }
        }
        return llllllllllIl[1];
    }
}
