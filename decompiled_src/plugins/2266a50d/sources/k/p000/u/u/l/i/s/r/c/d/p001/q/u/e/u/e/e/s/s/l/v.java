package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Drinking prayer", priority = 10000)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.v  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/v.class */
public class v extends Task {
    private final /* synthetic */ SquireDukeSucellus aM;
    private final /* synthetic */ C0000a aO;
    private static /* synthetic */ String[] lIllIlIlIIII;
    private static /* synthetic */ int[] lIllIlIlIIIl;
    private final /* synthetic */ SquireDukeSucellusConfig aN;

    private static boolean lllIIllllIlIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIIllllIllII(int i) {
        return i != 0;
    }

    private static String lllIIllllIIllI(String lllllllllllllllIlIlllllIIIIlIllI, String lllllllllllllllIlIlllllIIIIlIlIl) {
        String lllllllllllllllIlIlllllIIIIlIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllllIIIIlIlIl.toCharArray();
        int lllllllllllllllIlIlllllIIIIlIIlI = lIllIlIlIIIl[0];
        char[] charArray2 = lllllllllllllllIlIlllllIIIIlIllI2.toCharArray();
        int lllllllllllllllIlIlllllIIIIIlIll = charArray2.length;
        int i = lIllIlIlIIIl[0];
        while (lllIIllllIllIl(i, lllllllllllllllIlIlllllIIIIIlIll)) {
            char lllllllllllllllIlIlllllIIIIlIlll = charArray2[i];
            sb.append((char) (lllllllllllllllIlIlllllIIIIlIlll ^ charArray[lllllllllllllllIlIlllllIIIIlIIlI % charArray.length]));
            "".length();
            lllllllllllllllIlIlllllIIIIlIIlI++;
            i++;
            "".length();
            if ("  ".length() == ((240 ^ 160) & ((105 ^ 57) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIIllllIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIllllIlIll(int i) {
        return i == 0;
    }

    private static boolean lllIIllllIlIlI(Object obj) {
        return obj == null;
    }

    private static void lllIIllllIlIII() {
        lIllIlIlIIIl = new int[4];
        lIllIlIlIIIl[0] = ((84 ^ 120) ^ (226 ^ 151)) & (((13 ^ 79) ^ (56 ^ 35)) ^ (-" ".length()));
        lIllIlIlIIIl[1] = " ".length();
        lIllIlIlIIIl[2] = "  ".length();
        lIllIlIlIIIl[3] = "   ".length();
    }

    private static String lllIIllllIIlIl(String lllllllllllllllIlIlllllIIIlIIllI, String lllllllllllllllIlIlllllIIIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlllllIIIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIIIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllllIIIlIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllllIIIlIlIII.init(lIllIlIlIIIl[2], lllllllllllllllIlIlllllIIIlIlIIl);
            return new String(lllllllllllllllIlIlllllIIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllllIIIlIIlll) {
            lllllllllllllllIlIlllllIIIlIIlll.printStackTrace();
            return null;
        }
    }

    private static void lllIIllllIIlll() {
        lIllIlIlIIII = new String[lIllIlIlIIIl[3]];
        lIllIlIlIIII[lIllIlIlIIIl[0]] = lllIIllllIIlIl("usUe1GEdZeE=", "RPKoJ");
        lIllIlIlIIII[lIllIlIlIIIl[1]] = lllIIllllIIlIl("K/ddZktKz62QMgJMccQssw==", "nnqLE");
        lIllIlIlIIII[lIllIlIlIIIl[2]] = lllIIllllIIllI("AhkGJhRRHhMwEh4eEw==", "qlvCf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lllIIllllIlIIl(Prayers.getPoints(), this.aN.drinkPrayerAt())) {
            return lIllIlIlIIIl[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (!lllIIllllIlIll(item.getName().toLowerCase().contains(lIllIlIlIIII[lIllIlIlIIIl[1]]) ? 1 : 0) || lllIIllllIllII(item.getName().toLowerCase().contains(lIllIlIlIIII[lIllIlIlIIIl[2]]) ? 1 : 0)) {
                ?? r0 = lIllIlIlIIIl[1];
                "".length();
                return !(true ^ false) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIlIlIIIl[0];
        });
        if (lllIIllllIlIlI(first)) {
            return lIllIlIlIIIl[0];
        }
        first.interact(lIllIlIlIIII[lIllIlIlIIIl[0]]);
        return lIllIlIlIIIl[1];
    }

    static {
        lllIIllllIlIII();
        lllIIllllIIlll();
    }

    @Inject
    public v(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aM = squireDukeSucellus;
        this.aN = squireDukeSucellusConfig;
        this.aO = squireDukeSucellus.s();
    }
}
