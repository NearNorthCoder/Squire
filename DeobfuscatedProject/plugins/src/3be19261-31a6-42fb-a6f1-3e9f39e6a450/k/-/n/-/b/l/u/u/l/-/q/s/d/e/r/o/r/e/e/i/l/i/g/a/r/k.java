/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking To Bank")
public class k
extends Task {
    private static /* synthetic */ String[] lIIllllIIIll;
    private static /* synthetic */ int[] lIIllllIIlII;
    private final /* synthetic */ SquireBlueDragonKiller G;
    private final /* synthetic */ SquireBlueDragonKillerConfig H;

    private static void llIlIIIllIlIll() {
        lIIllllIIIll = new String[lIIllllIIlII[3]];
        k.lIIllllIIIll[k.lIIllllIIlII[0]] = k.llIlIIIllIlIIl("gjcO4k965wc=", "zlteX");
        k.lIIllllIIIll[k.lIIllllIIlII[1]] = k.llIlIIIllIlIlI("KwspMzA=", "ljDVC");
        k.lIIllllIIIll[k.lIIllllIIlII[2]] = k.llIlIIIllIlIIl("RiEsshj93Jw=", "SkGzT");
    }

    private static boolean llIlIIIllIlllI(int n) {
        return n != 0;
    }

    static {
        k.llIlIIIllIllII();
        k.llIlIIIllIlIll();
    }

    private static String llIlIIIllIlIlI(String lllllllllllllllIlllIlIIllIlIIIll, String lllllllllllllllIlllIlIIllIlIIIlI) {
        lllllllllllllllIlllIlIIllIlIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIllIlIIIIl = new StringBuilder();
        char[] lllllllllllllllIlllIlIIllIlIIIII = lllllllllllllllIlllIlIIllIlIIIlI.toCharArray();
        int lllllllllllllllIlllIlIIllIIlllll = lIIllllIIlII[0];
        char[] lllllllllllllllIlllIlIIllIIllIIl = lllllllllllllllIlllIlIIllIlIIIll.toCharArray();
        int lllllllllllllllIlllIlIIllIIllIII = lllllllllllllllIlllIlIIllIIllIIl.length;
        int lllllllllllllllIlllIlIIllIIlIlll = lIIllllIIlII[0];
        while (k.llIlIIIllIllll(lllllllllllllllIlllIlIIllIIlIlll, lllllllllllllllIlllIlIIllIIllIII)) {
            char lllllllllllllllIlllIlIIllIlIIlII = lllllllllllllllIlllIlIIllIIllIIl[lllllllllllllllIlllIlIIllIIlIlll];
            lllllllllllllllIlllIlIIllIlIIIIl.append((char)(lllllllllllllllIlllIlIIllIlIIlII ^ lllllllllllllllIlllIlIIllIlIIIII[lllllllllllllllIlllIlIIllIIlllll % lllllllllllllllIlllIlIIllIlIIIII.length]));
            "".length();
            ++lllllllllllllllIlllIlIIllIIlllll;
            ++lllllllllllllllIlllIlIIllIIlIlll;
            "".length();
            if (((0xE7 ^ 0xBE ^ (0x1F ^ 0x67)) & (59 + 172 - 116 + 110 ^ 63 + 158 - 86 + 57 ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIIllIlIIIIl);
    }

    public boolean run() {
        k lllllllllllllllIlllIlIIllIllllIl;
        if (k.llIlIIIllIllIl(this.G.h() ? 1 : 0)) {
            return lIIllllIIlII[0];
        }
        if (k.llIlIIIllIlllI(lllllllllllllllIlllIlIIllIllllIl.y() ? 1 : 0)) {
            return lIIllllIIlII[0];
        }
        this.z();
        return lIIllllIIlII[1];
    }

    private static boolean llIlIIIllIllIl(int n) {
        return n == 0;
    }

    private static boolean llIlIIIllIllll(int n, int n2) {
        return n < n2;
    }

    @Inject
    public k(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.G = squireBlueDragonKiller;
        this.H = squireBlueDragonKillerConfig;
    }

    private static void llIlIIIllIllII() {
        lIIllllIIlII = new int[5];
        k.lIIllllIIlII[0] = (0xF ^ 0x4F ^ (0x67 ^ 0xA)) & (0x7B ^ 0x73 ^ (0x61 ^ 0x44) ^ -" ".length());
        k.lIIllllIIlII[1] = " ".length();
        k.lIIllllIIlII[2] = "  ".length();
        k.lIIllllIIlII[3] = "   ".length();
        k.lIIllllIIlII[4] = 0x33 ^ 0x3B;
    }

    private static String llIlIIIllIlIIl(String lllllllllllllllIlllIlIIllIllIIIl, String lllllllllllllllIlllIlIIllIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIllIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIllIllIIlI.getBytes(StandardCharsets.UTF_8)), lIIllllIIlII[4]), "DES");
            Cipher lllllllllllllllIlllIlIIllIllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIllIllIlIl.init(lIIllllIIlII[2], lllllllllllllllIlllIlIIllIllIllI);
            return new String(lllllllllllllllIlllIlIIllIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIllIllIlII) {
            lllllllllllllllIlllIlIIllIllIlII.printStackTrace();
            return null;
        }
    }

    private void z() {
        if (k.llIlIIIllIllIl(Movement.shouldWalk() ? 1 : 0)) {
            return;
        }
        if (k.llIlIIIllIlllI(Inventory.contains(item -> item.getName().contains(lIIllllIIIll[lIIllllIIlII[2]])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(lIIllllIIIll[lIIllllIIlII[1]])).interact(lIIllllIIIll[lIIllllIIlII[0]]);
            return;
        }
        Movement.walkTo((WorldArea)this.H.bankLocation().getArea());
        "".length();
    }

    private boolean y() {
        return this.H.bankLocation().getArea().contains((Locatable)Players.getLocal());
    }
}

