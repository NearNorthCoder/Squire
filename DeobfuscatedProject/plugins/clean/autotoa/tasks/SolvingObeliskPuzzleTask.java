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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Solving obelisk puzzle", register=true, priority=5, blocking=true)
public class SolvingObeliskPuzzleTask
extends AutotoaTaskBase {
    private  int ft;
    private final  List<WorldPoint> fr;
    private static final  int fq;
    
    private  int fu;
    private final  Set<WorldPoint> fs;
    
    private static final  int fp;

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
        void var1;
        if (bp.lIIlllIlllllII(npcChanged.getNpc().getId(), llIIIlIIIlI[10])) {
            NPC nPC = npcChanged.getNpc();
            if (bp.lIIlllIllllIlI(this.fr.contains(nPC.getWorldLocation()) ? 1 : 0)) {
                this.fr.add(nPC.getWorldLocation());

            }
            var2.ft += llIIIlIIIlI[2];

            if (1 != 1) {
                return;
            }
        } else if (bp.lIIlllIlllllII(var1.getNpc().getId(), llIIIlIIIlI[3])) {
            var2.ft = llIIIlIIIlI[1];
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
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            Item var4;
            String[] stringArray = new String[llIIIlIIIlI[6]];
            stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[14]];
            stringArray[bp.llIIIlIIIlI[2]] = llIIIIlIIll[llIIIlIIIlI[15]];
            stringArray[bp.llIIIlIIIlI[5]] = llIIIIlIIll[llIIIlIIIlI[16]];
            if (bp.lIIlllIllllIlI(item.hasAction(stringArray) ? 1 : 0)) {
                return llIIIlIIIlI[1];
            }
            String var5 = var4.getName().toLowerCase();
            if (!(bp.lIIlllIllllIlI(var5.contains(llIIIIlIIll[llIIIlIIIlI[17]]) ? 1 : 0) && bp.lIIlllIllllIlI(var5.contains(llIIIIlIIll[llIIIlIIIlI[18]]) ? 1 : 0) && bp.lIIlllIllllIlI(var5.contains(llIIIIlIIll[llIIIlIIIlI[19]]) ? 1 : 0) && bp.lIIlllIllllIlI(var5.contains(llIIIIlIIll[llIIIlIIIlI[20]]) ? 1 : 0) && bp.lIIlllIllllIlI(var5.contains(llIIIIlIIll[llIIIlIIIlI[21]]) ? 1 : 0) && !bp.lIIlllIlllIlll(var5.contains(llIIIIlIIll[llIIIlIIIlI[22]]) ? 1 : 0))) {
                n2 = llIIIlIIIlI[2];

                }
            } else {
                n2 = llIIIlIIIlI[1];
            }
            return n2 != 0;
        });
        if (bp.lIIlllIlllIllI(var3)) {
            return llIIIlIIIlI[1];
        }
        Item var6 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD);
        if (bp.lIIlllIllllIIl(var6) && bp.lIIlllIlllIlll(Inventory.isFull() ? 1 : 0)) {
            Item var7 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIIIlIIIlI[2]];
                stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[13]];
                return item.hasAction(stringArray);
            });
            if (bp.lIIlllIlllIllI(var7)) {
                var7 = Inventory.getFirst(item -> {
                    int n2;
                    if (bp.lIIlllIlllIlll(item.getName().contains(llIIIIlIIll[llIIIlIIIlI[12]]) ? 1 : 0)) {
                        String[] stringArray = new String[llIIIlIIIlI[2]];
                        stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[4]];
                        if (bp.lIIlllIlllIlll(item.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llIIIlIIIlI[2];

                            if (2 > 1) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = llIIIlIIIlI[1];
                    return n2 != 0;
                });
            }
            if (bp.lIIlllIlllIllI(var7)) {
                return llIIIlIIIlI[1];
            }
            var7.interact(llIIIIlIIll[llIIIlIIIlI[6]]);
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

    }

    static {
        bp.lIIlllIlllIlIl();
        bp.lIIlllIlIlIIII();
        fp = llIIIlIIIlI[3];
        fq = llIIIlIIIlI[10];
    }

    public List<WorldPoint> ce() {
        return this.fr;
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
        bp.llIIIIlIIll[bp.llIIIlIIIlI[1]] = "Hit";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[2]] = "Hit";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[5]] = "Obelisk";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[6]] = "Drop";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[7]] = "Wield";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[8]] = "Wear";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[0]] = "Equip";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[9]] = "shadow";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[11]] = "Your party failed to complete the challenge";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[12]] = "(";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[4]] = "Empty";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[13]] = "Eat";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[14]] = "Equip";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[15]] = "Wield";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[16]] = "Wear";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[17]] = "bow";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[18]] = "staff";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[19]] = "toxic";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[20]] = "trident";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[21]] = "crossbow";
        bp.llIIIIlIIll[bp.llIIIlIIIlI[22]] = "blowpipe";
    }

    private static boolean lIIlllIllllIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cd() {
        boolean bl2;
        void var8;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (bp.lIIlllIlllIllI(item)) {
            return llIIIlIIIlI[2];
        }
        if (bp.lIIlllIlllIlll(var8.getName().toLowerCase().contains(llIIIIlIIll[llIIIlIIIlI[9]]) ? 1 : 0)) {
            return llIIIlIIIlI[2];
        }
        if (bp.lIIlllIllllIll(WeaponMap.StyleMap.getOrDefault(var8.getId(), WeaponStyle.MELEE), WeaponStyle.MELEE)) {
            bl2 = llIIIlIIIlI[2];

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

        return String.valueOf(var9);
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

            if ((0x34 ^ 0x30) != (0xA0 ^ 0xA4)) {
                return false;
            }
        } else {
            bl2 = llIIIlIIIlI[1];
        }
        return bl2;
    }

    @Override
    public boolean bY() {
        NPC var10;
        Object var11;
        bp var12;
        if (bp.lIIlllIlllIlll(this.cc() ? 1 : 0)) {
            return llIIIlIIIlI[2];
        }
        WorldPoint var13 = Players.getLocal().getWorldLocation();
        if (bp.lIIlllIlllIlll(var12.fs.contains(var13) ? 1 : 0) && bp.lIIlllIlllIlll(((Optional)(var11 = var13.createWorldArea(llIIIlIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bp.lIIlllIllllIlI(this.fs.contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIIlIIIlI[2];

            } else {
                bl2 = llIIIlIIIlI[1];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var13))))).isPresent() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)((WorldPoint)((Optional)var11).get()));
            var12.sleep(llIIIlIIIlI[2]);
            var12.fs.clear();
            return llIIIlIIIlI[2];
        }
        if (bp.lIIlllIllllIII(var12.fr.size(), var12.ft) && bp.lIIlllIllllIIl(var10 = NPCs.getNearest(arg_0 -> bp.h((WorldPoint)(var11 = var12.fr.get(var12.ft)), arg_0)))) {
            var10.interact(llIIIIlIIll[llIIIlIIIlI[1]]);
            var12.sleep(llIIIlIIIlI[2]);
            return llIIIlIIIlI[2];
        }
        var11 = NPCs.getAll(nPC -> {
            boolean bl2;
            if (bp.lIIlllIlllllII(nPC.getId(), llIIIlIIIlI[3])) {
                bl2 = llIIIlIIIlI[2];

                if (2 == 0) {
                    return (3 & ~3) != 0;
                }
            } else {
                bl2 = llIIIlIIIlI[1];
            }
            return bl2;
        });
        int n2 = var12.fu;
        var12.fu = n2 + llIIIlIIIlI[2];
        var10 = (NPC)var11.get(n2 % var11.size());
        if (bp.lIIlllIllllIIl(var10)) {
            var10.interact(llIIIIlIIll[llIIIlIIIlI[2]]);
            var12.sleep(llIIIlIIIlI[2]);
            return llIIIlIIIlI[2];
        }
        return llIIIlIIIlI[1];
    }

    @Override
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (bp.lIIlllIlllIlll(chatMessage.getMessage().startsWith(llIIIIlIIll[llIIIlIIIlI[11]]) ? 1 : 0)) {
            this.ft = llIIIlIIIlI[1];
            this.fr.clear();
        }
    }

    private static  boolean h(WorldPoint worldPoint, NPC nPC) {
        int n2;
        if (bp.lIIlllIlllllII(nPC.getId(), llIIIlIIIlI[3]) && bp.lIIlllIlllIlll(nPC.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = llIIIlIIIlI[2];

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
    protected SolvingObeliskPuzzleTask(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
        this.fr = new ArrayList<WorldPoint>(llIIIlIIIlI[0]);
        this.fs = new HashSet<WorldPoint>();
        this.ft = llIIIlIIIlI[1];
        this.fu = llIIIlIIIlI[1];
    }
}

