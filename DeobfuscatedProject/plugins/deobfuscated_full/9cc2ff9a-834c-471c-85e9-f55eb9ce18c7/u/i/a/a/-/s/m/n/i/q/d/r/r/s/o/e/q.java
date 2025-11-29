/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.o;

/* TASK: Withdrawing items -> WithdrawingitemsTask */
@TaskDesc(name="Withdrawing items")
public class q
extends o {
    private /* synthetic */ int W;
    private static /* synthetic */ String[] lIIlIlIIllIIl;
    private /* synthetic */ CompletableFuture<Boolean> X;
    private /* synthetic */ BankLocation V;
    private final /* synthetic */ g U;
    private static /* synthetic */ int[] lIIlIlIlIIIII;
    private static final /* synthetic */ int T;

    private static boolean lIlIlIllllIIlII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        q var16;
        if (q.lIlIlIllllIIIll(this.S() ? 1 : 0)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIlII(var16.U.s() ? 1 : 0)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(var16.O.a() ? 1 : 0)) {
            if (q.lIlIlIllllIIlII(var16.T() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlIlIIIII[1]];
                stringArray[q.lIIlIlIlIIIII[0]] = lIIlIlIIllIIl[lIIlIlIlIIIII[0]];
                stringArray[q.lIIlIlIlIIIII[2]] = lIIlIlIIllIIl[lIIlIlIlIIIII[2]];
                TileObject var14 = TileObjects.getNearest((String[])stringArray);
                if (q.lIlIlIllllIIlIl(var14) && q.lIlIlIllllIIlII(Reachable.isInteractable((Locatable)var14) ? 1 : 0)) {
                    var16.O.a(lIIlIlIlIIIII[2]);
                }
            }
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(var16.T() ? 1 : 0)) {
            var16.O.a(lIIlIlIlIIIII[0]);
            return lIIlIlIlIIIII[0];
        }
        BankLoadout var14 = (BankLoadout)var16.N.bankLoadout().selected(BankLoadout.class);
        if (q.lIlIlIllllIIllI(var14)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(Bank.open() ? 1 : 0)) {
            if (q.lIlIlIllllIIllI(var16.V)) {
                var16.V = BankLocation.getNearestCommon();
            }
            Movement.walkTo((BankLocation)var16.V);
            0;
            return lIIlIlIlIIIII[2];
        }
        if (q.lIlIlIllllIIIll(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return lIIlIlIlIIIII[2];
        }
        if (q.lIlIlIllllIIIll(BankLoadouts.withdrawWithRetries((BankLoadout)var14, (int)lIIlIlIlIIIII[3]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIIlIlIIllIIl[lIIlIlIlIIIII[1]]);
            return lIIlIlIlIIIII[0];
        }
        return lIIlIlIlIIIII[2];
    }

    static {
        q.lIlIlIllllIIIlI();
        q.lIlIlIllllIIIIl();
        T = lIIlIlIlIIIII[4];
    }

    private static boolean lIlIlIllllIIlIl(Object object) {
        return object != null;
    }

    private static void lIlIlIllllIIIlI() {
        lIIlIlIlIIIII = new int[6];
        q.lIIlIlIlIIIII[0] = (0x49 ^ 0x17 ^ (0xC5 ^ 0x9E)) & (0x53 ^ 0x5E ^ (0x9E ^ 0x96) ^ -1);
        q.lIIlIlIlIIIII[1] = 2;
        q.lIIlIlIlIIIII[2] = 1;
        q.lIIlIlIlIIIII[3] = 45 + 87 - 12 + 34 ^ 142 + 20 - 146 + 133;
        q.lIIlIlIlIIIII[4] = -(0xFFFFDAEF & 0x3555) & (0xFFFFF777 & Short.MAX_VALUE);
        q.lIIlIlIlIIIII[5] = 3;
    }

    private static void lIlIlIllllIIIIl() {
        lIIlIlIIllIIl = new String[lIIlIlIlIIIII[5]];
        q.lIIlIlIIllIIl[q.lIIlIlIlIIIII[0]] = q."Bank booth";
        q.lIIlIlIIllIIl[q.lIIlIlIlIIIII[2]] = q."Bank chest";
        q.lIIlIlIIllIIl[q.lIIlIlIlIIIII[1]] = q."[BankForItems] After 15 tries, still not equipping the right stuff";
    }

    private static boolean lIlIlIllllIIllI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIllllIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIllllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlIlllIIIlIl(String var12, String var11) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var8 = lIIlIlIlIIIII[0];
        char[] var2 = var12.toCharArray();
        int var7 = var2.length;
        int var5 = lIIlIlIlIIIII[0];
        while (q.lIlIlIllllIIlll(var5, var7)) {
            char var4 = var2[var5];
            var15.append((char)(var4 ^ var13[var8 % var13.length]));
            0;
            ++var8;
            ++var5;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    @Inject
    public q(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, Client client, g g2) {
        super(squireSaraConfig, squireSaradomin, client);
        this.U = g2;
    }

    private static String lIlIlIlllIIIllI(String var6, String var1) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIIlIlIlIIIII[1], var9);
            return new String(var3.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }
}

