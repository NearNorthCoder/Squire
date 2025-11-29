/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ClientTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.query.results.ItemQueryResults
 *  net.unethicalite.api.widgets.Production
 */
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import gg.squire.skilling.tasks.SkillingTaskBase;
import gg.squire.skilling.tasks.GameEnum9;
import gg.squire.skilling.tasks.GameEnum11;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ClientTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.query.results.ItemQueryResults;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Cooking", register=true)
public class CookingTask
extends SkillingTaskBase {

    @Inject
    public CookingTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.COOKING);
    }

    private static boolean lIlIllIlIlIIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var2_4;
        void var1_2;
        v var1;
        if (v.lIlIllIlIlIIlI(this.j.oneTick() ? 1 : 0)) {
            void var2;
            void var3;
            int[] nArray = new int[lllIIIllIll[0]];
            nArray[v.lllIIIllIll[1]] = this.j.cookingProduct().A();
            Item item = (Item)((ItemQueryResults)Inventory.query().ids(nArray).results()).last();
            TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (v.lIlIllIlIlIIll(tileObject.getActions())) {
                    String[] stringArray = new String[lllIIIllIll[0]];
                    stringArray[v.lllIIIllIll[1]] = lllIIIllIlI[lllIIIllIll[3]];
                    if (v.lIlIllIlIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllIIIllIll[0];

                        if ((0xB7 ^ 0xB3) != 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = lllIIIllIll[1];
                return n2 != 0;
            });
            if (v.lIlIllIlIlIIlI(Production.isOpen() ? 1 : 0)) {
                Production.choosePreviousOption();
            }
            if (v.lIlIllIlIlIIll(var3) && v.lIlIllIlIlIIll(var2)) {
                var3.useOn((TileObject)var2);
            }
            return lllIIIllIll[0];
        }
        if (v.lIlIllIlIlIIlI(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)var1.j.cookingProduct().C());
            var1.sleep(var1.i());
            return lllIIIllIll[0];
        }
        int[] nArray = new int[lllIIIllIll[0]];
        nArray[v.lllIIIllIll[1]] = var1.j.cookingProduct().A();
        Item var3 = Inventory.getFirst((int[])nArray);
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            boolean bl;
            block4: {
                block3: {
                    TileObject var4;
                    block2: {
                        if (!v.lIlIllIlIlIIll(tileObject.getActions())) break block2;
                        String[] stringArray = new String[lllIIIllIll[0]];
                        stringArray[v.lllIIIllIll[1]] = lllIIIllIlI[lllIIIllIll[1]];
                        if (!v.lIlIllIlIlIlIl(tileObject.hasAction(stringArray) ? 1 : 0)) break block3;
                    }
                    if (!v.lIlIllIlIlIIlI(var4.getName().equals(lllIIIllIlI[lllIIIllIll[0]]) ? 1 : 0)) break block4;
                }
                bl = lllIIIllIll[0];

                if (2 != 0) return bl;
                return ((157 + 184 - 119 + 3 ^ 128 + 31 - -1 + 2) & (0xF7 ^ 0x82 ^ (0x9C ^ 0xAA) ^ -1)) != 0;
            }
            bl = lllIIIllIll[1];
            return bl;
        });
        if (v.lIlIllIlIlIlII(var2)) {
            return lllIIIllIll[1];
        }
        var1_2.useOn((TileObject)var2_4);
        this.sleep(lllIIIllIll[0]);
        return lllIIIllIll[0];
    }

    @Override
    public int i() {
        int n2;
        if (v.lIlIllIlIlIIlI(this.j.oneTick() ? 1 : 0)) {
            n2 = lllIIIllIll[1];

            if (((0x67 ^ 0x1E ^ 32 + 122 - 101 + 74) & (0xAC ^ 0xA5 ^ (0x84 ^ 0x8B) ^ -1)) >= (0xB7 ^ 0x94 ^ (0x13 ^ 0x34))) {
                return (157 + 17 - 39 + 28 ^ 62 + 15 - -62 + 19) & (152 + 84 - 102 + 43 ^ 135 + 127 - 210 + 88 ^ -1);
            }
        } else {
            n2 = lllIIIllIll[2];
        }
        return n2;
    }

    private static void lIlIllIlIlIIII() {
        lllIIIllIlI = new String[lllIIIllIll[2]];
        v.lllIIIllIlI[v.lllIIIllIll[1]] = "Cook";
        v.lllIIIllIlI[v.lllIIIllIll[0]] = "Fire";
        v.lllIIIllIlI[v.lllIIIllIll[3]] = "Cook";
    }

    private static boolean lIlIllIlIlIIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.cookingProduct().A(), lllIIIllIll[0]);
    }

    private static boolean lIlIllIlIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlIlIllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIlIllIlIlIlII(Object object) {
        return object == null;
    }

    static {
        v.lIlIllIlIlIIIl();
        v.lIlIllIlIlIIII();
    }

    @Subscribe
    public void a(ClientTick clientTick) {
        v var5;
        if (v.lIlIllIlIlIlIl(this.j.oneTick() ? 1 : 0)) {
            return;
        }
        if (v.lIlIllIlIlIllI((Object)var5.j.cookingProduct(), (Object)k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.i.KARAMBWAN)) {
            return;
        }
        Keyboard.sendSpace();
    }
}

