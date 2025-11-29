package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Alching item", priority = 100)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.v  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/v.class */
public class v extends Task {
    private static /* synthetic */ int[] llIIlIIllIIl;
    private static /* synthetic */ String[] llIIlIIllIII;
    private static final /* synthetic */ List<String> ai;

    private static String lllllIIlllIlll(String lllllllllllllllIlIlIIIIIlIIIlllI, String lllllllllllllllIlIlIIIIIlIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIlIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIlIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIllIIl[3], lllllllllllllllIlIlIIIIIlIIlIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIlIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIlIIIllll) {
            lllllllllllllllIlIlIIIIIlIIIllll.printStackTrace();
            return null;
        }
    }

    private static void lllllIIllllIIl() {
        llIIlIIllIIl = new int[14];
        llIIlIIllIIl[0] = ((((129 + 123) - 124) + 18) ^ (((133 + 50) - 93) + 45)) & (((170 ^ 141) ^ (14 ^ 60)) ^ (-" ".length()));
        llIIlIIllIIl[1] = " ".length();
        llIIlIIllIIl[2] = (((23 + 75) - (-7)) + 43) ^ (((151 + 64) - 191) + 129);
        llIIlIIllIIl[3] = "  ".length();
        llIIlIIllIIl[4] = "   ".length();
        llIIlIIllIIl[5] = 9 ^ 13;
        llIIlIIllIIl[6] = 87 ^ 82;
        llIIlIIllIIl[7] = 171 ^ 173;
        llIIlIIllIIl[8] = 181 ^ 178;
        llIIlIIllIIl[9] = 28 ^ 20;
        llIIlIIllIIl[10] = 87 ^ 94;
        llIIlIIllIIl[11] = (((39 + 37) - (-7)) + 44) ^ (115 ^ 6);
        llIIlIIllIIl[12] = 24 ^ 19;
        llIIlIIllIIl[13] = 180 ^ 184;
    }

    private static boolean lllllIIllllIll(int i) {
        return i == 0;
    }

    static {
        lllllIIllllIIl();
        lllllIIllllIII();
        String[] strArr = new String[llIIlIIllIIl[2]];
        strArr[llIIlIIllIIl[0]] = llIIlIIllIII[llIIlIIllIIl[0]];
        strArr[llIIlIIllIIl[1]] = llIIlIIllIII[llIIlIIllIIl[1]];
        strArr[llIIlIIllIIl[3]] = llIIlIIllIII[llIIlIIllIIl[3]];
        strArr[llIIlIIllIIl[4]] = llIIlIIllIII[llIIlIIllIIl[4]];
        strArr[llIIlIIllIIl[5]] = llIIlIIllIII[llIIlIIllIIl[5]];
        strArr[llIIlIIllIIl[6]] = llIIlIIllIII[llIIlIIllIIl[6]];
        strArr[llIIlIIllIIl[7]] = llIIlIIllIII[llIIlIIllIIl[7]];
        strArr[llIIlIIllIIl[8]] = llIIlIIllIII[llIIlIIllIIl[8]];
        strArr[llIIlIIllIIl[9]] = llIIlIIllIII[llIIlIIllIIl[9]];
        strArr[llIIlIIllIIl[10]] = llIIlIIllIII[llIIlIIllIIl[10]];
        strArr[llIIlIIllIIl[11]] = llIIlIIllIII[llIIlIIllIIl[11]];
        strArr[llIIlIIllIIl[12]] = llIIlIIllIII[llIIlIIllIIl[12]];
        strArr[llIIlIIllIIl[13]] = llIIlIIllIII[llIIlIIllIIl[13]];
        ai = List.of((Object[]) strArr);
    }

    private static void lllllIIllllIII() {
        llIIlIIllIII = new String[llIIlIIllIIl[2]];
        llIIlIIllIII[llIIlIIllIIl[0]] = lllllIIlllIlIl("r0WZykkRZ48zWFedzZLUnw==", "TIQAM");
        llIIlIIllIII[llIIlIIllIIl[1]] = lllllIIlllIllI("BT8UK0plIlo9HTg4Hg==", "WJzNj");
        llIIlIIllIII[llIIlIIllIIl[3]] = lllllIIlllIlll("keGVG1DUYrtUUHB1MWET7w==", "TAUXj");
        llIIlIIllIII[llIIlIIllIIl[4]] = lllllIIlllIlll("lEPcTH0drQFnOtF8vOpP2Q==", "YPACu");
        llIIlIIllIII[llIIlIIllIIl[5]] = lllllIIlllIlIl("Uy6pDER/AIsybXNeUDKCXQ==", "TLUFW");
        llIIlIIllIII[llIIlIIllIIl[6]] = lllllIIlllIllI("Gw0kCXAkHS5MOCwUJw==", "IxJlP");
        llIIlIIllIII[llIIlIIllIIl[7]] = lllllIIlllIllI("IT0mHVoDJCkMHx8tLws=", "sHHxz");
        llIIlIIllIII[llIIlIIllIIl[8]] = lllllIIlllIlll("jPV0nuxaLcUOFEHuakQ+YQ==", "DajNM");
        llIIlIIllIII[llIIlIIllIIl[9]] = lllllIIlllIlll("zob3k9gkpHZy9ccrIyruGA==", "Ilfon");
        llIIlIIllIII[llIIlIIllIIl[10]] = lllllIIlllIlIl("yjrYF6tsiDVZybQFhcbCbQ==", "oLtBa");
        llIIlIIllIII[llIIlIIllIIl[11]] = lllllIIlllIlll("JDGi/hYWsWvdwCqpyXgSfA==", "VwCzF");
        llIIlIIllIII[llIIlIIllIIl[12]] = lllllIIlllIlll("qxESUVt413L6Sa2RkT4T2w==", "oUeVb");
        llIIlIIllIII[llIIlIIllIIl[13]] = lllllIIlllIllI("EgoUNAc4WAYwATsRATIa", "VxuSh");
    }

    private static boolean lllllIIllllIlI(Object obj) {
        return obj == null;
    }

    private static String lllllIIlllIlIl(String lllllllllllllllIlIlIIIIIlIIIIIIl, String lllllllllllllllIlIlIIIIIlIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIlIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), llIIlIIllIIl[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIIllIIl[3], lllllllllllllllIlIlIIIIIlIIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlIIIIIlIIIIIlI) {
            lllllllllllllllIlIlIIIIIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(item -> {
            return ai.contains(item.getName());
        });
        if (lllllIIllllIlI(first)) {
            return llIIlIIllIIl[0];
        }
        SpellBook.Standard standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (lllllIIllllIll(standard.canCast() ? 1 : 0)) {
            return llIIlIIllIIl[0];
        }
        Magic.cast(standard);
        first.interact(llIIlIIllIIl[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), first.getSlot(), WidgetInfo.INVENTORY.getId());
        return llIIlIIllIIl[1];
    }

    private static boolean lllllIIlllllII(int i, int i2) {
        return i < i2;
    }

    private static String lllllIIlllIllI(String lllllllllllllllIlIlIIIIIIlllIIIl, String lllllllllllllllIlIlIIIIIIlllIIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlIIIIIIlllIIII.toCharArray();
        int lllllllllllllllIlIlIIIIIIllIllIl = llIIlIIllIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIllIIl[0];
        while (lllllIIlllllII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIlIIIIIIllIllIl % charArray.length]));
            "".length();
            lllllllllllllllIlIlIIIIIIllIllIl++;
            i++;
            "".length();
            if (((76 ^ 43) ^ (11 ^ 105)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
