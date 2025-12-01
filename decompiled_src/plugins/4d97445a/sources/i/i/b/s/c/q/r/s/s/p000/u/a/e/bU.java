package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
@TaskDesc(name = "Banking", priority = 10, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bU  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bU.class */
public class bU extends Task {
    private static /* synthetic */ int[] llIlIII;
    private static /* synthetic */ String[] llIIlll;
    private /* synthetic */ BankLocation ha;

    private static boolean llIlIlIlI(int i2) {
        return i2 != 0;
    }

    private static void llIlIIlll() {
        llIlIII = new int[6];
        llIlIII[0] = (15 ^ 62) & ((139 ^ 186) ^ (-1));
        llIlIII[1] = " ".length();
        llIlIII[2] = "  ".length();
        llIlIII[3] = "   ".length();
        llIlIII[4] = (226 ^ 174) ^ (244 ^ 188);
        llIlIII[5] = (((159 + 34) - 77) + 58) ^ (((23 + 102) - 122) + 163);
    }

    private static void llIlIIllI() {
        llIIlll = new String[llIlIII[4]];
        llIIlll[llIlIII[0]] = llIlIIIll("Ad6k+F0UF0A=", "oNkKp");
        llIIlll[llIlIII[1]] = llIlIIlII("EzcbHA==", "QVuwP");
        llIIlll[llIlIII[2]] = llIlIIlIl("0zxbXa0JnDQ=", "UJXJo");
        llIIlll[llIlIII[3]] = llIlIIIll("KYCMXfyDrPw=", "PdQLR");
    }

    private static boolean llIlIlIll(Object obj) {
        return obj != null;
    }

    private static boolean llIlIllII(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIlIlIII(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        if (llIlIlIII(Inventory.isFull() ? 1 : 0)) {
            if (llIlIlIIl(this.ha)) {
                this.ha = BankLocation.getNearest();
            }
            return llIlIII[0];
        } else if (llIlIlIlI(Bank.isOpen() ? 1 : 0)) {
            Bank.depositAllExcept(item -> {
                return item.getName().equals(llIIlll[llIlIII[3]]);
            });
            return llIlIII[1];
        } else {
            String[] strArr = new String[llIlIII[1]];
            strArr[llIlIII[0]] = llIIlll[llIlIII[0]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (llIlIlIll(nearest)) {
                String[] strArr2 = new String[llIlIII[1]];
                strArr2[llIlIII[0]] = llIIlll[llIlIII[1]];
                if (llIlIlIlI(nearest.hasAction(strArr2) ? 1 : 0)) {
                    nearest.interact(llIIlll[llIlIII[2]]);
                    return llIlIII[1];
                }
            }
            if (llIlIlIlI(Bank.open() ? 1 : 0)) {
                return llIlIII[1];
            }
            Movement.walkTo(this.ha.getArea());
            "".length();
            return llIlIII[1];
        }
    }

    private static String llIlIIlIl(String lllIlIIIlllllII, String lllIlIIIllllIIl) {
        try {
            SecretKeySpec lllIlIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIIllllIIl.getBytes(StandardCharsets.UTF_8)), llIlIII[5]), "DES");
            Cipher lllIlIIIllllllI = Cipher.getInstance("DES");
            lllIlIIIllllllI.init(llIlIII[2], lllIlIIIlllllll);
            return new String(lllIlIIIllllllI.doFinal(Base64.getDecoder().decode(lllIlIIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIIlllllIl) {
            lllIlIIIlllllIl.printStackTrace();
            return null;
        }
    }

    static {
        llIlIIlll();
        llIlIIllI();
    }

    private static String llIlIIlII(String lllIlIIlIIlIIIl, String lllIlIIlIIlIIII) {
        String lllIlIIlIIlIIIl2 = new String(Base64.getDecoder().decode(lllIlIIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIlIIIllll = new StringBuilder();
        char[] lllIlIIlIIIlllI = lllIlIIlIIlIIII.toCharArray();
        int lllIlIIlIIIllIl = llIlIII[0];
        char[] charArray = lllIlIIlIIlIIIl2.toCharArray();
        int length = charArray.length;
        int i2 = llIlIII[0];
        while (llIlIllII(i2, length)) {
            char lllIlIIlIIlIIlI = charArray[i2];
            lllIlIIlIIIllll.append((char) (lllIlIIlIIlIIlI ^ lllIlIIlIIIlllI[lllIlIIlIIIllIl % lllIlIIlIIIlllI.length]));
            "".length();
            lllIlIIlIIIllIl++;
            i2++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllIlIIlIIIllll);
    }

    private static String llIlIIIll(String lllIlIIIllIllll, String lllIlIIIllIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlIIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIIllIlIll) {
            lllIlIIIllIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIIl(Object obj) {
        return obj == null;
    }
}
