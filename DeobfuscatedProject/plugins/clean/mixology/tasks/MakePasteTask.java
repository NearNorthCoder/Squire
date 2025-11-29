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
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import gg.squire.mixology.tasks.GameEnum4;
import gg.squire.mixology.tasks.GameEnum15;
import gg.squire.mixology.tasks.SHelper;

@TaskDesc(name="Make paste task")
public class MakePasteTask
extends Task {
    private final  SquireMixologyConfig W;

    static {
        m.lIIlIllIIIIIlIl();
        m.lIIlIllIIIIIlII();
    }

    private static void lIIlIllIIIIIlII() {
        lIIIIIIIIIIII = new String[lIIIIIIIIIIIl[20]];
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[0]] = "Aga";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[2]] = "Aga paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[3]] = "Aga paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[4]] = "Lye";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[5]] = "Lye paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[6]] = "Lye paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[7]] = "Mox";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[8]] = "Mox paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[9]] = "Mox paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[10]] = "Opening bank";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[11]] = "Bank Chest";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[12]] = "Use";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[13]] = "Mox paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[14]] = "Lye paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[15]] = "Aga paste";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[16]] = "Out of herbs";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[17]] = "Refining";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[18]] = "Refiner";
        m.lIIIIIIIIIIII[m.lIIIIIIIIIIIl[19]] = "Operate";
    }

    @Inject
    public MakePasteTask(SquireMixologyConfig squireMixologyConfig) {
        this.W = squireMixologyConfig;
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(int n2) {
        void var1;
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
                SquireMixology.g = "Withdrawing " + (int)var1;
                String[] stringArray = new String[lIIIIIIIIIIIl[4]];
                stringArray[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[13]];
                stringArray[m.lIIIIIIIIIIIl[2]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[14]];
                stringArray[m.lIIIIIIIIIIIl[3]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[15]];
                Bank.depositAllExcept((String[])stringArray);
                int[] nArray2 = new int[lIIIIIIIIIIIl[2]];
                nArray2[m.lIIIIIIIIIIIl[0]] = var1;
                if (m.lIIlIllIIIIIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    SquireMixology.j = lIIIIIIIIIIIl[0];
                    return lIIIIIIIIIIIl[0];
                }
                int[] nArray3 = new int[lIIIIIIIIIIIl[2]];
                nArray3[m.lIIIIIIIIIIIl[0]] = var1;
                if (m.lIIlIllIIIIlIlI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdrawAll((int)var1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                }
                int[] nArray4 = new int[lIIIIIIIIIIIl[2]];
                nArray4[m.lIIIIIIIIIIIl[0]] = var1;
                if (m.lIIlIllIIIIIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    SquireMixology.g = lIIIIIIIIIIII[lIIIIIIIIIIIl[16]];
                    System.out.println("Out of " + (int)var1);
                    return lIIIIIIIIIIIl[0];
                }
                Bank.withdrawAll((int)var1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                return lIIIIIIIIIIIl[0];
            }
        }
        int[] nArray5 = new int[lIIIIIIIIIIIl[2]];
        nArray5[m.lIIIIIIIIIIIl[0]] = var1;
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
        void var2;
        b[] bArray = b.values();
        int n2 = bArray.length;
        int var3 = lIIIIIIIIIIIl[0];
        while (m.lIIlIllIIIIIlll(var3, (int)var2)) {
            void var4;
            void var5 = var4[var3];
            String[] stringArray = new String[lIIIIIIIIIIIl[2]];
            stringArray[m.lIIIIIIIIIIIl[0]] = var5.a();
            if (m.lIIlIllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                System.out.println("Found herb in inventory: " + var5.a());
                return lIIIIIIIIIIIl[2];
            }
            ++var3;

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

    private static boolean lIIlIllIIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        m var6;
        if (m.lIIlIllIIIIIllI(s.e() ? 1 : 0)) {
            return lIIIIIIIIIIIl[0];
        }
        if (m.lIIlIllIIIIIlll(Vars.getBit((int)lIIIIIIIIIIIl[1]), lIIIIIIIIIIIl[2])) {
            return lIIIIIIIIIIIl[0];
        }
        if (m.lIIlIllIIIIlIII((Object)var6.W.pluginMode(), (Object)d.CREATE_PASTE) && m.lIIlIllIIIIIllI(SquireMixology.j ? 1 : 0)) {
            return lIIIIIIIIIIIl[0];
        }
        if (m.lIIlIllIIIIlIIl((Object)var6.W.pluginMode(), (Object)d.CREATE_PASTE) && m.lIIlIllIIIIIllI(var6.d(var6.W.herbPaste().b()) ? 1 : 0)) {
            return lIIIIIIIIIIIl[0];
        }
        if (m.lIIlIllIIIIlIIl((Object)var6.W.pluginMode(), (Object)d.MINIGAME) && m.lIIlIllIIIIlIlI(SquireMixology.j ? 1 : 0)) {
            if (m.lIIlIllIIIIlIlI(SquireMixology.q.equalsIgnoreCase(lIIIIIIIIIIII[lIIIIIIIIIIIl[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIIIIIl[2]];
                stringArray[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[2]];
                if (m.lIIlIllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lIIIIIIIIIIIl[2]];
                    stringArray2[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[3]];
                    if (m.lIIlIllIIIIlIll(Inventory.getFirst((String[])stringArray2).getQuantity(), var6.W.stopAt3000()) && m.lIIlIllIIIIIllI(var6.d() ? 1 : 0)) {
                        SquireMixology.j = lIIIIIIIIIIIl[0];
                        return lIIIIIIIIIIIl[0];
                    }
                }
                if (m.lIIlIllIIIIIllI(var6.d(var6.W.agaHerb().b()) ? 1 : 0)) {
                    return lIIIIIIIIIIIl[0];
                }
            }
            if (m.lIIlIllIIIIlIlI(SquireMixology.q.equalsIgnoreCase(lIIIIIIIIIIII[lIIIIIIIIIIIl[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIIIIIl[2]];
                stringArray[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[5]];
                if (m.lIIlIllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[lIIIIIIIIIIIl[2]];
                    stringArray3[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[6]];
                    if (m.lIIlIllIIIIlIll(Inventory.getFirst((String[])stringArray3).getQuantity(), var6.W.stopAt3000()) && m.lIIlIllIIIIIllI(var6.d() ? 1 : 0)) {
                        SquireMixology.j = lIIIIIIIIIIIl[0];
                        return lIIIIIIIIIIIl[0];
                    }
                }
                if (m.lIIlIllIIIIIllI(var6.d(var6.W.lyeHerb().b()) ? 1 : 0)) {
                    return lIIIIIIIIIIIl[0];
                }
            }
            if (m.lIIlIllIIIIlIlI(SquireMixology.q.equalsIgnoreCase(lIIIIIIIIIIII[lIIIIIIIIIIIl[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIIIIIIIIIIl[2]];
                stringArray[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[8]];
                if (m.lIIlIllIIIIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIIIIIIIIIIl[2]];
                    stringArray4[m.lIIIIIIIIIIIl[0]] = lIIIIIIIIIIII[lIIIIIIIIIIIl[9]];
                    if (m.lIIlIllIIIIlIll(Inventory.getFirst((String[])stringArray4).getQuantity(), var6.W.stopAt3000()) && m.lIIlIllIIIIIllI(var6.d() ? 1 : 0)) {
                        SquireMixology.j = lIIIIIIIIIIIl[0];
                        return lIIIIIIIIIIIl[0];
                    }
                }
                if (m.lIIlIllIIIIIllI(var6.d(var6.W.moxHerb().b()) ? 1 : 0)) {
                    return lIIIIIIIIIIIl[0];
                }
            }
        }
        return lIIIIIIIIIIIl[0];
    }

    private static boolean lIIlIllIIIIIllI(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var7);
    }
}

