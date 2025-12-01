package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
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
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.F  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/F.class */
public class F extends Task {
    private static /* synthetic */ int[] lIIlIlIlIlIlI;
    private static /* synthetic */ String[] lIIlIlIlIIIlI;
    private final /* synthetic */ SquireSaraConfig aL;
    private final /* synthetic */ C0006g aK;

    @Inject
    public F(C0006g c0006g, SquireSaraConfig squireSaraConfig) {
        this.aK = c0006g;
        this.aL = squireSaraConfig;
    }

    private static boolean lIlIllIIIIIllIl(Object obj) {
        return obj != null;
    }

    private static String lIlIlIllllIllII(String llllllllllllllIllllIlllIIIIlIIll, String llllllllllllllIllllIlllIIIIlIlll) {
        String llllllllllllllIllllIlllIIIIlIIll2 = new String(Base64.getDecoder().decode(llllllllllllllIllllIlllIIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllllIlllIIIIlIlll.toCharArray();
        int llllllllllllllIllllIlllIIIIlIlII = lIIlIlIlIlIlI[0];
        char[] charArray2 = llllllllllllllIllllIlllIIIIlIIll2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIlIlIlI[0];
        while (lIlIllIIIIlIIlI(i, length)) {
            char llllllllllllllIllllIlllIIIIllIIl = charArray2[i];
            sb.append((char) (llllllllllllllIllllIlllIIIIllIIl ^ charArray[llllllllllllllIllllIlllIIIIlIlII % charArray.length]));
            "".length();
            llllllllllllllIllllIlllIIIIlIlII++;
            i++;
            "".length();
            if ("  ".length() <= ((99 ^ 36) & ((203 ^ 140) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIlIlIllllIllIl() {
        lIIlIlIlIIIlI = new String[lIIlIlIlIlIlI[5]];
        lIIlIlIlIIIlI[lIIlIlIlIlIlI[0]] = lIlIlIllllIlIll("EtR23J69z0+YYwDtSNMWwg==", "IlcUs");
        lIIlIlIlIIIlI[lIIlIlIlIlIlI[1]] = lIlIlIllllIllII("GyISGBQ=", "LKwtp");
        lIIlIlIlIIIlI[lIIlIlIlIlIlI[4]] = lIlIlIllllIllII("OTMNMAAT", "xGyQc");
    }

    static {
        lIlIllIIIIIlIlI();
        lIlIlIllllIllIl();
    }

    private static String lIlIlIllllIlIll(String llllllllllllllIllllIlllIIIIIIIll, String llllllllllllllIllllIlllIIIIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIlllIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIlIlI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlIlIlIlI[4], llllllllllllllIllllIlllIIIIIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlllIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlllIIIIIIlII) {
            llllllllllllllIllllIlllIIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIIIlllI(int i) {
        return i == 0;
    }

    private static boolean lIlIllIIIIlIIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIllIIIIIllII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIllIIIIlIIlI(int i, int i2) {
        return i < i2;
    }

    private NPC X() {
        int[] iArr = new int[lIIlIlIlIlIlI[1]];
        iArr[lIIlIlIlIlIlI[0]] = k.STARLIGHT.D();
        NPC nearest = NPCs.getNearest(iArr);
        if (lIlIllIIIIIllIl(nearest) && lIlIllIIIIIlllI(nearest.isDead() ? 1 : 0)) {
            return nearest;
        }
        int[] iArr2 = new int[lIIlIlIlIlIlI[1]];
        iArr2[lIIlIlIlIlIlI[0]] = k.GROWLER.D();
        NPC nearest2 = NPCs.getNearest(iArr2);
        return (lIlIllIIIIIllIl(nearest2) && lIlIllIIIIIlllI(nearest2.isDead() ? 1 : 0)) ? nearest2 : NPCs.getNearest(npc -> {
            if (lIlIllIIIIIlllI(npc.isDead() ? 1 : 0) && lIlIllIIIIlIIIl(npc.getId(), k.BREE.D())) {
                ?? r0 = lIIlIlIlIlIlI[1];
                "".length();
                return !(true ^ true) ? "  ".length() & ("  ".length() ^ (-1)) : r0;
            }
            return lIIlIlIlIlIlI[0];
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlIllIIIIIlIll(this.aK.m() ? 1 : 0) || lIlIllIIIIIlIll(this.aK.l() ? 1 : 0)) {
            return lIIlIlIlIlIlI[0];
        }
        NPC X = X();
        if (!lIlIllIIIIIllII(X) && !lIlIllIIIIIllIl(Players.getLocal().getInteracting())) {
            if (lIlIllIIIIIlIll(this.aL.useBlowpipe() ? 1 : 0)) {
                String[] strArr = new String[lIIlIlIlIlIlI[1]];
                strArr[lIIlIlIlIlIlI[0]] = lIIlIlIlIIIlI[lIIlIlIlIlIlI[0]];
                Item first = Inventory.getFirst(strArr);
                if (lIlIllIIIIIllIl(first)) {
                    first.interact(lIIlIlIlIIIlI[lIIlIlIlIlIlI[1]]);
                    return lIIlIlIlIlIlI[1];
                } else if (lIlIllIIIIIlllI(Combat.isSpecEnabled() ? 1 : 0) && lIlIllIIIIIllll(Combat.getSpecEnergy(), lIIlIlIlIlIlI[2]) && lIlIllIIIIlIIII(Combat.getMissingHealth(), lIIlIlIlIlIlI[3])) {
                    Combat.toggleSpec();
                }
            }
            X.interact(lIIlIlIlIIIlI[lIIlIlIlIlIlI[4]]);
            sleep(lIIlIlIlIlIlI[4]);
            return lIIlIlIlIlIlI[1];
        }
        return lIIlIlIlIlIlI[0];
    }

    private static void lIlIllIIIIIlIlI() {
        lIIlIlIlIlIlI = new int[7];
        lIIlIlIlIlIlI[0] = ((237 ^ 169) ^ (90 ^ 36)) & (((175 ^ 163) ^ (93 ^ 107)) ^ (-" ".length()));
        lIIlIlIlIlIlI[1] = " ".length();
        lIIlIlIlIlIlI[2] = 39 ^ 21;
        lIIlIlIlIlIlI[3] = 5 ^ 15;
        lIIlIlIlIlIlI[4] = "  ".length();
        lIIlIlIlIlIlI[5] = "   ".length();
        lIIlIlIlIlIlI[6] = 181 ^ 189;
    }

    private static boolean lIlIllIIIIlIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIllIIIIIllll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIllIIIIIlIll(int i) {
        return i != 0;
    }
}
