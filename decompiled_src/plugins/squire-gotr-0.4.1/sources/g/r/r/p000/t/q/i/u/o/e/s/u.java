package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Dropping Talisman", priority = 10)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.u  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/u.class */
public class u extends h {
    private static /* synthetic */ String[] llIlIIIIlIlI;
    private static /* synthetic */ int[] llIlIIIIlIll;

    static {
        lIIIIIIIIlIlIIl();
        lIIIIIIIIlIlIII();
    }

    private static void lIIIIIIIIlIlIII() {
        llIlIIIIlIlI = new String[llIlIIIIlIll[2]];
        llIlIIIIlIlI[llIlIIIIlIll[0]] = lIIIIIIIIlIIlll("9rukSxZdZwc=", "Rpllg");
        llIlIIIIlIlI[llIlIIIIlIll[1]] = lIIIIIIIIlIIlll("cOBpiaeFNUzmAS8+5sdsTw==", "arfeg");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        if (lIIIIIIIIlIlIlI(this.aW.useTalisman() ? 1 : 0)) {
            return llIlIIIIlIll[0];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().startsWith(llIlIIIIlIlI[llIlIIIIlIll[1]]);
        });
        if (lIIIIIIIIlIlIll(first)) {
            return llIlIIIIlIll[0];
        }
        first.interact(llIlIIIIlIlI[llIlIIIIlIll[0]]);
        return llIlIIIIlIll[1];
    }

    private static boolean lIIIIIIIIlIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIIIIIlIlIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean aj() {
        return llIlIIIIlIll[1];
    }

    private static void lIIIIIIIIlIlIIl() {
        llIlIIIIlIll = new int[4];
        llIlIIIIlIll[0] = ((114 ^ 58) ^ (200 ^ 170)) & (((((66 + 139) - 158) + 97) ^ (((171 + 180) - 222) + 57)) ^ (-" ".length()));
        llIlIIIIlIll[1] = " ".length();
        llIlIIIIlIll[2] = "  ".length();
        llIlIIIIlIll[3] = (57 ^ 87) ^ (255 ^ 153);
    }

    private static String lIIIIIIIIlIIlll(String lllllllllllllllIlIIlIlIIlIIIlllI, String lllllllllllllllIlIIlIlIIlIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), llIlIIIIlIll[3]), "DES");
            Cipher lllllllllllllllIlIIlIlIIlIIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlIIlIIlIIII.init(llIlIIIIlIll[2], secretKeySpec);
            return new String(lllllllllllllllIlIIlIlIIlIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlIIlIIIllll) {
            lllllllllllllllIlIIlIlIIlIIIllll.printStackTrace();
            return null;
        }
    }

    @Inject
    public u(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, new EnumC0002c[llIlIIIIlIll[0]]);
    }
}
