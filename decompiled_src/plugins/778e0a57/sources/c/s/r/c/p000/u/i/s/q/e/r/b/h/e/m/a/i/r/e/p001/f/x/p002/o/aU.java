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
@TaskDesc(name = "Farming (Top Floor)", priority = 10000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aU  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aU.class */
public class aU extends U {
    private /* synthetic */ C0039n ak;
    private /* synthetic */ C0039n al;
    private static /* synthetic */ String[] lIlIIlIIIIlI;
    private /* synthetic */ int am;
    private static /* synthetic */ int[] lIlIIlIIIIll;

    @Inject
    protected aU(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.am = lIlIIlIIIIll[0];
    }

    private static String llIllIIIIIIIII(String lllllllllllllllIllIlllIlIIIIlIIl, String lllllllllllllllIllIlllIlIIIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIlIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlllIlIIIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlllIlIIIIlIll.init(lIlIIlIIIIll[4], secretKeySpec);
            return new String(lllllllllllllllIllIlllIlIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIlIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllIlIIIIlIlI) {
            lllllllllllllllIllIlllIlIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static String llIllIIIIIIIIl(String lllllllllllllllIllIlllIIlllIllII, String lllllllllllllllIllIlllIIlllIlIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIllIlllIIlllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlllIIlllIlIlI = new StringBuilder();
        char[] lllllllllllllllIllIlllIIlllIlIIl = lllllllllllllllIllIlllIIlllIlIll.toCharArray();
        int lllllllllllllllIllIlllIIlllIlIII = lIlIIlIIIIll[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIIIIll[2];
        while (llIllIIIIIlIIl(i, length)) {
            char lllllllllllllllIllIlllIIlllIllIl = charArray[i];
            lllllllllllllllIllIlllIIlllIlIlI.append((char) (lllllllllllllllIllIlllIIlllIllIl ^ lllllllllllllllIllIlllIIlllIlIIl[lllllllllllllllIllIlllIIlllIlIII % lllllllllllllllIllIlllIIlllIlIIl.length]));
            "".length();
            lllllllllllllllIllIlllIIlllIlIII++;
            i++;
            "".length();
            if (((((146 + 57) - 49) + 4) ^ (((1 + 115) - 42) + 81)) == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIlllIIlllIlIlI);
    }

    private static void llIllIIIIIIIll() {
        lIlIIlIIIIlI = new String[lIlIIlIIIIll[3]];
        lIlIIlIIIIlI[lIlIIlIIIIll[2]] = llIllIIIIIIIII("y+7NjhG+xSmHqgF5hQIbKA==", "ADcVp");
        lIlIIlIIIIlI[lIlIIlIIIIll[1]] = llIllIIIIIIIIl("ESwaHyMoKlYAJWYoGBA=", "FMvtJ");
        lIlIIlIIIIlI[lIlIIlIIIIll[4]] = llIllIIIIIIIlI("xrU+kksI0H2NBOYvxF3Cqw==", "AjbKK");
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public List<Prayer> ci() {
        String[] strArr = new String[lIlIIlIIIIll[1]];
        strArr[lIlIIlIIIIll[2]] = lIlIIlIIIIlI[lIlIIlIIIIll[4]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!llIllIIIIIlIII(nearest) && llIllIIIIIlIIl(this.bS.distanceTo(nearest), lIlIIlIIIIll[5])) {
            return List.of(Prayer.PROTECT_FROM_MELEE);
        }
        return null;
    }

    private static boolean llIllIIIIIIlIl(int i) {
        return i != 0;
    }

    private static void llIllIIIIIIlII() {
        lIlIIlIIIIll = new int[7];
        lIlIIlIIIIll[0] = -" ".length();
        lIlIIlIIIIll[1] = " ".length();
        lIlIIlIIIIll[2] = (227 ^ 167) & ((226 ^ 166) ^ (-1));
        lIlIIlIIIIll[3] = "   ".length();
        lIlIIlIIIIll[4] = "  ".length();
        lIlIIlIIIIll[5] = 121 ^ 124;
        lIlIIlIIIIll[6] = 20 ^ 28;
    }

    static {
        llIllIIIIIIlII();
        llIllIIIIIIIll();
    }

    private static String llIllIIIIIIIlI(String lllllllllllllllIllIlllIIllllllII, String lllllllllllllllIllIlllIIlllllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlllIIlllllIll.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIIll[6]), "DES");
            Cipher lllllllllllllllIllIlllIIlllllllI = Cipher.getInstance("DES");
            lllllllllllllllIllIlllIIlllllllI.init(lIlIIlIIIIll[4], secretKeySpec);
            return new String(lllllllllllllllIllIlllIIlllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlllIIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIlllIIllllllIl) {
            lllllllllllllllIllIlllIIllllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIIIIlIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean cg() {
        if (llIllIIIIIIlIl(e(this.ak) ? 1 : 0)) {
            return lIlIIlIIIIll[1];
        }
        if (llIllIIIIIIlIl(Reachable.isWalkable(this.ak.bt) ? 1 : 0)) {
            Movement.setDestination(this.al.bs);
            System.out.println(lIlIIlIIIIlI[lIlIIlIIIIll[2]]);
            return lIlIIlIIIIll[1];
        } else if (llIllIIIIIIlIl(Reachable.isWalkable(this.ak.bs) ? 1 : 0)) {
            Movement.setDestination(this.ak.bt);
            System.out.println(lIlIIlIIIIlI[lIlIIlIIIIll[1]]);
            return lIlIIlIIIIll[1];
        } else {
            return lIlIIlIIIIll[2];
        }
    }

    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public EquipmentSetup cj() {
        return null;
    }

    private static boolean llIllIIIIIIllI(int i, int i2) {
        return i != i2;
    }

    private static boolean llIllIIIIIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIllIIIIIlIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.U
    public boolean ch() {
        if (llIllIIIIIIllI(this.bS.getPlane(), lIlIIlIIIIll[3])) {
            return lIlIIlIIIIll[2];
        }
        this.ak = this.co.L();
        this.am = this.co.N();
        this.al = this.co.M();
        if (llIllIIIIIIlll(this.ak.bw, N.FARMING)) {
            ?? r0 = lIlIIlIIIIll[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIlIIIIll[2];
    }
}
