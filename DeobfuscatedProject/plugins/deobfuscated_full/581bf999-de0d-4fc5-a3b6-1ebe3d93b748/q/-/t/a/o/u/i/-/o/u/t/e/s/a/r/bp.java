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

/* TASK: Solving obelisk puzzle -> SolvingobeliskpuzzleTask */
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
        void var9;
        if (bp.lIIlllIlllllII(npcChanged.getNpc().getId(), llIIIlIIIlI[10])) {
            NPC nPC = npcChanged.getNpc();
            if (bp.lIIlllIllllIlI(this.fr.contains(nPC.getWorldLocation()) ? 1 : 0)) {
                this.fr.add(nPC.getWorldLocation());
                0;
            }
            var11.ft += llIIIlIIIlI[2];
            0;
            if (1 != 1) {
                return;
            }
        } else if (bp.lIIlllIlllllII(var9.getNpc().getId(), llIIIlIIIlI[3])) {
            var11.ft = llIIIlIIIlI[1];
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
        Item var17 = Inventory.getFirst(item -> {
            int n2;
            Item var18;
            String[] stringArray = new String[llIIIlIIIlI[6]];
            stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[14]];
            stringArray[bp.llIIIlIIIlI[2]] = llIIIIlIIll[llIIIlIIIlI[15]];
            stringArray[bp.llIIIlIIIlI[5]] = llIIIIlIIll[llIIIlIIIlI[16]];
            if (bp.lIIlllIllllIlI(item.hasAction(stringArray) ? 1 : 0)) {
                return llIIIlIIIlI[1];
            }
            String var25 = var18.getName().toLowerCase();
            if (!(bp.lIIlllIllllIlI(var25.contains(llIIIIlIIll[llIIIlIIIlI[17]]) ? 1 : 0) && bp.lIIlllIllllIlI(var25.contains(llIIIIlIIll[llIIIlIIIlI[18]]) ? 1 : 0) && bp.lIIlllIllllIlI(var25.contains(llIIIIlIIll[llIIIlIIIlI[19]]) ? 1 : 0) && bp.lIIlllIllllIlI(var25.contains(llIIIIlIIll[llIIIlIIIlI[20]]) ? 1 : 0) && bp.lIIlllIllllIlI(var25.contains(llIIIIlIIll[llIIIlIIIlI[21]]) ? 1 : 0) && !bp.lIIlllIlllIlll(var25.contains(llIIIIlIIll[llIIIlIIIlI[22]]) ? 1 : 0))) {
                n2 = llIIIlIIIlI[2];
                0;
                
                }
            } else {
                n2 = llIIIlIIIlI[1];
            }
            return n2 != 0;
        });
        if (bp.lIIlllIlllIllI(var17)) {
            return llIIIlIIIlI[1];
        }
        Item var3 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.SHIELD);
        if (bp.lIIlllIllllIIl(var3) && bp.lIIlllIlllIlll(Inventory.isFull() ? 1 : 0)) {
            Item var29 = Inventory.getFirst(item -> {
                String[] stringArray = new String[llIIIlIIIlI[2]];
                stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[13]];
                return item.hasAction(stringArray);
            });
            if (bp.lIIlllIlllIllI(var29)) {
                var29 = Inventory.getFirst(item -> {
                    int n2;
                    if (bp.lIIlllIlllIlll(item.getName().contains(llIIIIlIIll[llIIIlIIIlI[12]]) ? 1 : 0)) {
                        String[] stringArray = new String[llIIIlIIIlI[2]];
                        stringArray[bp.llIIIlIIIlI[1]] = llIIIIlIIll[llIIIlIIIlI[4]];
                        if (bp.lIIlllIlllIlll(item.hasAction(stringArray) ? 1 : 0)) {
                            n2 = llIIIlIIIlI[2];
                            0;
                            if (2 > 1) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = llIIIlIIIlI[1];
                    return n2 != 0;
                });
            }
            if (bp.lIIlllIlllIllI(var29)) {
                return llIIIlIIIlI[1];
            }
            var29.interact(llIIIIlIIll[llIIIlIIIlI[6]]);
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

    private static String lIIlllIlIIlllI(String var31, String var2) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var22 = Cipher.getInstance("Blowfish");
            var22.init(llIIIlIIIlI[5], var6);
            return new String(var22.doFinal(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
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
        void var20;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (bp.lIIlllIlllIllI(item)) {
            return llIIIlIIIlI[2];
        }
        if (bp.lIIlllIlllIlll(var20.getName().toLowerCase().contains(llIIIIlIIll[llIIIlIIIlI[9]]) ? 1 : 0)) {
            return llIIIlIIIlI[2];
        }
        if (bp.lIIlllIllllIll(WeaponMap.StyleMap.getOrDefault(var20.getId(), WeaponStyle.MELEE), WeaponStyle.MELEE)) {
            bl2 = llIIIlIIIlI[2];
            0;
            
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

    private static String lIIlllIlIIllll(String var28, String var13) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var19 = var13.toCharArray();
        int var1 = llIIIlIIIlI[1];
        char[] var5 = var28.toCharArray();
        int var14 = var5.length;
        int var21 = llIIIlIIIlI[1];
        while (bp.lIIlllIlllllIl(var21, var14)) {
            char var7 = var5[var21];
            var23.append((char)(var7 ^ var19[var1 % var19.length]));
            0;
            ++var1;
            ++var21;
            0;
            if (((0 ^ 0x4E ^ (0x14 ^ 0x12)) & (222 + 100 - 211 + 144 ^ 125 + 28 - -22 + 8 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var23);
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
                return false;
            }
        } else {
            bl2 = llIIIlIIIlI[1];
        }
        return bl2;
    }

    @Override
    public boolean bY() {
        NPC var12;
        Object var8;
        bp var24;
        if (bp.lIIlllIlllIlll(this.cc() ? 1 : 0)) {
            return llIIIlIIIlI[2];
        }
        WorldPoint var27 = Players.getLocal().getWorldLocation();
        if (bp.lIIlllIlllIlll(var24.fs.contains(var27) ? 1 : 0) && bp.lIIlllIlllIlll(((Optional)(var8 = var27.createWorldArea(llIIIlIIIlI[4]).toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bp.lIIlllIllllIlI(this.fs.contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIIlIIIlI[2];
                0;
                if (-2 > 0) {
                    return false;
                }
            } else {
                bl2 = llIIIlIIIlI[1];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var27))))).isPresent() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)((WorldPoint)((Optional)var8).get()));
            var24.sleep(llIIIlIIIlI[2]);
            var24.fs.clear();
            return llIIIlIIIlI[2];
        }
        if (bp.lIIlllIllllIII(var24.fr.size(), var24.ft) && bp.lIIlllIllllIIl(var12 = NPCs.getNearest(arg_0 -> bp.h((WorldPoint)(var8 = var24.fr.get(var24.ft)), arg_0)))) {
            var12.interact(llIIIIlIIll[llIIIlIIIlI[1]]);
            var24.sleep(llIIIlIIIlI[2]);
            return llIIIlIIIlI[2];
        }
        var8 = NPCs.getAll(nPC -> {
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
        int n2 = var24.fu;
        var24.fu = n2 + llIIIlIIIlI[2];
        var12 = (NPC)var8.get(n2 % var8.size());
        if (bp.lIIlllIllllIIl(var12)) {
            var12.interact(llIIIIlIIll[llIIIlIIIlI[2]]);
            var24.sleep(llIIIlIIIlI[2]);
            return llIIIlIIIlI[2];
        }
        return llIIIlIIIlI[1];
    }

    private static String lIIlllIlIIllIl(String var30, String var16) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), llIIIlIIIlI[11]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llIIIlIIIlI[5], var26);
            return new String(var4.doFinal(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
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

