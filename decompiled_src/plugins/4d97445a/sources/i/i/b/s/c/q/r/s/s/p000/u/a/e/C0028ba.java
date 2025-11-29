package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Inflating Toad", priority = 2)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ba  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ba.class */
public class C0028ba extends Task {
    private static /* synthetic */ String[] lllIll;
    private static /* synthetic */ int[] lllllI;

    private static boolean llllIlIl(Object obj) {
        return obj != null;
    }

    static {
        llllIIlI();
        lllIllll();
    }

    private static void llllIIlI() {
        lllllI = new int[9];
        lllllI[0] = (99 ^ 104) & ((91 ^ 80) ^ (-1));
        lllllI[1] = " ".length();
        lllllI[2] = (-((-8617) & 29161)) & (-1025) & 24443;
        lllllI[3] = "  ".length();
        lllllI[4] = (-12422) & 15295;
        lllllI[5] = (-((-6425) & 31199)) & (-5121) & 32767;
        lllllI[6] = (-25799) & 28670;
        lllllI[7] = "   ".length();
        lllllI[8] = 60 ^ 52;
    }

    private static String lllIlllI(String llllIIllIIIIIIl, String llllIIlIllllIll) {
        String llllIIllIIIIIIl2 = new String(Base64.getDecoder().decode(llllIIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIIlIlllllll = new StringBuilder();
        char[] charArray = llllIIlIllllIll.toCharArray();
        int llllIIlIlllllIl = lllllI[0];
        char[] charArray2 = llllIIllIIIIIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lllllI[0];
        while (llllIlll(i2, length)) {
            llllIIlIlllllll.append((char) (charArray2[i2] ^ charArray[llllIIlIlllllIl % charArray.length]));
            "".length();
            llllIIlIlllllIl++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllIIlIlllllll);
    }

    private static void lllIllll() {
        lllIll = new String[lllllI[7]];
        lllIll[lllllI[0]] = lllIllIl("JOwBMCeriak=", "ELmmg");
        lllIll[lllllI[1]] = lllIlllI("OiASHz1JIxwTKQ==", "iWsrM");
        lllIll[lllllI[3]] = lllIlllI("OCwqJQwFJw==", "qBLIm");
    }

    private static boolean llllIlII(int i2) {
        return i2 != 0;
    }

    private static boolean llllIllI(Object obj) {
        return obj == null;
    }

    private static String lllIllIl(String llllIIllIIlIIIl, String llllIIllIIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIIllIIlIIII.getBytes(StandardCharsets.UTF_8)), lllllI[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllllI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllIIllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllIIllIIlIIlI) {
            llllIIllIIlIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean ct() {
        int[] iArr = new int[lllllI[1]];
        iArr[lllllI[0]] = lllllI[4];
        if (llllIIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllllI[1]];
            iArr2[lllllI[0]] = lllllI[5];
            if (llllIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lllllI[1]];
                iArr3[lllllI[0]] = lllllI[6];
                if (!llllIlII(Inventory.contains(iArr3) ? 1 : 0)) {
                    return lllllI[0];
                }
            }
        }
        ?? r0 = lllllI[1];
        "".length();
        return "  ".length() == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean llllIlll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llllIIll(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean run() {
        if (llllIIll(ct() ? 1 : 0)) {
            return lllllI[0];
        }
        int[] iArr = new int[lllllI[1]];
        iArr[lllllI[0]] = lllllI[2];
        if (llllIlII(Inventory.contains(iArr) ? 1 : 0)) {
            return lllllI[0];
        }
        if (!llllIIll(Players.getLocal().isAnimating() ? 1 : 0) || llllIlIl(Players.getLocal().getInteracting())) {
            return lllllI[0];
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (llllIlII(npc.getName().equals(lllIll[lllllI[1]]) ? 1 : 0)) {
                String[] strArr = new String[lllllI[1]];
                strArr[lllllI[0]] = lllIll[lllllI[3]];
                if (llllIlII(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lllllI[1];
                    "".length();
                    return (((2 ^ 98) ^ "   ".length()) & (((4 ^ 61) ^ (226 ^ 184)) ^ (-" ".length()))) < (((((65 + 145) - 90) + 97) ^ (((74 + 52) - 3) + 14)) & (((((105 + 193) - 70) + 20) ^ (((139 + 2) - 32) + 59)) ^ (-" ".length()))) ? ((230 ^ 178) ^ (179 ^ 190)) & (((202 ^ 152) ^ (46 ^ 37)) ^ (-" ".length())) : r0;
                }
            }
            return lllllI[0];
        });
        if (llllIllI(nearest)) {
            return lllllI[0];
        }
        nearest.interact(lllIll[lllllI[0]]);
        sleep(lllllI[3]);
        return lllllI[1];
    }
}
