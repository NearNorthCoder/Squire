package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

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
@TaskDesc(name = "Attacking Zebak", priority = 10)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bN  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bN.class */
public class bN extends bX {
    private static final /* synthetic */ Point gR;
    private static /* synthetic */ int[] lIllllIIIII;
    private static /* synthetic */ String[] lIlllIllllI;

    @Inject
    protected bN(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIIllIlIIlIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bX
    public boolean bL() {
        NPC cB = cB();
        if (lIIllIlIIIlIIl(cB)) {
            return lIllllIIIII[0];
        }
        Player local = Players.getLocal();
        boolean isEquipped = Gear.isEquipped(Gear.matching(this.cW.gearSwapZebak()));
        if (lIIllIlIIIlIll(local.getInteracting()) && lIIllIlIIIllIl(isEquipped ? 1 : 0)) {
            return lIllllIIIII[0];
        }
        int distanceTo = local.distanceTo(a(gR));
        if (lIIllIlIIIllll(a(cB, (boolean) lIllllIIIII[1]) ? 1 : 0) && lIIllIlIIlIIIl(distanceTo, bg()) && lIIllIlIIlIIlI(cF(), bY.ATTACK)) {
            return lIllllIIIII[0];
        }
        cB.interact(lIlllIllllI[lIllllIIIII[0]]);
        return lIllllIIIII[1];
    }

    private static void lIIllIlIIIIllI() {
        lIlllIllllI = new String[lIllllIIIII[1]];
        lIlllIllllI[lIllllIIIII[0]] = lIIllIlIIIIlIl("FtEosaEgEfY=", "ROBBe");
    }

    private static boolean lIIllIlIIIllIl(int i) {
        return i != 0;
    }

    private static String lIIllIlIIIIlIl(String llllllllllllllllIlIIlIllllIllIlI, String llllllllllllllllIlIIlIllllIllIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIllllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIllllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllllIIIII[4], llllllllllllllllIlIIlIllllIlllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIllllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIllllIllIll) {
            llllllllllllllllIlIIlIllllIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlIIIllll(int i) {
        return i == 0;
    }

    private static boolean lIIllIlIIIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIllIlIIlIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIllIlIIIlIIl(Object obj) {
        return obj == null;
    }

    static {
        lIIllIlIIIIlll();
        lIIllIlIIIIllI();
        gR = new Point(lIllllIIIII[2], lIllllIIIII[3]);
    }

    private static void lIIllIlIIIIlll() {
        lIllllIIIII = new int[5];
        lIllllIIIII[0] = (48 ^ 41) & ((189 ^ 164) ^ (-1));
        lIllllIIIII[1] = " ".length();
        lIllllIIIII[2] = 123 ^ 110;
        lIllllIIIII[3] = 181 ^ 149;
        lIllllIIIII[4] = "  ".length();
    }
}
