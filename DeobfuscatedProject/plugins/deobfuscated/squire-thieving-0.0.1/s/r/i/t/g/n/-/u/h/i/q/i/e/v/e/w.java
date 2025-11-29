/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.s;

@TaskDesc(name="Picking the lock")
public class w
extends s {
    private static /* synthetic */ int[] lIIllIllIlIlI;
    /* synthetic */ WorldArea ag;
    private static /* synthetic */ String[] lIIllIllIlIIl;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var2_2;
        w llllllllllllllIlllIlllIlllIlIIIl;
        void llllllllllllllIlllIlllIlllIlIIII;
        Player player = Players.getLocal();
        if (w.lIllIIIlIllIIIl(player)) {
            return lIIllIllIlIlI[3];
        }
        if (w.lIllIIIlIllIIlI(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIllIlIlI[3];
        }
        if (w.lIllIIIlIllIIlI(Inventory.isFull() ? 1 : 0)) {
            return lIIllIllIlIlI[3];
        }
        if (!w.lIllIIIlIllIIll(llllllllllllllIlllIlllIlllIlIIII.isAnimating() ? 1 : 0) || w.lIllIIIlIllIIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIllIlIlI[3];
        }
        if (w.lIllIIIlIllIIlI(llllllllllllllIlllIlllIlllIlIIIl.ag.contains((Locatable)llllllllllllllIlllIlllIlllIlIIII) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIIllIllIlIlI[4], lIIllIllIlIlI[5], lIIllIllIlIlI[3]), (boolean)lIIllIllIlIlI[3]);
            0;
            return lIIllIllIlIlI[6];
        }
        String[] stringArray = new String[lIIllIllIlIlI[6]];
        stringArray[w.lIIllIllIlIlI[3]] = lIIllIllIlIIl[lIIllIllIlIlI[3]];
        TileObject llllllllllllllIlllIlllIlllIIllll = TileObjects.getNearest((String[])stringArray);
        if (w.lIllIIIlIllIIIl(llllllllllllllIlllIlllIlllIIllll)) {
            return lIIllIllIlIlI[3];
        }
        var2_2.interact(lIIllIllIlIIl[lIIllIllIlIlI[6]]);
        return lIIllIllIlIlI[6];
    }

    @Inject
    public w(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
        this.ag = new WorldArea(lIIllIllIlIlI[0], lIIllIllIlIlI[1], lIIllIllIlIlI[2], lIIllIllIlIlI[2], lIIllIllIlIlI[3]);
    }

    private static boolean lIllIIIlIllIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIllIIIlIlIllll() {
        lIIllIllIlIIl = new String[lIIllIllIlIlI[7]];
        w.lIIllIllIlIIl[w.lIIllIllIlIlI[3]] = w."Stone chest";
        w.lIIllIllIlIIl[w.lIIllIllIlIlI[6]] = w."Picklock";
    }

    private static String lIllIIIlIlIlllI(String llllllllllllllIlllIlllIllIlIllll, String llllllllllllllIlllIlllIllIlIllII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIllIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIllIlIllII.getBytes(StandardCharsets.UTF_8)), lIIllIllIlIlI[8]), "DES");
            Cipher llllllllllllllIlllIlllIllIllIIIl = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIllIllIIIl.init(lIIllIllIlIlI[7], llllllllllllllIlllIlllIllIllIIlI);
            return new String(llllllllllllllIlllIlllIllIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIllIllIIII) {
            llllllllllllllIlllIlllIllIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIllIIll(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIlIllIIII() {
        lIIllIllIlIlI = new int[9];
        w.lIIllIllIlIlI[0] = 0xFFFFC71F & 0x3DFC;
        w.lIIllIllIlIlI[1] = 0xFFFFAF6B & 0x77F6;
        w.lIIllIllIlIlI[2] = 0x1D ^ 0x76 ^ (0xF0 ^ 0x91);
        w.lIIllIllIlIlI[3] = (0x29 ^ 0xA ^ (0x2F ^ 0x41)) & (74 + 105 - 157 + 221 ^ 11 + 97 - 76 + 158 ^ -1);
        w.lIIllIllIlIlI[4] = -(0xFFFFFDFC & 0x6AC7) & (0xFFFFEDDF & 0x7FF7);
        w.lIIllIllIlIlI[5] = 0xFFFFF7F7 & 0x2F6F;
        w.lIIllIllIlIlI[6] = 1;
        w.lIIllIllIlIlI[7] = 2;
        w.lIIllIllIlIlI[8] = 0xEC ^ 0xB2 ^ (0x33 ^ 0x65);
    }

    private static boolean lIllIIIlIllIIIl(Object object) {
        return object == null;
    }

    static {
        w.lIllIIIlIllIIII();
        w.lIllIIIlIlIllll();
    }

    private static String lIllIIIlIlIllIl(String llllllllllllllIlllIlllIllIllllll, String llllllllllllllIlllIlllIllIlllllI) {
        llllllllllllllIlllIlllIllIllllll = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIlllIIIIlI = new StringBuilder();
        char[] llllllllllllllIlllIlllIlllIIIIIl = llllllllllllllIlllIlllIllIlllllI.toCharArray();
        int llllllllllllllIlllIlllIlllIIIIII = lIIllIllIlIlI[3];
        char[] llllllllllllllIlllIlllIllIlllIlI = llllllllllllllIlllIlllIllIllllll.toCharArray();
        int llllllllllllllIlllIlllIllIlllIIl = llllllllllllllIlllIlllIllIlllIlI.length;
        int llllllllllllllIlllIlllIllIlllIII = lIIllIllIlIlI[3];
        while (w.lIllIIIlIllIlII(llllllllllllllIlllIlllIllIlllIII, llllllllllllllIlllIlllIllIlllIIl)) {
            char llllllllllllllIlllIlllIlllIIIlIl = llllllllllllllIlllIlllIllIlllIlI[llllllllllllllIlllIlllIllIlllIII];
            llllllllllllllIlllIlllIlllIIIIlI.append((char)(llllllllllllllIlllIlllIlllIIIlIl ^ llllllllllllllIlllIlllIlllIIIIIl[llllllllllllllIlllIlllIlllIIIIII % llllllllllllllIlllIlllIlllIIIIIl.length]));
            0;
            ++llllllllllllllIlllIlllIlllIIIIII;
            ++llllllllllllllIlllIlllIllIlllIII;
            0;
            if (((0x28 ^ 0x27) & ~(0x43 ^ 0x4C)) >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllIlllIIIIlI);
    }

    private static boolean lIllIIIlIllIlII(int n2, int n3) {
        return n2 < n3;
    }
}

