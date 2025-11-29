/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Widgets
 */
package y.l.q.i.-.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Widgets;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.b;

@TaskDesc(name="Using seers teleport", priority=100, blocking=true)
public class i
extends Task {
    private static /* synthetic */ String[] lIllIIIllII;
    private final /* synthetic */ AgilityConfig y;
    private static /* synthetic */ int[] lIllIIIllIl;

    private static boolean lIIlIlIllIIlll(int n, int n2) {
        return n > n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        i llllllllllllllllIlIlIlIIIlllIllI;
        if (i.lIIlIlIllIIIll((Object)this.y.course(), (Object)b.SEERS_VILLAGE)) {
            return lIllIIIllIl[0];
        }
        if (i.lIIlIlIllIIlII(llllllllllllllllIlIlIlIIIlllIllI.y.seersTeleport() ? 1 : 0)) {
            return lIllIIIllIl[0];
        }
        Player llllllllllllllllIlIlIlIIIlllIlIl = Players.getLocal();
        if (!i.lIIlIlIllIIlIl(llllllllllllllllIlIlIlIIIlllIlIl) || i.lIIlIlIllIIllI(llllllllllllllllIlIlIlIIIlllIlIl.isAnimating() ? 1 : 0)) {
            return lIllIIIllIl[0];
        }
        if (i.lIIlIlIllIIllI(llllllllllllllllIlIlIlIIIlllIlIl.getPlane())) {
            return lIllIIIllIl[0];
        }
        if (i.lIIlIlIllIIlll(llllllllllllllllIlIlIlIIIlllIlIl.getWorldLocation().distanceTo2D(new WorldPoint(lIllIIIllIl[1], lIllIIIllIl[2], lIllIIIllIl[0])), lIllIIIllIl[3])) {
            return lIllIIIllIl[0];
        }
        WidgetInfo llllllllllllllllIlIlIlIIIlllIlII = SpellBook.Standard.CAMELOT_TELEPORT.getWidget();
        Widget llllllllllllllllIlIlIlIIIlllIIll = Widgets.get((WidgetInfo)llllllllllllllllIlIlIlIIIlllIlII);
        if (i.lIIlIlIllIlIII(llllllllllllllllIlIlIlIIIlllIIll)) {
            return lIllIIIllIl[0];
        }
        var3_3.interact(lIllIIIllII[lIllIIIllIl[0]]);
        return lIllIIIllIl[4];
    }

    private static boolean lIIlIlIllIIlII(int n) {
        return n == 0;
    }

    private static void lIIlIlIllIIIlI() {
        lIllIIIllIl = new int[6];
        i.lIllIIIllIl[0] = (45 + 138 - 149 + 113 ^ 118 + 54 - 84 + 69) & (0x15 ^ 7 ^ (0x32 ^ 0x2E) ^ -1);
        i.lIllIIIllIl[1] = -(0xFFFFFDFF & 0x160B) & (0xFFFF9FDB & 0x7EBF);
        i.lIllIIIllIl[2] = -(0xFFFFF71B & 0x78ED) & (0xFFFFFFFE & 0x7D8F);
        i.lIllIIIllIl[3] = 0xC4 ^ 0xC1;
        i.lIllIIIllIl[4] = 1;
        i.lIllIIIllIl[5] = 2;
    }

    private static void lIIlIlIllIIIIl() {
        lIllIIIllII = new String[lIllIIIllIl[4]];
        i.lIllIIIllII[i.lIllIIIllIl[0]] = i."Seers'";
    }

    @Inject
    public i(AgilityConfig agilityConfig) {
        this.y = agilityConfig;
    }

    private static boolean lIIlIlIllIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIllIIllI(int n) {
        return n != 0;
    }

    private static boolean lIIlIlIllIlIII(Object object) {
        return object == null;
    }

    private static String lIIlIlIllIIIII(String llllllllllllllllIlIlIlIIIllIlIIl, String llllllllllllllllIlIlIlIIIllIlIII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIIIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIlIIIllIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIlIIIllIllIl.init(lIllIIIllIl[5], llllllllllllllllIlIlIlIIIllIlllI);
            return new String(llllllllllllllllIlIlIlIIIllIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlIIIllIllII) {
            llllllllllllllllIlIlIlIIIllIllII.printStackTrace();
            return null;
        }
    }

    static {
        i.lIIlIlIllIIIlI();
        i.lIIlIlIllIIIIl();
    }

    private static boolean lIIlIlIllIIIll(Object object, Object object2) {
        return object != object2;
    }
}

