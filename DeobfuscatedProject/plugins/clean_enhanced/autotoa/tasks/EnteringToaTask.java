/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

@TaskDesc(name="Entering TOA")
public class EnteringToaTask
extends ck {
    
    private static final  int hR;
    
    @Inject
    protected  SquireAutoTOA aY;

    @Override
    public boolean bl() {
        ci var3;
        int[] nArray = new int[var1[0]];
        nArray[ci.var1[1]] = var1[2];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (ci.var4(tileObject)) {
            return var1[1];
        }
        BankLoadout var5 = (BankLoadout)var3.hY.loadout().selected(BankLoadout.class);
        if (ci.var6(var5.needsToBank() ? 1 : 0)) {
            return var1[1];
        }
        if (ci.var7(Tabs.isOpen((Tab)Tab.INVENTORY) ? 1 : 0)) {
            Tabs.open((Tab)Tab.INVENTORY);
            return var1[0];
        }
        if (ci.var8(Magic.getCurrentSpellBook(), SpellBook.ANCIENT)) {
            Log.info((String)var2[var1[1]]);
            var3.aY.forceStop();
            return var1[1];
        }
        if (ci.var6(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return var1[0];
        }
        if (ci.var6(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] stringArray = new String[var1[0]];
            stringArray[ci.var1[1]] = var2[var1[0]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return var1[0];
        }
        tileObject.interact(var2[var1[3]]);
        return var1[0];
    }

    private static void var9() {
        var1 = new int[6];
        ci.var1[0] = 1;
        ci.var1[1] = (7 ^ 0x47 ^ (0xA6 ^ 0xAE)) & (197 + 182 - 231 + 52 ^ 99 + 124 - 172 + 77 ^ -1);
        ci.var1[2] = -(0xFFFFD575 & 0x6BEB) & (0xFFFFF569 & 0xFFFF);
        ci.var1[3] = 2;
        ci.var1[4] = 3;
        ci.var1[5] = 0x53 ^ 0x5B;
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n2) {
        return n2 == 0;
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[1];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[1];
        while (ci.var10(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (-1 <= (0x64 ^ 0x60)) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static void var27() {
        var2 = new String[var1[4]];
        ci.var2[ci.var1[1]] = "We need ancient spellbook, stopping";
        ci.var2[ci.var1[0]] = "Yes";
        ci.var2[ci.var1[3]] = "Enter";
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    @Inject
    protected EnteringToaTask(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static boolean var8(Object object, Object object2) {
        return object != object2;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    static {
        ci.var9();
        ci.var27();
        hR = var1[2];
    }
}

