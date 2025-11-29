package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.unethicalite.api.items.Inventory;
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.o  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/o.class */
public abstract class o extends Task {
    private static /* synthetic */ int[] lIIlIlIlIlIIl;
    protected final /* synthetic */ SquireSaraConfig N;
    protected final /* synthetic */ Client P;
    protected final /* synthetic */ SquireSaradomin O;
    private static /* synthetic */ String[] lIIlIlIlIlIII;

    private static boolean lIlIllIIIIIlIII(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    public boolean T() {
        BankLoadout bankLoadout = (BankLoadout) this.N.bankLoadout().selected(BankLoadout.class);
        if (lIlIllIIIIIIllI(bankLoadout)) {
            return lIIlIlIlIlIIl[0];
        }
        InventorySetup inventorySetup = bankLoadout.getInventorySetup();
        HashMap hashMap = new HashMap();
        int[] ids = inventorySetup.getIds();
        int length = ids.length;
        int i = lIIlIlIlIlIIl[0];
        while (lIlIllIIIIIIlll(i, length)) {
            int i2 = ids[i];
            hashMap.put(Integer.valueOf(i2), Integer.valueOf(((Integer) hashMap.getOrDefault(Integer.valueOf(i2), Integer.valueOf(lIIlIlIlIlIIl[0]))).intValue() + lIIlIlIlIlIIl[1]));
            "".length();
            i++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        for (Integer num : hashMap.keySet()) {
            int intValue = num.intValue();
            if (lIlIllIIIIIlIIl(intValue, lIIlIlIlIlIIl[2])) {
                "".length();
                if ("  ".length() <= (((((75 + 157) - 212) + 227) ^ (((164 + 172) - 270) + 131)) & (((((80 + 84) - 80) + 63) ^ (((149 + 62) - 110) + 60)) ^ (-" ".length())))) {
                    return ((206 ^ 138) ^ (81 ^ 5)) & ((" ".length() ^ (116 ^ 101)) ^ (-" ".length()));
                }
            } else {
                int intValue2 = ((Integer) hashMap.get(Integer.valueOf(intValue))).intValue();
                int[] iArr = new int[lIIlIlIlIlIIl[1]];
                iArr[lIIlIlIlIlIIl[0]] = intValue;
                if (lIlIllIIIIIIlll(Inventory.getCount(iArr), intValue2)) {
                    return lIIlIlIlIlIIl[1];
                }
                "".length();
                if (((196 ^ 154) ^ (241 ^ 171)) < 0) {
                    return ((243 ^ 148) ^ (126 ^ 47)) & (((117 ^ 49) ^ (22 ^ 100)) ^ (-" ".length()));
                }
            }
        }
        return lIIlIlIlIlIIl[0];
    }

    private static boolean lIlIllIIIIIIlIl(int i) {
        return i == 0;
    }

    private static boolean lIlIllIIIIIIlll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllIIIIIlIIl(int i, int i2) {
        return i == i2;
    }

    private static void lIlIllIIIIIIIlI() {
        lIIlIlIlIlIII = new String[lIIlIlIlIlIIl[1]];
        lIIlIlIlIlIII[lIIlIlIlIlIIl[0]] = lIlIllIIIIIIIIl("CCsbAw==", "FDufP");
    }

    static {
        lIlIllIIIIIIIll();
        lIlIllIIIIIIIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    protected boolean a(int i) {
        int[] mapRegions = this.P.getMapRegions();
        int length = mapRegions.length;
        int i2 = lIIlIlIlIlIIl[0];
        while (lIlIllIIIIIIlll(i2, length)) {
            int llllllllllllllIllllIlllIIlIlIlll = mapRegions[i2];
            if (lIlIllIIIIIlIIl(llllllllllllllIllllIlllIIlIlIlll, i)) {
                return lIIlIlIlIlIIl[1];
            }
            i2++;
            "".length();
            if ("  ".length() < (-" ".length())) {
                return ((140 ^ 134) ^ (4 ^ 68)) & (((((81 + 123) - 48) + 62) ^ (((17 + 17) - (-50)) + 60)) ^ (-" ".length()));
            }
        }
        return lIIlIlIlIlIIl[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean S() {
        if (lIlIllIIIIIIlII(this.N.bankLoadout().getSelected()) && lIlIllIIIIIIlIl(this.N.bankLoadout().getSelected().equals(lIIlIlIlIlIII[lIIlIlIlIlIIl[0]]) ? 1 : 0)) {
            ?? r0 = lIIlIlIlIlIIl[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIlIlIlIIl[0];
    }

    private static String lIlIllIIIIIIIIl(String llllllllllllllIllllIlllIIlIIllII, String llllllllllllllIllllIlllIIlIIlIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIlllIIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIlllIIlIIlIIl = llllllllllllllIllllIlllIIlIIlIll.toCharArray();
        int llllllllllllllIllllIlllIIlIIlIII = lIIlIlIlIlIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIlIlIlIIl[0];
        while (lIlIllIIIIIIlll(i, length)) {
            char llllllllllllllIllllIlllIIlIIllIl = charArray[i];
            sb.append((char) (llllllllllllllIllllIlllIIlIIllIl ^ llllllllllllllIllllIlllIIlIIlIIl[llllllllllllllIllllIlllIIlIIlIII % llllllllllllllIllllIlllIIlIIlIIl.length]));
            "".length();
            llllllllllllllIllllIlllIIlIIlIII++;
            i++;
            "".length();
            if ((-" ".length()) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public o(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, Client client) {
        this.N = squireSaraConfig;
        this.O = squireSaradomin;
        this.P = client;
    }

    private static boolean lIlIllIIIIIIlII(Object obj) {
        return obj != null;
    }

    private static void lIlIllIIIIIIIll() {
        lIIlIlIlIlIIl = new int[3];
        lIIlIlIlIlIIl[0] = ((119 ^ 63) ^ (50 ^ 90)) & (((127 ^ 72) ^ (98 ^ 117)) ^ (-" ".length()));
        lIIlIlIlIlIIl[1] = " ".length();
        lIIlIlIlIlIIl[2] = -" ".length();
    }

    private static boolean lIlIllIIIIIIllI(Object obj) {
        return obj == null;
    }
}
