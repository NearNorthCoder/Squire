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
import java.util.List;
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
    private static  String[] lll;
    private static  int[] lIIl;

    private static String lIII(String var1, String var2) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var4 = var2.toCharArray();
        int var5 = 0;
        char[] var6 = var1.toCharArray();
        int var7 = var6.length;
        int var8 = 0;
        while (TickCooker.lIlII(var8, var7)) {
            char var9 = var6[var8];
            var3.append((char)(var9 ^ var4[var5 % var4.length]));
            0;
            ++var5;
            ++var8;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean lIIII(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIlII(int n, int n2) {
        return n < n2;
    }

    protected void onStart() {
    }

    /*
     * WARNING - void declaration
     */
    public void onGameTick(GameTick gameTick) {
        List var10;
        void var11;
        Item item2 = Inventory.getItem((int)0);
        if (!item2 != null || (item2.isNoted( == 0) ? 1 : 0)) {
            return;
        }
        Item var12 = Inventory.getFirst(item -> {
            int n;
            if (TickCooker.lIIlI(item.getName().contains(lll[6]) ? 1 : 0) && (item.isNoted( == 0) ? 1 : 0)) {
                n = 1;
                0;
                if (2 != 2) {
                    return (2 & (2 ^ -1)) != 0;
                }
            } else {
                n = 0;
            }
            return n != 0;
        });
        if var12 != null {
            int[] nArray = new int[1];
            nArray[0] = var12.getId();
            int[] nArray2 = new int[1];
            nArray2[0] = a.a;
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
            return;
        }
        List var13 = Inventory.getAll(item -> {
            int n;
            String[] stringArray = new String[1];
            stringArray[0] = lll[5];
            if (TickCooker.lIIlI(item.hasAction(stringArray) ? 1 : 0) && (item.isNoted( == 0) ? 1 : 0)) {
                n = 1;
                0;
                if (-3 >= 0) {
                    return ((0xF3 ^ 0xA3) & ~(0x35 ^ 0x65)) != 0;
                }
            } else {
                n = 0;
            }
            return n != 0;
        });
        if ((var13.isEmpty( == 0) ? 1 : 0) && TickCooker.lIIII(var13.size(), 2)) {
            int[] nArray = new int[1];
            nArray[0] = a.a;
            ((Item)var13.get(0)).useOn(Inventory.getFirst((int[])nArray));
            return;
        }
        Item var14 = Inventory.getFirst(arg_0 -> TickCooker.b((Item)var11, arg_0));
        if (TickCooker.lIIIl(var14)) {
            Inventory.use(arg_0 -> TickCooker.a((Item)var11, arg_0), item -> {
                boolean bl;
                if (TickCooker.lIIll(item.getId(), a.a)) {
                    bl = 1;
                    0;
                    if (-(0x7D ^ 0x79) >= 0) {
                        return ((0x1D ^ 0x27) & ~(0x3B ^ 1)) != 0;
                    }
                } else {
                    bl = 0;
                }
                return bl;
            });
            0;
        }
        if (((var10 = Inventory.getAll(item -> {
            int n;
            if (TickCooker.llll(item.isNoted( == 0) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = lll[4];
                if (TickCooker.lIIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n = 1;
                    0;
                    if (3 != 0) return n != 0;
                    return ((5 ^ 0x3F) & ~(0x5D ^ 0x67)) != 0;
                }
            }
            n = 0;
            return n != 0;
        })).isEmpty() ? 1 : 0) && TickCooker.lIIII(var10.size(), 3)) {
            int[] nArray = new int[1];
            nArray[0] = a.a;
            ((Item)var10.get(0)).useOn(Inventory.getFirst((int[])nArray));
            return;
        }
        GameObject gameObject = (GameObject)TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[1];
            stringArray[0] = lll[1];
            return tileObject.hasAction(stringArray);
        });
        gameObject.interact(lll[0]);
    }

    private static boolean lIIIl(Object object) {
        return object == null;
    }

    private static  boolean a(Item item, Item item2) {
        boolean bl;
        if (TickCooker.lIIll(item2.getId(), item.getId())) {
            bl = 1;
            0;
            if (-2 > 0) {
                return ((0xBE ^ 0xBA ^ (0x76 ^ 0x4E)) & (61 + 151 - 133 + 172 ^ 177 + 43 - 217 + 196 ^ -1)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }

    private static  boolean b(Item item, Item item2) {
        int n;
        if ((item2.isNoted( == 0) ? 1 : 0) && TickCooker.lIIlI(item2.getName().equals(item.getName()) ? 1 : 0)) {
            n = 1;
            0;
            if (3 <= 0) {
                return ((0x52 ^ 0x1E) & ~(0x8F ^ 0xC3)) != 0;
            }
        } else {
            n = 0;
        }
        return n != 0;
    }

    @Provides
    TickCookerconfig b(ConfigManager configManager) {
        return (TickCookerconfig)configManager.getConfig(TickCookerconfig.class);
    }

    private static boolean lIIll(int n, int n2) {
        return n == n2;
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    protected Class<?>[] tasks() {
        return new Class[0];
    }

    private static boolean lIIlI(int n) {
        return n != 0;
    }
}

