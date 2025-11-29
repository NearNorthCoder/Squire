package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 100)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.x  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/x.class */
public class x extends Task {
    private final /* synthetic */ SquireGorillaConfig aj;
    private static /* synthetic */ String[] llIIlIlIlIIl;
    private static /* synthetic */ int[] llIIlIlIlIlI;

    private static boolean lllllIlIllIIII(int i, int i2) {
        return i > i2;
    }

    @Inject
    public x(SquireGorillaConfig squireGorillaConfig) {
        this.aj = squireGorillaConfig;
    }

    private static boolean lllllIlIllIIIl(Object obj) {
        return obj == null;
    }

    static {
        lllllIlIlIllll();
        lllllIlIlIlllI();
    }

    private static boolean lllllIlIllIIlI(int i, int i2) {
        return i < i2;
    }

    private static String lllllIlIlIllIl(String lllllllllllllllIlIIllllIlllIIIlI, String lllllllllllllllIlIIllllIlllIIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllllIlllIIIIl.toCharArray();
        int lllllllllllllllIlIIllllIllIllllI = llIIlIlIlIlI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIlIlIlI[0];
        while (lllllIlIllIIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIllllIllIllllI % charArray.length]));
            "".length();
            lllllllllllllllIlIIllllIllIllllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (lllllIlIllIIII(Combat.getCurrentHealth(), this.aj.eatAt())) {
            return llIIlIlIlIlI[0];
        }
        Item first = Inventory.getFirst(item -> {
            String str = llIIlIlIlIIl[llIIlIlIlIlI[1]];
            return item.hasAction((v1) -> {
                return r1.equals(v1);
            });
        });
        if (lllllIlIllIIIl(first)) {
            return llIIlIlIlIlI[0];
        }
        first.interact(llIIlIlIlIIl[llIIlIlIlIlI[0]]);
        return llIIlIlIlIlI[1];
    }

    private static String lllllIlIlIllII(String lllllllllllllllIlIIllllIllllIIlI, String lllllllllllllllIlIIllllIllllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIlIlIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllIllllIIll) {
            lllllllllllllllIlIIllllIllllIIll.printStackTrace();
            return null;
        }
    }

    private static void lllllIlIlIlllI() {
        llIIlIlIlIIl = new String[llIIlIlIlIlI[2]];
        llIIlIlIlIIl[llIIlIlIlIlI[0]] = lllllIlIlIllII("U38PQiUQU4I=", "RmvrQ");
        llIIlIlIlIIl[llIIlIlIlIlI[1]] = lllllIlIlIllIl("EzEN", "VPygc");
    }

    private static void lllllIlIlIllll() {
        llIIlIlIlIlI = new int[3];
        llIIlIlIlIlI[0] = ((208 ^ 197) ^ (125 ^ 70)) & (((103 ^ 25) ^ (196 ^ 148)) ^ (-" ".length()));
        llIIlIlIlIlI[1] = " ".length();
        llIIlIlIlIlI[2] = "  ".length();
    }
}
