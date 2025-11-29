package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Opening sarcophagus", priority = 250, blocking = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.o  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/o.class */
public class o extends Task {
    private static /* synthetic */ String[] llllIIlIIIl;
    private static /* synthetic */ int[] llllIIlIIlI;
    private final /* synthetic */ SquireBarrows V;

    private static String lIllIIlllllllI(String llllllllllllllllIIIlllIIlIlllIII, String llllllllllllllllIIIlllIIlIllIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIIlIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIlIIlI[2], llllllllllllllllIIIlllIIlIlllIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIIlIlllIIl) {
            llllllllllllllllIIIlllIIlIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIIIIIIll(int i) {
        return i != 0;
    }

    private static boolean lIllIlIIIIIlII(int i, int i2) {
        return i >= i2;
    }

    private static void lIllIlIIIIIIII() {
        llllIIlIIlI = new int[7];
        llllIIlIIlI[0] = " ".length();
        llllIIlIIlI[1] = "  ".length() & ("  ".length() ^ (-" ".length()));
        llllIIlIIlI[2] = "  ".length();
        llllIIlIIlI[3] = (72 ^ 47) ^ (61 ^ 95);
        llllIIlIIlI[4] = 116 ^ 114;
        llllIIlIIlI[5] = "   ".length();
        llllIIlIIlI[6] = (5 ^ 78) ^ (46 ^ 109);
    }

    private static boolean lIllIlIIIIlIII(Object obj) {
        return obj != null;
    }

    private static String lIllIIllllllIl(String llllllllllllllllIIIlllIIlIlIlIll, String llllllllllllllllIIIlllIIlIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIIlIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), llllIIlIIlI[6]), "DES");
            Cipher llllllllllllllllIIIlllIIlIlIllIl = Cipher.getInstance("DES");
            llllllllllllllllIIIlllIIlIlIllIl.init(llllIIlIIlI[2], llllllllllllllllIIIlllIIlIlIlllI);
            return new String(llllllllllllllllIIIlllIIlIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIlllIIlIlIllII) {
            llllllllllllllllIIIlllIIlIlIllII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean M() {
        String[] strArr = new String[llllIIlIIlI[0]];
        strArr[llllIIlIIlI[1]] = llllIIlIIIl[llllIIlIIlI[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIllIlIIIIIIIl(nearest)) {
            return llllIIlIIlI[1];
        }
        String[] strArr2 = new String[llllIIlIIlI[2]];
        strArr2[llllIIlIIlI[1]] = llllIIlIIIl[llllIIlIIlI[0]];
        strArr2[llllIIlIIlI[0]] = llllIIlIIIl[llllIIlIIlI[2]];
        nearest.interact(strArr2);
        return llllIIlIIlI[0];
    }

    private static boolean lIllIlIIIIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIlIIIIIlIl(int i, int i2) {
        return i != i2;
    }

    static {
        lIllIlIIIIIIII();
        lIllIIllllllll();
    }

    private static boolean lIllIlIIIIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIIIIIIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public boolean run() {
        if (lIllIlIIIIIIlI(this.V.h() ? 1 : 0)) {
            return llllIIlIIlI[1];
        }
        if (lIllIlIIIIIIll(Dialog.isOpen() ? 1 : 0)) {
            this.V.k();
            if (lIllIlIIIIIlII(this.V.e(), llllIIlIIlI[3])) {
                DialogOption[] dialogOptionArr = new DialogOption[llllIIlIIlI[2]];
                dialogOptionArr[llllIIlIIlI[1]] = DialogOption.PLAIN_CONTINUE;
                dialogOptionArr[llllIIlIIlI[0]] = DialogOption.CHAT_OPTION_ONE;
                Dialog.invokeDialog(dialogOptionArr);
                return llllIIlIIlI[0];
            }
            return llllIIlIIlI[1];
        } else if (lIllIlIIIIIIll(this.V.i() ? 1 : 0) && lIllIlIIIIIlIl(this.V.e(), llllIIlIIlI[4])) {
            return llllIIlIIlI[1];
        } else {
            if (lIllIlIIIIIllI(this.V.r(), this.V.s()) && lIllIlIIIIIlll(this.V.e(), llllIIlIIlI[3])) {
                return llllIIlIIlI[1];
            }
            NPC nearest = NPCs.getNearest((v0) -> {
                return d.a(v0);
            });
            return (lIllIlIIIIlIII(nearest) && lIllIlIIIIIllI(nearest.getInteracting(), Players.getLocal())) ? llllIIlIIlI[1] : M();
        }
    }

    @Inject
    public o(SquireBarrows squireBarrows) {
        this.V = squireBarrows;
    }

    private static void lIllIIllllllll() {
        llllIIlIIIl = new String[llllIIlIIlI[5]];
        llllIIlIIIl[llllIIlIIlI[1]] = lIllIIllllllII("OAkbJyobAAgjMBg=", "khiDE");
        llllIIlIIIl[llllIIlIIlI[0]] = lIllIIllllllIl("gbdeTDsaDmM=", "Enqsl");
        llllIIlIIIl[llllIIlIIlI[2]] = lIllIIlllllllI("vEBEVAyQt74=", "BsHkN");
    }

    private static boolean lIllIlIIIIIIlI(int i) {
        return i == 0;
    }

    private static String lIllIIllllllII(String llllllllllllllllIIIlllIIlIIlIllI, String llllllllllllllllIIIlllIIlIIllIlI) {
        String llllllllllllllllIIIlllIIlIIlIllI2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIIlIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIIlllIIlIIllIlI.toCharArray();
        int llllllllllllllllIIIlllIIlIIlIlll = llllIIlIIlI[1];
        char[] charArray2 = llllllllllllllllIIIlllIIlIIlIllI2.toCharArray();
        int length = charArray2.length;
        int i = llllIIlIIlI[1];
        while (lIllIlIIIIIlll(i, length)) {
            char llllllllllllllllIIIlllIIlIIlllII = charArray2[i];
            sb.append((char) (llllllllllllllllIIIlllIIlIIlllII ^ charArray[llllllllllllllllIIIlllIIlIIlIlll % charArray.length]));
            "".length();
            llllllllllllllllIIIlllIIlIIlIlll++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
