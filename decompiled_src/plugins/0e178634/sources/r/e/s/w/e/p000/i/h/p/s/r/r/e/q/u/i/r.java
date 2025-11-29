package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Moving out of melee range", priority = 50, blocking = true, register = true)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.r  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/r.class */
public class r extends u {
    private static /* synthetic */ String[] lIlIlllIlIlIl;
    private static /* synthetic */ int[] lIlIlllIlIllI;
    private static final /* synthetic */ int Y;
    private /* synthetic */ int Z;

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIIIIlIIllIlIl(chatMessage.getMessage().contains(lIlIlllIlIlIl[lIlIlllIlIllI[0]]) ? 1 : 0)) {
            this.Z = lIlIlllIlIllI[5];
        }
    }

    private static void llIIIIlIIllIIll() {
        lIlIlllIlIlIl = new String[lIlIlllIlIllI[1]];
        lIlIlllIlIlIl[lIlIlllIlIllI[0]] = llIIIIlIIllIIlI("iOv4Ei/Q3kOCsKysAFFdNQ/k1l63F1kiOE8Allw5gU+NwOxkgg89Xw==", "ZRTdx");
    }

    private static boolean llIIIIlIIllIllI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        int i;
        int i2;
        if (llIIIIlIIllIlIl(this.W.f() ? 1 : 0)) {
            return lIlIlllIlIllI[0];
        }
        if (llIIIIlIIllIllI(this.Z)) {
            this.Z -= lIlIlllIlIllI[1];
            return lIlIlllIlIllI[0];
        }
        NPC j = this.W.j();
        WorldArea worldArea = j.getWorldArea();
        if (llIIIIlIIllIlll(j.getId(), lIlIlllIlIllI[2])) {
            i = lIlIlllIlIllI[3];
            "".length();
            if ((-"   ".length()) > 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIlIlllIlIllI[4];
        }
        WorldArea offset = worldArea.offset(i);
        if (!llIIIIlIIlllIII(offset.isInMeleeDistance(Players.getLocal().getWorldArea()) ? 1 : 0) || llIIIIlIIllIlIl(offset.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            i2 = lIlIlllIlIllI[1];
            "".length();
            if ("  ".length() <= " ".length()) {
                return ((128 ^ 189) ^ (227 ^ 128)) & (((((225 + 242) - 325) + 102) ^ (((33 + 61) - 53) + 129)) ^ (-" ".length()));
            }
        } else {
            i2 = lIlIlllIlIllI[0];
        }
        if (llIIIIlIIlllIII(i2)) {
            return lIlIlllIlIllI[0];
        }
        WorldPoint worldPoint = (WorldPoint) Players.getLocal().getWorldLocation().createWorldArea(lIlIlllIlIllI[4]).toWorldPointList().stream().filter(worldPoint2 -> {
            if (llIIIIlIIlllIII(offset.isInMeleeDistance(worldPoint2) ? 1 : 0)) {
                ?? r0 = lIlIlllIlIllI[1];
                "".length();
                return ((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true)) ? ((7 ^ 15) ^ (66 ^ 102)) & (((78 ^ 13) ^ (80 ^ 63)) ^ (-" ".length())) : r0;
            }
            return lIlIlllIlIllI[0];
        }).filter(Reachable::isWalkable).max(Comparator.comparingInt(worldPoint3 -> {
            return worldPoint3.distanceTo2D(offset.getCenter());
        })).orElse(null);
        if (llIIIIlIIlllIIl(worldPoint)) {
            return lIlIlllIlIllI[0];
        }
        Movement.setDestination(worldPoint);
        return lIlIlllIlIllI[1];
    }

    static {
        llIIIIlIIllIlII();
        llIIIIlIIllIIll();
        Y = lIlIlllIlIllI[4];
    }

    private static void llIIIIlIIllIlII() {
        lIlIlllIlIllI = new int[7];
        lIlIlllIlIllI[0] = (148 ^ 161) & ((184 ^ 141) ^ (-1));
        lIlIlllIlIllI[1] = " ".length();
        lIlIlllIlIllI[2] = (-20547) & 32751;
        lIlIlllIlIllI[3] = 53 ^ 51;
        lIlIlllIlIllI[4] = "  ".length();
        lIlIlllIlIllI[5] = (((45 + 131) - 73) + 34) ^ (((101 + 32) - 46) + 53);
        lIlIlllIlIllI[6] = (187 ^ 132) ^ (1 ^ 54);
    }

    private static boolean llIIIIlIIlllIII(int i) {
        return i == 0;
    }

    private static boolean llIIIIlIIlllIIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIlIIllIlIl(int i) {
        return i != 0;
    }

    private static String llIIIIlIIllIIlI(String llllllllllllllIllIIllllllIllllll, String llllllllllllllIllIIllllllIlllllI) {
        try {
            SecretKeySpec llllllllllllllIllIIlllllllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllllllIlllllI.getBytes(StandardCharsets.UTF_8)), lIlIlllIlIllI[6]), "DES");
            Cipher llllllllllllllIllIIlllllllIIIIIl = Cipher.getInstance("DES");
            llllllllllllllIllIIlllllllIIIIIl.init(lIlIlllIlIllI[4], llllllllllllllIllIIlllllllIIIIlI);
            return new String(llllllllllllllIllIIlllllllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllllllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllllllIIIIII) {
            llllllllllllllIllIIlllllllIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIlIIllIlll(int i, int i2) {
        return i == i2;
    }
}
