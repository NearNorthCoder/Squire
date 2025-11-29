package i.e.e.f.s.q.i.e.h.r.p000.r.u.s.l.a.p001.r.i.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Fishing", priority = 5)
/* renamed from: i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a.b  reason: invalid package */
/* loaded from: 9bb83689-ff7d-471d-9a08-411d7484ad87.jar:i/e/e/f/s/q/i/e/h/r/-/r/u/s/l/a/-/r/i/a/b.class */
public class b extends Task {
    private static /* synthetic */ String[] lIlIlllIIII;
    private static /* synthetic */ int[] lIlIlllIIIl;
    private static final /* synthetic */ int k;
    private static final /* synthetic */ Predicate<NPC> j;

    private static boolean lIIlIIllllIIIl(int i2) {
        return i2 == 0;
    }

    private static void lIIlIIlllIlllI() {
        lIlIlllIIII = new String[lIlIlllIIIl[5]];
        lIlIlllIIII[lIlIlllIIIl[1]] = lIIlIIlllIllII("CLgiRPzkZog=", "fIqeZ");
        lIlIlllIIII[lIlIlllIIIl[3]] = lIIlIIlllIllIl("CxCuJPDjgsFslrMybHc9xA==", "SYTUr");
    }

    private static String lIIlIIlllIllIl(String llllllllllllllllIlIlIlllIllIlllI, String llllllllllllllllIlIlIlllIllIllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlllIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlllIllIllIl.getBytes(StandardCharsets.UTF_8)), lIlIlllIIIl[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlllIIIl[5], llllllllllllllllIlIlIlllIlllIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlllIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlllIllIllll) {
            llllllllllllllllIlIlIlllIllIllll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlllIllII(String llllllllllllllllIlIlIlllIllIIIIl, String llllllllllllllllIlIlIlllIllIIIII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlllIllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlllIllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIlllIllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIlllIllIIIll.init(lIlIlllIIIl[5], llllllllllllllllIlIlIlllIllIIlII);
            return new String(llllllllllllllllIlIlIlllIllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlllIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlllIllIIIlI) {
            llllllllllllllllIlIlIlllIllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllllIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIllllIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIllllIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIIllllIlII(int i2, int i3) {
        return i2 <= i3;
    }

    private static void lIIlIIlllIllll() {
        lIlIlllIIIl = new int[13];
        lIlIlllIIIl[0] = (((41 + 148) - 112) + 121) ^ (((141 + 123) - 130) + 60);
        lIlIlllIIIl[1] = (18 ^ 43) & ((173 ^ 148) ^ (-1));
        lIlIlllIIIl[2] = (-(((69 + 47) - 76) + 105)) & (-9222) & 32191;
        lIlIlllIIIl[3] = " ".length();
        lIlIlllIIIl[4] = (-145) & 22973;
        lIlIlllIIIl[5] = "  ".length();
        lIlIlllIIIl[6] = (-((-19715) & 28559)) & (-1090) & 32765;
        lIlIlllIIIl[7] = "   ".length();
        lIlIlllIIIl[8] = (-705) & 23539;
        lIlIlllIIIl[9] = (-((-917) & 5085)) & (-8197) & 13310;
        lIlIlllIIIl[10] = (-6431) & 8062;
        lIlIlllIIIl[11] = 161 ^ 174;
        lIlIlllIIIl[12] = 163 ^ 171;
    }

    private static boolean lIIlIIllllIIlI(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    public boolean run() {
        NPC npc;
        int[] iArr = new int[lIlIlllIIIl[0]];
        iArr[lIlIlllIIIl[1]] = lIlIlllIIIl[2];
        iArr[lIlIlllIIIl[3]] = lIlIlllIIIl[4];
        iArr[lIlIlllIIIl[5]] = lIlIlllIIIl[6];
        iArr[lIlIlllIIIl[7]] = lIlIlllIIIl[8];
        Item first = Inventory.getFirst(iArr);
        if (lIIlIIllllIIII(first)) {
            int[] iArr2 = new int[lIlIlllIIIl[3]];
            iArr2[lIlIlllIIIl[1]] = lIlIlllIIIl[9];
            first.useOn(Inventory.getFirst(iArr2));
        }
        int[] iArr3 = new int[lIlIlllIIIl[3]];
        iArr3[lIlIlllIIIl[1]] = lIlIlllIIIl[10];
        Projectile nearest = Projectiles.getNearest(iArr3);
        if (lIIlIIllllIIII(nearest) && lIIlIIllllIIIl(nearest.getTarget().equals(Players.getLocal().getLocalLocation()) ? 1 : 0)) {
            return lIlIlllIIIl[3];
        }
        NPC nearest2 = NPCs.getNearest(npc2 -> {
            if (lIIlIIllllIIlI(j.test(npc2) ? 1 : 0) && lIIlIIllllIIll(Static.getClient().getHintArrowNpc(), npc2)) {
                ?? r0 = lIlIlllIIIl[3];
                "".length();
                return "   ".length() != "   ".length() ? (false ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIlllIIIl[1];
        });
        NPC nearest3 = NPCs.getNearest(j);
        if (lIIlIIllllIIII(nearest2)) {
            npc = nearest2;
            "".length();
            if (!(true ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            npc = nearest3;
        }
        NPC npc3 = npc;
        if (lIIlIIllllIIII(npc3)) {
            npc3.interact(lIlIlllIIII[lIlIlllIIIl[1]]);
        }
        return lIlIlllIIIl[3];
    }

    static {
        lIIlIIlllIllll();
        lIIlIIlllIlllI();
        k = lIlIlllIIIl[10];
        j = npc -> {
            if (lIIlIIllllIIII(npc.getName()) && lIIlIIllllIIlI(npc.getName().equals(lIlIlllIIII[lIlIlllIIIl[3]]) ? 1 : 0) && lIIlIIllllIlII(npc.distanceTo(Players.getLocal()), lIlIlllIIIl[11]) && lIIlIIllllIlIl(Players.getNearest(player -> {
                if (lIIlIIllllIIII(player.getInteracting()) && lIIlIIllllIIlI(player.getInteracting().equals(npc) ? 1 : 0)) {
                    ?? r0 = lIlIlllIIIl[3];
                    "".length();
                    return (113 ^ 117) <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIlllIIIl[1];
            })) && lIIlIIllllIlIl(Projectiles.getNearest(projectile -> {
                if (lIIlIIllllIIII(projectile.getTarget()) && lIIlIIllllIIlI(projectile.getTarget().equals(npc.getLocalLocation()) ? 1 : 0)) {
                    ?? r0 = lIlIlllIIIl[3];
                    "".length();
                    return (-" ".length()) > ((20 ^ 1) & ((40 ^ 61) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIlllIIIl[1];
            }))) {
                ?? r0 = lIlIlllIIIl[3];
                "".length();
                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIlllIIIl[1];
        };
    }
}
