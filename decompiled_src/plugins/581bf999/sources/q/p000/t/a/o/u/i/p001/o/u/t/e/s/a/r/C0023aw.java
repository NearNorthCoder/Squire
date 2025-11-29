package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Solving memory puzzle", priority = 200, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aw  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aw.class */
public class C0023aw extends AbstractC0016ap {
    private static /* synthetic */ String[] llIIlllllIl;
    private static /* synthetic */ int[] llIIllllllI;
    private final /* synthetic */ C0064m dm;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        if (lIlIIIlllllIIl(J())) {
            return llIIllllllI[0];
        }
        Queue<EnumC0065n> G = this.dm.G();
        if (lIlIIIlllllIlI(G.isEmpty() ? 1 : 0)) {
            return llIIllllllI[0];
        }
        WorldPoint a = G.peek().a(this.cu);
        if (lIlIIIlllllIll(a)) {
            return llIIllllllI[0];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIlIIIllllllII(a.distanceTo(worldLocation), llIIllllllI[1]) && lIlIIIlllllIlI(NPCs.getAll(npc -> {
            if (lIlIIIlllllIIl(npc.getName()) && lIlIIIlllllIlI(npc.getName().toLowerCase().contains(llIIlllllIl[llIIllllllI[1]]) ? 1 : 0) && lIlIIIlllllIlI(npc.getWorldLocation().equals(worldLocation) ? 1 : 0)) {
                ?? r0 = llIIllllllI[1];
                "".length();
                return "   ".length() <= "  ".length() ? ((116 ^ 66) ^ (117 ^ 29)) & (((((106 + 183) - 91) + 11) ^ (((9 + 54) - (-55)) + 25)) ^ (-" ".length())) : r0;
            }
            return llIIllllllI[0];
        }).isEmpty() ? 1 : 0)) {
            return llIIllllllI[1];
        }
        if (lIlIIIllllllIl(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        try {
            g(a);
            return llIIllllllI[1];
        } catch (NullPointerException e) {
            Log.info(llIIlllllIl[llIIllllllI[0]]);
            e.printStackTrace();
            Movement.setDestination(a);
            return llIIllllllI[1];
        }
    }

    @Inject
    protected C0023aw(Client client, C0077z c0077z, TOAConfig tOAConfig, C0064m c0064m) {
        super(client, c0077z, tOAConfig);
        this.dm = c0064m;
    }

    private static boolean lIlIIIllllllII(int i, int i2) {
        return i <= i2;
    }

    private static String lIlIIIllllIllI(String llllllllllllllllIIlllIIllllIllII, String llllllllllllllllIIlllIIllllIlIll) {
        String llllllllllllllllIIlllIIllllIllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIIllllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlllIIllllIlIIl = llllllllllllllllIIlllIIllllIlIll.toCharArray();
        int llllllllllllllllIIlllIIllllIlIII = llIIllllllI[0];
        char[] charArray = llllllllllllllllIIlllIIllllIllII2.toCharArray();
        int length = charArray.length;
        int llllllllllllllllIIlllIIllllIIIII = llIIllllllI[0];
        while (lIlIIIlllllllI(llllllllllllllllIIlllIIllllIIIII, length)) {
            char llllllllllllllllIIlllIIllllIllIl = charArray[llllllllllllllllIIlllIIllllIIIII];
            sb.append((char) (llllllllllllllllIIlllIIllllIllIl ^ llllllllllllllllIIlllIIllllIlIIl[llllllllllllllllIIlllIIllllIlIII % llllllllllllllllIIlllIIllllIlIIl.length]));
            "".length();
            llllllllllllllllIIlllIIllllIlIII++;
            llllllllllllllllIIlllIIllllIIIII++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIIIllllllIl(int i) {
        return i == 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.dm.G().clear();
    }

    private static boolean lIlIIIlllllllI(int i, int i2) {
        return i < i2;
    }

    private static void lIlIIIlllllIII() {
        llIIllllllI = new int[3];
        llIIllllllI[0] = (21 ^ 28) & ((29 ^ 20) ^ (-1));
        llIIllllllI[1] = " ".length();
        llIIllllllI[2] = "  ".length();
    }

    private static void lIlIIIllllIlll() {
        llIIlllllIl = new String[llIIllllllI[2]];
        llIIlllllIl[llIIllllllI[0]] = lIlIIIllllIlIl("Y6YZ3yJ4dbV1+xJvOqmHtS4iYs+4gfcsdpsYCfVA68uzWXSOPKWlIgV3FBo9uuDt8/blQsc+EmTBHltruatsPw==", "KoUdX");
        llIIlllllIl[llIIllllllI[1]] = lIlIIIllllIllI("PxEQ", "Pcrom");
    }

    private static boolean lIlIIIlllllIlI(int i) {
        return i != 0;
    }

    private static String lIlIIIllllIlIl(String llllllllllllllllIIlllIIlllllllII, String llllllllllllllllIIlllIIllllllIll) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIllllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIIllllllllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIIllllllllI.init(llIIllllllI[2], llllllllllllllllIIlllIIlllllllll);
            return new String(llllllllllllllllIIlllIIllllllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIlllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllIIlllllllIl) {
            llllllllllllllllIIlllIIlllllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllllIIl(Object obj) {
        return obj != null;
    }

    static {
        lIlIIIlllllIII();
        lIlIIIllllIlll();
    }

    private static boolean lIlIIIlllllIll(Object obj) {
        return obj == null;
    }
}
