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
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Tick eat", priority = 200)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.I  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/I.class */
public class I extends w {
    private static /* synthetic */ String[] lIlIlIlIllIll;
    private static /* synthetic */ int[] lIlIlIlIlllII;
    private static final /* synthetic */ String cn;

    @Inject
    protected I(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static String lIllllllIlIlIlI(String llllllllllllllIllIlIlIIllIllllII, String llllllllllllllIllIlIlIIllIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIllIlllIll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlllII[5]), "DES");
            Cipher llllllllllllllIllIlIlIIllIlllllI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIIllIlllllI.init(lIlIlIlIlllII[2], secretKeySpec);
            return new String(llllllllllllllIllIlIlIIllIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIIllIllllIl) {
            llllllllllllllIllIlIlIIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIlIlIII(String llllllllllllllIllIlIlIIlllIlIIIl, String llllllllllllllIllIlIlIIlllIlIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIIlllIIllll = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIlIIlllIlIIII.toCharArray();
        int llllllllllllllIllIlIlIIlllIIllIl = lIlIlIlIlllII[1];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllIllIlIlIIlllIIIllI = charArray2.length;
        int i2 = lIlIlIlIlllII[1];
        while (lIllllllIllIIIl(i2, llllllllllllllIllIlIlIIlllIIIllI)) {
            char llllllllllllllIllIlIlIIlllIIIlII = charArray2[i2];
            llllllllllllllIllIlIlIIlllIIllll.append((char) (llllllllllllllIllIlIlIIlllIIIlII ^ charArray[llllllllllllllIllIlIlIIlllIIllIl % charArray.length]));
            "".length();
            llllllllllllllIllIlIlIIlllIIllIl++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIlIIlllIIllll);
    }

    private static boolean lIllllllIllIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIllllllIlIllll(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIllllllIlIllIl(Object obj) {
        return obj != null;
    }

    private static void lIllllllIlIlIll() {
        lIlIlIlIllIll = new String[lIlIlIlIlllII[4]];
        lIlIlIlIllIll[lIlIlIlIlllII[1]] = lIllllllIlIlIII("OCIACCMEJAgOajE9DB0k", "bMmjJ");
        lIlIlIlIllIll[lIlIlIlIlllII[0]] = lIllllllIlIlIIl("mwzemAu3TDw=", "FSiOR");
        lIlIlIlIllIll[lIlIlIlIlllII[2]] = lIllllllIlIlIIl("cC9TRyCkcHw=", "ygjMJ");
        lIlIlIlIllIll[lIlIlIlIlllII[3]] = lIllllllIlIlIlI("m8XUVF6ezN5wzT2ySY6L4A==", "ZtPJX");
    }

    private static boolean lIllllllIlIlllI(int i2) {
        return i2 == 0;
    }

    private static void lIllllllIlIllII() {
        lIlIlIlIlllII = new int[6];
        lIlIlIlIlllII[0] = " ".length();
        lIlIlIlIlllII[1] = ((132 ^ 188) ^ (163 ^ 187)) & (((3 ^ 62) ^ (179 ^ 174)) ^ (-" ".length()));
        lIlIlIlIlllII[2] = "  ".length();
        lIlIlIlIlllII[3] = "   ".length();
        lIlIlIlIlllII[4] = "  ".length() ^ (147 ^ 149);
        lIlIlIlIlllII[5] = 100 ^ 108;
    }

    static {
        lIllllllIlIllII();
        lIllllllIlIlIll();
        cn = lIlIlIlIllIll[lIlIlIlIlllII[3]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        String[] strArr = new String[lIlIlIlIlllII[0]];
        strArr[lIlIlIlIlllII[1]] = lIlIlIlIllIll[lIlIlIlIlllII[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIllllllIlIllIl(nearest) && lIllllllIlIlllI(nearest.isDead() ? 1 : 0) && lIllllllIlIllll(nearest.distanceTo(this.cf.getLocalPlayer()), lIlIlIlIlllII[0])) {
            Item first = Inventory.getFirst(item -> {
                String str = lIlIlIlIllIll[lIlIlIlIlllII[2]];
                return item.hasAction((v1) -> {
                    return r1.equals(v1);
                });
            });
            if (lIllllllIllIIII(first)) {
                return lIlIlIlIlllII[1];
            }
            first.interact(lIlIlIlIllIll[lIlIlIlIlllII[0]]);
            this.cg.a(this.cf.getTickCount());
            return lIlIlIlIlllII[1];
        }
        return lIlIlIlIlllII[1];
    }

    private static String lIllllllIlIlIIl(String llllllllllllllIllIlIlIIllllIIIIl, String llllllllllllllIllIlIlIIllllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIllllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIlIlllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIIllllIIIlI) {
            llllllllllllllIllIlIlIIllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllllIllIIIl(int i2, int i3) {
        return i2 < i3;
    }
}
