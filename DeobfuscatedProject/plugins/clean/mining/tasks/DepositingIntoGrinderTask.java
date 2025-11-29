/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.mining.tasks.GameEnum29;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Depositing into grinder")
public class DepositingIntoGrinderTask
extends Task {
    private final  SquireMinerConfig ag;

    private  int ah;

    private static boolean lIIlIIlIlllllIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIIlIllllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIlIllllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIlIlllllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIIlIllllIIl(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        I var1;
        if (I.lIIlIIlIllllIIl((Object)this.ag.activity(), (Object)a.SANDSTONE)) {
            return lllllIIlllII[0];
        }
        if (!I.lIIlIIlIllllIlI(var1.ag.deposit() ? 1 : 0) || I.lIIlIIlIllllIll(Inventory.isFull() ? 1 : 0)) {
            return lllllIIlllII[0];
        }
        int var2 = Static.getClient().getTickCount();
        if (I.lIIlIIlIlllllII(var2 - var1.ah, lllllIIlllII[1])) {
            return lllllIIlllII[2];
        }
        if (I.lIIlIIlIllllIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return lllllIIlllII[2];
        }
        String[] stringArray = new String[lllllIIlllII[2]];
        stringArray[I.lllllIIlllII[0]] = lllllIIllIll[lllllIIlllII[0]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (I.lIIlIIlIlllllIl(var3) && I.lIIlIIlIllllIll(Players.getLocal().isMoving() ? 1 : 0)) {
            var3.interact(lllllIIllIll[lllllIIlllII[2]]);
            var1.ah = var2;
        }
        return lllllIIlllII[2];
    }

    static {
        I.lIIlIIlIllllIII();
        I.lIIlIIlIlllIlll();
    }

    private static void lIIlIIlIlllIlll() {
        lllllIIllIll = new String[lllllIIlllII[3]];
        I.lllllIIllIll[I.lllllIIlllII[0]] = "Grinder";
        I.lllllIIllIll[I.lllllIIlllII[2]] = "Deposit";
    }

    @Inject
    public DepositingIntoGrinderTask(SquireMinerConfig squireMinerConfig) {
        this.ag = squireMinerConfig;
    }
}

