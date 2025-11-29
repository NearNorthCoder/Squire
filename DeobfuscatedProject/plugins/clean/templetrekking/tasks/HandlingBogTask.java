/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  kotlin.collections.ArrayDeque
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import gg.squire.templetrekking.tasks.AHelper;
import gg.squire.templetrekking.tasks.UHelper;
import gg.squire.templetrekking.tasks.TempletrekkingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArrayDeque;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Handling bog")
public class HandlingBogTask
extends TempletrekkingTaskBase {

    private  List<TileObject> ad;

    private static void lIllIIIIIIIIIll() {
        lIIllIIlllIIl = new String[lIIllIIlllIlI[13]];
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[1]] = "Hey...that's great...you did a great job...I'll follow you.";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[0]] = "Well that's torn it... Looks like we can't get over this<br>bog. We'll have to go back to Burgh de Rott.";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[3]] = "That's amazing! I'll have to do the same.";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[5]] = "Continue-trek";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[6]] = "Stand-on";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[4]] = "Adding solved bog path";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[10]] = "Bog";
        t.lIIllIIlllIIl[t.lIIllIIlllIlI[2]] = "Stand-on";
    }

    private static boolean lIllIIIIIIIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIIlIIII(int n2) {
        return n2 >= 0;
    }

    /*
     * WARNING - void declaration
     */
    public int[][] a(List<TileObject> list) {
        void var1;
        void var2;
        int[][] nArray = new int[lIIllIIlllIlI[8]][lIIllIIlllIlI[8]];
        int var3 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(var3, var2.size())) {
            TileObject var4 = (TileObject)var2.get(var3);
            if (t.lIllIIIIIIIlIll(var4) && t.lIllIIIIIIIllll(var4.getId(), lIIllIIlllIlI[9])) {
                var1[var3 / t.lIIllIIlllIlI[8] + t.lIIllIIlllIlI[0]][var3 % t.lIIllIIlllIlI[8]] = lIIllIIlllIlI[0];
            }
            ++var3;

            if (-2 <= 0) continue;
            return null;
        }
        var3 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(var3, ((void)var1[lIIllIIlllIlI[1]]).length)) {
            var1[t.lIIllIIlllIlI[1]][var3] = lIIllIIlllIlI[0];
            var1[t.lIIllIIlllIlI[10]][var3] = lIIllIIlllIlI[0];
            ++var3;

            if (3 >= 0) continue;
            return null;
        }
        var3 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(var3, lIIllIIlllIlI[5])) {
            var1[t.lIIllIIlllIlI[2] + var3][t.lIIllIIlllIlI[11]] = lIIllIIlllIlI[0];
            ++var3;

            if (2 > 0) continue;
            return null;
        }
        return nArray;
    }

    private static boolean lIllIIIIIIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public TileObject b(List<TileObject> list) {
        void var5;
        int var6 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(var6, var5.size())) {
            TileObject var7 = (TileObject)var5.get(var6);
            if (t.lIllIIIIIIIlIll(var7) && t.lIllIIIIIIIIllI(var7.getWorldLocation().equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0) && t.lIllIIIIIIIlllI(var6 + lIIllIIlllIlI[0], var5.size())) {
                return (TileObject)var5.get(var6 + lIIllIIlllIlI[0]);
            }
            ++var6;

            return null;
        }
        return list.get(lIIllIIlllIlI[1]);
    }

    private static boolean lIllIIIIIIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIIIIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean z() {
        Object var8;
        t var9;
        String string;
        if (t.lIllIIIIIIIIllI(Dialog.isOpen() ? 1 : 0) && t.lIllIIIIIIIIlll((string = Dialog.getText()).length()) && (!t.lIllIIIIIIIlIII(string.contains(lIIllIIlllIIl[lIIllIIlllIlI[1]]) ? 1 : 0) || !t.lIllIIIIIIIlIII(string.contains(lIIllIIlllIIl[lIIllIIlllIlI[0]]) ? 1 : 0) || t.lIllIIIIIIIIllI(string.contains(lIIllIIlllIIl[lIIllIIlllIlI[3]]) ? 1 : 0))) {
            return lIIllIIlllIlI[1];
        }
        Player var10 = Players.getLocal();
        if (t.lIllIIIIIIIlIIl(var10)) {
            return lIIllIIlllIlI[1];
        }
        TileObject var11 = var9.A();
        if (t.lIllIIIIIIIlIIl(var11)) {
            return lIIllIIlllIlI[1];
        }
        if (t.lIllIIIIIIIlIlI(var10.distanceTo((Locatable)var11), lIIllIIlllIlI[4])) {
            var9.ad.clear();
            var11.interact(lIIllIIlllIIl[lIIllIIlllIlI[5]]);
            return lIIllIIlllIlI[0];
        }
        if (t.lIllIIIIIIIlIII(var9.ad.isEmpty() ? 1 : 0) && t.lIllIIIIIIIlIll(var8 = var9.b(var9.ad))) {
            var8.interact(lIIllIIlllIIl[lIIllIIlllIlI[6]]);
            return lIIllIIlllIlI[0];
        }
        if (t.lIllIIIIIIIIllI(var9.ad.isEmpty() ? 1 : 0)) {
            var8 = TileObjects.getAll(tileObject -> {
                int n2;
                if (t.lIllIIIIIIIIllI(tileObject.getName().equals(lIIllIIlllIIl[lIIllIIlllIlI[10]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIIlllIlI[0]];
                    stringArray[t.lIIllIIlllIlI[1]] = lIIllIIlllIIl[lIIllIIlllIlI[2]];
                    if (t.lIllIIIIIIIIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIllIIlllIlI[0];

                        if ((0x53 ^ 0x21 ^ (0xF5 ^ 0x83)) > 0) return n2 != 0;
                        return ((0x2A ^ 0x46 ^ (0x4E ^ 0x12)) & (84 + 7 - 37 + 73 ^ (0x1F ^ 0x50) ^ -1)) != 0;
                    }
                }
                n2 = lIIllIIlllIlI[1];
                return n2 != 0;
            });
            var8.sort(new UHelper(var9));
            if (t.lIllIIIIIIIllII(var8.size(), lIIllIIlllIlI[7])) {
                int[][] var12 = var9.a((List<TileObject>)var8);
                int[][] var13 = a.b(var12);
                var9.ad = var9.a(var13, (List<TileObject>)var8);
                if (t.lIllIIIIIIIllIl(var11.getWorldY(), Players.getLocal().getWorldY())) {
                    Collections.reverse(var9.ad);
                }
            }
        }
        return lIIllIIlllIlI[1];
    }

    /*
     * WARNING - void declaration
     */
    public List<TileObject> a(int[][] nArray, List<TileObject> list) {
        void var5_6;
        int var14;
        void var15;
        int var16;
        void var17;
        ArrayList arrayList = new ArrayList();
        int n2 = lIIllIIlllIlI[1];
        int llllllllllllllIllllIIIIIllIIIIlI22 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIIIlI22, ((void)var17[lIIllIIlllIlI[1]]).length)) {
            if (t.lIllIIIIIIIllll((int)var17[lIIllIIlllIlI[1]][llllllllllllllIllllIIIIIllIIIIlI22], lIIllIIlllIlI[0])) {
                var16 = llllllllllllllIllllIIIIIllIIIIlI22;
                var15.add(var16);

                if (3 >= ((0x35 ^ 0x50 ^ (0x76 ^ 0x17)) & (0x5A ^ 0x5F ^ 1 ^ -1))) break;
                return null;
            }
            ++llllllllllllllIllllIIIIIllIIIIlI22;

            if (((0x58 ^ 0x44) & ~(0x46 ^ 0x5A)) == 0) continue;
            return null;
        }
        while (t.lIllIIIIIIIlllI(var16, lIIllIIlllIlI[12])) {
            llllllllllllllIllllIIIIIllIIIIlI22 = var16 / lIIllIIlllIlI[8];
            var14 = var16 % lIIllIIlllIlI[8];
            if (t.lIllIIIIIIIlllI(llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0], lIIllIIlllIlI[4]) && t.lIllIIIIIIIllll((int)var17[llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0]][var14], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(var15.contains((llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + var14) ? 1 : 0)) {
                var16 = (llllllllllllllIllllIIIIIllIIIIlI22 + lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + var14;
                var15.add(var16);

                }
            } else if (t.lIllIIIIIIlIIII(llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]) && t.lIllIIIIIIIllll((int)var17[llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]][var14], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(var15.contains((llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + var14) ? 1 : 0)) {
                var16 = (llllllllllllllIllllIIIIIllIIIIlI22 - lIIllIIlllIlI[0]) * lIIllIIlllIlI[8] + var14;
                var15.add(var16);

                }
            } else if (t.lIllIIIIIIlIIII(var14 - lIIllIIlllIlI[0]) && t.lIllIIIIIIIllll((int)var17[llllllllllllllIllllIIIIIllIIIIlI22][var14 - lIIllIIlllIlI[0]], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(var15.contains(llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + var14 - lIIllIIlllIlI[0]) ? 1 : 0)) {
                var16 = llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + var14 - lIIllIIlllIlI[0];
                var15.add(var16);

                if (2 <= 0) {
                    return null;
                }
            } else if (t.lIllIIIIIIIlllI(var14 + lIIllIIlllIlI[0], lIIllIIlllIlI[8]) && t.lIllIIIIIIIllll((int)var17[llllllllllllllIllllIIIIIllIIIIlI22][var14 + lIIllIIlllIlI[0]], lIIllIIlllIlI[0]) && t.lIllIIIIIIIlIII(var15.contains(llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + var14 + lIIllIIlllIlI[0]) ? 1 : 0)) {
                var16 = llllllllllllllIllllIIIIIllIIIIlI22 * lIIllIIlllIlI[8] + var14 + lIIllIIlllIlI[0];
                var15.add(var16);

            }

            if (2 > 0) continue;
            return null;
        }
        ArrayList<TileObject> llllllllllllllIllllIIIIIllIIIIlI22 = new ArrayList<TileObject>();
        var14 = lIIllIIlllIlI[1];
        while (t.lIllIIIIIIIlllI(var14, var15.size())) {
            void var18;
            llllllllllllllIllllIIIIIllIIIIlI22.add((TileObject)var18.get((Integer)var15.get(var14)));

            ++var14;

            if (1 != 0) continue;
            return null;
        }
        System.out.println(lIIllIIlllIIl[lIIllIIlllIlI[4]]);
        return var5_6;
    }

    private static boolean lIllIIIIIIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected HandlingBogTask(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[lIIllIIlllIlI[0]];
        nArray[t.lIIllIIlllIlI[1]] = lIIllIIlllIlI[2];
        super(templeTrekkingPlugin, nArray);
        this.ad = new ArrayDeque();
    }

    private static boolean lIllIIIIIIIllll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        t.lIllIIIIIIIIlIl();
        t.lIllIIIIIIIIIll();
    }

    private static boolean lIllIIIIIIIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIIIIIIlIll(Object object) {
        return object != null;
    }
}

