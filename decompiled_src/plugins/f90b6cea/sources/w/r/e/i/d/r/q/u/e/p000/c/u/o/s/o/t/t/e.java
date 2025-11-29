package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
@TaskDesc(name = "Fletching Logs", priority = 10)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.e  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/e.class */
public class e extends Task {
    private static /* synthetic */ int[] lIllIIIIIlIII;
    private final /* synthetic */ SquireWoodcutterConfig B;
    private static /* synthetic */ String[] lIllIIIIIIlll;

    private static boolean llIIIIlllllIIlI(int i) {
        return i != 0;
    }

    static {
        llIIIIlllllIIII();
        llIIIIllllIllll();
    }

    private static boolean llIIIIlllllIIIl(int i) {
        return i == 0;
    }

    private static void llIIIIlllllIIII() {
        lIllIIIIIlIII = new int[6];
        lIllIIIIIlIII[0] = ((((220 + 155) - 159) + 27) ^ (((146 + 48) - 188) + 154)) & (((178 ^ 185) ^ (53 ^ 109)) ^ (-" ".length()));
        lIllIIIIIlIII[1] = " ".length();
        lIllIIIIIlIII[2] = (-((-22778) & 31999)) & (-4169) & 14335;
        lIllIIIIIlIII[3] = (68 ^ 23) ^ (10 ^ 93);
        lIllIIIIIlIII[4] = "  ".length();
        lIllIIIIIlIII[5] = 98 ^ 106;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    public boolean run() {
        if (llIIIIlllllIIIl(this.B.cutLogs() ? 1 : 0)) {
            return lIllIIIIIlIII[0];
        }
        int[] iArr = new int[lIllIIIIIlIII[1]];
        iArr[lIllIIIIIlIII[0]] = lIllIIIIIlIII[2];
        if (!llIIIIlllllIIIl(Inventory.contains(iArr) ? 1 : 0) && !llIIIIlllllIIIl(Inventory.isFull() ? 1 : 0)) {
            if (llIIIIlllllIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
                return lIllIIIIIlIII[1];
            }
            if (llIIIIlllllIIIl(Tabs.isOpen(Tab.INVENTORY) ? 1 : 0)) {
                Tabs.open(Tab.INVENTORY);
                return lIllIIIIIlIII[1];
            }
            Item first = Inventory.getFirst(item -> {
                return item.getName().toLowerCase().endsWith(lIllIIIIIIlll[lIllIIIIIlIII[0]]);
            });
            if (llIIIIlllllIIll(first)) {
                return lIllIIIIIlIII[0];
            }
            int[] iArr2 = new int[lIllIIIIIlIII[1]];
            iArr2[lIllIIIIIlIII[0]] = lIllIIIIIlIII[2];
            Item first2 = Inventory.getFirst(iArr2);
            if (llIIIIlllllIIlI(Production.isOpen() ? 1 : 0)) {
                Production.choosePreviousOption();
                sleep(lIllIIIIIlIII[3]);
                return lIllIIIIIlIII[1];
            }
            first.useOn(first2);
            sleep(lIllIIIIIlIII[4]);
            return lIllIIIIIlIII[1];
        }
        return lIllIIIIIlIII[0];
    }

    private static void llIIIIllllIllll() {
        lIllIIIIIIlll = new String[lIllIIIIIlIII[1]];
        lIllIIIIIIlll[lIllIIIIIlIII[0]] = llIIIIllllIlllI("mrinWTiRVzU=", "xjSXS");
    }

    private static boolean llIIIIlllllIIll(Object obj) {
        return obj == null;
    }

    private static String llIIIIllllIlllI(String llllllllllllllIllIIllIllIIIlIlIl, String llllllllllllllIllIIllIllIIIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIllIIIlIlII.getBytes(StandardCharsets.UTF_8)), lIllIIIIIlIII[5]), "DES");
            Cipher llllllllllllllIllIIllIllIIIlIlll = Cipher.getInstance("DES");
            llllllllllllllIllIIllIllIIIlIlll.init(lIllIIIIIlIII[4], secretKeySpec);
            return new String(llllllllllllllIllIIllIllIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIllIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIllIIIlIllI) {
            llllllllllllllIllIIllIllIIIlIllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public e(SquireWoodcutterConfig squireWoodcutterConfig) {
        this.B = squireWoodcutterConfig;
    }
}
