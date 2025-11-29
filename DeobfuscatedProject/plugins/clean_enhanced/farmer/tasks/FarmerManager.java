/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum23;
import gg.squire.farmer.tasks.LHelper;
import java.util.Iterator;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@Singleton
public class FarmerManager {

    private static final  int ao;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public boolean G() {
        return Widgets.isVisible((Widget)this.H());
    }

    public boolean K() {
        boolean bl;
        if ((this.I( != null))) {
            bl = 2;
            0;
            
        } else {
            bl = 1;
        }
        return bl;
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    public void FarmerManager(K k2, Integer n2) {
        void var4_4;
        void var3_3;
        void var19;
        void var20;
        if ((Dialog.isEnterInputOpen( != 0) ? 1 : 0)) {
            Dialog.enterAmount((int)n2);
            return;
        }
        Widget var21 = Widgets.get((int)0, (int)var20.aF());
        if var21 == null {
            return;
        }
        Object var22 = var2[8];
        if (!(var19.intValue() != 2) || (var19.intValue() == 4)) {
            var22 = "Remove-" + (Integer)var19;
        }
        if ((var19.intValue() == 6)) {
            var22 = var2[4];
        }
        if ((var20 == K.BOTTOMLESS_BUCKET)) {
            var22 = var2[9];
        }
        var3_3.interact((String)var4_4);
    }

    public void c(Item item) {
        NPC nPC = this.I();
        if nPC == null {
            return;
        }
        item.useOn((Actor)nPC);
    }

    static {
        h.var23();
        h.var24();
        ao = 0;
    }

    public boolean J() {
        boolean bl = 1;
        Iterator var25 = Inventory.getAll().iterator();
        while ((var25.hasNext( != 0) ? 1 : 0)) {
            Item var26 = (Item)var25.next();
            if ((L.bq.contains(var26.getId( != 0)) ? 1 : 0)) {
                h var27;
                var27.c(var26);
                int var28 = 2;
            }
            0;
            if null == null continue;
            return ((0xA9 ^ 0xBF) & ~(0x80 ^ 0x96)) != 0;
        }
        return bl;
    }

    public void L() {
        NPC nPC = this.I();
        if nPC == null {
            return;
        }
        nPC.interact(var2[var1[10]]);
    }

    public Widget H() {
        return Widgets.get((int)0, (int)1);
    }

    public NPC I() {
        String[] stringArray = new String[2];
        stringArray[1] = var2[1];
        return NPCs.getNearest((String[])stringArray);
    }

    /*
     * WARNING - void declaration
     */
    public void g(K k2, Integer n2) {
        void var4_4;
        void var3_3;
        void var29;
        void var30;
        if ((Inventory.contains((int[] == 0)k2.aH()) ? 1 : 0)) {
            return;
        }
        if ((Dialog.isEnterInputOpen( != 0) ? 1 : 0)) {
            Dialog.enterAmount((int)var30.intValue());
            return;
        }
        Widget var31 = Widgets.get((int)3, (int)var29.aG());
        if var31 == null {
            return;
        }
        Object var32 = var2[2];
        if (!(var30.intValue() != 2) || (var30.intValue() == 4)) {
            var32 = "Store-" + (Integer)var30;
        }
        if ((var29 == K.BOTTOMLESS_BUCKET)) {
            var32 = var2[5];
        }
        if ((var30.intValue() == 6)) {
            var32 = var2[7];
        }
        var3_3.interact((String)var4_4);
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

}

