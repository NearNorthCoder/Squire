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
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.util.concurrent.CompletableFuture;
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
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominTaskBase;

@TaskDesc(name="Withdrawing items")
public class WithdrawingItemsTask
extends SaradominTaskBase {
    private  int W;
    
    private  CompletableFuture<Boolean> X;
    private  BankLocation V;
    private final  g U;
    
    private static final  int T;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        q var4;
        if (q.var5(this.S() ? 1 : 0)) {
            return var2[0];
        }
        if (q.var3(var4.U.s() ? 1 : 0)) {
            return var2[0];
        }
        if (q.var5(var4.O.a() ? 1 : 0)) {
            if (q.var3(var4.T() ? 1 : 0)) {
                String[] stringArray = new String[var2[1]];
                stringArray[q.var2[0]] = var1[var2[0]];
                stringArray[q.var2[2]] = var1[var2[2]];
                TileObject var6 = TileObjects.getNearest((String[])stringArray);
                if (q.var7(var6) && q.var3(Reachable.isInteractable((Locatable)var6) ? 1 : 0)) {
                    var4.O.a(var2[2]);
                }
            }
            return var2[0];
        }
        if (q.var5(var4.T() ? 1 : 0)) {
            var4.O.a(var2[0]);
            return var2[0];
        }
        BankLoadout var6 = (BankLoadout)var4.N.bankLoadout().selected(BankLoadout.class);
        if (q.var8(var6)) {
            return var2[0];
        }
        if (q.var5(Movement.shouldWalk() ? 1 : 0)) {
            return var2[0];
        }
        if (q.var5(Bank.open() ? 1 : 0)) {
            if (q.var8(var4.V)) {
                var4.V = BankLocation.getNearestCommon();
            }
            Movement.walkTo((BankLocation)var4.V);
            0;
            return var2[2];
        }
        if (q.var5(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            0;
            return var2[2];
        }
        if (q.var5(BankLoadouts.withdrawWithRetries((BankLoadout)var6, (int)var2[3]).booleanValue() ? 1 : 0)) {
            Log.info((String)var1[var2[1]]);
            return var2[0];
        }
        return var2[2];
    }

    static {
        q.var9();
        q.var10();
        T = var2[4];
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    private static void var9() {
        var2 = new int[6];
        q.var2[0] = (0x49 ^ 0x17 ^ (0xC5 ^ 0x9E)) & (0x53 ^ 0x5E ^ (0x9E ^ 0x96) ^ -1);
        q.var2[1] = 2;
        q.var2[2] = 1;
        q.var2[3] = 45 + 87 - 12 + 34 ^ 142 + 20 - 146 + 133;
        q.var2[4] = -(0xFFFFDAEF & 0x3555) & (0xFFFFF777 & Short.MAX_VALUE);
        q.var2[5] = 3;
    }

    private static void var10() {
        var1 = new String[var2[5]];
        q.var1[q.var2[0]] = "Bank booth";
        q.var1[q.var2[2]] = "Bank chest";
        q.var1[q.var2[1]] = "[BankForItems] After 15 tries, still not equipping the right stuff";
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (q.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    @Inject
    public WithdrawingItemsTask(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, Client client, g g2) {
        super(squireSaraConfig, squireSaradomin, client);
        this.U = g2;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

