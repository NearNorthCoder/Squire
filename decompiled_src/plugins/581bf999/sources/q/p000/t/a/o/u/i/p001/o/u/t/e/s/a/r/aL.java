package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Attacking baba")
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aL  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aL.class */
public class aL extends aI {
    private static /* synthetic */ String[] lIlllIIIIll;
    private static /* synthetic */ int[] lIlllIIIlIl;

    private static boolean lIIllIIIlIllIl(int i) {
        return i != 0;
    }

    private static void lIIllIIIlIllII() {
        lIlllIIIlIl = new int[6];
        lIlllIIIlIl[0] = ((98 ^ 64) ^ (58 ^ 6)) & (((2 ^ 103) ^ (238 ^ 149)) ^ (-" ".length()));
        lIlllIIIlIl[1] = (-4209) & 15988;
        lIlllIIIlIl[2] = " ".length();
        lIlllIIIlIl[3] = 67 ^ 71;
        lIlllIIIlIl[4] = "  ".length();
        lIlllIIIlIl[5] = 184 ^ 176;
    }

    private static String lIIllIIIlIIlll(String llllllllllllllllIlIIlllIlIIIlIll, String llllllllllllllllIlIIlllIlIIIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlllIlIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlllIlIIIllIl.init(lIlllIIIlIl[4], secretKeySpec);
            return new String(llllllllllllllllIlIIlllIlIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlllIlIIIllII) {
            llllllllllllllllIlIIlllIlIIIllII.printStackTrace();
            return null;
        }
    }

    static {
        lIIllIIIlIllII();
        lIIllIIIlIlIII();
    }

    private static boolean lIIllIIIlIllll(Object obj) {
        return obj == null;
    }

    private static void lIIllIIIlIlIII() {
        lIlllIIIIll = new String[lIlllIIIlIl[4]];
        lIlllIIIIll[lIlllIIIlIl[0]] = lIIllIIIlIIllI("EHU4n3dNE24=", "xEjqt");
        lIlllIIIIll[lIlllIIIlIl[2]] = lIIllIIIlIIlll("lMg0YDKtz+U=", "mmXaQ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aI
    public boolean bC() {
        if (lIIllIIIlIllIl(this.cW.redX() ? 1 : 0)) {
            return lIlllIIIlIl[0];
        }
        NPC bB = bB();
        if (!lIIllIIIlIllll(bB) && !lIIllIIIllIIII(bB.getId(), lIlllIIIlIl[1]) && !lIIllIIIllIIIl(NPCs.getNearest(npc -> {
            if (lIIllIIIlIllIl(npc.getName().equals(lIlllIIIIll[lIlllIIIlIl[2]]) ? 1 : 0) && lIIllIIIllIIlI(npc.distanceTo(Players.getLocal()), lIlllIIIlIl[3])) {
                ?? r0 = lIlllIIIlIl[2];
                "".length();
                return (-((97 ^ 9) ^ (93 ^ 48))) >= 0 ? ((((40 + 111) - (-6)) + 72) ^ (((22 + 68) - (-54)) + 17)) & (((254 ^ 134) ^ (185 ^ 133)) ^ (-" ".length())) : r0;
            }
            return lIlllIIIlIl[0];
        }))) {
            a(bB, (boolean) lIlllIIIlIl[2]);
            "".length();
            bB.interact(lIlllIIIIll[lIlllIIIlIl[0]]);
            return lIlllIIIlIl[2];
        }
        return lIlllIIIlIl[0];
    }

    private static String lIIllIIIlIIllI(String llllllllllllllllIlIIlllIIllllllI, String llllllllllllllllIlIIlllIIlllllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllIlIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIIlllllIl.getBytes(StandardCharsets.UTF_8)), lIlllIIIlIl[5]), "DES");
            Cipher llllllllllllllllIlIIlllIlIIIIIII = Cipher.getInstance("DES");
            llllllllllllllllIlIIlllIlIIIIIII.init(lIlllIIIlIl[4], llllllllllllllllIlIIlllIlIIIIIIl);
            return new String(llllllllllllllllIlIIlllIlIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlllIIlllllll) {
            llllllllllllllllIlIIlllIIlllllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIIllIIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIllIIIllIIIl(Object obj) {
        return obj != null;
    }

    @Inject
    protected aL(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIIllIIIllIIlI(int i, int i2) {
        return i < i2;
    }
}
