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
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;

@TaskDesc(name="Applying Silk", priority=100)
public class ab
extends Z {
    private /* synthetic */ int cA;
    private final /* synthetic */ C cy;
    private static /* synthetic */ String[] llIIIIllIIl;
    private final /* synthetic */ SquireAutoTOA cz;
    private static /* synthetic */ int[] llIIIIllIlI;

    public boolean run() {
        ab llllllllllllllllIlIIIllIIIllIlII;
        if (ab.lIIlllIllIIIll(this.cz.e() ? 1 : 0)) {
            return llIIIIllIlI[0];
        }
        if (ab.lIIlllIllIIlII(llllllllllllllllIlIIIllIIIllIlII.aq() ? 1 : 0)) {
            return llIIIIllIlI[0];
        }
        if (!ab.lIIlllIllIIlIl(Combat.getMissingHealth(), llIIIIllIlI[1]) || ab.lIIlllIllIIlII(llllllllllllllllIlIIIllIIIllIlII.cy.al() ? 1 : 0)) {
            return llIIIIllIlI[0];
        }
        if (ab.lIIlllIllIIllI(llllllllllllllllIlIIIllIIIllIlII.cu.getTickCount() - llllllllllllllllIlIIIllIIIllIlII.cA, llIIIIllIlI[2])) {
            return llIIIIllIlI[0];
        }
        Item llllllllllllllllIlIIIllIIIllIIll = Inventory.getFirst(item -> item.getName().startsWith(llIIIIllIIl[llIIIIllIlI[3]]));
        if (ab.lIIlllIllIIlll(llllllllllllllllIlIIIllIIIllIIll)) {
            llllllllllllllllIlIIIllIIIllIIll.interact(llIIIIllIIl[llIIIIllIlI[0]]);
            llllllllllllllllIlIIIllIIIllIlII.cA = llllllllllllllllIlIIIllIIIllIlII.cu.getTickCount();
            llllllllllllllllIlIIIllIIIllIlII.cy.an();
            return llIIIIllIlI[3];
        }
        return llIIIIllIlI[0];
    }

    private static boolean lIIlllIllIIlll(Object object) {
        return object != null;
    }

    private static void lIIlllIllIIIlI() {
        llIIIIllIlI = new int[6];
        ab.llIIIIllIlI[0] = (0x77 ^ 0x32) & ~(0x37 ^ 0x72);
        ab.llIIIIllIlI[1] = 0x3C ^ 0x22;
        ab.llIIIIllIlI[2] = 79 + 5 - -21 + 61 ^ 42 + 97 - 130 + 185;
        ab.llIIIIllIlI[3] = 1;
        ab.llIIIIllIlI[4] = 2;
        ab.llIIIIllIlI[5] = 0x7F ^ 0x16 ^ (0x56 ^ 0x37);
    }

    private static boolean lIIlllIllIIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllIllIIlII(int n2) {
        return n2 == 0;
    }

    private static String lIIlllIllIIIII(String llllllllllllllllIlIIIllIIIlIlIIl, String llllllllllllllllIlIIIllIIIlIlIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIIllIIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), llIIIIllIlI[5]), "DES");
            Cipher llllllllllllllllIlIIIllIIIlIllIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIIllIIIlIllIl.init(llIIIIllIlI[4], llllllllllllllllIlIIIllIIIlIlllI);
            return new String(llllllllllllllllIlIIIllIIIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIllIIIlIllII) {
            llllllllllllllllIlIIIllIIIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected ab(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cy = c2;
        this.cz = squireAutoTOA;
    }

    static {
        ab.lIIlllIllIIIlI();
        ab.lIIlllIllIIIIl();
    }

    private static boolean lIIlllIllIIIll(int n2) {
        return n2 != 0;
    }

    private static void lIIlllIllIIIIl() {
        llIIIIllIIl = new String[llIIIIllIlI[4]];
        ab.llIIIIllIIl[ab.llIIIIllIlI[0]] = ab."Apply";
        ab.llIIIIllIIl[ab.llIIIIllIlI[3]] = ab."Silk dressing";
    }
}

