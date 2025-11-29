/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum3;
import gg.squire.farmer.tasks.GameEnum18;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum8;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.lang.invoke.LambdaMetafactory;
import java.util.function.Predicate;
import net.runelite.api.GameState;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Banking for herb run seeds", priority=1000, blocking=true)
public class BankingForHerbRunSeedsTask
extends Task {
    private final  SquireFarmerConfig ck;
    
    private final  f cm;
    private static final  Logger cj;
    private final  SquireFarmer cl;

    static {
        aD.var3();
        aD.var4();
        cj = LoggerFactory.getLogger(BankingForHerbRunSeedsTask.class);
    }

    /*
     * Unable to fully structure code
     */
    public boolean run() {
        block12: {
            if (((Object)this.cl.a() != (Object)this.cl.a()2)o.HERBS)) {
                return 0;
            }
            if (!(Game.getState() == Game.getState()2) || (intPlayers.getLocal().isAnimating())) {
                return 0;
            }
            var5 = var6.cm.F();
            if ((intlllllllllllllllIlIllIIlllIlIIIlI.isEmpty())) {
                return 0;
            }
            if (!(intBank.isOpen())) break block12;
            v0 = new int[1];
            v0[0] = 2;
            if (!((int == 0)Inventory.contains((int[])v0))) ** GOTO lbl-1000
            v1 = new int[1];
            v1[0] = 2;
            if ((intEquipment.contains((int[])v1))) lbl-1000:
            // 2 sources

            {
                v2 = 1;
                0;
                if null != null {
                    return (boolean)((56 ^ 19 ^ (61 ^ 26)) & (107 ^ 117 ^ (127 ^ 109) ^ -1));
                }
            } else {
                v2 = 0;
            }
            if (var7 = v2 == 0) {
                v3 = new int[1];
                v3[0] = 2;
                if ((intBank.contains((int[])v3))) {
                    Bank.withdraw((int)2, (int)1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return 1;
                }
            }
            if ((int(var8 = var5.keySet().iterator()).hasNext())) {
                var9 = var8.next();
                var10 = var5.get(var9);
                v4 = new int[1];
                v4[0] = var9;
                if ((Bank.getCount((boolean)1 < (int[])v4), var10)) {
                    aD.cj.info(aD.var2[0], (Object)var9);
                    var6.cl.forceStop();
                    return 1;
                }
                Bank.withdrawAll((int)var9, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return 1;
            }
        }
        if ((intlllllllllllllllIlIllIIlllIlIIIlI.keySet().stream().noneMatch((Predicate<Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, a(java.lang.Integer ), (Ljava/lang/Integer;)Z)()))) {
            return 0;
        }
        if ((intBank.open())) {
            return 1;
        }
        var2_3 = BankLocation.getNearestCommon();
        Movement.walkTo((BankLocation)var2_3);
        0;
        return 1;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 0;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 0;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(Integer n2) {
        boolean bl;
        Integer var21;
        void var22;
        at[] atArray = at.values();
        int n3 = atArray.length;
        int var23 = 0;
        while ((var23 < (int)var22)) {
            void var24;
            void var25 = var24[var23];
            if (var25 != lllllllllllllllIlIllIIlllIIlIlII2) {
                if (var25 == lllllllllllllllIlIllIIlllIIlIlII2) {
                    0;
                    if (((83 + 133 - 84 + 15 ^ 83 + 81 - 155 + 173) & (0x4F ^ 0x27 ^ (0xF8 ^ 0xB5) ^ -1)) != 0) {
                        return ((94 + 75 - 63 + 30 ^ 154 + 166 - 249 + 96) & (0x84 ^ 0xA1 ^ (0x20 ^ 0x2A) ^ -1)) != 0;
                    }
                } else if ((var25.bf().aA() == var21)) {
                    return 1;
                }
            }
            ++var23;
            0;
            if (((0x7B ^ 0x6C ^ (0x89 ^ 0xC4)) & (20 + 128 - 14 + 104 ^ 55 + 138 - 135 + 122 ^ -1)) == 0) continue;
            return ((223 + 9 - 175 + 186 ^ 29 + 118 - -7 + 12) & (60 + 156 - 114 + 113 ^ 113 + 25 - 20 + 12 ^ -1)) != 0;
        }
        if ((var21 == ax.GIANT_SEAWEED.bf().aA())) {
            bl = 1;
            0;
            if (1 == ((0x51 ^ 0x12 ^ (0x6D ^ 0x37)) & (0x92 ^ 0x9F ^ (0x60 ^ 0x74) ^ -1))) {
                return ((0x85 ^ 0xA1 ^ (0xC3 ^ 0xAF)) & (0xF5 ^ 0x88 ^ (0xF6 ^ 0xC3) ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

    @Inject
    public BankingForHerbRunSeedsTask(SquireFarmerConfig squireFarmerConfig, SquireFarmer squireFarmer, f f2) {
        this.ck = squireFarmerConfig;
        this.cl = squireFarmer;
        this.cm = f2;
    }

    private static void var4() {
        var2 = new String[1];
        aD.var2[0] = "Stopping cause we are out of seed (seed id = {})";
    }

}

