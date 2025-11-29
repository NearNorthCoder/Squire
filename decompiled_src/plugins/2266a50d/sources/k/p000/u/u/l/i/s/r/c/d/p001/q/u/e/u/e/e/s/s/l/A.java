package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
@TaskDesc(name = "Prayer Flicking", priority = 2147483646)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.A  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/A.class */
public class A extends Task {
    private final /* synthetic */ SquireDukeSucellus aZ;
    private static /* synthetic */ String[] lIlllIIIIIII;
    private final /* synthetic */ SquireDukeSucellusConfig ba;
    private static /* synthetic */ int[] lIlllIIIIIlI;

    private static boolean lllIlIlIlIIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        if (lllIlIlIlIIlIl(Prayers.getPoints())) {
            return lIlllIIIIIlI[0];
        }
        if (lllIlIlIlIIllI(NPCs.getNearest(npc -> {
            if (lllIlIlIlIlIII(npc.getName().equals(lIlllIIIIIII[lIlllIIIIIlI[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIlllIIIIIlI[4]];
                strArr[lIlllIIIIIlI[0]] = lIlllIIIIIII[lIlllIIIIIlI[3]];
                if (lllIlIlIlIlIII(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlllIIIIIlI[4];
                    "".length();
                    return "   ".length() <= (-" ".length()) ? "  ".length() & ("  ".length() ^ (-" ".length())) : r0;
                }
            }
            return lIlllIIIIIlI[0];
        }))) {
            Prayers.disableAll();
            return lIlllIIIIIlI[0];
        } else if (lllIlIlIlIIllI(TileObjects.getNearest(tileObject -> {
            if (lllIlIlIlIlIII(tileObject.getName().equals(lIlllIIIIIII[lIlllIIIIIlI[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIlllIIIIIlI[4]];
                strArr[lIlllIIIIIlI[0]] = lIlllIIIIIII[lIlllIIIIIlI[4]];
                if (lllIlIlIlIlIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlllIIIIIlI[4];
                    "".length();
                    return (-" ".length()) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlllIIIIIlI[0];
        }))) {
            return lIlllIIIIIlI[0];
        } else {
            Prayers.flick(V());
            "".length();
            return lIlllIIIIIlI[0];
        }
    }

    private static void lllIlIlIlIIlII() {
        lIlllIIIIIlI = new int[7];
        lIlllIIIIIlI[0] = (25 ^ 37) & ((15 ^ 51) ^ (-1));
        lIlllIIIIIlI[1] = (-12329) & 16237;
        lIlllIIIIIlI[2] = (((55 + 158) - 139) + 106) ^ (((130 + 164) - 254) + 148);
        lIlllIIIIIlI[3] = "   ".length();
        lIlllIIIIIlI[4] = " ".length();
        lIlllIIIIIlI[5] = "  ".length();
        lIlllIIIIIlI[6] = "  ".length() ^ (180 ^ 178);
    }

    private static boolean lllIlIlIlIIlll(int i, int i2) {
        return i != i2;
    }

    @Inject
    public A(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aZ = squireDukeSucellus;
        this.ba = squireDukeSucellusConfig;
    }

    private static String lllIlIlIIlllII(String lllllllllllllllIlIlllIIIllllllll, String lllllllllllllllIlIlllIIIlllllllI) {
        String lllllllllllllllIlIlllIIIllllllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIIllllllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIIIlllllllI.toCharArray();
        int lllllllllllllllIlIlllIIIlllllIll = lIlllIIIIIlI[0];
        char[] charArray2 = lllllllllllllllIlIlllIIIllllllll2.toCharArray();
        int length = charArray2.length;
        int i = lIlllIIIIIlI[0];
        while (lllIlIlIlIlIIl(i, length)) {
            char lllllllllllllllIlIlllIIlIIIIIIII = charArray2[i];
            lllllllllllllllIlIlllIIIllllllIl.append((char) (lllllllllllllllIlIlllIIlIIIIIIII ^ charArray[lllllllllllllllIlIlllIIIlllllIll % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIIIlllllIll++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIIIllllllIl);
    }

    private static boolean lllIlIlIlIlIII(int i) {
        return i != 0;
    }

    private List<Prayer> V() {
        ArrayList arrayList = new ArrayList();
        if (lllIlIlIlIIlll(Static.getClient().getVarbitValue(lIlllIIIIIlI[1]), lIlllIIIIIlI[2])) {
            Prayer[] prayerArr = new Prayer[lIlllIIIIIlI[3]];
            prayerArr[lIlllIIIIIlI[0]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArr[lIlllIIIIIlI[4]] = Prayer.ULTIMATE_STRENGTH;
            prayerArr[lIlllIIIIIlI[5]] = Prayer.STEEL_SKIN;
            arrayList.addAll(Arrays.asList(prayerArr));
            "".length();
            "".length();
            if ((89 ^ 92) <= 0) {
                return null;
            }
        } else {
            arrayList.add(Prayer.PIETY);
            "".length();
        }
        arrayList.add(Prayer.PROTECT_FROM_MELEE);
        "".length();
        return arrayList;
    }

    private static boolean lllIlIlIlIIlIl(int i) {
        return i <= 0;
    }

    private static void lllIlIlIIlllll() {
        lIlllIIIIIII = new String[lIlllIIIIIlI[6]];
        lIlllIIIIIII[lIlllIIIIIlI[0]] = lllIlIlIIlllII("DhUaLw==", "ItnJW");
        lIlllIIIIIII[lIlllIIIIIlI[4]] = lllIlIlIIlllIl("Htnj0gS5BTiDOrS8xILSLA==", "dJbIr");
        lIlllIIIIIII[lIlllIIIIIlI[5]] = lllIlIlIIllllI("mlcP1pcglkPlbH7LMLGoXA==", "TxSYD");
        lIlllIIIIIII[lIlllIIIIIlI[3]] = lllIlIlIIlllIl("4AssFQ3E1IQ=", "PrzDv");
    }

    static {
        lllIlIlIlIIlII();
        lllIlIlIIlllll();
    }

    private static String lllIlIlIIlllIl(String lllllllllllllllIlIlllIIIllIlllIl, String lllllllllllllllIlIlllIIIllIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIIIllIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIIIllIlllll.init(lIlllIIIIIlI[5], secretKeySpec);
            return new String(lllllllllllllllIlIlllIIIllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIIllIllllI) {
            lllllllllllllllIlIlllIIIllIllllI.printStackTrace();
            return null;
        }
    }

    private static String lllIlIlIIllllI(String lllllllllllllllIlIlllIIIlllIlIlI, String lllllllllllllllIlIlllIIIlllIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), lIlllIIIIIlI[2]), "DES");
            Cipher lllllllllllllllIlIlllIIIlllIllII = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIIIlllIllII.init(lIlllIIIIIlI[5], secretKeySpec);
            return new String(lllllllllllllllIlIlllIIIlllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIIlllIlIll) {
            lllllllllllllllIlIlllIIIlllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIlIlIlIIl(int i, int i2) {
        return i < i2;
    }
}
