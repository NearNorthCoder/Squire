/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.Task;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.d;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.h;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.ItemComposition;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

public abstract class w
extends Task {
    @Inject
    protected /* synthetic */ SquireVorkathPlugin x;
    private static final /* synthetic */ int cd;
    @Inject
    protected /* synthetic */ d l;
    protected final /* synthetic */ f cg;
    private static /* synthetic */ String[] lIlIlIlIIIlll;
    private static /* synthetic */ int[] lIlIlIlIIlIII;
    protected final /* synthetic */ SquireVorkathConfig ce;
    @Inject
    protected /* synthetic */ h ch;
    protected final /* synthetic */ Client cf;

    private static void lIlllllIlIIlIIl() {
        lIlIlIlIIlIII = new int[5];
        w.lIlIlIlIIlIII[0] = (0xF2 ^ 0x8A ^ (0x16 ^ 0x2C)) & (114 + 181 - 209 + 124 ^ 137 + 1 - 80 + 86 ^ -1);
        w.lIlIlIlIIlIII[1] = 0xFFFFAF3F & 0x73FF;
        w.lIlIlIlIIlIII[2] = 1;
        w.lIlIlIlIIlIII[3] = 2;
        w.lIlIlIlIIlIII[4] = 0xF5 ^ 0xC3 ^ (0xB1 ^ 0x8F);
    }

    public boolean run() {
        int n2;
        w llllllllllllllIllIlIllIlIIIIIIII;
        if (w.lIlllllIlIIlIlI(this.cf.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIlIIlIII[0];
        }
        int[] llllllllllllllIllIlIllIIllllllll = llllllllllllllIllIlIllIlIIIIIIII.cf.getMapRegions();
        int llllllllllllllIllIlIllIIlllllllI = lIlIlIlIIlIII[0];
        int[] llllllllllllllIllIlIllIIllllllIl = llllllllllllllIllIlIllIIllllllll;
        int llllllllllllllIllIlIllIIllllllII = llllllllllllllIllIlIllIIllllllIl.length;
        int llllllllllllllIllIlIllIIlllllIll = lIlIlIlIIlIII[0];
        while (w.lIlllllIlIIlIll(llllllllllllllIllIlIllIIlllllIll, llllllllllllllIllIlIllIIllllllII)) {
            int llllllllllllllIllIlIllIIlllllIlI = llllllllllllllIllIlIllIIllllllIl[llllllllllllllIllIlIllIIlllllIll];
            if (w.lIlllllIlIIllII(llllllllllllllIllIlIllIIlllllIlI, lIlIlIlIIlIII[1])) {
                llllllllllllllIllIlIllIIlllllllI = lIlIlIlIIlIII[2];
                0;
                if (3 >= -1) break;
                return ((26 + 119 - 133 + 164 ^ 93 + 75 - 135 + 148) & (19 + 107 - 104 + 149 ^ 1 + 68 - 45 + 150 ^ -1)) != 0;
            }
            ++llllllllllllllIllIlIllIIlllllIll;
            0;
            if (2 != 3) continue;
            return ((0x31 ^ 0x56 ^ (0x4E ^ 0x72)) & (0x94 ^ 0xA8 ^ (0x53 ^ 0x34) ^ -1)) != 0;
        }
        if (w.lIlllllIlIIllIl(llllllllllllllIllIlIllIIlllllllI) && w.lIlllllIlIIllIl(llllllllllllllIllIlIllIlIIIIIIII.Q() ? 1 : 0)) {
            n2 = lIlIlIlIIlIII[2];
            0;
            if (2 >= (0x31 ^ 0x3B ^ (0xCE ^ 0xC0))) {
                return ((14 + 71 - 26 + 68 ^ (0x11 ^ 0x6B)) & (67 + 63 - 126 + 170 ^ 33 + 160 - 160 + 138 ^ -1)) != 0;
            }
        } else {
            n2 = lIlIlIlIIlIII[0];
        }
        return n2 != 0;
    }

    private static boolean lIlllllIlIIllII(int n2, int n3) {
        return n2 == n3;
    }

    protected boolean V() {
        int n2 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIlIlIlIIlIII[2]];
            stringArray[w.lIlIlIlIIlIII[0]] = lIlIlIlIIIlll[lIlIlIlIIlIII[2]];
            return item.hasAction(stringArray);
        }) + TileItems.getAll(this::a).size();
        if (w.lIlllllIlIIlIll(n2, this.ce.multiple())) {
            return lIlIlIlIIlIII[0];
        }
        return lIlIlIlIIlIII[2];
    }

    private static boolean lIlllllIlIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllllIlIIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(TileItem tileItem) {
        void llllllllllllllIllIlIllIIlllIllII;
        ItemComposition itemComposition = this.cf.getItemComposition(tileItem.getId());
        if (w.lIlllllIlIIlllI(itemComposition)) {
            return lIlIlIlIIlIII[0];
        }
        if (w.lIlllllIlIIlllI(llllllllllllllIllIlIllIIlllIllII.getInventoryActions())) {
            return lIlIlIlIIlIII[0];
        }
        String[] llllllllllllllIllIlIllIIlllIlIll = llllllllllllllIllIlIllIIlllIllII.getInventoryActions();
        int llllllllllllllIllIlIllIIlllIlIlI = llllllllllllllIllIlIllIIlllIlIll.length;
        int llllllllllllllIllIlIllIIlllIlIIl = lIlIlIlIIlIII[0];
        while (w.lIlllllIlIIlIll(llllllllllllllIllIlIllIIlllIlIIl, llllllllllllllIllIlIllIIlllIlIlI)) {
            String llllllllllllllIllIlIllIIlllIlIII = llllllllllllllIllIlIllIIlllIlIll[llllllllllllllIllIlIllIIlllIlIIl];
            if (w.lIlllllIlIIllIl(lIlIlIlIIIlll[lIlIlIlIIlIII[0]].equals(llllllllllllllIllIlIllIIlllIlIII) ? 1 : 0)) {
                return lIlIlIlIIlIII[2];
            }
            ++llllllllllllllIllIlIllIIlllIlIIl;
            0;
            if (null == null) continue;
            return ((0x95 ^ 0xAA) & ~(0x3F ^ 0)) != 0;
        }
        return lIlIlIlIIlIII[0];
    }

    public abstract boolean Q();

    private static String lIlllllIlIIIlll(String llllllllllllllIllIlIllIIllIIIllI, String llllllllllllllIllIlIllIIllIIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIIllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIlIII[4]), "DES");
            Cipher llllllllllllllIllIlIllIIllIIlIlI = Cipher.getInstance("DES");
            llllllllllllllIllIlIllIIllIIlIlI.init(lIlIlIlIIlIII[3], llllllllllllllIllIlIllIIllIIlIll);
            return new String(llllllllllllllIllIlIllIIllIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIIllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllIIllIIlIIl) {
            llllllllllllllIllIlIllIIllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlllllIlIIlIII() {
        lIlIlIlIIIlll = new String[lIlIlIlIIlIII[3]];
        w.lIlIlIlIIIlll[w.lIlIlIlIIlIII[0]] = w."Eat";
        w.lIlIlIlIIIlll[w.lIlIlIlIIlIII[2]] = w."Eat";
    }

    private static String lIlllllIlIIIllI(String llllllllllllllIllIlIllIIllIlllIl, String llllllllllllllIllIlIllIIllIlIlll) {
        llllllllllllllIllIlIllIIllIlllIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllIIllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIllIIllIllIll = new StringBuilder();
        char[] llllllllllllllIllIlIllIIllIllIlI = llllllllllllllIllIlIllIIllIlIlll.toCharArray();
        int llllllllllllllIllIlIllIIllIllIIl = lIlIlIlIIlIII[0];
        char[] llllllllllllllIllIlIllIIllIlIIll = llllllllllllllIllIlIllIIllIlllIl.toCharArray();
        int llllllllllllllIllIlIllIIllIlIIlI = llllllllllllllIllIlIllIIllIlIIll.length;
        int llllllllllllllIllIlIllIIllIlIIIl = lIlIlIlIIlIII[0];
        while (w.lIlllllIlIIlIll(llllllllllllllIllIlIllIIllIlIIIl, llllllllllllllIllIlIllIIllIlIIlI)) {
            char llllllllllllllIllIlIllIIllIllllI = llllllllllllllIllIlIllIIllIlIIll[llllllllllllllIllIlIllIIllIlIIIl];
            llllllllllllllIllIlIllIIllIllIll.append((char)(llllllllllllllIllIlIllIIllIllllI ^ llllllllllllllIllIlIllIIllIllIlI[llllllllllllllIllIlIllIIllIllIIl % llllllllllllllIllIlIllIIllIllIlI.length]));
            0;
            ++llllllllllllllIllIlIllIIllIllIIl;
            ++llllllllllllllIllIlIllIIllIlIIIl;
            0;
            if (3 >= 2) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIllIIllIllIll);
    }

    private static boolean lIlllllIlIIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlllllIlIIllIl(int n2) {
        return n2 != 0;
    }

    @Inject
    protected w(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        this.cf = client;
        this.ce = squireVorkathConfig;
        this.cg = f2;
    }

    static {
        w.lIlllllIlIIlIIl();
        w.lIlllllIlIIlIII();
        cd = lIlIlIlIIlIII[1];
    }
}

