package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Returning to Zul'Andra", priority = 10, blocking = true)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.ah  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/ah.class */
public class ah extends ag {
    private static /* synthetic */ int[] lIllIlIlllIll;
    private static /* synthetic */ String[] lIllIlIlllIlI;

    private static boolean llIIlIIIIllIllI(int i, int i2) {
        return i >= i2;
    }

    @Inject
    protected ah(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    private static void llIIlIIIIllIlIl() {
        lIllIlIlllIll = new int[5];
        lIllIlIlllIll[0] = ((191 ^ 173) ^ (43 ^ 110)) & (((((62 + 42) - (-62)) + 68) ^ (((172 + 127) - 154) + 44)) ^ (-" ".length()));
        lIllIlIlllIll[1] = " ".length();
        lIllIlIlllIll[2] = (-((-3103) & 20063)) & (-11) & 28671;
        lIllIlIlllIll[3] = "  ".length();
        lIllIlIlllIll[4] = "   ".length();
    }

    private static String llIIlIIIIllIIll(String llllllllllllllIllIIIllIIlIllllIl, String llllllllllllllIllIIIllIIlIllllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIIlIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIIlIlllIll = new StringBuilder();
        char[] llllllllllllllIllIIIllIIlIlllIlI = llllllllllllllIllIIIllIIlIllllII.toCharArray();
        int llllllllllllllIllIIIllIIlIlllIIl = lIllIlIlllIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIlIlllIll[0];
        while (llIIlIIIIllllII(i, length)) {
            char llllllllllllllIllIIIllIIlIlllllI = charArray[i];
            llllllllllllllIllIIIllIIlIlllIll.append((char) (llllllllllllllIllIIIllIIlIlllllI ^ llllllllllllllIllIIIllIIlIlllIlI[llllllllllllllIllIIIllIIlIlllIIl % llllllllllllllIllIIIllIIlIlllIlI.length]));
            "".length();
            llllllllllllllIllIIIllIIlIlllIIl++;
            i++;
            "".length();
            if ((((96 ^ 105) ^ (196 ^ 145)) & (((114 ^ 93) ^ (109 ^ 30)) ^ (-" ".length()))) != (((12 ^ 21) ^ (192 ^ 157)) & (((91 ^ 79) ^ (55 ^ 103)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIllIIlIlllIll);
    }

    static {
        llIIlIIIIllIlIl();
        llIIlIIIIllIlII();
    }

    private static boolean llIIlIIIIlllIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llIIlIIIIlllIll(Object obj) {
        return obj == null;
    }

    private static boolean llIIlIIIIlllIlI(int i) {
        return i != 0;
    }

    private static boolean llIIlIIIIllIlll(int i) {
        return i == 0;
    }

    private static boolean llIIlIIIIlllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void llIIlIIIIllIlII() {
        lIllIlIlllIlI = new String[lIllIlIlllIll[4]];
        lIllIlIlllIlI[lIllIlIlllIll[0]] = llIIlIIIIllIIll("ICAH", "yEtdE");
        lIllIlIlllIlI[lIllIlIlllIll[1]] = llIIlIIIIllIIll("JTcILQ==", "wRiIX");
        lIllIlIlllIlI[lIllIlIlllIll[3]] = llIIlIIIIllIIll("KgwE", "ompDL");
    }

    private static boolean llIIlIIIIllllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ag
    public boolean ac() {
        int i;
        if (!llIIlIIIIllIllI(Inventory.getCount(item -> {
            String[] strArr = new String[lIllIlIlllIll[1]];
            strArr[lIllIlIlllIll[0]] = lIllIlIlllIlI[lIllIlIlllIll[3]];
            return item.hasAction(strArr);
        }), this.aC.multiple()) || llIIlIIIIllIlll(this.aC.multiple())) {
            return lIllIlIlllIll[0];
        }
        if (llIIlIIIIllIlll(Inventory.contains(item2 -> {
            return item2.getName().startsWith(this.aC.cure().k());
        }) ? 1 : 0) && llIIlIIIIlllIII(this.aC.cure(), EnumC0014o.CURE_SELF) && !llIIlIIIIlllIIl(this.aC.cure(), EnumC0014o.IGNORE)) {
            i = lIllIlIlllIll[0];
        } else {
            i = lIllIlIlllIll[1];
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (llIIlIIIIllIlll(i)) {
            return lIllIlIlllIll[0];
        }
        if (llIIlIIIIlllIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr = new String[lIllIlIlllIll[1]];
            strArr[lIllIlIlllIll[0]] = lIllIlIlllIlI[lIllIlIlllIll[0]];
            Dialog.chooseOption(strArr);
            "".length();
            return lIllIlIlllIll[1];
        }
        int[] iArr = new int[lIllIlIlllIll[1]];
        iArr[lIllIlIlllIll[0]] = lIllIlIlllIll[2];
        TileObject nearest = TileObjects.getNearest(iArr);
        if (llIIlIIIIlllIll(nearest)) {
            return lIllIlIlllIll[0];
        }
        nearest.interact(lIllIlIlllIlI[lIllIlIlllIll[1]]);
        return lIllIlIlllIll[1];
    }
}
