package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.loot.LooterConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Alching loot")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aJ  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aJ.class */
public class aJ extends Task {
    private static /* synthetic */ String[] lIIlIllll;
    private static /* synthetic */ int[] lIIllIIII;
    private final /* synthetic */ LooterConfig ey;

    private static void lIIIIlIlIlI() {
        lIIlIllll = new String[lIIllIIII[2]];
        lIIlIllll[lIIllIIII[0]] = lIIIIlIlIIl("13XaxIyV5BM=", "QvwoX");
    }

    private static boolean lIIIIlIllIl(int i2) {
        return i2 == 0;
    }

    private static void lIIIIlIlIll() {
        lIIllIIII = new int[5];
        lIIllIIII[0] = (137 ^ 191) & ((90 ^ 108) ^ (-1));
        lIIllIIII[1] = 58 ^ 62;
        lIIllIIII[2] = " ".length();
        lIIllIIII[3] = 201 ^ 193;
        lIIllIIII[4] = "  ".length();
    }

    @Inject
    public aJ(LooterConfig looterConfig) {
        this.ey = looterConfig;
    }

    private static boolean lIIIIlIlllI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(ck());
        if (lIIIIlIllII(first)) {
            return lIIllIIII[0];
        }
        SpellBook.Standard standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (lIIIIlIllIl(standard.canCast() ? 1 : 0)) {
            return lIIllIIII[0];
        }
        Magic.cast(standard, first);
        sleep(lIIllIIII[1]);
        return lIIllIIII[2];
    }

    private static boolean lIIIIlIllll(int i2, int i3) {
        return i2 < i3;
    }

    private int[] ck() {
        if (lIIIIlIlllI(this.ey.alch().isEmpty() ? 1 : 0)) {
            return new int[lIIllIIII[0]];
        }
        String[] split = this.ey.alch().split(lIIlIllll[lIIllIIII[0]]);
        int[] iArr = new int[split.length];
        int i2 = lIIllIIII[0];
        while (lIIIIlIllll(i2, split.length)) {
            iArr[i2] = Integer.parseInt(split[i2].trim());
            i2++;
            "".length();
            if ((((15 ^ 99) ^ (45 ^ 30)) & (((15 ^ 85) ^ (177 ^ 180)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return iArr;
    }

    private static boolean lIIIIlIllII(Object obj) {
        return obj == null;
    }

    static {
        lIIIIlIlIll();
        lIIIIlIlIlI();
    }

    private static String lIIIIlIlIIl(String llIIIllIlIIllIl, String llIIIllIlIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIllIlIIllII.getBytes(StandardCharsets.UTF_8)), lIIllIIII[3]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIllIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIllIlIIlllI) {
            llIIIllIlIIlllI.printStackTrace();
            return null;
        }
    }
}
