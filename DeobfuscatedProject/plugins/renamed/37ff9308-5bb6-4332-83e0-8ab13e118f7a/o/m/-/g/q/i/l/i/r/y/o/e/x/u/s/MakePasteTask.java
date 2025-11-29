/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.HerbType;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.DEnum;
import o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.s_Unknown;

/* TASK: Make paste task -> MakepastetaskTask */
@TaskDesc(name="Make paste task")
public class MakePasteTask
extends Task {
    private final /* synthetic */ SquireMixologyConfig W;
    private static /* synthetic */ int[] lIIIIIIIIIIIl;
    private static /* synthetic */ String[] lIIIIIIIIIIII;

    static {
        m.lIIlIllIIIIIlIl();
        m.lIIlIllIIIIIlII();
    }

    private static void lIIlIllIIIIIlII() {
        lIIIIIIIIIIII = new String[lIIIIIIIIIIIl[20]];
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[0]] = m."Aga";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[2]] = m."Aga paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[3]] = m."Aga paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[4]] = m."Lye";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[5]] = m."Lye paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[6]] = m."Lye paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[7]] = m."Mox";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[8]] = m."Mox paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[9]] = m."Mox paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[10]] = m."Opening bank";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[11]] = m."Bank Chest";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[12]] = m."Use";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[13]] = m."Mox paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[14]] = m."Lye paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[15]] = m."Aga paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[16]] = m."Out of herbs";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[17]] = m."Refining";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[18]] = m."Refiner";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[19]] = m."Operate";
    }

    private static String lIIlIllIIIIIIIl(String var4, String var21) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), lIIIIIIIIIIIl[9]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(lIIIIIIIIIIIl[3], var10);
            return new String(var22.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    @Inject
    public m(SquireMixologyConfig squireMixologyConfig) {
        this.W = squireMixologyConfig;
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(int n2) {
        void var8;
        int[] nArray = new int[lIIIIIIIIIIIl[2]];
        nArray[m.lIIIIIIIIIIIl[0]] = n2;
        if (m.lIIlIllIIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            if (m.lIIlIllIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                SquireMixology.g = lIIIIIIIIIIII[lIIIIIIIIIIIl[10]];
                String[] stringArray = new String[lIIIIIIIIIIIl[2]];
                stringArray[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[11]];
                TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIIIIII[lIIIIIIIIIIIl[12]]);
                return lIIIIIIIIIIIl[0];
            }
            if (m.lIIlIllIIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                SquireMixology.g = "Withdrawing " + (int)var8;
                String[] stringArray = new String[lIIIIIIIIIIIl[4]];
                stringArray[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[13]];
                stringArray[m.lIIIIIIIIIIIl[2]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[14]];
                stringArray[m.lIIIIIIIIIIIl[3]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[15]];
                Bank.depositAllExcept((String[])stringArray);
                int[] nArray2 = new int[lIIIIIIIIIIIl[2]];
                nArray2[m.lIIIIIIIIIIIl[0]] = var8;
                if (m.lIIlIllIIIIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    SquireMixology.j = lIIIIIIIIIIIl[0];
                    return lIIIIIIIIIIIl[0];
                }
                int[] nArray3 = new int[lIIIIIIIIIIIl[2]];
                nArray3[m.lIIIIIIIIIIIl[0]] = var8;
                if (m.lIIlIllIIIIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdrawAll((int)var8, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                }
                int[] nArray4 = new int[lIIIIIIIIIIIl[2]];
                nArray4[m.lIIIIIIIIIIIl[0]] = var8;
                if (m.lIIlIllIIIIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    SquireMixology.g = lIIIIIIIIIIII[lIIIIIIIIIIIl[16]];
                    System.out.println("Out of " + (int)var8);
                    return lIIIIIIIIIIIl[0];
                }
                Bank.withdrawAll((int)var8, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIIIIIIIIIIIl[0];
            }
        }
        int[] nArray5 = new int[lIIIIIIIIIIIl[2]];
        nArray5[m.lIIIIIIIIIIIl[0]] = var8;
        if (m.lIIlIllIIIIlIlI(Inventory.contains((int[])nArray5) ? 1 : 0)) {
            SquireMixology.g = lIIIIIIIIIIII[lIIIIIIIIIIIl[17]];
            String[] stringArray = new String[lIIIIIIIIIIIl[2]];
            stringArray[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[18]];
            TileObjects.getNearest((String[])stringArray).interact(lIIIIIIIIIIII[lIIIIIIIIIIIl[19]]);
            return lIIIIIIIIIIIl[0];
        }
        return lIIIIIIIIIIIl[2];
    }

    /*
     * WARNING - void declaration
     */
    public boolean d() {
        void var19;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var9 = lIIIIIIIIIIIl[0];
        while (m.lIIlIllIIIIIlll(var9, (int)var19)) {
            void var13;
            void var5 = var13[var9];
            String[] stringArray = new String[lIIIIIIIIIIIl[2]];
            stringArray[m.lIIIIIIIIIIIl[0]] = var5.a();
            if (m.lIIlIllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                System.out.println("Found herb in inventory: " + var5.a());
                return lIIIIIIIIIIIl[2];
            }
            ++var9;
            0;
            if (3 >= 3) continue;
            return false;
        }
        return lIIIIIIIIIIIl[0];
    }

    private static boolean lIIlIllIIIIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIllIIIIlIII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIllIIIIlIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIllIIIIlIlI(int n2) {
        return n2 != 0;
    }

    private static String lIIlIllIIIIIIlI(String var17, String var3) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIIIIIIIIIIIl[3], var11);
            return new String(var20.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lIIlIllIIIIIlIl() {
        lIIIIIIIIIIIl = new int[21];
        m.lIIIIIIIIIIIl[0] = (0x47 ^ 0x42) & ~(0x28 ^ 0x2D);
        m.lIIIIIIIIIIIl[1] = -(0xFFFFF1ED & 0x5F37) & (0xFFFFFDEE & 0x7F7D);
        m.lIIIIIIIIIIIl[2] = 1;
        m.lIIIIIIIIIIIl[3] = 2;
        m.lIIIIIIIIIIIl[4] = 3;
        m.lIIIIIIIIIIIl[5] = 0xA0 ^ 0xA4;
        m.lIIIIIIIIIIIl[6] = 0x3D ^ 0x1A ^ (0x2A ^ 8);
        m.lIIIIIIIIIIIl[7] = 0x63 ^ 0x65;
        m.lIIIIIIIIIIIl[8] = 0x1D ^ 0x1A;
        m.lIIIIIIIIIIIl[9] = 0xB9 ^ 0xB1;
        m.lIIIIIIIIIIIl[10] = 0x41 ^ 0x48;
        m.lIIIIIIIIIIIl[11] = 112 + 66 - 68 + 57 ^ 32 + 55 - 66 + 152;
        m.lIIIIIIIIIIIl[12] = 0x26 ^ 4 ^ (0x2C ^ 5);
        m.lIIIIIIIIIIIl[13] = 0x7B ^ 0x77;
        m.lIIIIIIIIIIIl[14] = 102 + 125 - 156 + 76 ^ 55 + 104 - 3 + 2;
        m.lIIIIIIIIIIIl[15] = 0x4D ^ 0x43;
        m.lIIIIIIIIIIIl[16] = 0x39 ^ 0x24 ^ (0xF ^ 0x1D);
        m.lIIIIIIIIIIIl[17] = 0xD0 ^ 0xC0;
        m.lIIIIIIIIIIIl[18] = 0x49 ^ 0x58;
        m.lIIIIIIIIIIIl[19] = 0x3E ^ 0x2C;
        m.lIIIIIIIIIIIl[20] = 0x4C ^ 0x5F;
    }

    private static boolean lIIlIllIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        m var18;
        if (m.lIIlIllIIIIIllI(s.e() ? 1 : 0)) {
            return lIIIIIIIIIIIl[0];
        }
        if (m.lIIlIllIIIIIlll(Vars.getBit((int)lIIIIIIIIIIIl[1]), lIIIIIIIIIIIl[2])) {
            return lIIIIIIIIIIIl[0];
        }
        if (m.lIIlIllIIIIlIII((Object)var18.W.pluginMode(), (Object)d.CREATE_PASTE) && m.lIIlIllIIIIIllI(SquireMixology.j ? 1 : 0)) {
            return lIIIIIIIIIIIl[0];
        }
        if (m.lIIlIllIIIIlIIl((Object)var18.W.pluginMode(), (Object)d.CREATE_PASTE) && m.lIIlIllIIIIIllI(var18.d(var18.W.herbPaste().b()) ? 1 : 0)) {
            return lIIIIIIIIIIIl[0];
        }
        if (m.lIIlIllIIIIlIIl((Object)var18.W.pluginMode(), (Object)d.MINIGAME) && m.lIIlIllIIIIlIlI(SquireMixology.j ? 1 : 0)) {
            if (m.lIIlIllIIIIlIlI(SquireMixology.q.equalsIgnoreCase(lIIIIIIIIIIII[lIIIIIIIIIIIl[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIIIIIl[2]];
                stringArray[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[2]];
                if (m.lIIlIllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIIIIIIIIl[2]];
                    stringArray2[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[3]];
                    if (m.lIIlIllIIIIlIll(Inventory.getFirst((String[])stringArray2).getQuantity(), var18.W.stopAt3000()) && m.lIIlIllIIIIIllI(var18.d() ? 1 : 0)) {
                        SquireMixology.j = lIIIIIIIIIIIl[0];
                        return lIIIIIIIIIIIl[0];
                    }
                }
                if (m.lIIlIllIIIIIllI(var18.d(var18.W.agaHerb().b()) ? 1 : 0)) {
                    return lIIIIIIIIIIIl[0];
                }
            }
            if (m.lIIlIllIIIIlIlI(SquireMixology.q.equalsIgnoreCase(lIIIIIIIIIIII[lIIIIIIIIIIIl[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIIIIIl[2]];
                stringArray[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[5]];
                if (m.lIIlIllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIIIIIIIIIl[2]];
                    stringArray3[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[6]];
                    if (m.lIIlIllIIIIlIll(Inventory.getFirst((String[])stringArray3).getQuantity(), var18.W.stopAt3000()) && m.lIIlIllIIIIIllI(var18.d() ? 1 : 0)) {
                        SquireMixology.j = lIIIIIIIIIIIl[0];
                        return lIIIIIIIIIIIl[0];
                    }
                }
                if (m.lIIlIllIIIIIllI(var18.d(var18.W.lyeHerb().b()) ? 1 : 0)) {
                    return lIIIIIIIIIIIl[0];
                }
            }
            if (m.lIIlIllIIIIlIlI(SquireMixology.q.equalsIgnoreCase(lIIIIIIIIIIII[lIIIIIIIIIIIl[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIIIIIl[2]];
                stringArray[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[8]];
                if (m.lIIlIllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIIIIIIIIIIl[2]];
                    stringArray4[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[9]];
                    if (m.lIIlIllIIIIlIll(Inventory.getFirst((String[])stringArray4).getQuantity(), var18.W.stopAt3000()) && m.lIIlIllIIIIIllI(var18.d() ? 1 : 0)) {
                        SquireMixology.j = lIIIIIIIIIIIl[0];
                        return lIIIIIIIIIIIl[0];
                    }
                }
                if (m.lIIlIllIIIIIllI(var18.d(var18.W.moxHerb().b()) ? 1 : 0)) {
                    return lIIIIIIIIIIIl[0];
                }
            }
        }
        return lIIIIIIIIIIIl[0];
    }

    private static boolean lIIlIllIIIIIllI(int n2) {
        return n2 == 0;
    }

    private static String lIIlIllIIIIIIll(String var6, String var15) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var14 = var15.toCharArray();
        int var23 = lIIIIIIIIIIIl[0];
        char[] var7 = var6.toCharArray();
        int var25 = var7.length;
        int var12 = lIIIIIIIIIIIl[0];
        while (m.lIIlIllIIIIIlll(var12, var25)) {
            char var16 = var7[var12];
            var24.append((char)(var16 ^ var14[var23 % var14.length]));
            0;
            ++var23;
            ++var12;
            0;
            
            return null;
        }
        return String.valueOf(var24);
    }
}

