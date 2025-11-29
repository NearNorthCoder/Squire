/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Performing dig task -> PerformingdigtaskTask */
@TaskDesc(name="Performing dig task")
public class bl
extends Task {
    @Inject
    private /* synthetic */ SquireQuestHelper fG;
    private static /* synthetic */ int[] lIllllI;
    private static /* synthetic */ String[] lIlllIl;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        bl lllIllIIlIIIIlI;
        String string = this.fG.cz();
        if (bl.lIllllIIl(string.equals(lIlllIl[lIllllI[0]]) ? 1 : 0)) {
            return lIllllI[0];
        }
        WorldPoint lllIllIIlIIIIII = lllIllIIlIIIIlI.fG.cA();
        if (bl.lIllllIlI(lllIllIIlIIIIII)) {
            return lIllllI[0];
        }
        if (bl.lIllllIIl(Players.getLocal().getWorldLocation().equals((Object)lllIllIIlIIIIII) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)lllIllIIlIIIIII);
            0;
            return lIllllI[1];
        }
        int[] nArray = new int[lIllllI[1]];
        nArray[bl.lIllllI[0]] = lIllllI[2];
        Item lllIllIIIllllll = Inventory.getFirst((int[])nArray);
        if (bl.lIllllIlI(lllIllIIIllllll)) {
            return lIllllI[0];
        }
        var3_3.interact(lIlllIl[lIllllI[1]]);
        return lIllllI[1];
    }

    private static void lIllllIII() {
        lIllllI = new int[5];
        bl.lIllllI[0] = (0x77 ^ 0x2D) & ~(0x7C ^ 0x26);
        bl.lIllllI[1] = 1;
        bl.lIllllI[2] = 0xFFFFC3B8 & 0x3FFF;
        bl.lIllllI[3] = 2;
        bl.lIllllI[4] = 0x4A ^ 0x42;
    }

    private static boolean lIllllIIl(int n2) {
        return n2 == 0;
    }

    static {
        bl.lIllllIII();
        bl.lIlllIlll();
    }

    private static String lIlllIlIl(String lllIllIIIlIlIlI, String lllIllIIIlIIlll) {
        try {
            SecretKeySpec lllIllIIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIllIIIlIllII = Cipher.getInstance("Blowfish");
            lllIllIIIlIllII.init(lIllllI[3], lllIllIIIlIllIl);
            return new String(lllIllIIIlIllII.doFinal(Base64.getDecoder().decode(lllIllIIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIIIlIlIll) {
            lllIllIIIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlI(Object object) {
        return object == null;
    }

    private static String lIlllIllI(String lllIllIIIllIlll, String lllIllIIIllIllI) {
        try {
            SecretKeySpec lllIllIIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllIIIllIllI.getBytes(StandardCharsets.UTF_8)), lIllllI[4]), "DES");
            Cipher lllIllIIIlllIIl = Cipher.getInstance("DES");
            lllIllIIIlllIIl.init(lIllllI[3], lllIllIIIlllIlI);
            return new String(lllIllIIIlllIIl.doFinal(Base64.getDecoder().decode(lllIllIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIllIIIlllIII) {
            lllIllIIIlllIII.printStackTrace();
            return null;
        }
    }

    private static void lIlllIlll() {
        lIlllIl = new String[lIllllI[3]];
        bl.lIlllIl[bl.lIllllI[0]] = bl."DigStep";
        bl.lIlllIl[bl.lIllllI[1]] = bl."Dig";
    }
}

