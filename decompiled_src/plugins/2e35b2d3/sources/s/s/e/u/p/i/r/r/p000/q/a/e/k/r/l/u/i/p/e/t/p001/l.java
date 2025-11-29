package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import com.google.inject.Inject;
import com.openosrs.client.game.NPCManager;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Killing Blow", blocking = true)
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.l  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/l.class */
public class l extends Task {
    private static /* synthetic */ int[] lIlIIlIIIlIll;
    private final /* synthetic */ SquireSkipperPlugin H;
    private static /* synthetic */ String[] lIlIIlIIIlIlI;
    private final /* synthetic */ NPCManager I;

    private static boolean lIlllIlIIIlIIll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    public boolean run() {
        if (!lIlllIlIIIIllll(Players.getLocal().getInteracting()) && !lIlllIlIIIlIIII(this.H.b(), b.LIZARDS)) {
            List<NPC> all = NPCs.getAll(npc -> {
                if (lIlllIlIIIlIllI(npc.getInteracting(), Players.getLocal())) {
                    String[] strArr = new String[lIlIIlIIIlIll[1]];
                    strArr[lIlIIlIIIlIll[0]] = lIlIIlIIIlIlI[lIlIIlIIIlIll[0]];
                    if (lIlllIlIIIlIIlI(npc.hasAction(strArr) ? 1 : 0) && lIlllIlIIIlIlII(npc.getWorldLocation().distanceTo(Players.getLocal()), lIlIIlIIIlIll[4])) {
                        ?? r0 = lIlIIlIIIlIll[1];
                        "".length();
                        return (((176 ^ 152) ^ (130 ^ 138)) & (((((87 + 52) - 124) + 146) ^ (((66 + 40) - 93) + 116)) ^ (-" ".length()))) != 0 ? ((29 ^ 49) ^ (52 ^ 49)) & (((((91 + 2) - 64) + 99) ^ (((13 + 168) - 113) + 101)) ^ (-" ".length())) : r0;
                    }
                }
                return lIlIIlIIIlIll[0];
            });
            int[] iArr = new int[lIlIIlIIIlIll[1]];
            iArr[lIlIIlIIIlIll[0]] = lIlIIlIIIlIll[2];
            Item first = Inventory.getFirst(iArr);
            if (lIlllIlIIIlIIIl(all.isEmpty() ? 1 : 0)) {
                for (NPC npc2 : all) {
                    int b = b(npc2);
                    if (lIlllIlIIIlIIll(b, lIlIIlIIIlIll[3]) && lIlllIlIIIlIlII(b, lIlIIlIIIlIll[1])) {
                        System.out.println(b);
                        NPC npc3 = (NPC) all.get(lIlIIlIIIlIll[0]);
                        if (lIlllIlIIIlIlIl(first) && lIlllIlIIIlIllI(Players.getLocal().getInteracting(), npc3)) {
                            first.useOn(npc3);
                            sleep(lIlIIlIIIlIll[4]);
                            return lIlIIlIIIlIll[1];
                        }
                    }
                    "".length();
                    if (" ".length() != " ".length()) {
                        return ((68 ^ 50) ^ (180 ^ 151)) & (((133 ^ 170) ^ (94 ^ 36)) ^ (-" ".length()));
                    }
                }
            }
            return lIlIIlIIIlIll[0];
        }
        return lIlIIlIIIlIll[0];
    }

    static {
        lIlllIlIIIIlllI();
        lIlllIlIIIIllIl();
    }

    private static boolean lIlllIlIIIlIlII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlllIlIIIlIlll(int i) {
        return i >= 0;
    }

    private static void lIlllIlIIIIllIl() {
        lIlIIlIIIlIlI = new String[lIlIIlIIIlIll[1]];
        lIlIIlIIIlIlI[lIlIIlIIIlIll[0]] = lIlllIlIIIIllII("38vR9utZ2YE=", "plkOq");
    }

    private static boolean lIlllIlIIIlIIlI(int i) {
        return i != 0;
    }

    private static boolean lIlllIlIIIIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlllIlIIIlIIII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIlllIlIIIIllII(String llllllllllllllIllIllllIIIlIIlllI, String llllllllllllllIllIllllIIIlIIllIl) {
        try {
            SecretKeySpec llllllllllllllIllIllllIIIlIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIllllIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIIIlIll[5]), "DES");
            Cipher llllllllllllllIllIllllIIIlIlIIII = Cipher.getInstance("DES");
            llllllllllllllIllIllllIIIlIlIIII.init(lIlIIlIIIlIll[6], llllllllllllllIllIllllIIIlIlIIIl);
            return new String(llllllllllllllIllIllllIIIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIllllIIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIllllIIIlIIllll) {
            llllllllllllllIllIllllIIIlIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIIllIII(int i) {
        return i <= 0;
    }

    private int b(NPC npc) {
        if (!lIlllIlIIIlIlIl(npc) || lIlllIlIIIIllll(npc.getName())) {
            return lIlIIlIIIlIll[3];
        }
        int healthScale = npc.getHealthScale();
        int healthRatio = npc.getHealthRatio();
        return (!lIlllIlIIIlIlll(healthRatio) || lIlllIlIIIllIII(healthScale)) ? lIlIIlIIIlIll[3] : (int) (((Integer.valueOf(this.I.getHealth(npc.getId())).intValue() * healthRatio) / healthScale) + 0.5f);
    }

    private static boolean lIlllIlIIIlIIIl(int i) {
        return i == 0;
    }

    private static boolean lIlllIlIIIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIlllIlIIIIlllI() {
        lIlIIlIIIlIll = new int[7];
        lIlIIlIIIlIll[0] = ((28 ^ 105) ^ (228 ^ 150)) & (((136 ^ 149) ^ (77 ^ 87)) ^ (-" ".length()));
        lIlIIlIIIlIll[1] = " ".length();
        lIlIIlIIIlIll[2] = (-((-6281) & 32221)) & (-2) & 32637;
        lIlIIlIIIlIll[3] = -" ".length();
        lIlIIlIIIlIll[4] = 191 ^ 187;
        lIlIIlIIIlIll[5] = (78 ^ 106) ^ (127 ^ 83);
        lIlIIlIIIlIll[6] = "  ".length();
    }

    @Inject
    public l(SquireSkipperPlugin squireSkipperPlugin, NPCManager nPCManager) {
        this.H = squireSkipperPlugin;
        this.I = nPCManager;
    }

    private static boolean lIlllIlIIIlIlIl(Object obj) {
        return obj != null;
    }
}
