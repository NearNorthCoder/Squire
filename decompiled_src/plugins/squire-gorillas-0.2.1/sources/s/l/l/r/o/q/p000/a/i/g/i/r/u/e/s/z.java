package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Teleporting out", priority = 1333337)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.z  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/z.class */
public class z extends Task {
    private static /* synthetic */ String[] llIIlIlIllIl;
    private static /* synthetic */ int[] llIIlIlIlllI;

    private static String lllllIlIlllIlI(String lllllllllllllllIlIIllllIIllIllll, String lllllllllllllllIlIIllllIIllIlllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIllllIIlllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIIllIlllI.getBytes(StandardCharsets.UTF_8)), llIIlIlIlllI[5]), "DES");
            Cipher lllllllllllllllIlIIllllIIlllIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllIIlllIIIl.init(llIIlIlIlllI[3], lllllllllllllllIlIIllllIIlllIIlI);
            return new String(lllllllllllllllIlIIllllIIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllllIIlllIIII) {
            lllllllllllllllIlIIllllIIlllIIII.printStackTrace();
            return null;
        }
    }

    static {
        lllllIlIllllII();
        lllllIlIlllIll();
    }

    private static void lllllIlIllllII() {
        llIIlIlIlllI = new int[6];
        llIIlIlIlllI[0] = ((((98 + 95) - 68) + 5) ^ (((10 + 130) - 29) + 63)) & (((146 ^ 193) ^ (((57 + 53) - 2) + 19)) ^ (-" ".length()));
        llIIlIlIlllI[1] = " ".length();
        llIIlIlIlllI[2] = (-8194) & 27757;
        llIIlIlIlllI[3] = "  ".length();
        llIIlIlIlllI[4] = "   ".length();
        llIIlIlIlllI[5] = 118 ^ 126;
    }

    private static boolean lllllIlIlllllI(Object obj) {
        return obj == null;
    }

    private static void lllllIlIlllIll() {
        llIIlIlIllIl = new String[llIIlIlIlllI[4]];
        llIIlIlIllIl[llIIlIlIlllI[0]] = lllllIlIlllIIl("CBgnASQlEg==", "KwJlQ");
        llIIlIlIllIl[llIIlIlIlllI[1]] = lllllIlIlllIlI("IVu/FsysqUM=", "uKDVg");
        llIIlIlIllIl[llIIlIlIlllI[3]] = lllllIlIlllIIl("KDEa", "mPnuV");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    public boolean run() {
        if (lllllIlIllllIl(Inventory.contains(item -> {
            String[] strArr = new String[llIIlIlIlllI[1]];
            strArr[llIIlIlIlllI[0]] = llIIlIlIllIl[llIIlIlIlllI[3]];
            return item.hasAction(strArr);
        }) ? 1 : 0)) {
            return llIIlIlIlllI[0];
        }
        int[] iArr = new int[llIIlIlIlllI[1]];
        iArr[llIIlIlIlllI[0]] = llIIlIlIlllI[2];
        Item first = Inventory.getFirst(iArr);
        if (!lllllIlIlllllI(first) && !lllllIlIlllllI(NPCs.getNearest(npc -> {
            String str = llIIlIlIllIl[llIIlIlIlllI[1]];
            if (lllllIlIllllIl(npc.hasAction((v1) -> {
                return r1.equals(v1);
            }) ? 1 : 0) && lllllIlIllllll(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = llIIlIlIlllI[1];
                "".length();
                return (((((250 + 222) - 467) + 250) ^ (((141 + 26) - 73) + 105)) & (((78 ^ 107) ^ (130 ^ 159)) ^ (-" ".length()))) >= "  ".length() ? ((174 ^ 197) ^ (5 ^ 116)) & (((((126 + 29) - 72) + 65) ^ (((40 + 136) - 74) + 40)) ^ (-" ".length())) : r0;
            }
            return llIIlIlIlllI[0];
        }))) {
            first.interact(llIIlIlIllIl[llIIlIlIlllI[0]]);
            return llIIlIlIlllI[1];
        }
        return llIIlIlIlllI[0];
    }

    private static boolean lllllIlIllllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lllllIlIlllIIl(String lllllllllllllllIlIIllllIlIIIIlII, String lllllllllllllllIlIIllllIlIIIIIll) {
        String lllllllllllllllIlIIllllIlIIIIlII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllllIlIIIIIlI = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllllIlIIIIIll.toCharArray();
        int lllllllllllllllIlIIllllIlIIIIIII = llIIlIlIlllI[0];
        char[] charArray2 = lllllllllllllllIlIIllllIlIIIIlII2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIlIlllI[0];
        while (lllllIllIIIIII(i, length)) {
            lllllllllllllllIlIIllllIlIIIIIlI.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIIllllIlIIIIIII % charArray.length]));
            "".length();
            lllllllllllllllIlIIllllIlIIIIIII++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIllllIlIIIIIlI);
    }

    private static boolean lllllIllIIIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lllllIlIllllIl(int i) {
        return i != 0;
    }
}
