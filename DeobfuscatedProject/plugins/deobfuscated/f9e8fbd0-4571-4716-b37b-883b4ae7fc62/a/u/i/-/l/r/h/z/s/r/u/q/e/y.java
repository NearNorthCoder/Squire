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

    private static String llIIlIIIlIIlIIl(String llllllllllllllIllIIIlIlllllllIlI, String llllllllllllllIllIIIlIlllllllIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIllllllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlllllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIllllllllII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIllllllllII.init(lIllIllIIIIlI[2], llllllllllllllIllIIIlIllllllllIl);
            return new String(llllllllllllllIllIIIlIllllllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlllllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIlllllllIll) {
            llllllllllllllIllIIIlIlllllllIll.printStackTrace();
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

    private static String llIIlIIIlIIlIII(String llllllllllllllIllIIIllIIIIIIlIlI, String llllllllllllllIllIIIllIIIIIIlIIl) {
        llllllllllllllIllIIIllIIIIIIlIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIIIIIIllIl = new StringBuilder();
        char[] llllllllllllllIllIIIllIIIIIIllII = llllllllllllllIllIIIllIIIIIIlIIl.toCharArray();
        int llllllllllllllIllIIIllIIIIIIlIll = lIllIllIIIIlI[0];
        char[] llllllllllllllIllIIIllIIIIIIIlIl = llllllllllllllIllIIIllIIIIIIlIlI.toCharArray();
        int llllllllllllllIllIIIllIIIIIIIlII = llllllllllllllIllIIIllIIIIIIIlIl.length;
        int llllllllllllllIllIIIllIIIIIIIIll = lIllIllIIIIlI[0];
        while (y.llIIlIIIlIlIlll(llllllllllllllIllIIIllIIIIIIIIll, llllllllllllllIllIIIllIIIIIIIlII)) {
            char llllllllllllllIllIIIllIIIIIlIIII = llllllllllllllIllIIIllIIIIIIIlIl[llllllllllllllIllIIIllIIIIIIIIll];
            llllllllllllllIllIIIllIIIIIIllIl.append((char)(llllllllllllllIllIIIllIIIIIlIIII ^ llllllllllllllIllIIIllIIIIIIllII[llllllllllllllIllIIIllIIIIIIlIll % llllllllllllllIllIIIllIIIIIIllII.length]));
            0;
            ++llllllllllllllIllIIIllIIIIIIlIll;
            ++llllllllllllllIllIIIllIIIIIIIIll;
            0;
            if ((0xF9 ^ 0x93 ^ (0xCA ^ 0xA4)) > 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIllIIIIIIllIl);
    }

    public boolean run() {
        y llllllllllllllIllIIIllIIIIlIIlII;
        if (y.llIIlIIIlIlIIII(Combat.isVenomed() ? 1 : 0)) {
            return lIllIllIIIIlI[0];
        }
        if (y.llIIlIIIlIlIIIl(y.llIIlIIIlIIllll(Duration.between(llllllllllllllIllIIIllIIIIlIIlII.U, Instant.now()).toSeconds(), llllllllllllllIllIIIllIIIIlIIlII.T.toSeconds()))) {
            switch (z.V[llllllllllllllIllIIIllIIIIlIIlII.S.cure().ordinal()]) {
                case 1: {
                    Item llllllllllllllIllIIIllIIIIlIIIll = Inventory.getFirst(item -> item.getName().startsWith(lIllIllIIIIII[lIllIllIIIIlI[6]]));
                    if (y.llIIlIIIlIlIIlI(llllllllllllllIllIIIllIIIIlIIIll)) {
                        return lIllIllIIIIlI[0];
                    }
                    llllllllllllllIllIIIllIIIIlIIIll.interact(lIllIllIIIIII[lIllIllIIIIlI[0]]);
                    return lIllIllIIIIlI[1];
                }
                case 2: {
                    Item llllllllllllllIllIIIllIIIIlIIIlI = Inventory.getFirst(item -> item.getName().startsWith(lIllIllIIIIII[lIllIllIIIIlI[5]]));
                    if (y.llIIlIIIlIlIIlI(llllllllllllllIllIIIllIIIIlIIIlI)) {
                        return lIllIllIIIIlI[0];
                    }
                    llllllllllllllIllIIIllIIIIlIIIlI.interact(lIllIllIIIIII[lIllIllIIIIlI[1]]);
                    return lIllIllIIIIlI[1];
                }
                case 3: {
                    SpellBook.Lunar llllllllllllllIllIIIllIIIIlIIIIl = SpellBook.Lunar.CURE_ME;
                    llllllllllllllIllIIIllIIIIlIIIIl.cast();
                    return lIllIllIIIIlI[1];
                }
                case 4: {
                    Item llllllllllllllIllIIIllIIIIlIIIII = Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIllIllIIIIII[lIllIllIIIIlI[4]]));
                    if (y.llIIlIIIlIlIIlI(llllllllllllllIllIIIllIIIIlIIIII)) {
                        return lIllIllIIIIlI[0];
                    }
                    llllllllllllllIllIIIllIIIIlIIIII.interact(lIllIllIIIIII[lIllIllIIIIlI[2]]);
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

