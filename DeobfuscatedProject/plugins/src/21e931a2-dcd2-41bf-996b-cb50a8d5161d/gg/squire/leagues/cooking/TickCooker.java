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
import i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.a;
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
    private static /* synthetic */ String[] lll;
    private static /* synthetic */ int[] lIIl;

    private static String lIII(String llllllllIIllllI, String llllllllIIlllIl) {
        llllllllIIllllI = new String(Base64.getDecoder().decode(llllllllIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllIlIIIIl = new StringBuilder();
        char[] llllllllIlIIIII = llllllllIIlllIl.toCharArray();
        int llllllllIIlllll = lIIl[0];
        char[] llllllllIIllIIl = llllllllIIllllI.toCharArray();
        int llllllllIIllIII = llllllllIIllIIl.length;
        int llllllllIIlIlll = lIIl[0];
        while (TickCooker.lIlII(llllllllIIlIlll, llllllllIIllIII)) {
            char llllllllIlIIlII = llllllllIIllIIl[llllllllIIlIlll];
            llllllllIlIIIIl.append((char)(llllllllIlIIlII ^ llllllllIlIIIII[llllllllIIlllll % llllllllIlIIIII.length]));
            "".length();
            ++llllllllIIlllll;
            ++llllllllIIlIlll;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllIlIIIIl);
    }

    private static boolean lIIII(int n, int n2) {
        return n >= n2;
    }

    private static void llIl() {
        lIIl = new int[9];
        TickCooker.lIIl[0] = (0x3F ^ 0x6B ^ (0x6F ^ 0x25)) & (0x56 ^ 0x6F ^ (0xAC ^ 0x8B) ^ -" ".length());
        TickCooker.lIIl[1] = " ".length();
        TickCooker.lIIl[2] = 0xB3 ^ 0xBC;
        TickCooker.lIIl[3] = 0x24 ^ 0x55 ^ (0xFD ^ 0x98);
        TickCooker.lIIl[4] = "  ".length();
        TickCooker.lIIl[5] = "   ".length();
        TickCooker.lIIl[6] = 0xC3 ^ 0xC7;
        TickCooker.lIIl[7] = 0x2C ^ 0x29;
        TickCooker.lIIl[8] = 0x8B ^ 0xC3 ^ (0xEC ^ 0xAC);
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
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
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
                "".length();
                if (-"   ".length() >= 0) {
                    return ((0xF3 ^ 0xA3) & ~(0x35 ^ 0x65)) != 0;
                }
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
                    "".length();
                    if (-(0x7D ^ 0x79) >= 0) {
                        return ((0x1D ^ 0x27) & ~(0x3B ^ 1)) != 0;
                    }
                } else {
                    bl = lIIl[0];
                }
                return bl;
            });
            "".length();
        }
        if (TickCooker.llll((lllllllllIIllII = Inventory.getAll(item -> {
            int n;
            if (TickCooker.llll(item.isNoted() ? 1 : 0)) {
                String[] stringArray = new String[lIIl[1]];
                stringArray[TickCooker.lIIl[0]] = lll[lIIl[4]];
                if (TickCooker.lIIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n = lIIl[1];
                    "".length();
                    if ("   ".length() != 0) return n != 0;
                    return ((5 ^ 0x3F) & ~(0x5D ^ 0x67)) != 0;
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

    private static /* synthetic */ boolean a(Item item, Item item2) {
        boolean bl;
        if (TickCooker.lIIll(item2.getId(), item.getId())) {
            bl = lIIl[1];
            "".length();
            if (-"  ".length() > 0) {
                return ((0xBE ^ 0xBA ^ (0x76 ^ 0x4E)) & (61 + 151 - 133 + 172 ^ 177 + 43 - 217 + 196 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIIl[0];
        }
        return bl;
    }

    private static String lIIl(String llllllllIllIIll, String llllllllIllIIII) {
        try {
            SecretKeySpec llllllllIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllIllIIII.getBytes(StandardCharsets.UTF_8)), lIIl[8]), "DES");
            Cipher llllllllIllIlIl = Cipher.getInstance("DES");
            llllllllIllIlIl.init(lIIl[4], llllllllIllIllI);
            return new String(llllllllIllIlIl.doFinal(Base64.getDecoder().decode(llllllllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllIllIlII) {
            llllllllIllIlII.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
    }

    private static /* synthetic */ boolean b(Item item, Item item2) {
        int n;
        if (TickCooker.llll(item2.isNoted() ? 1 : 0) && TickCooker.lIIlI(item2.getName().equals(item.getName()) ? 1 : 0)) {
            n = lIIl[1];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x52 ^ 0x1E) & ~(0x8F ^ 0xC3)) != 0;
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
        TickCooker.lll[TickCooker.lIIl[0]] = TickCooker.lIII("OTYcOw==", "zYsPj");
        TickCooker.lll[TickCooker.lIIl[1]] = TickCooker.lIIl("aa5U9QeifHI=", "XkhvD");
        TickCooker.lll[TickCooker.lIIl[4]] = TickCooker.lIlI("gKn4YQtmtH0=", "ZXfNC");
        TickCooker.lll[TickCooker.lIIl[5]] = TickCooker.lIIl("9HCEThxjA7k=", "OXmzD");
        TickCooker.lll[TickCooker.lIIl[6]] = TickCooker.lIII("OBcwGho=", "zbBtn");
    }

    private static boolean lIIll(int n, int n2) {
        return n == n2;
    }

    private static String lIlI(String llllllllIIIlllI, String llllllllIIIlIll) {
        try {
            SecretKeySpec llllllllIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllIIlIIII = Cipher.getInstance("Blowfish");
            llllllllIIlIIII.init(lIIl[4], llllllllIIlIIIl);
            return new String(llllllllIIlIIII.doFinal(Base64.getDecoder().decode(llllllllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllIIIllll) {
            llllllllIIIllll.printStackTrace();
            return null;
        }
    }

    protected Class<?>[] tasks() {
        return new Class[lIIl[0]];
    }

    private static boolean lIIlI(int n) {
        return n != 0;
    }
}

