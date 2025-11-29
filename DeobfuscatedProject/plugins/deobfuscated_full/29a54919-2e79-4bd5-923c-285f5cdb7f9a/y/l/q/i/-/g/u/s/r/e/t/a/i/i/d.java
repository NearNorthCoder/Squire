/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.query.items.ItemQuery
 *  net.unethicalite.api.query.results.ItemQueryResults
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package y.l.q.i.-.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.query.items.ItemQuery;
import net.unethicalite.api.query.results.ItemQueryResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.b;

/* TASK: Consuming -> ConsumingTask */
@TaskDesc(name="Consuming")
public class d
extends Task {
    private static final /* synthetic */ Logger q;
    private static /* synthetic */ int[] lIllIIlIIII;
    private static /* synthetic */ String[] lIllIIIlIlI;
    private final /* synthetic */ AgilityConfig s;
    private final /* synthetic */ SquireAgilityPlugin r;

    private static String lIIlIlIlIIlllI(String var20, String var14) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIllIIlIIII[10]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIllIIlIIII[3], var9);
            return new String(var13.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private boolean u() {
        return Inventory.contains(item -> item.getName().startsWith(lIllIIIlIlI[lIllIIlIIII[6]]));
    }

    static {
        d.lIIlIlIllIlIll();
        d.lIIlIlIlIlIlII();
        q = LoggerFactory.getLogger(d.class);
    }

    private static boolean lIIlIlIlllIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIllIllIl(int n) {
        return n != 0;
    }

    private static int lIIlIlIllIllII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIIlIlIllIlllI(int n) {
        return n == 0;
    }

    private boolean t() {
        int n;
        b var16;
        b b2;
        if (d.lIIlIlIllIllIl(this.s.progressive() ? 1 : 0)) {
            b2 = b.j();
            0;
            if ((0x19 ^ 0x1D) == 1) {
                return false;
            }
        } else {
            d var3;
            b2 = var3.s.course();
        }
        if (d.lIIlIlIlllIIlI((Object)(var16 = b2), (Object)b.ARDOUGNE) && d.lIIlIlIllIllll(Skills.getBoostedLevel((Skill)Skill.AGILITY), lIllIIlIIII[5])) {
            n = lIllIIlIIII[2];
            0;
            if (3 != 3) {
                return false;
            }
        } else {
            n = lIllIIlIIII[1];
        }
        return n != 0;
    }

    private static String lIIlIlIlIlIIII(String var19, String var12) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIllIIlIIII[3], var11);
            return new String(var4.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIllIllll(int n, int n2) {
        return n < n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        Item var6;
        d var15;
        if (d.lIIlIlIllIllIl(this.u() ? 1 : 0) && d.lIIlIlIllIlllI(Movement.isStaminaBoosted() ? 1 : 0) && d.lIIlIlIllIllll(Movement.getRunEnergy(), lIllIIlIIII[0])) {
            Inventory.getFirst(item -> item.getName().startsWith(lIllIIIlIlI[lIllIIlIIII[8]])).interact(lIllIIIlIlI[lIllIIlIIII[1]]);
            return lIllIIlIIII[2];
        }
        int n = var15.t();
        if (d.lIIlIlIlllIIII(d.lIIlIlIllIllII(Combat.getHealthPercent(), var15.s.stopAtHp())) && !d.lIIlIlIllIllIl(n) || d.lIIlIlIllIllIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIllIIlIIII[1];
        }
        ItemQuery var7 = Inventory.query();
        if (d.lIIlIlIllIllIl(n)) {
            var7 = (ItemQuery)var7.filter(item -> item.getName().toLowerCase().contains(lIllIIIlIlI[lIllIIlIIII[7]]));
            0;
            if (-2 > 0) {
                return false;
            }
        } else {
            String[] stringArray = new String[lIllIIlIIII[2]];
            stringArray[d.lIllIIlIIII[1]] = lIllIIIlIlI[lIllIIlIIII[2]];
            var7 = var7.actions(stringArray);
        }
        if (d.lIIlIlIlllIIIl(var6 = (Item)((ItemQueryResults)var7.results()).first())) {
            Log.info((String)lIllIIIlIlI[lIllIIlIIII[3]]);
            var15.r.forceStop();
            return lIllIIlIIII[1];
        }
        var3_3.interact(lIllIIIlIlI[lIllIIlIIII[4]]);
        return lIllIIlIIII[2];
    }

    private static boolean lIIlIlIlllIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIlIlIllIlIll() {
        lIllIIlIIII = new int[11];
        d.lIllIIlIIII[0] = 0x59 ^ 0x4F ^ (0x56 ^ 0x5E);
        d.lIllIIlIIII[1] = (0x51 ^ 0x23 ^ (0xD3 ^ 0xBB)) & (0x5D ^ 0x25 ^ (2 ^ 0x60) ^ -1);
        d.lIllIIlIIII[2] = 1;
        d.lIllIIlIIII[3] = 2;
        d.lIllIIlIIII[4] = 3;
        d.lIllIIlIIII[5] = 0xAB ^ 0xAD ^ (0x9A ^ 0xC6);
        d.lIllIIlIIII[6] = 0x33 ^ 0x37;
        d.lIllIIlIIII[7] = 0xC ^ 5 ^ (1 ^ 0xD);
        d.lIllIIlIIII[8] = 0x5C ^ 0x5A;
        d.lIllIIlIIII[9] = 20 + 59 - -31 + 31 ^ 43 + 13 - -3 + 79;
        d.lIllIIlIIII[10] = 0x89 ^ 0x81;
    }

    @Inject
    public d(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.r = squireAgilityPlugin;
        this.s = agilityConfig;
    }

    private static void lIIlIlIlIlIlII() {
        lIllIIIlIlI = new String[lIllIIlIIII[9]];
        d.lIllIIIlIlI[d.lIllIIlIIII[1]] = d."Drink";
        d.lIllIIIlIlI[d.lIllIIlIIII[2]] = d."Eat";
        d.lIllIIIlIlI[d.lIllIIlIIII[3]] = d."[SquireAgility] - Out of food and low HP, stopping.";
        d.lIllIIIlIlI[d.lIllIIlIIII[4]] = d."Eat";
        d.lIllIIIlIlI[d.lIllIIlIIII[6]] = d."Stamina";
        d.lIllIIIlIlI[d.lIllIIlIIII[7]] = d."summer pie";
        d.lIllIIIlIlI[d.lIllIIlIIII[8]] = d."Stamina";
    }

    private static boolean lIIlIlIlllIIII(int n) {
        return n > 0;
    }

    private static String lIIlIlIlIIllll(String var24, String var5) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var23 = var5.toCharArray();
        int var18 = lIllIIlIIII[1];
        char[] var8 = var24.toCharArray();
        int var1 = var8.length;
        int var2 = lIllIIlIIII[1];
        while (d.lIIlIlIllIllll(var2, var1)) {
            char var22 = var8[var2];
            var17.append((char)(var22 ^ var23[var18 % var23.length]));
            0;
            ++var18;
            ++var2;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var17);
    }
}

