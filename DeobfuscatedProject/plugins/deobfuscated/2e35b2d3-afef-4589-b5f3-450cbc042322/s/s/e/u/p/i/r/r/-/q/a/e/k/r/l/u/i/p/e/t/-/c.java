/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b;

@TaskDesc(name="Attacking")
public class c
extends Task {
    private static /* synthetic */ int[] lIlIIlIIllIII;
    private static /* synthetic */ String[] lIlIIlIIlIlIl;
    private final /* synthetic */ SquireSkipperConfig s;
    private final /* synthetic */ SquireSkipperPlugin r;

    @Inject
    public c(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.r = squireSkipperPlugin;
        this.s = squireSkipperConfig;
    }

    static {
        c.lIlllIlIlIIlIlI();
        c.lIlllIlIlIIlIIl();
    }

    private static String lIlllIlIIllllll(String llllllllllllllIllIlllIlIllIlllll, String llllllllllllllIllIlllIlIllIllllI) {
        try {
            SecretKeySpec llllllllllllllIllIlllIlIlllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlIllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlllIlIlllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlllIlIlllIIIll.init(lIlIIlIIllIII[2], llllllllllllllIllIlllIlIlllIIlII);
            return new String(llllllllllllllIllIlllIlIlllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIlIlllIIIlI) {
            llllllllllllllIllIlllIlIlllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlIIlllI(int n2) {
        return n2 == 0;
    }

    private static String lIlllIlIlIIIIIl(String llllllllllllllIllIlllIlIllIIllII, String llllllllllllllIllIlllIlIllIIlIll) {
        llllllllllllllIllIlllIlIllIIllII = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIlIllIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIlIllIIllll = new StringBuilder();
        char[] llllllllllllllIllIlllIlIllIIlllI = llllllllllllllIllIlllIlIllIIlIll.toCharArray();
        int llllllllllllllIllIlllIlIllIIllIl = lIlIIlIIllIII[0];
        char[] llllllllllllllIllIlllIlIllIIIlll = llllllllllllllIllIlllIlIllIIllII.toCharArray();
        int llllllllllllllIllIlllIlIllIIIllI = llllllllllllllIllIlllIlIllIIIlll.length;
        int llllllllllllllIllIlllIlIllIIIlIl = lIlIIlIIllIII[0];
        while (c.lIlllIlIlIlIIIl(llllllllllllllIllIlllIlIllIIIlIl, llllllllllllllIllIlllIlIllIIIllI)) {
            char llllllllllllllIllIlllIlIllIlIIlI = llllllllllllllIllIlllIlIllIIIlll[llllllllllllllIllIlllIlIllIIIlIl];
            llllllllllllllIllIlllIlIllIIllll.append((char)(llllllllllllllIllIlllIlIllIlIIlI ^ llllllllllllllIllIlllIlIllIIlllI[llllllllllllllIllIlllIlIllIIllIl % llllllllllllllIllIlllIlIllIIlllI.length]));
            0;
            ++llllllllllllllIllIlllIlIllIIllIl;
            ++llllllllllllllIllIlllIlIllIIIlIl;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlllIlIllIIllll);
    }

    private static boolean lIlllIlIlIIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIlIlIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        c llllllllllllllIllIlllIllIIIIIIlI;
        if (c.lIlllIlIlIIlIll(Players.getLocal().getInteracting())) {
            return lIlIIlIIllIII[0];
        }
        if (c.lIlllIlIlIIllII((Object)llllllllllllllIllIlllIllIIIIIIlI.r.b(), (Object)b.MINOTAURS)) {
            if (c.lIlllIlIlIIllIl(Dialog.isOpen() ? 1 : 0) && c.lIlllIlIlIIllIl(Dialog.getName().contains(lIlIIlIIlIlIl[lIlIIlIIllIII[0]]) ? 1 : 0) && c.lIlllIlIlIIllIl(Dialog.canContinue() ? 1 : 0)) {
                System.out.println(lIlIIlIIlIlIl[lIlIIlIIllIII[1]]);
                Dialog.continueSpace();
                return lIlIIlIIllIII[1];
            }
            if (c.lIlllIlIlIIllIl(Dialog.hasOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[20]])) ? 1 : 0)) {
                Dialog.chooseOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[19]]));
                0;
                return lIlIIlIIllIII[1];
            }
            if (c.lIlllIlIlIIllIl(Dialog.hasOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[18]])) ? 1 : 0)) {
                Dialog.chooseOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[17]]));
                0;
                return lIlIIlIIllIII[1];
            }
            if (c.lIlllIlIlIIllIl(Dialog.hasOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[5]])) ? 1 : 0)) {
                Dialog.chooseOption(string -> string.contains(lIlIIlIIlIlIl[lIlIIlIIllIII[16]]));
                0;
                return lIlIIlIIllIII[1];
            }
        }
        String[] stringArray = new String[lIlIIlIIllIII[1]];
        stringArray[c.lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[2]];
        if (c.lIlllIlIlIIllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIlIIlIIllIII[1]];
            stringArray2[c.lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[3]];
            Inventory.getFirst((String[])stringArray2).interact(lIlIIlIIlIlIl[lIlIIlIIllIII[4]]);
            return lIlIIlIIllIII[1];
        }
        if (c.lIlllIlIlIIllIl(llllllllllllllIllIlllIllIIIIIIlI.r.h() ? 1 : 0)) {
            return lIlIIlIIllIII[0];
        }
        if (c.lIlllIlIlIIlllI(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlIIllIII[0];
        }
        b llllllllllllllIllIlllIllIIIIIIIl = llllllllllllllIllIlllIllIIIIIIlI.r.b();
        if (c.lIlllIlIlIIllll((Object)llllllllllllllIllIlllIllIIIIIIIl)) {
            return lIlIIlIIllIII[0];
        }
        if (c.lIlllIlIlIlIIII(Movement.getRunEnergy(), lIlIIlIIllIII[5]) && c.lIlllIlIlIIlllI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
            return lIlIIlIIllIII[1];
        }
        if (c.lIlllIlIlIIlllI(llllllllllllllIllIlllIllIIIIIIIl.l() ? 1 : 0)) {
            llllllllllllllIllIlllIllIIIIIIIl.p().forEach(n2 -> {
                block2: {
                    void llllllllllllllIllIlllIlIllllIllI;
                    block3: {
                        int[] nArray = new int[lIlIIlIIllIII[1]];
                        nArray[c.lIlIIlIIllIII[0]] = n2;
                        if (!c.lIlllIlIlIIllIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                        int[] nArray2 = new int[lIlIIlIIllIII[1]];
                        nArray2[c.lIlIIlIIllIII[0]] = n2;
                        Item item = Inventory.getFirst((int[])nArray2);
                        String[] stringArray = new String[lIlIIlIIllIII[1]];
                        stringArray[c.lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[12]];
                        if (!c.lIlllIlIlIIlllI(item.hasAction(stringArray) ? 1 : 0)) break block3;
                        String[] stringArray2 = new String[lIlIIlIIllIII[1]];
                        stringArray2[c.lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[13]];
                        if (!c.lIlllIlIlIIllIl(item.hasAction(stringArray2) ? 1 : 0)) break block2;
                    }
                    String[] stringArray = new String[lIlIIlIIllIII[2]];
                    stringArray[c.lIlIIlIIllIII[0]] = lIlIIlIIlIlIl[lIlIIlIIllIII[14]];
                    stringArray[c.lIlIIlIIllIII[1]] = lIlIIlIIlIlIl[lIlIIlIIllIII[15]];
                    llllllllllllllIllIlllIlIllllIllI.interact(stringArray);
                }
            });
            return lIlIIlIIllIII[1];
        }
        NPC llllllllllllllIllIlllIllIIIIIIII = Combat.getAttackableNPC(nPC -> {
            int n2;
            if (c.lIlllIlIlIIllIl(nPC.getName().toLowerCase().contains(llllllllllllllIllIlllIllIIIIIIIl.m().toLowerCase()) ? 1 : 0) && c.lIlllIlIlIIlllI(nPC.isDead() ? 1 : 0)) {
                n2 = lIlIIlIIllIII[1];
                0;
                if (3 == 0) {
                    return ((0x50 ^ 0x18) & ~(0xF9 ^ 0xB1)) != 0;
                }
            } else {
                n2 = lIlIIlIIllIII[0];
            }
            return n2 != 0;
        });
        if (c.lIlllIlIlIIllll(llllllllllllllIllIlllIllIIIIIIII) && c.lIlllIlIlIIllIl(llllllllllllllIllIlllIllIIIIIIlI.b(llllllllllllllIllIlllIllIIIIIIIl) ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlIl[lIlIIlIIllIII[6]]);
            return lIlIIlIIllIII[0];
        }
        if (c.lIlllIlIlIIllll(llllllllllllllIllIlllIllIIIIIIII) && c.lIlllIlIlIIlllI(llllllllllllllIllIlllIllIIIIIIlI.b(llllllllllllllIllIlllIllIIIIIIIl) ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlIl[lIlIIlIIllIII[7]]);
            if (c.lIlllIlIlIIllIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)llllllllllllllIllIlllIllIIIIIIIl.n().getCenter());
                0;
            }
            return lIlIIlIIllIII[1];
        }
        Player llllllllllllllIllIlllIlIllllllll = Players.getLocal();
        if (!c.lIlllIlIlIlIIIl(llllllllllllllIllIlllIlIllllllll.getWorldLocation().distanceTo(llllllllllllllIllIlllIllIIIIIIIl.n().getCenter()), lIlIIlIIllIII[8]) || c.lIlllIlIlIIlIll(llllllllllllllIllIlllIllIIIIIIII) && c.lIlllIlIlIIlllI(Reachable.isInteractable((Locatable)llllllllllllllIllIlllIllIIIIIIII) ? 1 : 0)) {
            Log.info((String)lIlIIlIIlIlIl[lIlIIlIIllIII[9]]);
            if (c.lIlllIlIlIIllIl(Movement.shouldWalk() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)llllllllllllllIllIlllIllIIIIIIIl.n().getCenter());
                0;
            }
            return lIlIIlIIllIII[1];
        }
        llllllllllllllIllIlllIllIIIIIIlI.r.a(llllllllllllllIllIlllIllIIIIIIlI.r.g());
        0;
        Item llllllllllllllIllIlllIlIlllllllI = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (c.lIlllIlIlIIlIll(llllllllllllllIllIlllIlIlllllllI) && c.lIlllIlIlIlIIlI(llllllllllllllIllIlllIlIlllllllI.getId(), llllllllllllllIllIlllIllIIIIIIlI.r.i())) {
            System.out.println("Swapping to " + llllllllllllllIllIlllIllIIIIIIlI.r.i());
            int[] nArray = new int[lIlIIlIIllIII[1]];
            nArray[c.lIlIIlIIllIII[0]] = llllllllllllllIllIlllIllIIIIIIlI.r.i();
            Inventory.getFirst((int[])nArray).interact(lIlIIlIIlIlIl[lIlIIlIIllIII[10]]);
            llllllllllllllIllIlllIllIIIIIIlI.r.d(lIlIIlIIllIII[0]);
            return lIlIIlIIllIII[1];
        }
        if (c.lIlllIlIlIIllll(llllllllllllllIllIlllIllIIIIIIII)) {
            return lIlIIlIIllIII[0];
        }
        var2_2.interact(lIlIIlIIlIlIl[lIlIIlIIllIII[11]]);
        return lIlIIlIIllIII[1];
    }

    private static boolean lIlllIlIlIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIlIlIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlllIlIlIIlIll(Object object) {
        return object != null;
    }

    private static void lIlllIlIlIIlIlI() {
        lIlIIlIIllIII = new int[22];
        c.lIlIIlIIllIII[0] = (0xB8 ^ 0x8E ^ (2 ^ 0x16)) & (0xF8 ^ 0xB3 ^ (0xF6 ^ 0x9F) ^ -1);
        c.lIlIIlIIllIII[1] = 1;
        c.lIlIIlIIllIII[2] = 2;
        c.lIlIIlIIllIII[3] = 3;
        c.lIlIIlIIllIII[4] = 0x21 ^ 0x70 ^ (0x55 ^ 0);
        c.lIlIIlIIllIII[5] = 0xD ^ 0x78 ^ (0xE2 ^ 0x98);
        c.lIlIIlIIllIII[6] = 0x24 ^ 0x29 ^ (0x83 ^ 0x8B);
        c.lIlIIlIIllIII[7] = 0x8A ^ 0x8C;
        c.lIlIIlIIllIII[8] = 0xB1 ^ 0x84 ^ (0x8A ^ 0xA6);
        c.lIlIIlIIllIII[9] = 0x92 ^ 0x95;
        c.lIlIIlIIllIII[10] = 6 ^ 0x6B ^ (0x6F ^ 0xA);
        c.lIlIIlIIllIII[11] = 0x16 ^ 0x1F;
        c.lIlIIlIIllIII[12] = 125 + 43 - 153 + 168 ^ 174 + 25 - 171 + 161;
        c.lIlIIlIIllIII[13] = 0x8C ^ 0x87;
        c.lIlIIlIIllIII[14] = 0xF3 ^ 0x81 ^ (0x24 ^ 0x5A);
        c.lIlIIlIIllIII[15] = 0xF6 ^ 0xC5 ^ (0xB1 ^ 0x8F);
        c.lIlIIlIIllIII[16] = 0x50 ^ 0x5E;
        c.lIlIIlIIllIII[17] = 0x5D ^ 0x4D;
        c.lIlIIlIIllIII[18] = 60 + 60 - 12 + 32 ^ 7 + 135 - 9 + 24;
        c.lIlIIlIIllIII[19] = 0xC ^ 0x50 ^ (0xC9 ^ 0x87);
        c.lIlIIlIIllIII[20] = 0x8D ^ 0x9E;
        c.lIlIIlIIllIII[21] = 0x23 ^ 0x37;
    }

    private static String lIlllIlIlIIIIII(String llllllllllllllIllIlllIlIlllIlllI, String llllllllllllllIllIlllIlIlllIlIll) {
        try {
            SecretKeySpec llllllllllllllIllIlllIlIllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIlIlllIlIll.getBytes(StandardCharsets.UTF_8)), lIlIIlIIllIII[10]), "DES");
            Cipher llllllllllllllIllIlllIlIllllIIII = Cipher.getInstance("DES");
            llllllllllllllIllIlllIlIllllIIII.init(lIlIIlIIllIII[2], llllllllllllllIllIlllIlIllllIIIl);
            return new String(llllllllllllllIllIlllIlIllllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlIlllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIlIlllIllll) {
            llllllllllllllIllIlllIlIlllIllll.printStackTrace();
            return null;
        }
    }

    public boolean b(b b2) {
        return b2.n().contains((Locatable)Players.getLocal());
    }

    private static void lIlllIlIlIIlIIl() {
        lIlIIlIIlIlIl = new String[lIlIIlIIllIII[21]];
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[0]] = c."Gate of War";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[1]] = c."Trying to continue on Gate of War dialog";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[2]] = c."Waterskin(0)";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[3]] = c."Waterskin(0)";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[4]] = c."Drop";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[6]] = c."Waiting for respawns";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[7]] = c."Walking towards task location";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[9]] = c."Walking to location";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[10]] = c."Wield";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[11]] = c."Attack";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[12]] = c."Equip";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[13]] = c."Wield";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[14]] = c."Equip";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[15]] = c."Wield";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[16]] = c."decline";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[5]] = c."decline";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[17]] = c."no";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[18]] = c."no";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[19]] = c."report";
        c.lIlIIlIIlIlIl[c.lIlIIlIIllIII[20]] = c."report";
    }

    private static boolean lIlllIlIlIIllII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlllIlIlIlIIlI(int n2, int n3) {
        return n2 != n3;
    }
}

