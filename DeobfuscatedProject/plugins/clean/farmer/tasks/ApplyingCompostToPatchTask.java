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

import gg.squire.farmer.tasks.GameEnum23;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum19;
import gg.squire.farmer.tasks.FarmerTaskBase;
import -.m.e.a.u.s.r.r.q.i.r.e.f.an;
import gg.squire.farmer.tasks.FarmerManager;
import gg.squire.farmer.tasks.GameEnum13;
import gg.squire.farmer.tasks.GameEnum62;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
extends FarmerTaskBase {

    private static boolean llllIlIlllIlll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean bv() {
        boolean bl;
        if (!aU.llllIlIlllIIIl(Players.getLocal().isMoving() ? 1 : 0) || aU.llllIlIlllIIlI(Players.getLocal().isAnimating() ? 1 : 0)) {
            bl = llIIIllIIIll[0];

            if ((59 + 86 - 136 + 171 ^ 38 + 133 - 140 + 145) < 0) {
                return ((5 + 93 - 56 + 176 ^ 20 + 85 - 57 + 80) & (0xE8 ^ 0xBC ^ (0x88 ^ 0x86) ^ -1)) != 0;
            }
        } else {
            bl = llIIIllIIIll[1];
        }
        return bl;
    }

    static {
        aU.llllIlIlllIIII();
        aU.llllIlIllIllll();
    }

    private static void llllIlIllIllll() {
        llIIIllIIIlI = new String[llIIIllIIIll[3]];
        aU.llIIIllIIIlI[aU.llIIIllIIIll[1]] = "Drop";
        aU.llIIIllIIIlI[aU.llIIIllIIIll[0]] = "Wield";
    }

    private static boolean llllIlIlllIllI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean J(N n2) {
        H var1;
        H h2;
        aU var2;
        void var3;
        if (aU.llllIlIlllIIlI(this.bR.f(n2) ? 1 : 0)) {
            return llIIIllIIIll[1];
        }
        if (aU.llllIlIlllIIll((Object)var3.aL(), (Object)P.FLOWER)) {
            h2 = var2.bS.compostTypeFlowers();

            if ((0xF0 ^ 0x81 ^ (0xC9 ^ 0xBC)) < 0) {
                return ((96 + 148 - 56 + 27 ^ 86 + 17 - 4 + 37) & (0x66 ^ 0x2A ^ (0x6A ^ 0x79) ^ -1) & ((102 + 11 - 80 + 124 ^ 127 + 113 - 100 + 6) & (43 + 58 - 34 + 124 ^ 104 + 124 - 98 + 46 ^ -1) ^ -1)) != 0;
            }
        } else {
            h2 = var2.bS.compostType();
        }
        if (aU.llllIlIlllIIll((Object)(var1 = h2), (Object)H.LUNAR_SPELL) && aU.llllIlIlllIlII((Object)var3.aL(), (Object)P.GRAPES)) {
            return var2.K((FarmerManager) ar3);
        }
        Item var4 = var2.bR.g((FarmerManager) ar3);
        if (aU.llllIlIlllIlIl(var4)) {
            return llIIIllIIIll[1];
        }
        int[] nArray = new int[llIIIllIIIll[0]];
        nArray[aU.llIIIllIIIll[1]] = llIIIllIIIll[2];
        Item var5 = Inventory.getFirst((int[])nArray);
        if (aU.llllIlIlllIllI(var5)) {
            var5.interact(llIIIllIIIlI[llIIIllIIIll[1]]);
        }
        Item item = var4;
        Objects.requireNonNull(item);

        if (aU.llllIlIlllIIlI(var2.a((FarmerManager) ar3, arg_0 -> ((Item)item).useOn(arg_0)) ? 1 : 0)) {
            var2.sleep(llIIIllIIIll[3]);
            return llIIIllIIIll[0];
        }
        return llIIIllIIIll[1];
    }

    @Inject
    public ApplyingCompostToPatchTask(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client, (an an2) -> {
            int n2;
            if (aU.llllIlIlllIIIl(an2.be() ? 1 : 0) && aU.llllIlIlllIIll((Object)an2.aZ(), (Object)n.GROWING)) {
                n2 = llIIIllIIIll[0];

                if (3 <= 0) {
                    return ((117 + 113 - 111 + 23 ^ 16 + 82 - 54 + 144) & (0xE ^ 0x4F ^ (0x41 ^ 0x32) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIllIIIll[1];
            }
            return n2 != 0;
        });
    }

    private static boolean llllIlIlllIlII(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llllIlIlllIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlIlllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llllIlIlllIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean K(N n2) {
        void var6;
        aU var7;
        int n3 = Players.getLocal().getWorldLocation().getRegionID();
        int[] nArray = new int[llIIIllIIIll[3]];
        nArray[aU.llIIIllIIIll[1]] = llIIIllIIIll[4];
        nArray[aU.llIIIllIIIll[0]] = llIIIllIIIll[5];
        Item item = Inventory.getFirst((int[])nArray);
        if (aU.llllIlIlllIllI(item) && aU.llllIlIlllIlll(n3, p.FOSSIL_ISLAND_UNDERWATER.X())) {
            item.interact(llIIIllIIIlI[llIIIllIIIll[0]]);
            return llIIIllIIIll[0];
        }
        if (aU.llllIlIlllIIIl(SpellBook.Lunar.FERTILE_SOIL.canCast() ? 1 : 0)) {
            return llIIIllIIIll[1];
        }
        int var8 = var7.a((FarmerManager) ar6, tileObject -> Magic.cast((Spell)SpellBook.Lunar.FERTILE_SOIL, (TileObject)tileObject)) ? 1 : 0;
        if (aU.llllIlIlllIIlI(var8)) {
            var7.sleep(llIIIllIIIll[3]);
            return llIIIllIIIll[0];
        }
        return llIIIllIIIll[1];
    }

    private static boolean llllIlIlllIlIl(Object object) {
        return object == null;
    }
}

