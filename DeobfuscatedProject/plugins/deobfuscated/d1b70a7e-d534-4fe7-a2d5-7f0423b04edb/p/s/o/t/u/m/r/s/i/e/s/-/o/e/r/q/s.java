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

@TaskDesc(name="Gathering harpoon", priority=100, blocking=true)
public class s
extends l {
    private static /* synthetic */ String[] lIIllIllIIIlI;
    private static /* synthetic */ int[] lIIllIllIlIlI;

    @Override
    public boolean ak() {
        boolean bl;
        if (s.lIllIIIlIlIIIIl(this.ar.m() ? 1 : 0)) {
            bl = lIIllIllIlIlI[0];
            0;
            if (-(0x9E ^ 0x9A) >= 0) {
                return ((0x68 ^ 0x79) & ~(0xA0 ^ 0xB1)) != 0;
            }
        } else {
            bl = lIIllIllIlIlI[1];
        }
        return bl;
    }

    private static boolean lIllIIIlIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        s llllllllllllllIlllIlllIIllllllll;
        int n2 = Inventory.getCount(item -> item.getName().toLowerCase().endsWith(lIIllIllIIIlI[lIIllIllIlIlI[3]]));
        if (s.lIllIIIlIlIIIlI(n2, lIIllIllIlIlI[0])) {
            int[] nArray = new int[lIIllIllIlIlI[0]];
            nArray[s.lIIllIllIlIlI[1]] = lIIllIllIlIlI[2];
            Inventory.getFirst((int[])nArray).interact(lIIllIllIIIlI[lIIllIllIlIlI[1]]);
            return lIIllIllIlIlI[0];
        }
        c llllllllllllllIlllIlllIIllllllIl = llllllllllllllIlllIlllIIllllllll.ar.N();
        TileObject llllllllllllllIlllIlllIIllllllII = llllllllllllllIlllIlllIIllllllIl.S();
        if (s.lIllIIIlIlIIIll(llllllllllllllIlllIlllIIllllllII) && s.lIllIIIlIlIIIIl(llllllllllllllIlllIlllIIllllllll.au.a((Locatable)llllllllllllllIlllIlllIIllllllII) ? 1 : 0)) {
            llllllllllllllIlllIlllIIllllllII.interact(lIIllIllIIIlI[lIIllIllIlIlI[0]]);
            return lIIllIllIlIlI[0];
        }
        this.au.b(var2_2.Y());
        0;
        return lIIllIllIlIlI[0];
    }

    private static void lIllIIIlIlIIIII() {
        lIIllIllIlIlI = new int[5];
        s.lIIllIllIlIlI[0] = 1;
        s.lIIllIllIlIlI[1] = (138 + 58 - 138 + 83 ^ 10 + 26 - -112 + 2) & (0x38 ^ 0x4A ^ (0xC4 ^ 0xAD) ^ -1);
        s.lIIllIllIlIlI[2] = 0xFFFFEFBF & 0x1177;
        s.lIIllIllIlIlI[3] = 2;
        s.lIIllIllIlIlI[4] = 3;
    }

    @Inject
    protected s(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static void lIllIIIlIIlllll() {
        lIIllIllIIIlI = new String[lIIllIllIlIlI[4]];
        s.lIIllIllIIIlI[s.lIIllIllIlIlI[1]] = s."Drop";
        s.lIIllIllIIIlI[s.lIIllIllIlIlI[0]] = s."Take";
        s.lIIllIllIIIlI[s.lIIllIllIlIlI[3]] = s."harpoon";
    }

    private static boolean lIllIIIlIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIlIIIll(Object object) {
        return object != null;
    }

    static {
        s.lIllIIIlIlIIIII();
        s.lIllIIIlIIlllll();
    }

    private static boolean lIllIIIlIlIIIIl(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIlIIIlIIl(String llllllllllllllIlllIlllIIllllIlII, String llllllllllllllIlllIlllIIllllIIll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIIllllIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIIllllIllI.init(lIIllIllIlIlI[3], llllllllllllllIlllIlllIIllllIlll);
            return new String(llllllllllllllIlllIlllIIllllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIIllllIlIl) {
            llllllllllllllIlllIlllIIllllIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIIllllI(String llllllllllllllIlllIlllIIlllIIlII, String llllllllllllllIlllIlllIIllIllllI) {
        llllllllllllllIlllIlllIIlllIIlII = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIIlllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIIlllIIIlI = new StringBuilder();
        char[] llllllllllllllIlllIlllIIlllIIIIl = llllllllllllllIlllIlllIIllIllllI.toCharArray();
        int llllllllllllllIlllIlllIIlllIIIII = lIIllIllIlIlI[1];
        char[] llllllllllllllIlllIlllIIllIllIlI = llllllllllllllIlllIlllIIlllIIlII.toCharArray();
        int llllllllllllllIlllIlllIIllIllIIl = llllllllllllllIlllIlllIIllIllIlI.length;
        int llllllllllllllIlllIlllIIllIllIII = lIIllIllIlIlI[1];
        while (s.lIllIIIlIlIIlII(llllllllllllllIlllIlllIIllIllIII, llllllllllllllIlllIlllIIllIllIIl)) {
            char llllllllllllllIlllIlllIIlllIIlIl = llllllllllllllIlllIlllIIllIllIlI[llllllllllllllIlllIlllIIllIllIII];
            llllllllllllllIlllIlllIIlllIIIlI.append((char)(llllllllllllllIlllIlllIIlllIIlIl ^ llllllllllllllIlllIlllIIlllIIIIl[llllllllllllllIlllIlllIIlllIIIII % llllllllllllllIlllIlllIIlllIIIIl.length]));
            0;
            ++llllllllllllllIlllIlllIIlllIIIII;
            ++llllllllllllllIlllIlllIIllIllIII;
            0;
            if (((0x5A ^ 0x68) & ~(0x40 ^ 0x72)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllIIlllIIIlI);
    }
}

