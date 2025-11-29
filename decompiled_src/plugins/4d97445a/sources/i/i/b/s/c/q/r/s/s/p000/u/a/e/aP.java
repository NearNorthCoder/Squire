package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Using Soul Bearer")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aP  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aP.class */
public class aP extends Task {
    private final /* synthetic */ LooterConfig eI;
    private static /* synthetic */ int[] lIIlllIll;
    private final /* synthetic */ SquireLooter eJ;
    private static /* synthetic */ String[] lIIlllIlI;

    private static String lIIIlIIlIlI(String llIIIlIlIIllIlI, String llIIIlIlIIllIIl) {
        String llIIIlIlIIllIlI2 = new String(Base64.getDecoder().decode(llIIIlIlIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIlIlIIllIII = new StringBuilder();
        char[] charArray = llIIIlIlIIllIIl.toCharArray();
        int llIIIlIlIIlIllI = lIIlllIll[0];
        char[] charArray2 = llIIIlIlIIllIlI2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIlllIll[0];
        while (lIIIlIIllll(i2, length)) {
            char llIIIlIlIIllIll = charArray2[i2];
            llIIIlIlIIllIII.append((char) (llIIIlIlIIllIll ^ charArray[llIIIlIlIIlIllI % charArray.length]));
            "".length();
            llIIIlIlIIlIllI++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llIIIlIlIIllIII);
    }

    private static boolean lIIIlIIlllI(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIlIIllll(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIIIlIIllII() {
        lIIlllIll = new int[5];
        lIIlllIll[0] = (173 ^ 152) & ((74 ^ 127) ^ (-1));
        lIIlllIll[1] = " ".length();
        lIIlllIll[2] = (-4865) & 24498;
        lIIlllIll[3] = "  ".length();
        lIIlllIll[4] = 98 ^ 106;
    }

    static {
        lIIIlIIllII();
        lIIIlIIlIll();
    }

    private static void lIIIlIIlIll() {
        lIIlllIlI = new String[lIIlllIll[3]];
        lIIlllIlI[lIIlllIll[0]] = lIIIlIIlIIl("Ti8/ny+PK4k=", "kHbgv");
        lIIlllIlI[lIIlllIll[1]] = lIIIlIIlIlI("Cy8FPREiJBI=", "NAvRd");
    }

    private static boolean lIIIlIIllIl(int i2) {
        return i2 == 0;
    }

    private static String lIIIlIIlIIl(String llIIIlIlIlIlIlI, String llIIIlIlIlIlIIl) {
        try {
            SecretKeySpec llIIIlIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIIlllIll[4]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIll[3], llIIIlIlIlIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIlIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlIlIlIlIll) {
            llIIIlIlIlIlIll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lIIIlIIllIl(this.eI.useSoulBearer() ? 1 : 0)) {
            return lIIlllIll[0];
        }
        if (lIIIlIIlllI(Inventory.contains(item -> {
            return item.getName().contains(lIIlllIlI[lIIlllIll[1]]);
        }) ? 1 : 0)) {
            int[] iArr = new int[lIIlllIll[1]];
            iArr[lIIlllIll[0]] = lIIlllIll[2];
            if (lIIIlIIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlllIll[1]];
                iArr2[lIIlllIll[0]] = lIIlllIll[2];
                Inventory.getFirst(iArr2).interact(lIIlllIlI[lIIlllIll[0]]);
                sleep(lIIlllIll[1]);
            }
        }
        return lIIlllIll[1];
    }

    @Inject
    public aP(LooterConfig looterConfig, SquireLooter squireLooter) {
        this.eI = looterConfig;
        this.eJ = squireLooter;
    }
}
