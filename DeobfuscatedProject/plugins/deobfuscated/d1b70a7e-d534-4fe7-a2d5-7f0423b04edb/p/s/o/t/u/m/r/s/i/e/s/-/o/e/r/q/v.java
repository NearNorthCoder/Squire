/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
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
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.x;

@TaskDesc(name="Boarding ship", priority=10, blocking=true)
public class v
extends x {
    private static /* synthetic */ int[] lIIlllIIIIlIl;
    private static /* synthetic */ String[] lIIlllIIIIlII;

    @Inject
    protected v(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    static {
        v.lIllIIlIIIllIIl();
        v.lIllIIlIIIllIII();
    }

    private static boolean lIllIIlIIIllIll(Object object) {
        return object == null;
    }

    private static boolean lIllIIlIIIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        v llllllllllllllIlllIllIIlIlllIIll;
        void llllllllllllllIlllIllIIlIlllIIlI;
        Player player = Players.getLocal();
        if (v.lIllIIlIIIllIll(player)) {
            return lIIlllIIIIlIl[0];
        }
        if (v.lIllIIlIIIlllII(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIIlllIIIIlIl[0];
        }
        int[] nArray = new int[lIIlllIIIIlIl[3]];
        nArray[v.lIIlllIIIIlIl[0]] = lIIlllIIIIlIl[4];
        TileObject llllllllllllllIlllIllIIlIlllIIIl = TileObjects.getFirstAt((int)lIIlllIIIIlIl[1], (int)lIIlllIIIIlIl[2], (int)lIIlllIIIIlIl[0], (int[])nArray);
        if (v.lIllIIlIIIllIll(llllllllllllllIlllIllIIlIlllIIIl)) {
            return lIIlllIIIIlIl[0];
        }
        if (!v.lIllIIlIIIlllIl(llllllllllllllIlllIllIIlIlllIIlI.getWorldLocation().getX(), llllllllllllllIlllIllIIlIlllIIIl.getWorldLocation().getX()) || v.lIllIIlIIIlllII(llllllllllllllIlllIllIIlIlllIIlI.isMoving() ? 1 : 0)) {
            return lIIlllIIIIlIl[0];
        }
        if (v.lIllIIlIIIlllII(llllllllllllllIlllIllIIlIlllIIll.az.solo() ? 1 : 0)) {
            llllllllllllllIlllIllIIlIlllIIIl.interact(lIIlllIIIIlII[lIIlllIIIIlIl[0]]);
            return lIIlllIIIIlIl[3];
        }
        var2_2.interact(lIIlllIIIIlII[lIIlllIIIIlIl[3]]);
        return lIIlllIIIIlIl[3];
    }

    private static void lIllIIlIIIllIII() {
        lIIlllIIIIlII = new String[lIIlllIIIIlIl[5]];
        v.lIIlllIIIIlII[v.lIIlllIIIIlIl[0]] = v."Solo-start";
        v.lIIlllIIIIlII[v.lIIlllIIIIlIl[3]] = v."Quick-climb";
    }

    private static void lIllIIlIIIllIIl() {
        lIIlllIIIIlIl = new int[6];
        v.lIIlllIIIIlIl[0] = (76 + 108 - 155 + 117 ^ 173 + 30 - 33 + 6) & (0xCB ^ 0x9E ^ (0xED ^ 0x9A) ^ -1);
        v.lIIlllIIIIlIl[1] = 0xFFFFEC3F & 0x1FFF;
        v.lIIlllIIIIlIl[2] = -(0xFFFFF50F & 0x5AF1) & (0xFFFFDBBB & 0x7F5C);
        v.lIIlllIIIIlIl[3] = 1;
        v.lIIlllIIIIlIl[4] = 0xFFFFF95D & 0xA7FB;
        v.lIIlllIIIIlIl[5] = 2;
    }

    private static String lIllIIlIIIlIlll(String llllllllllllllIlllIllIIlIllIIlll, String llllllllllllllIlllIllIIlIllIlIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIlIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIlIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIlIllIlIll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIlIllIlIll.init(lIIlllIIIIlIl[5], llllllllllllllIlllIllIIlIllIllII);
            return new String(llllllllllllllIlllIllIIlIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIlIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIlIllIlIlI) {
            llllllllllllllIlllIllIIlIllIlIlI.printStackTrace();
            return null;
        }
    }
}

