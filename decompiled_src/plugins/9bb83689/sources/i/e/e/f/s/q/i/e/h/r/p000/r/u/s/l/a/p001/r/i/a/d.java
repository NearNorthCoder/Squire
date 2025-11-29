package i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Getting bird", priority = 6, blocking = true)
/* renamed from: i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.d  reason: invalid package */
/* loaded from: 9bb83689-ff7d-471d-9a08-411d7484ad87.jar:i/e/e/f/s/q/i/e/h/r/-/r/u/s/l/a/-/r/i/a/d.class */
public class d extends Task {
    private static /* synthetic */ String[] lIlIllIIlll;
    private static /* synthetic */ int[] lIlIllIlIII;

    private static String lIIlIIllIllllI(String llllllllllllllllIlIlIlllllIIIIIl, String llllllllllllllllIlIlIlllllIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlllllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIlIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlllllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlllllIIIIlI) {
            llllllllllllllllIlIlIlllllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllIlllll(String llllllllllllllllIlIlIllllIllIIIl, String llllllllllllllllIlIlIllllIlIlIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIllllIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIllllIlIllll = new StringBuilder();
        char[] charArray = llllllllllllllllIlIlIllllIlIlIll.toCharArray();
        int llllllllllllllllIlIlIllllIlIllIl = lIlIllIlIII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIllIlIII[1];
        while (lIIlIIlllIIlII(i2, length)) {
            llllllllllllllllIlIlIllllIlIllll.append((char) (charArray2[i2] ^ charArray[llllllllllllllllIlIlIllllIlIllIl % charArray.length]));
            "".length();
            llllllllllllllllIlIlIllllIlIllIl++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIlIllllIlIllll);
    }

    private static void lIIlIIlllIIIIl() {
        lIlIllIlIII = new int[4];
        lIlIllIlIII[0] = " ".length();
        lIlIllIlIII[1] = ((149 ^ 154) ^ (249 ^ 164)) & (((((73 + 23) - (-126)) + 2) ^ (((172 + 99) - 144) + 51)) ^ (-" ".length()));
        lIlIllIlIII[2] = (-3237) & 11757;
        lIlIllIlIII[3] = "  ".length();
    }

    private static boolean lIIlIIlllIIlII(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIlIIlllIIIlI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[lIlIllIlIII[0]];
        strArr[lIlIllIlIII[1]] = lIlIllIIlll[lIlIllIlIII[1]];
        if (lIIlIIlllIIIlI(Equipment.contains(strArr) ? 1 : 0)) {
            return lIlIllIlIII[1];
        }
        if (lIIlIIlllIIIlI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIllIlIII[0];
        }
        int[] iArr = new int[lIlIllIlIII[0]];
        iArr[lIlIllIlIII[1]] = lIlIllIlIII[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (lIIlIIlllIIIll(nearest)) {
            return lIlIllIlIII[1];
        }
        nearest.interact(lIlIllIIlll[lIlIllIlIII[0]]);
        return lIlIllIlIII[0];
    }

    private static boolean lIIlIIlllIIIll(Object obj) {
        return obj == null;
    }

    static {
        lIIlIIlllIIIIl();
        lIIlIIlllIIIII();
    }

    private static void lIIlIIlllIIIII() {
        lIlIllIIlll = new String[lIlIllIlIII[3]];
        lIlIllIIlll[lIlIllIlIII[1]] = lIIlIIllIllllI("8+lYy2C7LPkmiF5NhLoY4YEDO2AiqF1/", "vDkOa");
        lIlIllIIlll[lIlIllIlIII[0]] = lIIlIIllIlllll("LBMZejACBAk=", "kvmZR");
    }
}
