/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquirePlunder;
import gg.squire.thieving.SquirePlunderConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a;

@TaskDesc(name="Banking", priority=25)
public class d
extends Task {
    private static /* synthetic */ String[] llllllIIlIIl;
    private final /* synthetic */ SquirePlunder r;
    private final /* synthetic */ Client u;
    private static /* synthetic */ int[] llllllIIlIlI;
    private final /* synthetic */ a s;
    private final /* synthetic */ SquirePlunderConfig t;

    static {
        d.lIIlIlIIIIlIIII();
        d.lIIlIlIIIIIllll();
    }

    private static boolean lIIlIlIIIIlIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIlIIIIlIIII() {
        llllllIIlIlI = new int[8];
        d.llllllIIlIlI[0] = " ".length();
        d.llllllIIlIlI[1] = (0x8F ^ 0xC6 ^ "  ".length()) & (119 + 99 - 201 + 214 ^ 66 + 44 - 42 + 104 ^ -" ".length());
        d.llllllIIlIlI[2] = -(0xFFFFAA7D & 0x7583) & (0xFFFFBFFF & 0x6947);
        d.llllllIIlIlI[3] = -(0xFFFFE76F & 0x79B9) & (0xFFFFFF7F & 0x7FED);
        d.llllllIIlIlI[4] = 0xFFFFABEF & 0x5EFF;
        d.llllllIIlIlI[5] = 0xFFFF9775 & 0x7CBB;
        d.llllllIIlIlI[6] = "  ".length();
        d.llllllIIlIlI[7] = 54 + 61 - 15 + 52 ^ 132 + 54 - 109 + 67;
    }

    private static String lIIlIlIIIIIllIl(String lllllllllllllllIIlIIlllIllIlIIII, String lllllllllllllllIIlIIlllIllIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlllIllIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIllIIllIl.getBytes(StandardCharsets.UTF_8)), llllllIIlIlI[7]), "DES");
            Cipher lllllllllllllllIIlIIlllIllIlIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlllIllIlIIlI.init(llllllIIlIlI[6], lllllllllllllllIIlIIlllIllIlIIll);
            return new String(lllllllllllllllIIlIIlllIllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlllIllIlIIIl) {
            lllllllllllllllIIlIIlllIllIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIlIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIlIIIIIllll() {
        llllllIIlIIl = new String[llllllIIlIlI[6]];
        d.llllllIIlIIl[d.llllllIIlIlI[1]] = d.lIIlIlIIIIIllIl("wFa2qk0c0h17lPXu3kKWDSYceQNW7dtFciDzf/XvXtw1p9U+q8IbCoBEqVRIFjh9d12MVhzwp1w=", "BMSDu");
        d.llllllIIlIIl[d.llllllIIlIlI[0]] = d.lIIlIlIIIIIlllI("lFzCQ4ECWf2cffdR+qV/zUGqm3K/VwKd3sx4qlKhuK8i4W7EDkMUgfYbI08NW6j7uSLfLtdo+yJO8Al26md4pw==", "qCATi");
    }

    private static boolean lIIlIlIIIIlIIlI(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        d lllllllllllllllIIlIIlllIllIllIII;
        int[] nArray = new int[llllllIIlIlI[0]];
        nArray[d.llllllIIlIlI[1]] = this.t.foodID();
        if (d.lIIlIlIIIIlIIIl(Inventory.getCount((int[])nArray), this.t.minFoodAmount()) && d.lIIlIlIIIIlIIIl(Inventory.getCount(item -> item.getName().startsWith(this.t.antiPoison())), this.t.minAntiAmount())) {
            return llllllIIlIlI[1];
        }
        if (d.lIIlIlIIIIlIIlI(lllllllllllllllIIlIIlllIllIllIII.u.getVarbitValue(llllllIIlIlI[2]))) {
            return llllllIIlIlI[1];
        }
        if (d.lIIlIlIIIIlIIll(Players.getLocal().getWorldLocation().getRegionID(), llllllIIlIlI[3])) {
            return llllllIIlIlI[1];
        }
        if (d.lIIlIlIIIIlIlII(Movement.shouldWalk() ? 1 : 0)) {
            return llllllIIlIlI[1];
        }
        if (d.lIIlIlIIIIlIIlI(Bank.isOpen() ? 1 : 0)) {
            if (d.lIIlIlIIIIlIIlI(lllllllllllllllIIlIIlllIllIllIII.t.foodAmount())) {
                int[] nArray2 = new int[llllllIIlIlI[0]];
                nArray2[d.llllllIIlIlI[1]] = lllllllllllllllIIlIIlllIllIllIII.t.foodID();
                if (d.lIIlIlIIIIlIlIl(Bank.getCount((boolean)llllllIIlIlI[0], (int[])nArray2), lllllllllllllllIIlIIlllIllIllIII.t.foodAmount())) {
                    Log.info((String)llllllIIlIIl[llllllIIlIlI[1]]);
                    lllllllllllllllIIlIIlllIllIllIII.r.forceStop();
                    return llllllIIlIlI[0];
                }
            }
            if (d.lIIlIlIIIIlIIlI(lllllllllllllllIIlIIlllIllIllIII.t.antiAmount()) && d.lIIlIlIIIIlIlIl(Bank.getCount((boolean)llllllIIlIlI[0], item -> item.getName().startsWith(this.t.antiPoison())), lllllllllllllllIIlIIlllIllIllIII.t.antiAmount())) {
                Log.info((String)llllllIIlIIl[llllllIIlIlI[0]]);
                lllllllllllllllIIlIIlllIllIllIII.r.forceStop();
                return llllllIIlIlI[0];
            }
            lllllllllllllllIIlIIlllIllIllIII.r.b().withdraw();
            "".length();
        }
        if (d.lIIlIlIIIIlIlII(Bank.open() ? 1 : 0)) {
            int[] nArray3 = new int[llllllIIlIlI[0]];
            nArray3[d.llllllIIlIlI[1]] = lllllllllllllllIIlIIlllIllIllIII.t.foodID();
            System.out.println("Walking to bank; Food in inventory: " + Inventory.getCount((int[])nArray3) + " amount wanted " + lllllllllllllllIIlIIlllIllIllIII.t.minFoodAmount());
            Movement.walkTo((WorldPoint)new WorldPoint(llllllIIlIlI[4], llllllIIlIlI[5], llllllIIlIlI[1]));
            "".length();
            return llllllIIlIlI[0];
        }
        return llllllIIlIlI[1];
    }

    private static boolean lIIlIlIIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public d(SquirePlunder squirePlunder, a a2, SquirePlunderConfig squirePlunderConfig, Client client) {
        this.r = squirePlunder;
        this.s = a2;
        this.t = squirePlunderConfig;
        this.u = client;
    }

    private static String lIIlIlIIIIIlllI(String lllllllllllllllIIlIIlllIllIIIIIl, String lllllllllllllllIIlIIlllIllIIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlllIllIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIllIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlllIllIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlllIllIIIlIl.init(llllllIIlIlI[6], lllllllllllllllIIlIIlllIllIIIllI);
            return new String(lllllllllllllllIIlIIlllIllIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlllIllIIIlII) {
            lllllllllllllllIIlIIlllIllIIIlII.printStackTrace();
            return null;
        }
    }
}

