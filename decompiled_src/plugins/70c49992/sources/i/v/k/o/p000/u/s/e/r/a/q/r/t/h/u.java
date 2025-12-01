package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Attack", priority = 10, register = true)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.u  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/u.class */
public class u extends w {
    private static final /* synthetic */ int cb;
    private static /* synthetic */ int[] lIlIlIllIIIIl;
    private static final /* synthetic */ String ca;
    private static /* synthetic */ String[] lIlIlIllIIIII;
    private static final /* synthetic */ int bZ;

    private static boolean lIllllllIllllll(int i2) {
        return i2 != 0;
    }

    private static boolean lIllllllIlllllI(int i2) {
        return i2 == 0;
    }

    private static boolean lIllllllIllllIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        NPC c = this.cg.c(lIlIlIllIIIIl[0]);
        if (lIllllllIllllII(c)) {
            return lIlIlIllIIIIl[1];
        }
        String[] strArr = new String[lIlIlIllIIIIl[0]];
        strArr[lIlIlIllIIIIl[1]] = lIlIlIllIIIII[lIlIlIllIIIIl[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!lIllllllIllllIl(nearest) || !lIllllllIlllllI(nearest.isDead() ? 1 : 0)) {
            if (lIllllllIllllll(this.cg.I() ? 1 : 0)) {
                return lIlIlIllIIIIl[1];
            }
            if (lIllllllIlllllI(Combat.isSpecEnabled() ? 1 : 0)) {
                Gear.swapTo(this.cg.D().getIds());
                "".length();
            }
            c.interact(lIlIlIllIIIII[lIlIlIllIIIIl[3]]);
            return lIlIlIllIIIIl[1];
        }
        int[] iArr = new int[lIlIlIllIIIIl[0]];
        iArr[lIlIlIllIIIIl[1]] = lIlIlIllIIIIl[2];
        if (lIllllllIllllll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIlIllIIIIl[0]];
            iArr2[lIlIlIllIIIIl[1]] = lIlIlIllIIIIl[2];
            Inventory.getFirst(iArr2).interact(lIlIlIllIIIII[lIlIlIllIIIIl[0]]);
        }
        Magic.cast(SpellBook.Standard.CRUMBLE_UNDEAD, nearest);
        return lIlIlIllIIIIl[1];
    }

    private static void lIllllllIlllIll() {
        lIlIlIllIIIIl = new int[8];
        lIlIlIllIIIIl[0] = " ".length();
        lIlIlIllIIIIl[1] = (127 ^ 52) & ((83 ^ 24) ^ (-1));
        lIlIlIllIIIIl[2] = (-((-18498) & 19943)) & (-2049) & 7663;
        lIlIlIllIIIIl[3] = "  ".length();
        lIlIlIllIIIIl[4] = (-(((32 + 17) - 43) + 183)) & (-2) & 32189;
        lIlIlIllIIIIl[5] = (-(9 ^ 13)) & (-16485) & 24447;
        lIlIlIllIIIIl[6] = "   ".length();
        lIlIlIllIIIIl[7] = (((91 + 120) - 137) + 95) ^ (((34 + 101) - 9) + 47);
    }

    private static void lIllllllIlllIlI() {
        lIlIlIllIIIII = new String[lIlIlIllIIIIl[7]];
        lIlIlIllIIIII[lIlIlIllIIIIl[1]] = lIllllllIlllIII("GzYECjAnMAwMeRIpCB83", "AYihY");
        lIlIlIllIIIII[lIlIlIllIIIIl[0]] = lIllllllIlllIIl("Uq1F0OIA0u4=", "tUcKJ");
        lIlIlIllIIIII[lIlIlIllIIIIl[3]] = lIllllllIlllIIl("P9i9jscHSJo=", "cGQPj");
        lIlIlIllIIIII[lIlIlIllIIIIl[6]] = lIllllllIlllIII("IxUGOzMfEw49eioKCi40", "yzkYZ");
    }

    private static boolean lIlllllllIIIIII(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIllllllIlllIII(String llllllllllllllIllIlIlIIlIlllIIlI, String llllllllllllllIllIlIlIIlIlllIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIIlIlllIIII = new StringBuilder();
        char[] llllllllllllllIllIlIlIIlIllIllll = llllllllllllllIllIlIlIIlIlllIIIl.toCharArray();
        int llllllllllllllIllIlIlIIlIllIlllI = lIlIlIllIIIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = lIlIlIllIIIIl[1];
        while (lIlllllllIIIIII(i2, length)) {
            char llllllllllllllIllIlIlIIlIlllIIll = charArray[i2];
            llllllllllllllIllIlIlIIlIlllIIII.append((char) (llllllllllllllIllIlIlIIlIlllIIll ^ llllllllllllllIllIlIlIIlIllIllll[llllllllllllllIllIlIlIIlIllIlllI % llllllllllllllIllIlIlIIlIllIllll.length]));
            "".length();
            llllllllllllllIllIlIlIIlIllIlllI++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIlIIlIlllIIII);
    }

    @Inject
    protected u(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static String lIllllllIlllIIl(String llllllllllllllIllIlIlIIlIlIlllIl, String llllllllllllllIllIlIlIIlIlIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIlIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIIlIlIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIIlIlIlllll.init(lIlIlIllIIIIl[3], secretKeySpec);
            return new String(llllllllllllllIllIlIlIIlIlIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIIlIlIllllI) {
            llllllllllllllIllIlIlIIlIlIllllI.printStackTrace();
            return null;
        }
    }

    static {
        lIllllllIlllIll();
        lIllllllIlllIlI();
        bZ = lIlIlIllIIIIl[4];
        cb = lIlIlIllIIIIl[5];
        ca = lIlIlIllIIIII[lIlIlIllIIIIl[6]];
    }

    private static boolean lIllllllIllllII(Object obj) {
        return obj == null;
    }
}
