package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
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
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Drinking stamina dose", priority = 8)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.r  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/r.class */
public class r extends Task {
    private static /* synthetic */ int[] lIIlIlIIlllIl;
    private static /* synthetic */ String[] lIIlIlIIlllII;
    private final /* synthetic */ C0000a aa;
    private final /* synthetic */ l Z;
    private final /* synthetic */ C0006g Y;

    private static void lIlIlIlllIlIlll() {
        lIIlIlIIlllIl = new int[6];
        lIIlIlIIlllIl[0] = ((118 ^ 54) ^ (106 ^ 53)) & (((((125 + 101) - 198) + 163) ^ (((22 + 20) - (-68)) + 50)) ^ (-" ".length()));
        lIIlIlIIlllIl[1] = 177 ^ 175;
        lIIlIlIIlllIl[2] = "   ".length();
        lIIlIlIIlllIl[3] = " ".length();
        lIIlIlIIlllIl[4] = "  ".length();
        lIIlIlIIlllIl[5] = (((108 + 15) - 107) + 129) ^ (((39 + 146) - 103) + 71);
    }

    private static boolean lIlIlIlllIllIlI(Object obj) {
        return obj != null;
    }

    private static String lIlIlIlllIlIlII(String llllllllllllllIllllIlllllIIIlIll, String llllllllllllllIllllIlllllIIIlIlI) {
        String llllllllllllllIllllIlllllIIIlIll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIlllllIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIlllllIIIlIlI.toCharArray();
        int llllllllllllllIllllIlllllIIIIlll = lIIlIlIIlllIl[0];
        char[] charArray2 = llllllllllllllIllllIlllllIIIlIll2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIIlllIl[0];
        while (lIlIlIlllIllIll(i, length)) {
            char llllllllllllllIllllIlllllIIIllII = charArray2[i];
            sb.append((char) (llllllllllllllIllllIlllllIIIllII ^ charArray[llllllllllllllIllllIlllllIIIIlll % charArray.length]));
            "".length();
            llllllllllllllIllllIlllllIIIIlll++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIlllIllIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIlIlIlllIllIII(this.Y.m() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        if (!lIlIlIlllIllIIl(this.Y.l() ? 1 : 0) || lIlIlIlllIllIlI(this.Z.M())) {
            return lIIlIlIIlllIl[0];
        }
        if (!lIlIlIlllIllIll(Movement.getRunEnergy(), lIIlIlIIlllIl[1]) || lIlIlIlllIllIIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(lIIlIlIIlllII[lIIlIlIIlllIl[3]]);
        });
        if (!lIlIlIlllIllIlI(first) || lIlIlIlllIllIII(this.aa.e() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        first.interact(lIIlIlIIlllII[lIIlIlIIlllIl[0]]);
        this.aa.b();
        sleep(lIIlIlIIlllIl[2]);
        return lIIlIlIIlllIl[3];
    }

    private static boolean lIlIlIlllIllIII(int i) {
        return i == 0;
    }

    @Inject
    public r(C0006g c0006g, l lVar, C0000a c0000a) {
        this.Y = c0006g;
        this.Z = lVar;
        this.aa = c0000a;
    }

    static {
        lIlIlIlllIlIlll();
        lIlIlIlllIlIllI();
    }

    private static boolean lIlIlIlllIllIIl(int i) {
        return i != 0;
    }

    private static String lIlIlIlllIlIlIl(String llllllllllllllIllllIllllIlllIllI, String llllllllllllllIllllIllllIlllIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllllIlllIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIIlllIl[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlIIlllIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllllIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllllIlllIlll) {
            llllllllllllllIllllIllllIlllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlllIlIllI() {
        lIIlIlIIlllII = new String[lIIlIlIIlllIl[4]];
        lIIlIlIIlllII[lIIlIlIIlllIl[0]] = lIlIlIlllIlIlII("Fh46Gi0=", "RlStF");
        lIIlIlIIlllII[lIIlIlIIlllIl[3]] = lIlIlIlllIlIlIl("1oNu0JYjjvM=", "sKqmh");
    }
}
