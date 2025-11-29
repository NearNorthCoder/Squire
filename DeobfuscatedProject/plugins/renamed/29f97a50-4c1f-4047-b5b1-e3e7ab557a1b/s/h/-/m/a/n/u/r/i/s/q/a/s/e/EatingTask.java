/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Eating -> EatingTask */
@TaskDesc(name="Eating", priority=100)
public class EatingTask
extends Task {
    private final /* synthetic */ SquireShamanConfig ac;
    private static /* synthetic */ int[] lIIllIIIlIIII;
    private static final /* synthetic */ Logger ab;
    private static /* synthetic */ String[] lIIllIIIIllll;

    static {
        p.lIlIlllIlllIlIl();
        p.lIlIlllIlllIIll();
        ab = LoggerFactory.getLogger(p.class);
    }

    private static String lIlIlllIlllIIlI(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var4 = var9.toCharArray();
        int var3 = lIIllIIIlIIII[0];
        char[] var10 = var8.toCharArray();
        int var5 = var10.length;
        int var6 = lIIllIIIlIIII[0];
        while (p.lIlIlllIllllIII(var6, var5)) {
            char var1 = var10[var6];
            var2.append((char)(var1 ^ var4[var3 % var4.length]));
            0;
            ++var3;
            ++var6;
            0;
            if (2 != 1) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lIlIlllIlllIllI(Object object) {
        return object == null;
    }

    private static boolean lIlIlllIlllIlll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public p(SquireShamanConfig squireShamanConfig) {
        this.ac = squireShamanConfig;
    }

    private static void lIlIlllIlllIIll() {
        lIIllIIIIllll = new String[lIIllIIIlIIII[2]];
        p.lIIllIIIIllll[p.lIIllIIIlIIII[0]] = p."Eat";
        p.lIIllIIIIllll[p.lIIllIIIlIIII[1]] = p."Eat";
    }

    public boolean run() {
        p var7;
        Item item2 = Inventory.getFirst(item -> item.hasAction(lIIllIIIIllll[lIIllIIIlIIII[1]]::equals));
        if (p.lIlIlllIlllIllI(item2)) {
            return lIIllIIIlIIII[0];
        }
        if (p.lIlIlllIlllIlll(Combat.getCurrentHealth(), var7.ac.eatAt())) {
            return lIIllIIIlIIII[0];
        }
        item2.interact(lIIllIIIIllll[lIIllIIIlIIII[0]]);
        return lIIllIIIlIIII[1];
    }

    private static void lIlIlllIlllIlIl() {
        lIIllIIIlIIII = new int[3];
        p.lIIllIIIlIIII[0] = ((0x6D ^ 0x24) & ~(0x30 ^ 0x79) ^ (0xDE ^ 0x8A)) & (0x20 ^ 0x2B ^ (0xE3 ^ 0xBC) ^ -1);
        p.lIIllIIIlIIII[1] = 1;
        p.lIIllIIIlIIII[2] = 2;
    }
}

