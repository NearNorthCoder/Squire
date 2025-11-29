/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.dagannothkings.SquireDagannothKings;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting")
public class aj
extends Task {
    private static /* synthetic */ int[] llIllII;
    private static /* synthetic */ String[] llIlIll;
    private final /* synthetic */ SquireDagannothKings cO;

    public boolean run() {
        aj lllIlIIIlIIIIll;
        if (aj.llIllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIllII[0];
        }
        Iterator<aH> lllIlIIIlIIIIlI = lllIlIIIlIIIIll.cO.p().iterator();
        while (aj.llIllIlll(lllIlIIIlIIIIlI.hasNext() ? 1 : 0)) {
            aH lllIlIIIlIIIIIl = lllIlIIIlIIIIlI.next();
            int[] nArray = new int[llIllII[1]];
            nArray[aj.llIllII[0]] = lllIlIIIlIIIIIl.P();
            TileItem lllIlIIIlIIIIII = TileItems.getFirstAt((WorldPoint)lllIlIIIlIIIIIl.cd(), (int[])nArray);
            if (aj.llIlllIII(lllIlIIIlIIIIII)) {
                if (aj.llIlllIIl(Inventory.isFull() ? 1 : 0)) {
                    lllIlIIIlIIIIII.interact(llIlIll[llIllII[0]]);
                }
                if (aj.llIllIlll(Inventory.isFull() ? 1 : 0)) {
                    Item lllIlIIIIllllll;
                    if (aj.llIllIlll(lllIlIIIlIIIIII.isStackable() ? 1 : 0)) {
                        int[] nArray2 = new int[llIllII[1]];
                        nArray2[aj.llIllII[0]] = lllIlIIIlIIIIII.getId();
                        if (aj.llIllIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                            lllIlIIIlIIIIII.interact(llIlIll[llIllII[1]]);
                        }
                    }
                    if (aj.llIlllIlI(lllIlIIIIllllll = Inventory.getFirst(item -> {
                        String[] stringArray = new String[llIllII[1]];
                        stringArray[aj.llIllII[0]] = llIlIll[llIllII[3]];
                        return item.hasAction(stringArray);
                    }))) {
                        return llIllII[0];
                    }
                    lllIlIIIIllllll.interact(llIlIll[llIllII[2]]);
                    return llIllII[1];
                }
            }
            "".length();
            if ("   ".length() != 0) continue;
            return ((0x29 ^ 0) & ~(0x67 ^ 0x4E)) != 0;
        }
        return llIllII[1];
    }

    private static String llIllIIll(String lllIlIIIIllIlII, String lllIlIIIIllIIll) {
        lllIlIIIIllIlII = new String(Base64.getDecoder().decode(lllIlIIIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIIIllIIlI = new StringBuilder();
        char[] lllIlIIIIllIIIl = lllIlIIIIllIIll.toCharArray();
        int lllIlIIIIllIIII = llIllII[0];
        char[] lllIlIIIIlIlIlI = lllIlIIIIllIlII.toCharArray();
        int lllIlIIIIlIlIIl = lllIlIIIIlIlIlI.length;
        int lllIlIIIIlIlIII = llIllII[0];
        while (aj.llIlllIll(lllIlIIIIlIlIII, lllIlIIIIlIlIIl)) {
            char lllIlIIIIllIlIl = lllIlIIIIlIlIlI[lllIlIIIIlIlIII];
            lllIlIIIIllIIlI.append((char)(lllIlIIIIllIlIl ^ lllIlIIIIllIIIl[lllIlIIIIllIIII % lllIlIIIIllIIIl.length]));
            "".length();
            ++lllIlIIIIllIIII;
            ++lllIlIIIIlIlIII;
            "".length();
            if ((0x43 ^ 0x47) >= (0x3A ^ 0x3E)) continue;
            return null;
        }
        return String.valueOf(lllIlIIIIllIIlI);
    }

    private static void llIllIlIl() {
        llIlIll = new String[llIllII[4]];
        aj.llIlIll[aj.llIllII[0]] = aj.llIllIIlI("/LmV/+Cr7M0=", "RiGWK");
        aj.llIlIll[aj.llIllII[1]] = aj.llIllIIll("GikhLQ==", "NHJHA");
        aj.llIlIll[aj.llIllII[2]] = aj.llIllIIll("NTcm", "pVRbs");
        aj.llIlIll[aj.llIllII[3]] = aj.llIllIlII("GwgYIQ5NhfE=", "yBRmi");
    }

    private static boolean llIllIlll(int n2) {
        return n2 != 0;
    }

    private static void llIllIllI() {
        llIllII = new int[6];
        aj.llIllII[0] = (0xDE ^ 0xAE ^ (0x5B ^ 0x74)) & (0xEB ^ 0xB6 ^ "  ".length() ^ -" ".length());
        aj.llIllII[1] = " ".length();
        aj.llIllII[2] = "  ".length();
        aj.llIllII[3] = "   ".length();
        aj.llIllII[4] = 0x14 ^ 0x10;
        aj.llIllII[5] = 0x78 ^ 0x70;
    }

    @Inject
    public aj(SquireDagannothKings squireDagannothKings) {
        this.cO = squireDagannothKings;
    }

    private static boolean llIlllIIl(int n2) {
        return n2 == 0;
    }

    static {
        aj.llIllIllI();
        aj.llIllIlIl();
    }

    private static boolean llIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlllIlI(Object object) {
        return object == null;
    }

    private static boolean llIlllIII(Object object) {
        return object != null;
    }

    private static String llIllIlII(String lllIlIIIIIlllIl, String lllIlIIIIIllllI) {
        try {
            SecretKeySpec lllIlIIIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIIIIllllI.getBytes(StandardCharsets.UTF_8)), llIllII[5]), "DES");
            Cipher lllIlIIIIlIIIIl = Cipher.getInstance("DES");
            lllIlIIIIlIIIIl.init(llIllII[2], lllIlIIIIlIIIlI);
            return new String(lllIlIIIIlIIIIl.doFinal(Base64.getDecoder().decode(lllIlIIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIIIlIIIII) {
            lllIlIIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static String llIllIIlI(String lllIlIIIIIlIIII, String lllIlIIIIIlIIIl) {
        try {
            SecretKeySpec lllIlIIIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIIIIlIlII = Cipher.getInstance("Blowfish");
            lllIlIIIIIlIlII.init(llIllII[2], lllIlIIIIIlIlIl);
            return new String(lllIlIIIIIlIlII.doFinal(Base64.getDecoder().decode(lllIlIIIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIIIIlIIll) {
            lllIlIIIIIlIIll.printStackTrace();
            return null;
        }
    }
}

