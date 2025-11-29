/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import m.e.i.q.u.r.-.n.s.e.r.i.S;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Going back through pass", priority=100, blocking=true)
public class P
extends S {
    private static /* synthetic */ int[] lllllIlIIIII;
    private static /* synthetic */ String[] lllllIIlllll;

    private static void lIIlIIllIIIlIlI() {
        lllllIIlllll = new String[lllllIlIIIII[1]];
        P.lllllIIlllll[P.lllllIlIIIII[0]] = P."Go-through";
    }

    private static void lIIlIIllIIIlIll() {
        lllllIlIIIII = new int[3];
        P.lllllIlIIIII[0] = (142 + 88 - 220 + 197 ^ 100 + 25 - 70 + 139) & (58 + 57 - 100 + 145 ^ 138 + 41 - 40 + 34 ^ -1);
        P.lllllIlIIIII[1] = 1;
        P.lllllIlIIIII[2] = -1 & (0xFFFFE5FE & 0xBB6F);
    }

    private static boolean lIIlIIllIIIllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIllIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        P.lIIlIIllIIIlIll();
        P.lIIlIIllIIIlIlI();
    }

    @Inject
    protected P(SquireMinerConfig squireMinerConfig) {
        super(squireMinerConfig);
    }

    private static String lIIlIIllIIIlIIl(String lllllllllllllllIIlIIlIllIIIIIlIl, String lllllllllllllllIIlIIlIllIIIIIlII) {
        lllllllllllllllIIlIIlIllIIIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIllIIIIlIII = new StringBuilder();
        char[] lllllllllllllllIIlIIlIllIIIIIlll = lllllllllllllllIIlIIlIllIIIIIlII.toCharArray();
        int lllllllllllllllIIlIIlIllIIIIIllI = lllllIlIIIII[0];
        char[] lllllllllllllllIIlIIlIllIIIIIIII = lllllllllllllllIIlIIlIllIIIIIlIl.toCharArray();
        int lllllllllllllllIIlIIlIlIllllllll = lllllllllllllllIIlIIlIllIIIIIIII.length;
        int lllllllllllllllIIlIIlIlIlllllllI = lllllIlIIIII[0];
        while (P.lIIlIIllIIIlllI(lllllllllllllllIIlIIlIlIlllllllI, lllllllllllllllIIlIIlIlIllllllll)) {
            char lllllllllllllllIIlIIlIllIIIIlIll = lllllllllllllllIIlIIlIllIIIIIIII[lllllllllllllllIIlIIlIlIlllllllI];
            lllllllllllllllIIlIIlIllIIIIlIII.append((char)(lllllllllllllllIIlIIlIllIIIIlIll ^ lllllllllllllllIIlIIlIllIIIIIlll[lllllllllllllllIIlIIlIllIIIIIllI % lllllllllllllllIIlIIlIllIIIIIlll.length]));
            0;
            ++lllllllllllllllIIlIIlIllIIIIIllI;
            ++lllllllllllllllIIlIIlIlIlllllllI;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIlIllIIIIlIII);
    }

    private static boolean lIIlIIllIIIllII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean t() {
        void var1_1;
        if (!P.lIIlIIllIIIllII(this.y()) || P.lIIlIIllIIIllII(this.z() ? 1 : 0)) {
            return lllllIlIIIII[0];
        }
        int[] nArray = new int[lllllIlIIIII[1]];
        nArray[P.lllllIlIIIII[0]] = lllllIlIIIII[2];
        TileObject lllllllllllllllIIlIIlIllIIIlIlIl = TileObjects.getNearest((int[])nArray);
        if (P.lIIlIIllIIIllIl(lllllllllllllllIIlIIlIllIIIlIlIl)) {
            return lllllIlIIIII[0];
        }
        var1_1.interact(lllllIIlllll[lllllIlIIIII[0]]);
        return lllllIlIIIII[1];
    }
}

