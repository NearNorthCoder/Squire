package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Killing minions", priority = 2, blocking = true)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.A  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/A.class */
public class A extends Task {
    private static /* synthetic */ String[] lIllIIIllllII;
    private static /* synthetic */ int[] lIllIIIlllllI;
    private final /* synthetic */ SquireZammyConfig ay;
    private final /* synthetic */ l ax;

    static {
        llIIIlIlIlllIll();
        llIIIlIlIlllIII();
    }

    private static String llIIIlIlIllIllI(String llllllllllllllIllIIlIlIlllIlIIlI, String llllllllllllllIllIIlIlIlllIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlIlIlllIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), lIllIIIlllllI[6]), "DES");
            Cipher llllllllllllllIllIIlIlIlllIlIlII = Cipher.getInstance("DES");
            llllllllllllllIllIIlIlIlllIlIlII.init(lIllIIIlllllI[4], llllllllllllllIllIIlIlIlllIlIlIl);
            return new String(llllllllllllllIllIIlIlIlllIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIlllIlIIll) {
            llllllllllllllIllIIlIlIlllIlIIll.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIlIlllIll() {
        lIllIIIlllllI = new int[7];
        lIllIIIlllllI[0] = ((((77 + 124) - 174) + 117) ^ (((27 + 107) - (-33)) + 18)) & (((83 ^ 50) ^ (249 ^ 177)) ^ (-" ".length()));
        lIllIIIlllllI[1] = " ".length();
        lIllIIIlllllI[2] = 0 ^ 50;
        lIllIIIlllllI[3] = (((108 + 71) - 168) + 176) ^ (((97 + 84) - 173) + 169);
        lIllIIIlllllI[4] = "  ".length();
        lIllIIIlllllI[5] = "   ".length();
        lIllIIIlllllI[6] = 58 ^ 50;
    }

    private static void llIIIlIlIlllIII() {
        lIllIIIllllII = new String[lIllIIIlllllI[5]];
        lIllIIIllllII[lIllIIIlllllI[0]] = llIIIlIlIllIlII("LBoqHAVYFz4aEQgcIhA=", "xuRuf");
        lIllIIIllllII[lIllIIIlllllI[1]] = llIIIlIlIllIllI("C9je6IuUTXw=", "bZQtW");
        lIllIIIllllII[lIllIIIlllllI[4]] = llIIIlIlIllIlll("5ZH9lhHSY6U=", "ttpSL");
    }

    @Inject
    public A(l lVar, SquireZammyConfig squireZammyConfig) {
        this.ax = lVar;
        this.ay = squireZammyConfig;
    }

    private static boolean llIIIlIlIlllllI(int i, int i2) {
        return i >= i2;
    }

    private static String llIIIlIlIllIlII(String llllllllllllllIllIIlIlIllllIIlll, String llllllllllllllIllIIlIlIllllIIllI) {
        String llllllllllllllIllIIlIlIllllIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIlIllllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIIlIlIllllIIllI.toCharArray();
        int llllllllllllllIllIIlIlIllllIIIll = lIllIIIlllllI[0];
        char[] charArray2 = llllllllllllllIllIIlIlIllllIIlll2.toCharArray();
        int llllllllllllllIllIIlIlIlllIlllII = charArray2.length;
        int i = lIllIIIlllllI[0];
        while (llIIIlIllIIIIIl(i, llllllllllllllIllIIlIlIlllIlllII)) {
            char llllllllllllllIllIIlIlIllllIlIII = charArray2[i];
            sb.append((char) (llllllllllllllIllIIlIlIllllIlIII ^ charArray[llllllllllllllIllIIlIlIllllIIIll % charArray.length]));
            "".length();
            llllllllllllllIllIIlIlIllllIIIll++;
            i++;
            "".length();
            if ("   ".length() <= (((((204 + 216) - 281) + 101) ^ (((64 + 143) - 171) + 111)) & (((184 ^ 162) ^ (53 ^ 76)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIlIlIllllII(this.ax.B() ? 1 : 0) || llIIIlIlIllllII(this.ax.A() ? 1 : 0)) {
            return lIllIIIlllllI[0];
        }
        int[] iArr = new int[lIllIIIlllllI[1]];
        iArr[lIllIIIlllllI[0]] = EnumC0004e.BALFRUG_KREEYATH.n();
        NPC nearest = NPCs.getNearest(iArr);
        if (!llIIIlIlIllllIl(nearest) || llIIIlIlIllllII(nearest.isDead() ? 1 : 0)) {
            return lIllIIIlllllI[0];
        }
        if (llIIIlIlIllllII(this.ay.useBlowpipe() ? 1 : 0) && llIIIlIlIlllllI(Combat.getSpecEnergy(), lIllIIIlllllI[2]) && llIIIlIlIllllll(Combat.getMissingHealth(), lIllIIIlllllI[3])) {
            String[] strArr = new String[lIllIIIlllllI[1]];
            strArr[lIllIIIlllllI[0]] = lIllIIIllllII[lIllIIIlllllI[0]];
            Item first = Inventory.getFirst(strArr);
            if (llIIIlIlIllllIl(first)) {
                first.interact(lIllIIIllllII[lIllIIIlllllI[1]]);
            }
            if (llIIIlIllIIIIII(Combat.isSpecEnabled() ? 1 : 0)) {
                Combat.toggleSpec();
            }
        }
        if (llIIIlIlIllllIl(Players.getLocal().getInteracting())) {
            return lIllIIIlllllI[0];
        }
        nearest.interact(lIllIIIllllII[lIllIIIlllllI[4]]);
        sleep(lIllIIIlllllI[4]);
        return lIllIIIlllllI[1];
    }

    private static boolean llIIIlIlIllllIl(Object obj) {
        return obj != null;
    }

    private static boolean llIIIlIllIIIIIl(int i, int i2) {
        return i < i2;
    }

    private static String llIIIlIlIllIlll(String llllllllllllllIllIIlIlIlllllIlll, String llllllllllllllIllIIlIlIlllllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIlIlllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIlIllllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIlIllllllIIl.init(lIllIIIlllllI[4], secretKeySpec);
            return new String(llllllllllllllIllIIlIlIllllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIlIlllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIlIllllllIII) {
            llllllllllllllIllIIlIlIllllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIlIllllll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIIlIlIllllII(int i) {
        return i != 0;
    }

    private static boolean llIIIlIllIIIIII(int i) {
        return i == 0;
    }
}
