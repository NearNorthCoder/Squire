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

import -.m.e.a.u.s.r.r.q.i.r.e.f.at;
import -.m.e.a.u.s.r.r.q.i.r.e.f.ax;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.o;
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

@TaskDesc(name="Banking for herb run seeds", priority=1000, blocking=true)
public class aD
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
        cj = LoggerFactory.getLogger(aD.class);
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
            lllllllllllllllIlIllIIlllIlIIIlI = lllllllllllllllIlIllIIlllIlIIIll.cm.F();
            if (aD.lllIllIllllIll((int)lllllllllllllllIlIllIIlllIlIIIlI.isEmpty())) {
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
                "".length();
                if (null != null) {
                    return (boolean)((56 ^ 19 ^ (61 ^ 26)) & (107 ^ 117 ^ (127 ^ 109) ^ -" ".length()));
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
            if (aD.lllIllIllllIll((int)(lllllllllllllllIlIllIIlllIlIIIII = lllllllllllllllIlIllIIlllIlIIIlI.keySet().iterator()).hasNext())) {
                lllllllllllllllIlIllIIlllIIlllll = lllllllllllllllIlIllIIlllIlIIIII.next();
                lllllllllllllllIlIllIIlllIIllllI = lllllllllllllllIlIllIIlllIlIIIlI.get(lllllllllllllllIlIllIIlllIIlllll);
                v4 = new int[aD.lIllllIIlIII[1]];
                v4[aD.lIllllIIlIII[0]] = lllllllllllllllIlIllIIlllIIlllll;
                if (aD.lllIllIlllllIl(Bank.getCount((boolean)aD.lIllllIIlIII[1], (int[])v4), lllllllllllllllIlIllIIlllIIllllI)) {
                    aD.cj.info(aD.lIllllIIIlll[aD.lIllllIIlIII[0]], (Object)lllllllllllllllIlIllIIlllIIlllll);
                    lllllllllllllllIlIllIIlllIlIIIll.cl.forceStop();
                    return aD.lIllllIIlIII[1];
                }
                Bank.withdrawAll((int)lllllllllllllllIlIllIIlllIIlllll, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return aD.lIllllIIlIII[1];
            }
        }
        if (aD.lllIllIllllIll((int)lllllllllllllllIlIllIIlllIlIIIlI.keySet().stream().noneMatch((Predicate<Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, a(java.lang.Integer ), (Ljava/lang/Integer;)Z)()))) {
            return aD.lIllllIIlIII[0];
        }
        if (aD.lllIllIllllIll((int)Bank.open())) {
            return aD.lIllllIIlIII[1];
        }
        var2_3 = BankLocation.getNearestCommon();
        Movement.walkTo((BankLocation)var2_3);
        "".length();
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

    private static String lllIllIlllIllI(String lllllllllllllllIlIllIIlllIIIlIIl, String lllllllllllllllIlIllIIlllIIIIIll) {
        lllllllllllllllIlIllIIlllIIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIlllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIlllIIIIlll = new StringBuilder();
        char[] lllllllllllllllIlIllIIlllIIIIllI = lllllllllllllllIlIllIIlllIIIIIll.toCharArray();
        int lllllllllllllllIlIllIIlllIIIIlIl = lIllllIIlIII[0];
        char[] lllllllllllllllIlIllIIllIlllllll = lllllllllllllllIlIllIIlllIIIlIIl.toCharArray();
        int lllllllllllllllIlIllIIllIllllllI = lllllllllllllllIlIllIIllIlllllll.length;
        int lllllllllllllllIlIllIIllIlllllIl = lIllllIIlIII[0];
        while (aD.lllIllIlllllIl(lllllllllllllllIlIllIIllIlllllIl, lllllllllllllllIlIllIIllIllllllI)) {
            char lllllllllllllllIlIllIIlllIIIlIlI = lllllllllllllllIlIllIIllIlllllll[lllllllllllllllIlIllIIllIlllllIl];
            lllllllllllllllIlIllIIlllIIIIlll.append((char)(lllllllllllllllIlIllIIlllIIIlIlI ^ lllllllllllllllIlIllIIlllIIIIllI[lllllllllllllllIlIllIIlllIIIIlIl % lllllllllllllllIlIllIIlllIIIIllI.length]));
            "".length();
            ++lllllllllllllllIlIllIIlllIIIIlIl;
            ++lllllllllllllllIlIllIIllIlllllIl;
            "".length();
            if (" ".length() > -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIllIIlllIIIIlll);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean a(Integer n2) {
        boolean bl;
        Integer lllllllllllllllIlIllIIlllIIllIII;
        void lllllllllllllllIlIllIIlllIIlIllI;
        at[] atArray = at.values();
        int n3 = atArray.length;
        int lllllllllllllllIlIllIIlllIIlIlIl = lIllllIIlIII[0];
        while (aD.lllIllIlllllIl(lllllllllllllllIlIllIIlllIIlIlIl, (int)lllllllllllllllIlIllIIlllIIlIllI)) {
            void lllllllllllllllIlIllIIlllIIlIlll;
            void lllllllllllllllIlIllIIlllIIlIlII = lllllllllllllllIlIllIIlllIIlIlll[lllllllllllllllIlIllIIlllIIlIlIl];
            if (aD.lllIllIllllIIl(lllllllllllllllIlIllIIlllIIlIlII, at.NOTHING)) {
                if (aD.lllIllIllllIlI(lllllllllllllllIlIllIIlllIIlIlII, at.DEFAULT)) {
                    "".length();
                    if (((83 + 133 - 84 + 15 ^ 83 + 81 - 155 + 173) & (0x4F ^ 0x27 ^ (0xF8 ^ 0xB5) ^ -" ".length())) != 0) {
                        return ((94 + 75 - 63 + 30 ^ 154 + 166 - 249 + 96) & (0x84 ^ 0xA1 ^ (0x20 ^ 0x2A) ^ -" ".length())) != 0;
                    }
                } else if (aD.lllIllIllllllI(lllllllllllllllIlIllIIlllIIlIlII.bf().aA(), lllllllllllllllIlIllIIlllIIllIII)) {
                    return lIllllIIlIII[1];
                }
            }
            ++lllllllllllllllIlIllIIlllIIlIlIl;
            "".length();
            if (((0x7B ^ 0x6C ^ (0x89 ^ 0xC4)) & (20 + 128 - 14 + 104 ^ 55 + 138 - 135 + 122 ^ -" ".length())) == 0) continue;
            return ((223 + 9 - 175 + 186 ^ 29 + 118 - -7 + 12) & (60 + 156 - 114 + 113 ^ 113 + 25 - 20 + 12 ^ -" ".length())) != 0;
        }
        if (aD.lllIllIllllllI(lllllllllllllllIlIllIIlllIIllIII, ax.GIANT_SEAWEED.bf().aA())) {
            bl = lIllllIIlIII[1];
            "".length();
            if (" ".length() == ((0x51 ^ 0x12 ^ (0x6D ^ 0x37)) & (0x92 ^ 0x9F ^ (0x60 ^ 0x74) ^ -" ".length()))) {
                return ((0x85 ^ 0xA1 ^ (0xC3 ^ 0xAF)) & (0xF5 ^ 0x88 ^ (0xF6 ^ 0xC3) ^ -" ".length())) != 0;
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
        aD.lIllllIIIlll[aD.lIllllIIlIII[0]] = aD.lllIllIlllIllI("NzIYFjgNKBBGKwUzBANoEyNXBzoBZhgTPEQpEUY7ASMTRmAXIxICaA0iV1toHzte", "dFwfH");
    }

    private static void lllIllIllllIII() {
        lIllllIIlIII = new int[3];
        aD.lIllllIIlIII[0] = (0x32 ^ 0x12 ^ (0xE8 ^ 0xA9)) & (0x14 ^ 0x31 ^ (0xB ^ 0x4F) ^ -" ".length());
        aD.lIllllIIlIII[1] = " ".length();
        aD.lIllllIIlIII[2] = 0xFFFFDFFB & 0x3CF5;
    }

    private static boolean lllIllIllllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllIllIlllllII(int n2) {
        return n2 == 0;
    }
}

