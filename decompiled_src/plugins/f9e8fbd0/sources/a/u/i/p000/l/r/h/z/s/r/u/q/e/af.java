package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Looting items", priority = 10, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.af  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/af.class */
public class af extends ag {
    private static /* synthetic */ String[] lIllIlIIIIlII;
    private static /* synthetic */ int[] lIllIlIIIlIII;

    private static String llIIIlllIlIIlll(String llllllllllllllIllIIIlllllllIIIlI, String llllllllllllllIllIIIlllllllIIIIl) {
        String llllllllllllllIllIIIlllllllIIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlllllllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIIllllllIlllll = llllllllllllllIllIIIlllllllIIIIl.toCharArray();
        int llllllllllllllIllIIIllllllIllIIl = lIllIlIIIlIII[0];
        char[] charArray = llllllllllllllIllIIIlllllllIIIlI2.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllIIIllllllIlIllI = lIllIlIIIlIII[0];
        while (llIIIlllIllIllI(llllllllllllllIllIIIllllllIlIllI, length)) {
            sb.append((char) (charArray[llllllllllllllIllIIIllllllIlIllI] ^ llllllllllllllIllIIIllllllIlllll[llllllllllllllIllIIIllllllIllIIl % llllllllllllllIllIIIllllllIlllll.length]));
            "".length();
            llllllllllllllIllIIIllllllIllIIl++;
            llllllllllllllIllIIIllllllIlIllI++;
            "".length();
            if ((((((98 + 65) - 56) + 51) ^ (((56 + 63) - 111) + 160)) & (((174 ^ 151) ^ (200 ^ 199)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIIIlllIllIllI(int i, int i2) {
        return i < i2;
    }

    private static void llIIIlllIllIIII() {
        lIllIlIIIIlII = new String[lIllIlIIIlIII[3]];
        lIllIlIIIIlII[lIllIlIIIlIII[0]] = llIIIlllIlIIlll("CjAY", "OQlGQ");
        lIllIlIIIIlII[lIllIlIIIlIII[1]] = llIIIlllIlIlIII("9RbNNQ8bjw8=", "dQdcj");
        lIllIlIIIIlII[lIllIlIIIlIII[2]] = llIIIlllIlIIlll("ACMM", "EBxgJ");
    }

    private static boolean llIIIlllIllIlII(int i) {
        return i != 0;
    }

    private static boolean llIIIlllIllIlIl(Object obj) {
        return obj == null;
    }

    private static void llIIIlllIllIIll() {
        lIllIlIIIlIII = new int[4];
        lIllIlIIIlIII[0] = ((158 ^ 145) ^ (225 ^ 141)) & (((30 ^ 13) ^ (253 ^ 141)) ^ (-" ".length()));
        lIllIlIIIlIII[1] = " ".length();
        lIllIlIIIlIII[2] = "  ".length();
        lIllIlIIIlIII[3] = "   ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ag
    public boolean ac() {
        List all = TileItems.getAll();
        if (llIIIlllIllIlII(all.isEmpty() ? 1 : 0)) {
            return lIllIlIIIlIII[0];
        }
        if (llIIIlllIllIlII(Inventory.isFull() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String str = lIllIlIIIIlII[lIllIlIIIlIII[2]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            if (llIIIlllIllIlIl(first)) {
                return lIllIlIIIlIII[0];
            }
            first.interact(lIllIlIIIIlII[lIllIlIIIlIII[0]]);
        }
        ((TileItem) all.get(lIllIlIIIlIII[0])).interact(lIllIlIIIIlII[lIllIlIIIlIII[1]]);
        return lIllIlIIIlIII[1];
    }

    private static String llIIIlllIlIlIII(String llllllllllllllIllIIIllllllIIllIl, String llllllllllllllIllIIIllllllIIllII) {
        try {
            SecretKeySpec llllllllllllllIllIIIllllllIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllllllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlIIIlIII[2], llllllllllllllIllIIIllllllIlIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllllllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllllllIIlllI) {
            llllllllllllllIllIIIllllllIIlllI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected af(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    static {
        llIIIlllIllIIll();
        llIIIlllIllIIII();
    }
}
