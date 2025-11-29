package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Banking gem rocks", priority = 100, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.q  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/q.class */
public class C0016q extends Task {
    private static /* synthetic */ int[] lllllIlIlllI;
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static final /* synthetic */ Set<Integer> v;
    private static /* synthetic */ String[] lllllIlIllIl;

    private static String lIIlIIllIllIllI(String lllllllllllllllIIlIIlIlIIIIllIlI, String lllllllllllllllIIlIIlIlIIIIllIIl) {
        String lllllllllllllllIIlIIlIlIIIIllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlIIIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlIIlIlIIIIlIlll = lllllllllllllllIIlIIlIlIIIIllIIl.toCharArray();
        int lllllllllllllllIIlIIlIlIIIIlIllI = lllllIlIlllI[0];
        char[] charArray = lllllllllllllllIIlIIlIlIIIIllIlI2.toCharArray();
        int length = charArray.length;
        int i = lllllIlIlllI[0];
        while (lIIlIIllIlllllI(i, length)) {
            char lllllllllllllllIIlIIlIlIIIIllIll = charArray[i];
            sb.append((char) (lllllllllllllllIIlIIlIlIIIIllIll ^ lllllllllllllllIIlIIlIlIIIIlIlll[lllllllllllllllIIlIIlIlIIIIlIllI % lllllllllllllllIIlIIlIlIIIIlIlll.length]));
            "".length();
            lllllllllllllllIIlIIlIlIIIIlIllI++;
            i++;
            "".length();
            if ((-" ".length()) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    public boolean run() {
        if (!lIIlIIllIlllIlI(this.f.activity(), EnumC0000a.GEM_ROCKS) && !lIIlIIllIlllIll(Inventory.isFull() ? 1 : 0)) {
            if (!lIIlIIllIllllII(DepositBox.isOpen() ? 1 : 0)) {
                String[] strArr = new String[lllllIlIlllI[1]];
                strArr[lllllIlIlllI[0]] = lllllIlIllIl[lllllIlIlllI[1]];
                TileObject nearest = TileObjects.getNearest(strArr);
                if (lIIlIIllIllllIl(nearest)) {
                    return lllllIlIlllI[0];
                }
                nearest.interact(lllllIlIllIl[lllllIlIlllI[2]]);
                return lllllIlIlllI[1];
            }
            Widget widget = Widgets.get(WidgetInfo.DEPOSIT_BOX_INVENTORY_ITEMS_CONTAINER);
            if (lIIlIIllIlllIll(Widgets.isVisible(widget) ? 1 : 0)) {
                return lllllIlIlllI[0];
            }
            DepositBox.selectQuantityAll();
            Widget[] children = widget.getChildren();
            if (lIIlIIllIllllIl(children)) {
                return lllllIlIlllI[0];
            }
            HashSet hashSet = new HashSet();
            int length = children.length;
            int i = lllllIlIlllI[0];
            while (lIIlIIllIlllllI(i, length)) {
                Widget widget2 = children[i];
                int itemId = widget2.getItemId();
                if (lIIlIIllIllllII(v.contains(Integer.valueOf(itemId)) ? 1 : 0)) {
                    if (lIIlIIllIllllII(hashSet.contains(Integer.valueOf(itemId)) ? 1 : 0)) {
                        "".length();
                        if (0 != 0) {
                            return ((202 ^ 160) ^ (118 ^ 16)) & (((126 ^ 16) ^ (201 ^ 171)) ^ (-" ".length()));
                        }
                    } else {
                        widget2.interact(lllllIlIllIl[lllllIlIlllI[0]]);
                        hashSet.add(Integer.valueOf(itemId));
                        "".length();
                    }
                }
                i++;
                "".length();
                if ((-" ".length()) >= "   ".length()) {
                    return ((63 ^ 90) ^ (19 ^ 96)) & (((154 ^ 148) ^ (130 ^ 154)) ^ (-" ".length()));
                }
            }
            return lllllIlIlllI[1];
        }
        return lllllIlIlllI[0];
    }

    private static void lIIlIIllIlllIIl() {
        lllllIlIlllI = new int[13];
        lllllIlIlllI[0] = "   ".length() & ("   ".length() ^ (-" ".length()));
        lllllIlIlllI[1] = " ".length();
        lllllIlIlllI[2] = "  ".length();
        lllllIlIlllI[3] = (-((-2241) & 18923)) & (-6277) & 24575;
        lllllIlIlllI[4] = (-((-3619) & 16295)) & (-18473) & 32767;
        lllllIlIlllI[5] = (-14593) & 16213;
        lllllIlIlllI[6] = (-6273) & 7895;
        lllllIlIlllI[7] = (-((-4929) & 15169)) & (-4229) & 16093;
        lllllIlIlllI[8] = (-8581) & 10207;
        lllllIlIlllI[9] = (-10401) & 12029;
        lllllIlIlllI[10] = (-20769) & 22399;
        lllllIlIlllI[11] = "   ".length();
        lllllIlIlllI[12] = (22 ^ 16) ^ (167 ^ 169);
    }

    private static boolean lIIlIIllIllllIl(Object obj) {
        return obj == null;
    }

    private static void lIIlIIllIlllIII() {
        lllllIlIllIl = new String[lllllIlIlllI[11]];
        lllllIlIllIl[lllllIlIlllI[0]] = lIIlIIllIllIllI("Jyw0GQkKPWk3Fg8=", "cIDvz");
        lllllIlIllIl[lllllIlIlllI[1]] = lIIlIIllIllIllI("JiU+L1QgISArBw0wcAccATck", "dDPDt");
        lllllIlIllIl[lllllIlIlllI[2]] = lIIlIIllIllIlll("Z4qwnbwaH9w=", "fRiAV");
    }

    static {
        lIIlIIllIlllIIl();
        lIIlIIllIlllIII();
        Integer valueOf = Integer.valueOf(lllllIlIlllI[3]);
        Integer valueOf2 = Integer.valueOf(lllllIlIlllI[4]);
        Integer valueOf3 = Integer.valueOf(lllllIlIlllI[5]);
        Integer valueOf4 = Integer.valueOf(lllllIlIlllI[6]);
        Integer valueOf5 = Integer.valueOf(lllllIlIlllI[7]);
        Integer valueOf6 = Integer.valueOf(lllllIlIlllI[8]);
        Integer[] numArr = new Integer[lllllIlIlllI[2]];
        numArr[lllllIlIlllI[0]] = Integer.valueOf(lllllIlIlllI[9]);
        numArr[lllllIlIlllI[1]] = Integer.valueOf(lllllIlIlllI[10]);
        v = ImmutableSet.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, numArr);
    }

    private static boolean lIIlIIllIlllllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIIllIlllIll(int i) {
        return i == 0;
    }

    private static String lIIlIIllIllIlll(String lllllllllllllllIIlIIlIlIIIlIlIlI, String lllllllllllllllIIlIIlIlIIIlIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIlIIIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIlIIIlIlIIl.getBytes(StandardCharsets.UTF_8)), lllllIlIlllI[12]), "DES");
            Cipher lllllllllllllllIIlIIlIlIIIlIllII = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIlIIIlIllII.init(lllllIlIlllI[2], lllllllllllllllIIlIIlIlIIIlIllIl);
            return new String(lllllllllllllllIIlIIlIlIIIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIlIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIlIlIIIlIlIll) {
            lllllllllllllllIIlIIlIlIIIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllIlllIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIIlIIllIllllII(int i) {
        return i != 0;
    }
}
