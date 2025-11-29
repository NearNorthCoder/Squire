package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Drinking stamina", priority = 100)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ai  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ai.class */
public class C0009ai extends Z {
    private static /* synthetic */ int[] llIIllIIlII;
    private static /* synthetic */ String[] llIIllIIIll;

    private static void lIlIIIlIIIllII() {
        llIIllIIIll = new String[llIIllIIlII[4]];
        llIIllIIIll[llIIllIIlII[0]] = lIlIIIlIIIlIlI("FDs8IDk=", "PIUNR");
        llIIllIIIll[llIIllIIlII[3]] = lIlIIIlIIIlIll("d2A5ibyoDkw=", "DpYjy");
    }

    private static String lIlIIIlIIIlIlI(String llllllllllllllllIIllllIlIIlIIlII, String llllllllllllllllIIllllIlIIlIIIll) {
        String llllllllllllllllIIllllIlIIlIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIllllIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIllllIlIIlIIIIl = llllllllllllllllIIllllIlIIlIIIll.toCharArray();
        int llllllllllllllllIIllllIlIIlIIIII = llIIllIIlII[0];
        char[] charArray = llllllllllllllllIIllllIlIIlIIlII2.toCharArray();
        int length = charArray.length;
        int i = llIIllIIlII[0];
        while (lIlIIIlIIlIIlI(i, length)) {
            char llllllllllllllllIIllllIlIIlIIlIl = charArray[i];
            sb.append((char) (llllllllllllllllIIllllIlIIlIIlIl ^ llllllllllllllllIIllllIlIIlIIIIl[llllllllllllllllIIllllIlIIlIIIII % llllllllllllllllIIllllIlIIlIIIIl.length]));
            "".length();
            llllllllllllllllIIllllIlIIlIIIII++;
            i++;
            "".length();
            if ((((231 ^ 180) ^ (21 ^ 2)) & (((78 ^ 80) ^ (75 ^ 17)) ^ (-" ".length()))) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlIIIlIIIllIl();
        lIlIIIlIIIllII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    public boolean run() {
        if (!lIlIIIlIIIlllI(Movement.isStaminaBoosted() ? 1 : 0) && !lIlIIIlIIIllll(Vars.getBit(llIIllIIlII[1]))) {
            Item first = Inventory.getFirst(item -> {
                return item.getName().startsWith(llIIllIIIll[llIIllIIlII[3]]);
            });
            if (!lIlIIIlIIlIIII(first) && !lIlIIIlIIlIIIl(Movement.getRunEnergy(), llIIllIIlII[2])) {
                first.interact(llIIllIIIll[llIIllIIlII[0]]);
                return llIIllIIlII[3];
            }
            return llIIllIIlII[0];
        }
        return llIIllIIlII[0];
    }

    private static String lIlIIIlIIIlIll(String llllllllllllllllIIllllIlIIIIllll, String llllllllllllllllIIllllIlIIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), llIIllIIlII[5]), "DES");
            Cipher llllllllllllllllIIllllIlIIIlIIIl = Cipher.getInstance("DES");
            llllllllllllllllIIllllIlIIIlIIIl.init(llIIllIIlII[4], secretKeySpec);
            return new String(llllllllllllllllIIllllIlIIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllIlIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllllIlIIIlIIII) {
            llllllllllllllllIIllllIlIIIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIIIllll(int i) {
        return i > 0;
    }

    private static boolean lIlIIIlIIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIlIIlIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIIIlIIIlllI(int i) {
        return i != 0;
    }

    private static boolean lIlIIIlIIlIIII(Object obj) {
        return obj == null;
    }

    private static void lIlIIIlIIIllIl() {
        llIIllIIlII = new int[6];
        llIIllIIlII[0] = (196 ^ 132) & ((203 ^ 139) ^ (-1));
        llIIllIIlII[1] = (-17365) & 31708;
        llIIllIIlII[2] = (127 ^ 120) ^ (127 ^ 114);
        llIIllIIlII[3] = " ".length();
        llIIllIIlII[4] = "  ".length();
        llIIllIIlII[5] = (53 ^ 65) ^ (67 ^ 63);
    }

    @Inject
    protected C0009ai(Client client) {
        super(client);
    }
}
