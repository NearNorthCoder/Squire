package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.secondaries.SecondariesConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Restoring from pool", priority = 10, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bN  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bN.class */
public class bN extends Task {
    private static /* synthetic */ int[] lllIIIIII;
    private static /* synthetic */ String[] llIllllll;
    private final /* synthetic */ SecondariesConfig gL;

    private static boolean llIIIIIlIll(int i2) {
        return i2 == 0;
    }

    private static boolean llIIIIIllIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIIIIIllII(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIIlIlI(int i2) {
        return i2 != 0;
    }

    static {
        llIIIIIlIII();
        llIIIIIIlll();
    }

    private static void llIIIIIlIII() {
        lllIIIIII = new int[4];
        lllIIIIII[0] = ((18 ^ 48) ^ (44 ^ 3)) & (((53 ^ 4) ^ (112 ^ 76)) ^ (-" ".length()));
        lllIIIIII[1] = " ".length();
        lllIIIIII[2] = "  ".length();
        lllIIIIII[3] = "   ".length();
    }

    private static void llIIIIIIlll() {
        llIllllll = new String[lllIIIIII[3]];
        llIllllll[lllIIIIII[0]] = llIIIIIIlIl("KxsIHAU=", "oiarn");
        llIllllll[lllIIIIII[1]] = llIIIIIIllI("Hqvlq5wCkSM=", "oEPog");
        llIllllll[lllIIIIII[2]] = llIIIIIIlIl("LBgjBSU=", "hjJkN");
    }

    private static String llIIIIIIllI(String lIlIllIlIlIllIl, String lIlIllIlIlIllII) {
        try {
            SecretKeySpec lIlIllIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIlIlIllll = Cipher.getInstance("Blowfish");
            lIlIllIlIlIllll.init(lllIIIIII[2], lIlIllIlIllIIII);
            return new String(lIlIllIlIlIllll.doFinal(Base64.getDecoder().decode(lIlIllIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIlIlIlllI) {
            lIlIllIlIlIlllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean run() {
        if (!llIIIIIlIIl(this.gL.secondary(), bO.SWAMP_TOAD) && !llIIIIIlIlI(Prayers.getPoints())) {
            if (!llIIIIIlIll(this.gL.restoreInPoh() ? 1 : 0)) {
                return llIIIIIlIll(House.isInside() ? 1 : 0) ? lllIIIIII[0] : House.drinkFromPool();
            }
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIIIIIlIlI(tileObject.getName().toLowerCase().contains(llIllllll[lllIIIIII[1]]) ? 1 : 0)) {
                    String[] strArr = new String[lllIIIIII[1]];
                    strArr[lllIIIIII[0]] = llIllllll[lllIIIIII[2]];
                    if (llIIIIIlIlI(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIIIII[1];
                        "".length();
                        return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                }
                return lllIIIIII[0];
            });
            if (llIIIIIllII(nearest)) {
                return lllIIIIII[0];
            }
            nearest.interact(llIllllll[lllIIIIII[0]]);
            return lllIIIIII[1];
        }
        return lllIIIIII[0];
    }

    @Inject
    public bN(SecondariesConfig secondariesConfig) {
        this.gL = secondariesConfig;
    }

    private static String llIIIIIIlIl(String lIlIllIlIIllIII, String lIlIllIlIIlllII) {
        String lIlIllIlIIllIII2 = new String(Base64.getDecoder().decode(lIlIllIlIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIlIIllIll = new StringBuilder();
        char[] lIlIllIlIIllIlI = lIlIllIlIIlllII.toCharArray();
        int lIlIllIlIIllIIl = lllIIIIII[0];
        char[] charArray = lIlIllIlIIllIII2.toCharArray();
        int length = charArray.length;
        int i2 = lllIIIIII[0];
        while (llIIIIIllIl(i2, length)) {
            lIlIllIlIIllIll.append((char) (charArray[i2] ^ lIlIllIlIIllIlI[lIlIllIlIIllIIl % lIlIllIlIIllIlI.length]));
            "".length();
            lIlIllIlIIllIIl++;
            i2++;
            "".length();
            if ((-((((109 + 126) - 87) + 14) ^ (((158 + 11) - 79) + 77))) >= 0) {
                return null;
            }
        }
        return String.valueOf(lIlIllIlIIllIll);
    }

    private static boolean llIIIIIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }
}
