package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.client.util.Log;
import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/h.class */
public final class EnumC0007h {
    private /* synthetic */ Supplier<WorldArea> area;
    public static final /* synthetic */ EnumC0007h FLOOR_IV;
    private static /* synthetic */ int[] lllIIIlIllll;
    public static final /* synthetic */ EnumC0007h FLOOR_II;
    public static final /* synthetic */ EnumC0007h FLOOR_I;
    public static final /* synthetic */ EnumC0007h FLOOR_V;
    private static /* synthetic */ String[] lllIIIlIllIl;
    private /* synthetic */ int nextReq;
    public static final /* synthetic */ EnumC0007h FLOOR_III;
    private static final /* synthetic */ EnumC0007h[] $VALUES;

    private static void lIIIlIIlIIlllll() {
        lllIIIlIllll = new int[30];
        lllIIIlIllll[0] = "  ".length() & ("  ".length() ^ (-1));
        lllIIIlIllll[1] = " ".length();
        lllIIIlIllll[2] = (((85 + 105) - 140) + 188) ^ (((24 + 121) - 113) + 158);
        lllIIIlIllll[3] = "  ".length();
        lllIIIlIllll[4] = "   ".length();
        lllIIIlIllll[5] = (90 ^ 108) ^ (173 ^ 159);
        lllIIIlIllll[6] = (14 ^ 67) ^ (211 ^ 155);
        lllIIIlIllll[7] = (232 ^ 193) ^ (89 ^ 118);
        lllIIIlIllll[8] = 116 ^ 115;
        lllIIIlIllll[9] = (243 ^ 167) ^ (101 ^ 57);
        lllIIIlIllll[10] = (29 ^ 38) ^ (141 ^ 191);
        lllIIIlIllll[11] = 51 ^ 57;
        lllIIIlIllll[12] = 59 ^ 48;
        lllIIIlIllll[13] = (39 ^ 73) ^ (81 ^ 36);
        lllIIIlIllll[14] = 75 ^ 117;
        lllIIIlIllll[15] = (((2 + 52) - (-94)) + 35) ^ (((13 + 126) - 95) + 143);
        lllIIIlIllll[16] = (21 ^ 35) ^ (208 ^ 174);
        lllIIIlIllll[17] = 99 ^ 110;
        lllIIIlIllll[18] = 101 ^ 71;
        lllIIIlIllll[19] = (180 ^ 147) ^ (125 ^ 8);
        lllIIIlIllll[20] = 18 ^ 28;
        lllIIIlIllll[21] = (((111 + 95) - 127) + 77) ^ (((47 + 113) - 79) + 52);
        lllIIIlIllll[22] = (139 ^ 195) ^ (78 ^ 19);
        lllIIIlIllll[23] = 163 ^ 172;
        lllIIIlIllll[24] = 16 ^ 3;
        lllIIIlIllll[25] = 207 ^ 147;
        lllIIIlIllll[26] = (((103 + 24) - 35) + 71) ^ (((161 + 133) - 108) + 3);
        lllIIIlIllll[27] = (((99 + 78) - 113) + 75) ^ (((118 + 58) - 61) + 55);
        lllIIIlIllll[28] = (139 ^ 130) ^ (225 ^ 134);
        lllIIIlIllll[29] = (74 ^ 67) ^ (107 ^ 114);
    }

    public Supplier<WorldArea> K() {
        return this.area;
    }

    private static String lIIIlIIlIIllIlI(String lllllllllllllllIIllIlllIlIIlIIlI, String lllllllllllllllIIllIlllIlIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), lllIIIlIllll[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlIllll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlllIlIIlIIll) {
            lllllllllllllllIIllIlllIlIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIlIlIIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    public boolean J() {
        Player local = Players.getLocal();
        if (!lIIIlIIlIlIIIII(local) && !lIIIlIIlIlIIIIl(a((Locatable) local) ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIIIlIIlIlIIIll(tileObject.getName().toLowerCase().startsWith(lllIIIlIllIl[lllIIIlIllll[9]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIlIllll[1]];
                    strArr[lllIIIlIllll[0]] = lllIIIlIllIl[lllIIIlIllll[10]];
                    if (lIIIlIIlIlIIIll(tileObject.hasAction(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[lllIIIlIllll[1]];
                        strArr2[lllIIIlIllll[0]] = lllIIIlIllIl[lllIIIlIllll[11]];
                        if (lIIIlIIlIlIIIll(tileObject.hasAction(strArr2) ? 1 : 0)) {
                            ?? r0 = lllIIIlIllll[1];
                            "".length();
                            return (-"  ".length()) >= 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
                        }
                    }
                }
                return lllIIIlIllll[0];
            });
            if (lIIIlIIlIlIIIII(nearest)) {
                Log.error(lllIIIlIllIl[lllIIIlIllll[0]]);
                return lllIIIlIllll[0];
            } else if (lIIIlIIlIlIIIlI(Skills.getLevel(Skill.AGILITY), this.nextReq)) {
                nearest.interact(lllIIIlIllIl[lllIIIlIllll[1]]);
                return lllIIIlIllll[1];
            } else if (lIIIlIIlIlIIIlI(Movement.getRunEnergy(), lllIIIlIllll[2])) {
                nearest.interact(lllIIIlIllIl[lllIIIlIllll[3]]);
                return lllIIIlIllll[1];
            } else {
                TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIIlIIlIlIIIll(tileObject2.getName().startsWith(lllIIIlIllIl[lllIIIlIllll[7]]) ? 1 : 0)) {
                        String[] strArr = new String[lllIIIlIllll[1]];
                        strArr[lllIIIlIllll[0]] = lllIIIlIllIl[lllIIIlIllll[8]];
                        if (lIIIlIIlIlIIIll(tileObject2.hasAction(strArr) ? 1 : 0) && lIIIlIIlIlIIIll(this.area.get().contains(tileObject2) ? 1 : 0)) {
                            ?? r0 = lllIIIlIllll[1];
                            "".length();
                            return 0 != 0 ? ((20 ^ 40) ^ (45 ^ 24)) & (((((67 + 0) - 59) + 125) ^ (((123 + 16) - 33) + 34)) ^ (-" ".length())) : r0;
                        }
                    }
                    return lllIIIlIllll[0];
                });
                if (!lIIIlIIlIlIIIII(nearest2)) {
                    nearest2.interact(lllIIIlIllIl[lllIIIlIllll[6]]);
                    return lllIIIlIllll[1];
                }
                nearest.interact(lllIIIlIllIl[lllIIIlIllll[4]]);
                System.out.println(lllIIIlIllIl[lllIIIlIllll[5]]);
                return lllIIIlIllll[0];
            }
        }
        return lllIIIlIllll[0];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.area.get()));
        squireSepulchre.a(name());
    }

    public static EnumC0007h[] values() {
        return (EnumC0007h[]) $VALUES.clone();
    }

    private static boolean lIIIlIIlIlIIIIl(int i) {
        return i == 0;
    }

    static {
        lIIIlIIlIIlllll();
        lIIIlIIlIIlllIl();
        FLOOR_I = new EnumC0007h(lllIIIlIllIl[lllIIIlIllll[12]], lllIIIlIllll[0], new RegionPoint(lllIIIlIllll[13], lllIIIlIllll[13], lllIIIlIllll[1], C0001b.C), lllIIIlIllll[12], lllIIIlIllll[12], lllIIIlIllll[14]);
        FLOOR_II = new EnumC0007h(lllIIIlIllIl[lllIIIlIllll[15]], lllIIIlIllll[1], new RegionPoint(lllIIIlIllll[13], lllIIIlIllll[13], lllIIIlIllll[1], C0001b.G), lllIIIlIllll[12], lllIIIlIllll[12], lllIIIlIllll[16]);
        FLOOR_III = new EnumC0007h(lllIIIlIllIl[lllIIIlIllll[17]], lllIIIlIllll[3], new RegionPoint(lllIIIlIllll[13], lllIIIlIllll[18], lllIIIlIllll[1], C0001b.J), lllIIIlIllll[12], lllIIIlIllll[5], lllIIIlIllll[19]);
        FLOOR_IV = new EnumC0007h(lllIIIlIllIl[lllIIIlIllll[20]], lllIIIlIllll[4], new RegionPoint(lllIIIlIllll[21], lllIIIlIllll[22], lllIIIlIllll[1], C0001b.L), lllIIIlIllll[23], lllIIIlIllll[24], lllIIIlIllll[25]);
        FLOOR_V = new EnumC0007h(lllIIIlIllIl[lllIIIlIllll[23]], lllIIIlIllll[5], new RegionPoint(lllIIIlIllll[26], lllIIIlIllll[27], lllIIIlIllll[0], C0001b.N), lllIIIlIllll[6], lllIIIlIllll[5], lllIIIlIllll[28]);
        EnumC0007h[] enumC0007hArr = new EnumC0007h[lllIIIlIllll[6]];
        enumC0007hArr[lllIIIlIllll[0]] = FLOOR_I;
        enumC0007hArr[lllIIIlIllll[1]] = FLOOR_II;
        enumC0007hArr[lllIIIlIllll[3]] = FLOOR_III;
        enumC0007hArr[lllIIIlIllll[4]] = FLOOR_IV;
        enumC0007hArr[lllIIIlIllll[5]] = FLOOR_V;
        $VALUES = enumC0007hArr;
    }

    private static boolean lIIIlIIlIlIIIll(int i) {
        return i != 0;
    }

    private static void lIIIlIIlIIlllIl() {
        lllIIIlIllIl = new String[lllIIIlIllll[29]];
        lllIIIlIllIl[lllIIIlIllll[0]] = lIIIlIIlIIlIlll("OgUiGC4mDGcdNHUJMhgr", "UgGtG");
        lllIIIlIllIl[lllIIIlIllll[1]] = lIIIlIIlIIllIII("11TiiCSY6o46ldVerwS3kw==", "LuvLr");
        lllIIIlIllIl[lllIIIlIllll[3]] = lIIIlIIlIIlIlll("NToePDgVLQ8=", "tYjUN");
        lllIIIlIllIl[lllIIIlIllll[4]] = lIIIlIIlIIllIlI("eYrCK/UW4lUr+0b/L18tzQ==", "iQiHF");
        lllIIIlIllIl[lllIIIlIllll[5]] = lIIIlIIlIIllIII("9c3R6suME6I=", "uiSFJ");
        lllIIIlIllIl[lllIIIlIllll[6]] = lIIIlIIlIIlIlll("KR4aCDpHFhwSNg==", "jrseX");
        lllIIIlIllIl[lllIIIlIllll[7]] = lIIIlIIlIIllIlI("Oxko/1ir1ks=", "uJLJo");
        lllIIIlIllIl[lllIIIlIllll[8]] = lIIIlIIlIIlIlll("Dw4TOhFhBhUgHQ==", "LbzWs");
        lllIIIlIllIl[lllIIIlIllll[9]] = lIIIlIIlIIllIII("3wlZ4dwwYNAMrjbOdJXuPw==", "SMmpX");
        lllIIIlIllIl[lllIIIlIllll[10]] = lIIIlIIlIIllIlI("5DYQbk3SKTtyfd+Wk8NVTw==", "TJTcI");
        lllIIIlIllIl[lllIIIlIllll[11]] = lIIIlIIlIIlIlll("CzAEGwB3IBURHw==", "ZEmxk");
        lllIIIlIllIl[lllIIIlIllll[12]] = lIIIlIIlIIlIlll("JRg+Jhc8HQ==", "cTqiE");
        lllIIIlIllIl[lllIIIlIllll[15]] = lIIIlIIlIIllIII("l6SMklGqcq8gZL+stNVUAg==", "UmREs");
        lllIIIlIllIl[lllIIIlIllll[17]] = lIIIlIIlIIllIlI("goKHmx8mVSJU8UFR6bSygQ==", "IUsgy");
        lllIIIlIllIl[lllIIIlIllll[20]] = lIIIlIIlIIlIlll("KBU/KiIxECY=", "nYpep");
        lllIIIlIllIl[lllIIIlIllll[23]] = lIIIlIIlIIlIlll("JC06KzE9Nw==", "baudc");
    }

    private static boolean lIIIlIIlIlIIIII(Object obj) {
        return obj == null;
    }

    private static String lIIIlIIlIIlIlll(String lllllllllllllllIIllIlllIlIllIlII, String lllllllllllllllIIllIlllIlIllIIll) {
        String lllllllllllllllIIllIlllIlIllIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllIlIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIlllIlIllIIIl = lllllllllllllllIIllIlllIlIllIIll.toCharArray();
        int lllllllllllllllIIllIlllIlIllIIII = lllIIIlIllll[0];
        char[] charArray = lllllllllllllllIIllIlllIlIllIlII2.toCharArray();
        int length = charArray.length;
        int i = lllIIIlIllll[0];
        while (lIIIlIIlIlIIIlI(i, length)) {
            char lllllllllllllllIIllIlllIlIllIlIl = charArray[i];
            sb.append((char) (lllllllllllllllIIllIlllIlIllIlIl ^ lllllllllllllllIIllIlllIlIllIIIl[lllllllllllllllIIllIlllIlIllIIII % lllllllllllllllIIllIlllIlIllIIIl.length]));
            "".length();
            lllllllllllllllIIllIlllIlIllIIII++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(Locatable locatable) {
        return lIIIlIIlIlIIIll(this.area.get().contains(locatable) ? 1 : 0) ? lllIIIlIllll[1] : lllIIIlIllll[0];
    }

    private static String lIIIlIIlIIllIII(String lllllllllllllllIIllIlllIlIIlllll, String lllllllllllllllIIllIlllIlIIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIlllIlIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllIlIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIlIllll[3], lllllllllllllllIIllIlllIlIlIIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlllIlIlIIIII) {
            lllllllllllllllIIllIlllIlIlIIIII.printStackTrace();
            return null;
        }
    }

    private EnumC0007h(String str, int i, RegionPoint regionPoint, int i2, int i3, int i4) {
        this.area = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint), i2, i3);
        };
        this.nextReq = i4;
    }

    public static EnumC0007h valueOf(String str) {
        return (EnumC0007h) Enum.valueOf(EnumC0007h.class, str);
    }
}
