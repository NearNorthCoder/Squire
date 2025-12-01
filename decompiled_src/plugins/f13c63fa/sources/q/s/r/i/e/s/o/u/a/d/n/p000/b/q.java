package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Killing minions")
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.q  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/q.class */
public class q extends Task {
    private static /* synthetic */ String[] lllIIIlllII;
    private final /* synthetic */ e aa;
    private static /* synthetic */ int[] lllIIIlllIl;
    private final /* synthetic */ SquireBandosConfig ab;

    static {
        lIlIlllIIlIlIl();
        lIlIlllIIlIlII();
    }

    private NPC N() {
        int[] iArr = new int[lllIIIlllIl[1]];
        iArr[lllIIIlllIl[0]] = b.STEELWILL.d();
        NPC nearest = NPCs.getNearest(iArr);
        if (lIlIlllIIllIII(nearest) && lIlIlllIIllIIl(nearest.isDead() ? 1 : 0)) {
            return nearest;
        }
        int[] iArr2 = new int[lllIIIlllIl[1]];
        iArr2[lllIIIlllIl[0]] = b.STRONGSACK.d();
        NPC nearest2 = NPCs.getNearest(iArr2);
        return (lIlIlllIIllIII(nearest2) && lIlIlllIIllIIl(nearest2.isDead() ? 1 : 0)) ? nearest2 : NPCs.getNearest(npc -> {
            if (lIlIlllIIllIIl(npc.isDead() ? 1 : 0) && lIlIlllIIlllII(npc.getId(), b.GRIMSPIKE.d())) {
                ?? r0 = lllIIIlllIl[1];
                "".length();
                return ((91 ^ 17) & ((236 ^ 166) ^ (-1))) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIIlllIl[0];
        });
    }

    private static String lIlIlllIIlIIIl(String llllllllllllllllIIlIIllIIIlIIIIl, String llllllllllllllllIIlIIllIIIlIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIIlIIIII.getBytes(StandardCharsets.UTF_8)), lllIIIlllIl[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlllIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIIIlIIIlI) {
            llllllllllllllllIIlIIllIIIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIllIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIlllIIlIlll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlIlllIIlIllI(this.aa.t() ? 1 : 0) || lIlIlllIIlIllI(this.aa.s() ? 1 : 0)) {
            return lllIIIlllIl[0];
        }
        NPC N = N();
        if (!lIlIlllIIlIlll(N) && !lIlIlllIIllIII(Players.getLocal().getInteracting())) {
            if (lIlIlllIIlIllI(this.ab.useBlowpipe() ? 1 : 0)) {
                String[] strArr = new String[lllIIIlllIl[1]];
                strArr[lllIIIlllIl[0]] = lllIIIlllII[lllIIIlllIl[0]];
                Item first = Inventory.getFirst(strArr);
                if (lIlIlllIIllIII(first)) {
                    first.interact(lllIIIlllII[lllIIIlllIl[1]]);
                    return lllIIIlllIl[1];
                } else if (lIlIlllIIllIIl(Combat.isSpecEnabled() ? 1 : 0) && lIlIlllIIllIlI(Combat.getSpecEnergy(), lllIIIlllIl[2]) && lIlIlllIIllIll(Combat.getMissingHealth(), lllIIIlllIl[3])) {
                    Combat.toggleSpec();
                }
            }
            N.interact(lllIIIlllII[lllIIIlllIl[4]]);
            sleep(lllIIIlllIl[4]);
            return lllIIIlllIl[1];
        }
        return lllIIIlllIl[0];
    }

    private static boolean lIlIlllIIllIIl(int i) {
        return i == 0;
    }

    private static boolean lIlIlllIIlllII(int i, int i2) {
        return i == i2;
    }

    private static String lIlIlllIIlIIlI(String llllllllllllllllIIlIIllIIIIlIlII, String llllllllllllllllIIlIIllIIIIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIIIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIIIIlIllI.init(lllIIIlllIl[4], secretKeySpec);
            return new String(llllllllllllllllIIlIIllIIIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIIIIlIlIl) {
            llllllllllllllllIIlIIllIIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIlIllI(int i) {
        return i != 0;
    }

    private static void lIlIlllIIlIlII() {
        lllIIIlllII = new String[lllIIIlllIl[5]];
        lllIIIlllII[lllIIIlllIl[0]] = lIlIlllIIlIIIl("nHD6iZbUEUZ/5qNTAswTiA==", "DDZkf");
        lllIIIlllII[lllIIIlllIl[1]] = lIlIlllIIlIIlI("0KCJ96ECCeE=", "uzCtN");
        lllIIIlllII[lllIIIlllIl[4]] = lIlIlllIIlIIll("JB43MDYO", "ejCQU");
    }

    private static void lIlIlllIIlIlIl() {
        lllIIIlllIl = new int[7];
        lllIIIlllIl[0] = ((72 ^ 23) ^ (94 ^ 66)) & (((48 ^ 54) ^ (84 ^ 17)) ^ (-" ".length()));
        lllIIIlllIl[1] = " ".length();
        lllIIIlllIl[2] = 2 ^ 48;
        lllIIIlllIl[3] = (((80 + 34) - 21) + 63) ^ (((52 + 57) - 5) + 46);
        lllIIIlllIl[4] = "  ".length();
        lllIIIlllIl[5] = "   ".length();
        lllIIIlllIl[6] = (96 ^ 76) ^ (147 ^ 183);
    }

    @Inject
    public q(e eVar, SquireBandosConfig squireBandosConfig) {
        this.aa = eVar;
        this.ab = squireBandosConfig;
    }

    private static boolean lIlIlllIIlllIl(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlllIIlIIll(String llllllllllllllllIIlIIllIIIIIIlII, String llllllllllllllllIIlIIllIIIIIIIll) {
        String llllllllllllllllIIlIIllIIIIIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIIllIIIIIIIIl = llllllllllllllllIIlIIllIIIIIIIll.toCharArray();
        int llllllllllllllllIIlIIllIIIIIIIII = lllIIIlllIl[0];
        char[] charArray = llllllllllllllllIIlIIllIIIIIIlII2.toCharArray();
        int length = charArray.length;
        int i = lllIIIlllIl[0];
        while (lIlIlllIIlllIl(i, length)) {
            char llllllllllllllllIIlIIllIIIIIIlIl = charArray[i];
            sb.append((char) (llllllllllllllllIIlIIllIIIIIIlIl ^ llllllllllllllllIIlIIllIIIIIIIIl[llllllllllllllllIIlIIllIIIIIIIII % llllllllllllllllIIlIIllIIIIIIIIl.length]));
            "".length();
            llllllllllllllllIIlIIllIIIIIIIII++;
            i++;
            "".length();
            if ((-"   ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlllIIllIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlllIIllIII(Object obj) {
        return obj != null;
    }
}
