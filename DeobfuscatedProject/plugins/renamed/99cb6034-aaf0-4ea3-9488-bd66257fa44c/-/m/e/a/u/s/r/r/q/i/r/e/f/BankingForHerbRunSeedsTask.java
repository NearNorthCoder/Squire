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
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.AXEnum;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.lang.invoke.LambdaMetafactory;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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

/* TASK: Banking for herb run seeds -> BankingforherbrunseedsTask */
@TaskDesc(name="Banking for herb run seeds", priority=1000, blocking=true)
public class BankingForHerbRunSeedsTask
extends Task {
    private final /* synthetic */ SquireFarmerConfig ck;
    private static /* synthetic */ int[] lIllllIIlIII;
    private final /* synthetic */ f cm;
    private static final /* synthetic */ Logger cj;
    private final /* synthetic */ SquireFarmer cl;
    private static /* synthetic */ String[] lIllllIIIlll;

    static {
        aD.lllIllIllllIII();
        aD.lllIllIlllIlll();
        cj = LoggerFactory.getLogger(BankingForHerbRunSeedsTask.class);
    }

    private static boolean lllIllIllllllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * Unable to fully structure code
     */
    public boolean run() {
        block12: {
            if (aD.lllIllIllllIIl((Object)this.cl.a(), (Object)o.HERBS)) {
                return aD.lIllllIIlIII[0];
            }
            if (!aD.lllIllIllllIlI(Game.getState(), GameState.LOGGED_IN) || aD.lllIllIllllIll((int)Players.getLocal().isAnimating())) {
                return aD.lIllllIIlIII[0];
            }
            var4 = var13.cm.F();
            if (aD.lllIllIllllIll((int)var4.isEmpty())) {
                return aD.lIllllIIlIII[0];
            }
            if (!aD.lllIllIllllIll((int)Bank.isOpen())) break block12;
            v0 = new int[aD.lIllllIIlIII[1]];
            v0[aD.lIllllIIlIII[0]] = aD.lIllllIIlIII[2];
            if (!aD.lllIllIlllllII((int)Inventory.contains((int[])v0))) ** GOTO lbl-1000
            v1 = new int[aD.lIllllIIlIII[1]];
            v1[aD.lIllllIIlIII[0]] = aD.lIllllIIlIII[2];
            if (aD.lllIllIllllIll((int)Equipment.contains((int[])v1))) lbl-1000:
            // 2 sources

            {
                v2 = aD.lIllllIIlIII[1];
                0;
                
                }
            } else {
                v2 = aD.lIllllIIlIII[0];
            }
            if (aD.lllIllIlllllII(lllllllllllllllIlIllIIlllIlIIIIl = v2)) {
                v3 = new int[aD.lIllllIIlIII[1]];
                v3[aD.lIllllIIlIII[0]] = aD.lIllllIIlIII[2];
                if (aD.lllIllIllllIll((int)Bank.contains((int[])v3))) {
                    Bank.withdraw((int)aD.lIllllIIlIII[2], (int)aD.lIllllIIlIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                    return aD.lIllllIIlIII[1];
                }
            }
            if (aD.lllIllIllllIll((int)(var3 = var4.keySet().iterator()).hasNext())) {
                var7 = var3.next();
                var17 = var4.get(var7);
                v4 = new int[aD.lIllllIIlIII[1]];
                v4[aD.lIllllIIlIII[0]] = var7;
                if (aD.lllIllIlllllIl(Bank.getCount((boolean)aD.lIllllIIlIII[1], (int[])v4), var17)) {
                    aD.cj.info(aD.lIllllIIIlll[aD.lIllllIIlIII[0]], (Object)var7);
                    var13.cl.forceStop();
                    return aD.lIllllIIlIII[1];
                }
                Bank.withdrawAll((int)var7, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return aD.lIllllIIlIII[1];
            }
        }
        if (aD.lllIllIllllIll((int)var4.keySet().stream().noneMatch((Predicate<Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, a(java.lang.Integer ), (Ljava/lang/Integer;)Z)()))) {
            return aD.lIllllIIlIII[0];
        }
        if (aD.lllIllIllllIll((int)Bank.open())) {
            return aD.lIllllIIlIII[1];
        }
        var2_3 = BankLocation.getNearestCommon();
        Movement.walkTo((BankLocation)var2_3);
        0;
        return aD.lIllllIIlIII[1];
    }

    private static boolean lllIllIllllIll(int n2) {
        return n2 != 0;
    }

    private static boolean lllIllIllllIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIllIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIllIlllIllI(String var19, String var2) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var1 = var2.toCharArray();
        int var15 = lIllllIIlIII[0];
        char[] var16 = var19.toCharArray();
        int var10 = var16.length;
        int var14 = lIllllIIlIII[0];
        while (aD.lllIllIlllllIl(var14, var10)) {
            char var5 = var16[var14];
            var8.append((char)(var5 ^ var1[var15 % var1.length]));
            0;
            ++var15;
            ++var14;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean a(Integer n2) {
        boolean bl;
        Integer var11;
        void var18;
        at[] atArray = at.values();
        int n3 = atArray.length;
        int var6 = lIllllIIlIII[0];
        while (aD.lllIllIlllllIl(var6, (int)var18)) {
            void var9;
            void var12 = var9[var6];
            if (aD.lllIllIllllIIl(var12, at.NOTHING)) {
                if (aD.lllIllIllllIlI(var12, at.DEFAULT)) {
                    0;
                    if (((83 + 133 - 84 + 15 ^ 83 + 81 - 155 + 173) & (0x4F ^ 0x27 ^ (0xF8 ^ 0xB5) ^ -1)) != 0) {
                        return ((94 + 75 - 63 + 30 ^ 154 + 166 - 249 + 96) & (0x84 ^ 0xA1 ^ (0x20 ^ 0x2A) ^ -1)) != 0;
                    }
                } else if (aD.lllIllIllllllI(var12.bf().aA(), var11)) {
                    return lIllllIIlIII[1];
                }
            }
            ++var6;
            0;
            if (((0x7B ^ 0x6C ^ (0x89 ^ 0xC4)) & (20 + 128 - 14 + 104 ^ 55 + 138 - 135 + 122 ^ -1)) == 0) continue;
            return false;
        }
        if (aD.lllIllIllllllI(var11, ax.GIANT_SEAWEED.bf().aA())) {
            bl = lIllllIIlIII[1];
            0;
            if (1 == ((0x51 ^ 0x12 ^ (0x6D ^ 0x37)) & (0x92 ^ 0x9F ^ (0x60 ^ 0x74) ^ -1))) {
                return ((0x85 ^ 0xA1 ^ (0xC3 ^ 0xAF)) & (0xF5 ^ 0x88 ^ (0xF6 ^ 0xC3) ^ -1)) != 0;
            }
        } else {
            bl = lIllllIIlIII[0];
        }
        return bl;
    }

    @Inject
    public aD(SquireFarmerConfig squireFarmerConfig, SquireFarmer squireFarmer, f f2) {
        this.ck = squireFarmerConfig;
        this.cl = squireFarmer;
        this.cm = f2;
    }

    private static void lllIllIlllIlll() {
        lIllllIIIlll = new String[lIllllIIlIII[1]];
        aD.lIllllIIIlll[aD.lIllllIIlIII[0]] = aD."Stopping cause we are out of seed (seed id = {})";
    }

    private static void lllIllIllllIII() {
        lIllllIIlIII = new int[3];
        aD.lIllllIIlIII[0] = (0x32 ^ 0x12 ^ (0xE8 ^ 0xA9)) & (0x14 ^ 0x31 ^ (0xB ^ 0x4F) ^ -1);
        aD.lIllllIIlIII[1] = 1;
        aD.lIllllIIlIII[2] = 0xFFFFDFFB & 0x3CF5;
    }

    private static boolean lllIllIllllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIllIlllllII(int n2) {
        return n2 == 0;
    }
}

