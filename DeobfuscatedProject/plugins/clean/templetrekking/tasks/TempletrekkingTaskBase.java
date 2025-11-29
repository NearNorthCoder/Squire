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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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

    private static boolean lIllIIIIlIIIllI(int n2) {
        return n2 == 0;
    }

    static {
        x.lIllIIIIlIIIIll();
        x.lIllIIIIlIIIIlI();
        ag = lIIllIlIIllII[2];
        af = lIIllIlIIllII[1];
    }

    public TileObject A() {
        return TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIIllIlIIllII[4]];
            stringArray[x.lIIllIlIIllII[0]] = lIIllIlIIlIll[lIIllIlIIllII[0]];
            return tileObject.hasAction(stringArray);
        });
    }

    public abstract boolean z();

    private static boolean lIllIIIIlIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIIIlIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    protected TempletrekkingTaskBase(TempleTrekkingPlugin templeTrekkingPlugin, int ... nArray) {
        this.ah = templeTrekkingPlugin;
        this.ai = IntStream.of(nArray).boxed().collect(Collectors.toList());
    }

    private static boolean lIllIIIIlIIIlII(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIIlIIIIlI() {
        lIIllIlIIlIll = new String[lIIllIlIIllII[4]];
        x.lIIllIlIIlIll[x.lIIllIlIIllII[0]] = "Continue-trek";
    }

    public boolean run() {
        x var1;
        if (x.lIllIIIIlIIIlII(this.ah.e() ? 1 : 0)) {
            return lIIllIlIIllII[0];
        }
        var1.ah.a(Static.getClient().getVarbitValue(lIIllIlIIllII[1]));
        var1.ah.b(Static.getClient().getVarbitValue(lIIllIlIIllII[2]));
        if (x.lIllIIIIlIIIlIl(var1.ah.c(), lIIllIlIIllII[3])) {
            return lIIllIlIIllII[0];
        }
        if (x.lIllIIIIlIIIllI(var1.ai.contains(var1.ah.b()) ? 1 : 0)) {
            return lIIllIlIIllII[0];
        }
        return this.z();
    }

        return String.valueOf(var2);
    }
}

