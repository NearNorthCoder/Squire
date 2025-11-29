/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum4;
import gg.squire.hunter.tasks.FHelper;
import gg.squire.hunter.tasks.GameEnum2;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Resetting box trap", priority=15)
public class ResettingBoxTrapTask
extends HunterTaskBase {

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    @Override
    public boolean x() {
        String string;
        l var4;
        Player player = Players.getLocal();
        if (l.var5(player.getAnimation(), var1[0])) {
            return var1[1];
        }
        f var6 = var4.y().h().values().stream().filter(f2 -> {
            boolean bl;
            if (!l.var3((Object)f2.q(), (Object)g.FULL) || l.var7((Object)f2.q(), (Object)g.EMPTY)) {
                bl = var1[2];
                0;
                if (((0xF9 ^ 0xB3) & ~(0x4C ^ 6)) != ((0x19 ^ 0x35) & ~(0x6E ^ 0x42))) {
                    return ((0xC8 ^ 0x96) & ~(0x76 ^ 0x28)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        }).min(Comparator.comparing(f2 -> -f2.m())).orElse(null);
        if (l.var8(var6)) {
            return var1[1];
        }
        TileObject var9 = TileObjects.getFirstAt((WorldPoint)var6.o(), tileObject -> {
            String[] stringArray = new String[var1[2]];
            stringArray[l.var1[1]] = var2[var1[3]];
            return tileObject.hasAction(stringArray);
        });
        if (l.var8(var9)) {
            return var1[1];
        }
        if (l.var7((Object)var6.q(), (Object)g.FULL)) {
            string = var2[var1[1]];
            0;
            if null != null {
                return ((4 + 99 - 12 + 94 ^ 121 + 108 - 99 + 41) & (0x60 ^ 0x7F ^ (0xA2 ^ 0xAF) ^ -1)) != 0;
            }
        } else {
            string = var2[var1[2]];
        }
        var9.interact(string);
        return var1[2];
    }

    static {
        l.var10();
        l.var11();
    }

    private static void var11() {
        var2 = new String[var1[4]];
        l.var2[l.var1[1]] = "Check";
        l.var2[l.var1[2]] = "Dismantle";
        l.var2[l.var1[3]] = "Reset";
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean var7(Object object, Object object2) {
        return object == object2;
    }

    @Inject
    public ResettingBoxTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.CHINS);
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static void var10() {
        var1 = new int[6];
        l.var1[0] = 0xFFFFBF5E & 0x54FD;
        l.var1[1] = (0x9D ^ 0xB2) & ~(0xA2 ^ 0x8D);
        l.var1[2] = 1;
        l.var1[3] = 2;
        l.var1[4] = 3;
        l.var1[5] = 0x64 ^ 0x6C;
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var1[1];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var1[1];
        while (l.var33(var32, var31)) {
            char var34 = var30[var32];
            var27.append((char)(var34 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (1 > ((0x9A ^ 0x83) & ~(0x17 ^ 0xE))) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    private static boolean var33(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var8(Object object) {
        return object == null;
    }
}

