package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking potions", priority = 5)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.V  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/V.class */
public class V extends ad {
    private static /* synthetic */ String[] lIllIllIlllIl;
    private static /* synthetic */ int[] lIllIllIlllll;

    @Inject
    protected V(C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(c0021v, client, squireZulrahConfig);
    }

    private static boolean llIIlIIlIlIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ad
    public boolean ac() {
        EnumC0008i[] values = EnumC0008i.values();
        int length = values.length;
        int i = lIllIllIlllll[0];
        while (llIIlIIlIlIllII(i, length)) {
            EnumC0008i enumC0008i = values[i];
            if (llIIlIIlIlIllIl(enumC0008i.v() ? 1 : 0)) {
                Item first = Inventory.getFirst(item -> {
                    return item.getName().startsWith(enumC0008i.k());
                });
                if (!llIIlIIlIlIlllI(first)) {
                    first.interact(lIllIllIlllIl[lIllIllIlllll[0]]);
                    return lIllIllIlllll[1];
                }
                "".length();
                if ("   ".length() <= 0) {
                    return ((127 ^ 92) ^ (40 ^ 23)) & (((142 ^ 153) ^ (187 ^ 176)) ^ (-" ".length()));
                }
            }
            i++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIllIllIlllll[0];
    }

    private static void llIIlIIlIlIlIll() {
        lIllIllIlllll = new int[3];
        lIllIllIlllll[0] = (113 ^ 37) & ((7 ^ 83) ^ (-1));
        lIllIllIlllll[1] = " ".length();
        lIllIllIlllll[2] = "  ".length();
    }

    static {
        llIIlIIlIlIlIll();
        llIIlIIlIlIlIIl();
    }

    private static String llIIlIIlIlIlIII(String llllllllllllllIllIIIlIIllIIllIII, String llllllllllllllIllIIIlIIllIIlIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIllIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIllIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIlllll[2], llllllllllllllIllIIIlIIllIIllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIIllIIllIIl) {
            llllllllllllllIllIIIlIIllIIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIlIllII(int i, int i2) {
        return i < i2;
    }

    private static void llIIlIIlIlIlIIl() {
        lIllIllIlllIl = new String[lIllIllIlllll[1]];
        lIllIllIlllIl[lIllIllIlllll[0]] = llIIlIIlIlIlIII("uT9/n48RvXE=", "Vmagd");
    }

    private static boolean llIIlIIlIlIllIl(int i) {
        return i == 0;
    }
}
