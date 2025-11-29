/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l;

@TaskDesc(name="Gathering hammer", priority=100, blocking=true)
public class r
extends l {
    private static /* synthetic */ String[] lIIllIllllllI;
    private static /* synthetic */ int[] lIIllIlllllll;

    @Override
    public boolean ak() {
        boolean bl;
        if (r.lIllIIlIIIIIIIl(this.ar.t() ? 1 : 0)) {
            bl = lIIllIlllllll[0];
            "".length();
            if ((0xAA ^ 0x9F ^ (0x26 ^ 0x17)) == ((0xC3 ^ 0x9A ^ (0x44 ^ 0xA)) & (10 + 136 - 101 + 111 ^ 5 + 79 - 77 + 132 ^ -" ".length()))) {
                return ((0x90 ^ 0xB0 ^ (0x1D ^ 2)) & (0x95 ^ 0x8F ^ (0x3D ^ 0x18) ^ -" ".length()) & ((0x24 ^ 0x3D ^ (0x14 ^ 0x55)) & (221 + 101 - 293 + 210 ^ 128 + 20 - 70 + 105 ^ -" ".length()) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIllIlllllll[1];
        }
        return bl;
    }

    private static boolean lIllIIlIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected r(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static void lIllIIIllllllll() {
        lIIllIllllllI = new String[lIIllIlllllll[3]];
        r.lIIllIllllllI[r.lIIllIlllllll[1]] = r.lIllIIIllllllIl("6nNjmTGJJ/4=", "MBRHN");
        r.lIIllIllllllI[r.lIIllIlllllll[0]] = r.lIllIIIlllllllI("GwUnHA==", "OdLyy");
    }

    private static boolean lIllIIlIIIIIIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        r llllllllllllllIlllIllIlIIlIIIlIl;
        int[] nArray = new int[lIIllIlllllll[0]];
        nArray[r.lIIllIlllllll[1]] = lIIllIlllllll[2];
        int n2 = Inventory.getCount((int[])nArray);
        if (r.lIllIIlIIIIIIlI(n2, lIIllIlllllll[0])) {
            int[] nArray2 = new int[lIIllIlllllll[0]];
            nArray2[r.lIIllIlllllll[1]] = lIIllIlllllll[2];
            Inventory.getFirst((int[])nArray2).interact(lIIllIllllllI[lIIllIlllllll[1]]);
            return lIIllIlllllll[0];
        }
        c llllllllllllllIlllIllIlIIlIIIIll = llllllllllllllIlllIllIlIIlIIIlIl.ar.N();
        TileObject llllllllllllllIlllIllIlIIlIIIIlI = llllllllllllllIlllIllIlIIlIIIIll.R();
        if (r.lIllIIlIIIIIIll(llllllllllllllIlllIllIlIIlIIIIlI) && r.lIllIIlIIIIIIIl(llllllllllllllIlllIllIlIIlIIIlIl.au.a((Locatable)llllllllllllllIlllIllIlIIlIIIIlI) ? 1 : 0)) {
            llllllllllllllIlllIllIlIIlIIIIlI.interact(lIIllIllllllI[lIIllIlllllll[0]]);
            return lIIllIlllllll[0];
        }
        this.au.b(var2_2.Y());
        "".length();
        return lIIllIlllllll[1];
    }

    private static String lIllIIIllllllIl(String llllllllllllllIlllIllIlIIIlIIIlI, String llllllllllllllIlllIllIlIIIIlllll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIIIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIIIIlllll.getBytes(StandardCharsets.UTF_8)), lIIllIlllllll[4]), "DES");
            Cipher llllllllllllllIlllIllIlIIIlIIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIllIlIIIlIIlII.init(lIIllIlllllll[3], llllllllllllllIlllIllIlIIIlIIlIl);
            return new String(llllllllllllllIlllIllIlIIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlIIIlIIIll) {
            llllllllllllllIlllIllIlIIIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlllllllI(String llllllllllllllIlllIllIlIIIllIIlI, String llllllllllllllIlllIllIlIIIllIllI) {
        llllllllllllllIlllIllIlIIIllIIlI = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIlIIIllIlIl = new StringBuilder();
        char[] llllllllllllllIlllIllIlIIIllIlII = llllllllllllllIlllIllIlIIIllIllI.toCharArray();
        int llllllllllllllIlllIllIlIIIllIIll = lIIllIlllllll[1];
        char[] llllllllllllllIlllIllIlIIIlIllIl = llllllllllllllIlllIllIlIIIllIIlI.toCharArray();
        int llllllllllllllIlllIllIlIIIlIllII = llllllllllllllIlllIllIlIIIlIllIl.length;
        int llllllllllllllIlllIllIlIIIlIlIll = lIIllIlllllll[1];
        while (r.lIllIIlIIIIIlII(llllllllllllllIlllIllIlIIIlIlIll, llllllllllllllIlllIllIlIIIlIllII)) {
            char llllllllllllllIlllIllIlIIIlllIII = llllllllllllllIlllIllIlIIIlIllIl[llllllllllllllIlllIllIlIIIlIlIll];
            llllllllllllllIlllIllIlIIIllIlIl.append((char)(llllllllllllllIlllIllIlIIIlllIII ^ llllllllllllllIlllIllIlIIIllIlII[llllllllllllllIlllIllIlIIIllIIll % llllllllllllllIlllIllIlIIIllIlII.length]));
            "".length();
            ++llllllllllllllIlllIllIlIIIllIIll;
            ++llllllllllllllIlllIllIlIIIlIlIll;
            "".length();
            if (-" ".length() <= "   ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIlIIIllIlIl);
    }

    private static boolean lIllIIlIIIIIIIl(int n2) {
        return n2 == 0;
    }

    static {
        r.lIllIIlIIIIIIII();
        r.lIllIIIllllllll();
    }

    private static void lIllIIlIIIIIIII() {
        lIIllIlllllll = new int[5];
        r.lIIllIlllllll[0] = " ".length();
        r.lIIllIlllllll[1] = (0xB9 ^ 0x8B) & ~(0x99 ^ 0xAB);
        r.lIIllIlllllll[2] = 0xFFFF8F6F & 0x79BB;
        r.lIIllIlllllll[3] = "  ".length();
        r.lIIllIlllllll[4] = 13 + 8 - -23 + 109 ^ 6 + 39 - 13 + 113;
    }

    private static boolean lIllIIlIIIIIIlI(int n2, int n3) {
        return n2 > n3;
    }
}

