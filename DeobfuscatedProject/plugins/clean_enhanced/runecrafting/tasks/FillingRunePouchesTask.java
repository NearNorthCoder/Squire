/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.GameEnum3;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.util.Iterator;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Filling rune pouches", priority=20, blocking=true)
public class FillingRunePouchesTask
extends RunecraftingTaskBase {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public FillingRunePouchesTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVE;
        cArray[2] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        block15: {
            block14: {
                if ((this.aV.g( == 0) ? 1 : 0)) {
                    return 1;
                }
                if (!(Inventory.isFull( != 0) ? 1 : 0)) break block14;
                int[] nArray = new int[2];
                nArray[1] = 3;
                if (!(Inventory.contains((int[] == 0)nArray) ? 1 : 0)) break block15;
            }
            return 1;
        }
        int var15 = 1;
        int[] nArray = new int[2];
        nArray[1] = 3;
        int var16 = Inventory.getCount((int[])nArray);
        int var17 = 0;
        Iterator var18 = Inventory.getAll(item -> item.getName().endsWith(var2[2])).iterator();
        while ((var18.hasNext( != 0) ? 1 : 0)) {
            Item var19 = (Item)var18.next();
            if (var17 == 0) {
                0;
                if ((0x23 ^ 0x27) != 1) break;
                return ((0x3E ^ 0x22) & ~(0x11 ^ 0xD)) != 0;
            }
            e var20 = e.c(var19.getId());
            if ((Object == nulllllllllllllllllIlIIlIllIIllIlIll)) {
                0;
                if (((0xA4 ^ 0xC6) & ~(0x7F ^ 0x1D)) == ((0x21 ^ 0x7E) & ~(0xEA ^ 0xB5))) continue;
                return ((0x84 ^ 0xB9) & ~(0x4D ^ 0x70)) != 0;
            }
            if (!(var19.getId() != 4) || !(var19.getId() != 5) || !(var19.getId() != 6) || (var19.getId() == 7)) {
                var20.a(2);
                0;
                if (-1 >= ((0xF3 ^ 0xB0) & ~(0xF1 ^ 0xB2))) {
                    return ((0x96 ^ 0xAE) & ~(0xA2 ^ 0x9A)) != 0;
                }
            } else {
                var20.a(1);
            }
            if ((var20.ae() < var20.ac())) {
                int var21 = Math.min(var16, var20.ac() - var20.ae());
                if (var21 <= 0) {
                    0;
                    if null == null break;
                    return ((0xC ^ 4) & ~(0x5D ^ 0x55)) != 0;
                }
                var20.d(var21);
                var19.interact(var2[1]);
                var15 = 2;
                --var17;
                var16 -= var21;
            }
            0;
            if null == null continue;
            return ((0x46 ^ 0x36 ^ (0x52 ^ 0x63)) & (0x2A ^ 0x3F ^ (0x6C ^ 0x38) ^ -1)) != 0;
        }
        if var15 {
            B var22;
            var22.aV.n();
        }
        return (boolean)var1_1;
    }

    @Override
    protected boolean aj() {
        return 2;
    }

}

