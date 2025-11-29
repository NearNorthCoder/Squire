/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Item
 *  net.runelite.client.config.ConfigManager
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  org.jetbrains.annotations.Nullable
 */
package gg.squire.vorkath.tasks;

import com.google.gson.Gson;
import gg.squire.client.util.Log;
import gg.squire.vorkath.tasks.KHelper;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.runelite.client.config.ConfigManager;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import org.jetbrains.annotations.Nullable;

@Singleton
public class VorkathManager {
    private static final  Gson S;
    private final  ConfigManager T;
    
    private  boolean U;

    private static boolean lIllllllIlIIIII(Object object) {
        return object == null;
    }

    public Item a(Predicate<Item> predicate) {
        int[] nArray = new int[lIlIlIlIllIII[1]];
        nArray[h.lIlIlIlIllIII[2]] = lIlIlIlIllIII[3];
        if (h.lIllllllIIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIlIlIlIllIII[1]];
            nArray2[h.lIlIlIlIllIII[2]] = lIlIlIlIllIII[3];
            return Inventory.getFirst((int[])nArray2);
        }
        return Inventory.getAll().stream().filter(predicate).filter(Item::isTradable).min(Comparator.comparingInt(item -> item.getQuantity() * Prices.getItemPrice((int)item.getId()))).orElse(null);
    }

    @Nullable
    public static Item a(List<k> list) {
        Item item = null;
        int n2 = lIlIlIlIllIII[0];
        Iterator var1 = Inventory.getAll().iterator();
        while (h.lIllllllIIllllI(var1.hasNext() ? 1 : 0)) {
            List<k> var2;
            Item var3 = (Item)var1.next();
            Iterator<k> var4 = var2.iterator();
            while (h.lIllllllIIllllI(var4.hasNext() ? 1 : 0)) {
                k var5 = var4.next();
                if (h.lIllllllIIllllI(var5.M().equals(var3.getName()) ? 1 : 0) && h.lIllllllIIllllI(var5.O() ? 1 : 0)) {
                    int var6;
                    int var7 = Prices.getItemPrice((int)var3.getId()) * var3.getQuantity();
                    if (!h.lIllllllIIlllll(var7, var6)) break;
                    Item var8 = var3;
                    var6 = var7;

                    if (2 != 1) break;
                    return null;
                }

                if (3 > 0) continue;
                return null;
            }

            if (((0x1F ^ 0x23 ^ (0xA1 ^ 0xC0)) & (0x90 ^ 0xB0 ^ (0x61 ^ 0x1C) ^ -1)) <= (0x63 ^ 0x7F ^ (0x76 ^ 0x6E))) continue;
            return null;
        }
        return item;
    }

    private static void lIllllllIIlllII() {
        lIlIlIlIlIlll = new String[lIlIlIlIllIII[5]];
        h.lIlIlIlIlIlll[h.lIlIlIlIllIII[2]] = "Trying to find a decent item to drop, but cannot";
        h.lIlIlIlIlIlll[h.lIlIlIlIllIII[1]] = "Drop";
        h.lIlIlIlIlIlll[h.lIlIlIlIllIII[4]] = "Eat";
    }

    private static boolean lIllllllIIllllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public VorkathManager(ConfigManager configManager) {
        this.T = configManager;
    }

    public void K() {
        Item item2 = this.a(item -> {
            String[] stringArray = new String[lIlIlIlIllIII[1]];
            stringArray[h.lIlIlIlIllIII[2]] = lIlIlIlIlIlll[lIlIlIlIllIII[4]];
            return item.hasAction(stringArray);
        });
        if (h.lIllllllIlIIIII(item2) && h.lIllllllIlIIIII(item2 = this.a(item -> lIlIlIlIllIII[1]))) {
            Log.info((String)lIlIlIlIlIlll[lIlIlIlIllIII[2]]);
            return;
        }
        item2.interact(lIlIlIlIlIlll[lIlIlIlIllIII[1]]);
    }

    private static boolean lIllllllIIlllll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var9);
    }

    static {
        h.lIllllllIIlllIl();
        h.lIllllllIIlllII();
        S = new Gson();
    }

    public void d(boolean bl) {
        this.U = bl;
    }

    public boolean L() {
        return this.U;
    }
}

