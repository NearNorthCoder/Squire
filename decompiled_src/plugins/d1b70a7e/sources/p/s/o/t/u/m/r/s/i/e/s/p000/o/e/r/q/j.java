package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Fishing", priority = 7, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.j  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/j.class */
public class j extends l {
    private static /* synthetic */ int[] lIIllIllIlllI;
    private static /* synthetic */ String[] lIIllIllIllIl;

    private static void lIllIIIlIlIllll() {
        lIIllIllIllIl = new String[lIIllIllIlllI[2]];
        lIIllIllIllIl[lIIllIllIlllI[1]] = lIllIIIlIlIlllI("sq6acRm8sLNVZhsSJmA8JkquhPjbG/dl/2oN2wTriJI=", "tHTMr");
        lIIllIllIllIl[lIIllIllIlllI[0]] = lIllIIIlIlIlllI("VUiFN9371T8=", "njxlk");
    }

    private static boolean lIllIIIlIllIllI(int i, int i2) {
        return i <= i2;
    }

    private static String lIllIIIlIlIlllI(String llllllllllllllIlllIlllIIIllIlIII, String llllllllllllllIlllIlllIIIllIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIIllIIlll.getBytes(StandardCharsets.UTF_8)), lIIllIllIlllI[9]), "DES");
            Cipher llllllllllllllIlllIlllIIIllIlIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIIIllIlIlI.init(lIIllIllIlllI[2], secretKeySpec);
            return new String(llllllllllllllIlllIlllIIIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIIIllIlIIl) {
            llllllllllllllIlllIlllIIIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIlIllIIII() {
        lIIllIllIlllI = new int[10];
        lIIllIllIlllI[0] = " ".length();
        lIIllIllIlllI[1] = (3 ^ 6) & ((125 ^ 120) ^ (-1));
        lIIllIllIlllI[2] = "  ".length();
        lIIllIllIlllI[3] = (-((-2054) & 20439)) & (-2049) & 61439;
        lIIllIllIlllI[4] = (13 ^ 80) ^ (197 ^ 156);
        lIIllIllIlllI[5] = (-5301) & 15869;
        lIIllIllIlllI[6] = (-16411) & 26975;
        lIIllIllIlllI[7] = (-1543) & 12110;
        lIIllIllIlllI[8] = (((115 + 151) - 167) + 62) ^ (((41 + 116) - 122) + 146);
        lIIllIllIlllI[9] = 80 ^ 88;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        if (lIllIIIlIllIIIl(this.ar.L() ? 1 : 0) && lIllIIIlIllIIlI(this.au.f(), this.as.numberOfFish())) {
            ?? r0 = lIIllIllIlllI[0];
            "".length();
            return 0 != 0 ? ((18 ^ 79) ^ (24 ^ 125)) & (((((51 + 132) - 52) + 32) ^ (((94 + 48) - 1) + 14)) ^ (-" ".length())) : r0;
        }
        return lIIllIllIlllI[1];
    }

    private static boolean lIllIIIlIllIlII(int i) {
        return i != 0;
    }

    @Inject
    protected j(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    static {
        lIllIIIlIllIIII();
        lIllIIIlIlIllll();
    }

    private static boolean lIllIIIlIllIlIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIIIlIllIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean b(c cVar) {
        if (lIllIIIlIllIlII(this.au.a(cVar.ag()) ? 1 : 0)) {
            return this.au.e(cVar.ag());
        }
        this.au.b(cVar.ag());
        "".length();
        return lIIllIllIlllI[0];
    }

    private static boolean lIllIIIlIllIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        Player local = Players.getLocal();
        if (lIllIIIlIllIIll(local)) {
            return lIIllIllIlllI[1];
        }
        int a = this.au.a();
        c N = this.ar.N();
        if (lIllIIIlIllIIlI(a, lIIllIllIlllI[2])) {
            return lIIllIllIlllI[1];
        }
        int[] iArr = new int[lIIllIllIlllI[0]];
        iArr[lIIllIllIlllI[1]] = lIIllIllIlllI[3];
        GameObject nearest = TileObjects.getNearest(iArr);
        if (lIllIIIlIllIlII(nearest instanceof GameObject ? 1 : 0) && lIllIIIlIllIlII(nearest.getWorldArea().contains(local.getWorldLocation()) ? 1 : 0)) {
            System.out.println(lIIllIllIllIl[lIIllIllIlllI[1]]);
        }
        Locatable locatable = null;
        if (lIllIIIlIllIIlI(this.au.f(), this.as.numberOfFish() - lIIllIllIlllI[4])) {
            locatable = NPCs.getNearest(npc -> {
                if (lIllIIIlIllIlIl(lIIllIllIlllI[5], npc.getId()) && lIllIIIlIllIllI(npc.getWorldLocation().distanceTo(N.ah()), lIIllIllIlllI[8]) && lIllIIIlIllIlII(this.au.c(this.au.a(npc)) ? 1 : 0)) {
                    ?? r0 = lIIllIllIlllI[0];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIIllIllIlllI[1];
            });
        }
        if (lIllIIIlIllIIll(locatable)) {
            locatable = NPCs.getNearest(npc2 -> {
                if (lIllIIIlIllIlII(Set.of(Integer.valueOf(lIIllIllIlllI[6]), Integer.valueOf(lIIllIllIlllI[7]), Integer.valueOf(lIIllIllIlllI[5])).contains(Integer.valueOf(npc2.getId())) ? 1 : 0) && lIllIIIlIllIllI(npc2.getWorldLocation().distanceTo(N.ah()), lIIllIllIlllI[8]) && lIllIIIlIllIlII(this.au.c(this.au.a(npc2)) ? 1 : 0)) {
                    ?? r0 = lIIllIllIlllI[0];
                    "".length();
                    return (-" ".length()) > "   ".length() ? ((((153 + 42) - 192) + 162) ^ (((138 + 34) - 64) + 34)) & (((74 ^ 9) ^ (22 ^ 126)) ^ (-" ".length())) : r0;
                }
                return lIIllIllIlllI[1];
            });
        }
        if (lIllIIIlIllIIll(locatable)) {
            return b(N);
        }
        if (lIllIIIlIllIlII(this.au.a(locatable) ? 1 : 0) && lIllIIIlIllIlII(this.au.c(local.getWorldLocation()) ? 1 : 0)) {
            return lIIllIllIlllI[0];
        }
        if (lIllIIIlIllIlII(local.getInteracting() instanceof NPC ? 1 : 0) && lIllIIIlIllIlII(this.au.c(local.getWorldLocation()) ? 1 : 0) && ((!lIllIIIlIllIlIl(locatable.getId(), lIIllIllIlllI[5]) || lIllIIIlIllIlIl(local.getInteracting().getId(), lIIllIllIlllI[5])) && lIllIIIlIllIIIl(Dialog.isOpen() ? 1 : 0))) {
            return lIIllIllIlllI[0];
        }
        locatable.interact(lIIllIllIllIl[lIIllIllIlllI[0]]);
        return lIIllIllIlllI[0];
    }

    private static boolean lIllIIIlIllIIlI(int i, int i2) {
        return i < i2;
    }
}
