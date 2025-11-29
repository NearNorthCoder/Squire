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
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ActorDeath;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Moving to right spot with charging", priority = 100, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bx  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bx.class */
public class C0051bx extends AbstractC0052by {
    private static /* synthetic */ String[] lIllllllIIl;
    private static final /* synthetic */ Point fE;
    private static /* synthetic */ int[] lIllllllIlI;
    private static final /* synthetic */ Point fD;
    private /* synthetic */ boolean fG;
    private static final /* synthetic */ int fF;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Subscribe
    public void a(ActorDeath actorDeath) {
        if (lIIllIlllIllIl(actorDeath.getActor().equals(Players.getLocal()) ? 1 : 0)) {
            this.fG = lIllllllIlI[0];
        }
    }

    private static boolean lIIllIlllIllll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bn() {
        return lIllllllIlI[0];
    }

    private static String lIIllIlllIlIIl(String llllllllllllllllIlIIlIIlIIIlIlIl, String llllllllllllllllIlIIlIIlIIIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIlIIIlIlII.getBytes(StandardCharsets.UTF_8)), lIllllllIlI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllllllIlI[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIlIIIlIllI) {
            llllllllllllllllIlIIlIIlIIIlIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        WorldPoint a = a(fD);
        if (lIIllIlllIllIl(this.fG ? 1 : 0) && lIIllIlllIlllI(Players.getLocal().getWorldLocation().equals(a) ? 1 : 0)) {
            return lIllllllIlI[0];
        }
        if (!lIIllIlllIllIl(this.fG ? 1 : 0)) {
            if (lIIllIlllIllIl(Players.getLocal().getWorldLocation().equals(a) ? 1 : 0)) {
                return lIllllllIlI[0];
            }
            Movement.setDestination(a);
            return lIllllllIlI[1];
        }
        WorldPoint a2 = a(fE);
        if (lIIllIlllIllIl(Players.getLocal().getWorldLocation().equals(a2) ? 1 : 0)) {
            return lIllllllIlI[0];
        }
        Movement.setDestination(a2);
        return lIllllllIlI[1];
    }

    private static boolean lIIllIlllIllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0052by, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bj() {
        if (lIIllIlllIllII(NPCs.getNearest(npc -> {
            if (lIIllIlllIllIl(npc.getName().contains(lIllllllIIl[lIllllllIlI[0]]) ? 1 : 0)) {
                String[] strArr = new String[lIllllllIlI[1]];
                strArr[lIllllllIlI[0]] = lIllllllIIl[lIllllllIlI[1]];
                if (lIIllIlllIllIl(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllllllIlI[1];
                    "".length();
                    return (78 ^ 74) < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllllllIlI[0];
        }))) {
            ?? r0 = lIllllllIlI[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllllllIlI[0];
    }

    private static boolean lIIllIlllIllIl(int i) {
        return i != 0;
    }

    private static boolean lIIllIlllIlllI(int i) {
        return i == 0;
    }

    private static void lIIllIlllIlIlI() {
        lIllllllIIl = new String[lIllllllIlI[5]];
        lIllllllIIl[lIllllllIlI[0]] = lIIllIlllIlIIl("k6OVL3SqwLY=", "BZpFi");
        lIllllllIIl[lIllllllIlI[1]] = lIIllIlllIlIIl("zXpB9jFnuBs=", "IxZqH");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.fG = lIllllllIlI[0];
    }

    private static void lIIllIlllIlIll() {
        lIllllllIlI = new int[7];
        lIllllllIlI[0] = ((143 ^ 180) ^ (106 ^ 5)) & (((51 ^ 28) ^ (125 ^ 6)) ^ (-" ".length()));
        lIllllllIlI[1] = " ".length();
        lIllllllIlI[2] = (-((-17362) & 20443)) & (-16705) & 65535;
        lIllllllIlI[3] = (110 ^ 63) ^ (70 ^ 53);
        lIllllllIlI[4] = 37 ^ 6;
        lIllllllIlI[5] = "  ".length();
        lIllllllIlI[6] = 60 ^ 52;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected C0051bx(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
        this.fG = lIllllllIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0052by, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    protected boolean aS() {
        return lIllllllIlI[1];
    }

    static {
        lIIllIlllIlIll();
        lIIllIlllIlIlI();
        fF = lIllllllIlI[2];
        fD = new Point(lIllllllIlI[3], lIllllllIlI[3]);
        fE = new Point(lIllllllIlI[3], lIllllllIlI[4]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        if (lIIllIlllIllll(gameObjectSpawned.getGameObject().getId(), lIllllllIlI[2])) {
            this.fG = lIllllllIlI[1];
        }
    }
}
