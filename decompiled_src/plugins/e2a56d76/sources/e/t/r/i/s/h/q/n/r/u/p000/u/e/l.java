package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@TaskDesc(name = "Resetting box trap", priority = 15)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.l  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/l.class */
public class l extends j {
    private static /* synthetic */ int[] lllIlllIlllI;
    private static /* synthetic */ String[] lllIlllIllII;

    private static boolean lIIIllIllllIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    public boolean x() {
        String str;
        if (lIIIllIllllIIlI(Players.getLocal().getAnimation(), lllIlllIlllI[0])) {
            return lllIlllIlllI[1];
        }
        f orElse = y().h().values().stream().filter(fVar -> {
            if (!lIIIllIllllIlIl(fVar.q(), g.FULL) || lIIIllIllllIlII(fVar.q(), g.EMPTY)) {
                ?? r0 = lllIlllIlllI[2];
                "".length();
                return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIlllIlllI[1];
        }).min(Comparator.comparing(fVar2 -> {
            return Double.valueOf(-fVar2.m());
        })).orElse(null);
        if (lIIIllIllllIIll(orElse)) {
            return lllIlllIlllI[1];
        }
        TileObject firstAt = TileObjects.getFirstAt(orElse.o(), tileObject -> {
            String[] strArr = new String[lllIlllIlllI[2]];
            strArr[lllIlllIlllI[1]] = lllIlllIllII[lllIlllIlllI[3]];
            return tileObject.hasAction(strArr);
        });
        if (lIIIllIllllIIll(firstAt)) {
            return lllIlllIlllI[1];
        }
        if (lIIIllIllllIlII(orElse.q(), g.FULL)) {
            str = lllIlllIllII[lllIlllIlllI[1]];
            "".length();
            if (0 != 0) {
                return ((((4 + 99) - 12) + 94) ^ (((121 + 108) - 99) + 41)) & (((96 ^ 127) ^ (162 ^ 175)) ^ (-" ".length()));
            }
        } else {
            str = lllIlllIllII[lllIlllIlllI[2]];
        }
        firstAt.interact(str);
        return lllIlllIlllI[2];
    }

    static {
        lIIIllIllllIIIl();
        lIIIllIlllIlIll();
    }

    private static void lIIIllIlllIlIll() {
        lllIlllIllII = new String[lllIlllIlllI[4]];
        lllIlllIllII[lllIlllIlllI[1]] = lIIIllIlllIIlll("eLgaTiujZws=", "OWakT");
        lllIlllIllII[lllIlllIlllI[2]] = lIIIllIlllIlIIl("CCseOAwiNgEw", "LBmUm");
        lllIlllIllII[lllIlllIlllI[3]] = lIIIllIlllIlIlI("6Wtt4HYzVZs=", "uVOXk");
    }

    private static String lIIIllIlllIlIlI(String lllllllllllllllIIlIlllIIIllIIllI, String lllllllllllllllIIlIlllIIIllIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), lllIlllIlllI[5]), "DES");
            Cipher lllllllllllllllIIlIlllIIIllIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIlIlllIIIllIlIII.init(lllIlllIlllI[3], lllllllllllllllIIlIlllIIIllIlIIl);
            return new String(lllllllllllllllIIlIlllIIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIIllIIlll) {
            lllllllllllllllIIlIlllIIIllIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIllllIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Inject
    public l(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.CHINS);
    }

    private static String lIIIllIlllIIlll(String lllllllllllllllIIlIlllIIIlllIIll, String lllllllllllllllIIlIlllIIIlllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlllIIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlllIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlllIlllI[3], lllllllllllllllIIlIlllIIIlllIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIlllIIIlllIlII) {
            lllllllllllllllIIlIlllIIIlllIlII.printStackTrace();
            return null;
        }
    }

    private static void lIIIllIllllIIIl() {
        lllIlllIlllI = new int[6];
        lllIlllIlllI[0] = (-16546) & 21757;
        lllIlllIlllI[1] = (157 ^ 178) & ((162 ^ 141) ^ (-1));
        lllIlllIlllI[2] = " ".length();
        lllIlllIlllI[3] = "  ".length();
        lllIlllIlllI[4] = "   ".length();
        lllIlllIlllI[5] = 100 ^ 108;
    }

    private static boolean lIIIllIllllIIlI(int i, int i2) {
        return i == i2;
    }

    private static String lIIIllIlllIlIIl(String lllllllllllllllIIlIlllIIIlIlIllI, String lllllllllllllllIIlIlllIIIlIlIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlllIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlllIIIlIlIlII = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlllIIIlIlIlIl.toCharArray();
        int lllllllllllllllIIlIlllIIIlIlIIlI = lllIlllIlllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIlllIlllI[1];
        while (lIIIllIllllIllI(i, length)) {
            char lllllllllllllllIIlIlllIIIlIlIlll = charArray2[i];
            lllllllllllllllIIlIlllIIIlIlIlII.append((char) (lllllllllllllllIIlIlllIIIlIlIlll ^ charArray[lllllllllllllllIIlIlllIIIlIlIIlI % charArray.length]));
            "".length();
            lllllllllllllllIIlIlllIIIlIlIIlI++;
            i++;
            "".length();
            if (" ".length() <= ((154 ^ 131) & ((23 ^ 14) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlllIIIlIlIlII);
    }

    private static boolean lIIIllIllllIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllIllllIIll(Object obj) {
        return obj == null;
    }
}
