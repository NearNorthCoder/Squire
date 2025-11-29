/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.a;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;

@TaskDesc(name="Attack Boss", priority=4000, blocking=true)
public class u
extends a {
    private /* synthetic */ List<Widget> ap;
    private static /* synthetic */ int[] lIlIlIlIIIIII;
    private static /* synthetic */ int ao;
    private static /* synthetic */ String[] lIlIlIIllllll;

    private static boolean lIlllllIIllIIIl(Object object) {
        return object != null;
    }

    private static String lIlllllIIlIllII(String llllllllllllllIllIlIllIllIlIllIl, String llllllllllllllIllIlIllIllIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIlIIIIII[4]), "DES");
            Cipher llllllllllllllIllIlIllIllIlIllll = Cipher.getInstance("DES");
            llllllllllllllIllIlIllIllIlIllll.init(lIlIlIlIIIIII[3], llllllllllllllIllIlIllIllIllIIII);
            return new String(llllllllllllllIllIlIllIllIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllIllIlIlllI) {
            llllllllllllllIllIlIllIllIlIlllI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean l() {
        int llllllllllllllIllIlIllIllIllIlIl;
        int n2;
        u llllllllllllllIllIlIllIllIllIlll;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIII(this.z ? 1 : 0)) {
            return lIlIlIlIIIIII[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIII(llllllllllllllIllIlIllIllIllIlll.x.getWorldLocation().equals((Object)p) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIII(llllllllllllllIllIlIllIllIllIlll.x.getWorldLocation().equals((Object)q) ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIII(llllllllllllllIllIlIllIllIllIlll.x.getWorldLocation().equals((Object)r) ? 1 : 0)) {
            return lIlIlIlIIIIII[0];
        }
        Actor llllllllllllllIllIlIllIllIllIllI = Players.getLocal().getInteracting();
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIIl(llllllllllllllIllIlIllIllIllIllI) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIlI(llllllllllllllIllIlIllIllIllIllI.hasAction(lIlIlIIllllll[lIlIlIlIIIIII[0]]::equals) ? 1 : 0)) {
            n2 = lIlIlIlIIIIII[1];
            "".length();
            if (" ".length() <= ((0x82 ^ 0xB1) & ~(0x68 ^ 0x5B))) {
                return ((0xB0 ^ 0x8F) & ~(0xB2 ^ 0x8D)) != 0;
            }
        } else {
            n2 = lIlIlIlIIIIII[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIlI(llllllllllllllIllIlIllIllIllIlIl = n2)) {
            return lIlIlIlIIIIII[0];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIlI(llllllllllllllIllIlIllIllIllIlll.y.getWorldArea().getMeleeTiles(llllllllllllllIllIlIllIllIllIlll.w).contains(llllllllllllllIllIlIllIllIllIlll.x.getWorldLocation()) ? 1 : 0)) {
            llllllllllllllIllIlIllIllIllIlll.y.interact(lIlIlIIllllll[lIlIlIlIIIIII[1]]);
            return lIlIlIlIIIIII[1];
        }
        return lIlIlIlIIIIII[0];
    }

    private static void lIlllllIIlIllll() {
        lIlIlIlIIIIII = new int[5];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIlIIIIII[0] = (0xCB ^ 0x93) & ~(0x34 ^ 0x6C);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIlIIIIII[1] = " ".length();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIlIIIIII[2] = -(0xFFFFEF0D & 0x53F3) & (0xFFFFCFDB & 0x341732F);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIlIIIIII[3] = "  ".length();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIlIIIIII[4] = 0xA5 ^ 0xAD;
    }

    private static String lIlllllIIlIllIl(String llllllllllllllIllIlIllIllIIlllIl, String llllllllllllllIllIlIllIllIIlllII) {
        llllllllllllllIllIlIllIllIIlllIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllIllIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIllIllIIllIll = new StringBuilder();
        char[] llllllllllllllIllIlIllIllIIllIlI = llllllllllllllIllIlIllIllIIlllII.toCharArray();
        int llllllllllllllIllIlIllIllIIllIIl = lIlIlIlIIIIII[0];
        char[] llllllllllllllIllIlIllIllIIlIIll = llllllllllllllIllIlIllIllIIlllIl.toCharArray();
        int llllllllllllllIllIlIllIllIIlIIlI = llllllllllllllIllIlIllIllIIlIIll.length;
        int llllllllllllllIllIlIllIllIIlIIIl = lIlIlIlIIIIII[0];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIllIIll(llllllllllllllIllIlIllIllIIlIIIl, llllllllllllllIllIlIllIllIIlIIlI)) {
            char llllllllllllllIllIlIllIllIIllllI = llllllllllllllIllIlIllIllIIlIIll[llllllllllllllIllIlIllIllIIlIIIl];
            llllllllllllllIllIlIllIllIIllIll.append((char)(llllllllllllllIllIlIllIllIIllllI ^ llllllllllllllIllIlIllIllIIllIlI[llllllllllllllIllIlIllIllIIllIIl % llllllllllllllIllIlIllIllIIllIlI.length]));
            "".length();
            ++llllllllllllllIllIlIllIllIIllIIl;
            ++llllllllllllllIllIlIllIllIIlIIIl;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIllIllIIllIll);
    }

    private static boolean lIlllllIIllIIlI(int n2) {
        return n2 != 0;
    }

    @Inject
    protected u(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
        this.ap = new ArrayList<Widget>();
    }

    private static void lIlllllIIlIlllI() {
        lIlIlIIllllll = new String[lIlIlIlIIIIII[3]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIIllllll[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIlIIIIII[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIlIllII("2vKoLSdNjxA=", "nhXvd");
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIIllllll[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlIlIlIIIIII[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIlIllIl("FiQgJxE8", "WPTFr");
    }

    private static boolean lIlllllIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIlIllll();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u.lIlllllIIlIlllI();
        ao = lIlIlIlIIIIII[2];
    }

    private static boolean lIlllllIIllIIII(int n2) {
        return n2 == 0;
    }
}

