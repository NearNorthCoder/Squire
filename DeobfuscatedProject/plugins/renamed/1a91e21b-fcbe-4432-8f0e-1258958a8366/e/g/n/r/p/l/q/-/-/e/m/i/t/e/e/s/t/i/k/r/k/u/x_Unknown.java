/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.client.Static
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

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

public abstract class x_Unknown
extends Task {
    private final /* synthetic */ List<Integer> ai;
    private static final /* synthetic */ int af;
    private static final /* synthetic */ int ag;
    protected final /* synthetic */ TempleTrekkingPlugin ah;
    private static /* synthetic */ int[] lIIllIlIIllII;
    private static /* synthetic */ String[] lIIllIlIIlIll;

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

    protected x(TempleTrekkingPlugin templeTrekkingPlugin, int ... nArray) {
        this.ah = templeTrekkingPlugin;
        this.ai = IntStream.of(nArray).boxed().collect(Collectors.toList());
    }

    private static boolean lIllIIIIlIIIlII(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIIlIIIIll() {
        lIIllIlIIllII = new int[5];
        x.lIIllIlIIllII[0] = (0x67 ^ 0x5F ^ (0x4B ^ 0x54)) & (0x38 ^ 0x41 ^ (0x52 ^ 0xC) ^ -1);
        x.lIIllIlIIllII[1] = 0xFFFF97B7 & 0x6FED;
        x.lIIllIlIIllII[2] = -(0xFFFFE62D & 0x5DD3) & (0xFFFFFE3F & 0x5FFF);
        x.lIIllIlIIllII[3] = 2;
        x.lIIllIlIIllII[4] = 1;
    }

    private static void lIllIIIIlIIIIlI() {
        lIIllIlIIlIll = new String[lIIllIlIIllII[4]];
        x.lIIllIlIIlIll[x.lIIllIlIIllII[0]] = x."Continue-trek";
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

    private static String lIllIIIIlIIIIIl(String var8, String var2) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var5 = var2.toCharArray();
        int var4 = lIIllIlIIllII[0];
        char[] var7 = var8.toCharArray();
        int var6 = var7.length;
        int var9 = lIIllIlIIllII[0];
        while (x.lIllIIIIlIIIlll(var9, var6)) {
            char var10 = var7[var9];
            var3.append((char)(var10 ^ var5[var4 % var5.length]));
            0;
            ++var4;
            ++var9;
            0;
            if ((0x32 ^ 0xF ^ (0x1C ^ 0x25)) >= 3) continue;
            return null;
        }
        return String.valueOf(var3);
    }
}

