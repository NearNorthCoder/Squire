/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.leagues.cooking;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.leagues.cooking.TickCookerconfig;
import gg.squire.leagues.cooking.AHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@SquireUtil
@PluginDescriptor(name="[Leagues] 1t cooker", enabledByDefault=false)
public class TickCooker
extends SquirePlugin {

        return String.valueOf(llllllllIlIIIIl);
    }

    private static boolean lIIII(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlII(int n, int n2) {
        return n < n2;
    }

    protected void onStart() {
    }

    private static boolean llll(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public void onGameTick(GameTick gameTick) {
        List lllllllllIIllII;
        void lllllllllIlIIII;
        Item item2 = Inventory.getItem((int)lIIl[0]);
        if (!TickCooker.lllI(item2) || TickCooker.llll(item2.isNoted() ? 1 : 0)) {
            return;
        }
        Item lllllllllIIllll = Inventory.getFirst(item -> {
            int n;
            if (TickCooker.lIIlI(item.getName().contains(lll[lIIl[6]]) ? 1 : 0) && TickCooker.llll(item.isNoted() ? 1 : 0)) {
                n = lIIl[1];

                if (2 != 2) {
                    return (2 & (2 ^ -1)) != 0;
                }
            } else {
                n = lIIl[0];
            }
            return n != 0;
        });
        if (TickCooker.lllI(lllllllllIIllll)) {
            int[] nArray = new int[lIIl[1]];
            nArray[TickCooker.lIIl[0]] = lllllllllIIllll.getId();
            int[] nArray2 = new int[lIIl[1]];
            nArray2[TickCooker.lIIl[0]] = a.a;
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
            return;
        }
        List lllllllllIIlllI = Inventory.getAll(item -> {
            int n;
            String[] stringArray = new String[lIIl[1]];
            stringArray[TickCooker.lIIl[0]] = lll[lIIl[5]];
            if (TickCooker.lIIlI(item.hasAction(stringArray) ? 1 : 0) && TickCooker.llll(item.isNoted() ? 1 : 0)) {
                n = lIIl[1];

            } else {
                n = lIIl[0];
            }
            return n != 0;
        });
        if (TickCooker.llll(lllllllllIIlllI.isEmpty() ? 1 : 0) && TickCooker.lIIII(lllllllllIIlllI.size(), lIIl[2])) {
            int[] nArray = new int[lIIl[1]];
            nArray[TickCooker.lIIl[0]] = a.a;
            ((Item)lllllllllIIlllI.get(lIIl[0])).useOn(Inventory.getFirst((int[])nArray));
            return;
        }
        Item lllllllllIIllIl = Inventory.getFirst(arg_0 -> TickCooker.b((Item)lllllllllIlIIII, arg_0));
        if (TickCooker.lIIIl(lllllllllIIllIl)) {
            Inventory.use(arg_0 -> TickCooker.a((Item)lllllllllIlIIII, arg_0), item -> {
                boolean bl;
                if (TickCooker.lIIll(item.getId(), a.a)) {
                    bl = lIIl[1];

                    if (-(0x7D ^ 0x79) >= 0) {
                        return false;
                    }
                } else {
                    bl = lIIl[0];
                }
                return bl;
            });

        }
        if (TickCooker.llll((lllllllllIIllII = Inventory.getAll(item -> {
            int n;
            if (TickCooker.llll(item.isNoted() ? 1 : 0)) {
                String[] stringArray = new String[lIIl[1]];
                stringArray[TickCooker.lIIl[0]] = lll[lIIl[4]];
                if (TickCooker.lIIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n = lIIl[1];

                    if (3 != 0) return n != 0;
                    return false;
                }
            }
            n = lIIl[0];
            return n != 0;
        })).isEmpty() ? 1 : 0) && TickCooker.lIIII(lllllllllIIllII.size(), lIIl[3])) {
            int[] nArray = new int[lIIl[1]];
            nArray[TickCooker.lIIl[0]] = a.a;
            ((Item)lllllllllIIllII.get(lIIl[0])).useOn(Inventory.getFirst((int[])nArray));
            return;
        }
        GameObject gameObject = (GameObject)TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIIl[1]];
            stringArray[TickCooker.lIIl[0]] = lll[lIIl[1]];
            return tileObject.hasAction(stringArray);
        });
        gameObject.interact(lll[lIIl[0]]);
    }

    private static boolean lIIIl(Object object) {
        return object == null;
    }

    private static  boolean a(Item item, Item item2) {
        boolean bl;
        if (TickCooker.lIIll(item2.getId(), item.getId())) {
            bl = lIIl[1];

        } else {
            bl = lIIl[0];
        }
        return bl;
    }

    protected void onStop() {
    }

    private static  boolean b(Item item, Item item2) {
        int n;
        if (TickCooker.llll(item2.isNoted() ? 1 : 0) && TickCooker.lIIlI(item2.getName().equals(item.getName()) ? 1 : 0)) {
            n = lIIl[1];

            if (3 <= 0) {
                return false;
            }
        } else {
            n = lIIl[0];
        }
        return n != 0;
    }

    @Provides
    TickCookerconfig b(ConfigManager configManager) {
        return (TickCookerconfig)configManager.getConfig(TickCookerconfig.class);
    }

    private static boolean lllI(Object object) {
        return object != null;
    }

    static {
        TickCooker.llIl();
        TickCooker.llII();
    }

    private static void llII() {
        lll = new String[lIIl[7]];
        TickCooker.lll[TickCooker.lIIl[0]] = "Cook";
        TickCooker.lll[TickCooker.lIIl[1]] = "Cook";
        TickCooker.lll[TickCooker.lIIl[4]] = "Eat";
        TickCooker.lll[TickCooker.lIIl[5]] = "Eat";
        TickCooker.lll[TickCooker.lIIl[6]] = "Burnt";
    }

    private static boolean lIIll(int n, int n2) {
        return n == n2;
    }

    protected Class<?>[] tasks() {
        return new Class[lIIl[0]];
    }

    private static boolean lIIlI(int n) {
        return n != 0;
    }
}

