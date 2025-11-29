/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package i.i.-.h.u.s.e.r.q.r.s.f.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import i.i.-.h.u.s.e.r.q.r.s.f.e.f;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Tick Manipulating", priority=50)
public class m
extends Task {
    private final /* synthetic */ SquireFisherConfig V;
    private static /* synthetic */ String[] lIlllIlIlllI;
    private final /* synthetic */ int[] Y;
    private final /* synthetic */ SquireFisherPlugin U;
    private final /* synthetic */ int[] X;
    private static /* synthetic */ int[] lIlllIlIllll;
    private final /* synthetic */ int[] W;

    private static boolean lllIlIlllIIIII(Object object) {
        return object != null;
    }

    private static boolean lllIlIllIllllI(int n, int n2) {
        return n != n2;
    }

    private static boolean lllIlIllIlllll(int n, int n2) {
        return n == n2;
    }

    private static String lllIlIllIlIllI(String lllllllllllllllIlIlllIlIllllllIl, String lllllllllllllllIlIlllIlIllllllII) {
        lllllllllllllllIlIlllIlIllllllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIllllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIllIIIIIIII = new StringBuilder();
        char[] lllllllllllllllIlIlllIlIllllllll = lllllllllllllllIlIlllIlIllllllII.toCharArray();
        int lllllllllllllllIlIlllIlIlllllllI = lIlllIlIllll[1];
        char[] lllllllllllllllIlIlllIlIlllllIII = lllllllllllllllIlIlllIlIllllllIl.toCharArray();
        int lllllllllllllllIlIlllIlIllllIlll = lllllllllllllllIlIlllIlIlllllIII.length;
        int lllllllllllllllIlIlllIlIllllIllI = lIlllIlIllll[1];
        while (m.lllIlIlllIIIIl(lllllllllllllllIlIlllIlIllllIllI, lllllllllllllllIlIlllIlIllllIlll)) {
            char lllllllllllllllIlIlllIllIIIIIIll = lllllllllllllllIlIlllIlIlllllIII[lllllllllllllllIlIlllIlIllllIllI];
            lllllllllllllllIlIlllIllIIIIIIII.append((char)(lllllllllllllllIlIlllIllIIIIIIll ^ lllllllllllllllIlIlllIlIllllllll[lllllllllllllllIlIlllIlIlllllllI % lllllllllllllllIlIlllIlIllllllll.length]));
            0;
            ++lllllllllllllllIlIlllIlIlllllllI;
            ++lllllllllllllllIlIlllIlIllllIllI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlllIllIIIIIIII);
    }

    private static void lllIlIllIlIlll() {
        lIlllIlIlllI = new String[lIlllIlIllll[25]];
        m.lIlllIlIlllI[m.lIlllIlIllll[1]] = m."Clean";
        m.lIlllIlIlllI[m.lIlllIlIllll[3]] = m."We are missing a teak tick item.";
        m.lIlllIlIlllI[m.lIlllIlIllll[5]] = m."We are missing a herb tick item.";
        m.lIlllIlIlllI[m.lIlllIlIllll[7]] = m."Eat";
        m.lIlllIlIlllI[m.lIlllIlIllll[0]] = m."Roe";
        m.lIlllIlIlllI[m.lIlllIlIllll[23]] = m."Caviar";
        m.lIlllIlIlllI[m.lIlllIlIllll[24]] = m."Leaping";
    }

    static {
        m.lllIlIllIllIII();
        m.lllIlIllIlIlll();
    }

    @Inject
    public m(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
        int[] nArray = new int[lIlllIlIllll[0]];
        nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[2];
        nArray[m.lIlllIlIllll[3]] = lIlllIlIllll[4];
        nArray[m.lIlllIlIllll[5]] = lIlllIlIllll[6];
        nArray[m.lIlllIlIllll[7]] = lIlllIlIllll[8];
        this.W = nArray;
        int[] nArray2 = new int[lIlllIlIllll[0]];
        nArray2[m.lIlllIlIllll[1]] = lIlllIlIllll[9];
        nArray2[m.lIlllIlIllll[3]] = lIlllIlIllll[10];
        nArray2[m.lIlllIlIllll[5]] = lIlllIlIllll[11];
        nArray2[m.lIlllIlIllll[7]] = lIlllIlIllll[12];
        this.X = nArray2;
        int[] nArray3 = new int[lIlllIlIllll[5]];
        nArray3[m.lIlllIlIllll[1]] = lIlllIlIllll[13];
        nArray3[m.lIlllIlIllll[3]] = lIlllIlIllll[14];
        this.Y = nArray3;
        this.U = squireFisherPlugin;
        this.V = squireFisherConfig;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean r() {
        int n;
        if (m.lllIlIllIllIll(Inventory.contains((int[])this.Y) ? 1 : 0)) {
            int[] nArray = new int[lIlllIlIllll[3]];
            nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[17];
            if (m.lllIlIllIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n = lIlllIlIllll[3];
                0;
                if (3 <= 3) return n != 0;
                return ((0xEA ^ 0x89) & ~(0xF2 ^ 0x91)) != 0;
            }
        }
        n = lIlllIlIllll[1];
        return n != 0;
    }

    public boolean run() {
        m lllllllllllllllIlIlllIllIIIlIlll;
        if (m.lllIlIllIllIIl((Object)this.V.fish(), (Object)f.FLY_FISHING) && m.lllIlIllIllIIl((Object)this.V.fish(), (Object)f.BARBARIAN_FISHING)) {
            return lIlllIlIllll[1];
        }
        if (m.lllIlIllIllIlI(lllllllllllllllIlIlllIllIIIlIlll.V.tickFishing() ? 1 : 0)) {
            return lIlllIlIllll[1];
        }
        if (m.lllIlIllIllIll(Inventory.isFull() ? 1 : 0)) {
            return lIlllIlIllll[1];
        }
        if (m.lllIlIllIllIll(Bank.isOpen() ? 1 : 0)) {
            return lIlllIlIllll[1];
        }
        if (m.lllIlIllIllIlI(Inventory.contains((int[])lllllllllllllllIlIlllIllIIIlIlll.X) ? 1 : 0) && m.lllIlIllIllIll(Inventory.contains((int[])lllllllllllllllIlIlllIllIIIlIlll.W) ? 1 : 0)) {
            Inventory.getFirst((int[])lllllllllllllllIlIlllIllIIIlIlll.W).interact(lIlllIlIlllI[lIlllIlIllll[1]]);
            return lIlllIlIllll[3];
        }
        if (m.lllIlIllIllIlI(lllllllllllllllIlIlllIllIIIlIlll.r() ? 1 : 0) && m.lllIlIllIllIlI(lllllllllllllllIlIlllIllIIIlIlll.q() ? 1 : 0)) {
            if (m.lllIlIllIllIlI(lllllllllllllllIlIlllIllIIIlIlll.r() ? 1 : 0)) {
                System.out.println(lIlllIlIlllI[lIlllIlIllll[3]]);
            }
            if (m.lllIlIllIllIlI(lllllllllllllllIlIlllIllIIIlIlll.q() ? 1 : 0)) {
                System.out.println(lIlllIlIlllI[lIlllIlIllll[5]]);
            }
            return lIlllIlIllll[1];
        }
        int lllllllllllllllIlIlllIllIIIlIllI = Players.getLocal().getAnimation();
        NPC lllllllllllllllIlIlllIllIIIlIlIl = NPCs.getNearest(nPC -> nPC.hasAction(this.V.fish().n()));
        if (m.lllIlIllIlllII(lllllllllllllllIlIlllIllIIIlIlIl)) {
            return lIlllIlIllll[1];
        }
        if (m.lllIlIllIlllIl(lllllllllllllllIlIlllIllIIIlIlIl.distanceTo((Locatable)Players.getLocal()), lIlllIlIllll[0])) {
            return lIlllIlIllll[1];
        }
        if (!m.lllIlIllIllllI(lllllllllllllllIlIlllIllIIIlIllI, lIlllIlIllll[15]) || m.lllIlIllIlllll(lllllllllllllllIlIlllIllIIIlIllI, lIlllIlIllll[16])) {
            if (m.lllIlIllIllIll(lllllllllllllllIlIlllIllIIIlIlll.V.cutEat() ? 1 : 0)) {
                Item lllllllllllllllIlIlllIllIIIlIlII = Inventory.getFirst(item -> item.getName().contains(lIlllIlIlllI[lIlllIlIllll[24]]));
                Item lllllllllllllllIlIlllIllIIIlIIll = Inventory.getFirst(item -> {
                    int n;
                    if (!m.lllIlIllIllIlI(item.getName().equals(lIlllIlIlllI[lIlllIlIllll[0]]) ? 1 : 0) || m.lllIlIllIllIll(item.getName().equals(lIlllIlIlllI[lIlllIlIllll[23]]) ? 1 : 0)) {
                        n = lIlllIlIllll[3];
                        0;
                        if (null != null) {
                            return ((80 + 51 - -40 + 20 ^ 29 + 60 - 3 + 75) & (0x54 ^ 3 ^ (0xD4 ^ 0x9D) ^ -1)) != 0;
                        }
                    } else {
                        n = lIlllIlIllll[1];
                    }
                    return n != 0;
                });
                if (m.lllIlIlllIIIII(lllllllllllllllIlIlllIllIIIlIlII) && m.lllIlIlllIIIII(lllllllllllllllIlIlllIllIIIlIIll)) {
                    int[] nArray = new int[lIlllIlIllll[3]];
                    nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[17];
                    Inventory.getFirst((int[])nArray).useOn(lllllllllllllllIlIlllIllIIIlIlII);
                    lllllllllllllllIlIlllIllIIIlIIll.interact(lIlllIlIlllI[lIlllIlIllll[7]]);
                    return lIlllIlIllll[3];
                }
                if (m.lllIlIllIlllII(lllllllllllllllIlIlllIllIIIlIIll)) {
                    int[] nArray = new int[lIlllIlIllll[3]];
                    nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[17];
                    Inventory.getFirst((int[])nArray).useOn(lllllllllllllllIlIlllIllIIIlIlII);
                }
            }
            if (m.lllIlIllIllIll(lllllllllllllllIlIlllIllIIIlIlll.q() ? 1 : 0)) {
                int[] nArray = new int[lIlllIlIllll[3]];
                nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[18];
                Inventory.getFirst((int[])lllllllllllllllIlIlllIllIIIlIlll.X).useOn(Inventory.getFirst((int[])nArray));
                return lIlllIlIllll[3];
            }
            if (m.lllIlIllIllIll(lllllllllllllllIlIlllIllIIIlIlll.r() ? 1 : 0)) {
                int[] nArray = new int[lIlllIlIllll[3]];
                nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[17];
                Inventory.getFirst((int[])lllllllllllllllIlIlllIllIIIlIlll.Y).useOn(Inventory.getFirst((int[])nArray));
                return lIlllIlIllll[3];
            }
        }
        if (!m.lllIlIllIllllI(lllllllllllllllIlIlllIllIIIlIllI, lIlllIlIllll[19]) || m.lllIlIllIlllll(lllllllllllllllIlIlllIllIIIlIllI, lIlllIlIllll[20])) {
            lllllllllllllllIlIlllIllIIIlIlIl.interact(lllllllllllllllIlIlllIllIIIlIlll.V.fish().n());
            lllllllllllllllIlIlllIllIIIlIlll.sleep(lIlllIlIllll[5]);
            return lIlllIlIllll[3];
        }
        return lIlllIlIllll[1];
    }

    private static void lllIlIllIllIII() {
        lIlllIlIllll = new int[26];
        m.lIlllIlIllll[0] = 102 + 130 - 145 + 108 ^ 98 + 28 - -31 + 42;
        m.lIlllIlIllll[1] = (0x7F ^ 0x73 ^ (0x80 ^ 0xC4)) & (186 + 120 - 159 + 50 ^ 4 + 19 - -53 + 65 ^ -1);
        m.lIlllIlIllll[2] = 35 + 149 - 117 + 132;
        m.lIlllIlIllll[3] = 1;
        m.lIlllIlIllll[4] = 3 + 5 - -15 + 178;
        m.lIlllIlIllll[5] = 2;
        m.lIlllIlIllll[6] = 112 + 129 - 177 + 139;
        m.lIlllIlIllll[7] = 3;
        m.lIlllIlIllll[8] = 20 + 39 - 32 + 178;
        m.lIlllIlIllll[9] = 51 + 79 - -42 + 77;
        m.lIlllIlIllll[10] = 27 + 219 - 213 + 218;
        m.lIlllIlIllll[11] = 116 + 52 - 77 + 54 + (133 + 54 - 40 + 73) - (0xFFFFC79F & 0x3979) + (66 + 60 - -16 + 27);
        m.lIlllIlIllll[12] = (0xDA ^ 0xB1) + (3 ^ 0x46) - (0x33 ^ 0x64) + (78 + 145 - 88 + 31);
        m.lIlllIlIllll[13] = 0xFFFFBABF & 0x5DFD;
        m.lIlllIlIllll[14] = 0xFFFFF8FD & 0x1FBE;
        m.lIlllIlIllll[15] = -(0xFFFFFD7E & 0x5BA3) & (0xFFFFFFE7 & 0x7DBF);
        m.lIlllIlIllll[16] = 0xFFFFAEFF & 0x536F;
        m.lIlllIlIllll[17] = -(0xFFFF991A & 0x7EEF) & (0xFFFFBFFB & 0x5BBF);
        m.lIlllIlIllll[18] = 0xFFFFBFB7 & 0x47DB;
        m.lIlllIlIllll[19] = -(0xFFFFCF7F & 0x3BD1) & (0xFFFFFFD1 & 0x1FFF);
        m.lIlllIlIllll[20] = -(0xFFFFFDCF & 0x2B3B) & (0xFFFFEFFB & 0x3DEE);
        m.lIlllIlIllll[21] = 0x31 ^ 0xC ^ (0x16 ^ 0x24);
        m.lIlllIlIllll[22] = (0x39 ^ 0x3C) + (0x26 ^ 0x13) - -(0x2C ^ 0xC) + (73 + 120 - 125 + 75);
        m.lIlllIlIllll[23] = 0x76 ^ 0x73;
        m.lIlllIlIllll[24] = 0x86 ^ 0x80;
        m.lIlllIlIllll[25] = 0x55 ^ 0x52;
    }

    private static boolean lllIlIlllIIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean lllIlIllIllIlI(int n) {
        return n == 0;
    }

    private static boolean lllIlIllIllIIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllIlIllIlllII(Object object) {
        return object == null;
    }

    private static String lllIlIllIlIlIl(String lllllllllllllllIlIlllIlIlllIllIl, String lllllllllllllllIlIlllIlIlllIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIlIllllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIlllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllIlIlllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllIlIlllIllll.init(lIlllIlIllll[5], lllllllllllllllIlIlllIlIllllIIII);
            return new String(lllllllllllllllIlIlllIlIlllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIlllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlllIlIlllIlllI) {
            lllllllllllllllIlIlllIlIlllIlllI.printStackTrace();
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean q() {
        int n;
        if (m.lllIlIllIllIll(Inventory.contains((int[])this.X) ? 1 : 0)) {
            int[] nArray = new int[lIlllIlIllll[3]];
            nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[18];
            if (m.lllIlIllIlllIl(Inventory.getCount((boolean)lIlllIlIllll[3], (int[])nArray), lIlllIlIllll[21])) {
                int[] nArray2 = new int[lIlllIlIllll[3]];
                nArray2[m.lIlllIlIllll[1]] = lIlllIlIllll[22];
                if (m.lllIlIllIllIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n = lIlllIlIllll[3];
                    0;
                    if ((0x6D ^ 0x44 ^ (0x13 ^ 0x3E)) != -1) return n != 0;
                    return ((0xA9 ^ 0xB9 ^ (0xD8 ^ 0x90)) & (57 + 162 - 129 + 140 ^ 74 + 122 - 118 + 112 ^ -1)) != 0;
                }
            }
        }
        n = lIlllIlIllll[1];
        return n != 0;
    }

    private static boolean lllIlIllIlllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lllIlIllIllIll(int n) {
        return n != 0;
    }
}

