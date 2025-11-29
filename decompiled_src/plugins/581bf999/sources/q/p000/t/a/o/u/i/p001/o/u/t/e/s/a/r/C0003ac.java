package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Cracking scarab", priority = 50)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ac  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ac.class */
public class C0003ac extends Z {
    private final /* synthetic */ C cB;
    private final /* synthetic */ SquireAutoTOA cC;
    private /* synthetic */ int cD;
    private static /* synthetic */ String[] lIllllIIlII;
    private static /* synthetic */ int[] lIllllIllll;

    private static String lIIllIlIIllIII(String llllllllllllllllIlIIlIlIlIlllIIl, String llllllllllllllllIlIIlIlIlIlllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIlIlllIII.getBytes(StandardCharsets.UTF_8)), lIllllIllll[4]), "DES");
            Cipher llllllllllllllllIlIIlIlIlIlllIll = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIlIlIlllIll.init(lIllllIllll[5], secretKeySpec);
            return new String(llllllllllllllllIlIIlIlIlIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlIlIlllIlI) {
            llllllllllllllllIlIIlIlIlIlllIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected C0003ac(Client client, C c, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cB = c;
        this.cC = squireAutoTOA;
    }

    static {
        lIIllIlIlllIII();
        lIIllIlIIllIIl();
    }

    private static void lIIllIlIIllIIl() {
        lIllllIIlII = new String[lIllllIllll[3]];
        lIllllIIlII[lIllllIllll[1]] = lIIllIlIIllIII("JMFlz7VNMpA=", "pEBJH");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    public boolean run() {
        if (!lIIllIlIlllIIl(this.cu.getTickCount() - this.cD, lIllllIllll[0]) && !lIIllIlIlllIIl(Skills.getLevel(Skill.PRAYER) - Skills.getBoostedLevel(Skill.PRAYER), lIllllIllll[2])) {
            Item first = Inventory.getFirst(item -> {
                return EnumC0056e.BLESSED_CRYSTAL_SCARAB.d(item.getId());
            });
            if (lIIllIlIlllIlI(first)) {
                return lIllllIllll[1];
            }
            first.interact(lIllllIIlII[lIllllIllll[1]]);
            this.cD = this.cu.getTickCount();
            return lIllllIllll[3];
        }
        return lIllllIllll[1];
    }

    private static boolean lIIllIlIlllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIlIlllIlI(Object obj) {
        return obj == null;
    }

    private static void lIIllIlIlllIII() {
        lIllllIllll = new int[6];
        lIllllIllll[0] = (122 ^ 49) ^ (28 ^ 127);
        lIllllIllll[1] = (72 ^ 95) & ((27 ^ 12) ^ (-1));
        lIllllIllll[2] = (11 ^ 77) ^ (10 ^ 70);
        lIllllIllll[3] = " ".length();
        lIllllIllll[4] = (103 ^ 73) ^ (166 ^ 128);
        lIllllIllll[5] = "  ".length();
    }
}
