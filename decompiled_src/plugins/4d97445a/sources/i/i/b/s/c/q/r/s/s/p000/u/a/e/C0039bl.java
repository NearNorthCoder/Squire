package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Performing dig task")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bl  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bl.class */
public class C0039bl extends Task {
    @Inject
    private /* synthetic */ SquireQuestHelper fG;
    private static /* synthetic */ int[] lIllllI;
    private static /* synthetic */ String[] lIlllIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        if (lIllllIIl(this.fG.cz().equals(lIlllIl[lIllllI[0]]) ? 1 : 0)) {
            return lIllllI[0];
        }
        WorldPoint cA = this.fG.cA();
        if (lIllllIlI(cA)) {
            return lIllllI[0];
        }
        if (lIllllIIl(Players.getLocal().getWorldLocation().equals(cA) ? 1 : 0)) {
            Movement.walkTo(cA);
            "".length();
            return lIllllI[1];
        }
        int[] iArr = new int[lIllllI[1]];
        iArr[lIllllI[0]] = lIllllI[2];
        Item first = Inventory.getFirst(iArr);
        if (lIllllIlI(first)) {
            return lIllllI[0];
        }
        first.interact(lIlllIl[lIllllI[1]]);
        return lIllllI[1];
    }

    private static void lIllllIII() {
        lIllllI = new int[5];
        lIllllI[0] = (119 ^ 45) & ((124 ^ 38) ^ (-1));
        lIllllI[1] = " ".length();
        lIllllI[2] = (-15432) & 16383;
        lIllllI[3] = "  ".length();
        lIllllI[4] = 74 ^ 66;
    }

    private static boolean lIllllIIl(int i2) {
        return i2 == 0;
    }

    static {
        lIllllIII();
        lIlllIlll();
    }

    private static String lIlllIlIl(String lllIllIIIlIlIlI, String lllIllIIIlIlIIl) {
        try {
            SecretKeySpec lllIllIIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIllIIIlIllII = Cipher.getInstance("Blowfish");
            lllIllIIIlIllII.init(lIllllI[3], lllIllIIIlIllIl);
            return new String(lllIllIIIlIllII.doFinal(Base64.getDecoder().decode(lllIllIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIIIlIlIll) {
            lllIllIIIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlI(Object obj) {
        return obj == null;
    }

    private static String lIlllIllI(String lllIllIIIllIlll, String lllIllIIIllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIIIllIllI.getBytes(StandardCharsets.UTF_8)), lIllllI[4]), "DES");
            Cipher lllIllIIIlllIIl = Cipher.getInstance("DES");
            lllIllIIIlllIIl.init(lIllllI[3], secretKeySpec);
            return new String(lllIllIIIlllIIl.doFinal(Base64.getDecoder().decode(lllIllIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllIIIlllIII) {
            lllIllIIIlllIII.printStackTrace();
            return null;
        }
    }

    private static void lIlllIlll() {
        lIlllIl = new String[lIllllI[3]];
        lIlllIl[lIllllI[0]] = lIlllIlIl("ujA2AnlSaXQ=", "zAXVS");
        lIlllIl[lIllllI[1]] = lIlllIllI("aKId2IcU0IA=", "GEpSi");
    }
}
