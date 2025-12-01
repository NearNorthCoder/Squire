package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Banking", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.s  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/s.class */
public class s extends Task {
    private static /* synthetic */ String[] lIIllIlIlIlll;
    private final /* synthetic */ b ab;
    private final /* synthetic */ TempleTrekkingPlugin Z;
    private /* synthetic */ List<Integer> ac = d.XP_TOME.w();
    private /* synthetic */ Player G;
    private final /* synthetic */ TempleTrekkingConfig aa;
    private static /* synthetic */ int[] lIIllIlIllIII;

    static {
        lIllIIIIlllIIII();
        lIllIIIIllIllll();
    }

    @Inject
    public s(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b bVar) {
        this.aa = templeTrekkingConfig;
        this.ab = bVar;
        this.Z = templeTrekkingPlugin;
    }

    private static boolean lIllIIIIlllIIlI(int i) {
        return i != 0;
    }

    private static String lIllIIIIllIlllI(String llllllllllllllIlllIllllIIIlIlIII, String llllllllllllllIlllIllllIIIlIIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllllIIIlIIllI = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllllIIIlIIlll.toCharArray();
        int llllllllllllllIlllIllllIIIlIIlII = lIIllIlIllIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIlIllIII[0];
        while (lIllIIIIlllIIll(i, length)) {
            char llllllllllllllIlllIllllIIIlIlIIl = charArray2[i];
            llllllllllllllIlllIllllIIIlIIllI.append((char) (llllllllllllllIlllIllllIIIlIlIIl ^ charArray[llllllllllllllIlllIllllIIIlIIlII % charArray.length]));
            "".length();
            llllllllllllllIlllIllllIIIlIIlII++;
            i++;
            "".length();
            if ("   ".length() == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIllllIIIlIIllI);
    }

    private static void lIllIIIIlllIIII() {
        lIIllIlIllIII = new int[3];
        lIIllIlIllIII[0] = ((19 ^ 68) ^ (193 ^ 198)) & (((100 ^ 88) ^ (216 ^ 180)) ^ (-" ".length()));
        lIIllIlIllIII[1] = " ".length();
        lIIllIlIllIII[2] = (136 ^ 198) ^ (114 ^ 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    public boolean run() {
        if (lIllIIIIlllIIIl(this.aa.claimBankTomes() ? 1 : 0)) {
            return lIIllIlIllIII[0];
        }
        List all = Inventory.getAll(item -> {
            return this.ac.contains(Integer.valueOf(item.getId()));
        });
        if (lIllIIIIlllIIlI(all.isEmpty() ? 1 : 0)) {
            if (!lIllIIIIlllIIIl(Bank.isOpen() ? 1 : 0)) {
                Bank.withdraw(item2 -> {
                    return this.ac.contains(Integer.valueOf(item2.getId()));
                }, lIIllIlIllIII[2], Bank.WithdrawMode.ITEM);
                return lIIllIlIllIII[1];
            }
            Bank.open();
            "".length();
            return lIIllIlIllIII[1];
        }
        int llllllllllllllIlllIllllIIIllIIll = lIIllIlIllIII[0];
        while (lIllIIIIlllIIll(llllllllllllllIlllIllllIIIllIIll, Math.min(this.aa.perTick(), all.size()))) {
            ((Item) all.get(llllllllllllllIlllIllllIIIllIIll)).interact(lIIllIlIlIlll[lIIllIlIllIII[0]]);
            llllllllllllllIlllIllllIIIllIIll++;
            "".length();
            if ((-((221 ^ 167) ^ (((59 + 31) - 88) + 125))) >= 0) {
                return ((106 ^ 67) ^ (11 ^ 113)) & (((63 ^ 95) ^ (123 ^ 72)) ^ (-" ".length()));
            }
        }
        return lIIllIlIllIII[1];
    }

    private static boolean lIllIIIIlllIIIl(int i) {
        return i == 0;
    }

    private static boolean lIllIIIIlllIIll(int i, int i2) {
        return i < i2;
    }

    private static void lIllIIIIllIllll() {
        lIIllIlIlIlll = new String[lIIllIlIllIII[1]];
        lIIllIlIlIlll[lIIllIlIllIII[0]] = lIllIIIIllIlllI("Ji02Pg==", "tHWZp");
    }
}
