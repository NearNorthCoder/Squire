/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Point
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Gear
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Gear;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bX;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bY;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking Zebak", priority=10)
public class bN
extends bX {
    private static final /* synthetic */ Point gR;
    private static /* synthetic */ int[] lIllllIIIII;
    private static /* synthetic */ String[] lIlllIllllI;

    @Inject
    protected bN(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIllIlIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void llllllllllllllllIlIIlIlllllIIllI;
        bN llllllllllllllllIlIIlIlllllIIlll;
        NPC nPC = this.cB();
        if (bN.lIIllIlIIIlIIl(nPC)) {
            return lIllllIIIII[0];
        }
        Player llllllllllllllllIlIIlIlllllIIlIl = Players.getLocal();
        int n2 = Gear.isEquipped((int[])Gear.matching(llllllllllllllllIlIIlIlllllIIlll.cW.gearSwapZebak()));
        if (bN.lIIllIlIIIlIll(llllllllllllllllIlIIlIlllllIIlIl.getInteracting()) && bN.lIIllIlIIIllIl(n2)) {
            return lIllllIIIII[0];
        }
        int llllllllllllllllIlIIlIlllllIIIll = llllllllllllllllIlIIlIlllllIIlIl.distanceTo(llllllllllllllllIlIIlIlllllIIlll.a(gR));
        int llllllllllllllllIlIIlIlllllIIIlI = llllllllllllllllIlIIlIlllllIIlll.a((NPC)llllllllllllllllIlIIlIlllllIIllI, lIllllIIIII[1]) ? 1 : 0;
        if (bN.lIIllIlIIIllll(llllllllllllllllIlIIlIlllllIIIlI) && bN.lIIllIlIIlIIIl(llllllllllllllllIlIIlIlllllIIIll, llllllllllllllllIlIIlIlllllIIlll.bg()) && bN.lIIllIlIIlIIlI((Object)llllllllllllllllIlIIlIlllllIIlll.cF(), (Object)bY.ATTACK)) {
            return lIllllIIIII[0];
        }
        nPC.interact(lIlllIllllI[lIllllIIIII[0]]);
        return lIllllIIIII[1];
    }

    private static void lIIllIlIIIIllI() {
        lIlllIllllI = new String[lIllllIIIII[1]];
        bN.lIlllIllllI[bN.lIllllIIIII[0]] = bN."Attack";
    }

    private static boolean lIIllIlIIIllIl(int n2) {
        return n2 != 0;
    }

    private static String lIIllIlIIIIlIl(String llllllllllllllllIlIIlIllllIllIII, String llllllllllllllllIlIIlIllllIlIlll) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIllllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIllllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIllllIlllII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIllllIlllII.init(lIllllIIIII[4], llllllllllllllllIlIIlIllllIlllIl);
            return new String(llllllllllllllllIlIIlIllllIlllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIllllIllIll) {
            llllllllllllllllIlIIlIllllIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlIIIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIlIIIlIll(Object object) {
        return object != null;
    }

    private static boolean lIIllIlIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllIlIIIlIIl(Object object) {
        return object == null;
    }

    static {
        bN.lIIllIlIIIIlll();
        bN.lIIllIlIIIIllI();
        gR = new Point(lIllllIIIII[2], lIllllIIIII[3]);
    }

    private static void lIIllIlIIIIlll() {
        lIllllIIIII = new int[5];
        bN.lIllllIIIII[0] = (0x30 ^ 0x29) & ~(0xBD ^ 0xA4);
        bN.lIllllIIIII[1] = 1;
        bN.lIllllIIIII[2] = 0x7B ^ 0x6E;
        bN.lIllllIIIII[3] = 0xB5 ^ 0x95;
        bN.lIllllIIIII[4] = 2;
    }
}

