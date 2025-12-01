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
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking range potion")
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.H  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/H.class */
public class H extends Task {
    private final /* synthetic */ C0006g aP;
    private static /* synthetic */ String[] lIIlIlIlIIlII;
    private static /* synthetic */ int[] lIIlIlIlIIlIl;

    private static void lIlIlIlllllIlIl() {
        lIIlIlIlIIlIl = new int[7];
        lIIlIlIlIIlIl[0] = (72 ^ 41) & ((15 ^ 110) ^ (-1));
        lIIlIlIlIIlIl[1] = 60 ^ 40;
        lIIlIlIlIIlIl[2] = 179 ^ 181;
        lIIlIlIlIIlIl[3] = " ".length();
        lIIlIlIlIIlIl[4] = "  ".length();
        lIIlIlIlIIlIl[5] = "   ".length();
        lIIlIlIlIIlIl[6] = (81 ^ 38) ^ (((100 + 28) - 64) + 63);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlIlIlllllIllI(this.aP.m() ? 1 : 0) || lIlIlIlllllIllI(this.aP.l() ? 1 : 0)) {
            return lIIlIlIlIIlIl[0];
        }
        if (lIlIlIlllllIlll(this.aP.k(), lIIlIlIlIIlIl[1])) {
            return lIIlIlIlIIlIl[0];
        }
        if (lIlIlIllllllIII(this.aP.t()) && lIlIlIlllllIllI(this.aP.t().B() ? 1 : 0)) {
            return lIIlIlIlIIlIl[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (!lIlIlIllllllIlI(item.getName().toLowerCase().contains(lIIlIlIlIIlII[lIIlIlIlIIlIl[3]]) ? 1 : 0) || lIlIlIlllllIllI(item.getName().toLowerCase().contains(lIIlIlIlIIlII[lIIlIlIlIIlIl[4]]) ? 1 : 0)) {
                ?? r0 = lIIlIlIlIIlIl[3];
                "".length();
                return " ".length() != " ".length() ? ((((110 + 96) - 203) + 135) ^ (((30 + 7) - 3) + 144)) & (((9 ^ 22) ^ (123 ^ 92)) ^ (-" ".length())) : r0;
            }
            return lIIlIlIlIIlIl[0];
        });
        if (!lIlIlIllllllIIl(first) && !lIlIlIlllllIlll(Skills.getBoostedLevel(Skill.RANGED) - Skills.getLevel(Skill.RANGED), lIIlIlIlIIlIl[2])) {
            first.interact(lIIlIlIlIIlII[lIIlIlIlIIlIl[0]]);
            return lIIlIlIlIIlIl[3];
        }
        return lIIlIlIlIIlIl[0];
    }

    private static boolean lIlIlIllllllIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIllllllIlI(int i) {
        return i == 0;
    }

    private static boolean lIlIlIllllllIII(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIllllllIIl(Object obj) {
        return obj == null;
    }

    @Inject
    public H(C0006g c0006g) {
        this.aP = c0006g;
    }

    static {
        lIlIlIlllllIlIl();
        lIlIlIlllllIlII();
    }

    private static String lIlIlIlllllIIll(String llllllllllllllIllllIlllIlIIllIlI, String llllllllllllllIllllIlllIlIIllIll) {
        try {
            SecretKeySpec llllllllllllllIllllIlllIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlllIlIIllIll.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIIlIl[6]), "DES");
            Cipher llllllllllllllIllllIlllIlIIllllI = Cipher.getInstance("DES");
            llllllllllllllIllllIlllIlIIllllI.init(lIIlIlIlIIlIl[4], llllllllllllllIllllIlllIlIIlllll);
            return new String(llllllllllllllIllllIlllIlIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlllIlIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlllIlIIlllIl) {
            llllllllllllllIllllIlllIlIIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlllllIlll(int i, int i2) {
        return i > i2;
    }

    private static void lIlIlIlllllIlII() {
        lIIlIlIlIIlII = new String[lIIlIlIlIIlIl[5]];
        lIIlIlIlIIlII[lIIlIlIlIIlIl[0]] = lIlIlIlllllIIlI("FTEQNjE=", "QCyXZ");
        lIIlIlIlIIlII[lIIlIlIlIIlIl[3]] = lIlIlIlllllIIll("BHULWyCJRlA=", "ZmGhZ");
        lIIlIlIlIIlII[lIIlIlIlIIlIl[4]] = lIlIlIlllllIIlI("Mi00ICE/Ig==", "PLGTH");
    }

    private static String lIlIlIlllllIIlI(String llllllllllllllIllllIlllIlIllIIIl, String llllllllllllllIllllIlllIlIllIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIlllIlIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIlllIlIllIIII.toCharArray();
        int llllllllllllllIllllIlllIlIlIllIl = lIIlIlIlIIlIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIlIIlIl[0];
        while (lIlIlIllllllIll(i, length)) {
            char llllllllllllllIllllIlllIlIllIIlI = charArray2[i];
            sb.append((char) (llllllllllllllIllllIlllIlIllIIlI ^ charArray[llllllllllllllIllllIlllIlIlIllIl % charArray.length]));
            "".length();
            llllllllllllllIllllIlllIlIlIllIl++;
            i++;
            "".length();
            if (" ".length() < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIlllllIllI(int i) {
        return i != 0;
    }
}
