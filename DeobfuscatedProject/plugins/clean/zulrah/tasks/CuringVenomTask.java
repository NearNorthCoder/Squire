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
package gg.squire.zulrah.tasks;

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

@TaskDesc(name="Curing venom", priority=100, register=true)
public class CuringVenomTask
extends Task {
    
    private final  Duration T;
    private final  SquireZulrahConfig S;
    
    private  Instant U;

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

        return String.valueOf(var1);
    }

    public boolean run() {
        y var2;
        if (y.llIIlIIIlIlIIII(Combat.isVenomed() ? 1 : 0)) {
            return lIllIllIIIIlI[0];
        }
        if (y.llIIlIIIlIlIIIl(y.llIIlIIIlIIllll(Duration.between(var2.U, Instant.now()).toSeconds(), var2.T.toSeconds()))) {
            switch (z.V[var2.S.cure().ordinal()]) {
                case 1: {
                    Item var3 = Inventory.getFirst(item -> item.getName().startsWith(lIllIllIIIIII[lIllIllIIIIlI[6]]));
                    if (y.llIIlIIIlIlIIlI(var3)) {
                        return lIllIllIIIIlI[0];
                    }
                    var3.interact(lIllIllIIIIII[lIllIllIIIIlI[0]]);
                    return lIllIllIIIIlI[1];
                }
                case 2: {
                    Item var4 = Inventory.getFirst(item -> item.getName().startsWith(lIllIllIIIIII[lIllIllIIIIlI[5]]));
                    if (y.llIIlIIIlIlIIlI(var4)) {
                        return lIllIllIIIIlI[0];
                    }
                    var4.interact(lIllIllIIIIII[lIllIllIIIIlI[1]]);
                    return lIllIllIIIIlI[1];
                }
                case 3: {
                    SpellBook.Lunar var5 = SpellBook.Lunar.CURE_ME;
                    var5.cast();
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

            if (1 >= 2) {
                return ((0x14 ^ 0x1B ^ (0x5D ^ 5) & ~(0x17 ^ 0x4F)) & (90 + 35 - 3 + 25 ^ 2 + 24 - -109 + 21 ^ -1)) != 0;
            }
        } else {
            bl = lIllIllIIIIlI[0];
        }
        return bl;
    }

    @Inject
    public CuringVenomTask(SquireZulrahConfig squireZulrahConfig) {
        this.T = Duration.ofSeconds(14L);
        this.S = squireZulrahConfig;
    }

    private static boolean llIIlIIIlIlIIIl(int n2) {
        return n2 > 0;
    }

    private static void llIIlIIIlIIlIlI() {
        lIllIllIIIIII = new String[lIllIllIIIIlI[7]];
        y.lIllIllIIIIII[y.lIllIllIIIIlI[0]] = "Drink";
        y.lIllIllIIIIII[y.lIllIllIIIIlI[1]] = "Drink";
        y.lIllIllIIIIII[y.lIllIllIIIIlI[2]] = "Drink";
        y.lIllIllIIIIII[y.lIllIllIIIIlI[4]] = "antipoison";
        y.lIllIllIIIIII[y.lIllIllIIIIlI[5]] = "Antidote";
        y.lIllIllIIIIII[y.lIllIllIIIIlI[6]] = "Anti-venom";
    }

    private static int llIIlIIIlIlIIll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

