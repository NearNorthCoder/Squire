package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(priority = 5, name = "Traversing home")
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.J  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/J.class */
public class J extends AbstractC0013n {
    private static /* synthetic */ String[] llIIllIIIIII;
    private static /* synthetic */ int[] llIIllIIIIIl;

    private static void llllllIIlIIlII() {
        llIIllIIIIII = new String[llIIllIIIIIl[0]];
        llIIllIIIIII[llIIllIIIIIl[1]] = llllllIIlIIIlI("XYxZK6wCoIJD2khSYKuSekHh7uLJWLtSv0UYbycNfUXNEd0E8ZnaHw==", "hnKTP");
        llIIllIIIIII[llIIllIIIIIl[2]] = llllllIIlIIIll("Lg4yLz0OGSM=", "omFFK");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        int i;
        Player local = Players.getLocal();
        if (llllllIIlIIllI(local)) {
            return llIIllIIIIIl[1];
        }
        if (llllllIIlIIlll(this.ba.J()) && llllllIIlIlIII(EnumC0008i.CRYSTAL_ORB.aC())) {
            return llIIllIIIIIl[1];
        }
        if (!llllllIIlIlIII(this.ba.N() ? 1 : 0) || (llllllIIlIlIIl(this.ba.a(EnumC0005f.TIER_3_STAFF) ? 1 : 0) && llllllIIlIlIIl(bB() ? 1 : 0))) {
            i = llIIllIIIIIl[2];
            "".length();
            if ("   ".length() >= ((((72 + 109) - 70) + 26) ^ (((100 + 0) - 38) + 79))) {
                return ("  ".length() ^ (136 ^ 176)) & (((((23 + 91) - (-17)) + 49) ^ (((111 + 61) - 81) + 51)) ^ (-" ".length()));
            }
        } else {
            i = llIIllIIIIIl[1];
        }
        int i2 = i;
        Item first = Inventory.getFirst(item -> {
            return C0004e.ab.contains(Integer.valueOf(item.getId()));
        });
        if (llllllIIlIlIII(i2) && llllllIIlIlIlI(this.ba.M(), llIIllIIIIIl[3]) && llllllIIlIlIII(Inventory.isFull() ? 1 : 0)) {
            return llIIllIIIIIl[1];
        }
        if (llllllIIlIIllI(first)) {
            Log.info(llIIllIIIIII[llIIllIIIIIl[1]]);
            return this.ba.a(this.ba.V().av(), local.getWorldLocation());
        }
        first.interact(llIIllIIIIII[llIIllIIIIIl[2]]);
        return llIIllIIIIIl[2];
    }

    private static boolean llllllIIlIIlll(Object obj) {
        return obj != null;
    }

    private static String llllllIIlIIIlI(String lllllllllllllllIlIIlIllllIIIlIIl, String lllllllllllllllIlIIlIllllIIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllllIIIlIII.getBytes(StandardCharsets.UTF_8)), llIIllIIIIIl[4]), "DES");
            Cipher lllllllllllllllIlIIlIllllIIIlIll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIllllIIIlIll.init(llIIllIIIIIl[0], secretKeySpec);
            return new String(lllllllllllllllIlIIlIllllIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllllIIIIlIl) {
            lllllllllllllllIlIIlIllllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIlIIllI(Object obj) {
        return obj == null;
    }

    private static boolean llllllIIlIlIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean bB() {
        if (llllllIIlIlIIl(this.ba.h().makeT3Offhand() ? 1 : 0) && llllllIIlIlIIl(this.ba.h().goHomeT3() ? 1 : 0)) {
            ?? r0 = llIIllIIIIIl[2];
            "".length();
            return (((((26 + 82) - 9) + 28) ^ (236 ^ 128)) & (((221 ^ 169) ^ (240 ^ 151)) ^ (-" ".length()))) >= ((((110 + 83) - 89) + 55) ^ (((105 + 149) - 119) + 20)) ? ((30 ^ 27) ^ (25 ^ 23)) & (((((128 + 198) - 191) + 65) ^ (((80 + 20) - (-33)) + 62)) ^ (-" ".length())) : r0;
        }
        return llIIllIIIIIl[1];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIllIIIIIl[0]];
        enumC0003dArr[llIIllIIIIIl[1]] = EnumC0003d.DEMI_BOSS_EXPLORE;
        enumC0003dArr[llIIllIIIIIl[2]] = EnumC0003d.EXTRA_FOOD_EXPLORE;
    }

    private static String llllllIIlIIIll(String lllllllllllllllIlIIlIllllIIllIIl, String lllllllllllllllIlIIlIllllIIlllIl) {
        String lllllllllllllllIlIIlIllllIIllIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIllllIIlllII = new StringBuilder();
        char[] lllllllllllllllIlIIlIllllIIllIll = lllllllllllllllIlIIlIllllIIlllIl.toCharArray();
        int lllllllllllllllIlIIlIllllIIllIlI = llIIllIIIIIl[1];
        char[] charArray = lllllllllllllllIlIIlIllllIIllIIl2.toCharArray();
        int length = charArray.length;
        int i = llIIllIIIIIl[1];
        while (llllllIIlIlIll(i, length)) {
            lllllllllllllllIlIIlIllllIIlllII.append((char) (charArray[i] ^ lllllllllllllllIlIIlIllllIIllIll[lllllllllllllllIlIIlIllllIIllIlI % lllllllllllllllIlIIlIllllIIllIll.length]));
            "".length();
            lllllllllllllllIlIIlIllllIIllIlI++;
            i++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIllllIIlllII);
    }

    private static void llllllIIlIIlIl() {
        llIIllIIIIIl = new int[5];
        llIIllIIIIIl[0] = "  ".length();
        llIIllIIIIIl[1] = (72 ^ 85) & ((151 ^ 138) ^ (-1));
        llIIllIIIIIl[2] = " ".length();
        llIIllIIIIIl[3] = (77 ^ 6) ^ (196 ^ 145);
        llIIllIIIIIl[4] = (240 ^ 142) ^ (21 ^ 99);
    }

    static {
        llllllIIlIIlIl();
        llllllIIlIIlII();
    }

    private static boolean llllllIIlIlIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean llllllIIlIlIll(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllIIlIlIII(int i) {
        return i == 0;
    }
}
