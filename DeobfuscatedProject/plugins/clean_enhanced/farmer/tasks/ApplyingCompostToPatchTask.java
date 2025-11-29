/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Lunar
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.GameEnum12;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum10;
import -.m.e.a.u.s.r.r.q.i.r.e.f.aX;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum7;
import gg.squire.farmer.tasks.GameEnum22;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.util.Objects;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Applying compost to patch", priority=2)
public class ApplyingCompostToPatchTask
extends aX {

    @Override
    public boolean bv() {
        boolean bl;
        if (!(Players.getLocal( == 0).isMoving() ? 1 : 0) || (Players.getLocal( != 0).isAnimating() ? 1 : 0)) {
            bl = 0;
            0;
            if ((59 + 86 - 136 + 171 ^ 38 + 133 - 140 + 145) < 0) {
                return ((5 + 93 - 56 + 176 ^ 20 + 85 - 57 + 80) & (0xE8 ^ 0xBC ^ (0x88 ^ 0x86) ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(N n2) {
        H var3;
        H h2;
        aU var4;
        void var5;
        if ((this.bR.fn2)) {
            return 1;
        }
        if (((Object)var5.aL() == (Object)var5.aL()2)P.FLOWER)) {
            h2 = var4.bS.compostTypeFlowers();
            0;
            if ((0xF0 ^ 0x81 ^ (0xC9 ^ 0xBC)) < 0) {
                return ((96 + 148 - 56 + 27 ^ 86 + 17 - 4 + 37) & (0x66 ^ 0x2A ^ (0x6A ^ 0x79) ^ -1) & ((102 + 11 - 80 + 124 ^ 127 + 113 - 100 + 6) & (43 + 58 - 34 + 124 ^ 104 + 124 - 98 + 46 ^ -1) ^ -1)) != 0;
            }
        } else {
            h2 = var4.bS.compostType();
        }
        if (((Object)(var3 = h2) == (Object)(var3 = h2)2)H.LUNAR_SPELL) && ((Object)var5.aL() != (Object)var5.aL()2)P.GRAPES)) {
            return var4.K((N)var5);
        }
        Item var6 = var4.bR.g((N)var5);
        if var6 == null {
            return 1;
        }
        int[] nArray = new int[0];
        nArray[1] = 2;
        Item var7 = Inventory.getFirst((int[])nArray);
        if var7 != null {
            var7.interact(var1[1]);
        }
        Item item = var6;
        Objects.requireNonNull(item);
        0;
        if ((var4.a(NlllllllllllllllIlIlIIlIIlIIlIllI, arg_0 -> ((Item)item).useOn(arg_0)) ? 1 : 0)) {
            var4.sleep(3);
            return 0;
        }
        return 1;
    }

    @Inject
    public ApplyingCompostToPatchTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, (an an2) -> {
            int n2;
            if ((an2.be( == 0) ? 1 : 0) && ((Object)an2.aZ() == (Object)an2.aZ()2)n.GROWING)) {
                n2 = 0;
                0;
                if (3 <= 0) {
                    return ((117 + 113 - 111 + 23 ^ 16 + 82 - 54 + 144) & (0xE ^ 0x4F ^ (0x41 ^ 0x32) ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean K(N n2) {
        void var14;
        aU var15;
        int n3 = Players.getLocal().getWorldLocation().getRegionID();
        int[] nArray = new int[3];
        nArray[1] = 4;
        nArray[0] = 5;
        Item item = Inventory.getFirst((int[])nArray);
        if (item != null && (p.FOSSIL_ISLAND_UNDERWATER.X( != p.FOSSIL_ISLAND_UNDERWATER.X())) {
            item.interact(var1[0]);
            return 0;
        }
        if ((SpellBook.Lunar.FERTILE_SOIL.canCast( == 0) ? 1 : 0)) {
            return 1;
        }
        int var16 = var15.a((N)var14, tileObject -> Magic.cast((SpeSpellBook.Lunar.FERTILE_SOIL, (TileObject)tileObject)) ? 1 : 0;
        if var16 {
            var15.sleep(3);
            return 0;
        }
        return 1;
    }

}

