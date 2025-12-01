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
@TaskDesc(name = "Teleporting out", priority = 1)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.ai  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/ai.class */
public class ai extends ag {
    private static /* synthetic */ int[] lIllIlIIlIlll;
    private static /* synthetic */ String[] lIllIlIIlIllI;

    private static boolean llIIIllllIllIlI(int i) {
        return i == 0;
    }

    @Inject
    protected ai(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    private static boolean llIIIllllIlllIl(int i) {
        return i != 0;
    }

    private static void llIIIllllIllIII() {
        lIllIlIIlIllI = new String[lIllIlIIlIlll[1]];
        lIllIlIIlIllI[lIllIlIIlIlll[0]] = llIIIllllIlIllI("kHCQpuj1A+A=", "NtitH");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ag
    public boolean ac() {
        int i;
        if (llIIIllllIllIlI(this.E.e() ? 1 : 0)) {
            return lIllIlIIlIlll[0];
        }
        int count = Inventory.getCount(item -> {
            String[] strArr = new String[lIllIlIIlIlll[1]];
            strArr[lIllIlIIlIlll[0]] = lIllIlIIlIllI[lIllIlIIlIlll[0]];
            return item.hasAction(strArr);
        });
        if (!llIIIllllIllIlI(Inventory.contains(item2 -> {
            return item2.getName().startsWith(this.aC.cure().k());
        }) ? 1 : 0) || llIIIllllIllIll(this.aC.cure(), EnumC0014o.IGNORE)) {
            i = lIllIlIIlIlll[1];
            "".length();
            if ((-(82 ^ 87)) >= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIllIlIIlIlll[0];
        }
        int llllllllllllllIllIIIlllIllIllIII = i;
        if (llIIIllllIlllII(count, this.aC.multiple()) && llIIIllllIlllIl(this.aC.multiple()) && llIIIllllIlllIl(llllllllllllllIllIIIlllIllIllIII)) {
            return lIllIlIIlIlll[0];
        }
        this.E.a((boolean) lIllIlIIlIlll[1]);
        EnumC0001b bankTeleportItem = this.aC.bankTeleportItem();
        Item first = Inventory.getFirst(item3 -> {
            return item3.getName().startsWith(bankTeleportItem.k());
        });
        if (llIIIllllIllllI(first)) {
            bankTeleportItem.l().accept(first);
            return lIllIlIIlIlll[1];
        }
        return this.aC.bankLocation().f().getAsBoolean();
    }

    private static boolean llIIIllllIlllII(int i, int i2) {
        return i >= i2;
    }

    static {
        llIIIllllIllIIl();
        llIIIllllIllIII();
    }

    private static boolean llIIIllllIllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIIllllIllllI(Object obj) {
        return obj != null;
    }

    private static String llIIIllllIlIllI(String llllllllllllllIllIIIlllIllIIlllI, String llllllllllllllIllIIIlllIllIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlllIllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlllIllIlIIII.init(lIllIlIIlIlll[2], secretKeySpec);
            return new String(llllllllllllllIllIIIlllIllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlllIllIIllll) {
            llllllllllllllIllIIIlllIllIIllll.printStackTrace();
            return null;
        }
    }

    private static void llIIIllllIllIIl() {
        lIllIlIIlIlll = new int[3];
        lIllIlIIlIlll[0] = (56 ^ 28) & ((186 ^ 158) ^ (-1));
        lIllIlIIlIlll[1] = " ".length();
        lIllIlIIlIlll[2] = "  ".length();
    }
}
