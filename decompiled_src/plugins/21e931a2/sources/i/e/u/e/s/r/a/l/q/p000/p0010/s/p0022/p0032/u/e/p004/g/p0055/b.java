package i.e.u.e.s.r.a.l.q.p000.p0010.s.p0022.p0032.u.e.p004.g.p0055;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.leagues.banknote.NoteItemsConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import org.pf4j.util.StringUtils;
@TaskDesc(name = "note item task")
/* renamed from: i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.b  reason: invalid package */
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:i/e/u/e/s/r/a/l/q/-/0/s/2/2/u/e/-/g/5/b.class */
public class b extends Task {
    private static /* synthetic */ int[] llI;
    private final /* synthetic */ NoteItemsConfig c;
    private static /* synthetic */ String[] lIl;

    private static void lIl() {
        llI = new int[4];
        llI[0] = (20 ^ 51) & ((106 ^ 77) ^ (-1));
        llI[1] = " ".length();
        llI[2] = (174 ^ 155) ^ (12 ^ 49);
        llI[3] = "  ".length();
    }

    private static String ll(String llllllllllIIIII, String lllllllllIlllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllIlllll.getBytes(StandardCharsets.UTF_8)), llI[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllIIIIl) {
            llllllllllIIIIl.printStackTrace();
            return null;
        }
    }

    private static void lII() {
        lIl = new String[llI[1]];
        lIl[llI[0]] = ll("jvEbPmQfoQv8lJp64ogJU9A+ahj85f//NbJu1NweX9TxO3iVVTHtH+RYX4sPqcwcoEdaAD2FcYq2Q+PFN66ZUQ==", "Frjtw");
    }

    private static boolean lll(int i2) {
        return i2 == 0;
    }

    public b(NoteItemsConfig noteItemsConfig) {
        this.c = noteItemsConfig;
    }

    private static boolean llI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    public boolean run() {
        if (llI(StringUtils.isNotNullOrEmpty(this.c.noteItem()) ? 1 : 0)) {
            System.out.println(lIl[llI[0]]);
            return llI[0];
        }
        if (lll(this.c.getUnnotedMode() ? 1 : 0) && llI(Inventory.isFull() ? 1 : 0)) {
            int[] iArr = new int[llI[1]];
            iArr[llI[0]] = a.a;
            if (llI(Inventory.contains(iArr) ? 1 : 0) && lll(StringUtils.isNotNullOrEmpty(this.c.noteItem()) ? 1 : 0)) {
                Item first = Inventory.getFirst(item -> {
                    if (llI(item.getName().equalsIgnoreCase(this.c.noteItem()) ? 1 : 0) && lll(item.isNoted() ? 1 : 0)) {
                        ?? r0 = llI[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llI[0];
                });
                int[] iArr2 = new int[llI[1]];
                iArr2[llI[0]] = a.a;
                first.useOn(Inventory.getFirst(iArr2));
            }
        }
        if (llI(this.c.getUnnotedMode() ? 1 : 0) && lll(Inventory.contains(item2 -> {
            if (llI(item2.getName().equalsIgnoreCase(this.c.noteItem()) ? 1 : 0) && lll(item2.isNoted() ? 1 : 0)) {
                ?? r0 = llI[1];
                "".length();
                return "   ".length() == "  ".length() ? ((((66 + 101) - 67) + 36) ^ (((24 + 76) - (-5)) + 23)) & (((((98 + 92) - 102) + 65) ^ (((7 + 103) - 3) + 38)) ^ (-" ".length())) : r0;
            }
            return llI[0];
        }) ? 1 : 0)) {
            int[] iArr3 = new int[llI[1]];
            iArr3[llI[0]] = a.a;
            if (llI(Inventory.contains(iArr3) ? 1 : 0)) {
                Item first2 = Inventory.getFirst(item3 -> {
                    if (llI(item3.getName().equalsIgnoreCase(this.c.noteItem()) ? 1 : 0) && llI(item3.isNoted() ? 1 : 0)) {
                        ?? r0 = llI[1];
                        "".length();
                        return "   ".length() < "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llI[0];
                });
                int[] iArr4 = new int[llI[1]];
                iArr4[llI[0]] = a.a;
                first2.useOn(Inventory.getFirst(iArr4));
            }
        }
        return llI[0];
    }

    static {
        lIl();
        lII();
    }
}
