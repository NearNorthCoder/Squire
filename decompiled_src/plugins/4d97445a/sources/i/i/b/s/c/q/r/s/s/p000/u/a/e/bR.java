package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.secondaries.SecondariesPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Grab fungus", blocking = true, priority = 1)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bR  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bR.class */
public class bR extends Task {
    private /* synthetic */ int gR;
    private static /* synthetic */ int[] lllIIllI;
    private final /* synthetic */ SecondariesPlugin gQ;
    private static /* synthetic */ String[] lllIIlII;

    private static boolean llIIlIllll(int i2) {
        return i2 != 0;
    }

    private static void llIIlIllII() {
        lllIIlII = new String[lllIIllI[1]];
        lllIIlII[lllIIllI[0]] = llIIlIIllI("l4aLVEIS8es=", "olsLj");
    }

    private static boolean llIIlIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean run() {
        WorldPoint cT = this.gQ.cT();
        if (!llIIlIlllI(cT) && !llIIlIllll(Inventory.isFull() ? 1 : 0)) {
            int tickCount = Static.getClient().getTickCount();
            if (llIIllIIII(tickCount - this.gR, lllIIllI[1])) {
                return lllIIllI[1];
            }
            int i2 = lllIIllI[1];
            int[] iArr = new int[lllIIllI[1]];
            iArr[lllIIllI[0]] = lllIIllI[2];
            TileObject firstSurrounding = TileObjects.getFirstSurrounding(cT, i2, iArr);
            if (llIIlIlllI(firstSurrounding)) {
                return lllIIllI[0];
            }
            firstSurrounding.interact(lllIIlII[lllIIllI[0]]);
            this.gR = tickCount;
            return lllIIllI[1];
        }
        return lllIIllI[0];
    }

    private static String llIIlIIllI(String llIlIIlllIlIlIl, String llIlIIlllIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIIlllIlIlII.getBytes(StandardCharsets.UTF_8)), lllIIllI[3]), "DES");
            Cipher llIlIIlllIlIlll = Cipher.getInstance("DES");
            llIlIIlllIlIlll.init(lllIIllI[4], secretKeySpec);
            return new String(llIlIIlllIlIlll.doFinal(Base64.getDecoder().decode(llIlIIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIIlllIlIllI) {
            llIlIIlllIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllIIII(int i2, int i3) {
        return i2 <= i3;
    }

    @Inject
    public bR(SecondariesPlugin secondariesPlugin) {
        this.gQ = secondariesPlugin;
    }

    static {
        llIIlIllIl();
        llIIlIllII();
    }

    private static void llIIlIllIl() {
        lllIIllI = new int[5];
        lllIIllI[0] = (55 ^ 115) & ((37 ^ 97) ^ (-1));
        lllIIllI[1] = " ".length();
        lllIIllI[2] = (-16963) & 20471;
        lllIIllI[3] = 137 ^ 129;
        lllIIllI[4] = "  ".length();
    }
}
