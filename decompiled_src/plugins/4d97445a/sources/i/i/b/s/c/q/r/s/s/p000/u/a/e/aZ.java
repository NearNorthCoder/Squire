package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Attacking Chompy", priority = 100, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aZ  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aZ.class */
public class aZ extends Task {
    private static /* synthetic */ String[] llIlllll;
    private static /* synthetic */ int[] lllIIIIl;

    private static void llIIIllIll() {
        llIlllll = new String[lllIIIIl[5]];
        llIlllll[lllIIIIl[1]] = llIIIlIIll("QHlumTXhoEk=", "AaIuX");
        llIlllll[lllIIIIl[3]] = llIIIlIlII("oLStvShw2HVd0LkeabpGwA==", "ZmZNr");
        llIlllll[lllIIIIl[2]] = llIIIlIlII("ZZyQnrkc5eY=", "GzsEH");
        llIlllll[lllIIIIl[4]] = llIIIlIIll("x57yB/IohOs=", "XlafY");
    }

    private static void llIIIlllII() {
        lllIIIIl = new int[7];
        lllIIIIl[0] = (-((-12289) & 31726)) & (-4113) & 24575;
        lllIIIIl[1] = ((201 ^ 185) ^ (211 ^ 158)) & (((((125 + 21) - 22) + 31) ^ (((64 + 98) - 74) + 78)) ^ (-" ".length()));
        lllIIIIl[2] = "  ".length();
        lllIIIIl[3] = " ".length();
        lllIIIIl[4] = "   ".length();
        lllIIIIl[5] = (64 ^ 68) ^ ((19 ^ 73) & ((82 ^ 8) ^ (-1)));
        lllIIIIl[6] = 57 ^ 49;
    }

    private static String llIIIlIlII(String llIlIlIIIIlIIlI, String llIlIlIIIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIlIIIIlIIll) {
            llIlIlIIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static String llIIIlIIll(String llIlIlIIIIlllll, String llIlIlIIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIlIIIIllllI.getBytes(StandardCharsets.UTF_8)), lllIIIIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIlIlIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIlIIIlIIIII) {
            llIlIlIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIIII(int i2) {
        return i2 != 0;
    }

    static {
        llIIIlllII();
        llIIIllIll();
    }

    private static boolean llIIIlllIl(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean run() {
        NPC attackableNPC = Combat.getAttackableNPC(npc -> {
            if (llIIlIIIII(npc.getName().equals(llIlllll[lllIIIIl[3]]) ? 1 : 0) && llIIlIIIIl(npc.isDead() ? 1 : 0)) {
                String[] strArr = new String[lllIIIIl[3]];
                strArr[lllIIIIl[1]] = llIlllll[lllIIIIl[2]];
                if (llIIlIIIII(npc.hasAction(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIIIl[3]];
                    strArr2[lllIIIIl[1]] = llIlllll[lllIIIIl[4]];
                    if (llIIlIIIIl(npc.hasAction(strArr2) ? 1 : 0)) {
                        ?? r0 = lllIIIIl[3];
                        "".length();
                        return 0 != 0 ? ((133 ^ 147) ^ (95 ^ 25)) & (((89 ^ 63) ^ (124 ^ 74)) ^ (-" ".length())) : r0;
                    }
                }
            }
            return lllIIIIl[1];
        });
        if (!llIIIlllIl(Players.getLocal().getAnimation(), lllIIIIl[0]) && !llIIIllllI(Players.getLocal().getInteracting()) && !llIIIlllll(attackableNPC)) {
            attackableNPC.interact(llIlllll[lllIIIIl[1]]);
            sleep(lllIIIIl[2]);
            return lllIIIIl[3];
        }
        return lllIIIIl[1];
    }

    private static boolean llIIlIIIIl(int i2) {
        return i2 == 0;
    }

    private static boolean llIIIlllll(Object obj) {
        return obj == null;
    }

    private static boolean llIIIllllI(Object obj) {
        return obj != null;
    }
}
