package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Stamina handler")
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.p  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/p.class */
public class p extends Task {
    private static /* synthetic */ String[] lIIllIIllIlII;
    private final /* synthetic */ TempleTrekkingConfig P;
    private final /* synthetic */ TempleTrekkingPlugin O;
    private static /* synthetic */ int[] lIIllIIllIlIl;

    private static String lIlIlllllllIllI(String llllllllllllllIllllIIIIIlllllIlI, String llllllllllllllIllllIIIIIlllllIIl) {
        String llllllllllllllIllllIIIIIlllllIlI2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIIIIIlllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIIIIIlllllIIl.toCharArray();
        int llllllllllllllIllllIIIIIllllIllI = lIIllIIllIlIl[0];
        char[] charArray2 = llllllllllllllIllllIIIIIlllllIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIllIlIl[0];
        while (lIlIlllllllllII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIllllIIIIIllllIllI % charArray.length]));
            "".length();
            llllllllllllllIllllIIIIIllllIllI++;
            i++;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIllllllllIIl(Object obj) {
        return obj == null;
    }

    private static void lIlIlllllllIlll() {
        lIIllIIllIlII = new String[lIIllIIllIlIl[4]];
        lIIllIIllIlII[lIIllIIllIlIl[0]] = lIlIlllllllIllI("Cjo8OQE=", "NHUWj");
        lIIllIIllIlII[lIIllIIllIlIl[3]] = lIlIlllllllIllI("PBUzNCcBAA==", "oaRYN");
    }

    private static boolean lIlIlllllllllII(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllllllllIII() {
        lIIllIIllIlIl = new int[5];
        lIIllIIllIlIl[0] = (98 ^ 64) & ((110 ^ 76) ^ (-1));
        lIIllIIllIlIl[1] = 187 ^ 165;
        lIIllIIllIlIl[2] = (106 ^ 3) ^ (249 ^ 172);
        lIIllIIllIlIl[3] = " ".length();
        lIIllIIllIlIl[4] = "  ".length();
    }

    static {
        lIlIllllllllIII();
        lIlIlllllllIlll();
    }

    @Inject
    p(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        this.O = templeTrekkingPlugin;
        this.P = templeTrekkingConfig;
    }

    private static boolean lIlIllllllllIll(int i) {
        return i != 0;
    }

    private static boolean lIlIllllllllIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().contains(lIIllIIllIlII[lIIllIIllIlIl[3]]);
        });
        if (!lIlIllllllllIIl(first) && !lIlIllllllllIlI(Movement.getRunEnergy(), lIIllIIllIlIl[1]) && !lIlIllllllllIll(Movement.isStaminaBoosted() ? 1 : 0) && lIlIlllllllllII(Movement.getRunEnergy(), lIIllIIllIlIl[2])) {
            first.interact(lIIllIIllIlII[lIIllIIllIlIl[0]]);
            return lIIllIIllIlIl[3];
        }
        return lIIllIIllIlIl[0];
    }
}
