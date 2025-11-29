/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.SpellBook$Lunar
 *  net.unethicalite.client.Static
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.z;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;

/* TASK: Curing venom -> CureVenomTask */
@TaskDesc(name="Curing venom", priority=100, register=true)
public class y
extends Task {
    private static /* synthetic */ int[] lIllIllIIIIlI;
    private final /* synthetic */ Duration T;
    private final /* synthetic */ SquireZulrahConfig S;
    private static /* synthetic */ String[] lIllIllIIIIII;
    private /* synthetic */ Instant U;

    private static boolean llIIlIIIlIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIIIlIlIIlI(Object object) {
        return object == null;
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (y.llIIlIIIlIlIllI(varbitChanged.getVarpId(), lIllIllIIIIlI[3])) {
            this.U = Instant.now();
        }
    }

    private static String llIIlIIIlIIlIIl(String var3, String var17) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIllIllIIIIlI[2], var8);
            return new String(var4.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static int llIIlIIIlIIllll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean llIIlIIIlIlIlII(int n2) {
        return n2 <= 0;
    }

    private static boolean llIIlIIIlIlIlIl(int n2) {
        return n2 != 0;
    }

    static {
        y.llIIlIIIlIIlllI();
        y.llIIlIIIlIIlIlI();
    }

    private static String llIIlIIIlIIlIII(String var14, String var9) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var19 = var9.toCharArray();
        int var11 = lIllIllIIIIlI[0];
        char[] var18 = var14.toCharArray();
        int var1 = var18.length;
        int var5 = lIllIllIIIIlI[0];
        while (y.llIIlIIIlIlIlll(var5, var1)) {
            char var12 = var18[var5];
            var10.append((char)(var12 ^ var19[var11 % var19.length]));
            0;
            ++var11;
            ++var5;
            0;
            if ((0xF9 ^ 0x93 ^ (0xCA ^ 0xA4)) > 3) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    public boolean run() {
        y var2;
        if (y.llIIlIIIlIlIIII(Combat.isVenomed() ? 1 : 0)) {
            return lIllIllIIIIlI[0];
        }
        if (y.llIIlIIIlIlIIIl(y.llIIlIIIlIIllll(Duration.between(var2.U, Instant.now()).toSeconds(), var2.T.toSeconds()))) {
            switch (z.V[var2.S.cure().ordinal()]) {
                case 1: {
                    Item var16 = Inventory.getFirst(item -> item.getName().startsWith(lIllIllIIIIII[lIllIllIIIIlI[6]]));
                    if (y.llIIlIIIlIlIIlI(var16)) {
                        return lIllIllIIIIlI[0];
                    }
                    var16.interact(lIllIllIIIIII[lIllIllIIIIlI[0]]);
                    return lIllIllIIIIlI[1];
                }
                case 2: {
                    Item var7 = Inventory.getFirst(item -> item.getName().startsWith(lIllIllIIIIII[lIllIllIIIIlI[5]]));
                    if (y.llIIlIIIlIlIIlI(var7)) {
                        return lIllIllIIIIlI[0];
                    }
                    var7.interact(lIllIllIIIIII[lIllIllIIIIlI[1]]);
                    return lIllIllIIIIlI[1];
                }
                case 3: {
                    SpellBook.Lunar var13 = SpellBook.Lunar.CURE_ME;
                    var13.cast();
                    return lIllIllIIIIlI[1];
                }
                case 4: {
                    Item var6 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIllIllIIIIII[lIllIllIIIIlI[4]]));
                    if (y.llIIlIIIlIlIIlI(var6)) {
                        return lIllIllIIIIlI[0];
                    }
                    var6.interact(lIllIllIIIIII[lIllIllIIIIlI[2]]);
                    return lIllIllIIIIlI[1];
                }
            }
            return lIllIllIIIIlI[0];
        }
        return lIllIllIIIIlI[0];
    }

    private static boolean llIIlIIIlIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIIlIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private boolean ab() {
        boolean bl;
        if (y.llIIlIIIlIlIlII(y.llIIlIIIlIlIIll(Duration.between(this.U, Instant.now()).toSeconds(), this.T.toSeconds()))) {
            return lIllIllIIIIlI[0];
        }
        if (y.llIIlIIIlIlIIII(Combat.isVenomed() ? 1 : 0) && y.llIIlIIIlIlIlIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return lIllIllIIIIlI[0];
        }
        if (!y.llIIlIIIlIlIIII(Combat.isVenomed() ? 1 : 0) || y.llIIlIIIlIlIlIl(Combat.isPoisoned() ? 1 : 0)) {
            bl = lIllIllIIIIlI[1];
            0;
            if (1 >= 2) {
                return ((0x14 ^ 0x1B ^ (0x5D ^ 5) & ~(0x17 ^ 0x4F)) & (90 + 35 - 3 + 25 ^ 2 + 24 - -109 + 21 ^ -1)) != 0;
            }
        } else {
            bl = lIllIllIIIIlI[0];
        }
        return bl;
    }

    @Inject
    public y(SquireZulrahConfig squireZulrahConfig) {
        this.T = Duration.ofSeconds(14L);
        this.S = squireZulrahConfig;
    }

    private static boolean llIIlIIIlIlIIIl(int n2) {
        return n2 > 0;
    }

    private static void llIIlIIIlIIlIlI() {
        lIllIllIIIIII = new String[lIllIllIIIIlI[7]];
        y.lIllIllIIIIII[y.lIllIllIIIIlI[0]] = y."Drink";
        y.lIllIllIIIIII[y.lIllIllIIIIlI[1]] = y."Drink";
        y.lIllIllIIIIII[y.lIllIllIIIIlI[2]] = y."Drink";
        y.lIllIllIIIIII[y.lIllIllIIIIlI[4]] = y."antipoison";
        y.lIllIllIIIIII[y.lIllIllIIIIlI[5]] = y."Antidote";
        y.lIllIllIIIIII[y.lIllIllIIIIlI[6]] = y."Anti-venom";
    }

    private static void llIIlIIIlIIlllI() {
        lIllIllIIIIlI = new int[8];
        y.lIllIllIIIIlI[0] = (0x73 ^ 0x21) & ~(0x32 ^ 0x60);
        y.lIllIllIIIIlI[1] = 1;
        y.lIllIllIIIIlI[2] = 2;
        y.lIllIllIIIIlI[3] = 5 ^ 0x60 ^ 3;
        y.lIllIllIIIIlI[4] = 3;
        y.lIllIllIIIIlI[5] = 0xB4 ^ 0xB0;
        y.lIllIllIIIIlI[6] = 0xB5 ^ 0xB0;
        y.lIllIllIIIIlI[7] = (0x5D ^ 0x13) & ~(0x54 ^ 0x1A) ^ (0xC7 ^ 0xC1);
    }

    private static int llIIlIIIlIlIIll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

