/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.g;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.i;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Hammering sword", priority=100, blocking=true)
public class m
extends i {
    private static final /* synthetic */ int ab;
    private static /* synthetic */ String[] llIlIlIllIIl;
    private static /* synthetic */ int[] llIlIlIllIlI;

    @Override
    protected boolean M() {
        Player player = Players.getLocal();
        if (m.lIIIIIllIlIIlll(player.getAnimation(), llIlIlIllIlI[0])) {
            return llIlIlIllIlI[1];
        }
        return this.N();
    }

    @Override
    protected boolean N() {
        TileObject tileObject = this.P.r();
        if (m.lIIIIIllIlIlIII(tileObject)) {
            Log.info((String)llIlIlIllIIl[llIlIlIllIlI[2]]);
            return llIlIlIllIlI[2];
        }
        tileObject.interact(llIlIlIllIIl[llIlIlIllIlI[1]]);
        return llIlIlIllIlI[1];
    }

    private static boolean lIIIIIllIlIIlll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    public m(a a2) {
        super(a2, g.HAMMER);
    }

    private static boolean lIIIIIllIlIlIII(Object object) {
        return object == null;
    }

    private static void lIIIIIllIlIIlIl() {
        llIlIlIllIIl = new String[llIlIlIllIlI[3]];
        m.llIlIlIllIIl[m.llIlIlIllIlI[2]] = m.lIIIIIllIlIIIll("gid5iFiZK2CxISZ1tIruwg==", "sDYqk");
        m.llIlIlIllIIl[m.llIlIlIllIlI[1]] = m.lIIIIIllIlIIlII("nH1loXi+4Bs=", "IiTiX");
    }

    static {
        m.lIIIIIllIlIIllI();
        m.lIIIIIllIlIIlIl();
        ab = llIlIlIllIlI[0];
    }

    private static String lIIIIIllIlIIlII(String lllllllllllllllIlIIIIlIIlIIlllII, String lllllllllllllllIlIIIIlIIlIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIlIIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIlIIllIll.getBytes(StandardCharsets.UTF_8)), llIlIlIllIlI[4]), "DES");
            Cipher lllllllllllllllIlIIIIlIIlIIllllI = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIlIIlIIllllI.init(llIlIlIllIlI[3], lllllllllllllllIlIIIIlIIlIIlllll);
            return new String(lllllllllllllllIlIIIIlIIlIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIlIIlIIlllIl) {
            lllllllllllllllIlIIIIlIIlIIlllIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIIIllIlIIIll(String lllllllllllllllIlIIIIlIIlIlIlIIl, String lllllllllllllllIlIIIIlIIlIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIlIIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIlIIlIlIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIlIIlIlIlIll.init(llIlIlIllIlI[3], lllllllllllllllIlIIIIlIIlIlIllII);
            return new String(lllllllllllllllIlIIIIlIIlIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIlIIlIlIlIlI) {
            lllllllllllllllIlIIIIlIIlIlIlIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIllIlIIllI() {
        llIlIlIllIlI = new int[5];
        m.llIlIlIllIlI[0] = 0xFFFFBDFF & 0x66EF;
        m.llIlIlIllIlI[1] = " ".length();
        m.llIlIlIllIlI[2] = (0x56 ^ 0x4A) & ~(0xB8 ^ 0xA4);
        m.llIlIlIllIlI[3] = "  ".length();
        m.llIlIlIllIlI[4] = 0xC5 ^ 0xA5 ^ (0x10 ^ 0x78);
    }
}

