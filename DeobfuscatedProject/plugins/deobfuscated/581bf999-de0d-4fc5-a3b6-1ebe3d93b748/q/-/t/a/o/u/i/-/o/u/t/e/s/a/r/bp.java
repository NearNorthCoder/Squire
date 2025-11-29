/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponMap
 *  com.openosrs.client.util.WeaponStyle
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.NpcChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bm;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.p;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Solving obelisk puzzle", register=true, priority=5, blocking=true)
public class bp
extends bm {
    private /* synthetic */ int ft;
    private final /* synthetic */ List<WorldPoint> fr;
    private static final /* synthetic */ int fq;
    private static /* synthetic */ String[] llIIIIlIIll;
    private /* synthetic */ int fu;
    private final /* synthetic */ Set<WorldPoint> fs;
    private static /* synthetic */ int[] llIIIlIIIlI;
    private static final /* synthetic */ int fp;

    private static boolean lIIlllIlllllII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIlllllIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        void llllllllllllllllIlIIIlIlllIIIIll;
        if (bp.lIIlllIlllllII(npcChanged.getNpc().getId(), llIIIlIIIlI[10])) {
            NPC nPC = npcChanged.getNpc();
            if (bp.lIIlllIllllIlI(this.fr.contains(nPC.getWorldLocation()) ? 1 : 0)) {
                this.fr.add(nPC.getWorldLocation());
                0;
            }
            llllllllllllllllIlIIIlIlllIIIlII.ft += llIIIlIIIlI[2];
            0;
            if (1 != 1) {
                return;
            }
        } else if (bp.lIIlllIlllllII(llllllllllllllllIlIIIlIlllIIIIll.getNpc().getId(), llIIIlIIIlI[3])) {
            llllllllllllllllIlIIIlIlllIIIlII.ft = llIIIlIIIlI[1];
        }
    }

    /*
     * WARNING - void declaration
     */
    private boolean cc() {
        void var1_1;
        if (bp.lIIlllIllllIlI(this.cd() ? 1 : 0)) {
            return llIIIlIIIlI[1];
        }
        Item llllllllllllllllIlIIIlIlllIIllII = Inventory.getFirst(item -> {
            int n2;
            Item llllllllllllllllIlIIIlIllIlllIIl;
            String[] stringArray = new String[llIIIlIIIlI[6]];
            stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[14]];
            stringArray[bp.llIIIlIIIlI[2]] = llIIIIlIIll[llIIIlIIIlI[15]];
            stringArray[bp.llIIIlIIIlI[5]] = llIIIIlIIll[llIIIlIIIlI[16]];
            if (bp.lIIlllIllllIlI(item.hasAction(stringArray) ? 1 : 0)) {
                return llIIIlIIIlI[1];
            }
            String llllllllllllllllIlIIIlIllIlllIII = llllllllllllllllIlIIIlIllIlllIIl.getName().toLowerCase();
            if (!(bp.lIIlllIllllIlI(llllllllllllllllIlIIIlIllIlllIII.contains(llIIIIlIIll[llIIIlIIIlI[17]]) ? 1 : 0) && bp.lIIlllIllllIlI(llllllllllllllllIlIIIlIllIlllIII.contains(llIIIIlIIll[llIIIlIIIlI[18]]) ? 1 : 0) && bp.lIIlllIllllIlI(llllllllllllllllIlIIIlIllIlllIII.contains(llIIIIlIIll[llIIIlIIIlI[19]]) ? 1 : 0) && bp.lIIlllIllllIlI(llllllllllllllllIlIIIlIllIlllIII.contains(llIIIIlIIll[llIIIlIIIlI[20]]) ? 1 : 0) && bp.lIIlllIllllIlI(llllllllllllllllIlIIIlIllIlllIII.contains(llIIIIlIIll[llIIIlIIIlI[21]]) ? 1 : 0) && !bp.lIIlllIlllIlll(llllllllllllllllIlIIIlIllIlllIII.contains(llIIIIlIIll[llIIIlIIIlI[22]]) ? 1 : 0))) {
                n2 = llIIIlIIIlI[2];
                0;
                if (null != null) {
                    return ((0x6F ^ 0x4A) & ~(0x81 ^ 0xA4)) != 0;
                }
            } else {
                n2 = llIIIlIIIlI[1];
            }
            return n2 != 0;
        });
        if (bp.lIIlllIlllIllI(llllllllllllllllIlIIIlIlllIIllII)) {
            return llIIIlIIIlI[1];
        }
        Item llllllllllllllllIlIIIlIlllIIlIll = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD);
        if (bp.lIIlllIllllIIl(llllllllllllllllIlIIIlIlllIIlIll) && bp.lIIlllIlllIlll(Inventory.isFull() ? 1 : 0)) {
            Item llllllllllllllllIlIIIlIlllIIlIlI = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIIIlIIIlI[2]];
                stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[13]];
                return item.hasAction(stringArray);
            });
            if (bp.lIIlllIlllIllI(llllllllllllllllIlIIIlIlllIIlIlI)) {
                llllllllllllllllIlIIIlIlllIIlIlI = Inventory.getFirst(item -> {
                    int n2;
                    if (bp.lIIlllIlllIlll(item.getName().contains(llIIIIlIIll[llIIIlIIIlI[12]]) ? 1 : 0)) {
                        String[] stringArray = new String[llIIIlIIIlI[2]];
                        stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[4]];
                        if (bp.lIIlllIlllIlll(item.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llIIIlIIIlI[2];
                            0;
                            if (2 > 1) return n2 != 0;
                            return ((0x1C ^ 1) & ~(0x1A ^ 7)) != 0;
                        }
                    }
                    n2 = llIIIlIIIlI[1];
                    return n2 != 0;
                });
            }
            if (bp.lIIlllIlllIllI(llllllllllllllllIlIIIlIlllIIlIlI)) {
                return llIIIlIIIlI[1];
            }
            llllllllllllllllIlIIIlIlllIIlIlI.interact(llIIIIlIIll[llIIIlIIIlI[6]]);
            return llIIIlIIIlI[2];
        }
        String[] stringArray = new String[llIIIlIIIlI[6]];
        stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[7]];
        stringArray[bp.llIIIlIIIlI[2]] = llIIIIlIIll[llIIIlIIIlI[8]];
        stringArray[bp.llIIIlIIIlI[5]] = llIIIIlIIll[llIIIlIIIlI[0]];
        var1_1.interact(stringArray);
        return llIIIlIIIlI[2];
    }

    private static boolean lIIlllIlllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIlllIllI(Object object) {
        return object == null;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.cu, (LocalPoint)graphicsObjectCreated.getGraphicsObject().getLocation());
        this.fs.add(worldPoint);
        0;
    }

    static {
        bp.lIIlllIlllIlIl();
        bp.lIIlllIlIlIIII();
        fp = llIIIlIIIlI[3];
        fq = llIIIlIIIlI[10];
    }

    private static String lIIlllIlIIlllI(String llllllllllllllllIlIIIlIllIIIlllI, String llllllllllllllllIlIIIlIllIIIlIll) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIllIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIlIllIIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIlIllIIlIIII.init(llIIIlIIIlI[5], llllllllllllllllIlIIIlIllIIlIIIl);
            return new String(llllllllllllllllIlIIIlIllIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIllIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIlIllIIIllll) {
            llllllllllllllllIlIIIlIllIIIllll.printStackTrace();
            return null;
        }
    }

    public List<WorldPoint> ce() {
        return this.fr;
    }

    private static void lIIlllIlllIlIl() {
        llIIIlIIIlI = new int[24];
        bp.llIIIlIIIlI[0] = 0x8F ^ 0x82 ^ (0x40 ^ 0x4B);
        bp.llIIIlIIIlI[1] = (0x77 ^ 0x17 ^ (0x43 ^ 0x14)) & (176 + 240 - 218 + 49 ^ 184 + 139 - 162 + 31 ^ -1);
        bp.llIIIlIIIlI[2] = 1;
        bp.llIIIlIIIlI[3] = -(0xFFFFFE4F & 0x53FD) & (0xFFFFFFFE & Short.MAX_VALUE);
        bp.llIIIlIIIlI[4] = 6 ^ 0xC;
        bp.llIIIlIIIlI[5] = 2;
        bp.llIIIlIIIlI[6] = 3;
        bp.llIIIlIIIlI[7] = 0x97 ^ 0xAF ^ (0x45 ^ 0x79);
        bp.llIIIlIIIlI[8] = 181 + 56 - 190 + 149 ^ 156 + 61 - 163 + 139;
        bp.llIIIlIIIlI[9] = 0x13 ^ 0x14;
        bp.llIIIlIIIlI[10] = 0xFFFFBFFB & 0x6DB7;
        bp.llIIIlIIIlI[11] = 0xC6 ^ 0x87 ^ (0x51 ^ 0x18);
        bp.llIIIlIIIlI[12] = 0x89 ^ 0x80;
        bp.llIIIlIIIlI[13] = 0x3E ^ 0x35;
        bp.llIIIlIIIlI[14] = 9 ^ 5;
        bp.llIIIlIIIlI[15] = 0x1B ^ 0x78 ^ (0x4F ^ 0x21);
        bp.llIIIlIIIlI[16] = 0xBF ^ 0xB1;
        bp.llIIIlIIIlI[17] = 0 + 73 - -57 + 9 ^ 99 + 62 - 154 + 125;
        bp.llIIIlIIIlI[18] = 0x11 ^ 0x1F ^ (0x61 ^ 0x7F);
        bp.llIIIlIIIlI[19] = 0x3A ^ 0x41 ^ (0xF3 ^ 0x99);
        bp.llIIIlIIIlI[20] = 0x22 ^ 0xD ^ (0x65 ^ 0x58);
        bp.llIIIlIIIlI[21] = 48 + 91 - 128 + 202 ^ 177 + 50 - 62 + 33;
        bp.llIIIlIIIlI[22] = 0xF0 ^ 0xB5 ^ (0x6C ^ 0x3D);
        bp.llIIIlIIIlI[23] = 0x71 ^ 0x64;
    }

    @Override
    public int bZ() {
        String[] stringArray = new String[llIIIlIIIlI[2]];
        stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[5]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (bp.lIIlllIllllIIl(nPC)) {
            return nPC.getWorldLocation().getX();
        }
        return llIIIlIIIlI[1];
    }

    private static void lIIlllIlIlIIII() {
        llIIIIlIIll = new String[llIIIlIIIlI[23]];
        bp.llIIIIlIIll[bp.llIIIlIIIlI[1]] = bp."Hit";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[2]] = bp."Hit";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[5]] = bp."Obelisk";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[6]] = bp."Drop";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[7]] = bp."Wield";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[8]] = bp."Wear";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[0]] = bp."Equip";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[9]] = bp."shadow";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[11]] = bp."Your party failed to complete the challenge";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[12]] = bp."(";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[4]] = bp."Empty";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[13]] = bp."Eat";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[14]] = bp."Equip";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[15]] = bp."Wield";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[16]] = bp."Wear";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[17]] = bp."bow";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[18]] = bp."staff";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[19]] = bp."toxic";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[20]] = bp."trident";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[21]] = bp."crossbow";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[22]] = bp."blowpipe";
    }

    private static boolean lIIlllIllllIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cd() {
        boolean bl2;
        void llllllllllllllllIlIIIlIlllIIlIII;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (bp.lIIlllIlllIllI(item)) {
            return llIIIlIIIlI[2];
        }
        if (bp.lIIlllIlllIlll(llllllllllllllllIlIIIlIlllIIlIII.getName().toLowerCase().contains(llIIIIlIIll[llIIIlIIIlI[9]]) ? 1 : 0)) {
            return llIIIlIIIlI[2];
        }
        if (bp.lIIlllIllllIll(WeaponMap.StyleMap.getOrDefault(llllllllllllllllIlIIIlIlllIIlIII.getId(), WeaponStyle.MELEE), WeaponStyle.MELEE)) {
            bl2 = llIIIlIIIlI[2];
            0;
            if (null != null) {
                return ((8 ^ 0x28) & ~(0x52 ^ 0x72)) != 0;
            }
        } else {
            bl2 = llIIIlIIIlI[1];
        }
        return bl2;
    }

    @Override
    public boolean bk() {
        int[] nArray = new int[llIIIlIIIlI[2]];
        nArray[bp.llIIIlIIIlI[1]] = llIIIlIIIlI[3];
        return NPCs.getAll((int[])nArray).stream().anyMatch(Reachable::isInteractable);
    }

    private static boolean lIIlllIllllIlI(int n2) {
        return n2 == 0;
    }

    private static String lIIlllIlIIllll(String llllllllllllllllIlIIIlIllIIllllI, String llllllllllllllllIlIIIlIllIIlllIl) {
        llllllllllllllllIlIIIlIllIIllllI = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIlIllIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIlIllIlIIIIl = new StringBuilder();
        char[] llllllllllllllllIlIIIlIllIlIIIII = llllllllllllllllIlIIIlIllIIlllIl.toCharArray();
        int llllllllllllllllIlIIIlIllIIlllll = llIIIlIIIlI[1];
        char[] llllllllllllllllIlIIIlIllIIllIIl = llllllllllllllllIlIIIlIllIIllllI.toCharArray();
        int llllllllllllllllIlIIIlIllIIllIII = llllllllllllllllIlIIIlIllIIllIIl.length;
        int llllllllllllllllIlIIIlIllIIlIlll = llIIIlIIIlI[1];
        while (bp.lIIlllIlllllIl(llllllllllllllllIlIIIlIllIIlIlll, llllllllllllllllIlIIIlIllIIllIII)) {
            char llllllllllllllllIlIIIlIllIlIIlII = llllllllllllllllIlIIIlIllIIllIIl[llllllllllllllllIlIIIlIllIIlIlll];
            llllllllllllllllIlIIIlIllIlIIIIl.append((char)(llllllllllllllllIlIIIlIllIlIIlII ^ llllllllllllllllIlIIIlIllIlIIIII[llllllllllllllllIlIIIlIllIIlllll % llllllllllllllllIlIIIlIllIlIIIII.length]));
            0;
            ++llllllllllllllllIlIIIlIllIIlllll;
            ++llllllllllllllllIlIIIlIllIIlIlll;
            0;
            if (((0 ^ 0x4E ^ (0x14 ^ 0x12)) & (222 + 100 - 211 + 144 ^ 125 + 28 - -22 + 8 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIlIllIlIIIIl);
    }

    private static boolean lIIlllIllllIII(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean bj() {
        boolean bl2;
        int[] nArray = new int[llIIIlIIIlI[2]];
        nArray[bp.llIIIlIIIlI[1]] = llIIIlIIIlI[3];
        if (bp.lIIlllIlllIllI(NPCs.getNearest((int[])nArray))) {
            bl2 = llIIIlIIIlI[2];
            0;
            if ((0x34 ^ 0x30) != (0xA0 ^ 0xA4)) {
                return ((0xC3 ^ 0x98) & ~(0xCB ^ 0x90)) != 0;
            }
        } else {
            bl2 = llIIIlIIIlI[1];
        }
        return bl2;
    }

    @Override
    public boolean bY() {
        NPC llllllllllllllllIlIIIlIlllIlIlII;
        Object llllllllllllllllIlIIIlIlllIlIlIl;
        bp llllllllllllllllIlIIIlIlllIlIlll;
        if (bp.lIIlllIlllIlll(this.cc() ? 1 : 0)) {
            return llIIIlIIIlI[2];
        }
        WorldPoint llllllllllllllllIlIIIlIlllIlIllI = Players.getLocal().getWorldLocation();
        if (bp.lIIlllIlllIlll(llllllllllllllllIlIIIlIlllIlIlll.fs.contains(llllllllllllllllIlIIIlIlllIlIllI) ? 1 : 0) && bp.lIIlllIlllIlll(((Optional)(llllllllllllllllIlIIIlIlllIlIlIl = llllllllllllllllIlIIIlIlllIlIllI.createWorldArea(llIIIlIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bp.lIIlllIllllIlI(this.fs.contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIIlIIIlI[2];
                0;
                if (-2 > 0) {
                    return ((0x2D ^ 0x1F) & ~(0x16 ^ 0x24)) != 0;
                }
            } else {
                bl2 = llIIIlIIIlI[1];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(llllllllllllllllIlIIIlIlllIlIllI))))).isPresent() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)((WorldPoint)((Optional)llllllllllllllllIlIIIlIlllIlIlIl).get()));
            llllllllllllllllIlIIIlIlllIlIlll.sleep(llIIIlIIIlI[2]);
            llllllllllllllllIlIIIlIlllIlIlll.fs.clear();
            return llIIIlIIIlI[2];
        }
        if (bp.lIIlllIllllIII(llllllllllllllllIlIIIlIlllIlIlll.fr.size(), llllllllllllllllIlIIIlIlllIlIlll.ft) && bp.lIIlllIllllIIl(llllllllllllllllIlIIIlIlllIlIlII = NPCs.getNearest(arg_0 -> bp.h((WorldPoint)(llllllllllllllllIlIIIlIlllIlIlIl = llllllllllllllllIlIIIlIlllIlIlll.fr.get(llllllllllllllllIlIIIlIlllIlIlll.ft)), arg_0)))) {
            llllllllllllllllIlIIIlIlllIlIlII.interact(llIIIIlIIll[llIIIlIIIlI[1]]);
            llllllllllllllllIlIIIlIlllIlIlll.sleep(llIIIlIIIlI[2]);
            return llIIIlIIIlI[2];
        }
        llllllllllllllllIlIIIlIlllIlIlIl = NPCs.getAll(nPC -> {
            boolean bl2;
            if (bp.lIIlllIlllllII(nPC.getId(), llIIIlIIIlI[3])) {
                bl2 = llIIIlIIIlI[2];
                0;
                if (2 == 0) {
                    return (3 & ~3) != 0;
                }
            } else {
                bl2 = llIIIlIIIlI[1];
            }
            return bl2;
        });
        int n2 = llllllllllllllllIlIIIlIlllIlIlll.fu;
        llllllllllllllllIlIIIlIlllIlIlll.fu = n2 + llIIIlIIIlI[2];
        llllllllllllllllIlIIIlIlllIlIlII = (NPC)llllllllllllllllIlIIIlIlllIlIlIl.get(n2 % llllllllllllllllIlIIIlIlllIlIlIl.size());
        if (bp.lIIlllIllllIIl(llllllllllllllllIlIIIlIlllIlIlII)) {
            llllllllllllllllIlIIIlIlllIlIlII.interact(llIIIIlIIll[llIIIlIIIlI[2]]);
            llllllllllllllllIlIIIlIlllIlIlll.sleep(llIIIlIIIlI[2]);
            return llIIIlIIIlI[2];
        }
        return llIIIlIIIlI[1];
    }

    private static String lIIlllIlIIllIl(String llllllllllllllllIlIIIlIllIIIIIIl, String llllllllllllllllIlIIIlIllIIIIIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIIlIllIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIlIllIIIIIII.getBytes(StandardCharsets.UTF_8)), llIIIlIIIlI[11]), "DES");
            Cipher llllllllllllllllIlIIIlIllIIIIIll = Cipher.getInstance("DES");
            llllllllllllllllIlIIIlIllIIIIIll.init(llIIIlIIIlI[5], llllllllllllllllIlIIIlIllIIIIlII);
            return new String(llllllllllllllllIlIIIlIllIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIlIllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIlIllIIIIIlI) {
            llllllllllllllllIlIIIlIllIIIIIlI.printStackTrace();
            return null;
        }
    }

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (bp.lIIlllIlllIlll(chatMessage.getMessage().startsWith(llIIIIlIIll[llIIIlIIIlI[11]]) ? 1 : 0)) {
            this.ft = llIIIlIIIlI[1];
            this.fr.clear();
        }
    }

    private static /* synthetic */ boolean h(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (bp.lIIlllIlllllII(nPC.getId(), llIIIlIIIlI[3]) && bp.lIIlllIlllIlll(nPC.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = llIIIlIIIlI[2];
            0;
            if (-1 > -1) {
                return ((0x13 ^ 7 ^ (0x8D ^ 0x83)) & (0xD3 ^ 0xB1 ^ (0x5C ^ 0x24) ^ -1)) != 0;
            }
        } else {
            n2 = llIIIlIIIlI[1];
        }
        return n2 != 0;
    }

    private static boolean lIIlllIllllIll(Object object, Object object2) {
        return object == object2;
    }

    public int cf() {
        return this.ft;
    }

    @Override
    public void r() {
        this.ft = llIIIlIIIlI[1];
        this.fr.clear();
        this.fs.clear();
        this.fu = llIIIlIIIlI[1];
    }

    @Inject
    protected bp(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
        this.fr = new ArrayList<WorldPoint>(llIIIlIIIlI[0]);
        this.fs = new HashSet<WorldPoint>();
        this.ft = llIIIlIIIlI[1];
        this.fu = llIIIlIIIlI[1];
    }
}

