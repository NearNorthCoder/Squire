package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.combat.AgroReset.ResetPlugin;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Resetting aggro")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.E  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/E.class */
public class E extends Task {
    private static /* synthetic */ int[] lllIIllll;
    private /* synthetic */ long bj = -1;
    private static /* synthetic */ String[] lllIIlllI;
    private final /* synthetic */ ResetPlugin bi;

    private static boolean llIIIllIllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    public boolean run() {
        if (llIIIllIlII(this.bi.ae() ? 1 : 0)) {
            return lllIIllll[0];
        }
        long lIlIlIllIIlIlIl = System.currentTimeMillis() - this.bi.ag();
        if (llIIIllIlIl(llIIIllIIlI(lIlIlIllIIlIlIl, this.bi.ak()[lllIIllll[0]]))) {
            return lllIIllll[0];
        }
        WorldPoint aj = this.bi.aj();
        Player local = Players.getLocal();
        if (llIIIllIllI(aj) && llIIIllIlII(local.isMoving() ? 1 : 0) && (!llIIIllIllI(local.getInteracting()) || !llIIIllIlll(this.bi.ai().equals(local.getWorldLocation()) ? 1 : 0))) {
            List all = NPCs.getAll(npc -> {
                if (llIIIlllIIl(npc.getInteracting(), local)) {
                    String[] strArr = new String[lllIIllll[1]];
                    strArr[lllIIllll[0]] = lllIIlllI[lllIIllll[1]];
                    if (llIIIllIlll(npc.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIllll[1];
                        "".length();
                        return (-((123 ^ 36) ^ (2 ^ 89))) >= 0 ? ((200 ^ 141) ^ (175 ^ 182)) & (((77 ^ 113) ^ (123 ^ 27)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIllll[0];
            });
            if (llIIIllIlII(all.isEmpty() ? 1 : 0)) {
                NPC npc2 = (NPC) all.get(lllIIllll[0]);
                if (llIIIllIllI(npc2) && llIIIlllIII(llIIIllIIll(npc2.getWorldLocation().distanceTo2DHypotenuse(local.getWorldLocation()), 1.0f))) {
                    npc2.interact(lllIIlllI[lllIIllll[0]]);
                }
                return lllIIllll[0];
            }
            if (!llIIIllIlll(aj.equals(local.getWorldLocation()) ? 1 : 0)) {
                Movement.walk(aj);
            } else if (llIIIllIlII(llIIIllIIlI(this.bj, -1L))) {
                this.bj = System.currentTimeMillis();
                return lllIIllll[0];
            } else if (llIIIllIlIl(llIIIllIIlI(System.currentTimeMillis() - this.bj, this.bi.ak()[lllIIllll[1]]))) {
                return lllIIllll[0];
            } else {
                Movement.walk(this.bi.ai());
                this.bi.ac();
                this.bj = -1L;
                "".length();
                if ((-" ".length()) > "   ".length()) {
                    return "   ".length() & ("   ".length() ^ (-" ".length()));
                }
            }
            return lllIIllll[1];
        }
        return lllIIllll[0];
    }

    static {
        llIIIllIIIl();
        llIIIllIIII();
    }

    private static boolean llIIIlllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIIIlllIlI(int i2, int i3) {
        return i2 < i3;
    }

    @Inject
    public E(ResetPlugin resetPlugin) {
        this.bi = resetPlugin;
    }

    private static boolean llIIIllIlll(int i2) {
        return i2 != 0;
    }

    private static void llIIIllIIIl() {
        lllIIllll = new int[4];
        lllIIllll[0] = (166 ^ 139) & ((62 ^ 19) ^ (-1));
        lllIIllll[1] = " ".length();
        lllIIllll[2] = "  ".length();
        lllIIllll[3] = (125 ^ 75) ^ (30 ^ 32);
    }

    private static boolean llIIIlllIII(int i2) {
        return i2 <= 0;
    }

    private static void llIIIllIIII() {
        lllIIlllI = new String[lllIIllll[2]];
        lllIIlllI[lllIIllll[0]] = llIIIlIlllI("lckuC8xxmoM=", "LWzwD");
        lllIIlllI[lllIIllll[1]] = llIIIlIllll("Czo2Mgoh", "JNBSi");
    }

    private static String llIIIlIlllI(String lIlIlIlIllIllII, String lIlIlIlIllIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlIllIlIll.getBytes(StandardCharsets.UTF_8)), lllIIllll[3]), "DES");
            Cipher lIlIlIlIllIlllI = Cipher.getInstance("DES");
            lIlIlIlIllIlllI.init(lllIIllll[2], secretKeySpec);
            return new String(lIlIlIlIllIlllI.doFinal(Base64.getDecoder().decode(lIlIlIlIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIlIllIllIl) {
            lIlIlIlIllIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllIlIl(int i2) {
        return i2 < 0;
    }

    private static boolean llIIIllIlII(int i2) {
        return i2 == 0;
    }

    private static int llIIIllIIll(float f, float f2) {
        return (f > f2 ? 1 : (f == f2 ? 0 : -1));
    }

    private static int llIIIllIIlI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static String llIIIlIllll(String lIlIlIllIIIIIIl, String lIlIlIllIIIIIII) {
        String lIlIlIllIIIIIIl2 = new String(Base64.getDecoder().decode(lIlIlIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIlIlllllll = new StringBuilder();
        char[] charArray = lIlIlIllIIIIIII.toCharArray();
        int lIlIlIlIlllllIl = lllIIllll[0];
        char[] charArray2 = lIlIlIllIIIIIIl2.toCharArray();
        int lIlIlIlIlllIllI = charArray2.length;
        int i2 = lllIIllll[0];
        while (llIIIlllIlI(i2, lIlIlIlIlllIllI)) {
            lIlIlIlIlllllll.append((char) (charArray2[i2] ^ charArray[lIlIlIlIlllllIl % charArray.length]));
            "".length();
            lIlIlIlIlllllIl++;
            i2++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lIlIlIlIlllllll);
    }
}
