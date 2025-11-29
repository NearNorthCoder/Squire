package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Eating food", priority = 10000)
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.q  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/q.class */
public class q extends a {
    private static /* synthetic */ int[] lIIlIlIllIIII;
    private static /* synthetic */ String[] lIIlIlIlIllIl;

    private static boolean lIlIllIIIlIIlII(Object obj) {
        return obj == null;
    }

    private static String lIlIllIIIIlIllI(String llllllllllllllIllllIllIlIlllIIlI, String llllllllllllllIllllIllIlIlllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIlIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIllIlIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIllIlIlllIlII.init(lIIlIlIllIIII[3], secretKeySpec);
            return new String(llllllllllllllIllllIllIlIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIlIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIllIlIllIlllI) {
            llllllllllllllIllllIllIlIllIlllI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected q(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b bVar, Client client) {
        super(squireScurrius, squireScurriusConfig, bVar, client);
    }

    private static void lIlIllIIIlIIIlI() {
        lIIlIlIllIIII = new int[4];
        lIIlIlIllIIII[0] = (208 ^ 132) & ((247 ^ 163) ^ (-1));
        lIIlIlIllIIII[1] = " ".length();
        lIIlIlIllIIII[2] = "   ".length();
        lIIlIlIllIIII[3] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    @Override // r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s.a
    public boolean a() {
        if (lIlIllIIIlIIIll(Combat.getCurrentHealth(), this.b.eatAt())) {
            return lIIlIlIllIIII[0];
        }
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[lIIlIlIllIIII[1]];
            strArr[lIIlIlIllIIII[0]] = lIIlIlIlIllIl[lIIlIlIllIIII[3]];
            return item.hasAction(strArr);
        });
        if (lIlIllIIIlIIlII(first)) {
            Log.error(lIIlIlIlIllIl[lIIlIlIllIIII[0]]);
            this.a.e((boolean) lIIlIlIllIIII[1]);
            return lIIlIlIllIIII[0];
        }
        first.interact(lIIlIlIlIllIl[lIIlIlIllIIII[1]]);
        sleep(lIIlIlIllIIII[2]);
        return lIIlIlIllIIII[1];
    }

    private static void lIlIllIIIlIIIIl() {
        lIIlIlIlIllIl = new String[lIIlIlIllIIII[2]];
        lIIlIlIlIllIl[lIIlIlIllIIII[0]] = lIlIllIIIIlIlIl("Bg1BNyEnBg==", "HbaQN");
        lIIlIlIlIllIl[lIIlIlIllIIII[1]] = lIlIllIIIIlIlIl("CCki", "MHVwK");
        lIIlIlIlIllIl[lIIlIlIllIIII[3]] = lIlIllIIIIlIllI("GF7aOKaQRR0=", "JueOz");
    }

    private static String lIlIllIIIIlIlIl(String llllllllllllllIllllIllIllIIIIlll, String llllllllllllllIllllIllIllIIIIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIllIllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIllIllIIIIlII = llllllllllllllIllllIllIllIIIIllI.toCharArray();
        int llllllllllllllIllllIllIllIIIIIll = lIIlIlIllIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIlIllIIII[0];
        while (lIlIllIIIlIIlIl(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllllIllIllIIIIlII[llllllllllllllIllllIllIllIIIIIll % llllllllllllllIllllIllIllIIIIlII.length]));
            "".length();
            llllllllllllllIllllIllIllIIIIIll++;
            i++;
            "".length();
            if ((((((164 + 160) - 286) + 155) ^ (((70 + 98) - 98) + 86)) & (((((149 + 117) - 82) + 20) ^ (((106 + 20) - 34) + 53)) ^ (-" ".length()))) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIllIIIlIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllIIIlIIIll(int i, int i2) {
        return i > i2;
    }

    static {
        lIlIllIIIlIIIlI();
        lIlIllIIIlIIIIl();
    }
}
