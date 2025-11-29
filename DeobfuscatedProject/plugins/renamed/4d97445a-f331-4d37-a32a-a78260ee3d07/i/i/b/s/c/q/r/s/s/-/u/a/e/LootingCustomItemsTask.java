/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.loot.LooterConfig;
import gg.squire.basics.loot.SquireLooter;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;

/* TASK: Looting custom items -> LootingcustomitemsTask */
@TaskDesc(name="Looting custom items")
public class LootingCustomItemsTask
extends Task {
    private static /* synthetic */ String[] lllllIll;
    private final /* synthetic */ SquireLooter eA;
    private final /* synthetic */ LooterConfig eB;
    private static /* synthetic */ int[] llllllII;

    private static String llIlllIIlI(String llIIllllllIIIll, String llIIllllllIIlII) {
        try {
            SecretKeySpec llIIllllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIllllllIIlII.getBytes(StandardCharsets.UTF_8)), llllllII[6]), "DES");
            Cipher llIIllllllIIlll = Cipher.getInstance("DES");
            llIIllllllIIlll.init(llllllII[2], llIIllllllIlIII);
            return new String(llIIllllllIIlll.doFinal(Base64.getDecoder().decode(llIIllllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIllllllIIllI) {
            llIIllllllIIllI.printStackTrace();
            return null;
        }
    }

    static {
        aL.llIlllIlIl();
        aL.llIlllIlII();
    }

    private static boolean llIllllIII(Object object) {
        return object == null;
    }

    private static String llIlllIIIl(String llIIlllllIIIIll, String llIIlllllIIIIlI) {
        llIIlllllIIIIll = new String(Base64.getDecoder().decode(llIIlllllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIlllllIIIllI = new StringBuilder();
        char[] llIIlllllIIIlIl = llIIlllllIIIIlI.toCharArray();
        int llIIlllllIIIlII = llllllII[0];
        char[] llIIllllIlllllI = llIIlllllIIIIll.toCharArray();
        int llIIllllIllllIl = llIIllllIlllllI.length;
        int llIIllllIllllII = llllllII[0];
        while (aL.llIllllIlI(llIIllllIllllII, llIIllllIllllIl)) {
            char llIIlllllIIlIIl = llIIllllIlllllI[llIIllllIllllII];
            llIIlllllIIIllI.append((char)(llIIlllllIIlIIl ^ llIIlllllIIIlIl[llIIlllllIIIlII % llIIlllllIIIlIl.length]));
            0;
            ++llIIlllllIIIlII;
            ++llIIllllIllllII;
            0;
            
            return null;
        }
        return String.valueOf(llIIlllllIIIllI);
    }

    private static boolean llIlllIlll(int n2) {
        return n2 == 0;
    }

    @Inject
    public aL(SquireLooter squireLooter, LooterConfig looterConfig) {
        this.eA = squireLooter;
        this.eB = looterConfig;
    }

    private static boolean llIllllIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIlllIlII() {
        lllllIll = new String[llllllII[5]];
        aL.lllllIll[aL.llllllII[0]] = aL."Take";
        aL.lllllIll[aL.llllllII[1]] = aL."Eat";
        aL.lllllIll[aL.llllllII[2]] = aL."Take";
        aL.lllllIll[aL.llllllII[3]] = aL.",";
        aL.lllllIll[aL.llllllII[4]] = aL."Eat";
    }

    private static String llIlllIIll(String llIIlllllIlIllI, String llIIlllllIlIlIl) {
        try {
            SecretKeySpec llIIlllllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIlllllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIlllllIllIlI = Cipher.getInstance("Blowfish");
            llIIlllllIllIlI.init(llllllII[2], llIIlllllIllIll);
            return new String(llIIlllllIllIlI.doFinal(Base64.getDecoder().decode(llIIlllllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIlllllIllIIl) {
            llIIlllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlllIlIl() {
        llllllII = new int[7];
        aL.llllllII[0] = 1 & ~1;
        aL.llllllII[1] = 1;
        aL.llllllII[2] = 2;
        aL.llllllII[3] = 3;
        aL.llllllII[4] = 64 + 19 - -52 + 26 ^ 81 + 149 - 192 + 127;
        aL.llllllII[5] = 0xBB ^ 0xBE;
        aL.llllllII[6] = 25 + 15 - 27 + 114 ^ (0x74 ^ 3);
    }

    private static boolean llIlllIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIllllIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    private int[] ce() {
        void var2_2;
        aL llIIlllllllIlII;
        if (aL.llIlllIllI(this.eB.custom().isEmpty() ? 1 : 0)) {
            return new int[llllllII[0]];
        }
        String[] llIIlllllllIIll = llIIlllllllIlII.eB.custom().split(lllllIll[llllllII[3]]);
        int[] llIIlllllllIIlI = new int[llIIlllllllIIll.length];
        int llIIlllllllIIIl = llllllII[0];
        while (aL.llIllllIlI(llIIlllllllIIIl, llIIlllllllIIll.length)) {
            llIIlllllllIIlI[llIIlllllllIIIl] = Integer.parseInt(llIIlllllllIIll[llIIlllllllIIIl].trim());
            ++llIIlllllllIIIl;
            0;
            if ((0x19 ^ 0x1D) != 1) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean y(int n2) {
        void llIIllllllllIll;
        int[] nArray = this.ce();
        int n3 = nArray.length;
        int llIIllllllllIlI = llllllII[0];
        while (aL.llIllllIlI(llIIllllllllIlI, (int)llIIllllllllIll)) {
            void llIIlllllllllIl;
            void llIIlllllllllII;
            void llIIllllllllIIl = llIIlllllllllII[llIIllllllllIlI];
            if (aL.llIllllIll((int)llIIllllllllIIl, (int)llIIlllllllllIl)) {
                return llllllII[1];
            }
            ++llIIllllllllIlI;
            0;
            if (1 > 0) continue;
            return ((3 ^ (0x8D ^ 0xAD)) & (127 + 4 - 109 + 127 ^ 121 + 46 - 10 + 25 ^ -1)) != 0;
        }
        return llllllII[0];
    }

    public boolean run() {
        Iterator<aH> llIlIIIIIIIlIII = this.eA.p().iterator();
        while (aL.llIlllIllI(llIlIIIIIIIlIII.hasNext() ? 1 : 0)) {
            aL llIlIIIIIIIlIIl;
            aH llIlIIIIIIIIlll = llIlIIIIIIIlIII.next();
            if (aL.llIlllIlll(llIlIIIIIIIlIIl.y(llIlIIIIIIIIlll.P()) ? 1 : 0)) {
                0;
                
                return false;
            }
            TileItem llIlIIIIIIIIllI = TileItems.getNearest(tileItem -> {
                int n2;
                if (aL.llIllllIll(tileItem.getId(), llIlIIIIIIIIlll.P()) && aL.llIlllIllI(tileItem.getWorldLocation().equals((Object)llIlIIIIIIIIlll.cd()) ? 1 : 0)) {
                    n2 = llllllII[1];
                    0;
                    if (-1 >= 3) {
                        return ((0x7D ^ 3 ^ (0xEB ^ 0x80)) & (0xB3 ^ 0xAC ^ (0xAF ^ 0xA5) ^ -1)) != 0;
                    }
                } else {
                    n2 = llllllII[0];
                }
                return n2 != 0;
            });
            if (aL.llIllllIII(llIlIIIIIIIIllI)) {
                return llllllII[0];
            }
            if (aL.llIllllIIl(llIlIIIIIIIIllI.distanceTo(Players.getLocal().getWorldLocation()), llIlIIIIIIIlIIl.eB.lootRange())) {
                return llllllII[0];
            }
            if (aL.llIlllIllI(Inventory.isFull() ? 1 : 0)) {
                Item llIlIIIIIIIIlIl;
                if (aL.llIlllIllI(llIlIIIIIIIIllI.isStackable() ? 1 : 0)) {
                    int[] nArray = new int[llllllII[1]];
                    nArray[aL.llllllII[0]] = llIlIIIIIIIIllI.getId();
                    if (aL.llIlllIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        llIlIIIIIIIIllI.interact(lllllIll[llllllII[0]]);
                    }
                }
                if (aL.llIllllIII(llIlIIIIIIIIlIl = Inventory.getFirst(item -> {
                    String[] stringArray = new String[llllllII[1]];
                    stringArray[aL.llllllII[0]] = lllllIll[llllllII[4]];
                    return item.hasAction(stringArray);
                }))) {
                    return llllllII[0];
                }
                llIlIIIIIIIIlIl.interact(lllllIll[llllllII[1]]);
                return llllllII[1];
            }
            llIlIIIIIIIIllI.interact(lllllIll[llllllII[2]]);
            System.out.println("[SQUIRE] - Item Price: " + Prices.getItemPrice((int)llIlIIIIIIIIllI.getId()) * llIlIIIIIIIIllI.getQuantity() + " : Item Name " + llIlIIIIIIIIllI.getName());
            return llllllII[1];
        }
        return llllllII[0];
    }
}

