package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.x  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/x.class */
public abstract class x extends j {
    private static /* synthetic */ int[] llllIIIlIlII;
    private static /* synthetic */ String[] llllIIIlIIll;

    private static boolean lIIIlllIllllIII(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i H() {
        return z().pitfallAnimal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean a(NPC npc) {
        RectangularArea w = H().w();
        return lIIIlllIlllIllI(w) ? llllIIIlIlII[1] : w.contains(npc.getWorldLocation());
    }

    private static void lIIIlllIlllIIll() {
        llllIIIlIIll = new String[llllIIIlIlII[4]];
        llllIIIlIIll[llllIIIlIlII[0]] = lIIIlllIlllIIII("0S5c7T/LcbupFtkgKqWOpw==", "UnFkf");
        llllIIIlIIll[llllIIIlIlII[1]] = lIIIlllIlllIIIl("aOLLW7+YXY45T2mtSQC0BQ==", "HZUht");
        llllIIIlIIll[llllIIIlIlII[2]] = lIIIlllIlllIIlI("ARcgCj82RzkILg==", "RgIaZ");
        llllIIIlIIll[llllIIIlIlII[3]] = lIIIlllIlllIIIl("BWA2+U16je0=", "Iveno");
    }

    private static String lIIIlllIlllIIIl(String lllllllllllllllIIlIllIIlIIIllIIl, String lllllllllllllllIIlIllIIlIIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIIlIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlIIIllIII.getBytes(StandardCharsets.UTF_8)), llllIIIlIlII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIlIlII[2], lllllllllllllllIIlIllIIlIIIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIlIIIllIlI) {
            lllllllllllllllIIlIllIIlIIIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIlllIIII(String lllllllllllllllIIlIllIIlIIlllllI, String lllllllllllllllIIlIllIIlIIllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIIlIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIIlIlIIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIIlIlIIIIII.init(llllIIIlIlII[2], secretKeySpec);
            return new String(lllllllllllllllIIlIllIIlIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIIlIIllllll) {
            lllllllllllllllIIlIllIIlIIllllll.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TileObject a(boolean z) {
        return TileObjects.getNearest(tileObject -> {
            if (lIIIlllIlllIlll(llllIIIlIIll[llllIIIlIlII[0]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] strArr = new String[llllIIIlIlII[1]];
                strArr[llllIIIlIlII[0]] = llllIIIlIIll[llllIIIlIlII[1]];
                if (lIIIlllIllllIII(tileObject.hasAction(strArr) ? 1 : 0, z ? 1 : 0)) {
                    ?? r0 = llllIIIlIlII[1];
                    "".length();
                    return (((74 ^ 87) ^ (58 ^ 24)) & (((((82 + 77) - 146) + 160) ^ (((73 + 113) - 105) + 65)) ^ (-" ".length()))) == "  ".length() ? ((216 ^ 145) ^ (212 ^ 172)) & (((((124 + 95) - 82) + 50) ^ (((32 + 111) - 69) + 64)) ^ (-" ".length())) : r0;
                }
            }
            return llllIIIlIlII[0];
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TileObject F() {
        return TileObjects.getNearest(tileObject -> {
            if (lIIIlllIlllIlll(llllIIIlIIll[llllIIIlIlII[2]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] strArr = new String[llllIIIlIlII[1]];
                strArr[llllIIIlIlII[0]] = llllIIIlIIll[llllIIIlIlII[3]];
                if (lIIIlllIlllIlll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = llllIIIlIlII[1];
                    "".length();
                    return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return llllIIIlIlII[0];
        });
    }

    public x(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.PITFALL);
    }

    private static String lIIIlllIlllIIlI(String lllllllllllllllIIlIllIIlIIlIlllI, String lllllllllllllllIIlIllIIlIIlIllIl) {
        String lllllllllllllllIIlIllIIlIIlIlllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIIlIIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIIlIIlIllII = new StringBuilder();
        char[] lllllllllllllllIIlIllIIlIIlIlIll = lllllllllllllllIIlIllIIlIIlIllIl.toCharArray();
        int lllllllllllllllIIlIllIIlIIlIlIlI = llllIIIlIlII[0];
        char[] charArray = lllllllllllllllIIlIllIIlIIlIlllI2.toCharArray();
        int length = charArray.length;
        int i = llllIIIlIlII[0];
        while (lIIIlllIllllIlI(i, length)) {
            char lllllllllllllllIIlIllIIlIIlIllll = charArray[i];
            lllllllllllllllIIlIllIIlIIlIllII.append((char) (lllllllllllllllIIlIllIIlIIlIllll ^ lllllllllllllllIIlIllIIlIIlIlIll[lllllllllllllllIIlIllIIlIIlIlIlI % lllllllllllllllIIlIllIIlIIlIlIll.length]));
            "".length();
            lllllllllllllllIIlIllIIlIIlIlIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIIlIIlIllII);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NPC D() {
        return a(npc -> {
            if (lIIIlllIlllIllI(npc.getInteracting())) {
                ?? r0 = llllIIIlIlII[1];
                "".length();
                return (((166 ^ 131) ^ (0 ^ 6)) & (((((75 + 116) - 101) + 46) ^ (((30 + 29) - (-68)) + 44)) ^ (-" ".length()))) >= " ".length() ? ((((29 + 90) - 81) + 145) ^ (((101 + 7) - 48) + 69)) & (((237 ^ 195) ^ (17 ^ 9)) ^ (-" ".length())) : r0;
            }
            return llllIIIlIlII[0];
        });
    }

    private static boolean lIIIlllIllllIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NPC E() {
        return a(npc -> {
            if (lIIIlllIllllIIl(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = llllIIIlIlII[1];
                "".length();
                return ((((10 + 13) - (-64)) + 44) ^ (((108 + 77) - 117) + 67)) < (((82 ^ 123) ^ (196 ^ 195)) & (((((9 + 127) - 38) + 31) ^ (((137 + 113) - 96) + 21)) ^ (-" ".length()))) ? ((59 ^ 15) ^ (140 ^ 158)) & (((207 ^ 198) ^ (73 ^ 102)) ^ (-" ".length())) : r0;
            }
            return llllIIIlIlII[0];
        });
    }

    private static boolean lIIIlllIlllIllI(Object obj) {
        return obj == null;
    }

    protected NPC a(Predicate<NPC> predicate) {
        WorldPoint worldLocation;
        TileObject G = G();
        if (lIIIlllIlllIllI(G)) {
            worldLocation = Players.getLocal().getWorldLocation();
            "".length();
            if (((31 ^ 35) & ((187 ^ 135) ^ (-1))) > ((20 ^ 46) & ((27 ^ 33) ^ (-1)))) {
                return null;
            }
        } else {
            worldLocation = G.getWorldLocation();
        }
        return NPCs.getNearest(worldLocation, predicate.and(npc -> {
            if (lIIIlllIlllIlll(H().v().equalsIgnoreCase(npc.getName()) ? 1 : 0) && lIIIlllIlllIlll(a(npc) ? 1 : 0)) {
                ?? r0 = llllIIIlIlII[1];
                "".length();
                return (-"  ".length()) > 0 ? ((5 ^ 104) ^ (60 ^ 12)) & (((58 ^ 81) ^ (25 ^ 47)) ^ (-" ".length())) & ((((70 ^ 78) ^ (47 ^ 122)) & (("   ".length() ^ (220 ^ 130)) ^ (-" ".length()))) ^ (-" ".length())) : r0;
            }
            return llllIIIlIlII[0];
        }));
    }

    private static boolean lIIIlllIlllIlll(int i) {
        return i != 0;
    }

    private static boolean lIIIlllIllllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lIIIlllIlllIlII();
        lIIIlllIlllIIll();
    }

    private static void lIIIlllIlllIlII() {
        llllIIIlIlII = new int[6];
        llllIIIlIlII[0] = (107 ^ 88) & ((168 ^ 155) ^ (-1));
        llllIIIlIlII[1] = " ".length();
        llllIIIlIlII[2] = "  ".length();
        llllIIIlIlII[3] = "   ".length();
        llllIIIlIlII[4] = (((83 + 169) - 128) + 75) ^ (((190 + 6) - 125) + 124);
        llllIIIlIlII[5] = 159 ^ 151;
    }

    private static boolean lIIIlllIlllIlIl(Object obj) {
        return obj != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public TileObject G() {
        TileObject F = F();
        if (lIIIlllIlllIlIl(F)) {
            return F;
        }
        TileObject a = a((boolean) llllIIIlIlII[0]);
        return lIIIlllIlllIlIl(a) ? a : a((boolean) llllIIIlIlII[1]);
    }
}
