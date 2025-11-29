package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Pressing Dialog Option", priority = 15, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.br  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/br.class */
public class C0045br extends Task {
    private /* synthetic */ int fT;
    private final /* synthetic */ SquireQuestHelper fS;
    private static /* synthetic */ int[] lIlllII;
    private static /* synthetic */ String[] lIllIll;

    private static void lIlllIIII() {
        lIllIll = new String[lIlllII[8]];
        lIllIll[lIlllII[0]] = lIllIlllI("JsmlI5zTX3r6H8jjjp5Ygg==", "IQpgO");
        lIllIll[lIlllII[1]] = lIllIllll("Eqbr8AvVpIw=", "MLjRG");
        lIllIll[lIlllII[2]] = lIllIlllI("yPZi4H7RpqY=", "BMAzM");
        lIllIll[lIlllII[3]] = lIllIllll("YAsCISBh77E=", "iDDrd");
        lIllIll[lIlllII[4]] = lIllIllll("KB8ccRUk6Q402tO/hIVcqqyjxMweCGCt", "UMsHM");
        lIllIll[lIlllII[5]] = lIllIllll("6TwdBeIurEk=", "tUNSE");
        lIllIll[lIlllII[6]] = lIllIllll("J+YHDnShxKs=", "AKMPR");
        lIllIll[lIlllII[7]] = lIllIllll("zbhPHMkjNI0=", "KqNQr");
    }

    private static void lIlllIIIl() {
        lIlllII = new int[9];
        lIlllII[0] = (121 ^ 79) & ((29 ^ 43) ^ (-1));
        lIlllII[1] = " ".length();
        lIlllII[2] = "  ".length();
        lIlllII[3] = "   ".length();
        lIlllII[4] = (139 ^ 131) ^ (19 ^ 31);
        lIlllII[5] = (206 ^ 156) ^ (38 ^ 113);
        lIlllII[6] = (((120 + 129) - 108) + 25) ^ (((139 + 3) - (-11)) + 7);
        lIlllII[7] = (((128 + 92) - 140) + 102) ^ (((51 + 133) - 156) + 149);
        lIlllII[8] = 83 ^ 91;
    }

    private static boolean lIlllIIlI(int i2) {
        return i2 == 0;
    }

    @Inject
    public C0045br(SquireQuestHelper squireQuestHelper) {
        this.fS = squireQuestHelper;
    }

    private static boolean lIlllIIll(int i2) {
        return i2 != 0;
    }

    private static boolean lIlllIlII(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIllIllll(String lllIllIIlIlIlII, String lllIllIIlIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIlllII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIllIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIIlIlIlIl) {
            lllIllIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIlllI(String lllIllIIllIIIIl, String lllIllIIllIIIII) {
        try {
            SecretKeySpec lllIllIIllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIIllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllII[2], lllIllIIllIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIllIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIIllIIIlI) {
            lllIllIIllIIIlI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        if (lIlllIIlI(this.fS.isEnabled() ? 1 : 0)) {
            return lIlllII[0];
        }
        if (!lIlllIIll(Dialog.isOpen() ? 1 : 0) || lIlllIIll(Dialog.getName().contains(lIllIll[lIlllII[0]]) ? 1 : 0)) {
            return lIlllII[0];
        }
        if (lIlllIIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            return lIlllII[0];
        }
        int i2 = this.fT;
        this.fT = i2 + lIlllII[1];
        if (lIlllIlII(i2, lIlllII[2])) {
            return lIlllII[1];
        }
        this.fT = lIlllII[0];
        if (lIlllIIll(Dialog.hasOption(str -> {
            return str.startsWith(lIllIll[lIlllII[7]]);
        }) ? 1 : 0)) {
            String[] strArr = new String[lIlllII[1]];
            strArr[lIlllII[0]] = lIllIll[lIlllII[1]];
            Dialog.chooseOption(strArr);
            "".length();
            return lIlllII[1];
        } else if (lIlllIIll(Dialog.hasOption(str2 -> {
            return str2.contains(lIllIll[lIlllII[6]]);
        }) ? 1 : 0)) {
            String[] strArr2 = new String[lIlllII[1]];
            strArr2[lIlllII[0]] = lIllIll[lIlllII[2]];
            Dialog.chooseOption(strArr2);
            "".length();
            return lIlllII[1];
        } else if (lIlllIIll(Dialog.hasOption(str3 -> {
            return str3.toLowerCase().contains(lIllIll[lIlllII[5]]);
        }) ? 1 : 0)) {
            String[] strArr3 = new String[lIlllII[1]];
            strArr3[lIlllII[0]] = lIllIll[lIlllII[3]];
            Dialog.chooseOption(strArr3);
            "".length();
            return lIlllII[1];
        } else {
            int nextInt = Rand.nextInt(lIlllII[1], Dialog.getOptions().size() + lIlllII[1]);
            String str4 = lIllIll[lIlllII[4]];
            Object[] objArr = new Object[lIlllII[1]];
            objArr[lIlllII[0]] = Integer.valueOf(nextInt);
            Log.info(str4, objArr);
            Dialog.chooseOption(nextInt);
            "".length();
            return lIlllII[1];
        }
    }

    static {
        lIlllIIIl();
        lIlllIIII();
    }
}
