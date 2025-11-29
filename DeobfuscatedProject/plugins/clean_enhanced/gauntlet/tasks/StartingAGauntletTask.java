/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.gauntlet.GauntletConfig;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Starting a gauntlet", priority=3, blocking=true)
public class StartingAGauntletTask
extends GauntletTaskBase {
    private  int cl;
    
    private final  GauntletConfig ck;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public StartingAGauntletTask(c c2, GauntletConfig gauntletConfig) {
        d[] dArray = new d[var1[0]];
        dArray[aa.var1[1]] = d.OUTSIDE;
        super(c2, dArray);
        this.cl = var1[1];
        this.ck = gauntletConfig;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static boolean var10(int n2) {
        return n2 > 0;
    }

    private static void var11() {
        var1 = new int[8];
        aa.var1[0] = 1;
        aa.var1[1] = (0x11 ^ 0x56) & ~(0x58 ^ 0x1F);
        aa.var1[2] = 0xFFFFB3DC & 0xDDFF;
        aa.var1[3] = 73 + 69 - 110 + 152 ^ 85 + 100 - 7 + 0;
        aa.var1[4] = 0xBF ^ 0xAB;
        aa.var1[5] = 0xF3 ^ 0xA5 ^ (0x5A ^ 0x68);
        aa.var1[6] = 2;
        aa.var1[7] = 3;
    }

    @Override
    public boolean be() {
        aa var12;
        Item item2 = Inventory.getFirst(item -> Arrays.stream(this.ba.h().alching().split(var2[var1[6]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId()))));
        if (aa.var13(item2) && aa.var9(Magic.canCast((SpeSpellBook.Standard.HIGH_LEVEL_ALCHEMY) ? 1 : 0)) {
            return var1[1];
        }
        if (aa.var9(var12.ck.waitAfterAttempt() ? 1 : 0) && aa.var10(var12.cl)) {
            var12.cl -= var1[0];
            return var1[0];
        }
        if (aa.var9(Dialog.isViewingOptions() ? 1 : 0) && aa.var9(Dialog.hasOption((String)var2[var1[1]]) ? 1 : 0)) {
            String[] stringArray = new String[var1[0]];
            stringArray[aa.var1[1]] = var2[var1[0]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return var1[0];
        }
        if (aa.var9(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return var1[0];
        }
        int[] nArray = new int[var1[0]];
        nArray[aa.var1[1]] = var1[2];
        TileObject var14 = TileObjects.getNearest((int[])nArray);
        if (aa.var13(var14)) {
            int n2;
            if (aa.var9(var12.ba.G() ? 1 : 0)) {
                n2 = var1[0];
                0;
                if (1 != 1) {
                    return ((0x4E ^ 0x2C) & ~(0x6A ^ 8)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            var14.interact(n2);
            var12.sleep(var1[3]);
            var12.cl = Rand.nextInt((int)var1[4], (int)var1[5]);
            return var1[0];
        }
        return var1[1];
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var1[1];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var1[1];
        while (aa.var24(var23, var22)) {
            char var25 = var21[var23];
            var18.append((char)(var25 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (((0x35 ^ 0x33) & ~(0x4E ^ 0x48)) == 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }

    private static void var26() {
        var2 = new String[var1[7]];
        aa.var2[aa.var1[1]] = "Yes";
        aa.var2[aa.var1[0]] = "Yes";
        aa.var2[aa.var1[6]] = ",";
    }

    static {
        aa.var11();
        aa.var26();
    }
}

