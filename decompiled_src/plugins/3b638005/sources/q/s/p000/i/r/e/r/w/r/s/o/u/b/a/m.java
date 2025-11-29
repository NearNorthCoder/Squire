package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Restoring prayer", priority = 133337)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.m  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/m.class */
public class m extends Task {
    private static /* synthetic */ String[] llllIIIIIIl;
    private final /* synthetic */ SquireBarrows Q;
    private static /* synthetic */ int[] llllIIIIIlI;

    private static boolean lIllIIlIllllll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    public boolean run() {
        if (!lIllIIlIlllIlI(this.Q.h() ? 1 : 0) && !lIllIIlIlllIll(Prayers.getPoints())) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[llllIIIIIlI[2]];
                strArr[llllIIIIIlI[0]] = llllIIIIIIl[llllIIIIIlI[2]];
                if (!lIllIIlIlllllI(item.hasAction(strArr) ? 1 : 0) || (lIllIIlIlllIlI(item.getName().toLowerCase().contains(llllIIIIIIl[llllIIIIIlI[3]]) ? 1 : 0) && !lIllIIlIlllllI(item.getName().toLowerCase().contains(llllIIIIIIl[llllIIIIIlI[4]]) ? 1 : 0))) {
                    return llllIIIIIlI[0];
                }
                ?? r0 = llllIIIIIlI[2];
                "".length();
                return ((236 ^ 196) & ((61 ^ 21) ^ (-1))) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            });
            if (lIllIIlIllllII(first)) {
                return llllIIIIIlI[0];
            }
            NPC nearest = NPCs.getNearest((v0) -> {
                return d.a(v0);
            });
            if (!lIllIIlIllllIl(nearest) || lIllIIlIlllllI(nearest.isDead() ? 1 : 0)) {
                return llllIIIIIlI[0];
            }
            first.interact(llllIIIIIIl[llllIIIIIlI[0]]);
            sleep(llllIIIIIlI[1]);
            return llllIIIIIlI[2];
        }
        return llllIIIIIlI[0];
    }

    private static String lIllIIlIllIlIl(String llllllllllllllllIIIllllIlIlllIII, String llllllllllllllllIIIllllIlIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllllIlIllIlll.getBytes(StandardCharsets.UTF_8)), llllIIIIIlI[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIIIIIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllllIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllllIlIlllIIl) {
            llllllllllllllllIIIllllIlIlllIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIllIIlIlllIIl();
        lIllIIlIllIlll();
    }

    private static void lIllIIlIlllIIl() {
        llllIIIIIlI = new int[6];
        llllIIIIIlI[0] = (210 ^ 196) & ((160 ^ 182) ^ (-1));
        llllIIIIIlI[1] = (((102 + 4) - 33) + 60) ^ (((105 + 116) - 184) + 92);
        llllIIIIIlI[2] = " ".length();
        llllIIIIIlI[3] = "  ".length();
        llllIIIIIlI[4] = "   ".length();
        llllIIIIIlI[5] = 154 ^ 146;
    }

    private static boolean lIllIIlIlllIll(int i) {
        return i > 0;
    }

    private static boolean lIllIIlIlllllI(int i) {
        return i != 0;
    }

    @Inject
    public m(SquireBarrows squireBarrows) {
        this.Q = squireBarrows;
    }

    private static String lIllIIlIllIIll(String llllllllllllllllIIIllllIlIIllIll, String llllllllllllllllIIIllllIlIIllIlI) {
        String llllllllllllllllIIIllllIlIIllIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIllllIlIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIIllllIlIIllIlI.toCharArray();
        int llllllllllllllllIIIllllIlIIlIlll = llllIIIIIlI[0];
        char[] charArray2 = llllllllllllllllIIIllllIlIIllIll2.toCharArray();
        int length = charArray2.length;
        int i = llllIIIIIlI[0];
        while (lIllIIlIllllll(i, length)) {
            char llllllllllllllllIIIllllIlIIlllII = charArray2[i];
            sb.append((char) (llllllllllllllllIIIllllIlIIlllII ^ charArray[llllllllllllllllIIIllllIlIIlIlll % charArray.length]));
            "".length();
            llllllllllllllllIIIllllIlIIlIlll++;
            i++;
            "".length();
            if (((" ".length() ^ (81 ^ 72)) & (((238 ^ 190) ^ (6 ^ 78)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIIlIllIlII(String llllllllllllllllIIIllllIlIlIlIll, String llllllllllllllllIIIllllIlIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllllIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIIIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllllIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllllIlIlIIlll) {
            llllllllllllllllIIIllllIlIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIllllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIllIIlIllllII(Object obj) {
        return obj == null;
    }

    private static void lIllIIlIllIlll() {
        llllIIIIIIl = new String[llllIIIIIlI[1]];
        llllIIIIIIl[llllIIIIIlI[0]] = lIllIIlIllIIll("KxYqJSI=", "odCKI");
        llllIIIIIIl[llllIIIIIlI[2]] = lIllIIlIllIlII("C5D4JxbifUM=", "xWitx");
        llllIIIIIIl[llllIIIIIlI[3]] = lIllIIlIllIlIl("JVfYlVKWDys=", "UqdNv");
        llllIIIIIIl[llllIIIIIlI[4]] = lIllIIlIllIlII("lcKz1SD3RjE=", "BiMfI");
    }

    private static boolean lIllIIlIlllIlI(int i) {
        return i == 0;
    }
}
