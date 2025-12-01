package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Rotating Mirror", priority = 1000, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bs  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bs.class */
public class C0046bs extends Task {
    private final /* synthetic */ SquireQuestHelper fU;
    private static /* synthetic */ int[] llIIIIlII;
    private static /* synthetic */ String[] llIIIIIll;

    private static boolean lIlIlIIlIll(int i2) {
        return i2 == 0;
    }

    private static boolean lIlIlIIllIl(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIlIlIIllII(Object obj) {
        return obj != null;
    }

    private static void lIlIlIIlIIl() {
        llIIIIIll = new String[llIIIIlII[6]];
        llIIIIIll[llIIIIlII[0]] = lIlIlIIlIII("sQqNwPBANIMqwCkgcynHbA==", "JhWHX");
    }

    private static String lIlIlIIlIII(String lIllIllllllIIII, String lIllIlllllIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIlII[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIllllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIllllllIIIl) {
            lIllIllllllIIIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIIlIlI();
        lIlIlIIlIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    public boolean run() {
        if (lIlIlIIlIll(this.fU.cz().equals(llIIIIIll[llIIIIlII[0]]) ? 1 : 0)) {
            return llIIIIlII[0];
        }
        TileObject cx = this.fU.cx();
        if (!lIlIlIIllII(cx) || lIlIlIIllIl(cx.distanceTo(Players.getLocal()), llIIIIlII[1])) {
            return llIIIIlII[0];
        }
        if (lIlIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
            return llIIIIlII[0];
        }
        Widget widget = Widgets.get(llIIIIlII[2], llIIIIlII[3]);
        if (lIlIlIIlIll(Widgets.isVisible(widget) ? 1 : 0)) {
            return llIIIIlII[0];
        }
        widget.interact(llIIIIlII[0], llIIIIlII[4], llIIIIlII[5], widget.getId());
        return llIIIIlII[6];
    }

    private static void lIlIlIIlIlI() {
        llIIIIlII = new int[7];
        llIIIIlII[0] = ("   ".length() ^ (171 ^ 166)) & (((63 ^ 120) ^ (138 ^ 195)) ^ (-" ".length()));
        llIIIIlII[1] = "  ".length();
        llIIIIlII[2] = (-((-297) & 22825)) & (-1) & 23163;
        llIIIIlII[3] = (70 ^ 115) ^ (77 ^ 106);
        llIIIIlII[4] = (26 ^ 91) ^ (23 ^ 72);
        llIIIIlII[5] = -" ".length();
        llIIIIlII[6] = " ".length();
    }

    @Inject
    public C0046bs(SquireQuestHelper squireQuestHelper) {
        this.fU = squireQuestHelper;
    }
}
