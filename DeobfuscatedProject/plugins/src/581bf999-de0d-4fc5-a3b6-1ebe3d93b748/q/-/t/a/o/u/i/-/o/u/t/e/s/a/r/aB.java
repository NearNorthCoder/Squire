/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.NpcChanged
 *  net.runelite.api.events.StatChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.awt.Point;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcChanged;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.az;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.r;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Solving Light Puzzle", register=true)
public class aB
extends az {
    private static /* synthetic */ String[] llIIlIIlIlI;
    private /* synthetic */ boolean dC;
    private static final /* synthetic */ Set<Integer> dz;
    private /* synthetic */ int dD;
    private static final /* synthetic */ int dB;
    private static final /* synthetic */ int dA;
    private static /* synthetic */ int[] llIIlIlIlII;
    private static final /* synthetic */ int dy;

    private static boolean lIlIIIIIllllII(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIIlllllI(int n2) {
        return n2 == 0;
    }

    private static void lIlIIIIIlllIll() {
        llIIlIlIlII = new int[28];
        aB.llIIlIlIlII[0] = -" ".length();
        aB.llIIlIlIlII[1] = " ".length();
        aB.llIIlIlIlII[2] = (0xC4 ^ 0xAA ^ (0x19 ^ 0x6B)) & (76 + 8 - 83 + 219 ^ 141 + 140 - 228 + 139 ^ -" ".length());
        aB.llIIlIlIlII[3] = 0xFFFFBDFF & 0x6FBB;
        aB.llIIlIlIlII[4] = 87 + 60 - 10 + 20 ^ 42 + 56 - 62 + 117;
        aB.llIIlIlIlII[5] = "  ".length();
        aB.llIIlIlIlII[6] = "   ".length();
        aB.llIIlIlIlII[7] = 100 + 116 - 162 + 80 ^ 72 + 3 - 67 + 123;
        aB.llIIlIlIlII[8] = 0x4C ^ 0x4A;
        aB.llIIlIlIlII[9] = 0x2D ^ 0x2A;
        aB.llIIlIlIlII[10] = 0x98 ^ 0x90;
        aB.llIIlIlIlII[11] = 0x90 ^ 0x99;
        aB.llIIlIlIlII[12] = -(0xFFFFCF4E & 0x70F3) & (0xFFFFEFFF & 0x7DFB);
        aB.llIIlIlIlII[13] = 0x71 ^ 0x28 ^ (0x65 ^ 0x36);
        aB.llIIlIlIlII[14] = 0x20 ^ 0x2B;
        aB.llIIlIlIlII[15] = -(0xFFFFDEFF & 0x3160) & (0xFFFFFAFF & Short.MAX_VALUE);
        aB.llIIlIlIlII[16] = -(0xFFFFAD7D & 0x5EF3) & (0xFFFFBDFF & 0xFFFF);
        aB.llIIlIlIlII[17] = 5 ^ 0x4F ^ (0xD0 ^ 0x96);
        aB.llIIlIlIlII[18] = 0x3B ^ 0x56 ^ (0xA0 ^ 0xC0);
        aB.llIIlIlIlII[19] = 97 + 94 - 28 + 10 ^ 88 + 151 - 108 + 32;
        aB.llIIlIlIlII[20] = 73 + 65 - 26 + 15 ^ (0x18 ^ 0x47);
        aB.llIIlIlIlII[21] = 0x87 ^ 0x88;
        aB.llIIlIlIlII[22] = 0xF4 ^ 0xA8 ^ (0x7F ^ 0x33);
        aB.llIIlIlIlII[23] = 0x2F ^ 0x5E ^ (0x58 ^ 0x38);
        aB.llIIlIlIlII[24] = 0xFFFF9BCB & 0x6C76;
        aB.llIIlIlIlII[25] = -(0xFFFFEFE7 & 0x575D) & (0xFFFFEF54 & 0x5FFF);
        aB.llIIlIlIlII[26] = 0xFFFFFBE9 & 0xC5E;
        aB.llIIlIlIlII[27] = 0x58 ^ 0x4A;
    }

    static {
        aB.lIlIIIIIlllIll();
        aB.lIlIIIIIlllIlI();
        dA = llIIlIlIlII[16];
        dB = llIIlIlIlII[15];
        dy = llIIlIlIlII[11];
        dz = Set.of(Integer.valueOf(llIIlIlIlII[24]), Integer.valueOf(llIIlIlIlII[25]), Integer.valueOf(llIIlIlIlII[26]));
    }

    @Inject
    protected aB(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
        this.dD = llIIlIlIlII[0];
    }

    private static /* synthetic */ boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        if (aB.lIlIIIIlIIIIII(tileObject.getId(), llIIlIlIlII[16]) && aB.lIlIIIIIllllIl(tileObject.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = llIIlIlIlII[1];
            "".length();
            if ("  ".length() <= 0) {
                return ((0xC2 ^ 0x8E ^ (0xEA ^ 0x91)) & ("  ".length() ^ (0x31 ^ 4) ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIIlIlIlII[2];
        }
        return n2 != 0;
    }

    private static String lIlIIIIIlIIIll(String llllllllllllllllIIllllllIIllIlll, String llllllllllllllllIIllllllIIllIllI) {
        try {
            SecretKeySpec llllllllllllllllIIllllllIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllllIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllllllIIlllIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllllllIIlllIll.init(llIIlIlIlII[5], llllllllllllllllIIllllllIIllllII);
            return new String(llllllllllllllllIIllllllIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllllIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllllllIIlllIlI) {
            llllllllllllllllIIllllllIIlllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIIIIlllIIl(String llllllllllllllllIIllllllIIIlIlII, String llllllllllllllllIIllllllIIIlIIll) {
        try {
            SecretKeySpec llllllllllllllllIIllllllIIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllllIIIlIIll.getBytes(StandardCharsets.UTF_8)), llIIlIlIlII[10]), "DES");
            Cipher llllllllllllllllIIllllllIIIlIllI = Cipher.getInstance("DES");
            llllllllllllllllIIllllllIIIlIllI.init(llIIlIlIlII[5], llllllllllllllllIIllllllIIIlIlll);
            return new String(llllllllllllllllIIllllllIIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllllIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllllllIIIlIlIl) {
            llllllllllllllllIIllllllIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static /* synthetic */ boolean c(WorldPoint worldPoint, TileObject tileObject) {
        int n2;
        String[] stringArray = new String[llIIlIlIlII[1]];
        stringArray[aB.llIIlIlIlII[2]] = llIIlIIlIlI[llIIlIlIlII[21]];
        if (aB.lIlIIIIIllllIl(tileObject.hasAction(stringArray) ? 1 : 0) && aB.lIlIIIIIllllIl(tileObject.getWorldLocation().equals((Object)worldPoint) ? 1 : 0)) {
            n2 = llIIlIlIlII[1];
            "".length();
            if (((0xAF ^ 0x94 ^ (0x22 ^ 0x2F)) & (1 + 114 - 85 + 111 ^ 161 + 144 - 270 + 152 ^ -" ".length())) == " ".length()) {
                return ((0x29 ^ 0x6A ^ (0x1E ^ 0x6E)) & (37 + 41 - -39 + 61 ^ 5 + 44 - 42 + 122 ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIIlIlIlII[2];
        }
        return n2 != 0;
    }

    private static boolean lIlIIIIIllllll(Object object) {
        return object == null;
    }

    @Subscribe
    public void a(StatChanged statChanged) {
        if (aB.lIlIIIIlIIIlII(statChanged.getSkill(), Skill.MINING)) {
            this.dC = llIIlIlIlII[1];
        }
    }

    private static boolean lIlIIIIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIIlIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean bl() {
        WorldPoint llllllllllllllllIIllllllIlIlllll;
        Point llllllllllllllllIIllllllIllIIIII;
        Object llllllllllllllllIIllllllIllIIIIl;
        Object llllllllllllllllIIllllllIllIIIlI;
        Point llllllllllllllllIIllllllIllIIIll2;
        Object llllllllllllllllIIllllllIllIIlII;
        aB llllllllllllllllIIllllllIllIIlll;
        int[] nArray = new int[llIIlIlIlII[1]];
        nArray[aB.llIIlIlIlII[2]] = llIIlIlIlII[3];
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (aB.lIlIIIIIllllII(nPC)) {
            String[] stringArray = new String[llIIlIlIlII[1]];
            stringArray[aB.llIIlIlIlII[2]] = llIIlIIlIlI[llIIlIlIlII[2]];
            if (aB.lIlIIIIIllllIl(TileObjects.getAll((String[])stringArray).isEmpty() ? 1 : 0)) {
                if (aB.lIlIIIIIlllllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                    this.a((Interactable)nPC, llIIlIIlIlI[llIIlIlIlII[1]], llIIlIlIlII[4]);
                }
                return llIIlIlIlII[1];
            }
        }
        llllllllllllllllIIllllllIllIIlll.dC = llIIlIlIlII[2];
        r llllllllllllllllIIllllllIllIIlIl = r.aa();
        if (aB.lIlIIIIIllllll((Object)llllllllllllllllIIllllllIllIIlIl)) {
            return llIIlIlIlII[2];
        }
        Object[] objectArray = new Object[llIIlIlIlII[1]];
        objectArray[aB.llIIlIlIlII[2]] = llllllllllllllllIIllllllIllIIlIl;
        Log.info((String)llIIlIIlIlI[llIIlIlIlII[5]], (Object[])objectArray);
        Object[] objectArray2 = new Object[llIIlIlIlII[5]];
        objectArray2[aB.llIIlIlIlII[2]] = llllllllllllllllIIllllllIllIIlll.dD;
        objectArray2[aB.llIIlIlIlII[1]] = llllllllllllllllIIllllllIllIIlll.cu.getTickCount();
        Log.info((String)llIIlIIlIlI[llIIlIlIlII[6]], (Object[])objectArray2);
        if (aB.lIlIIIIIllllIl(Inventory.isFull() ? 1 : 0)) {
            llllllllllllllllIIllllllIllIIlII = Inventory.getFirst(item -> item.hasAction(llIIlIIlIlI[llIIlIlIlII[23]]::equals));
            Object[] objectArray3 = new Object[llIIlIlIlII[1]];
            objectArray3[aB.llIIlIlIlII[2]] = llllllllllllllllIIllllllIllIIlII;
            Log.info((String)llIIlIIlIlI[llIIlIlIlII[4]], (Object[])objectArray3);
            if (aB.lIlIIIIIllllII(llllllllllllllllIIllllllIllIIlII)) {
                llllllllllllllllIIllllllIllIIlII.interact(llIIlIIlIlI[llIIlIlIlII[7]]);
                return llIIlIlIlII[1];
            }
            llllllllllllllllIIllllllIllIIIll2 = Inventory.getFirst(item -> item.hasAction(llIIlIIlIlI[llIIlIlIlII[22]]::equals));
            Object[] objectArray4 = new Object[llIIlIlIlII[1]];
            objectArray4[aB.llIIlIlIlII[2]] = llllllllllllllllIIllllllIllIIIll2;
            Log.info((String)llIIlIIlIlI[llIIlIlIlII[8]], (Object[])objectArray4);
            if (aB.lIlIIIIIllllII(llllllllllllllllIIllllllIllIIIll2)) {
                llllllllllllllllIIllllllIllIIIll2.interact(llIIlIIlIlI[llIIlIlIlII[9]]);
                return llIIlIlIlII[1];
            }
        }
        llllllllllllllllIIllllllIllIIlII = llllllllllllllllIIllllllIllIIlIl.ae().iterator();
        while (aB.lIlIIIIIllllIl(llllllllllllllllIIllllllIllIIlII.hasNext() ? 1 : 0)) {
            llllllllllllllllIIllllllIllIIIll2 = (Point)llllllllllllllllIIllllllIllIIlII.next();
            llllllllllllllllIIllllllIllIIIlI = llllllllllllllllIIllllllIllIIlIl.a(llllllllllllllllIIllllllIllIIIll2);
            llllllllllllllllIIllllllIllIIIIl = TileObjects.getNearest(arg_0 -> aB.c((WorldPoint)llllllllllllllllIIllllllIllIIIlI, arg_0));
            if (aB.lIlIIIIIllllII(llllllllllllllllIIllllllIllIIIIl)) {
                llllllllllllllllIIllllllIllIIIIl.interact(llIIlIIlIlI[llIIlIlIlII[10]]);
                llllllllllllllllIIllllllIllIIlll.sleep(llIIlIlIlII[4]);
                return llIIlIlIlII[1];
            }
            "".length();
            if ("   ".length() < (0x26 ^ 0x22)) continue;
            return ((0x93 ^ 0xA8) & ~(0x6E ^ 0x55)) != 0;
        }
        llllllllllllllllIIllllllIllIIlII = null;
        int llllllllllllllllIIllllllIllIIIll2 = llIIlIlIlII[2];
        llllllllllllllllIIllllllIllIIIlI = new ArrayList<Point>(llllllllllllllllIIllllllIllIIlIl.ad().keySet());
        llllllllllllllllIIllllllIllIIIlI.sort(Comparator.comparingInt(point -> Math.abs(point.y - llIIlIlIlII[20])));
        llllllllllllllllIIllllllIllIIIIl = llllllllllllllllIIllllllIllIIIlI.iterator();
        while (aB.lIlIIIIIllllIl(llllllllllllllllIIllllllIllIIIIl.hasNext() ? 1 : 0)) {
            int llllllllllllllllIIllllllIlIlllIl;
            llllllllllllllllIIllllllIllIIIII = (Point)llllllllllllllllIIllllllIllIIIIl.next();
            llllllllllllllllIIllllllIlIlllll = llllllllllllllllIIllllllIllIIlIl.a(llllllllllllllllIIllllllIllIIIII);
            TileObject llllllllllllllllIIllllllIlIllllI = TileObjects.getNearest(tileObject -> {
                int n2;
                if (aB.lIlIIIIIllllIl(tileObject.getName().equals(llIIlIIlIlI[llIIlIlIlII[19]]) ? 1 : 0) && aB.lIlIIIIIllllIl(tileObject.getWorldLocation().equals((Object)llllllllllllllllIIllllllIlIlllll) ? 1 : 0)) {
                    n2 = llIIlIlIlII[1];
                    "".length();
                    if ((86 + 33 - -42 + 25 ^ 170 + 116 - 258 + 162) <= " ".length()) {
                        return ((0x5C ^ 0x2D ^ (0x9E ^ 0xC5)) & (0x49 ^ 0x3D ^ (0x7E ^ 0x20) ^ -" ".length())) != 0;
                    }
                } else {
                    n2 = llIIlIlIlII[2];
                }
                return n2 != 0;
            });
            if (aB.lIlIIIIIllllII(llllllllllllllllIIllllllIlIllllI) && aB.lIlIIIIlIIIIII(llllllllllllllllIIllllllIlIlllIl = ((GameObject)llllllllllllllllIIllllllIlIllllI).getOrientation(), llllllllllllllllIIllllllIllIIlIl.ad().get(llllllllllllllllIIllllllIllIIIII))) {
                "".length();
                if ("   ".length() == "   ".length()) continue;
                return ((0x7D ^ 0x61) & ~(0x22 ^ 0x3E)) != 0;
            }
            ++llllllllllllllllIIllllllIllIIIll2;
            llllllllllllllllIIllllllIllIIlII = llllllllllllllllIIllllllIlIlllll;
            "".length();
            if (-" ".length() <= "  ".length()) continue;
            return ((0xCA ^ 0x94 ^ (0xEC ^ 0x88)) & (5 + 36 - -44 + 98 ^ 24 + 21 - -75 + 21 ^ -" ".length())) != 0;
        }
        if (aB.lIlIIIIIllllll(llllllllllllllllIIllllllIllIIlII)) {
            Log.info((String)llIIlIIlIlI[llIIlIlIlII[11]]);
            int[] nArray2 = new int[llIIlIlIlII[1]];
            nArray2[aB.llIIlIlIlII[2]] = llIIlIlIlII[12];
            llllllllllllllllIIllllllIllIIIIl = NPCs.getNearest((int[])nArray2);
            if (aB.lIlIIIIlIIIIII(llllllllllllllllIIllllllIllIIlll.cu.getTickCount(), llllllllllllllllIIllllllIllIIlll.dD - llIIlIlIlII[1]) && aB.lIlIIIIIllllII(llllllllllllllllIIllllllIllIIIIl)) {
                llllllllllllllllIIllllllIllIIIIl.interact(llIIlIIlIlI[llIIlIlIlII[13]]);
                return llIIlIlIlII[1];
            }
            if (aB.lIlIIIIIllllII(llllllllllllllllIIllllllIllIIIIl) && aB.lIlIIIIIlllllI(Players.getLocal().isMoving() ? 1 : 0)) {
                llllllllllllllllIIllllllIllIIIII = llllllllllllllllIIllllllIllIIlIl.ab();
                if (aB.lIlIIIIIllllll(llllllllllllllllIIllllllIllIIIII)) {
                    return llIIlIlIlII[2];
                }
                Movement.setDestination((WorldPoint)llllllllllllllllIIllllllIllIIlIl.a(llllllllllllllllIIllllllIllIIIII));
            }
            return llIIlIlIlII[2];
        }
        llllllllllllllllIIllllllIllIIIIl = llllllllllllllllIIllllllIllIIlII;
        llllllllllllllllIIllllllIllIIIII = (GameObject)TileObjects.getNearest(arg_0 -> aB.a((WorldPoint)llllllllllllllllIIllllllIllIIIIl, arg_0));
        if (aB.lIlIIIIIllllII(llllllllllllllllIIllllllIllIIIII)) {
            if (!aB.lIlIIIIlIIIIIl(llllllllllllllllIIllllllIllIIIll2, llIIlIlIlII[1]) || aB.lIlIIIIlIIIIlI(Math.abs(llllllllllllllllIIllllllIllIIlll.cu.getTickCount() - llllllllllllllllIIllllllIllIIlll.dD), llIIlIlIlII[8])) {
                llllllllllllllllIIllllllIllIIIII.interact(llIIlIIlIlI[llIIlIlIlII[14]]);
            }
            return llIIlIlIlII[1];
        }
        int[] nArray3 = new int[llIIlIlIlII[1]];
        nArray3[aB.llIIlIlIlII[2]] = llIIlIlIlII[15];
        if (aB.lIlIIIIlIIIIll(Inventory.getCount((int[])nArray3), llllllllllllllllIIllllllIllIIIll2)) {
            int[] nArray4 = new int[llIIlIlIlII[1]];
            nArray4[aB.llIIlIlIlII[2]] = llIIlIlIlII[16];
            llllllllllllllllIIllllllIlIlllll = TileObjects.getAll((int[])nArray4).stream().filter(tileObject -> {
                boolean bl2;
                if (aB.lIlIIIIIlllllI(llllllllllllllllIIllllllIllIIlIl.d(tileObject.getWorldLocation()) ? 1 : 0)) {
                    bl2 = llIIlIlIlII[1];
                    "".length();
                    if (" ".length() == 0) {
                        return ((0x96 ^ 0xB8 ^ (0x7A ^ 2)) & (27 + 131 - 109 + 155 ^ 73 + 39 - -24 + 18 ^ -" ".length())) != 0;
                    }
                } else {
                    bl2 = llIIlIlIlII[2];
                }
                return bl2;
            }).min(Comparator.comparingInt(tileObject -> tileObject.getWorldLocation().distanceTo((Locatable)this.cu.getLocalPlayer()))).orElse(null);
            if (aB.lIlIIIIIllllll(llllllllllllllllIIllllllIlIlllll)) {
                return llIIlIlIlII[2];
            }
            llllllllllllllllIIllllllIlIlllll.interact(llIIlIIlIlI[llIIlIlIlII[17]]);
            return llIIlIlIlII[1];
        }
        if (aB.lIlIIIIIlllllI(Players.getLocal().getWorldLocation().equals(llllllllllllllllIIllllllIllIIlII) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)llllllllllllllllIIllllllIllIIlII);
            "".length();
            if (" ".length() != " ".length()) {
                return ((0x52 ^ 0x29 ^ (0xE1 ^ 0x80)) & (34 + 155 - 112 + 109 ^ 135 + 151 - 157 + 31 ^ -" ".length())) != 0;
            }
        } else {
            int[] nArray5 = new int[llIIlIlIlII[1]];
            nArray5[aB.llIIlIlIlII[2]] = llIIlIlIlII[15];
            Inventory.getFirst((int[])nArray5).interact(llIIlIIlIlI[llIIlIlIlII[18]]);
        }
        return llIIlIlIlII[1];
    }

    private static boolean lIlIIIIlIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIIIIlIIIlI(String llllllllllllllllIIllllllIIlIIlII, String llllllllllllllllIIllllllIIlIlIII) {
        llllllllllllllllIIllllllIIlIIlII = new String(Base64.getDecoder().decode(llllllllllllllllIIllllllIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllllllIIlIIlll = new StringBuilder();
        char[] llllllllllllllllIIllllllIIlIIllI = llllllllllllllllIIllllllIIlIlIII.toCharArray();
        int llllllllllllllllIIllllllIIlIIlIl = llIIlIlIlII[2];
        char[] llllllllllllllllIIllllllIIIlllll = llllllllllllllllIIllllllIIlIIlII.toCharArray();
        int llllllllllllllllIIllllllIIIllllI = llllllllllllllllIIllllllIIIlllll.length;
        int llllllllllllllllIIllllllIIIlllIl = llIIlIlIlII[2];
        while (aB.lIlIIIIlIIIIll(llllllllllllllllIIllllllIIIlllIl, llllllllllllllllIIllllllIIIllllI)) {
            char llllllllllllllllIIllllllIIlIlIlI = llllllllllllllllIIllllllIIIlllll[llllllllllllllllIIllllllIIIlllIl];
            llllllllllllllllIIllllllIIlIIlll.append((char)(llllllllllllllllIIllllllIIlIlIlI ^ llllllllllllllllIIllllllIIlIIllI[llllllllllllllllIIllllllIIlIIlIl % llllllllllllllllIIllllllIIlIIllI.length]));
            "".length();
            ++llllllllllllllllIIllllllIIlIIlIl;
            ++llllllllllllllllIIllllllIIIlllIl;
            "".length();
            if ((0x2C ^ 0x28) >= "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllllllIIlIIlll);
    }

    private static boolean lIlIIIIIllllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIlIIIlII(Object object, Object object2) {
        return object == object2;
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        if (aB.lIlIIIIIllllIl(dz.contains(graphicsObjectCreated.getGraphicsObject().getId()) ? 1 : 0)) {
            this.dD = this.cu.getTickCount() + llIIlIlIlII[11];
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        void llllllllllllllllIIllllllIlIlIIIl;
        if (aB.lIlIIIIlIIIIII(npcChanged.getOld().getId(), llIIlIlIlII[3]) && aB.lIlIIIIlIIIIII(npcChanged.getNpc().getId(), llIIlIlIlII[12])) {
            this.dD = this.cu.getTickCount() + llIIlIlIlII[11] + llIIlIlIlII[1];
            "".length();
            if (-(8 ^ 0xC) >= 0) {
                return;
            }
        } else if (aB.lIlIIIIlIIIIII(llllllllllllllllIIllllllIlIlIIIl.getOld().getId(), llIIlIlIlII[12]) && aB.lIlIIIIlIIIIII(llllllllllllllllIIllllllIlIlIIIl.getNpc().getId(), llIIlIlIlII[3])) {
            llllllllllllllllIIllllllIlIlIIlI.dD = llIIlIlIlII[0];
        }
    }

    private static void lIlIIIIIlllIlI() {
        llIIlIIlIlI = new String[llIIlIlIlII[27]];
        aB.llIIlIIlIlI[aB.llIIlIlIlII[2]] = aB.lIlIIIIIlIIIlI("GyMrJj0k", "VJYTR");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[1]] = aB.lIlIIIIIlIIIll("SQ5jB+ZNh2A=", "xllgZ");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[5]] = aB.lIlIIIIIlIIIll("3I80kgFbbmI=", "swtbZ");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[6]] = aB.lIlIIIIIlIIIlI("DyMZJ1cnLxM2VzUvAjhXOjtBflciMxMhEi8yQSgK", "AFaSw");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[4]] = aB.lIlIIIIIlllIIl("K9Wnom++2Ho=", "spFRX");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[7]] = aB.lIlIIIIIlIIIlI("KCMNKg==", "lQbZF");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[8]] = aB.lIlIIIIIlIIIll("/pimI420y3ZXlHdrZb28bg==", "eNcZk");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[9]] = aB.lIlIIIIIlllIIl("uYWFrNYuspY=", "pIblZ");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[10]] = aB.lIlIIIIIlIIIlI("DRscFRM=", "Oiytx");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[11]] = aB.lIlIIIIIlIIIll("SKS4ojHXAVvPLu5zskBP4M7nVJJCo6+AkbgRRgn10pE=", "hBzEc");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[13]] = aB.lIlIIIIIlIIIll("YxtKNoe+Jho=", "wJXqs");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[14]] = aB.lIlIIIIIlllIIl("JpLHS1FdxfAczgJUJr1QLFdgHPtEaMyX", "lIZPe");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[17]] = aB.lIlIIIIIlllIIl("1h/5h2H3k98=", "tLjrc");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[18]] = aB.lIlIIIIIlllIIl("P9RHdMS53J8=", "pFygn");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[19]] = aB.lIlIIIIIlIIIlI("Cz0VJgA0", "FTgTo");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[21]] = aB.lIlIIIIIlIIIll("nKsdSADfo0o=", "CbLwc");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[22]] = aB.lIlIIIIIlIIIlI("Fz4zLR8=", "SLZCt");
        aB.llIIlIIlIlI[aB.llIIlIlIlII[23]] = aB.lIlIIIIIlllIIl("QzDXrhD7zHM=", "IttME");
    }
}

