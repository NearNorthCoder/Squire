package q.s.r.i.e.s.o.u.a.d.n.p000.b;

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
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Casting B2P", priority = 6)
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.s  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/s.class */
public class s extends Task {
    private final /* synthetic */ e ai;
    private static /* synthetic */ String[] lllIIIlIIll;
    private static /* synthetic */ int[] lllIIIlIlII;

    private static boolean lIlIllIllIllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    public boolean run() {
        if (!lIlIllIllIllll(this.ai.t() ? 1 : 0) || lIlIllIllIllll(this.ai.s() ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        if (lIlIllIllIllll(this.ai.w() ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        String[] strArr = new String[lllIIIlIlII[1]];
        strArr[lllIIIlIlII[0]] = lllIIIlIIll[lllIIIlIlII[0]];
        strArr[lllIIIlIlII[2]] = lllIIIlIIll[lllIIIlIlII[2]];
        if (lIlIllIlllIIII(Inventory.contains(strArr) ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        if (lIlIllIlllIIIl(TileItems.getNearest(tileItem -> {
            return tileItem.getName().toLowerCase().contains(lllIIIlIIll[lllIIIlIlII[7]]);
        })) && lIlIllIlllIIII(Inventory.isFull() ? 1 : 0) && lIlIllIlllIIlI(this.ai.r(), lllIIIlIlII[3])) {
            return lllIIIlIlII[0];
        }
        int[] iArr = new int[lllIIIlIlII[1]];
        iArr[lllIIIlIlII[0]] = lllIIIlIlII[4];
        iArr[lllIIIlIlII[2]] = lllIIIlIlII[5];
        Item first = Inventory.getFirst(iArr);
        if (lIlIllIlllIIIl(first)) {
            first.interact(lllIIIlIIll[lllIIIlIlII[1]]);
            "".length();
            if ("   ".length() < (((124 ^ 6) ^ (236 ^ 136)) & (((180 ^ 141) ^ (84 ^ 115)) ^ (-" ".length())))) {
                return ((((167 + 161) - 187) + 56) ^ (((58 + 104) - 15) + 6)) & (((11 ^ 48) ^ (36 ^ 67)) ^ (-" ".length()));
            }
        } else {
            SpellBook.Standard standard = SpellBook.Standard.BONES_TO_PEACHES;
            if (lIlIllIllIllll(standard.canCast() ? 1 : 0)) {
                Magic.cast(standard);
            }
        }
        sleep(lllIIIlIlII[6]);
        return lllIIIlIlII[2];
    }

    private static boolean lIlIllIlllIIlI(int i, int i2) {
        return i > i2;
    }

    static {
        lIlIllIllIlllI();
        lIlIllIllIllIl();
    }

    private static boolean lIlIllIlllIIII(int i) {
        return i == 0;
    }

    private static String lIlIllIllIlIll(String llllllllllllllllIIlIIlllIIllllIl, String llllllllllllllllIIlIIlllIIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlllIIllllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlllIIllllll.init(lllIIIlIlII[1], secretKeySpec);
            return new String(llllllllllllllllIIlIIlllIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlllIIlllllI) {
            llllllllllllllllIIlIIlllIIlllllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public s(e eVar) {
        this.ai = eVar;
    }

    private static void lIlIllIllIlllI() {
        lllIIIlIlII = new int[9];
        lllIIIlIlII[0] = "  ".length() & ("  ".length() ^ (-1));
        lllIIIlIlII[1] = "  ".length();
        lllIIIlIlII[2] = " ".length();
        lllIIIlIlII[3] = (245 ^ 176) ^ (101 ^ 44);
        lllIIIlIlII[4] = (-17553) & 24478;
        lllIIIlIlII[5] = (-((-5613) & 13805)) & (-16545) & 32751;
        lllIIIlIlII[6] = (((33 + 50) - 35) + 91) ^ (((138 + 128) - 223) + 100);
        lllIIIlIlII[7] = "   ".length();
        lllIIIlIlII[8] = (59 ^ 82) ^ (11 ^ 106);
    }

    private static String lIlIllIllIllII(String llllllllllllllllIIlIIlllIIllIIII, String llllllllllllllllIIlIIlllIIlIllll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIIlIllll.getBytes(StandardCharsets.UTF_8)), lllIIIlIlII[8]), "DES");
            Cipher llllllllllllllllIIlIIlllIIllIIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlllIIllIIlI.init(lllIIIlIlII[1], llllllllllllllllIIlIIlllIIllIIll);
            return new String(llllllllllllllllIIlIIlllIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIlllIIllIIIl) {
            llllllllllllllllIIlIIlllIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIIIl(Object obj) {
        return obj != null;
    }

    private static void lIlIllIllIllIl() {
        lllIIIlIIll = new String[lllIIIlIlII[6]];
        lllIIIlIIll[lllIIIlIlII[0]] = lIlIllIllIlIll("w3ZSAWisN0I=", "MOzYf");
        lllIIIlIIll[lllIIIlIlII[2]] = lIlIllIllIllII("JWT5TsJavu/HTqnkE+MPkw==", "nRyOQ");
        lllIIIlIIll[lllIIIlIlII[1]] = lIlIllIllIllII("QNui3TbcG8M=", "ingHv");
        lllIIIlIIll[lllIIIlIlII[7]] = lIlIllIllIlIll("ImxS1fwvM2o=", "ltszW");
    }
}
