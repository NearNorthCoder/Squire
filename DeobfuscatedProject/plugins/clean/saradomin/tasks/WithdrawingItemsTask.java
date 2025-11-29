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

    private static boolean lIlIlIllllIIlII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        q var1;
        if (q.lIlIlIllllIIIll(this.S() ? 1 : 0)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIlII(var1.U.s() ? 1 : 0)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(var1.O.a() ? 1 : 0)) {
            if (q.lIlIlIllllIIlII(var1.T() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlIlIIIII[1]];
                stringArray[q.lIIlIlIlIIIII[0]] = lIIlIlIIllIIl[lIIlIlIlIIIII[0]];
                stringArray[q.lIIlIlIlIIIII[2]] = lIIlIlIIllIIl[lIIlIlIlIIIII[2]];
                TileObject var2 = TileObjects.getNearest((String[])stringArray);
                if (q.lIlIlIllllIIlIl(var2) && q.lIlIlIllllIIlII(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
                    var1.O.a(lIIlIlIlIIIII[2]);
                }
            }
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(var1.T() ? 1 : 0)) {
            var1.O.a(lIIlIlIlIIIII[0]);
            return lIIlIlIlIIIII[0];
        }
        BankLoadout var2 = (BankLoadout)var1.N.bankLoadout().selected(BankLoadout.class);
        if (q.lIlIlIllllIIllI(var2)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(Bank.open() ? 1 : 0)) {
            if (q.lIlIlIllllIIllI(var1.V)) {
                var1.V = BankLocation.getNearestCommon();
            }
            Movement.walkTo((BankLocation)var1.V);

            return lIIlIlIlIIIII[2];
        }
        if (q.lIlIlIllllIIIll(Bank.isOpen() ? 1 : 0)) {
            Bank.open();

            return lIIlIlIlIIIII[2];
        }
        if (q.lIlIlIllllIIIll(BankLoadouts.withdrawWithRetries((BankLoadout)var2, (int)lIIlIlIlIIIII[3]).booleanValue() ? 1 : 0)) {
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

    private static void lIlIlIllllIIIIl() {
        lIIlIlIIllIIl = new String[lIIlIlIlIIIII[5]];
        q.lIIlIlIIllIIl[q.lIIlIlIlIIIII[0]] = "Bank booth";
        q.lIIlIlIIllIIl[q.lIIlIlIlIIIII[2]] = "Bank chest";
        q.lIIlIlIIllIIl[q.lIIlIlIlIIIII[1]] = "[BankForItems] After 15 tries, still not equipping the right stuff";
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

        return String.valueOf(var3);
    }

    @Inject
    public WithdrawingItemsTask(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, Client client, g g2) {
        super(squireSaraConfig, squireSaradomin, client);
        this.U = g2;
    }

}

