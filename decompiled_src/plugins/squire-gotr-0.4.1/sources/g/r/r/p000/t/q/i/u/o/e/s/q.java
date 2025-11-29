package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Entering Altar", priority = 2, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.q  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/q.class */
public class q extends h {
    private static /* synthetic */ int[] llIIlllIIIlI;
    private static /* synthetic */ String[] llIIlllIIIIl;

    private static boolean lllllllIIIIlII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        int i;
        int i2;
        d h = this.aV.h();
        if (lllllllIIIIlII(h)) {
            return llIIlllIIIlI[1];
        }
        if (!lllllllIIIIlIl(h.V(), Skills.getLevel(Skill.RUNECRAFT)) || lllllllIIIIllI(this.aV.p())) {
            return llIIlllIIIlI[1];
        }
        if (lllllllIIIIlll(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0)) {
            return llIIlllIIIlI[1];
        }
        Player local = Players.getLocal();
        int q = this.aV.q() - this.aV.p();
        if ((!lllllllIIIIlll(this.aV.E() ? 1 : 0) || lllllllIIIIlIl(this.aV.p(), llIIlllIIIlI[3])) && !(lllllllIIIlIII(this.aV.m(), EnumC0002c.FINISHING) && lllllllIIIlIIl(this.aV.p()))) {
            i = llIIlllIIIlI[1];
        } else {
            i = llIIlllIIIlI[2];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        int i3 = i;
        if (lllllllIIIIllI(i3) && lllllllIIIlIlI(q, Inventory.getFreeSlots()) && lllllllIIIlIll(this.aV.m(), EnumC0002c.FINISHING)) {
            return llIIlllIIIlI[1];
        }
        if (lllllllIIIlIlI(q, llIIlllIIIlI[0]) && lllllllIIIlIIl(this.aV.a())) {
            i2 = llIIlllIIIlI[2];
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = llIIlllIIIlI[1];
        }
        int i4 = i2;
        if (!lllllllIIIIllI(i3) || (lllllllIIIllII(local.getAnimation(), llIIlllIIIlI[4]) && !lllllllIIIIlll(i4))) {
            String[] strArr = new String[llIIlllIIIlI[2]];
            strArr[llIIlllIIIlI[1]] = h.T();
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lllllllIIIIlII(nearest)) {
                return llIIlllIIIlI[1];
            }
            if (lllllllIIIIllI(b((GameObject) nearest) ? 1 : 0)) {
                nearest.interact(llIIlllIIIIl[llIIlllIIIlI[1]]);
            }
            return llIIlllIIIlI[2];
        }
        return llIIlllIIIlI[1];
    }

    private static boolean lllllllIIIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lllllllIIIIIll();
        lllllllIIIIIlI();
    }

    private static boolean lllllllIIIllII(int i, int i2) {
        return i != i2;
    }

    private static boolean lllllllIIIlIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllllllIIIIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIlllIIIlI[0]];
        enumC0002cArr[llIIlllIIIlI[1]] = EnumC0002c.ACTIVE;
        enumC0002cArr[llIIlllIIIlI[2]] = EnumC0002c.FINISHING;
    }

    private static boolean lllllllIIIlIIl(int i) {
        return i > 0;
    }

    private static String lllllllIIIIIIl(String lllllllllllllllIlIIllIIIIlIIIlII, String lllllllllllllllIlIIllIIIIlIIIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), llIIlllIIIlI[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlllIIIlI[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIIIlIIIlIl) {
            lllllllllllllllIlIIllIIIIlIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lllllllIIIIIlI() {
        llIIlllIIIIl = new String[llIIlllIIIlI[2]];
        llIIlllIIIIl[llIIlllIIIlI[1]] = lllllllIIIIIIl("D+k7f0KpWHA=", "CwDFk");
    }

    private static void lllllllIIIIIll() {
        llIIlllIIIlI = new int[6];
        llIIlllIIIlI[0] = "  ".length();
        llIIlllIIIlI[1] = ((88 ^ 6) ^ (5 ^ 28)) & (((((155 + 168) - 226) + 99) ^ (((80 + 45) - 78) + 84)) ^ (-" ".length()));
        llIIlllIIIlI[2] = " ".length();
        llIIlllIIIlI[3] = (178 ^ 163) ^ (178 ^ 145);
        llIIlllIIIlI[4] = (-((-12693) & 31679)) & (-4097) & 32447;
        llIIlllIIIlI[5] = 153 ^ 145;
    }

    private static boolean lllllllIIIlIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lllllllIIIIlll(int i) {
        return i != 0;
    }

    private static boolean lllllllIIIIlIl(int i, int i2) {
        return i <= i2;
    }
}
