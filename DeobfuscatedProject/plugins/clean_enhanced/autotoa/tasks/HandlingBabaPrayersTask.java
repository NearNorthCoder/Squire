/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum10;

@TaskDesc(name="Handling baba prayers", priority=0x7FFFFFFF, register=true)
public class HandlingBabaPrayersTask
extends AutotoaManager {
    private  int dF;

    private static boolean var3(Object object) {
        return object != null;
    }

    @Override
    public boolean aS() {
        return var2[1];
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public List<Prayer> aN() {
        aH var7;
        String[] stringArray = new String[var2[1]];
        stringArray[aH.var2[0]] = var1[var2[0]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aH.var3(nPC) && aH.var6(nPC.getId(), var2[2])) {
            return List.of(this.aQ());
        }
        String[] stringArray2 = new String[var2[1]];
        stringArray2[aH.var2[0]] = var1[var2[1]];
        NPC var8 = NPCs.getNearest((String[])stringArray2);
        if (aH.var9(var7.dF, Static.getClient().getTickCount()) && aH.var3(var8)) {
            return List.of(Prayer.PROTECT_FROM_MISSILES, var7.aQ());
        }
        return List.of(Prayer.PROTECT_FROM_MELEE, this.aQ());
    }

    private static void var10() {
        var2 = new int[11];
        aH.var2[0] = (116 + 48 - 22 + 40 ^ 121 + 79 - 100 + 37) & (0x39 ^ 0x73 ^ (0xDD ^ 0xA8) ^ -1);
        aH.var2[1] = 1;
        aH.var2[2] = 0xFFFFAFF7 & 0x7E0C;
        aH.var2[3] = 0xFFFFFB77 & 0x3FDC;
        aH.var2[4] = 3;
        aH.var2[5] = -(0xFFFFB5F9 & 0x5A57) & (0xFFFFBF73 & 0x7EDE);
        aH.var2[6] = -(0xFFFF9CED & 0x735B) & (0xFFFFFF6B & 0x3EDF);
        aH.var2[7] = 2;
        aH.var2[8] = -(0xFFFFEE07 & 0x35F9) & (0xFFFFEDBF & 0x3E7F);
        aH.var2[9] = 0x55 ^ 0x50;
        aH.var2[10] = 0x14 ^ 0x1C;
    }

    @Inject
    public HandlingBabaPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dF = var2[0];
    }

    static {
        aH.var10();
        aH.var11();
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean var18(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[var2[4]];
        nArray[aH.var2[0]] = var2[5];
        nArray[aH.var2[1]] = var2[6];
        nArray[aH.var2[7]] = var2[2];
        return this.cm.a(nArray);
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var2[0];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var2[0];
        while (aH.var5(var28, var27)) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if (3 != ((0xA8 ^ 0xBF ^ (0x63 ^ 0x7A)) & (0xA9 ^ 0x97 ^ (0x98 ^ 0xA8) ^ -1) & ((0xA ^ 0x2C ^ (0xA1 ^ 0xAD)) & (0x8E ^ 0xA7 ^ 3 ^ -1) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    @Override
    public int aO() {
        return var2[3];
    }

    /*
     * WARNING - void declaration
     */
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        void var30;
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        if (aH.var18(graphicsObjectCreated.getGraphicsObject().getId(), var2[8])) {
            return;
        }
        LocalPoint var31 = var30.getLocation();
        WorldPoint var32 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var31);
        String[] stringArray = new String[var2[1]];
        stringArray[aH.var2[0]] = var1[var2[7]];
        NPC var33 = NPCs.getNearest((String[])stringArray);
        if (aH.var19(var33)) {
            return;
        }
        if (aH.var4(var33.getWorldArea().contains(var32) ? 1 : 0)) {
            var34.dF = Static.getClient().getTickCount() + var2[9];
        }
    }

        catch (Exception var40) {
            var40.printStackTrace();
            return null;
        }
    }

    private static void var11() {
        var1 = new String[var2[4]];
        aH.var1[aH.var2[0]] = "Ba-Ba";
        aH.var1[aH.var2[1]] = "Baboon";
        aH.var1[aH.var2[7]] = "Ba-Ba";
    }
}

