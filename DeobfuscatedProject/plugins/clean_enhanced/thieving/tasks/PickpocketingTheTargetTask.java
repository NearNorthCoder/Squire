/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.thieving.tasks.ThievingManager;
import gg.squire.thieving.tasks.GameEnum5;

@TaskDesc(name="Pickpocketing the target", priority=3)
public class PickpocketingTheTargetTask
extends ThievingManager {

    private final  WorldPoint ay;
    private static final  Logger ax;

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var2_2;
        Player var5;
        F var6;
        f var7;
        if (F.var8(this.o.j() ? 1 : 0)) {
            return var2[2];
        }
        if (F.var8(Bank.isOpen() ? 1 : 0)) {
            return var2[2];
        }
        if (F.var4(Movement.isRunEnabled() ? 1 : 0) && F.var9(Movement.getRunEnergy(), Rand.nextInt((int)var2[3], (int)var2[4]))) {
            Movement.toggleRun();
        }
        if (F.var3((Object)(var7 = var6.p.pickpocketTarget()), (Object)f.VYRE) && (!F.var8(var6.o.e()) || F.var10(var6.o.e(), var2[5]))) {
            return var2[2];
        }
        NPC var11 = var6.a(var7);
        if (F.var12(var11)) {
            return var2[2];
        }
        if (F.var8(Inventory.isFull() ? 1 : 0)) {
            if (F.var13((Object)var6.p.pickpocketTarget(), (Object)f.ARDY_KNIGHT)) {
                return var2[2];
            }
            String[] stringArray = new String[var2[6]];
            stringArray[F.var2[2]] = var1[var2[2]];
            stringArray[F.var2[7]] = var1[var2[7]];
            if (F.var4(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                return var2[2];
            }
        }
        if (F.var12(var5 = Players.getLocal())) {
            return var2[2];
        }
        if (F.var8(var6.o() ? 1 : 0)) {
            var6.sleep(Rand.nextInt((int)var2[7], (int)var2[8]));
            return var2[7];
        }
        if (F.var13((Object)var7, (Object)f.VYRE)) {
            if (F.var9(var5.getWorldLocation().distanceTo(var6.o.f()), var6.p.wanderRange())) {
                Movement.walkTo((WorldPoint)var6.o.f());
                0;
            }
            if (F.var12(var11)) {
                return var2[2];
            }
            if (F.var9(var11.getWorldLocation().distanceTo(var6.o.f()), var6.p.wanderRange())) {
                return var2[2];
            }
            if (F.var4(Reachable.isInteractable((Locatable)var11) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)var11.getWorldLocation());
                0;
                return var2[7];
            }
        }
        this.a((NPC)var2_2);
        return var2[7];
    }

    private static boolean var13(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    static {
        F.var20();
        F.var21();
        ax = LoggerFactory.getLogger(PickpocketingTheTargetTask.class);
    }

    private static boolean var10(int n2, int n3) {
        return n2 == n3;
    }

    private static void var21() {
        var1 = new String[var2[6]];
        F.var1[F.var2[2]] = "Coin pouch";
        F.var1[F.var2[7]] = "Coins";
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    @Inject
    public PickpocketingTheTargetTask(SquireThievingConfig squireThievingConfig, SquireThieving squireThieving) {
        super(squireThieving, squireThievingConfig);
        this.ay = new WorldPoint(var2[0], var2[1], var2[2]);
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var2[2];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var2[2];
        while (F.var31(var30, var29)) {
            char var32 = var28[var30];
            var25.append((char)(var32 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            
            return null;
        }
        return String.valueOf(var25);
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    private static void var20() {
        var2 = new int[9];
        F.var2[0] = -(0xFFFFE6A2 & 0x79FF) & (0xFFFFEFFF & 0x7EEF);
        F.var2[1] = 0xFFFFCD3F & 0x3FF1;
        F.var2[2] = (207 + 2 - 93 + 112 ^ 180 + 109 - 272 + 165) & (20 + 113 - 67 + 188 ^ 166 + 11 - 26 + 21 ^ -1);
        F.var2[3] = 4 ^ 0xC;
        F.var2[4] = 0xBA ^ 0xAC;
        F.var2[5] = -1;
        F.var2[6] = 2;
        F.var2[7] = 1;
        F.var2[8] = 3;
    }

    private static boolean var31(int n2, int n3) {
        return n2 < n3;
    }
}

