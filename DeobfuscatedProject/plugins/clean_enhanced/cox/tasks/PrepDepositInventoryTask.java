/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Prep Deposit inventory", priority=21004, blocking=true)
public class PrepDepositInventoryTask
extends CoxManager {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_3;
        void var9;
        aY var10;
        block10: {
            block9: {
                List<Item> list = D.bC().a(item -> {
                    int n2;
                    if (!(item.getId() != 7) || !(item.getId() != 8) || (item.getId() == 9)) {
                        n2 = 1;
                        0;
                        if ((0x9A ^ 0x9E) <= 2) {
                            return ((0x30 ^ 0x28) & ~(0x89 ^ 0x91)) != 0;
                        }
                    } else {
                        n2 = 0;
                    }
                    return n2 != 0;
                });
                if ((this.cq() >= this.el)) {
                    return 0;
                }
                if (!(D.bC( != 0).bH() ? 1 : 0)) break block9;
                int[] nArray = new int[1];
                nArray[0] = var10.el().size();
                if (!(Inventory.getCount((int[])nArray) > 2)) break block10;
            }
            if ((var9.isEmpty( != 0) ? 1 : 0)) {
                return 0;
            }
        }
        if ((D.bJ( != 0) ? 1 : 0)) {
            if ((var10.dZ( != 0) ? 1 : 0)) {
                D.bK();
                0;
                return 1;
            }
            Item var11 = (Item)var9.get(0);
            Widget var12 = Widgets.get((int)3, (int)4, (int)var11.getSlot());
            if var12 == null {
                System.out.println(var1[0]);
            }
            var12.interact(var1[1]);
            return 1;
        }
        TileObject var11 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).toLowerCase().contains(var1[var2[10]]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[2];
                if ((tileObject.hasActionstringArray) && (this.ak.a(LocatabletileObject) ? 1 : 0)) {
                    n2 = 1;
                    0;
                    if null == null return n2 != 0;
                    return ((0x66 ^ 6 ^ (0x86 ^ 0xB9)) & (23 + 140 - 0 + 88 ^ 154 + 56 - 91 + 45 ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var11 == null {
            System.out.println(var1[5]);
            return 0;
        }
        var2_3.interact(var1[6]);
        return 1;
    }

    private List<Item> ea() {
        return D.bC().a(item -> {
            int n2;
            if (!(item.getId() != 7) || !(item.getId() != 8) || (item.getId() == 9)) {
                n2 = 1;
                0;
                if (3 <= -1) {
                    return ((0xD ^ 0x2C) & ~(0x80 ^ 0xA1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
    }

    @Inject
    protected PrepDepositInventoryTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean dZ() {
        int n2;
        block3: {
            block2: {
                if (!(this.ea( == 0).isEmpty() ? 1 : 0)) break block2;
                int[] nArray = new int[1];
                nArray[0] = this.el().size();
                if (!(Inventory.getCount((int[])nArray) > 2)) break block3;
            }
            n2 = 1;
            0;
            if (1 >= -1) return n2 != 0;
            return ((0x44 ^ 0x54) & ~(0x7C ^ 0x6C)) != 0;
        }
        n2 = 0;
        return n2 != 0;
    }

}

