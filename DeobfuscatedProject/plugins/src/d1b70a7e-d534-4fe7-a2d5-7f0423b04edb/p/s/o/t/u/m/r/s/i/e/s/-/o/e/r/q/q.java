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

@TaskDesc(name="Gathering buckets", priority=100, blocking=true)
public class q
extends l {
    private static /* synthetic */ int[] lIIllIllIllII;
    private static /* synthetic */ String[] lIIllIllIlIll;

    private static void lIllIIIlIlIIlll() {
        lIIllIllIlIll = new String[lIIllIllIllII[3]];
        q.lIIllIllIlIll[q.lIIllIllIllII[1]] = q.lIllIIIlIlIIlIl("G0KG2zU9f6Q=", "SPaBS");
        q.lIIllIllIlIll[q.lIIllIllIllII[0]] = q.lIllIIIlIlIIlIl("YnqwO2WzvlA=", "aenzS");
        q.lIIllIllIlIll[q.lIIllIllIllII[2]] = q.lIllIIIlIlIIllI("FSAGIBQj", "WUeKq");
    }

    private static boolean lIllIIIlIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIlIlIllII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIlIlIlIII() {
        lIIllIllIllII = new int[4];
        q.lIIllIllIllII[0] = " ".length();
        q.lIIllIllIllII[1] = (59 + 114 - -9 + 17 ^ 18 + 89 - 70 + 128) & (0x5B ^ 0x68 ^ (0x2C ^ 0x7D) ^ -" ".length());
        q.lIIllIllIllII[2] = "  ".length();
        q.lIIllIllIllII[3] = "   ".length();
    }

    private static String lIllIIIlIlIIlIl(String llllllllllllllIlllIlllIIlIlllIIl, String llllllllllllllIlllIlllIIlIlllIII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIlIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIlIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIIlIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIIlIllllIl.init(lIIllIllIllII[2], llllllllllllllIlllIlllIIlIlllllI);
            return new String(llllllllllllllIlllIlllIIlIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIIlIllllII) {
            llllllllllllllIlllIlllIIlIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIlIlIll(Object object) {
        return object != null;
    }

    @Override
    public boolean ak() {
        boolean bl;
        if (q.lIllIIIlIlIlIIl(this.ar.p(), this.as.numberOfBuckets())) {
            bl = lIIllIllIllII[0];
            "".length();
            if (" ".length() <= ((0x6B ^ 0x67) & ~(0x44 ^ 0x48))) {
                return ((0x8C ^ 0x96) & ~(0x24 ^ 0x3E)) != 0;
            }
        } else {
            bl = lIIllIllIllII[1];
        }
        return bl;
    }

    @Inject
    protected q(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIlIlIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean al() {
        q llllllllllllllIlllIlllIIllIIIlIl;
        if (q.lIllIIIlIlIlIlI(this.ar.p(), this.as.numberOfBuckets())) {
            Inventory.getFirst(item -> item.getName().contains(lIIllIllIlIll[lIIllIllIllII[2]])).interact(lIIllIllIlIll[lIIllIllIllII[1]]);
            return lIIllIllIllII[0];
        }
        c llllllllllllllIlllIlllIIllIIIlII = llllllllllllllIlllIlllIIllIIIlIl.ar.N();
        TileObject llllllllllllllIlllIlllIIllIIIIll = llllllllllllllIlllIlllIIllIIIlII.O();
        if (q.lIllIIIlIlIlIll(llllllllllllllIlllIlllIIllIIIIll) && q.lIllIIIlIlIllII(llllllllllllllIlllIlllIIllIIIlIl.au.a((Locatable)llllllllllllllIlllIlllIIllIIIIll) ? 1 : 0)) {
            llllllllllllllIlllIlllIIllIIIIll.interact(lIIllIllIlIll[lIIllIllIllII[0]]);
            "".length();
            if ("   ".length() == 0) {
                return ((0xA1 ^ 0x89) & ~(0x78 ^ 0x50)) != 0;
            }
        } else {
            llllllllllllllIlllIlllIIllIIIlIl.au.b(llllllllllllllIlllIlllIIllIIIlII.aa());
            "".length();
        }
        return lIIllIllIllII[0];
    }

    static {
        q.lIllIIIlIlIlIII();
        q.lIllIIIlIlIIlll();
    }

    private static String lIllIIIlIlIIllI(String llllllllllllllIlllIlllIIlIlIlIll, String llllllllllllllIlllIlllIIlIlIlIlI) {
        llllllllllllllIlllIlllIIlIlIlIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIIlIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIIlIlIlIIl = new StringBuilder();
        char[] llllllllllllllIlllIlllIIlIlIlIII = llllllllllllllIlllIlllIIlIlIlIlI.toCharArray();
        int llllllllllllllIlllIlllIIlIlIIlll = lIIllIllIllII[1];
        char[] llllllllllllllIlllIlllIIlIlIIIIl = llllllllllllllIlllIlllIIlIlIlIll.toCharArray();
        int llllllllllllllIlllIlllIIlIlIIIII = llllllllllllllIlllIlllIIlIlIIIIl.length;
        int llllllllllllllIlllIlllIIlIIlllll = lIIllIllIllII[1];
        while (q.lIllIIIlIlIllIl(llllllllllllllIlllIlllIIlIIlllll, llllllllllllllIlllIlllIIlIlIIIII)) {
            char llllllllllllllIlllIlllIIlIlIllII = llllllllllllllIlllIlllIIlIlIIIIl[llllllllllllllIlllIlllIIlIIlllll];
            llllllllllllllIlllIlllIIlIlIlIIl.append((char)(llllllllllllllIlllIlllIIlIlIllII ^ llllllllllllllIlllIlllIIlIlIlIII[llllllllllllllIlllIlllIIlIlIIlll % llllllllllllllIlllIlllIIlIlIlIII.length]));
            "".length();
            ++llllllllllllllIlllIlllIIlIlIIlll;
            ++llllllllllllllIlllIlllIIlIIlllll;
            "".length();
            if ("  ".length() <= "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllIIlIlIlIIl);
    }

    private static boolean lIllIIIlIlIllIl(int n2, int n3) {
        return n2 < n3;
    }
}

