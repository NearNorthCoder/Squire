/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.d;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.e;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.i;

public class k
extends e {
    private final /* synthetic */ boolean ae;
    private /* synthetic */ String af;
    private static /* synthetic */ String[] lIlIIIllIIlII;
    private static /* synthetic */ int[] lIlIIIllIIlIl;
    private final /* synthetic */ List<d> ad;

    private static boolean lIlllIIIIIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlllIIIIIlllIl(Object object) {
        return object == null;
    }

    private static boolean lIlllIIIIIllIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean a(Client client) {
        Player player = client.getLocalPlayer();
        if (k.lIlllIIIIIllIll(player) && k.lIlllIIIIIllIll(this.ad)) {
            boolean bl;
            WorldPoint worldPoint = WorldPoint.fromLocalInstance((Client)client, (LocalPoint)player.getLocalLocation());
            int n2 = this.ad.stream().anyMatch(d2 -> d2.a(worldPoint)) ? 1 : 0;
            if (k.lIlllIIIIIlllII(n2, this.ae ? 1 : 0)) {
                bl = lIlIIIllIIlIl[1];
                0;
                if (-(0x11 ^ 0x15) >= 0) {
                    return ((0xE6 ^ 0xB7) & ~(0x40 ^ 0x11)) != 0;
                }
            } else {
                bl = lIlIIIllIIlIl[0];
            }
            return bl;
        }
        return lIlIIIllIIlIl[0];
    }

    private static void lIlllIIIIIllIII() {
        lIlIIIllIIlII = new String[lIlIIIllIIlIl[1]];
        k.lIlIIIllIIlII[k.lIlIIIllIIlIl[0]] = k."";
    }

    public k(WorldPoint ... worldPointArray) {
        this.ad = Stream.of(worldPointArray).map(d::new).collect(i.x());
        this.ae = lIlIIIllIIlIl[1];
    }

    public k(String string, d d2) {
        this(string, lIlIIIllIIlIl[0], d2);
    }

    public k(boolean bl, d ... dArray) {
        this.ad = i.a(dArray);
        this.ae = bl;
    }

    private static String lIlllIIIIIlIlll(String llllllllllllllIlllIIIlIIlllllIII, String llllllllllllllIlllIIIlIIllllIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIIllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIIllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIIllllllII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIIllllllII.init(lIlIIIllIIlIl[2], llllllllllllllIlllIIIlIIllllllIl);
            return new String(llllllllllllllIlllIIIlIIllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIIlllllIll) {
            llllllllllllllIlllIIIlIIlllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIIIIIllIll(Object object) {
        return object != null;
    }

    @Override
    @Nonnull
    public String k() {
        String string;
        if (k.lIlllIIIIIlllIl(this.af)) {
            string = lIlIIIllIIlII[lIlIIIllIIlIl[0]];
            0;
            if (-(0x27 ^ 0x73 ^ (0xD6 ^ 0x86)) > 0) {
                return null;
            }
        } else {
            k llllllllllllllIlllIIIlIlIIIIIIlI;
            string = llllllllllllllIlllIIIlIlIIIIIIlI.af;
        }
        return string;
    }

    public k(d ... dArray) {
        this.ad = i.a(dArray);
        this.ae = lIlIIIllIIlIl[1];
    }

    static {
        k.lIlllIIIIIllIIl();
        k.lIlllIIIIIllIII();
    }

    private static void lIlllIIIIIllIIl() {
        lIlIIIllIIlIl = new int[3];
        k.lIlIIIllIIlIl[0] = (155 + 78 - 219 + 145 ^ 48 + 44 - -5 + 98) & (0x5C ^ 0x2A ^ (0x35 ^ 0x1F) ^ -1);
        k.lIlIIIllIIlIl[1] = 1;
        k.lIlIIIllIIlIl[2] = 2;
    }

    public k(boolean bl, WorldPoint ... worldPointArray) {
        this.ad = Stream.of(worldPointArray).map(d::new).collect(i.x());
        this.ae = bl;
    }

    public k(String string, boolean bl, d d2) {
        int n2;
        this.af = string;
        if (k.lIlllIIIIIllIlI(bl ? 1 : 0)) {
            n2 = lIlIIIllIIlIl[1];
            0;
            if (3 == 2) {
                throw null;
            }
        } else {
            n2 = lIlIIIllIIlIl[0];
        }
        this.ae = n2;
        d[] dArray = new d[lIlIIIllIIlIl[1]];
        dArray[k.lIlIIIllIIlIl[0]] = d2;
        this.ad = i.a(dArray);
    }
}

