/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
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
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.c;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l;

@TaskDesc(name="Gathering rope", priority=100, blocking=true)
public class t
extends l {
    private static /* synthetic */ int[] lIIllIlllllIl;
    private static /* synthetic */ String[] lIIllIlllllII;

    @Override
    public boolean ak() {
        boolean bl;
        if (t.lIllIIIlllllIll(this.ar.r() ? 1 : 0)) {
            bl = lIIllIlllllIl[0];
            "".length();
            if ("  ".length() == 0) {
                return ((0x4B ^ 0x5F ^ (0x24 ^ 0x6D)) & (0xE7 ^ 0x9D ^ (0xB1 ^ 0x96) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIllIlllllIl[1];
        }
        return bl;
    }

    private static boolean lIllIIIllllllII(Object object) {
        return object != null;
    }

    private static void lIllIIIlllllIIl() {
        lIIllIlllllII = new String[lIIllIlllllIl[0]];
        t.lIIllIlllllII[t.lIIllIlllllIl[1]] = t.lIllIIIlllllIII("BXz7xmrWsQk=", "krLRu");
    }

    @Inject
    protected t(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIlllllIll(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIlllllIlI() {
        lIIllIlllllIl = new int[3];
        t.lIIllIlllllIl[0] = " ".length();
        t.lIIllIlllllIl[1] = (0xC1 ^ 0xAD ^ (7 ^ 0x3F)) & (85 + 181 - 253 + 197 ^ 113 + 6 - 7 + 22 ^ -" ".length());
        t.lIIllIlllllIl[2] = "  ".length();
    }

    private static String lIllIIIlllllIII(String llllllllllllllIlllIllIlIIlIlIIll, String llllllllllllllIlllIllIlIIlIlIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIlIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIlIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIlIIlIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIlIIlIlIlll.init(lIIllIlllllIl[2], llllllllllllllIlllIllIlIIlIllIII);
            return new String(llllllllllllllIlllIllIlIIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIlIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIlIIlIlIllI) {
            llllllllllllllIlllIllIlIIlIlIllI.printStackTrace();
            return null;
        }
    }

    static {
        t.lIllIIIlllllIlI();
        t.lIllIIIlllllIIl();
    }

    @Override
    public boolean al() {
        c c2 = this.ar.N();
        TileObject tileObject = c2.Q();
        if (t.lIllIIIllllllII(tileObject) && t.lIllIIIlllllIll(this.au.a((Locatable)tileObject) ? 1 : 0)) {
            tileObject.interact(lIIllIlllllII[lIIllIlllllIl[1]]);
            return lIIllIlllllIl[0];
        }
        this.au.b(c2.Y());
        "".length();
        return lIIllIlllllIl[1];
    }
}

