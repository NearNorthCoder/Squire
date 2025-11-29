/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* TASK: Climbing Up Ladder -> ClimbingupladderTask */
@TaskDesc(name="Climbing Up Ladder")
public class ClimbingUpLadderTask
extends Task {
    private static final /* synthetic */ Logger r;
    private final /* synthetic */ SquireFisherConfig s;
    private static /* synthetic */ int[] lIllllIIIIlI;
    private static /* synthetic */ String[] lIllllIIIIIl;

    @Inject
    public b(SquireFisherConfig squireFisherConfig) {
        this.s = squireFisherConfig;
    }

    private static String lllIllIIlIIIII(String var8, String var7) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIllllIIIIlI[3], var14);
            return new String(var5.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lllIllIIlIIlII(Object object) {
        return object == null;
    }

    public boolean run() {
        if (b.lllIllIIlIIIll(this.s.fishingTrawler() ? 1 : 0)) {
            return lIllllIIIIlI[0];
        }
        String[] stringArray = new String[lIllllIIIIlI[1]];
        stringArray[b.lIllllIIIIlI[0]] = lIllllIIIIIl[lIllllIIIIlI[0]];
        NPC var9 = NPCs.getNearest((String[])stringArray);
        if (b.lllIllIIlIIIll(Widgets.isVisible((Widget)Widgets.get((WidgetInfo)WidgetInfo.FISHING_TRAWLER_CONTRIBUTION)) ? 1 : 0)) {
            return lIllllIIIIlI[0];
        }
        if (b.lllIllIIlIIlII(var9)) {
            return lIllllIIIIlI[0];
        }
        int[] nArray = new int[lIllllIIIIlI[1]];
        nArray[b.lIllllIIIIlI[0]] = lIllllIIIIlI[2];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        tileObject.interact(lIllllIIIIIl[lIllllIIIIlI[1]]);
        return lIllllIIIIlI[1];
    }

    private static void lllIllIIlIIIlI() {
        lIllllIIIIlI = new int[4];
        b.lIllllIIIIlI[0] = (0x13 ^ 0x57 ^ (0xFB ^ 0x9C)) & (0x82 ^ 0x98 ^ (0x8C ^ 0xB5) ^ -1);
        b.lIllllIIIIlI[1] = 1;
        b.lIllllIIIIlI[2] = -(0xFFFFC83E & 0x77E3) & (0xFFFFCFFD & Short.MAX_VALUE);
        b.lIllllIIIIlI[3] = 2;
    }

    static {
        b.lllIllIIlIIIlI();
        b.lllIllIIlIIIIl();
        r = LoggerFactory.getLogger(b.class);
    }

    private static String lllIllIIIlllll(String var2, String var1) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var10 = var1.toCharArray();
        int var3 = lIllllIIIIlI[0];
        char[] var13 = var2.toCharArray();
        int var6 = var13.length;
        int var4 = lIllllIIIIlI[0];
        while (b.lllIllIIlIIlIl(var4, var6)) {
            char var15 = var13[var4];
            var12.append((char)(var15 ^ var10[var3 % var10.length]));
            0;
            ++var3;
            ++var4;
            0;
            if (((0x23 ^ 0x38) & ~(0x3D ^ 0x26)) <= 1) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static void lllIllIIlIIIIl() {
        lIllllIIIIIl = new String[lIllllIIIIlI[3]];
        b.lIllllIIIIIl[b.lIllllIIIIlI[0]] = b."Murphy";
        b.lIllllIIIIIl[b.lIllllIIIIlI[1]] = b."Climb-up";
    }

    private static boolean lllIllIIlIIlIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIllIIlIIIll(int n) {
        return n == 0;
    }
}

