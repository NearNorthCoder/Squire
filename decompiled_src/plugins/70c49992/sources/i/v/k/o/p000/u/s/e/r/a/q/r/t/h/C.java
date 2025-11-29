package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Swapping bolts", priority = 50)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.C  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/C.class */
public class C extends w {
    private static /* synthetic */ String[] lIlIllIIIlIII;
    private static final /* synthetic */ int cl;
    private static /* synthetic */ int[] lIlIllIIIlIIl;

    private static boolean llIIIIIIIlIIlll(int i2) {
        return i2 == 0;
    }

    private static boolean llIIIIIIIlIIlIl(int i2) {
        return i2 > 0;
    }

    private static void llIIIIIIIlIIIlI() {
        lIlIllIIIlIIl = new int[9];
        lIlIllIIIlIIl[0] = " ".length();
        lIlIllIIIlIIl[1] = ((188 ^ 134) ^ (36 ^ 63)) & (((41 ^ 19) ^ (177 ^ 170)) ^ (-" ".length()));
        lIlIllIIIlIIl[2] = "  ".length();
        lIlIllIIIlIIl[3] = "   ".length();
        lIlIllIIIlIIl[4] = (124 ^ 56) ^ (16 ^ 80);
        lIlIllIIIlIIl[5] = 189 ^ 184;
        lIlIllIIIlIIl[6] = 59 ^ 24;
        lIlIllIIIlIIl[7] = (34 ^ 117) ^ (36 ^ 117);
        lIlIllIIIlIIl[8] = (163 ^ 159) ^ (51 ^ 7);
    }

    private static void llIIIIIIIlIIIIl() {
        lIlIllIIIlIII = new String[lIlIllIIIlIIl[7]];
        lIlIllIIIlIII[lIlIllIIIlIIl[1]] = llIIIIIIIIlllll("hHfQHUMT9Ec=", "dUwod");
        lIlIllIIIlIII[lIlIllIIIlIIl[0]] = llIIIIIIIlIIIII("DR8NNAU=", "ZvhXa");
        lIlIllIIIlIII[lIlIllIIIlIIl[2]] = llIIIIIIIlIIIII("QwJ4", "kgQVy");
        lIlIllIIIlIII[lIlIllIIIlIIl[3]] = llIIIIIIIIlllll("tDoWIEEwZTs=", "jTLQF");
        lIlIllIIIlIII[lIlIllIIIlIIl[4]] = llIIIIIIIIlllll("uP2JuNa33yo=", "oljwr");
        lIlIllIIIlIII[lIlIllIIIlIIl[5]] = llIIIIIIIlIIIII("Jw8NKA==", "UzoQs");
    }

    private static boolean llIIIIIIIlIIlII(Object obj) {
        return obj == null;
    }

    private static String llIIIIIIIlIIIII(String llllllllllllllIllIlIIllIlllIlIIl, String llllllllllllllIllIlIIllIlllIlIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIllIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIllIlllIIlll = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIIllIlllIlIII.toCharArray();
        int llllllllllllllIllIlIIllIlllIIlIl = lIlIllIIIlIIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIllIIIlIIl[1];
        while (llIIIIIIIlIlIII(i2, length)) {
            char llllllllllllllIllIlIIllIlllIlIlI = charArray2[i2];
            llllllllllllllIllIlIIllIlllIIlll.append((char) (llllllllllllllIllIlIIllIlllIlIlI ^ charArray[llllllllllllllIllIlIIllIlllIIlIl % charArray.length]));
            "".length();
            llllllllllllllIllIlIIllIlllIIlIl++;
            i2++;
            "".length();
            if ((((224 ^ 179) ^ (144 ^ 148)) & (((222 ^ 199) ^ (74 ^ 4)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIIllIlllIIlll);
    }

    private static String llIIIIIIIIlllll(String llllllllllllllIllIlIIllIlllllIIl, String llllllllllllllIllIlIIllIlllllIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIllIllllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllIlllllIII.getBytes(StandardCharsets.UTF_8)), lIlIllIIIlIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIIIlIIl[2], llllllllllllllIllIlIIllIllllllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIllIlllllIlI) {
            llllllllllllllIllIlIIllIlllllIlI.printStackTrace();
            return null;
        }
    }

    static {
        llIIIIIIIlIIIlI();
        llIIIIIIIlIIIIl();
        cl = lIlIllIIIlIIl[6];
    }

    private static boolean llIIIIIIIlIIllI(int i2) {
        return i2 != 0;
    }

    private static int llIIIIIIIlIIIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        int i2;
        Item first;
        NPC c = this.cg.c(lIlIllIIIlIIl[0]);
        if (llIIIIIIIlIIlII(c)) {
            return lIlIllIIIlIIl[1];
        }
        if (llIIIIIIIlIIlIl(llIIIIIIIlIIIll((c.getHealthRatio() / c.getHealthScale()) * 100.0d, 35.0d))) {
            i2 = lIlIllIIIlIIl[0];
            "".length();
            if ("  ".length() <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = lIlIllIIIlIIl[1];
        }
        if (llIIIIIIIlIIllI(i2)) {
            first = Inventory.getFirst(item -> {
                if (llIIIIIIIlIIllI(item.getName().contains(lIlIllIIIlIII[lIlIllIIIlIIl[4]]) ? 1 : 0) && llIIIIIIIlIIllI(item.getName().toLowerCase().contains(lIlIllIIIlIII[lIlIllIIIlIIl[5]]) ? 1 : 0)) {
                    ?? r0 = lIlIllIIIlIIl[0];
                    "".length();
                    return " ".length() < 0 ? ((((34 + 39) - 44) + 157) ^ (((89 + 167) - 236) + 149)) & (((119 ^ 89) ^ (113 ^ 76)) ^ (-" ".length())) : r0;
                }
                return lIlIllIIIlIIl[1];
            });
            "".length();
            if ("  ".length() >= ((((33 + 140) - 166) + 140) ^ (((145 + 4) - 16) + 18))) {
                return ((((124 + 175) - 108) + 57) ^ (((84 + 56) - 66) + 101)) & (((((129 + 30) - (-2)) + 51) ^ (((93 + 11) - 92) + 119)) ^ (-" ".length()));
            }
        } else {
            first = Inventory.getFirst(item2 -> {
                if (llIIIIIIIlIIllI(item2.getName().contains(lIlIllIIIlIII[lIlIllIIIlIIl[2]]) ? 1 : 0) && llIIIIIIIlIIllI(item2.getName().toLowerCase().contains(lIlIllIIIlIII[lIlIllIIIlIIl[3]]) ? 1 : 0)) {
                    ?? r0 = lIlIllIIIlIIl[0];
                    "".length();
                    return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIllIIIlIIl[1];
            });
        }
        if (llIIIIIIIlIIlII(first)) {
            return lIlIllIIIlIIl[1];
        }
        String[] strArr = new String[lIlIllIIIlIIl[0]];
        strArr[lIlIllIIIlIIl[1]] = lIlIllIIIlIII[lIlIllIIIlIIl[1]];
        if (llIIIIIIIlIIlll(first.hasAction(strArr) ? 1 : 0)) {
            return lIlIllIIIlIIl[1];
        }
        first.interact(lIlIllIIIlIII[lIlIllIIIlIIl[0]]);
        return lIlIllIIIlIIl[0];
    }

    @Inject
    protected C(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static boolean llIIIIIIIlIlIII(int i2, int i3) {
        return i2 < i3;
    }
}
