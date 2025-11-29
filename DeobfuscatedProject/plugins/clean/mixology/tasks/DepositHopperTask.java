/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.mixology.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mixology.SquireMixology;
import gg.squire.mixology.SquireMixologyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import gg.squire.mixology.tasks.GameEnum15;
import gg.squire.mixology.tasks.SHelper;

@TaskDesc(name="Deposit hopper")
public class DepositHopperTask
extends Task {
    private  int O;
    private  int J;

    private final  SquireMixologyConfig M;
    private  int N;
    private  int P;
    private  int K;
    private  int I;

    static {
        i.lIIlIllIIIllIIl();
        i.lIIlIllIIIlIIlI();
    }

    private static boolean lIIlIllIIlIIIlI(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIlIllIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIllIIIlIIlI() {
        lIIIIIIIIIIll = new String[lIIIIIIIIIlII[41]];
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[6]] = "Bank Chest";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[9]] = "Mox paste";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[11]] = "Bank Chest";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[12]] = "Opening bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[13]] = "Use";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[10]] = "Walk closer to bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[16]] = "Mox paste";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[17]] = "Mox";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[18]] = "Refilling mox paste";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[19]] = "Hopper";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[20]] = "Deposit";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[21]] = "Empty";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[23]] = "Bank Chest";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[24]] = "Opening bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[25]] = "Use";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[26]] = "Walk closer to bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[27]] = "Aga";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[28]] = "Refilling Aga paste";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[29]] = "Hopper";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[30]] = "Deposit";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[31]] = "Empty";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[32]] = "Bank Chest";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[33]] = "Opening bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[34]] = "Use";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[35]] = "Walk closer to bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[36]] = "Lye";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[37]] = "Refilling Lye paste";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[38]] = "Hopper";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[39]] = "Deposit";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[40]] = "Empty";
    }

    @Inject
    public DepositHopperTask(SquireMixologyConfig squireMixologyConfig) {
        this.I = lIIIIIIIIIlII[0];
        this.J = lIIIIIIIIIlII[1];
        this.K = lIIIIIIIIIlII[2];
        this.N = lIIIIIIIIIlII[3];
        this.O = lIIIIIIIIIlII[4];
        this.P = lIIIIIIIIIlII[5];
        this.M = squireMixologyConfig;
    }

    private static boolean lIIlIllIIlIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIllIIlIIIIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIllIIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIllIIIllIll(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        TileObject var2;
        i var3;
        block38: {
            block40: {
                block39: {
                    if (i.lIIlIllIIIllIlI(s.e() ? 1 : 0)) {
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIIllIll((Object)var3.M.pluginMode(), (Object)d.MINIGAME)) {
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIIlllII(Vars.getBit((int)lIIIIIIIIIlII[7]))) {
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIIlllIl(Vars.getBit((int)var3.I), lIIIIIIIIIlII[8]) && i.lIIlIllIIIlllIl(Vars.getBit((int)var3.J), lIIIIIIIIIlII[8]) && i.lIIlIllIIIlllIl(Vars.getBit((int)var3.K), lIIIIIIIIIlII[8]) && i.lIIlIllIIIllIlI(Players.getLocal().isAnimating() ? 1 : 0) && i.lIIlIllIIIllIlI(s.f() ? 1 : 0) && i.lIIlIllIIIllIlI(s.DepositHopperTask() ? 1 : 0)) {
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIIlllIl(Vars.getBit((int)var3.I), lIIIIIIIIIlII[8]) && i.lIIlIllIIIlllIl(Vars.getBit((int)var3.J), lIIIIIIIIIlII[8]) && !i.lIIlIllIIIllllI(Vars.getBit((int)var3.K), lIIIIIIIIIlII[8])) break block38;
                    if (!i.lIIlIllIIIlllll(Players.getLocal().isAnimating() ? 1 : 0)) break block39;
                    String[] stringArray = new String[lIIIIIIIIIlII[9]];
                    stringArray[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[6]];
                    if (!i.lIIlIllIIlIIIII(TileObjects.getNearest((String[])stringArray).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIIIlII[10])) break block40;
                }
                if (i.lIIlIllIIIllIlI(s.f() ? 1 : 0) && !i.lIIlIllIIIlllll(s.DepositHopperTask() ? 1 : 0)) break block38;
            }
            return lIIIIIIIIIlII[6];
        }
        if (i.lIIlIllIIIlllll(SquireMixology.j ? 1 : 0)) {
            return lIIIIIIIIIlII[6];
        }
        if (i.lIIlIllIIIllllI(Vars.getBit((int)var3.I), lIIIIIIIIIlII[8])) {
            String[] stringArray = new String[lIIIIIIIIIlII[9]];
            stringArray[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[9]];
            if (i.lIIlIllIIIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (i.lIIlIllIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIIIIIIlII[9]];
                    stringArray2[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[11]];
                    var2 = TileObjects.getNearest((String[])stringArray2);
                    if (i.lIIlIllIIlIIIIl(var2)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[12]];
                        var2.interact(lIIIIIIIIIIll[lIIIIIIIIIlII[13]]);
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIlIIIlI(var2)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[10]];
                        WorldPoint var4 = new WorldPoint(lIIIIIIIIIlII[14], lIIIIIIIIIlII[15], lIIIIIIIIIlII[6]);
                        Movement.setDestination((WorldPoint)var4);
                        return lIIIIIIIIIlII[6];
                    }
                }
                if (i.lIIlIllIIIlllll(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray = new int[lIIIIIIIIIlII[9]];
                    nArray[i.lIIIIIIIIIlII[6]] = var3.N;
                    if (i.lIIlIllIIIllIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                        String[] stringArray3 = new String[lIIIIIIIIIlII[9]];
                        stringArray3[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[16]];
                        if (i.lIIlIllIIIllIlI(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                            SquireMixology.j = lIIIIIIIIIlII[9];
                            SquireMixology.q = lIIIIIIIIIIll[lIIIIIIIIIlII[17]];
                            return lIIIIIIIIIlII[6];
                        }
                    }
                    int[] nArray2 = new int[lIIIIIIIIIlII[9]];
                    nArray2[i.lIIIIIIIIIlII[6]] = var3.N;
                    if (i.lIIlIllIIIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdrawAll((int)var3.N, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        return lIIIIIIIIIlII[6];
                    }
                }
            }
            int[] nArray = new int[lIIIIIIIIIlII[9]];
            nArray[i.lIIIIIIIIIlII[6]] = var3.N;
            if (i.lIIlIllIIIlllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[18]];
                String[] stringArray4 = new String[lIIIIIIIIIlII[9]];
                stringArray4[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[19]];
                TileObjects.getNearest((String[])stringArray4).interact(lIIIIIIIIIIll[lIIIIIIIIIlII[20]]);
                SquireMixology.m = lIIIIIIIIIIll[lIIIIIIIIIlII[21]];
                SquireMixology.r = lIIIIIIIIIlII[22];
                SquireMixology.A = lIIIIIIIIIlII[6];
                SquireMixology.k = lIIIIIIIIIlII[6];
                return lIIIIIIIIIlII[6];
            }
        }
        if (i.lIIlIllIIIllllI(Vars.getBit((int)var3.J), lIIIIIIIIIlII[8])) {
            int[] nArray = new int[lIIIIIIIIIlII[9]];
            nArray[i.lIIIIIIIIIlII[6]] = var3.P;
            if (i.lIIlIllIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (i.lIIlIllIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIIIlII[9]];
                    stringArray[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[23]];
                    var2 = TileObjects.getNearest((String[])stringArray);
                    if (i.lIIlIllIIlIIIIl(var2)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[24]];
                        var2.interact(lIIIIIIIIIIll[lIIIIIIIIIlII[25]]);
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIlIIIlI(var2)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[26]];
                        WorldPoint var4 = new WorldPoint(lIIIIIIIIIlII[14], lIIIIIIIIIlII[15], lIIIIIIIIIlII[6]);
                        Movement.setDestination((WorldPoint)var4);
                        return lIIIIIIIIIlII[6];
                    }
                }
                if (i.lIIlIllIIIlllll(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray3 = new int[lIIIIIIIIIlII[9]];
                    nArray3[i.lIIIIIIIIIlII[6]] = var3.P;
                    if (i.lIIlIllIIIllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[lIIIIIIIIIlII[9]];
                        nArray4[i.lIIIIIIIIIlII[6]] = var3.P;
                        if (i.lIIlIllIIIllIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            SquireMixology.j = lIIIIIIIIIlII[9];
                            SquireMixology.q = lIIIIIIIIIIll[lIIIIIIIIIlII[27]];
                            return lIIIIIIIIIlII[6];
                        }
                    }
                    int[] nArray5 = new int[lIIIIIIIIIlII[9]];
                    nArray5[i.lIIIIIIIIIlII[6]] = var3.P;
                    if (i.lIIlIllIIIlllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                        Bank.withdrawAll((int)var3.P, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        return lIIIIIIIIIlII[6];
                    }
                }
            }
            int[] nArray6 = new int[lIIIIIIIIIlII[9]];
            nArray6[i.lIIIIIIIIIlII[6]] = var3.P;
            if (i.lIIlIllIIIlllll(Inventory.contains((int[])nArray6) ? 1 : 0)) {
                SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[28]];
                String[] stringArray = new String[lIIIIIIIIIlII[9]];
                stringArray[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[29]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIIIIll[lIIIIIIIIIlII[30]]);
                SquireMixology.m = lIIIIIIIIIIll[lIIIIIIIIIlII[31]];
                SquireMixology.r = lIIIIIIIIIlII[22];
                SquireMixology.A = lIIIIIIIIIlII[6];
                SquireMixology.k = lIIIIIIIIIlII[6];
                return lIIIIIIIIIlII[6];
            }
        }
        if (i.lIIlIllIIIllllI(Vars.getBit((int)var3.K), lIIIIIIIIIlII[8])) {
            int[] nArray = new int[lIIIIIIIIIlII[9]];
            nArray[i.lIIIIIIIIIlII[6]] = var3.O;
            if (i.lIIlIllIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (i.lIIlIllIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIIIlII[9]];
                    stringArray[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[32]];
                    var2 = TileObjects.getNearest((String[])stringArray);
                    if (i.lIIlIllIIlIIIIl(var2)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[33]];
                        var2.interact(lIIIIIIIIIIll[lIIIIIIIIIlII[34]]);
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIlIIIlI(var2)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[35]];
                        WorldPoint var4 = new WorldPoint(lIIIIIIIIIlII[14], lIIIIIIIIIlII[15], lIIIIIIIIIlII[6]);
                        Movement.setDestination((WorldPoint)var4);
                        return lIIIIIIIIIlII[6];
                    }
                }
                if (i.lIIlIllIIIlllll(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray7 = new int[lIIIIIIIIIlII[9]];
                    nArray7[i.lIIIIIIIIIlII[6]] = var3.O;
                    if (i.lIIlIllIIIllIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lIIIIIIIIIlII[9]];
                        nArray8[i.lIIIIIIIIIlII[6]] = var3.O;
                        if (i.lIIlIllIIIllIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            SquireMixology.j = lIIIIIIIIIlII[9];
                            SquireMixology.q = lIIIIIIIIIIll[lIIIIIIIIIlII[36]];
                            return lIIIIIIIIIlII[6];
                        }
                    }
                    int[] nArray9 = new int[lIIIIIIIIIlII[9]];
                    nArray9[i.lIIIIIIIIIlII[6]] = var3.O;
                    if (i.lIIlIllIIIlllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        Bank.withdrawAll((int)var3.O, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        return lIIIIIIIIIlII[6];
                    }
                }
            }
            int[] nArray10 = new int[lIIIIIIIIIlII[9]];
            nArray10[i.lIIIIIIIIIlII[6]] = var3.O;
            if (i.lIIlIllIIIlllll(Inventory.contains((int[])nArray10) ? 1 : 0)) {
                SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[37]];
                String[] stringArray = new String[lIIIIIIIIIlII[9]];
                stringArray[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[38]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIIIIll[lIIIIIIIIIlII[39]]);
                SquireMixology.m = lIIIIIIIIIIll[lIIIIIIIIIlII[40]];
                SquireMixology.r = lIIIIIIIIIlII[22];
                SquireMixology.A = lIIIIIIIIIlII[6];
                SquireMixology.k = lIIIIIIIIIlII[6];
                return lIIIIIIIIIlII[6];
            }
        }
        return lIIIIIIIIIlII[6];
    }

    private static boolean lIIlIllIIIlllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIllIIIlllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIllIIIlllIl(int n2, int n3) {
        return n2 >= n3;
    }
}

