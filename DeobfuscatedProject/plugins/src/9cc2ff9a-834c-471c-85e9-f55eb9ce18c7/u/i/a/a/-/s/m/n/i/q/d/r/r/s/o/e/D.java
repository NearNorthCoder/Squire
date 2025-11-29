/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.b;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.d;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

@TaskDesc(name="Looting Items", priority=5, blocking=true)
public class D
extends Task {
    private final /* synthetic */ b aG;
    private static /* synthetic */ int[] lIIlIlIIlIIII;
    private final /* synthetic */ SquireSaraConfig aH;
    private final /* synthetic */ d aF;
    private final /* synthetic */ g aE;
    private static /* synthetic */ String[] lIIlIlIIIlIIl;

    private static boolean lIlIlIllIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIllIlIllll(Object object) {
        return object == null;
    }

    private static String lIlIlIllIIIllII(String llllllllllllllIlllllIIIIIllIIlIl, String llllllllllllllIlllllIIIIIllIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllllIIIIIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIIIIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIIIIllIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIIIIllIIlll.init(lIIlIlIIlIIII[4], llllllllllllllIlllllIIIIIllIlIII);
            return new String(llllllllllllllIlllllIIIIIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIIIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIIIIllIIllI) {
            llllllllllllllIlllllIIIIIllIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIlIlllI(int n2) {
        return n2 == 0;
    }

    static {
        D.lIlIlIllIlIllIl();
        D.lIlIlIllIlIllII();
    }

    private static void lIlIlIllIlIllII() {
        lIIlIlIIIlIIl = new String[lIIlIlIIlIIII[9]];
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[0]] = D.lIlIlIllIIIllII("T7dPMt9X7zdqORnilJ2DXw==", "nOLYf");
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[2]] = D.lIlIlIllIIIllII("IwUA+qL8QwA=", "wlhIL");
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[4]] = D.lIlIlIllIIIllII("tqBc+Sym5f0=", "TsXDk");
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[5]] = D.lIlIlIllIIIllII("aYrl+cnbtio=", "eXxbG");
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[6]] = D.lIlIlIllIIIllII("wwG8wh5xq+8=", "VhVsh");
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[7]] = D.lIlIlIllIIIllII("iry1Eb59HVc=", "WiWCA");
        D.lIIlIlIIIlIIl[D.lIIlIlIIlIIII[8]] = D.lIlIlIllIIIllII("+rBNSWpo3k4=", "VFFHE");
    }

    /*
     * WARNING - void declaration
     */
    private TileItem W() {
        TileItem tileItem2 = this.aF.i().orElse(null);
        if (D.lIlIlIllIllIIll(tileItem2) && D.lIlIlIllIllIlII(this.aF.a(tileItem2), lIIlIlIIlIIII[1])) {
            void llllllllllllllIlllllIIIIIlllIIII;
            return llllllllllllllIlllllIIIIIlllIIII;
        }
        TileItem llllllllllllllIlllllIIIIIllIllll = TileItems.getNearest(tileItem -> {
            int n2;
            if (D.lIlIlIllIllIIIl(tileItem.getName().toLowerCase().contains(lIIlIlIIIlIIl[lIIlIlIIlIIII[8]]) ? 1 : 0) && D.lIlIlIllIllIIIl(Reachable.isInteractable((Locatable)tileItem) ? 1 : 0)) {
                n2 = lIIlIlIIlIIII[2];
                "".length();
                if ("  ".length() == 0) {
                    return ((0x29 ^ 0x1C ^ (0x74 ^ 4)) & (0x24 ^ 0x43 ^ (0x13 ^ 0x31) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIIlIlIIlIIII[0];
            }
            return n2 != 0;
        });
        if (D.lIlIlIllIllIIll(llllllllllllllIlllllIIIIIllIllll) && D.lIlIlIllIllIlIl(Combat.getMissingHealth())) {
            return llllllllllllllIlllllIIIIIllIllll;
        }
        return tileItem2;
    }

    private static boolean lIlIlIllIllIlIl(int n2) {
        return n2 > 0;
    }

    @Inject
    public D(g g2, d d2, b b2, SquireSaraConfig squireSaraConfig) {
        this.aE = g2;
        this.aF = d2;
        this.aG = b2;
        this.aH = squireSaraConfig;
    }

    private static boolean lIlIlIllIllIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlIlIllIlIllIl() {
        lIIlIlIIlIIII = new int[10];
        D.lIIlIlIIlIIII[0] = (0x78 ^ 0x20) & ~(0x13 ^ 0x4B);
        D.lIIlIlIIlIIII[1] = 0xFFFFFFFE & Integer.MAX_VALUE;
        D.lIIlIlIIlIIII[2] = " ".length();
        D.lIIlIlIIlIIII[3] = 0x8D ^ 0x87;
        D.lIIlIlIIlIIII[4] = "  ".length();
        D.lIIlIlIIlIIII[5] = "   ".length();
        D.lIIlIlIIlIIII[6] = 0xB6 ^ 0xB2;
        D.lIIlIlIIlIIII[7] = 0x40 ^ 0x45;
        D.lIIlIlIIlIIII[8] = 21 + 50 - -4 + 66 ^ 94 + 78 - 154 + 121;
        D.lIIlIlIIlIIII[9] = 0xB7 ^ 0xB0;
    }

    private static boolean lIlIlIllIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        int llllllllllllllIlllllIIIIIllllIII;
        int n2;
        D llllllllllllllIlllllIIIIIllllIlI;
        if (D.lIlIlIllIlIlllI(this.aE.m() ? 1 : 0)) {
            return lIIlIlIIlIIII[0];
        }
        TileItem llllllllllllllIlllllIIIIIllllIIl = llllllllllllllIlllllIIIIIllllIlI.W();
        if (D.lIlIlIllIlIllll(llllllllllllllIlllllIIIIIllllIIl)) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIII(llllllllllllllIlllllIIIIIllllIlI.aF.a(llllllllllllllIlllllIIIIIllllIIl), lIIlIlIIlIIII[1])) {
            n2 = lIIlIlIIlIIII[2];
            "".length();
            if (" ".length() == -" ".length()) {
                return ((0xE ^ 0x18) & ~(0xA2 ^ 0xB4)) != 0;
            }
        } else {
            n2 = llllllllllllllIlllllIIIIIllllIII = lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(llllllllllllllIlllllIIIIIllllIlI.aE.l() ? 1 : 0) && D.lIlIlIllIllIIIl(llllllllllllllIlllllIIIIIllllIII)) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(llllllllllllllIlllllIIIIIllllIII) && (!D.lIlIlIllIlIlllI(llllllllllllllIlllllIIIIIllllIlI.aE.o() ? 1 : 0) || D.lIlIlIllIllIIIl(Players.getLocal().isMoving() ? 1 : 0))) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(llllllllllllllIlllllIIIIIllllIII) && D.lIlIlIllIllIIlI(llllllllllllllIlllllIIIIIllllIlI.aE.k(), lIIlIlIIlIIII[3])) {
            return lIIlIlIIlIIII[0];
        }
        if (D.lIlIlIllIllIIIl(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lIIlIlIIlIIII[2]];
            nArray[D.lIIlIlIIlIIII[0]] = llllllllllllllIlllllIIIIIllllIIl.getId();
            if (!D.lIlIlIllIllIIIl(Inventory.contains((int[])nArray) ? 1 : 0) || D.lIlIlIllIlIlllI(llllllllllllllIlllllIIIIIllllIIl.isStackable() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlIIlIIII[2]];
                stringArray[D.lIIlIlIIlIIII[0]] = lIIlIlIIIlIIl[lIIlIlIIlIIII[0]];
                Item llllllllllllllIlllllIIIIIlllIlll = Inventory.getFirst((String[])stringArray);
                if (D.lIlIlIllIllIIll(llllllllllllllIlllllIIIIIlllIlll)) {
                    llllllllllllllIlllllIIIIIlllIlll.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[2]]);
                    return lIIlIlIIlIIII[2];
                }
                Item llllllllllllllIlllllIIIIIlllIllI = llllllllllllllIlllllIIIIIllllIlI.aG.g();
                if (D.lIlIlIllIllIIll(llllllllllllllIlllllIIIIIlllIllI)) {
                    if (D.lIlIlIllIllIIIl(llllllllllllllIlllllIIIIIlllIllI.hasAction(lIIlIlIIIlIIl[lIIlIlIIlIIII[4]]::equals) ? 1 : 0)) {
                        return lIIlIlIIlIIII[0];
                    }
                    llllllllllllllIlllllIIIIIlllIllI.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[5]]);
                    return lIIlIlIIlIIII[2];
                }
                Item llllllllllllllIlllllIIIIIlllIlIl = llllllllllllllIlllllIIIIIllllIlI.aF.j().orElse(null);
                if (D.lIlIlIllIlIllll(llllllllllllllIlllllIIIIIlllIlIl)) {
                    return lIIlIlIIlIIII[0];
                }
                if (D.lIlIlIllIlIlllI(llllllllllllllIlllllIIIIIllllIlI.aF.a(llllllllllllllIlllllIIIIIlllIlIl, llllllllllllllIlllllIIIIIllllIIl) ? 1 : 0)) {
                    return lIIlIlIIlIIII[0];
                }
                llllllllllllllIlllllIIIIIlllIlIl.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[6]]);
            }
        }
        if (D.lIlIlIllIllIIIl(Movement.isRunEnabled() ? 1 : 0) && D.lIlIlIllIllIIIl(llllllllllllllIlllllIIIIIllllIlI.aH.turnOffRun() ? 1 : 0)) {
            Movement.toggleRun();
        }
        var1_1.interact(lIIlIlIIIlIIl[lIIlIlIIlIIII[7]]);
        this.sleep(lIIlIlIIlIIII[2]);
        return lIIlIlIIlIIII[2];
    }

    private static boolean lIlIlIllIllIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIllIIll(Object object) {
        return object != null;
    }
}

