/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck;

/* TASK: Recharging trident -> RechargingtridentTask */
@TaskDesc(name="Recharging trident", priority=1000, blocking=true, register=true)
public class cl
extends ck {
    private static /* synthetic */ String[] llIIlIIlIll;
    private static /* synthetic */ int[] llIIlIIllII;
    private /* synthetic */ boolean hZ;

    @Inject
    protected cl(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
        this.hZ = llIIlIIllII[0];
    }

    private static boolean lIlIIIIIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (cl.lIlIIIIIlIlIII(this.cu.isInInstancedRegion() ? 1 : 0)) {
            this.hZ = llIIlIIllII[0];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var1_1;
        void var5_5;
        int var16;
        int n2;
        cl var7;
        int n3;
        if (cl.lIlIIIIIlIlIII(this.hZ ? 1 : 0)) {
            return llIIlIIllII[0];
        }
        if (cl.lIlIIIIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
            var7.hZ = llIIlIIllII[1];
        }
        if (cl.lIlIIIIIlIlIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)llIIlIIllII[2]);
            return llIIlIIllII[1];
        }
        Item var15 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIlIIlIll[llIIlIIllII[7]]));
        if (cl.lIlIIIIIlIlIIl(var15)) {
            return llIIlIIllII[0];
        }
        if (cl.lIlIIIIIlIlIlI(var15.getName().toLowerCase().contains(llIIlIIlIll[llIIlIIllII[0]]) ? 1 : 0) && cl.lIlIIIIIlIlIlI(var15.getName().toLowerCase().contains(llIIlIIlIll[llIIlIIllII[1]]) ? 1 : 0)) {
            n3 = llIIlIIllII[1];
            0;
            if ((0x60 ^ 0x65) == 0) {
                return false;
            }
        } else {
            n3 = llIIlIIllII[0];
        }
        int var18 = n3;
        int var11 = var7.g(var18 != 0);
        if (cl.lIlIIIIIlIlIII(var18)) {
            n2 = llIIlIIllII[3];
            0;
            
            }
        } else {
            n2 = var16 = llIIlIIllII[4];
        }
        if (cl.lIlIIIIIlIlIll(var11, llIIlIIllII[5])) {
            if (cl.lIlIIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
                int[] nArray = new int[llIIlIIllII[1]];
                nArray[cl.llIIlIIllII[0]] = var11;
                if (cl.lIlIIIIIlIlIlI(Bank.contains((int[])nArray) ? 1 : 0)) {
                    var7.hZ = llIIlIIllII[1];
                }
                if (cl.lIlIIIIIlIllII(Inventory.getFreeSlots(), llIIlIIllII[6])) {
                    int[] nArray2 = new int[llIIlIIllII[6]];
                    nArray2[cl.llIIlIIllII[0]] = var15.getId();
                    nArray2[cl.llIIlIIllII[1]] = var16;
                    nArray2[cl.llIIlIIllII[7]] = llIIlIIllII[8];
                    nArray2[cl.llIIlIIllII[9]] = llIIlIIllII[10];
                    nArray2[cl.llIIlIIllII[11]] = llIIlIIllII[12];
                    Bank.depositAllExcept((int[])nArray2);
                    return llIIlIIllII[1];
                }
                Bank.withdrawAll((int)var11, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return llIIlIIllII[1];
            }
            return llIIlIIllII[0];
        }
        int[] nArray = new int[llIIlIIllII[1]];
        nArray[cl.llIIlIIllII[0]] = var16;
        Item var14 = Inventory.getFirst((int[])nArray);
        if (cl.lIlIIIIIlIlIIl(var14)) {
            return llIIlIIllII[0];
        }
        var5_5.useOn((Item)var1_1);
        return llIIlIIllII[1];
    }

    static {
        cl.lIlIIIIIlIIlll();
        cl.lIlIIIIIlIIllI();
    }

    private static boolean lIlIIIIIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIIIIIlIlIII(int n2) {
        return n2 != 0;
    }

    private static void lIlIIIIIlIIllI() {
        llIIlIIlIll = new String[llIIlIIllII[9]];
        cl.llIIlIIlIll[cl.llIIlIIllII[0]] = cl."toxic";
        cl.llIIlIIlIll[cl.llIIlIIllII[1]] = cl."swamp";
        cl.llIIlIIlIll[cl.llIIlIIllII[7]] = cl."trident";
    }

    private static String lIlIIIIIlIIlIl(String var19, String var3) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var12 = var3.toCharArray();
        int var13 = llIIlIIllII[0];
        char[] var21 = var19.toCharArray();
        int var8 = var21.length;
        int var17 = llIIlIIllII[0];
        while (cl.lIlIIIIIlIllII(var17, var8)) {
            char var2 = var21[var17];
            var5.append((char)(var2 ^ var12[var13 % var12.length]));
            0;
            ++var13;
            ++var17;
            0;
            if (((0x35 ^ 0x63) & ~(0xF7 ^ 0xA1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static boolean lIlIIIIIlIlIIl(Object object) {
        return object == null;
    }

    private static String lIlIIIIIlIIlII(String var20, String var6) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIIlIIllII[13]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llIIlIIllII[7], var1);
            return new String(var4.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public int g(boolean bl2) {
        int n2;
        if (cl.lIlIIIIIlIlIII(bl2 ? 1 : 0)) {
            n2 = llIIlIIllII[3];
            0;
            if (-2 > 0) {
                return (0xE4 ^ 0xC5 ^ (0xEB ^ 0xC3)) & (3 ^ (0x23 ^ 0x29) ^ -1);
            }
        } else {
            n2 = llIIlIIllII[4];
        }
        int var10 = n2;
        int[] nArray = new int[llIIlIIllII[1]];
        nArray[cl.llIIlIIllII[0]] = var10;
        if (cl.lIlIIIIIlIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var10;
        }
        int[] nArray2 = new int[llIIlIIllII[1]];
        nArray2[cl.llIIlIIllII[0]] = llIIlIIllII[8];
        if (cl.lIlIIIIIlIlIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return llIIlIIllII[8];
        }
        int[] nArray3 = new int[llIIlIIllII[1]];
        nArray3[cl.llIIlIIllII[0]] = llIIlIIllII[10];
        if (cl.lIlIIIIIlIlIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return llIIlIIllII[10];
        }
        int[] nArray4 = new int[llIIlIIllII[1]];
        nArray4[cl.llIIlIIllII[0]] = llIIlIIllII[12];
        if (cl.lIlIIIIIlIlIlI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return llIIlIIllII[12];
        }
        return llIIlIIllII[5];
    }

    private static boolean lIlIIIIIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIIIlIIlll() {
        llIIlIIllII = new int[14];
        cl.llIIlIIllII[0] = (0x19 ^ 0x2E ^ (0xDC ^ 0xC1)) & (40 + 0 - 20 + 158 ^ 103 + 15 - -2 + 32 ^ -1);
        cl.llIIlIIllII[1] = 1;
        cl.llIIlIIllII[2] = -(0xFFFFFFBC & 0x707F) & (0xFFFFFFFF & 0x79FF);
        cl.llIIlIIllII[3] = -(0xFFFFF2F1 & 0x4D1F) & (0xFFFFEBF3 & 0x57FF);
        cl.llIIlIIllII[4] = -(0xFFFFDC2B & 0x67FD) & (0xFFFFF7EF & 0x7EBE);
        cl.llIIlIIllII[5] = -1;
        cl.llIIlIIllII[6] = 0x29 ^ 0x2C;
        cl.llIIlIIllII[7] = 2;
        cl.llIIlIIllII[8] = -(0xFFFFF9F6 & 0x6F5B) & (0xFFFFEF7F & 0x7BFB);
        cl.llIIlIIllII[9] = 3;
        cl.llIIlIIllII[10] = -(0xFFFFFFDF & 0x4CEF) & (0xFFFFDFFF & 0x6EFE);
        cl.llIIlIIllII[11] = 0x41 ^ 0x45;
        cl.llIIlIIllII[12] = 0xFFFFDE7A & 0x23B7;
        cl.llIIlIIllII[13] = 0x51 ^ 0x6A ^ (0x3E ^ 0xD);
    }
}

