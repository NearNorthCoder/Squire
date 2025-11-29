/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
 */
package gg.squire.templetrekking.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.client.Static;

public abstract class TempletrekkingTaskBase
extends Task {
    private final  List<Integer> ai;
    private static final  int af;
    private static final  int ag;
    protected final  TempleTrekkingPlugin ah;

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    static {
        x.var4();
        x.var5();
        ag = var1[2];
        af = var1[1];
    }

    public TileObject A() {
        return TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[var1[4]];
            stringArray[x.var1[0]] = var2[var1[0]];
            return tileObject.hasAction(stringArray);
        });
    }

    public abstract boolean z();

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    protected TempletrekkingTaskBase(TempleTrekkingPlugin templeTrekkingPlugin, int ... nArray) {
        this.ah = templeTrekkingPlugin;
        this.ai = IntStream.of(nArray).boxed().collect(Collectors.toList());
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

    private static void var4() {
        var1 = new int[5];
        x.var1[0] = (0x67 ^ 0x5F ^ (0x4B ^ 0x54)) & (0x38 ^ 0x41 ^ (0x52 ^ 0xC) ^ -1);
        x.var1[1] = 0xFFFF97B7 & 0x6FED;
        x.var1[2] = -(0xFFFFE62D & 0x5DD3) & (0xFFFFFE3F & 0x5FFF);
        x.var1[3] = 2;
        x.var1[4] = 1;
    }

    private static void var5() {
        var2 = new String[var1[4]];
        x.var2[x.var1[0]] = "Continue-trek";
    }

    public boolean run() {
        x var9;
        if (x.var8(this.ah.e() ? 1 : 0)) {
            return var1[0];
        }
        var9.ah.a(Static.getClient().getVarbitValue(var1[1]));
        var9.ah.b(Static.getClient().getVarbitValue(var1[2]));
        if (x.var6(var9.ah.c(), var1[3])) {
            return var1[0];
        }
        if (x.var3(var9.ai.contains(var9.ah.b()) ? 1 : 0)) {
            return var1[0];
        }
        return this.z();
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[0];
        while (x.var7(var18, var17)) {
            char var19 = var16[var18];
            var13.append((char)(var19 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if ((0x32 ^ 0xF ^ (0x1C ^ 0x25)) >= 3) continue;
            return null;
        }
        return String.valueOf(var13);
    }
}

