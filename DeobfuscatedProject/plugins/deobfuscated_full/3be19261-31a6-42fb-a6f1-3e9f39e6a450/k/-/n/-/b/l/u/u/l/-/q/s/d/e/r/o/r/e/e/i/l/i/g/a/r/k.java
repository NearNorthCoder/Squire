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

/* TASK: Walking To Bank -> WalkingtobankTask */
@TaskDesc(name="Walking To Bank")
public class k
extends Task {
    private static /* synthetic */ String[] lIIllllIIIll;
    private static /* synthetic */ int[] lIIllllIIlII;
    private final /* synthetic */ SquireBlueDragonKiller G;
    private final /* synthetic */ SquireBlueDragonKillerConfig H;

    private static void llIlIIIllIlIll() {
        lIIllllIIIll = new String[lIIllllIIlII[3]];
        k.lIIllllIIIll[k.lIIllllIIlII[0]] = k."Wear";
        k.lIIllllIIIll[k.lIIllllIIlII[1]] = k."Games";
        k.lIIllllIIIll[k.lIIllllIIlII[2]] = k."Games";
    }

    private static boolean llIlIIIllIlllI(int n) {
        return n != 0;
    }

    static {
        k.llIlIIIllIllII();
        k.llIlIIIllIlIll();
    }

    private static String llIlIIIllIlIlI(String var3, String var8) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var7 = var8.toCharArray();
        int var14 = lIIllllIIlII[0];
        char[] var2 = var3.toCharArray();
        int var1 = var2.length;
        int var10 = lIIllllIIlII[0];
        while (k.llIlIIIllIllll(var10, var1)) {
            char var13 = var2[var10];
            var12.append((char)(var13 ^ var7[var14 % var7.length]));
            0;
            ++var14;
            ++var10;
            0;
            if (((0xE7 ^ 0xBE ^ (0x1F ^ 0x67)) & (59 + 172 - 116 + 110 ^ 63 + 158 - 86 + 57 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public boolean run() {
        k var4;
        if (k.llIlIIIllIllIl(this.G.h() ? 1 : 0)) {
            return lIIllllIIlII[0];
        }
        if (k.llIlIIIllIlllI(var4.y() ? 1 : 0)) {
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
        k.lIIllllIIlII[0] = (0xF ^ 0x4F ^ (0x67 ^ 0xA)) & (0x7B ^ 0x73 ^ (0x61 ^ 0x44) ^ -1);
        k.lIIllllIIlII[1] = 1;
        k.lIIllllIIlII[2] = 2;
        k.lIIllllIIlII[3] = 3;
        k.lIIllllIIlII[4] = 0x33 ^ 0x3B;
    }

    private static String llIlIIIllIlIIl(String var9, String var6) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIIllllIIlII[4]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIIllllIIlII[2], var11);
            return new String(var5.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
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
        0;
    }

    private boolean y() {
        return this.H.bankLocation().getArea().contains((Locatable)Players.getLocal());
    }
}

