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
package o.m.-.g.q.i.l.i.r.y.o.e.x.u.s;

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
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.d;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s;

/* TASK: Deposit hopper -> DeposithopperTask */
@TaskDesc(name="Deposit hopper")
public class i
extends Task {
    private /* synthetic */ int O;
    private /* synthetic */ int J;
    private static /* synthetic */ int[] lIIIIIIIIIlII;
    private static /* synthetic */ String[] lIIIIIIIIIIll;
    private final /* synthetic */ SquireMixologyConfig M;
    private /* synthetic */ int N;
    private /* synthetic */ int P;
    private /* synthetic */ int K;
    private /* synthetic */ int I;

    private static String lIIlIllIIIlIIII(String var4, String var8) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIIIIIIIIIlII[11], var12);
            return new String(var19.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    static {
        i.lIIlIllIIIllIIl();
        i.lIIlIllIIIlIIlI();
    }

    private static boolean lIIlIllIIlIIIlI(Object object) {
        return object == null;
    }

    private static String lIIlIllIIIIllll(String var3, String var14) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var10 = var14.toCharArray();
        int var20 = lIIIIIIIIIlII[6];
        char[] var17 = var3.toCharArray();
        int var9 = var17.length;
        int var7 = lIIIIIIIIIlII[6];
        while (i.lIIlIllIIIllllI(var7, var9)) {
            char var1 = var17[var7];
            var2.append((char)(var1 ^ var10[var20 % var10.length]));
            0;
            ++var20;
            ++var7;
            0;
            if ((0x20 ^ 0x4C ^ (0x51 ^ 0x39)) >= 1) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lIIlIllIIIllIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIllIIIlIIlI() {
        lIIIIIIIIIIll = new String[lIIIIIIIIIlII[41]];
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[6]] = i."Bank Chest";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[9]] = i."Mox paste";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[11]] = i."Bank Chest";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[12]] = i."Opening bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[13]] = i."Use";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[10]] = i."Walk closer to bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[16]] = i."Mox paste";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[17]] = i."Mox";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[18]] = i."Refilling mox paste";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[19]] = i."Hopper";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[20]] = i."Deposit";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[21]] = i."Empty";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[23]] = i."Bank Chest";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[24]] = i."Opening bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[25]] = i."Use";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[26]] = i."Walk closer to bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[27]] = i."Aga";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[28]] = i."Refilling Aga paste";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[29]] = i."Hopper";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[30]] = i."Deposit";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[31]] = i."Empty";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[32]] = i."Bank Chest";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[33]] = i."Opening bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[34]] = i."Use";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[35]] = i."Walk closer to bank";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[36]] = i."Lye";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[37]] = i."Refilling Lye paste";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[38]] = i."Hopper";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[39]] = i."Deposit";
        i.lIIIIIIIIIIll[i.lIIIIIIIIIlII[40]] = i."Empty";
    }

    private static String lIIlIllIIIlIIIl(String var18, String var5) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIIlII[18]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIIIIIIIIlII[11], var22);
            return new String(var6.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    @Inject
    public i(SquireMixologyConfig squireMixologyConfig) {
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
        TileObject var15;
        i var21;
        block38: {
            block40: {
                block39: {
                    if (i.lIIlIllIIIllIlI(s.e() ? 1 : 0)) {
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIIllIll((Object)var21.M.pluginMode(), (Object)d.MINIGAME)) {
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIIlllII(Vars.getBit((int)lIIIIIIIIIlII[7]))) {
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIIlllIl(Vars.getBit((int)var21.I), lIIIIIIIIIlII[8]) && i.lIIlIllIIIlllIl(Vars.getBit((int)var21.J), lIIIIIIIIIlII[8]) && i.lIIlIllIIIlllIl(Vars.getBit((int)var21.K), lIIIIIIIIIlII[8]) && i.lIIlIllIIIllIlI(Players.getLocal().isAnimating() ? 1 : 0) && i.lIIlIllIIIllIlI(s.f() ? 1 : 0) && i.lIIlIllIIIllIlI(s.i() ? 1 : 0)) {
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIIlllIl(Vars.getBit((int)var21.I), lIIIIIIIIIlII[8]) && i.lIIlIllIIIlllIl(Vars.getBit((int)var21.J), lIIIIIIIIIlII[8]) && !i.lIIlIllIIIllllI(Vars.getBit((int)var21.K), lIIIIIIIIIlII[8])) break block38;
                    if (!i.lIIlIllIIIlllll(Players.getLocal().isAnimating() ? 1 : 0)) break block39;
                    String[] stringArray = new String[lIIIIIIIIIlII[9]];
                    stringArray[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[6]];
                    if (!i.lIIlIllIIlIIIII(TileObjects.getNearest((String[])stringArray).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIIIIlII[10])) break block40;
                }
                if (i.lIIlIllIIIllIlI(s.f() ? 1 : 0) && !i.lIIlIllIIIlllll(s.i() ? 1 : 0)) break block38;
            }
            return lIIIIIIIIIlII[6];
        }
        if (i.lIIlIllIIIlllll(SquireMixology.j ? 1 : 0)) {
            return lIIIIIIIIIlII[6];
        }
        if (i.lIIlIllIIIllllI(Vars.getBit((int)var21.I), lIIIIIIIIIlII[8])) {
            String[] stringArray = new String[lIIIIIIIIIlII[9]];
            stringArray[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[9]];
            if (i.lIIlIllIIIllIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                if (i.lIIlIllIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIIIIIIlII[9]];
                    stringArray2[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[11]];
                    var15 = TileObjects.getNearest((String[])stringArray2);
                    if (i.lIIlIllIIlIIIIl(var15)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[12]];
                        var15.interact(lIIIIIIIIIIll[lIIIIIIIIIlII[13]]);
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIlIIIlI(var15)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[10]];
                        WorldPoint var11 = new WorldPoint(lIIIIIIIIIlII[14], lIIIIIIIIIlII[15], lIIIIIIIIIlII[6]);
                        Movement.setDestination((WorldPoint)var11);
                        return lIIIIIIIIIlII[6];
                    }
                }
                if (i.lIIlIllIIIlllll(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray = new int[lIIIIIIIIIlII[9]];
                    nArray[i.lIIIIIIIIIlII[6]] = var21.N;
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
                    nArray2[i.lIIIIIIIIIlII[6]] = var21.N;
                    if (i.lIIlIllIIIlllll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                        Bank.withdrawAll((int)var21.N, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        return lIIIIIIIIIlII[6];
                    }
                }
            }
            int[] nArray = new int[lIIIIIIIIIlII[9]];
            nArray[i.lIIIIIIIIIlII[6]] = var21.N;
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
        if (i.lIIlIllIIIllllI(Vars.getBit((int)var21.J), lIIIIIIIIIlII[8])) {
            int[] nArray = new int[lIIIIIIIIIlII[9]];
            nArray[i.lIIIIIIIIIlII[6]] = var21.P;
            if (i.lIIlIllIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (i.lIIlIllIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIIIlII[9]];
                    stringArray[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[23]];
                    var15 = TileObjects.getNearest((String[])stringArray);
                    if (i.lIIlIllIIlIIIIl(var15)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[24]];
                        var15.interact(lIIIIIIIIIIll[lIIIIIIIIIlII[25]]);
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIlIIIlI(var15)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[26]];
                        WorldPoint var11 = new WorldPoint(lIIIIIIIIIlII[14], lIIIIIIIIIlII[15], lIIIIIIIIIlII[6]);
                        Movement.setDestination((WorldPoint)var11);
                        return lIIIIIIIIIlII[6];
                    }
                }
                if (i.lIIlIllIIIlllll(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray3 = new int[lIIIIIIIIIlII[9]];
                    nArray3[i.lIIIIIIIIIlII[6]] = var21.P;
                    if (i.lIIlIllIIIllIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[lIIIIIIIIIlII[9]];
                        nArray4[i.lIIIIIIIIIlII[6]] = var21.P;
                        if (i.lIIlIllIIIllIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                            SquireMixology.j = lIIIIIIIIIlII[9];
                            SquireMixology.q = lIIIIIIIIIIll[lIIIIIIIIIlII[27]];
                            return lIIIIIIIIIlII[6];
                        }
                    }
                    int[] nArray5 = new int[lIIIIIIIIIlII[9]];
                    nArray5[i.lIIIIIIIIIlII[6]] = var21.P;
                    if (i.lIIlIllIIIlllll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                        Bank.withdrawAll((int)var21.P, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        return lIIIIIIIIIlII[6];
                    }
                }
            }
            int[] nArray6 = new int[lIIIIIIIIIlII[9]];
            nArray6[i.lIIIIIIIIIlII[6]] = var21.P;
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
        if (i.lIIlIllIIIllllI(Vars.getBit((int)var21.K), lIIIIIIIIIlII[8])) {
            int[] nArray = new int[lIIIIIIIIIlII[9]];
            nArray[i.lIIIIIIIIIlII[6]] = var21.O;
            if (i.lIIlIllIIIllIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                if (i.lIIlIllIIIllIlI(Bank.isOpen() ? 1 : 0)) {
                    String[] stringArray = new String[lIIIIIIIIIlII[9]];
                    stringArray[i.lIIIIIIIIIlII[6]] = lIIIIIIIIIIll[lIIIIIIIIIlII[32]];
                    var15 = TileObjects.getNearest((String[])stringArray);
                    if (i.lIIlIllIIlIIIIl(var15)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[33]];
                        var15.interact(lIIIIIIIIIIll[lIIIIIIIIIlII[34]]);
                        return lIIIIIIIIIlII[6];
                    }
                    if (i.lIIlIllIIlIIIlI(var15)) {
                        SquireMixology.g = lIIIIIIIIIIll[lIIIIIIIIIlII[35]];
                        WorldPoint var11 = new WorldPoint(lIIIIIIIIIlII[14], lIIIIIIIIIlII[15], lIIIIIIIIIlII[6]);
                        Movement.setDestination((WorldPoint)var11);
                        return lIIIIIIIIIlII[6];
                    }
                }
                if (i.lIIlIllIIIlllll(Bank.isOpen() ? 1 : 0)) {
                    int[] nArray7 = new int[lIIIIIIIIIlII[9]];
                    nArray7[i.lIIIIIIIIIlII[6]] = var21.O;
                    if (i.lIIlIllIIIllIlI(Bank.contains((int[])nArray7) ? 1 : 0)) {
                        int[] nArray8 = new int[lIIIIIIIIIlII[9]];
                        nArray8[i.lIIIIIIIIIlII[6]] = var21.O;
                        if (i.lIIlIllIIIllIlI(Inventory.contains((int[])nArray8) ? 1 : 0)) {
                            SquireMixology.j = lIIIIIIIIIlII[9];
                            SquireMixology.q = lIIIIIIIIIIll[lIIIIIIIIIlII[36]];
                            return lIIIIIIIIIlII[6];
                        }
                    }
                    int[] nArray9 = new int[lIIIIIIIIIlII[9]];
                    nArray9[i.lIIIIIIIIIlII[6]] = var21.O;
                    if (i.lIIlIllIIIlllll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                        Bank.withdrawAll((int)var21.O, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        return lIIIIIIIIIlII[6];
                    }
                }
            }
            int[] nArray10 = new int[lIIIIIIIIIlII[9]];
            nArray10[i.lIIIIIIIIIlII[6]] = var21.O;
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

    private static void lIIlIllIIIllIIl() {
        lIIIIIIIIIlII = new int[42];
        i.lIIIIIIIIIlII[0] = -(0xFFFFEA7F & 0x5789) & (0xFFFFFFBF & 0x6EEF);
        i.lIIIIIIIIIlII[1] = 0xFFFFEFBD & 0x3CEA;
        i.lIIIIIIIIIlII[2] = 0xFFFFECFF & 0x3FA9;
        i.lIIIIIIIIIlII[3] = 0xFFFFF5B5 & 0x7F7F;
        i.lIIIIIIIIIlII[4] = 0xFFFFF5FB & 0x7F3D;
        i.lIIIIIIIIIlII[5] = 0xFFFFF73F & 0x7DF7;
        i.lIIIIIIIIIlII[6] = (0xC9 ^ 0xA9) & ~(0xF7 ^ 0x97);
        i.lIIIIIIIIIlII[7] = 0xFFFFFC5B & 0x2FEF;
        i.lIIIIIIIIIlII[8] = 0x76 ^ 0x12;
        i.lIIIIIIIIIlII[9] = 1;
        i.lIIIIIIIIIlII[10] = 0xB8 ^ 0xB0 ^ (0xAD ^ 0xA0);
        i.lIIIIIIIIIlII[11] = 2;
        i.lIIIIIIIIIlII[12] = 3;
        i.lIIIIIIIIIlII[13] = 8 ^ 0x4C ^ (5 ^ 0x45);
        i.lIIIIIIIIIlII[14] = -(0xFFFFFD4F & 0x5AB9) & (0xFFFFFDFE & 0x5F7F);
        i.lIIIIIIIIIlII[15] = -(0xFFFFF1FF & 0x5F8B) & (0xFFFFFFFB & 0x75EF);
        i.lIIIIIIIIIlII[16] = 0x7C ^ 0x7A;
        i.lIIIIIIIIIlII[17] = 0xE ^ 0x70 ^ (0x6F ^ 0x16);
        i.lIIIIIIIIIlII[18] = 0x99 ^ 0x91;
        i.lIIIIIIIIIlII[19] = 0xA7 ^ 0xA0 ^ (0x92 ^ 0x9C);
        i.lIIIIIIIIIlII[20] = 0x54 ^ 0x5E;
        i.lIIIIIIIIIlII[21] = 0xB1 ^ 0xBA;
        i.lIIIIIIIIIlII[22] = -1;
        i.lIIIIIIIIIlII[23] = 0xB1 ^ 0xC5 ^ (0x53 ^ 0x2B);
        i.lIIIIIIIIIlII[24] = 0x76 ^ 0x18 ^ (0x17 ^ 0x74);
        i.lIIIIIIIIIlII[25] = 0x22 ^ 0x49 ^ (0 ^ 0x65);
        i.lIIIIIIIIIlII[26] = 0x43 ^ 0x4C;
        i.lIIIIIIIIIlII[27] = 0xFA ^ 0xAC ^ (0x4B ^ 0xD);
        i.lIIIIIIIIIlII[28] = 0x15 ^ 4;
        i.lIIIIIIIIIlII[29] = 0x66 ^ 0x26 ^ (0xEE ^ 0xBC);
        i.lIIIIIIIIIlII[30] = 0x55 ^ 0x46;
        i.lIIIIIIIIIlII[31] = 30 + 149 - 66 + 70 ^ 59 + 97 - 39 + 46;
        i.lIIIIIIIIIlII[32] = 0xA9 ^ 0xBC;
        i.lIIIIIIIIIlII[33] = 0x9E ^ 0xBD ^ (0x7C ^ 0x49);
        i.lIIIIIIIIIlII[34] = 0x2E ^ 0x1F ^ (0x53 ^ 0x75);
        i.lIIIIIIIIIlII[35] = 0x64 ^ 0x2C ^ (9 ^ 0x59);
        i.lIIIIIIIIIlII[36] = 0x2D ^ 0x34;
        i.lIIIIIIIIIlII[37] = 0x9E ^ 0x84;
        i.lIIIIIIIIIlII[38] = 0x48 ^ 0x18 ^ (0x59 ^ 0x12);
        i.lIIIIIIIIIlII[39] = 0xC8 ^ 0xBD ^ (0xC2 ^ 0xAB);
        i.lIIIIIIIIIlII[40] = 0x79 ^ 0x64;
        i.lIIIIIIIIIlII[41] = 0x90 ^ 0xB8 ^ (0x58 ^ 0x6E);
    }

    private static boolean lIIlIllIIIlllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIllIIIlllIl(int n2, int n3) {
        return n2 >= n3;
    }
}

