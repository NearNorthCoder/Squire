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
package gg.squire.fishing.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.fishing.SquireFisherConfig;
import gg.squire.fishing.SquireFisherPlugin;
import gg.squire.fishing.tasks.GameEnum;
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
public class TickManipulatingTask
extends Task {
    private final  SquireFisherConfig V;
    
    private final  int[] Y;
    private final  SquireFisherPlugin U;
    private final  int[] X;
    
    private final  int[] W;

    private static boolean lllIlIlllIIIII(Object object) {
        return object != null;
    }

    private static boolean lllIlIllIllllI(int n, int n2) {
        return n != n2;
    }

    private static boolean lllIlIllIlllll(int n, int n2) {
        return n == n2;
    }

        return String.valueOf(var1);
    }

    private static void lllIlIllIlIlll() {
        lIlllIlIlllI = new String[lIlllIlIllll[25]];
        m.lIlllIlIlllI[m.lIlllIlIllll[1]] = "Clean";
        m.lIlllIlIlllI[m.lIlllIlIllll[3]] = "We are missing a teak tick item.";
        m.lIlllIlIlllI[m.lIlllIlIllll[5]] = "We are missing a herb tick item.";
        m.lIlllIlIlllI[m.lIlllIlIllll[7]] = "Eat";
        m.lIlllIlIlllI[m.lIlllIlIllll[0]] = "Roe";
        m.lIlllIlIlllI[m.lIlllIlIllll[23]] = "Caviar";
        m.lIlllIlIlllI[m.lIlllIlIllll[24]] = "Leaping";
    }

    static {
        m.lllIlIllIllIII();
        m.lllIlIllIlIlll();
    }

    @Inject
    public TickManipulatingTask(SquireFisherPlugin squireFisherPlugin, SquireFisherConfig squireFisherConfig) {
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

                if (3 <= 3) return n != 0;
                return false;
            }
        }
        n = lIlllIlIllll[1];
        return n != 0;
    }

    public boolean run() {
        m var2;
        if (m.lllIlIllIllIIl((Object)this.V.fish(), (Object)f.FLY_FISHING) && m.lllIlIllIllIIl((Object)this.V.fish(), (Object)f.BARBARIAN_FISHING)) {
            return lIlllIlIllll[1];
        }
        if (m.lllIlIllIllIlI(var2.V.tickFishing() ? 1 : 0)) {
            return lIlllIlIllll[1];
        }
        if (m.lllIlIllIllIll(Inventory.isFull() ? 1 : 0)) {
            return lIlllIlIllll[1];
        }
        if (m.lllIlIllIllIll(Bank.isOpen() ? 1 : 0)) {
            return lIlllIlIllll[1];
        }
        if (m.lllIlIllIllIlI(Inventory.contains((int[])var2.X) ? 1 : 0) && m.lllIlIllIllIll(Inventory.contains((int[])var2.W) ? 1 : 0)) {
            Inventory.getFirst((int[])var2.W).interact(lIlllIlIlllI[lIlllIlIllll[1]]);
            return lIlllIlIllll[3];
        }
        if (m.lllIlIllIllIlI(var2.r() ? 1 : 0) && m.lllIlIllIllIlI(var2.q() ? 1 : 0)) {
            if (m.lllIlIllIllIlI(var2.r() ? 1 : 0)) {
                System.out.println(lIlllIlIlllI[lIlllIlIllll[3]]);
            }
            if (m.lllIlIllIllIlI(var2.q() ? 1 : 0)) {
                System.out.println(lIlllIlIlllI[lIlllIlIllll[5]]);
            }
            return lIlllIlIllll[1];
        }
        int var3 = Players.getLocal().getAnimation();
        NPC var4 = NPCs.getNearest(nPC -> nPC.hasAction(this.V.fish().n()));
        if (m.lllIlIllIlllII(var4)) {
            return lIlllIlIllll[1];
        }
        if (m.lllIlIllIlllIl(var4.distanceTo((Locatable)Players.getLocal()), lIlllIlIllll[0])) {
            return lIlllIlIllll[1];
        }
        if (!m.lllIlIllIllllI(var3, lIlllIlIllll[15]) || m.lllIlIllIlllll(var3, lIlllIlIllll[16])) {
            if (m.lllIlIllIllIll(var2.V.cutEat() ? 1 : 0)) {
                Item var5 = Inventory.getFirst(item -> item.getName().contains(lIlllIlIlllI[lIlllIlIllll[24]]));
                Item var6 = Inventory.getFirst(item -> {
                    int n;
                    if (!m.lllIlIllIllIlI(item.getName().equals(lIlllIlIlllI[lIlllIlIllll[0]]) ? 1 : 0) || m.lllIlIllIllIll(item.getName().equals(lIlllIlIlllI[lIlllIlIllll[23]]) ? 1 : 0)) {
                        n = lIlllIlIllll[3];

                        }
                    } else {
                        n = lIlllIlIllll[1];
                    }
                    return n != 0;
                });
                if (m.lllIlIlllIIIII(var5) && m.lllIlIlllIIIII(var6)) {
                    int[] nArray = new int[lIlllIlIllll[3]];
                    nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[17];
                    Inventory.getFirst((int[])nArray).useOn(var5);
                    var6.interact(lIlllIlIlllI[lIlllIlIllll[7]]);
                    return lIlllIlIllll[3];
                }
                if (m.lllIlIllIlllII(var6)) {
                    int[] nArray = new int[lIlllIlIllll[3]];
                    nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[17];
                    Inventory.getFirst((int[])nArray).useOn(var5);
                }
            }
            if (m.lllIlIllIllIll(var2.q() ? 1 : 0)) {
                int[] nArray = new int[lIlllIlIllll[3]];
                nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[18];
                Inventory.getFirst((int[])var2.X).useOn(Inventory.getFirst((int[])nArray));
                return lIlllIlIllll[3];
            }
            if (m.lllIlIllIllIll(var2.r() ? 1 : 0)) {
                int[] nArray = new int[lIlllIlIllll[3]];
                nArray[m.lIlllIlIllll[1]] = lIlllIlIllll[17];
                Inventory.getFirst((int[])var2.Y).useOn(Inventory.getFirst((int[])nArray));
                return lIlllIlIllll[3];
            }
        }
        if (!m.lllIlIllIllllI(var3, lIlllIlIllll[19]) || m.lllIlIllIlllll(var3, lIlllIlIllll[20])) {
            var4.interact(var2.V.fish().n());
            var2.sleep(lIlllIlIllll[5]);
            return lIlllIlIllll[3];
        }
        return lIlllIlIllll[1];
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

