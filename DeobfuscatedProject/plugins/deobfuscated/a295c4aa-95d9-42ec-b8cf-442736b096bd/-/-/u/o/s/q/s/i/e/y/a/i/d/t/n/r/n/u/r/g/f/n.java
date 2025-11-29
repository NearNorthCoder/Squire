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

@TaskDesc(name="Polishing sword", priority=43, blocking=true)
public class n
extends i {
    private static final /* synthetic */ int ac;
    private static /* synthetic */ int[] llIlIllIllII;
    private static /* synthetic */ String[] llIlIllIlIll;

    @Override
    protected boolean M() {
        Player player = Players.getLocal();
        if (n.lIIIIIllllIIlIl(player.getAnimation(), llIlIllIllII[0])) {
            this.sleep(llIlIllIllII[1]);
            return llIlIllIllII[2];
        }
        return this.N();
    }

    @Inject
    public n(a a2) {
        super(a2, g.POLISH);
    }

    private static boolean lIIIIIllllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIIIIllllIIIll() {
        llIlIllIlIll = new String[llIlIllIllII[4]];
        n.llIlIllIlIll[n.llIlIllIllII[3]] = n."Polishing wheel is null";
        n.llIlIllIlIll[n.llIlIllIllII[2]] = n."Use";
    }

    static {
        n.lIIIIIllllIIlII();
        n.lIIIIIllllIIIll();
        ac = llIlIllIllII[0];
    }

    private static boolean lIIIIIllllIIllI(Object object) {
        return object == null;
    }

    private static String lIIIIIllllIIIIl(String lllllllllllllllIlIIIIIlIlllIIIlI, String lllllllllllllllIlIIIIIlIlllIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIlllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), llIlIllIllII[5]), "DES");
            Cipher lllllllllllllllIlIIIIIlIlllIIllI = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIIlIlllIIllI.init(llIlIllIllII[4], lllllllllllllllIlIIIIIlIlllIIlll);
            return new String(lllllllllllllllIlIIIIIlIlllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIlIlllIIlIl) {
            lllllllllllllllIlIIIIIlIlllIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIllllIIlII() {
        llIlIllIllII = new int[6];
        n.llIlIllIllII[0] = -(0xFFFFFE27 & 0xBD9) & (0xFFFFBFEE & 0x6EFF);
        n.llIlIllIllII[1] = 0x2D ^ 0x29;
        n.llIlIllIllII[2] = 1;
        n.llIlIllIllII[3] = (0x2E ^ 0x12) & ~(0x45 ^ 0x79);
        n.llIlIllIllII[4] = 2;
        n.llIlIllIllII[5] = 0x1F ^ 6 ^ (0xD0 ^ 0xC1);
    }

    private static String lIIIIIllllIIIlI(String lllllllllllllllIlIIIIIlIllIlIlIl, String lllllllllllllllIlIIIIIlIllIlIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIIlIllIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIlIllIllIIl.init(llIlIllIllII[4], lllllllllllllllIlIIIIIlIllIllIlI);
            return new String(lllllllllllllllIlIIIIIlIllIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIlIllIllIII) {
            lllllllllllllllIlIIIIIlIllIllIII.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean N() {
        TileObject tileObject = this.P.q();
        if (n.lIIIIIllllIIllI(tileObject)) {
            Log.info((String)llIlIllIlIll[llIlIllIllII[3]]);
            return llIlIllIllII[3];
        }
        tileObject.interact(llIlIllIlIll[llIlIllIllII[2]]);
        this.sleep(llIlIllIllII[1]);
        return llIlIllIllII[2];
    }
}

