/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  kotlin.collections.ArrayDeque
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import gg.squire.templetrekking.tasks.TempletrekkingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArrayDeque;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Handling rope swing")
public class HandlingRopeSwingTask
extends TempletrekkingTaskBase {
    private final  List<TileObject> aj;

    @Inject
    protected HandlingRopeSwingTask(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[lIIllIIlllIll[0]];
        nArray[y.lIIllIIlllIll[1]] = lIIllIIlllIll[2];
        super(templeTrekkingPlugin, nArray);
        this.aj = new ArrayDeque();
    }

    private static boolean lIllIIIIIIlIlIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIIIIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIIIIIlII() {
        lIIllIIllIlll = new String[lIIllIIlllIll[17]];
        y.lIIllIIllIlll[y.lIIllIIlllIll[1]] = "Hey...that's great...you did a great job...I'll follow you.";
        y.lIIllIIllIlll[y.lIIllIIlllIll[0]] = "Well that's torn it... Looks like we can't get over this<br>bog. We'll have to go back to Burgh de Rott.";
        y.lIIllIIllIlll[y.lIIllIIlllIll[3]] = "That's amazing! I'll have to do the same.";
        y.lIIllIIllIlll[y.lIIllIIlllIll[5]] = "Continue-trek";
        y.lIIllIIllIlll[y.lIIllIIlllIll[7]] = "Continue-trek";
        y.lIIllIIllIlll[y.lIIllIIlllIll[4]] = "Swing-from";
        y.lIIllIIllIlll[y.lIIllIIlllIll[8]] = "Long vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[9]] = "Long vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[6]] = "Swamp tree branch";
        y.lIIllIIllIlll[y.lIIllIIlllIll[2]] = "Short vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[10]] = "Short vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[11]] = "Cut-vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[12]] = "Swamp tree";
        y.lIIllIIllIlll[y.lIIllIIlllIll[13]] = "Cut-vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[14]] = "Swamp tree branch";
        y.lIIllIIllIlll[y.lIIllIIlllIll[15]] = "Swing-from";
        y.lIIllIIllIlll[y.lIIllIIlllIll[16]] = "Continue-trek";
    }

        return String.valueOf(var1);
    }

    private static boolean lIllIIIIIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean z() {
        y var2;
        String string;
        if (y.lIllIIIIIIlIIlI(Dialog.isOpen() ? 1 : 0) && y.lIllIIIIIIlIIll((string = Dialog.getText()).length()) && (!y.lIllIIIIIIlIlII(string.contains(lIIllIIllIlll[lIIllIIlllIll[1]]) ? 1 : 0) || !y.lIllIIIIIIlIlII(string.contains(lIIllIIllIlll[lIIllIIlllIll[0]]) ? 1 : 0) || y.lIllIIIIIIlIIlI(string.contains(lIIllIIllIlll[lIIllIIlllIll[3]]) ? 1 : 0))) {
            return lIIllIIlllIll[1];
        }
        Player var3 = Players.getLocal();
        TileObject var4 = var2.A();
        if (y.lIllIIIIIIlIlIl(var4)) {
            return lIIllIIlllIll[1];
        }
        if (y.lIllIIIIIIlIllI(var3.distanceTo((Locatable)var4), lIIllIIlllIll[4])) {
            var2.aj.clear();
            var4.interact(lIIllIIllIlll[lIIllIIlllIll[5]]);
            return lIIllIIlllIll[0];
        }
        var4 = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIIllIIlllIll[0]];
            stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[16]];
            return tileObject.hasAction(stringArray);
        });
        if (y.lIllIIIIIIlIlll(var4) && y.lIllIIIIIIlIllI(var4.distanceTo((Locatable)var3), lIIllIIlllIll[6])) {
            var4.interact(lIIllIIllIlll[lIIllIIlllIll[7]]);
            return lIIllIIlllIll[0];
        }
        TileObject var5 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.lIllIIIIIIlIIlI(tileObject.getName().equals(lIIllIIllIlll[lIIllIIlllIll[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIIlllIll[0]];
                stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[15]];
                if (y.lIllIIIIIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIIlllIll[0];

                    if (null == null) return n2 != 0;
                    return ((0xF8 ^ 0xB3 ^ (0x69 ^ 0x17)) & (0x73 ^ 0x5D ^ (0x51 ^ 0x4A) ^ -1)) != 0;
                }
            }
            n2 = lIIllIIlllIll[1];
            return n2 != 0;
        });
        if (y.lIllIIIIIIlIlll(var5)) {
            var5.interact(lIIllIIllIlll[lIIllIIlllIll[4]]);
            return lIIllIIlllIll[0];
        }
        String[] stringArray = new String[lIIllIIlllIll[0]];
        stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[8]];
        if (y.lIllIIIIIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIllIIlllIll[0]];
            stringArray2[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[9]];
            Item var6 = Inventory.getFirst((String[])stringArray2);
            String[] stringArray3 = new String[lIIllIIlllIll[0]];
            stringArray3[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[6]];
            TileObject var7 = TileObjects.getNearest((String[])stringArray3);
            if (y.lIllIIIIIIlIlll(var6) && y.lIllIIIIIIlIlll(var7)) {
                var6.useOn(var7);
                return lIIllIIlllIll[0];
            }
            return lIIllIIlllIll[1];
        }
        String[] stringArray4 = new String[lIIllIIlllIll[0]];
        stringArray4[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[2]];
        if (y.lIllIIIIIIllIII(Inventory.getCount((String[])stringArray4), lIIllIIlllIll[5])) {
            String[] stringArray5 = new String[lIIllIIlllIll[0]];
            stringArray5[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[10]];
            List var6 = Inventory.getAll((String[])stringArray5);
            Item var7 = (Item)var6.get(lIIllIIlllIll[1]);
            Item var8 = (Item)var6.get(lIIllIIlllIll[0]);
            if (y.lIllIIIIIIlIlll(var7) && y.lIllIIIIIIlIlll(var8)) {
                var7.useOn(var8);
                return lIIllIIlllIll[0];
            }
            return lIIllIIlllIll[1];
        }
        TileObject var6 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.lIllIIIIIIlIIlI(tileObject.getName().equals(lIIllIIllIlll[lIIllIIlllIll[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIIlllIll[0]];
                stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[13]];
                if (y.lIllIIIIIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIIlllIll[0];

                    if (-(0x4E ^ 0x4A) < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIllIIlllIll[1];
            return n2 != 0;
        });
        if (y.lIllIIIIIIlIlll(var6)) {
            var6.interact(lIIllIIllIlll[lIIllIIlllIll[11]]);
            return lIIllIIlllIll[0];
        }
        return lIIllIIlllIll[1];
    }

    static {
        y.lIllIIIIIIlIIIl();
        y.lIllIIIIIIIIlII();
    }

    private static boolean lIllIIIIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIIlIIll(int n2) {
        return n2 > 0;
    }

}

