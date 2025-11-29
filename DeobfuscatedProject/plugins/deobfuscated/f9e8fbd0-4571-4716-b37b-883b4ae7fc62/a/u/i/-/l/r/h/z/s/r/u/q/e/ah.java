/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ag;
import a.u.i.-.l.r.h.z.s.r.u.q.e.o;
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

@TaskDesc(name="Returning to Zul'Andra", priority=10, blocking=true)
public class ah
extends ag {
    private static /* synthetic */ int[] lIllIlIlllIll;
    private static /* synthetic */ String[] lIllIlIlllIlI;

    private static boolean llIIlIIIIllIllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    protected ah(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    private static void llIIlIIIIllIlIl() {
        lIllIlIlllIll = new int[5];
        ah.lIllIlIlllIll[0] = (0xBF ^ 0xAD ^ (0x2B ^ 0x6E)) & (62 + 42 - -62 + 68 ^ 172 + 127 - 154 + 44 ^ -1);
        ah.lIllIlIlllIll[1] = 1;
        ah.lIllIlIlllIll[2] = -(0xFFFFF3E1 & 0x4E5F) & (0xFFFFFFF5 & 0x6FFF);
        ah.lIllIlIlllIll[3] = 2;
        ah.lIllIlIlllIll[4] = 3;
    }

    private static String llIIlIIIIllIIll(String llllllllllllllIllIIIllIIlIllllIl, String llllllllllllllIllIIIllIIlIllllII) {
        llllllllllllllIllIIIllIIlIllllIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIIlIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIIlIlllIll = new StringBuilder();
        char[] llllllllllllllIllIIIllIIlIlllIlI = llllllllllllllIllIIIllIIlIllllII.toCharArray();
        int llllllllllllllIllIIIllIIlIlllIIl = lIllIlIlllIll[0];
        char[] llllllllllllllIllIIIllIIlIllIIll = llllllllllllllIllIIIllIIlIllllIl.toCharArray();
        int llllllllllllllIllIIIllIIlIllIIlI = llllllllllllllIllIIIllIIlIllIIll.length;
        int llllllllllllllIllIIIllIIlIllIIIl = lIllIlIlllIll[0];
        while (ah.llIIlIIIIllllII(llllllllllllllIllIIIllIIlIllIIIl, llllllllllllllIllIIIllIIlIllIIlI)) {
            char llllllllllllllIllIIIllIIlIlllllI = llllllllllllllIllIIIllIIlIllIIll[llllllllllllllIllIIIllIIlIllIIIl];
            llllllllllllllIllIIIllIIlIlllIll.append((char)(llllllllllllllIllIIIllIIlIlllllI ^ llllllllllllllIllIIIllIIlIlllIlI[llllllllllllllIllIIIllIIlIlllIIl % llllllllllllllIllIIIllIIlIlllIlI.length]));
            0;
            ++llllllllllllllIllIIIllIIlIlllIIl;
            ++llllllllllllllIllIIIllIIlIllIIIl;
            0;
            if (((0x60 ^ 0x69 ^ (0xC4 ^ 0x91)) & (0x72 ^ 0x5D ^ (0x6D ^ 0x1E) ^ -1)) == ((0xC ^ 0x15 ^ (0xC0 ^ 0x9D)) & (0x5B ^ 0x4F ^ (0x37 ^ 0x67) ^ -1))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIllIIlIlllIll);
    }

    static {
        ah.llIIlIIIIllIlIl();
        ah.llIIlIIIIllIlII();
    }

    private static boolean llIIlIIIIlllIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIIlIIIIlllIll(Object object) {
        return object == null;
    }

    private static boolean llIIlIIIIlllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIIIIllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIIIlllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static void llIIlIIIIllIlII() {
        lIllIlIlllIlI = new String[lIllIlIlllIll[4]];
        ah.lIllIlIlllIlI[ah.lIllIlIlllIll[0]] = ah."Yes";
        ah.lIllIlIlllIlI[ah.lIllIlIlllIll[1]] = ah."Read";
        ah.lIllIlIlllIlI[ah.lIllIlIlllIll[3]] = ah."Eat";
    }

    private static boolean llIIlIIIIllllII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void var3_3;
        int llllllllllllllIllIIIllIIllIIlIIl;
        int n2;
        ah llllllllllllllIllIIIllIIllIIlIll;
        int n3 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIllIlIlllIll[1]];
            stringArray[ah.lIllIlIlllIll[0]] = lIllIlIlllIlI[lIllIlIlllIll[3]];
            return item.hasAction(stringArray);
        });
        if (!ah.llIIlIIIIllIllI(n3, this.aC.multiple()) || ah.llIIlIIIIllIlll(this.aC.multiple())) {
            return lIllIlIlllIll[0];
        }
        if (!ah.llIIlIIIIllIlll(Inventory.contains(item -> item.getName().startsWith(this.aC.cure().k())) ? 1 : 0) || !ah.llIIlIIIIlllIII((Object)llllllllllllllIllIIIllIIllIIlIll.aC.cure(), (Object)o.CURE_SELF) || ah.llIIlIIIIlllIIl((Object)llllllllllllllIllIIIllIIllIIlIll.aC.cure(), (Object)o.IGNORE)) {
            n2 = lIllIlIlllIll[1];
            0;
            if (((0x3E ^ 5) & ~(0x8B ^ 0xB0)) != 0) {
                return ((0x76 ^ 0x6A) & ~(9 ^ 0x15)) != 0;
            }
        } else {
            n2 = lIllIlIlllIll[0];
        }
        if (ah.llIIlIIIIllIlll(llllllllllllllIllIIIllIIllIIlIIl = n2)) {
            return lIllIlIlllIll[0];
        }
        if (ah.llIIlIIIIlllIlI(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[lIllIlIlllIll[1]];
            stringArray[ah.lIllIlIlllIll[0]] = lIllIlIlllIlI[lIllIlIlllIll[0]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return lIllIlIlllIll[1];
        }
        int[] nArray = new int[lIllIlIlllIll[1]];
        nArray[ah.lIllIlIlllIll[0]] = lIllIlIlllIll[2];
        TileObject llllllllllllllIllIIIllIIllIIlIII = TileObjects.getNearest((int[])nArray);
        if (ah.llIIlIIIIlllIll(llllllllllllllIllIIIllIIllIIlIII)) {
            return lIllIlIlllIll[0];
        }
        var3_3.interact(lIllIlIlllIlI[lIllIlIlllIll[1]]);
        return lIllIlIlllIll[1];
    }
}

