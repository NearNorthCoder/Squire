/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Banking (Superheat)", priority=150, blocking=true)
public class BankingSuperheatTask
extends Task {
    private final  int[] al;
    
    @Inject
    private  SquireMinerConfig f;
    private final  int[] am;

    static {
        K.lIIlIlIIlIlllII();
        K.lIIlIlIIlIllIll();
    }

    private static boolean lIIlIlIIllIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIlIllllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIlIlllll(Object object) {
        return object != null;
    }

    public BankingSuperheatTask() {
        int[] nArray = new int[llllllIllIII[0]];
        nArray[K.llllllIllIII[1]] = llllllIllIII[2];
        nArray[K.llllllIllIII[3]] = llllllIllIII[4];
        nArray[K.llllllIllIII[5]] = llllllIllIII[6];
        nArray[K.llllllIllIII[7]] = llllllIllIII[8];
        this.al = nArray;
        int[] nArray2 = new int[llllllIllIII[5]];
        nArray2[K.llllllIllIII[1]] = llllllIllIII[9];
        nArray2[K.llllllIllIII[3]] = llllllIllIII[10];
        this.am = nArray2;
    }

    private static boolean lIIlIlIIllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIIlIlllIl(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        BankLocation var1;
        WorldPoint var2;
        K var3;
        if (K.lIIlIlIIlIlllIl((Object)this.f.activity(), (Object)a.SUPERHEAT_MINE)) {
            return llllllIllIII[1];
        }
        if (K.lIIlIlIIlIllllI(Inventory.isFull() ? 1 : 0)) {
            return llllllIllIII[1];
        }
        String var4 = var3.f.bankLoadout().getSelected();
        if (!K.lIIlIlIIlIlllll(var4) || K.lIIlIlIIllIIIII(var4.equals(llllllIlIlll[llllllIllIII[1]]) ? 1 : 0)) {
            return llllllIllIII[1];
        }
        BankLoadout var5 = (BankLoadout)var3.f.bankLoadout().selected(BankLoadout.class);
        if (K.lIIlIlIIllIIIII(Bank.isOpen() ? 1 : 0) && K.lIIlIlIIlIllllI(BankLoadouts.withdrawWithRetries((BankLoadout)var5, (int)llllllIllIII[11]).booleanValue() ? 1 : 0)) {
            Log.info((String)llllllIlIlll[llllllIllIII[3]]);
            return llllllIllIII[3];
        }
        Player var6 = Players.getLocal();
        if (K.lIIlIlIIllIIIIl(var6.distanceTo(var2 = (var1 = BankLocation.ARDOUGNE_SOUTH_BANK).getArea().getCenter()), llllllIllIII[12])) {
            Movement.walkTo((WorldPoint)var2, (boolean)llllllIllIII[1]);

            return llllllIllIII[3];
        }
        Bank.open();

        return llllllIllIII[3];
    }

    private static void lIIlIlIIlIllIll() {
        llllllIlIlll = new String[llllllIllIII[5]];
        K.llllllIlIlll[K.llllllIllIII[1]] = "None";
        K.llllllIlIlll[K.llllllIllIII[3]] = "Failed banking more than 5 times.";
    }

}

