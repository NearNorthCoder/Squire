/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

@TaskDesc(name="Drinking Ambrosia", priority=105)
public class ad
extends Z {
    private final /* synthetic */ C cE;
    private static /* synthetic */ String[] llIIllIllII;
    private static /* synthetic */ int[] llIIllIllIl;
    private final /* synthetic */ SquireAutoTOA cF;

    static {
        ad.lIlIIIlIllllIl();
        ad.lIlIIIlIllllII();
    }

    private static boolean lIlIIIllIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected ad(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cE = c2;
        this.cF = squireAutoTOA;
    }

    private static boolean lIlIIIllIIIIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIIIlIlllllI(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIlIllllIl() {
        llIIllIllIl = new int[5];
        ad.llIIllIllIl[0] = (0x23 ^ 0x79 ^ (0xAB ^ 0xB3)) & (0xB8 ^ 0x97 ^ (0x44 ^ 0x29) ^ -" ".length());
        ad.llIIllIllIl[1] = 0x18 ^ 0x12 ^ (0x7D ^ 0x63);
        ad.llIIllIllIl[2] = 0x1E ^ 0x66 ^ (0x47 ^ 0x12);
        ad.llIIllIllIl[3] = 0x94 ^ 0xA6;
        ad.llIIllIllIl[4] = " ".length();
    }

    private static String lIlIIIlIlllIll(String llllllllllllllllIIlllIllIllIIIlI, String llllllllllllllllIIlllIllIllIIllI) {
        llllllllllllllllIIlllIllIllIIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIllIllIIlIl = new StringBuilder();
        char[] llllllllllllllllIIlllIllIllIIlII = llllllllllllllllIIlllIllIllIIllI.toCharArray();
        int llllllllllllllllIIlllIllIllIIIll = llIIllIllIl[0];
        char[] llllllllllllllllIIlllIllIlIlllIl = llllllllllllllllIIlllIllIllIIIlI.toCharArray();
        int llllllllllllllllIIlllIllIlIlllII = llllllllllllllllIIlllIllIlIlllIl.length;
        int llllllllllllllllIIlllIllIlIllIll = llIIllIllIl[0];
        while (ad.lIlIIIllIIIIlI(llllllllllllllllIIlllIllIlIllIll, llllllllllllllllIIlllIllIlIlllII)) {
            char llllllllllllllllIIlllIllIllIlIII = llllllllllllllllIIlllIllIlIlllIl[llllllllllllllllIIlllIllIlIllIll];
            llllllllllllllllIIlllIllIllIIlIl.append((char)(llllllllllllllllIIlllIllIllIlIII ^ llllllllllllllllIIlllIllIllIIlII[llllllllllllllllIIlllIllIllIIIll % llllllllllllllllIIlllIllIllIIlII.length]));
            "".length();
            ++llllllllllllllllIIlllIllIllIIIll;
            ++llllllllllllllllIIlllIllIlIllIll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIllIllIIlIl);
    }

    private static boolean lIlIIIllIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIllllll(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIlIllllII() {
        llIIllIllII = new String[llIIllIllIl[4]];
        ad.llIIllIllII[ad.llIIllIllIl[0]] = ad.lIlIIIlIlllIll("ABk8NwE=", "DkUYj");
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        int llllllllllllllllIIlllIllIlllIIll;
        int n2;
        ad llllllllllllllllIIlllIllIlllIlII;
        if (ad.lIlIIIlIlllllI(this.cF.e() ? 1 : 0)) {
            return llIIllIllIl[0];
        }
        if (ad.lIlIIIlIllllll(llllllllllllllllIIlllIllIlllIlII.aq() ? 1 : 0)) {
            return llIIllIllIl[0];
        }
        if (ad.lIlIIIlIllllll(llllllllllllllllIIlllIllIlllIlII.cE.am() ? 1 : 0)) {
            return llIIllIllIl[0];
        }
        if (ad.lIlIIIlIlllllI(Inventory.contains(item -> e.NECTAR.d(item.getId())) ? 1 : 0)) {
            n2 = llIIllIllIl[1];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ("   ".length() & ~"   ".length()) != 0;
            }
        } else {
            n2 = llllllllllllllllIIlllIllIlllIIll = llIIllIllIl[2];
        }
        if (ad.lIlIIIlIlllllI(llllllllllllllllIIlllIllIlllIlII.bf() ? 1 : 0)) {
            llllllllllllllllIIlllIllIlllIIll = llIIllIllIl[3];
        }
        if (ad.lIlIIIllIIIIII(Combat.getCurrentHealth(), llllllllllllllllIIlllIllIlllIIll)) {
            return llIIllIllIl[0];
        }
        Item llllllllllllllllIIlllIllIlllIIlI = Inventory.getFirst(item -> e.AMBROSIA.d(item.getId()));
        if (ad.lIlIIIllIIIIIl(llllllllllllllllIIlllIllIlllIIlI)) {
            return llIIllIllIl[0];
        }
        var2_2.interact(llIIllIllII[llIIllIllIl[0]]);
        this.cE.ao();
        return llIIllIllIl[4];
    }
}

