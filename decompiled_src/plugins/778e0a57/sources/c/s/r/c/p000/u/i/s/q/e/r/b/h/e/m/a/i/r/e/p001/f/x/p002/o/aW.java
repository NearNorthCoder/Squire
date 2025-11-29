package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Scavangers (Top Floor)", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aW  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aW.class */
public class aW extends U {
    private static /* synthetic */ String[] lIIllllllllI;
    private static /* synthetic */ int[] lIIlllllllll;
    private /* synthetic */ C0039n ak;
    private /* synthetic */ C0039n al;
    private /* synthetic */ int am;

    private static void llIlIIllIIIlIl() {
        lIIllllllllI = new String[lIIlllllllll[3]];
        lIIllllllllI[lIIlllllllll[2]] = llIlIIllIIIIll("j/9zV4X84urAFqvwVX4rJg==", "uZmSN");
        lIIllllllllI[lIIlllllllll[1]] = llIlIIllIIIlII("zfS+PcekvJABdO4T38CGCw==", "SCeFG");
        lIIllllllllI[lIIlllllllll[4]] = llIlIIllIIIlII("sSDgtCla+L0Z5RqSmXl6MA==", "wPhrO");
    }

    private static boolean llIlIIllIIlIIl(int i, int i2) {
        return i != i2;
    }

    private static String llIlIIllIIIlII(String lllllllllllllllIlllIIlllIlIIIlll, String lllllllllllllllIlllIIlllIlIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllllllll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllIlIIlIII) {
            lllllllllllllllIlllIIlllIlIIlIII.printStackTrace();
            return null;
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        String[] strArr = new String[lIIlllllllll[1]];
        strArr[lIIlllllllll[2]] = lIIllllllllI[lIIlllllllll[4]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!llIlIIllIIlIll(nearest) && llIlIIllIIllII(this.bS.distanceTo(nearest), lIIlllllllll[5])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    private static String llIlIIllIIIIll(String lllllllllllllllIlllIIlllIlIlIlII, String lllllllllllllllIlllIIlllIlIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIlllIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIIlllllllll[6]), "DES");
            Cipher lllllllllllllllIlllIIlllIlIlIllI = Cipher.getInstance("DES");
            lllllllllllllllIlllIIlllIlIlIllI.init(lIIlllllllll[4], secretKeySpec);
            return new String(lllllllllllllllIlllIIlllIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIlllIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIIlllIlIlIlIl) {
            lllllllllllllllIlllIIlllIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIIlIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        if (llIlIIllIIlIIl(this.bS.getPlane(), lIIlllllllll[3])) {
            return lIIlllllllll[2];
        }
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIlIIllIIlIlI(this.ak.bw, N.SCAVENGERS)) {
            ?? r0 = lIIlllllllll[1];
            "".length();
            return "   ".length() != "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlllllllll[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (llIlIIllIIIlll(e(this.ak) ? 1 : 0)) {
            return lIIlllllllll[1];
        }
        if (llIlIIllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlllllllll[2];
        }
        if (llIlIIllIIIlll(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            Movement.setDestination(this.al.bs);
            System.out.println(lIIllllllllI[lIIlllllllll[2]]);
            return lIIlllllllll[1];
        } else if (llIlIIllIIIlll(Reachable.isWalkable(this.ak.bs) ? 1 : 0)) {
            Movement.setDestination(this.ak.bt);
            System.out.println(lIIllllllllI[lIIlllllllll[1]]);
            return lIIlllllllll[1];
        } else {
            return lIIlllllllll[2];
        }
    }

    private static boolean llIlIIllIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIlIIllIIlIII(int i) {
        return i == 0;
    }

    private static boolean llIlIIllIIIlll(int i) {
        return i != 0;
    }

    static {
        llIlIIllIIIllI();
        llIlIIllIIIlIl();
    }

    private static void llIlIIllIIIllI() {
        lIIlllllllll = new int[7];
        lIIlllllllll[0] = -" ".length();
        lIIlllllllll[1] = " ".length();
        lIIlllllllll[2] = (45 ^ 22) & ((44 ^ 23) ^ (-1));
        lIIlllllllll[3] = "   ".length();
        lIIlllllllll[4] = "  ".length();
        lIIlllllllll[5] = (21 ^ 8) ^ (36 ^ 60);
        lIIlllllllll[6] = (139 ^ 151) ^ (177 ^ 165);
    }

    private static boolean llIlIIllIIllII(int i, int i2) {
        return i < i2;
    }

    @Inject
    protected aW(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIIlllllllll[0];
    }
}
