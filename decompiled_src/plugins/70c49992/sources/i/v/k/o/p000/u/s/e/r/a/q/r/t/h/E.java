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
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking Antifire Potion", priority = 110)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.E  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/E.class */
public class E extends w {
    private static /* synthetic */ String[] lIlIllIIlIllI;
    private static /* synthetic */ int[] lIlIllIIlIlll;

    private static boolean llIIIIIIlIlIIll(Object obj) {
        return obj != null;
    }

    private static String llIIIIIIlIIlllI(String llllllllllllllIllIlIIlIllllllIll, String llllllllllllllIllIlIIlIllllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIllllllIlI.getBytes(StandardCharsets.UTF_8)), lIlIllIIlIlll[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIIlIlll[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlIlllllllII) {
            llllllllllllllIllIlIIlIlllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIlIlIlII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        if (!llIIIIIIlIlIIIl(Combat.isSuperAntifired() ? 1 : 0) || llIIIIIIlIlIIlI(Combat.isAntifired() ? 1 : 0)) {
            return lIlIllIIlIlll[0];
        }
        if (llIIIIIIlIlIIll(this.cg.A())) {
            return lIlIllIIlIlll[0];
        }
        int[] iArr = new int[lIlIllIIlIlll[1]];
        iArr[lIlIllIIlIlll[0]] = lIlIllIIlIlll[2];
        if (llIIIIIIlIlIIll(Projectiles.getNearest(iArr))) {
            return lIlIllIIlIlll[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (llIIIIIIlIlIIlI(item.getName().toLowerCase().contains(lIlIllIIlIllI[lIlIllIIlIlll[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIllIIlIlll[1]];
                strArr[lIlIllIIlIlll[0]] = lIlIllIIlIllI[lIlIllIIlIlll[3]];
                if (llIIIIIIlIlIIlI(item.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIllIIlIlll[1];
                    "".length();
                    return (((((139 + 148) - 172) + 35) ^ (((39 + 140) - 148) + 112)) & (((56 ^ 69) ^ (13 ^ 105)) ^ (-" ".length()))) != 0 ? ((((62 + 14) - (-11)) + 57) ^ (((109 + 140) - 64) + 8)) & (((234 ^ 131) ^ (138 ^ 178)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIllIIlIlll[0];
        });
        if (llIIIIIIlIlIlII(first)) {
            return lIlIllIIlIlll[0];
        }
        first.interact(lIlIllIIlIllI[lIlIllIIlIlll[0]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIlIlll[1];
    }

    private static void llIIIIIIlIIllll() {
        lIlIllIIlIllI = new String[lIlIllIIlIlll[4]];
        lIlIllIIlIllI[lIlIllIIlIlll[0]] = llIIIIIIlIIllIl("DBowLzg=", "HhYAS");
        lIlIllIIlIllI[lIlIllIIlIlll[1]] = llIIIIIIlIIlllI("QwthstDHPZ60vII7zoSbOw==", "RUkea");
        lIlIllIIlIllI[lIlIllIIlIlll[3]] = llIIIIIIlIIllIl("LwclJDw=", "kuLJW");
    }

    private static boolean llIIIIIIlIlIIlI(int i2) {
        return i2 != 0;
    }

    private static String llIIIIIIlIIllIl(String llllllllllllllIllIlIIllIIIIlIIII, String llllllllllllllIllIlIIllIIIIIllll) {
        String llllllllllllllIllIlIIllIIIIlIIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIllIIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIllIIIIIlllI = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIIllIIIIIllll.toCharArray();
        int llllllllllllllIllIlIIllIIIIIllII = lIlIllIIlIlll[0];
        char[] charArray2 = llllllllllllllIllIlIIllIIIIlIIII2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIllIIlIlll[0];
        while (llIIIIIIlIlIlIl(i2, length)) {
            llllllllllllllIllIlIIllIIIIIlllI.append((char) (charArray2[i2] ^ charArray[llllllllllllllIllIlIIllIIIIIllII % charArray.length]));
            "".length();
            llllllllllllllIllIlIIllIIIIIllII++;
            i2++;
            "".length();
            if (((((58 + 136) - 53) + 10) ^ (((33 + 122) - 119) + 111)) <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIIllIIIIIlllI);
    }

    private static void llIIIIIIlIlIIII() {
        lIlIllIIlIlll = new int[6];
        lIlIllIIlIlll[0] = (72 ^ 4) & ((57 ^ 117) ^ (-1));
        lIlIllIIlIlll[1] = " ".length();
        lIlIllIIlIlll[2] = (-((-2113) & 27237)) & (-2067) & 28671;
        lIlIllIIlIlll[3] = "  ".length();
        lIlIllIIlIlll[4] = "   ".length();
        lIlIllIIlIlll[5] = 109 ^ 101;
    }

    private static boolean llIIIIIIlIlIlIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIIIIIIlIlIIIl(int i2) {
        return i2 == 0;
    }

    @Inject
    protected E(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    static {
        llIIIIIIlIlIIII();
        llIIIIIIlIIllll();
    }
}
