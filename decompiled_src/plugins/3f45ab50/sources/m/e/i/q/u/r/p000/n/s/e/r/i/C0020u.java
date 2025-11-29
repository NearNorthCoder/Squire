package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashSet;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Banking at guild")
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.u  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/u.class */
public class C0020u extends Task {
    private static /* synthetic */ String[] lllllIIlIIlI;
    private static /* synthetic */ int[] lllllIlIIlII;
    private final /* synthetic */ SquireMinerConfig E;

    private static String lIIlIIlIlIllIlI(String lllllllllllllllIIlIIlIlIllIIllII, String lllllllllllllllIIlIIlIlIllIIlIll) {
        String lllllllllllllllIIlIIlIlIllIIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlIllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIlIlIllIIlIIl = lllllllllllllllIIlIIlIlIllIIlIll.toCharArray();
        int lllllllllllllllIIlIIlIlIllIIlIII = lllllIlIIlII[0];
        char[] charArray = lllllllllllllllIIlIIlIlIllIIllII2.toCharArray();
        int length = charArray.length;
        int i = lllllIlIIlII[0];
        while (lIIlIIllIIlllIl(i, length)) {
            char lllllllllllllllIIlIIlIlIlIllllll = charArray[i];
            sb.append((char) (lllllllllllllllIIlIIlIlIlIllllll ^ lllllllllllllllIIlIIlIlIllIIlIIl[lllllllllllllllIIlIIlIlIllIIlIII % lllllllllllllllIIlIIlIlIllIIlIIl.length]));
            "".length();
            lllllllllllllllIIlIIlIlIllIIlIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIlIIllIIllIII();
        lIIlIIlIlIllIll();
    }

    private static boolean lIIlIIllIIlllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIllIIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIIllIIlllII(int i) {
        return i != 0;
    }

    private static boolean lIIlIIllIIllIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIIlIIlIlIllIll() {
        lllllIIlIIlI = new String[lllllIlIIlII[1]];
        lllllIIlIIlI[lllllIlIIlII[0]] = lIIlIIlIlIllIlI("HgAEJCkWDA==", "nigOH");
    }

    private static void lIIlIIllIIllIII() {
        lllllIlIIlII = new int[2];
        lllllIlIIlII[0] = ((((114 + 55) - 31) + 68) ^ (((36 + 29) - (-7)) + 56)) & (((146 ^ 150) ^ (95 ^ 21)) ^ (-" ".length()));
        lllllIlIIlII[1] = " ".length();
    }

    private static boolean lIIlIIllIIllIll(int i) {
        return i == 0;
    }

    @Inject
    public C0020u(SquireMinerConfig squireMinerConfig) {
        this.E = squireMinerConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    public boolean run() {
        if (lIIlIIllIIllIIl(this.E.activity(), EnumC0000a.AMETHYST) && lIIlIIllIIllIIl(this.E.activity(), EnumC0000a.GUILD_IRON)) {
            return lllllIlIIlII[0];
        }
        if ((!lIIlIIllIIllIIl(this.E.craft(), EnumC0001b.DISABLE) || !lIIlIIllIIllIlI(this.E.activity(), EnumC0000a.AMETHYST)) && !lIIlIIllIIllIll(Inventory.isFull() ? 1 : 0)) {
            if (lIIlIIllIIllIll(Bank.isOpen() ? 1 : 0)) {
                Bank.open();
                "".length();
                return lllllIlIIlII[1];
            }
            HashSet hashSet = new HashSet();
            for (Item item : Inventory.getAll()) {
                if (lIIlIIllIIlllII(hashSet.contains(item) ? 1 : 0)) {
                    "".length();
                    if (" ".length() == "  ".length()) {
                        return ((8 ^ 63) ^ (120 ^ 10)) & (((((197 + 127) - 216) + 98) ^ (((80 + 94) - 137) + 102)) ^ (-" ".length()));
                    }
                } else if (lIIlIIllIIlllII(item.getName().contains(lllllIIlIIlI[lllllIlIIlII[0]]) ? 1 : 0)) {
                    "".length();
                    if (0 != 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    hashSet.add(item);
                    "".length();
                    int[] iArr = new int[lllllIlIIlII[1]];
                    iArr[lllllIlIIlII[0]] = item.getId();
                    Bank.depositAll(iArr);
                    "".length();
                    if (((112 ^ 83) ^ (128 ^ 167)) == (-" ".length())) {
                        return ((((81 + 109) - 48) + 15) ^ (((10 + 100) - (-7)) + 29)) & (((204 ^ 195) ^ ((92 ^ 90) & ((48 ^ 54) ^ (-1)))) ^ (-" ".length()));
                    }
                }
            }
            return lllllIlIIlII[1];
        }
        return lllllIlIIlII[0];
    }
}
