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

/* TASK: Polishing sword -> PolishingswordTask */
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

    private static String lIIIIIllllIIIIl(String var5, String var8) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), llIlIllIllII[5]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llIlIllIllII[4], var1);
            return new String(var10.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
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

    private static String lIIIIIllllIIIlI(String var6, String var2) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var9 = Cipher.getInstance("Blowfish");
            var9.init(llIlIllIllII[4], var7);
            return new String(var9.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
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

