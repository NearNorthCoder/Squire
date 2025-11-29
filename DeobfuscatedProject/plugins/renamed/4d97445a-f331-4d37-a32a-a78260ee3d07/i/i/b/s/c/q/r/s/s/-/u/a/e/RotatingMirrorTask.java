/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

/* TASK: Rotating Mirror -> RotatingmirrorTask */
@TaskDesc(name="Rotating Mirror", priority=1000, blocking=true)
public class RotatingMirrorTask
extends Task {
    private final /* synthetic */ SquireQuestHelper fU;
    private static /* synthetic */ int[] llIIIIlII;
    private static /* synthetic */ String[] llIIIIIll;

    private static boolean lIlIlIIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlIIllII(Object object) {
        return object != null;
    }

    private static void lIlIlIIlIIl() {
        llIIIIIll = new String[llIIIIlII[6]];
        bs.llIIIIIll[bs.llIIIIlII[0]] = bs."ObjectStep";
    }

    private static String lIlIlIIlIII(String lIllIllllllIIII, String lIllIlllllIllIl) {
        try {
            SecretKeySpec lIllIllllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlllllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIllllllIIlI = Cipher.getInstance("Blowfish");
            lIllIllllllIIlI.init(llIIIIlII[1], lIllIllllllIIll);
            return new String(lIllIllllllIIlI.doFinal(Base64.getDecoder().decode(lIllIllllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIllllllIIIl) {
            lIllIllllllIIIl.printStackTrace();
            return null;
        }
    }

    static {
        bs.lIlIlIIlIlI();
        bs.lIlIlIIlIIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        bs lIllIlllllllIll;
        String string = this.fU.cz();
        if (bs.lIlIlIIlIll(string.equals(llIIIIIll[llIIIIlII[0]]) ? 1 : 0)) {
            return llIIIIlII[0];
        }
        TileObject lIllIlllllllIIl = lIllIlllllllIll.fU.cx();
        if (!bs.lIlIlIIllII(lIllIlllllllIIl) || bs.lIlIlIIllIl(lIllIlllllllIIl.distanceTo((Locatable)Players.getLocal()), llIIIIlII[1])) {
            return llIIIIlII[0];
        }
        if (bs.lIlIlIIlIll(Dialog.isOpen() ? 1 : 0)) {
            return llIIIIlII[0];
        }
        Widget lIllIlllllllIII = Widgets.get((int)llIIIIlII[2], (int)llIIIIlII[3]);
        if (bs.lIlIlIIlIll(Widgets.isVisible((Widget)lIllIlllllllIII) ? 1 : 0)) {
            return llIIIIlII[0];
        }
        var3_3.interact(llIIIIlII[0], llIIIIlII[4], llIIIIlII[5], var3_3.getId());
        return llIIIIlII[6];
    }

    private static void lIlIlIIlIlI() {
        llIIIIlII = new int[7];
        bs.llIIIIlII[0] = (3 ^ (0xAB ^ 0xA6)) & (0x3F ^ 0x78 ^ (0x8A ^ 0xC3) ^ -1);
        bs.llIIIIlII[1] = 2;
        bs.llIIIIlII[2] = -(0xFFFFFED7 & 0x5929) & (0xFFFFFFFF & 0x5A7B);
        bs.llIIIIlII[3] = 0x46 ^ 0x73 ^ (0x4D ^ 0x6A);
        bs.llIIIIlII[4] = 0x1A ^ 0x5B ^ (0x17 ^ 0x48);
        bs.llIIIIlII[5] = -1;
        bs.llIIIIlII[6] = 1;
    }

    @Inject
    public bs(SquireQuestHelper squireQuestHelper) {
        this.fU = squireQuestHelper;
    }
}

